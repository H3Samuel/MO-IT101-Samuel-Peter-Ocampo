package main;


public class EmployeeData {
    
     public static Attendance[] getAttendance() {
        // Create and return an array of Employee objects
        Attendance[] employeeAttendance = new Attendance[50]; // Adjust the size as needed

        employeeAttendance[0] = new Attendance(10001, "Crisostomo", "Jose", "01/09/2022", "8:00", "17:00");
        employeeAttendance[1] = new Attendance(10002, "Mata", "Christian", "01/09/2022", "8:00", "17:00");
        employeeAttendance[2] = new Attendance(10003, "San Jose", "Brad", "01/09/2022", "8:00", "17:00");
        employeeAttendance[3] = new Attendance(10004, "Salcedo", "Anthony", "01/09/2022", "8:00", "17:00");
        employeeAttendance[4] = new Attendance(10005, "Romualdez", "Alice", "01/09/2022", "8:00", "17:00");
        employeeAttendance[5] = new Attendance(10006, "Atienza", "Rosie", "01/09/2022", "8:00", "17:00");
        employeeAttendance[6] = new Attendance(10007, "Farala", "Martha", "01/09/2022", "8:27", "17:00");
        employeeAttendance[7] = new Attendance(10008, "Martinez", "Leila", "01/09/2022", "8:01", "17:00");
        employeeAttendance[8] = new Attendance(10009, "San Jose", "Allison", "01/09/2022", "8:05", "17:00");
        employeeAttendance[9] = new Attendance(10010, "Rosario", "Cydney", "01/09/2022", "8:00", "17:00");
        employeeAttendance[10] = new Attendance(10011, "Lopez", "Josie", "01/09/2022", "8:00", "17:00");
        employeeAttendance[11] = new Attendance(10012, "De Leon", "Selena", "01/09/2022", "8:00", "17:00");
        employeeAttendance[12] = new Attendance(10013, "Romualdez", "Fredrick", "01/09/2022", "8:00", "17:00");
        employeeAttendance[13] = new Attendance(10014, "Bautista", "Mark", "01/09/2022", "8:00", "17:00");
        employeeAttendance[14] = new Attendance(10015, "Lazaro", "Darlene", "01/09/2022", "8:00", "17:00");
        employeeAttendance[15] = new Attendance(10016, "Delos Santos", "Kolby", "01/09/2022", "8:28", "17:00");
        employeeAttendance[16] = new Attendance(10017, "Santos", "Vella", "01/09/2022", "8:00", "17:00");
        employeeAttendance[17] = new Attendance(10018, "Del Rosario", "Tomas", "01/09/2022", "8:00", "17:00");
        employeeAttendance[18] = new Attendance(10019, "Tolentino", "Jacklyn", "01/09/2022", "8:00", "17:00");
        employeeAttendance[19] = new Attendance(10020, "Gutierrez", "Percival", "01/09/2022", "8:00", "17:00");
        employeeAttendance[20] = new Attendance(10021, "Manalaysay", "Garfield", "01/09/2022", "8:11", "17:00");
        employeeAttendance[21] = new Attendance(10022, "Villegas", "Lizeth", "01/09/2022", "8:00", "17:00");
        employeeAttendance[22] = new Attendance(10023, "Ramos", "Carol", "01/09/2022", "8:00", "17:00");
        employeeAttendance[23] = new Attendance(10024, "Maceda", "Emelia", "01/09/2022", "8:21", "17:00");
        employeeAttendance[24] = new Attendance(10025, "Aguilar", "Delia", "01/09/2022", "8:00", "17:00");
        employeeAttendance[25] = new Attendance(10002, "Mata", "Christian", "02/09/2022", "8:00", "17:00");
        employeeAttendance[26] = new Attendance(10003, "San Jose", "Brad", "02/09/2022", "8:00", "17:00");
        employeeAttendance[27] = new Attendance(10004, "Salcedo", "Anthony", "02/09/2022", "8:00", "17:00");
        employeeAttendance[28] = new Attendance(10005, "Romualdez", "Alice", "02/09/2022", "8:00", "17:00");
        employeeAttendance[29] = new Attendance(10006, "Atienza", "Rosie", "02/09/2022", "8:00", "17:00");
        employeeAttendance[30] = new Attendance(10007, "Farala", "Martha", "02/09/2022", "8:00", "17:00");
        employeeAttendance[31] = new Attendance(10008, "Martinez", "Leila", "02/09/2022", "8:00", "17:00");
        employeeAttendance[32] = new Attendance(10009, "San Jose", "Allison", "02/09/2022", "8:00", "17:00");
        employeeAttendance[33] = new Attendance(10010, "Rosario", "Cydney", "02/09/2022", "8:00", "17:00");
        employeeAttendance[34] = new Attendance(10011, "Lopez", "Josie", "02/09/2022", "8:00", "17:00");
        employeeAttendance[35] = new Attendance(10012, "De Leon", "Selena", "02/09/2022", "8:00", "17:00");
        employeeAttendance[36] = new Attendance(10013, "Romualdez", "Fredrick", "02/09/2022", "8:00", "17:00");
        employeeAttendance[37] = new Attendance(10014, "Bautista", "Mark", "02/09/2022", "8:00", "17:00");
        employeeAttendance[38] = new Attendance(10015, "Lazaro", "Darlene", "02/09/2022", "8:00", "17:00");
        employeeAttendance[39] = new Attendance(10016, "Delos Santos", "Kolby", "02/09/2022", "8:00", "17:00");
        employeeAttendance[40] = new Attendance(10017, "Santos", "Vella", "02/09/2022", "8:00", "17:00");
        employeeAttendance[41] = new Attendance(10018, "Del Rosario", "Tomas", "02/09/2022", "8:00", "17:00");
        employeeAttendance[42] = new Attendance(10019, "Tolentino", "Jacklyn", "02/09/2022", "8:00", "17:00");
        employeeAttendance[43] = new Attendance(10020, "Gutierrez", "Percival", "02/09/2022", "8:00", "17:00");
        employeeAttendance[44] = new Attendance(10021, "Manalaysay", "Garfield", "02/09/2022", "8:00", "17:00");
        employeeAttendance[45] = new Attendance(10022, "Villegas", "Lizeth", "02/09/2022", "8:00", "17:00");
        employeeAttendance[46] = new Attendance(10023, "Ramos", "Carol", "02/09/2022", "8:00", "17:00");
        employeeAttendance[47] = new Attendance(10024, "Maceda", "Emelia", "02/09/2022", "8:00", "17:00");
        employeeAttendance[48] = new Attendance(10025, "Aguilar", "Delia", "02/09/2022", "8:00", "17:00");
        employeeAttendance[49] = new Attendance(10001, "Crisostomo", "Jose", "05/09/2022", "8:00", "17:00");

        return employeeAttendance;
    }
    public static Employee[] getEmployees() {
        // Create and return an array of Employee objects
        Employee[] employees = new Employee[34]; // Adjust the size as needed

        // Populate the array with employee data
        employees[0] = new Employee( 01, "(Garcia)","(Manuel III)","(10/11/1983)", "(Valero Carpark Building Valero Street 1227, Makati City)", "(966-860-270)", "(44-4506057-3)", "(820126853951)", "(442-605-657-000)", "(691295330870)", "(Regular)", "(Chief Executive Officer)", "(N/A)","" ,90000, 1500.0, 2000.0, 1000.0, 45000.0, 535.71);
        employees[1] = new Employee( 02, "(Lim)", "(Antonio) ", "(06/19/1988)", "(San Antonio De Padua 2, Block 1 Lot 8 and 2, Dasmarinas, Cavite)", " (171-867-411)", "(52-2061274-9)", "(331735646338)", " (683-102-776-000)", "(663904995411)", "(Regular)", "(Chief Operating Officer)", "(Garcia, Manuel III)", "", 60000, 1500.0, 2000.0, 1000.0, 30000.0, 357.14);
        employees[2] = new Employee( 03, "(Aquino)", "(Bianca Sofia) ", "(08/04/1989)", "(Rm. 402 4/F Jiao Building Timog Avenue Cor. Quezon Avenue 1100, Quezon City)", "(966-889-370)", "(30-8870406-2)", "(177451189665)","(971-711-280-000)", "(171519773969)", "(Regular)", "(Chief Finance Officer)","(Garcia, Manuel III)", "", 60000, 1500.0, 2000.0, 1000.0, 30000.0, 357.14);
        employees[3] = new Employee( 04, "(Reyes)", " (Isabella) ", "(06/16/1994)", " (460 Solanda Street Intramuros 1000, Manila)", "(786-868-477)", "(40-2511815-0)", "(341911411254)", "(876-809-437-000)", "(416946776041)", "(Regular)", "(Chief Marketing Officer)", "(Garcia, Manuel III)", "",60000, 1500.0, 2000.0, 1000.0, 30000.0, 357.14);
        employees[4] = new Employee( 05, "(Hernandez)", "(Eduard) ", "(09/23/1989)", " (National Highway, Gingoog,  Misamis Occidental)", "(088-861-012)", "(50-5577638-1)", "(957436191812)", "(031-702-374-000)", "(952347222457)", "(Regular)", "(IT Operations and Systems)", "(Lim, Antonio)","", 52670, 1500.0, 1000.0, 1000.0, 26335.0,313.51);
        employees[5] = new Employee( 06,"Villanueva","Andrea Mae","02/14/1988", "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands ", "918-621-603", "49-1632020-8", "382189453145", "317-674-022-000", "441093369646", "Regular", "HR Manager", "Lim, Antonio","" ,52670, 1500.0, 1000.0, 1000.0, 26335.0, 313.51);
        employees[6] = new Employee( 07,"(San Jose)", "(Brad ) ", "(03/15/1996)", "(99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi)", " (797-009-261)", "(40-2400714-1", "(239192926939)", " (672-474-690-000)", "(210850209964)", "(Regular)", "(HR Team Leader)", "(Villanueva, Andrea Mae)", "", 42975, 1500.0, 800.0, 800.0, 21488.0, 255.80);
        employees[7] = new Employee(8, "(Romualdez)", "(Alice)", "(05/14/1992)", "12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte", "(983-606-799)", "(55-4476527-2)", "(545652640232)", "(888-572-294-000)", "(211385556888)", "Regular", "HR Rank and File", "San Jose Brad", "", 22500, 1500.0, 500.0, 500.0, 1250.0, 133.93);
        employees[8] = new Employee(9, "(Atienza)", "(Rosie)", "(09/24/1948)", "90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte", "(266-036-427)", "(41-0644692-3)", "(708988234853)", "(604-997-793-000)", "(260107732354)", "Regular", "HR Rank and File", "San Jose Brad", "", 22500, 1500.0, 500.0, 500.0, 11250.0, 133.93);
        employees[9] = new Employee(10, "(Alvaro)", "(Roderick)", "(03/30/1988)", "#284 T. Morato corner, Scout Rallos Street, Quezon City", "(053-381-386)", "(64-7605054-4)", "(578114853194)", "(525-420-419-000)", "(799254095212)", "Regular", "Accounting Head Aquino", "Bianca Sofia", "", 52670, 1500.0, 1000.0, 1000.0, 26335.0, 313.51);
        employees[10] = new Employee(11, "(Salcedo)", "(Anthony)", "(09/14/1993)", "93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate", "(070-766-300)", "(26-9647608-3)", "(126445315651)", "(210-805-911-000)", "(218002473454)", "Regular", "Payroll Manager", "Alvaro, Roderick", "", 50825, 1500.0, 1000.0, 1000.0, 25413.0, 302.53);
        employees[11] = new Employee( 12,"(Lopez)", "(Josie	) ", "(01/14/1987)", "(49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro)", " (478-355-427)", "(44-8563448-3)", "(431709011012)", " (218-489-737-000)", "(113071293354)", "(Regular)", "(Payroll Team Leader)", "(Salcedo, Anthony)", "", 38475, 1500.0, 800.0, 800.0, 19238.0, 229.02);
        employees[12] = new Employee( 13,"(Farala)", "(Martha) ", "(01/11/1942)", "(42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte)", "(329-034-366)", "(45-5656375-0)", "(233693897247)","(210-835-851-000)", "(631130283546)", "(Regular)", "(Payroll Rank and File)","(Salcedo, Anthony)", "", 24000, 1500.0, 500.0, 500.0, 12000.0, 142.86);
        employees[13] = new Employee( 14,"(Martinez)", " (Leila) ", "(07/11/1970)", " (37/46 Kulas Roads, Maragondon 0962 Quirino)", "(877-110-749)", "(27-2090996-4)", "(515741057496)", "(275-792-513-000)", "(101205445886)", "(Regular)", "(Payroll Rank and File)", "(Salcedo, Anthony)", "", 24000, 1500.0, 500.0, 500.0, 12000.0, 142.86);
        employees[14] = new Employee( 15,"(Romualdez)", "(Fredrick) ", "(03/10/1985)", " (22A/52 Lubowitz Meadows, Pililla 4895 Zambales)", "(023-079-009)", "(26-8768374-1)", "(308366860059)", "(598-065-761-000)", "(223057707853)", "(Regular)", "(Account Manager)", "(Lim, Antonio)", "", 53500, 1500.0, 1000.0, 1000.0, 26750.0, 318.45);
        employees[15] = new Employee( 16,"(Mata)","(Christian)","(10/21/1987)", "(90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu)", "(783-776-744)", "(49-2959312-6)", "(824187961962)", "(103-100-522-000)", "(631052853464)", "(Regular)", "(Account Team Leader)", "(Romualdez, Fredrick)", "",42975, 1500.0, 800.0, 800.0, 21488.0, 255.80);
        employees[16] = new Employee( 17,"(De Leon)", "(Selena) ", "(02/20/1975)", "(89A Armstrong Trace, Compostela 7874 Maguindanao)", " (975-432-139)", "(27-2090208-8)", "(587272469938)", " (482-259-498-000)", "(719007608464)", "(Regular)", "(Account Team Leader)", "(Romualdez, Fredrick)", "", 41850, 1500.0, 800.0, 800.0, 20925.0, 249.11);
        employees[17] = new Employee( 18,"(San Jose)", "(Allison) ", "(06/24/1986)", "(08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union)", "(179-075-129)", "(45-3251383-0)", "(745148459521)","(121-203-336-000)", "(114901859343)", "(Regular)", "(Account Rank and File)","(Mata, Christian)", "", 22500, 1500.0, 500.0, 500.0, 11250.0, 133.93);
        employees[18] = new Employee( 19,"(Rosario)", " (Cydney) ", "(10/06/1996)", " (93A/21 Berge Points, Tapaz 2180 Quezon)", "(868-819-912)", "(49-1629900-2)", "(579253435499)", "(122-244-511-000)", "(265104358643)", "(Regular)", "(Account Rank and File)", "(Mata, Christian)", "", 22500, 1500.0, 500.0, 500.0, 11250.0, 133.93);
        employees[19] = new Employee( 20,"(Bautista)", "(Mark) ", "(02/12/1991)", " (65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino)", "(683-725-348)", "(49-1647342-5)", "(399665157135)", "(273-970-941-000)", "(260054585575)", "(Regular)", "(Account Rank and File)", "(Mata, Christian)", "", 23250 , 1500.0, 500.0, 500.0, 11625.0, 138.39);
        employees[20] = new Employee( 21,"(Lazaro)","(Darlene )","(11/25/1985)", "(47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino)", "(740-721-558)", "(45-5617168-2)", "(606386917510)", "(354-650-951-000)", "(104907708845)", "(Probationary)", "(Account Rank and File)", "(N/A)","" ,90000, 1500.0, 2000.0, 1000.0, 45000.0, 535.71);
        employees[21] = new Employee( 22, "(Delos Santos)", "(Kolby) ", "(02/26/1980)", "(06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur)", " (739-443-033)", "(52-0109570-6)", "(357451271274)", " (187-500-345-000)", "(113017988667)", "(Probationary)", "(Account Rank and File)", "(Mata, Christian)", "", 24000, 1500.0, 500.0, 500.0, 12000.0, 142.86);
        employees[22] = new Employee( 23, "(Santos)", "(Vella) ", "(12/31/1983)", "(99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur)", "(955-879-269)", "(52-9883524-3)", "(548670482885)","(101-558-994-000)", "(360028104576)", "(Probationary)", "(Account Rank and File)","(Mata, Christian)", "", 22500, 1500.0, 500.0, 500.0, 11250.0, 133.93);
        employees[23] = new Employee( 24,"(Del Rosario)", " (Tomas) ", "(12/18/1978)", " (80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque)", "(882-550-989)", "(45-5866331-6)", "(953901539995)", "(560-735-732-000)", "(913108649964)", "(Probationary)", "(Account Rank and File)", "(Mata, Christian)", "", 22500, 1500.0, 500.0, 500.0, 11250.0, 133.93);
        employees[24] = new Employee(25, "(Tolentino)", "(Jacklyn)", "(05/19/1984)", "(96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao)", "(675-757-366)", "(47-1692793-0)", "(753800654114)", "(841-177-857-000)", "(210546661243)", "(Probationary)", "(Account Rank and File)", "(De Leon, Selena)", "", 24000, 1500.0, 1000.0, 1000.0, 26_335.0, 313.51);
        employees[25] = new Employee(26, "(Gutierrez)", "(Percival)", "(12/18/1970)", "(58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur)", "(512-899-876)", "(40-9504657-8)", "(797639382265)", "(502-995-671-000)", "(210897095686)", "(Probationary)", "(Account Rank and File)", "(De Leon, Selena)", "", 24750, 1500.0, 500.0, 500.0, 12_375.0, 147.32);
        employees[26] = new Employee(27, "(Manalaysay)", "(Garfield)", "(08/28/1986)", "(60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur)", "(948-628-136)", "(45-3298166-4)", "(810909286264)", "(336-676-445-000)", "(211274476563)", "(Probationary)", "(Account Rank and File)", "(De Leon, Selena)", "", 24_750, 1500.0, 500.0, 500.0, 12_375.0, 147.32);
        employees[27] = new Employee(28, "(Villegas)", "(Lizeth)", "(12/12/1981)", "(66/77 Mann Views, Luisiana 1263 Dinagat Islands)", "(332-372-215)", "(40-2400719-4)", "(934389652994)", "(210-395-397-000)", "(122238077997)", "(Probationary)", "(Account Rank and File)", "(De Leon, Selena)", "", 24_000, 1500.0, 500.0, 500.0, 12_000.0, 142.86);
        employees[28] = new Employee(29, "(Ramos)", "(Carol)", "(08/20/1978)", "(72/70 Stamm Spurs, Bustos 4550 Iloilo)", "(250-700-389)", "(60-1152206-4)", "(351830469744)", "(395-032-717-000)", "(212141893454)", "(Probationary)", "(Account Rank and File)", "(De Leon, Selena)", "", 22_500, 1500.0, 500.0, 500.0, 11_250.0, 133.93);
        employees[29] = new Employee( 30,"(Maceda)", "(Emelia ) ", "(04/14/1973)", " (50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija)", "(973-358-041)", "(54-1331005-0)", "(465087894112)", "(215-973-013-000)", "(515012579765)", "(Probationary)", "(Account Rank and File)", "(De Leon, Selena)","", 22500, 1500.0, 500.0, 500.0, 11250.0, 133.93);
        employees[30] = new Employee( 31,"(Aguilar)", "(Delia  ) ", "(01/27/1989)", " (95 Cremin Junction, Surallah 2809 Cotabato)", "(529-705-439)", "(52-1859253-1)", "(136451303068)", "(599-312-588-000)", "(110018813465)", "(Probationary)", "(Account Rank and File)", "(De Leon, Selena)","", 22500, 1500.0, 500.0, 500.0, 11250.0, 133.93);
        employees[31] = new Employee( 32,"(Castro)", "(John Rafael ) ", "(02/09/1992)", " (Hi-way, Yati, Liloan Cebu)", "(332-424-955 )", "(26-7145133-4)", "(601644902402)", "(404-768-309-000)", "(697764069311)", "(Regular)", "(Sales & Marketing)", "(Reyes, Isabella)", "", 52670, 1500.0, 1000.0, 1000.0, 26335.0, 313.51);
        employees[32] = new Employee( 33,"(Martinez)", "(Carlos Ian  ) ", "(11/16/1990)", " (Bulala, Camalaniugan)", "(078-854-208 )", "(11-5062972-7)", "(380685387212)", "(256-436-296-000)", "(993372963726)", "(Regular)", "(Supply Chain and Logistics)", "(Reyes, Isabella)","", 52670, 1500.0, 1000.0, 1000.0, 26335.0, 313.51);
        employees[33] = new Employee( 34,"(Santos)", "(Beatriz ) ", "(08/07/1990)", " (Agapita Building, Metro Manila)", "(526-639-511)", "(20-2987501-5)", "(918460050077)", "(911-529-713-000)", "(874042259378)", "(Regular)", "(Customer Service and Relations)", "(Reyes, Isabella)", "", 52670, 1500.0, 1000.0, 1000.0, 26335.0, 313.51);
        
        
        return employees;

    }
}


