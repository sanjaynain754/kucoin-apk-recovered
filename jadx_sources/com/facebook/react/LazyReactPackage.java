package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p053c7.C4858a;

/* JADX INFO: loaded from: classes45.dex */
@Deprecated(since = "This class is deprecated, please use BaseReactPackage instead.")
public abstract class LazyReactPackage implements ReactPackage {
    public abstract List<ModuleSpec> getNativeModules(ReactApplicationContext reactApplicationContext);

    public abstract ReactModuleInfoProvider getReactModuleInfoProvider();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterator lambda$getNativeModuleIterator$0(final List list, final Map map) {
        return new Iterator<ModuleHolder>() { // from class: com.facebook.react.LazyReactPackage.1
            int position = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.position < list.size();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public ModuleHolder next() {
                List list2 = list;
                int i11 = this.position;
                this.position = i11 + 1;
                ModuleSpec moduleSpec = (ModuleSpec) list2.get(i11);
                String name = moduleSpec.getName();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) map.get(name);
                if (reactModuleInfo != null) {
                    return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
                }
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
                try {
                    return new ModuleHolder(moduleSpec.getProvider().get());
                } finally {
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove native modules from the list");
            }
        };
    }

    @Override // com.facebook.react.ReactPackage
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : getNativeModules(reactApplicationContext)) {
            C4858a.m4990a(0L, "createNativeModule").mo4994c();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
            try {
                NativeModule nativeModule = moduleSpec.getProvider().get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                C4858a.m4991b(0L).mo4994c();
                arrayList.add(nativeModule);
            } catch (Throwable th2) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                C4858a.m4991b(0L).mo4994c();
                throw th2;
            }
        }
        return arrayList;
    }

    public List<ModuleSpec> getViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> viewManagers = getViewManagers(reactApplicationContext);
        if (viewManagers != null && !viewManagers.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<ModuleSpec> it = viewManagers.iterator();
            while (it.hasNext()) {
                arrayList.add((ViewManager) it.next().getProvider().get());
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    public Iterable<ModuleHolder> getNativeModuleIterator(ReactApplicationContext reactApplicationContext) {
        final Map<String, ReactModuleInfo> reactModuleInfos = getReactModuleInfoProvider().getReactModuleInfos();
        final List<ModuleSpec> nativeModules = getNativeModules(reactApplicationContext);
        return new Iterable() { // from class: com.facebook.react.d
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return this.f9702b.lambda$getNativeModuleIterator$0(nativeModules, reactModuleInfos);
            }
        };
    }
}
