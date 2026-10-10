package com.reactnativecommunity.imageeditor;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ImageEditorModule.kt */
/* JADX INFO: loaded from: classes59.dex */
@ReactModule(name = "RNCImageEditor")
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/reactnativecommunity/imageeditor/ImageEditorModule;", "Lcom/reactnativecommunity/imageeditor/NativeRNCImageEditorSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "moduleImpl", "Lcom/reactnativecommunity/imageeditor/ImageEditorModuleImpl;", "getName", "", "invalidate", "", "cropImage", "uri", "cropData", "Lcom/facebook/react/bridge/ReadableMap;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "Companion", "react-native-community_image-editor_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ImageEditorModule extends NativeRNCImageEditorSpec {

    @NotNull
    public static final String NAME = "RNCImageEditor";

    @NotNull
    private final ImageEditorModuleImpl moduleImpl;

    @Override // com.reactnativecommunity.imageeditor.NativeRNCImageEditorSpec, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "RNCImageEditor";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.moduleImpl.m68120n();
        super.invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageEditorModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.moduleImpl = new ImageEditorModuleImpl(reactContext);
    }

    @Override // com.reactnativecommunity.imageeditor.NativeRNCImageEditorSpec
    public void cropImage(@NotNull String uri, @NotNull ReadableMap cropData, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(cropData, "cropData");
        Intrinsics.checkNotNullParameter(promise, "promise");
        this.moduleImpl.m68118l(uri, cropData, promise);
    }
}
