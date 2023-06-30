import java.util.*;
public class currencyMain {
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        int from,to;
        int amt;
        float conamt;
        System.out.println("Welcome to LGM Currency converter System !!!");
        System.out.println("Enter your amount");
        amt=sc.nextInt();
        System.out.println("Enter your current currency  ");
        System.out.println("1.INR\n2.USD\n3.GBP\n4.AUD\n5.JPY\n6.EUR");
        from=sc.nextInt();
        System.out.println("Enter your converting currency type ");
        System.out.println("1.INR\n2.USD\n3.GBP\n4.AUD\n5.JPY\n6.EUR");
        to=sc.nextInt();

        switch(from)
        {
            case 2:
            switch(to)
            {
                case 1:conamt=amt*81.90647f;
                        System.out.println("Converted value from USD to INR:"+conamt);
                        break;
                case 2:conamt=amt* 1;
                        System.out.println("Converted value  from USD to USD:"+conamt);
                        break;
                case 3:conamt=amt*0.77936f;
                        System.out.println("Converted value  from USD to GBP:"+conamt);
                        break;
                        
                case 4:conamt=amt*1.45454f;
                        System.out.println("Converted value  from USD to AUD:"+conamt);
                        break;
                case 5:conamt=amt*141.7528f;
                        System.out.println("Converted value  from USD to JPY:"+conamt);
                        break;
                case 6:conamt=amt*0.913879f;
                        System.out.println("Converted value  from USD to EUR:"+conamt);
                        break;
                        
            }
            break;

            case 1:
            switch(to)
            {
                case 1:conamt=amt*1;
                        System.out.println("Converted value from INR to INR:"+conamt);
                        break;
                case 2:conamt=amt* 0.01220f;
                        System.out.println("Converted value from INR to USD:"+conamt);
                        break;
                case 3:conamt=amt*0.00952f;
                        System.out.println("Converted value from INR to GBP:"+conamt);
                        break;
                        
                case 4:conamt=amt*0.01614f;
                        System.out.println("Converted value from INR to AUD:"+conamt);
                        break;
                case 5:conamt=amt*1.73116f;
                        System.out.println("Converted value from INR to JPY:"+conamt);
                        break;
                case 6:conamt=amt*0.011153f;
                        System.out.println("Converted value from INR to EUR:"+conamt);
                        break;
            }
            break;

            case 3:
            switch(to)
            {
                case 1:conamt=amt*105.0863f;
                        System.out.println("Converted value from GBP to INR:"+conamt);
                        break;
                case 2:conamt=amt* 1.2830f;
                        System.out.println("Converted value  from GBP to USD:"+conamt);
                        break;
                case 3:conamt=amt*1;
                        System.out.println("Converted value  from GBP to GBP:"+conamt);
                        break;
                case 4:conamt=amt*1.86619f;
                        System.out.println("Converted value  from GBP to AUD:"+conamt);
                        break;
                case 5:conamt=amt*181.8728f;
                        System.out.println("Converted value  from GBP to JPY:"+conamt);
                        break;
                case 6:conamt=amt*1.17246f;
                        System.out.println("Converted value  from GBP to EUR:"+conamt);
                        break;
                        
            }
            break;

            case 4:
            switch(to)
            {
                case 1:conamt=amt*56.3115f;
                        System.out.println("Converted value from AUD to INR:"+conamt);
                        break;
                case 2:conamt=amt* 0.68750f;
                        System.out.println("Converted value  from AUD to USD:"+conamt);
                        break;
                case 3:conamt=amt*0.5358f;
                        System.out.println("Converted value  from AUD to GBP:"+conamt);
                        break;
                case 4:conamt=amt*1;
                        System.out.println("Converted value  from AUD to AUD:"+conamt);
                        break;
                case 5:conamt=amt*97.429f;
                        System.out.println("Converted value  from AUD to JPY:"+conamt);
                        break;
                case 6:conamt=amt*0.6283f;
                        System.out.println("Converted value  from AUD to EUR:"+conamt);
                        break;
                        
            }
            break;

            case 5:
            switch(to)
            {
                case 1:conamt=amt*0.57778f;
                        System.out.println("Converted value from JPY to INR:"+conamt);
                        break;
                case 2:conamt=amt* 0.0070541628f;
                        System.out.println("Converted value  from JYP to USD:"+conamt);
                        break;
                case 3:conamt=amt*0.0054982767f;
                        System.out.println("Converted value  from JPY to GBP:"+conamt);
                        break;
                case 4:conamt=amt*0.010260f;
                        System.out.println("Converted value  from JPY to AUD:"+conamt);
                        break;
                case 5:conamt=amt*1;
                        System.out.println("Converted value  from JPY to JPY:"+conamt);
                        break;
                case 6:conamt=amt*0.006449f;
                        System.out.println("Converted value  from JPY to EUR:"+conamt);
                        break;
                        
            }
            break;


            case 6:
            switch(to)
            {
                case 1:conamt=amt*89.69157f;
                        System.out.println("Converted value from EUR to INR:"+conamt);
                        break;
                case 2:conamt=amt* 1.09494f;
                        System.out.println("Converted value  from ERU to USD:"+conamt);
                        break;
                case 3:conamt=amt*0.85383f;
                        System.out.println("Converted value  from EUR to GBP:"+conamt);
                        break;
                case 4:conamt=amt*1.59228f;
                        System.out.println("Converted value  from EUR to AUD:"+conamt);
                        break;
                case 5:conamt=amt*155.2857f;
                        System.out.println("Converted value  from EUR to JPY:"+conamt);
                        break;
                case 6:conamt=amt*1;
                        System.out.println("Converted value  from EUR to EUR:"+conamt);
                        break;
                        
            }
            break;

        }


sc.close();
    }
    
}
