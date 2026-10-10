package af0;

/* JADX INFO: renamed from: af0.c */
/* JADX INFO: compiled from: ProgressListener.java */
/* JADX INFO: loaded from: classes60.dex */
public abstract class AbstractC0303c implements InterfaceC0301a {

    /* JADX INFO: renamed from: a */
    public boolean f800a;

    /* JADX INFO: renamed from: b */
    public long f801b = 0;

    /* JADX INFO: renamed from: c */
    public long f802c = 0;

    /* JADX INFO: renamed from: d */
    public int f803d = 100;

    /* JADX INFO: renamed from: b */
    public abstract void mo1051b(long j11, long j12, float f11, float f12);

    /* JADX INFO: renamed from: c */
    public abstract void mo1052c();

    /* JADX INFO: renamed from: d */
    public abstract void mo1053d(long j11);

    @Override // af0.InterfaceC0301a
    /* JADX INFO: renamed from: a */
    public final void mo1049a(long j11, long j12, float f11) {
        if (!this.f800a) {
            mo1053d(j12);
            this.f800a = true;
        }
        if (j11 == -1 && j12 == -1 && f11 == -1.0f) {
            mo1051b(-1L, -1L, -1.0f, -1.0f);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j13 = this.f801b;
        if (jCurrentTimeMillis - j13 >= this.f803d || j11 == j12 || f11 >= 1.0f) {
            long j14 = jCurrentTimeMillis - j13;
            if (j14 == 0) {
                j14++;
            }
            mo1051b(j11, j12, f11, (j11 - this.f802c) / j14);
            this.f801b = System.currentTimeMillis();
            this.f802c = j11;
        }
        if (j11 == j12 || f11 >= 1.0f) {
            mo1052c();
        }
    }
}
