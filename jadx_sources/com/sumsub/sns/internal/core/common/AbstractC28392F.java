package com.sumsub.sns.internal.core.common;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28392F {
    /* JADX INFO: renamed from: a */
    public static final void m69277a(Fragment fragment, String str) {
        String str2;
        if (StringsKt.startsWith$default(str, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(str, "https://", false, 2, (Object) null)) {
            str2 = str;
        } else {
            str2 = "https://" + str;
        }
        try {
            fragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            C33272c.f67814c.mo68956e(AbstractC28458h.m69333a(fragment), "Can't open url " + str, e11);
        }
    }
}
