package p451m8;

import com.github.penfeizhou.animation.webp.decode.WebPParser;
import java.io.IOException;
import p466n8.C42774a;

/* JADX INFO: renamed from: m8.c */
/* JADX INFO: compiled from: ANMFChunk.java */
/* JADX INFO: loaded from: classes.dex */
public class C42476c extends C42478e {

    /* JADX INFO: renamed from: m */
    public static final int f94103m = C42478e.m93167a("ANMF");

    /* JADX INFO: renamed from: d */
    public int f94104d;

    /* JADX INFO: renamed from: e */
    public int f94105e;

    /* JADX INFO: renamed from: f */
    public int f94106f;

    /* JADX INFO: renamed from: g */
    public int f94107g;

    /* JADX INFO: renamed from: h */
    public int f94108h;

    /* JADX INFO: renamed from: i */
    public byte f94109i;

    /* JADX INFO: renamed from: j */
    public C42474a f94110j;

    /* JADX INFO: renamed from: k */
    public C42482i f94111k;

    /* JADX INFO: renamed from: l */
    public C42483j f94112l;

    /* JADX INFO: renamed from: d */
    public boolean m93163d() {
        return (this.f94109i & 2) == 2;
    }

    /* JADX INFO: renamed from: e */
    public boolean m93164e() {
        return (this.f94109i & 1) == 1;
    }

    @Override // p451m8.C42478e
    /* JADX INFO: renamed from: b */
    public void mo93162b(C42774a c42774a) throws IOException {
        int iAvailable = c42774a.available();
        this.f94104d = c42774a.m93725d();
        this.f94105e = c42774a.m93725d();
        this.f94106f = c42774a.m93722a();
        this.f94107g = c42774a.m93722a();
        this.f94108h = c42774a.m93725d();
        this.f94109i = c42774a.peek();
        long j11 = iAvailable - this.f94121b;
        while (c42774a.available() > j11) {
            C42478e c42478eM12805c = WebPParser.m12805c(c42774a);
            if (c42478eM12805c instanceof C42474a) {
                this.f94110j = (C42474a) c42478eM12805c;
            } else if (c42478eM12805c instanceof C42482i) {
                this.f94111k = (C42482i) c42478eM12805c;
            } else if (c42478eM12805c instanceof C42483j) {
                this.f94112l = (C42483j) c42478eM12805c;
            }
        }
    }
}
