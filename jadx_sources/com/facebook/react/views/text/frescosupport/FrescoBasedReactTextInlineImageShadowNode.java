package com.facebook.react.views.text.frescosupport;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.internal.ReactTextInlineImageShadowNode;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Locale;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
class FrescoBasedReactTextInlineImageShadowNode extends ReactTextInlineImageShadowNode {

    @Nullable
    private final Object mCallerContext;
    private final AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private ReadableMap mHeaders;

    @Nullable
    private String mResizeMode;

    @Nullable
    private Uri mUri;
    private float mWidth = Float.NaN;
    private float mHeight = Float.NaN;
    private int mTintColor = 0;

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return true;
    }

    @ReactProp(name = TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY)
    public void setSource(@Nullable ReadableArray readableArray) {
        Uri resourceDrawableUri = null;
        String string = (readableArray == null || readableArray.size() == 0) ? null : readableArray.getMap(0).getString("uri");
        if (string != null) {
            try {
                Uri uri = Uri.parse(string);
                try {
                    if (uri.getScheme() != null) {
                        resourceDrawableUri = uri;
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
            if (resourceDrawableUri == null) {
                resourceDrawableUri = getResourceDrawableUri(getThemedContext(), string);
            }
        }
        if (resourceDrawableUri != this.mUri) {
            markUpdated();
        }
        this.mUri = resourceDrawableUri;
    }

    @Nullable
    private static Uri getResourceDrawableUri(Context context, @Nullable String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace(C33820nf.f71144W, "_"), "drawable", context.getPackageName()))).build();
    }

    @Nullable
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public AbstractDraweeControllerBuilder getDraweeControllerBuilder() {
        return this.mDraweeControllerBuilder;
    }

    public ReadableMap getHeaders() {
        return this.mHeaders;
    }

    @Nullable
    public Uri getUri() {
        return this.mUri;
    }

    @ReactProp(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.mHeaders = readableMap;
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(@Nullable String str) {
        this.mResizeMode = str;
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(int i11) {
        this.mTintColor = i11;
    }

    public FrescoBasedReactTextInlineImageShadowNode(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, @Nullable Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.views.text.internal.ReactTextInlineImageShadowNode
    public TextInlineImageSpan buildInlineImageSpan() {
        return new FrescoBasedReactTextInlineImageSpan(getThemedContext().getResources(), (int) Math.ceil(this.mHeight), (int) Math.ceil(this.mWidth), this.mTintColor, getUri(), getHeaders(), getDraweeControllerBuilder(), getCallerContext(), this.mResizeMode);
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.mHeight = (float) dynamic.asDouble();
        } else {
            C45999a.m101488I(ReactConstants.TAG, "Inline images must not have percentage based height");
            this.mHeight = Float.NaN;
        }
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.mWidth = (float) dynamic.asDouble();
        } else {
            C45999a.m101488I(ReactConstants.TAG, "Inline images must not have percentage based width");
            this.mWidth = Float.NaN;
        }
    }
}
