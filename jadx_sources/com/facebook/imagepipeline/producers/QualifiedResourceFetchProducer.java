package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import p749x5.C46075i;
import p819z3.InterfaceC46679h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QualifiedResourceFetchProducer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/QualifiedResourceFetchProducer;", "Lcom/facebook/imagepipeline/producers/g0;", "Ljava/util/concurrent/Executor;", "executor", "Lz3/h;", "pooledByteBufferFactory", "Landroid/content/ContentResolver;", "contentResolver", "<init>", "(Ljava/util/concurrent/Executor;Lz3/h;Landroid/content/ContentResolver;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Lx5/i;", "d", "(Lcom/facebook/imagepipeline/request/ImageRequest;)Lx5/i;", "", "f", "()Ljava/lang/String;", "c", "Landroid/content/ContentResolver;", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class QualifiedResourceFetchProducer extends AbstractC5695g0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ContentResolver contentResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QualifiedResourceFetchProducer(@NotNull Executor executor, @NotNull InterfaceC46679h pooledByteBufferFactory, @NotNull ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.contentResolver = contentResolver;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5695g0
    @NotNull
    /* JADX INFO: renamed from: d */
    public C46075i mo9572d(@NotNull ImageRequest imageRequest) throws IOException {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        InputStream inputStreamOpenInputStream = this.contentResolver.openInputStream(imageRequest.getSourceUri());
        if (inputStreamOpenInputStream == null) {
            throw new IllegalStateException("ContentResolver returned null InputStream");
        }
        C46075i c46075iM9693e = m9693e(inputStreamOpenInputStream, -1);
        Intrinsics.checkNotNullExpressionValue(c46075iM9693e, "getEncodedImage(...)");
        return c46075iM9693e;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5695g0
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo9573f() {
        return "QualifiedResourceFetchProducer";
    }
}
