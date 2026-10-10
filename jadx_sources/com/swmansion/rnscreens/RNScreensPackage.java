package com.swmansion.rnscreens;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import com.swmansion.rnscreens.utils.ScreenDummyLayoutHelper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RNScreensPackage.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/swmansion/rnscreens/RNScreensPackage;", "Lcom/facebook/react/BaseReactPackage;", "<init>", "()V", "screenDummyLayoutHelper", "Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;", "createViewManagers", "", "Lcom/facebook/react/uimanager/ViewManager;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getModule", "Lcom/facebook/react/bridge/NativeModule;", CmcdData.Factory.STREAMING_FORMAT_SS, "", "reactApplicationContext", "getReactModuleInfoProvider", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "Companion", "react-native-screens_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class RNScreensPackage extends BaseReactPackage {

    @NotNull
    public static final String TAG = "RNScreensPackage";

    @Nullable
    private ScreenDummyLayoutHelper screenDummyLayoutHelper;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map getReactModuleInfoProvider$lambda$0() {
        HashMap map = new HashMap();
        map.put("RNSModule", new ReactModuleInfo("RNSModule", "RNSModule", false, false, true, false, true));
        return map;
    }

    @Override // com.facebook.react.BaseReactPackage
    @NotNull
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return new ReactModuleInfoProvider() { // from class: com.swmansion.rnscreens.c
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return RNScreensPackage.getReactModuleInfoProvider$lambda$0();
            }
        };
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @NotNull
    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.screenDummyLayoutHelper = new ScreenDummyLayoutHelper(reactContext);
        InsetsObserverProxy.INSTANCE.registerWithContext(reactContext);
        return CollectionsKt.listOf((Object[]) new ViewManager[]{new ScreenContainerViewManager(), new ScreenViewManager(), new ModalScreenViewManager(), new ScreenStackViewManager(), new ScreenStackHeaderConfigViewManager(), new ScreenStackHeaderSubviewManager(), new SearchBarManager(), new ScreenFooterManager(), new ScreenContentWrapperManager()});
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @Nullable
    public NativeModule getModule(@NotNull String s11, @NotNull ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(s11, "s");
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        if (Intrinsics.areEqual(s11, "RNSModule")) {
            return new ScreensModule(reactApplicationContext);
        }
        return null;
    }
}
