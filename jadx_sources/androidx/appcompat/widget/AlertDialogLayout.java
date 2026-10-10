package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0467R;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(@Nullable Context context) {
        super(context);
    }

    private void setChildFrame(View view, int i11, int i12, int i13, int i14) {
        view.layout(i11, i12, i13 + i11, i14 + i12);
    }

    public AlertDialogLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean tryOnMeasure(int i11, int i12) {
        int iCombineMeasuredStates;
        int iResolveMinimumHeight;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == C0467R.id.topPanel) {
                    view = childAt;
                } else if (id2 == C0467R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id2 != C0467R.id.contentPanel && id2 != C0467R.id.customPanel) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i11);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i11, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i11, 0);
            iResolveMinimumHeight = resolveMinimumHeight(view2);
            measuredHeight = view2.getMeasuredHeight() - iResolveMinimumHeight;
            paddingTop += iResolveMinimumHeight;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iResolveMinimumHeight = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i11, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i14 = size - paddingTop;
        if (view2 != null) {
            int i15 = paddingTop - iResolveMinimumHeight;
            int iMin = Math.min(i14, measuredHeight);
            if (iMin > 0) {
                i14 -= iMin;
                iResolveMinimumHeight += iMin;
            }
            view2.measure(i11, View.MeasureSpec.makeMeasureSpec(iResolveMinimumHeight, 1073741824));
            paddingTop = i15 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i14 > 0) {
            view3.measure(i11, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i14, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i11, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i12, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        forceUniformWidth(childCount, i12);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void forceUniformWidth(int i11, int i12) {
        int i13;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i14 = 0;
        while (i14 < i11) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i15 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = childAt.getMeasuredHeight();
                    i13 = i12;
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i13, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i15;
                } else {
                    i13 = i12;
                }
            } else {
                i13 = i12;
            }
            i14++;
            i12 = i13;
        }
    }

    private static int resolveMinimumHeight(View view) {
        int minimumHeight = ViewCompat.getMinimumHeight(view);
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return resolveMinimumHeight(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int paddingTop;
        int intrinsicHeight;
        int i15;
        int i16;
        int i17;
        int paddingLeft = getPaddingLeft();
        int i18 = i13 - i11;
        int paddingRight = i18 - getPaddingRight();
        int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i19 = gravity & 112;
        int i21 = gravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i19 != 16) {
            if (i19 != 80) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = ((getPaddingTop() + i14) - i12) - measuredHeight;
            }
        } else {
            paddingTop = getPaddingTop() + (((i14 - i12) - measuredHeight) / 2);
        }
        Drawable dividerDrawable = getDividerDrawable();
        if (dividerDrawable == null) {
            intrinsicHeight = 0;
        } else {
            intrinsicHeight = dividerDrawable.getIntrinsicHeight();
        }
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                int i23 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                if (i23 < 0) {
                    i23 = i21;
                }
                int absoluteGravity = GravityCompat.getAbsoluteGravity(i23, getLayoutDirection()) & 7;
                if (absoluteGravity != 1) {
                    if (absoluteGravity != 5) {
                        i17 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                    } else {
                        i15 = paddingRight - measuredWidth;
                        i16 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                    int i24 = i17;
                    if (hasDividerBeforeChildAt(i22)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i25 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    setChildFrame(childAt, i24, i25, measuredWidth, measuredHeight2);
                    paddingTop = i25 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                } else {
                    i15 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                    i16 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                }
                i17 = i15 - i16;
                int i26 = i17;
                if (hasDividerBeforeChildAt(i22)) {
                    paddingTop += intrinsicHeight;
                }
                int i27 = paddingTop + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                setChildFrame(childAt, i26, i27, measuredWidth, measuredHeight2);
                paddingTop = i27 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i11, int i12) {
        if (!tryOnMeasure(i11, i12)) {
            super.onMeasure(i11, i12);
        }
    }
}
