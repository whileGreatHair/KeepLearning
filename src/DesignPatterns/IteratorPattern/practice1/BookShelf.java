package DesignPatterns.IteratorPattern.practice1;

/**
 * 表示书架类。
 * 该类是作为集合存储'书'对象的，因此实现了Aggregate接口
 *
 * 优化:将原本数组改为使用ArrayList，确保当书的数量超过最初设定的数量时，仍然能继续向书架中继续添加书本。
 */
/*public class BookShelf implements Aggregate {

    private final ArrayList<Book> books;

    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new ArrayList<>(maxsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    *//**
     *w
     * @return 返回BookShelfIterator实例
     *//*
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}*/
