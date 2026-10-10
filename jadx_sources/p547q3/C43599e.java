package p547q3;

import android.net.Uri;
import p712w3.C45708h;

/* JADX INFO: renamed from: q3.e */
/* JADX INFO: compiled from: SimpleCacheKey.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43599e implements InterfaceC43595a {

    /* JADX INFO: renamed from: a */
    public final String f96249a;

    /* JADX INFO: renamed from: b */
    public final boolean f96250b;

    public C43599e(String str) {
        this(str, false);
    }

    public C43599e(String str, boolean z11) {
        this.f96249a = (String) C45708h.m100896g(str);
        this.f96250b = z11;
    }

    @Override // p547q3.InterfaceC43595a
    /* JADX INFO: renamed from: a */
    public String mo8758a() {
        return this.f96249a;
    }

    @Override // p547q3.InterfaceC43595a
    /* JADX INFO: renamed from: b */
    public boolean mo8759b() {
        return this.f96250b;
    }

    @Override // p547q3.InterfaceC43595a
    /* JADX INFO: renamed from: c */
    public boolean mo8760c(Uri uri) {
        return this.f96249a.contains(uri.toString());
    }

    @Override // p547q3.InterfaceC43595a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C43599e) {
            return this.f96249a.equals(((C43599e) obj).f96249a);
        }
        return false;
    }

    @Override // p547q3.InterfaceC43595a
    public int hashCode() {
        return this.f96249a.hashCode();
    }

    public String toString() {
        return this.f96249a;
    }
}
