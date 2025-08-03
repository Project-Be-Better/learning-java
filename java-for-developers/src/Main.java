import com.AccessModifiers.AccessModifier;
import com.Basics.Chapter1ForLoops;
import com.Basics.Chapter2If;
import com.Basics.Chapter4AccessModifier;

public class Main {
    public static void main(String[] args) {

        Chapter1ForLoops chapter1ForLoops = new Chapter1ForLoops();
        chapter1ForLoops.run();

        Chapter2If chapter2If = new Chapter2If();
        chapter2If.run();

        Chapter4AccessModifier chapter4AccessModifier = new Chapter4AccessModifier();
        chapter4AccessModifier.run();

        AccessModifier accessModifier = new AccessModifier();
        accessModifier.revealSecret();

        // ! This cannot be accessed
        // System.out.println(accessModifier.secret);

    }
}