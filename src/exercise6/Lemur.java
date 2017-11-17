package exercise6;

<<<<<<< HEAD
import java.util.Objects;

/**
 * Class Lemur
 * @author mngonk01
 */
public class Lemur {
    String name;
    Integer age;
    private final Integer tailLength = 20;

    public Lemur(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getTailLength() {
        return tailLength;
    }

    @Override
    public String toString() {
        return "Lemur{" + "name=" + name + ", age=" + age + ", tailLength=" + tailLength + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.age);
        hash = 43 * hash + Objects.hashCode(this.tailLength);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lemur other = (Lemur) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.tailLength, other.tailLength)) {
            return false;
        }
        return true;
    }
    
    
=======
/**
 * Class Lemur
 * @author yasiro01
 */
public class Lemur {
>>>>>>> 1bdcbc89116c0a96986d2880daee73a48df9a144
}
