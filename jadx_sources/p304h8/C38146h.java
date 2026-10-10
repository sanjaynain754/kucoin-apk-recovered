package p304h8;

import com.github.penfeizhou.animation.gif.p064io.GifReader;
import java.io.IOException;

/* JADX INFO: renamed from: h8.h */
/* JADX INFO: compiled from: LogicalScreenDescriptor.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38146h implements InterfaceC38140b {

    /* JADX INFO: renamed from: a */
    public int f85830a;

    /* JADX INFO: renamed from: b */
    public int f85831b;

    /* JADX INFO: renamed from: c */
    public byte f85832c;

    /* JADX INFO: renamed from: d */
    public byte f85833d;

    /* JADX INFO: renamed from: e */
    public byte f85834e;

    /* JADX INFO: renamed from: b */
    public boolean m86069b() {
        return (this.f85832c & 128) == 128;
    }

    /* JADX INFO: renamed from: c */
    public int m86070c() {
        return 2 << (this.f85832c & 7);
    }

    @Override // p304h8.InterfaceC38140b
    /* JADX INFO: renamed from: a */
    public void mo12795a(GifReader gifReader) throws IOException {
        this.f85830a = gifReader.readUInt16();
        this.f85831b = gifReader.readUInt16();
        this.f85832c = gifReader.peek();
        this.f85833d = gifReader.peek();
        this.f85834e = gifReader.peek();
    }
}
