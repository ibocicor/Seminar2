package src;

import src.domain.Doctor;
import src.domain.Patient;
import src.repository.Repository;
import src.service.Service;
import src.ui.UI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            Doctor d1 = new Doctor(123,"John Smith", "cardiology", "Cluj", 9.6);
            Doctor d2 = new Doctor(1, "Anna Smith", "ortopedy", "Cluj", 9.7);

            Patient p1 = new Patient("abcd", "John", 12344523);
            Patient p2 = new Patient("abcd", "Anna", 123);


            /*Repository repo = new Repository();
            Service serv = new Service(repo);
            serv.addDoctor("John Smith", "cardiology", "Cluj", 9.6);
            serv.addDoctor("Anna Smith", "ortopedy", "Cluj", 9.7);

            UI ui = new UI(serv);
            ui.run();*/
            System.out.println(p1.equals(p2));

        }
    }