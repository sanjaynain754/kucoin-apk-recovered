package p817z1;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import p523p2.C43363j;
import p628t1.InterfaceC44610b;

/* JADX INFO: renamed from: z1.g */
/* JADX INFO: compiled from: GlideUrl.java */
/* JADX INFO: loaded from: classes.dex */
public class C46628g implements InterfaceC44610b {

    /* JADX INFO: renamed from: b */
    public final InterfaceC46629h f104399b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final URL f104400c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f104401d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f104402e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public URL f104403f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public volatile byte[] f104404g;

    /* JADX INFO: renamed from: h */
    public int f104405h;

    public C46628g(URL url) {
        this(url, InterfaceC46629h.f104407b);
    }

    public C46628g(String str) {
        this(str, InterfaceC46629h.f104407b);
    }

    /* JADX INFO: renamed from: c */
    public String m102821c() {
        String str = this.f104401d;
        return str != null ? str : ((URL) C43363j.m95506d(this.f104400c)).toString();
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m102822d() {
        if (this.f104404g == null) {
            this.f104404g = m102821c().getBytes(InterfaceC44610b.f98907a);
        }
        return this.f104404g;
    }

    /* JADX INFO: renamed from: e */
    public Map<String, String> m102823e() {
        return this.f104399b.getHeaders();
    }

    @Override // p628t1.InterfaceC44610b
    public boolean equals(Object obj) {
        if (obj instanceof C46628g) {
            C46628g c46628g = (C46628g) obj;
            if (m102821c().equals(c46628g.m102821c()) && this.f104399b.equals(c46628g.f104399b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final String m102824f() {
        if (TextUtils.isEmpty(this.f104402e)) {
            String string = this.f104401d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) C43363j.m95506d(this.f104400c)).toString();
            }
            this.f104402e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f104402e;
    }

    /* JADX INFO: renamed from: g */
    public final URL m102825g() throws MalformedURLException {
        if (this.f104403f == null) {
            this.f104403f = new URL(m102824f());
        }
        return this.f104403f;
    }

    @Override // p628t1.InterfaceC44610b
    public int hashCode() {
        if (this.f104405h == 0) {
            int iHashCode = m102821c().hashCode();
            this.f104405h = iHashCode;
            this.f104405h = (iHashCode * 31) + this.f104399b.hashCode();
        }
        return this.f104405h;
    }

    public C46628g(URL url, InterfaceC46629h interfaceC46629h) {
        this.f104400c = (URL) C43363j.m95506d(url);
        this.f104401d = null;
        this.f104399b = (InterfaceC46629h) C43363j.m95506d(interfaceC46629h);
    }

    @Override // p628t1.InterfaceC44610b
    /* JADX INFO: renamed from: a */
    public void mo4268a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(m102822d());
    }

    /* JADX INFO: renamed from: h */
    public String m102826h() {
        return m102824f();
    }

    /* JADX INFO: renamed from: i */
    public URL m102827i() throws MalformedURLException {
        return m102825g();
    }

    public String toString() {
        return m102821c();
    }

    public C46628g(String str, InterfaceC46629h interfaceC46629h) {
        this.f104400c = null;
        this.f104401d = C43363j.m95504b(str);
        this.f104399b = (InterfaceC46629h) C43363j.m95506d(interfaceC46629h);
    }
}
