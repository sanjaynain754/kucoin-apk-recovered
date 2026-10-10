package com.facebook.imagepipeline.cache;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p006a4.AbstractC0110a;
import p192d6.C36621b;
import p483o0.C42908e;
import p486o3.InterfaceC42952a;
import p547q3.InterfaceC43595a;
import p547q3.InterfaceC43600f;
import p549q5.C43631t;
import p549q5.InterfaceC43625n;
import p583r3.InterfaceC43912e;
import p747x3.C45999a;
import p749x5.C46075i;
import p786y5.C46385a;
import p819z3.C46682k;
import p819z3.InterfaceC46679h;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BufferedDiskCache.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001<B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0013J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0018¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00172\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u0017¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010\u0013J%\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010\u001aJ%\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b.\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00108R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010:¨\u0006="}, m90084d2 = {"Lcom/facebook/imagepipeline/cache/BufferedDiskCache;", "", "Lr3/e;", "fileCache", "Lz3/h;", "pooledByteBufferFactory", "Lz3/k;", "pooledByteStreams", "Ljava/util/concurrent/Executor;", "readExecutor", "writeExecutor", "Lq5/n;", "imageCacheStatsTracker", "<init>", "(Lr3/e;Lz3/h;Lz3/k;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lq5/n;)V", "Lq3/a;", "key", "", "j", "(Lq3/a;)Z", "k", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCancelled", "Lo0/e;", "Lx5/i;", "m", "(Lq3/a;Ljava/util/concurrent/atomic/AtomicBoolean;)Lo0/e;", "", "f", "(Lq3/a;)V", "encodedImage", "p", "(Lq3/a;Lx5/i;)V", "Ljava/lang/Void;", CmcdData.Factory.STREAMING_FORMAT_SS, "(Lq3/a;)Lo0/e;", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Lo0/e;", "g", "n", "pinnedImage", CmcdData.Factory.STREAM_TYPE_LIVE, "(Lq3/a;Lx5/i;)Lo0/e;", "Lcom/facebook/common/memory/PooledByteBuffer;", "r", "(Lq3/a;)Lcom/facebook/common/memory/PooledByteBuffer;", "u", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lr3/e;", "b", "Lz3/h;", "c", "Lz3/k;", "d", "Ljava/util/concurrent/Executor;", "e", "Lq5/n;", "Lq5/t;", "Lq5/t;", "stagingArea", "Companion", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBufferedDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedDiskCache.kt\ncom/facebook/imagepipeline/cache/BufferedDiskCache\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n40#2,2:393\n44#2,5:396\n40#2,9:401\n1#3:395\n*S KotlinDebug\n*F\n+ 1 BufferedDiskCache.kt\ncom/facebook/imagepipeline/cache/BufferedDiskCache\n*L\n115#1:393,2\n115#1:396,5\n234#1:401,9\n*E\n"})
public final class BufferedDiskCache {

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final Class<?> f8856i = BufferedDiskCache.class;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC43912e fileCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC46679h pooledByteBufferFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C46682k pooledByteStreams;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Executor readExecutor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Executor writeExecutor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC43625n imageCacheStatsTracker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C43631t stagingArea;

    public BufferedDiskCache(@NotNull InterfaceC43912e fileCache, @NotNull InterfaceC46679h pooledByteBufferFactory, @NotNull C46682k pooledByteStreams, @NotNull Executor readExecutor, @NotNull Executor writeExecutor, @NotNull InterfaceC43625n imageCacheStatsTracker) {
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(pooledByteBufferFactory, "pooledByteBufferFactory");
        Intrinsics.checkNotNullParameter(pooledByteStreams, "pooledByteStreams");
        Intrinsics.checkNotNullParameter(readExecutor, "readExecutor");
        Intrinsics.checkNotNullParameter(writeExecutor, "writeExecutor");
        Intrinsics.checkNotNullParameter(imageCacheStatsTracker, "imageCacheStatsTracker");
        this.fileCache = fileCache;
        this.pooledByteBufferFactory = pooledByteBufferFactory;
        this.pooledByteStreams = pooledByteStreams;
        this.readExecutor = readExecutor;
        this.writeExecutor = writeExecutor;
        this.imageCacheStatsTracker = imageCacheStatsTracker;
        C43631t c43631tM96021d = C43631t.m96021d();
        Intrinsics.checkNotNullExpressionValue(c43631tM96021d, "getInstance(...)");
        this.stagingArea = c43631tM96021d;
    }

