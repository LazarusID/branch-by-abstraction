# branch-by-abstraction

A demonstration of branching by abstration.  Each of the headings below corresponds to a commit message, allowing you to follow the progress of the branch.

## Initial State

In the Initial State I have the implementation of the LifeBoard exposed and referenced in both code and tests.  Changing the implementation of the LifeBoard will be very expensive in this state.

## Defined Interface

The first step is defining an interface which encapsulates the actions I am interested in.

## Implement Interface

Next I implement the interface, without changing the classes which access the board object.  All my tests are still green and I could push to master without breaking things.

## Partially Transition

I have partially transitions to using the new interface, in the tests for LifeBoard.  The tests for Engine still use the old interface, but everything compiles and I can push to master without causing a riot.

## Engine Tests Converted

The engine tests have been converted.  Notice that they still take advantage of the fact that the board implementation is static.  This is because the engine itself hasn't been converted.
