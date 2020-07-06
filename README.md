# Strategy-Factory
Applying the principles of the strategy and factory patterns
The Problem
We're on a team of Java developers working for a bank. This time round, we're calculating monthly interest on different types of bank accounts. Initially, we're only dealing with two account types - current accounts and savings accounts. Interest will not be applicable to any other types of accounts.
Our next requirement is to add support for two different money market accounts - a standard money market account and a special "high-roller" money market account that pays only if the customer maintains a minimum balance of xxxx. We modify our calculator accordingly.
Also the asset financing department of the bank has heard of our new calculator, and they would like to use it to calculate interest on loans to customers. However, their interest rates aren't fixed - they are linked to interest rates from a central bank, which we'll have to retrieve via a web service. Not only are we starting to deal with more account types, but the calculation logic is also growing in complexity.
# The problem that we have is this:
We have a single, convoluted, hard-to-maintain method that is trying to deal with a number of different scenarios.
The Strategy pattern can help us to address this issue.
The Strategy pattern allows us to dynamically swop out algorithms (i.e. application logic) at runtime. In our scenario, we want to change the logic used to calculate interest, based on the type of account that we are working with.
Our first step is to define an interface to identify the input and output of our calculations - i.e. the account balance and the interest on that balance.
Note that our interface is only concerned with the account balance - it doesn't care about the account type, since each implementation will already be specific to a particular account type.
The next step is to create strategies to deal with each of our calculations.
Each calculation is now isolated to its own class, making it much easier to understand individual calculations - they're not surrounded by clutter anymore. Next, we'll refactor our calculator. 
We've moved the calculation logic out of the calculator itself.
