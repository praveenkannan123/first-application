package welcome_screen;

	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;
	public class wlecomescreen {
	 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String filename;
			char ch;
			File directory= new File ("C:\\Users\\praveen\\simplilearn project\\assignment\\");
	String[] flist = directory.list();
	Scanner input = new Scanner(System.in);
	System.out.println("-------*---------&---------");
	System.out.println("-------SIMPLILEARN ASSIGNMENT 1-----------");
	System.out.println("-------*---------&----------");
	System.out.println("---------PRAVEEN KANNAN------------");
	System.out.println("--------*--------&----------");
	System.out.println("----------FULLSTACK DEVELOPER----------");
	System.out.println();
	do {
		System.out.println("SELECT FILE OPTION TO PERFORM ANY OPERATION:\n");
		System.out.println("1.FILE CREATION");
		System.out.println("2.FILE LIST");
		System.out.println("3.FILE DELETE");
		System.out.println("4.FILE SEARCH"); 
		System.out.println("5.EXIT");
		
		int choice = input.nextInt();
		switch (choice) {
		
		case 1:
			System.out.println("ENTER THE FILE NAME FOR CREATING THE NEW FILE");
			filename = input.next();
			try {
				File file = new File("C:\\praveen\\simplilearn project\\assignment\\"+filename+".txt");
				if (file.createNewFile()) {
					System.out.println("THE NEW FILE HAS BEEN SUCESSFULLY CREATED \n");
				} 
				else {
					if(file.exists()) {
						System.out.println("THE FILE ALREADY EXIST");
					}
					else {
						System.out.println("THE FILE DOES NOT EXIST");
					}
					boolean b = file.delete();
					if (b==true) {
						System.out.println("THE FILE IS DELETED");
					}
					else {
						System.out.println("THE FILE IS NOT DELETED");
					}
		}
	}
		catch (IOException e)	{
			e.printStackTrace();
		}
			break;
			
		case 2:
		
			listOfFiles();
			break;
			
		case 3:
			System.out.println("ENTER THE FILE WHICH YOU WANT TO DELETE");
			
			filename = input.next();
			File directory_delete = new File("C:\\praveen\\simplilearn project\\assignment\\");
			
			String[] flist_delete = directory_delete.list();
			int flag_d = 0;
			if (flist_delete == null) {
				System.out.println("THERE IS NO FILE PRESENT IN THE DIRECTORY");
			}
			else {
				for (int i = 0; i < flist_delete.length; i++) {
					String delete_filename = flist_delete[i];
					
					if (delete_filename.equalsIgnoreCase(filename)) {
						
						File file = new File("C:\\praveen\\simplilearn project\\assignment\\"+delete_filename);
						
						if (file.delete()) {
							System.out.println("FILE IS DELETED");
						}
						else {
							System.out.println("FILE NOT DELETED");
						}
						flag_d = 1;	
					}
				}
			}
		if (flag_d == 0) {
			System.out.println("FILE NOT FOUND");
		}
		break;
		
		case 4:
			System.out.println("ENTER THE FILE FOR SEARCHING");
			filename = input.next();
			File directory_search = new File ("C:\\praveen\\simplilearn project\\assignment\\");
			String[] flist_search = directory_search.list();
			int flag_s = 0;
			if (flist_search == null) {
				System.out.println("THERE IS NO FILE PRESENT IN THE DIRECTORY");
			}
			else {
				for (int i = 0; i < flist_search.length; i++) {
					String search_filename = flist_search[i];
					
					if (search_filename.equalsIgnoreCase(filename)) {
						System.out.println(search_filename+"found");
						flag_s = 1;
					}
					
					
				}	
				}
			if (flag_s == 0) {
				System.out.println("FILE NOT FOUND");
				}
				break;
			case 5:
				System.out.println("THANK YOU USERS");
				break;
				default:
					System.out.println("YOUR INPUT NUMBER IS INCORRECT. CHOOSE THE CORRECT NUMBER");
					break;
			}
		
		System.out.println("DO YOU WANT TO CONTINUE TYPE (Y OR N) \n");
		ch = input.next().charAt(0);
	}while (ch == 'Y' || ch == 'Y');
		}
		private static void filesearch() {
			// TODO Auto-generated method stub
		}
		private static void listOfFiles() {
			System.out.println("\n LIST OF FILES AND FOLDER \n");
			
			File folder = new File ("C:\\praveen\\simplilearn project\\assignment\\");
			
			File[] listOfFiles = folder.listFiles();
			
			for (File file : listOfFiles) {
				if(file.isDirectory()) {
					System.out.println(file.getName());
				}
				else if (file.isFile()) {
					System.out.println(file.getName());
				}
			}
		}
	}




