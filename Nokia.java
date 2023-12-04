import java.util.Scanner;
	public class Nokia{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

System.out.println(" 1:Phonebook");
System.out.println(" 2:Messages");
System.out.println(" 3:Chat");
System.out.println(" 4:Call Register");
System.out.println(" 5:Tones");
System.out.println(" 6:Settings");
System.out.println(" 7:Call Divert");
System.out.println(" 8:Games");
System.out.println(" 9:Calculator");
System.out.println(" 10:Reminders");
System.out.println(" 11:Clock");
System.out.println(" 12:Profiles");
System.out.println(" 13:Sim Services");

System.out.print("Enter a selection: ");
int selection = scanner.nextInt();
 if(selection == 1){
System.out.println("1.Search");
System.out.println("2.Service Nos");
System.out.println("3.Add Name");
System.out.println("4.Erase");
System.out.println("5.Edit");
System.out.println("6.Assign tone");
System.out.println("7.Send B'Card");
System.out.println("8.Options");
System.out.println("9.Speed dials");
System.out.println("10.Voice Tags");

 System.out.print("Enter a Selection: ");
   int option = scanner.nextInt();
     if(selection == 1){
  	if(selection == 8){
System.out.println("Search");
}
else{
 System.out.println("1.Type Of View");
  System.out.println("2.Memory Status");
    }
}
}
if (selection == 2){
System.out.println(" 1:Write Messages");
System.out.println(" 2:Inbox");
System.out.println(" 3:Outbox");
System.out.println(" 4:Picture Message");
System.out.println(" 5:Templates");
System.out.println(" 6:Smileys");
System.out.print(" 7:Message Settings"+"\n" );
System.out.print("1: Set"+ "\n" + "\t");
System.out.print("1: Message centre number"+ "\n" + "\t");
System.out.print("2: Message sent as"+ "\n" + "\t");
System.out.print("3: Message validity"+ "\n");
System.out.print("2: Common"+ "\n" + "\t");
System.out.print("1: Delivery reports"+ "\n" + "\t");
System.out.print("2: Reply via same centre"+ "\n" + "\t");
System.out.print("3: Character support"+ "\n" );
System.out.println(" 8:Info Service");
System.out.println(" 9:Voice mailbox number");
System.out.println(" 10:Service command editor");
}
if (selection == 3){
System.out.println("Chat");
}
if(selection == 4){
System.out.println("1: Missed calls");
System.out.println("2: Received calls");
System.out.println("3: Dialled numbers");
System.out.println("4: Erase recent call lists");
System.out.print("5: Show call duration"+"\n" + "\t");
System.out.print("1.Last call duration" + "\n"+ "\t");
System.out.print("2.All calls duration" + "\n"+"\t");
System.out.print("3.Received call duration" + "\n"+ "\t");
System.out.print("4.Dialled call duration" + "\n" + "\t");
System.out.print("5.Clear timers" + "\n" );
System.out.print("6: Show call costs" + "\n" + "\t");
System.out.print("1.Last call cost" + "\n" + "\t");
System.out.print("2.All call cost" + "\n" + "\t");
System.out.print("3.Clear timers" + "\n");
System.out.print("7. Call cost settings"+ "\n" + "\t" );
System.out.print("1.Call cost limit" + "\n" + "\t");
System.out.print("2.Show costs in" + "\n" + "\t");
System.out.println("8.Prepaid credit" + "\n" );
}
if (selection == 5){
System.out.println("1: Ringing tone");
System.out.println("2: Ringinng volume");
System.out.println("3: Incoming call alert");
System.out.println("4: Composer");
System.out.println("5: Message alert tone");
System.out.println("6: Keypad tones");
System.out.println("7: Warning and game tones");
System.out.println("8: Vibrating alert");
System.out.println("9: Screen saver");

}
if(selection == 6){
System.out.print("1: Call settings"+"\n");
System.out.print("1: Automatic redial"+ "\n" + "\t");
System.out.print("2: Speed dialing"+ "\n" + "\t");
System.out.print("3: Call waiting options"+ "\n" + "\t");
System.out.print("4: Own number sending"+ "\n" + "\t");
System.out.print("5: Phone line in use"+ "\n" + "\t");
System.out.print("6: Automatic answer"+ "\n" );
System.out.print("2: Phone settings"+ "\n" + "\t");
System.out.print("1: Language"+ "\n" + "\t");
System.out.print("2: Cell info display"+ "\n" + "\t");
System.out.print("3: Welcome note"+ "\n" + "\t");
System.out.print("4: Network selection"+ "\n" + "\t");
System.out.print("5: lights"+ "\n" + "\t");
System.out.print("6: Confirm SIM service actions"+ "\n" );
System.out.print("3: Security settings"+ "\n" + "\t");
System.out.print("1: Pin code request"+ "\n" + "\t");
System.out.print("2: Call barring service"+ "\n" + "\t");
System.out.print("3: Fixed dialling"+ "\n" + "\t");
System.out.print("4: Closed user group"+ "\n" + "\t");
System.out.print("5: Phone security"+ "\n" + "\t");
System.out.print("6: Change access code"+ "\n" );
System.out.println("4: Restore factory settings"+ "\n" );
}
if(selection == 7){
System.out.print("Call divert");
}
if(selection == 8){
System.out.print("Games");
}
if (selection == 9){
System.out.print("Calculator");
}
if (selection == 10){
System.out.print("Reminder");
}
if (selection == 11){
System.out.print("Clock"+ "\n" + "\t");
System.out.print("1: Alarm clock"+ "\n" + "\t");
System.out.print("2: Clock settings"+ "\n" + "\t");
System.out.print("3: Date settings"+ "\n" + "\t");
System.out.print("4: Stopwatch"+ "\n" + "\t");
System.out.print("5: Countdown timer"+ "\n" + "\t");
System.out.print("6: Auto update of date and time"+ "\n");
}

if (selection == 12){
System.out.print("Profiles");
}
if (selection == 13){
System.out.print("SIM services");
}



}

}