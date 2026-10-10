package p526p5;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p008a6.C0146g0;
import p008a6.InterfaceC0149i;
import p034b6.InterfaceC4495d;
import p617s5.C44315a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: p5.d */
/* JADX INFO: compiled from: PlatformBitmapFactoryProvider.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lp5/d;", "", "<init>", "()V", "La6/g0;", "poolFactory", "Lb6/d;", "platformDecoder", "Ls5/a;", "closeableReferenceFactory", "Lp5/c;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(La6/g0;Lb6/d;Ls5/a;)Lp5/c;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C43388d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43388d f95835a = new C43388d();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AbstractC43387c m95563a(@NotNull C0146g0 poolFactory, @NotNull InterfaceC4495d platformDecoder, @NotNull C44315a closeableReferenceFactory) {
        Intrinsics.checkNotNullParameter(poolFactory, "poolFactory");
        Intrinsics.checkNotNullParameter(platformDecoder, "platformDecoder");
        Intrinsics.checkNotNullParameter(closeableReferenceFactory, "closeableReferenceFactory");
        InterfaceC0149i interfaceC0149iM670b = poolFactory.m670b();
        Intrinsics.checkNotNullExpressionValue(interfaceC0149iM670b, "getBitmapPool(...)");
        return new C43385a(interfaceC0149iM670b, closeableReferenceFactory);
    }
}
