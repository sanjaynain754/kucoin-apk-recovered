package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.Nullable;
import androidx.appcompat.C0467R;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes23.dex */
class AppCompatSeekBarHelper extends AppCompatProgressBarHelper {
    private boolean mHasTickMarkTint;
    private boolean mHasTickMarkTintMode;
    private Drawable mTickMark;
    private ColorStateList mTickMarkTintList;
    private PorterDuff.Mode mTickMarkTintMode;
    private final SeekBar mView;

    private void applyTickMarkTint() {
        Drawable drawable = this.mTickMark;
        if (drawable != null) {
            if (this.mHasTickMarkTint || this.mHasTickMarkTintMode) {
                Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
                this.mTickMark = drawableWrap;
                if (this.mHasTickMarkTint) {
                    DrawableCompat.setTintList(drawableWrap, this.mTickMarkTintList);
                }
                if (this.mHasTickMarkTintMode) {
                    DrawableCompat.setTintMode(this.mTickMark, this.mTickMarkTintMode);
                }
                if (this.mTickMark.isStateful()) {
                    this.mTickMark.setState(this.mView.getDrawableState());
                }
            }
        }
    }

    public void drawTickMarks(Canvas canvas) {
        if (this.mTickMark != null) {
            int max = this.mView.getMax();
            if (max > 1) {
                int intrinsicWidth = this.mTickMark.getIntrinsicWidth();
                int intrinsicHeight = this.mTickMark.getIntrinsicHeight();
                int i11 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i12 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.mTickMark.setBounds(-i11, -i12, i11, i12);
                float width = ((this.mView.getWidth() - this.mView.getPaddingLeft()) - this.mView.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.mView.getPaddingLeft(), this.mView.getHeight() / 2);
                for (int i13 = 0; i13 <= max; i13++) {
                    this.mTickMark.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void drawableStateChanged() {
        Drawable drawable = this.mTickMark;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.mView.getDrawableState())) {
            this.mView.invalidateDrawable(drawable);
        }
    }

    @Nullable
    public Drawable getTickMark() {
        return this.mTickMark;
    }

    @Nullable
    public ColorStateList getTickMarkTintList() {
        return this.mTickMarkTintList;
    }

    @Nullable
    public PorterDuff.Mode getTickMarkTintMode() {
        return this.mTickMarkTintMode;
    }

    public void jumpDrawablesToCurrentState() {
        Drawable drawable = this.mTickMark;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void setTickMark(@Nullable Drawable drawable) {
        Drawable drawable2 = this.mTickMark;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTickMark = drawable;
        if (drawable != null) {
            drawable.setCallback(this.mView);
            DrawableCompat.setLayoutDirection(drawable, this.mView.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.mView.getDrawableState());
            }
            applyTickMarkTint();
        }
        this.mView.invalidate();
    }

    public void setTickMarkTintList(@Nullable ColorStateList colorStateList) {
        this.mTickMarkTintList = colorStateList;
        this.mHasTickMarkTint = true;
        applyTickMarkTint();
    }

    public void setTickMarkTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTickMarkTintMode = mode;
        this.mHasTickMarkTintMode = true;
        applyTickMarkTint();
    }

    public AppCompatSeekBarHelper(SeekBar seekBar) {
        super(seekBar);
        this.mTickMarkTintList = null;
        this.mTickMarkTintMode = null;
        this.mHasTickMarkTint = false;
        this.mHasTickMarkTintMode = false;
        this.mView = seekBar;
    }

    @Override // androidx.appcompat.widget.AppCompatProgressBarHelper
    public void loadFromAttributes(AttributeSet attributeSet, int i11) {
        super.loadFromAttributes(attributeSet, i11);
        Context context = this.mView.getContext();
        int[] iArr = C0467R.styleable.AppCompatSeekBar;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i11, 0);
        SeekBar seekBar = this.mView;
        ViewCompat.saveAttributeDataForStyleable(seekBar, seekBar.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i11, 0);
        Drawable drawableIfKnown = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(C0467R.styleable.AppCompatSeekBar_android_thumb);
        if (drawableIfKnown != null) {
            this.mView.setThumb(drawableIfKnown);
        }
        setTickMark(tintTypedArrayObtainStyledAttributes.getDrawable(C0467R.styleable.AppCompatSeekBar_tickMark));
        int i12 = C0467R.styleable.AppCompatSeekBar_tickMarkTintMode;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i12)) {
            this.mTickMarkTintMode = DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i12, -1), this.mTickMarkTintMode);
            this.mHasTickMarkTintMode = true;
        }
        int i13 = C0467R.styleable.AppCompatSeekBar_tickMarkTint;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i13)) {
            this.mTickMarkTintList = tintTypedArrayObtainStyledAttributes.getColorStateList(i13);
            this.mHasTickMarkTint = true;
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        applyTickMarkTint();
    }
}
