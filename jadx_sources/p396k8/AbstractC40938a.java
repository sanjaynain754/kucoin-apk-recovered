package p396k8;

import com.github.penfeizhou.animation.p065io.C6952a;
import com.github.penfeizhou.animation.p065io.Reader;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: k8.a */
/* JADX INFO: compiled from: ByteBufferLoader.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC40938a implements InterfaceC40939b {
    /* JADX INFO: renamed from: b */
    public abstract ByteBuffer mo88920b();

    @Override // p396k8.InterfaceC40939b
    /* JADX INFO: renamed from: a */
    public Reader mo89709a() throws IOException {
        return new C6952a(mo88920b());
    }
}
