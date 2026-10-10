package jumio.core;

import java.io.Serializable;

/* JADX INFO: renamed from: jumio.core.F3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40530F3 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final long f89963a;

    /* JADX INFO: renamed from: b */
    public final float f89964b;

    /* JADX INFO: renamed from: c */
    public final float f89965c;

    /* JADX INFO: renamed from: d */
    public final float f89966d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40530F3)) {
            return false;
        }
        C40530F3 c40530f3 = (C40530F3) obj;
        return this.f89963a == c40530f3.f89963a && Float.compare(this.f89964b, c40530f3.f89964b) == 0 && Float.compare(this.f89965c, c40530f3.f89965c) == 0 && Float.compare(this.f89966d, c40530f3.f89966d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f89966d) + ((Float.hashCode(this.f89965c) + ((Float.hashCode(this.f89964b) + (Long.hashCode(this.f89963a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SensorData(timeDelta=" + this.f89963a + ", sensorValue0=" + this.f89964b + ", sensorValue1=" + this.f89965c + ", sensorValue2=" + this.f89966d + ')';
    }

    public C40530F3(long j11, float f11, float f12, float f13) {
        this.f89963a = j11;
        this.f89964b = f11;
        this.f89965c = f12;
        this.f89966d = f13;
    }
}
