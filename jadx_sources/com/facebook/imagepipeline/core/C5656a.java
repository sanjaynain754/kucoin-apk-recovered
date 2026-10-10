package com.facebook.imagepipeline.core;

import android.content.Context;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.cache.C5646d;
import com.facebook.imagepipeline.cache.InterfaceC5645c;
import com.facebook.imagepipeline.producers.C5696g1;
import com.facebook.imagepipeline.producers.C5738z;
import com.facebook.imagepipeline.producers.InterfaceC5693f1;
import java.util.Set;
import p034b6.C4496e;
import p034b6.InterfaceC4495d;
import p192d6.C36621b;
import p223e6.C37081f;
import p223e6.C37082g;
import p223e6.InterfaceC37079d;
import p463n5.C42752b;
import p463n5.InterfaceC42751a;
import p526p5.AbstractC43387c;
import p526p5.C43388d;
import p547q3.InterfaceC43595a;
import p549q5.C43624m;
import p549q5.C43626o;
import p549q5.C43627p;
import p549q5.InterfaceC43619h;
import p617s5.C44315a;
import p617s5.C44350v;
import p617s5.InterfaceC44317b;
import p617s5.InterfaceC44346r;
import p684v5.C45420a;
import p684v5.InterfaceC45421b;
import p712w3.C45708h;
import p712w3.InterfaceC45711k;
import p714w5.InterfaceC45739a;
import p747x3.C45999a;
import p749x5.InterfaceC46071e;
import p821z5.InterfaceC46704c;
import p821z5.InterfaceC46705d;

