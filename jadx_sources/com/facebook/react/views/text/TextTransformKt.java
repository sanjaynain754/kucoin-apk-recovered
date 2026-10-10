package com.facebook.react.views.text;

import java.text.BreakIterator;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TextTransform.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, m90084d2 = {"applyTextTransform", "", ReactBaseTextShadowNode.PROP_TEXT_TRANSFORM, "Lcom/facebook/react/views/text/TextTransform;", "ReactAndroid_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTextTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextTransform.kt\ncom/facebook/react/views/text/TextTransformKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
public final class TextTransformKt {

    /* JADX INFO: compiled from: TextTransform.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextTransform.values().length];
            try {
                iArr[TextTransform.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextTransform.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextTransform.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String applyTextTransform(@NotNull String str, @Nullable TextTransform textTransform) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i11 = textTransform == null ? -1 : WhenMappings.$EnumSwitchMapping$0[textTransform.ordinal()];
        if (i11 == 1) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        if (i11 == 2) {
            Locale locale2 = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        if (i11 != 3) {
            return str;
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb2 = new StringBuilder(str.length());
        int iFirst = wordInstance.first();
        int next = wordInstance.next();
        while (true) {
            int i12 = next;
            int i13 = iFirst;
            iFirst = i12;
            if (iFirst == -1) {
                String string = sb2.toString();
                Intrinsics.checkNotNull(string);
                return string;
            }
            String strSubstring = str.substring(i13, iFirst);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring.length() > 0) {
                char upperCase2 = Character.toUpperCase(strSubstring.charAt(0));
                String strSubstring2 = strSubstring.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                strSubstring = upperCase2 + strSubstring2;
            }
            sb2.append(strSubstring);
            next = wordInstance.next();
        }
    }
}
