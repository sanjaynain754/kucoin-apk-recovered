package coil.size;

import java.util.Arrays;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: Precision.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcoil/size/Precision;", "", "(Ljava/lang/String;I)V", "EXACT", "INEXACT", "AUTOMATIC", "coil-base_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public enum Precision {
    EXACT,
    INEXACT,
    AUTOMATIC;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static Precision[] valuesCustom() {
        Precision[] precisionArrValuesCustom = values();
        return (Precision[]) Arrays.copyOf(precisionArrValuesCustom, precisionArrValuesCustom.length);
    }
}
