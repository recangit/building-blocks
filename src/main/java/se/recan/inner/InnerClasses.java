package se.recan.inner;

import java.util.List;
import se.recan.utils.IOutil;

/**
 * Static member class. Static members of the outer class are visible to the
 * static inner class, what ever their access level be. Non-static members of
 * the outer class are not available, because there is not instance of the outer
 * class. An inner class may not have static members unless the inner class is
 * itself marked as static. Sometimes static nested class are not refered to as
 * inner class at all, as they don't require outer classes instance. A static
 * inner class is just like any other inner class, but it dose not have the
 * reference to its outer class object that generated it.
 *
 * Inner/Member class The outer class (the class containing the inner class) can
 * instantiate as many number of inner class objects as it wishes, inside it's
 * code. If the inner class is public & the containing class as well, then code
 * in some other unrelated class can as well create an instance of the inner
 * class.
 *
 * Inner local class. Local classes are never declared with an access specifier
 * (that is, public or private). Their scope is always restricted to the block
 * in which they are declared. Local classes have a great advantage: they are
 * completely hidden from the outside world. They can not only access the
 * instance variables but local variables of the method (in which they are
 * defined) as well, but the local varible has to be declared final.
 *
 * Anonymous Inner Classes Here, SuperType can be an interface, such as
 * ActionListener; then, the inner class implements that interface. Or SuperType
 * can be a class; then, the inner class extends that class. An anonymous inner
 * class cannot have constructors because the name of a constructor must be the
 * same as the name of a class, and the class has no name. Instead, the
 * construction parameters are given to the superclass constructor. In
 * particular, whenever an inner class implements an interface, it cannot have
 * any construction parameters. Nevertheless, you must supply a set of
 * parentheses as in
 *
 * Created: 2010-11-08 Last Modified: 2010-11-08
 *
 * @author Anders Recksén (anders[at]recksen[dot]se)
 */
public class InnerClasses {

    private static final String staticMemberClass = "Static Member Class";
    private final String memberClass = "Member Class";
    public static String innerLocalClass = "Inner Local Klass";

    // Inre klasser måste alltid vara knutna till en yttre klass.
    public InnerClasses() {
        IOutil.info(this);

        StaticMember smc = new StaticMember();
        smc.print();
        MemberClass mc = new MemberClass();
        mc.print();
        toWork();
    }

    private void toWork() {
        class Inner {

            void print() {
                System.out.println("I'm a " + innerLocalClass + ". I must be accessed from the sourrounding method.");
            }
        }
        Inner inner = new Inner();
        inner.print();
    }

    private static class StaticMember {

        private void print() {
            System.out.println("I'm a " + staticMemberClass);
        }
    }

    private class MemberClass {

        public void print() {
            System.out.println("I'm a " + memberClass);
        }
    }

    public static void main(String args[]) {
        new InnerClasses();

        Outer mo = new Outer();
        Outer.Inner inner = mo.new Inner();
        inner.displayValue();
    }
}
