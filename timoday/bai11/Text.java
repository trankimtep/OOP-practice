package timoday.bai11;


public class Text {
    private String string;

    public Text () {}

    public Text (String string) {
        this.string = string;
    }

    public String getString () {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int countWord() {
        String [] arr = string.trim().replaceAll("\\s+", " ").split(" ");
        return arr.length;
    }

    public int coutHCharacter () {
        String tem = string.toLowerCase();
        int result = 0;
        for (int i = 0; i < tem.length(); i++){
            if (tem.charAt(i) == 'h') {
                result ++;
            }
        }
        return result;
    }

    public String standardized () {
        return string.trim().replaceAll("\\s+", " ");
    }

}
