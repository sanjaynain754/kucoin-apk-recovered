package com.kubi.kumex.view;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FlagTextView.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, m90084d2 = {"Lcom/kubi/kumex/view/FlagTextView;", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "flagPaint", "Landroid/text/TextPaint;", "value", "", "flagText", "getFlagText", "()Ljava/lang/String;", "setFlagText", "(Ljava/lang/String;)V", "", "flagTextColor", "getFlagTextColor", "()I", "setFlagTextColor", "(I)V", "", "flagTextSize", "getFlagTextSize", "()F", "setFlagTextSize", "(F)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlagTextView extends BaseTextView {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TextPaint f30827b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f30828c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagTextView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f30827b = new TextPaint(getPaintFlags());
    }

    @Nullable
    /* JADX INFO: renamed from: getFlagText, reason: from getter */
    public final String getF30828c() {
        return this.f30828c;
    }

    public final int getFlagTextColor() {
        return this.f30827b.getColor();
    }

    public final float getFlagTextSize() {
        return this.f30827b.getTextSize();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (TextUtils.isEmpty(this.f30828c)) {
            return;
        }
        canvas.drawText(C27041f.m66668h(this.f30828c), getLayoutDirection() == 0 ? (getMeasuredWidth() - getPaddingEnd()) - this.f30827b.measureText(this.f30828c) : getPaddingEnd(), (getMeasuredHeight() / 2) - ((this.f30827b.descent() + this.f30827b.ascent()) / 2), this.f30827b);
    }

    public final void setFlagText(@Nullable String str) {
        this.f30828c = str;
        invalidate();
    }

    public final void setFlagTextColor(int i11) {
        this.f30827b.setColor(i11);
        invalidate();
    }

    public final void setFlagTextSize(float f11) {
        this.f30827b.setTextSize(f11);
        invalidate();
    }
}
