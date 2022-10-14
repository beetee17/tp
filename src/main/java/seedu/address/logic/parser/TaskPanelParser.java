package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.commons.core.Messages.MESSAGE_UNKNOWN_COMMAND;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import seedu.address.logic.commands.HelpCommand;
import seedu.address.logic.commands.TaskCommand;
import seedu.address.logic.commands.task.*;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.logic.parser.task.*;

/**
 * Parses user input for all task-related commands (starting with "tasks").
 */
public class TaskPanelParser implements Parser<TaskCommand> {

    /**
     * Used for initial separation of command word and args.
     */
    private static final Pattern BASIC_COMMAND_FORMAT = Pattern.compile("task\\s(?<commandWord>\\S+)(?<arguments>.*)");

    @Override
    public TaskCommand parse(String userInput) throws ParseException {
        final Matcher matcher = BASIC_COMMAND_FORMAT.matcher(userInput.trim());
        if (!matcher.matches()) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, HelpCommand.MESSAGE_USAGE));
        }

        final String commandWord = matcher.group("commandWord");
        final String arguments = matcher.group("arguments");

        switch (commandWord) {
        case AddTaskCommand.COMMAND_WORD:
            return new AddTaskCommandParser().parse(arguments);
        case DeleteTaskCommand.COMMAND_WORD:
            return new DeleteTaskCommandParser().parse(arguments);
        case MarkTaskCommand.COMMAND_WORD:
            return new MarkTaskCommandParser().parse(arguments);
        case ListTasksCommand.COMMAND_WORD:
            return new ListTasksCommand();
        case AssignTaskCommand.COMMAND_WORD:
            return new AssignTaskCommandParser().parse(arguments);
        case DeadlineTaskCommand.COMMAND_WORD:
            return new DeadlineTaskCommandParser().parse(arguments);
        default:
            throw new ParseException(MESSAGE_UNKNOWN_COMMAND);
        }
    }
}