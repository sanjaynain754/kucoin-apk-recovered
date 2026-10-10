package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes23.dex */
public class Rectangle {
    public int height;
    public int width;

    /* JADX INFO: renamed from: x */
    public int f2204x;

    /* JADX INFO: renamed from: y */
    public int f2205y;

    public boolean contains(int i11, int i12) {
        int i13;
        int i14 = this.f2204x;
        return i11 >= i14 && i11 < i14 + this.width && i12 >= (i13 = this.f2205y) && i12 < i13 + this.height;
    }

    public int getCenterX() {
        return (this.f2204x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f2205y + this.height) / 2;
    }

    public void grow(int i11, int i12) {
        this.f2204x -= i11;
        this.f2205y -= i12;
        this.width += i11 * 2;
        this.height += i12 * 2;
    }

    public boolean intersects(Rectangle rectangle) {
        int i11;
        int i12;
        int i13 = this.f2204x;
        int i14 = rectangle.f2204x;
        return i13 >= i14 && i13 < i14 + rectangle.width && (i11 = this.f2205y) >= (i12 = rectangle.f2205y) && i11 < i12 + rectangle.height;
    }

    public void setBounds(int i11, int i12, int i13, int i14) {
        this.f2204x = i11;
        this.f2205y = i12;
        this.width = i13;
        this.height = i14;
    }
}
