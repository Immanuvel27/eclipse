package railwayTicket;

import java.util.*;

public class Ticket extends Passenger {
	Scanner in = new Scanner(System.in);
	int pnrno;
	String status;
	int nooftickets;
	String berth;
	static int seatCount = 8;

	public void booktickets(int n) {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		pnrno = n + 1;
		System.out.println("enter the name");
		name = in.nextLine();
		System.out.println("enter the sex");
		sex = in.nextLine();
		System.out.println("enter the age");
		age = in.nextInt();

		if (TrainDemo.upper < 1) {
			System.out.println("Upper berth is not Available");
		} else if (TrainDemo.middle < 1) {
			System.out.println("Middle berth is not available");
		} else if (TrainDemo.lower < 1) {
			System.out.println("Lower berth is not available");
		}

		System.out.println("enter the seat:lower:L middle:M  upper:U");

		//age less than or equal to 5

		if (age <= 5) {    
			berth = "";
			seatCount += 1;
		}

		//age greater than 60

		else if (age >= 60) {  	
			berth = in.next();

			if (TrainDemo.lower > 0) {
				berth = "L";
				TrainDemo.lower--;
			} else if (berth.equals("L")) {
				if (TrainDemo.lower > 0) {
					TrainDemo.lower--;
				} else if (TrainDemo.middle > 0) {
					berth = "M";
					TrainDemo.middle--;
				} else if (TrainDemo.upper > 0) {
					berth = "U";
					TrainDemo.upper--;
				}else if(TrainDemo.lower==0 &&TrainDemo.middle==0&&TrainDemo.upper==0&&TrainDemo.rac>0) {
					berth="rac";
					TrainDemo.rac--;
				}else if(TrainDemo.lower==0 &&TrainDemo.middle==0&&TrainDemo.upper==0&&TrainDemo.rac==0&&TrainDemo.waitingList>0) {
					berth="waitinglist";
					TrainDemo.waitingList--;					
				}

			} else if (berth.equals("M")) {
				if (TrainDemo.middle > 0) {
					TrainDemo.middle--;
				} else if (TrainDemo.upper > 0) {
					berth = "U";
					TrainDemo.upper--;
				} else if (TrainDemo.lower > 0) {
					berth = "L";
					TrainDemo.lower--;
				}else if(TrainDemo.lower==0 &&TrainDemo.middle==0&&TrainDemo.upper==0&&TrainDemo.rac>0) {
					berth="rac";
					TrainDemo.rac--;
				}else if(TrainDemo.lower==0 &&TrainDemo.middle==0&&TrainDemo.upper==0&&TrainDemo.rac==0&&TrainDemo.waitingList>0) {
					berth="waitinglist";
					TrainDemo.waitingList--;					
				}

			} else if (berth.equals("U")) {
				if (TrainDemo.upper > 0) {
					TrainDemo.upper--;
				} else if (TrainDemo.lower > 0) {
					berth = "L";
					TrainDemo.lower--;
				} else if (TrainDemo.middle > 0) {
					berth = "M";
					TrainDemo.middle--;
				}else if(TrainDemo.lower==0 &&TrainDemo.middle==0&&TrainDemo.upper==0&&TrainDemo.rac>0) {
					berth="rac";
					TrainDemo.rac--;
				}else if(TrainDemo.lower==0 &&TrainDemo.middle==0&&TrainDemo.upper==0&&TrainDemo.rac==0&&TrainDemo.waitingList>0) {
					berth="waitinglist";
					TrainDemo.waitingList--;					
				}

			}

		}


		//age is between 5 to 59

		else {										
			berth = in.next();

			if (berth.equals("L")) {
				if (TrainDemo.lower > 0) {
					TrainDemo.lower--;
				} else if (TrainDemo.middle > 0) {
					berth = "M";
					TrainDemo.middle--;
				} else if (TrainDemo.upper > 0) {
					berth = "U";
					TrainDemo.upper--;
				}else if(TrainDemo.lower==0 &&TrainDemo.middle==0&&TrainDemo.upper==0&&TrainDemo.rac>0) {
					berth="rac";
					TrainDemo.rac--;
				}else if(TrainDemo.lower==0 &&TrainDemo.middle==0&&TrainDemo.upper==0&&TrainDemo.rac==0&&TrainDemo.waitingList>0) {
					berth="waitinglist";
					TrainDemo.waitingList--;					
				}

			} else if (berth.equals("M")) {
				if (TrainDemo.middle > 0) {
					TrainDemo.middle--;
				} else if (TrainDemo.upper > 0) {
					berth = "U";
					TrainDemo.upper--;
				} else if (TrainDemo.lower > 0) {
					berth = "L";
					TrainDemo.lower--;
				}else if(TrainDemo.lower==0 &&TrainDemo.middle==0&&TrainDemo.upper==0&&TrainDemo.rac>0) {
					berth="rac";
					TrainDemo.rac--;
				}else if(TrainDemo.lower==0 &&TrainDemo.middle==0&&TrainDemo.upper==0&&TrainDemo.rac==0&&TrainDemo.waitingList>0) {
					berth="waitinglist";
					TrainDemo.waitingList--;					
				}

			} else if (berth.equals("U")) {
				if (TrainDemo.upper > 0) {
					TrainDemo.upper--;
				} else if (TrainDemo.lower > 0) {
					berth = "L";
					TrainDemo.lower--;
				} else if (TrainDemo.middle > 0) {
					berth = "M";
					TrainDemo.middle--;
				}else if(TrainDemo.lower==0 &&TrainDemo.middle==0&&TrainDemo.upper==0&&TrainDemo.rac>0) {
					berth="rac";
					TrainDemo.rac--;
				}else if(TrainDemo.lower==0 &&TrainDemo.middle==0&&TrainDemo.upper==0&&TrainDemo.rac==0&&TrainDemo.waitingList>0) {
					berth="waitinglist";
					TrainDemo.waitingList--;					
				}

			}
		}

		seatCount--;
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("your ticket number is:" + pnrno);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


	}

