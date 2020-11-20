# Test list for the LeapYear-assignment

## Test "_true_"/"_false_"

### List of years not divisible by 4 (typical common years)
- [X] 2001 -> "false"
- [X] 2002 -> "false"
- [X] 2003 -> "false"

### List of years divisible by 4, but not by 100 (typical leap years)
- [X] 1996 -> "true"
- [X] 2004 -> "true"
- [X] 2008 -> "true"

### List of years divisible by 4 and by 100,but not by 400 (atypical common years)
- [X] 1700 -> "false"
- [X] 1800 -> "false"
- [X] 1900 -> "false"

### List of years divisible by 4 and by 100 and by 400 (atypical leap years)
- [X] 1600 -> "true"
- [X] 2000 -> "true"
- [X] 2400 -> "true"

## Test "_print on standard output_"
- [X] green state for this test