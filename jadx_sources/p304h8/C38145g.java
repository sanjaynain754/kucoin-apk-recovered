package p304h8;

import com.github.penfeizhou.animation.gif.p064io.GifReader;
import java.io.IOException;

/* JADX INFO: renamed from: h8.g */
/* JADX INFO: compiled from: ImageDescriptor.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38145g implements InterfaceC38140b {

    /* JADX INFO: renamed from: a */
    public int f85822a;

    /* JADX INFO: renamed from: b */
    public int f85823b;

    /* JADX INFO: renamed from: c */
    public int f85824c;

    /* JADX INFO: renamed from: d */
    public int f85825d;

    /* JADX INFO: renamed from: e */
    public byte f85826e;

    /* JADX INFO: renamed from: f */
    public C38141c f85827f;

    /* JADX INFO: renamed from: g */
    public int f85828g;

    /* JADX INFO: renamed from: h */
    public int f85829h;

    /* JADX INFO: renamed from: b */
    public boolean m86066b() {
        return (this.f85826e & 64) == 64;
    }

    /* JADX INFO: renamed from: c */
    public boolean m86067c() {
        return (this.f85826e & 128) == 128;
    }

    /* JADX INFO: renamed from: d */
    public int m86068d() {
        return 2 << (this.f85826e & 15);
    }

    @Override // p304h8.InterfaceC38140b
    /* JADX INFO: renamed from: a */
    public void mo12795a(GifReader gifReader) throws IOException {
        this.f85822a = gifReader.readUInt16();
        this.f85823b = gifReader.readUInt16();
        this.f85824c = gifReader.readUInt16();
        this.f85825d = gifReader.readUInt16();
        this.f85826e = gifReader.peek();
        if (m86067c()) {
            C38141c c38141c = new C38141c(m86068d());
            this.f85827f = c38141c;
            c38141c.mo12795a(gifReader);
        }
        this.f85828g = gifReader.peek() & 255;
        this.f85829h = gifReader.position();
        while (true) {
            byte bPeek = gifReader.peek();
            if (bPeek != 0) {
                gifReader.skip(bPeek & 255);
            } else {
                return;
            }
        }
    }
}
