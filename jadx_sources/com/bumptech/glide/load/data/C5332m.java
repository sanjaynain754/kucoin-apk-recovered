package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.m */
/* JADX INFO: compiled from: StreamAssetPathFetcher.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5332m extends AbstractC5321b<InputStream> {
    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo23a() {
        return InputStream.class;
    }

    public C5332m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.AbstractC5321b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo6670e(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC5321b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo6671f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
