package p304h8;

import com.github.penfeizhou.animation.gif.p064io.GifReader;
import java.io.IOException;

/* JADX INFO: renamed from: h8.e */
/* JADX INFO: compiled from: DataSubBlock.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38143e implements InterfaceC38140b {

    /* JADX INFO: renamed from: c */
    public static final C38143e f85813c = new C38143e(0);

    /* JADX INFO: renamed from: a */
    public final int f85814a;

    /* JADX INFO: renamed from: b */
    public int f85815b;

    @Override // p304h8.InterfaceC38140b
    /* JADX INFO: renamed from: a */
    public void mo12795a(GifReader gifReader) throws IOException {
        gifReader.skip(this.f85814a);
    }

    /* JADX INFO: renamed from: b */
    public boolean m86062b() {
        return this == f85813c;
    }

    public C38143e(int i11) {
        this.f85814a = i11;
    }

    /* JADX INFO: renamed from: c */
    public static C38143e m86061c(GifReader gifReader) throws IOException {
        int iPeek = gifReader.peek() & 255;
        if (iPeek == 0) {
            return f85813c;
        }
        C38143e c38143e = new C38143e(iPeek);
        c38143e.f85815b = gifReader.position();
        c38143e.mo12795a(gifReader);
        return c38143e;
    }
}
