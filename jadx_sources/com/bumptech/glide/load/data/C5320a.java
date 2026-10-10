package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.a */
/* JADX INFO: compiled from: AssetFileDescriptorLocalUriFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5320a extends AbstractC5331l<AssetFileDescriptor> {
    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<AssetFileDescriptor> mo23a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC5331l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo6667f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    public C5320a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.AbstractC5331l
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo6666e(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }
}
