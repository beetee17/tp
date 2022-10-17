package seedu.address.logic.parser;

import static java.util.Objects.requireNonNull;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.util.StringUtil;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.task.Title;

/**
 * Contains utility methods used for parsing strings in the various *Parser classes related to tasks.
 */
public class TaskParserUtil {

    public static final String MESSAGE_INVALID_INDEX = "Index is not a non-zero unsigned integer.";

    /**
     * Parses a {@code String title} into a {@code title}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code title} is invalid.
     */
    public static Title parseTitle(String title) throws ParseException {
        requireNonNull(title);
        String trimmedTitle = title.trim();
        if (!Title.isValidTitle(trimmedTitle)) {
            throw new ParseException(Title.MESSAGE_CONSTRAINTS);
        }
        return new Title(trimmedTitle);
    }

    /**
     * Parses {@code oneBasedIndex} into an {@code Index} and returns it. Leading and trailing whitespaces will be
     * trimmed.
     * @throws ParseException if the specified index is invalid (not non-zero unsigned integer).
     */
    public static Index parseIndex(String oneBasedIndex) throws ParseException {
        String trimmedIndex = oneBasedIndex.trim();
        if (!StringUtil.isNonZeroUnsignedInteger(trimmedIndex)) {
            throw new ParseException(MESSAGE_INVALID_INDEX);
        }
        return Index.fromOneBased(Integer.parseInt(trimmedIndex));
    }

    /**
     * Parses {@code Collection<String> oneBasedIndexes} into a {@code Set<Index>}.
     */
    public static Set<Index> parseIndexes(Collection<String> oneBasedIndexes) throws ParseException {
        requireNonNull(oneBasedIndexes);
        final Set<Index> indexSet = new HashSet<>();
        for (String oneBasedIndex : oneBasedIndexes) {
            String trimmedIndex = oneBasedIndex.trim();
            if (!StringUtil.isNonZeroUnsignedInteger(trimmedIndex)) {
                throw new ParseException(MESSAGE_INVALID_INDEX);
            }
            indexSet.add(Index.fromOneBased(Integer.parseInt(trimmedIndex)));
        }
        return indexSet;
    }

    /**
     * Parses index inputs in {@code Collection<String> inputs} (that can contain index and non-index inputs)
     * into a {@code Set<Index>}.
     */
    public static Set<Index> parseIndexesMixed(Collection<String> inputs) throws ParseException{
        requireNonNull(inputs);
        final Set<Index> indexSet = new HashSet<>();
        for (String input : inputs) {
            String trimmedInput = input.trim();
            if (StringUtil.isInteger(trimmedInput)) {
                if (!StringUtil.isNonZeroUnsignedInteger(trimmedInput)) {
                    throw new ParseException(MESSAGE_INVALID_INDEX);
                }
                indexSet.add(Index.fromOneBased(Integer.parseInt(trimmedInput)));
            }
        }
        return indexSet;
    }

    /**
     * Parses non-index inputs in {@code Collection<String> inputs} (that can contain index and non index inputs)
     * into a {@code Set<String>}.
     */
    public static Set<String> parseTextsMixed(Collection<String> inputs) {
        requireNonNull(inputs);
        final Set<String> textSet = new HashSet<>();
        for (String input : inputs) {
            String trimmedInput = input.trim();
            if (!StringUtil.isInteger(trimmedInput)) {
                textSet.add(trimmedInput);
            }
        }
        return textSet;
    }

}
