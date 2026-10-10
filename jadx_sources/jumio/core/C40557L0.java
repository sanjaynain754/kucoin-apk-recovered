package jumio.core;

import com.jumio.commons.camera.CameraCapabilities;
import java.util.Arrays;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.L0 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40557L0 implements CameraCapabilities {

    /* JADX INFO: renamed from: a */
    public final boolean f90030a;

    /* JADX INFO: renamed from: b */
    public final boolean f90031b;

    /* JADX INFO: renamed from: c */
    public final boolean f90032c;

    /* JADX INFO: renamed from: d */
    public final boolean f90033d;

    /* JADX INFO: renamed from: e */
    public final boolean f90034e;

    /* JADX INFO: renamed from: f */
    public final boolean f90035f;

    /* JADX INFO: renamed from: g */
    public final boolean f90036g;

    /* JADX INFO: renamed from: h */
    public final String[] f90037h;

    /* JADX INFO: renamed from: i */
    public final String f90038i;

    public C40557L0(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, String[] availableWhiteBalanceModes, String info) {
        Intrinsics.checkNotNullParameter(availableWhiteBalanceModes, "availableWhiteBalanceModes");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f90030a = z11;
        this.f90031b = z12;
        this.f90032c = z13;
        this.f90033d = z14;
        this.f90034e = z15;
        this.f90035f = z16;
        this.f90036g = z17;
        this.f90037h = availableWhiteBalanceModes;
        this.f90038i = info;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C40557L0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.jumio.commons.camera.DefaultCameraCapabilities");
        C40557L0 c40557l0 = (C40557L0) obj;
        return this.f90030a == c40557l0.f90030a && this.f90031b == c40557l0.f90031b && this.f90032c == c40557l0.f90032c && this.f90033d == c40557l0.f90033d && this.f90034e == c40557l0.f90034e && this.f90035f == c40557l0.f90035f && this.f90036g == c40557l0.f90036g && Arrays.equals(this.f90037h, c40557l0.f90037h) && Intrinsics.areEqual(this.f90038i, c40557l0.f90038i);
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public final String[] getAvailableWhiteBalanceModes() {
        return this.f90037h;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public final boolean getCanAdjustExposure() {
        return this.f90035f;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public final boolean getCanAdjustFocus() {
        return this.f90034e;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public final boolean getCanAdjustWhiteBalance() {
        return this.f90036g;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public final boolean getHasExposureAndWhiteBalanceLock() {
        return this.f90033d;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public final boolean getHasFlash() {
        return this.f90030a;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public final boolean getHasHighResolutionSupport() {
        return this.f90032c;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public final boolean getHasMultipleCameras() {
        return this.f90031b;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public final String getInfo() {
        return this.f90038i;
    }

    public final int hashCode() {
        return this.f90038i.hashCode() + ((AbstractC40637b0.m89251a(this.f90036g, AbstractC40637b0.m89251a(this.f90035f, AbstractC40637b0.m89251a(this.f90034e, AbstractC40637b0.m89251a(this.f90033d, AbstractC40637b0.m89251a(this.f90032c, AbstractC40637b0.m89251a(this.f90031b, Boolean.hashCode(this.f90030a) * 31, 31), 31), 31), 31), 31), 31) + Arrays.hashCode(this.f90037h)) * 31);
    }

    public final String toString() {
        return super.defaultToString();
    }

    public /* synthetic */ C40557L0() {
        this(false, false, false, false, false, false, false, new String[0], "");
    }
}
