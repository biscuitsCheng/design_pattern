package factory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author biscuits
 * @date 2019-05-27
 *
 * 运算对象工厂
 */

public class OperationFactory {

    private static ConcurrentHashMap<String, AbstractOperation> operationObjectPool = new ConcurrentHashMap<>(8);


    public static AbstractOperation getOpreation(String operationType) {
        /**
         * 是否应生成
         */
        if (operationObjectPool.containsKey(operationType)) {
            return operationObjectPool.get(operationType);
        }

        switch (operationType) {
            case "+":
                AddOperation addOperation = new AddOperation();
                operationObjectPool.put("+", addOperation);
                return addOperation;
            default:
                SubtractOperation subtractOperation = new SubtractOperation();
                operationObjectPool.put("-", subtractOperation);
                return subtractOperation;
        }
    }
}
