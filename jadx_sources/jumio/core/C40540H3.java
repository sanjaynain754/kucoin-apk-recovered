package jumio.core;

import com.jumio.core.sensors.SensorType;
import org.json.JSONObject;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.H3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40540H3 implements InterfaceC40550J3 {

    /* JADX INFO: renamed from: a */
    public final SensorType f90004a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40540H3) && this.f90004a == ((C40540H3) obj).f90004a;
    }

    @Override // jumio.core.InterfaceC40550J3
    /* JADX INFO: renamed from: a */
    public final JSONObject mo89190a() {
        return new JSONObject();
    }

    @Override // jumio.core.InterfaceC40550J3
    public final SensorType getType() {
        return this.f90004a;
    }

    public final int hashCode() {
        return this.f90004a.hashCode();
    }

    public final String toString() {
        return "EmptySensorResult(type=" + this.f90004a + ')';
    }

    public C40540H3(SensorType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f90004a = type;
    }
}
