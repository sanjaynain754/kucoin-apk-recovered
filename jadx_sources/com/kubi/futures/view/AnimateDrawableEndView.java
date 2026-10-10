package com.kubi.futures.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.blankj.utilcode.util.C5303w0;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.resources.widget.FixAutoSizeTextView;
import com.kubi.tradebase.R$color;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnimateDrawableEndView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\nJ!\u0010\u001f\u001a\u00020\u001d2\b\b\u0001\u0010 \u001a\u00020!2\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010#J\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010%\u001a\u00020\u001dJ\u000e\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\nJ\b\u0010(\u001a\u00020\u001dH\u0014J(\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020!H\u0014J0\u0010.\u001a\u00020\u001d2\b\u0010/\u001a\u0004\u0018\u00010\u00122\b\u00100\u001a\u0004\u0018\u00010\u00122\b\u00101\u001a\u0004\u0018\u00010\u00122\b\u00102\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u00103\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u0012H\u0002J\u0010\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020;H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, m90084d2 = {"Lcom/kubi/futures/view/AnimateDrawableEndView;", "Lcom/kubi/resources/widget/FixAutoSizeTextView;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "rotateTop", "", "rotateDrawable", "Landroid/graphics/drawable/RotateDrawable;", "getRotateDrawable", "()Landroid/graphics/drawable/RotateDrawable;", "rotateDrawable$delegate", "Lkotlin/Lazy;", "drawable", "Landroid/graphics/drawable/Drawable;", "animator", "Landroid/animation/ObjectAnimator;", "alignTop", "isProhibitAnim", "isUsedInNewStyleNumInputView", "()Z", "setUsedInNewStyleNumInputView", "(Z)V", "redPointVisible", "setRedPointVisible", "", ViewProps.VISIBLE, "setDrawableEndAndTint", "drawableId", "", "color", "(ILjava/lang/Integer;)V", "setAlignTop", "rotate", "prohibitAnim", "isProhibit", "onDetachedFromWindow", "onSizeChanged", "w", CmcdData.Factory.STREAMING_FORMAT_HLS, "oldw", "oldh", "setCompoundDrawablesRelative", "start", ViewProps.TOP, "end", ViewProps.BOTTOM, "resetDrawables", "drawables", "dotPaint", "Landroid/graphics/Paint;", "dotRadius", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AnimateDrawableEndView extends FixAutoSizeTextView {

    /* JADX INFO: renamed from: g */
    public boolean f24976g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Lazy f24977h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Drawable f24978i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public ObjectAnimator f24979j;

    /* JADX INFO: renamed from: k */
    public boolean f24980k;

    /* JADX INFO: renamed from: l */
    public boolean f24981l;

    /* JADX INFO: renamed from: m */
    public boolean f24982m;

    /* JADX INFO: renamed from: n */
    public boolean f24983n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public final Paint f24984o;

    /* JADX INFO: renamed from: p */
    public final float f24985p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateDrawableEndView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24977h = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.view.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnimateDrawableEndView.m28816k();
            }
        });
        this.f24980k = true;
        Paint paint = new Paint(1);
        paint.setColor(getResources().getColor(R$color.secondary));
        paint.setStyle(Paint.Style.FILL);
        this.f24984o = paint;
        this.f24985p = C27025c.m66564b(context, 2.5f);
    }

    private final RotateDrawable getRotateDrawable() {
        return (RotateDrawable) this.f24977h.getValue();
    }

    /* JADX INFO: renamed from: k */
    public static final RotateDrawable m28816k() {
        RotateDrawable rotateDrawable = new RotateDrawable();
        rotateDrawable.setFromDegrees(0.0f);
        rotateDrawable.setToDegrees(360.0f);
        rotateDrawable.setPivotX(0.5f);
        rotateDrawable.setPivotY(0.5f);
        return rotateDrawable;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getF24982m() {
        return this.f24982m;
    }

    /* JADX INFO: renamed from: h */
    public final void m28818h(boolean z11) {
        this.f24981l = z11;
    }

    /* JADX INFO: renamed from: j */
    public final void m28819j() {
        ObjectAnimator objectAnimator;
        if (this.f24981l) {
            return;
        }
        if (this.f24978i == null) {
            Drawable drawable = getCompoundDrawablesRelative()[2];
            if (drawable == null) {
                return;
            }
            if (getRotateDrawable().getDrawable() == null) {
                getRotateDrawable().setDrawable(drawable);
                getRotateDrawable().mutate();
                setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, getRotateDrawable(), (Drawable) null);
            }
        }
        ObjectAnimator objectAnimator2 = this.f24979j;
        if (C27025c.m66566d(objectAnimator2 != null ? Boolean.valueOf(objectAnimator2.isRunning()) : null) && (objectAnimator = this.f24979j) != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator duration = !this.f24976g ? ObjectAnimator.ofInt(getRotateDrawable(), FirebaseAnalytics.Param.LEVEL, 0, 5000).setDuration(300L) : ObjectAnimator.ofInt(getRotateDrawable(), FirebaseAnalytics.Param.LEVEL, 5000, 10000).setDuration(300L);
        this.f24979j = duration;
        if (duration != null) {
            duration.start();
        }
        this.f24976g = !this.f24976g;
    }

    /* JADX INFO: renamed from: l */
    public final void m28820l(@DrawableRes int i11, @ColorRes @Nullable Integer num) {
        Drawable drawableM66514c = C27017c.f54310a.m66514c(i11, num);
        this.f24978i = drawableM66514c;
        if (drawableM66514c != null) {
            getRotateDrawable().setDrawable(drawableM66514c);
            getRotateDrawable().mutate();
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, getRotateDrawable(), (Drawable) null);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        ObjectAnimator objectAnimator = this.f24979j;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Layout layout;
        CharSequence text;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (!this.f24983n || (layout = getLayout()) == null || (text = getText()) == null || text.length() == 0) {
            return;
        }
        int lineBaseline = layout.getLineBaseline(0);
        float width = C5303w0.m6511a() ? ((getWidth() - getPaint().measureText(C27041f.m66668h(getText().toString()))) - this.f24985p) - getPaddingLeft() : this.f24985p + getPaddingLeft() + layout.getLineRight(0);
        float paddingTop = getPaddingTop() + lineBaseline;
        float f11 = this.f24985p;
        float f12 = paddingTop + f11;
        if (width - f11 < 0.0f || f11 + width > getWidth()) {
            return;
        }
        canvas.drawCircle(width, f12, this.f24985p, this.f24984o);
    }

    public final void setAlignTop(boolean alignTop) {
        this.f24980k = alignTop;
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable start, @Nullable Drawable top, @Nullable Drawable end, @Nullable Drawable bottom) {
        if (end != null && this.f24980k) {
            m28815i(end);
        }
        super.setCompoundDrawablesRelative(start, top, end, bottom);
    }

    public final void setRedPointVisible(boolean visible) {
        this.f24983n = visible;
        invalidate();
    }

    public final void setUsedInNewStyleNumInputView(boolean z11) {
        this.f24982m = z11;
    }

    /* JADX INFO: renamed from: i */
    private final void m28815i(Drawable drawable) {
        int i11;
        if (getLineCount() > 1) {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int lineHeight = (int) (getLineHeight() / getLineSpacingMultiplier());
            if (intrinsicHeight < lineHeight) {
                i11 = (intrinsicHeight - lineHeight) / 2;
            } else {
                i11 = 0;
            }
            int measuredHeight = ((((intrinsicHeight - getMeasuredHeight()) + getPaddingTop()) + getPaddingBottom()) / 2) - i11;
            drawable.setBounds(0, measuredHeight, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() + measuredHeight);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
        setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimateDrawableEndView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
