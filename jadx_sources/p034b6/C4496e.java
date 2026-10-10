package p034b6;

import android.os.Build;
import androidx.core.util.Pools;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import p008a6.C0146g0;
import p008a6.InterfaceC0149i;
import p819z3.C46673b;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: b6.e */
/* JADX INFO: compiled from: PlatformDecoderFactory.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lb6/e;", "", "<init>", "()V", "La6/g0;", "poolFactory", "", "gingerbreadDecoderEnabled", "useDecodeBufferHelper", "Lb6/f;", "platformDecoderOptions", "Lb6/d;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(La6/g0;ZZLb6/f;)Lb6/d;", "Landroidx/core/util/Pools$Pool;", "Ljava/nio/ByteBuffer;", "b", "(La6/g0;Z)Landroidx/core/util/Pools$Pool;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C4496e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4496e f3907a = new C4496e();

    @JvmStatic
    @JvmOverloads
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC4495d m4298a(@NotNull C0146g0 poolFactory, boolean gingerbreadDecoderEnabled, boolean useDecodeBufferHelper, @NotNull C4497f platformDecoderOptions) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(platformDecoderOptions, "platformDecoderOptions");
        if (Build.VERSION.SDK_INT >= 26) {
            InterfaceC0149i interfaceC0149iM670b = poolFactory.m670b();
            Intrinsics.checkNotNullExpressionValue(interfaceC0149iM670b, "getBitmapPool(...)");
            return new C4494c(interfaceC0149iM670b, m4299b(poolFactory, useDecodeBufferHelper), platformDecoderOptions);
        }
        InterfaceC0149i interfaceC0149iM670b2 = poolFactory.m670b();
        Intrinsics.checkNotNullExpressionValue(interfaceC0149iM670b2, "getBitmapPool(...)");
        return new C4492a(interfaceC0149iM670b2, m4299b(poolFactory, useDecodeBufferHelper), platformDecoderOptions);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Pools.Pool<ByteBuffer> m4299b(@NotNull C0146g0 poolFactory, boolean useDecodeBufferHelper) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        if (useDecodeBufferHelper) {
            C46673b INSTANCE = C46673b.f104505a;
            Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
            return INSTANCE;
        }
        int iM673e = poolFactory.m673e();
        Pools.SynchronizedPool synchronizedPool = new Pools.SynchronizedPool(iM673e);
        for (int i11 = 0; i11 < iM673e; i11++) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(C46673b.m102893c());
            Intrinsics.checkNotNullExpressionValue(byteBufferAllocate, "allocate(...)");
            synchronizedPool.release(byteBufferAllocate);
        }
        return synchronizedPool;
    }
}