/* JADX INFO: renamed from: com.facebook.imagepipeline.core.a */
/* JADX INFO: compiled from: ImagePipelineFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5656a {

    /* JADX INFO: renamed from: p */
    public static final Class<?> f9125p = C5656a.class;

    /* JADX INFO: renamed from: q */
    public static C5656a f9126q;

    /* JADX INFO: renamed from: r */
    public static ImagePipeline f9127r;

    /* JADX INFO: renamed from: s */
    public static boolean f9128s;

    /* JADX INFO: renamed from: a */
    public final InterfaceC5693f1 f9129a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC44346r f9130b;

    /* JADX INFO: renamed from: c */
    public final C44315a f9131c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC45711k<InterfaceC44317b> f9132d;

    /* JADX INFO: renamed from: e */
    public InterfaceC5645c<InterfaceC43595a, InterfaceC46071e> f9133e;

    /* JADX INFO: renamed from: f */
    public C43626o<InterfaceC43595a, InterfaceC46071e> f9134f;

    /* JADX INFO: renamed from: g */
    public InterfaceC5645c<InterfaceC43595a, PooledByteBuffer> f9135g;

    /* JADX INFO: renamed from: h */
    public C43626o<InterfaceC43595a, PooledByteBuffer> f9136h;

    /* JADX INFO: renamed from: i */
    public InterfaceC45421b f9137i;

    /* JADX INFO: renamed from: j */
    public InterfaceC37079d f9138j;

    /* JADX INFO: renamed from: k */
    public C44350v f9139k;

    /* JADX INFO: renamed from: l */
    public ProducerSequenceFactory f9140l;

    /* JADX INFO: renamed from: m */
    public AbstractC43387c f9141m;

    /* JADX INFO: renamed from: n */
    public InterfaceC4495d f9142n;

    /* JADX INFO: renamed from: o */
    public InterfaceC42751a f9143o;

    /* JADX INFO: renamed from: l */
    public static C5656a m9433l() {
        return (C5656a) C45708h.m100897h(f9126q, "ImagePipelineFactory was not initialized!");
    }

    /* JADX INFO: renamed from: q */
    public static synchronized void m9434q(Context context) {
        try {
            if (C36621b.m81959d()) {
                C36621b.m81957a("ImagePipelineFactory#initialize");
            }
            m9435r(ImagePipelineConfig.m9240L(context).m9299a());
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: r */
    public static synchronized void m9435r(InterfaceC44346r interfaceC44346r) {
        if (f9126q != null) {
            C45999a.m101484E(f9125p, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            if (f9128s) {
                return;
            }
        }
        f9126q = new C5656a(interfaceC44346r);
    }

    /* JADX INFO: renamed from: a */
    public final ImagePipeline m9436a() {
        ProducerSequenceFactory producerSequenceFactoryM9450p = m9450p();
        Set<InterfaceC46705d> setMo9265q = this.f9130b.mo9265q();
        Set<InterfaceC46704c> setMo9249a = this.f9130b.mo9249a();
        InterfaceC45711k<Boolean> interfaceC45711kMo9260l = this.f9130b.mo9260l();
        C43626o<InterfaceC43595a, InterfaceC46071e> c43626oM9440e = m9440e();
        C43626o<InterfaceC43595a, PooledByteBuffer> c43626oM9443h = m9443h();
        InterfaceC45711k<InterfaceC44317b> interfaceC45711k = this.f9132d;
        InterfaceC43619h cacheKeyFactory = this.f9130b.getCacheKeyFactory();
        InterfaceC5693f1 interfaceC5693f1 = this.f9129a;
        InterfaceC45711k<Boolean> interfaceC45711kM9356t = this.f9130b.getExperiments().m9356t();
        InterfaceC45711k<Boolean> interfaceC45711kM9333H = this.f9130b.getExperiments().m9333H();
        this.f9130b.mo9247G();
        return new ImagePipeline(producerSequenceFactoryM9450p, setMo9265q, setMo9249a, interfaceC45711kMo9260l, c43626oM9440e, c43626oM9443h, interfaceC45711k, cacheKeyFactory, interfaceC5693f1, interfaceC45711kM9356t, interfaceC45711kM9333H, null, this.f9130b);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC42751a m9438c() {
        if (this.f9143o == null) {
            this.f9143o = C42752b.m93676a(m9447m(), this.f9130b.getExecutorSupplier(), m9439d(), this.f9130b.getExperiments().getDownscaleFrameToDrawableDimensions(), this.f9130b.getExperiments().getUseBalancedAnimationStrategy(), this.f9130b.getExperiments().getAnimationRenderFpsLimit(), this.f9130b.getExperiments().getAnimationStrategyBufferLengthMilliseconds(), this.f9130b.getExecutorServiceForAnimatedImages());
        }
        return this.f9143o;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC5645c<InterfaceC43595a, InterfaceC46071e> m9439d() {
        if (this.f9133e == null) {
            this.f9133e = this.f9130b.getBitmapMemoryCacheFactory().mo9141a(this.f9130b.mo9273y(), this.f9130b.getMemoryTrimmableRegistry(), this.f9130b.getBitmapMemoryCacheTrimStrategy(), this.f9130b.getExperiments().getShouldStoreCacheEntrySize(), this.f9130b.getExperiments().getShouldIgnoreCacheSizeMismatch(), this.f9130b.mo9253e());
        }
        return this.f9133e;
    }

    /* JADX INFO: renamed from: e */
    public C43626o<InterfaceC43595a, InterfaceC46071e> m9440e() {
        if (this.f9134f == null) {
            this.f9134f = C43627p.m96016a(m9439d(), this.f9130b.getImageCacheStatsTracker());
        }
        return this.f9134f;
    }

    /* JADX INFO: renamed from: f */
    public C44315a m9441f() {
        return this.f9131c;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC5645c<InterfaceC43595a, PooledByteBuffer> m9442g() {
        if (this.f9135g == null) {
            this.f9135g = C5646d.m9149a(this.f9130b.mo9256h(), this.f9130b.getMemoryTrimmableRegistry(), this.f9130b.getEncodedMemoryCacheTrimStrategy());
        }
        return this.f9135g;
    }

    /* JADX INFO: renamed from: h */
    public C43626o<InterfaceC43595a, PooledByteBuffer> m9443h() {
        if (this.f9136h == null) {
            this.f9136h = C43624m.m95995a(this.f9130b.mo9250b() != null ? this.f9130b.mo9250b() : m9442g(), this.f9130b.getImageCacheStatsTracker());
        }
        return this.f9136h;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC45421b m9444i() {
        InterfaceC45421b interfaceC45421bMo8822c;
        InterfaceC45421b interfaceC45421bMo8821b;
        if (this.f9137i == null) {
            if (this.f9130b.getImageDecoder() != null) {
                this.f9137i = this.f9130b.getImageDecoder();
            } else {
                InterfaceC42751a interfaceC42751aM9438c = m9438c();
                if (interfaceC42751aM9438c != null) {
                    interfaceC45421bMo8822c = interfaceC42751aM9438c.mo8822c();
                    interfaceC45421bMo8821b = interfaceC42751aM9438c.mo8821b();
                } else {
                    interfaceC45421bMo8822c = null;
                    interfaceC45421bMo8821b = null;
                }
                if (this.f9130b.getImageDecoderConfig() == null) {
                    this.f9137i = new C45420a(interfaceC45421bMo8822c, interfaceC45421bMo8821b, m9448n());
                } else {
                    this.f9137i = new C45420a(interfaceC45421bMo8822c, interfaceC45421bMo8821b, m9448n(), this.f9130b.getImageDecoderConfig().m100380a());
                    ImageFormatChecker.m9097e().m9100g(this.f9130b.getImageDecoderConfig().m100381b());
                }
            }
        }
        return this.f9137i;
    }

    /* JADX INFO: renamed from: j */
    public ImagePipeline m9445j() {
        if (f9127r == null) {
            f9127r = m9436a();
        }
        return f9127r;
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC37079d m9446k() {
        if (this.f9138j == null) {
            if (this.f9130b.getImageTranscoderFactory() == null && this.f9130b.getImageTranscoderType() == null && this.f9130b.getExperiments().getIsNativeCodeDisabled()) {
                this.f9138j = new C37082g(this.f9130b.getExperiments().getMaxBitmapDimension());
            } else {
                this.f9138j = new C37081f(this.f9130b.getExperiments().getMaxBitmapDimension(), this.f9130b.getExperiments().getUseDownsamplingRatioForResizing(), this.f9130b.getImageTranscoderFactory(), this.f9130b.getImageTranscoderType(), this.f9130b.getExperiments().getIsEnsureTranscoderLibraryLoaded());
            }
        }
        return this.f9138j;
    }

    /* JADX INFO: renamed from: m */
    public AbstractC43387c m9447m() {
        if (this.f9141m == null) {
            this.f9141m = C43388d.m95563a(this.f9130b.getPoolFactory(), m9448n(), m9441f());
        }
        return this.f9141m;
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC4495d m9448n() {
        if (this.f9142n == null) {
            this.f9142n = C4496e.m4298a(this.f9130b.getPoolFactory(), this.f9130b.getExperiments().getIsGingerbreadDecoderEnabled(), this.f9130b.getExperiments().getShouldUseDecodingBufferHelper(), this.f9130b.getExperiments().getPlatformDecoderOptions());
        }
        return this.f9142n;
    }

    /* JADX INFO: renamed from: o */
    public final C44350v m9449o() {
        if (this.f9139k == null) {
            this.f9139k = this.f9130b.getExperiments().getProducerFactoryMethod().mo9364a(this.f9130b.getContext(), this.f9130b.getPoolFactory().m679k(), m9444i(), this.f9130b.getProgressiveJpegConfig(), this.f9130b.getDownsampleMode(), this.f9130b.getIsResizeAndRotateEnabledForNetwork(), this.f9130b.getExperiments().getIsDecodeCancellationEnabled(), this.f9130b.getExecutorSupplier(), this.f9130b.getPoolFactory().m677i(this.f9130b.getMemoryChunkType()), this.f9130b.getPoolFactory().m678j(), m9440e(), m9443h(), this.f9132d, this.f9130b.getCacheKeyFactory(), m9447m(), this.f9130b.getExperiments().getBitmapPrepareToDrawMinSizeBytes(), this.f9130b.getExperiments().getBitmapPrepareToDrawMaxSizeBytes(), this.f9130b.getExperiments().getBitmapPrepareToDrawForPrefetch(), this.f9130b.getExperiments().getMaxBitmapDimension(), m9441f(), this.f9130b.getExperiments().getKeepCancelledFetchAsLowPriority(), this.f9130b.getExperiments().getTrackedKeysSize());
        }
        return this.f9139k;
    }

    /* JADX INFO: renamed from: p */
    public final ProducerSequenceFactory m9450p() {
        boolean useBitmapPrepareToDraw = this.f9130b.getExperiments().getUseBitmapPrepareToDraw();
        if (this.f9140l == null) {
            this.f9140l = new ProducerSequenceFactory(this.f9130b.getContext().getApplicationContext().getContentResolver(), m9449o(), this.f9130b.mo9263o(), this.f9130b.getIsResizeAndRotateEnabledForNetwork(), this.f9130b.getExperiments().getIsWebpSupportEnabled(), this.f9129a, this.f9130b.getDownsampleMode(), useBitmapPrepareToDraw, this.f9130b.getExperiments().getIsPartialImageCachingEnabled(), this.f9130b.getIsDiskCacheEnabled(), m9446k(), this.f9130b.getExperiments().getIsEncodedMemoryCacheProbingEnabled(), this.f9130b.getExperiments().getIsDiskCacheProbingEnabled(), this.f9130b.getExperiments().getAllowDelay(), this.f9130b.mo9245E());
        }
        return this.f9140l;
    }

    public C5656a(InterfaceC44346r interfaceC44346r) {
        InterfaceC5693f1 c5696g1;
        if (C36621b.m81959d()) {
            C36621b.m81957a("ImagePipelineConfig()");
        }
        InterfaceC44346r interfaceC44346r2 = (InterfaceC44346r) C45708h.m100896g(interfaceC44346r);
        this.f9130b = interfaceC44346r2;
        if (interfaceC44346r2.getExperiments().getIsExperimentalThreadHandoffQueueEnabled()) {
            c5696g1 = new C5738z(interfaceC44346r.getExecutorSupplier().getLightWeightBackgroundExecutor());
        } else {
            c5696g1 = new C5696g1(interfaceC44346r.getExecutorSupplier().getLightWeightBackgroundExecutor());
        }
        this.f9129a = c5696g1;
        this.f9131c = new C44315a(interfaceC44346r.getCloseableReferenceLeakTracker());
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
        this.f9132d = interfaceC44346r2.mo9241A();
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC45739a m9437b(Context context) {
        InterfaceC42751a interfaceC42751aM9438c = m9438c();
        if (interfaceC42751aM9438c == null) {
            return null;
        }
        return interfaceC42751aM9438c.mo8820a(context);
    }
}
