package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.C5610a;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import p007a5.InterfaceC0130g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a */
/* JADX INFO: compiled from: AnimationCoordinator.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&¨\u0006)"}, m90084d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/a;", "", "<init>", "()V", "La5/g;", "animation", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "frameResult", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(La5/g;Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;)V", "", "j", "()Z", "i", "", "delta", "k", "(La5/g;I)V", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "successCounter", "c", "failuresCounter", "d", "criticalCounter", "Ljava/util/concurrent/ConcurrentHashMap;", "e", "Ljava/util/concurrent/ConcurrentHashMap;", "runningAnimations", "Landroid/os/Handler;", "f", "Lkotlin/Lazy;", "()Landroid/os/Handler;", "handler", "Ljava/lang/Runnable;", "g", "Ljava/lang/Runnable;", "calculatePerformance", "clearUnusedFrameLoaders", "animated-drawable_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAnimationCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationCoordinator.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/AnimationCoordinator\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,130:1\n216#2,2:131\n216#2,2:133\n*S KotlinDebug\n*F\n+ 1 AnimationCoordinator.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/AnimationCoordinator\n*L\n53#1:131,2\n58#1:133,2\n*E\n"})
public final class C5610a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5610a f8443a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger successCounter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger failuresCounter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger criticalCounter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<InterfaceC0130g, Integer> runningAnimations;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Lazy handler;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Runnable calculatePerformance;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final Runnable clearUnusedFrameLoaders;

    /* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a$a */
    /* JADX INFO: compiled from: AnimationCoordinator.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FrameResult.FrameType.values().length];
            try {
                iArr[FrameResult.FrameType.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FrameResult.FrameType.NEAREST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FrameResult.FrameType.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        C5610a c5610a = new C5610a();
        f8443a = c5610a;
        successCounter = new AtomicInteger(0);
        failuresCounter = new AtomicInteger(0);
        criticalCounter = new AtomicInteger(0);
        runningAnimations = new ConcurrentHashMap<>();
        handler = LazyKt.lazy(new Function0() { // from class: a5.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C5610a.m8800g();
            }
        });
        Runnable runnable = new Runnable() { // from class: a5.c
            @Override // java.lang.Runnable
            public final void run() {
                C5610a.m8798d();
            }
        };
        calculatePerformance = runnable;
        Runnable runnable2 = new Runnable() { // from class: a5.d
            @Override // java.lang.Runnable
            public final void run() {
                C5610a.m8799e();
            }
        };
        clearUnusedFrameLoaders = runnable2;
        c5610a.m8801f().post(runnable);
        c5610a.m8801f().post(runnable2);
    }

    /* JADX INFO: renamed from: d */
    public static final void m8798d() {
        float andSet = successCounter.getAndSet(0);
        float andSet2 = failuresCounter.getAndSet(0);
        float andSet3 = criticalCounter.getAndSet(0);
        float f11 = andSet + andSet2 + andSet3;
        if (f11 > 0.0f) {
            float f12 = andSet / f11;
            float f13 = andSet3 / f11;
            if (andSet2 / f11 > 0.25f || f13 > 0.1f) {
                for (Map.Entry<InterfaceC0130g, Integer> entry : runningAnimations.entrySet()) {
                    f8443a.m8805k(entry.getKey(), -entry.getValue().intValue());
                }
            } else if (f12 > 0.98f) {
                for (Map.Entry<InterfaceC0130g, Integer> entry2 : runningAnimations.entrySet()) {
                    f8443a.m8805k(entry2.getKey(), entry2.getValue().intValue());
                }
            }
            runningAnimations.clear();
        }
        f8443a.m8804j();
    }

    /* JADX INFO: renamed from: g */
    public static final Handler m8800g() {
        HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: f */
    public final Handler m8801f() {
        return (Handler) handler.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m8802h(@NotNull InterfaceC0130g animation, @NotNull FrameResult frameResult) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(frameResult, "frameResult");
        ConcurrentHashMap<InterfaceC0130g, Integer> concurrentHashMap = runningAnimations;
        if (!concurrentHashMap.contains(animation)) {
            concurrentHashMap.put(animation, Integer.valueOf((int) (animation.mo598c() * 0.2f)));
        }
        int i11 = a.$EnumSwitchMapping$0[frameResult.getType().ordinal()];
        if (i11 == 1) {
            successCounter.incrementAndGet();
        } else if (i11 == 2) {
            failuresCounter.incrementAndGet();
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            criticalCounter.incrementAndGet();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8799e() {
        FrameLoaderFactory.INSTANCE.clearUnusedUntil(new Date(System.currentTimeMillis() - 10000));
        f8443a.m8803i();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m8803i() {
        return m8801f().postDelayed(clearUnusedFrameLoaders, 10000L);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m8804j() {
        return m8801f().postDelayed(calculatePerformance, 2000L);
    }

    /* JADX INFO: renamed from: k */
    public final void m8805k(InterfaceC0130g animation, int delta) {
        int iCoerceIn = RangesKt.coerceIn(animation.mo597b() + delta, (int) RangesKt.coerceAtLeast(animation.mo598c() * 0.5f, 1.0f), animation.mo598c());
        if (iCoerceIn != animation.mo597b()) {
            animation.mo596a(iCoerceIn);
        }
    }
}
