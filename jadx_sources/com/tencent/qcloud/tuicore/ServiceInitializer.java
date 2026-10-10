package com.tencent.qcloud.tuicore;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tuicore.annotations.TUIInitializerDependency;
import com.tencent.qcloud.tuicore.annotations.TUIInitializerID;
import com.tencent.qcloud.tuicore.annotations.TUIInitializerPriority;
import com.tencent.qcloud.tuicore.interfaces.TUIInitializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
public class ServiceInitializer extends ContentProvider {
    private static final String TAG = "ServiceInitializer";
    private static Context appContext;
    private static boolean hasInitComponents;

    public static class DependencyNode {
        TUIInitializer initializer;
        int priority;
        Set<DependencyNode> dependencySet = new HashSet();
        Set<DependencyNode> beDependencySet = new HashSet();

        public void addBeDependency(DependencyNode dependencyNode) {
            this.beDependencySet.add(dependencyNode);
        }

        public void addDependency(DependencyNode dependencyNode) {
            this.dependencySet.add(dependencyNode);
        }

        public int beDependencyCount() {
            Set<DependencyNode> set = this.beDependencySet;
            if (set != null) {
                return set.size();
            }
            return 0;
        }

        public int dependencyCount() {
            Set<DependencyNode> set = this.dependencySet;
            if (set != null) {
                return set.size();
            }
            return 0;
        }

        public Set<DependencyNode> getBeDependencySet() {
            return this.beDependencySet;
        }

        public Set<DependencyNode> getDependencySet() {
            return this.dependencySet;
        }

        public void removeBeDependencies(Set<DependencyNode> set) {
            this.beDependencySet.removeAll(set);
        }

        public void removeBeDependency(DependencyNode dependencyNode) {
            this.beDependencySet.remove(dependencyNode);
        }

        public void removeDependency(DependencyNode dependencyNode) {
            this.dependencySet.remove(dependencyNode);
        }

