import java.util.*;
import java.time.LocalDate;

class Vaccine// Parent class to display and register vaccines
{
	String name, pincode, gender, aadhar_no, default_pass, userId, uId, new_pass, pass, con_pass, c_num, time, date,
			lName, lPass;
	int age, bYear;
	String vac_name;
	double price;
	String centre_name;
	int no, no_of_vac;
	String v[];
	int day, month, year;

	void displayVaccineChild()// mathod() to display vaccines for child
	{
		System.out.println("************* VACCINES FOR CHILDREN *************");
		System.out.println("_________________________________________________");
		System.out.println("|  No.  |    Vaccine name         |    Price    |");
		System.out.println("|_______|_________________________|_____________|");
		System.out.println("|-----------------------------------------------|");
		System.out.println("|   1   |   COVAXIN COVID-19      |    450/-    |");
		System.out.println("|   2   |   INFLUENZA(FLU)        |    750/-    |");
		System.out.println("|   3   |   TETANUS               |    150/-    |");
		System.out.println("|   4   |   DIPHTHERIA            |    225/-    |");
		System.out.println("|   5   |   PERTUSSIS             |    225/-    |");
		System.out.println("|   6   |   MENINGOCOCCAL DISEASE |    3000/-   |");
		System.out.println("|   7   |   MEASLES               |    150/-    |");
		System.out.println("|   8   |   MUMPS                 |    185/-    |");
		System.out.println("|   9   |   RUBELLA               |    125/-    |");
		System.out.println("|   10  |   CHICKENPOX            |    1800/-   |");
		System.out.println("|_______________________________________________|");
	}

	void displayVaccineAdult()// method() to display vaccines for adults
	{
		System.out.println("************** VACCINES FOR ADULTS **************");
		System.out.println("_________________________________________________");
		System.out.println("|  No.  |    Vaccine name         |    Price    |");
		System.out.println("|_______|_________________________|_____________|");
		System.out.println("|-----------------------------------------------|");
		System.out.println("|   1   |   COVID-19              |    650/-    |");
		System.out.println("|   2   |   INFLUENZA(FLU)        |    750/-    |");
		System.out.println("|   3   |   TETANUS               |    150/-    |");
		System.out.println("|   4   |   HEP-A                 |    225/-    |");
		System.out.println("|   5   |   PERTUSSIS             |    225/-    |");
		System.out.println("|   6   |   HEP-B                 |    250/-    |");
		System.out.println("|   7   |   TYPHOID               |    150/-    |");
		System.out.println("|   8   |   HPV                   |    185/-    |");
		System.out.println("|   9   |   SHIGLES               |    125/-    |");
		System.out.println("|   10  |   PNEUMOCOCCAL          |    1800/-   |");
		System.out.println("|_______________________________________________|");
	}

