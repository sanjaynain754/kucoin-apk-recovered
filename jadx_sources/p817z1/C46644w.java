package p817z1;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.C5320a;
import com.bumptech.glide.load.data.C5328i;
import com.bumptech.glide.load.data.C5333n;
import com.bumptech.glide.load.data.InterfaceC5323d;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p485o2.C42950d;
import p628t1.C44613e;

/* JADX INFO: renamed from: z1.w */
/* JADX INFO: compiled from: UriLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class C46644w<Data> implements InterfaceC46635n<Uri, Data> {

    /* JADX INFO: renamed from: b */
    public static final Set<String> f104463b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* JADX INFO: renamed from: a */
    public final c<Data> f104464a;

    /* JADX INFO: renamed from: z1.w$a */
    /* JADX INFO: compiled from: UriLoader.java */
    public static final class a implements InterfaceC46636o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f104465a;

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Uri, AssetFileDescriptor> mo14a(C46639r c46639r) {
            return new C46644w(this);
        }

        @Override // p817z1.C46644w.c
        /* JADX INFO: renamed from: b */
        public InterfaceC5323d<AssetFileDescriptor> mo102884b(Uri uri) {
            return new C5320a(this.f104465a, uri);
        }

        public a(ContentResolver contentResolver) {
            this.f104465a = contentResolver;
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    /* JADX INFO: renamed from: z1.w$b */
    /* JADX INFO: compiled from: UriLoader.java */
    public static class b implements InterfaceC46636o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f104466a;

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Uri, ParcelFileDescriptor> mo14a(C46639r c46639r) {
            return new C46644w(this);
        }

        @Override // p817z1.C46644w.c
        /* JADX INFO: renamed from: b */
        public InterfaceC5323d<ParcelFileDescriptor> mo102884b(Uri uri) {
            return new C5328i(this.f104466a, uri);
        }

        public b(ContentResolver contentResolver) {
            this.f104466a = contentResolver;
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    /* JADX INFO: renamed from: z1.w$c */
    /* JADX INFO: compiled from: UriLoader.java */
    public interface c<Data> {
        /* JADX INFO: renamed from: b */
        InterfaceC5323d<Data> mo102884b(Uri uri);
    }

    /* JADX INFO: renamed from: z1.w$d */
    /* JADX INFO: compiled from: UriLoader.java */
    public static class d implements InterfaceC46636o<Uri, InputStream>, c<InputStream> {

        /* JADX INFO: renamed from: a */
        public final ContentResolver f104467a;

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Uri, InputStream> mo14a(C46639r c46639r) {
            return new C46644w(this);
        }

        @Override // p817z1.C46644w.c
        /* JADX INFO: renamed from: b */
        public InterfaceC5323d<InputStream> mo102884b(Uri uri) {
            return new C5333n(this.f104467a, uri);
        }

        public d(ContentResolver contentResolver) {
            this.f104467a = contentResolver;
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<Data> mo10a(@NonNull Uri uri, int i11, int i12, @NonNull C44613e c44613e) {
        return new InterfaceC46635n.a<>(new C42950d(uri), this.f104464a.mo102884b(uri));
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull Uri uri) {
        return f104463b.contains(uri.getScheme());
    }

    public C46644w(c<Data> cVar) {
        this.f104464a = cVar;
    }
}
