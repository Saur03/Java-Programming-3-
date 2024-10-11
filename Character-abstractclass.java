// Public abstract class Character
public abstract class Character {
    private String name = "";  // Default value is an empty string
    private int id = 0;        // Default value is 0

    // Constructor for 'name' only
    public Character(String name) {
        this.name = name;
    }

    // Getter for 'id'
    public int getId() {
        return id;
    }

    // Setter for 'id'
    public void setId(int id) {
        this.id = id;
    }

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void communicate(); // Now prints the communication message
    public abstract void useSkills();   // Now prints the skill message

    // toString method (can be used in subclasses)
    @Override
    public String toString() {
        return "Character [ID: " + id + ", Name: " + name + "]";
    }
}

// Public class Game extending Character
public class Game extends Character {

    // Constructor for Game class (uses name only)
    public Game(String name) {
        super(name);  // Call parent class constructor
    }

    // Implementing abstract method communicate (prints directly)
    @Override
    public void communicate() {
        System.out.println(getName() + " says: 'Let's play the game!'");
    }

    // Implementing abstract method useSkills (prints directly)
    @Override
    public void useSkills() {
        System.out.println(getName() + " uses special gaming skills!");
    }

    // Method to invoke communicate and useSkills
    public void printMessages() {
        communicate();
        useSkills();
    }

    // Overriding toString() method in Game class
    @Override
    public String toString() {
        return "Game Player [ID: " + getId() + ", Name: " + getName() + "]";
    }
}

// Main class to test the Game class
public class Main {
    public static void main(String[] args) {
        // Creating an object of Game class with default values
        Game player = new Game("Player1");
        player.setId(101); // Setting ID using setter

        // Printing the messages
        player.printMessages();

        // Printing the toString() output
        System.out.println(player.toString());
    }
}
