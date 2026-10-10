package com.facebook.imagepipeline.producers;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p749x5.C46075i;
import p819z3.InterfaceC46679h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LocalResourceFetchProducer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/LocalResourceFetchProducer;", "Lcom/facebook/imagepipeline/producers/g0;", "Ljava/util/concurrent/Executor;", "executor", "Lz3/h;", "pooledByteBufferFactory", "Landroid/content/res/Resources;", "resources", "<init>", "(Ljava/util/concurrent/Executor;Lz3/h;Landroid/content/res/Resources;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "", "g", "(Lcom/facebook/imagepipeline/request/ImageRequest;)I", "Lx5/i;", "d", "(Lcom/facebook/imagepipeline/request/ImageRequest;)Lx5/i;", "", "f", "()Ljava/lang/String;", "c", "Landroid/content/res/Resources;", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class LocalResourceFetchProducer extends AbstractC5695g0 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Resources resources;

    /* JADX INFO: compiled from: LocalResourceFetchProducer.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/LocalResourceFetchProducer$Companion;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/imagepipeline/request/ImageRequest;)I", "", "PRODUCER_NAME", "Ljava/lang/String;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final int m9592a(ImageRequest imageRequest) {
            String path = imageRequest.getSourceUri().getPath();
            if (path != null) {
                String strSubstring = path.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return Integer.parseInt(strSubstring);
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX INFO: renamed from: g */
    private final int m9591g(ImageRequest imageRequest) {
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = null;
        try {
            assetFileDescriptorOpenRawResourceFd = this.resources.openRawResourceFd(INSTANCE.m9592a(imageRequest));
            int length = (int) assetFileDescriptorOpenRawResourceFd.getLength();
            try {
                assetFileDescriptorOpenRawResourceFd.close();
                return length;
            } catch (IOException unused) {
                return length;
            }
        } catch (Resources.NotFoundException unused2) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th2) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalResourceFetchProducer(@NotNull Executor executor, @NotNull InterfaceC46679h pooledByteBufferFactory, @NotNull Resources resources) {
        super(executor, pooledByteBufferFactory);
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5695g0
    @Nullable
    /* JADX INFO: renamed from: d */
    public C46075i mo9572d(@NotNull ImageRequest imageRequest) throws IOException {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return m9693e(this.resources.openRawResource(INSTANCE.m9592a(imageRequest)), m9591g(imageRequest));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5695g0
    @NotNull
    /* JADX INFO: renamed from: f */
    public String mo9573f() {
        return "LocalResourceFetchProducer";
    }
}
