Feature: third feature

@Test @third
Scenario Outline:

	When number are  <first> and <second>
	Then sum should be <sum>

Examples:
	|first|second|sum|
	|3    |4     | 7 |