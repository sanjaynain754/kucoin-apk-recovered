package com.facebook.react.views.text.frescosupport;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import p392k4.C40889d;

/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = FrescoBasedReactTextInlineImageViewManager.REACT_CLASS)
public class FrescoBasedReactTextInlineImageViewManager extends BaseViewManager<View, FrescoBasedReactTextInlineImageShadowNode> {
    public static final String REACT_CLASS = "RCTTextInlineImage";

    @Nullable
    private final Object mCallerContext;

    @Nullable
    private final AbstractDraweeControllerBuilder mDraweeControllerBuilder;

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, null);
    }

    public FrescoBasedReactTextInlineImageViewManager(@Nullable AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, @Nullable Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public FrescoBasedReactTextInlineImageShadowNode createShadowNodeInstance() {
        AbstractDraweeControllerBuilder abstractDraweeControllerBuilderM89530f = this.mDraweeControllerBuilder;
        if (abstractDraweeControllerBuilderM89530f == null) {
            abstractDraweeControllerBuilderM89530f = C40889d.m89530f();
        }
        return new FrescoBasedReactTextInlineImageShadowNode(abstractDraweeControllerBuilderM89530f, this.mCallerContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(ThemedReactContext themedReactContext) {
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<FrescoBasedReactTextInlineImageShadowNode> getShadowNodeClass() {
        return FrescoBasedReactTextInlineImageShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }
}
