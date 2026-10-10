package p463n5;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import com.facebook.imagepipeline.cache.InterfaceC5645c;
import com.tencent.bugly.proguard.C33954u6;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p526p5.AbstractC43387c;
import p547q3.InterfaceC43595a;
import p617s5.InterfaceC44341n;
import p651u3.InterfaceExecutorServiceC45104g;
import p749x5.InterfaceC46071e;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: n5.b */
/* JADX INFO: compiled from: AnimatedFactoryProvider.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Ln5/b;", "", "<init>", "()V", "Lp5/c;", "platformBitmapFactory", "Ls5/n;", "executorSupplier", "Lcom/facebook/imagepipeline/cache/c;", "Lq3/a;", "Lx5/e;", "backingCache", "", "downscaleFrameToDrawableDimensions", "useBalancedAnimationStrategy", "", "animationFpsLimit", "bufferLengthMilliseconds", "Ljava/util/concurrent/ExecutorService;", "serialExecutorService", "Ln5/a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lp5/c;Ls5/n;Lcom/facebook/imagepipeline/cache/c;ZZIILjava/util/concurrent/ExecutorService;)Ln5/a;", "b", "Z", "implLoaded", "c", "Ln5/a;", C33954u6.f72233d, "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C42752b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42752b f94699a = new C42752b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean implLoaded;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static InterfaceC42751a impl;

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final InterfaceC42751a m93676a(@Nullable AbstractC43387c platformBitmapFactory, @Nullable InterfaceC44341n executorSupplier, @Nullable InterfaceC5645c<InterfaceC43595a, InterfaceC46071e> backingCache, boolean downscaleFrameToDrawableDimensions, boolean useBalancedAnimationStrategy, int animationFpsLimit, int bufferLengthMilliseconds, @Nullable ExecutorService serialExecutorService) {
        if (!implLoaded) {
            try {
                Class cls = Boolean.TYPE;
                Class cls2 = Integer.TYPE;
                Object objNewInstance = AnimatedFactoryV2Impl.class.getConstructor(AbstractC43387c.class, InterfaceC44341n.class, InterfaceC5645c.class, cls, cls, cls2, cls2, InterfaceExecutorServiceC45104g.class).newInstance(platformBitmapFactory, executorSupplier, backingCache, Boolean.valueOf(downscaleFrameToDrawableDimensions), Boolean.valueOf(useBalancedAnimationStrategy), Integer.valueOf(animationFpsLimit), Integer.valueOf(bufferLengthMilliseconds), serialExecutorService);
                Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
                impl = (InterfaceC42751a) objNewInstance;
            } catch (Throwable unused) {
            }
            if (impl != null) {
                implLoaded = true;
            }
        }
        return impl;
    }
}
