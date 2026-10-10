package jumio.camerax;

import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.RggbChannelVector;
import com.jumio.core.enums.FlashState;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: jumio.camerax.r */
/* JADX INFO: loaded from: classes61.dex */
public final class C40492r {

    /* JADX INFO: renamed from: a */
    public final long f89874a;

    /* JADX INFO: renamed from: b */
    public final int f89875b;

    /* JADX INFO: renamed from: c */
    public final float f89876c;

    /* JADX INFO: renamed from: d */
    public final int f89877d;

    /* JADX INFO: renamed from: e */
    public final float f89878e;

    /* JADX INFO: renamed from: f */
    public final ColorSpaceTransform f89879f;

    /* JADX INFO: renamed from: g */
    public final RggbChannelVector f89880g;

    /* JADX INFO: renamed from: h */
    public final FlashState f89881h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40492r)) {
            return false;
        }
        C40492r c40492r = (C40492r) obj;
        return this.f89874a == c40492r.f89874a && this.f89875b == c40492r.f89875b && Float.compare(this.f89876c, c40492r.f89876c) == 0 && this.f89877d == c40492r.f89877d && Float.compare(this.f89878e, c40492r.f89878e) == 0 && Intrinsics.areEqual(this.f89879f, c40492r.f89879f) && Intrinsics.areEqual(this.f89880g, c40492r.f89880g) && this.f89881h == c40492r.f89881h;
    }

    public C40492r(long j11, int i11, float f11, int i12, float f12, ColorSpaceTransform colorSpaceTransform, RggbChannelVector rggbChannelVector, FlashState flashState) {
        Intrinsics.checkNotNullParameter(flashState, "flashState");
        this.f89874a = j11;
        this.f89875b = i11;
        this.f89876c = f11;
        this.f89877d = i12;
        this.f89878e = f12;
        this.f89879f = colorSpaceTransform;
        this.f89880g = rggbChannelVector;
        this.f89881h = flashState;
    }

    public final int hashCode() {
        int iHashCode = (Float.hashCode(this.f89878e) + ((Integer.hashCode(this.f89877d) + ((Float.hashCode(this.f89876c) + ((Integer.hashCode(this.f89875b) + (Long.hashCode(this.f89874a) * 31)) * 31)) * 31)) * 31)) * 31;
        ColorSpaceTransform colorSpaceTransform = this.f89879f;
        int iHashCode2 = (iHashCode + (colorSpaceTransform == null ? 0 : colorSpaceTransform.hashCode())) * 31;
        RggbChannelVector rggbChannelVector = this.f89880g;
        return this.f89881h.hashCode() + ((iHashCode2 + (rggbChannelVector != null ? rggbChannelVector.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return StringsKt.trimIndent("\n\t\t| shutterSpeedInNs: " + this.f89874a + "\n\t\t| iso: " + this.f89875b + "\n\t\t| aperture: " + this.f89876c + "\n\t\t| afMode: " + this.f89877d + "\n\t\t| lensDistance: " + this.f89878e + "\n\t\t| colorSpaceTransform: " + this.f89879f + "\n\t\t| rggbChannelVector: " + this.f89880g + "\n\t\t| flashState: " + this.f89881h + "\n\t");
    }
}
