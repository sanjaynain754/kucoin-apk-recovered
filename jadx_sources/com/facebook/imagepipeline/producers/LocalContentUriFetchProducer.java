package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p190d4.C36613d;
import p749x5.C46075i;
import p819z3.InterfaceC46679h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: LocalContentUriFetchProducer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0018B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/LocalContentUriFetchProducer;", "Lcom/facebook/imagepipeline/producers/g0;", "Ljava/util/concurrent/Executor;", "executor", "Lz3/h;", "pooledByteBufferFactory", "Landroid/content/ContentResolver;", "contentResolver", "<init>", "(Ljava/util/concurrent/Executor;Lz3/h;Landroid/content/ContentResolver;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Lx5/i;", "d", "(Lcom/facebook/imagepipeline/request/ImageRequest;)Lx5/i;", "", "f", "()Ljava/lang/String;", "Landroid/net/Uri;", "uri", "g", "(Landroid/net/Uri;)Lx5/i;", "c", "Landroid/content/ContentResolver;", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class LocalContentUriFetchProducer extends AbstractC5695g0 {

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final String[] f9233e = {"_id", "_data"};

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ContentResolver contentResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalContentUriFetchProducer(@NotNull Executor executor, @NotNull InterfaceC46679h pooledByteBufferFactory, @NotNull ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.contentResolver = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5695g0
    @Nullable
    /* JADX INFO: renamed from: d */
    public C46075i mo9572d(@NotNull ImageRequest imageRequest) throws IOException {
        C46075i c46075iM9576g;
        InputStream inputStreamCreateInputStream;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        Uri sourceUri = imageRequest.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
        if (!C36613d.m81943l(sourceUri)) {
            if (C36613d.m81942k(sourceUri) && (c46075iM9576g = m9576g(sourceUri)) != null) {
                return c46075iM9576g;
            }
            InputStream inputStreamOpenInputStream = this.contentResolver.openInputStream(sourceUri);
            if (inputStreamOpenInputStream != null) {
                return m9693e(inputStreamOpenInputStream, -1);
            }
            throw new IllegalStateException("Required value was null.");
        }
        String string = sourceUri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (StringsKt.endsWith$default(string, "/photo", false, 2, (Object) null)) {
            inputStreamCreateInputStream = this.contentResolver.openInputStream(sourceUri);
        } else {
            String string2 = sourceUri.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            if (StringsKt.endsWith$default(string2, "/display_photo", false, 2, (Object) null)) {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.contentResolver.openAssetFileDescriptor(sourceUri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    inputStreamCreateInputStream = assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
                } catch (IOException unused) {
                    throw new IOException("Contact photo does not exist: " + sourceUri);
                }
            } else {
                InputStream inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.contentResolver, sourceUri);
                if (inputStreamOpenContactPhotoInputStream == null) {
                    throw new IOException("Contact photo does not exist: " + sourceUri);
                }
                inputStreamCreateInputStream = inputStreamOpenContactPhotoInputStream;
            }
        }
        if (inputStreamCreateInputStream != null) {
            return m9693e(inputStreamCreateInputStream, -1);
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5695g0
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo9573f() {
        return "LocalContentUriFetchProducer";
    }

    /* JADX INFO: renamed from: g */
    public final C46075i m9576g(Uri uri) throws IOException {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.contentResolver.openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            C46075i c46075iM9693e = m9693e(new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()), (int) parcelFileDescriptorOpenFileDescriptor.getStatSize());
            Intrinsics.checkNotNullExpressionValue(c46075iM9693e, "getEncodedImage(...)");
            parcelFileDescriptorOpenFileDescriptor.close();
            return c46075iM9693e;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}
