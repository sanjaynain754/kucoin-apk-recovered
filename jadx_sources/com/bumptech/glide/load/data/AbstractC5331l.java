package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.l */
/* JADX INFO: compiled from: LocalUriFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5331l<T> implements InterfaceC5323d<T> {

    /* JADX INFO: renamed from: b */
    public final Uri f6770b;

    /* JADX INFO: renamed from: c */
    public final ContentResolver f6771c;

    /* JADX INFO: renamed from: d */
    public T f6772d;

    /* JADX INFO: renamed from: e */
    public abstract void mo6666e(T t11) throws IOException;

    /* JADX INFO: renamed from: f */
    public abstract T mo6667f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    /* JADX INFO: renamed from: b */
    public void mo24b() {
        T t11 = this.f6772d;
        if (t11 != null) {
            try {
                mo6666e(t11);
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

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    /* JADX INFO: renamed from: d */
    public final void mo26d(@NonNull Priority priority, @NonNull InterfaceC5323d.a<? super T> aVar) {
        try {
            T tMo6667f = mo6667f(this.f6770b, this.f6771c);
            this.f6772d = tMo6667f;
            aVar.mo6674e(tMo6667f);
        } catch (FileNotFoundException e11) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e11);
            }
            aVar.mo6675f(e11);
        }
    }

    public AbstractC5331l(ContentResolver contentResolver, Uri uri) {
        this.f6771c = contentResolver;
        this.f6770b = uri;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    public void cancel() {
    }
}