        public DependencyNode(TUIInitializer tUIInitializer) {
            this.initializer = tUIInitializer;
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    private String dumpCircularDependency(List<DependencyNode> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator<DependencyNode> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().initializer.getClass().getSimpleName());
            sb2.append(", ");
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static Context getAppContext() {
        return appContext;
    }

    private List<TUIInitializer> getSortedInitializerList(Map<String, TUIInitializer> map) {
        DependencyNode dependencyNode;
        String[] strArrValue;
        HashMap map2 = new HashMap();
        for (TUIInitializer tUIInitializer : map.values()) {
            map2.put(tUIInitializer, new DependencyNode(tUIInitializer));
        }
        Iterator<Map.Entry<String, TUIInitializer>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, TUIInitializer> next = it.next();
            TUIInitializerDependency tUIInitializerDependency = (TUIInitializerDependency) next.getValue().getClass().getAnnotation(TUIInitializerDependency.class);
            TUIInitializerPriority tUIInitializerPriority = (TUIInitializerPriority) next.getValue().getClass().getAnnotation(TUIInitializerPriority.class);
            DependencyNode dependencyNode2 = (DependencyNode) map2.get(next.getValue());
            dependencyNode2.priority = tUIInitializerPriority != null ? tUIInitializerPriority.value() : 0;
            if (tUIInitializerDependency != null && (strArrValue = tUIInitializerDependency.value()) != null && strArrValue.length != 0) {
                for (String str : strArrValue) {
                    if (!TextUtils.isEmpty(str)) {
                        if (map.containsKey(str)) {
                            DependencyNode dependencyNode3 = (DependencyNode) map2.get(map.get(str));
                            dependencyNode2.addDependency(dependencyNode3);
                            dependencyNode3.addBeDependency(dependencyNode2);
                        } else {
                            Log.w(TAG, next.getKey() + " depends on " + str + ", but " + str + " is not found.");
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(map2.values());
        Comparator comparator = new Comparator() { // from class: com.tencent.qcloud.tuicore.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ServiceInitializer.m77050a((ServiceInitializer.DependencyNode) obj, (ServiceInitializer.DependencyNode) obj2);
            }
        };
        Collections.sort(arrayList, comparator);
        ArrayList arrayList2 = new ArrayList();
        while (!arrayList.isEmpty() && (dependencyNode = arrayList.get(0)) != null && dependencyNode.dependencyCount() == 0) {
            Set<DependencyNode> beDependencySet = dependencyNode.getBeDependencySet();
            Iterator<DependencyNode> it2 = beDependencySet.iterator();
            while (it2.hasNext()) {
                it2.next().removeDependency(dependencyNode);
            }
            dependencyNode.removeBeDependencies(beDependencySet);
            arrayList2.add(dependencyNode.initializer);
            arrayList.remove(0);
            Collections.sort(arrayList, comparator);
        }
        if (arrayList.size() == 0) {
            return arrayList2;
        }
        throw new IllegalStateException("FATAL! TUIInitializer has circular dependency:\n" + dumpCircularDependency(arrayList));
    }

    private void initComponents() {
        ServiceLoader<TUIInitializer> serviceLoaderLoad = ServiceLoader.load(TUIInitializer.class);
        HashMap map = new HashMap();
        for (TUIInitializer tUIInitializer : serviceLoaderLoad) {
            map.put(getInitializerID(tUIInitializer), tUIInitializer);
        }
        List<TUIInitializer> sortedInitializerList = getSortedInitializerList(map);
        StringBuilder sb2 = new StringBuilder();
        Iterator<TUIInitializer> it = sortedInitializerList.iterator();
        while (it.hasNext()) {
            sb2.append(getInitializerID(it.next()));
            sb2.append(C33627eb.f69716f);
        }
        Log.i(TAG, "initialization sequence : " + ((Object) sb2));
        for (TUIInitializer tUIInitializer2 : sortedInitializerList) {
            String initializerID = getInitializerID(tUIInitializer2);
            Log.i(TAG, "start init " + initializerID);
            tUIInitializer2.init(appContext);
            Log.i(TAG, "init " + initializerID + " finished");
        }
    }

    public int getLightThemeResId() {
        return C35071R.style.TUIBaseLightTheme;
    }

    public int getLivelyThemeResId() {
        return C35071R.style.TUIBaseLivelyTheme;
    }

    public int getSeriousThemeResId() {
        return C35071R.style.TUIBaseSeriousTheme;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (appContext == null) {
            appContext = getContext().getApplicationContext();
        }
        TUILogin.init(appContext);
        TUIRouter.init(appContext);
        TUIConfig.init(appContext);
        TUIThemeManager.addLightTheme(getLightThemeResId());
        TUIThemeManager.addLivelyTheme(getLivelyThemeResId());
        TUIThemeManager.addSeriousTheme(getSeriousThemeResId());
        TUIThemeManager.setTheme(appContext);
        if (!hasInitComponents) {
            hasInitComponents = true;
            initComponents();
        }
        init(appContext);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m77050a(DependencyNode dependencyNode, DependencyNode dependencyNode2) {
        if (dependencyNode.dependencyCount() == dependencyNode2.dependencyCount()) {
            return dependencyNode2.priority - dependencyNode.priority;
        }
        return dependencyNode.dependencyCount() - dependencyNode2.dependencyCount();
    }

    private String getInitializerID(TUIInitializer tUIInitializer) {
        TUIInitializerID tUIInitializerID = (TUIInitializerID) tUIInitializer.getClass().getAnnotation(TUIInitializerID.class);
        if (tUIInitializerID != null && !TextUtils.isEmpty(tUIInitializerID.value())) {
            return tUIInitializerID.value();
        }
        return tUIInitializer.getClass().getSimpleName();
    }

    public void init(Context context) {
    }
}
