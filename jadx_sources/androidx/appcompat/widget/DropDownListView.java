package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.C0467R;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes23.dex */
class DropDownListView extends ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private ViewPropertyAnimatorCompat mClickAnimation;
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;
    private int mMotionPosition;
    ResolveHoverRunnable mResolveHoverRunnable;
    private ListViewAutoScrollHelper mScrollHelper;
    private int mSelectionBottomPadding;
    private int mSelectionLeftPadding;
    private int mSelectionRightPadding;
    private int mSelectionTopPadding;
    private GateKeeperDrawable mSelector;
    private final Rect mSelectorRect;

    @RequiresApi(30)
    public static class Api30Impl {
        private static boolean sHasMethods;
        private static Method sPositionSelector;
        private static Method sSetNextSelectedPositionInt;
        private static Method sSetSelectedPositionInt;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                sPositionSelector = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                sSetSelectedPositionInt = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                sSetNextSelectedPositionInt = declaredMethod3;
                declaredMethod3.setAccessible(true);
                sHasMethods = true;
            } catch (NoSuchMethodException e11) {
                e11.printStackTrace();
            }
        }

        public static boolean canPositionSelectorForHoveredItem() {
            return sHasMethods;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static void positionSelectorForHoveredItem(DropDownListView dropDownListView, int i11, View view) {
            try {
                sPositionSelector.invoke(dropDownListView, Integer.valueOf(i11), view, Boolean.FALSE, -1, -1);
                sSetSelectedPositionInt.invoke(dropDownListView, Integer.valueOf(i11));
                sSetNextSelectedPositionInt.invoke(dropDownListView, Integer.valueOf(i11));
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
            } catch (InvocationTargetException e12) {
                e12.printStackTrace();
            }
        }

        private Api30Impl() {
        }
    }

    public static class GateKeeperDrawable extends DrawableWrapperCompat {
        private boolean mEnabled;

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            if (this.mEnabled) {
                super.draw(canvas);
            }
        }

        public void setEnabled(boolean z11) {
            this.mEnabled = z11;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspot(float f11, float f12) {
            if (this.mEnabled) {
                super.setHotspot(f11, f12);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i11, int i12, int i13, int i14) {
            if (this.mEnabled) {
                super.setHotspotBounds(i11, i12, i13, i14);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.mEnabled) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z11, boolean z12) {
            if (this.mEnabled) {
                return super.setVisible(z11, z12);
            }
            return false;
        }

        public GateKeeperDrawable(Drawable drawable) {
            super(drawable);
            this.mEnabled = true;
        }
    }

    public static class PreApi33Impl {
        private static final Field sIsChildViewEnabled;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                e11.printStackTrace();
            }
            sIsChildViewEnabled = declaredField;
        }

        public static boolean isSelectedChildViewEnabled(AbsListView absListView) {
            Field field = sIsChildViewEnabled;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
                return false;
            }
        }

        public static void setSelectedChildViewEnabled(AbsListView absListView, boolean z11) {
            Field field = sIsChildViewEnabled;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z11));
                } catch (IllegalAccessException e11) {
                    e11.printStackTrace();
                }
            }
        }

        private PreApi33Impl() {
        }
    }

    public class ResolveHoverRunnable implements Runnable {
        public ResolveHoverRunnable() {
        }

        public void cancel() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.mResolveHoverRunnable = null;
            dropDownListView.removeCallbacks(this);
        }

        public void post() {
            DropDownListView.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.mResolveHoverRunnable = null;
            dropDownListView.drawableStateChanged();
        }
    }

    public DropDownListView(@NonNull Context context, boolean z11) {
        super(context, null, C0467R.attr.dropDownListViewStyle);
        this.mSelectorRect = new Rect();
        this.mSelectionLeftPadding = 0;
        this.mSelectionTopPadding = 0;
        this.mSelectionRightPadding = 0;
        this.mSelectionBottomPadding = 0;
        this.mHijackFocus = z11;
        setCacheColorHint(0);
    }

    private void clearPressedItem() {
        this.mDrawsInPressedState = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.mMotionPosition - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mClickAnimation;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.cancel();
            this.mClickAnimation = null;
        }
    }

    private void setPressedItem(View view, int i11, float f11, float f12) {
        View childAt;
        this.mDrawsInPressedState = true;
        Api21Impl.drawableHotspotChanged(this, f11, f12);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i12 = this.mMotionPosition;
        if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.mMotionPosition = i11;
        Api21Impl.drawableHotspotChanged(view, f11 - view.getLeft(), f12 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        positionSelectorLikeTouchCompat(i11, view, f11, f12);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.mResolveHoverRunnable = null;
        super.onDetachedFromWindow();
    }

    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static void drawableHotspotChanged(View view, float f11, float f12) {
            view.drawableHotspotChanged(f11, f12);
        }
    }

    @RequiresApi(33)
    public static class Api33Impl {
        private Api33Impl() {
        }

        @DoNotInline
        public static boolean isSelectedChildViewEnabled(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @DoNotInline
        public static void setSelectedChildViewEnabled(AbsListView absListView, boolean z11) {
            absListView.setSelectedChildViewEnabled(z11);
        }
    }

    private void drawSelectorCompat(Canvas canvas) {
        Drawable selector;
        if (this.mSelectorRect.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.mSelectorRect);
        selector.draw(canvas);
    }

    private void positionSelectorCompat(int i11, View view) {
        Rect rect = this.mSelectorRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.mSelectionLeftPadding;
        rect.top -= this.mSelectionTopPadding;
        rect.right += this.mSelectionRightPadding;
        rect.bottom += this.mSelectionBottomPadding;
        boolean zSuperIsSelectedChildViewEnabled = superIsSelectedChildViewEnabled();
        if (view.isEnabled() != zSuperIsSelectedChildViewEnabled) {
            superSetSelectedChildViewEnabled(!zSuperIsSelectedChildViewEnabled);
            if (i11 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void setSelectorEnabled(boolean z11) {
        GateKeeperDrawable gateKeeperDrawable = this.mSelector;
        if (gateKeeperDrawable != null) {
            gateKeeperDrawable.setEnabled(z11);
        }
    }

    private boolean superIsSelectedChildViewEnabled() {
        return Build.VERSION.SDK_INT >= 33 ? Api33Impl.isSelectedChildViewEnabled(this) : PreApi33Impl.isSelectedChildViewEnabled(this);
    }

    private void superSetSelectedChildViewEnabled(boolean z11) {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.setSelectedChildViewEnabled(this, z11);
        } else {
            PreApi33Impl.setSelectedChildViewEnabled(this, z11);
        }
    }

    private boolean touchModeDrawsInPressedStateCompat() {
        return this.mDrawsInPressedState;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.mResolveHoverRunnable != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        updateSelectorStateCompat();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.mHijackFocus || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.mHijackFocus || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.mHijackFocus || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.mHijackFocus && this.mListSelectionHidden) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.mResolveHoverRunnable == null) {
            ResolveHoverRunnable resolveHoverRunnable = new ResolveHoverRunnable();
            this.mResolveHoverRunnable = resolveHoverRunnable;
            resolveHoverRunnable.post();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i11 < 30 || !Api30Impl.canPositionSelectorForHoveredItem()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    Api30Impl.positionSelectorForHoveredItem(this, iPointToPosition, childAt);
                }
            }
            updateSelectorStateCompat();
        }
        return zOnHoverEvent;
    }

    public void setListSelectionHidden(boolean z11) {
        this.mListSelectionHidden = z11;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        GateKeeperDrawable gateKeeperDrawable = drawable != null ? new GateKeeperDrawable(drawable) : null;
        this.mSelector = gateKeeperDrawable;
        super.setSelector(gateKeeperDrawable);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.mSelectionLeftPadding = rect.left;
        this.mSelectionTopPadding = rect.top;
        this.mSelectionRightPadding = rect.right;
        this.mSelectionBottomPadding = rect.bottom;
    }

    private void clickPressedItem(View view, int i11) {
        performItemClick(view, i11, getItemIdAtPosition(i11));
    }

    private void positionSelectorLikeFocusCompat(int i11, View view) {
        boolean z11;
        Drawable selector = getSelector();
        boolean z12 = true;
        if (selector != null && i11 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            selector.setVisible(false, false);
        }
        positionSelectorCompat(i11, view);
        if (z11) {
            Rect rect = this.mSelectorRect;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z12 = false;
            }
            selector.setVisible(z12, false);
            DrawableCompat.setHotspot(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void positionSelectorLikeTouchCompat(int i11, View view, float f11, float f12) {
        positionSelectorLikeFocusCompat(i11, view);
        Drawable selector = getSelector();
        if (selector != null && i11 != -1) {
            DrawableCompat.setHotspot(selector, f11, f12);
        }
    }

    private void updateSelectorStateCompat() {
        Drawable selector = getSelector();
        if (selector != null && touchModeDrawsInPressedStateCompat() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        drawSelectorCompat(canvas);
        super.dispatchDraw(canvas);
    }

    public int lookForSelectablePosition(int i11, boolean z11) {
        int iMin;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z11) {
                    iMin = Math.max(0, i11);
                    while (iMin < count && !adapter.isEnabled(iMin)) {
                        iMin++;
                    }
                } else {
                    iMin = Math.min(i11, count - 1);
                    while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                        iMin--;
                    }
                }
                if (iMin < 0 || iMin >= count) {
                    return -1;
                }
                return iMin;
            }
            if (i11 >= 0 && i11 < count) {
                return i11;
            }
        }
        return -1;
    }

    public int measureHeightOfChildrenCompat(int i11, int i12, int i13, int i14, int i15) {
        int iMakeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i16 = 0;
        int i17 = 0;
        View view = null;
        for (int i18 = 0; i18 < count; i18++) {
            int itemViewType = adapter.getItemViewType(i18);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i18, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i19 = layoutParams.height;
            if (i19 > 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i11, iMakeMeasureSpec);
            view.forceLayout();
            if (i18 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i14) {
                if (i15 >= 0 && i18 > i15 && i17 > 0 && measuredHeight != i14) {
                    return i17;
                }
                return i14;
            }
            if (i15 >= 0 && i18 >= i15) {
                i17 = measuredHeight;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean onForwardedEvent(MotionEvent motionEvent, int i11) {
        boolean z11;
        boolean z12;
        ListViewAutoScrollHelper listViewAutoScrollHelper;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z11 = true;
                    z12 = false;
                } else {
                    z12 = false;
                    z11 = false;
                }
                if (z11 || z12) {
                    clearPressedItem();
                }
                if (z11) {
                    if (this.mScrollHelper == null) {
                        this.mScrollHelper = new ListViewAutoScrollHelper(this);
                    }
                    this.mScrollHelper.setEnabled(true);
                    this.mScrollHelper.onTouch(this, motionEvent);
                    return z11;
                }
                listViewAutoScrollHelper = this.mScrollHelper;
                if (listViewAutoScrollHelper != null) {
                    listViewAutoScrollHelper.setEnabled(false);
                }
                return z11;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i11);
        if (iFindPointerIndex < 0) {
            z12 = false;
            z11 = false;
        } else {
            int x11 = (int) motionEvent.getX(iFindPointerIndex);
            int y11 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x11, y11);
            if (iPointToPosition == -1) {
                z12 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                setPressedItem(childAt, iPointToPosition, x11, y11);
                if (actionMasked == 1) {
                    clickPressedItem(childAt, iPointToPosition);
                }
                z11 = true;
                z12 = false;
            }
        }
        if (z11) {
            clearPressedItem();
        } else {
            clearPressedItem();
        }
        if (z11) {
            if (this.mScrollHelper == null) {
                this.mScrollHelper = new ListViewAutoScrollHelper(this);
            }
            this.mScrollHelper.setEnabled(true);
            this.mScrollHelper.onTouch(this, motionEvent);
            return z11;
        }
        listViewAutoScrollHelper = this.mScrollHelper;
        if (listViewAutoScrollHelper != null) {
            listViewAutoScrollHelper.setEnabled(false);
        }
        return z11;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.mMotionPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        ResolveHoverRunnable resolveHoverRunnable = this.mResolveHoverRunnable;
        if (resolveHoverRunnable != null) {
            resolveHoverRunnable.cancel();
        }
        return super.onTouchEvent(motionEvent);
    }
}
