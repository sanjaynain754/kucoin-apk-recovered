package p817z1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC5323d;
import java.io.File;
import java.io.FileNotFoundException;
import p485o2.C42950d;
import p628t1.C44613e;
import p649u1.C45090b;

/* JADX INFO: renamed from: z1.k */
/* JADX INFO: compiled from: MediaStoreFileLoader.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C46632k implements InterfaceC46635n<Uri, File> {

    /* JADX INFO: renamed from: a */
    public final Context f104416a;

    /* JADX INFO: renamed from: z1.k$a */
    /* JADX INFO: compiled from: MediaStoreFileLoader.java */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a implements InterfaceC46636o<Uri, File> {

        /* JADX INFO: renamed from: a */
        public final Context f104417a;

        @Override // p817z1.InterfaceC46636o
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC46635n<Uri, File> mo14a(C46639r c46639r) {
            return new C46632k(this.f104417a);
        }

        public a(Context context) {
            this.f104417a = context;
        }

        @Override // p817z1.InterfaceC46636o
        /* JADX INFO: renamed from: c */
        public void mo15c() {
        }
    }

    /* JADX INFO: renamed from: z1.k$b */
    /* JADX INFO: compiled from: MediaStoreFileLoader.java */
    public static class b implements InterfaceC5323d<File> {

        /* JADX INFO: renamed from: d */
        public static final String[] f104418d = {"_data"};

        /* JADX INFO: renamed from: b */
        public final Context f104419b;

        /* JADX INFO: renamed from: c */
        public final Uri f104420c;

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<File> mo23a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        @NonNull
        /* JADX INFO: renamed from: c */
        public DataSource mo25c() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: d */
        public void mo26d(@NonNull Priority priority, @NonNull InterfaceC5323d.a<? super File> aVar) {
            Cursor cursorQuery = this.f104419b.getContentResolver().query(this.f104420c, f104418d, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.mo6674e(new File(string));
                return;
            }
            aVar.mo6675f(new FileNotFoundException("Failed to find file path for: " + this.f104420c));
        }

        public b(Context context, Uri uri) {
            this.f104419b = context;
            this.f104420c = uri;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        /* JADX INFO: renamed from: b */
        public void mo24b() {
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5323d
        public void cancel() {
        }
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC46635n.a<File> mo10a(@NonNull Uri uri, int i11, int i12, @NonNull C44613e c44613e) {
        return new InterfaceC46635n.a<>(new C42950d(uri), new b(this.f104416a, uri));
    }

    public C46632k(Context context) {
        this.f104416a = context;
    }

    @Override // p817z1.InterfaceC46635n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11b(@NonNull Uri uri) {
        return C45090b.m99696b(uri);
    }
}
