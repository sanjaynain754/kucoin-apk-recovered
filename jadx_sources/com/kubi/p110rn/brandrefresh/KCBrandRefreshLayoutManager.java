package com.kubi.p110rn.brandrefresh;

import android.view.View;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCBrandRefreshLayoutManager.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0017H\u0007J\u0018\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0014\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¨\u0006!"}, m90084d2 = {"Lcom/kubi/rn/brandrefresh/KCBrandRefreshLayoutManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/kubi/rn/brandrefresh/KCBrandRefreshLayout;", "<init>", "()V", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "addView", "", "parent", "child", "Landroid/view/View;", "index", "", "getChildCount", "getChildAt", "removeViewAt", "setRefreshing", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "refreshing", "", "setEnabled", "enabled", "setProgressViewOffset", "offsetDp", "", "getExportedCustomDirectEventTypeConstants", "", "", "Companion", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCBrandRefreshLayoutManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCBrandRefreshLayoutManager.kt\ncom/kubi/rn/brandrefresh/KCBrandRefreshLayoutManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"})
public final class KCBrandRefreshLayoutManager extends ViewGroupManager<KCBrandRefreshLayout> {

    @NotNull
    public static final String COMPONENT_NAME = "KCBrandRefreshLayout";

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public KCBrandRefreshLayout createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new KCBrandRefreshLayout(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return COMPONENT_NAME;
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public final void setEnabled(@NotNull KCBrandRefreshLayout view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnableRefresh(enabled);
    }

    @ReactProp(defaultFloat = 0.0f, name = "progressViewOffset")
    public final void setProgressViewOffset(@NotNull KCBrandRefreshLayout view, float offsetDp) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setProgressViewOffsetDp(offsetDp);
    }

    @ReactProp(defaultBoolean = false, name = "refreshing")
    public final void setRefreshing(@NotNull KCBrandRefreshLayout view, boolean refreshing) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRefreshingState(refreshing);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull KCBrandRefreshLayout parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (index == 0) {
            parent.addReactContent$BReactNativeLib_googleRelease(child);
            return;
        }
        throw new IllegalArgumentException(("KCBrandRefreshLayout only supports child index 0, actual=" + index).toString());
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    @NotNull
    public View getChildAt(@NotNull KCBrandRefreshLayout parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (index == 0) {
            View registeredContent = parent.getRegisteredContent();
            if (registeredContent != null) {
                return registeredContent;
            }
            throw new IndexOutOfBoundsException("KCBrandRefreshLayout has no RN content");
        }
        throw new IndexOutOfBoundsException("KCBrandRefreshLayout child index=" + index);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(@NotNull KCBrandRefreshLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getRegisteredContent() == null ? 0 : 1;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topRefresh", MapsKt.mutableMapOf(TuplesKt.m90091to("registrationName", "onRefresh")));
        exportedCustomDirectEventTypeConstants.put("topAttachFailed", MapsKt.mutableMapOf(TuplesKt.m90091to("registrationName", "onAttachFailed")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull KCBrandRefreshLayout parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (index == 0 && parent.getRegisteredContent() != null) {
            parent.removeReactContent$BReactNativeLib_googleRelease();
            return;
        }
        throw new IndexOutOfBoundsException("KCBrandRefreshLayout child index=" + index);
    }
}
