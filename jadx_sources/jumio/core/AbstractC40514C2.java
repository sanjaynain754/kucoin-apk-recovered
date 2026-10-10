package jumio.core;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: renamed from: jumio.core.C2 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40514C2 {
    /* JADX INFO: renamed from: a */
    public static final double m89155a(double d11, int i11) {
        try {
            return new BigDecimal(d11).setScale(i11, RoundingMode.HALF_UP).doubleValue();
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }
}