	void registerVaccineChild()// method() to register vaccine for child
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nFor which vaccine you want to register? \n(Enter only number[1-10]) -> ");
		no = sc.nextInt();
		switch (no) {
			case 1:
				vac_name = "COVAXIN";
				price = 800;
				break;
			case 2:
				vac_name = "INFLUENZA";
				price = 750;
				break;
			case 3:
				vac_name = "TETANUS";
				price = 150;
				break;
			case 4:
				vac_name = "DIPHTHERIA";
				price = 225;
				break;
			case 5:
				vac_name = "PERTUSSIS";
				price = 225;
				break;
			case 6:
				vac_name = "MENINGOCOCCAL DISEASE";
				price = 3000;
				break;
			case 7:
				vac_name = "MEASLES";
				price = 150;
				break;
			case 8:
				vac_name = "MUMPS";
				price = 185;
				break;
			case 9:
				vac_name = "RUBELLA";
				price = 125;
				break;
			case 10:
				vac_name = "CHICKENPOX";
				price = 1800;
				break;
			default: {
				System.out.println("PLEASE ENTER VALID CHOICE");
				registerVaccineChild();
			}
		}
		printRegisteredVaccine();// calling method() to print registered vaccine
		for (int i = 0; i < no_of_vac; i++) {
			if (v[i].equalsIgnoreCase(vac_name)) // checks whether patient has taken selected vaccine before or not
			{
				System.out.println(
						"\nYou have already taken this vaccine !! \nYou can not take it again! \nRegister for another vaccine \n");
				registerVaccineChild();
			}
		}
	}

	void registerVaccineAdult()// method() to register vaccine for adults
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nFor which vaccine you want to register? \n(Enter only number[1-10]) -> ");
		no = sc.nextInt();
		switch (no) {
			case 1: {
				System.out.println("\n1.COVAXIN \nPRICE : 1200 \n\n2.COVISHIELD \nPRICE : 800/- \n");
				System.out.print("Which vaccine do you prefer ?");
				int c = sc.nextInt();
				switch (c) {
					case 1:
						vac_name = "COVAXIN";
						price = 1200;
						break;
					case 2:
						vac_name = "COVISHIELD";
						price = 800;
						break;
					default:
						System.out.println("Invalid Choice");
				}
			}
				break;
			case 2:
				vac_name = "INFLUENZA";
				price = 750;
				break;
			case 3:
				vac_name = "TETANUS";
				price = 150;
				break;
			case 4:
				vac_name = "HEP-A";
				price = 225;
				break;
			case 5:
				vac_name = "PERTUSSIS";
				price = 225;
				break;
			case 6:
				vac_name = "HEP-B";
				price = 3000;
				break;
			case 7:
				vac_name = "TYPHOID";
				price = 150;
				break;
			case 8:
				vac_name = "HPV";
				price = 185;
				break;
			case 9:
				vac_name = "SHIGLES";
				price = 125;
				break;
			case 10:
				vac_name = "PNEUMOCOCCAL";
				price = 1800;
				break;
			default: {
				System.out.println("PLEASE ENTER VALID CHOICE");
				registerVaccineAdult();
			}
		}
		printRegisteredVaccine();// calling method() to print registered vaccine
		for (int i = 0; i < no_of_vac; i++) {
			if (v[i].equalsIgnoreCase(vac_name))// checks whether patient has taken selected vaccine before or not
			{
				System.out.println(
						"\nYou have already taken this vaccine !! \nYou can not take it again! \nRegister for another vaccine \n");
				registerVaccineAdult();
			}
		}
	}

	void printRegisteredVaccine()// prints registered vaccine
	{
		System.out.println("\n**************************");
		System.out.println("Vaccine Name  : " + vac_name);
		System.out.println("Vaccine Price : " + price);
		System.out.println("**************************\n");
	}

	void setTime()// sets time
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter time :-> ");
		time = sc.nextLine();
	}

	void checkDate()// selects date
	{
		LocalDate startDate = LocalDate.of(2023, 4, 1);
		LocalDate endDate = LocalDate.of(2023, 7, 30);
		Scanner sc = new Scanner(System.in);

		while (true) {
			// Use the isAfter() and isBefore() method to check valid date

			System.out.print("Enter the day(1-31)  : ");
			day = sc.nextInt();
			System.out.print("Enter the month(4-7) : ");
			month = sc.nextInt();
			System.out.print("Enter the year(2023) : ");
			year = sc.nextInt();
			System.out.println();
			LocalDate dateToValidate = LocalDate.of(year, month, day);
			if (dateToValidate.isAfter(startDate) && dateToValidate.isBefore(endDate)) {
				break;
			} else {
				System.out.println("OOPS!!" + dateToValidate + " IS NOT VALID DATE.\nPlease enter vaild date\n");
			}
		}
	}

	void printReciept()// prints reciept
	{
		System.out.println(
				"\n--------------------------------------\n--------------------------------------\n--------        RECIEPT     ----------");
		System.out.println("--------------------------------------\n--------------------------------------");
		System.out.println("|      NAME          :" + name);
		System.out.println("|      AGE           :" + age);
		System.out.println("|      VACCINE NAME  :" + vac_name);
		System.out.println("|      VACCINE PRICE :" + price);
		System.out.println("|      DATE          :" + date);
		System.out.println("|      TIME          :" + time);
		System.out.println("--------------------------------------\n--------------------------------------\n");
	}
}

class Customer extends Vaccine {
	void signIn() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your full name     : ");
		name = sc.nextLine();
		System.out.print("Enter your contact number: ");
		c_num = sc.nextLine();

		while (c_num.length() != 10) {
			System.out.println("================= \nINVALID CONTACT NUMBER! \nPLEASE TRY AGAIN \n=================");
			System.out.print("Enter your contact number: ");
			c_num = sc.nextLine();
		}
		System.out.print("Enter your birth year    : ");
		bYear = sc.nextInt();

		while (bYear < 1923 || bYear >= 2023) {
			System.out.println("\n================= \nINVALID BIRTH YREAR! \nPLEASE TRY AGAIN \n=================\n");
			System.out.print("Enter your birth year    : ");
			bYear = sc.nextInt();
		}
		age = 2023 - bYear;
		sc.nextLine();
		System.out.print("Enter your pincode       : ");
		pincode = sc.nextLine();
		System.out.print("Enter your gender        : ");
		gender = sc.nextLine();
		System.out.print("Enter your aadhar number : ");
		aadhar_no = sc.nextLine();

