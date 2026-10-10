package mc0;

import java.util.Map;
import nc0.C42804a;

/* JADX INFO: renamed from: mc0.a */
/* JADX INFO: compiled from: HttpMessage.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC42507a {

    /* JADX INFO: renamed from: a */
    public Map<String, String> f94180a = new C42804a();

    /* JADX INFO: renamed from: b */
    public byte[] f94181b;

    /* JADX INFO: renamed from: c */
    public long f94182c;

    /* JADX INFO: renamed from: a */
    public byte[] m93207a() {
        return this.f94181b;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m93208b() {
        return this.f94180a;
    }

    /* JADX INFO: renamed from: c */
    public void m93209c(byte[] bArr) {
        this.f94181b = bArr;
    }

    /* JADX INFO: renamed from: d */
    public void m93210d(long j11) {
        this.f94182c = j11;
    }

    /* JADX INFO: renamed from: e */
    public void m93211e(Map<String, String> map) {
        this.f94180a = map;
    }
}
