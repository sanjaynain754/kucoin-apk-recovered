package com.sensorsdata.analytics.android.sdk.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.TimeModel;
import com.sensorsdata.analytics.android.sdk.AppStateManager;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.visual.model.ViewNode;
import com.sensorsdata.analytics.android.sdk.visual.util.VisualUtil;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C34054z6;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: loaded from: classes59.dex */
public class ViewUtil {
    private static LruCache<Class, String> sClassNameCache;
    private static boolean sHaveCustomRecyclerView;
    private static boolean sHaveRecyclerView = haveRecyclerView();
    private static Class sRecyclerViewClass;
    private static Method sRecyclerViewGetChildAdapterPositionMethod;
    private static SparseArray sViewCache;

    public static ViewNode getViewContentAndType(View view) {
        return getViewContentAndType(view, false);
    }

    public static ViewNode getViewPathAndPosition(View view) {
        return getViewPathAndPosition(view, false);
    }

    private static boolean haveRecyclerView() {
        try {
            try {
                int i11 = RecyclerView.HORIZONTAL;
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        } catch (ClassNotFoundException unused2) {
            int i12 = RecyclerView.HORIZONTAL;
            return true;
        }
    }

    @SuppressLint({"NewApi"})
    public static void invalidateLayerTypeView(View[] viewArr) {
        for (View view : viewArr) {
            if (viewVisibilityInParents(view) && view.isHardwareAccelerated()) {
                checkAndInvalidate(view);
                if (view instanceof ViewGroup) {
                    invalidateViewGroup((ViewGroup) view);
                }
            }
        }
    }

    private static void invalidateViewGroup(ViewGroup viewGroup) {
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (isViewSelfVisible(childAt)) {
                checkAndInvalidate(childAt);
                if (childAt instanceof ViewGroup) {
                    invalidateViewGroup((ViewGroup) childAt);
                }
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean isViewSelfVisible(View view) {
        if (view != null && view.getWindowVisibility() != 8) {
            if (WindowHelper.isDecorView(view.getClass())) {
                return true;
            }
            if (view.getWidth() > 0 && view.getHeight() > 0 && view.getAlpha() > 0.0f && view.getLocalVisibleRect(new Rect())) {
                return !(view.getVisibility() == 0 || view.getAnimation() == null || !view.getAnimation().getFillAfter()) || view.getVisibility() == 0;
            }
        }
        return false;
    }

    private static boolean viewVisibilityInParents(View view) {
        if (view == null || !isViewSelfVisible(view)) {
            return false;
        }
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            if (!isViewSelfVisible((View) parent) || (parent = parent.getParent()) == null) {
                return false;
            }
        }
        return true;
    }

    @TargetApi(12)
    private static void checkCustomRecyclerView(Class<?> cls, String str) {
        if (sHaveRecyclerView || sHaveCustomRecyclerView || str == null || !str.contains("RecyclerView")) {
            return;
        }
        try {
            if (findRecyclerInSuper(cls) == null || sRecyclerViewGetChildAdapterPositionMethod == null) {
                return;
            }
            sRecyclerViewClass = cls;
            sHaveCustomRecyclerView = true;
        } catch (Exception unused) {
        }
    }

    public static void clear() {
        SparseArray sparseArray = sViewCache;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    private static Class<?> findRecyclerInSuper(Class<?> cls) {
        while (cls != null && !cls.equals(ViewGroup.class)) {
            try {
                sRecyclerViewGetChildAdapterPositionMethod = cls.getDeclaredMethod("getChildAdapterPosition", View.class);
            } catch (NoSuchMethodException unused) {
            }
            if (sRecyclerViewGetChildAdapterPositionMethod == null) {
                try {
                    sRecyclerViewGetChildAdapterPositionMethod = cls.getDeclaredMethod("getChildPosition", View.class);
                } catch (NoSuchMethodException unused2) {
                }
            }
            if (sRecyclerViewGetChildAdapterPositionMethod != null) {
                return cls;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    private static String getCanonicalName(Class cls) {
        if (sClassNameCache == null) {
            sClassNameCache = new LruCache<>(100);
        }
        String str = sClassNameCache.get(cls);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String canonicalName = cls.getCanonicalName();
        if (TextUtils.isEmpty(canonicalName)) {
            canonicalName = "Anonymous";
        }
        synchronized (ViewUtil.class) {
            sClassNameCache.put(cls, canonicalName);
        }
        checkCustomRecyclerView(cls, canonicalName);
        return canonicalName;
    }

    private static int getChildAdapterPositionInRecyclerView(View view, ViewGroup viewGroup) {
        Object objInvoke;
        if (!instanceOfRecyclerView(viewGroup)) {
            if (sHaveCustomRecyclerView) {
                return invokeCRVGetChildAdapterPositionMethod(viewGroup, view);
            }
            return -1;
        }
        try {
            sRecyclerViewGetChildAdapterPositionMethod = viewGroup.getClass().getDeclaredMethod("getChildAdapterPosition", View.class);
        } catch (NoSuchMethodException unused) {
        }
        if (sRecyclerViewGetChildAdapterPositionMethod == null) {
            try {
                sRecyclerViewGetChildAdapterPositionMethod = viewGroup.getClass().getDeclaredMethod("getChildPosition", View.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        try {
            Method method = sRecyclerViewGetChildAdapterPositionMethod;
            if (method == null || (objInvoke = method.invoke(viewGroup, view)) == null) {
                return -1;
            }
            return ((Integer) objInvoke).intValue();
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return -1;
        }
    }

    public static String getElementSelector(View view) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        do {
            ViewParent parent = view.getParent();
            arrayList.add(view.getClass().getCanonicalName() + "[" + VisualUtil.getChildIndex(parent, view) + "]");
            z11 = parent instanceof ViewGroup;
            if (z11) {
                view = (ViewGroup) parent;
            }
        } while (z11);
        Collections.reverse(arrayList);
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 1; i11 < arrayList.size(); i11++) {
            sb2.append((String) arrayList.get(i11));
            if (i11 != arrayList.size() - 1) {
                sb2.append("/");
            }
        }
        return sb2.toString();
    }

    private static String getTabLayoutContent(Object obj) {
        String string = null;
        try {
            Class<?> currentClass = ReflectUtil.getCurrentClass(new String[]{"com.google.android.material.tabs.TabLayout$Tab", "com.google.android.material.tabs.TabLayout$Tab"});
            if (currentClass != null) {
                Object objCallMethod = ReflectUtil.callMethod(obj, "getText", new Object[0]);
                string = objCallMethod != null ? objCallMethod.toString() : null;
                View view = (View) ReflectUtil.findField(currentClass, obj, "mCustomView", "customView");
                if (view != null) {
                    StringBuilder sb2 = new StringBuilder();
                    if (!(view instanceof ViewGroup)) {
                        return AopUtil.getViewText(view);
                    }
                    String strTraverseView = AopUtil.traverseView(sb2, (ViewGroup) view);
                    return !TextUtils.isEmpty(strTraverseView) ? strTraverseView.toString().substring(0, strTraverseView.length() - 1) : strTraverseView;
                }
            }
        } catch (Exception unused) {
        }
        return string;
    }

    public static ViewNode getViewContentAndType(View view, boolean z11) {
        CharSequence contentDescription;
        Exception e11;
        String canonicalName = view.getClass().getCanonicalName();
        if (view instanceof CheckBox) {
            canonicalName = AopUtil.getViewType(canonicalName, "CheckBox");
            contentDescription = ((CheckBox) view).getText();
        } else if (view instanceof RadioButton) {
            canonicalName = AopUtil.getViewType(canonicalName, "RadioButton");
            contentDescription = ((RadioButton) view).getText();
        } else if (view instanceof ToggleButton) {
            canonicalName = AopUtil.getViewType(canonicalName, "ToggleButton");
            contentDescription = AopUtil.getCompoundButtonText(view);
        } else if (view instanceof CompoundButton) {
            canonicalName = AopUtil.getViewTypeByReflect(view);
            contentDescription = AopUtil.getCompoundButtonText(view);
        } else if (view instanceof Button) {
            canonicalName = AopUtil.getViewType(canonicalName, "Button");
            contentDescription = ((Button) view).getText();
        } else if (view instanceof CheckedTextView) {
            canonicalName = AopUtil.getViewType(canonicalName, "CheckedTextView");
            contentDescription = ((CheckedTextView) view).getText();
        } else if (view instanceof TextView) {
            canonicalName = AopUtil.getViewType(canonicalName, "TextView");
            contentDescription = ((TextView) view).getText();
        } else {
            String str = null;
            if (view instanceof ImageView) {
                canonicalName = AopUtil.getViewType(canonicalName, "ImageView");
                ImageView imageView = (ImageView) view;
                contentDescription = !TextUtils.isEmpty(imageView.getContentDescription()) ? imageView.getContentDescription().toString() : str;
            } else if (view instanceof RatingBar) {
                canonicalName = AopUtil.getViewType(canonicalName, "RatingBar");
                contentDescription = String.valueOf(((RatingBar) view).getRating());
            } else if (view instanceof SeekBar) {
                canonicalName = AopUtil.getViewType(canonicalName, "SeekBar");
                contentDescription = String.valueOf(((SeekBar) view).getProgress());
            } else if (view instanceof Spinner) {
                canonicalName = AopUtil.getViewType(canonicalName, "Spinner");
                try {
                    contentDescription = AopUtil.traverseView(new StringBuilder(), (ViewGroup) view);
                    try {
                        if (!TextUtils.isEmpty(contentDescription)) {
                            contentDescription = contentDescription.toString().substring(0, contentDescription.length() - 1);
                        }
                    } catch (Exception e12) {
                        e11 = e12;
                        SALog.printStackTrace(e11);
                    }
                } catch (Exception e13) {
                    e11 = e13;
                    contentDescription = null;
                }
            } else {
                Object objInstanceOfTabView = instanceOfTabView(view);
                if (objInstanceOfTabView != null) {
                    contentDescription = getTabLayoutContent(objInstanceOfTabView);
                    canonicalName = AopUtil.getViewType(canonicalName, "TabLayout");
                } else {
                    if (instanceOfBottomNavigationItemView(view)) {
                        Object itemData = getItemData(view);
                        if (itemData != null) {
                            try {
                                Class<?> currentClass = ReflectUtil.getCurrentClass(new String[]{"androidx.appcompat.view.menu.MenuItemImpl"});
                                if (currentClass != null) {
                                    String str2 = (String) ReflectUtil.findField(currentClass, itemData, C34054z6.f72610i);
                                    if (!TextUtils.isEmpty(str2)) {
                                        str = str2;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } else if (instanceOfNavigationView(view)) {
                        contentDescription = isViewSelfVisible(view) ? "Open" : "Close";
                        canonicalName = AopUtil.getViewType(canonicalName, "NavigationView");
                    } else if (view instanceof ViewGroup) {
                        canonicalName = AopUtil.getViewGroupTypeByReflect(view);
                        contentDescription = view.getContentDescription();
                        if (TextUtils.isEmpty(contentDescription)) {
                            try {
                                contentDescription = AopUtil.traverseView(new StringBuilder(), (ViewGroup) view);
                                if (!TextUtils.isEmpty(contentDescription)) {
                                    contentDescription = contentDescription.toString().substring(0, contentDescription.length() - 1);
                                }
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
        }
        if (TextUtils.isEmpty(contentDescription) && (view instanceof TextView)) {
            contentDescription = ((TextView) view).getHint();
        }
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = view.getContentDescription();
        }
        if (view instanceof EditText) {
            contentDescription = z11 ? ((EditText) view).getText() : "";
        }
        return new ViewNode((TextUtils.isEmpty(contentDescription) ? "" : contentDescription).toString(), canonicalName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ViewNode getViewNode(View view, int i11, boolean z11) {
        String str;
        boolean z12;
        boolean z13;
        int viewPosition = getViewPosition(view, i11);
        ViewParent parent = view.getParent();
        String str2 = null;
        if (parent == 0) {
            return null;
        }
        if ((WindowHelper.isDecorView(view.getClass()) && !(parent instanceof View)) || !(parent instanceof View)) {
            return null;
        }
        View view2 = (View) parent;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String canonicalName = getCanonicalName(view.getClass());
        Object parent2 = view2.getParent();
        if (parent2 instanceof View) {
            View view3 = (View) parent2;
            if (sViewCache == null) {
                sViewCache = new SparseArray();
            }
            String str3 = (String) sViewCache.get(view3.hashCode());
            if (!TextUtils.isEmpty(str3)) {
                str2 = str3;
            }
        }
        if (view2 instanceof ExpandableListView) {
            ExpandableListView expandableListView = (ExpandableListView) view2;
            long expandableListPosition = expandableListView.getExpandableListPosition(viewPosition);
            if (ExpandableListView.getPackedPositionType(expandableListPosition) != 2) {
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(expandableListPosition);
                int packedPositionChild = ExpandableListView.getPackedPositionChild(expandableListPosition);
                if (packedPositionChild != -1) {
                    str2 = String.format(Locale.CHINA, "%d:%d", Integer.valueOf(packedPositionGroup), Integer.valueOf(packedPositionChild));
                    sb3.append((CharSequence) sb2);
                    sb3.append("/ELVG[");
                    sb3.append(packedPositionGroup);
                    sb3.append("]/ELVC[-]/");
                    sb3.append(canonicalName);
                    sb3.append("[0]");
                    sb2.append("/ELVG[");
                    sb2.append(packedPositionGroup);
                    sb2.append("]/ELVC[");
                    sb2.append(packedPositionChild);
                    sb2.append("]/");
                    sb2.append(canonicalName);
                    sb2.append("[0]");
                } else {
                    String str4 = String.format(Locale.CHINA, TimeModel.NUMBER_FORMAT, Integer.valueOf(packedPositionGroup));
                    sb3.append((CharSequence) sb2);
                    sb3.append("/ELVG[-]/");
                    sb3.append(canonicalName);
                    sb3.append("[0]");
                    sb2.append("/ELVG[");
                    sb2.append(packedPositionGroup);
                    sb2.append("]/");
                    sb2.append(canonicalName);
                    sb2.append("[0]");
                    str2 = str4;
                }
                z13 = true;
            } else {
                if (viewPosition < expandableListView.getHeaderViewsCount()) {
                    sb2.append("/ELH[");
                    sb2.append(viewPosition);
                    sb2.append("]/");
                    sb2.append(canonicalName);
                    sb2.append("[0]");
                    sb3.append("/ELH[");
                    sb3.append(viewPosition);
                    sb3.append("]/");
                    sb3.append(canonicalName);
                    sb3.append("[0]");
                } else {
                    int count = viewPosition - (expandableListView.getCount() - expandableListView.getFooterViewsCount());
                    sb2.append("/ELF[");
                    sb2.append(count);
                    sb2.append("]/");
                    sb2.append(canonicalName);
                    sb2.append("[0]");
                    sb3.append("/ELF[");
                    sb3.append(count);
                    sb3.append("]/");
                    sb3.append(canonicalName);
                    sb3.append("[0]");
                }
                z13 = false;
            }
            str = str2;
            z12 = z13;
        } else if (isListView(view2)) {
            String str5 = String.format(Locale.CHINA, TimeModel.NUMBER_FORMAT, Integer.valueOf(viewPosition));
            sb3.append((CharSequence) sb2);
            sb3.append("/");
            sb3.append(canonicalName);
            sb3.append("[-]");
            sb2.append("/");
            sb2.append(canonicalName);
            sb2.append("[");
            sb2.append(str5);
            sb2.append("]");
            str = str5;
            z12 = true;
        } else {
            if (instanceOfSupportSwipeRefreshLayout(view2)) {
                sb2.append("/");
                sb2.append(canonicalName);
                sb2.append("[0]");
                sb3.append("/");
                sb3.append(canonicalName);
                sb3.append("[0]");
            } else {
                Object objInstanceOfFragmentRootView = instanceOfFragmentRootView(view2, view);
                if (objInstanceOfFragmentRootView != null) {
                    String canonicalName2 = getCanonicalName(objInstanceOfFragmentRootView.getClass());
                    sb2.append("/");
                    sb2.append(canonicalName2);
                    sb2.append("[0]");
                    sb3.append("/");
                    sb3.append(canonicalName2);
                    sb3.append("[0]");
                } else {
                    int childIndex = VisualUtil.getChildIndex(parent, view);
                    sb2.append("/");
                    sb2.append(canonicalName);
                    sb2.append("[");
                    sb2.append(childIndex);
                    sb2.append("]");
                    sb3.append("/");
                    sb3.append(canonicalName);
                    sb3.append("[");
                    sb3.append(childIndex);
                    sb3.append("]");
                }
            }
            str = str2;
            z12 = false;
        }
        if (WindowHelper.isDecorView(view2.getClass())) {
            if (sb2.length() > 0) {
                sb2.deleteCharAt(0);
            }
            if (sb3.length() > 0) {
                sb3.deleteCharAt(0);
            }
        }
        if (!TextUtils.isEmpty(str)) {
            if (sViewCache == null) {
                sViewCache = new SparseArray();
            }
            sViewCache.put(view2.hashCode(), str);
        }
        ViewNode viewContentAndType = getViewContentAndType(view, z11);
        return new ViewNode(view, str, sb2.toString(), sb3.toString(), viewContentAndType.getViewContent(), viewContentAndType.getViewType(), z12);
    }

    public static ViewNode getViewPathAndPosition(View view, boolean z11) {
        int iIndexOf;
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(view);
        for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            arrayList.add((ViewGroup) parent);
        }
        int size = arrayList.size();
        View view2 = (View) arrayList.get(size - 1);
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String viewPosition = null;
        if (!(view2 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        String viewContent = null;
        for (int i11 = size - 2; i11 >= 0; i11--) {
            View view3 = (View) arrayList.get(i11);
            ViewNode viewNode = getViewNode(view3, viewGroup.indexOfChild(view3), z11);
            if (viewNode != null) {
                if (!TextUtils.isEmpty(viewNode.getViewPath()) && viewNode.getViewPath().contains(C33820nf.f71144W) && !TextUtils.isEmpty(viewPosition) && (iIndexOf = sb3.indexOf(C33820nf.f71144W)) != -1) {
                    sb3.replace(iIndexOf, iIndexOf + 1, String.valueOf(viewPosition));
                }
                sb2.append(viewNode.getViewOriginalPath());
                sb3.append(viewNode.getViewPath());
                viewPosition = viewNode.getViewPosition();
                viewContent = viewNode.getViewContent();
            }
            if (!(view3 instanceof ViewGroup)) {
                break;
            }
            viewGroup = (ViewGroup) view3;
        }
        return new ViewNode(view, viewPosition, sb2.toString(), sb3.toString(), viewContent);
    }

    public static boolean instanceOfActionMenuItem(Object obj) {
        return ReflectUtil.isInstance(obj, "androidx.appcompat.view.menu.ActionMenuItem");
    }

    public static boolean instanceOfAndroidXListMenuItemView(Object obj) {
        return ReflectUtil.isInstance(obj, "androidx.appcompat.view.menu.ListMenuItemView");
    }

    private static boolean instanceOfAndroidXViewPager(Object obj) {
        return ReflectUtil.isInstance(obj, "androidx.viewpager.widget.ViewPager");
    }

    public static boolean instanceOfBottomNavigationItemView(Object obj) {
        return ReflectUtil.isInstance(obj, "com.google.android.material.bottomnavigation.BottomNavigationItemView", "com.google.android.material.internal.NavigationMenuItemView");
    }

    private static boolean instanceOfNavigationView(Object obj) {
        return ReflectUtil.isInstance(obj, "com.google.android.material.navigation.NavigationView", "com.google.android.material.navigation.NavigationView");
    }

    public static boolean instanceOfRecyclerView(Object obj) {
        Class cls;
        boolean zIsInstance = ReflectUtil.isInstance(obj, "androidx.recyclerview.widget.RecyclerView", "androidx.recyclerview.widget.RecyclerView");
        if (zIsInstance) {
            return zIsInstance;
        }
        return sHaveCustomRecyclerView && obj != null && (cls = sRecyclerViewClass) != null && cls.isAssignableFrom(obj.getClass());
    }

    public static boolean instanceOfSupportListMenuItemView(Object obj) {
        return ReflectUtil.isInstance(obj, "androidx.appcompat.view.menu.ListMenuItemView");
    }

    private static boolean instanceOfSupportSwipeRefreshLayout(Object obj) {
        return ReflectUtil.isInstance(obj, "androidx.swiperefreshlayout.widget.SwipeRefreshLayout", "androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
    }

    private static boolean instanceOfSupportViewPager(Object obj) {
        return ReflectUtil.isInstance(obj, "androidx.viewpager.widget.ViewPager");
    }

    private static Object instanceOfTabView(View view) {
        try {
            Class<?> currentClass = ReflectUtil.getCurrentClass(new String[]{"com.google.android.material.tabs.TabLayout$TabView", "com.google.android.material.tabs.TabLayout$TabView"});
            if (currentClass == null || !currentClass.isAssignableFrom(view.getClass())) {
                return null;
            }
            return ReflectUtil.findField(currentClass, view, "mTab", "tab");
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean instanceOfToolbar(Object obj) {
        return ReflectUtil.isInstance(obj, "androidx.appcompat.widget.Toolbar", "androidx.appcompat.widget.Toolbar", "android.widget.Toolbar");
    }

    private static boolean instanceOfUCWebView(Object obj) {
        return ReflectUtil.isInstance(obj, "com.alipay.mobile.nebulauc.impl.UCWebView$WebViewEx");
    }

    public static boolean instanceOfWebView(Object obj) {
        return (obj instanceof WebView) || instanceOfX5WebView(obj) || instanceOfUCWebView(obj);
    }

    public static boolean instanceOfX5WebView(Object obj) {
        return ReflectUtil.isInstance(obj, "com.tencent.smtt.sdk.WebView");
    }

    private static boolean isListView(View view) {
        return (view instanceof AdapterView) || instanceOfRecyclerView(view) || instanceOfAndroidXViewPager(view) || instanceOfSupportViewPager(view);
    }

    public static boolean isTrackEvent(View view, boolean z11) {
        if (view instanceof CheckBox) {
            if (!z11) {
                return false;
            }
        } else if (view instanceof RadioButton) {
            if (!z11) {
                return false;
            }
        } else if (view instanceof ToggleButton) {
            if (!z11) {
                return false;
            }
        } else if ((view instanceof CompoundButton) && !z11) {
            return false;
        }
        return !(view instanceof RatingBar) || z11;
    }

    @SuppressLint({"NewApi"})
    private static void checkAndInvalidate(View view) {
        if (view.getLayerType() != 0) {
            view.invalidate();
        }
    }

    private static int getCurrentItem(View view) {
        try {
            Object objInvoke = view.getClass().getMethod("getCurrentItem", new Class[0]).invoke(view, new Object[0]);
            if (objInvoke != null) {
                return ((Integer) objInvoke).intValue();
            }
            return -1;
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return -1;
        }
    }

    public static Object getItemData(View view) {
        try {
            return view.getClass().getMethod("getItemData", new Class[0]).invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static int getMainWindowCount(View[] viewArr) {
        WindowHelper.init();
        int i11 = 0;
        for (View view : viewArr) {
            if (view != null) {
                i11 += WindowHelper.getWindowPrefix(view).equals(WindowHelper.getMainWindowPrefix()) ? 1 : 0;
            }
        }
        return i11;
    }

    private static int getViewPosition(View view, int i11) {
        int childAdapterPositionInRecyclerView;
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (!instanceOfAndroidXViewPager(viewGroup) && !instanceOfSupportViewPager(viewGroup)) {
                if (viewGroup instanceof AdapterView) {
                    return i11 + ((AdapterView) viewGroup).getFirstVisiblePosition();
                }
                if (instanceOfRecyclerView(viewGroup) && (childAdapterPositionInRecyclerView = getChildAdapterPositionInRecyclerView(view, viewGroup)) >= 0) {
                    return childAdapterPositionInRecyclerView;
                }
            } else {
                return getCurrentItem(viewGroup);
            }
        }
        return i11;
    }

    private static Object instanceOfFragmentRootView(View view, View view2) {
        Object fragmentFromView = AopUtil.getFragmentFromView(view);
        Object fragmentFromView2 = AopUtil.getFragmentFromView(view2);
        if (fragmentFromView == null && fragmentFromView2 != null) {
            return fragmentFromView2;
        }
        return null;
    }

    private static int invokeCRVGetChildAdapterPositionMethod(View view, View view2) {
        try {
            if (view.getClass() == sRecyclerViewClass) {
                return ((Integer) sRecyclerViewGetChildAdapterPositionMethod.invoke(view, view2)).intValue();
            }
            return -1;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return -1;
        }
    }

    public static boolean isWindowNeedTraverse(View view, String str, boolean z11) {
        if (view.hashCode() == AppStateManager.getInstance().getCurrentRootWindowsHashCode()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            if (!z11) {
                return true;
            }
            if (view.getWindowVisibility() != 8 && view.getVisibility() == 0 && !TextUtils.equals(str, WindowHelper.getMainWindowPrefix()) && view.getWidth() != 0 && view.getHeight() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
