package uf0;

import java.util.Arrays;

/* JADX INFO: renamed from: uf0.q */
/* JADX INFO: compiled from: TraceOptions.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45228q {

    /* JADX INFO: renamed from: b */
    public static final C45228q f101758b = m99929b((byte) 0);

    /* JADX INFO: renamed from: a */
    public final byte f101759a;

    /* JADX INFO: renamed from: uf0.q$b */
    /* JADX INFO: compiled from: TraceOptions.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public byte f101760a;

        public b(byte b11) {
            this.f101760a = b11;
        }

        /* JADX INFO: renamed from: a */
        public C45228q m99932a() {
            return C45228q.m99929b(this.f101760a);
        }

        /* JADX INFO: renamed from: b */
        public b m99933b(boolean z11) {
            if (z11) {
                this.f101760a = (byte) (this.f101760a | 1);
                return this;
            }
            this.f101760a = (byte) (this.f101760a & (-2));
            return this;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m99931d() {
        return m99930c(1);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C45228q) && this.f101759a == ((C45228q) obj).f101759a;
    }

    /* JADX INFO: renamed from: a */
    public static b m99928a() {
        return new b((byte) 0);
    }

    /* JADX INFO: renamed from: b */
    public static C45228q m99929b(byte b11) {
        return new C45228q(b11);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m99930c(int i11) {
        return (i11 & this.f101759a) != 0;
    }

    public int hashCode() {
        return Arrays.hashCode(new byte[]{this.f101759a});
    }

    public String toString() {
        return "TraceOptions{sampled=" + m99931d() + "}";
    }

    public C45228q(byte b11) {
        this.f101759a = b11;
    }
}
