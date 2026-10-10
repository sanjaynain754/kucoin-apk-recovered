package com.reactnativecommunity.imageeditor;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.reactnativecommunity.imageeditor.d */
/* JADX INFO: compiled from: ImageEditorPackage.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lcom/reactnativecommunity/imageeditor/d;", "Lcom/facebook/react/TurboReactPackage;", "<init>", "()V", "", "name", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "Lcom/facebook/react/bridge/NativeModule;", "getModule", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "getReactModuleInfoProvider", "()Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "react-native-community_image-editor_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class C27499d extends TurboReactPackage {
    @Override // com.facebook.react.BaseReactPackage
    @NotNull
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        final HashMap map = new HashMap();
        Class cls = new Class[]{ImageEditorModule.class}[0];
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            String strName = reactModule.name();
            String strName2 = reactModule.name();
            String name = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            map.put(strName, new ReactModuleInfo(strName2, name, true, reactModule.needsEagerInit(), reactModule.hasConstants(), reactModule.isCxxModule(), TurboModule.class.isAssignableFrom(cls)));
        }
        return new ReactModuleInfoProvider() { // from class: com.reactnativecommunity.imageeditor.c
            @Override // com.facebook.react.module.model.ReactModuleInfoProvider
            public final Map getReactModuleInfos() {
                return C27499d.getReactModuleInfoProvider$lambda$0(map);
            }
        };
    }

    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @Nullable
    public NativeModule getModule(@NotNull String name, @NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.areEqual(name, "RNCImageEditor")) {
            return new ImageEditorModule(reactContext);
        }
        return null;
    }

    public static final Map getReactModuleInfoProvider$lambda$0(Map map) {
        return map;
    }
}
