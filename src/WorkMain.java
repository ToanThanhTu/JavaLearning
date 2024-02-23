public class WorkMain {

    public static void main(String[] args) {
        Employee cat = new Employee("Cat",
                "08/09/1995",
                "01/01/2020");
        System.out.println(cat);
        System.out.println("Age = " + cat.getAge());
        System.out.println("Pay = " + cat.collectPay());
        System.out.println("-----------------------");

        Employee joe = new Employee("Joe",
                "10/10/1975",
                "01/01/2015");
        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Pay = " + joe.collectPay());
        System.out.println("-----------------------");


        SalariedEmployee trev = new SalariedEmployee("Trev",
                "30/05/1996","01/01/2023",
                100000);
        System.out.println(trev);
        System.out.println("Trev's paycheck = $" + trev.collectPay());
        trev.retire();
        System.out.println("Trev's Pension check = $" + trev.collectPay());
        System.out.println("-----------------------");


        HourlyEmployee tim = new HourlyEmployee("Tim",
                "01/01/1980", "01/01/2019",
                150.0);
        System.out.println(tim);
        System.out.println("Tim's Paycheck = $" + tim.collectPay());
        System.out.println("Tim's Holiday Pay = $" + tim.getDoublePay());
        System.out.println("-----------------------");




    }

}
