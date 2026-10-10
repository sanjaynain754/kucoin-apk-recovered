package com.sumsub.sns.internal.p126ml.badphotos;

import android.content.Context;
import android.os.Build;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p126ml.core.InterfaceC33336o;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.badphotos.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33315b {
    /* JADX INFO: renamed from: a */
    public static InterfaceC33336o m71634a(Context context, OkHttpClient okHttpClient, String str, C29070X c29070x) {
        try {
            C33318e c33318eM71641a = AbstractC33317d.m71641a();
            if (c33318eM71641a.f67941f.contains(c29070x.f59014a) && Build.VERSION.SDK_INT >= 26) {
                return new C33316c(context, okHttpClient, str + "resources/embeddedModels/" + c33318eM71641a.f67936a, c33318eM71641a.f67939d, c33318eM71641a.f67936a, c33318eM71641a.f67940e);
            }
            return C33316c.f67931k;
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a("MlSolution.BadPhotosDetector", "Can't create instance. Using dummy detector.", th2);
            return C33316c.f67931k;
        }
    }
}
