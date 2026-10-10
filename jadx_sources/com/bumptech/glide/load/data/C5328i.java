package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.i */
/* JADX INFO: compiled from: FileDescriptorLocalUriFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public class C5328i extends AbstractC5331l<ParcelFileDescriptor> {
    @Override // com.bumptech.glide.load.data.InterfaceC5323d
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<ParcelFileDescriptor> mo23a() {
        return ParcelFileDescriptor.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC5331l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo6667f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    public C5328i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.AbstractC5331l
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo6666e(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }
}
