package p817z1;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.C5327h;
import com.bumptech.glide.load.data.C5332m;
import com.bumptech.glide.load.data.InterfaceC5323d;
import java.io.InputStream;
import p485o2.C42950d;
import p628t1.C44613e;

/* JADX INFO: renamed from: z1.a */
/* JADX INFO: compiled from: AssetUriLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class C46622a<Data> implements InterfaceC46635n<Uri, Data> {

    /* JADX INFO: renamed from: c */
    public static final int f104377c = 22;

    /* JADX INFO: renamed from: a */
    public final AssetManager f104378a;

    /* JADX INFO: renamed from: b */
    public final a<Data> f104379b;

    /* JADX INFO: renamed from: z1.a$a */
    /* JADX INFO: compiled from: AssetUriLoader.java */
    public interface a<Data> {
        /* JADX INFO: renamed from: b */
        InterfaceC5323d<Data> mo102798b(AssetManager assetManager, String str);
    }

    /* JADX INFO: renamed from: z1.a$b */
    /* JADX INFO: compiled from: AssetUriLoader.java */
    public static class b implements InterfaceC46636o<Uri, ParcelFileDescriptor>, a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final AssetManager f104380a;

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Uri, ParcelFileDescriptor> mo14a(C46639r c46639r) {
            return new C46622a(this.f104380a, this);
        }

        @Override // p817z1.C46622a.a
        /* JADX INFO: renamed from: b */
        public InterfaceC5323d<ParcelFileDescriptor> mo102798b(AssetManager assetManager, String str) {
            return new C5327h(assetManager, str);
        }

        public b(AssetManager assetManager) {
            this.f104380a = assetManager;
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    /* JADX INFO: renamed from: z1.a$c */
    /* JADX INFO: compiled from: AssetUriLoader.java */
    public static class c implements InterfaceC46636o<Uri, InputStream>, a<InputStream> {

        /* JADX INFO: renamed from: a */
        public final AssetManager f104381a;

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Uri, InputStream> mo14a(C46639r c46639r) {
            return new C46622a(this.f104381a, this);
        }

        @Override // p817z1.C46622a.a
        /* JADX INFO: renamed from: b */
        public InterfaceC5323d<InputStream> mo102798b(AssetManager assetManager, String str) {
            return new C5332m(assetManager, str);
        }

        public c(AssetManager assetManager) {
            this.f104381a = assetManager;
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    public C46622a(AssetManager assetManager, a<Data> aVar) {
        this.f104378a = assetManager;
        this.f104379b = aVar;
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<Data> mo10a(@NonNull Uri uri, int i11, int i12, @NonNull C44613e c44613e) {
        return new InterfaceC46635n.a<>(new C42950d(uri), this.f104379b.mo102798b(this.f104378a, uri.toString().substring(f104377c)));
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
