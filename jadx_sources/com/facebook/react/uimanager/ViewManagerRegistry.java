package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public final class ViewManagerRegistry implements ComponentCallbacks2 {

    @Nullable
    private final ViewManagerResolver mViewManagerResolver;
    private final Map<String, ViewManager> mViewManagers;

    public ViewManagerRegistry(ViewManagerResolver viewManagerResolver) {
        this.mViewManagers = MapBuilder.newHashMap();
        this.mViewManagerResolver = viewManagerResolver;
    }

    public synchronized ViewManager get(String str) {
        try {
            ViewManager viewManager = this.mViewManagers.get(str);
            if (viewManager != null) {
                return viewManager;
            }
            String str2 = "RCT" + str;
            ViewManager viewManager2 = this.mViewManagers.get(str2);
            if (viewManager2 != null) {
                return viewManager2;
            }
            if (this.mViewManagerResolver == null) {
                throw new IllegalViewOperationException("No ViewManager found for class " + str);
            }
            ViewManager viewManagerFromResolver = getViewManagerFromResolver(str);
            if (viewManagerFromResolver != null) {
                return viewManagerFromResolver;
            }
            ViewManager viewManagerFromResolver2 = getViewManagerFromResolver(str2);
            if (viewManagerFromResolver2 != null) {
                return viewManagerFromResolver2;
            }
            throw new IllegalViewOperationException("ViewManagerResolver returned null for either " + str + " or " + str2 + ", existing names are: " + this.mViewManagerResolver.getViewManagerNames());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Nullable
    public synchronized ViewManager getViewManagerIfExists(String str) {
        ViewManager viewManager = this.mViewManagers.get(str);
        if (viewManager != null) {
            return viewManager;
        }
        if (this.mViewManagerResolver == null) {
            return null;
        }
        return getViewManagerFromResolver(str);
    }

    public void invalidate() {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.mViewManagers.values());
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.uimanager.m0
            @Override // java.lang.Runnable
            public final void run() {
                ViewManagerRegistry.m10512b(arrayList);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        onTrimMemory(0);
    }

    public void onSurfaceStopped(final int i11) {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.mViewManagers.values());
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.uimanager.n0
            @Override // java.lang.Runnable
            public final void run() {
                ViewManagerRegistry.m10511a(arrayList, i11);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        final ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.mViewManagers.values());
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.react.uimanager.ViewManagerRegistry.1
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ViewManager) it.next()).trimMemory();
                }
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    @Nullable
    private ViewManager getViewManagerFromResolver(String str) {
        ViewManager viewManager = this.mViewManagerResolver.getViewManager(str);
        if (viewManager != null) {
            this.mViewManagers.put(str, viewManager);
        }
        return viewManager;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10511a(List list, int i11) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).onSurfaceStopped(i11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10512b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).invalidate();
        }
    }

    public ViewManagerRegistry(List<ViewManager> list) {
        HashMap mapNewHashMap = MapBuilder.newHashMap();
        for (ViewManager viewManager : list) {
            mapNewHashMap.put(viewManager.getName(), viewManager);
        }
        this.mViewManagers = mapNewHashMap;
        this.mViewManagerResolver = null;
    }

    public ViewManagerRegistry(Map<String, ViewManager> map) {
        this.mViewManagers = map == null ? MapBuilder.newHashMap() : map;
        this.mViewManagerResolver = null;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
