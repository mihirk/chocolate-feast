## CFR
Since the problem stated that scalability is not a CFR, since its a very small chocolate shop,
I went ahead with Extensibility as a CFR. The design is in such a way that eases extensibility of the project.

## Project Structure walkthrough
Its a java maven project.
Maven module structure
    - chocolate-feast (parent)
        - chocolate-shop
        - good-brother
        - runner
chocolate-feast is the parent module, where the parent pom resides, and it has 3 sub modules. The core module is the
chocolate-shop module. Its used by the good-brother module and is a dependency in the good-brother module.
Runner is there just to do the conversions from User input to the underlying interfaces exposed.

### Chocolate Shop
This is the core module of the project. It exposed a chocolate shop interface which has two implementations, one
with the older policies and one with the newer policies..
Each policy is independently defined which brings in its own ruleset. This is done to keep it extensible.
Newer policy introduction is just introducing a new policy class that is all.
There are 3 policies right now,
* General Policy ( You get what you pay for)
* Old policy of free chocolates for given number of wrappers
* New policy of free unwrapped chocolates based on type and pervious policy.
This is extensible because adding a new policy would not need any major code changes in other classes, just an addition of a new class
would be enough.
The chocolate shop transactions are kept immutable and completely detatched to the brother's conditions,
as the chocolate shop should function as it should and should not bend rules for any specific customer

### Good Brother
This module implements the overlaying ruleset of brother giving chocolates of certain type and certain quantity
to his sister. It uses the chocolate shop transactions. It uses the chocolate shop transactions to satisfy its own
need, and the chocolate shop transaction logic stays the same.

### Runnner
This is to expose user input for the code.

## Executing
You would need JDK 1.7 + installed and maven on the machine.
You can execute the run.sh script to get the final user interface.
Would recommend opening the project in an IDE and running it from there.