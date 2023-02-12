class ConditionAndLoops {
    public static void main(String[] args) {
        int x = 4;
        if(x == 4) {
            System.out.println("I'm inside If condition.......");
        }

        if(x != 4) {
            System.out.println("I'm inside If condition.......");
        } else if(x == 4) {
            System.out.println("I'm inside if else condition......."); 
        } else {
            System.out.println("I'm inside else condition......."); 
        }


        System.out.println(x >= 4 ? "Its four" : "it not four");
        System.out.println(x > 6 ? "Its four" : "it not four");


        if(x == 1) 
            System.out.println("One");
        else if(x == 2)
            System.out.println("Two");
        else if(x == 3)
            System.out.println("Three");
        else if(x == 4)
            System.out.println("Four");
        else if(x == 5)
            System.out.println("Five");
        else if(x == 6)
            System.out.println("Six");
        else if(x == 7)
            System.out.println("Seven");
        else if(x == 8)
            System.out.println("Eight");
        else if(x == 9)
            System.out.println("Nine");
        else if(x == 10)
            System.out.println("Ten");
        else
            System.out.println("Number not from 1 to 10");


       switch(11) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Number not from 1 to 10");
       }     
    }    
}
