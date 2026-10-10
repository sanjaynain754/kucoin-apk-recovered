package p004a2;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import p485o2.C42950d;
import p628t1.C44613e;
import p649u1.C45090b;
import p649u1.C45091c;
import p817z1.C46639r;
import p817z1.InterfaceC46635n;
import p817z1.InterfaceC46636o;

/* JADX INFO: renamed from: a2.b */
/* JADX INFO: compiled from: MediaStoreImageThumbLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class C0018b implements InterfaceC46635n<Uri, InputStream> {

    /* JADX INFO: renamed from: a */
    public final Context f28a;

    /* JADX INFO: renamed from: a2.b$a */
    /* JADX INFO: compiled from: MediaStoreImageThumbLoader.java */
    public static class a implements InterfaceC46636o<Uri, InputStream> {

        /* JADX INFO: renamed from: a */
        public final Context f29a;

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Uri, InputStream> mo14a(C46639r c46639r) {
            return new C0018b(this.f29a);
        }

        public a(Context context) {
            this.f29a = context;
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    public C0018b(Context context) {
        this.f28a = context.getApplicationContext();
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<InputStream> mo10a(@NonNull Uri uri, int i11, int i12, @NonNull C44613e c44613e) {
        if (C45090b.m99698d(i11, i12)) {
            return new InterfaceC46635n.a<>(new C42950d(uri), C45091c.m99701f(this.f28a, uri));
        }
        return null;
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull Uri uri) {
        return C45090b.m99695a(uri);
    }
}
