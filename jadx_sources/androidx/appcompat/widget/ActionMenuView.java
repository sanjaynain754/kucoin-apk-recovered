package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView {
    static final int GENERATED_ITEM_PADDING = 4;
    static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        @ViewDebug.ExportedProperty
        public int cellsUsed;

        @ViewDebug.ExportedProperty
        public boolean expandable;
        boolean expanded;

        @ViewDebug.ExportedProperty
        public int extraPixels;

        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.isOverflowButton = false;
        }

        public LayoutParams(int i11, int i12, boolean z11) {
            super(i11, i12);
            this.isOverflowButton = z11;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public class MenuBuilderCallback implements MenuBuilder.Callback {
        public MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.mOnMenuItemClickListener;
            return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
            MenuBuilder.Callback callback = ActionMenuView.this.mMenuBuilderCallback;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean hasSupportDividerBeforeChildAt(int i11) {
        boolean zNeedsDividerAfter = false;
        if (i11 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i11 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i11);
        if (i11 < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            zNeedsDividerAfter = ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        return (i11 <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? zNeedsDividerAfter : ((ActionMenuChildView) childAt2).needsDividerBefore() | zNeedsDividerAfter;
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f11);
        this.mGeneratedItemPadding = (int) (f11 * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    private void onMeasureExactFormat(int i11, int i12) {
        long j11;
        int i13;
        boolean z11;
        ?? r11;
        int i14;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, paddingTop, -2);
        int i15 = size - paddingLeft;
        int i16 = this.mMinCellSize;
        int i17 = i15 / i16;
        int i18 = i15 % i16;
        if (i17 == 0) {
            setMeasuredDimension(i15, 0);
            return;
        }
        int i19 = i16 + (i18 / i17);
        int childCount = getChildCount();
        int iMax = 0;
        int i21 = 0;
        boolean z12 = false;
        int i22 = 0;
        int iMax2 = 0;
        int i23 = 0;
        long j12 = 0;
        while (i21 < childCount) {
            View childAt = getChildAt(i21);
            int i24 = size2;
            if (childAt.getVisibility() == 8) {
                i14 = i19;
            } else {
                boolean z13 = childAt instanceof ActionMenuItemView;
                i22++;
                if (z13) {
                    int i25 = this.mGeneratedItemPadding;
                    r11 = 0;
                    childAt.setPadding(i25, 0, i25, 0);
                } else {
                    r11 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.expanded = r11;
                layoutParams.extraPixels = r11;
                layoutParams.cellsUsed = r11;
                layoutParams.expandable = r11;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r11;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r11;
                layoutParams.preventEdgeOffset = z13 && ((ActionMenuItemView) childAt).hasText();
                int iMeasureChildForCells = measureChildForCells(childAt, i19, layoutParams.isOverflowButton ? 1 : i17, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iMeasureChildForCells);
                i14 = i19;
                if (layoutParams.expandable) {
                    i23++;
                }
                if (layoutParams.isOverflowButton) {
                    z12 = true;
                }
                i17 -= iMeasureChildForCells;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iMeasureChildForCells == 1) {
                    j12 |= (long) (1 << i21);
                }
            }
            i21++;
            size2 = i24;
            i19 = i14;
        }
        int i26 = size2;
        int i27 = i19;
        char c11 = 2;
        boolean z14 = z12 && i22 == 2;
        boolean z15 = false;
        while (true) {
            if (i23 <= 0 || i17 <= 0) {
                j11 = 1;
                break;
            }
            int i28 = Integer.MAX_VALUE;
            long j13 = 0;
            char c12 = c11;
            int i29 = 0;
            int i31 = 0;
            j11 = 1;
            while (i31 < childCount) {
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i31).getLayoutParams();
                boolean z16 = z14;
                if (layoutParams2.expandable) {
                    int i32 = layoutParams2.cellsUsed;
                    if (i32 < i28) {
                        j13 = 1 << i31;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        j13 |= 1 << i31;
                        i29++;
                    }
                }
                i31++;
                z14 = z16;
            }
            boolean z17 = z14;
            j12 |= j13;
            if (i29 > i17) {
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount) {
                View childAt2 = getChildAt(i34);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                long j14 = 1 << i34;
                if ((j13 & j14) == 0) {
                    if (layoutParams3.cellsUsed == i33) {
                        j12 |= j14;
                    }
                    i34 = i34;
                } else {
                    if (!z17 || !layoutParams3.preventEdgeOffset) {
                        z11 = true;
                    } else if (i17 == 1) {
                        int i35 = this.mGeneratedItemPadding;
                        z11 = true;
                        childAt2.setPadding(i35 + i27, 0, i35, 0);
                    } else {
                        z11 = true;
                    }
                    layoutParams3.cellsUsed++;
                    layoutParams3.expanded = z11;
                    i17--;
                }
                i34++;
            }
            c11 = c12;
            z14 = z17;
            z15 = true;
        }
        boolean z18 = !z12 && i22 == 1;
        if (i17 <= 0 || j12 == 0 || (i17 >= i22 - 1 && !z18 && iMax2 <= 1)) {
            i13 = 0;
        } else {
            float fBitCount = Long.bitCount(j12);
            if (z18) {
                i13 = 0;
            } else {
                if ((j12 & j11) != 0) {
                    i13 = 0;
                    if (!((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i13 = 0;
                }
                int i36 = childCount - 1;
                if ((j12 & ((long) (1 << i36))) != 0 && !((LayoutParams) getChildAt(i36).getLayoutParams()).preventEdgeOffset) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > 0.0f ? (int) ((i17 * i27) / fBitCount) : i13;
            boolean z19 = z15;
            for (int i38 = i13; i38 < childCount; i38++) {
                if ((j12 & ((long) (1 << i38))) != 0) {
                    View childAt3 = getChildAt(i38);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.extraPixels = i37;
                        layoutParams4.expanded = true;
                        if (i38 == 0 && !layoutParams4.preventEdgeOffset) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i37) / 2;
                        }
                        z19 = true;
                    } else if (layoutParams4.isOverflowButton) {
                        layoutParams4.extraPixels = i37;
                        layoutParams4.expanded = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i37) / 2;
                        z19 = true;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i37 / 2;
                        }
                    }
                }
            }
            z15 = z19;
        }
        if (z15) {
            for (int i39 = i13; i39 < childCount; i39++) {
                View childAt4 = getChildAt(i39);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.expanded) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.cellsUsed * i27) + layoutParams5.extraPixels, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i15, mode != 1073741824 ? iMax : i26);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.mMenu = menuBuilder;
            menuBuilder.setCallback(new MenuBuilderCallback());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.mPresenter = actionMenuPresenter;
            actionMenuPresenter.setReserveOverflow(true);
            ActionMenuPresenter actionMenuPresenter2 = this.mPresenter;
            MenuPresenter.Callback actionMenuPresenterCallback = this.mActionMenuPresenterCallback;
            if (actionMenuPresenterCallback == null) {
                actionMenuPresenterCallback = new ActionMenuPresenterCallback();
            }
            actionMenuPresenter2.setCallback(actionMenuPresenterCallback);
            this.mMenu.addMenuPresenter(this.mPresenter, this.mPopupContext);
            this.mPresenter.setMenuView(this);
        }
        return this.mMenu;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.hideOverflowMenu();
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowing();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int width;
        int paddingLeft;
        if (!this.mFormatItems) {
            super.onLayout(z11, i11, i12, i13, i14);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i14 - i12) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i13 - i11;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zIsLayoutRtl) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i21 = i15 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i21, width, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    hasSupportDividerBeforeChildAt(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i16 / 2) - (measuredWidth2 / 2);
            int i23 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i18 - (i17 ^ 1);
        int iMax = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (zIsLayoutRtl) {
            int width2 = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.isOverflowButton) {
                    int i26 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width2 = i26 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.isOverflowButton) {
                int i29 = paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i31 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i29, i31, i29 + measuredWidth4, measuredHeight4 + i31);
                paddingLeft2 = i29 + measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i11, int i12) {
        MenuBuilder menuBuilder;
        boolean z11 = this.mFormatItems;
        boolean z12 = View.MeasureSpec.getMode(i11) == 1073741824;
        this.mFormatItems = z12;
        if (z11 != z12) {
            this.mFormatItemsWidth = 0;
        }
        int size = View.MeasureSpec.getSize(i11);
        if (this.mFormatItems && (menuBuilder = this.mMenu) != null && size != this.mFormatItemsWidth) {
            this.mFormatItemsWidth = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.mFormatItems && childCount > 0) {
            onMeasureExactFormat(i11, i12);
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i13).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i11, i12);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public MenuBuilder peekMenu() {
        return this.mMenu;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z11) {
        this.mPresenter.setExpandedActionViewsExclusive(z11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z11) {
        this.mReserveOverflow = z11;
    }

    public void setPopupTheme(@StyleRes int i11) {
        if (this.mPopupTheme != i11) {
            this.mPopupTheme = i11;
            if (i11 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i11);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.mPresenter = actionMenuPresenter;
        actionMenuPresenter.setMenuView(this);
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.showOverflowMenu();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    public static int measureChildForCells(View view, int i11, int i12, int i13, int i14) {
        ActionMenuItemView actionMenuItemView;
        boolean z11;
        int i15;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i13) - i14, View.MeasureSpec.getMode(i13));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z12 = false;
        if (actionMenuItemView != null && actionMenuItemView.hasText()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i12 > 0) {
            i15 = 2;
            if (!z11 || i12 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i12 * i11, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i16 = measuredWidth / i11;
                if (measuredWidth % i11 != 0) {
                    i16++;
                }
                if (!z11 || i16 >= 2) {
                    i15 = i16;
                }
            } else {
                i15 = 0;
            }
        } else {
            i15 = 0;
        }
        if (!layoutParams.isOverflowButton && z11) {
            z12 = true;
        }
        layoutParams.expandable = z12;
        layoutParams.cellsUsed = i15;
        view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i15, 1073741824), iMakeMeasureSpec);
        return i15;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.isOverflowButton = true;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        return this.mPresenter.getOverflowIcon();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.mPresenter.isOverflowMenuShowing()) {
                this.mPresenter.hideOverflowMenu();
                this.mPresenter.showOverflowMenu();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        this.mPresenter.setOverflowIcon(drawable);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams != null) {
            if (layoutParams instanceof LayoutParams) {
                layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
            } else {
                layoutParams2 = new LayoutParams(layoutParams);
            }
            if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
                ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
            }
            return layoutParams2;
        }
        return generateDefaultLayoutParams();
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z11) {
        }
    }
}
