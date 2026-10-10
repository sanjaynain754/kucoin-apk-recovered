package p304h8;

import com.github.penfeizhou.animation.gif.decode.AbstractC6950a;
import com.github.penfeizhou.animation.gif.p064io.GifReader;
import java.io.IOException;

/* JADX INFO: renamed from: h8.a */
/* JADX INFO: compiled from: ApplicationExtension.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38139a extends AbstractC6950a {

    /* JADX INFO: renamed from: a */
    public int f85809a = -1;

    /* JADX INFO: renamed from: b */
    public String f85810b;

    @Override // p304h8.InterfaceC38140b
    /* JADX INFO: renamed from: a */
    public void mo12795a(GifReader gifReader) throws IOException {
        byte bPeek = gifReader.peek();
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < bPeek; i11++) {
            sb2.append((char) gifReader.peek());
        }
        String string = sb2.toString();
        this.f85810b = string;
        if ("NETSCAPE2.0".equals(string)) {
            if ((gifReader.peek() & 255) == 3 && (gifReader.peek() & 255) == 1) {
                this.f85809a = gifReader.readUInt16();
            }
            while (!C38143e.m86061c(gifReader).m86062b()) {
            }
            return;
        }
        while (!C38143e.m86061c(gifReader).m86062b()) {
        }
    }
}
