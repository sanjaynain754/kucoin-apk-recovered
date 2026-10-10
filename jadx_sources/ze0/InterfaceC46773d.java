package ze0;

import io.github.crow_misia.libyuv.FilterMode;
import io.github.crow_misia.libyuv.RotateMode;
import io.github.crow_misia.libyuv.Yuv;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ze0.InterfaceC46773d;

/* JADX INFO: renamed from: ze0.d */
/* JADX INFO: compiled from: Buffer32.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m90084d2 = {"Lze0/d;", "BUFFER", "Lze0/e;", "Lze0/o;", "r", "()Lze0/o;", "plane", "core_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC46773d<BUFFER extends InterfaceC46773d<BUFFER>> extends InterfaceC46774e {

    /* JADX INFO: renamed from: ze0.d$a */
    /* JADX INFO: compiled from: Buffer32.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static <BUFFER extends InterfaceC46773d<BUFFER>> void m103075a(@NotNull InterfaceC46773d<BUFFER> interfaceC46773d, @NotNull BUFFER dst, @NotNull RotateMode rotateMode) {
            Intrinsics.checkNotNullParameter(dst, "dst");
            Intrinsics.checkNotNullParameter(rotateMode, "rotateMode");
            Yuv.INSTANCE.rotateARGBRotate(interfaceC46773d.mo103064r().mo87797a(), interfaceC46773d.mo103064r().mo87799c(), C46778i.m103087f(interfaceC46773d, 0), dst.mo103064r().mo87797a(), dst.mo103064r().mo87799c(), C46778i.m103087f(dst, 0), rotateMode.calculateWidth$core_release(interfaceC46773d, dst), rotateMode.calculateHeight$core_release(interfaceC46773d, dst), rotateMode.getDegrees());
        }

        /* JADX INFO: renamed from: b */
        public static <BUFFER extends InterfaceC46773d<BUFFER>> void m103076b(@NotNull InterfaceC46773d<BUFFER> interfaceC46773d, @NotNull BUFFER dst, @NotNull FilterMode filterMode) {
            Intrinsics.checkNotNullParameter(dst, "dst");
            Intrinsics.checkNotNullParameter(filterMode, "filterMode");
            Yuv.INSTANCE.scaleARGBScale(interfaceC46773d.mo103064r().mo87797a(), interfaceC46773d.mo103064r().mo87799c(), C46778i.m103087f(interfaceC46773d, 0), interfaceC46773d.getCropRect().width(), interfaceC46773d.getCropRect().height(), dst.mo103064r().mo87797a(), dst.mo103064r().mo87799c(), C46778i.m103087f(dst, 0), dst.getCropRect().width(), dst.getCropRect().height(), filterMode.getMode());
        }
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    AbstractC46784o mo103064r();
}
