package p817z1;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.InputStream;
import p628t1.C44613e;

/* JADX INFO: renamed from: z1.u */
/* JADX INFO: compiled from: StringLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class C46642u<Data> implements InterfaceC46635n<String, Data> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC46635n<Uri, Data> f104459a;

    /* JADX INFO: renamed from: z1.u$a */
    /* JADX INFO: compiled from: StringLoader.java */
    public static final class a implements InterfaceC46636o<String, AssetFileDescriptor> {
        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<String, AssetFileDescriptor> mo14a(@NonNull C46639r c46639r) {
            return new C46642u(c46639r.m102863d(Uri.class, AssetFileDescriptor.class));
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    /* JADX INFO: renamed from: z1.u$b */
    /* JADX INFO: compiled from: StringLoader.java */
    public static class b implements InterfaceC46636o<String, ParcelFileDescriptor> {
        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<String, ParcelFileDescriptor> mo14a(@NonNull C46639r c46639r) {
            return new C46642u(c46639r.m102863d(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    /* JADX INFO: renamed from: z1.u$c */
    /* JADX INFO: compiled from: StringLoader.java */
    public static class c implements InterfaceC46636o<String, InputStream> {
        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<String, InputStream> mo14a(@NonNull C46639r c46639r) {
            return new C46642u(c46639r.m102863d(Uri.class, InputStream.class));
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull String str) {
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static Uri m102877f(String str) {
        return Uri.fromFile(new File(str));
    }

    public C46642u(InterfaceC46635n<Uri, Data> interfaceC46635n) {
        this.f104459a = interfaceC46635n;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static Uri m102876e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m102877f(str);
        }
        Uri uri = Uri.parse(str);
        if (uri.getScheme() == null) {
            return m102877f(str);
        }
        return uri;
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<Data> mo10a(@NonNull String str, int i11, int i12, @NonNull C44613e c44613e) {
        Uri uriM102876e = m102876e(str);
        if (uriM102876e != null && this.f104459a.mo11b(uriM102876e)) {
            return this.f104459a.mo10a(uriM102876e, i11, i12, c44613e);
        }
        return null;
    }
}
