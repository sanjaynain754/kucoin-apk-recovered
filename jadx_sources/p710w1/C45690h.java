package p710w1;

/* JADX INFO: renamed from: w1.h */
/* JADX INFO: compiled from: IntegerArrayAdapter.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C45690h implements InterfaceC45683a<int[]> {
    @Override // p710w1.InterfaceC45683a
    /* JADX INFO: renamed from: b */
    public int mo100803b() {
        return 4;
    }

    @Override // p710w1.InterfaceC45683a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int mo100802a(int[] iArr) {
        return iArr.length;
    }

    @Override // p710w1.InterfaceC45683a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int[] newArray(int i11) {
        return new int[i11];
    }

    @Override // p710w1.InterfaceC45683a
    public String getTag() {
        return "IntegerArrayPool";
    }
}
