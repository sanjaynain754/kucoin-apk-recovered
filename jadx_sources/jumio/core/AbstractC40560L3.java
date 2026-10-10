package jumio.core;

import com.jumio.core.sensors.SensorType;

/* JADX INFO: renamed from: jumio.core.L3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract /* synthetic */ class AbstractC40560L3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f90041a;

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
        f90041a = iArr;
    }
}
