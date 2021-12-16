import java.util.Scanner;
public class Time
{
int seconds,minutes, hours;
public Time(int hours,int minutes, int seconds)
{ 
this.hours=hours;
this.minutes=minutes;
this.seconds=seconds;
}
public static void main(String args[])
{
int sth,stm,sts,enh,enm,ens;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the start time (hours minutes seconds)");
sth=sc.nextInt();
stm=sc.nextInt();
sts=sc.nextInt();
System.out.println("Enter the stop time (hours minutes seconds)");
enh=sc.nextInt();
enm=sc.nextInt();
ens=sc.nextInt();
Time start = new Time(sth, stm, sts);
Time stop = new Time(enh, enm, ens);
Time diff;
diff = difference(start, stop);
System.out.printf("Time DIFFRENCE:\n %d:%d:%d", start.hours, start.minutes, start.seconds);
System.out.printf("\n-%d:%d:%d",stop.hours, stop.minutes, stop.seconds);
System.out.printf("\n----------\n=%d:%d:%d\n", diff.hours,diff.minutes, diff.seconds);
}
public static Time difference(Time start, Time stop)
{
Time diff = new Time(0, 0, 0);
if(start.seconds>stop.seconds)
{
--stop.minutes;
stop.seconds+=60;
}
diff.seconds = stop.seconds -start.seconds;
if(start.minutes>stop.minutes)
{
--stop.hours;
stop.minutes+=60;
}
diff.minutes=stop.minutes-start.minutes;
diff.hours=stop.hours-start.hours;
return(diff);
}
}
