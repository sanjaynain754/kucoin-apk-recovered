package p649u1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5326g;
import com.bumptech.glide.load.data.InterfaceC5323d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: u1.c */
/* JADX INFO: compiled from: ThumbFetcher.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45091c implements InterfaceC5323d<InputStream> {

    /* JADX INFO: renamed from: b */
    public final Uri f101486b;

    /* JADX INFO: renamed from: c */
    public final C45093e f101487c;

    /* JADX INFO: renamed from: d */
    public InputStream f101488d;

    /* JADX INFO: renamed from: u1.c$a */
    /* JADX INFO: compiled from: ThumbFetcher.java */
    public static class a implements InterfaceC45092d {

        /* JADX INFO: renamed from: b */
        public static final String[] f101489b = {"_data"};

        /* JADX INFO: renamed from: a */
        public final ContentResolver f101490a;

        public a(ContentResolver contentResolver) {
            this.f101490a = contentResolver;
        }

        @Override // p649u1.InterfaceC45092d
        /* JADX INFO: renamed from: a */
        public Cursor mo99704a(Uri uri) {
            return this.f101490a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f101489b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: renamed from: u1.c$b */
    /* JADX INFO: compiled from: ThumbFetcher.java */
    public static class b implements InterfaceC45092d {

        /* JADX INFO: renamed from: b */
        public static final String[] f101491b = {"_data"};

        /* JADX INFO: renamed from: a */
        public final ContentResolver f101492a;

        public b(ContentResolver contentResolver) {
            this.f101492a = contentResolver;
        }

        @Override // p649u1.InterfaceC45092d
        /* JADX INFO: renamed from: a */
        public Cursor mo99704a(Uri uri) {
            return this.f101492a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f101491b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public static C45091c m99701f(Context context, Uri uri) {
        return m99700e(context, uri, new a(context.getContentResolver()));
    }

    /* JADX INFO: renamed from: g */
    public static C45091c m99702g(Context context, Uri uri) {
        return m99700e(context, uri, new b(context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo23a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    /* JADX INFO: renamed from: b */
    public void mo24b() {
        InputStream inputStream = this.f101488d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    @NonNull
    /* JADX INFO: renamed from: c */
    public DataSource mo25c() {
        return DataSource.LOCAL;
    }

    /* JADX INFO: renamed from: h */
    public final InputStream m99703h() throws Throwable {
        InputStream inputStreamM99708d = this.f101487c.m99708d(this.f101486b);
        int iM99705a = inputStreamM99708d != null ? this.f101487c.m99705a(this.f101486b) : -1;
        return iM99705a != -1 ? new C5326g(inputStreamM99708d, iM99705a) : inputStreamM99708d;
    }

    @VisibleForTesting
    public C45091c(Uri uri, C45093e c45093e) {
        this.f101486b = uri;
        this.f101487c = c45093e;
    }

    /* JADX INFO: renamed from: e */
    public static C45091c m99700e(Context context, Uri uri, InterfaceC45092d interfaceC45092d) {
        return new C45091c(uri, new C45093e(ComponentCallbacks2C5309c.m6550c(context).m6566j().m6533g(), interfaceC45092d, ComponentCallbacks2C5309c.m6550c(context).m6561e(), context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    /* JADX INFO: renamed from: d */
    public void mo26d(@NonNull Priority priority, @NonNull InterfaceC5323d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamM99703h = m99703h();
            this.f101488d = inputStreamM99703h;
            aVar.mo6674e(inputStreamM99703h);
        } catch (FileNotFoundException e11) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e11);
            }
            aVar.mo6675f(e11);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    public void cancel() {
    }
}
