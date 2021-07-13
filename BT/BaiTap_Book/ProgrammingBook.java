package bai6_kethua.BT.BaiTap_Book;

public class ProgrammingBook extends Book {
    private String language ; //ngon ngu;
    private String framework;// cot truyen;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
    public ProgrammingBook(){};

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(String bookCode, String name,
                           int price, String author,
                           String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }


}
