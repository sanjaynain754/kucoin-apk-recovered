package com.sumsub.sns.core.presentation.base.text.span;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.text.span.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28151a extends ClickableSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
