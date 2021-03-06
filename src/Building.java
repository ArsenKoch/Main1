/**
 * Создайте абстрактный класс Building. Определите у класса свойства:
 * <p>
 * название,
 * адрес,
 * год постройки,
 * имя архитектора,
 * является ли культурным памятником.
 * Унаследуйте у от него 6 классов: Library, House, PoliceDepartment, University, ShoppingCenter, HighRiseBuilding.
 * <p>
 * Добавьте каждому классу наследнику по 2-3 свойства и 2-3 метода,
 * которые соответствовали бы тематике здания.
 * Так же необходимо во всех классах сгенерировать метод toString()
 */
public abstract class Building {
    protected String name;
    protected String address;
    protected int since;
    protected String author;
    protected boolean culturalMonument;

    Building(String name, String address, int since, String author, boolean culturalMonument) {
        this.name = name;
        this.address = address;
        this.since = since;
        this.author = author;
        this.culturalMonument = culturalMonument;
    }

    @Override
    public String toString() {
        return this.name + " " + this.address + " " + this.since + " " + this.author + " " + (this.culturalMonument ? "Yes" : "No");

    }

}

class Library extends Building implements SocialHouse {
    protected int books;
    protected int personal;

    Library() {
        super("N.Pushkina", "Karla Marksa", 2005, "Arsen K.", true);
    }

    public int getBooks() {
        return books;
    }

    public void setBooks(int books) {
        this.books = books;
    }

    public void setPersonal(int personal) {
        this.personal = personal;
    }

    public int getPersonal() {
        return personal;
    }

    void bookRead() {
        System.out.println("Read books, brothers!");
    }

    void comeToLibrary() {
        System.out.println("Come to Library, if you cool.");
    }

    @Override
    public void isCool() {
        System.out.println("It's good library , because we haven't womans. ");
    }

    @Override
    public void print4() {
        System.out.println("Boys don't read '1984'.");
    }
}

class House extends Building implements LivingHouse {
    protected int neighbour;
    protected String nameHome;

    House() {
        super("30", "16 line", 1938, "Kamov", true);
    }

    public void setNameHome(String nameHome) {
        this.nameHome = nameHome;
    }

    public String getNameHome() {
        return nameHome;
    }

    public void setNeighbour(int neighbour) {
        this.neighbour = neighbour;
    }

    public int getNeighbour() {
        return neighbour;
    }

    void hello() {
        System.out.println("Hello!");
    }

    void goodBye() {
        System.out.println("Goodbye(");
    }

    @Override
    public void rentThisPlace() {
        System.out.println("It' s living fuckin house!");
    }

    @Override
    public void print2() {
        System.out.println("Understand this ");
    }
}

class PoliceDepartment extends Building {
    protected int criminals;
    protected int guns;

    PoliceDepartment() {
        super("Sovetskaya", "Sovetskaya, 30", 2006, "Trunov D.", false);
    }

    void criminalsRobbers() {
        System.out.println("There are " + criminals + " criminals");
    }

    void criminalsKillers(int i) {
        System.out.println("We have killers - " + i);
    }

    public void setGuns(int guns) {
        this.guns = guns;
    }

    public int getGuns() {
        return guns;
    }

    public void setCriminals(int criminals) {
        this.criminals = criminals;
    }

    public int getCriminals() {
        return criminals;
    }
}

class University extends Building {
    protected int students;
    protected String nameDekan;

    University() {
        super("DSTU", "Gagarina,1", 1935, "Meshi", true);
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public String getNameDekan() {
        return nameDekan;
    }

    public void setNameDekan(String nameDekan) {
        this.nameDekan = nameDekan;
    }

    void radioUniversity() {
        System.out.println("Hello, dear students it's your dekan " + nameDekan);
    }

    void numbersStudents() {
        System.out.println("Today in DSTU studies " + students + " students.");
    }

}

class ShoppingCenter extends Building {
    ShoppingCenter() {
        super("MegaMag", "Chexova", 2015, "M.Tokarev", false);
    }

    protected int shops;
    protected int foodCourts;

    public int getShops() {
        return shops;
    }

    public void setShops(int shops) {
        this.shops = shops;
    }

    public int getFoodCourts() {
        return foodCourts;
    }

    public void setFoodCourts(int foodCourts) {
        this.foodCourts = foodCourts;
    }

    void numShops() {
        System.out.println("I go to " + shops + " shops.");
    }

    void numFoodCourts() {
        System.out.println("I eat in num FoodCourt : " + foodCourts);
    }
}

class HighRiseBuilding extends Building {
    HighRiseBuilding() {
        super("Moscow-City", "Moscow", 2015, "Oganes G.", false);
    }

    protected int floor;
    protected boolean livingWomanSex;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isLivingWomanSex() {
        return livingWomanSex;
    }

    public void setLivingWomanSex(boolean livingWomanSex) {
        this.livingWomanSex = livingWomanSex;
    }

    void hello() {
        System.out.println("Hello new living in this " + name);
    }

    void beautifulBuilding() {
        System.out.println("It's beautiful Building.");
    }
}

class Main13 {
    public static void main(String[] args) {
        Library library = new Library();
        library.setBooks(400);
        library.setPersonal(10);
        System.out.println(library);
        System.out.println("Number of books : " + library.getBooks());
        System.out.println("Number of personal : " + library.getPersonal());
        library.bookRead();
        library.comeToLibrary();
        library.isCool();
        library.print4();

        System.out.println(" ");

        House house = new House();
        house.setNameHome("Arsena House");
        house.setNeighbour(3);
        System.out.println(house);
        System.out.println("Name Home : " + house.getNameHome());
        System.out.println("Neighbour : " + house.getNeighbour());
        house.hello();
        house.goodBye();
        house.rentThisPlace();
        house.print2();

        System.out.println(" ");

        PoliceDepartment policeDepartment = new PoliceDepartment();
        policeDepartment.setCriminals(10);
        policeDepartment.setGuns(109);
        System.out.println(policeDepartment);
        System.out.println("Criminals : " + policeDepartment.getCriminals());
        System.out.println("Numbers of guns : " + policeDepartment.getGuns());
        policeDepartment.criminalsRobbers();
        policeDepartment.criminalsKillers(435);

        System.out.println(" ");

        University university = new University();
        university.setStudents(5000);
        university.setNameDekan("Meshi");
        System.out.println(university);
        System.out.println("Numbers of Students : " + university.getStudents());
        System.out.println("Name Dekan : " + university.getNameDekan());
        university.radioUniversity();
        university.numbersStudents();

        System.out.println(" ");

        ShoppingCenter shoppingCenter = new ShoppingCenter();
        shoppingCenter.setShops(123);
        shoppingCenter.setFoodCourts(46);
        System.out.println(shoppingCenter);
        System.out.println("Numbers of Shops : " + shoppingCenter.getShops());
        System.out.println("Numbers of FoodCourts : " + shoppingCenter.getFoodCourts());
        shoppingCenter.numShops();
        shoppingCenter.numFoodCourts();

        System.out.println(" ");

        HighRiseBuilding highRiseBuilding = new HighRiseBuilding();
        highRiseBuilding.setFloor(20);
        highRiseBuilding.setLivingWomanSex(true);
        System.out.println(highRiseBuilding);
        System.out.println("Nums of floor :" + highRiseBuilding.getFloor());
        System.out.println("Sex with this hor woman " + highRiseBuilding.isLivingWomanSex());
        highRiseBuilding.hello();
        highRiseBuilding.beautifulBuilding();

    }
}
