package com.facebook.imagepipeline.core;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.cache.InterfaceC5648f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p034b6.C4497f;
import p221e4.InterfaceC37071b;
import p526p5.AbstractC43387c;
import p547q3.InterfaceC43595a;
import p549q5.InterfaceC43619h;
import p617s5.C44315a;
import p617s5.C44350v;
import p617s5.InterfaceC44317b;
import p617s5.InterfaceC44341n;
import p684v5.InterfaceC45421b;
import p684v5.InterfaceC45424e;
import p712w3.C45712l;
import p712w3.InterfaceC45711k;
import p749x5.InterfaceC46071e;
import p819z3.C46682k;
import p819z3.InterfaceC46672a;
import p819z3.InterfaceC46679h;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ImagePipelineExperiments.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 h2\u00020\u0001:\u0004\u0007\u0010\fiB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\b\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0019\u0010\nR\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0015\u0010!R\u0017\u0010$\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010&\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b\u001b\u0010!R\u0017\u0010(\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010\b\u001a\u0004\b\u0018\u0010\nR\u0017\u0010+\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010!R\u0017\u0010-\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010\b\u001a\u0004\b \u0010\nR\u0017\u0010/\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010\b\u001a\u0004\b.\u0010\nR\u0017\u00105\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0006068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010=\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010\b\u001a\u0004\b<\u0010\nR\u0017\u0010?\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b>\u0010\b\u001a\u0004\b'\u0010\nR\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u0006068\u0006¢\u0006\f\n\u0004\b@\u00108\u001a\u0004\bA\u0010:R\u0017\u0010E\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bC\u0010\b\u001a\u0004\bD\u0010\nR\u0017\u0010H\u001a\u00020F8\u0006¢\u0006\f\n\u0004\bA\u0010.\u001a\u0004\b1\u0010GR\u0017\u0010J\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bI\u0010\b\u001a\u0004\b,\u0010\nR\u0017\u0010K\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b%\u0010\nR\u0017\u0010M\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\bL\u0010\nR\u0017\u0010O\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\bN\u0010\nR\u0017\u0010Q\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\bP\u0010\nR\u0017\u0010T\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bR\u0010\b\u001a\u0004\bS\u0010\nR\u0017\u0010U\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\bI\u0010!R\u0017\u0010V\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bS\u0010\b\u001a\u0004\b\u0007\u0010\nR\u0017\u0010W\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bL\u0010\b\u001a\u0004\b)\u0010\nR\u0017\u0010X\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bP\u0010\b\u001a\u0004\b@\u0010\nR\u0017\u0010Y\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bN\u0010\b\u001a\u0004\b>\u0010\nR\u0017\u0010Z\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\bC\u0010\nR\u0017\u0010[\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b<\u0010\b\u001a\u0004\b\f\u0010\nR\u0017\u0010\\\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b9\u0010\b\u001a\u0004\b#\u0010\nR\u0017\u0010]\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b \u0010 \u001a\u0004\b\u0010\u0010!R\u0017\u0010_\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010\b\u001a\u0004\b^\u0010\nR\u0017\u0010c\u001a\u00020`8\u0006¢\u0006\f\n\u0004\b\t\u0010a\u001a\u0004\b7\u0010bR\u0019\u0010e\u001a\u0004\u0018\u00010d8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bR\u0010g¨\u0006j"}, m90084d2 = {"Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;", "", "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;", "builder", "<init>", "(Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "K", "()Z", "isWebpSupportEnabled", "b", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "isDecodeCancellationEnabled", "Le4/b;", "c", "Le4/b;", "y", "()Le4/b;", "webpBitmapFactory", "d", "x", "useDownsamplingRatioForResizing", "e", "w", "useBitmapPrepareToDraw", "f", "v", "useBalancedAnimationStrategy", "", "g", "I", "()I", "animationStrategyBufferLengthMilliseconds", CmcdData.Factory.STREAMING_FORMAT_HLS, "bitmapPrepareToDrawMinSizeBytes", "i", "bitmapPrepareToDrawMaxSizeBytes", "j", "bitmapPrepareToDrawForPrefetch", "k", "m", "maxBitmapDimension", CmcdData.Factory.STREAM_TYPE_LIVE, "isNativeCodeDisabled", "J", "isPartialImageCachingEnabled", "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;", "n", "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;", "p", "()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;", "producerFactoryMethod", "Lw3/k;", "o", "Lw3/k;", "H", "()Lw3/k;", "isLazyDataSource", "G", "isGingerbreadDecoderEnabled", "q", "downscaleFrameToDrawableDimensions", "r", "t", "suppressBitmapPrefetchingSupplier", CmcdData.Factory.STREAMING_FORMAT_SS, "F", "isExperimentalThreadHandoffQueueEnabled", "", "()J", "memoryType", "u", "keepCancelledFetchAsLowPriority", "downsampleIfLargeBitmap", "C", "isEncodedCacheEnabled", ExifInterface.LONGITUDE_EAST, "isEnsureTranscoderLibraryLoaded", "D", "isEncodedMemoryCacheProbingEnabled", "z", "B", "isDiskCacheProbingEnabled", "trackedKeysSize", "allowDelay", "handOffOnUiThreadOnly", "shouldStoreCacheEntrySize", "shouldIgnoreCacheSizeMismatch", "shouldUseDecodingBufferHelper", "allowProgressiveOnPrefetch", "cancelDecodeOnCacheMiss", "animationRenderFpsLimit", "getPrefetchShortcutEnabled", "prefetchShortcutEnabled", "Lb6/f;", "Lb6/f;", "()Lb6/f;", "platformDecoderOptions", "Le4/b$a;", "webpErrorLogger", "Le4/b$a;", "()Le4/b$a;", "L", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ImagePipelineExperiments {

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public final int trackedKeysSize;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public final boolean allowDelay;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final boolean handOffOnUiThreadOnly;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final boolean shouldStoreCacheEntrySize;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public final boolean shouldIgnoreCacheSizeMismatch;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final boolean shouldUseDecodingBufferHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final boolean allowProgressiveOnPrefetch;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final boolean cancelDecodeOnCacheMiss;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final int animationRenderFpsLimit;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final boolean prefetchShortcutEnabled;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public final C4497f platformDecoderOptions;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isWebpSupportEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isDecodeCancellationEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC37071b webpBitmapFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean useDownsamplingRatioForResizing;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean useBitmapPrepareToDraw;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean useBalancedAnimationStrategy;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int animationStrategyBufferLengthMilliseconds;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int bitmapPrepareToDrawMinSizeBytes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int bitmapPrepareToDrawMaxSizeBytes;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final boolean bitmapPrepareToDrawForPrefetch;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int maxBitmapDimension;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final boolean isNativeCodeDisabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final boolean isPartialImageCachingEnabled;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5655c producerFactoryMethod;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45711k<Boolean> isLazyDataSource;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final boolean isGingerbreadDecoderEnabled;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final boolean downscaleFrameToDrawableDimensions;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45711k<Boolean> suppressBitmapPrefetchingSupplier;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public final boolean isExperimentalThreadHandoffQueueEnabled;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final long memoryType;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final boolean keepCancelledFetchAsLowPriority;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final boolean downsampleIfLargeBitmap;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final boolean isEncodedCacheEnabled;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public final boolean isEnsureTranscoderLibraryLoaded;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public final boolean isEncodedMemoryCacheProbingEnabled;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public final boolean isDiskCacheProbingEnabled;

    /* JADX INFO: compiled from: ImagePipelineExperiments.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$Companion;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", "configBuilder", "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;", "newBuilder", "(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;)Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final C5653a newBuilder(@NotNull ImagePipelineConfig.C5651a configBuilder) {
            Intrinsics.checkNotNullParameter(configBuilder, "configBuilder");
            return new C5653a(configBuilder);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.core.ImagePipelineExperiments$a */
    /* JADX INFO: compiled from: ImagePipelineExperiments.kt */
    @Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0016\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0016\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0016\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u0016\u0010\u001f\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u0016\u0010%\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010\fR\u0016\u0010'\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0016\u0010)\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b(\u0010\fR\u0016\u0010+\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b*\u0010\fR\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u0001008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b4\u0010\fR\u0016\u00107\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b6\u0010\fR$\u0010:\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010\n0\n008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b9\u00102R\u0016\u0010<\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b;\u0010\fR\u0016\u0010@\u001a\u00020=8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bA\u0010\fR\u0016\u0010D\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010\fR\u0016\u0010F\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bE\u0010\fR\u0016\u0010H\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bG\u0010\fR\u0016\u0010J\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bI\u0010\fR\u0016\u0010L\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bK\u0010\fR\u0016\u0010N\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bM\u0010\u001eR\u0016\u0010P\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bO\u0010\fR\u0016\u0010R\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bQ\u0010\fR\u0016\u0010T\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bS\u0010\fR\u0016\u0010V\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bU\u0010\fR\u0016\u0010X\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bW\u0010\fR\u0016\u0010Y\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001eR\u0016\u0010Z\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b?\u0010\fR\u0016\u0010\\\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b[\u0010\fR\u0016\u0010`\u001a\u00020]8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006a"}, m90084d2 = {"Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$a;", "", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", "configBuilder", "<init>", "(Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;)V", "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig$a;", "", "b", "Z", "shouldUseDecodingBufferHelper", "c", "webpSupportEnabled", "d", "decodeCancellationEnabled", "Le4/b;", "e", "Le4/b;", "webpBitmapFactory", "f", "useDownsamplingRatioForResizing", "g", "useBitmapPrepareToDraw", CmcdData.Factory.STREAMING_FORMAT_HLS, "useBalancedAnimationStrategy", "", "i", "I", "animationStrategyBufferLengthMilliseconds", "j", "bitmapPrepareToDrawMinSizeBytes", "k", "bitmapPrepareToDrawMaxSizeBytes", CmcdData.Factory.STREAM_TYPE_LIVE, "bitmapPrepareToDrawForPrefetch", "m", "maxBitmapDimension", "n", "nativeCodeDisabled", "o", "isPartialImageCachingEnabled", "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;", "p", "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;", "producerFactoryMethod", "Lw3/k;", "q", "Lw3/k;", "lazyDataSource", "r", "gingerbreadDecoderEnabled", CmcdData.Factory.STREAMING_FORMAT_SS, "downscaleFrameToDrawableDimensions", "kotlin.jvm.PlatformType", "t", "suppressBitmapPrefetchingSupplier", "u", "experimentalThreadHandoffQueueEnabled", "", "v", "J", "memoryType", "w", "keepCancelledFetchAsLowPriority", "x", "downsampleIfLargeBitmap", "y", "encodedCacheEnabled", "z", "ensureTranscoderLibraryLoaded", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "isEncodedMemoryCacheProbingEnabled", "B", "isDiskCacheProbingEnabled", "C", "trackedKeysSize", "D", "allowDelay", ExifInterface.LONGITUDE_EAST, "handOffOnUiThreadOnly", "F", "shouldStoreCacheEntrySize", "G", "shouldIgnoreCacheSizeMismatch", "H", "allowProgressiveOnPrefetch", "animationRenderFpsLimit", "cancelDecodeOnCacheMiss", "K", "prefetchShortcutEnabled", "Lb6/f;", "L", "Lb6/f;", "platformDecoderOptions", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C5653a {

        /* JADX INFO: renamed from: A, reason: from kotlin metadata */
        @JvmField
        public boolean isEncodedMemoryCacheProbingEnabled;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata */
        @JvmField
        public boolean isDiskCacheProbingEnabled;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata */
        @JvmField
        public int trackedKeysSize;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata */
        @JvmField
        public boolean allowDelay;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata */
        @JvmField
        public boolean handOffOnUiThreadOnly;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata */
        @JvmField
        public boolean shouldStoreCacheEntrySize;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata */
        @JvmField
        public boolean shouldIgnoreCacheSizeMismatch;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata */
        @JvmField
        public boolean allowProgressiveOnPrefetch;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata */
        @JvmField
        public int animationRenderFpsLimit;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata */
        @JvmField
        public boolean cancelDecodeOnCacheMiss;

        /* JADX INFO: renamed from: K, reason: from kotlin metadata */
        @JvmField
        public boolean prefetchShortcutEnabled;

        /* JADX INFO: renamed from: L, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public C4497f platformDecoderOptions;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ImagePipelineConfig.C5651a configBuilder;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @JvmField
        public boolean shouldUseDecodingBufferHelper;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @JvmField
        public boolean webpSupportEnabled;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @JvmField
        public boolean decodeCancellationEnabled;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public InterfaceC37071b webpBitmapFactory;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @JvmField
        public boolean useDownsamplingRatioForResizing;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @JvmField
        public boolean useBitmapPrepareToDraw;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @JvmField
        public boolean useBalancedAnimationStrategy;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @JvmField
        public int animationStrategyBufferLengthMilliseconds;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @JvmField
        public int bitmapPrepareToDrawMinSizeBytes;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @JvmField
        public int bitmapPrepareToDrawMaxSizeBytes;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @JvmField
        public boolean bitmapPrepareToDrawForPrefetch;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @JvmField
        public int maxBitmapDimension;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @JvmField
        public boolean nativeCodeDisabled;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @JvmField
        public boolean isPartialImageCachingEnabled;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public InterfaceC5655c producerFactoryMethod;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @JvmField
        @Nullable
        public InterfaceC45711k<Boolean> lazyDataSource;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @JvmField
        public boolean gingerbreadDecoderEnabled;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @JvmField
        public boolean downscaleFrameToDrawableDimensions;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @JvmField
        @NotNull
        public InterfaceC45711k<Boolean> suppressBitmapPrefetchingSupplier;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @JvmField
        public boolean experimentalThreadHandoffQueueEnabled;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @JvmField
        public long memoryType;

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        @JvmField
        public boolean keepCancelledFetchAsLowPriority;

        /* JADX INFO: renamed from: x, reason: from kotlin metadata */
        @JvmField
        public boolean downsampleIfLargeBitmap;

        /* JADX INFO: renamed from: y, reason: from kotlin metadata */
        @JvmField
        public boolean encodedCacheEnabled;

        /* JADX INFO: renamed from: z, reason: from kotlin metadata */
        @JvmField
        public boolean ensureTranscoderLibraryLoaded;

        public C5653a(@NotNull ImagePipelineConfig.C5651a configBuilder) {
            Intrinsics.checkNotNullParameter(configBuilder, "configBuilder");
            this.configBuilder = configBuilder;
            this.animationStrategyBufferLengthMilliseconds = 1000;
            this.maxBitmapDimension = 2048;
            InterfaceC45711k<Boolean> interfaceC45711kM100904a = C45712l.m100904a(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(interfaceC45711kM100904a, "of(...)");
            this.suppressBitmapPrefetchingSupplier = interfaceC45711kM100904a;
            this.encodedCacheEnabled = true;
            this.ensureTranscoderLibraryLoaded = true;
            this.trackedKeysSize = 20;
            this.animationRenderFpsLimit = 30;
            this.platformDecoderOptions = new C4497f(false, false, 3, null);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ImagePipelineExperiments m9363a() {
            return new ImagePipelineExperiments(this, null);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.core.ImagePipelineExperiments$b */
    /* JADX INFO: compiled from: ImagePipelineExperiments.kt */
    @Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jå\u0001\u0010.\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0016\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00172\u0016\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020$2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020$H\u0016¢\u0006\u0004\b.\u0010/¨\u00060"}, m90084d2 = {"Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$b;", "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;", "<init>", "()V", "Landroid/content/Context;", "context", "Lz3/a;", "byteArrayPool", "Lv5/b;", "imageDecoder", "Lv5/e;", "progressiveJpegConfig", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "", "resizeAndRotateEnabledForNetwork", "decodeCancellationEnabled", "Ls5/n;", "executorSupplier", "Lz3/h;", "pooledByteBufferFactory", "Lz3/k;", "pooledByteStreams", "Lcom/facebook/imagepipeline/cache/f;", "Lq3/a;", "Lx5/e;", "bitmapMemoryCache", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCache", "Lw3/k;", "Ls5/b;", "diskCachesStoreSupplier", "Lq5/h;", "cacheKeyFactory", "Lp5/c;", "platformBitmapFactory", "", "bitmapPrepareToDrawMinSizeBytes", "bitmapPrepareToDrawMaxSizeBytes", "bitmapPrepareToDrawForPrefetch", "maxBitmapSize", "Ls5/a;", "closeableReferenceFactory", "keepCancelledFetchAsLowPriority", "trackedKeysSize", "Ls5/v;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Lz3/a;Lv5/b;Lv5/e;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZLs5/n;Lz3/h;Lz3/k;Lcom/facebook/imagepipeline/cache/f;Lcom/facebook/imagepipeline/cache/f;Lw3/k;Lq5/h;Lp5/c;IIZILs5/a;ZI)Ls5/v;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class C5654b implements InterfaceC5655c {
        @Override // com.facebook.imagepipeline.core.ImagePipelineExperiments.InterfaceC5655c
        @NotNull
        /* JADX INFO: renamed from: a */
        public C44350v mo9364a(@NotNull Context context, @NotNull InterfaceC46672a byteArrayPool, @NotNull InterfaceC45421b imageDecoder, @NotNull InterfaceC45424e progressiveJpegConfig, @NotNull DownsampleMode downsampleMode, boolean resizeAndRotateEnabledForNetwork, boolean decodeCancellationEnabled, @NotNull InterfaceC44341n executorSupplier, @NotNull InterfaceC46679h pooledByteBufferFactory, @NotNull C46682k pooledByteStreams, @NotNull InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> bitmapMemoryCache, @NotNull InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> encodedMemoryCache, @NotNull InterfaceC45711k<InterfaceC44317b> diskCachesStoreSupplier, @NotNull InterfaceC43619h cacheKeyFactory, @NotNull AbstractC43387c platformBitmapFactory, int bitmapPrepareToDrawMinSizeBytes, int bitmapPrepareToDrawMaxSizeBytes, boolean bitmapPrepareToDrawForPrefetch, int maxBitmapSize, @NotNull C44315a closeableReferenceFactory, boolean keepCancelledFetchAsLowPriority, int trackedKeysSize) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(byteArrayPool, "byteArrayPool");
            Intrinsics.checkNotNullParameter(imageDecoder, "imageDecoder");
            Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
            Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
            Intrinsics.checkNotNullParameter(executorSupplier, "executorSupplier");
            Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
            Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
            Intrinsics.checkNotNullParameter(bitmapMemoryCache, "bitmapMemoryCache");
            Intrinsics.checkNotNullParameter(encodedMemoryCache, "encodedMemoryCache");
            Intrinsics.checkNotNullParameter(diskCachesStoreSupplier, "diskCachesStoreSupplier");
            Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
            Intrinsics.checkNotNullParameter(platformBitmapFactory, "platformBitmapFactory");
            Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
            return new C44350v(context, byteArrayPool, imageDecoder, progressiveJpegConfig, downsampleMode, resizeAndRotateEnabledForNetwork, decodeCancellationEnabled, executorSupplier, pooledByteBufferFactory, bitmapMemoryCache, encodedMemoryCache, diskCachesStoreSupplier, cacheKeyFactory, platformBitmapFactory, bitmapPrepareToDrawMinSizeBytes, bitmapPrepareToDrawMaxSizeBytes, bitmapPrepareToDrawForPrefetch, maxBitmapSize, closeableReferenceFactory, keepCancelledFetchAsLowPriority, trackedKeysSize);
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.core.ImagePipelineExperiments$c */
    /* JADX INFO: compiled from: ImagePipelineExperiments.kt */
    @Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jå\u0001\u0010,\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0016\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00152\u0016\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00152\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\"2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\"H&¢\u0006\u0004\b,\u0010-¨\u0006."}, m90084d2 = {"Lcom/facebook/imagepipeline/core/ImagePipelineExperiments$c;", "", "Landroid/content/Context;", "context", "Lz3/a;", "byteArrayPool", "Lv5/b;", "imageDecoder", "Lv5/e;", "progressiveJpegConfig", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "", "resizeAndRotateEnabledForNetwork", "decodeCancellationEnabled", "Ls5/n;", "executorSupplier", "Lz3/h;", "pooledByteBufferFactory", "Lz3/k;", "pooledByteStreams", "Lcom/facebook/imagepipeline/cache/f;", "Lq3/a;", "Lx5/e;", "bitmapMemoryCache", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCache", "Lw3/k;", "Ls5/b;", "diskCachesStoreSupplier", "Lq5/h;", "cacheKeyFactory", "Lp5/c;", "platformBitmapFactory", "", "bitmapPrepareToDrawMinSizeBytes", "bitmapPrepareToDrawMaxSizeBytes", "bitmapPrepareToDrawForPrefetch", "maxBitmapSize", "Ls5/a;", "closeableReferenceFactory", "keepCancelledFetchAsLowPriority", "trackedKeysSize", "Ls5/v;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/content/Context;Lz3/a;Lv5/b;Lv5/e;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZLs5/n;Lz3/h;Lz3/k;Lcom/facebook/imagepipeline/cache/f;Lcom/facebook/imagepipeline/cache/f;Lw3/k;Lq5/h;Lp5/c;IIZILs5/a;ZI)Ls5/v;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public interface InterfaceC5655c {
        @NotNull
        /* JADX INFO: renamed from: a */
        C44350v mo9364a(@NotNull Context context, @NotNull InterfaceC46672a byteArrayPool, @NotNull InterfaceC45421b imageDecoder, @NotNull InterfaceC45424e progressiveJpegConfig, @NotNull DownsampleMode downsampleMode, boolean resizeAndRotateEnabledForNetwork, boolean decodeCancellationEnabled, @NotNull InterfaceC44341n executorSupplier, @NotNull InterfaceC46679h pooledByteBufferFactory, @NotNull C46682k pooledByteStreams, @NotNull InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> bitmapMemoryCache, @NotNull InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> encodedMemoryCache, @NotNull InterfaceC45711k<InterfaceC44317b> diskCachesStoreSupplier, @NotNull InterfaceC43619h cacheKeyFactory, @NotNull AbstractC43387c platformBitmapFactory, int bitmapPrepareToDrawMinSizeBytes, int bitmapPrepareToDrawMaxSizeBytes, boolean bitmapPrepareToDrawForPrefetch, int maxBitmapSize, @NotNull C44315a closeableReferenceFactory, boolean keepCancelledFetchAsLowPriority, int trackedKeysSize);
    }

    public /* synthetic */ ImagePipelineExperiments(C5653a c5653a, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5653a);
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public final InterfaceC37071b.a m9362z() {
        return null;
    }

    public ImagePipelineExperiments(C5653a c5653a) {
        this.isWebpSupportEnabled = c5653a.webpSupportEnabled;
        this.isDecodeCancellationEnabled = c5653a.decodeCancellationEnabled;
        this.webpBitmapFactory = c5653a.webpBitmapFactory;
        this.useDownsamplingRatioForResizing = c5653a.useDownsamplingRatioForResizing;
        this.useBitmapPrepareToDraw = c5653a.useBitmapPrepareToDraw;
        this.useBalancedAnimationStrategy = c5653a.useBalancedAnimationStrategy;
        this.animationStrategyBufferLengthMilliseconds = c5653a.animationStrategyBufferLengthMilliseconds;
        this.bitmapPrepareToDrawMinSizeBytes = c5653a.bitmapPrepareToDrawMinSizeBytes;
        this.bitmapPrepareToDrawMaxSizeBytes = c5653a.bitmapPrepareToDrawMaxSizeBytes;
        this.bitmapPrepareToDrawForPrefetch = c5653a.bitmapPrepareToDrawForPrefetch;
        this.maxBitmapDimension = c5653a.maxBitmapDimension;
        this.isNativeCodeDisabled = c5653a.nativeCodeDisabled;
        this.isPartialImageCachingEnabled = c5653a.isPartialImageCachingEnabled;
        InterfaceC5655c interfaceC5655c = c5653a.producerFactoryMethod;
        this.producerFactoryMethod = interfaceC5655c == null ? new C5654b() : interfaceC5655c;
        InterfaceC45711k<Boolean> BOOLEAN_FALSE = c5653a.lazyDataSource;
        if (BOOLEAN_FALSE == null) {
            BOOLEAN_FALSE = C45712l.f103052b;
            Intrinsics.checkNotNullExpressionValue(BOOLEAN_FALSE, "BOOLEAN_FALSE");
        }
        this.isLazyDataSource = BOOLEAN_FALSE;
        this.isGingerbreadDecoderEnabled = c5653a.gingerbreadDecoderEnabled;
        this.downscaleFrameToDrawableDimensions = c5653a.downscaleFrameToDrawableDimensions;
        this.suppressBitmapPrefetchingSupplier = c5653a.suppressBitmapPrefetchingSupplier;
        this.isExperimentalThreadHandoffQueueEnabled = c5653a.experimentalThreadHandoffQueueEnabled;
        this.memoryType = c5653a.memoryType;
        this.keepCancelledFetchAsLowPriority = c5653a.keepCancelledFetchAsLowPriority;
        this.downsampleIfLargeBitmap = c5653a.downsampleIfLargeBitmap;
        this.isEncodedCacheEnabled = c5653a.encodedCacheEnabled;
        this.isEnsureTranscoderLibraryLoaded = c5653a.ensureTranscoderLibraryLoaded;
        this.isEncodedMemoryCacheProbingEnabled = c5653a.isEncodedMemoryCacheProbingEnabled;
        this.isDiskCacheProbingEnabled = c5653a.isDiskCacheProbingEnabled;
        this.trackedKeysSize = c5653a.trackedKeysSize;
        this.allowProgressiveOnPrefetch = c5653a.allowProgressiveOnPrefetch;
        this.animationRenderFpsLimit = c5653a.animationRenderFpsLimit;
        this.allowDelay = c5653a.allowDelay;
        this.handOffOnUiThreadOnly = c5653a.handOffOnUiThreadOnly;
        this.shouldStoreCacheEntrySize = c5653a.shouldStoreCacheEntrySize;
        this.shouldIgnoreCacheSizeMismatch = c5653a.shouldIgnoreCacheSizeMismatch;
        this.shouldUseDecodingBufferHelper = c5653a.shouldUseDecodingBufferHelper;
        this.cancelDecodeOnCacheMiss = c5653a.cancelDecodeOnCacheMiss;
        this.prefetchShortcutEnabled = c5653a.prefetchShortcutEnabled;
        this.platformDecoderOptions = c5653a.platformDecoderOptions;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getIsDecodeCancellationEnabled() {
        return this.isDecodeCancellationEnabled;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final boolean getIsDiskCacheProbingEnabled() {
        return this.isDiskCacheProbingEnabled;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final boolean getIsEncodedCacheEnabled() {
        return this.isEncodedCacheEnabled;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getIsEncodedMemoryCacheProbingEnabled() {
        return this.isEncodedMemoryCacheProbingEnabled;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final boolean getIsEnsureTranscoderLibraryLoaded() {
        return this.isEnsureTranscoderLibraryLoaded;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final boolean getIsExperimentalThreadHandoffQueueEnabled() {
        return this.isExperimentalThreadHandoffQueueEnabled;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final boolean getIsGingerbreadDecoderEnabled() {
        return this.isGingerbreadDecoderEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final InterfaceC45711k<Boolean> m9333H() {
        return this.isLazyDataSource;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final boolean getIsNativeCodeDisabled() {
        return this.isNativeCodeDisabled;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getIsPartialImageCachingEnabled() {
        return this.isPartialImageCachingEnabled;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final boolean getIsWebpSupportEnabled() {
        return this.isWebpSupportEnabled;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAllowDelay() {
        return this.allowDelay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowProgressiveOnPrefetch() {
        return this.allowProgressiveOnPrefetch;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getAnimationRenderFpsLimit() {
        return this.animationRenderFpsLimit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getAnimationStrategyBufferLengthMilliseconds() {
        return this.animationStrategyBufferLengthMilliseconds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getBitmapPrepareToDrawForPrefetch() {
        return this.bitmapPrepareToDrawForPrefetch;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getBitmapPrepareToDrawMaxSizeBytes() {
        return this.bitmapPrepareToDrawMaxSizeBytes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getBitmapPrepareToDrawMinSizeBytes() {
        return this.bitmapPrepareToDrawMinSizeBytes;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getCancelDecodeOnCacheMiss() {
        return this.cancelDecodeOnCacheMiss;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getDownsampleIfLargeBitmap() {
        return this.downsampleIfLargeBitmap;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getDownscaleFrameToDrawableDimensions() {
        return this.downscaleFrameToDrawableDimensions;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getHandOffOnUiThreadOnly() {
        return this.handOffOnUiThreadOnly;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getKeepCancelledFetchAsLowPriority() {
        return this.keepCancelledFetchAsLowPriority;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getMaxBitmapDimension() {
        return this.maxBitmapDimension;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getMemoryType() {
        return this.memoryType;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final C4497f getPlatformDecoderOptions() {
        return this.platformDecoderOptions;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final InterfaceC5655c getProducerFactoryMethod() {
        return this.producerFactoryMethod;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getShouldIgnoreCacheSizeMismatch() {
        return this.shouldIgnoreCacheSizeMismatch;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getShouldStoreCacheEntrySize() {
        return this.shouldStoreCacheEntrySize;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getShouldUseDecodingBufferHelper() {
        return this.shouldUseDecodingBufferHelper;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final InterfaceC45711k<Boolean> m9356t() {
        return this.suppressBitmapPrefetchingSupplier;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getTrackedKeysSize() {
        return this.trackedKeysSize;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getUseBalancedAnimationStrategy() {
        return this.useBalancedAnimationStrategy;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getUseBitmapPrepareToDraw() {
        return this.useBitmapPrepareToDraw;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getUseDownsamplingRatioForResizing() {
        return this.useDownsamplingRatioForResizing;
    }

    @Nullable
    /* JADX INFO: renamed from: y, reason: from getter */
    public final InterfaceC37071b getWebpBitmapFactory() {
        return this.webpBitmapFactory;
    }
}
