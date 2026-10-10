package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.PorterDuff;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.tencent.live2.impl.V2TXLiveProperty;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p392k4.C40889d;
import p747x3.C45999a;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FloatCompanionObject;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReactImageManager.kt */
/* JADX INFO: loaded from: classes45.dex */
@ReactModule(name = ReactImageManager.REACT_CLASS)
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001DB=\b\u0007\u0012\u001a\b\u0002\u0010\u0003\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nB-\b\u0017\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\rB7\b\u0017\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001a\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u001a\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u001a\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0013H\u0007J\u001a\u0010\"\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0013H\u0007J\u001a\u0010$\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0013H\u0007J\u001f\u0010%\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0002\u0010(J\u001f\u0010)\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0002\u0010(J\u0018\u0010+\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u001fH\u0007J \u0010-\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020\u001fH\u0007J\u001a\u00100\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0013H\u0007J\u001a\u00102\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0013H\u0007J\u0018\u00104\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u001fH\u0007J\u001f\u00106\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0002\u0010(J\u0018\u00108\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u0018H\u0007J\u0018\u0010:\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010;\u001a\u00020'H\u0007J\u0018\u0010<\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u0018H\u0007J\u001a\u0010>\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010@H\u0007J\u0014\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0BH\u0016J\u0010\u0010C\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0014R \u0010\u0003\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006E"}, m90084d2 = {"Lcom/facebook/react/views/image/ReactImageManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/facebook/react/views/image/ReactImageView;", "draweeControllerBuilder", "Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;", "globalImageLoadListener", "Lcom/facebook/react/views/image/GlobalImageLoadListener;", "callerContextFactory", "Lcom/facebook/react/views/image/ReactCallerContextFactory;", "<init>", "(Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;Lcom/facebook/react/views/image/GlobalImageLoadListener;Lcom/facebook/react/views/image/ReactCallerContextFactory;)V", "callerContext", "", "(Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;Ljava/lang/Object;)V", "(Lcom/facebook/drawee/controller/AbstractDraweeControllerBuilder;Lcom/facebook/react/views/image/GlobalImageLoadListener;Ljava/lang/Object;)V", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setAccessible", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "accessible", "", "setSrc", "sources", "Lcom/facebook/react/bridge/ReadableArray;", "setSource", "setBlurRadius", "blurRadius", "", "setInternal_AnalyticsTag", "analyticTag", "setDefaultSource", "source", "setLoadingIndicatorSource", "setBorderColor", ViewProps.BORDER_COLOR, "", "(Lcom/facebook/react/views/image/ReactImageView;Ljava/lang/Integer;)V", "setOverlayColor", "overlayColor", "setBorderWidth", ViewProps.BORDER_WIDTH, "setBorderRadius", "index", "borderRadius", "setResizeMode", ViewProps.RESIZE_MODE, "setResizeMethod", ViewProps.RESIZE_METHOD, "setResizeMultiplier", "resizeMultiplier", "setTintColor", "tintColor", "setProgressiveRenderingEnabled", "enabled", "setFadeDuration", "durationMs", "setLoadHandlersRegistered", "shouldNotifyLoadEvents", V2TXLiveProperty.kV2SetHeaders, "headers", "Lcom/facebook/react/bridge/ReadableMap;", "getExportedCustomDirectEventTypeConstants", "", "onAfterUpdateTransaction", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ReactImageManager extends SimpleViewManager<ReactImageView> {

    @NotNull
    private static final String ON_ERROR = "onError";

    @NotNull
    private static final String ON_LOAD = "onLoad";

    @NotNull
    private static final String ON_LOAD_END = "onLoadEnd";

    @NotNull
    private static final String ON_LOAD_START = "onLoadStart";

    @NotNull
    private static final String ON_PROGRESS = "onProgress";

    @NotNull
    public static final String REACT_CLASS = "RCTImageView";

    @NotNull
    private static final String REGISTRATION_NAME = "registrationName";

    @Nullable
    private Object callerContext;

    @Nullable
    private final ReactCallerContextFactory callerContextFactory;

    @Nullable
    private final AbstractDraweeControllerBuilder<?, ?, ?, ?> draweeControllerBuilder;

    @Nullable
    private final GlobalImageLoadListener globalImageLoadListener;

    @JvmOverloads
    public ReactImageManager() {
        this(null, null, null, 7, null);
    }

    @JvmOverloads
    public ReactImageManager(@Nullable AbstractDraweeControllerBuilder<?, ?, ?, ?> abstractDraweeControllerBuilder) {
        this(abstractDraweeControllerBuilder, null, null, 6, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactImageView createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object orCreateCallerContext = this.callerContext;
        if (orCreateCallerContext == null) {
            ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
            orCreateCallerContext = reactCallerContextFactory != null ? reactCallerContextFactory.getOrCreateCallerContext(context.getModuleName(), null) : null;
        }
        AbstractDraweeControllerBuilder abstractDraweeControllerBuilderM89530f = this.draweeControllerBuilder;
        if (abstractDraweeControllerBuilderM89530f == null) {
            abstractDraweeControllerBuilderM89530f = C40889d.m89530f();
        }
        Intrinsics.checkNotNull(abstractDraweeControllerBuilderM89530f);
        return new ReactImageView(context, abstractDraweeControllerBuilderM89530f, this.globalImageLoadListener, orCreateCallerContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull ReactImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.maybeUpdateView();
    }

    @JvmOverloads
    public ReactImageManager(@Nullable AbstractDraweeControllerBuilder<?, ?, ?, ?> abstractDraweeControllerBuilder, @Nullable GlobalImageLoadListener globalImageLoadListener) {
        this(abstractDraweeControllerBuilder, globalImageLoadListener, null, 4, null);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new LinkedHashMap<>();
        }
        ImageLoadEvent.Companion companion = ImageLoadEvent.INSTANCE;
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(4), MapsKt.mapOf(TuplesKt.m90091to(REGISTRATION_NAME, ON_LOAD_START)));
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(5), MapsKt.mapOf(TuplesKt.m90091to(REGISTRATION_NAME, ON_PROGRESS)));
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(2), MapsKt.mapOf(TuplesKt.m90091to(REGISTRATION_NAME, ON_LOAD)));
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(1), MapsKt.mapOf(TuplesKt.m90091to(REGISTRATION_NAME, ON_ERROR)));
        exportedCustomDirectEventTypeConstants.put(companion.eventNameForType(3), MapsKt.mapOf(TuplesKt.m90091to(REGISTRATION_NAME, ON_LOAD_END)));
        return exportedCustomDirectEventTypeConstants;
    }

    @ReactProp(name = "accessible")
    public final void setAccessible(@NotNull ReactImageView view, boolean accessible) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFocusable(accessible);
    }

    @ReactProp(name = "blurRadius")
    public final void setBlurRadius(@NotNull ReactImageView view, float blurRadius) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBlurRadius(blurRadius);
    }

    @ReactProp(customType = "Color", name = ViewProps.BORDER_COLOR)
    public final void setBorderColor(@NotNull ReactImageView view, @Nullable Integer borderColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderColor(view, LogicalEdge.ALL, borderColor);
    }

    @ReactPropGroup(defaultFloat = FloatCompanionObject.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(@NotNull ReactImageView view, int index, float borderRadius) {
        LengthPercentage lengthPercentage;
        Intrinsics.checkNotNullParameter(view, "view");
        if (Float.isNaN(borderRadius)) {
            lengthPercentage = null;
        } else {
            lengthPercentage = new LengthPercentage(borderRadius, LengthPercentageType.POINT);
        }
        BackgroundStyleApplicator.setBorderRadius(view, BorderRadiusProp.values()[index], lengthPercentage);
    }

    @ReactProp(name = ViewProps.BORDER_WIDTH)
    public final void setBorderWidth(@NotNull ReactImageView view, float borderWidth) {
        Intrinsics.checkNotNullParameter(view, "view");
        BackgroundStyleApplicator.setBorderWidth(view, LogicalEdge.ALL, Float.valueOf(borderWidth));
    }

    @ReactProp(name = "defaultSource")
    public final void setDefaultSource(@NotNull ReactImageView view, @Nullable String source) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setDefaultSource(source);
    }

    @ReactProp(name = "fadeDuration")
    public final void setFadeDuration(@NotNull ReactImageView view, int durationMs) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFadeDuration(durationMs);
    }

    @ReactProp(name = "headers")
    public final void setHeaders(@NotNull ReactImageView view, @Nullable ReadableMap headers) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (headers != null) {
            view.setHeaders(headers);
        }
    }

    @ReactProp(name = "internal_analyticTag")
    public final void setInternal_AnalyticsTag(@NotNull ReactImageView view, @Nullable String analyticTag) {
        Intrinsics.checkNotNullParameter(view, "view");
        ReactCallerContextFactory reactCallerContextFactory = this.callerContextFactory;
        if (reactCallerContextFactory != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
            view.updateCallerContext(reactCallerContextFactory.getOrCreateCallerContext(((ThemedReactContext) context).getModuleName(), analyticTag));
        }
    }

    @ReactProp(name = "shouldNotifyLoadEvents")
    public final void setLoadHandlersRegistered(@NotNull ReactImageView view, boolean shouldNotifyLoadEvents) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setShouldNotifyLoadEvents(shouldNotifyLoadEvents);
    }

    @ReactProp(name = "loadingIndicatorSrc")
    public final void setLoadingIndicatorSource(@NotNull ReactImageView view, @Nullable String source) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLoadingIndicatorSource(source);
    }

    @ReactProp(customType = "Color", name = "overlayColor")
    public final void setOverlayColor(@NotNull ReactImageView view, @Nullable Integer overlayColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (overlayColor == null) {
            view.setOverlayColor(0);
        } else {
            view.setOverlayColor(overlayColor.intValue());
        }
    }

    @ReactProp(name = "progressiveRenderingEnabled")
    public final void setProgressiveRenderingEnabled(@NotNull ReactImageView view, boolean enabled) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setProgressiveRenderingEnabled(enabled);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r3.equals("auto") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @ReactProp(name = ViewProps.RESIZE_METHOD)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setResizeMethod(@NotNull ReactImageView view, @Nullable String resizeMethod) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (resizeMethod != null) {
            switch (resizeMethod.hashCode()) {
                case -934437708:
                    if (resizeMethod.equals("resize")) {
                        view.setResizeMethod(ImageResizeMethod.RESIZE);
                    }
                    view.setResizeMethod(ImageResizeMethod.AUTO);
                    C45999a.m101488I(ReactConstants.TAG, "Invalid resize method: '" + resizeMethod + "'");
                    break;
                case 3005871:
                    break;
                case 3387192:
                    if (resizeMethod.equals("none")) {
                        view.setResizeMethod(ImageResizeMethod.NONE);
                    }
                    view.setResizeMethod(ImageResizeMethod.AUTO);
                    C45999a.m101488I(ReactConstants.TAG, "Invalid resize method: '" + resizeMethod + "'");
                    break;
                case 109250890:
                    if (resizeMethod.equals("scale")) {
                        view.setResizeMethod(ImageResizeMethod.SCALE);
                    }
                    view.setResizeMethod(ImageResizeMethod.AUTO);
                    C45999a.m101488I(ReactConstants.TAG, "Invalid resize method: '" + resizeMethod + "'");
                    break;
                default:
                    view.setResizeMethod(ImageResizeMethod.AUTO);
                    C45999a.m101488I(ReactConstants.TAG, "Invalid resize method: '" + resizeMethod + "'");
                    break;
            }
            return;
        }
        view.setResizeMethod(ImageResizeMethod.AUTO);
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public final void setResizeMode(@NotNull ReactImageView view, @Nullable String resizeMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setScaleType(ImageResizeMode.toScaleType(resizeMode));
        view.setTileMode(ImageResizeMode.toTileMode(resizeMode));
    }

    @ReactProp(name = "resizeMultiplier")
    public final void setResizeMultiplier(@NotNull ReactImageView view, float resizeMultiplier) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (resizeMultiplier < 0.01f) {
            C45999a.m101488I(ReactConstants.TAG, "Invalid resize multiplier: '" + resizeMultiplier + "'");
        }
        view.setResizeMultiplier(resizeMultiplier);
    }

    @ReactProp(name = "source")
    public final void setSource(@NotNull ReactImageView view, @Nullable ReadableArray sources) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSource(sources);
    }

    @ReactProp(name = TUIConstants.TUICustomerServicePlugin.CUSTOMER_SERVICE_BUSINESS_ID_SRC_KEY)
    public final void setSrc(@NotNull ReactImageView view, @Nullable ReadableArray sources) {
        Intrinsics.checkNotNullParameter(view, "view");
        setSource(view, sources);
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public final void setTintColor(@NotNull ReactImageView view, @Nullable Integer tintColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (tintColor == null) {
            view.clearColorFilter();
        } else {
            view.setColorFilter(tintColor.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public /* synthetic */ ReactImageManager(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, ReactCallerContextFactory reactCallerContextFactory, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((AbstractDraweeControllerBuilder<?, ?, ?, ?>) ((i11 & 1) != 0 ? null : abstractDraweeControllerBuilder), (i11 & 2) != 0 ? null : globalImageLoadListener, (i11 & 4) != 0 ? null : reactCallerContextFactory);
    }

    @JvmOverloads
    public ReactImageManager(@Nullable AbstractDraweeControllerBuilder<?, ?, ?, ?> abstractDraweeControllerBuilder, @Nullable GlobalImageLoadListener globalImageLoadListener, @Nullable ReactCallerContextFactory reactCallerContextFactory) {
        this.draweeControllerBuilder = abstractDraweeControllerBuilder;
        this.globalImageLoadListener = globalImageLoadListener;
        this.callerContextFactory = reactCallerContextFactory;
    }

    @Deprecated(message = "Use the constructor with ReactCallerContextFactory instead", replaceWith = @ReplaceWith(expression = "ReactImageManager(draweeControllerBuilder, globalImageLoadListener, callerContextFactory)", imports = {}))
    public ReactImageManager(@Nullable AbstractDraweeControllerBuilder<?, ?, ?, ?> abstractDraweeControllerBuilder, @Nullable Object obj) {
        this(abstractDraweeControllerBuilder, (GlobalImageLoadListener) null, (ReactCallerContextFactory) null);
        this.callerContext = obj;
    }

    @Deprecated(message = "Use the constructor with ReactCallerContextFactory instead", replaceWith = @ReplaceWith(expression = "ReactImageManager(draweeControllerBuilder, globalImageLoadListener, callerContextFactory)", imports = {}))
    public ReactImageManager(@Nullable AbstractDraweeControllerBuilder<?, ?, ?, ?> abstractDraweeControllerBuilder, @Nullable GlobalImageLoadListener globalImageLoadListener, @Nullable Object obj) {
        this(abstractDraweeControllerBuilder, globalImageLoadListener, (ReactCallerContextFactory) null);
        this.callerContext = obj;
    }
}
