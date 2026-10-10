package com.jumio.core.sensors;

import jumio.core.AbstractC40560L3;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.jumio.core.sensors.SensorType[], still in use, count: 1, list:
  (r0v1 com.jumio.core.sensors.SensorType[]) from 0x0038: INVOKE (r0v1 com.jumio.core.sensors.SensorType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:59)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0011"}, m90084d2 = {"Lcom/jumio/core/sensors/SensorType;", "", "<init>", "(Ljava/lang/String;I)V", "ACCELEROMETER", "GRAVITY", "GYROSCOPE", "LIGHT", "LINEAR_ACCELEROMETER", "uploadName", "", "getUploadName", "()Ljava/lang/String;", "androidSensorType", "", "getAndroidSensorType", "()I", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SensorType {
    ACCELEROMETER,
    GRAVITY,
    GYROSCOPE,
    LIGHT,
    LINEAR_ACCELEROMETER;


    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f14575b;

    static {
        f14575b = EnumEntriesKt.enumEntries(sensorTypeArr);
    }

    @NotNull
    public static EnumEntries<SensorType> getEntries() {
        return f14575b;
    }

    public static SensorType valueOf(String str) {
        return (SensorType) Enum.valueOf(SensorType.class, str);
    }

    public static SensorType[] values() {
        return (SensorType[]) f14574a.clone();
    }

    public final int getAndroidSensorType() {
        int i11 = AbstractC40560L3.f90041a[ordinal()];
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 9;
        }
        if (i11 == 3) {
            return 4;
        }
        if (i11 == 4) {
            return 5;
        }
        if (i11 == 5) {
            return 10;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getUploadName() {
        int i11 = AbstractC40560L3.f90041a[ordinal()];
        if (i11 == 1) {
            return "Accelerometer";
        }
        if (i11 == 2) {
            return "Gravity";
        }
        if (i11 == 3) {
            return "Gyroscope";
        }
        if (i11 == 4) {
            return "LightSensor";
        }
        if (i11 == 5) {
            return "LinearAccelerometer";
        }
        throw new NoWhenBranchMatchedException();
    }

    public SensorType() {
        super(str, i);
    }
}
