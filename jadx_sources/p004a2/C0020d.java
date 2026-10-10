package p004a2;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5323d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p485o2.C42950d;
import p628t1.C44613e;
import p649u1.C45090b;
import p817z1.C46639r;
import p817z1.InterfaceC46635n;
import p817z1.InterfaceC46636o;

/* JADX INFO: renamed from: a2.d */
/* JADX INFO: compiled from: QMediaStoreUriLoader.java */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class C0020d<DataT> implements InterfaceC46635n<Uri, DataT> {

    /* JADX INFO: renamed from: a */
    public final Context f32a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC46635n<File, DataT> f33b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC46635n<Uri, DataT> f34c;

    /* JADX INFO: renamed from: d */
    public final Class<DataT> f35d;

    /* JADX INFO: renamed from: a2.d$a */
    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    public static abstract class a<DataT> implements InterfaceC46636o<Uri, DataT> {

        /* JADX INFO: renamed from: a */
        public final Context f36a;

        /* JADX INFO: renamed from: b */
        public final Class<DataT> f37b;

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC46635n<Uri, DataT> mo14a(@NonNull C46639r c46639r) {
            return new C0020d(this.f36a, c46639r.m102863d(File.class, this.f37b), c46639r.m102863d(Uri.class, this.f37b), this.f37b);
        }

        public a(Context context, Class<DataT> cls) {
            this.f36a = context;
            this.f37b = cls;
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public final void mo15c() {
        }
    }

    /* JADX INFO: renamed from: a2.d$b */
    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    @RequiresApi(29)
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* JADX INFO: renamed from: a2.d$c */
    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    @RequiresApi(29)
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* JADX INFO: renamed from: a2.d$d */
    /* JADX INFO: compiled from: QMediaStoreUriLoader.java */
    /* JADX INFO: loaded from: classes34.dex */
    public static final class d<DataT> implements InterfaceC5323d<DataT> {

        /* JADX INFO: renamed from: l */
        public static final String[] f38l = {"_data"};

        /* JADX INFO: renamed from: b */
        public final Context f39b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC46635n<File, DataT> f40c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC46635n<Uri, DataT> f41d;

        /* JADX INFO: renamed from: e */
        public final Uri f42e;

        /* JADX INFO: renamed from: f */
        public final int f43f;

        /* JADX INFO: renamed from: g */
        public final int f44g;

        /* JADX INFO: renamed from: h */
        public final C44613e f45h;

        /* JADX INFO: renamed from: i */
        public final Class<DataT> f46i;

        /* JADX INFO: renamed from: j */
        public volatile boolean f47j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public volatile InterfaceC5323d<DataT> f48k;

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        public void cancel() {
            this.f47j = true;
            InterfaceC5323d<DataT> interfaceC5323d = this.f48k;
            if (interfaceC5323d != null) {
                interfaceC5323d.cancel();
            }
        }

        @NonNull
        /* JADX INFO: renamed from: h */
        public final File m30h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f39b.getContentResolver().query(uri, f38l, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th2) {
                if (0 == 0) {
                    throw th2;
                }
                cursor.close();
                throw th2;
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<DataT> mo23a() {
            return this.f46i;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: b */
        public void mo24b() {
            InterfaceC5323d<DataT> interfaceC5323d = this.f48k;
            if (interfaceC5323d != null) {
                interfaceC5323d.mo24b();
            }
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: c */
        public DataSource mo25c() {
            return DataSource.LOCAL;
        }

        /* JADX INFO: renamed from: g */
        public final boolean m29g() {
            return this.f39b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        public d(Context context, InterfaceC46635n<File, DataT> interfaceC46635n, InterfaceC46635n<Uri, DataT> interfaceC46635n2, Uri uri, int i11, int i12, C44613e c44613e, Class<DataT> cls) {
            this.f39b = context.getApplicationContext();
            this.f40c = interfaceC46635n;
            this.f41d = interfaceC46635n2;
            this.f42e = uri;
            this.f43f = i11;
            this.f44g = i12;
            this.f45h = c44613e;
            this.f46i = cls;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: d */
        public void mo26d(@NonNull Priority priority, @NonNull InterfaceC5323d.a<? super DataT> aVar) {
            try {
                InterfaceC5323d<DataT> interfaceC5323dM28f = m28f();
                if (interfaceC5323dM28f == null) {
                    aVar.mo6675f(new IllegalArgumentException("Failed to build fetcher for: " + this.f42e));
                    return;
                }
                this.f48k = interfaceC5323dM28f;
                if (this.f47j) {
                    cancel();
                } else {
                    interfaceC5323dM28f.mo26d(priority, aVar);
                }
            } catch (FileNotFoundException e11) {
                aVar.mo6675f(e11);
            }
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public final InterfaceC46635n.a<DataT> m27e() throws FileNotFoundException {
            Uri requireOriginal;
            if (Environment.isExternalStorageLegacy()) {
                return this.f40c.mo10a(m30h(this.f42e), this.f43f, this.f44g, this.f45h);
            }
            if (m29g()) {
                requireOriginal = MediaStore.setRequireOriginal(this.f42e);
            } else {
                requireOriginal = this.f42e;
            }
            return this.f41d.mo10a(requireOriginal, this.f43f, this.f44g, this.f45h);
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public final InterfaceC5323d<DataT> m28f() throws FileNotFoundException {
            InterfaceC46635n.a<DataT> aVarM27e = m27e();
            if (aVarM27e != null) {
                return aVarM27e.f104429c;
            }
            return null;
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<DataT> mo10a(@NonNull Uri uri, int i11, int i12, @NonNull C44613e c44613e) {
        return new InterfaceC46635n.a<>(new C42950d(uri), new d(this.f32a, this.f33b, this.f34c, uri, i11, i12, c44613e, this.f35d));
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C45090b.m99696b(uri);
    }

    public C0020d(Context context, InterfaceC46635n<File, DataT> interfaceC46635n, InterfaceC46635n<Uri, DataT> interfaceC46635n2, Class<DataT> cls) {
        this.f32a = context.getApplicationContext();
        this.f33b = interfaceC46635n;
        this.f34c = interfaceC46635n2;
        this.f35d = cls;
    }
}
