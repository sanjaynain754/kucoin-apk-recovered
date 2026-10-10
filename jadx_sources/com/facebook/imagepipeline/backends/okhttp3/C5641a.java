package com.facebook.imagepipeline.backends.okhttp3;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.backends.okhttp3.a */
/* JADX INFO: compiled from: OkHttpImagePipelineConfigFactory.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/imagepipeline/backends/okhttp3/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Lokhttp3/OkHttpClient;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", "imagepipeline-okhttp3_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C5641a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5641a f8849a = new C5641a();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ImagePipelineConfig.C5651a m9117a(@NotNull Context context, @NotNull OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        return ImagePipelineConfig.INSTANCE.newBuilder(context).m9297S(new OkHttpNetworkFetcher(okHttpClient));
    }
}
