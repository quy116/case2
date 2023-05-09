package validate;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeValidate {
    private static final String REGEXNAMEEMPLOYEE = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
    private static final String REGEXCODE = "^NV-[0-9]{4}$";
    private static final String REGEXDAY = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$";
    private static final String REGEXID = "^[0-9]{9}|[0-9]{12}$";
    private static final String REGEXPHONE = "^0[0-9]{9}$";


    public boolean checkName(String name) {
        return name.matches(REGEXNAMEEMPLOYEE) ? true : false;
    }

    public boolean checkCode(String code) {
        return code.matches(REGEXCODE) ? true : false;
    }

    public boolean checkId(String id) {
        return id.matches(REGEXID) ? true : false;
    }
    public boolean checkNumber(String number) {
        return number.matches(REGEXPHONE) ? true : false;
    }

    public boolean checkAge(String day) {
        if (day.matches(REGEXDAY)) {
            LocalDate age = LocalDate.parse(day);
            LocalDate dayNow = LocalDate.now();
            if (Period.between(age, dayNow).getYears() >= 18) {
                return true;
            }
        }
        return false;
    }
}
