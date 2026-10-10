package jumio.liveness;

import com.jumio.core.MobileContext;
import com.jumio.core.data.ScanMode;
import com.jumio.core.models.LivenessSettingsModel;
import com.jumio.core.models.TimeModel;
import java.nio.ByteBuffer;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.B */
/* JADX INFO: loaded from: classes61.dex */
public final class C40773B {

    /* JADX INFO: renamed from: a */
    public final MobileContext f90568a;

    /* JADX INFO: renamed from: b */
    public final LivenessSettingsModel f90569b;

    /* JADX INFO: renamed from: c */
    public final TimeModel f90570c;

    /* JADX INFO: renamed from: d */
    public final boolean f90571d;

    /* JADX INFO: renamed from: e */
    public final ByteBuffer f90572e;

    /* JADX INFO: renamed from: f */
    public final ScanMode f90573f;

    /* JADX INFO: renamed from: g */
    public final String f90574g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40773B)) {
            return false;
        }
        C40773B c40773b = (C40773B) obj;
        return Intrinsics.areEqual(this.f90568a, c40773b.f90568a) && Intrinsics.areEqual(this.f90569b, c40773b.f90569b) && Intrinsics.areEqual(this.f90570c, c40773b.f90570c) && this.f90571d == c40773b.f90571d && Intrinsics.areEqual(this.f90572e, c40773b.f90572e) && this.f90573f == c40773b.f90573f && Intrinsics.areEqual(this.f90574g, c40773b.f90574g);
    }

    public C40773B(MobileContext context, LivenessSettingsModel livenessSettingsModel, TimeModel timeModel, boolean z11, ByteBuffer assets, ScanMode scanMode, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(livenessSettingsModel, "livenessSettingsModel");
        Intrinsics.checkNotNullParameter(timeModel, "timeModel");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(scanMode, "scanMode");
        this.f90568a = context;
        this.f90569b = livenessSettingsModel;
        this.f90570c = timeModel;
        this.f90571d = z11;
        this.f90572e = assets;
        this.f90573f = scanMode;
        this.f90574g = str;
    }

    public final int hashCode() {
        int iHashCode = (this.f90573f.hashCode() + ((this.f90572e.hashCode() + ((Boolean.hashCode(this.f90571d) + ((this.f90570c.hashCode() + ((this.f90569b.hashCode() + (this.f90568a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f90574g;
        return Integer.hashCode(4) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "LivenessProcessorConfig(context=" + this.f90568a + ", livenessSettingsModel=" + this.f90569b + ", timeModel=" + this.f90570c + ", portraitMode=" + this.f90571d + ", assets=" + this.f90572e + ", scanMode=" + this.f90573f + ", nonce=" + this.f90574g + ", hardwareLatency=4)";
    }
}
