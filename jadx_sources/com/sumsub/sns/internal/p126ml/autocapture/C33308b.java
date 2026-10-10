package com.sumsub.sns.internal.p126ml.autocapture;

import android.util.Size;
import androidx.media3.exoplayer.RendererCapabilities;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.tencent.bugly.proguard.C33556b3;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.autocapture.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33308b {
    /* JADX INFO: renamed from: a */
    public static C33310d m71632a() {
        String str = C33048a.f67489v.m71435b().f67504b;
        if (str == null) {
            return new C33310d();
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("android");
            JSONObject jSONObject2 = jSONObject.getJSONObject("autoCaptureModel");
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("inputSize");
            C33307a c33307a = new C33307a(jSONObject2.getString("name"), (float) jSONObject2.getDouble("threshold"), jSONObject2.getBoolean("allowCache"), jSONObjectOptJSONObject != null ? new Size(jSONObjectOptJSONObject.optInt("width", RendererCapabilities.DECODER_SUPPORT_MASK), jSONObjectOptJSONObject.optInt("height", C33556b3.f69051i)) : new Size(RendererCapabilities.DECODER_SUPPORT_MASK, C33556b3.f69051i), jSONObject2.getInt("outputSize"));
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("frameSize");
            Size size = jSONObjectOptJSONObject2 != null ? new Size(jSONObjectOptJSONObject2.getInt("height"), jSONObjectOptJSONObject2.getInt("width")) : null;
            double d11 = jSONObject.getDouble("requiredFrameFillRatio");
            double d12 = jSONObject.getDouble("requiredLargestSizeOffsetRatio");
            return new C33310d(jSONObject.optBoolean("enabled", true), jSONObject.optBoolean("showBounds", false), jSONObject.optLong("waitForBetterPhotoMs", 1500L), 4000L, (float) d11, (float) jSONObject.optDouble("requiredFrameFillRatioV2", d11), (float) d12, (float) jSONObject.optDouble("requiredLargestSizeOffsetRatioV2", d12), (float) jSONObject.getDouble("frameAspectRatio"), c33307a, size, jSONObject.optBoolean("imageCaptureUseCaseEnabled", false));
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(C33310d.f67911m), "Failed to parse documentAutocaptureConfig FF", th2);
            return new C33310d();
        }
    }
}
