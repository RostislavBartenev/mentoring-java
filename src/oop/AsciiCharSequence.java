package oop;

public class AsciiCharSequence implements CharSequence {

    private byte[] data;

    public AsciiCharSequence(byte[] data) {
        this.data = data;
    }

    @Override
    public int length() {
        return data.length;
    }

    @Override
    public char charAt(int index) {
        return (char) data[index];
    }

    @Override
    public String toString() {
        return new String(data);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        int length = end - start;
        byte[] bytes = new byte[length];

        for (int i = 0, j = start; i < length; i++, j++) {
            bytes[i] = data[j];
        }
        return new AsciiCharSequence(bytes);
    }

    public CharSequence subSequence(int start) {
        return subSequence(start, data.length);
    }

    public CharSequence delete(int from, int to) {
        int length = data.length - (to - from);
        byte[] bytes = new byte[length];

        for (int i = 0, j = 0; i < data.length; i++) {
            if (i >= from && i < to) {
                continue;
            }
            bytes[j] = data[i];
            j++;
        }

        return new AsciiCharSequence(bytes);
    }
}
