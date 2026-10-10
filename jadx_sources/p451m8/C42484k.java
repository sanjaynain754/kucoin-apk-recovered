package p451m8;

import java.io.IOException;
import p466n8.C42774a;

/* JADX INFO: renamed from: m8.k */
/* JADX INFO: compiled from: VP8XChunk.java */
/* JADX INFO: loaded from: classes.dex */
public class C42484k extends C42478e {

    /* JADX INFO: renamed from: g */
    public static final int f94127g = C42478e.m93167a("VP8X");

    /* JADX INFO: renamed from: d */
    public byte f94128d;

    /* JADX INFO: renamed from: e */
    public int f94129e;

    /* JADX INFO: renamed from: f */
    public int f94130f;

    /* JADX INFO: renamed from: d */
    public boolean m93170d() {
        return (this.f94128d & 16) == 16;
    }

    /* JADX INFO: renamed from: e */
    public boolean m93171e() {
        return (this.f94128d & 2) == 2;
    }

    @Override // p451m8.C42478e
    /* JADX INFO: renamed from: b */
    public void mo93162b(C42774a c42774a) throws IOException {
        this.f94128d = c42774a.peek();
        c42774a.skip(3L);
        this.f94129e = c42774a.m93722a();
        this.f94130f = c42774a.m93722a();
    }
}
