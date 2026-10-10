package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ContentFrameLayout extends FrameLayout {
    private OnAttachListener mAttachListener;
    private final Rect mDecorPadding;
    private TypedValue mFixedHeightMajor;
    private TypedValue mFixedHeightMinor;
    private TypedValue mFixedWidthMajor;
    private TypedValue mFixedWidthMinor;
    private TypedValue mMinWidthMajor;
    private TypedValue mMinWidthMinor;

    public interface OnAttachListener {
        void onAttachedFromWindow();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.mFixedHeightMajor == null) {
            this.mFixedHeightMajor = new TypedValue();
        }
        return this.mFixedHeightMajor;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.mFixedHeightMinor == null) {
            this.mFixedHeightMinor = new TypedValue();
        }
        return this.mFixedHeightMinor;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.mFixedWidthMajor == null) {
            this.mFixedWidthMajor = new TypedValue();
        }
        return this.mFixedWidthMajor;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.mFixedWidthMinor == null) {
            this.mFixedWidthMinor = new TypedValue();
        }
        return this.mFixedWidthMinor;
    }

    public TypedValue getMinWidthMajor() {
        if (this.mMinWidthMajor == null) {
            this.mMinWidthMajor = new TypedValue();
        }
        return this.mMinWidthMajor;
    }

    public TypedValue getMinWidthMinor() {
        if (this.mMinWidthMinor == null) {
            this.mMinWidthMinor = new TypedValue();
        }
        return this.mMinWidthMinor;
    }

    public void setAttachListener(OnAttachListener onAttachListener) {
        this.mAttachListener = onAttachListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setDecorPadding(int i11, int i12, int i13, int i14) {
        this.mDecorPadding.set(i11, i12, i13, i14);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mDecorPadding = new Rect();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void dispatchFitSystemWindows(Rect rect) {
        fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        OnAttachListener onAttachListener = this.mAttachListener;
        if (onAttachListener != null) {
            onAttachListener.onAttachedFromWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OnAttachListener onAttachListener = this.mAttachListener;
        if (onAttachListener != null) {
            onAttachListener.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        boolean z11;
        boolean z12;
        TypedValue typedValue;
        int i13;
        int i14;
        float fraction;
        TypedValue typedValue2;
        int i15;
        int i16;
        float fraction2;
        TypedValue typedValue3;
        int i17;
        int i18;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z13 = true;
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z11 = true;
        } else {
            z11 = false;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        if (mode == Integer.MIN_VALUE) {
            if (z11) {
                typedValue3 = this.mFixedWidthMinor;
            } else {
                typedValue3 = this.mFixedWidthMajor;
            }
            if (typedValue3 != null && (i17 = typedValue3.type) != 0) {
                if (i17 == 5) {
                    fraction3 = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i17 == 6) {
                        int i19 = displayMetrics.widthPixels;
                        fraction3 = typedValue3.getFraction(i19, i19);
                    } else {
                        i18 = 0;
                    }
                    if (i18 > 0) {
                        Rect rect = this.mDecorPadding;
                        i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect.left + rect.right), View.MeasureSpec.getSize(i11)), 1073741824);
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                i18 = (int) fraction3;
                if (i18 > 0) {
                    Rect rect2 = this.mDecorPadding;
                    i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i11)), 1073741824);
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (z11) {
                typedValue2 = this.mFixedHeightMajor;
            } else {
                typedValue2 = this.mFixedHeightMinor;
            }
            if (typedValue2 != null && (i15 = typedValue2.type) != 0) {
                if (i15 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i15 == 6) {
                        int i21 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i21, i21);
                    } else {
                        i16 = 0;
                    }
                    if (i16 > 0) {
                        Rect rect3 = this.mDecorPadding;
                        i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i12)), 1073741824);
                    }
                }
                i16 = (int) fraction2;
                if (i16 > 0) {
                    Rect rect4 = this.mDecorPadding;
                    i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i12)), 1073741824);
                }
            }
        }
        super.onMeasure(i11, i12);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z12 && mode == Integer.MIN_VALUE) {
            if (z11) {
                typedValue = this.mMinWidthMinor;
            } else {
                typedValue = this.mMinWidthMajor;
            }
            if (typedValue != null && (i13 = typedValue.type) != 0) {
                if (i13 == 5) {
                    fraction = typedValue.getDimension(displayMetrics);
                } else {
                    if (i13 == 6) {
                        int i22 = displayMetrics.widthPixels;
                        fraction = typedValue.getFraction(i22, i22);
                    } else {
                        i14 = 0;
                    }
                    if (i14 > 0) {
                        Rect rect5 = this.mDecorPadding;
                        i14 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i14) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                    } else {
                        z13 = false;
                    }
                }
                i14 = (int) fraction;
                if (i14 > 0) {
                    Rect rect6 = this.mDecorPadding;
                    i14 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i14) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                } else {
                    z13 = false;
                }
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        if (z13) {
            super.onMeasure(iMakeMeasureSpec, i12);
        }
    }
}
