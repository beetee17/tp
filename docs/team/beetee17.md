# Brandon's Project Portfolio Page

## Arrow
**Arrow** is a **desktop app** that **help software project managers keep track of their members’ tasks and deliverables**.
By associating tasks to specific team members, users can **keep track of what needs to be done and have quick access to
contact information should they wish to reach out to the member**.

### Summary of Contributions:
#### Code contributed: [Reposense link](https://nus-cs2103-ay2223s1.github.io/tp-dashboard/?search=beetee17&breakdown=true)

#### Enhancements implemented
- Implemented the `task list`, a fully-featured command for filtering the tasks list by numerous criteria ([#69](!https://github.com/AY2223S1-CS2103T-T08-2/tp/pull/69), [#89](!https://github.com/AY2223S1-CS2103T-T08-2/tp/pull/89), [#100](!https://github.com/AY2223S1-CS2103T-T08-2/tp/pull/100), [#114](!https://github.com/AY2223S1-CS2103T-T08-2/tp/pull/114))
- Implemented the `task do ... by/` command for setting deadlines to a task. ([#94](!https://github.com/AY2223S1-CS2103T-T08-2/tp/pull/94))
  - Used the [`PrettyTime NLP` library](https://www.ocpsoft.org/prettytime/nlp/) for an improved user experience as it allows users to specify deadlines in plain English.
  - **Justification**: This resulted in a significant improvement to the user's efficiency and productivity, as it is much more intuitive to describe dates in natural language rather than in rigid date formats.
- Modified the prefixes of various commands ([#114](!https://github.com/AY2223S1-CS2103T-T08-2/tp/pull/114))
  - In particular, changed the prefix for referencing contacts from "c/" to "@" and projects from "pr/" to "#"
  - **Justification**: This results in a much more intuitive command format, allowing users to have an easier time learning, remembering and getting used to the various commands.
- Various GUI components such as:
  - Separating the bottom panel into two panels (for task list and address book)
  - Task checkboxes which indicate completion status and allows users an alternative way to `mark` and `unmark` tasks without typing in the command.

#### Contributions to the UG
- `Filtering the Tasks List`
- `Setting deadlines to a task: task do ... by/`, 

#### Contributions to the DG
- `List Tasks feature`
- `User Stories`

#### Community
- PRs reviewed: [#88](https://github.com/AY2223S1-CS2103T-T08-2/tp/pull/88), [#93](https://github.com/AY2223S1-CS2103T-T08-2/tp/pull/93), [#102](https://github.com/AY2223S1-CS2103T-T08-2/tp/pull/102), [#189](https://github.com/AY2223S1-CS2103T-T08-2/tp/pull/189)
- Gave various feedback to help improve overall code quality and testing standards in the codebase

