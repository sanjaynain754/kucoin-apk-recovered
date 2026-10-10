package aa0;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: aa0.f */
/* JADX INFO: compiled from: UriDataSource.java */
/* JADX INFO: loaded from: classes59.dex */
public class C0218f extends AbstractC0216d {

    /* JADX INFO: renamed from: m */
    @NonNull
    public final Context f653m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final Uri f654n;

    @Override // aa0.AbstractC0216d
    /* JADX INFO: renamed from: h */
    public void mo796h(@NonNull MediaExtractor mediaExtractor) throws IOException {
        mediaExtractor.setDataSource(this.f653m, this.f654n, (Map<String, String>) null);
    }

    @Override // aa0.AbstractC0216d
    /* JADX INFO: renamed from: i */
    public void mo797i(@NonNull MediaMetadataRetriever mediaMetadataRetriever) {
        mediaMetadataRetriever.setDataSource(this.f653m, this.f654n);
    }

    public C0218f(@NonNull Context context, @NonNull Uri uri) {
        this.f653m = context.getApplicationContext();
        this.f654n = uri;
    }
}
