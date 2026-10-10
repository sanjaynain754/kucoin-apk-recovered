package com.facebook.imagepipeline.core;

import android.net.Uri;
import android.os.StrictMode;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.InterfaceC5648f;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.datasource.ProducerToDataSourceAdapter;
import com.facebook.imagepipeline.listener.ForwardingRequestListener2;
import com.facebook.imagepipeline.producers.C5684c1;
import com.facebook.imagepipeline.producers.C5686d0;
import com.facebook.imagepipeline.producers.InterfaceC5693f1;
import com.facebook.imagepipeline.producers.InterfaceC5731v0;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p190d4.C36613d;
import p192d6.C36621b;
import p251f4.C37352c;
import p251f4.InterfaceC37351b;
import p301h5.C38112b;
import p547q3.InterfaceC43595a;
import p549q5.InterfaceC43619h;
import p615s3.InterfaceC44276a;
import p617s5.InterfaceC44317b;
import p617s5.InterfaceC44346r;
import p632t5.C44693c;
import p712w3.InterfaceC45709i;
import p712w3.InterfaceC45711k;
import p749x5.InterfaceC46071e;
import p821z5.C46703b;
import p821z5.InterfaceC46704c;
import p821z5.InterfaceC46705d;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ImagePipeline.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 z2\u00020\u0001:\u0001{B±\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#Jc\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0.\"\u0004\b\u0000\u0010$2\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0%2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u00012\b\u0010+\u001a\u0004\u0018\u00010\u00052\b\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b/\u00100Jw\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0.\"\u0004\b\u0000\u0010$2\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0%2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u00012\b\u0010+\u001a\u0004\u0018\u00010\u00052\b\u0010-\u001a\u0004\u0018\u00010,2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0002\b\u0003\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104JS\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050.2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050%2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u0002062\b\u0010+\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\r0<2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020,¢\u0006\u0004\b?\u0010@J+\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0&0.2\u0006\u0010!\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bA\u0010BJQ\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0&0.2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010*\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\bC\u0010DJ-\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0&0.2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010*\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bE\u0010BJ5\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0&0.2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010*\u001a\u0004\u0018\u00010\u00012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\bF\u0010GJ)\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050.2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010*\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bH\u0010BJ=\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050.2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010*\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u0002062\b\u0010+\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020K2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020K2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\bN\u0010MJ\u0017\u0010O\u001a\u00020K2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020K2\u0006\u0010;\u001a\u00020:¢\u0006\u0004\bQ\u0010MJ\r\u0010R\u001a\u00020K¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020K¢\u0006\u0004\bT\u0010SJ\r\u0010U\u001a\u00020K¢\u0006\u0004\bU\u0010SJ\u0017\u0010V\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\bX\u0010#J\u0017\u0010Y\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\bY\u0010WJ!\u0010\\\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010:2\b\u0010[\u001a\u0004\u0018\u00010Z¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b^\u0010#J!\u0010_\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010+\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b_\u0010`R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010fR\u0014\u0010+\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010gR\u0014\u0010i\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010hR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010kR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bN\u0010n\u001a\u0004\bo\u0010pR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010qR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010fR\u0014\u0010t\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010sR\u001d\u0010u\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\bF\u0010f\u001a\u0004\bu\u0010vR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bC\u0010w\u001a\u0004\bx\u0010y¨\u0006|"}, m90084d2 = {"Lcom/facebook/imagepipeline/core/ImagePipeline;", "", "Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;", "producerSequenceFactory", "", "Lz5/d;", "requestListeners", "Lz5/c;", "requestListener2s", "Lw3/k;", "", "isPrefetchEnabledSupplier", "Lcom/facebook/imagepipeline/cache/f;", "Lq3/a;", "Lx5/e;", "bitmapMemoryCache", "Lcom/facebook/common/memory/PooledByteBuffer;", "encodedMemoryCache", "Ls5/b;", "diskCachesStoreSupplier", "Lq5/h;", "cacheKeyFactory", "Lcom/facebook/imagepipeline/producers/f1;", "threadHandoffProducerQueue", "suppressBitmapPrefetchingSupplier", "lazyDataSource", "Ls3/a;", "callerContextVerifier", "Ls5/r;", "config", "<init>", "(Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;Ljava/util/Set;Ljava/util/Set;Lw3/k;Lcom/facebook/imagepipeline/cache/f;Lcom/facebook/imagepipeline/cache/f;Lw3/k;Lq5/h;Lcom/facebook/imagepipeline/producers/f1;Lw3/k;Lw3/k;Ls3/a;Ls5/r;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "y", "(Lcom/facebook/imagepipeline/request/ImageRequest;)Z", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/facebook/imagepipeline/producers/v0;", "La4/a;", "producerSequence", "Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;", "lowestPermittedRequestLevelOnSubmit", "callerContext", "requestListener", "", "uiComponentId", "Lf4/b;", "D", "(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;Ljava/lang/Object;Lz5/d;Ljava/lang/String;)Lf4/b;", "", "extras", ExifInterface.LONGITUDE_EAST, "(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;Ljava/lang/Object;Lz5/d;Ljava/lang/String;Ljava/util/Map;)Lf4/b;", "Ljava/lang/Void;", "Lcom/facebook/imagepipeline/common/Priority;", "priority", "F", "(Lcom/facebook/imagepipeline/producers/v0;Lcom/facebook/imagepipeline/request/ImageRequest;Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;Ljava/lang/Object;Lcom/facebook/imagepipeline/common/Priority;Lz5/d;)Lf4/b;", "Landroid/net/Uri;", "uri", "Lw3/i;", "z", "(Landroid/net/Uri;)Lw3/i;", "p", "()Ljava/lang/String;", "o", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;)Lf4/b;", "m", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;Lz5/d;Ljava/lang/String;)Lf4/b;", "k", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;Lcom/facebook/imagepipeline/request/ImageRequest$RequestLevel;)Lf4/b;", "B", "C", "(Lcom/facebook/imagepipeline/request/ImageRequest;Ljava/lang/Object;Lcom/facebook/imagepipeline/common/Priority;Lz5/d;)Lf4/b;", "", "j", "(Landroid/net/Uri;)V", CmcdData.Factory.STREAMING_FORMAT_HLS, "i", "(Lcom/facebook/imagepipeline/request/ImageRequest;)V", "g", "e", "()V", "d", "c", "t", "(Landroid/net/Uri;)Z", "u", "v", "Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;", "cacheChoice", "w", "(Landroid/net/Uri;Lcom/facebook/imagepipeline/request/ImageRequest$CacheChoice;)Z", "x", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lcom/facebook/imagepipeline/request/ImageRequest;Lz5/d;)Lz5/d;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;", "getProducerSequenceFactory", "()Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;", "b", "Lw3/k;", "Lz5/d;", "Lz5/c;", "requestListener2", "f", "Lcom/facebook/imagepipeline/cache/f;", "q", "()Lcom/facebook/imagepipeline/cache/f;", "Lq5/h;", "r", "()Lq5/h;", "Lcom/facebook/imagepipeline/producers/f1;", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "idCounter", "isLazyDataSource", "()Lw3/k;", "Ls5/r;", "getConfig", "()Ls5/r;", "n", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nImagePipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePipeline.kt\ncom/facebook/imagepipeline/core/ImagePipeline\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1154:1\n40#2,9:1155\n40#2,9:1164\n40#2,9:1180\n40#2,9:1189\n40#2,9:1198\n40#2,9:1207\n216#3,2:1173\n216#3,2:1175\n216#3,2:1178\n1#4:1177\n*S KotlinDebug\n*F\n+ 1 ImagePipeline.kt\ncom/facebook/imagepipeline/core/ImagePipeline\n*L\n418#1:1155,9\n550#1:1164,9\n902#1:1180,9\n967#1:1189,9\n1005#1:1198,9\n1039#1:1207,9\n610#1:1173,2\n638#1:1175,2\n768#1:1178,2\n*E\n"})
public final class ImagePipeline {

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final CancellationException f8914o = new CancellationException("Prefetching is not enabled");

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final CancellationException f8915p = new CancellationException("ImageRequest is null");

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final CancellationException f8916q = new CancellationException("Modified URL is null");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ProducerSequenceFactory producerSequenceFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45711k<Boolean> isPrefetchEnabledSupplier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45711k<InterfaceC44317b> diskCachesStoreSupplier;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC46705d requestListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC46704c requestListener2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> bitmapMemoryCache;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> encodedMemoryCache;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC43619h cacheKeyFactory;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5693f1 threadHandoffProducerQueue;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45711k<Boolean> suppressBitmapPrefetchingSupplier;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final AtomicLong idCounter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC45711k<Boolean> isLazyDataSource;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44346r config;

    /* JADX INFO: renamed from: D */
    public final <T> InterfaceC37351b<AbstractC0110a<T>> m9212D(InterfaceC5731v0<AbstractC0110a<T>> producerSequence, ImageRequest imageRequest, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, Object callerContext, InterfaceC46705d requestListener, String uiComponentId) {
        return m9213E(producerSequence, imageRequest, lowestPermittedRequestLevelOnSubmit, callerContext, requestListener, uiComponentId, null);
    }

    /* JADX INFO: renamed from: E */
    public final <T> InterfaceC37351b<AbstractC0110a<T>> m9213E(InterfaceC5731v0<AbstractC0110a<T>> producerSequence, ImageRequest imageRequest, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, Object callerContext, InterfaceC46705d requestListener, String uiComponentId, Map<String, ?> extras) {
        InterfaceC37351b<AbstractC0110a<T>> interfaceC37351bM83952b;
        if (!C36621b.m81959d()) {
            C5686d0 c5686d0 = new C5686d0(m9229s(imageRequest, requestListener), this.requestListener2);
            try {
                ImageRequest.RequestLevel max = ImageRequest.RequestLevel.getMax(imageRequest.getLowestPermittedRequestLevel(), lowestPermittedRequestLevelOnSubmit);
                Intrinsics.checkNotNullExpressionValue(max, "getMax(...)");
                C5684c1 c5684c1 = new C5684c1(imageRequest, m9226p(), uiComponentId, c5686d0, callerContext, max, false, imageRequest.getProgressiveRenderingEnabled() || !C36613d.m81947p(imageRequest.getSourceUri()), imageRequest.getPriority(), this.config);
                c5684c1.putExtras(extras);
                return C44693c.m98857E(producerSequence, c5684c1, c5686d0);
            } catch (Exception e11) {
                return C37352c.m83952b(e11);
            }
        }
        C36621b.m81957a("ImagePipeline#submitFetchRequest");
        try {
            C5686d0 c5686d1 = new C5686d0(m9229s(imageRequest, requestListener), this.requestListener2);
            try {
                ImageRequest.RequestLevel max2 = ImageRequest.RequestLevel.getMax(imageRequest.getLowestPermittedRequestLevel(), lowestPermittedRequestLevelOnSubmit);
                Intrinsics.checkNotNullExpressionValue(max2, "getMax(...)");
                C5684c1 c5684c2 = new C5684c1(imageRequest, m9226p(), uiComponentId, c5686d1, callerContext, max2, false, imageRequest.getProgressiveRenderingEnabled() || !C36613d.m81947p(imageRequest.getSourceUri()), imageRequest.getPriority(), this.config);
                c5684c2.putExtras(extras);
                interfaceC37351bM83952b = C44693c.m98857E(producerSequence, c5684c2, c5686d1);
            } catch (Exception e12) {
                interfaceC37351bM83952b = C37352c.m83952b(e12);
            }
            C36621b.m81958b();
            return interfaceC37351bM83952b;
        } catch (Throwable th2) {
            C36621b.m81958b();
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final InterfaceC46705d m9229s(@Nullable ImageRequest imageRequest, @Nullable InterfaceC46705d requestListener) {
        if (imageRequest == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (requestListener == null) {
            return imageRequest.getRequestListener() == null ? this.requestListener : new C46703b(this.requestListener, imageRequest.getRequestListener());
        }
        return imageRequest.getRequestListener() == null ? new C46703b(this.requestListener, requestListener) : new C46703b(this.requestListener, requestListener, imageRequest.getRequestListener());
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.core.ImagePipeline$a */
    /* JADX INFO: compiled from: ImagePipeline.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class C5650a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageRequest.CacheChoice.values().length];
            try {
                iArr[ImageRequest.CacheChoice.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageRequest.CacheChoice.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageRequest.CacheChoice.DYNAMIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: A */
    public static final boolean m9205A(Uri uri, InterfaceC43595a key) {
        Intrinsics.checkNotNullParameter(uri, "$uri");
        Intrinsics.checkNotNullParameter(key, "key");
        return key.mo8760c(uri);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m9208f(InterfaceC43595a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ InterfaceC37351b m9209n(ImagePipeline imagePipeline, ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, InterfaceC46705d interfaceC46705d, String str, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            requestLevel = null;
        }
        if ((i11 & 8) != 0) {
            interfaceC46705d = null;
        }
        if ((i11 & 16) != 0) {
            str = null;
        }
        return imagePipeline.m9224m(imageRequest, obj, requestLevel, interfaceC46705d, str);
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public final InterfaceC37351b<Void> m9210B(@Nullable ImageRequest imageRequest, @Nullable Object callerContext) {
        return m9211C(imageRequest, callerContext, Priority.MEDIUM, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX INFO: renamed from: F */
    public final InterfaceC37351b<Void> m9214F(InterfaceC5731v0<Void> producerSequence, ImageRequest imageRequest, ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, Object callerContext, Priority priority, InterfaceC46705d requestListener) {
        boolean z11;
        C5686d0 c5686d0 = new C5686d0(m9229s(imageRequest, requestListener), this.requestListener2);
        Uri sourceUri = imageRequest.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
        Uri uriMo86043a = C38112b.INSTANCE.mo86043a(sourceUri, callerContext);
        if (uriMo86043a == null) {
            InterfaceC37351b<Void> interfaceC37351bM83952b = C37352c.m83952b(f8916q);
            Intrinsics.checkNotNullExpressionValue(interfaceC37351bM83952b, "immediateFailedDataSource(...)");
            return interfaceC37351bM83952b;
        }
        if (!Intrinsics.areEqual(sourceUri, uriMo86043a)) {
            imageRequest = ImageRequestBuilder.m9849b(imageRequest).m9869R(uriMo86043a).m9872a();
        }
        ImageRequest imageRequest2 = imageRequest;
        try {
            ImageRequest.RequestLevel max = ImageRequest.RequestLevel.getMax(imageRequest2.getLowestPermittedRequestLevel(), lowestPermittedRequestLevelOnSubmit);
            Intrinsics.checkNotNullExpressionValue(max, "getMax(...)");
            String strM9226p = m9226p();
            ImagePipelineExperiments experiments = this.config.getExperiments();
            if (experiments != null) {
                z11 = experiments.getAllowProgressiveOnPrefetch() && imageRequest2.getProgressiveRenderingEnabled();
            }
            return ProducerToDataSourceAdapter.INSTANCE.create(producerSequence, new C5684c1(imageRequest2, strM9226p, c5686d0, callerContext, max, true, z11, priority, this.config), c5686d0);
        } catch (Exception e11) {
            return C37352c.m83952b(e11);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9216d() {
        InterfaceC44317b interfaceC44317b = this.diskCachesStoreSupplier.get();
        Intrinsics.checkNotNullExpressionValue(interfaceC44317b, "get(...)");
        InterfaceC44317b interfaceC44317b2 = interfaceC44317b;
        interfaceC44317b2.mo97779b().m9131h();
        interfaceC44317b2.mo97778a().m9131h();
        Iterator<Map.Entry<String, BufferedDiskCache>> it = interfaceC44317b2.mo97780c().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m9131h();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9217e() {
        InterfaceC45709i<InterfaceC43595a> interfaceC45709i = new InterfaceC45709i() { // from class: s5.q
            @Override // p712w3.InterfaceC45709i
            public final boolean apply(Object obj) {
                return ImagePipeline.m9208f((InterfaceC43595a) obj);
            }
        };
        this.bitmapMemoryCache.mo9157c(interfaceC45709i);
        this.encodedMemoryCache.mo9157c(interfaceC45709i);
    }

    /* JADX INFO: renamed from: i */
    public final void m9220i(@Nullable ImageRequest imageRequest) {
        if (imageRequest == null) {
            return;
        }
        InterfaceC43595a interfaceC43595aMo95975b = this.cacheKeyFactory.mo95975b(imageRequest, null);
        InterfaceC44317b interfaceC44317b = this.diskCachesStoreSupplier.get();
        Intrinsics.checkNotNullExpressionValue(interfaceC44317b, "get(...)");
        InterfaceC44317b interfaceC44317b2 = interfaceC44317b;
        BufferedDiskCache bufferedDiskCacheMo97779b = interfaceC44317b2.mo97779b();
        Intrinsics.checkNotNull(interfaceC43595aMo95975b);
        bufferedDiskCacheMo97779b.m9139s(interfaceC43595aMo95975b);
        interfaceC44317b2.mo97778a().m9139s(interfaceC43595aMo95975b);
        Iterator<Map.Entry<String, BufferedDiskCache>> it = interfaceC44317b2.mo97780c().entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().m9139s(interfaceC43595aMo95975b);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> m9222k(@Nullable ImageRequest imageRequest, @Nullable Object callerContext) {
        return m9209n(this, imageRequest, callerContext, null, null, null, 24, null);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> m9223l(@Nullable ImageRequest imageRequest, @Nullable Object callerContext, @NotNull ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit) {
        Intrinsics.checkNotNullParameter(lowestPermittedRequestLevelOnSubmit, "lowestPermittedRequestLevelOnSubmit");
        return m9209n(this, imageRequest, callerContext, lowestPermittedRequestLevelOnSubmit, null, null, 16, null);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> m9224m(@Nullable ImageRequest imageRequest, @Nullable Object callerContext, @Nullable ImageRequest.RequestLevel lowestPermittedRequestLevelOnSubmit, @Nullable InterfaceC46705d requestListener, @Nullable String uiComponentId) {
        if (imageRequest == null) {
            InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> interfaceC37351bM83952b = C37352c.m83952b(new NullPointerException());
            Intrinsics.checkNotNullExpressionValue(interfaceC37351bM83952b, "immediateFailedDataSource(...)");
            return interfaceC37351bM83952b;
        }
        try {
            InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0M9405E = this.producerSequenceFactory.m9405E(imageRequest);
            if (lowestPermittedRequestLevelOnSubmit == null) {
                lowestPermittedRequestLevelOnSubmit = ImageRequest.RequestLevel.FULL_FETCH;
            }
            return m9212D(interfaceC5731v0M9405E, imageRequest, lowestPermittedRequestLevelOnSubmit, callerContext, requestListener, uiComponentId);
        } catch (Exception e11) {
            return C37352c.m83952b(e11);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> m9225o(@NotNull ImageRequest imageRequest, @Nullable Object callerContext) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        return m9223l(imageRequest, callerContext, ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE);
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final String m9226p() {
        return String.valueOf(this.idCounter.getAndIncrement());
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> m9227q() {
        return this.bitmapMemoryCache;
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final InterfaceC43619h getCacheKeyFactory() {
        return this.cacheKeyFactory;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m9230t(@Nullable Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.bitmapMemoryCache.mo9159f(m9236z(uri));
    }

    /* JADX INFO: renamed from: u */
    public final boolean m9231u(@Nullable ImageRequest imageRequest) {
        if (imageRequest == null) {
            return false;
        }
        InterfaceC43595a interfaceC43595aMo95976c = this.cacheKeyFactory.mo95976c(imageRequest, null);
        InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> interfaceC5648f = this.bitmapMemoryCache;
        Intrinsics.checkNotNull(interfaceC43595aMo95976c);
        AbstractC0110a<InterfaceC46071e> abstractC0110a = interfaceC5648f.get(interfaceC43595aMo95976c);
        try {
            return AbstractC0110a.m557o(abstractC0110a);
        } finally {
            AbstractC0110a.m555j(abstractC0110a);
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m9232v(@Nullable Uri uri) {
        return m9233w(uri, ImageRequest.CacheChoice.SMALL) || m9233w(uri, ImageRequest.CacheChoice.DEFAULT) || m9233w(uri, ImageRequest.CacheChoice.DYNAMIC);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m9234x(@NotNull ImageRequest imageRequest) {
        boolean zM9133k;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        InterfaceC44317b interfaceC44317b = this.diskCachesStoreSupplier.get();
        Intrinsics.checkNotNullExpressionValue(interfaceC44317b, "get(...)");
        InterfaceC44317b interfaceC44317b2 = interfaceC44317b;
        InterfaceC43595a interfaceC43595aMo95975b = this.cacheKeyFactory.mo95975b(imageRequest, null);
        ImageRequest.CacheChoice cacheChoice = imageRequest.getCacheChoice();
        Intrinsics.checkNotNullExpressionValue(cacheChoice, "getCacheChoice(...)");
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int i11 = C5650a.$EnumSwitchMapping$0[cacheChoice.ordinal()];
            if (i11 == 1) {
                BufferedDiskCache bufferedDiskCacheMo97779b = interfaceC44317b2.mo97779b();
                Intrinsics.checkNotNull(interfaceC43595aMo95975b);
                zM9133k = bufferedDiskCacheMo97779b.m9133k(interfaceC43595aMo95975b);
            } else if (i11 == 2) {
                BufferedDiskCache bufferedDiskCacheMo97778a = interfaceC44317b2.mo97778a();
                Intrinsics.checkNotNull(interfaceC43595aMo95975b);
                zM9133k = bufferedDiskCacheMo97778a.m9133k(interfaceC43595aMo95975b);
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                zM9133k = m9235y(imageRequest);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return zM9133k;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m9235y(ImageRequest imageRequest) {
        InterfaceC44317b interfaceC44317b = this.diskCachesStoreSupplier.get();
        Intrinsics.checkNotNullExpressionValue(interfaceC44317b, "get(...)");
        InterfaceC44317b interfaceC44317b2 = interfaceC44317b;
        InterfaceC43595a interfaceC43595aMo95975b = this.cacheKeyFactory.mo95975b(imageRequest, null);
        String diskCacheId = imageRequest.getDiskCacheId();
        if (diskCacheId != null) {
            BufferedDiskCache bufferedDiskCache = interfaceC44317b2.mo97780c().get(diskCacheId);
            if (bufferedDiskCache == null) {
                return false;
            }
            Intrinsics.checkNotNull(interfaceC43595aMo95975b);
            return bufferedDiskCache.m9133k(interfaceC43595aMo95975b);
        }
        Iterator<Map.Entry<String, BufferedDiskCache>> it = interfaceC44317b2.mo97780c().entrySet().iterator();
        while (it.hasNext()) {
            BufferedDiskCache value = it.next().getValue();
            Intrinsics.checkNotNull(interfaceC43595aMo95975b);
            if (value.m9133k(interfaceC43595aMo95975b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final InterfaceC45709i<InterfaceC43595a> m9236z(final Uri uri) {
        return new InterfaceC45709i() { // from class: s5.p
            @Override // p712w3.InterfaceC45709i
            public final boolean apply(Object obj) {
                return ImagePipeline.m9205A(uri, (InterfaceC43595a) obj);
            }
        };
    }

    public ImagePipeline(@NotNull ProducerSequenceFactory producerSequenceFactory, @NotNull Set<? extends InterfaceC46705d> requestListeners, @NotNull Set<? extends InterfaceC46704c> requestListener2s, @NotNull InterfaceC45711k<Boolean> isPrefetchEnabledSupplier, @NotNull InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> bitmapMemoryCache, @NotNull InterfaceC5648f<InterfaceC43595a, PooledByteBuffer> encodedMemoryCache, @NotNull InterfaceC45711k<InterfaceC44317b> diskCachesStoreSupplier, @NotNull InterfaceC43619h cacheKeyFactory, @NotNull InterfaceC5693f1 threadHandoffProducerQueue, @NotNull InterfaceC45711k<Boolean> suppressBitmapPrefetchingSupplier, @NotNull InterfaceC45711k<Boolean> lazyDataSource, @Nullable InterfaceC44276a interfaceC44276a, @NotNull InterfaceC44346r config) {
        Intrinsics.checkNotNullParameter(producerSequenceFactory, "producerSequenceFactory");
        Intrinsics.checkNotNullParameter(requestListeners, "requestListeners");
        Intrinsics.checkNotNullParameter(requestListener2s, "requestListener2s");
        Intrinsics.checkNotNullParameter(isPrefetchEnabledSupplier, "isPrefetchEnabledSupplier");
        Intrinsics.checkNotNullParameter(bitmapMemoryCache, "bitmapMemoryCache");
        Intrinsics.checkNotNullParameter(encodedMemoryCache, "encodedMemoryCache");
        Intrinsics.checkNotNullParameter(diskCachesStoreSupplier, "diskCachesStoreSupplier");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(suppressBitmapPrefetchingSupplier, "suppressBitmapPrefetchingSupplier");
        Intrinsics.checkNotNullParameter(lazyDataSource, "lazyDataSource");
        Intrinsics.checkNotNullParameter(config, "config");
        this.producerSequenceFactory = producerSequenceFactory;
        this.isPrefetchEnabledSupplier = isPrefetchEnabledSupplier;
        this.diskCachesStoreSupplier = diskCachesStoreSupplier;
        this.requestListener = new C46703b((Set<InterfaceC46705d>) requestListeners);
        this.requestListener2 = new ForwardingRequestListener2(requestListener2s);
        this.idCounter = new AtomicLong();
        this.bitmapMemoryCache = bitmapMemoryCache;
        this.encodedMemoryCache = encodedMemoryCache;
        this.cacheKeyFactory = cacheKeyFactory;
        this.threadHandoffProducerQueue = threadHandoffProducerQueue;
        this.suppressBitmapPrefetchingSupplier = suppressBitmapPrefetchingSupplier;
        this.isLazyDataSource = lazyDataSource;
        this.config = config;
    }

    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: C */
    public final InterfaceC37351b<Void> m9211C(@Nullable ImageRequest imageRequest, @Nullable Object callerContext, @NotNull Priority priority, @Nullable InterfaceC46705d requestListener) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (!this.isPrefetchEnabledSupplier.get().booleanValue()) {
            InterfaceC37351b<Void> interfaceC37351bM83952b = C37352c.m83952b(f8914o);
            Intrinsics.checkNotNullExpressionValue(interfaceC37351bM83952b, "immediateFailedDataSource(...)");
            return interfaceC37351bM83952b;
        }
        if (imageRequest == null) {
            InterfaceC37351b<Void> interfaceC37351bM83952b2 = C37352c.m83952b(new NullPointerException("imageRequest is null"));
            Intrinsics.checkNotNull(interfaceC37351bM83952b2);
            return interfaceC37351bM83952b2;
        }
        try {
            return m9214F(this.producerSequenceFactory.m9407G(imageRequest), imageRequest, ImageRequest.RequestLevel.FULL_FETCH, callerContext, priority, requestListener);
        } catch (Exception e11) {
            return C37352c.m83952b(e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9215c() {
        m9217e();
        m9216d();
    }

    /* JADX INFO: renamed from: g */
    public final void m9218g(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        m9221j(uri);
        m9219h(uri);
    }

    /* JADX INFO: renamed from: h */
    public final void m9219h(@Nullable Uri uri) {
        ImageRequest imageRequestFromUri = ImageRequest.fromUri(uri);
        if (imageRequestFromUri != null) {
            m9220i(imageRequestFromUri);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: renamed from: j */
    public final void m9221j(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        InterfaceC45709i<InterfaceC43595a> interfaceC45709iM9236z = m9236z(uri);
        this.bitmapMemoryCache.mo9157c(interfaceC45709iM9236z);
        this.encodedMemoryCache.mo9157c(interfaceC45709iM9236z);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m9233w(@Nullable Uri uri, @Nullable ImageRequest.CacheChoice cacheChoice) {
        ImageRequest imageRequestM9872a = ImageRequestBuilder.m9851x(uri).m9852A(cacheChoice).m9872a();
        Intrinsics.checkNotNull(imageRequestM9872a);
        return m9234x(imageRequestM9872a);
    }
}
