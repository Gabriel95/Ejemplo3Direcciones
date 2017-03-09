package treenodes.statement;

import code_generation.ExpresionCode;
import treenodes.expresion.ExpresionNode;
import treenodes.expresion.IdNode;

/**
 * Created by mac on 5/7/15.
 */
public class AssignmentNode extends StatementNode {
    ExpresionNode value;
    IdNode id;


    public AssignmentNode(IdNode id,ExpresionNode value) {
        this.value = value;
        this.id = id;
    }

    public ExpresionNode getValue() {
        return value;
    }

    public void setValue(ExpresionNode value) {
        this.value = value;
    }

    public IdNode getId() {
        return id;
    }

    public void setId(IdNode id) {
        this.id = id;
    }

    @Override
    public String generateCode() {
        ExpresionCode valueCode = value.generateCode();
        return valueCode.getCode() +
                id.getName()+":="+valueCode.getResultVar()+"\n";
    }
}
