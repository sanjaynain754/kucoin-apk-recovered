package com.sumsub.sns.internal.core.presentation.common;

import android.os.Bundle;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28776i {

    /* JADX INFO: renamed from: a */
    public final String f58526a;

    /* JADX INFO: renamed from: b */
    public final boolean f58527b;

    /* JADX INFO: renamed from: a */
    public final boolean m69599a(AbstractC28787t abstractC28787t) {
        Bundle arguments = abstractC28787t.f58549a.getArguments();
        return arguments != null ? arguments.getBoolean(abstractC28787t.m69603a(this.f58526a), this.f58527b) : this.f58527b;
    }

    public C28776i(String str, boolean z11) {
        this.f58526a = str;
        this.f58527b = z11;
    }
}
