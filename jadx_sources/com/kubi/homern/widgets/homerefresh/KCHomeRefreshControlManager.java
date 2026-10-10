package com.kubi.homern.widgets.homerefresh;

import android.view.View;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCHomeRefreshControlManager.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0017H\u0007J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001aH\u0007J\u0014\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020!0 H\u0016¨\u0006#"}, m90084d2 = {"Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshControlManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout;", "<init>", "()V", "getName", "", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "addView", "", "parent", "child", "Landroid/view/View;", "index", "", "getChildCount", "getChildAt", "removeViewAt", "setRefreshing", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "refreshing", "", "setProgressViewOffset", "offsetDp", "", "setSecondFloorEnabled", "enabled", "setSecondFloorTriggerDistance", "distanceDp", "getExportedCustomDirectEventTypeConstants", "", "", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCHomeRefreshControlManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHomeRefreshControlManager.kt\ncom/kubi/homern/widgets/homerefresh/KCHomeRefreshControlManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class KCHomeRefreshControlManager extends ViewGroupManager<KCHomeRefreshLayout> {

    @Deprecated
    @NotNull
    public static final String COMPONENT_NAME = "KCHomeRefreshControl";

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: KCHomeRefreshControlManager.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshControlManager$Companion;", "", "<init>", "()V", "COMPONENT_NAME", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public KCHomeRefreshLayout createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new KCHomeRefreshLayout(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return COMPONENT_NAME;
    }

    @ReactProp(defaultFloat = 0.0f, name = "progressViewOffset")
    public final void setProgressViewOffset(@NotNull KCHomeRefreshLayout view, float offsetDp) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setProgressViewOffsetDp(offsetDp);
    }

    @ReactProp(defaultBoolean = false, name = "refreshing")
    public final void setRefreshing(@NotNull KCHomeRefreshLayout view, boolean refreshing) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRefreshingState(refreshing);
    }

    @ReactProp(defaultBoolean = false, name = "secondFloorEnabled")
    public final void setSecondFloorEnabled(@NotNull KCHomeRefreshLayout view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSecondFloorEnabled(enabled);
    }

    @ReactProp(defaultFloat = 140.0f, name = "secondFloorTriggerDistance")
    public final void setSecondFloorTriggerDistance(@NotNull KCHomeRefreshLayout view, float distanceDp) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSecondFloorTriggerDistanceDp(distanceDp);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(@NotNull KCHomeRefreshLayout parent, @NotNull View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        if (index == 0) {
            parent.m31365k(child);
            return;
        }
        throw new IllegalArgumentException("KCHomeRefreshControl only supports one child");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    @NotNull
    public View getChildAt(@NotNull KCHomeRefreshLayout parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (index != 0) {
            throw new IndexOutOfBoundsException();
        }
        View f27053d = parent.getF27053d();
        if (f27053d != null) {
            return f27053d;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(@NotNull KCHomeRefreshLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getF27053d() == null ? 0 : 1;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> mapBuild = MapBuilder.builder().put("onRefresh", MapBuilder.m10222of("registrationName", "onRefresh")).put("onAttachFailed", MapBuilder.m10222of("registrationName", "onAttachFailed")).put("onPullDistanceChange", MapBuilder.m10222of("registrationName", "onPullDistanceChange")).put("onSecondFloorRelease", MapBuilder.m10222of("registrationName", "onSecondFloorRelease")).build();
        Intrinsics.checkNotNullExpressionValue(mapBuild, "build(...)");
        return mapBuild;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(@NotNull KCHomeRefreshLayout parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (index == 0) {
            parent.m31373v();
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
