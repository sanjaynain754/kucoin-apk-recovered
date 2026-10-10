package p817z1;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import p628t1.C44613e;

/* JADX INFO: renamed from: z1.s */
/* JADX INFO: compiled from: ResourceLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class C46640s<Data> implements InterfaceC46635n<Integer, Data> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC46635n<Uri, Data> f104452a;

    /* JADX INFO: renamed from: b */
    public final Resources f104453b;

    /* JADX INFO: renamed from: z1.s$a */
    /* JADX INFO: compiled from: ResourceLoader.java */
    public static final class a implements InterfaceC46636o<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final Resources f104454a;

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Integer, AssetFileDescriptor> mo14a(C46639r c46639r) {
            return new C46640s(this.f104454a, c46639r.m102863d(Uri.class, AssetFileDescriptor.class));
        }

        public a(Resources resources) {
            this.f104454a = resources;
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    /* JADX INFO: renamed from: z1.s$b */
    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class b implements InterfaceC46636o<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a */
        public final Resources f104455a;

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Integer, ParcelFileDescriptor> mo14a(C46639r c46639r) {
            return new C46640s(this.f104455a, c46639r.m102863d(Uri.class, ParcelFileDescriptor.class));
        }

        public b(Resources resources) {
            this.f104455a = resources;
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    /* JADX INFO: renamed from: z1.s$c */
    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class c implements InterfaceC46636o<Integer, InputStream> {

        /* JADX INFO: renamed from: a */
        public final Resources f104456a;

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Integer, InputStream> mo14a(C46639r c46639r) {
            return new C46640s(this.f104456a, c46639r.m102863d(Uri.class, InputStream.class));
        }

        public c(Resources resources) {
            this.f104456a = resources;
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    /* JADX INFO: renamed from: z1.s$d */
    /* JADX INFO: compiled from: ResourceLoader.java */
    public static class d implements InterfaceC46636o<Integer, Uri> {

        /* JADX INFO: renamed from: a */
        public final Resources f104457a;

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Integer, Uri> mo14a(C46639r c46639r) {
            return new C46640s(this.f104457a, C46643v.m102880c());
        }

        public d(Resources resources) {
            this.f104457a = resources;
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull Integer num) {
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Uri m102873d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f104453b.getResourcePackageName(num.intValue()) + '/' + this.f104453b.getResourceTypeName(num.intValue()) + '/' + this.f104453b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e11) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e11);
            return null;
        }
    }

    public C46640s(Resources resources, InterfaceC46635n<Uri, Data> interfaceC46635n) {
        this.f104453b = resources;
        this.f104452a = interfaceC46635n;
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<Data> mo10a(@NonNull Integer num, int i11, int i12, @NonNull C44613e c44613e) {
        Uri uriM102873d = m102873d(num);
        if (uriM102873d == null) {
            return null;
        }
        return this.f104452a.mo10a(uriM102873d, i11, i12, c44613e);
    }
}
