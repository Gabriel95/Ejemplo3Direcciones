package treenodes.expresion;

import code_generation.ExpresionCode;

/**
 * Created by mac on 5/7/15.
 */
public    class MultiplyOperatorNode extends BinaryOperatorNode {

    public MultiplyOperatorNode(ExpresionNode leftOperand, ExpresionNode rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public ExpresionCode generateCode() {
        return null;
    }
}
