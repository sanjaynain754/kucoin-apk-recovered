package com.sumsub.sns.internal.features.domain.documents;

import com.sumsub.sns.internal.core.domain.C28547d;
import java.util.Map;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.documents.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30151v extends C30149t {
    @Override // com.sumsub.sns.internal.features.domain.documents.C30149t
    /* JADX INFO: renamed from: a */
    public final String mo70117a(String str, Map map) {
        String str2 = str + "_noSelector";
        if ((map != null ? (String) map.get(str2) : null) != null) {
            return str2;
        }
        if ((map != null ? (String) map.get(str) : null) != null) {
            return str;
        }
        return (map != null ? (String) map.get("default_noSelector") : null) != null ? "default_noSelector" : "default";
    }

    public C30151v(C28547d c28547d) {
        super(c28547d);
    }
}
