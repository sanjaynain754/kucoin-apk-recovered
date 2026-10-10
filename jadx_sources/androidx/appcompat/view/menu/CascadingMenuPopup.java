package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0467R;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.GravityCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
final class CascadingMenuPopup extends MenuPopup implements MenuPresenter, View.OnKeyListener, PopupWindow.OnDismissListener {
    static final int HORIZ_POSITION_LEFT = 0;
    static final int HORIZ_POSITION_RIGHT = 1;
    private static final int ITEM_LAYOUT = C0467R.layout.abc_cascading_menu_item_layout;
    static final int SUBMENU_TIMEOUT_MS = 200;
    private View mAnchorView;
    private final Context mContext;
    private boolean mHasXOffset;
    private boolean mHasYOffset;
    private final int mMenuMaxWidth;
    private PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private MenuPresenter.Callback mPresenterCallback;
    boolean mShouldCloseImmediately;
    private boolean mShowTitle;
    View mShownAnchorView;
    final Handler mSubMenuHoverHandler;
    ViewTreeObserver mTreeObserver;
    private int mXOffset;
    private int mYOffset;
    private final List<MenuBuilder> mPendingMenus = new ArrayList();
    final List<CascadingMenuInfo> mShowingMenus = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!CascadingMenuPopup.this.isShowing() || CascadingMenuPopup.this.mShowingMenus.size() <= 0 || CascadingMenuPopup.this.mShowingMenus.get(0).window.isModal()) {
                return;
            }
            View view = CascadingMenuPopup.this.mShownAnchorView;
            if (view == null || !view.isShown()) {
                CascadingMenuPopup.this.dismiss();
                return;
            }
            Iterator<CascadingMenuInfo> it = CascadingMenuPopup.this.mShowingMenus.iterator();
            while (it.hasNext()) {
                it.next().window.show();
            }
        }
    };
    private final View.OnAttachStateChangeListener mAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = CascadingMenuPopup.this.mTreeObserver;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    CascadingMenuPopup.this.mTreeObserver = view.getViewTreeObserver();
                }
                CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
                cascadingMenuPopup.mTreeObserver.removeGlobalOnLayoutListener(cascadingMenuPopup.mGlobalLayoutListener);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    };
    private final MenuItemHoverListener mMenuItemHoverListener = new MenuItemHoverListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3
        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverEnter(@NonNull final MenuBuilder menuBuilder, @NonNull final MenuItem menuItem) {
            CascadingMenuPopup.this.mSubMenuHoverHandler.removeCallbacksAndMessages(null);
            int size = CascadingMenuPopup.this.mShowingMenus.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (menuBuilder == CascadingMenuPopup.this.mShowingMenus.get(i11).menu) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                return;
            }
            int i12 = i11 + 1;
            final CascadingMenuInfo cascadingMenuInfo = i12 < CascadingMenuPopup.this.mShowingMenus.size() ? CascadingMenuPopup.this.mShowingMenus.get(i12) : null;
            CascadingMenuPopup.this.mSubMenuHoverHandler.postAtTime(new Runnable() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.3.1
                @Override // java.lang.Runnable
                public void run() {
                    CascadingMenuInfo cascadingMenuInfo2 = cascadingMenuInfo;
                    if (cascadingMenuInfo2 != null) {
                        CascadingMenuPopup.this.mShouldCloseImmediately = true;
                        cascadingMenuInfo2.menu.close(false);
                        CascadingMenuPopup.this.mShouldCloseImmediately = false;
                    }
                    if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                        menuBuilder.performItemAction(menuItem, 4);
                    }
                }
            }, menuBuilder, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.MenuItemHoverListener
        public void onItemHoverExit(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            CascadingMenuPopup.this.mSubMenuHoverHandler.removeCallbacksAndMessages(menuBuilder);
        }
    };
    private int mRawDropDownGravity = 0;
    private int mDropDownGravity = 0;
    private boolean mForceShowIcon = false;
    private int mLastPosition = getInitialMenuPosition();

    public static class CascadingMenuInfo {
        public final MenuBuilder menu;
        public final int position;
        public final MenuPopupWindow window;

        public ListView getListView() {
            return this.window.getListView();
        }

        public CascadingMenuInfo(@NonNull MenuPopupWindow menuPopupWindow, @NonNull MenuBuilder menuBuilder, int i11) {
            this.window = menuPopupWindow;
            this.menu = menuBuilder;
            this.position = i11;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public boolean closeMenuOnSubMenuOpened() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setHorizontalOffset(int i11) {
        this.mHasXOffset = true;
        this.mXOffset = i11;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setVerticalOffset(int i11) {
        this.mHasYOffset = true;
        this.mYOffset = i11;
    }

    private MenuPopupWindow createPopupWindow() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.mContext, null, this.mPopupStyleAttr, this.mPopupStyleRes);
        menuPopupWindow.setHoverListener(this.mMenuItemHoverListener);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.setAnchorView(this.mAnchorView);
        menuPopupWindow.setDropDownGravity(this.mDropDownGravity);
        menuPopupWindow.setModal(true);
        menuPopupWindow.setInputMethodMode(2);
        return menuPopupWindow;
    }

    private int findIndexOfAddedMenu(@NonNull MenuBuilder menuBuilder) {
        int size = this.mShowingMenus.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (menuBuilder == this.mShowingMenus.get(i11).menu) {
                return i11;
            }
        }
        return -1;
    }

    @Nullable
    private View findParentViewForSubmenu(@NonNull CascadingMenuInfo cascadingMenuInfo, @NonNull MenuBuilder menuBuilder) {
        MenuAdapter menuAdapter;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemFindMenuItemForSubmenu = findMenuItemForSubmenu(cascadingMenuInfo.menu, menuBuilder);
        if (menuItemFindMenuItemForSubmenu == null) {
            return null;
        }
        ListView listView = cascadingMenuInfo.getListView();
        ListAdapter adapter = listView.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
        } else {
            menuAdapter = (MenuAdapter) adapter;
            headersCount = 0;
        }
        int count = menuAdapter.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            }
            if (menuItemFindMenuItemForSubmenu == menuAdapter.getItem(i11)) {
                break;
            }
            i11++;
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + headersCount) - listView.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listView.getChildCount()) {
            return listView.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int getInitialMenuPosition() {
        return this.mAnchorView.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int getNextMenuPosition(int i11) {
        List<CascadingMenuInfo> list = this.mShowingMenus;
        ListView listView = list.get(list.size() - 1).getListView();
        int[] iArr = new int[2];
        listView.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.mShownAnchorView.getWindowVisibleDisplayFrame(rect);
        if (this.mLastPosition == 1) {
            return (iArr[0] + listView.getWidth()) + i11 > rect.right ? 0 : 1;
        }
        return iArr[0] - i11 < 0 ? 1 : 0;
    }

    private void showMenu(@NonNull MenuBuilder menuBuilder) {
        CascadingMenuInfo cascadingMenuInfo;
        View viewFindParentViewForSubmenu;
        int i11;
        int i12;
        int i13;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.mContext);
        MenuAdapter menuAdapter = new MenuAdapter(menuBuilder, layoutInflaterFrom, this.mOverflowOnly, ITEM_LAYOUT);
        if (!isShowing() && this.mForceShowIcon) {
            menuAdapter.setForceShowIcon(true);
        } else if (isShowing()) {
            menuAdapter.setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(menuBuilder));
        }
        int iMeasureIndividualMenuWidth = MenuPopup.measureIndividualMenuWidth(menuAdapter, null, this.mContext, this.mMenuMaxWidth);
        MenuPopupWindow menuPopupWindowCreatePopupWindow = createPopupWindow();
        menuPopupWindowCreatePopupWindow.setAdapter(menuAdapter);
        menuPopupWindowCreatePopupWindow.setContentWidth(iMeasureIndividualMenuWidth);
        menuPopupWindowCreatePopupWindow.setDropDownGravity(this.mDropDownGravity);
        if (this.mShowingMenus.size() > 0) {
            List<CascadingMenuInfo> list = this.mShowingMenus;
            cascadingMenuInfo = list.get(list.size() - 1);
            viewFindParentViewForSubmenu = findParentViewForSubmenu(cascadingMenuInfo, menuBuilder);
        } else {
            cascadingMenuInfo = null;
            viewFindParentViewForSubmenu = null;
        }
        if (viewFindParentViewForSubmenu != null) {
            menuPopupWindowCreatePopupWindow.setTouchModal(false);
            menuPopupWindowCreatePopupWindow.setEnterTransition(null);
            int nextMenuPosition = getNextMenuPosition(iMeasureIndividualMenuWidth);
            boolean z11 = nextMenuPosition == 1;
            this.mLastPosition = nextMenuPosition;
            if (Build.VERSION.SDK_INT >= 26) {
                menuPopupWindowCreatePopupWindow.setAnchorView(viewFindParentViewForSubmenu);
                i12 = 0;
                i11 = 0;
            } else {
                int[] iArr = new int[2];
                this.mAnchorView.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewFindParentViewForSubmenu.getLocationOnScreen(iArr2);
                if ((this.mDropDownGravity & 7) == 5) {
                    iArr[0] = iArr[0] + this.mAnchorView.getWidth();
                    iArr2[0] = iArr2[0] + viewFindParentViewForSubmenu.getWidth();
                }
                i11 = iArr2[0] - iArr[0];
                i12 = iArr2[1] - iArr[1];
            }
            if ((this.mDropDownGravity & 5) == 5) {
                if (z11) {
                    i13 = i11 + iMeasureIndividualMenuWidth;
                } else {
                    iMeasureIndividualMenuWidth = viewFindParentViewForSubmenu.getWidth();
                    i13 = i11 - iMeasureIndividualMenuWidth;
                }
            } else if (z11) {
                iMeasureIndividualMenuWidth = viewFindParentViewForSubmenu.getWidth();
                i13 = i11 + iMeasureIndividualMenuWidth;
            } else {
                i13 = i11 - iMeasureIndividualMenuWidth;
            }
            menuPopupWindowCreatePopupWindow.setHorizontalOffset(i13);
            menuPopupWindowCreatePopupWindow.setOverlapAnchor(true);
            menuPopupWindowCreatePopupWindow.setVerticalOffset(i12);
        } else {
            if (this.mHasXOffset) {
                menuPopupWindowCreatePopupWindow.setHorizontalOffset(this.mXOffset);
            }
            if (this.mHasYOffset) {
                menuPopupWindowCreatePopupWindow.setVerticalOffset(this.mYOffset);
            }
            menuPopupWindowCreatePopupWindow.setEpicenterBounds(getEpicenterBounds());
        }
        this.mShowingMenus.add(new CascadingMenuInfo(menuPopupWindowCreatePopupWindow, menuBuilder, this.mLastPosition));
        menuPopupWindowCreatePopupWindow.show();
        ListView listView = menuPopupWindowCreatePopupWindow.getListView();
        listView.setOnKeyListener(this);
        if (cascadingMenuInfo == null && this.mShowTitle && menuBuilder.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C0467R.layout.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuBuilder.getHeaderTitle());
            listView.addHeaderView(frameLayout, null, false);
            menuPopupWindowCreatePopupWindow.show();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void addMenu(MenuBuilder menuBuilder) {
        menuBuilder.addMenuPresenter(this, this.mContext);
        if (isShowing()) {
            showMenu(menuBuilder);
        } else {
            this.mPendingMenus.add(menuBuilder);
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        int size = this.mShowingMenus.size();
        if (size > 0) {
            CascadingMenuInfo[] cascadingMenuInfoArr = (CascadingMenuInfo[]) this.mShowingMenus.toArray(new CascadingMenuInfo[size]);
            for (int i11 = size - 1; i11 >= 0; i11--) {
                CascadingMenuInfo cascadingMenuInfo = cascadingMenuInfoArr[i11];
                if (cascadingMenuInfo.window.isShowing()) {
                    cascadingMenuInfo.window.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public ListView getListView() {
        if (this.mShowingMenus.isEmpty()) {
            return null;
        }
        List<CascadingMenuInfo> list = this.mShowingMenus;
        return list.get(list.size() - 1).getListView();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
        return this.mShowingMenus.size() > 0 && this.mShowingMenus.get(0).window.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        CascadingMenuInfo cascadingMenuInfo;
        int size = this.mShowingMenus.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                cascadingMenuInfo = null;
                break;
            }
            cascadingMenuInfo = this.mShowingMenus.get(i11);
            if (!cascadingMenuInfo.window.isShowing()) {
                break;
            } else {
                i11++;
            }
        }
        if (cascadingMenuInfo != null) {
            cascadingMenuInfo.menu.close(false);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        for (CascadingMenuInfo cascadingMenuInfo : this.mShowingMenus) {
            if (subMenuBuilder == cascadingMenuInfo.menu) {
                cascadingMenuInfo.getListView().requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        addMenu(subMenuBuilder);
        MenuPresenter.Callback callback = this.mPresenterCallback;
        if (callback != null) {
            callback.onOpenSubMenu(subMenuBuilder);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setAnchorView(@NonNull View view) {
        if (this.mAnchorView != view) {
            this.mAnchorView = view;
            this.mDropDownGravity = GravityCompat.getAbsoluteGravity(this.mRawDropDownGravity, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.mPresenterCallback = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setForceShowIcon(boolean z11) {
        this.mForceShowIcon = z11;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setGravity(int i11) {
        if (this.mRawDropDownGravity != i11) {
            this.mRawDropDownGravity = i11;
            this.mDropDownGravity = GravityCompat.getAbsoluteGravity(i11, this.mAnchorView.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setShowTitle(boolean z11) {
        this.mShowTitle = z11;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z11) {
        Iterator<CascadingMenuInfo> it = this.mShowingMenus.iterator();
        while (it.hasNext()) {
            MenuPopup.toMenuAdapter(it.next().getListView().getAdapter()).notifyDataSetChanged();
        }
    }

    public CascadingMenuPopup(@NonNull Context context, @NonNull View view, @AttrRes int i11, @StyleRes int i12, boolean z11) {
        this.mContext = context;
        this.mAnchorView = view;
        this.mPopupStyleAttr = i11;
        this.mPopupStyleRes = i12;
        this.mOverflowOnly = z11;
        Resources resources = context.getResources();
        this.mMenuMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0467R.dimen.abc_config_prefDialogWidth));
        this.mSubMenuHoverHandler = new Handler();
    }

    private MenuItem findMenuItemForSubmenu(@NonNull MenuBuilder menuBuilder, @NonNull MenuBuilder menuBuilder2) {
        int size = menuBuilder.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = menuBuilder.getItem(i11);
            if (item.hasSubMenu() && menuBuilder2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z11) {
        int iFindIndexOfAddedMenu = findIndexOfAddedMenu(menuBuilder);
        if (iFindIndexOfAddedMenu >= 0) {
            int i11 = iFindIndexOfAddedMenu + 1;
            if (i11 < this.mShowingMenus.size()) {
                this.mShowingMenus.get(i11).menu.close(false);
            }
            CascadingMenuInfo cascadingMenuInfoRemove = this.mShowingMenus.remove(iFindIndexOfAddedMenu);
            cascadingMenuInfoRemove.menu.removeMenuPresenter(this);
            if (this.mShouldCloseImmediately) {
                cascadingMenuInfoRemove.window.setExitTransition(null);
                cascadingMenuInfoRemove.window.setAnimationStyle(0);
            }
            cascadingMenuInfoRemove.window.dismiss();
            int size = this.mShowingMenus.size();
            if (size > 0) {
                this.mLastPosition = this.mShowingMenus.get(size - 1).position;
            } else {
                this.mLastPosition = getInitialMenuPosition();
            }
            if (size == 0) {
                dismiss();
                MenuPresenter.Callback callback = this.mPresenterCallback;
                if (callback != null) {
                    callback.onCloseMenu(menuBuilder, true);
                }
                ViewTreeObserver viewTreeObserver = this.mTreeObserver;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.mTreeObserver.removeGlobalOnLayoutListener(this.mGlobalLayoutListener);
                    }
                    this.mTreeObserver = null;
                }
                this.mShownAnchorView.removeOnAttachStateChangeListener(this.mAttachStateChangeListener);
                this.mOnDismissListener.onDismiss();
                return;
            }
            if (z11) {
                this.mShowingMenus.get(0).menu.close(false);
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i11, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i11 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        boolean z11;
        if (!isShowing()) {
            Iterator<MenuBuilder> it = this.mPendingMenus.iterator();
            while (it.hasNext()) {
                showMenu(it.next());
            }
            this.mPendingMenus.clear();
            View view = this.mAnchorView;
            this.mShownAnchorView = view;
            if (view != null) {
                if (this.mTreeObserver == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.mTreeObserver = viewTreeObserver;
                if (z11) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.mGlobalLayoutListener);
                }
                this.mShownAnchorView.addOnAttachStateChangeListener(this.mAttachStateChangeListener);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
    }
}
