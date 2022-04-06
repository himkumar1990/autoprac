Feature: fifth feature

@Test @fifth
Scenario Outline:

	When number are  <first> and <second>
	Then sum should be <sum>

Examples:
	|first|second|sum|
	|5    |6     | 11|