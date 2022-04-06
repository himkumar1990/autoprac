Feature: second feature

@Test @second
Scenario Outline: addition test second feature

	When number are  <first> and <second>
	Then sum should be <sum>

Examples:
	|first|second|sum|
	|2    |3     | 5 |
	|1    |2     | 2 |