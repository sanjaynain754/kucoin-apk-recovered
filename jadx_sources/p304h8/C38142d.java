package p304h8;

import com.github.penfeizhou.animation.gif.decode.AbstractC6950a;
import com.github.penfeizhou.animation.gif.p064io.GifReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: h8.d */
/* JADX INFO: compiled from: CommentExtension.java */
/* JADX INFO: loaded from: classes45.dex */
public class C38142d extends AbstractC6950a {

    /* JADX INFO: renamed from: a */
    public List<C38143e> f85812a = new ArrayList();

    @Override // p304h8.InterfaceC38140b
    /* JADX INFO: renamed from: a */
    public void mo12795a(GifReader gifReader) throws IOException {
        while (true) {
            C38143e c38143eM86061c = C38143e.m86061c(gifReader);
            if (!c38143eM86061c.m86062b()) {
                this.f85812a.add(c38143eM86061c);
            } else {
                return;
            }
        }
    }
}
