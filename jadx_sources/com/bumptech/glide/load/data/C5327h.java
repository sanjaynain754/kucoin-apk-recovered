package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.h */
/* JADX INFO: compiled from: FileDescriptorAssetPathFetcher.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5327h extends AbstractC5321b<ParcelFileDescriptor> {
    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<ParcelFileDescriptor> mo23a() {
        return ParcelFileDescriptor.class;
    }

    public C5327h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.AbstractC5321b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo6670e(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC5321b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo6671f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
