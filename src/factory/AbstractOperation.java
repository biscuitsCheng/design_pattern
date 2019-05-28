package factory;


import lombok.Getter;
import lombok.Setter;

/**
 * @author biscuits
 * @date 2019-05-27
 */
@Getter
@Setter
public abstract class AbstractOperation{

    protected double num1;

    protected double num2;

    public abstract double getResult();
}
