package builder.EasyBuilder;

public class Report {
    private String header;
    private String name;
    private String content;
    private String table;
    private int pageNumber;

    public Report(Builder builder) {
        this.header = builder.header;
        this.name = builder.title;
        this.content = builder.content;
        this.table = builder.table;
        this.pageNumber = builder.pageNumber;
    }

    public String getHeader() {
        return header;
    }

    public String getTitle() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getTable() {
        return table;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    @Override
    public String toString() {
        return "Report{" +
                "Header='" + header + '\'' +
                ", Title='" + name + '\'' +
                ", Content='" + content + '\'' +
                ", Table='" + table + '\'' +
                ", PageNumber=" + pageNumber +
                '}';
    }

    static class Builder {

        private String header;
        private String title;
        private String content;
        private String table;
        private int pageNumber;


        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setTable(String table) {
            this.table = table;
            return this;
        }

        public Builder setPageNumber(int pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        public Builder(String header){ //Обязательное поле
            this.header = header;
        }

        public Report build(){
            return new Report(this);
        }

    }
}
