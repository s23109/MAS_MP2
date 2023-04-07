package Kwalifikowana;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Book {
    public String name;

    public Map<Integer, Page> pages = new TreeMap<>();
    public List<Book> extent = new ArrayList<>();

    private void addExtent(Book d) {
        extent.add(d);
    }

    private void removeExtent(Book d){
        extent.remove(d);
    }

    public Book(String name) {
        this.name = name;
        addExtent(this);
    }


    public void addPage (Page page){
        if (!pages.containsKey(page.pageNum)){
            pages.put(page.pageNum, page);
            page.book=this;
        }

    }

    public Page findPage(int pagenum) throws Exception {
        if (!pages.containsKey(pagenum)){
            throw new Exception("Page not found");
        }else {
            return pages.get(pagenum);
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
