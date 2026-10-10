package com.sumsub.sns.internal.features.data.repository.dynamic;

import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.p125ff.core.C33050a;
import org.json.JSONObject;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.dynamic.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29972a {
    /* JADX INFO: renamed from: a */
    public final C29973b m70053a() {
        String str;
        C33050a c33050a = C33048a.f67471d0;
        if (!c33050a.m71434a()) {
            c33050a = null;
        }
        if (c33050a == null || (str = c33050a.m71435b().f67504b) == null) {
            return new C29973b();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C29973b(jSONObject.optLong("periodSec", 120L), jSONObject.optBoolean("armedRefresh", false), jSONObject.optBoolean("waitForConnection", true), RangesKt.coerceAtLeast(jSONObject.optLong("waitTimeoutMs", 3000L), 0L), RangesKt.coerceAtLeast(jSONObject.optLong("stopTimeoutMs", 5000L), 0L));
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(this), "Failed to parse androidApplicantPollingConfig FF", th2);
            return new C29973b();
        }
    }
}
