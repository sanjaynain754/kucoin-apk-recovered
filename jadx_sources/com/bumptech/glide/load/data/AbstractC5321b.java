package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.b */
/* JADX INFO: compiled from: AssetPathFetcher.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC5321b<T> implements InterfaceC5323d<T> {

    /* JADX INFO: renamed from: b */
    public final String f6746b;

    /* JADX INFO: renamed from: c */
    public final AssetManager f6747c;

    /* JADX INFO: renamed from: d */
    public T f6748d;

    /* JADX INFO: renamed from: e */
    public abstract void mo6670e(T t11) throws IOException;

    /* JADX INFO: renamed from: f */
    public abstract T mo6671f(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    /* JADX INFO: renamed from: b */
    public void mo24b() {
        T t11 = this.f6748d;
        if (t11 == null) {
            return;
        }
        try {
            mo6670e(t11);
        } catch (IOException unused) {
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
    public void mo26d(@NonNull Priority priority, @NonNull InterfaceC5323d.a<? super T> aVar) {
        try {
            T tMo6671f = mo6671f(this.f6747c, this.f6746b);
            this.f6748d = tMo6671f;
            aVar.mo6674e(tMo6671f);
        } catch (IOException e11) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e11);
            }
            aVar.mo6675f(e11);
        }
    }

    public AbstractC5321b(AssetManager assetManager, String str) {
        this.f6747c = assetManager;
        this.f6746b = str;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    public void cancel() {
    }
}
