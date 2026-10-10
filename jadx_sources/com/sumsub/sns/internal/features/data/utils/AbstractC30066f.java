package com.sumsub.sns.internal.features.data.utils;

import androidx.browser.trusted.sharing.ShareTarget;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.json.JSONObject;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.utils.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC30066f {
    /* JADX INFO: renamed from: a */
    public static final MultipartBody.Part m70092a(InputStream inputStream) {
        return MultipartBody.Part.INSTANCE.createFormData("content", System.currentTimeMillis() + "_file.jpg", new C30065e(MediaType.INSTANCE.parse(ShareTarget.ENCODING_TYPE_MULTIPART), inputStream));
    }

    /* JADX INFO: renamed from: a */
    public static final RequestBody m70093a(String str, String str2, IdentitySide identitySide) {
        String value;
        if (str2 == null) {
            str2 = "FILE_ATTACHMENT";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("country", str);
        jSONObject.put("idDocType", str2);
        if (!Intrinsics.areEqual(str2, "PAYMENT_SOURCE") && identitySide != null && (value = identitySide.getValue()) != null) {
            jSONObject.put("idDocSubType", value);
        }
        return RequestBody.INSTANCE.create(jSONObject.toString(), MediaType.INSTANCE.parse(ShareTarget.ENCODING_TYPE_MULTIPART));
    }
}