		while (aadhar_no.length() != 12) {
			System.out.println("\n================= \nINVALID AADHAR NUMBER! \nPLEASE TRY AGAIN \n=================\n");
			System.out.print("Enter your aadhar number : ");
			aadhar_no = sc.nextLine();
		}
		System.out.print("\nEnter how many vaccines have you taken : ");
		no_of_vac = sc.nextInt();
		vacTaken();

		for (int i = 0; i < no_of_vac; i++) {
			System.out.println("Vaccine " + (i + 1) + " -> " + v[i]);
		}
		String s[] = name.split(" ");
		userId = s[0] + bYear;
		System.out.println("User Id    : " + userId);
		default_pass = userId;
		System.out.println("\n----------------NOTE : your user id and password will be same!----------------\n");
		System.out.println();
		sc.nextLine();
		System.out.println("Do you want to change password ? \nPress y or Y for yes \nPress n or N for no");
		String ch = sc.nextLine();
		if (ch.equalsIgnoreCase("y")) {
			changePass();
		}
	}

	void logIn()// logging in customer
	{
		System.out.println("\n******** ENTER DETAILS TO LOG IN ********\n----------------------------------------\n");
		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter your name : ");
		lName = sc.nextLine();
		System.out.print("Enter your password : ");
		lPass = sc.nextLine();

		if (lName.equals(name) && (lPass.equals(default_pass))) {
			System.out.println("\n******** SUCCESSFULLY LOGIN ********\n-------------------------------------\n");
		} else {
			if (!lName.equals(name)) {
				System.out.println("INVAILD NAME!");
			} else {
				System.out.println("INVALID PASSWORD!");
			}
			logIn();
		}
	}

	void vacTaken()// method() to select vaccines which patient has taken before
	{
		v = new String[no_of_vac];
		for (int i = 0; i < no_of_vac; i++) {
			Scanner sc = new Scanner(System.in);

			if (age < 18) {
				System.out.println(
						"\n1.COVAXIN COVID-19 \n2.INFLUENZA(FLU) \n3.TETANUS \n4.DIPHTHERIA \n5.PERTUSSIS \n6.MENINGOCOCCAL DISEASE   \n7.MEASLES \n8.MUMPS \n9.RUBELLA \n10.CHICKENPOX   \n");
				System.out.print("Vaccine " + (i + 1) + " -> \n*******************");
				int vacChoice = sc.nextInt();
				switch (vacChoice) {
					case 1:
						v[i] = "COVAXIN";
						break;
					case 2:
						v[i] = "INFLUENZA";
						break;
					case 3:
						v[i] = "TETANUS";
						break;
					case 4:
						v[i] = "DIPHTHERIA";
						break;
					case 5:
						v[i] = "PERTUSSIS";
						break;
					case 6:
						v[i] = "MENINGOCOCCAL DISEASE";
						break;
					case 7:
						v[i] = "MEASLES";
						break;
					case 8:
						v[i] = "MUMPS";
						break;
					case 9:
						v[i] = "RUBELLA";
						break;
					case 10:
						v[i] = "CHICKENPOX";
						break;
					default: {
						System.out.println("PLEASE ENTER VALID CHOICE");
						vacTaken();
					}
				}
			} else {

				System.out.println(
						"\n1.\n  1.1 COVAXIN \n  1.2 COVISHIELD \n2.INFLUENZA \n3.TETANUS \n4.HEP-A \n5.PERTUSSIS \n6.HEP-B \n7.TYPHOID \n8.HPV \n9.SHIGLES \n10.PNEUMOCOCCAL   \n");
				System.out.print("Vaccine " + (i + 1) + " -> ");
				int vacChoice = sc.nextInt();
				switch (vacChoice) {
					case 1: {
						System.out.println();
						System.out.println("1.1 COVAXIN \n1.2 COVISHIELD ");
						System.out.print("\nWhich vaccine ?");
						int c = sc.nextInt();
						switch (c) {
							case 1:
								v[i] = "COVAXIN";
								break;
							case 2:
								v[i] = "COVISHIELD";
								break;
							default: {
								v[i] = "";
								System.out.println("Invalid Choice");
							}
						}
					}
						break;
					case 2:
						v[i] = "INFLUENZA";
						break;
					case 3:
						v[i] = "TETANUS";
						break;
					case 4:
						v[i] = "HEP-A";
						break;
					case 5:
						v[i] = "PERTUSSIS";
						break;
					case 6:
						v[i] = "HEP-B";
						break;
					case 7:
						v[i] = "TYPHOID";
						break;
					case 8:
						v[i] = "HPV";
						break;
					case 9:
						v[i] = "SHIGLES";
						break;
					case 10:
						v[i] = "PNEUMOCOCCAL";
						break;
					default: {
						System.out.println("PLEASE ENTER VALID CHOICE");
						vacTaken();
					}
				}
			}
		}
	}

	void changePass() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter your user id       : ");
		uId = sc.nextLine();
		System.out.print("Enter your password      : ");
		pass = sc.nextLine();
		if (uId.equals(userId) && pass.equals(default_pass)) {
			System.out.print("\nEnter your new password :");
			new_pass = sc.nextLine();
			System.out.print("Enter confirm password  :");
			con_pass = sc.nextLine();
			if (new_pass.equals(con_pass)) {
				default_pass = con_pass;
				System.out.println(
						"-------------------------\nPASSWORD CHANGED SUCCESSFULLY!!\n-------------------------");
			} else {
				System.out.println("\nNew password and confirm password must e same!!!\n");
				changePass();
			}
		} else {
			System.out.println("\nPlease enter valid userId or password:\n");
			changePass();
		}
	}
}

