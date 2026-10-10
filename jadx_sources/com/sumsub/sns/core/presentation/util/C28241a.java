package com.sumsub.sns.core.presentation.util;

import android.os.Bundle;
import java.util.UUID;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.util.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28241a {

    /* JADX INFO: renamed from: a */
    public String f57537a;

    /* JADX INFO: renamed from: a */
    public final void m69188a(Bundle bundle) {
        this.f57537a = bundle != null ? bundle.getString("fragment_unique_id", "") : UUID.randomUUID().toString();
    }
}
