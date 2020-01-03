# Overview

The purpose of this task is to test your capabilities in developing algorithms to solve programing tasks.
The Task

All you need to get started is python running on your machine!

# Task

When your environment is set up, follow these steps:

    * Download this file: https://drive.google.com/file/d/1znkB6ZH0fpOgYkuCUykQVpGFkI6fQUX_/view?usp=sharing
    * write code to group messages per user
    * for each user, make subgroups. All messages with less than 2 minutes between them should be grouped together.

# Deliverable

The deliverable should be json file for each user with naming <user_id>.json. The dictionary saved in the json should have the start timestamp of the first message in the group as the key, and the list of messages in the value.

** NOTE:** some groups will contain only one message (when there was no message 2 minutes before, and no message 2 minutes after)

Good Luck!

# How to run

    * Clone this repository.
    * Create virtualenv with Python 3.
    * Active the virtualenv.
    * run file main.py

```
git clone https://github.com/Hp2501/LogicProject.git
cd LogicProject
python -m venv .venv
source .venv/bin/activate
no requirements

```