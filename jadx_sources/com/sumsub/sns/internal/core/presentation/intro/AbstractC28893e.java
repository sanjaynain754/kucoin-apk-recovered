package com.sumsub.sns.internal.core.presentation.intro;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.util.Arrays;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.intro.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28893e {
    /* JADX INFO: renamed from: a */
    public static final String m69672a(C29983l c29983l, C28895g c28895g, Label label) {
        String str = c28895g.f58752a;
        String str2 = c28895g.f58753b;
        String str3 = c28895g.f58754c;
        if (str3 == null) {
            str3 = "";
        }
        return c29983l.m70062a(m69673a(str, str2, label, str3), m69673a(c28895g.f58752a, c28895g.f58753b, label, ""), m69673a(RemoteConfigComponent.DEFAULTS_FILE_NAME, c28895g.f58753b, label, ""));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    /* JADX INFO: renamed from: a */
    public static final String m69673a(String str, String str2, Label label, String str3) {
        String str4;
        String str5 = String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{str, str2, "instructions", label.name()}, 4));
        if (str3.length() <= 0) {
            str3 = null;
        }
        if (str3 != null) {
            str4 = "::" + str3;
            if (str4 == null) {
                str4 = "";
            }
        } else {
            str4 = "";
        }
        return str5.concat(str4);
    }
}
