package sf0;

import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedLongs;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import uf0.AbstractC45230s;
import uf0.C45224m;
import uf0.C45225n;
import uf0.C45228q;
import xf0.AbstractC46158a;

/* JADX INFO: renamed from: sf0.a */
/* JADX INFO: compiled from: CloudTraceFormat.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C44402a extends AbstractC46158a {

    /* JADX INFO: renamed from: b */
    public static final List<String> f98086b = Collections.singletonList("X-Cloud-Trace-Context");

    /* JADX INFO: renamed from: c */
    public static final C45228q f98087c = C45228q.m99928a().m99933b(true).m99932a();

    /* JADX INFO: renamed from: d */
    public static final C45228q f98088d = C45228q.f101758b;

    /* JADX INFO: renamed from: e */
    public static final int f98089e = 3;

    /* JADX INFO: renamed from: f */
    public static final AbstractC45230s f98090f = AbstractC45230s.m99939b().m99942b();

    /* JADX INFO: renamed from: b */
    public static long m97934b(C45225n c45225n) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.put(c45225n.m99920c());
        return byteBufferAllocate.getLong(0);
    }

    @Override // xf0.AbstractC46158a
    /* JADX INFO: renamed from: a */
    public <C> void mo97935a(C45224m c45224m, C c11, AbstractC46158a.c<C> cVar) {
        Preconditions.checkNotNull(c45224m, "spanContext");
        Preconditions.checkNotNull(cVar, "setter");
        Preconditions.checkNotNull(c11, "carrier");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c45224m.m99916b().m99927c());
        sb2.append('/');
        sb2.append(UnsignedLongs.toString(m97934b(c45224m.m99915a())));
        sb2.append(";o=");
        sb2.append(c45224m.m99917c().m99931d() ? "1" : "0");
        cVar.put(c11, "X-Cloud-Trace-Context", sb2.toString());
    }
}
