package domain;

/**
 * Базовий клас, що описує співробітників
 * @author Марк Дериведмідь
 */
public class Employee {
    /**
     * Метод для форматування інформації про співробітника
     * @return рядок з інформацією про співробітника компанії
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }
    /**
     * ім'я співробітника
     */
    private String name;
    /**
     * посада співробітника
     */
    private String jobTitle;
    /**
     * ID співробітника
     */
    private int ID;
    /**
     * розряд співробітника
     */
    private int level;
    /**
     * відділ співробітника
     */
    private String dept;

   /** 
    * Найфункціональніший конструктор класу
    * @param name ім'я співробітника
    * @param jobTitle посада співробітника
    * @param level розряд співробітника
    * @param dept відділ співробітника
    */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    /**
     * Конструктор за замовчуванням 
     * @deprecated 
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    public void setJobTitle(String job) {
        jobTitle = job;
    }
     /**
     * Метод, що повертає посаду співробітника
     * @return посада співробітника
     */
    public String getJobTitle() {
        return jobTitle;
    }
    /**
     * Метод, що повертає ім'я співробітника
     * @return ім'я співробітника
     */
    public String getName() {
        return name;
    }
    /**
     * Встановлює розряд співробітника
     * @param level 
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    /**
     * Метод, що повертає розряд співробітника
     * @return розряд співробітника
     */
    public int getLevel() {
        return level;
    }
    /**
     * Метод, що повертає відділ співробітника
     * @return відділ співробітника
     */
    public String getDept() {
        return dept;
    }
   /**
    * Метод, що встановлює відділ співробітника
    * @param dept 
    */
    public void setDept(String dept) {
        this.dept = dept;
    }
     /**
      * Метод, що встановлює ім'я співробітника
      * @param name 
      */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
