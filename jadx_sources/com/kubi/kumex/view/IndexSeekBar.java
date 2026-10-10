package com.kubi.kumex.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.internal.view.SupportMenu;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kumex.R$styleable;
import com.tencent.bugly.proguard.C33556b3;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: IndexSeekBar.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\fJ\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0014J \u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\b2\u0006\u00101\u001a\u000202H\u0016J\u0012\u00103\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00104\u001a\u00020*2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R$\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\\\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0\u001cj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d`\u001e2\"\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d0\u001cj\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u001d`\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00065"}, m90084d2 = {"Lcom/kubi/kumex/view/IndexSeekBar;", "Landroidx/appcompat/widget/AppCompatSeekBar;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", TtmlNode.TAG_STYLE, "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "attr", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "normalPaint", "Landroid/graphics/Paint;", "selectPaint", "minValue", "getMinValue", "()I", "setMinValue", "(I)V", "value", "maxValue", "getMaxValue", "setMaxValue", "progressValue", "getProgressValue", "setProgressValue", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "indexTable", "getIndexTable", "()Ljava/util/HashMap;", "setIndexTable", "(Ljava/util/HashMap;)V", "onProgressListener", "getOnProgressListener", "()Landroid/widget/SeekBar$OnSeekBarChangeListener;", "setOnProgressListener", "(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onProgressChanged", "seekBar", "Landroid/widget/SeekBar;", "progress", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class IndexSeekBar extends AppCompatSeekBar implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: b */
    @NotNull
    public Paint f30851b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public Paint f30852c;

    /* JADX INFO: renamed from: d */
    public int f30853d;

    /* JADX INFO: renamed from: e */
    public int f30854e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public HashMap<Integer, String> f30855f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public SeekBar.OnSeekBarChangeListener f30856g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexSeekBar(@NotNull Context context, @NotNull AttributeSet attrs, int i11) {
        super(context, attrs, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f30854e = 100;
        this.f30855f = MapsKt.hashMapOf(new Pair(0, "0"), new Pair(100, C33556b3.f68995S));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.IndexSeekBar);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        Paint paint = new Paint();
        this.f30851b = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f30851b;
        int i12 = R$styleable.IndexSeekBar_indexSize;
        paint2.setTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, 20));
        this.f30851b.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.IndexSeekBar_indexNormal, SupportMenu.CATEGORY_MASK));
        Paint paint3 = new Paint();
        this.f30852c = paint3;
        paint3.setAntiAlias(true);
        this.f30852c.setTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, 20));
        this.f30852c.setColor(typedArrayObtainStyledAttributes.getColor(R$styleable.IndexSeekBar_indexSelect, SupportMenu.CATEGORY_MASK));
        typedArrayObtainStyledAttributes.recycle();
        setOnSeekBarChangeListener(this);
    }

    @NotNull
    public final HashMap<Integer, String> getIndexTable() {
        return this.f30855f;
    }

    /* JADX INFO: renamed from: getMaxValue, reason: from getter */
    public final int getF30854e() {
        return this.f30854e;
    }

    /* JADX INFO: renamed from: getMinValue, reason: from getter */
    public final int getF30853d() {
        return this.f30853d;
    }

    @Nullable
    /* JADX INFO: renamed from: getOnProgressListener, reason: from getter */
    public final SeekBar.OnSeekBarChangeListener getF30856g() {
        return this.f30856g;
    }

    public final int getProgressValue() {
        return this.f30853d + getProgress();
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        for (Map.Entry<Integer, String> entry : this.f30855f.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            String value = entry.getValue();
            Paint paint = iIntValue == getProgressValue() ? this.f30852c : this.f30851b;
            float paddingLeft = getPaddingLeft() + (((iIntValue - this.f30853d) / getMax()) * measuredWidth);
            float fMeasureText = paint.measureText(value);
            canvas.drawText(value, RangesKt.coerceAtMost((getMeasuredWidth() - getPaddingRight()) - fMeasureText, RangesKt.coerceAtLeast(getPaddingLeft(), paddingLeft - (fMeasureText / 2))), getMeasuredHeight() - paint.getFontMetrics().descent, paint);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(@NotNull SeekBar seekBar, int progress, boolean fromUser) {
        Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f30856g;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, getProgressValue(), fromUser);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(@Nullable SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f30856g;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(@Nullable SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f30856g;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    public final void setIndexTable(@NotNull HashMap<Integer, String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f30855f = value;
        invalidate();
    }

    public final void setMaxValue(int i11) {
        this.f30854e = i11;
        setMax(i11 - this.f30853d);
    }

    public final void setMinValue(int i11) {
        this.f30853d = i11;
    }

    public final void setOnProgressListener(@Nullable SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f30856g = onSeekBarChangeListener;
    }

    public final void setProgressValue(int i11) {
        setProgress(i11 - this.f30853d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndexSeekBar(@NotNull Context context, @NotNull AttributeSet attr) {
        this(context, attr, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attr, "attr");
    }
}
