package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewConfigurationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuBuilder implements SupportMenu {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private Callback mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private MenuItemImpl mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<MenuItemImpl> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<MenuPresenter>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<MenuItemImpl> mItems = new ArrayList<>();
    private ArrayList<MenuItemImpl> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<MenuItemImpl> mActionItems = new ArrayList<>();
    private ArrayList<MenuItemImpl> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface Callback {
        boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem);

        void onMenuModeChange(@NonNull MenuBuilder menuBuilder);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface ItemInvoker {
        boolean invokeItem(MenuItemImpl menuItemImpl);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    public void addMenuPresenter(MenuPresenter menuPresenter) {
        addMenuPresenter(menuPresenter, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public final void close(boolean z11) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(weakReference);
            } else {
                menuPresenter.onCloseMenu(this, z11);
            }
        }
        this.mIsClosing = false;
    }

    public int findGroupIndex(int i11) {
        return findGroupIndex(i11, 0);
    }

    public void onItemActionRequestChanged(MenuItemImpl menuItemImpl) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemVisibleChanged(MenuItemImpl menuItemImpl) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public boolean performItemAction(MenuItem menuItem, int i11) {
        return performItemAction(menuItem, null, i11);
    }

    public void removeItemAt(int i11) {
        removeItemAtInt(i11, true);
    }

    public MenuBuilder setHeaderIconInt(Drawable drawable) {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    public MenuBuilder setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    public MenuBuilder setHeaderViewInt(View view) {
        setHeaderInternal(0, null, 0, null, view);
        return this;
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    private MenuItemImpl createNewMenuItem(int i11, int i12, int i13, int i14, CharSequence charSequence, int i15) {
        return new MenuItemImpl(this, i11, i12, i13, i14, charSequence, i15);
    }

    private void dispatchPresenterUpdate(boolean z11) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(weakReference);
            } else {
                menuPresenter.updateMenuView(z11);
            }
        }
        startDispatchingItemsChanged();
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id2 = menuPresenter.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    menuPresenter.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id2 = menuPresenter.getId();
                if (id2 > 0 && (parcelableOnSaveInstanceState = menuPresenter.onSaveInstanceState()) != null) {
                    sparseArray.put(id2, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    private boolean dispatchSubMenuSelected(SubMenuBuilder subMenuBuilder, MenuPresenter menuPresenter) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean zOnSubMenuSelected = menuPresenter != null ? menuPresenter.onSubMenuSelected(subMenuBuilder) : false;
        for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
            MenuPresenter menuPresenter2 = weakReference.get();
            if (menuPresenter2 == null) {
                this.mPresenters.remove(weakReference);
            } else if (!zOnSubMenuSelected) {
                zOnSubMenuSelected = menuPresenter2.onSubMenuSelected(subMenuBuilder);
            }
        }
        return zOnSubMenuSelected;
    }

    private static int getOrdering(int i11) {
        int i12 = ((-65536) & i11) >> 16;
        if (i12 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i12 < iArr.length) {
                return (i11 & 65535) | (iArr[i12] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void removeItemAtInt(int i11, boolean z11) {
        if (i11 < 0 || i11 >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i11);
        if (z11) {
            onItemsChanged(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    private void setShortcutsVisibleInner(boolean z11) {
        boolean z12;
        if (z11) {
            z12 = this.mResources.getConfiguration().keyboard != 1 && ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration.get(this.mContext), this.mContext);
        }
        this.mShortcutsVisible = z12;
    }

    @Override // android.view.Menu
    public MenuItem add(int i11) {
        return addInternal(0, 0, 0, this.mResources.getString(i11));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i11, int i12, int i13, ComponentName componentName, Intent[] intentArr, Intent intent, int i14, MenuItem[] menuItemArr) {
        int i15;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i14 & 1) == 0) {
            removeGroup(i11);
        }
        for (int i16 = 0; i16 < size; i16++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i17 < 0 ? intent : intentArr[i17]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i11, i12, i13, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = intent3;
            }
        }
        return size;
    }

    public void addMenuPresenter(MenuPresenter menuPresenter, Context context) {
        this.mPresenters.add(new WeakReference<>(menuPresenter));
        menuPresenter.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i11));
    }

    public void changeMenuMode() {
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        MenuItemImpl menuItemImpl = this.mExpandedItem;
        if (menuItemImpl != null) {
            collapseItemActionView(menuItemImpl);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public boolean collapseItemActionView(MenuItemImpl menuItemImpl) {
        boolean zCollapseItemActionView = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == menuItemImpl) {
            stopDispatchingItemsChanged();
            for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
                MenuPresenter menuPresenter = weakReference.get();
                if (menuPresenter != null) {
                    zCollapseItemActionView = menuPresenter.collapseItemActionView(this, menuItemImpl);
                    if (zCollapseItemActionView) {
                        break;
                    }
                } else {
                    this.mPresenters.remove(weakReference);
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.mExpandedItem = null;
            }
        }
        return zCollapseItemActionView;
    }

    public boolean dispatchMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
        Callback callback = this.mCallback;
        return callback != null && callback.onMenuItemSelected(menuBuilder, menuItem);
    }

    public boolean expandItemActionView(MenuItemImpl menuItemImpl) {
        boolean zExpandItemActionView = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter != null) {
                zExpandItemActionView = menuPresenter.expandItemActionView(this, menuItemImpl);
                if (zExpandItemActionView) {
                    break;
                }
            } else {
                this.mPresenters.remove(weakReference);
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.mExpandedItem = menuItemImpl;
        }
        return zExpandItemActionView;
    }

    public int findGroupIndex(int i11, int i12) {
        int size = size();
        if (i12 < 0) {
            i12 = 0;
        }
        while (i12 < size) {
            if (this.mItems.get(i12).getGroupId() == i11) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    public MenuItemImpl findItemWithShortcutForKey(int i11, KeyEvent keyEvent) {
        ArrayList<MenuItemImpl> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i11, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zIsQwertyMode = isQwertyMode();
        for (int i12 = 0; i12 < size; i12++) {
            MenuItemImpl menuItemImpl = arrayList.get(i12);
            char alphabeticShortcut = zIsQwertyMode ? menuItemImpl.getAlphabeticShortcut() : menuItemImpl.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zIsQwertyMode && alphabeticShortcut == '\b' && i11 == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public MenuItemImpl getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i11) {
        return this.mItems.get(i11);
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    @NonNull
    public ArrayList<MenuItemImpl> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i11);
            if (menuItemImpl.isVisible()) {
                this.mVisibleItems.add(menuItemImpl);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.mItems.get(i11).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isDispatchingItemsChanged() {
        return !this.mPreventDispatchingItemsChanged;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public void onItemsChanged(boolean z11) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z11) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z11) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        dispatchPresenterUpdate(z11);
    }

    public boolean performItemAction(MenuItem menuItem, MenuPresenter menuPresenter, int i11) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        boolean zInvoke = menuItemImpl.invoke();
        ActionProvider supportActionProvider = menuItemImpl.getSupportActionProvider();
        boolean z11 = supportActionProvider != null && supportActionProvider.hasSubMenu();
        if (menuItemImpl.hasCollapsibleActionView()) {
            boolean zExpandActionView = menuItemImpl.expandActionView() | zInvoke;
            if (zExpandActionView) {
                close(true);
            }
            return zExpandActionView;
        }
        if (!menuItemImpl.hasSubMenu() && !z11) {
            if ((i11 & 1) == 0) {
                close(true);
            }
            return zInvoke;
        }
        if ((i11 & 4) == 0) {
            close(false);
        }
        if (!menuItemImpl.hasSubMenu()) {
            menuItemImpl.setSubMenu(new SubMenuBuilder(getContext(), this, menuItemImpl));
        }
        SubMenuBuilder subMenuBuilder = (SubMenuBuilder) menuItemImpl.getSubMenu();
        if (z11) {
            supportActionProvider.onPrepareSubMenu(subMenuBuilder);
        }
        boolean zDispatchSubMenuSelected = dispatchSubMenuSelected(subMenuBuilder, menuPresenter) | zInvoke;
        if (!zDispatchSubMenuSelected) {
            close(true);
        }
        return zDispatchSubMenuSelected;
    }

    public void removeMenuPresenter(MenuPresenter menuPresenter) {
        for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
            MenuPresenter menuPresenter2 = weakReference.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                this.mPresenters.remove(weakReference);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i12 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i12 <= 0 || (menuItemFindItem = findItem(i12)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public MenuBuilder setDefaultShowAsAction(int i11) {
        this.mDefaultShowAsAction = i11;
        return this;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i11, boolean z11, boolean z12) {
        int size = this.mItems.size();
        for (int i12 = 0; i12 < size; i12++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i12);
            if (menuItemImpl.getGroupId() == i11) {
                menuItemImpl.setExclusiveCheckable(z12);
                menuItemImpl.setCheckable(z11);
            }
        }
    }

    @Override // androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean z11) {
        this.mGroupDividerEnabled = z11;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i11, boolean z11) {
        int size = this.mItems.size();
        for (int i12 = 0; i12 < size; i12++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i12);
            if (menuItemImpl.getGroupId() == i11) {
                menuItemImpl.setEnabled(z11);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i11, boolean z11) {
        int size = this.mItems.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i12);
            if (menuItemImpl.getGroupId() == i11 && menuItemImpl.setVisibleInt(z11)) {
                z12 = true;
            }
        }
        if (z12) {
            onItemsChanged(true);
        }
    }

    public MenuBuilder setHeaderIconInt(int i11) {
        setHeaderInternal(0, null, i11, null, null);
        return this;
    }

    public MenuBuilder setHeaderTitleInt(int i11) {
        setHeaderInternal(i11, null, 0, null, null);
        return this;
    }

    public void setOptionalIconsVisible(boolean z11) {
        this.mOptionalIconsVisible = z11;
    }

    public void setOverrideVisibleItems(boolean z11) {
        this.mOverrideVisibleItems = z11;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z11) {
        this.mQwertyMode = z11;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z11) {
        if (this.mShortcutsVisible == z11) {
            return;
        }
        setShortcutsVisibleInner(z11);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    public MenuBuilder(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        setShortcutsVisibleInner(true);
    }

    private static int findInsertIndex(ArrayList<MenuItemImpl> arrayList, int i11) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).getOrdering() <= i11) {
                return size + 1;
            }
        }
        return 0;
    }

    private void setHeaderInternal(int i11, CharSequence charSequence, int i12, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i11 > 0) {
                this.mHeaderTitle = resources.getText(i11);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i12 > 0) {
                this.mHeaderIcon = ContextCompat.getDrawable(getContext(), i12);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, CharSequence charSequence) {
        return addInternal(i11, i12, i13, charSequence);
    }

    public MenuItem addInternal(int i11, int i12, int i13, CharSequence charSequence) {
        int ordering = getOrdering(i13);
        MenuItemImpl menuItemImplCreateNewMenuItem = createNewMenuItem(i11, i12, i13, ordering, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            menuItemImplCreateNewMenuItem.setMenuInfo(contextMenuInfo);
        }
        ArrayList<MenuItemImpl> arrayList = this.mItems;
        arrayList.add(findInsertIndex(arrayList, ordering), menuItemImplCreateNewMenuItem);
        onItemsChanged(true);
        return menuItemImplCreateNewMenuItem;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) addInternal(i11, i12, i13, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.mContext, this, menuItemImpl);
        menuItemImpl.setSubMenu(subMenuBuilder);
        return subMenuBuilder;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i11) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i12);
            if (menuItemImpl.getItemId() == i11) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (menuItemFindItem = menuItemImpl.getSubMenu().findItem(i11)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.mItems.get(i12).getItemId() == i11) {
                return i12;
            }
        }
        return -1;
    }

    public void findItemsWithShortcutForKey(List<MenuItemImpl> list, int i11, KeyEvent keyEvent) {
        char numericShortcut;
        int numericModifiers;
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i11 == 67) {
            int size = this.mItems.size();
            for (int i12 = 0; i12 < size; i12++) {
                MenuItemImpl menuItemImpl = this.mItems.get(i12);
                if (menuItemImpl.hasSubMenu()) {
                    ((MenuBuilder) menuItemImpl.getSubMenu()).findItemsWithShortcutForKey(list, i11, keyEvent);
                }
                if (zIsQwertyMode) {
                    numericShortcut = menuItemImpl.getAlphabeticShortcut();
                } else {
                    numericShortcut = menuItemImpl.getNumericShortcut();
                }
                if (zIsQwertyMode) {
                    numericModifiers = menuItemImpl.getAlphabeticModifiers();
                } else {
                    numericModifiers = menuItemImpl.getNumericModifiers();
                }
                if ((modifiers & SupportMenu.SUPPORTED_MODIFIERS_MASK) == (numericModifiers & SupportMenu.SUPPORTED_MODIFIERS_MASK) && numericShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (zIsQwertyMode && numericShortcut == '\b' && i11 == 67)) && menuItemImpl.isEnabled()) {
                        list.add(menuItemImpl);
                    }
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<MenuItemImpl> visibleItems = getVisibleItems();
        if (!this.mIsActionItemsStale) {
            return;
        }
        boolean zFlagActionItems = false;
        for (WeakReference<MenuPresenter> weakReference : this.mPresenters) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.mPresenters.remove(weakReference);
            } else {
                zFlagActionItems |= menuPresenter.flagActionItems();
            }
        }
        if (zFlagActionItems) {
            this.mActionItems.clear();
            this.mNonActionItems.clear();
            int size = visibleItems.size();
            for (int i11 = 0; i11 < size; i11++) {
                MenuItemImpl menuItemImpl = visibleItems.get(i11);
                if (menuItemImpl.isActionButton()) {
                    this.mActionItems.add(menuItemImpl);
                } else {
                    this.mNonActionItems.add(menuItemImpl);
                }
            }
        } else {
            this.mActionItems.clear();
            this.mNonActionItems.clear();
            this.mNonActionItems.addAll(getVisibleItems());
        }
        this.mIsActionItemsStale = false;
    }

    public ArrayList<MenuItemImpl> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public ArrayList<MenuItemImpl> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i11, KeyEvent keyEvent) {
        if (findItemWithShortcutForKey(i11, keyEvent) != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i11, int i12) {
        return performItemAction(findItem(i11), i12);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i11, KeyEvent keyEvent, int i12) {
        boolean zPerformItemAction;
        MenuItemImpl menuItemImplFindItemWithShortcutForKey = findItemWithShortcutForKey(i11, keyEvent);
        if (menuItemImplFindItemWithShortcutForKey != null) {
            zPerformItemAction = performItemAction(menuItemImplFindItemWithShortcutForKey, i12);
        } else {
            zPerformItemAction = false;
        }
        if ((i12 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i11) {
        int iFindGroupIndex = findGroupIndex(i11);
        if (iFindGroupIndex >= 0) {
            int size = this.mItems.size() - iFindGroupIndex;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= size || this.mItems.get(iFindGroupIndex).getGroupId() != i11) {
                    break;
                }
                removeItemAtInt(iFindGroupIndex, false);
                i12 = i13;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i11) {
        removeItemAtInt(findItemIndex(i11), true);
    }

    public void restorePresenterStates(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = getItem(i11);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        boolean z11;
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItemImpl menuItemImpl = this.mItems.get(i11);
            if (menuItemImpl.getGroupId() == groupId && menuItemImpl.isExclusiveCheckable() && menuItemImpl.isCheckable()) {
                if (menuItemImpl == menuItem) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                menuItemImpl.setCheckedInt(z11);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public MenuItem add(int i11, int i12, int i13, int i14) {
        return addInternal(i11, i12, i13, this.mResources.getString(i14));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i11, int i12, int i13, int i14) {
        return addSubMenu(i11, i12, i13, this.mResources.getString(i14));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public MenuBuilder getRootMenu() {
        return this;
    }
}
