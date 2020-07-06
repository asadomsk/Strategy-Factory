# Strategy-Factory
Applying the principles of the strategy and factory patterns
The Problem
We're on a team of Java developers working for a bank. This time round, we're calculating monthly interest on different types of bank accounts. Initially, we're only dealing with two account types - current accounts and savings accounts. Interest will not be applicable to any other types of accounts.
Our next requirement is to add support for two different money market accounts - a standard money market account and a special "high-roller" money market account that pays only if the customer maintains a minimum balance of xxxx. We modify our calculator accordingly.
Also the asset financing department of the bank has heard of our new calculator, and they would like to use it to calculate interest on loans to customers. However, their interest rates aren't fixed - they are linked to interest rates from a central bank, which we'll have to retrieve via a web service. Not only are we starting to deal with more account types, but the calculation logic is also growing in complexity.
