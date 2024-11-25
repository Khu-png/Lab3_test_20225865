package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    // Instance variables (đặc trưng riêng cho từng DVD)
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Class variable (dùng chung cho tất cả đối tượng)
    private static int nbDigitalVideoDiscs = 0;
    // Instance variable for unique ID
    private int id;

    // Constructor với tất cả thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

        // Tăng và gán ID duy nhất
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor với title, category và cost
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;

        // Tăng và gán ID duy nhất
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Constructor chỉ với title
    public DigitalVideoDisc(String title) {
        this.title = title;

        // Tăng và gán ID duy nhất
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    // Getters cho các thuộc tính
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id; // Trả về ID duy nhất của đối tượng
    }

    // Getter cho số lượng DVD đã tạo
    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    // Setter cho title (và các setter khác nếu cần)
    public void setTitle(String title) {
        this.title = title;
    }

    // Phương thức kiểm tra DVD có khớp với tiêu đề hay không
    public boolean isMatch(String title) {
        return this.title.toLowerCase().contains(title.toLowerCase());
    }

    // Phương thức trả về thông tin DVD dưới dạng chuỗi để in ra
    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + (director != null ? director : "N/A") + " - " + length + ": " + cost + " $";
    }
}
