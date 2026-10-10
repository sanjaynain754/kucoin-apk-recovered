package jumio.core;

import com.jumio.core.model.StaticModel;
import com.jumio.core.models.CameraChallengeConfig$Companion;
import com.jumio.sdk.enums.JumioCredentialPart;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.V */
/* JADX INFO: loaded from: classes61.dex */
public final class C40605V implements StaticModel {

    /* JADX INFO: renamed from: h */
    public static final CameraChallengeConfig$Companion f90131h = new CameraChallengeConfig$Companion(null);

    /* JADX INFO: renamed from: a */
    public final JumioCredentialPart f90132a;

    /* JADX INFO: renamed from: b */
    public final boolean f90133b;

    /* JADX INFO: renamed from: c */
    public final boolean f90134c;

    /* JADX INFO: renamed from: d */
    public final String f90135d;

    /* JADX INFO: renamed from: e */
    public final C40625Z f90136e;

    /* JADX INFO: renamed from: f */
    public final C40625Z f90137f;

    /* JADX INFO: renamed from: g */
    public final C40625Z f90138g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40605V)) {
            return false;
        }
        C40605V c40605v = (C40605V) obj;
        return this.f90132a == c40605v.f90132a && this.f90133b == c40605v.f90133b && this.f90134c == c40605v.f90134c && Intrinsics.areEqual(this.f90135d, c40605v.f90135d) && Intrinsics.areEqual(this.f90136e, c40605v.f90136e) && Intrinsics.areEqual(this.f90137f, c40605v.f90137f) && Intrinsics.areEqual(this.f90138g, c40605v.f90138g);
    }

    public C40605V(JumioCredentialPart part, boolean z11, boolean z12, String classifier, C40625Z exposure, C40625Z focus, C40625Z whiteBalance) {
        Intrinsics.checkNotNullParameter(part, "part");
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(exposure, "exposure");
        Intrinsics.checkNotNullParameter(focus, "focus");
        Intrinsics.checkNotNullParameter(whiteBalance, "whiteBalance");
        this.f90132a = part;
        this.f90133b = z11;
        this.f90134c = z12;
        this.f90135d = classifier;
        this.f90136e = exposure;
        this.f90137f = focus;
        this.f90138g = whiteBalance;
    }

    public final int hashCode() {
        return this.f90138g.hashCode() + ((this.f90137f.hashCode() + ((this.f90136e.hashCode() + AbstractC40511C.m89148a(this.f90135d, AbstractC40637b0.m89251a(this.f90134c, AbstractC40637b0.m89251a(this.f90133b, this.f90132a.hashCode() * 31, 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CameraChallengeConfig(part=" + this.f90132a + ", manualEnabled=" + this.f90133b + ", uploadImages=" + this.f90134c + ", classifier=" + this.f90135d + ", exposure=" + this.f90136e + ", focus=" + this.f90137f + ", whiteBalance=" + this.f90138g + ')';
    }
}
