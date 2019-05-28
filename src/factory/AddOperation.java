package factory;

/**
 * @author biscuits
 * @date 2019-05-27
 */

public class AddOperation extends AbstractOperation {

    @Override
    public double getResult() {
        return num1+num2;
    }
}
