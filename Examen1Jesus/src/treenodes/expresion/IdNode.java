package treenodes.expresion;

import code_generation.ExpresionCode;

/**
 * Created by mac on 5/7/15.
 */
public  class IdNode extends ExpresionNode {
      String name;
      ExpresionNode accessor;

    public IdNode(String name) {
        this.name = name;
    }

    public IdNode(String name, ExpresionNode accessor) {
        this.name = name;
        this.accessor = accessor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExpresionNode getAccessor() {
        return accessor;
    }

    public void setAccessor(ExpresionNode accessor) {
        this.accessor = accessor;
    }

    @Override
    public ExpresionCode generateCode() {

        if(accessor == null)
            return new ExpresionCode("",name);
        ExpresionCode accesorCode = accessor.generateCode();
        return null;

    }
}
