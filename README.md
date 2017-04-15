# branch-by-abstraction

A demonstration of branching by abstration

## Initial State

In the Initial State I have the implementation of the LifeBoard exposed and referenced in both code and tests.  Changing the implementation of the LifeBoard will be very expensive in this state.

## Defined Interface

The first step is defining an interface which encapsulates the actions I am interested in.

## Implement Interface

Next I implement the interface, without changing the classes which access the board object.  All my tests are still green and I could push to master without breaking things.