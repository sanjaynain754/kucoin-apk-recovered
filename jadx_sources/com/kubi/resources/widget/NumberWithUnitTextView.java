package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NumberWithUnitTextView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0016\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/resources/widget/NumberWithUnitTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "originalText", "", "unitText", "numberText", "numberTextSize", "", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "isEnable", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setText", "number", "unit", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NumberWithUnitTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: b */
    @NotNull
    public String f43952b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f43953c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String f43954d;

    /* JADX INFO: renamed from: e */
    public float f43955e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NumberWithUnitTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m54700b() {
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NumberWithUnitTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!m54700b()) {
            super.onDraw(canvas);
            return;
        }
        TextPaint paint = getPaint();
        String str = this.f43952b;
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(str, 0, str.length(), paint, getMeasuredWidth());
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        StaticLayout staticLayoutBuild = builderObtain.setAlignment(alignment).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        if (staticLayoutBuild.getLineCount() <= 1) {
            super.onDraw(canvas);
            return;
        }
        String str2 = this.f43954d;
        StaticLayout staticLayoutBuild2 = StaticLayout.Builder.obtain(str2, 0, str2.length(), paint, getMeasuredWidth()).setAlignment(alignment).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild2, "build(...)");
        if (staticLayoutBuild2.getLineCount() <= 1) {
            staticLayoutBuild2.draw(canvas);
            canvas.translate(0.0f, staticLayoutBuild2.getHeight());
            String str3 = this.f43953c;
            StaticLayout.Builder.obtain(str3, 0, str3.length(), paint, getMeasuredWidth()).setAlignment(alignment).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).build().draw(canvas);
            return;
        }
        paint.setTextSize(this.f43955e);
        staticLayoutBuild2.draw(canvas);
        canvas.translate(0.0f, staticLayoutBuild2.getHeight());
        paint.setTextSize(getTextSize());
        String str4 = this.f43953c;
        StaticLayout.Builder.obtain(str4, 0, str4.length(), paint, getMeasuredWidth()).setAlignment(alignment).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).build().draw(canvas);
    }

    public /* synthetic */ NumberWithUnitTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (m54700b()) {
            int size = View.MeasureSpec.getSize(widthMeasureSpec);
            TextPaint paint = getPaint();
            String str = this.f43952b;
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(str, 0, str.length(), paint, size);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayoutBuild = builderObtain.setAlignment(alignment).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).build();
            Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
            if (staticLayoutBuild.getLineCount() > 1) {
                String str2 = this.f43954d;
                StaticLayout staticLayoutBuild2 = StaticLayout.Builder.obtain(str2, 0, str2.length(), paint, size).setAlignment(alignment).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).build();
                Intrinsics.checkNotNullExpressionValue(staticLayoutBuild2, "build(...)");
                if (staticLayoutBuild2.getLineCount() > 1) {
                    float textSize = getTextSize() * 0.8f;
                    this.f43955e = textSize;
                    paint.setTextSize(textSize);
                    String str3 = this.f43954d;
                    StaticLayout staticLayoutBuild3 = StaticLayout.Builder.obtain(str3, 0, str3.length(), paint, size).setAlignment(alignment).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).build();
                    Intrinsics.checkNotNullExpressionValue(staticLayoutBuild3, "build(...)");
                    if (staticLayoutBuild3.getLineCount() == 1) {
                        int height = staticLayoutBuild3.getHeight();
                        String str4 = this.f43953c;
                        setMeasuredDimension(size, height + StaticLayout.Builder.obtain(str4, 0, str4.length(), paint, size).setAlignment(alignment).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).build().getHeight());
                        return;
                    }
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                    return;
                }
                int height2 = staticLayoutBuild2.getHeight();
                String str5 = this.f43953c;
                setMeasuredDimension(size, height2 + StaticLayout.Builder.obtain(str5, 0, str5.length(), paint, size).setAlignment(alignment).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(getIncludeFontPadding()).build().getHeight());
                return;
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NumberWithUnitTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43952b = "10000000000000000000 USDT";
        this.f43953c = "USDT";
        this.f43954d = "10000000000000000000";
        this.f43955e = getTextSize();
    }
}
