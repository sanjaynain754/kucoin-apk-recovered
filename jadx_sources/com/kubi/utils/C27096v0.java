package com.kubi.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.UnderlineSpan;

/* JADX INFO: renamed from: com.kubi.utils.v0 */
/* JADX INFO: compiled from: StyledText.java */
/* JADX INFO: loaded from: classes23.dex */
public class C27096v0 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: com.kubi.utils.v0$a */
    /* JADX INFO: compiled from: StyledText.java */
    /* JADX INFO: loaded from: classes54.dex */
    public class a extends ImageSpan {
        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f11, int i13, int i14, int i15, Paint paint) {
            Drawable drawable = getDrawable();
            canvas.save();
            canvas.translate(f11, (i14 - Math.abs(paint.getFontMetricsInt().ascent / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
            drawable.draw(canvas);
            canvas.restore();
        }

        public a(Drawable drawable) {
            super(drawable);
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
            Rect bounds = getDrawable().getBounds();
            if (fontMetricsInt != null) {
                Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                int i13 = fontMetricsInt2.descent;
                int i14 = fontMetricsInt2.ascent;
                int i15 = i14 + ((i13 - i14) / 2);
                int i16 = (bounds.bottom - bounds.top) / 2;
                int i17 = i15 - i16;
                fontMetricsInt.ascent = i17;
                fontMetricsInt.top = i17;
                int i18 = i15 + i16;
                fontMetricsInt.bottom = i18;
                fontMetricsInt.descent = i18;
            }
            return bounds.right;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C27096v0 append(CharSequence charSequence) {
        if (charSequence != null) {
            super.append(charSequence);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C27096v0 m66904d(CharSequence charSequence, int i11) {
        return m66903c(charSequence, new AbsoluteSizeSpan(i11, true));
    }

    /* JADX INFO: renamed from: e */
    public C27096v0 m66905e(CharSequence charSequence, int i11) {
        return m66903c(charSequence, new ForegroundColorSpan(i11));
    }

    /* JADX INFO: renamed from: f */
    public C27096v0 m66906f(Drawable drawable) {
        return m66903c("x", new a(drawable));
    }

    /* JADX INFO: renamed from: g */
    public C27096v0 m66907g(CharSequence charSequence, int i11) {
        return m66903c(charSequence, new AbsoluteSizeSpan(i11));
    }

    /* JADX INFO: renamed from: h */
    public C27096v0 m66908h(CharSequence charSequence) {
        return m66903c(charSequence, new UnderlineSpan());
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C27096v0 append(char c11) {
        super.append(c11);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C27096v0 m66903c(CharSequence charSequence, Object... objArr) {
        if (!TextUtils.isEmpty(charSequence)) {
            append(charSequence);
            if (objArr != null) {
                for (Object obj : objArr) {
                    setSpan(obj, length() - charSequence.length(), length(), 33);
                }
            }
        }
        return this;
    }
}
