package kc0;

/* JADX INFO: renamed from: kc0.a */
/* JADX INFO: compiled from: Attempt.java */
/* JADX INFO: loaded from: classes2.dex */
public class C40984a {

    /* JADX INFO: renamed from: a */
    public final boolean f91068a;

    /* JADX INFO: renamed from: b */
    public final String f91069b;

    /* JADX INFO: renamed from: c */
    public final String f91070c;

    /* JADX INFO: renamed from: d */
    public final String f91071d;

    /* JADX INFO: renamed from: e */
    public final long f91072e;

    /* JADX INFO: renamed from: a */
    public String m89764a() {
        return this.f91070c;
    }

    /* JADX INFO: renamed from: b */
    public String m89765b() {
        return this.f91071d;
    }

    /* JADX INFO: renamed from: c */
    public boolean m89766c() {
        return this.f91068a;
    }

    public String toString() {
        return "Attempt{success=" + this.f91068a + ", requestId='" + this.f91069b + "', errorCode='" + this.f91070c + "', errorMessage='" + this.f91071d + "', timestampMs=" + this.f91072e + '}';
    }

    public C40984a(boolean z11, String str, String str2, String str3, long j11) {
        this.f91068a = z11;
        this.f91069b = str;
        this.f91070c = str2;
        this.f91071d = str3;
        this.f91072e = j11;
    }
}
