package com.codedifferently.assessment.corejava.part01;

public class PredicateUtilities {

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */

    public Boolean isEven(Integer value) {

        if (value % 2 == 0)
            return true;
        else
            return false;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */

    //skip per Tariq
    public Boolean isOdd(Integer value) {
        return null;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public Boolean isMultipleOf3(Integer value) {
        if (value % 3 == 0)
            return true;
        else
            return false;
    }

    /**
     * @param value    - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public Boolean isMultipleOfN(Integer value, Integer multiple) {
        if (value % multiple == 0)
            return true;
        else
            return false;
    }

    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     */
    public Boolean startsWithCapitalLetter(String string) {
        if (Character.isUpperCase(string.charAt(0)))
            return true;
        else
            return false;

    }

}
