package p617s5;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p008a6.C0146g0;
import p549q5.InterfaceC43625n;
import p583r3.C43909b;
import p583r3.InterfaceC43912e;
import p712w3.InterfaceC45711k;
import p819z3.C46682k;
import p819z3.InterfaceC46679h;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: s5.j */
/* JADX INFO: compiled from: DiskCachesStoreFactory.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010,\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0019¨\u0006-"}, m90084d2 = {"Ls5/j;", "Lw3/k;", "Ls5/b;", "Ls5/o;", "fileCacheFactory", "La6/g0;", "poolFactory", "Ls5/n;", "executorSupplier", "Lq5/n;", "imageCacheStatsTracker", "", "memoryChunkType", "Lr3/b;", "mainDiskCacheConfig", "smallImageDiskCacheConfig", "", "", "dynamicDiskCacheConfigMap", "<init>", "(Ls5/o;La6/g0;Ls5/n;Lq5/n;ILr3/b;Lr3/b;Ljava/util/Map;)V", "Ls5/r;", "config", "(Ls5/o;Ls5/r;)V", "k", "()Ls5/b;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ls5/o;", "b", "La6/g0;", "c", "Ls5/n;", "d", "Lq5/n;", "e", "I", "f", "Lr3/b;", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "Ljava/util/Map;", "i", "Lkotlin/Lazy;", CmcdData.Factory.STREAM_TYPE_LIVE, "diskCachesStore", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C44333j implements InterfaceC45711k<InterfaceC44317b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44343o fileCacheFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0146g0 poolFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC44341n executorSupplier;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC43625n imageCacheStatsTracker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int memoryChunkType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final C43909b mainDiskCacheConfig;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C43909b smallImageDiskCacheConfig;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final Map<String, C43909b> dynamicDiskCacheConfigMap;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy diskCachesStore;

    /* JADX INFO: renamed from: s5.j$a */
    /* JADX INFO: compiled from: DiskCachesStoreFactory.kt */
    @Metadata(m90083d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u000b\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000e\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001b\u0010\u0010\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0003\u0010\nR'\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u00178VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\f\u0010\u0019¨\u0006\u001b"}, m90084d2 = {"s5/j$a", "Ls5/b;", "Lr3/e;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/Lazy;", "m", "()Lr3/e;", "mainFileCache", "Lcom/facebook/imagepipeline/cache/BufferedDiskCache;", "b", "()Lcom/facebook/imagepipeline/cache/BufferedDiskCache;", "mainBufferedDiskCache", "c", "n", "smallImageFileCache", "d", "smallImageBufferedDiskCache", "", "", "e", CmcdData.Factory.STREAM_TYPE_LIVE, "()Ljava/util/Map;", "dynamicFileCaches", "Lcom/facebook/common/internal/ImmutableMap;", "f", "()Lcom/facebook/common/internal/ImmutableMap;", "dynamicBufferedDiskCaches", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDiskCachesStoreFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskCachesStoreFactory.kt\ncom/facebook/imagepipeline/core/DiskCachesStoreFactory$diskCachesStore$2$1\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n462#2:102\n412#2:103\n462#2:109\n412#2:110\n1246#3,4:104\n1246#3,4:111\n1#4:108\n*S KotlinDebug\n*F\n+ 1 DiskCachesStoreFactory.kt\ncom/facebook/imagepipeline/core/DiskCachesStoreFactory$diskCachesStore$2$1\n*L\n79#1:102\n79#1:103\n86#1:109\n86#1:110\n79#1:104,4\n86#1:111,4\n*E\n"})
    public static final class a implements InterfaceC44317b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final Lazy mainFileCache;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Lazy mainBufferedDiskCache;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final Lazy smallImageFileCache;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final Lazy smallImageBufferedDiskCache;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final Lazy dynamicFileCaches;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final Lazy dynamicBufferedDiskCaches;

        @Override // p617s5.InterfaceC44317b
        /* JADX INFO: renamed from: a */
        public BufferedDiskCache mo97778a() {
            return (BufferedDiskCache) this.smallImageBufferedDiskCache.getValue();
        }

        @Override // p617s5.InterfaceC44317b
        /* JADX INFO: renamed from: b */
        public BufferedDiskCache mo97779b() {
            return (BufferedDiskCache) this.mainBufferedDiskCache.getValue();
        }

        @Override // p617s5.InterfaceC44317b
        /* JADX INFO: renamed from: c */
        public ImmutableMap<String, BufferedDiskCache> mo97780c() {
            Object value = this.dynamicBufferedDiskCaches.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (ImmutableMap) value;
        }

        /* JADX INFO: renamed from: l */
        public Map<String, InterfaceC43912e> m97805l() {
            return (Map) this.dynamicFileCaches.getValue();
        }

        /* JADX INFO: renamed from: m */
        public InterfaceC43912e m97806m() {
            return (InterfaceC43912e) this.mainFileCache.getValue();
        }

        /* JADX INFO: renamed from: n */
        public InterfaceC43912e m97807n() {
            return (InterfaceC43912e) this.smallImageFileCache.getValue();
        }

        public a(final C44333j c44333j) {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            this.mainFileCache = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: s5.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44333j.a.m97802p(c44333j);
                }
            });
            this.mainBufferedDiskCache = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: s5.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44333j.a.m97801o(this.f97953b, c44333j);
                }
            });
            this.smallImageFileCache = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: s5.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44333j.a.m97804r(c44333j);
                }
            });
            this.smallImageBufferedDiskCache = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: s5.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44333j.a.m97803q(this.f97958b, c44333j);
                }
            });
            this.dynamicFileCaches = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: s5.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44333j.a.m97800k(c44333j, this);
                }
            });
            this.dynamicBufferedDiskCaches = LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: s5.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C44333j.a.m97799j(this.f97964b, c44333j);
                }
            });
        }

        /* JADX INFO: renamed from: j */
        public static final ImmutableMap m97799j(a this$0, C44333j this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Map<String, InterfaceC43912e> mapM97805l = this$0.m97805l();
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapM97805l.size()));
            Iterator<T> it = mapM97805l.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                InterfaceC43912e interfaceC43912e = (InterfaceC43912e) entry.getValue();
                InterfaceC46679h interfaceC46679hM677i = this$1.poolFactory.m677i(this$1.memoryChunkType);
                Intrinsics.checkNotNullExpressionValue(interfaceC46679hM677i, "getPooledByteBufferFactory(...)");
                C46682k c46682kM678j = this$1.poolFactory.m678j();
                Intrinsics.checkNotNullExpressionValue(c46682kM678j, "getPooledByteStreams(...)");
                Executor ioBoundExecutor = this$1.executorSupplier.getIoBoundExecutor();
                Intrinsics.checkNotNullExpressionValue(ioBoundExecutor, "forLocalStorageRead(...)");
                Executor executorMo9201e = this$1.executorSupplier.mo9201e();
                Intrinsics.checkNotNullExpressionValue(executorMo9201e, "forLocalStorageWrite(...)");
                linkedHashMap.put(key, new BufferedDiskCache(interfaceC43912e, interfaceC46679hM677i, c46682kM678j, ioBoundExecutor, executorMo9201e, this$1.imageCacheStatsTracker));
            }
            return ImmutableMap.copyOf((Map) linkedHashMap);
        }

        /* JADX INFO: renamed from: k */
        public static final Map m97800k(C44333j this$0, a this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Map map = this$0.dynamicDiskCacheConfigMap;
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), this$0.fileCacheFactory.mo97810a((C43909b) entry.getValue()));
                }
                return linkedHashMap;
            }
            return MapsKt.emptyMap();
        }

        /* JADX INFO: renamed from: o */
        public static final BufferedDiskCache m97801o(a this$0, C44333j this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            InterfaceC43912e interfaceC43912eM97806m = this$0.m97806m();
            InterfaceC46679h interfaceC46679hM677i = this$1.poolFactory.m677i(this$1.memoryChunkType);
            Intrinsics.checkNotNullExpressionValue(interfaceC46679hM677i, "getPooledByteBufferFactory(...)");
            C46682k c46682kM678j = this$1.poolFactory.m678j();
            Intrinsics.checkNotNullExpressionValue(c46682kM678j, "getPooledByteStreams(...)");
            Executor ioBoundExecutor = this$1.executorSupplier.getIoBoundExecutor();
            Intrinsics.checkNotNullExpressionValue(ioBoundExecutor, "forLocalStorageRead(...)");
            Executor executorMo9201e = this$1.executorSupplier.mo9201e();
            Intrinsics.checkNotNullExpressionValue(executorMo9201e, "forLocalStorageWrite(...)");
            return new BufferedDiskCache(interfaceC43912eM97806m, interfaceC46679hM677i, c46682kM678j, ioBoundExecutor, executorMo9201e, this$1.imageCacheStatsTracker);
        }

        /* JADX INFO: renamed from: p */
        public static final InterfaceC43912e m97802p(C44333j this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.fileCacheFactory.mo97810a(this$0.mainDiskCacheConfig);
        }

        /* JADX INFO: renamed from: q */
        public static final BufferedDiskCache m97803q(a this$0, C44333j this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            InterfaceC43912e interfaceC43912eM97807n = this$0.m97807n();
            InterfaceC46679h interfaceC46679hM677i = this$1.poolFactory.m677i(this$1.memoryChunkType);
            Intrinsics.checkNotNullExpressionValue(interfaceC46679hM677i, "getPooledByteBufferFactory(...)");
            C46682k c46682kM678j = this$1.poolFactory.m678j();
            Intrinsics.checkNotNullExpressionValue(c46682kM678j, "getPooledByteStreams(...)");
            Executor ioBoundExecutor = this$1.executorSupplier.getIoBoundExecutor();
            Intrinsics.checkNotNullExpressionValue(ioBoundExecutor, "forLocalStorageRead(...)");
            Executor executorMo9201e = this$1.executorSupplier.mo9201e();
            Intrinsics.checkNotNullExpressionValue(executorMo9201e, "forLocalStorageWrite(...)");
            return new BufferedDiskCache(interfaceC43912eM97807n, interfaceC46679hM677i, c46682kM678j, ioBoundExecutor, executorMo9201e, this$1.imageCacheStatsTracker);
        }

        /* JADX INFO: renamed from: r */
        public static final InterfaceC43912e m97804r(C44333j this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            return this$0.fileCacheFactory.mo97810a(this$0.smallImageDiskCacheConfig);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C44333j(@NotNull InterfaceC44343o fileCacheFactory, @NotNull C0146g0 poolFactory, @NotNull InterfaceC44341n executorSupplier, @NotNull InterfaceC43625n imageCacheStatsTracker, int i11, @NotNull C43909b mainDiskCacheConfig, @NotNull C43909b smallImageDiskCacheConfig, @Nullable Map<String, ? extends C43909b> map) {
        Intrinsics.checkNotNullParameter(fileCacheFactory, "fileCacheFactory");
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(executorSupplier, "executorSupplier");
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        Intrinsics.checkNotNullParameter(mainDiskCacheConfig, "mainDiskCacheConfig");
        Intrinsics.checkNotNullParameter(smallImageDiskCacheConfig, "smallImageDiskCacheConfig");
        this.fileCacheFactory = fileCacheFactory;
        this.poolFactory = poolFactory;
        this.executorSupplier = executorSupplier;
        this.imageCacheStatsTracker = imageCacheStatsTracker;
        this.memoryChunkType = i11;
        this.mainDiskCacheConfig = mainDiskCacheConfig;
        this.smallImageDiskCacheConfig = smallImageDiskCacheConfig;
        this.dynamicDiskCacheConfigMap = map;
        this.diskCachesStore = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: s5.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C44333j.m97790j(this.f97949b);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC44317b m97792l() {
        return (InterfaceC44317b) this.diskCachesStore.getValue();
    }

    /* JADX INFO: renamed from: j */
    public static final a m97790j(C44333j this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new a(this$0);
    }

    @Override // p712w3.InterfaceC45711k
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC44317b get() {
        return m97792l();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C44333j(@NotNull InterfaceC44343o fileCacheFactory, @NotNull InterfaceC44346r config) {
        this(fileCacheFactory, config.getPoolFactory(), config.getExecutorSupplier(), config.getImageCacheStatsTracker(), config.getMemoryChunkType(), config.getMainDiskCacheConfig(), config.getSmallImageDiskCacheConfig(), config.mo9252d());
        Intrinsics.checkNotNullParameter(fileCacheFactory, "fileCacheFactory");
        Intrinsics.checkNotNullParameter(config, "config");
    }
}
