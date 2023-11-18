Scanner scanner = new Scanner(System.in);
System.out.print("Gib einen Text ein: "); 
String benutzerEingabe = scanner.nextLine();
String sql = "SELECT spalten_name FROM meine_tabelle WHERE bedingung = ?";
preparedStatement.setString(1, benutzerEingabe); // UNION SELECT username, password FROM user --
