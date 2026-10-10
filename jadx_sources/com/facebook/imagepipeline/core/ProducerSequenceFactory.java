package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.imagepipeline.core.ProducerSequenceFactory;
import com.facebook.imagepipeline.producers.BitmapMemoryCacheGetProducer;
import com.facebook.imagepipeline.producers.C5676a;
import com.facebook.imagepipeline.producers.C5678a1;
import com.facebook.imagepipeline.producers.C5681b1;
import com.facebook.imagepipeline.producers.C5690e1;
import com.facebook.imagepipeline.producers.C5694g;
import com.facebook.imagepipeline.producers.C5697h;
import com.facebook.imagepipeline.producers.C5699h1;
import com.facebook.imagepipeline.producers.C5703j;
import com.facebook.imagepipeline.producers.C5705j1;
import com.facebook.imagepipeline.producers.C5706k;
import com.facebook.imagepipeline.producers.C5707k0;
import com.facebook.imagepipeline.producers.C5710l0;
import com.facebook.imagepipeline.producers.C5714n;
import com.facebook.imagepipeline.producers.C5716o;
import com.facebook.imagepipeline.producers.C5721q0;
import com.facebook.imagepipeline.producers.C5722r;
import com.facebook.imagepipeline.producers.C5726t;
import com.facebook.imagepipeline.producers.C5727t0;
import com.facebook.imagepipeline.producers.C5728u;
import com.facebook.imagepipeline.producers.C5732w;
import com.facebook.imagepipeline.producers.C5736y;
import com.facebook.imagepipeline.producers.DecodeProducer;
import com.facebook.imagepipeline.producers.InterfaceC5693f1;
import com.facebook.imagepipeline.producers.InterfaceC5708k1;
import com.facebook.imagepipeline.producers.InterfaceC5719p0;
import com.facebook.imagepipeline.producers.InterfaceC5731v0;
import com.facebook.imagepipeline.producers.LocalAssetFetchProducer;
import com.facebook.imagepipeline.producers.LocalContentUriFetchProducer;
import com.facebook.imagepipeline.producers.LocalFileFetchProducer;
import com.facebook.imagepipeline.producers.LocalResourceFetchProducer;
import com.facebook.imagepipeline.producers.QualifiedResourceFetchProducer;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a4.AbstractC0110a;
import p192d6.C36621b;
import p223e6.InterfaceC37079d;
import p617s5.C44350v;
import p712w3.C45708h;
import p749x5.C46075i;
import p749x5.InterfaceC46071e;
import p784y3.C46369a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ProducerSequenceFactory.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010%\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b.\u0018\u0000 \u0083\u00012\u00020\u0001:\u0002\u0093\u0001B\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH\u0002¢\u0006\u0004\b%\u0010&J=\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0(0'H\u0002¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH\u0002¢\u0006\u0004\b,\u0010&J#\u0010-\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001eH\u0002¢\u0006\u0004\b-\u0010&J/\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b.\u0010&J7\u0010/\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0(0'H\u0002¢\u0006\u0004\b/\u0010+J)\u00100\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0(0'H\u0002¢\u0006\u0004\b0\u00101J/\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b2\u0010&J/\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b3\u0010&J/\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001eH\u0002¢\u0006\u0004\b4\u0010&J\u001d\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b6\u0010\"J!\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b7\u0010\"J\u001f\u00108\u001a\b\u0012\u0004\u0012\u00020#0\u001e2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b8\u00109J'\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001e¢\u0006\u0004\b:\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010BR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010BR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010BR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010BR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010BR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010BR\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QRL\u0010[\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e0R8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bS\u0010T\u0012\u0004\bY\u0010Z\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XRH\u0010`\u001a\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001050\u001e0R8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\\\u0010T\u0012\u0004\b_\u0010Z\u001a\u0004\b]\u0010V\"\u0004\b^\u0010XRL\u0010e\u001a&\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e0R8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\ba\u0010T\u0012\u0004\bd\u0010Z\u001a\u0004\bb\u0010V\"\u0004\bc\u0010XR'\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR-\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0\u001f0\u001e8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\bl\u0010h\u0012\u0004\bn\u0010Z\u001a\u0004\bm\u0010jR'\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020f0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bp\u0010h\u001a\u0004\bq\u0010jR'\u0010u\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bs\u0010h\u001a\u0004\bt\u0010jR#\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bv\u0010h\u001a\u0004\bw\u0010jR#\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\by\u0010h\u001a\u0004\bz\u0010jR!\u0010~\u001a\b\u0012\u0004\u0012\u00020#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b|\u0010h\u001a\u0004\b}\u0010jR$\u0010\u0080\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bw\u0010h\u001a\u0004\b\u007f\u0010jR$\u0010\u0081\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010h\u001a\u0004\b|\u0010jR$\u0010\u0082\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010h\u001a\u0004\by\u0010jR)\u0010\u0084\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b}\u0010h\u001a\u0005\b\u0083\u0001\u0010jR*\u0010\u0087\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010h\u001a\u0005\b\u0086\u0001\u0010jR)\u0010\u0089\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b7\u0010h\u001a\u0005\b\u0088\u0001\u0010jR)\u0010\u008b\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8GX\u0086\u0084\u0002¢\u0006\r\n\u0004\b4\u0010h\u001a\u0005\b\u008a\u0001\u0010jR)\u0010\u008d\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b6\u0010h\u001a\u0005\b\u008c\u0001\u0010jR*\u0010\u0090\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010h\u001a\u0005\b\u008f\u0001\u0010jR*\u0010\u0091\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010h\u001a\u0005\b\u008e\u0001\u0010jR)\u0010\u0092\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b\u007f\u0010h\u001a\u0005\b\u0085\u0001\u0010j¨\u0006\u0094\u0001"}, m90084d2 = {"Lcom/facebook/imagepipeline/core/ProducerSequenceFactory;", "", "Landroid/content/ContentResolver;", "contentResolver", "Ls5/v;", "producerFactory", "Lcom/facebook/imagepipeline/producers/p0;", "networkFetcher", "", "resizeAndRotateEnabledForNetwork", "webpSupportEnabled", "Lcom/facebook/imagepipeline/producers/f1;", "threadHandoffProducerQueue", "Lcom/facebook/imagepipeline/core/DownsampleMode;", "downsampleMode", "useBitmapPrepareToDraw", "partialImageCachingEnabled", "diskCacheEnabled", "Le6/d;", "imageTranscoderFactory", "isEncodedMemoryCacheProbingEnabled", "isDiskCacheProbingEnabled", "allowDelay", "", "Lcom/facebook/imagepipeline/producers/n;", "customProducerSequenceFactories", "<init>", "(Landroid/content/ContentResolver;Ls5/v;Lcom/facebook/imagepipeline/producers/p0;ZZLcom/facebook/imagepipeline/producers/f1;Lcom/facebook/imagepipeline/core/DownsampleMode;ZZZLe6/d;ZZZLjava/util/Set;)V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "Lcom/facebook/imagepipeline/producers/v0;", "La4/a;", "Lx5/e;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Lcom/facebook/imagepipeline/request/ImageRequest;)Lcom/facebook/imagepipeline/producers/v0;", "Lx5/i;", "inputProducer", "g0", "(Lcom/facebook/imagepipeline/producers/v0;)Lcom/facebook/imagepipeline/producers/v0;", "", "Lcom/facebook/imagepipeline/producers/k1;", "thumbnailProducers", "h0", "(Lcom/facebook/imagepipeline/producers/v0;[Lcom/facebook/imagepipeline/producers/k1;)Lcom/facebook/imagepipeline/producers/v0;", "k0", "j0", "e0", "m0", "l0", "([Lcom/facebook/imagepipeline/producers/k1;)Lcom/facebook/imagepipeline/producers/v0;", "Q", "B", "F", "Ljava/lang/Void;", "G", ExifInterface.LONGITUDE_EAST, "i0", "(Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/v0;", "f0", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/content/ContentResolver;", "b", "Ls5/v;", "c", "Lcom/facebook/imagepipeline/producers/p0;", "d", "Z", "e", "f", "Lcom/facebook/imagepipeline/producers/f1;", "g", "Lcom/facebook/imagepipeline/core/DownsampleMode;", CmcdData.Factory.STREAMING_FORMAT_HLS, "i", "j", "k", "Le6/d;", CmcdData.Factory.STREAM_TYPE_LIVE, "m", "n", "o", "Ljava/util/Set;", "", "p", "Ljava/util/Map;", "getPostprocessorSequences", "()Ljava/util/Map;", "setPostprocessorSequences", "(Ljava/util/Map;)V", "getPostprocessorSequences$annotations", "()V", "postprocessorSequences", "q", "getCloseableImagePrefetchSequences", "setCloseableImagePrefetchSequences", "getCloseableImagePrefetchSequences$annotations", "closeableImagePrefetchSequences", "r", "getBitmapPrepareSequences", "setBitmapPrepareSequences", "getBitmapPrepareSequences$annotations", "bitmapPrepareSequences", "Lcom/facebook/common/memory/PooledByteBuffer;", CmcdData.Factory.STREAMING_FORMAT_SS, "Lkotlin/Lazy;", "getNetworkFetchEncodedImageProducerSequence", "()Lcom/facebook/imagepipeline/producers/v0;", "networkFetchEncodedImageProducerSequence", "t", "getLocalFileFetchEncodedImageProducerSequence", "getLocalFileFetchEncodedImageProducerSequence$annotations", "localFileFetchEncodedImageProducerSequence", "u", "getLocalContentUriFetchEncodedImageProducerSequence", "localContentUriFetchEncodedImageProducerSequence", "v", "O", "networkFetchSequence", "w", "z", "backgroundNetworkFetchToEncodedMemorySequence", "x", "P", "networkFetchToEncodedMemoryPrefetchSequence", "y", "C", "commonNetworkFetchToEncodedMemorySequence", "J", "localFileFetchToEncodedMemoryPrefetchSequence", "backgroundLocalFileFetchToEncodeMemorySequence", "backgroundLocalContentUriFetchToEncodeMemorySequence", "K", "localImageFileFetchSequence", "D", "N", "localVideoFileFetchSequence", "I", "localContentUriFetchSequence", "M", "localThumbnailBitmapSdk29FetchSequence", "R", "qualifiedResourceFetchSequence", "H", "L", "localResourceFetchSequence", "localAssetFetchSequence", "dataFetchSequence", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nProducerSequenceFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProducerSequenceFactory.kt\ncom/facebook/imagepipeline/core/ProducerSequenceFactory\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,636:1\n40#2,9:637\n40#2,9:646\n40#2,2:655\n44#2,5:658\n40#2,9:663\n40#2,9:672\n40#2,9:681\n40#2,9:690\n40#2,9:699\n40#2,9:708\n40#2,9:717\n40#2,9:726\n40#2,9:735\n40#2,9:744\n40#2,9:753\n40#2,9:762\n40#2,9:771\n1#3:657\n*S KotlinDebug\n*F\n+ 1 ProducerSequenceFactory.kt\ncom/facebook/imagepipeline/core/ProducerSequenceFactory\n*L\n79#1:637,9\n167#1:646,9\n198#1:655,2\n198#1:658,5\n298#1:663,9\n483#1:672,9\n511#1:681,9\n109#1:690,9\n118#1:699,9\n129#1:708,9\n257#1:717,9\n267#1:726,9\n279#1:735,9\n289#1:744,9\n317#1:753,9\n327#1:762,9\n341#1:771,9\n*E\n"})
public final class ProducerSequenceFactory {

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lazy backgroundLocalFileFetchToEncodeMemorySequence;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Lazy backgroundLocalContentUriFetchToEncodeMemorySequence;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    public final Lazy localImageFileFetchSequence;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Lazy localVideoFileFetchSequence;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Lazy localContentUriFetchSequence;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    public final Lazy localThumbnailBitmapSdk29FetchSequence;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final Lazy qualifiedResourceFetchSequence;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    public final Lazy localResourceFetchSequence;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    public final Lazy localAssetFetchSequence;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public final Lazy dataFetchSequence;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ContentResolver contentResolver;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C44350v producerFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5719p0<?> networkFetcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean resizeAndRotateEnabledForNetwork;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean webpSupportEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5693f1 threadHandoffProducerQueue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final DownsampleMode downsampleMode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final boolean useBitmapPrepareToDraw;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean partialImageCachingEnabled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final boolean diskCacheEnabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC37079d imageTranscoderFactory;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final boolean isEncodedMemoryCacheProbingEnabled;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final boolean isDiskCacheProbingEnabled;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final boolean allowDelay;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public final Set<C5714n> customProducerSequenceFactories;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public Map<InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>>, InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>>> postprocessorSequences;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public Map<InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>>, InterfaceC5731v0<Void>> closeableImagePrefetchSequences;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public Map<InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>>, InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>>> bitmapPrepareSequences;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final Lazy networkFetchEncodedImageProducerSequence;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public final Lazy localFileFetchEncodedImageProducerSequence;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public final Lazy localContentUriFetchEncodedImageProducerSequence;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public final Lazy networkFetchSequence;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final Lazy backgroundNetworkFetchToEncodedMemorySequence;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final Lazy networkFetchToEncodedMemoryPrefetchSequence;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Lazy commonNetworkFetchToEncodedMemorySequence;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy localFileFetchToEncodedMemoryPrefetchSequence;

    /* JADX INFO: compiled from: ProducerSequenceFactory.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/facebook/imagepipeline/core/ProducerSequenceFactory$Companion;", "", "<init>", "()V", "Lcom/facebook/imagepipeline/request/ImageRequest;", "imageRequest", "", "b", "(Lcom/facebook/imagepipeline/request/ImageRequest;)V", "Landroid/net/Uri;", "uri", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/net/Uri;)Ljava/lang/String;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final String m9431a(Uri uri) {
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (string.length() > 30) {
                String strSubstring = string.substring(0, 30);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return strSubstring + "...";
            }
            return string;
        }

        /* JADX INFO: renamed from: b */
        public final void m9432b(ImageRequest imageRequest) {
            boolean z11;
            if (imageRequest.getLowestPermittedRequestLevel().getValue() <= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            C45708h.m100891b(Boolean.valueOf(z11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProducerSequenceFactory(@NotNull ContentResolver contentResolver, @NotNull C44350v producerFactory, @NotNull InterfaceC5719p0<?> networkFetcher, boolean z11, boolean z12, @NotNull InterfaceC5693f1 threadHandoffProducerQueue, @NotNull DownsampleMode downsampleMode, boolean z13, boolean z14, boolean z15, @NotNull InterfaceC37079d imageTranscoderFactory, boolean z16, boolean z17, boolean z18, @Nullable Set<? extends C5714n> set) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(producerFactory, "producerFactory");
        Intrinsics.checkNotNullParameter(networkFetcher, "networkFetcher");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        Intrinsics.checkNotNullParameter(imageTranscoderFactory, "imageTranscoderFactory");
        this.contentResolver = contentResolver;
        this.producerFactory = producerFactory;
        this.networkFetcher = networkFetcher;
        this.resizeAndRotateEnabledForNetwork = z11;
        this.webpSupportEnabled = z12;
        this.threadHandoffProducerQueue = threadHandoffProducerQueue;
        this.downsampleMode = downsampleMode;
        this.useBitmapPrepareToDraw = z13;
        this.partialImageCachingEnabled = z14;
        this.diskCacheEnabled = z15;
        this.imageTranscoderFactory = imageTranscoderFactory;
        this.isEncodedMemoryCacheProbingEnabled = z16;
        this.isDiskCacheProbingEnabled = z17;
        this.allowDelay = z18;
        this.customProducerSequenceFactories = set;
        this.postprocessorSequences = new LinkedHashMap();
        this.closeableImagePrefetchSequences = new LinkedHashMap();
        this.bitmapPrepareSequences = new LinkedHashMap();
        this.networkFetchEncodedImageProducerSequence = LazyKt.lazy(new Function0() { // from class: s5.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9376b0(this.f98020b);
            }
        });
        this.localFileFetchEncodedImageProducerSequence = LazyKt.lazy(new Function0() { // from class: s5.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9368V(this.f97987b);
            }
        });
        this.localContentUriFetchEncodedImageProducerSequence = LazyKt.lazy(new Function0() { // from class: s5.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9366T(this.f98021b);
            }
        });
        this.networkFetchSequence = LazyKt.lazy(new Function0() { // from class: s5.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9378c0(this.f98022b);
            }
        });
        this.backgroundNetworkFetchToEncodedMemorySequence = LazyKt.lazy(new Function0() { // from class: s5.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9398u(this.f98023b);
            }
        });
        this.networkFetchToEncodedMemoryPrefetchSequence = LazyKt.lazy(new Function0() { // from class: s5.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9380d0(this.f97947b);
            }
        });
        this.commonNetworkFetchToEncodedMemorySequence = LazyKt.lazy(new Function0() { // from class: s5.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9399v(this.f97948b);
            }
        });
        this.localFileFetchToEncodedMemoryPrefetchSequence = LazyKt.lazy(new Function0() { // from class: s5.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9369W(this.f97950b);
            }
        });
        this.backgroundLocalFileFetchToEncodeMemorySequence = LazyKt.lazy(new Function0() { // from class: s5.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9397t(this.f97952b);
            }
        });
        this.backgroundLocalContentUriFetchToEncodeMemorySequence = LazyKt.lazy(new Function0() { // from class: s5.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9396s(this.f97955b);
            }
        });
        this.localImageFileFetchSequence = LazyKt.lazy(new Function0() { // from class: s5.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9370X(this.f97957b);
            }
        });
        this.localVideoFileFetchSequence = LazyKt.lazy(new Function0() { // from class: s5.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9374a0(this.f97960b);
            }
        });
        this.localContentUriFetchSequence = LazyKt.lazy(new Function0() { // from class: s5.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9367U(this.f97963b);
            }
        });
        this.localThumbnailBitmapSdk29FetchSequence = LazyKt.lazy(new Function0() { // from class: s5.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9372Z(this.f97966b);
            }
        });
        this.qualifiedResourceFetchSequence = LazyKt.lazy(new Function0() { // from class: s5.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9391n0(this.f97982b);
            }
        });
        this.localResourceFetchSequence = LazyKt.lazy(new Function0() { // from class: s5.k0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9371Y(this.f97984b);
            }
        });
        this.localAssetFetchSequence = LazyKt.lazy(new Function0() { // from class: s5.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9365S(this.f97985b);
            }
        });
        this.dataFetchSequence = LazyKt.lazy(new Function0() { // from class: s5.m0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProducerSequenceFactory.m9400w(this.f97986b);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public final synchronized InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9402B(InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> inputProducer) {
        InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0M97829f;
        interfaceC5731v0M97829f = this.bitmapPrepareSequences.get(inputProducer);
        if (interfaceC5731v0M97829f == null) {
            interfaceC5731v0M97829f = this.producerFactory.m97829f(inputProducer);
            this.bitmapPrepareSequences.put(inputProducer, interfaceC5731v0M97829f);
        }
        return interfaceC5731v0M97829f;
    }

    /* JADX INFO: renamed from: F */
    public final synchronized InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9406F(InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> inputProducer) {
        C5722r c5722rM97833k;
        c5722rM97833k = this.producerFactory.m97833k(inputProducer);
        Intrinsics.checkNotNullExpressionValue(c5722rM97833k, "newDelayProducer(...)");
        return c5722rM97833k;
    }

    /* JADX INFO: renamed from: Q */
    public final synchronized InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9417Q(InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> inputProducer) {
        InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0M97818A;
        interfaceC5731v0M97818A = this.postprocessorSequences.get(inputProducer);
        if (interfaceC5731v0M97818A == null) {
            C5727t0 c5727t0M97819B = this.producerFactory.m97819B(inputProducer);
            Intrinsics.checkNotNullExpressionValue(c5727t0M97819B, "newPostprocessorProducer(...)");
            interfaceC5731v0M97818A = this.producerFactory.m97818A(c5727t0M97819B);
            this.postprocessorSequences.put(inputProducer, interfaceC5731v0M97818A);
        }
        return interfaceC5731v0M97818A;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final synchronized InterfaceC5731v0<C46075i> m9423i0(@NotNull InterfaceC5719p0<?> networkFetcher) {
        try {
            Intrinsics.checkNotNullParameter(networkFetcher, "networkFetcher");
            boolean z11 = false;
            if (!C36621b.m81959d()) {
                InterfaceC5731v0<C46075i> interfaceC5731v0M97847y = this.producerFactory.m97847y(networkFetcher);
                Intrinsics.checkNotNullExpressionValue(interfaceC5731v0M97847y, "newNetworkFetchProducer(...)");
                C5676a c5676aM97816a = C44350v.m97816a(m9425k0(interfaceC5731v0M97847y));
                Intrinsics.checkNotNullExpressionValue(c5676aM97816a, "newAddImageTransformMetaDataProducer(...)");
                C44350v c44350v = this.producerFactory;
                if (this.resizeAndRotateEnabledForNetwork && this.downsampleMode != DownsampleMode.NEVER) {
                    z11 = true;
                }
                return c44350v.m97821D(c5676aM97816a, z11, this.imageTranscoderFactory);
            }
            C36621b.m81957a("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
            try {
                InterfaceC5731v0<C46075i> interfaceC5731v0M97847y2 = this.producerFactory.m97847y(networkFetcher);
                Intrinsics.checkNotNullExpressionValue(interfaceC5731v0M97847y2, "newNetworkFetchProducer(...)");
                C5676a c5676aM97816a2 = C44350v.m97816a(m9425k0(interfaceC5731v0M97847y2));
                Intrinsics.checkNotNullExpressionValue(c5676aM97816a2, "newAddImageTransformMetaDataProducer(...)");
                C44350v c44350v2 = this.producerFactory;
                if (this.resizeAndRotateEnabledForNetwork && this.downsampleMode != DownsampleMode.NEVER) {
                    z11 = true;
                }
                C5681b1 c5681b1M97821D = c44350v2.m97821D(c5676aM97816a2, z11, this.imageTranscoderFactory);
                C36621b.m81958b();
                return c5681b1M97821D;
            } catch (Throwable th2) {
                C36621b.m81958b();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final InterfaceC5731v0<C46075i> m9403C() {
        return (InterfaceC5731v0) this.commonNetworkFetchToEncodedMemorySequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: D */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9404D() {
        return (InterfaceC5731v0) this.dataFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9405E(@NotNull ImageRequest imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        if (!C36621b.m81959d()) {
            InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0M9401A = m9401A(imageRequest);
            if (imageRequest.getPostprocessor() != null) {
                interfaceC5731v0M9401A = m9417Q(interfaceC5731v0M9401A);
            }
            if (this.useBitmapPrepareToDraw) {
                interfaceC5731v0M9401A = m9402B(interfaceC5731v0M9401A);
            }
            return (!this.allowDelay || imageRequest.getDelayMs() <= 0) ? interfaceC5731v0M9401A : m9406F(interfaceC5731v0M9401A);
        }
        C36621b.m81957a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        try {
            InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0M9401A2 = m9401A(imageRequest);
            if (imageRequest.getPostprocessor() != null) {
                interfaceC5731v0M9401A2 = m9417Q(interfaceC5731v0M9401A2);
            }
            if (this.useBitmapPrepareToDraw) {
                interfaceC5731v0M9401A2 = m9402B(interfaceC5731v0M9401A2);
            }
            if (this.allowDelay && imageRequest.getDelayMs() > 0) {
                interfaceC5731v0M9401A2 = m9406F(interfaceC5731v0M9401A2);
            }
            return interfaceC5731v0M9401A2;
        } finally {
            C36621b.m81958b();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final InterfaceC5731v0<Void> m9407G(@NotNull ImageRequest imageRequest) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        Companion companion = INSTANCE;
        companion.m9432b(imageRequest);
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType == 0) {
            return m9416P();
        }
        if (sourceUriType == 2 || sourceUriType == 3) {
            return m9410J();
        }
        Uri sourceUri = imageRequest.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + companion.m9431a(sourceUri));
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9408H() {
        return (InterfaceC5731v0) this.localAssetFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9409I() {
        return (InterfaceC5731v0) this.localContentUriFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final InterfaceC5731v0<Void> m9410J() {
        Object value = this.localFileFetchToEncodedMemoryPrefetchSequence.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC5731v0) value;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9411K() {
        return (InterfaceC5731v0) this.localImageFileFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9412L() {
        return (InterfaceC5731v0) this.localResourceFetchSequence.getValue();
    }

    @RequiresApi(29)
    @NotNull
    /* JADX INFO: renamed from: M */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9413M() {
        return (InterfaceC5731v0) this.localThumbnailBitmapSdk29FetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9414N() {
        return (InterfaceC5731v0) this.localVideoFileFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9415O() {
        return (InterfaceC5731v0) this.networkFetchSequence.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final InterfaceC5731v0<Void> m9416P() {
        Object value = this.networkFetchToEncodedMemoryPrefetchSequence.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC5731v0) value;
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9418R() {
        return (InterfaceC5731v0) this.qualifiedResourceFetchSequence.getValue();
    }

    /* JADX INFO: renamed from: e0 */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9419e0(InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> inputProducer) {
        C5697h c5697hM97828e = this.producerFactory.m97828e(inputProducer);
        Intrinsics.checkNotNullExpressionValue(c5697hM97828e, "newBitmapMemoryCacheProducer(...)");
        C5694g c5694gM97827d = this.producerFactory.m97827d(c5697hM97828e);
        Intrinsics.checkNotNullExpressionValue(c5694gM97827d, "newBitmapMemoryCacheKeyMultiplexProducer(...)");
        InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0M97825b = this.producerFactory.m97825b(c5694gM97827d, this.threadHandoffProducerQueue);
        Intrinsics.checkNotNullExpressionValue(interfaceC5731v0M97825b, "newBackgroundThreadHandoffProducer(...)");
        if (!this.isEncodedMemoryCacheProbingEnabled && !this.isDiskCacheProbingEnabled) {
            BitmapMemoryCacheGetProducer bitmapMemoryCacheGetProducerM97826c = this.producerFactory.m97826c(interfaceC5731v0M97825b);
            Intrinsics.checkNotNullExpressionValue(bitmapMemoryCacheGetProducerM97826c, "newBitmapMemoryCacheGetProducer(...)");
            return bitmapMemoryCacheGetProducerM97826c;
        }
        BitmapMemoryCacheGetProducer bitmapMemoryCacheGetProducerM97826c2 = this.producerFactory.m97826c(interfaceC5731v0M97825b);
        Intrinsics.checkNotNullExpressionValue(bitmapMemoryCacheGetProducerM97826c2, "newBitmapMemoryCacheGetProducer(...)");
        C5703j c5703jM97830g = this.producerFactory.m97830g(bitmapMemoryCacheGetProducerM97826c2);
        Intrinsics.checkNotNullExpressionValue(c5703jM97830g, "newBitmapProbeProducer(...)");
        return c5703jM97830g;
    }

    @NotNull
    /* JADX INFO: renamed from: f0 */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9420f0(@NotNull InterfaceC5731v0<C46075i> inputProducer) {
        Intrinsics.checkNotNullParameter(inputProducer, "inputProducer");
        if (!C36621b.m81959d()) {
            DecodeProducer decodeProducerM97832j = this.producerFactory.m97832j(inputProducer);
            Intrinsics.checkNotNullExpressionValue(decodeProducerM97832j, "newDecodeProducer(...)");
            return m9419e0(decodeProducerM97832j);
        }
        C36621b.m81957a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            DecodeProducer decodeProducerM97832j2 = this.producerFactory.m97832j(inputProducer);
            Intrinsics.checkNotNullExpressionValue(decodeProducerM97832j2, "newDecodeProducer(...)");
            return m9419e0(decodeProducerM97832j2);
        } finally {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9421g0(InterfaceC5731v0<C46075i> inputProducer) {
        return m9422h0(inputProducer, new InterfaceC5708k1[]{this.producerFactory.m97842t()});
    }

    /* JADX INFO: renamed from: k0 */
    public final InterfaceC5731v0<C46075i> m9425k0(InterfaceC5731v0<C46075i> inputProducer) {
        if (this.diskCacheEnabled) {
            inputProducer = m9424j0(inputProducer);
        }
        InterfaceC5731v0<C46075i> interfaceC5731v0M97837o = this.producerFactory.m97837o(inputProducer);
        Intrinsics.checkNotNullExpressionValue(interfaceC5731v0M97837o, "newEncodedMemoryCacheProducer(...)");
        if (!this.isDiskCacheProbingEnabled) {
            C5732w c5732wM97836n = this.producerFactory.m97836n(interfaceC5731v0M97837o);
            Intrinsics.checkNotNullExpressionValue(c5732wM97836n, "newEncodedCacheKeyMultiplexProducer(...)");
            return c5732wM97836n;
        }
        C5736y c5736yM97838p = this.producerFactory.m97838p(interfaceC5731v0M97837o);
        Intrinsics.checkNotNullExpressionValue(c5736yM97838p, "newEncodedProbeProducer(...)");
        C5732w c5732wM97836n2 = this.producerFactory.m97836n(c5736yM97838p);
        Intrinsics.checkNotNullExpressionValue(c5732wM97836n2, "newEncodedCacheKeyMultiplexProducer(...)");
        return c5732wM97836n2;
    }

    /* JADX INFO: renamed from: l0 */
    public final InterfaceC5731v0<C46075i> m9426l0(InterfaceC5708k1<C46075i>[] thumbnailProducers) {
        C5705j1 c5705j1M97824G = this.producerFactory.m97824G(thumbnailProducers);
        Intrinsics.checkNotNullExpressionValue(c5705j1M97824G, "newThumbnailBranchProducer(...)");
        C5681b1 c5681b1M97821D = this.producerFactory.m97821D(c5705j1M97824G, true, this.imageTranscoderFactory);
        Intrinsics.checkNotNullExpressionValue(c5681b1M97821D, "newResizeAndRotateProducer(...)");
        return c5681b1M97821D;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final InterfaceC5731v0<C46075i> m9428x() {
        Object value = this.backgroundLocalContentUriFetchToEncodeMemorySequence.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC5731v0) value;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final InterfaceC5731v0<C46075i> m9429y() {
        Object value = this.backgroundLocalFileFetchToEncodeMemorySequence.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC5731v0) value;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final InterfaceC5731v0<C46075i> m9430z() {
        Object value = this.backgroundNetworkFetchToEncodedMemorySequence.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC5731v0) value;
    }

    /* JADX INFO: renamed from: S */
    public static final InterfaceC5731v0 m9365S(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LocalAssetFetchProducer localAssetFetchProducerM97839q = this$0.producerFactory.m97839q();
        Intrinsics.checkNotNullExpressionValue(localAssetFetchProducerM97839q, "newLocalAssetFetchProducer(...)");
        return this$0.m9421g0(localAssetFetchProducerM97839q);
    }

    /* JADX INFO: renamed from: T */
    public static final C5678a1 m9366T(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!C36621b.m81959d()) {
            return new C5678a1(this$0.m9428x());
        }
        C36621b.m81957a("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
        try {
            return new C5678a1(this$0.m9428x());
        } finally {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: U */
    public static final InterfaceC5731v0 m9367U(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LocalContentUriFetchProducer localContentUriFetchProducerM97840r = this$0.producerFactory.m97840r();
        Intrinsics.checkNotNullExpressionValue(localContentUriFetchProducerM97840r, "newLocalContentUriFetchProducer(...)");
        return this$0.m9422h0(localContentUriFetchProducerM97840r, new InterfaceC5708k1[]{this$0.producerFactory.m97841s(), this$0.producerFactory.m97842t()});
    }

    /* JADX INFO: renamed from: V */
    public static final C5678a1 m9368V(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!C36621b.m81959d()) {
            return new C5678a1(this$0.m9429y());
        }
        C36621b.m81957a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
        try {
            return new C5678a1(this$0.m9429y());
        } finally {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: W */
    public static final C5690e1 m9369W(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!C36621b.m81959d()) {
            return this$0.producerFactory.m97822E(this$0.m9429y());
        }
        C36621b.m81957a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
        try {
            return this$0.producerFactory.m97822E(this$0.m9429y());
        } finally {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: X */
    public static final InterfaceC5731v0 m9370X(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LocalFileFetchProducer localFileFetchProducerM97843u = this$0.producerFactory.m97843u();
        Intrinsics.checkNotNullExpressionValue(localFileFetchProducerM97843u, "newLocalFileFetchProducer(...)");
        return this$0.m9421g0(localFileFetchProducerM97843u);
    }

    /* JADX INFO: renamed from: Y */
    public static final InterfaceC5731v0 m9371Y(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LocalResourceFetchProducer localResourceFetchProducerM97844v = this$0.producerFactory.m97844v();
        Intrinsics.checkNotNullExpressionValue(localResourceFetchProducerM97844v, "newLocalResourceFetchProducer(...)");
        return this$0.m9421g0(localResourceFetchProducerM97844v);
    }

    /* JADX INFO: renamed from: Z */
    public static final InterfaceC5731v0 m9372Z(ProducerSequenceFactory this$0) throws Throwable {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (Build.VERSION.SDK_INT >= 29) {
            C5707k0 c5707k0M97845w = this$0.producerFactory.m97845w();
            Intrinsics.checkNotNullExpressionValue(c5707k0M97845w, "newLocalThumbnailBitmapSdk29Producer(...)");
            return this$0.m9419e0(c5707k0M97845w);
        }
        throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
    }

    /* JADX INFO: renamed from: a0 */
    public static final InterfaceC5731v0 m9374a0(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C5710l0 c5710l0M97846x = this$0.producerFactory.m97846x();
        Intrinsics.checkNotNullExpressionValue(c5710l0M97846x, "newLocalVideoThumbnailProducer(...)");
        return this$0.m9419e0(c5710l0M97846x);
    }

    /* JADX INFO: renamed from: b0 */
    public static final C5678a1 m9376b0(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!C36621b.m81959d()) {
            return new C5678a1(this$0.m9430z());
        }
        C36621b.m81957a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
        try {
            return new C5678a1(this$0.m9430z());
        } finally {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final InterfaceC5731v0 m9378c0(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!C36621b.m81959d()) {
            return this$0.m9420f0(this$0.m9403C());
        }
        C36621b.m81957a("ProducerSequenceFactory#getNetworkFetchSequence:init");
        try {
            return this$0.m9420f0(this$0.m9403C());
        } finally {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static final C5690e1 m9380d0(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!C36621b.m81959d()) {
            return this$0.producerFactory.m97822E(this$0.m9430z());
        }
        C36621b.m81957a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        try {
            return this$0.producerFactory.m97822E(this$0.m9430z());
        } finally {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static final InterfaceC5731v0 m9391n0(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        QualifiedResourceFetchProducer qualifiedResourceFetchProducerM97820C = this$0.producerFactory.m97820C();
        Intrinsics.checkNotNullExpressionValue(qualifiedResourceFetchProducerM97820C, "newQualifiedResourceFetchProducer(...)");
        return this$0.m9421g0(qualifiedResourceFetchProducerM97820C);
    }

    /* JADX INFO: renamed from: s */
    public static final InterfaceC5731v0 m9396s(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!C36621b.m81959d()) {
            LocalContentUriFetchProducer localContentUriFetchProducerM97840r = this$0.producerFactory.m97840r();
            Intrinsics.checkNotNullExpressionValue(localContentUriFetchProducerM97840r, "newLocalContentUriFetchProducer(...)");
            return this$0.producerFactory.m97825b(this$0.m9425k0(localContentUriFetchProducerM97840r), this$0.threadHandoffProducerQueue);
        }
        C36621b.m81957a("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
        try {
            LocalContentUriFetchProducer localContentUriFetchProducerM97840r2 = this$0.producerFactory.m97840r();
            Intrinsics.checkNotNullExpressionValue(localContentUriFetchProducerM97840r2, "newLocalContentUriFetchProducer(...)");
            return this$0.producerFactory.m97825b(this$0.m9425k0(localContentUriFetchProducerM97840r2), this$0.threadHandoffProducerQueue);
        } finally {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: t */
    public static final InterfaceC5731v0 m9397t(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!C36621b.m81959d()) {
            LocalFileFetchProducer localFileFetchProducerM97843u = this$0.producerFactory.m97843u();
            Intrinsics.checkNotNullExpressionValue(localFileFetchProducerM97843u, "newLocalFileFetchProducer(...)");
            return this$0.producerFactory.m97825b(this$0.m9425k0(localFileFetchProducerM97843u), this$0.threadHandoffProducerQueue);
        }
        C36621b.m81957a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        try {
            LocalFileFetchProducer localFileFetchProducerM97843u2 = this$0.producerFactory.m97843u();
            Intrinsics.checkNotNullExpressionValue(localFileFetchProducerM97843u2, "newLocalFileFetchProducer(...)");
            return this$0.producerFactory.m97825b(this$0.m9425k0(localFileFetchProducerM97843u2), this$0.threadHandoffProducerQueue);
        } finally {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: u */
    public static final InterfaceC5731v0 m9398u(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!C36621b.m81959d()) {
            return this$0.producerFactory.m97825b(this$0.m9403C(), this$0.threadHandoffProducerQueue);
        }
        C36621b.m81957a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
        try {
            return this$0.producerFactory.m97825b(this$0.m9403C(), this$0.threadHandoffProducerQueue);
        } finally {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: v */
    public static final InterfaceC5731v0 m9399v(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!C36621b.m81959d()) {
            return this$0.m9423i0(this$0.networkFetcher);
        }
        C36621b.m81957a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        try {
            return this$0.m9423i0(this$0.networkFetcher);
        } finally {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: w */
    public static final InterfaceC5731v0 m9400w(ProducerSequenceFactory this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C5716o c5716oM97831i = this$0.producerFactory.m97831i();
        Intrinsics.checkNotNullExpressionValue(c5716oM97831i, "newDataFetchProducer(...)");
        return this$0.m9420f0(this$0.producerFactory.m97821D(C44350v.m97816a(c5716oM97831i), true, this$0.imageTranscoderFactory));
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9401A(ImageRequest imageRequest) {
        InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0M9415O;
        if (!C36621b.m81959d()) {
            Uri sourceUri = imageRequest.getSourceUri();
            Intrinsics.checkNotNullExpressionValue(sourceUri, "getSourceUri(...)");
            if (sourceUri != null) {
                int sourceUriType = imageRequest.getSourceUriType();
                if (sourceUriType != 0) {
                    switch (sourceUriType) {
                        case 2:
                            if (imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                                return m9413M();
                            }
                            return m9414N();
                        case 3:
                            if (imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                                return m9413M();
                            }
                            return m9411K();
                        case 4:
                            if (imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                                return m9413M();
                            }
                            if (C46369a.m102265c(this.contentResolver.getType(sourceUri))) {
                                return m9414N();
                            }
                            return m9409I();
                        case 5:
                            return m9408H();
                        case 6:
                            return m9412L();
                        case 7:
                            return m9404D();
                        case 8:
                            return m9418R();
                        default:
                            Set<C5714n> set = this.customProducerSequenceFactories;
                            if (set != null) {
                                Iterator<C5714n> it = set.iterator();
                                while (it.hasNext()) {
                                    ImageRequest imageRequest2 = imageRequest;
                                    InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0M9768b = it.next().m9768b(imageRequest2, this, this.producerFactory, this.threadHandoffProducerQueue, this.isEncodedMemoryCacheProbingEnabled, this.isDiskCacheProbingEnabled);
                                    if (interfaceC5731v0M9768b != null) {
                                        return interfaceC5731v0M9768b;
                                    }
                                    imageRequest = imageRequest2;
                                }
                            }
                            throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + INSTANCE.m9431a(sourceUri));
                    }
                }
                return m9415O();
            }
            throw new IllegalStateException("Uri is null.");
        }
        C36621b.m81957a("ProducerSequenceFactory#getBasicDecodedImageSequence");
        try {
            Uri sourceUri2 = imageRequest.getSourceUri();
            Intrinsics.checkNotNullExpressionValue(sourceUri2, "getSourceUri(...)");
            if (sourceUri2 != null) {
                int sourceUriType2 = imageRequest.getSourceUriType();
                if (sourceUriType2 != 0) {
                    switch (sourceUriType2) {
                        case 2:
                            if (imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                                InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0M9413M = m9413M();
                                C36621b.m81958b();
                                return interfaceC5731v0M9413M;
                            }
                            interfaceC5731v0M9415O = m9414N();
                            break;
                            break;
                        case 3:
                            if (imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                                InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0M9413M2 = m9413M();
                                C36621b.m81958b();
                                return interfaceC5731v0M9413M2;
                            }
                            interfaceC5731v0M9415O = m9411K();
                            break;
                            break;
                        case 4:
                            if (imageRequest.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                                InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0M9413M3 = m9413M();
                                C36621b.m81958b();
                                return interfaceC5731v0M9413M3;
                            }
                            if (C46369a.m102265c(this.contentResolver.getType(sourceUri2))) {
                                InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0M9414N = m9414N();
                                C36621b.m81958b();
                                return interfaceC5731v0M9414N;
                            }
                            interfaceC5731v0M9415O = m9409I();
                            break;
                            break;
                        case 5:
                            interfaceC5731v0M9415O = m9408H();
                            break;
                        case 6:
                            interfaceC5731v0M9415O = m9412L();
                            break;
                        case 7:
                            interfaceC5731v0M9415O = m9404D();
                            break;
                        case 8:
                            interfaceC5731v0M9415O = m9418R();
                            break;
                        default:
                            Set<C5714n> set2 = this.customProducerSequenceFactories;
                            if (set2 != null) {
                                Iterator<C5714n> it2 = set2.iterator();
                                while (it2.hasNext()) {
                                    InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> interfaceC5731v0M9768b2 = it2.next().m9768b(imageRequest, this, this.producerFactory, this.threadHandoffProducerQueue, this.isEncodedMemoryCacheProbingEnabled, this.isDiskCacheProbingEnabled);
                                    if (interfaceC5731v0M9768b2 != null) {
                                        C36621b.m81958b();
                                        return interfaceC5731v0M9768b2;
                                    }
                                }
                            }
                            throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + INSTANCE.m9431a(sourceUri2));
                    }
                } else {
                    interfaceC5731v0M9415O = m9415O();
                }
                C36621b.m81958b();
                return interfaceC5731v0M9415O;
            }
            throw new IllegalStateException("Uri is null.");
        } catch (Throwable th2) {
            C36621b.m81958b();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final InterfaceC5731v0<AbstractC0110a<InterfaceC46071e>> m9422h0(InterfaceC5731v0<C46075i> inputProducer, InterfaceC5708k1<C46075i>[] thumbnailProducers) {
        return m9420f0(m9427m0(m9425k0(inputProducer), thumbnailProducers));
    }

    /* JADX INFO: renamed from: j0 */
    public final InterfaceC5731v0<C46075i> m9424j0(InterfaceC5731v0<C46075i> inputProducer) {
        C5728u c5728uM97835m;
        C5728u c5728uM97835m2;
        if (!C36621b.m81959d()) {
            if (this.partialImageCachingEnabled) {
                C5721q0 c5721q0M97848z = this.producerFactory.m97848z(inputProducer);
                Intrinsics.checkNotNullExpressionValue(c5721q0M97848z, "newPartialDiskCacheProducer(...)");
                c5728uM97835m2 = this.producerFactory.m97835m(c5721q0M97848z);
            } else {
                c5728uM97835m2 = this.producerFactory.m97835m(inputProducer);
            }
            Intrinsics.checkNotNull(c5728uM97835m2);
            C5726t c5726tM97834l = this.producerFactory.m97834l(c5728uM97835m2);
            Intrinsics.checkNotNullExpressionValue(c5726tM97834l, "newDiskCacheReadProducer(...)");
            return c5726tM97834l;
        }
        C36621b.m81957a("ProducerSequenceFactory#newDiskCacheSequence");
        try {
            if (this.partialImageCachingEnabled) {
                C5721q0 c5721q0M97848z2 = this.producerFactory.m97848z(inputProducer);
                Intrinsics.checkNotNullExpressionValue(c5721q0M97848z2, "newPartialDiskCacheProducer(...)");
                c5728uM97835m = this.producerFactory.m97835m(c5721q0M97848z2);
            } else {
                c5728uM97835m = this.producerFactory.m97835m(inputProducer);
            }
            Intrinsics.checkNotNull(c5728uM97835m);
            C5726t c5726tM97834l2 = this.producerFactory.m97834l(c5728uM97835m);
            Intrinsics.checkNotNullExpressionValue(c5726tM97834l2, "newDiskCacheReadProducer(...)");
            return c5726tM97834l2;
        } finally {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final InterfaceC5731v0<C46075i> m9427m0(InterfaceC5731v0<C46075i> inputProducer, InterfaceC5708k1<C46075i>[] thumbnailProducers) {
        C5676a c5676aM97816a = C44350v.m97816a(inputProducer);
        Intrinsics.checkNotNullExpressionValue(c5676aM97816a, "newAddImageTransformMetaDataProducer(...)");
        C5699h1 c5699h1M97823F = this.producerFactory.m97823F(this.producerFactory.m97821D(c5676aM97816a, true, this.imageTranscoderFactory));
        Intrinsics.checkNotNullExpressionValue(c5699h1M97823F, "newThrottlingProducer(...)");
        C5706k c5706kM97817h = C44350v.m97817h(m9426l0(thumbnailProducers), c5699h1M97823F);
        Intrinsics.checkNotNullExpressionValue(c5706kM97817h, "newBranchOnSeparateImagesProducer(...)");
        return c5706kM97817h;
    }
}
