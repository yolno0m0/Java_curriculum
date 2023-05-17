
package curriculum28_29.subprefecture;

public class Sub {
    // フィールドに変数名を定義
    private String prefecture;
    private String city;
    private String area;

    // コンストラクタを作成
    public Sub(String getPrefecture, String getCity, String getArea) {
        getPrefecture = this.prefecture;
        getCity = this.city;
        getArea = this.area;
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

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return this.city;
    }

    public double getArea() {
    	double dbArea = Double.parseDouble(this.area);
        return dbArea;
    }

}
