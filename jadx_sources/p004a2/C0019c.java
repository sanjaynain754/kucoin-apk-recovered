package p004a2;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import java.io.InputStream;
import p485o2.C42950d;
import p628t1.C44613e;
import p649u1.C45090b;
import p649u1.C45091c;
import p817z1.C46639r;
import p817z1.InterfaceC46635n;
import p817z1.InterfaceC46636o;

/* JADX INFO: renamed from: a2.c */
/* JADX INFO: compiled from: MediaStoreVideoThumbLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class C0019c implements InterfaceC46635n<Uri, InputStream> {

    /* JADX INFO: renamed from: a */
    public final Context f30a;

    /* JADX INFO: renamed from: a2.c$a */
    /* JADX INFO: compiled from: MediaStoreVideoThumbLoader.java */
    public static class a implements InterfaceC46636o<Uri, InputStream> {

        /* JADX INFO: renamed from: a */
        public final Context f31a;

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Uri, InputStream> mo14a(C46639r c46639r) {
            return new C0019c(this.f31a);
        }

        public a(Context context) {
            this.f31a = context;
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m20e(C44613e c44613e) {
        Long l11 = (Long) c44613e.m98732c(VideoDecoder.f6976d);
        return l11 != null && l11.longValue() == -1;
    }

    public C0019c(Context context) {
        this.f30a = context.getApplicationContext();
    }

    @Override // p817z1.InterfaceC46635n
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<InputStream> mo10a(@NonNull Uri uri, int i11, int i12, @NonNull C44613e c44613e) {
        if (C45090b.m99698d(i11, i12) && m20e(c44613e)) {
            return new InterfaceC46635n.a<>(new C42950d(uri), C45091c.m99702g(this.f30a, uri));
        }
        return null;
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull Uri uri) {
        return C45090b.m99697c(uri);
    }
}
