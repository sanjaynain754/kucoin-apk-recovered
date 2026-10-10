package com.facebook.react.uimanager;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManager;
import java.util.List;

/* JADX INFO: loaded from: classes45.dex */
public class ReanimatedUIImplementation extends UIImplementation {
    public ReanimatedUIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerResolver viewManagerResolver, EventDispatcher eventDispatcher, int i11) {
        this(reactApplicationContext, new ViewManagerRegistry(viewManagerResolver), eventDispatcher, i11);
    }

    public ReanimatedUIImplementation(ReactApplicationContext reactApplicationContext, List<ViewManager> list, EventDispatcher eventDispatcher, int i11) {
        this(reactApplicationContext, new ViewManagerRegistry(list), eventDispatcher, i11);
    }

    public ReanimatedUIImplementation(ReactApplicationContext reactApplicationContext, ViewManagerRegistry viewManagerRegistry, EventDispatcher eventDispatcher, int i11) {
        super(reactApplicationContext, viewManagerRegistry, new UIViewOperationQueue(reactApplicationContext, new ReanimatedNativeHierarchyManager(viewManagerRegistry, reactApplicationContext), i11), eventDispatcher);
    }

    @Override // com.facebook.react.uimanager.UIImplementation
    public void manageChildren(int i11, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        super.manageChildren(i11, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }
}
