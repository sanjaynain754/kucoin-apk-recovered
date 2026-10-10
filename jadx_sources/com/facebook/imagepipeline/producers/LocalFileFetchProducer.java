package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p749x5.C46075i;
import p819z3.InterfaceC46679h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LocalFileFetchProducer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/LocalFileFetchProducer;", "Lcom/facebook/imagepipeline/producers/g0;", "Ljava/util/concurrent/Executor;", "executor", "Lz3/h;", "pooledByteBufferFactory", "<init>", "(Ljava/util/concurrent/Executor;Lz3/h;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Lx5/i;", "d", "(Lcom/facebook/imagepipeline/request/ImageRequest;)Lx5/i;", "", "f", "()Ljava/lang/String;", "c", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class LocalFileFetchProducer extends AbstractC5695g0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalFileFetchProducer(@NotNull Executor executor, @NotNull InterfaceC46679h pooledByteBufferFactory) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5695g0
    @Nullable
    /* JADX INFO: renamed from: d */
    public C46075i mo9572d(@NotNull ImageRequest imageRequest) throws IOException {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return m9693e(new FileInputStream(imageRequest.getSourceFile().toString()), (int) imageRequest.getSourceFile().length());
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5695g0
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo9573f() {
        return "LocalFileFetchProducer";
    }
}
