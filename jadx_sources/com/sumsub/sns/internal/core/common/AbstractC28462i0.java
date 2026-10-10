package com.sumsub.sns.internal.core.common;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import cf0.AbstractC4950e;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import gf0.C37907e;
import java.util.ArrayList;
import java.util.List;
import nf0.C42829a;
import of0.C43042d;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.i0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28462i0 {

    /* JADX INFO: renamed from: a */
    public static AbstractC4950e f57979a;

    /* JADX INFO: renamed from: a */
    public static final Spanned m69364a(CharSequence charSequence, Context context) {
        try {
            return m69365a(context).mo5175b(charSequence.toString());
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(charSequence), "Error parsing markdown.", e11);
            return new SpannableString(charSequence);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final SpannableStringBuilder m69363a(Spanned spanned) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
        String string = spannableStringBuilder.toString();
        int length = string.length() - 1;
        for (int i11 = 0; i11 < length; i11++) {
            if (string.charAt(i11) == '\n') {
                int i12 = i11 + 1;
                if (string.charAt(i12) == '\n') {
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan(4, true), i12, i11 + 2, 33);
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: a */
    public static final String m69366a(String str) {
        List<String> listLines = StringsKt.lines(str);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listLines, 10));
        int i11 = 0;
        for (Object obj : listLines) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            if (i11 != 0 && !StringsKt.isBlank(str2)) {
                str2 = "  " + str2;
            }
            arrayList.add(str2);
            i11 = i12;
        }
        return CollectionsKt.joinToString$default(arrayList, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC4950e m69365a(Context context) {
        AbstractC4950e abstractC4950e = f57979a;
        if (abstractC4950e != null) {
            return abstractC4950e;
        }
        AbstractC4950e abstractC4950eBuild = AbstractC4950e.m5174a(context.getApplicationContext().getApplicationContext()).mo5176a(C37907e.m85691b()).mo5176a(C42829a.m93920c(3)).mo5176a(C43042d.m94527b()).mo5176a(new C28459h0()).build();
        f57979a = abstractC4950eBuild;
        return abstractC4950eBuild;
    }
}
