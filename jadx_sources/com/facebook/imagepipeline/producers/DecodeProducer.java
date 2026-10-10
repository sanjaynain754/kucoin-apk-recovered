package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.bugly.proguard.JceStruct;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p190d4.C36613d;
import p192d6.C36621b;
import p223e6.C37076a;
import p284g6.C37818c;
import p422l5.C42054a;
import p585r5.C43928c;
import p617s5.C44315a;
import p684v5.C45425f;
import p684v5.InterfaceC45421b;
import p684v5.InterfaceC45424e;
import p712w3.InterfaceC45711k;
import p747x3.C45999a;
import p749x5.C46075i;
import p749x5.C46079m;
import p749x5.InterfaceC46070d;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46072f;
import p749x5.InterfaceC46080n;
import p819z3.InterfaceC46672a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DecodeProducer.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b+\u0018\u0000 J2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0004+\"'KBw\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\"\u001a\u00020!2\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b)\u00106\u001a\u0004\b/\u00107R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u00106\u001a\u0004\b8\u00107R\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b+\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b9\u0010FR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b=\u0010I¨\u0006L"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/DecodeProducer;", "Lcom/facebook/imagepipeline/producers/v0;", "La4/a;", "Lx5/e;", "Lz3/a;", "byteArrayPool", "Ljava/util/concurrent/Executor;", "executor", "Lv5/b;", "imageDecoder", "Lv5/e;", "progressiveJpegConfig", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "", "downsampleEnabledForNetwork", "decodeCancellationEnabled", "Lx5/i;", "inputProducer", "", "maxBitmapDimension", "Ls5/a;", "closeableReferenceFactory", "Ljava/lang/Runnable;", "reclaimMemoryRunnable", "Lw3/k;", "recoverFromDecoderOOM", "<init>", "(Lz3/a;Ljava/util/concurrent/Executor;Lv5/b;Lv5/e;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZLcom/facebook/imagepipeline/producers/v0;ILs5/a;Ljava/lang/Runnable;Lw3/k;)V", "Lcom/facebook/imagepipeline/producers/m;", "consumer", "Lcom/facebook/imagepipeline/producers/w0;", "context", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V", "Lz3/a;", "getByteArrayPool", "()Lz3/a;", "b", "Ljava/util/concurrent/Executor;", "f", "()Ljava/util/concurrent/Executor;", "c", "Lv5/b;", "g", "()Lv5/b;", "d", "Lv5/e;", "getProgressiveJpegConfig", "()Lv5/e;", "e", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "()Lcom/facebook/imagepipeline/core/DownsampleMode;", "Z", "()Z", "getDecodeCancellationEnabled", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/facebook/imagepipeline/producers/v0;", "getInputProducer", "()Lcom/facebook/imagepipeline/producers/v0;", "i", "I", "getMaxBitmapDimension", "()I", "j", "Ls5/a;", "()Ls5/a;", "k", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", CmcdData.Factory.STREAM_TYPE_LIVE, "Lw3/k;", "()Lw3/k;", "m", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDecodeProducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecodeProducer.kt\ncom/facebook/imagepipeline/producers/DecodeProducer\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,550:1\n40#2,9:551\n*S KotlinDebug\n*F\n+ 1 DecodeProducer.kt\ncom/facebook/imagepipeline/producers/DecodeProducer\n*L\n68#1:551,9\n*E\n"})
public final class DecodeProducer implements InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC46672a byteArrayPool;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Executor executor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45421b imageDecoder;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45424e progressiveJpegConfig;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final DownsampleMode downsampleMode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean downsampleEnabledForNetwork;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean decodeCancellationEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5731v0<C46075i> inputProducer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int maxBitmapDimension;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final C44315a closeableReferenceFactory;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public final Runnable reclaimMemoryRunnable;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45711k<Boolean> recoverFromDecoderOOM;

    /* JADX INFO: compiled from: DecodeProducer.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\r¨\u0006\u001b"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/DecodeProducer$Companion;", "", "<init>", "()V", "Lx5/i;", "encodedImage", "Lr5/c;", "imageDecodeOptions", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lx5/i;Lr5/c;)Z", "", "PRODUCER_NAME", "Ljava/lang/String;", "", "DECODE_EXCEPTION_MESSAGE_NUM_HEADER_BYTES", "I", "MAX_BITMAP_SIZE", "EXTRA_BITMAP_SIZE", "EXTRA_HAS_GOOD_QUALITY", "EXTRA_IS_FINAL", "EXTRA_IMAGE_FORMAT_NAME", "EXTRA_BITMAP_BYTES", "ENCODED_IMAGE_SIZE", "REQUESTED_IMAGE_SIZE", "SAMPLE_SIZE", "NON_FATAL_DECODE_ERROR", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m9532a(C46075i encodedImage, C43928c imageDecodeOptions) {
            if (((long) encodedImage.getWidth()) * ((long) encodedImage.getHeight()) * ((long) C37818c.m85339h(imageDecodeOptions.f97126h)) > 104857600) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.DecodeProducer$a */
    /* JADX INFO: compiled from: DecodeProducer.kt */
    @Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B3\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/DecodeProducer$a;", "Lcom/facebook/imagepipeline/producers/DecodeProducer$c;", "Lcom/facebook/imagepipeline/producers/DecodeProducer;", "Lcom/facebook/imagepipeline/producers/m;", "La4/a;", "Lx5/e;", "consumer", "Lcom/facebook/imagepipeline/producers/w0;", "producerContext", "", "decodeCancellationEnabled", "", "maxBitmapDimension", "<init>", "(Lcom/facebook/imagepipeline/producers/DecodeProducer;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;ZI)V", "Lx5/i;", "encodedImage", "status", "I", "(Lx5/i;I)Z", "w", "(Lx5/i;)I", "Lx5/n;", "y", "()Lx5/n;", "qualityInfo", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public final class C5664a extends AbstractC5666c {

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ DecodeProducer f9200k;

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.AbstractC5666c
        /* JADX INFO: renamed from: I */
        public synchronized boolean mo9533I(@Nullable C46075i encodedImage, int status) {
            return AbstractC5682c.m9646e(status) ? false : super.mo9533I(encodedImage, status);
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.AbstractC5666c
        @NotNull
        /* JADX INFO: renamed from: y */
        public InterfaceC46080n mo9535y() {
            InterfaceC46080n interfaceC46080nM101588d = C46079m.m101588d(0, false, false);
            Intrinsics.checkNotNullExpressionValue(interfaceC46080nM101588d, "of(...)");
            return interfaceC46080nM101588d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5664a(@NotNull DecodeProducer decodeProducer, @NotNull InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> consumer, InterfaceC5733w0 producerContext, boolean z11, int i11) {
            super(decodeProducer, consumer, producerContext, z11, i11);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            this.f9200k = decodeProducer;
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.AbstractC5666c
        /* JADX INFO: renamed from: w */
        public int mo9534w(@NotNull C46075i encodedImage) {
            Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
            return encodedImage.m101582q();
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.DecodeProducer$b */
    /* JADX INFO: compiled from: DecodeProducer.kt */
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002BC\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/DecodeProducer$b;", "Lcom/facebook/imagepipeline/producers/DecodeProducer$c;", "Lcom/facebook/imagepipeline/producers/DecodeProducer;", "Lcom/facebook/imagepipeline/producers/m;", "La4/a;", "Lx5/e;", "consumer", "Lcom/facebook/imagepipeline/producers/w0;", "producerContext", "Lv5/f;", "progressiveJpegParser", "Lv5/e;", "progressiveJpegConfig", "", "decodeCancellationEnabled", "", "maxBitmapDimension", "<init>", "(Lcom/facebook/imagepipeline/producers/DecodeProducer;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;Lv5/f;Lv5/e;ZI)V", "Lx5/i;", "encodedImage", "status", "I", "(Lx5/i;I)Z", "w", "(Lx5/i;)I", "k", "Lv5/f;", "getProgressiveJpegParser", "()Lv5/f;", CmcdData.Factory.STREAM_TYPE_LIVE, "Lv5/e;", "getProgressiveJpegConfig", "()Lv5/e;", "Lx5/n;", "y", "()Lx5/n;", "qualityInfo", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public final class C5665b extends AbstractC5666c {

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final C45425f progressiveJpegParser;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC45424e progressiveJpegConfig;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ DecodeProducer f9203m;

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.AbstractC5666c
        /* JADX INFO: renamed from: I */
        public synchronized boolean mo9533I(@Nullable C46075i encodedImage, int status) {
            if (encodedImage == null) {
                return false;
            }
            try {
                boolean zMo9533I = super.mo9533I(encodedImage, status);
                if (AbstractC5682c.m9646e(status) || AbstractC5682c.m9649m(status, 8)) {
                    if (!AbstractC5682c.m9649m(status, 4) && C46075i.m101554E(encodedImage) && encodedImage.m101578m() == C42054a.com.jumio.core.constants.ConstantsKt.FILE_TYPE_JPEG java.lang.String) {
                        if (!this.progressiveJpegParser.m100396g(encodedImage)) {
                            return false;
                        }
                        int iM100393d = this.progressiveJpegParser.m100393d();
                        if (iM100393d <= getLastScheduledScanNumber()) {
                            return false;
                        }
                        if (iM100393d < this.progressiveJpegConfig.mo100387a(getLastScheduledScanNumber()) && !this.progressiveJpegParser.m100394e()) {
                            return false;
                        }
                        m9548H(iM100393d);
                    }
                }
                return zMo9533I;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5665b(@NotNull DecodeProducer decodeProducer, @NotNull InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> consumer, @NotNull InterfaceC5733w0 producerContext, @NotNull C45425f progressiveJpegParser, InterfaceC45424e progressiveJpegConfig, boolean z11, int i11) {
            super(decodeProducer, consumer, producerContext, z11, i11);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            Intrinsics.checkNotNullParameter(progressiveJpegParser, "progressiveJpegParser");
            Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
            this.f9203m = decodeProducer;
            this.progressiveJpegParser = progressiveJpegParser;
            this.progressiveJpegConfig = progressiveJpegConfig;
            m9548H(0);
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.AbstractC5666c
        /* JADX INFO: renamed from: w */
        public int mo9534w(@NotNull C46075i encodedImage) {
            Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
            return this.progressiveJpegParser.m100392c();
        }

        @Override // com.facebook.imagepipeline.producers.DecodeProducer.AbstractC5666c
        @NotNull
        /* JADX INFO: renamed from: y */
        public InterfaceC46080n mo9535y() {
            InterfaceC46080n interfaceC46080nMo100388b = this.progressiveJpegConfig.mo100388b(this.progressiveJpegParser.m100393d());
            Intrinsics.checkNotNullExpressionValue(interfaceC46080nMo100388b, "getQualityInfo(...)");
            return interfaceC46080nMo100388b;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.DecodeProducer$c */
    /* JADX INFO: compiled from: DecodeProducer.kt */
    @Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b¢\u0004\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B3\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u0002H$¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0002¢\u0006\u0004\b'\u0010(J)\u0010,\u001a\u0004\u0018\u00010\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J)\u0010/\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u00042\u0006\u0010&\u001a\u00020\u000bH\u0002¢\u0006\u0004\b/\u00100J_\u0010:\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000204\u0018\u0001092\b\u0010.\u001a\u0004\u0018\u00010\u00042\u0006\u00102\u001a\u0002012\u0006\u0010+\u001a\u00020*2\u0006\u00103\u001a\u00020\t2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u00108\u001a\u000204H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\tH\u0002¢\u0006\u0004\b=\u0010>J!\u0010@\u001a\u00020\u00112\b\u0010?\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\bB\u0010\u001bJ\u000f\u0010C\u001a\u00020\u0011H\u0002¢\u0006\u0004\bC\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010H\u001a\u0002048\u0002X\u0082D¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010NR\u0016\u0010Q\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\"\u0010&\u001a\u00020\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020*8$X¤\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006]"}, m90084d2 = {"Lcom/facebook/imagepipeline/producers/DecodeProducer$c;", "Lcom/facebook/imagepipeline/producers/s;", "Lx5/i;", "La4/a;", "Lx5/e;", "Lcom/facebook/imagepipeline/producers/m;", "consumer", "Lcom/facebook/imagepipeline/producers/w0;", "producerContext", "", "decodeCancellationEnabled", "", "maxBitmapDimension", "<init>", "(Lcom/facebook/imagepipeline/producers/DecodeProducer;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;ZI)V", "newResult", "status", "", "F", "(Lx5/i;I)V", "", "progress", "i", "(F)V", "", "t", "g", "(Ljava/lang/Throwable;)V", "f", "()V", "ref", "I", "(Lx5/i;I)Z", "encodedImage", "w", "(Lx5/i;)I", ExifInterface.LONGITUDE_EAST, "(Lx5/i;)V", "lastScheduledScanNumber", "u", "(Lx5/i;II)V", SessionDescription.ATTR_LENGTH, "Lx5/n;", C33757kf.f70665k, "C", "(Lx5/i;ILx5/n;)Lx5/e;", "image", "G", "(Lx5/i;Lx5/e;I)V", "", "queueTime", "isFinal", "", "imageFormatName", "encodedImageSize", "requestImageSize", "sampleSize", "", "v", "(Lx5/e;JLx5/n;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "shouldFinish", "D", "(Z)V", "decodedImage", "B", "(Lx5/e;I)V", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "z", "c", "Lcom/facebook/imagepipeline/producers/w0;", "d", "Ljava/lang/String;", "TAG", "Lcom/facebook/imagepipeline/producers/y0;", "e", "Lcom/facebook/imagepipeline/producers/y0;", "producerListener", "Lr5/c;", "Lr5/c;", "imageDecodeOptions", "Z", "isFinished", "Lcom/facebook/imagepipeline/producers/JobScheduler;", CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/facebook/imagepipeline/producers/JobScheduler;", "jobScheduler", "x", "()I", "H", "(I)V", "y", "()Lx5/n;", "qualityInfo", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDecodeProducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DecodeProducer.kt\ncom/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,550:1\n40#2,9:551\n*S KotlinDebug\n*F\n+ 1 DecodeProducer.kt\ncom/facebook/imagepipeline/producers/DecodeProducer$ProgressiveDecoder\n*L\n115#1:551,9\n*E\n"})
    public abstract class AbstractC5666c extends AbstractC5724s<C46075i, AbstractC0110a<InterfaceC46071e>> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC5733w0 producerContext;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final String TAG;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC5737y0 producerListener;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final C43928c imageDecodeOptions;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public boolean isFinished;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public final JobScheduler jobScheduler;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public int lastScheduledScanNumber;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ DecodeProducer f9211j;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.DecodeProducer$c$a */
        /* JADX INFO: compiled from: DecodeProducer.kt */
        @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m90084d2 = {"com/facebook/imagepipeline/producers/DecodeProducer$c$a", "Lcom/facebook/imagepipeline/producers/f;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()V", "b", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
        public static final class a extends C5691f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f9213b;

            public a(boolean z11) {
                this.f9213b = z11;
            }

            @Override // com.facebook.imagepipeline.producers.C5691f, com.facebook.imagepipeline.producers.InterfaceC5735x0
            /* JADX INFO: renamed from: a */
            public void mo9557a() {
                if (AbstractC5666c.this.producerContext.mo9671m()) {
                    AbstractC5666c.this.jobScheduler.m9567h();
                }
            }

            @Override // com.facebook.imagepipeline.producers.InterfaceC5735x0
            /* JADX INFO: renamed from: b */
            public void mo9116b() {
                if (this.f9213b) {
                    AbstractC5666c.this.m9556z();
                }
            }
        }

        /* JADX INFO: renamed from: A */
        public final void m9541A(Throwable t11) {
            m9544D(true);
            m9801o().onFailure(t11);
        }

        /* JADX INFO: renamed from: D */
        public final void m9544D(boolean shouldFinish) {
            synchronized (this) {
                if (shouldFinish) {
                    if (!this.isFinished) {
                        m9801o().mo9653c(1.0f);
                        this.isFinished = true;
                        Unit unit = Unit.INSTANCE;
                        this.jobScheduler.m9562c();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: w */
        public abstract int mo9534w(@NotNull C46075i encodedImage);

        @NotNull
        /* JADX INFO: renamed from: y */
        public abstract InterfaceC46080n mo9535y();

        /* JADX INFO: renamed from: z */
        public final void m9556z() {
            m9544D(true);
            m9801o().mo9651a();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC5666c(@NotNull final DecodeProducer decodeProducer, @NotNull InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> consumer, InterfaceC5733w0 producerContext, boolean z11, final int i11) {
            super(consumer);
            Intrinsics.checkNotNullParameter(consumer, "consumer");
            Intrinsics.checkNotNullParameter(producerContext, "producerContext");
            this.f9211j = decodeProducer;
            this.producerContext = producerContext;
            this.TAG = "ProgressiveDecoder";
            this.producerListener = producerContext.mo9665g();
            C43928c imageDecodeOptions = producerContext.mo9666h().getImageDecodeOptions();
            Intrinsics.checkNotNullExpressionValue(imageDecodeOptions, "getImageDecodeOptions(...)");
            this.imageDecodeOptions = imageDecodeOptions;
            this.jobScheduler = new JobScheduler(decodeProducer.getExecutor(), new JobScheduler.InterfaceC5670d() { // from class: com.facebook.imagepipeline.producers.p
                @Override // com.facebook.imagepipeline.producers.JobScheduler.InterfaceC5670d
                /* JADX INFO: renamed from: a */
                public final void mo9570a(C46075i c46075i, int i12) throws Throwable {
                    DecodeProducer.AbstractC5666c.m9537q(this.f9419a, decodeProducer, i11, c46075i, i12);
                }
            }, imageDecodeOptions.f97119a);
            producerContext.mo9667i(new a(z11));
        }

        /* JADX INFO: renamed from: B */
        public final void m9542B(InterfaceC46071e decodedImage, int status) {
            AbstractC0110a<InterfaceC46071e> abstractC0110aM97776b = this.f9211j.getCloseableReferenceFactory().m97776b(decodedImage);
            try {
                m9544D(AbstractC5682c.m9645d(status));
                m9801o().mo9652b(abstractC0110aM97776b, status);
            } finally {
                AbstractC0110a.m555j(abstractC0110aM97776b);
            }
        }

        /* JADX INFO: renamed from: C */
        public final InterfaceC46071e m9543C(C46075i encodedImage, int length, InterfaceC46080n quality) {
            boolean z11 = this.f9211j.getReclaimMemoryRunnable() != null && this.f9211j.m9531i().get().booleanValue();
            try {
                return this.f9211j.getImageDecoder().decode(encodedImage, length, quality, this.imageDecodeOptions);
            } catch (OutOfMemoryError e11) {
                if (!z11) {
                    throw e11;
                }
                Runnable reclaimMemoryRunnable = this.f9211j.getReclaimMemoryRunnable();
                if (reclaimMemoryRunnable != null) {
                    reclaimMemoryRunnable.run();
                }
                System.gc();
                return this.f9211j.getImageDecoder().decode(encodedImage, length, quality, this.imageDecodeOptions);
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m9547G(C46075i encodedImage, InterfaceC46071e image, int lastScheduledScanNumber) {
            this.producerContext.putExtra(HasExtraData.Companion.KEY_ENCODED_WIDTH, Integer.valueOf(encodedImage.getWidth()));
            this.producerContext.putExtra(HasExtraData.Companion.KEY_ENCODED_HEIGHT, Integer.valueOf(encodedImage.getHeight()));
            this.producerContext.putExtra(HasExtraData.Companion.KEY_ENCODED_SIZE, Integer.valueOf(encodedImage.m101582q()));
            this.producerContext.putExtra(HasExtraData.Companion.KEY_COLOR_SPACE, encodedImage.m101576k());
            if (image instanceof InterfaceC46070d) {
                this.producerContext.putExtra(HasExtraData.Companion.KEY_BITMAP_CONFIG, String.valueOf(((InterfaceC46070d) image).mo101544K().getConfig()));
            }
            if (image != null) {
                image.putExtras(this.producerContext.getExtras());
            }
            this.producerContext.putExtra(HasExtraData.Companion.KEY_LAST_SCAN_NUMBER, Integer.valueOf(lastScheduledScanNumber));
        }

        /* JADX INFO: renamed from: H */
        public final void m9548H(int i11) {
            this.lastScheduledScanNumber = i11;
        }

        /* JADX INFO: renamed from: I */
        public boolean mo9533I(@Nullable C46075i ref, int status) {
            return this.jobScheduler.m9569k(ref, status);
        }

        /* JADX INFO: renamed from: u */
        public final void m9553u(C46075i encodedImage, int status, int lastScheduledScanNumber) throws Throwable {
            InterfaceC46071e interfaceC46071eM9543C;
            int i11 = status;
            if ((encodedImage.m101578m() != C42054a.com.jumio.core.constants.ConstantsKt.FILE_TYPE_JPEG java.lang.String && AbstractC5682c.m9646e(i11)) || this.isFinished || !C46075i.m101554E(encodedImage)) {
                return;
            }
            if (Intrinsics.areEqual(encodedImage.m101578m(), C42054a.GIF) && DecodeProducer.INSTANCE.m9532a(encodedImage, this.imageDecodeOptions)) {
                IllegalStateException illegalStateException = new IllegalStateException("Image is too big to attempt decoding: w = " + encodedImage.getWidth() + ", h = " + encodedImage.getHeight() + ", pixel config = " + this.imageDecodeOptions.f97126h + ", max bitmap size = 104857600");
                this.producerListener.mo9463k(this.producerContext, "DecodeProducer", illegalStateException, null);
                m9541A(illegalStateException);
                return;
            }
            ImageFormat imageFormatM101578m = encodedImage.m101578m();
            Intrinsics.checkNotNullExpressionValue(imageFormatM101578m, "getImageFormat(...)");
            String name = imageFormatM101578m.getName();
            String str = "unknown";
            String str2 = name == null ? "unknown" : name;
            String str3 = encodedImage.getWidth() + "x" + encodedImage.getHeight();
            String strValueOf = String.valueOf(encodedImage.m101581p());
            boolean zM9645d = AbstractC5682c.m9645d(i11);
            boolean z11 = zM9645d && !AbstractC5682c.m9649m(i11, 8);
            boolean zM9649m = AbstractC5682c.m9649m(i11, 4);
            ResizeOptions resizeOptions = this.producerContext.mo9666h().getResizeOptions();
            if (resizeOptions != null) {
                str = resizeOptions.width + "x" + resizeOptions.height;
            }
            try {
                long jM9565f = this.jobScheduler.m9565f();
                String string = this.producerContext.mo9666h().getSourceUri().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                int iM101582q = (z11 || zM9649m) ? encodedImage.m101582q() : mo9534w(encodedImage);
                InterfaceC46080n interfaceC46080nMo9535y = (z11 || zM9649m) ? C46079m.f103527d : mo9535y();
                this.producerListener.mo9454b(this.producerContext, "DecodeProducer");
                try {
                    Intrinsics.checkNotNull(interfaceC46080nMo9535y);
                    interfaceC46071eM9543C = m9543C(encodedImage, iM101582q, interfaceC46080nMo9535y);
                    try {
                        if (encodedImage.m101581p() != 1) {
                            i11 |= 16;
                        }
                        this.producerListener.mo9462j(this.producerContext, "DecodeProducer", m9554v(interfaceC46071eM9543C, jM9565f, interfaceC46080nMo9535y, zM9645d, str2, str3, str, strValueOf));
                        m9547G(encodedImage, interfaceC46071eM9543C, lastScheduledScanNumber);
                        m9542B(interfaceC46071eM9543C, i11);
                        C46075i.m101556g(encodedImage);
                    } catch (Exception e11) {
                        e = e11;
                        interfaceC46080nMo9535y = interfaceC46080nMo9535y;
                        str = str;
                        jM9565f = jM9565f;
                        Intrinsics.checkNotNull(interfaceC46080nMo9535y);
                        this.producerListener.mo9463k(this.producerContext, "DecodeProducer", e, m9554v(interfaceC46071eM9543C, jM9565f, interfaceC46080nMo9535y, zM9645d, str2, str3, str, strValueOf));
                        m9541A(e);
                        C46075i.m101556g(encodedImage);
                    }
                } catch (DecodeException e12) {
                    try {
                        try {
                            C46075i encodedImage2 = e12.getEncodedImage();
                            C45999a.m101490K(this.TAG, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e12.getMessage(), string, encodedImage2.m101577l(10), Integer.valueOf(encodedImage2.m101582q()));
                            throw e12;
                        } catch (Exception e13) {
                            e = e13;
                            interfaceC46071eM9543C = null;
                            Intrinsics.checkNotNull(interfaceC46080nMo9535y);
                            this.producerListener.mo9463k(this.producerContext, "DecodeProducer", e, m9554v(interfaceC46071eM9543C, jM9565f, interfaceC46080nMo9535y, zM9645d, str2, str3, str, strValueOf));
                            m9541A(e);
                            C46075i.m101556g(encodedImage);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C46075i.m101556g(encodedImage);
                        throw th;
                    }
                } catch (Exception e14) {
                    e = e14;
                    interfaceC46071eM9543C = null;
                    Intrinsics.checkNotNull(interfaceC46080nMo9535y);
                    this.producerListener.mo9463k(this.producerContext, "DecodeProducer", e, m9554v(interfaceC46071eM9543C, jM9565f, interfaceC46080nMo9535y, zM9645d, str2, str3, str, strValueOf));
                    m9541A(e);
                    C46075i.m101556g(encodedImage);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX INFO: renamed from: v */
        public final Map<String, String> m9554v(InterfaceC46071e image, long queueTime, InterfaceC46080n quality, boolean isFinal, String imageFormatName, String encodedImageSize, String requestImageSize, String sampleSize) {
            Map<String, Object> extras;
            Object obj;
            String string = null;
            if (!this.producerListener.mo9458f(this.producerContext, "DecodeProducer")) {
                return null;
            }
            String strValueOf = String.valueOf(queueTime);
            String strValueOf2 = String.valueOf(quality.mo101590b());
            String strValueOf3 = String.valueOf(isFinal);
            if (image != null && (extras = image.getExtras()) != null && (obj = extras.get(HasExtraData.Companion.KEY_NON_FATAL_DECODE_ERROR)) != null) {
                string = obj.toString();
            }
            if (!(image instanceof InterfaceC46072f)) {
                String str = string;
                HashMap map = new HashMap(7);
                map.put("queueTime", strValueOf);
                map.put("hasGoodQuality", strValueOf2);
                map.put("isFinal", strValueOf3);
                map.put("encodedImageSize", encodedImageSize);
                map.put("imageFormat", imageFormatName);
                map.put("requestedImageSize", requestImageSize);
                map.put("sampleSize", sampleSize);
                if (str != null) {
                    map.put(HasExtraData.Companion.KEY_NON_FATAL_DECODE_ERROR, str);
                }
                return ImmutableMap.copyOf((Map) map);
            }
            String str2 = string;
            Bitmap bitmapMo101544K = ((InterfaceC46072f) image).mo101544K();
            Intrinsics.checkNotNullExpressionValue(bitmapMo101544K, "getUnderlyingBitmap(...)");
            String str3 = bitmapMo101544K.getWidth() + "x" + bitmapMo101544K.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str3);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", encodedImageSize);
            map2.put("imageFormat", imageFormatName);
            map2.put("requestedImageSize", requestImageSize);
            map2.put("sampleSize", sampleSize);
            int byteCount = bitmapMo101544K.getByteCount();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(byteCount);
            map2.put("byteCount", sb2.toString());
            if (str2 != null) {
                map2.put(HasExtraData.Companion.KEY_NON_FATAL_DECODE_ERROR, str2);
            }
            return ImmutableMap.copyOf((Map) map2);
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final int getLastScheduledScanNumber() {
            return this.lastScheduledScanNumber;
        }

        /* JADX INFO: renamed from: q */
        public static final void m9537q(AbstractC5666c this$0, DecodeProducer this$1, int i11, C46075i c46075i, int i12) throws Throwable {
            String string;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (c46075i != null) {
                ImageRequest imageRequestMo9666h = this$0.producerContext.mo9666h();
                this$0.producerContext.putExtra(HasExtraData.Companion.KEY_IMAGE_FORMAT, c46075i.m101578m().getName());
                Uri sourceUri = imageRequestMo9666h.getSourceUri();
                if (sourceUri != null) {
                    string = sourceUri.toString();
                } else {
                    string = null;
                }
                c46075i.m101570V(string);
                DownsampleMode downsampleOverride = imageRequestMo9666h.getDownsampleOverride();
                if (downsampleOverride == null) {
                    downsampleOverride = this$1.getDownsampleMode();
                }
                boolean zM9649m = AbstractC5682c.m9649m(i12, 16);
                if ((downsampleOverride == DownsampleMode.ALWAYS || (downsampleOverride == DownsampleMode.AUTO && !zM9649m)) && (this$1.getDownsampleEnabledForNetwork() || !C36613d.m81947p(imageRequestMo9666h.getSourceUri()))) {
                    RotationOptions rotationOptions = imageRequestMo9666h.getRotationOptions();
                    Intrinsics.checkNotNullExpressionValue(rotationOptions, "getRotationOptions(...)");
                    c46075i.m101569U(C37076a.m82984b(rotationOptions, imageRequestMo9666h.getResizeOptions(), c46075i, i11));
                }
                if (this$0.producerContext.mo9664b().getExperiments().getDownsampleIfLargeBitmap()) {
                    this$0.m9545E(c46075i);
                }
                this$0.m9553u(c46075i, i12, this$0.lastScheduledScanNumber);
            }
        }

        /* JADX INFO: renamed from: E */
        public final void m9545E(C46075i encodedImage) {
            if (encodedImage.m101578m() != C42054a.com.jumio.core.constants.ConstantsKt.FILE_TYPE_JPEG java.lang.String) {
                return;
            }
            encodedImage.m101569U(C37076a.m82985c(encodedImage, C37818c.m85339h(this.imageDecodeOptions.f97126h), JceStruct.f68783p));
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo9551h(@Nullable C46075i newResult, int status) {
            if (!C36621b.m81959d()) {
                boolean zM9645d = AbstractC5682c.m9645d(status);
                if (zM9645d) {
                    if (newResult == null) {
                        boolean zAreEqual = Intrinsics.areEqual(this.producerContext.getExtra("cached_value_found"), Boolean.TRUE);
                        if (!this.producerContext.mo9664b().getExperiments().getCancelDecodeOnCacheMiss() || this.producerContext.mo9673o() == ImageRequest.RequestLevel.FULL_FETCH || zAreEqual) {
                            m9541A(new ExceptionWithNoStacktrace("Encoded image is null."));
                            return;
                        }
                    } else if (!newResult.m101558C()) {
                        m9541A(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        return;
                    }
                }
                if (mo9533I(newResult, status)) {
                    boolean zM9649m = AbstractC5682c.m9649m(status, 4);
                    if (!zM9645d && !zM9649m && !this.producerContext.mo9671m()) {
                        return;
                    }
                    this.jobScheduler.m9567h();
                    return;
                }
                return;
            }
            C36621b.m81957a("DecodeProducer#onNewResultImpl");
            try {
                boolean zM9645d2 = AbstractC5682c.m9645d(status);
                if (zM9645d2) {
                    if (newResult == null) {
                        boolean zAreEqual2 = Intrinsics.areEqual(this.producerContext.getExtra("cached_value_found"), Boolean.TRUE);
                        if (this.producerContext.mo9664b().getExperiments().getCancelDecodeOnCacheMiss()) {
                            if (this.producerContext.mo9673o() != ImageRequest.RequestLevel.FULL_FETCH) {
                                if (zAreEqual2) {
                                }
                            }
                        }
                        m9541A(new ExceptionWithNoStacktrace("Encoded image is null."));
                        return;
                    }
                    if (!newResult.m101558C()) {
                        m9541A(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        return;
                    }
                }
                if (!mo9533I(newResult, status)) {
                    return;
                }
                boolean zM9649m2 = AbstractC5682c.m9649m(status, 4);
                if (zM9645d2 || zM9649m2 || this.producerContext.mo9671m()) {
                    this.jobScheduler.m9567h();
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                C36621b.m81958b();
            }
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5724s, com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: f */
        public void mo9549f() {
            m9556z();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5724s, com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: g */
        public void mo9550g(@NotNull Throwable t11) {
            Intrinsics.checkNotNullParameter(t11, "t");
            m9541A(t11);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5724s, com.facebook.imagepipeline.producers.AbstractC5682c
        /* JADX INFO: renamed from: i */
        public void mo9552i(float progress) {
            super.mo9552i(progress * 0.99f);
        }
    }

    public DecodeProducer(@NotNull InterfaceC46672a byteArrayPool, @NotNull Executor executor, @NotNull InterfaceC45421b imageDecoder, @NotNull InterfaceC45424e progressiveJpegConfig, @NotNull DownsampleMode downsampleMode, boolean z11, boolean z12, @NotNull InterfaceC5731v0<C46075i> inputProducer, int i11, @NotNull C44315a closeableReferenceFactory, @Nullable Runnable runnable, @NotNull InterfaceC45711k<Boolean> recoverFromDecoderOOM) {
        Intrinsics.checkNotNullParameter(byteArrayPool, "byteArrayPool");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(imageDecoder, "imageDecoder");
        Intrinsics.checkNotNullParameter(progressiveJpegConfig, "progressiveJpegConfig");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        Intrinsics.checkNotNullParameter(recoverFromDecoderOOM, "recoverFromDecoderOOM");
        this.byteArrayPool = byteArrayPool;
        this.executor = executor;
        this.imageDecoder = imageDecoder;
        this.progressiveJpegConfig = progressiveJpegConfig;
        this.downsampleMode = downsampleMode;
        this.downsampleEnabledForNetwork = z11;
        this.decodeCancellationEnabled = z12;
        this.inputProducer = inputProducer;
        this.maxBitmapDimension = i11;
        this.closeableReferenceFactory = closeableReferenceFactory;
        this.reclaimMemoryRunnable = runnable;
        this.recoverFromDecoderOOM = recoverFromDecoderOOM;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC5731v0
    /* JADX INFO: renamed from: a */
    public void mo9524a(@NotNull InterfaceC5712m<AbstractC0110a<InterfaceC46071e>> consumer, @NotNull InterfaceC5733w0 context) {
        DecodeProducer decodeProducer;
        InterfaceC5733w0 interfaceC5733w0;
        InterfaceC5712m<C46075i> c5665b;
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(context, "context");
        if (C36621b.m81959d()) {
            C36621b.m81957a("DecodeProducer#produceResults");
            try {
                ImageRequest imageRequestMo9666h = context.mo9666h();
                this.inputProducer.mo9524a((C36613d.m81947p(imageRequestMo9666h.getSourceUri()) || ImageRequestBuilder.m9850s(imageRequestMo9666h.getSourceUri())) ? new C5665b(this, consumer, context, new C45425f(this.byteArrayPool), this.progressiveJpegConfig, this.decodeCancellationEnabled, this.maxBitmapDimension) : new C5664a(this, consumer, context, this.decodeCancellationEnabled, this.maxBitmapDimension), context);
                Unit unit = Unit.INSTANCE;
                return;
            } finally {
                C36621b.m81958b();
            }
        }
        ImageRequest imageRequestMo9666h2 = context.mo9666h();
        if (C36613d.m81947p(imageRequestMo9666h2.getSourceUri()) || ImageRequestBuilder.m9850s(imageRequestMo9666h2.getSourceUri())) {
            decodeProducer = this;
            interfaceC5733w0 = context;
            c5665b = new C5665b(decodeProducer, consumer, interfaceC5733w0, new C45425f(decodeProducer.byteArrayPool), decodeProducer.progressiveJpegConfig, decodeProducer.decodeCancellationEnabled, decodeProducer.maxBitmapDimension);
        } else {
            c5665b = new C5664a(this, consumer, context, this.decodeCancellationEnabled, this.maxBitmapDimension);
            decodeProducer = this;
            interfaceC5733w0 = context;
        }
        decodeProducer.inputProducer.mo9524a(c5665b, interfaceC5733w0);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final C44315a getCloseableReferenceFactory() {
        return this.closeableReferenceFactory;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getDownsampleEnabledForNetwork() {
        return this.downsampleEnabledForNetwork;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final DownsampleMode getDownsampleMode() {
        return this.downsampleMode;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Executor getExecutor() {
        return this.executor;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC45421b getImageDecoder() {
        return this.imageDecoder;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Runnable getReclaimMemoryRunnable() {
        return this.reclaimMemoryRunnable;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final InterfaceC45711k<Boolean> m9531i() {
        return this.recoverFromDecoderOOM;
    }
}
