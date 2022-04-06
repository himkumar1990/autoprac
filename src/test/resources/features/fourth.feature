Feature: fourth feature

@Test @fourth
Scenario Outline:

	When number are  <first> and <second>
	Then sum should be <sum>

Examples:
	|first|second|sum|
	|4    |5     | 9 |