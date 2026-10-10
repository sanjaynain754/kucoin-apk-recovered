package jumio.core;

import com.jumio.core.sensors.SensorType;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.I3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40545I3 implements InterfaceC40550J3, Serializable {

    /* JADX INFO: renamed from: a */
    public final SensorType f90009a;

    /* JADX INFO: renamed from: b */
    public final C40675i2 f90010b;

    /* JADX INFO: renamed from: c */
    public final C40675i2 f90011c;

    /* JADX INFO: renamed from: d */
    public final C40675i2 f90012d;

    /* JADX INFO: renamed from: e */
    public final C40675i2 f90013e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40545I3)) {
            return false;
        }
        C40545I3 c40545i3 = (C40545I3) obj;
        return this.f90009a == c40545i3.f90009a && Intrinsics.areEqual(this.f90010b, c40545i3.f90010b) && Intrinsics.areEqual(this.f90011c, c40545i3.f90011c) && Intrinsics.areEqual(this.f90012d, c40545i3.f90012d) && Intrinsics.areEqual(this.f90013e, c40545i3.f90013e);
    }

    @Override // jumio.core.InterfaceC40550J3
    /* JADX INFO: renamed from: a */
    public final JSONObject mo89190a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        AbstractC40555K3.m89200a(jSONObject, this.f90010b);
        AbstractC40555K3.m89200a(jSONObject, this.f90011c);
        AbstractC40555K3.m89200a(jSONObject, this.f90012d);
        AbstractC40555K3.m89200a(jSONObject, this.f90013e);
        return jSONObject;
    }

    @Override // jumio.core.InterfaceC40550J3
    public final SensorType getType() {
        return this.f90009a;
    }

    public final int hashCode() {
        return this.f90013e.hashCode() + ((this.f90012d.hashCode() + ((this.f90011c.hashCode() + ((this.f90010b.hashCode() + (this.f90009a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ListSensorResult(type=" + this.f90009a + ", timeDelta=" + this.f90010b + ", sensorValue0=" + this.f90011c + ", sensorValue1=" + this.f90012d + ", sensorValue2=" + this.f90013e + ')';
    }

    public C40545I3(SensorType type, C40675i2 timeDelta, C40675i2 sensorValue0, C40675i2 sensorValue1, C40675i2 sensorValue2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(timeDelta, "timeDelta");
        Intrinsics.checkNotNullParameter(sensorValue0, "sensorValue0");
        Intrinsics.checkNotNullParameter(sensorValue1, "sensorValue1");
        Intrinsics.checkNotNullParameter(sensorValue2, "sensorValue2");
        this.f90009a = type;
        this.f90010b = timeDelta;
        this.f90011c = sensorValue0;
        this.f90012d = sensorValue1;
        this.f90013e = sensorValue2;
    }
}
