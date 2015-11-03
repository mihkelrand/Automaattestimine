package ee.tty.praktikum2;

public class Calc {
    public static final int JUNIOR = 1;
    public static final int SENIOR = 2;
    public static final int SPECIALIST = 3;
    public static final int DOUBLE_PAY_QUOTA = 2;
    public static final int TRIPLE_PAY_QUOTA = 3;
    public static final int DEFAULT_JUN_SEN_WORKDAY_LENGTH = 8;
    public static final int DEFAULT_SPEC_WORKDAY_LENGTH = 9;
    public static final int HERO_BONUS_HOURS = 20;
    public static final int JUNIOR_WORK_HOURS = 10;
    public static final int SENIOR_WORK_HOURS = 15;
    public static final int SPECIALIST_WORK_HOURS = 22;
    public static final int JUNIOR_HERO_BONUS = 10;
    public static final int SENIOR_HERO_BONUS = 20;
    public static final int SPECIALIST_HERO_BONUS = 30;

    public static void main(final String[] args) {
        Calc c = new Calc();
        System.err.println(c.finalSalary(SPECIALIST, 3) + " should be 66");
    }

    protected int finalSalary(final int type, final int workHours) {
    	int salary = 0;
        if (type == JUNIOR) {
            salary += juniorPay(workHours);
        }
        if (type == SENIOR) {
            salary += seniorPay(workHours);
        }
        if (type == SPECIALIST) {
            salary += specialistPay(workHours);
        }
        if (workHours > HERO_BONUS_HOURS) {
            salary += heroBonus(type, workHours);
        }
        return salary;
    }
    protected int juniorPay(final int workHours){
    	int salary = 0;
    	if (workHours > DEFAULT_JUN_SEN_WORKDAY_LENGTH) {
            salary = JUNIOR_WORK_HOURS * (workHours - DEFAULT_JUN_SEN_WORKDAY_LENGTH) * DOUBLE_PAY_QUOTA;
            salary += JUNIOR_WORK_HOURS * DEFAULT_JUN_SEN_WORKDAY_LENGTH;
        } else {
            salary += JUNIOR_WORK_HOURS * workHours;
        }
    	return salary;
    }   
    protected int seniorPay(final int workHours){
    	int salary = 0;
    	if (workHours > DEFAULT_JUN_SEN_WORKDAY_LENGTH) {
            salary = SENIOR_WORK_HOURS * (workHours - DEFAULT_JUN_SEN_WORKDAY_LENGTH) * DOUBLE_PAY_QUOTA;
            salary += SENIOR_WORK_HOURS * DEFAULT_JUN_SEN_WORKDAY_LENGTH;
        } else {
            salary += SENIOR_WORK_HOURS * workHours;
        }
    	return salary;
    }
    protected int specialistPay(final int workHours) {
    	int salary = 0;
    	if (workHours > DEFAULT_SPEC_WORKDAY_LENGTH) {
            salary = SPECIALIST_WORK_HOURS * (workHours - DEFAULT_SPEC_WORKDAY_LENGTH) * TRIPLE_PAY_QUOTA;
            salary += SPECIALIST_WORK_HOURS * DEFAULT_SPEC_WORKDAY_LENGTH;
        } else {
            salary += SPECIALIST_WORK_HOURS * workHours;
        }
    	return salary;
    }
    protected int heroBonus(final int type, final int workHours) {
    	int salary = 0;
    	if (type == JUNIOR) {
            salary += JUNIOR_HERO_BONUS;
        }
        if (type == SENIOR) {
            salary += SENIOR_HERO_BONUS;
        }
        if (type == SPECIALIST) {
            salary += SPECIALIST_HERO_BONUS;
        }
        return salary;
    }
}