	public static void viewTickets(int num) {
		if (TrainDemo.ticketCount == 0) {
			System.out.println("no tickets available to print");
		}
		for (int i = 0; i < TrainDemo.ticketCount; i++) {
			if (num == TrainDemo.t[i].pnrno) {
				System.out.println("the ticket number:" + TrainDemo.t[i].pnrno);
				System.out.println("the name:" + TrainDemo.t[i].name);
				System.out.println("the age:" + TrainDemo.t[i].age);
				System.out.println("the berth:" + TrainDemo.t[i].berth);
			}
		}
	}


	public static void printAll() {
		System.out.println("PNR NO   AGE GENDER BERTH     NAME      ");
		for (int i = 0; i < TrainDemo.ticketCount; i++) {
			System.out.println(TrainDemo.t[i].pnrno+"        "+TrainDemo.t[i].age+"   "+TrainDemo.t[i].sex+"        "+
					TrainDemo.t[i].berth+"      "+TrainDemo.t[i].name);
		}

	}

	public static void cancel() {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the name:");
		String s=in.next();
		System.out.println("Enter the pnrno to delete:");
		int number=in.nextInt();


		for(int i=0;i<TrainDemo.ticketCount;i++) {
			if(number==TrainDemo.t[i].pnrno && s.equals(TrainDemo.t[i].name)) {
				if(TrainDemo.rac<1) {
					for(int j=0;j<TrainDemo.ticketCount;j++) {
						if(TrainDemo.t[j].berth.equals("rac")) {
							TrainDemo.t[i].name=TrainDemo.t[j].name;
							TrainDemo.t[i].age=TrainDemo.t[j].age;
							TrainDemo.t[i].sex=TrainDemo.t[j].sex;
								
							for(int k=0;k<TrainDemo.ticketCount;k++) {
								if(TrainDemo.waitingList==0) {
									TrainDemo.t[j].name=TrainDemo.t[k].name;
									TrainDemo.t[j].age=TrainDemo.t[k].age;
									TrainDemo.t[j].sex=TrainDemo.t[k].sex;
																		
								}
							}
							continue;

						}
						
					}

				}
//				TrainDemo.rac++;
//				TrainDemo.waitingList++;
//								seatCount++;
//								TrainDemo.ticketCount--;
			}
			
		}

	}



}
