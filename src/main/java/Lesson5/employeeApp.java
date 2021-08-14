package Lesson5;

public class employeeApp {
    public static void main(String[] args) {
//        employee employee1 = new employee("Иванов Иван Иванович", "Директор", "iv@mail.ru", 678, 45, 250000);
//        employee1.info();
        employee[] empArr = new employee[5];
        empArr[0] = new employee("Иванов Иван Иванович", "Директор", "iv@mail.ru", 678, 250000, 45);
        empArr[1] = new employee("Иванов Петр Иванович", "зам.Директор", "pe@mail.ru", 679, 245000, 43);
        empArr[2] = new employee("Иванов Сергей Иванович", "зам.зам.Директор", "se@mail.ru", 671, 240000, 41);
        empArr[3] = new employee("Иванов Николай Иванович", "зам.зам.зам.Директор", "ni@mail.ru", 672, 235000, 40);
        empArr[4] = new employee("Иванов Евгений Иванович", "зам.зам.зам.зам.Директор", "ev@mail.ru", 673, 230000, 39);

        for (int i = 0; i < empArr.length; i++){
            if (empArr[i].age > 40) {
                System.out.println(empArr[i].name + ", " + empArr[i].position + ", " + empArr[i].mail + ", " + empArr[i].cell + ", " + empArr[i].salary + ", " + empArr[i].age);
            }
        }

    }
}
