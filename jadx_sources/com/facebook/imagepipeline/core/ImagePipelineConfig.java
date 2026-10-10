package com.facebook.imagepipeline.core;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.bitmaps.HoneycombBitmapCreator;
import com.facebook.imagepipeline.cache.BitmapMemoryCacheTrimStrategy;
import com.facebook.imagepipeline.cache.C5644b;
import com.facebook.imagepipeline.cache.C5649g;
import com.facebook.imagepipeline.cache.InterfaceC5643a;
import com.facebook.imagepipeline.cache.InterfaceC5645c;
import com.facebook.imagepipeline.cache.InterfaceC5648f;
import com.facebook.imagepipeline.producers.C5680b0;
import com.facebook.imagepipeline.producers.C5714n;
import com.facebook.imagepipeline.producers.InterfaceC5719p0;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p008a6.C0142e0;
import p008a6.C0146g0;
import p192d6.C36621b;
import p221e4.C37072c;
import p221e4.InterfaceC37070a;
import p221e4.InterfaceC37071b;
import p223e6.InterfaceC37079d;
import p526p5.AbstractC43387c;
import p547q3.InterfaceC43595a;
import p549q5.C43621j;
import p549q5.C43622k;
import p549q5.C43623l;
import p549q5.C43628q;
import p549q5.C43630s;
import p549q5.InterfaceC43619h;
import p549q5.InterfaceC43625n;
import p583r3.C43909b;
import p615s3.InterfaceC44276a;
import p617s5.C44333j;
import p617s5.C44335k;
import p617s5.C44339m;
import p617s5.InterfaceC44317b;
import p617s5.InterfaceC44341n;
import p617s5.InterfaceC44343o;
import p617s5.InterfaceC44346r;
import p651u3.InterfaceExecutorServiceC45104g;
import p653u5.C45124b;
import p653u5.InterfaceC45123a;
import p684v5.C45422c;
import p684v5.C45426g;
import p684v5.InterfaceC45421b;
import p684v5.InterfaceC45424e;
import p712w3.C45712l;
import p712w3.InterfaceC45711k;
import p749x5.InterfaceC46071e;
import p819z3.C46676e;
import p819z3.InterfaceC46675d;
import p821z5.InterfaceC46704c;
import p821z5.InterfaceC46705d;
import p852kotlin.Metadata;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ImagePipelineConfig.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 »\u00012\u00020\u0001:\u0004\u000e\u0007¼\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010-\u001a\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00107\u001a\b\u0012\u0004\u0012\u0002040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010\u000f\u001a\u0004\b6\u0010\u0011R \u00109\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010\u000f\u001a\u0004\b/\u0010\u0011R\u001a\u0010?\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010D\u001a\u00020@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b;\u0010CR\u001c\u0010I\u001a\u0004\u0018\u00010E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b)\u0010HR\u001c\u0010O\u001a\u0004\u0018\u00010J8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR \u0010S\u001a\b\u0012\u0004\u0012\u00020P0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010\u000f\u001a\u0004\bR\u0010\u0011R\"\u0010[\u001a\u0004\u0018\u00010T8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bY\u0010Z\u001a\u0004\bW\u0010XR \u0010]\u001a\b\u0012\u0004\u0012\u00020P0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010\u000f\u001a\u0004\bA\u0010\u0011R\u001a\u0010a\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010_\u001a\u0004\bU\u0010`R\u001a\u0010e\u001a\u00020b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010c\u001a\u0004\bF\u0010dR \u0010k\u001a\u00020T8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bf\u0010g\u0012\u0004\bj\u0010Z\u001a\u0004\bh\u0010iR\u001e\u0010p\u001a\u0006\u0012\u0002\b\u00030l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bQ\u0010oR\u0014\u0010q\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010gR\u001c\u0010v\u001a\u0004\u0018\u00010r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010{\u001a\u00020w8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\b5\u0010zR\u001a\u0010\u007f\u001a\u00020|8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010}\u001a\u0004\b\u0014\u0010~R%\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bh\u0010\u0082\u0001\u001a\u0005\b\\\u0010\u0083\u0001R%\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0080\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b6\u0010\u0082\u0001\u001a\u0005\b\u0007\u0010\u0083\u0001R'\u0010\u008a\u0001\u001a\n\u0012\u0005\u0012\u00030\u0087\u00010\u0080\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0082\u0001\u001a\u0006\b\u0089\u0001\u0010\u0083\u0001R\u001e\u0010\u008e\u0001\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b%\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u008f\u0001\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b\u008c\u0001\u0010_\u001a\u0004\bf\u0010`R!\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0089\u0001\u0010\u0091\u0001\u001a\u0005\bx\u0010\u0092\u0001R\u001e\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b1\u0010\u0095\u0001\u001a\u0005\bK\u0010\u0096\u0001R\u001e\u0010\u0099\u0001\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0098\u0001\u0010\u008b\u0001\u001a\u0005\b#\u0010\u008d\u0001R\u001e\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b=\u0010\u009b\u0001\u001a\u0005\b8\u0010\u009c\u0001R.\u0010£\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0005\u0012\u00030\u009f\u0001\u0018\u00010\u009e\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bg\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R.\u0010¦\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0005\u0012\u00030¤\u0001\u0018\u00010\u009e\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b¥\u0001\u0010 \u0001\u001a\u0005\b\u000e\u0010¢\u0001R!\u0010«\u0001\u001a\u0005\u0018\u00010§\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0005\bm\u0010ª\u0001R \u0010°\u0001\u001a\u00030¬\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b\u0088\u0001\u0010¯\u0001R.\u0010¶\u0001\u001a\u0012\u0012\u0005\u0012\u00030²\u0001\u0012\u0004\u0012\u00020^\u0018\u00010±\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b³\u0001\u0010´\u0001\u001a\u0005\b\u0019\u0010µ\u0001R\"\u0010¸\u0001\u001a\u0005\u0018\u00010·\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¸\u0001\u0010¹\u0001\u001a\u0006\b\u0098\u0001\u0010º\u0001¨\u0006½\u0001"}, m90084d2 = {"Lcom/facebook/imagepipeline/core/ImagePipelineConfig;", "Ls5/r;", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", "builder", "<init>", "(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;)V", "Landroid/graphics/Bitmap$Config;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Lw3/k;", "Lq5/q;", "b", "Lw3/k;", "y", "()Lw3/k;", "bitmapMemoryCacheParamsSupplier", "Lcom/facebook/imagepipeline/cache/f$a;", "c", "Lcom/facebook/imagepipeline/cache/f$a;", CmcdData.Factory.STREAMING_FORMAT_SS, "()Lcom/facebook/imagepipeline/cache/f$a;", "bitmapMemoryCacheTrimStrategy", "d", "r", "encodedMemoryCacheTrimStrategy", "Lcom/facebook/imagepipeline/cache/c$b;", "Lq3/a;", "e", "Lcom/facebook/imagepipeline/cache/c$b;", "()Lcom/facebook/imagepipeline/cache/c$b;", "bitmapMemoryCacheEntryStateObserver", "Lq5/h;", "f", "Lq5/h;", "C", "()Lq5/h;", "cacheKeyFactory", "Landroid/content/Context;", "g", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lcom/facebook/imagepipeline/core/DownsampleMode;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/facebook/imagepipeline/core/DownsampleMode;", "F", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "Ls5/b;", "i", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "diskCachesStoreSupplier", "j", "encodedMemoryCacheParamsSupplier", "Ls5/n;", "k", "Ls5/n;", "H", "()Ls5/n;", "executorSupplier", "Lq5/n;", CmcdData.Factory.STREAM_TYPE_LIVE, "Lq5/n;", "()Lq5/n;", "imageCacheStatsTracker", "Lv5/b;", "m", "Lv5/b;", "()Lv5/b;", "imageDecoder", "Le6/d;", "n", "Le6/d;", "w", "()Le6/d;", "imageTranscoderFactory", "", "o", "getEnableEncodedImageColorSpaceUsage", "enableEncodedImageColorSpaceUsage", "", "p", "Ljava/lang/Integer;", "v", "()Ljava/lang/Integer;", "getImageTranscoderType$annotations", "()V", "imageTranscoderType", "q", "isPrefetchEnabledSupplier", "Lr3/b;", "Lr3/b;", "()Lr3/b;", "mainDiskCacheConfig", "Lz3/d;", "Lz3/d;", "()Lz3/d;", "memoryTrimmableRegistry", "t", "I", "z", "()I", "getMemoryChunkType$annotations", "memoryChunkType", "Lcom/facebook/imagepipeline/producers/p0;", "u", "Lcom/facebook/imagepipeline/producers/p0;", "()Lcom/facebook/imagepipeline/producers/p0;", "networkFetcher", "httpNetworkTimeout", "Lp5/c;", "Lp5/c;", "getPlatformBitmapFactory", "()Lp5/c;", "platformBitmapFactory", "La6/g0;", "x", "La6/g0;", "()La6/g0;", "poolFactory", "Lv5/e;", "Lv5/e;", "()Lv5/e;", "progressiveJpegConfig", "", "Lz5/d;", "Ljava/util/Set;", "()Ljava/util/Set;", "requestListeners", "Lz5/c;", "requestListener2s", "Lcom/facebook/imagepipeline/producers/n;", "B", ExifInterface.LONGITUDE_EAST, "customProducerSequenceFactories", "Z", "D", "()Z", "isResizeAndRotateEnabledForNetwork", "smallImageDiskCacheConfig", "Lv5/c;", "Lv5/c;", "()Lv5/c;", "imageDecoderConfig", "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;", "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;", "()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;", "experiments", "G", "isDiskCacheEnabled", "Lu5/a;", "Lu5/a;", "()Lu5/a;", "closeableReferenceLeakTracker", "Lcom/facebook/imagepipeline/cache/f;", "Lx5/e;", "Lcom/facebook/imagepipeline/cache/f;", "getBitmapCacheOverride", "()Lcom/facebook/imagepipeline/cache/f;", "bitmapCacheOverride", "Lcom/facebook/common/memory/PooledByteBuffer;", "J", "encodedMemoryCacheOverride", "Lu3/g;", "K", "Lu3/g;", "()Lu3/g;", "executorServiceForAnimatedImages", "Lcom/facebook/imagepipeline/cache/a;", "L", "Lcom/facebook/imagepipeline/cache/a;", "()Lcom/facebook/imagepipeline/cache/a;", "bitmapMemoryCacheFactory", "", "", "M", "Ljava/util/Map;", "()Ljava/util/Map;", "dynamicDiskCacheConfigMap", "Ls3/a;", "callerContextVerifier", "Ls3/a;", "()Ls3/a;", "N", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImagePipelineConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePipelineConfig.kt\ncom/facebook/imagepipeline/core/ImagePipelineConfig\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,577:1\n40#2,9:578\n*S KotlinDebug\n*F\n+ 1 ImagePipelineConfig.kt\ncom/facebook/imagepipeline/core/ImagePipelineConfig\n*L\n159#1:578,9\n*E\n"})
public final class ImagePipelineConfig implements InterfaceC44346r {

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O */
    @NotNull
    public static C5652b f8931O = new C5652b();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Set<InterfaceC46704c> requestListener2s;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Set<C5714n> customProducerSequenceFactories;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final boolean isResizeAndRotateEnabledForNetwork;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final C43909b smallImageDiskCacheConfig;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public final C45422c imageDecoderConfig;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final ImagePipelineExperiments experiments;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final boolean isDiskCacheEnabled;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45123a closeableReferenceLeakTracker;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> bitmapCacheOverride;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> encodedMemoryCacheOverride;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @Nullable
    public final InterfaceExecutorServiceC45104g executorServiceForAnimatedImages;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5643a bitmapMemoryCacheFactory;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @Nullable
    public final Map<String, C43909b> dynamicDiskCacheConfigMap;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45711k<C43628q> bitmapMemoryCacheParamsSupplier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5648f.a bitmapMemoryCacheTrimStrategy;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5648f.a encodedMemoryCacheTrimStrategy;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC5645c.b<InterfaceC43595a> bitmapMemoryCacheEntryStateObserver;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC43619h cacheKeyFactory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final DownsampleMode downsampleMode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45711k<InterfaceC44317b> diskCachesStoreSupplier;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45711k<C43628q> encodedMemoryCacheParamsSupplier;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44341n executorSupplier;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC43625n imageCacheStatsTracker;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC45421b imageDecoder;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC37079d imageTranscoderFactory;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45711k<Boolean> enableEncodedImageColorSpaceUsage;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public final Integer imageTranscoderType;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45711k<Boolean> isPrefetchEnabledSupplier;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final C43909b mainDiskCacheConfig;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC46675d memoryTrimmableRegistry;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int memoryChunkType;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5719p0<?> networkFetcher;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final int httpNetworkTimeout;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public final AbstractC43387c platformBitmapFactory;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final C0146g0 poolFactory;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45424e progressiveJpegConfig;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Set<InterfaceC46705d> requestListeners;

    /* JADX INFO: compiled from: ImagePipelineConfig.kt */
    @Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0003\u001a\u0004\b!\u0010\"¨\u0006$"}, m90084d2 = {"Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Companion;", "", "<init>", "()V", "", "resetDefaultRequestConfig", "Landroid/content/Context;", "context", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", "newBuilder", "(Landroid/content/Context;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", "Le4/b;", "webpBitmapFactory", "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;", "imagePipelineExperiments", "Le4/a;", "bitmapCreator", "d", "(Le4/b;Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;Le4/a;)V", "Lr3/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;)Lr3/b;", "builder", "Le6/d;", "b", "(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;)Le6/d;", "", "c", "(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;)I", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;", "value", "defaultImageRequestConfig", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;", "getDefaultImageRequestConfig", "()Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;", "getDefaultImageRequestConfig$annotations", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nImagePipelineConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePipelineConfig.kt\ncom/facebook/imagepipeline/core/ImagePipelineConfig$Companion\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,577:1\n40#2,9:578\n*S KotlinDebug\n*F\n+ 1 ImagePipelineConfig.kt\ncom/facebook/imagepipeline/core/ImagePipelineConfig$Companion\n*L\n537#1:578,9\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: d */
        public final void m9278d(InterfaceC37071b webpBitmapFactory, ImagePipelineExperiments imagePipelineExperiments, InterfaceC37070a bitmapCreator) {
            C37072c.f82331c = webpBitmapFactory;
            imagePipelineExperiments.m9362z();
            if (bitmapCreator != null) {
                webpBitmapFactory.m82966a(bitmapCreator);
            }
        }

        @JvmStatic
        @NotNull
        public final C5651a newBuilder(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C5651a(context);
        }

        @JvmStatic
        @VisibleForTesting
        public final void resetDefaultRequestConfig() {
            ImagePipelineConfig.f8931O = new C5652b();
        }

        /* JADX INFO: renamed from: a */
        public final C43909b m9275a(Context context) {
            C43909b c43909bM96747n;
            if (!C36621b.m81959d()) {
                c43909bM96747n = C43909b.m96721m(context).m96747n();
            } else {
                C36621b.m81957a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
                try {
                    c43909bM96747n = C43909b.m96721m(context).m96747n();
                    C36621b.m81958b();
                } catch (Throwable th2) {
                    C36621b.m81958b();
                    throw th2;
                }
            }
            Intrinsics.checkNotNullExpressionValue(c43909bM96747n, "traceSection(...)");
            return c43909bM96747n;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC37079d m9276b(C5651a builder) {
            if (builder.getImageTranscoderFactory() != null && builder.getImageTranscoderType() != null) {
                throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
            }
            return builder.getImageTranscoderFactory();
        }

        /* JADX INFO: renamed from: c */
        public final int m9277c(C5651a builder, ImagePipelineExperiments imagePipelineExperiments) {
            Integer memoryChunkType = builder.getMemoryChunkType();
            if (memoryChunkType != null) {
                return memoryChunkType.intValue();
            }
            if (imagePipelineExperiments.getMemoryType() == 2 && Build.VERSION.SDK_INT >= 27) {
                return 2;
            }
            if (imagePipelineExperiments.getMemoryType() == 1) {
                return 1;
            }
            imagePipelineExperiments.getMemoryType();
            return 0;
        }

        @NotNull
        public final C5652b getDefaultImageRequestConfig() {
            return ImagePipelineConfig.f8931O;
        }

        @JvmStatic
        public static /* synthetic */ void getDefaultImageRequestConfig$annotations() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.core.ImagePipelineConfig$a */
    /* JADX INFO: compiled from: ImagePipelineConfig.kt */
    @Metadata(m90083d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR4\u0010%\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$R4\u0010,\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R(\u00101\u001a\u0004\u0018\u00010-2\b\u0010\u001b\u001a\u0004\u0018\u00010-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b/\u00100R(\u00104\u001a\u0004\u0018\u00010-2\b\u0010\u001b\u001a\u0004\u0018\u00010-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00100R(\u00109\u001a\u0004\u0018\u0001052\b\u0010\u001b\u001a\u0004\u0018\u0001058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010:\u001a\u0004\b;\u0010<R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\b>\u0010?R4\u0010B\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b@\u0010\"\u001a\u0004\bA\u0010$R(\u0010H\u001a\u0004\u0018\u00010C2\b\u0010\u001b\u001a\u0004\u0018\u00010C8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR(\u0010M\u001a\u0004\u0018\u00010I2\b\u0010\u001b\u001a\u0004\u0018\u00010I8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u0010J\u001a\u0004\bK\u0010LR(\u0010S\u001a\u0004\u0018\u00010N2\b\u0010\u001b\u001a\u0004\u0018\u00010N8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR4\u0010W\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010 2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bU\u0010\"\u001a\u0004\bV\u0010$R(\u0010]\u001a\u0004\u0018\u00010X2\b\u0010\u001b\u001a\u0004\u0018\u00010X8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R*\u0010f\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b>\u0010_\u0012\u0004\bd\u0010e\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR4\u0010i\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010 2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020T\u0018\u00010 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bg\u0010\"\u001a\u0004\bh\u0010$R(\u0010n\u001a\u0004\u0018\u00010j2\b\u0010\u001b\u001a\u0004\u0018\u00010j8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bV\u0010k\u001a\u0004\bl\u0010mR(\u0010t\u001a\u0004\u0018\u00010o2\b\u0010\u001b\u001a\u0004\u0018\u00010o8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR*\u0010x\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bA\u0010_\u0012\u0004\bw\u0010e\u001a\u0004\bu\u0010a\"\u0004\bv\u0010cR0\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u0010y\u001a\u0004\bz\u0010{R)\u0010\u0080\u0001\u001a\u0004\u0018\u00010|2\b\u0010\u001b\u001a\u0004\u0018\u00010|8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bF\u0010}\u001a\u0004\b~\u0010\u007fR/\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0081\u00012\t\u0010\u001b\u001a\u0005\u0018\u00010\u0081\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R/\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u0087\u00012\t\u0010\u001b\u001a\u0005\u0018\u00010\u0087\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R8\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R:\u0010\u0093\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0091\u0001\u0018\u00010\u000e2\u000f\u0010\u001b\u001a\u000b\u0012\u0005\u0012\u00030\u0091\u0001\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bK\u0010\u008e\u0001\u001a\u0006\b\u0092\u0001\u0010\u0090\u0001R9\u0010\u0095\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0094\u0001\u0018\u00010\u000e2\u000f\u0010\u001b\u001a\u000b\u0012\u0005\u0012\u00030\u0094\u0001\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\bQ\u0010\u008e\u0001\u001a\u0005\bO\u0010\u0090\u0001R)\u0010\u009a\u0001\u001a\u00020T2\u0006\u0010\u001b\u001a\u00020T8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R*\u0010\u009c\u0001\u001a\u0004\u0018\u00010j2\b\u0010\u001b\u001a\u0004\u0018\u00010j8\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\b[\u0010k\u001a\u0005\b\u009b\u0001\u0010mR.\u0010 \u0001\u001a\u0005\u0018\u00010\u009d\u00012\t\u0010\u001b\u001a\u0005\u0018\u00010\u009d\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b`\u0010\u009e\u0001\u001a\u0006\b\u0088\u0001\u0010\u009f\u0001R7\u0010¢\u0001\u001a\u000b\u0012\u0005\u0012\u00030¡\u0001\u0018\u00010 2\u000f\u0010\u001b\u001a\u000b\u0012\u0005\u0012\u00030¡\u0001\u0018\u00010 8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bl\u0010\"\u001a\u0004\bY\u0010$R+\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u00138\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\bu\u0010£\u0001\u001a\u0006\b\u0096\u0001\u0010¤\u0001R(\u0010¦\u0001\u001a\u00020^2\u0006\u0010\u001b\u001a\u00020^8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\br\u0010\u0084\u0001\u001a\u0006\b\u008d\u0001\u0010¥\u0001R\u001c\u0010ª\u0001\u001a\u00030§\u00018\u0006¢\u0006\u000f\n\u0005\bz\u0010¨\u0001\u001a\u0006\b\u0082\u0001\u0010©\u0001R'\u0010«\u0001\u001a\u00020T2\u0006\u0010\u001b\u001a\u00020T8\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b~\u0010\u0097\u0001\u001a\u0005\bU\u0010\u0099\u0001R*\u0010¯\u0001\u001a\u00030¬\u00012\u0007\u0010\u001b\u001a\u00030¬\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u00ad\u0001\u001a\u0005\bD\u0010®\u0001RH\u0010´\u0001\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0005\u0012\u00030±\u0001\u0018\u00010°\u00012\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0005\u0012\u00030±\u0001\u0018\u00010°\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u008a\u0001\u0010²\u0001\u001a\u0005\b(\u0010³\u0001RH\u0010¶\u0001\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0005\u0012\u00030µ\u0001\u0018\u00010°\u00012\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020'\u0012\u0005\u0012\u00030µ\u0001\u0018\u00010°\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u0092\u0001\u0010²\u0001\u001a\u0005\bp\u0010³\u0001R/\u0010»\u0001\u001a\u0005\u0018\u00010·\u00012\t\u0010\u001b\u001a\u0005\u0018\u00010·\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001R.\u0010¿\u0001\u001a\u0005\u0018\u00010¼\u00012\t\u0010\u001b\u001a\u0005\u0018\u00010¼\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b\u0098\u0001\u0010½\u0001\u001a\u0005\b2\u0010¾\u0001RH\u0010Ä\u0001\u001a\u0012\u0012\u0005\u0012\u00030Á\u0001\u0012\u0004\u0012\u00020j\u0018\u00010À\u00012\u0016\u0010\u001b\u001a\u0012\u0012\u0005\u0012\u00030Á\u0001\u0012\u0004\u0012\u00020j\u0018\u00010À\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b¹\u0001\u0010Â\u0001\u001a\u0005\bg\u0010Ã\u0001R.\u0010Æ\u0001\u001a\u0005\u0018\u00010Å\u00012\t\u0010\u001b\u001a\u0005\u0018\u00010Å\u00018\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0005\b@\u0010È\u0001¨\u0006É\u0001"}, m90084d2 = {"Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "Q", "(Lcom/facebook/imagepipeline/core/DownsampleMode;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", "Lcom/facebook/imagepipeline/producers/p0;", "networkFetcher", ExifInterface.LATITUDE_SOUTH, "(Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", "", "Lz5/d;", "requestListeners", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/util/Set;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", "Lv5/c;", "imageDecoderConfig", "R", "(Lv5/c;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/facebook/imagepipeline/core/ImagePipelineConfig;", "Landroid/graphics/Bitmap$Config;", "value", "Landroid/graphics/Bitmap$Config;", "b", "()Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Lw3/k;", "Lq5/q;", "Lw3/k;", "f", "()Lw3/k;", "bitmapMemoryCacheParamsSupplier", "Lcom/facebook/imagepipeline/cache/c$b;", "Lq3/a;", "c", "Lcom/facebook/imagepipeline/cache/c$b;", "d", "()Lcom/facebook/imagepipeline/cache/c$b;", "bitmapMemoryCacheEntryStateObserver", "Lcom/facebook/imagepipeline/cache/f$a;", "Lcom/facebook/imagepipeline/cache/f$a;", "g", "()Lcom/facebook/imagepipeline/cache/f$a;", "bitmapMemoryCacheTrimStrategy", "e", "t", "encodedMemoryCacheTrimStrategy", "Lq5/h;", "Lq5/h;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lq5/h;", "cacheKeyFactory", "Landroid/content/Context;", "k", "()Landroid/content/Context;", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "o", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "i", CmcdData.Factory.STREAMING_FORMAT_SS, "encodedMemoryCacheParamsSupplier", "Ls5/n;", "j", "Ls5/n;", "u", "()Ls5/n;", "executorSupplier", "Lq5/n;", "Lq5/n;", "y", "()Lq5/n;", "imageCacheStatsTracker", "Lv5/b;", CmcdData.Factory.STREAM_TYPE_LIVE, "Lv5/b;", "z", "()Lv5/b;", "imageDecoder", "", "m", "q", "enableEncodedImageColorSpaceUsage", "Le6/d;", "n", "Le6/d;", "B", "()Le6/d;", "imageTranscoderFactory", "", "Ljava/lang/Integer;", "C", "()Ljava/lang/Integer;", "setImageTranscoderType", "(Ljava/lang/Integer;)V", "getImageTranscoderType$annotations", "()V", "imageTranscoderType", "p", "P", "isPrefetchEnabledSupplier", "Lr3/b;", "Lr3/b;", "D", "()Lr3/b;", "mainDiskCacheConfig", "Lz3/d;", "r", "Lz3/d;", "F", "()Lz3/d;", "memoryTrimmableRegistry", ExifInterface.LONGITUDE_EAST, "setMemoryChunkType", "getMemoryChunkType$annotations", "memoryChunkType", "Lcom/facebook/imagepipeline/producers/p0;", "G", "()Lcom/facebook/imagepipeline/producers/p0;", "Lp5/c;", "Lp5/c;", "H", "()Lp5/c;", "platformBitmapFactory", "La6/g0;", "v", "La6/g0;", "I", "()La6/g0;", "poolFactory", "Lv5/e;", "w", "Lv5/e;", "J", "()Lv5/e;", "progressiveJpegConfig", "x", "Ljava/util/Set;", "L", "()Ljava/util/Set;", "Lz5/c;", "K", "requestListener2s", "Lcom/facebook/imagepipeline/producers/n;", "customProducerSequenceFactories", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Z", "M", "()Z", "resizeAndRotateEnabledForNetwork", "O", "smallImageDiskCacheConfig", "Ls5/o;", "Ls5/o;", "()Ls5/o;", "fileCacheFactory", "Ls5/b;", "diskCachesStoreSupplier", "Lv5/c;", "()Lv5/c;", "()I", "httpConnectionTimeout", "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;", "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;", "()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;", "experimentsBuilder", "diskCacheEnabled", "Lu5/a;", "Lu5/a;", "()Lu5/a;", "closeableReferenceLeakTracker", "Lcom/facebook/imagepipeline/cache/f;", "Lx5/e;", "Lcom/facebook/imagepipeline/cache/f;", "()Lcom/facebook/imagepipeline/cache/f;", "bitmapMemoryCache", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCache", "Lu3/g;", "Lu3/g;", "N", "()Lu3/g;", "serialExecutorServiceForAnimatedImages", "Lcom/facebook/imagepipeline/cache/a;", "Lcom/facebook/imagepipeline/cache/a;", "()Lcom/facebook/imagepipeline/cache/a;", "bitmapMemoryCacheFactory", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", "dynamicDiskCacheConfigMap", "Ls3/a;", "callerContextVerifier", "Ls3/a;", "()Ls3/a;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nImagePipelineConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePipelineConfig.kt\ncom/facebook/imagepipeline/core/ImagePipelineConfig$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,577:1\n1#2:578\n*E\n"})
    public static final class C5651a {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        public boolean resizeAndRotateEnabledForNetwork;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        @Nullable
        public C43909b smallImageDiskCacheConfig;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        @Nullable
        public InterfaceC44343o fileCacheFactory;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        @Nullable
        public InterfaceC45711k<InterfaceC44317b> diskCachesStoreSupplier;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        @Nullable
        public C45422c imageDecoderConfig;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        public int httpConnectionTimeout;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        @NotNull
        public final ImagePipelineExperiments.C5653a experimentsBuilder;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        public boolean diskCacheEnabled;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        @NotNull
        public InterfaceC45123a closeableReferenceLeakTracker;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        @Nullable
        public InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> bitmapMemoryCache;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        @Nullable
        public InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> encodedMemoryCache;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        @Nullable
        public InterfaceExecutorServiceC45104g serialExecutorServiceForAnimatedImages;

        /* JADX INFO: renamed from: M, reason: from kotlin metadata */
        @Nullable
        public InterfaceC5643a bitmapMemoryCacheFactory;

        /* JADX INFO: renamed from: N, reason: from kotlin metadata */
        @Nullable
        public Map<String, ? extends C43909b> dynamicDiskCacheConfigMap;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Bitmap.Config bitmapConfig;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public InterfaceC45711k<C43628q> bitmapMemoryCacheParamsSupplier;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public InterfaceC5645c.b<InterfaceC43595a> bitmapMemoryCacheEntryStateObserver;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public InterfaceC5648f.a bitmapMemoryCacheTrimStrategy;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public InterfaceC5648f.a encodedMemoryCacheTrimStrategy;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public InterfaceC43619h cacheKeyFactory;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final Context context;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public DownsampleMode downsampleMode;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public InterfaceC45711k<C43628q> encodedMemoryCacheParamsSupplier;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public InterfaceC44341n executorSupplier;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public InterfaceC43625n imageCacheStatsTracker;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @Nullable
        public InterfaceC45421b imageDecoder;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @Nullable
        public InterfaceC45711k<Boolean> enableEncodedImageColorSpaceUsage;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @Nullable
        public InterfaceC37079d imageTranscoderFactory;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @Nullable
        public Integer imageTranscoderType;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @Nullable
        public InterfaceC45711k<Boolean> isPrefetchEnabledSupplier;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @Nullable
        public C43909b mainDiskCacheConfig;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @Nullable
        public InterfaceC46675d memoryTrimmableRegistry;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @Nullable
        public Integer memoryChunkType;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @Nullable
        public InterfaceC5719p0<?> networkFetcher;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @Nullable
        public AbstractC43387c platformBitmapFactory;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @Nullable
        public C0146g0 poolFactory;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @Nullable
        public InterfaceC45424e progressiveJpegConfig;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        @Nullable
        public Set<? extends InterfaceC46705d> requestListeners;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        @Nullable
        public Set<? extends InterfaceC46704c> requestListener2s;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        @Nullable
        public Set<? extends C5714n> customProducerSequenceFactories;

        @Nullable
        /* JADX INFO: renamed from: i */
        public final InterfaceC44276a m9307i() {
            return null;
        }

        public C5651a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.downsampleMode = DownsampleMode.AUTO;
            this.resizeAndRotateEnabledForNetwork = true;
            this.httpConnectionTimeout = -1;
            this.experimentsBuilder = new ImagePipelineExperiments.C5653a(this);
            this.diskCacheEnabled = true;
            this.closeableReferenceLeakTracker = new C45124b();
            this.context = context;
        }

        @Nullable
        /* JADX INFO: renamed from: A, reason: from getter */
        public final C45422c getImageDecoderConfig() {
            return this.imageDecoderConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: B, reason: from getter */
        public final InterfaceC37079d getImageTranscoderFactory() {
            return this.imageTranscoderFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: C, reason: from getter */
        public final Integer getImageTranscoderType() {
            return this.imageTranscoderType;
        }

        @Nullable
        /* JADX INFO: renamed from: D, reason: from getter */
        public final C43909b getMainDiskCacheConfig() {
            return this.mainDiskCacheConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: E, reason: from getter */
        public final Integer getMemoryChunkType() {
            return this.memoryChunkType;
        }

        @Nullable
        /* JADX INFO: renamed from: F, reason: from getter */
        public final InterfaceC46675d getMemoryTrimmableRegistry() {
            return this.memoryTrimmableRegistry;
        }

        @Nullable
        /* JADX INFO: renamed from: G */
        public final InterfaceC5719p0<?> m9285G() {
            return this.networkFetcher;
        }

        @Nullable
        /* JADX INFO: renamed from: H, reason: from getter */
        public final AbstractC43387c getPlatformBitmapFactory() {
            return this.platformBitmapFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: I, reason: from getter */
        public final C0146g0 getPoolFactory() {
            return this.poolFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: J, reason: from getter */
        public final InterfaceC45424e getProgressiveJpegConfig() {
            return this.progressiveJpegConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: K */
        public final Set<InterfaceC46704c> m9289K() {
            return this.requestListener2s;
        }

        @Nullable
        /* JADX INFO: renamed from: L */
        public final Set<InterfaceC46705d> m9290L() {
            return this.requestListeners;
        }

        /* JADX INFO: renamed from: M, reason: from getter */
        public final boolean getResizeAndRotateEnabledForNetwork() {
            return this.resizeAndRotateEnabledForNetwork;
        }

        @Nullable
        /* JADX INFO: renamed from: N, reason: from getter */
        public final InterfaceExecutorServiceC45104g getSerialExecutorServiceForAnimatedImages() {
            return this.serialExecutorServiceForAnimatedImages;
        }

        @Nullable
        /* JADX INFO: renamed from: O, reason: from getter */
        public final C43909b getSmallImageDiskCacheConfig() {
            return this.smallImageDiskCacheConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: P */
        public final InterfaceC45711k<Boolean> m9294P() {
            return this.isPrefetchEnabledSupplier;
        }

        @NotNull
        /* JADX INFO: renamed from: Q */
        public final C5651a m9295Q(@NotNull DownsampleMode downsampleMode) {
            Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
            this.downsampleMode = downsampleMode;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: R */
        public final C5651a m9296R(@Nullable C45422c imageDecoderConfig) {
            this.imageDecoderConfig = imageDecoderConfig;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: S */
        public final C5651a m9297S(@Nullable InterfaceC5719p0<?> networkFetcher) {
            this.networkFetcher = networkFetcher;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: T */
        public final C5651a m9298T(@Nullable Set<? extends InterfaceC46705d> requestListeners) {
            this.requestListeners = requestListeners;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ImagePipelineConfig m9299a() {
            return new ImagePipelineConfig(this, null);
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Bitmap.Config getBitmapConfig() {
            return this.bitmapConfig;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> m9301c() {
            return this.bitmapMemoryCache;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final InterfaceC5645c.b<InterfaceC43595a> m9302d() {
            return this.bitmapMemoryCacheEntryStateObserver;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final InterfaceC5643a getBitmapMemoryCacheFactory() {
            return this.bitmapMemoryCacheFactory;
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public final InterfaceC45711k<C43628q> m9304f() {
            return this.bitmapMemoryCacheParamsSupplier;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final InterfaceC5648f.a getBitmapMemoryCacheTrimStrategy() {
            return this.bitmapMemoryCacheTrimStrategy;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public final InterfaceC43619h getCacheKeyFactory() {
            return this.cacheKeyFactory;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final InterfaceC45123a getCloseableReferenceLeakTracker() {
            return this.closeableReferenceLeakTracker;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        @Nullable
        /* JADX INFO: renamed from: l */
        public final Set<C5714n> m9310l() {
            return this.customProducerSequenceFactories;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getDiskCacheEnabled() {
            return this.diskCacheEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: n */
        public final InterfaceC45711k<InterfaceC44317b> m9312n() {
            return this.diskCachesStoreSupplier;
        }

        @NotNull
        /* JADX INFO: renamed from: o, reason: from getter */
        public final DownsampleMode getDownsampleMode() {
            return this.downsampleMode;
        }

        @Nullable
        /* JADX INFO: renamed from: p */
        public final Map<String, C43909b> m9314p() {
            return this.dynamicDiskCacheConfigMap;
        }

        @Nullable
        /* JADX INFO: renamed from: q */
        public final InterfaceC45711k<Boolean> m9315q() {
            return this.enableEncodedImageColorSpaceUsage;
        }

        @Nullable
        /* JADX INFO: renamed from: r */
        public final InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> m9316r() {
            return this.encodedMemoryCache;
        }

        @Nullable
        /* JADX INFO: renamed from: s */
        public final InterfaceC45711k<C43628q> m9317s() {
            return this.encodedMemoryCacheParamsSupplier;
        }

        @Nullable
        /* JADX INFO: renamed from: t, reason: from getter */
        public final InterfaceC5648f.a getEncodedMemoryCacheTrimStrategy() {
            return this.encodedMemoryCacheTrimStrategy;
        }

        @Nullable
        /* JADX INFO: renamed from: u, reason: from getter */
        public final InterfaceC44341n getExecutorSupplier() {
            return this.executorSupplier;
        }

        @NotNull
        /* JADX INFO: renamed from: v, reason: from getter */
        public final ImagePipelineExperiments.C5653a getExperimentsBuilder() {
            return this.experimentsBuilder;
        }

        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public final InterfaceC44343o getFileCacheFactory() {
            return this.fileCacheFactory;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final int getHttpConnectionTimeout() {
            return this.httpConnectionTimeout;
        }

        @Nullable
        /* JADX INFO: renamed from: y, reason: from getter */
        public final InterfaceC43625n getImageCacheStatsTracker() {
            return this.imageCacheStatsTracker;
        }

        @Nullable
        /* JADX INFO: renamed from: z, reason: from getter */
        public final InterfaceC45421b getImageDecoder() {
            return this.imageDecoder;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.core.ImagePipelineConfig$b */
    /* JADX INFO: compiled from: ImagePipelineConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/imagepipeline/core/ImagePipelineConfig$b;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "()Z", "setProgressiveRenderingEnabled", "(Z)V", "isProgressiveRenderingEnabled", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C5652b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isProgressiveRenderingEnabled;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsProgressiveRenderingEnabled() {
            return this.isProgressiveRenderingEnabled;
        }
    }

    public /* synthetic */ ImagePipelineConfig(C5651a c5651a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5651a);
    }

    @Override // p617s5.InterfaceC44346r
    @Nullable
    /* JADX INFO: renamed from: G */
    public InterfaceC44276a mo9247G() {
        return null;
    }

    public ImagePipelineConfig(C5651a c5651a) {
        InterfaceC5719p0<?> interfaceC5719p0M9285G;
        if (C36621b.m81959d()) {
            C36621b.m81957a("ImagePipelineConfig()");
        }
        this.experiments = c5651a.getExperimentsBuilder().m9363a();
        InterfaceC45711k<C43628q> interfaceC45711kM9304f = c5651a.m9304f();
        if (interfaceC45711kM9304f == null) {
            Object systemService = c5651a.getContext().getSystemService("activity");
            if (systemService == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            interfaceC45711kM9304f = new C43621j((ActivityManager) systemService);
        }
        this.bitmapMemoryCacheParamsSupplier = interfaceC45711kM9304f;
        InterfaceC5648f.a bitmapMemoryCacheTrimStrategy = c5651a.getBitmapMemoryCacheTrimStrategy();
        this.bitmapMemoryCacheTrimStrategy = bitmapMemoryCacheTrimStrategy == null ? new BitmapMemoryCacheTrimStrategy() : bitmapMemoryCacheTrimStrategy;
        InterfaceC5648f.a encodedMemoryCacheTrimStrategy = c5651a.getEncodedMemoryCacheTrimStrategy();
        this.encodedMemoryCacheTrimStrategy = encodedMemoryCacheTrimStrategy == null ? new C5649g() : encodedMemoryCacheTrimStrategy;
        this.bitmapMemoryCacheEntryStateObserver = c5651a.m9302d();
        Bitmap.Config bitmapConfig = c5651a.getBitmapConfig();
        this.bitmapConfig = bitmapConfig == null ? Bitmap.Config.ARGB_8888 : bitmapConfig;
        InterfaceC43619h cacheKeyFactory = c5651a.getCacheKeyFactory();
        if (cacheKeyFactory == null) {
            cacheKeyFactory = C43622k.m95991f();
            Intrinsics.checkNotNullExpressionValue(cacheKeyFactory, "getInstance(...)");
        }
        this.cacheKeyFactory = cacheKeyFactory;
        Context context = c5651a.getContext();
        if (context == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.context = context;
        this.downsampleMode = c5651a.getDownsampleMode();
        InterfaceC45711k<C43628q> interfaceC45711kM9317s = c5651a.m9317s();
        this.encodedMemoryCacheParamsSupplier = interfaceC45711kM9317s == null ? new C43623l() : interfaceC45711kM9317s;
        InterfaceC43625n imageCacheStatsTracker = c5651a.getImageCacheStatsTracker();
        if (imageCacheStatsTracker == null) {
            imageCacheStatsTracker = C43630s.m96020o();
            Intrinsics.checkNotNullExpressionValue(imageCacheStatsTracker, "getInstance(...)");
        }
        this.imageCacheStatsTracker = imageCacheStatsTracker;
        this.imageDecoder = c5651a.getImageDecoder();
        InterfaceC45711k<Boolean> BOOLEAN_FALSE = c5651a.m9315q();
        if (BOOLEAN_FALSE == null) {
            BOOLEAN_FALSE = C45712l.f103052b;
            Intrinsics.checkNotNullExpressionValue(BOOLEAN_FALSE, "BOOLEAN_FALSE");
        }
        this.enableEncodedImageColorSpaceUsage = BOOLEAN_FALSE;
        Companion companion = INSTANCE;
        this.imageTranscoderFactory = companion.m9276b(c5651a);
        this.imageTranscoderType = c5651a.getImageTranscoderType();
        InterfaceC45711k<Boolean> BOOLEAN_TRUE = c5651a.m9294P();
        if (BOOLEAN_TRUE == null) {
            BOOLEAN_TRUE = C45712l.f103051a;
            Intrinsics.checkNotNullExpressionValue(BOOLEAN_TRUE, "BOOLEAN_TRUE");
        }
        this.isPrefetchEnabledSupplier = BOOLEAN_TRUE;
        C43909b mainDiskCacheConfig = c5651a.getMainDiskCacheConfig();
        this.mainDiskCacheConfig = mainDiskCacheConfig == null ? companion.m9275a(c5651a.getContext()) : mainDiskCacheConfig;
        InterfaceC46675d memoryTrimmableRegistry = c5651a.getMemoryTrimmableRegistry();
        if (memoryTrimmableRegistry == null) {
            memoryTrimmableRegistry = C46676e.m102898b();
            Intrinsics.checkNotNullExpressionValue(memoryTrimmableRegistry, "getInstance(...)");
        }
        this.memoryTrimmableRegistry = memoryTrimmableRegistry;
        this.memoryChunkType = companion.m9277c(c5651a, getExperiments());
        int httpConnectionTimeout = c5651a.getHttpConnectionTimeout() < 0 ? 30000 : c5651a.getHttpConnectionTimeout();
        this.httpNetworkTimeout = httpConnectionTimeout;
        if (C36621b.m81959d()) {
            C36621b.m81957a("ImagePipelineConfig->mNetworkFetcher");
            try {
                interfaceC5719p0M9285G = c5651a.m9285G();
                interfaceC5719p0M9285G = interfaceC5719p0M9285G == null ? new C5680b0(httpConnectionTimeout) : interfaceC5719p0M9285G;
                C36621b.m81958b();
            } catch (Throwable th2) {
                C36621b.m81958b();
                throw th2;
            }
        } else {
            interfaceC5719p0M9285G = c5651a.m9285G();
            if (interfaceC5719p0M9285G == null) {
                interfaceC5719p0M9285G = new C5680b0(httpConnectionTimeout);
            }
        }
        this.networkFetcher = interfaceC5719p0M9285G;
        this.platformBitmapFactory = c5651a.getPlatformBitmapFactory();
        C0146g0 poolFactory = c5651a.getPoolFactory();
        this.poolFactory = poolFactory == null ? new C0146g0(C0142e0.m628n().m654m()) : poolFactory;
        InterfaceC45424e progressiveJpegConfig = c5651a.getProgressiveJpegConfig();
        this.progressiveJpegConfig = progressiveJpegConfig == null ? new C45426g() : progressiveJpegConfig;
        Set<InterfaceC46705d> setM9290L = c5651a.m9290L();
        this.requestListeners = setM9290L == null ? SetsKt.emptySet() : setM9290L;
        Set<InterfaceC46704c> setM9289K = c5651a.m9289K();
        this.requestListener2s = setM9289K == null ? SetsKt.emptySet() : setM9289K;
        Set<C5714n> setM9310l = c5651a.m9310l();
        this.customProducerSequenceFactories = setM9310l == null ? SetsKt.emptySet() : setM9310l;
        this.isResizeAndRotateEnabledForNetwork = c5651a.getResizeAndRotateEnabledForNetwork();
        C43909b smallImageDiskCacheConfig = c5651a.getSmallImageDiskCacheConfig();
        this.smallImageDiskCacheConfig = smallImageDiskCacheConfig == null ? getMainDiskCacheConfig() : smallImageDiskCacheConfig;
        this.imageDecoderConfig = c5651a.getImageDecoderConfig();
        int iM673e = getPoolFactory().m673e();
        InterfaceC44341n executorSupplier = c5651a.getExecutorSupplier();
        this.executorSupplier = executorSupplier == null ? new DefaultExecutorSupplier(iM673e) : executorSupplier;
        this.isDiskCacheEnabled = c5651a.getDiskCacheEnabled();
        c5651a.m9307i();
        this.closeableReferenceLeakTracker = c5651a.getCloseableReferenceLeakTracker();
        this.bitmapCacheOverride = c5651a.m9301c();
        InterfaceC5643a bitmapMemoryCacheFactory = c5651a.getBitmapMemoryCacheFactory();
        this.bitmapMemoryCacheFactory = bitmapMemoryCacheFactory == null ? new C5644b() : bitmapMemoryCacheFactory;
        this.encodedMemoryCacheOverride = c5651a.m9316r();
        this.executorServiceForAnimatedImages = c5651a.getSerialExecutorServiceForAnimatedImages();
        this.dynamicDiskCacheConfigMap = c5651a.m9314p();
        InterfaceC45711k<InterfaceC44317b> interfaceC45711kM9312n = c5651a.m9312n();
        if (interfaceC45711kM9312n == null) {
            InterfaceC44343o fileCacheFactory = c5651a.getFileCacheFactory();
            interfaceC45711kM9312n = new C44333j(fileCacheFactory == null ? new C44335k(new C44339m()) : fileCacheFactory, this);
        }
        this.diskCachesStoreSupplier = interfaceC45711kM9312n;
        InterfaceC37071b interfaceC37071bM9361y = getExperiments().getWebpBitmapFactory();
        if (interfaceC37071bM9361y != null) {
            companion.m9278d(interfaceC37071bM9361y, getExperiments(), new HoneycombBitmapCreator(getPoolFactory()));
        }
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public static final C5652b m9239K() {
        return INSTANCE.getDefaultImageRequestConfig();
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: L */
    public static final C5651a m9240L(@NotNull Context context) {
        return INSTANCE.newBuilder(context);
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: A */
    public InterfaceC45711k<InterfaceC44317b> mo9241A() {
        return this.diskCachesStoreSupplier;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: B, reason: from getter */
    public InterfaceC5643a getBitmapMemoryCacheFactory() {
        return this.bitmapMemoryCacheFactory;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: C, reason: from getter */
    public InterfaceC43619h getCacheKeyFactory() {
        return this.cacheKeyFactory;
    }

    @Override // p617s5.InterfaceC44346r
    /* JADX INFO: renamed from: D, reason: from getter */
    public boolean getIsResizeAndRotateEnabledForNetwork() {
        return this.isResizeAndRotateEnabledForNetwork;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: E */
    public Set<C5714n> mo9245E() {
        return this.customProducerSequenceFactories;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: F, reason: from getter */
    public DownsampleMode getDownsampleMode() {
        return this.downsampleMode;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: H, reason: from getter */
    public InterfaceC44341n getExecutorSupplier() {
        return this.executorSupplier;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: a */
    public Set<InterfaceC46704c> mo9249a() {
        return this.requestListener2s;
    }

    @Override // p617s5.InterfaceC44346r
    @Nullable
    /* JADX INFO: renamed from: b */
    public InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> mo9250b() {
        return this.encodedMemoryCacheOverride;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public InterfaceC45424e getProgressiveJpegConfig() {
        return this.progressiveJpegConfig;
    }

    @Override // p617s5.InterfaceC44346r
    @Nullable
    /* JADX INFO: renamed from: d */
    public Map<String, C43909b> mo9252d() {
        return this.dynamicDiskCacheConfigMap;
    }

    @Override // p617s5.InterfaceC44346r
    @Nullable
    /* JADX INFO: renamed from: e */
    public InterfaceC5645c.b<InterfaceC43595a> mo9253e() {
        return this.bitmapMemoryCacheEntryStateObserver;
    }

    @Override // p617s5.InterfaceC44346r
    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getIsDiskCacheEnabled() {
        return this.isDiskCacheEnabled;
    }

    @Override // p617s5.InterfaceC44346r
    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public InterfaceC45421b getImageDecoder() {
        return this.imageDecoder;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    public Context getContext() {
        return this.context;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: h */
    public InterfaceC45711k<C43628q> mo9256h() {
        return this.encodedMemoryCacheParamsSupplier;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public C0146g0 getPoolFactory() {
        return this.poolFactory;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public InterfaceC45123a getCloseableReferenceLeakTracker() {
        return this.closeableReferenceLeakTracker;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public InterfaceC43625n getImageCacheStatsTracker() {
        return this.imageCacheStatsTracker;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: l */
    public InterfaceC45711k<Boolean> mo9260l() {
        return this.isPrefetchEnabledSupplier;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public InterfaceC46675d getMemoryTrimmableRegistry() {
        return this.memoryTrimmableRegistry;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public ImagePipelineExperiments getExperiments() {
        return this.experiments;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: o */
    public InterfaceC5719p0<?> mo9263o() {
        return this.networkFetcher;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public C43909b getMainDiskCacheConfig() {
        return this.mainDiskCacheConfig;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: q */
    public Set<InterfaceC46705d> mo9265q() {
        return this.requestListeners;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public InterfaceC5648f.a getEncodedMemoryCacheTrimStrategy() {
        return this.encodedMemoryCacheTrimStrategy;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter */
    public InterfaceC5648f.a getBitmapMemoryCacheTrimStrategy() {
        return this.bitmapMemoryCacheTrimStrategy;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public C43909b getSmallImageDiskCacheConfig() {
        return this.smallImageDiskCacheConfig;
    }

    @Override // p617s5.InterfaceC44346r
    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public InterfaceExecutorServiceC45104g getExecutorServiceForAnimatedImages() {
        return this.executorServiceForAnimatedImages;
    }

    @Override // p617s5.InterfaceC44346r
    @Nullable
    /* JADX INFO: renamed from: v, reason: from getter */
    public Integer getImageTranscoderType() {
        return this.imageTranscoderType;
    }

    @Override // p617s5.InterfaceC44346r
    @Nullable
    /* JADX INFO: renamed from: w, reason: from getter */
    public InterfaceC37079d getImageTranscoderFactory() {
        return this.imageTranscoderFactory;
    }

    @Override // p617s5.InterfaceC44346r
    @Nullable
    /* JADX INFO: renamed from: x, reason: from getter */
    public C45422c getImageDecoderConfig() {
        return this.imageDecoderConfig;
    }

    @Override // p617s5.InterfaceC44346r
    @NotNull
    /* JADX INFO: renamed from: y */
    public InterfaceC45711k<C43628q> mo9273y() {
        return this.bitmapMemoryCacheParamsSupplier;
    }

    @Override // p617s5.InterfaceC44346r
    /* JADX INFO: renamed from: z, reason: from getter */
    public int getMemoryChunkType() {
        return this.memoryChunkType;
    }
}