    /* JADX INFO: renamed from: o */
    public static final C46075i m9125o(Object obj, AtomicBoolean isCancelled, BufferedDiskCache this$0, InterfaceC43595a key) {
        Intrinsics.checkNotNullParameter(isCancelled, "$isCancelled");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objM102302e = C46385a.m102302e(obj, null);
        try {
            if (isCancelled.get()) {
                throw new CancellationException();
            }
            C46075i c46075iM96024c = this$0.stagingArea.m96024c(key);
            if (c46075iM96024c != null) {
                C45999a.m101519y(f8856i, "Found image for %s in staging area", key.mo8758a());
                this$0.imageCacheStatsTracker.mo96008g(key);
            } else {
                C45999a.m101519y(f8856i, "Did not find image for %s in staging area", key.mo8758a());
                this$0.imageCacheStatsTracker.mo96004c(key);
                try {
                    PooledByteBuffer pooledByteBufferM9138r = this$0.m9138r(key);
                    if (pooledByteBufferM9138r == null) {
                        C46385a.m102303f(objM102302e);
                        return null;
                    }
                    AbstractC0110a abstractC0110aM558p = AbstractC0110a.m558p(pooledByteBufferM9138r);
                    Intrinsics.checkNotNullExpressionValue(abstractC0110aM558p, "of(...)");
                    try {
                        C46075i c46075i = new C46075i((AbstractC0110a<PooledByteBuffer>) abstractC0110aM558p);
                        AbstractC0110a.m555j(abstractC0110aM558p);
                        c46075iM96024c = c46075i;
                    } catch (Throwable th2) {
                        AbstractC0110a.m555j(abstractC0110aM558p);
                        throw th2;
                    }
                } catch (Exception unused) {
                    C46385a.m102303f(objM102302e);
                    return null;
                }
            }
            if (!Thread.interrupted()) {
                C46385a.m102303f(objM102302e);
                return c46075iM96024c;
            }
            C45999a.m101518x(f8856i, "Host thread was interrupted, decreasing reference count");
            c46075iM96024c.close();
            throw new InterruptedException();
        } catch (Throwable th3) {
            try {
                C46385a.m102300c(obj, th3);
                throw th3;
            } catch (Throwable th4) {
                C46385a.m102303f(objM102302e);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9129f(@NotNull InterfaceC43595a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.fileCache.mo8502b(key);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m9130g(InterfaceC43595a key) {
        C46075i c46075iM96024c = this.stagingArea.m96024c(key);
        if (c46075iM96024c != null) {
            c46075iM96024c.close();
            C45999a.m101519y(f8856i, "Found image for %s in staging area", key.mo8758a());
            this.imageCacheStatsTracker.mo96008g(key);
            return true;
        }
        C45999a.m101519y(f8856i, "Did not find image for %s in staging area", key.mo8758a());
        this.imageCacheStatsTracker.mo96004c(key);
        try {
            return this.fileCache.mo8506f(key);
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final C42908e<Void> m9131h() {
        this.stagingArea.m96022a();
        final Object objM102301d = C46385a.m102301d("BufferedDiskCache_clearAll");
        try {
            return C42908e.m94093b(new Callable() { // from class: q5.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return BufferedDiskCache.m9124i(objM102301d, this);
                }
            }, this.writeExecutor);
        } catch (Exception e11) {
            C45999a.m101487H(f8856i, e11, "Failed to schedule disk-cache clear", new Object[0]);
            return C42908e.m94096g(e11);
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m9132j(@NotNull InterfaceC43595a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.stagingArea.m96023b(key) || this.fileCache.mo8507g(key);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9133k(@NotNull InterfaceC43595a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (m9132j(key)) {
            return true;
        }
        return m9130g(key);
    }

    /* JADX INFO: renamed from: l */
    public final C42908e<C46075i> m9134l(InterfaceC43595a key, C46075i pinnedImage) {
        C45999a.m101519y(f8856i, "Found image for %s in staging area", key.mo8758a());
        this.imageCacheStatsTracker.mo96008g(key);
        C42908e<C46075i> c42908eM94097h = C42908e.m94097h(pinnedImage);
        Intrinsics.checkNotNullExpressionValue(c42908eM94097h, "forResult(...)");
        return c42908eM94097h;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final C42908e<C46075i> m9135m(@NotNull InterfaceC43595a key, @NotNull AtomicBoolean isCancelled) {
        C42908e<C46075i> c42908eM9136n;
        C42908e<C46075i> c42908eM9134l;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(isCancelled, "isCancelled");
        if (!C36621b.m81959d()) {
            C46075i c46075iM96024c = this.stagingArea.m96024c(key);
            return (c46075iM96024c == null || (c42908eM9134l = m9134l(key, c46075iM96024c)) == null) ? m9136n(key, isCancelled) : c42908eM9134l;
        }
        C36621b.m81957a("BufferedDiskCache#get");
        try {
            C46075i c46075iM96024c2 = this.stagingArea.m96024c(key);
            if (c46075iM96024c2 == null || (c42908eM9136n = m9134l(key, c46075iM96024c2)) == null) {
                c42908eM9136n = m9136n(key, isCancelled);
            }
            return c42908eM9136n;
        } finally {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: n */
    public final C42908e<C46075i> m9136n(final InterfaceC43595a key, final AtomicBoolean isCancelled) {
        try {
            final Object objM102301d = C46385a.m102301d("BufferedDiskCache_getAsync");
            return C42908e.m94093b(new Callable() { // from class: q5.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return BufferedDiskCache.m9125o(objM102301d, isCancelled, this, key);
                }
            }, this.readExecutor);
        } catch (Exception e11) {
            C45999a.m101487H(f8856i, e11, "Failed to schedule disk-cache read for %s", key.mo8758a());
            return C42908e.m94096g(e11);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m9137p(@NotNull final InterfaceC43595a key, @NotNull C46075i encodedImage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!C36621b.m81959d()) {
            if (!C46075i.m101554E(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.stagingArea.m96026f(key, encodedImage);
            final C46075i c46075iM101555b = C46075i.m101555b(encodedImage);
            try {
                final Object objM102301d = C46385a.m102301d("BufferedDiskCache_putAsync");
                this.writeExecutor.execute(new Runnable() { // from class: q5.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        BufferedDiskCache.m9126q(objM102301d, this, key, c46075iM101555b);
                    }
                });
                return;
            } catch (Exception e11) {
                C45999a.m101487H(f8856i, e11, "Failed to schedule disk-cache write for %s", key.mo8758a());
                this.stagingArea.m96028h(key, encodedImage);
                C46075i.m101556g(c46075iM101555b);
                return;
            }
        }
        C36621b.m81957a("BufferedDiskCache#put");
        try {
            if (!C46075i.m101554E(encodedImage)) {
                throw new IllegalStateException("Check failed.");
            }
            this.stagingArea.m96026f(key, encodedImage);
            final C46075i c46075iM101555b2 = C46075i.m101555b(encodedImage);
            try {
                final Object objM102301d2 = C46385a.m102301d("BufferedDiskCache_putAsync");
                this.writeExecutor.execute(new Runnable() { // from class: q5.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        BufferedDiskCache.m9126q(objM102301d2, this, key, c46075iM101555b2);
                    }
                });
            } catch (Exception e12) {
                C45999a.m101487H(f8856i, e12, "Failed to schedule disk-cache write for %s", key.mo8758a());
                this.stagingArea.m96028h(key, encodedImage);
                C46075i.m101556g(c46075iM101555b2);
            }
            Unit unit = Unit.INSTANCE;
            C36621b.m81958b();
        } catch (Throwable th2) {
            C36621b.m81958b();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: r */
    public final PooledByteBuffer m9138r(InterfaceC43595a key) throws IOException {
        try {
            Class<?> cls = f8856i;
            C45999a.m101519y(cls, "Disk cache read for %s", key.mo8758a());
            InterfaceC42952a interfaceC42952aMo8505e = this.fileCache.mo8505e(key);
            if (interfaceC42952aMo8505e == null) {
                C45999a.m101519y(cls, "Disk cache miss for %s", key.mo8758a());
                this.imageCacheStatsTracker.mo96014m(key);
                return null;
            }
            C45999a.m101519y(cls, "Found entry in disk cache for %s", key.mo8758a());
            this.imageCacheStatsTracker.mo96005d(key);
            InputStream inputStreamMo8380a = interfaceC42952aMo8505e.mo8380a();
            try {
                PooledByteBuffer pooledByteBufferMo606e = this.pooledByteBufferFactory.mo606e(inputStreamMo8380a, (int) interfaceC42952aMo8505e.size());
                inputStreamMo8380a.close();
                C45999a.m101519y(cls, "Successful read from disk cache for %s", key.mo8758a());
                return pooledByteBufferMo606e;
            } catch (Throwable th2) {
                inputStreamMo8380a.close();
                throw th2;
            }
        } catch (IOException e11) {
            C45999a.m101487H(f8856i, e11, "Exception reading from cache for %s", key.mo8758a());
            this.imageCacheStatsTracker.mo96002a(key);
            throw e11;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final C42908e<Void> m9139s(@NotNull final InterfaceC43595a key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.stagingArea.m96027g(key);
        try {
            final Object objM102301d = C46385a.m102301d("BufferedDiskCache_remove");
            return C42908e.m94093b(new Callable() { // from class: q5.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return BufferedDiskCache.m9127t(objM102301d, this, key);
                }
            }, this.writeExecutor);
        } catch (Exception e11) {
            C45999a.m101487H(f8856i, e11, "Failed to schedule disk-cache remove for %s", key.mo8758a());
            return C42908e.m94096g(e11);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m9140u(InterfaceC43595a key, final C46075i encodedImage) {
        Class<?> cls = f8856i;
        C45999a.m101519y(cls, "About to write to disk-cache for key %s", key.mo8758a());
        try {
            this.fileCache.mo8503c(key, new InterfaceC43600f() { // from class: q5.g
                @Override // p547q3.InterfaceC43600f
                /* JADX INFO: renamed from: a */
                public final void mo95955a(OutputStream outputStream) throws IOException {
                    BufferedDiskCache.m9128v(encodedImage, this, outputStream);
                }
            });
            this.imageCacheStatsTracker.mo96013l(key);
            C45999a.m101519y(cls, "Successful disk-cache write for key %s", key.mo8758a());
        } catch (IOException e11) {
            C45999a.m101487H(f8856i, e11, "Failed to write to disk-cache for key %s", key.mo8758a());
        }
    }

    /* JADX INFO: renamed from: i */
    public static final Void m9124i(Object obj, BufferedDiskCache this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object objM102302e = C46385a.m102302e(obj, null);
        try {
            this$0.stagingArea.m96022a();
            this$0.fileCache.mo8501a();
            C46385a.m102303f(objM102302e);
            return null;
        } catch (Throwable th2) {
            try {
                C46385a.m102300c(obj, th2);
                throw th2;
            } catch (Throwable th3) {
                C46385a.m102303f(objM102302e);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m9126q(Object obj, BufferedDiskCache this$0, InterfaceC43595a key, C46075i c46075i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objM102302e = C46385a.m102302e(obj, null);
        try {
            this$0.m9140u(key, c46075i);
            C43631t c43631t = this$0.stagingArea;
            Intrinsics.checkNotNull(c46075i);
            c43631t.m96028h(key, c46075i);
            C46075i.m101556g(c46075i);
            C46385a.m102303f(objM102302e);
        } catch (Throwable th2) {
            try {
                C46385a.m102300c(obj, th2);
                throw th2;
            } catch (Throwable th3) {
                C43631t c43631t2 = this$0.stagingArea;
                Intrinsics.checkNotNull(c46075i);
                c43631t2.m96028h(key, c46075i);
                C46075i.m101556g(c46075i);
                C46385a.m102303f(objM102302e);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static final Void m9127t(Object obj, BufferedDiskCache this$0, InterfaceC43595a key) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "$key");
        Object objM102302e = C46385a.m102302e(obj, null);
        try {
            this$0.stagingArea.m96027g(key);
            this$0.fileCache.mo8504d(key);
            C46385a.m102303f(objM102302e);
            return null;
        } catch (Throwable th2) {
            try {
                C46385a.m102300c(obj, th2);
                throw th2;
            } catch (Throwable th3) {
                C46385a.m102303f(objM102302e);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m9128v(C46075i c46075i, BufferedDiskCache this$0, OutputStream os2) throws IOException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(os2, "os");
        Intrinsics.checkNotNull(c46075i);
        InputStream inputStreamM101579n = c46075i.m101579n();
        if (inputStreamM101579n != null) {
            this$0.pooledByteStreams.m102901a(inputStreamM101579n, os2);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
