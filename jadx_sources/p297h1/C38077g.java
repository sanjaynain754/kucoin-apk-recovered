package p297h1;

/* JADX INFO: renamed from: h1.g */
/* JADX INFO: compiled from: Marker.java */
/* JADX INFO: loaded from: classes34.dex */
public class C38077g {

    /* JADX INFO: renamed from: a */
    public final String f85719a;

    /* JADX INFO: renamed from: b */
    public final float f85720b;

    /* JADX INFO: renamed from: c */
    public final float f85721c;

    /* JADX INFO: renamed from: a */
    public boolean m85977a(String str) {
        if (this.f85719a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f85719a.endsWith("\r")) {
            String str2 = this.f85719a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public C38077g(String str, float f11, float f12) {
        this.f85719a = str;
        this.f85721c = f12;
        this.f85720b = f11;
    }
}
