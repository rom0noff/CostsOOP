package uz.pen.consumption;

import java.util.Scanner;

public class LogicsCounter {
    private double breakfast;
    protected double transport;
    private double dinner;
    private double lunch;
    private double smoke;
    private  double sum;
    private double salary;
    private double transporthom;

    public LogicsCounter() {

    }
    public double getTransporthom(){
        return transporthom;
    }
    public void setTransporthom(Double transporthom){
        this.transporthom = transporthom;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(Double salary){
        this.salary = salary;
    }
    public double getSum(){
        return sum;
    }
    public void setSum(Double sum){
        this.sum = sum;
    }
    public Double getSmoke(){
        return smoke;
    }
    public void setSmoke(Double smoke){
        this.smoke = smoke;
    }
    public Double getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Double breakfast) {
        this.breakfast = breakfast;
    }

    public Double getTransport() {
        return transport;
    }

    public void setTransport(Double transport) {
        this.transport = transport;
    }

    public Double getDinner() {
        return dinner;
    }

    public void setDinner(Double dinner) {
        this.dinner = dinner;
    }

    public Double getLunch() {
        return lunch;
    }

    public void setLunch(Double lunch) {
        this.lunch = lunch;
    }

    public boolean Logic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("whether you work or study?");
        System.out.println("1. work / 2. student");
        int mister = scanner.nextInt();
        String misterName = null;
        String transportName = null;
        switch (mister){
            case 1 : {
                misterName = "Mr ";
                transportName = "To work ";
                System.out.println("Mr how much money do you make in a month?");
                salary = scanner.nextDouble();
                break;
            }
            case 2 : {
                misterName = "Student ";
                transportName = "To university ";
                System.out.println("Student how much money do your family members send you in a month?");
                salary = scanner.nextDouble();
                break;
            }
        }
        System.out.println(misterName+ "Do you smoke?");
        System.out.println("1. yes /2. no");
        int smk = scanner.nextInt();
        switch (smk){
            case 1 : {
                System.out.println(misterName+"Quit smoking Smoking is bad for your health!!!");
                smoke = 20000;
                break;
            }
            case 2 : {
                System.out.println(misterName+"you do it right without smoking.");
                smoke = 0;
                break;
            }
            default:
        }
        System.out.println("1. 1 day expenses");
        System.out.println("2. 1 week expenses");
        System.out.println("3. 1 month expenses");
        int nums = scanner.nextInt();
        switch (nums) {
            case 1: {
                System.out.println("_-_-_1 day expenses_-_-_");
                System.out.println(misterName +"how much money did you spend on breakfast?");
                breakfast = scanner.nextDouble();
                System.out.println("-="+misterName+transportName+"what kind of transport do you take=-");
                System.out.println("1. Bus");
                System.out.println("2. Taxi");
                System.out.println("3. My Car");
                int num = scanner.nextInt();
                switch (num) {
                    case 1: {
                        System.out.println(misterName+"How much do you lose on the bus until you get to the destination?");
                        transport = scanner.nextDouble();
                        break;
                    }
                    case 2: {
                        System.out.println(misterName+"How much do you lose by taxi until you get to the destination?");
                        transport = scanner.nextDouble();
                        break;
                    }
                    case 3: {
                        System.out.println(misterName+"How much fuel do you put in your car?");
                        transport = scanner.nextDouble();
                        break;
                    }
                    default:
                        System.out.println(misterName+"XMmmmm ... error!!!");

                }
                System.out.println(misterName+"how much does it cost to have lunch?");
                lunch = scanner.nextDouble();
                System.out.println("-="+misterName+transportName+"what transport do you take home=-");
                System.out.println("1. Bus");
                System.out.println("2. Taxi");
                System.out.println("3. My Car");
                int numa = scanner.nextInt();
                switch (numa) {
                    case 1: {
                        System.out.println(misterName + "How much do you lose on the bus until you get to the destination?");
                        transporthom = scanner.nextDouble();
                        break;
                    }
                    case 2: {
                        System.out.println(misterName + "How much do you lose by taxi until you get to the destination?");
                        transporthom = scanner.nextDouble();
                        break;
                    }
                    case 3: {
                        System.out.println(misterName + "How much fuel do you put in your car?");
                        transporthom = scanner.nextDouble();
                        break;
                    }
                    default:
                        System.out.println(misterName + "XMmmmm ... error!!!");
                }
                        System.out.println(misterName+"how much do you spend on dinner?");
                dinner = scanner.nextDouble();

                sum = smoke + transport + lunch + dinner + breakfast + transporthom;
                salary = salary / 30;
                if(salary > sum){
                    System.out.println("your daily earnings: "+ salary + "   daily cost: " + sum);

                }else {
                    System.out.println("your daily earnings: "+ salary + "   daily cost: " + sum);
                    System.out.println("Learn to save money...");
                }
                double [] massive = new double[6];
                massive[0] = smoke;
                massive[1] = transport;
                massive[2] = lunch;
                massive[3] = dinner;
                massive[4] = breakfast;
                massive[5] = transporthom;
                double max  = massive[1];
                int arg=0;
                for(int i = 0; i < 6; i++){
                    if(max > massive[i]){

                    }else {
                        max = massive[i];
                        arg = i;
                    }
                }
                switch (arg){
                    case 0 : {
                        System.out.println("You need to quit smoking to save your health and money " + max);
                    }
                    case 1 : {
                        System.out.println();
                    }
                }

                break;
            }
            case 2 : {
                System.out.println("1 week expenses");



                break;
            }
            case 3: {
                System.out.println("1 month expenses");



                break;
            }
            default:
                System.out.println("there is no such number!.!");
        }
        return false;
    }


    @Override
    public String toString() {
        return "LogicsCounter{" +
                "breakfast=" + breakfast +
                ", transport=" + transport +
                ", dinner=" + dinner +
                ", lunch=" + lunch +
                ", smoke=" + smoke +
                ", summa :" + sum +
                '}';
    }
}
