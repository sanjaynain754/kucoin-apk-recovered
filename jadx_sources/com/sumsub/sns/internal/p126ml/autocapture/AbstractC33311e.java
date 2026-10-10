package com.sumsub.sns.internal.p126ml.autocapture;

import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import org.json.JSONObject;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.autocapture.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33311e {
    /* JADX INFO: renamed from: a */
    public static C33313g m71633a() {
        SeamlessDocaptureMobileConfig$VideoQuality seamlessDocaptureMobileConfig$VideoQuality;
        SeamlessDocaptureMobileConfig$VideoQuality seamlessDocaptureMobileConfig$VideoQuality2;
        String str = C33048a.f67486s.m71435b().f67504b;
        if (str == null) {
            return new C33313g();
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("android");
            int iOptInt = jSONObject.optInt("videoBitrate", C33313g.f67924f);
            int iOptInt2 = jSONObject.optInt("maxRecordedDurationSec", C33313g.f67925g);
            String strOptString = jSONObject.optString("videoQuality");
            SeamlessDocaptureMobileConfig$VideoQuality.Companion.getClass();
            SeamlessDocaptureMobileConfig$VideoQuality[] seamlessDocaptureMobileConfig$VideoQualityArrValues = SeamlessDocaptureMobileConfig$VideoQuality.values();
            int length = seamlessDocaptureMobileConfig$VideoQualityArrValues.length;
            int i11 = 0;
            while (true) {
                seamlessDocaptureMobileConfig$VideoQuality = null;
                if (i11 >= length) {
                    seamlessDocaptureMobileConfig$VideoQuality2 = null;
                    break;
                }
                seamlessDocaptureMobileConfig$VideoQuality2 = seamlessDocaptureMobileConfig$VideoQualityArrValues[i11];
                if (Intrinsics.areEqual(seamlessDocaptureMobileConfig$VideoQuality2.getValue(), strOptString)) {
                    break;
                }
                i11++;
            }
            if (seamlessDocaptureMobileConfig$VideoQuality2 == null) {
                seamlessDocaptureMobileConfig$VideoQuality2 = SeamlessDocaptureMobileConfig$VideoQuality.HD;
            }
            SeamlessDocaptureMobileConfig$VideoQuality seamlessDocaptureMobileConfig$VideoQuality3 = seamlessDocaptureMobileConfig$VideoQuality2;
            String strOptString2 = jSONObject.optString("videoFallbackQuality");
            SeamlessDocaptureMobileConfig$VideoQuality.Companion.getClass();
            for (SeamlessDocaptureMobileConfig$VideoQuality seamlessDocaptureMobileConfig$VideoQuality4 : SeamlessDocaptureMobileConfig$VideoQuality.values()) {
                if (Intrinsics.areEqual(seamlessDocaptureMobileConfig$VideoQuality4.getValue(), strOptString2)) {
                    seamlessDocaptureMobileConfig$VideoQuality = seamlessDocaptureMobileConfig$VideoQuality4;
                    break;
                }
            }
            if (seamlessDocaptureMobileConfig$VideoQuality == null) {
                seamlessDocaptureMobileConfig$VideoQuality = SeamlessDocaptureMobileConfig$VideoQuality.SD;
            }
            return new C33313g(iOptInt, iOptInt2, seamlessDocaptureMobileConfig$VideoQuality3, seamlessDocaptureMobileConfig$VideoQuality, jSONObject.optInt("maxRecordedFileSizeMB", 30));
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(C33310d.f67911m), "Failed to parse seamlessDocaptureMobileConfig FF", e11);
            return new C33313g();
        }
    }
}
