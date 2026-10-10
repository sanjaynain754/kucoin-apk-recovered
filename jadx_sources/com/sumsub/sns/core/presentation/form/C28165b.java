package com.sumsub.sns.core.presentation.form;

import android.os.Bundle;
import com.sumsub.sns.internal.features.presentation.videoident.presentation.LanguageSelectionViewModel;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28165b {
    /* JADX INFO: renamed from: a */
    public static C28169f m69096a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("client_tag", str);
        bundle.putString(LanguageSelectionViewModel.ARG_ID_DOC_SET_TYPE, str2);
        C28169f c28169f = new C28169f();
        c28169f.setArguments(bundle);
        return c28169f;
    }
}
