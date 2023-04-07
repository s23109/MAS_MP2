package Kwalifikowana;

import java.util.ArrayList;
import java.util.List;

public class Page {
    String chapter;
    int pageNum;
    public Book book;
    String content;

    List<Page> extent = new ArrayList<>();

    private void addExtent(Page d) {
        extent.add(d);
    }

    private void removeExtent(Page d){
        extent.remove(d);
    }

    public void showExtent(){
        for (Page d: extent) {
            System.out.println(d);
        }
    }

    public Page(String chapter, int pageNum, String content) {
        this.chapter = chapter;
        this.pageNum = pageNum;
        this.content = content;
        addExtent(this);
    }

    @Override
    public String toString() {
        return "Page{" +
                "chapter='" + chapter + '\'' +
                ", pageNum=" + pageNum +
                ", content='" + content + '\'' +
                '}';
    }
}
