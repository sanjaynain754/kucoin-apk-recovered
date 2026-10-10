package com.kubi.widget.web.ui;

import androidx.credentials.provider.CredentialEntry;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: com.kubi.widget.web.ui.f0 */
/* JADX INFO: compiled from: KWebUIConfig.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0002\u0010\u0003\u001a\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, m90084d2 = {"toStrictBooleanOrNull", "", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "extractRawUrlParameter", "url", "key", "LWebWidget_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebUIConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebUIConfig.kt\ncom/kubi/widget/web/ui/KWebUIConfigKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
public final class C27241f0 {
    /* JADX INFO: renamed from: c */
    public static final String m67553c(String str, String str2) {
        int iIndexOf$default;
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, '?', 0, false, 6, (Object) null);
        if (iIndexOf$default2 < 0) {
            return null;
        }
        String str3 = str2 + '=';
        int length = iIndexOf$default2 + 1;
        while (true) {
            if (length >= str.length() || (iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, str3, length, false, 4, (Object) null)) < 0) {
                iIndexOf$default = -1;
                break;
            }
            Character chValueOf = iIndexOf$default > 0 ? Character.valueOf(str.charAt(iIndexOf$default - 1)) : null;
            if ((chValueOf != null && chValueOf.charValue() == '?') || ((chValueOf != null && chValueOf.charValue() == '&') || (chValueOf != null && chValueOf.charValue() == '#'))) {
                break;
            }
            length = iIndexOf$default + str3.length();
        }
        if (iIndexOf$default < 0) {
            return null;
        }
        int length2 = iIndexOf$default + str3.length();
        Integer numValueOf = Integer.valueOf(StringsKt.indexOf$default((CharSequence) str, Typography.amp, length2, false, 4, (Object) null));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : str.length();
        Integer numValueOf2 = Integer.valueOf(StringsKt.indexOf$default((CharSequence) str, '#', length2, false, 4, (Object) null));
        if (numValueOf2.intValue() < 0) {
            numValueOf2 = null;
        }
        String strSubstring = str.substring(length2, Math.min(iIntValue, numValueOf2 != null ? numValueOf2.intValue() : str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        if (strSubstring.length() > 0) {
            return strSubstring;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final Boolean m67554d(String str) {
        String string;
        if (str != null && (string = StringsKt.trim((CharSequence) str).toString()) != null) {
            if (StringsKt.equals(string, CredentialEntry.TRUE_STRING, true)) {
                return Boolean.TRUE;
            }
            if (StringsKt.equals(string, CredentialEntry.FALSE_STRING, true)) {
                return Boolean.FALSE;
            }
        }
        return null;
    }
}
