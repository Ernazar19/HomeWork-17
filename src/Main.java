public class Main {
    public static void main(String[] args) {
        //TODO tapshyrma
   /*     Класс Java (name, age, gender, email) түзүңүз
        Класс Android (name, age, gender, email) түзүңүз
        Класс Go (name, age, gender, email) түзүңүз
        Жогорудагы 3 класс бир класстан мурасталсын.
        Класс Company(address, java, android, go, ownerName)
        Мейн класстан эки компания түзүңүз
        Биринчи компанияда 5 жава, 3 андроид, 2 gо программист иштесин
        Экинчи компанияда 2 жава, 1 андроид, 1 go программист иштесин
        Компанияларды консольго чыгарыңыз*/

        Java java1 = new Java("Ernazar",(byte)20,'M',"ernazar.03@icloud.com");
        Java java2 = new Java("Aizat",(byte)20,'W',"duisheeva@icloud.com");
        Java java3= new Java("Sanjar",(byte)20,'M',"san9obaiskiy@maill.com");
        Java java4= new Java("Temirlan", (byte)20 ,'M' ,"termirlan.02@maill.com");
        Java java5= new Java("Kairat",(byte) 19,'M',"kairat.9@icloud.com");
        Java java6 = new Java("Samat",(byte)45,'M',"samat@maill.com");
        Java java7 = new Java("Aikejan",(byte)45,'J',"aikejan@maill.com");
        Java[] java = {java1,java2,java3,java4,java5};
        Java[] javas ={java6,java7};

        Android android1 = new Android("Adilet",(byte)22,'M',"Adilet@maill.com");
        Android android2= new Android("Oksana",(byte)25,'W',"oksana.01@maill.com");
        Android android3 = new Android("Manas",(byte)28,'M',"manas.95@icloud.com");
        Android android4 = new Android("Abdumalik",(byte)19,'M',"abdumalik.04@maill.com");
        Android [] androids = {android1,android2,android3};
        Android[] android ={android4};

        Go go1 = new Go("Kanykei",(byte) 17,'W',"kamykey.06@maill.com");
        Go go2 = new Go("Hafiz",(byte) 19,'M',"hafiz.04@maill.com");
        Go go3 = new Go("Gulira",(byte) 30,'W',"gulira@maill.com");
        Go[] gos = {go1,go2};
        Go[] go = {go3};

        Company company1 = new Company("Orion",
                "Kyrgyzstan","Chui/Turusbekova-16",java,androids,gos);
        Company company2 = new Company("KgGroup","Kyrgyzstan",
                "Ahunbaeva-11",javas,android,go);
        Company[] companies = {company1,company2};
        for (Company d:companies) {
            System.out.println(d);
            System.out.println("*********************************************************");
        }

    }
}