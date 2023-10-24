package src;

import src.domain.Doctor;
import src.repository.Repository;
import src.service.Service;
import src.ui.UI;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//            Doctor d1 = new Doctor("John Smith", "cardiology", "Cluj", 9.6);
//            Doctor d2 = new Doctor("Anna Smith", "ortopedy", "Cluj", 9.7);

            Repository repo = new Repository();
            Service serv = new Service(repo);
            serv.addDoctor("John Smith", "cardiology", "Cluj", 9.6);
            serv.addDoctor("Anna Smith", "ortopedy", "Cluj", 9.7);

            UI ui = new UI(serv);
            ui.run();
        }
    }