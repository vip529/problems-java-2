

public class AsciiCharSequence implements CharSequence /* extends/implements */ {
    byte[] arr;

    public AsciiCharSequence(byte[] arr) {
        this.arr = arr;
    }

    @Override
    public int length() {
        return arr.length;
    }

    @Override
    public char charAt(int i) {
        return (char) arr[i];

    }

    @Override
    public AsciiCharSequence subSequence(int i, int i1) {

       return new AsciiCharSequence(java.util.Arrays.copyOfRange(arr,i,i1));
    }

    @Override
    public String toString() {
        return new String(this.arr);
    }
}