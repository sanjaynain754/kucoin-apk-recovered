package com.sumsub.sns.internal.features.data.model.common;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.C33272c;
import java.util.Locale;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.L2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29026L2 {
    /* JADX INFO: renamed from: a */
    public static PhotosAmount m69731a(String str) {
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : null;
        if (lowerCase == null) {
            return PhotosAmount.SOME;
        }
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 110182) {
            if (iHashCode != 115276) {
                if (iHashCode == 3536116 && lowerCase.equals("some")) {
                    return PhotosAmount.SOME;
                }
            } else if (lowerCase.equals("two")) {
                return PhotosAmount.TWO;
            }
        } else if (lowerCase.equals("one")) {
            return PhotosAmount.ONE;
        }
        Logger.DefaultImpls.w$default(C33272c.f67816e, "PhotosAmount", "Unknown countImages='" + str + "', falling back to SOME", null, 4, null);
        return PhotosAmount.SOME;
    }
}
