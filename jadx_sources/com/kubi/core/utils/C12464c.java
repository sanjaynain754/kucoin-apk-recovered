package com.kubi.core.utils;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.widget.TextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.core.utils.c */
/* JADX INFO: compiled from: TextViewExt.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0004¨\u0006\n"}, m90084d2 = {"setPartialStyledText", "", "Landroid/widget/TextView;", "formatResId", "", "value", "", "font", "Landroid/graphics/Typeface;", "color", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C12464c {

    /* JADX INFO: renamed from: com.kubi.core.utils.c$a */
    /* JADX INFO: compiled from: TextViewExt.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, m90084d2 = {"com/kubi/core/utils/TextViewExtKt$setPartialStyledText$1$1", "Landroid/text/style/MetricAffectingSpan;", "updateDrawState", "", "tp", "Landroid/text/TextPaint;", "updateMeasureState", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends MetricAffectingSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Typeface f21292b;

        public a(Typeface typeface) {
            this.f21292b = typeface;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint tp2) {
            Intrinsics.checkNotNullParameter(tp2, "tp");
            tp2.setTypeface(this.f21292b);
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint tp2) {
            Intrinsics.checkNotNullParameter(tp2, "tp");
            tp2.setTypeface(this.f21292b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m23404a(@NotNull TextView textView, int i11, @NotNull String value, @Nullable Typeface typeface, int i12) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        String string = textView.getContext().getString(i11, value);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) string, value, 0, false, 6, (Object) null);
        int length = value.length() + iIndexOf$default;
        SpannableString spannableString = new SpannableString(string);
        if (typeface != null) {
            spannableString.setSpan(new a(typeface), iIndexOf$default, length, 33);
        }
        spannableString.setSpan(new ForegroundColorSpan(i12), iIndexOf$default, length, 33);
        textView.setText(spannableString);
    }
}
