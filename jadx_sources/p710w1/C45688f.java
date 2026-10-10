package p710w1;

/* JADX INFO: renamed from: w1.f */
/* JADX INFO: compiled from: ByteArrayAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class C45688f implements InterfaceC45683a<byte[]> {
    @Override // p710w1.InterfaceC45683a
    /* JADX INFO: renamed from: b */
    public int mo100803b() {
        return 1;
    }

    @Override // p710w1.InterfaceC45683a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int mo100802a(byte[] bArr) {
        return bArr.length;
    }

    @Override // p710w1.InterfaceC45683a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public byte[] newArray(int i11) {
        return new byte[i11];
    }

    @Override // p710w1.InterfaceC45683a
    public String getTag() {
        return "ByteArrayPool";
    }
}
