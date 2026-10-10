package p010a8;

import java.io.IOException;
import p036b8.C4503a;

/* JADX INFO: renamed from: a8.i */
/* JADX INFO: compiled from: IHDRChunk.java */
/* JADX INFO: loaded from: classes.dex */
public class C0198i extends C0193d {

    /* JADX INFO: renamed from: h */
    public static final int f598h = C0193d.m769a("IHDR");

    /* JADX INFO: renamed from: e */
    public int f599e;

    /* JADX INFO: renamed from: f */
    public int f600f;

    /* JADX INFO: renamed from: g */
    public byte[] f601g = new byte[5];

    @Override // p010a8.C0193d
    /* JADX INFO: renamed from: b */
    public void mo756b(C4503a c4503a) throws IOException {
        this.f599e = c4503a.m4311c();
        this.f600f = c4503a.m4311c();
        byte[] bArr = this.f601g;
        c4503a.read(bArr, 0, bArr.length);
    }
}
