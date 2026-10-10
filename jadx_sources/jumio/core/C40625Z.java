package jumio.core;

import com.jumio.core.model.StaticModel;
import com.jumio.core.models.CameraChallengePart$Companion;

/* JADX INFO: renamed from: jumio.core.Z */
/* JADX INFO: loaded from: classes61.dex */
public final class C40625Z implements StaticModel {

    /* JADX INFO: renamed from: f */
    public static final CameraChallengePart$Companion f90188f = new CameraChallengePart$Companion(null);

    /* JADX INFO: renamed from: a */
    public final int f90189a;

    /* JADX INFO: renamed from: b */
    public final int f90190b;

    /* JADX INFO: renamed from: c */
    public final float f90191c;

    /* JADX INFO: renamed from: d */
    public final float f90192d;

    /* JADX INFO: renamed from: e */
    public final long f90193e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40625Z)) {
            return false;
        }
        C40625Z c40625z = (C40625Z) obj;
        return this.f90189a == c40625z.f90189a && this.f90190b == c40625z.f90190b && Float.compare(this.f90191c, c40625z.f90191c) == 0 && Float.compare(this.f90192d, c40625z.f90192d) == 0 && this.f90193e == c40625z.f90193e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f90193e) + ((Float.hashCode(this.f90192d) + ((Float.hashCode(this.f90191c) + AbstractC40653e0.m89252a(this.f90190b, Integer.hashCode(this.f90189a) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CameraChallengePart(min=" + this.f90189a + ", max=" + this.f90190b + ", setupThreshold=" + this.f90191c + ", coolDownThreshold=" + this.f90192d + ", holdStillTime=" + this.f90193e + ')';
    }

    public C40625Z(int i11, int i12, float f11, float f12, long j11) {
        this.f90189a = i11;
        this.f90190b = i12;
        this.f90191c = f11;
        this.f90192d = f12;
        this.f90193e = j11;
    }
}
