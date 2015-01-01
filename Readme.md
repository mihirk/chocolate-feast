Stride Code Test
=================
Welcome to the alpha release of the Stride code test. Since this is a brand new test, we expect there to be problems,
mistakes and plenty of confusion. Please do not hesitate to ask questions and suggest improvements, by emailing rex@stridenyc.com.

The test is an extension of a problem from HackerRank. You are given a small snippet of code that is to be changed
due to new requirements.

* Note: please do not share this test or your answer with anyone. The test and your solution is intended to be private.
If you decide to put it on github via fork or import, please make sure do it into a private repository.

Instructions
------------

 - Do not use any outside gems aside from what's already in the gemfile. The bulk of the test should be plain Ruby code.
 - Please submit your code as a zip file.
 - Add as many specs as you need, though they are completely optional. Any specs you do add should be in the "spec" folder
and run successfully by running the default `rake spec` task.
 - Do not change the signature of the ChocolateShop.new or ChocolateShop.run methods. Besides that, you can
 add as much code as you like through the test.
 - You can leave the old_chocolate_shop.rb. No need to touch that or the old_acceptance_test.rb. The spec should be passing.
Those are just there for demonstration purposes and so that you can make sure `rake spec` and everything is working.
 - Your code will be graded on
    - Correctness
    - Code quality metrics such as cleanliness, readability, maintainability and simplicity. Basically, put out there what you
    would consider *good* code.
 - We ARE NOT concerned about performance. (It's a small chocolate shop!)

Original Problem
================
From [HackerRank](https://www.hackerrank.com/challenges/chocolate-feast)

Little Bob loves chocolates, and goes to the store with $:pocket_cash money in his pocket. The price of
each chocolate is $:price. The store offers a discount: for every :wrappers_needed wrappers
he gives the store, he’ll get one chocolate for free. How many chocolates does Bob get to eat?
Input Format
------------
An array of purchase hashes (count<=1000).

Output Format:
--------------
An array of # of chocolates eaten.

Constraints:
------------
2 <= :pocket_cash <= 100000
1 <= :price <= :pocket_cash
2 <= :wrappers_needed <= :pocket_cash

Sample Case Explanation
-----------------------
See [spec] (spec/old_acceptance_test_spec.rb)

1. In the first case, he can buy 5 chocolates with $10 and exchange the 5 wrappers to get
one more chocolate thus making the total number of chocolates he can eat as 6
2. In the second case, he can buy 3 chocolates for $12. However, it takes 4 wrappers
to get one more chocolate. He can’t avail the offer and hence the total number of chocolates remains 3.
3. In the third case, he can buy 3 chocolates for $6. Now he can give 2 of
these 3 wrappers and get 1 chocolate. Again, he can use his 1 unused wrapper and 1 wrapper of new chocolate to get
one more chocolate. Total is 5.

Solution
--------
See [a solution] (code/old_chocolate_shop.rb)

New Problem
===========
The free chocolate program has been successful, and they've decided to tweak the promotion.

Chocolate Types
---------------
The store is now pushing certain types of chocolates (known as :type in the hash). There are
four types, :white, :dark, :milk and :sugar_free and the store
is giving away an extra samples of *unwrapped* chocolates in addition to the original wrapper deal.
For the original wrapper deal, the free chocolates will be of the same
type that you are buying for that purchase.

- If you purchase :milk or purchase :white, you get an extra unwrapped :sugar_free chocolate along with
every free *wrapped* :milk or :white chocolate that you would normally get.
- If you purchase :sugar_free chocolate, you get an extra *unwrapped* :dark chocolate along
with every free *wrapped* :sugar_free chocolate that you get.
- Since :dark is all the rage, that is considered premium and there is no unwrapped candy bonus.


Good Brother
-----------
Little Bob's sister Alice likes milk and white chocolate. So whenever Bob gets and *unwrapped or wrapped* one of those,
he sets the first one aside for her, then he eats the rest.


Bulk Discount
-------------
TBD

Output
------
Instead of an array of # of chocolates eaten, the output will now be an array of hashes. Each hash will have the four
types of chocolates and how much Little Bob *eats* of each
of those types.

Explanation
-----------
See [spec] (spec/acceptance_test_spec.rb)

1. He buys 1 milk chocolate and sets it aside for Alice, still wrapped. He has enough money for 5 more. He trades in
those 5 wrappers and gets 1 more milk chocolate. He also gets one sugar_free.
2. No change from original problem.
3. He can buy 3 sugar_free chocolates for $6. Now he can give 2 of this 3 wrappers and get 1 sugar_free wrapped
chocolate. Again, he can use his 1 unused wrapper and 1 wrapper of new chocolate to get one more chocolate. Total is 5 sugar free.
Since he got 2 bonus sugar_free chocolates, he also gets 2 bonus dark chocolates.
4. He buys 1 white and sets it aside for Alice. He buys 2 more, and trades in those two
wrappers for 1 *wrapped* white and 1 *unwrapped* sugar_free.
