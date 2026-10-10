package p617s5;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.cache.InterfaceC5643a;
import com.facebook.imagepipeline.cache.InterfaceC5645c;
import com.facebook.imagepipeline.cache.InterfaceC5648f;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.core.ImagePipelineExperiments;
import com.facebook.imagepipeline.producers.C5714n;
import com.facebook.imagepipeline.producers.InterfaceC5719p0;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p008a6.C0146g0;
import p223e6.InterfaceC37079d;
import p547q3.InterfaceC43595a;
import p549q5.C43628q;
import p549q5.InterfaceC43619h;
import p549q5.InterfaceC43625n;
import p583r3.C43909b;
import p615s3.InterfaceC44276a;
import p651u3.InterfaceExecutorServiceC45104g;
import p653u5.InterfaceC45123a;
import p684v5.C45422c;
import p684v5.InterfaceC45421b;
import p684v5.InterfaceC45424e;
import p712w3.InterfaceC45711k;
import p819z3.InterfaceC46675d;
import p821z5.InterfaceC46704c;
import p821z5.InterfaceC46705d;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: s5.r */
/* JADX INFO: compiled from: ImagePipelineConfigInterface.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005R\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0005R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010.\u001a\u0004\u0018\u00010+8&X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0016\u00106\u001a\u0004\u0018\u0001038&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u0010:\u001a\u0004\u0018\u0001078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010>\u001a\u0004\u0018\u00010;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020!0\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0005R\u0014\u0010D\u001a\u00020A8&X¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8&X¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020;8&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0018\u0010O\u001a\u0006\u0012\u0002\b\u00030L8&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u001c\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y0X8&X¦\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u001c\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0X8&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u0010[R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020`0X8&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010[R\u0014\u0010d\u001a\u00020!8&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010#R\u0014\u0010f\u001a\u00020A8&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010CR\u0016\u0010j\u001a\u0004\u0018\u00010g8&X¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0016\u0010n\u001a\u0004\u0018\u00010k8&X¦\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8&X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8&X¦\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\"\u0010{\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020x\u0018\u00010w8&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010\u007f\u001a\u00020|8&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R'\u0010\u0084\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0004\u0012\u00020A\u0018\u00010\u0080\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0085\u0001"}, m90084d2 = {"Ls5/r;", "", "Lw3/k;", "Lq5/q;", "y", "()Lw3/k;", "bitmapMemoryCacheParamsSupplier", "Lcom/facebook/imagepipeline/cache/f$a;", CmcdData.Factory.STREAMING_FORMAT_SS, "()Lcom/facebook/imagepipeline/cache/f$a;", "bitmapMemoryCacheTrimStrategy", "r", "encodedMemoryCacheTrimStrategy", "Lcom/facebook/imagepipeline/cache/c$b;", "Lq3/a;", "e", "()Lcom/facebook/imagepipeline/cache/c$b;", "bitmapMemoryCacheEntryStateObserver", "Lq5/h;", "C", "()Lq5/h;", "cacheKeyFactory", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Ls5/b;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "diskCachesStoreSupplier", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "F", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "", "f", "()Z", "isDiskCacheEnabled", CmcdData.Factory.STREAMING_FORMAT_HLS, "encodedMemoryCacheParamsSupplier", "Ls5/n;", "H", "()Ls5/n;", "executorSupplier", "Lu3/g;", "u", "()Lu3/g;", "executorServiceForAnimatedImages", "Lq5/n;", "k", "()Lq5/n;", "imageCacheStatsTracker", "Lv5/b;", "g", "()Lv5/b;", "imageDecoder", "Le6/d;", "w", "()Le6/d;", "imageTranscoderFactory", "", "v", "()Ljava/lang/Integer;", "imageTranscoderType", CmcdData.Factory.STREAM_TYPE_LIVE, "isPrefetchEnabledSupplier", "Lr3/b;", "p", "()Lr3/b;", "mainDiskCacheConfig", "Lz3/d;", "m", "()Lz3/d;", "memoryTrimmableRegistry", "z", "()I", "memoryChunkType", "Lcom/facebook/imagepipeline/producers/p0;", "o", "()Lcom/facebook/imagepipeline/producers/p0;", "networkFetcher", "La6/g0;", "i", "()La6/g0;", "poolFactory", "Lv5/e;", "c", "()Lv5/e;", "progressiveJpegConfig", "", "Lz5/d;", "q", "()Ljava/util/Set;", "requestListeners", "Lz5/c;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "requestListener2s", "Lcom/facebook/imagepipeline/producers/n;", ExifInterface.LONGITUDE_EAST, "customProducerSequenceFactories", "D", "isResizeAndRotateEnabledForNetwork", "t", "smallImageDiskCacheConfig", "Lv5/c;", "x", "()Lv5/c;", "imageDecoderConfig", "Ls3/a;", "G", "()Ls3/a;", "callerContextVerifier", "Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;", "n", "()Lcom/facebook/imagepipeline/core/ImagePipelineExperiments;", "experiments", "Lu5/a;", "j", "()Lu5/a;", "closeableReferenceLeakTracker", "Lcom/facebook/imagepipeline/cache/f;", "Lcom/facebook/common/memory/PooledByteBuffer;", "b", "()Lcom/facebook/imagepipeline/cache/f;", "encodedMemoryCacheOverride", "Lcom/facebook/imagepipeline/cache/a;", "B", "()Lcom/facebook/imagepipeline/cache/a;", "bitmapMemoryCacheFactory", "", "", "d", "()Ljava/util/Map;", "dynamicDiskCacheConfigMap", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public interface InterfaceC44346r {
    @NotNull
    /* JADX INFO: renamed from: A */
    InterfaceC45711k<InterfaceC44317b> mo9241A();

    @NotNull
    /* JADX INFO: renamed from: B */
    InterfaceC5643a getBitmapMemoryCacheFactory();

    @NotNull
    /* JADX INFO: renamed from: C */
    InterfaceC43619h getCacheKeyFactory();

    /* JADX INFO: renamed from: D */
    boolean getIsResizeAndRotateEnabledForNetwork();

    @NotNull
    /* JADX INFO: renamed from: E */
    Set<C5714n> mo9245E();

    @NotNull
    /* JADX INFO: renamed from: F */
    DownsampleMode getDownsampleMode();

    @Nullable
    /* JADX INFO: renamed from: G */
    InterfaceC44276a mo9247G();

    @NotNull
    /* JADX INFO: renamed from: H */
    InterfaceC44341n getExecutorSupplier();

    @NotNull
    /* JADX INFO: renamed from: a */
    Set<InterfaceC46704c> mo9249a();

    @Nullable
    /* JADX INFO: renamed from: b */
    InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> mo9250b();

    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC45424e getProgressiveJpegConfig();

    @Nullable
    /* JADX INFO: renamed from: d */
    Map<String, C43909b> mo9252d();

    @Nullable
    /* JADX INFO: renamed from: e */
    InterfaceC5645c.b<InterfaceC43595a> mo9253e();

    /* JADX INFO: renamed from: f */
    boolean getIsDiskCacheEnabled();

    @Nullable
    /* JADX INFO: renamed from: g */
    InterfaceC45421b getImageDecoder();

    @NotNull
    Context getContext();

    @NotNull
    /* JADX INFO: renamed from: h */
    InterfaceC45711k<C43628q> mo9256h();

    @NotNull
    /* JADX INFO: renamed from: i */
    C0146g0 getPoolFactory();

    @NotNull
    /* JADX INFO: renamed from: j */
    InterfaceC45123a getCloseableReferenceLeakTracker();

    @NotNull
    /* JADX INFO: renamed from: k */
    InterfaceC43625n getImageCacheStatsTracker();

    @NotNull
    /* JADX INFO: renamed from: l */
    InterfaceC45711k<Boolean> mo9260l();

    @NotNull
    /* JADX INFO: renamed from: m */
    InterfaceC46675d getMemoryTrimmableRegistry();

    @NotNull
    /* JADX INFO: renamed from: n */
    ImagePipelineExperiments getExperiments();

    @NotNull
    /* JADX INFO: renamed from: o */
    InterfaceC5719p0<?> mo9263o();

    @NotNull
    /* JADX INFO: renamed from: p */
    C43909b getMainDiskCacheConfig();

    @NotNull
    /* JADX INFO: renamed from: q */
    Set<InterfaceC46705d> mo9265q();

    @NotNull
    /* JADX INFO: renamed from: r */
    InterfaceC5648f.a getEncodedMemoryCacheTrimStrategy();

    @NotNull
    /* JADX INFO: renamed from: s */
    InterfaceC5648f.a getBitmapMemoryCacheTrimStrategy();

    @NotNull
    /* JADX INFO: renamed from: t */
    C43909b getSmallImageDiskCacheConfig();

    @Nullable
    /* JADX INFO: renamed from: u */
    InterfaceExecutorServiceC45104g getExecutorServiceForAnimatedImages();

    @Nullable
    /* JADX INFO: renamed from: v */
    Integer getImageTranscoderType();

    @Nullable
    /* JADX INFO: renamed from: w */
    InterfaceC37079d getImageTranscoderFactory();

    @Nullable
    /* JADX INFO: renamed from: x */
    C45422c getImageDecoderConfig();

    @NotNull
    /* JADX INFO: renamed from: y */
    InterfaceC45711k<C43628q> mo9273y();

    /* JADX INFO: renamed from: z */
    int getMemoryChunkType();
}
