package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import com.kubi.sdk.res.R$drawable;
import com.kubi.sdk.res.R$font;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: MultiLinesHintEditText.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b*\u0001\u001b\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0014J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\nH\u0002J\u0018\u0010(\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010)\u001a\u00020\nH\u0002J\u0018\u0010*\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u000fH\u0002J\b\u0010,\u001a\u00020\u001eH\u0014J\b\u0010-\u001a\u00020\u001eH\u0014J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u000fH\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001c¨\u00060"}, m90084d2 = {"Lcom/kubi/resources/widget/MultiLinesHintEditText;", "Lcom/kubi/resources/widget/FilterEmojiEditText;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mHintPaint", "Landroid/text/TextPaint;", "mMinTextSize", "", "mMaxTextSize", "mMaxLines", "cursDrawable", "Landroid/graphics/drawable/Drawable;", "isCursorShow", "", "cursorBlinkInterval", "", "mHintFont", "Landroid/graphics/Typeface;", "cursorBlinkRunnable", "com/kubi/resources/widget/MultiLinesHintEditText$cursorBlinkRunnable$1", "Lcom/kubi/resources/widget/MultiLinesHintEditText$cursorBlinkRunnable$1;", "init", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "createStaticLayout", "Landroid/text/StaticLayout;", "text", "", "textPaint", "width", "drawCursor", Snapshot.TARGET_HEIGHT, "sp2px", "spValue", "onAttachedToWindow", "onDetachedFromWindow", "setTextSize", "size", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class MultiLinesHintEditText extends FilterEmojiEditText {

    /* JADX INFO: renamed from: d */
    public TextPaint f43937d;

    /* JADX INFO: renamed from: e */
    public float f43938e;

    /* JADX INFO: renamed from: f */
    public float f43939f;

    /* JADX INFO: renamed from: g */
    public final int f43940g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public Drawable f43941h;

    /* JADX INFO: renamed from: i */
    public boolean f43942i;

    /* JADX INFO: renamed from: j */
    public final long f43943j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final Typeface f43944k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final RunnableC22933a f43945l;

    /* JADX INFO: renamed from: com.kubi.resources.widget.MultiLinesHintEditText$a */
    /* JADX INFO: compiled from: MultiLinesHintEditText.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/resources/widget/MultiLinesHintEditText$cursorBlinkRunnable$1", "Ljava/lang/Runnable;", "run", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class RunnableC22933a implements Runnable {
        public RunnableC22933a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MultiLinesHintEditText multiLinesHintEditText = MultiLinesHintEditText.this;
            multiLinesHintEditText.f43942i = !multiLinesHintEditText.f43942i;
            MultiLinesHintEditText.this.invalidate();
            MultiLinesHintEditText multiLinesHintEditText2 = MultiLinesHintEditText.this;
            multiLinesHintEditText2.postDelayed(this, multiLinesHintEditText2.f43943j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiLinesHintEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43940g = 2;
        this.f43941h = ContextCompat.getDrawable(getContext(), R$drawable.shape_primary_cursor_height);
        this.f43942i = true;
        this.f43943j = 500L;
        this.f43944k = ResourcesCompat.getFont(getContext(), R$font.regular);
        this.f43945l = new RunnableC22933a();
        m54683d();
    }

    /* JADX INFO: renamed from: h */
    private final StaticLayout m54687h(String str, TextPaint textPaint, int i11) {
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i11).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setMaxLines(this.f43940g).setEllipsize(TextUtils.TruncateAt.END).build();
        Intrinsics.checkNotNull(staticLayoutBuild);
        return staticLayoutBuild;
    }

    /* JADX INFO: renamed from: d */
    private final void m54683d() {
        this.f43937d = new TextPaint(1);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f43938e = m54689j(context, 10.0f);
        this.f43939f = getTextSize();
    }

    /* JADX INFO: renamed from: i */
    private final void m54688i(Canvas canvas, int i11) {
        Drawable drawable = this.f43941h;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop() + ((i11 - intrinsicHeight) / 2.0f);
            drawable.setBounds((int) paddingLeft, (int) paddingTop, (int) (paddingLeft + intrinsicWidth), (int) (paddingTop + intrinsicHeight));
            drawable.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f43945l);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!TextUtils.isEmpty(getText()) || TextUtils.isEmpty(getHint()) || getLayoutDirection() == 1) {
            getPaint().setTextSize(this.f43939f);
            super.onDraw(canvas);
            return;
        }
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        TextPaint textPaint = this.f43937d;
        TextPaint textPaint2 = null;
        if (textPaint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHintPaint");
            textPaint = null;
        }
        textPaint.set(getPaint());
        TextPaint textPaint3 = this.f43937d;
        if (textPaint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHintPaint");
            textPaint3 = null;
        }
        textPaint3.setColor(getCurrentHintTextColor());
        TextPaint textPaint4 = this.f43937d;
        if (textPaint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHintPaint");
            textPaint4 = null;
        }
        textPaint4.setTypeface(this.f43944k);
        float textSize = getPaint().getTextSize();
        getPaint().getTextAlign();
        int i11 = 1;
        while (textSize >= this.f43938e) {
            TextPaint textPaint5 = this.f43937d;
            if (textPaint5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHintPaint");
                textPaint5 = null;
            }
            textPaint5.setTextSize(textSize);
            String strValueOf = String.valueOf(getHint());
            TextPaint textPaint6 = this.f43937d;
            if (textPaint6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHintPaint");
                textPaint6 = null;
            }
            StaticLayout staticLayoutM54687h = m54687h(strValueOf, textPaint6, width);
            if (staticLayoutM54687h.getLineCount() < this.f43940g && staticLayoutM54687h.getHeight() <= height) {
                break;
            }
            if (i11 >= this.f43940g || textSize != this.f43938e) {
                textSize--;
            } else {
                i11++;
            }
        }
        TextPaint textPaint7 = this.f43937d;
        if (textPaint7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHintPaint");
            textPaint7 = null;
        }
        textPaint7.setTextSize(RangesKt.coerceAtLeast(textSize, this.f43938e));
        TextPaint paint = getPaint();
        TextPaint textPaint8 = this.f43937d;
        if (textPaint8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHintPaint");
            textPaint8 = null;
        }
        paint.setTextSize(textPaint8.getTextSize());
        String strValueOf2 = String.valueOf(getHint());
        TextPaint textPaint9 = this.f43937d;
        if (textPaint9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHintPaint");
            textPaint9 = null;
        }
        StaticLayout staticLayoutM54687h2 = m54687h(strValueOf2, textPaint9, width);
        TextPaint textPaint10 = this.f43937d;
        if (textPaint10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHintPaint");
            textPaint10 = null;
        }
        float fDescent = textPaint10.descent();
        TextPaint textPaint11 = this.f43937d;
        if (textPaint11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHintPaint");
        } else {
            textPaint2 = textPaint11;
        }
        float paddingTop = getPaddingTop() + ((height - staticLayoutM54687h2.getHeight()) / 2.0f) + (((fDescent - textPaint2.ascent()) - getLineHeight()) / 2.0f);
        canvas.save();
        canvas.translate(getPaddingLeft(), paddingTop);
        staticLayoutM54687h2.draw(canvas);
        canvas.restore();
        if (isFocused() && this.f43942i) {
            m54688i(canvas, height);
        }
    }

    /* JADX INFO: renamed from: j */
    private final float m54689j(Context context, float f11) {
        return (f11 * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(this.f43945l);
    }

    @Override // android.widget.TextView
    public void setTextSize(float size) {
        super.setTextSize(size);
        this.f43939f = getTextSize();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiLinesHintEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f43940g = 2;
        this.f43941h = ContextCompat.getDrawable(getContext(), R$drawable.shape_primary_cursor_height);
        this.f43942i = true;
        this.f43943j = 500L;
        this.f43944k = ResourcesCompat.getFont(getContext(), R$font.regular);
        this.f43945l = new RunnableC22933a();
        m54683d();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiLinesHintEditText(@NotNull Context context, @NotNull AttributeSet attrs, int i11) {
        super(context, attrs, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f43940g = 2;
        this.f43941h = ContextCompat.getDrawable(getContext(), R$drawable.shape_primary_cursor_height);
        this.f43942i = true;
        this.f43943j = 500L;
        this.f43944k = ResourcesCompat.getFont(getContext(), R$font.regular);
        this.f43945l = new RunnableC22933a();
        m54683d();
    }
}
