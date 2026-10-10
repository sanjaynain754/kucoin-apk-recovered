package p817z1;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p628t1.C44613e;

/* JADX INFO: renamed from: z1.x */
/* JADX INFO: compiled from: UrlUriLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class C46645x<Data> implements InterfaceC46635n<Uri, Data> {

    /* JADX INFO: renamed from: b */
    public static final Set<String> f104468b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", ProxyConfig.MATCH_HTTPS)));

    /* JADX INFO: renamed from: a */
    public final InterfaceC46635n<C46628g, Data> f104469a;

    /* JADX INFO: renamed from: z1.x$a */
    /* JADX INFO: compiled from: UrlUriLoader.java */
    public static class a implements InterfaceC46636o<Uri, InputStream> {
        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Uri, InputStream> mo14a(C46639r c46639r) {
            return new C46645x(c46639r.m102863d(C46628g.class, InputStream.class));
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<Data> mo10a(@NonNull Uri uri, int i11, int i12, @NonNull C44613e c44613e) {
        return this.f104469a.mo10a(new C46628g(uri.toString()), i11, i12, c44613e);
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull Uri uri) {
        return f104468b.contains(uri.getScheme());
    }

    public C46645x(InterfaceC46635n<C46628g, Data> interfaceC46635n) {
        this.f104469a = interfaceC46635n;
    }
}
