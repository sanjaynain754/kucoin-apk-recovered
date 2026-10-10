package com.sumsub.sns.internal.core.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import androidx.core.net.MailTo;
import com.google.android.material.C7090R;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.data.model.SNSSupportItem;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.q */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28485q {
    /* JADX INFO: renamed from: a */
    public static final void m69381a(TextView textView, Function1 function1) {
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(textView.getText());
        for (Object obj : spannableStringBuilderValueOf.getSpans(0, spannableStringBuilderValueOf.length(), URLSpan.class)) {
            URLSpan uRLSpan = (URLSpan) obj;
            spannableStringBuilderValueOf.setSpan(new C28482p(function1, uRLSpan), spannableStringBuilderValueOf.getSpanStart(uRLSpan), spannableStringBuilderValueOf.getSpanEnd(uRLSpan), 17);
            spannableStringBuilderValueOf.removeSpan(uRLSpan);
        }
        textView.setText(spannableStringBuilderValueOf);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m69382a(SNSSupportItem sNSSupportItem, Context context) {
        SNSEventHandler eventHandler = C28468k0.f57983a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(new SNSEvent.SupportItemClicked(sNSSupportItem.getType().name(), sNSSupportItem.getValue()));
        }
        if (sNSSupportItem.getOnClick() != null) {
            sNSSupportItem.getOnClick().invoke(sNSSupportItem);
            return true;
        }
        int i11 = AbstractC28479o.f58015a[sNSSupportItem.getType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return false;
            }
            return AbstractC28458h.m69345a(context, Uri.parse(MailTo.MAILTO_SCHEME + sNSSupportItem.getValue()));
        }
        String value = sNSSupportItem.getValue();
        if (!StringsKt.startsWith$default(value, "https://", false, 2, (Object) null) && !StringsKt.startsWith$default(value, "http://", false, 2, (Object) null)) {
            value = "http://" + value;
        }
        return AbstractC28458h.m69345a(context, Uri.parse(value));
    }

    /* JADX INFO: renamed from: a */
    public static final CharSequence m69380a(Spanned spanned, Context context, boolean z11) {
        if (!z11 || StringsKt.isBlank(spanned)) {
            return spanned;
        }
        return new SpannableStringBuilder(spanned).append(" *", new ForegroundColorSpan(AbstractC28458h.m69328a(context, C7090R.attr.colorOnError)), 33);
    }

    /* JADX INFO: renamed from: a */
    public static final int m69379a(TypedArray typedArray, int i11, int i12) {
        if (typedArray.hasValue(i11)) {
            if (typedArray.peekValue(i11).type == 2) {
                int resourceId = typedArray.getResourceId(i11, -1);
                if (resourceId != -1) {
                    return typedArray.getColor(resourceId, i12);
                }
            } else {
                return typedArray.getColor(i11, i12);
            }
        }
        return i12;
    }
}
