package jumio.core;

import com.jumio.core.sensors.SensorType;

/* JADX INFO: renamed from: jumio.core.M0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40562M0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90048a;

    static {
        int[] iArr = new int[SensorType.values().length];
        try {
            iArr[SensorType.ACCELEROMETER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SensorType.GRAVITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SensorType.GYROSCOPE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SensorType.LIGHT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SensorType.LINEAR_ACCELEROMETER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f90048a = iArr;
    }
}
