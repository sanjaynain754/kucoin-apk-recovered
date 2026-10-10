package p852kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Iterator;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: capitalizeDecapitalize.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\ncapitalizeDecapitalize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n1#2:148\n295#3,2:149\n295#3,2:151\n774#3:153\n865#3,2:154\n1878#3,3:156\n*S KotlinDebug\n*F\n+ 1 capitalizeDecapitalize.kt\norg/jetbrains/kotlin/util/capitalizeDecapitalize/CapitalizeDecapitalizeKt\n*L\n34#1:149,2\n57#1:151,2\n72#1:153\n72#1:154,2\n78#1:156,3\n*E\n"})
public final class CapitalizeDecapitalizeKt {
    @NotNull
    public static final String capitalizeAsciiOnly(@NotNull String str) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(Character.toUpperCase(cCharAt));
        sb2.append((CharSequence) str, 1, str.length());
        return sb2.toString();
    }

    @NotNull
    public static final String decapitalizeAsciiOnly(@NotNull String str) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || 'A' > (cCharAt = str.charAt(0)) || cCharAt >= '[') {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return lowerCase + strSubstring;
    }

    @NotNull
    public static final String decapitalizeSmartForCompiler(@NotNull String str, boolean z11) {
        Integer next;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0 || !isUpperCaseCharAt(str, 0, z11)) {
            return str;
        }
        if (str.length() == 1 || !isUpperCaseCharAt(str, 1, z11)) {
            if (z11) {
                return decapitalizeAsciiOnly(str);
            }
            if (str.length() <= 0) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return lowerCase + strSubstring;
        }
        Iterator<Integer> it = StringsKt.getIndices(str).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (isUpperCaseCharAt(str, next.intValue(), z11));
        Integer num = next;
        if (num == null) {
            return toLowerCase(str, z11);
        }
        int iIntValue = num.intValue() - 1;
        StringBuilder sb2 = new StringBuilder();
        String strSubstring2 = str.substring(0, iIntValue);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb2.append(toLowerCase(strSubstring2, z11));
        String strSubstring3 = str.substring(iIntValue);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
        sb2.append(strSubstring3);
        return sb2.toString();
    }

    private static final String toLowerCase(String str, boolean z11) {
        if (z11) {
            return toLowerCaseAsciiOnly(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @NotNull
    public static final String toLowerCaseAsciiOnly(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final boolean isUpperCaseCharAt(String str, int i11, boolean z11) {
        char cCharAt = str.charAt(i11);
        if (z11) {
            if ('A' > cCharAt || cCharAt >= '[') {
                return false;
            }
            return true;
        }
        return Character.isUpperCase(cCharAt);
    }
}
