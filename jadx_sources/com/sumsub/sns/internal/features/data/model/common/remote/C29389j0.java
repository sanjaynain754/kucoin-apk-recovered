package com.sumsub.sns.internal.features.data.model.common.remote;

import org.jetbrains.annotations.NotNull;
import p852kotlin.text.StringsKt;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.j0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29389j0 {
    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX INFO: renamed from: a */
    public static String m69854a(String str, String str2) {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int length = str2.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str2.charAt(i11);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string2 = sb2.toString();
        if (str != null) {
            StringBuilder sb3 = new StringBuilder();
            int length2 = str.length();
            for (int i12 = 0; i12 < length2; i12++) {
                char cCharAt2 = str.charAt(i12);
                if (Character.isDigit(cCharAt2)) {
                    sb3.append(cCharAt2);
                }
            }
            string = sb3.toString();
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        return StringsKt.removePrefix(string2, (CharSequence) string);
    }

    @NotNull
    public final InterfaceC44951d<C29405l0> serializer() {
        return C29381i0.f59392a;
    }
}
