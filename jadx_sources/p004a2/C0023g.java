package p004a2;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;
import p628t1.C44613e;
import p817z1.C46628g;
import p817z1.C46639r;
import p817z1.InterfaceC46635n;
import p817z1.InterfaceC46636o;

/* JADX INFO: renamed from: a2.g */
/* JADX INFO: compiled from: UrlLoader.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0023g implements InterfaceC46635n<URL, InputStream> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC46635n<C46628g, InputStream> f49a;

    /* JADX INFO: renamed from: a2.g$a */
    /* JADX INFO: compiled from: UrlLoader.java */
    /* JADX INFO: loaded from: classes.dex */
    public static class a implements InterfaceC46636o<URL, InputStream> {
        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<URL, InputStream> mo14a(C46639r c46639r) {
            return new C0023g(c46639r.m102863d(C46628g.class, InputStream.class));
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull URL url) {
        return true;
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<InputStream> mo10a(@NonNull URL url, int i11, int i12, @NonNull C44613e c44613e) {
        return this.f49a.mo10a(new C46628g(url), i11, i12, c44613e);
    }

    public C0023g(InterfaceC46635n<C46628g, InputStream> interfaceC46635n) {
        this.f49a = interfaceC46635n;
    }
}
