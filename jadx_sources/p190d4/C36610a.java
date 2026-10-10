package p190d4;

/* JADX INFO: renamed from: d4.a */
/* JADX INFO: compiled from: HashCodeUtil.java */
/* JADX INFO: loaded from: classes34.dex */
public class C36610a {
    /* JADX INFO: renamed from: b */
    public static int m81929b(Object obj, Object obj2) {
        return m81928a(obj == null ? 0 : obj.hashCode(), obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: a */
    public static int m81928a(int i11, int i12) {
        return ((i11 + 31) * 31) + i12;
    }
}
