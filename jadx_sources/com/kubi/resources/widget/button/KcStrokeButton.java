package com.kubi.resources.widget.button;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.resources.widget.CircleLoadingDrawable;
import com.kubi.sdk.res.R$color;
import com.kubi.utils.C27096v0;
import com.tencent.bugly.proguard.C33627eb;
import kw.C41999c;
import kw.C42000d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KcStrokeButton.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J!\u0010\u001d\u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u00072\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0019H\u0007J\u0006\u0010\"\u001a\u00020\u0019J\u0006\u0010#\u001a\u00020\u0015J\b\u0010$\u001a\u00020\u0019H\u0014J\u001c\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\u00132\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J(\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007H\u0014J0\u0010.\u001a\u00020\u00192\b\u0010/\u001a\u0004\u0018\u00010\u000e2\b\u00100\u001a\u0004\u0018\u00010\u000e2\b\u00101\u001a\u0004\u0018\u00010\u000e2\b\u00102\u001a\u0004\u0018\u00010\u000eH\u0016J$\u00103\u001a\u00020\u0013\"\u0004\b\u0000\u001042\u0006\u0010&\u001a\u00020\u00132\f\u00105\u001a\b\u0012\u0004\u0012\u0002H406H\u0002R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00067"}, m90084d2 = {"Lcom/kubi/resources/widget/button/KcStrokeButton;", "Lcom/kubi/resources/widget/button/BaseAnimatedButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "mCacheDrawables", "", "Landroid/graphics/drawable/Drawable;", "[Landroid/graphics/drawable/Drawable;", "loadingDrawable", "Lcom/kubi/resources/widget/CircleLoadingDrawable;", "srcText", "", "isUnderLoading", "", "radius", "", "initView", "", "createBackgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "color", "setBackgroundColorRes", "colorRes", "colorPressRes", "(ILjava/lang/Integer;)V", "showLoading", "hideLoading", "isLoading", "onDetachedFromWindow", "setText", "text", "type", "Landroid/widget/TextView$BufferType;", "onSizeChanged", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "setCompoundDrawablesRelativeWithIntrinsicBounds", "start", ViewProps.TOP, "end", ViewProps.BOTTOM, "removeSpansAndText", ExifInterface.GPS_DIRECTION_TRUE, "spanClass", "Ljava/lang/Class;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KcStrokeButton extends BaseAnimatedButton {

    /* JADX INFO: renamed from: h */
    @NotNull
    public Drawable[] f44413h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public CircleLoadingDrawable f44414i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public CharSequence f44415j;

    /* JADX INFO: renamed from: k */
    public boolean f44416k;

    /* JADX INFO: renamed from: l */
    public final float f44417l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KcStrokeButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44413h = new Drawable[4];
        this.f44417l = C5275i0.m6236a(28.0f);
        initView();
    }

    private final void initView() {
        setGravity(17);
        setSingleLine(true);
        setEllipsize(TextUtils.TruncateAt.END);
        Drawable background = getBackground();
        StateListDrawable stateListDrawable = null;
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            setOriginalBackgroundColor(colorDrawable.getColor());
            stateListDrawable = new StateListDrawable();
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(colorDrawable.getColor());
            int iM6236a = C5275i0.m6236a(1.0f);
            Context context = getContext();
            int i11 = R$color.emphasis;
            gradientDrawable.setStroke(iM6236a, ContextCompat.getColor(context, i11));
            gradientDrawable.setCornerRadius(this.f44417l);
            Unit unit = Unit.INSTANCE;
            stateListDrawable.addState(new int[]{-16842919}, gradientDrawable);
            int[] iArr = {R.attr.state_pressed};
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            int color = ContextCompat.getColor(getContext(), R$color.c_background);
            Context context2 = getContext();
            int i12 = R$color.color_000_fff;
            gradientDrawable2.setColor(ColorUtils.blendARGB(color, ContextCompat.getColor(context2, i12), 0.08f));
            gradientDrawable2.setStroke(C5275i0.m6236a(1.0f), ColorUtils.blendARGB(ContextCompat.getColor(getContext(), i11), ContextCompat.getColor(getContext(), i12), 0.08f));
            gradientDrawable2.setCornerRadius(this.f44417l);
            stateListDrawable.addState(iArr, gradientDrawable2);
        }
        setBackgroundDrawable(stateListDrawable);
    }

    @Override // com.kubi.resources.widget.button.BaseAnimatedButton
    @NotNull
    /* JADX INFO: renamed from: d */
    public GradientDrawable mo55036d(int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i11);
        gradientDrawable.setStroke(C5275i0.m6236a(1.0f), ContextCompat.getColor(getContext(), R$color.emphasis));
        gradientDrawable.setCornerRadius(this.f44417l);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: k */
    public final void m55047k() {
        if (this.f44416k) {
            Drawable[] drawableArr = this.f44413h;
            super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawableArr[1], (Drawable) null, drawableArr[3]);
            CircleLoadingDrawable circleLoadingDrawable = this.f44414i;
            if (circleLoadingDrawable != null) {
                circleLoadingDrawable.m55417b();
            }
            this.f44416k = false;
            setText(this.f44415j);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable start, @Nullable Drawable top, @Nullable Drawable end, @Nullable Drawable bottom) {
        Drawable[] drawableArr = this.f44413h;
        drawableArr[0] = start;
        drawableArr[1] = top;
        drawableArr[2] = end;
        drawableArr[3] = bottom;
        super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, top, (Drawable) null, bottom);
        setText(getText());
    }

    @Override // com.kubi.resources.widget.BaseTextView, android.widget.TextView
    public void setText(@Nullable CharSequence text, @Nullable TextView.BufferType type) {
        Drawable[] drawableArr = this.f44413h;
        if (drawableArr == null) {
            drawableArr = new Drawable[]{null, null, null, null};
        }
        this.f44413h = drawableArr;
        C27096v0 c27096v0 = new C27096v0();
        Drawable[] drawableArr2 = this.f44413h;
        Drawable drawable = drawableArr2[0];
        Drawable drawable2 = drawableArr2[2];
        if (drawable != null && !this.f44416k) {
            c27096v0.m66903c(CmcdData.Factory.STREAMING_FORMAT_SS, new C41999c(drawable));
            c27096v0.m66903c(C33627eb.f69716f, new C42000d(getCompoundDrawablePadding()));
        }
        c27096v0.append(text);
        if (drawable2 != null && !this.f44416k) {
            c27096v0.m66903c(C33627eb.f69716f, new C42000d(getCompoundDrawablePadding()));
            c27096v0.m66903c("e", new C41999c(drawable2));
        }
        super.setText(c27096v0, type);
    }

    @Override // com.kubi.resources.widget.button.BaseAnimatedButton, androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m55047k();
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        setCompoundDrawablesRelativeWithIntrinsicBounds(getCompoundDrawablesRelative()[0], getCompoundDrawablesRelative()[1], getCompoundDrawablesRelative()[2], getCompoundDrawablesRelative()[3]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KcStrokeButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KcStrokeButton(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
