package com.sumsub.sns.internal.p126ml.badphotos;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.badphotos.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33317d {
    /* JADX INFO: renamed from: a */
    public static C33318e m71641a() {
        String str = C33048a.f67484q.m71435b().f67504b;
        if (str == null) {
            return new C33318e();
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("android");
            JSONArray jSONArray = jSONObject.getJSONArray("allowed_steps");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                arrayList.add(jSONArray.getString(i11));
            }
            C33318e c33318e = new C33318e(jSONObject.getString("model"), Float.parseFloat(jSONObject.getString("high_quality_threshold")), Float.parseFloat(jSONObject.getString("low_quality_threshold")), jSONObject.getLong("execution_timeout_ms"), jSONObject.getBoolean("allow_cache"), arrayList, jSONObject.getInt("max_blocked_attempts"));
            Logger.DefaultImpls.d$default(C33272c.f67812a, "BadPhotosDetectorFeature", "Parsed FF: " + c33318e, null, 4, null);
            return c33318e;
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a("BadPhotosDetectorFeature", "Failed to parse badPhotoDetectorConfig FF", th2);
            return new C33318e();
        }
    }
}