class VaccineRegistration {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n****************************************************");
		System.out.println("****                                            ****");
		System.out.println("****   WELCOME TO VACCINE REGESTRATION SYSTEM   ****");
		System.out.println("****                                            ****");
		System.out.println("****************************************************\n");
		boolean t = true;
		int p = 0;
		int ch = 1;
		while (t) {
			if (p != 0) {
				System.out.println("Press 1 to add user \nPress 2 to exit");
				System.out.print("Enter Your Choice :-> ");
				ch = sc.nextInt();
			}
			switch (ch) {
				case 1: {
					p++;
					System.out.println("\n-----------------MEMBER " + p + "--------------------");
					System.out.println("**********************************************");
					System.out.println(
							"\n----------------------------------------------\nPLEASE ENTER YOUR PERSONAL DETAILS TO REGISTER\n----------------------------------------------\n");
					Customer c = new Customer();
					c.signIn();
					c.logIn();
					sc.nextLine();
					if (c.age < 18) {
						c.displayVaccineChild();
						c.registerVaccineChild();
						boolean vc = true;
						while (vc) {

							System.out.print("\nDo you want confirm this vaccine ?(yes/no) -> ");
							String ans = sc.nextLine();
							if (ans.equalsIgnoreCase("no")) {
								System.out.print("\nDo you want to choose any other vaccine ?(yes/no) -> ");
								String choose = sc.nextLine();
								if (choose.equalsIgnoreCase("no")) {
									c.vac_name = "-";
									c.price = 0;
									vc = false;
								} else {
									c.registerVaccineChild();
								}
							} else {
								vc = false;
								sc.nextLine();
								c.checkDate();
								c.setTime();
								System.out.println(
										"\n-----------------------------------\nCONGRATS!!!SUCCESSFULLY REGISTERED\n-----------------------------------\n");
							}
						}
						System.out.print("Do you want to print receipt ?(yes/no) -> ");
						String choicee = sc.nextLine();
						if (choicee.equalsIgnoreCase("yes")) {
							c.printReciept();
						} else {
							System.out.println(
									"\n!!!!!!!!!!!!!!!!!!!!!!!\nThank you for vising us\n!!!!!!!!!!!!!!!!!!!!!!!\n");
						}
					} else if (c.age >= 18) {
						c.displayVaccineAdult();
						c.registerVaccineAdult();
						boolean vc = true;
						while (vc) {

							System.out.print("\nDo you want confirm this vaccine ?(yes/no) -> ");
							String ans = sc.nextLine();
							if (ans.equalsIgnoreCase("no")) {
								System.out.print("\nDo you want to choose any other vaccine ?(yes/no) -> ");
								String choose = sc.nextLine();
								if (choose.equalsIgnoreCase("no")) {
									c.vac_name = "-";
									c.price = 0;
									vc = false;
								} else {
									c.registerVaccineAdult();
								}
							} else {
								vc = false;
								sc.nextLine();
								c.checkDate();
								c.setTime();
								System.out.println(
										"\n-----------------------------------\nCONGRATS!!!SUCCESSFULLY REGISTERED\n-----------------------------------\n");
							}
						}
						System.out.print("Do you want to print receipt ?(yes/no) -> ");
						String choicee = sc.nextLine();
						if (choicee.equalsIgnoreCase("yes")) {
							c.printReciept();
						} else {
							System.out.println(
									"\n!!!!!!!!!!!!!!!!!!!!!!!\nThank you for vising us\n!!!!!!!!!!!!!!!!!!!!!!!\n");
						}
					}
				}
					break;
				case 2: {
					t = false;
				}
					break;
				default: {
					System.out.println("Invalid choice");
				}
			}
		}
	}
}