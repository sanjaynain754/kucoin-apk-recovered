package p304h8;

import androidx.core.view.ViewCompat;
import com.github.penfeizhou.animation.gif.p064io.GifReader;
import java.io.IOException;

/* JADX INFO: renamed from: h8.c */
/* JADX INFO: compiled from: ColorTable.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38141c implements InterfaceC38140b {

    /* JADX INFO: renamed from: a */
    public int[] f85811a;

    @Override // p304h8.InterfaceC38140b
    /* JADX INFO: renamed from: a */
    public void mo12795a(GifReader gifReader) throws IOException {
        for (int i11 = 0; i11 < this.f85811a.length; i11++) {
            byte bPeek = gifReader.peek();
            byte bPeek2 = gifReader.peek();
            int i12 = (bPeek2 & 255) << 8;
            int i13 = bPeek & 255;
            this.f85811a[i11] = i13 | i12 | ((gifReader.peek() & 255) << 16) | ViewCompat.MEASURED_STATE_MASK;
        }
    }

    /* JADX INFO: renamed from: b */
    public int[] m86060b() {
        return this.f85811a;
    }

    public C38141c(int i11) {
        this.f85811a = new int[i11];
    }
}
