package p547q3;

import android.net.Uri;
import java.util.List;
import p712w3.C45708h;

/* JADX INFO: renamed from: q3.c */
/* JADX INFO: compiled from: MultiCacheKey.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43597c implements InterfaceC43595a {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC43595a> f96247a;

    @Override // p547q3.InterfaceC43595a
    /* JADX INFO: renamed from: b */
    public boolean mo8759b() {
        return false;
    }

    @Override // p547q3.InterfaceC43595a
    /* JADX INFO: renamed from: c */
    public boolean mo8760c(Uri uri) {
        for (int i11 = 0; i11 < this.f96247a.size(); i11++) {
            if (this.f96247a.get(i11).mo8760c(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // p547q3.InterfaceC43595a
    /* JADX INFO: renamed from: a */
    public String mo8758a() {
        return this.f96247a.get(0).mo8758a();
    }

    /* JADX INFO: renamed from: d */
    public List<InterfaceC43595a> m95953d() {
        return this.f96247a;
    }

    @Override // p547q3.InterfaceC43595a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C43597c) {
            return this.f96247a.equals(((C43597c) obj).f96247a);
        }
        return false;
    }

    @Override // p547q3.InterfaceC43595a
    public int hashCode() {
        return this.f96247a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f96247a.toString();
    }

    public C43597c(List<InterfaceC43595a> list) {
        this.f96247a = (List) C45708h.m100896g(list);
    }
}
