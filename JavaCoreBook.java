package behavior.Visitor._01;

public class JavaCoreBook implements ProgramingBook {
	 
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
 
    @Override
    public String getResource() {
        return "https://github.com/gpcodervn/Java-Tutorial/";
    }
 
    public String getFavouriteBook() {
        return "The most favourite book of java core";
    }
}