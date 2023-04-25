
package curriculum28_29.subprefecture;

public class Sub {
    // フィールドに変数名を定義
    private String prefecture;
    private String city;
    private double area;

    // コンストラクタを作成
    public Sub(String prefecture, String city, double area) {
        this.prefecture = prefecture;
        this.city = city;
        this.area = area;
    }

    // getterメソッド
    public String getPrefecture() {
        return this.prefecture;
    }

    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCity() {
        return this.city;
    }

    public double getArea() {
        return this.area;
    }

}
