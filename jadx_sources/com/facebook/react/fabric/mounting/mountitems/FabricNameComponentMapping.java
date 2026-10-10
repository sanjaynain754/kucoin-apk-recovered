package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.views.text.ReactTextViewManager;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FabricNameComponentMapping.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/facebook/react/fabric/mounting/mountitems/FabricNameComponentMapping;", "", "<init>", "()V", "componentNames", "", "", "getFabricComponentName", "componentName", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class FabricNameComponentMapping {

    @NotNull
    public static final FabricNameComponentMapping INSTANCE = new FabricNameComponentMapping();

    @NotNull
    private static final Map<String, String> componentNames = MapsKt.mapOf(TuplesKt.m90091to("View", "RCTView"), TuplesKt.m90091to("Image", ReactImageManager.REACT_CLASS), TuplesKt.m90091to("ScrollView", ReactScrollViewManager.REACT_CLASS), TuplesKt.m90091to("Slider", "RCTSlider"), TuplesKt.m90091to("ModalHostView", ReactModalHostManager.REACT_CLASS), TuplesKt.m90091to("Paragraph", ReactTextViewManager.REACT_CLASS), TuplesKt.m90091to("Text", ReactTextViewManager.REACT_CLASS), TuplesKt.m90091to("RawText", ReactRawTextManager.REACT_CLASS), TuplesKt.m90091to("ActivityIndicatorView", ReactProgressBarViewManager.REACT_CLASS), TuplesKt.m90091to("ShimmeringView", "RKShimmeringView"), TuplesKt.m90091to("TemplateView", "RCTTemplateView"), TuplesKt.m90091to("AxialGradientView", "RCTAxialGradientView"), TuplesKt.m90091to("Video", "RCTVideo"), TuplesKt.m90091to("Map", "RCTMap"), TuplesKt.m90091to("WebView", "RCTWebView"), TuplesKt.m90091to("Keyframes", "RCTKeyframes"), TuplesKt.m90091to("ImpressionTrackingView", "RCTImpressionTrackingView"));

    @JvmStatic
    @NotNull
    public static final String getFabricComponentName(@NotNull String componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        String str = componentNames.get(componentName);
        return str == null ? componentName : str;
    }

    private FabricNameComponentMapping() {
    }
}
