package com.sumsub.sns.internal.features.data.model.common.remote;

import com.tencent.bugly.proguard.C33978va;
import java.util.List;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.U */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC29286U {
    /* JADX INFO: renamed from: a */
    public static final C29281T m69837a(String str) {
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{C33978va.f72339h}, false, 0, 6, (Object) null);
        if (listSplit$default.size() == 2) {
            return new C29281T((String) listSplit$default.get(0), (String) listSplit$default.get(1));
        }
        return null;
    }
}
