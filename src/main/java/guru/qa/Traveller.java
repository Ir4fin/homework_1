package guru.qa;

public class Traveller {
    int age;
    double height;
    boolean canBook;

   void heightOfTraveller() {
        if (height >= 1.90) {
            System.out.println("Вам не стоит бронировать верхнюю полку!");
        }
        else {
            System.out.println("Вы можете ехать на верхней полке со скидкой!");
        }
    }

    void ageOfTraveller() {
        if (age >= 18) {
            canBook = true;
        }
        else {
            System.out.println("Несовершеннолетний не может ехать без сопровождения взрослых");
            canBook = false;
        }
    }

    void bookTicketAgreement() {
        if (canBook) {
            System.out.println("Хотите оформить поездку?");
        }
        else {
            System.out.println("Вы не можете оформить поездку");
        }
    }
}


