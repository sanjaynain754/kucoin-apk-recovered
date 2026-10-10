package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.os.Build;
import android.webkit.WebSettings;
import androidx.media3.common.C2711C;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.kubi.otc.entity.OtcAd;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.tencent.bugly.proguard.C33812n7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes59.dex */
public class InAppWebViewSettings implements ISettings<InAppWebViewInterface> {
    public static final String LOG_TAG = "InAppWebViewSettings";
    public Boolean algorithmicDarkeningAllowed;
    public Boolean allowBackgroundAudioPlaying;
    public Boolean allowContentAccess;
    public Boolean allowFileAccess;
    public Boolean allowFileAccessFromFileURLs;
    public Boolean allowUniversalAccessFromFileURLs;
    public String appCachePath;
    public String applicationNameForUserAgent;
    public Boolean blockNetworkImage;
    public Boolean blockNetworkLoads;
    public Boolean builtInZoomControls;
    public Boolean cacheEnabled;
    public Integer cacheMode;

    @Deprecated
    public Boolean clearCache;

    @Deprecated
    public Boolean clearSessionCache;
    public List<Map<String, Map<String, Object>>> contentBlockers;
    public String cursiveFontFamily;
    public Boolean databaseEnabled;
    public Integer defaultFixedFontSize;
    public Integer defaultFontSize;
    public String defaultTextEncodingName;
    public byte[] defaultVideoPoster;
    public Boolean disableContextMenu;
    public Boolean disableDefaultErrorPage;
    public Boolean disableHorizontalScroll;
    public Boolean disableVerticalScroll;
    public Integer disabledActionModeMenuItems;
    public Boolean displayZoomControls;
    public Boolean domStorageEnabled;
    public Boolean enterpriseAuthenticationAppLinkPolicyEnabled;
    public String fantasyFontFamily;
    public String fixedFontFamily;
    public Integer forceDark;
    public Integer forceDarkStrategy;
    public Boolean geolocationEnabled;
    public Boolean hardwareAcceleration;
    public Boolean horizontalScrollBarEnabled;
    public String horizontalScrollbarThumbColor;
    public String horizontalScrollbarTrackColor;
    public Boolean incognito;
    public Integer initialScale;
    public Boolean interceptOnlyAsyncAjaxRequests;
    public Boolean javaScriptCanOpenWindowsAutomatically;
    public Boolean javaScriptEnabled;
    public WebSettings.LayoutAlgorithm layoutAlgorithm;
    public Boolean loadWithOverviewMode;
    public Boolean loadsImagesAutomatically;
    public Boolean mediaPlaybackRequiresUserGesture;
    public Integer minimumFontSize;
    public Integer minimumLogicalFontSize;
    public Integer mixedContentMode;
    public Boolean needInitialFocus;
    public Boolean networkAvailable;
    public Boolean offscreenPreRaster;
    public Integer overScrollMode;
    public Integer preferredContentMode;
    public String regexToCancelSubFramesLoading;
    public Map<String, Object> rendererPriorityPolicy;
    public Set<String> requestedWithHeaderOriginAllowList;
    public List<String> resourceCustomSchemes;
    public Boolean safeBrowsingEnabled;
    public String sansSerifFontFamily;
    public Boolean saveFormData;
    public Integer scrollBarDefaultDelayBeforeFade;
    public Integer scrollBarFadeDuration;
    public Integer scrollBarStyle;
    public Boolean scrollbarFadingEnabled;
    public String serifFontFamily;
    public String standardFontFamily;
    public Boolean supportMultipleWindows;
    public Boolean supportZoom;
    public Integer textZoom;
    public Boolean thirdPartyCookiesEnabled;
    public Boolean transparentBackground;
    public Boolean useHybridComposition;
    public Boolean useOnDownloadStart;
    public Boolean useOnLoadResource;
    public Boolean useOnRenderProcessGone;
    public Boolean useShouldInterceptAjaxRequest;
    public Boolean useShouldInterceptFetchRequest;
    public Boolean useShouldInterceptRequest;
    public Boolean useShouldOverrideUrlLoading;
    public Boolean useWideViewPort;
    public String userAgent;
    public Boolean verticalScrollBarEnabled;
    public Integer verticalScrollbarPosition;
    public String verticalScrollbarThumbColor;
    public String verticalScrollbarTrackColor;
    public Map<String, Object> webViewAssetLoader;

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public /* bridge */ /* synthetic */ ISettings<InAppWebViewInterface> parse(Map map) {
        return parse2((Map<String, Object>) map);
    }

    /* JADX INFO: renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings$1 */
    public static /* synthetic */ class C274761 {
        static final /* synthetic */ int[] $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm;

        static {
            int[] iArr = new int[WebSettings.LayoutAlgorithm.values().length];
            $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm = iArr;
            try {
                iArr[WebSettings.LayoutAlgorithm.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[WebSettings.LayoutAlgorithm.NARROW_COLUMNS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private String getLayoutAlgorithm() {
        WebSettings.LayoutAlgorithm layoutAlgorithm = this.layoutAlgorithm;
        if (layoutAlgorithm == null) {
            return null;
        }
        int i11 = C274761.$SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[layoutAlgorithm.ordinal()];
        if (i11 == 1) {
            return OtcAd.STATUS_NORMAL;
        }
        if (i11 == 2) {
            return "TEXT_AUTOSIZING";
        }
        if (i11 != 3) {
            return null;
        }
        return "NARROW_COLUMNS";
    }

    private void setLayoutAlgorithm(String str) {
        if (str != null) {
            switch (str) {
                case "NARROW_COLUMNS":
                    this.layoutAlgorithm = WebSettings.LayoutAlgorithm.NARROW_COLUMNS;
                case "NORMAL":
                    this.layoutAlgorithm = WebSettings.LayoutAlgorithm.NORMAL;
                case "TEXT_AUTOSIZING":
                    this.layoutAlgorithm = WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING;
                    break;
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> getRealSettings(InAppWebViewInterface inAppWebViewInterface) {
        Map<String, Object> map = toMap();
        if (inAppWebViewInterface instanceof InAppWebView) {
            InAppWebView inAppWebView = (InAppWebView) inAppWebViewInterface;
            WebSettings settings = inAppWebView.getSettings();
            map.put(C33812n7.f71057p, settings.getUserAgentString());
            map.put("javaScriptEnabled", Boolean.valueOf(settings.getJavaScriptEnabled()));
            map.put("javaScriptCanOpenWindowsAutomatically", Boolean.valueOf(settings.getJavaScriptCanOpenWindowsAutomatically()));
            map.put("mediaPlaybackRequiresUserGesture", Boolean.valueOf(settings.getMediaPlaybackRequiresUserGesture()));
            map.put("minimumFontSize", Integer.valueOf(settings.getMinimumFontSize()));
            map.put("verticalScrollBarEnabled", Boolean.valueOf(inAppWebView.isVerticalScrollBarEnabled()));
            map.put("horizontalScrollBarEnabled", Boolean.valueOf(inAppWebView.isHorizontalScrollBarEnabled()));
            map.put("textZoom", Integer.valueOf(settings.getTextZoom()));
            map.put("builtInZoomControls", Boolean.valueOf(settings.getBuiltInZoomControls()));
            map.put("supportZoom", Boolean.valueOf(settings.supportZoom()));
            map.put("displayZoomControls", Boolean.valueOf(settings.getDisplayZoomControls()));
            map.put("databaseEnabled", Boolean.valueOf(settings.getDatabaseEnabled()));
            map.put("domStorageEnabled", Boolean.valueOf(settings.getDomStorageEnabled()));
            map.put("useWideViewPort", Boolean.valueOf(settings.getUseWideViewPort()));
            if (WebViewFeature.isFeatureSupported(WebViewFeature.SAFE_BROWSING_ENABLE)) {
                map.put("safeBrowsingEnabled", Boolean.valueOf(WebSettingsCompat.getSafeBrowsingEnabled(settings)));
            } else if (Build.VERSION.SDK_INT >= 26) {
                map.put("safeBrowsingEnabled", Boolean.valueOf(settings.getSafeBrowsingEnabled()));
            }
            int i11 = Build.VERSION.SDK_INT;
            map.put("mixedContentMode", Integer.valueOf(settings.getMixedContentMode()));
            map.put("allowContentAccess", Boolean.valueOf(settings.getAllowContentAccess()));
            map.put("allowFileAccess", Boolean.valueOf(settings.getAllowFileAccess()));
            map.put("allowFileAccessFromFileURLs", Boolean.valueOf(settings.getAllowFileAccessFromFileURLs()));
            map.put("allowUniversalAccessFromFileURLs", Boolean.valueOf(settings.getAllowUniversalAccessFromFileURLs()));
            map.put("blockNetworkImage", Boolean.valueOf(settings.getBlockNetworkImage()));
            map.put("blockNetworkLoads", Boolean.valueOf(settings.getBlockNetworkLoads()));
            map.put("cacheMode", Integer.valueOf(settings.getCacheMode()));
            map.put("cursiveFontFamily", settings.getCursiveFontFamily());
            map.put("defaultFixedFontSize", Integer.valueOf(settings.getDefaultFixedFontSize()));
            map.put("defaultFontSize", Integer.valueOf(settings.getDefaultFontSize()));
            map.put("defaultTextEncodingName", settings.getDefaultTextEncodingName());
            if (WebViewFeature.isFeatureSupported(WebViewFeature.DISABLED_ACTION_MODE_MENU_ITEMS)) {
                map.put("disabledActionModeMenuItems", Integer.valueOf(WebSettingsCompat.getDisabledActionModeMenuItems(settings)));
            }
            map.put("disabledActionModeMenuItems", Integer.valueOf(settings.getDisabledActionModeMenuItems()));
            map.put("fantasyFontFamily", settings.getFantasyFontFamily());
            map.put("fixedFontFamily", settings.getFixedFontFamily());
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
                map.put("forceDark", Integer.valueOf(WebSettingsCompat.getForceDark(settings)));
            } else if (i11 >= 29) {
                map.put("forceDark", Integer.valueOf(settings.getForceDark()));
            }
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
                map.put("forceDarkStrategy", Integer.valueOf(WebSettingsCompat.getForceDarkStrategy(settings)));
            }
            map.put("layoutAlgorithm", settings.getLayoutAlgorithm().name());
            map.put("loadWithOverviewMode", Boolean.valueOf(settings.getLoadWithOverviewMode()));
            map.put("loadsImagesAutomatically", Boolean.valueOf(settings.getLoadsImagesAutomatically()));
            map.put("minimumLogicalFontSize", Integer.valueOf(settings.getMinimumLogicalFontSize()));
            if (WebViewFeature.isFeatureSupported(WebViewFeature.OFF_SCREEN_PRERASTER)) {
                map.put("offscreenPreRaster", Boolean.valueOf(WebSettingsCompat.getOffscreenPreRaster(settings)));
            } else {
                map.put("offscreenPreRaster", Boolean.valueOf(settings.getOffscreenPreRaster()));
            }
            map.put("sansSerifFontFamily", settings.getSansSerifFontFamily());
            map.put("serifFontFamily", settings.getSerifFontFamily());
            map.put("standardFontFamily", settings.getStandardFontFamily());
            map.put("saveFormData", Boolean.valueOf(settings.getSaveFormData()));
            map.put("supportMultipleWindows", Boolean.valueOf(settings.supportMultipleWindows()));
            map.put("overScrollMode", Integer.valueOf(inAppWebView.getOverScrollMode()));
            map.put("scrollBarStyle", Integer.valueOf(inAppWebView.getScrollBarStyle()));
            map.put("verticalScrollbarPosition", Integer.valueOf(inAppWebView.getVerticalScrollbarPosition()));
            map.put("scrollBarDefaultDelayBeforeFade", Integer.valueOf(inAppWebView.getScrollBarDefaultDelayBeforeFade()));
            map.put("scrollbarFadingEnabled", Boolean.valueOf(inAppWebView.isScrollbarFadingEnabled()));
            map.put("scrollBarFadeDuration", Integer.valueOf(inAppWebView.getScrollBarFadeDuration()));
            if (i11 >= 26) {
                HashMap map2 = new HashMap();
                map2.put("rendererRequestedPriority", Integer.valueOf(inAppWebView.getRendererRequestedPriority()));
                map2.put("waivedWhenNotVisible", Boolean.valueOf(inAppWebView.getRendererPriorityWaivedWhenNotVisible()));
                map.put("rendererPriorityPolicy", map2);
            }
            if (WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING) && i11 >= 29) {
                map.put("algorithmicDarkeningAllowed", Boolean.valueOf(WebSettingsCompat.isAlgorithmicDarkeningAllowed(settings)));
            }
            if (WebViewFeature.isFeatureSupported(WebViewFeature.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY)) {
                map.put("enterpriseAuthenticationAppLinkPolicyEnabled", Boolean.valueOf(WebSettingsCompat.getEnterpriseAuthenticationAppLinkPolicyEnabled(settings)));
            }
            if (WebViewFeature.isFeatureSupported(WebViewFeature.REQUESTED_WITH_HEADER_ALLOW_LIST)) {
                map.put("requestedWithHeaderOriginAllowList", new ArrayList(WebSettingsCompat.getRequestedWithHeaderOriginAllowList(settings)));
            }
        }
        return map;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
    public ISettings<InAppWebViewInterface> parse2(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                key.getClass();
                byte b11 = -1;
                switch (key.hashCode()) {
                    case -2116596967:
                        if (key.equals("disableHorizontalScroll")) {
                            b11 = 0;
                        }
                        break;
                    case -2095822429:
                        if (key.equals("scrollBarDefaultDelayBeforeFade")) {
                            b11 = 1;
                        }
                        break;
                    case -2020146208:
                        if (key.equals("useWideViewPort")) {
                            b11 = 2;
                        }
                        break;
                    case -2014672109:
                        if (key.equals("allowFileAccessFromFileURLs")) {
                            b11 = 3;
                        }
                        break;
                    case -1931277743:
                        if (key.equals("defaultFontSize")) {
                            b11 = 4;
                        }
                        break;
                    case -1851090878:
                        if (key.equals("supportZoom")) {
                            b11 = 5;
                        }
                        break;
                    case -1845480382:
                        if (key.equals("scrollbarFadingEnabled")) {
                            b11 = 6;
                        }
                        break;
                    case -1834028884:
                        if (key.equals("defaultTextEncodingName")) {
                            b11 = 7;
                        }
                        break;
                    case -1746033750:
                        if (key.equals("needInitialFocus")) {
                            b11 = 8;
                        }
                        break;
                    case -1712086669:
                        if (key.equals("useShouldOverrideUrlLoading")) {
                            b11 = 9;
                        }
                        break;
                    case -1673892229:
                        if (key.equals("preferredContentMode")) {
                            b11 = 10;
                        }
                        break;
                    case -1657552268:
                        if (key.equals("allowContentAccess")) {
                            b11 = 11;
                        }
                        break;
                    case -1626497241:
                        if (key.equals("fixedFontFamily")) {
                            b11 = 12;
                        }
                        break;
                    case -1615103092:
                        if (key.equals("builtInZoomControls")) {
                            b11 = 13;
                        }
                        break;
                    case -1607633676:
                        if (key.equals("javaScriptEnabled")) {
                            b11 = 14;
                        }
                        break;
                    case -1578962296:
                        if (key.equals("hardwareAcceleration")) {
                            b11 = 15;
                        }
                        break;
                    case -1578507205:
                        if (key.equals("networkAvailable")) {
                            b11 = 16;
                        }
                        break;
                    case -1574470051:
                        if (key.equals("useShouldInterceptFetchRequest")) {
                            b11 = 17;
                        }
                        break;
                    case -1480607106:
                        if (key.equals("loadsImagesAutomatically")) {
                            b11 = 18;
                        }
                        break;
                    case -1455624881:
                        if (key.equals("resourceCustomSchemes")) {
                            b11 = 19;
                        }
                        break;
                    case -1443655540:
                        if (key.equals("disabledActionModeMenuItems")) {
                            b11 = 20;
                        }
                        break;
                    case -1423657812:
                        if (key.equals("incognito")) {
                            b11 = 21;
                        }
                        break;
                    case -1410791825:
                        if (key.equals("allowBackgroundAudioPlaying")) {
                            b11 = 22;
                        }
                        break;
                    case -1349570230:
                        if (key.equals("webViewAssetLoader")) {
                            b11 = 23;
                        }
                        break;
                    case -1321236988:
                        if (key.equals("overScrollMode")) {
                            b11 = 24;
                        }
                        break;
                    case -1146673624:
                        if (key.equals("domStorageEnabled")) {
                            b11 = 25;
                        }
                        break;
                    case -1143245914:
                        if (key.equals("disableContextMenu")) {
                            b11 = 26;
                        }
                        break;
                    case -1038715033:
                        if (key.equals("useShouldInterceptAjaxRequest")) {
                            b11 = 27;
                        }
                        break;
                    case -1003454816:
                        if (key.equals("textZoom")) {
                            b11 = 28;
                        }
                        break;
                    case -868328270:
                        if (key.equals("interceptOnlyAsyncAjaxRequests")) {
                            b11 = 29;
                        }
                        break;
                    case -800676066:
                        if (key.equals("minimumFontSize")) {
                            b11 = 30;
                        }
                        break;
                    case -767637403:
                        if (key.equals("layoutAlgorithm")) {
                            b11 = 31;
                        }
                        break;
                    case -759238347:
                        if (key.equals("clearCache")) {
                            b11 = 32;
                        }
                        break;
                    case -742944736:
                        if (key.equals("transparentBackground")) {
                            b11 = BuiltinOptions.ExpOptions;
                        }
                        break;
                    case -741649011:
                        if (key.equals("enterpriseAuthenticationAppLinkPolicyEnabled")) {
                            b11 = BuiltinOptions.TopKV2Options;
                        }
                        break;
                    case -728016272:
                        if (key.equals("allowUniversalAccessFromFileURLs")) {
                            b11 = BuiltinOptions.SplitOptions;
                        }
                        break;
                    case -710246074:
                        if (key.equals("databaseEnabled")) {
                            b11 = BuiltinOptions.LogSoftmaxOptions;
                        }
                        break;
                    case -706772569:
                        if (key.equals("useShouldInterceptRequest")) {
                            b11 = BuiltinOptions.CastOptions;
                        }
                        break;
                    case -553792443:
                        if (key.equals("cacheMode")) {
                            b11 = BuiltinOptions.DequantizeOptions;
                        }
                        break;
                    case -443422049:
                        if (key.equals("horizontalScrollBarEnabled")) {
                            b11 = BuiltinOptions.MaximumMinimumOptions;
                        }
                        break;
                    case -435719349:
                        if (key.equals("scrollBarStyle")) {
                            b11 = BuiltinOptions.ArgMaxOptions;
                        }
                        break;
                    case -421090202:
                        if (key.equals("initialScale")) {
                            b11 = BuiltinOptions.LessOptions;
                        }
                        break;
                    case -321425255:
                        if (key.equals("verticalScrollbarPosition")) {
                            b11 = BuiltinOptions.NegOptions;
                        }
                        break;
                    case -229178645:
                        if (key.equals("disableVerticalScroll")) {
                            b11 = BuiltinOptions.PadV2Options;
                        }
                        break;
                    case -227577491:
                        if (key.equals("javaScriptCanOpenWindowsAutomatically")) {
                            b11 = BuiltinOptions.GreaterOptions;
                        }
                        break;
                    case -225496870:
                        if (key.equals("horizontalScrollbarTrackColor")) {
                            b11 = BuiltinOptions.GreaterEqualOptions;
                        }
                        break;
                    case -225165915:
                        if (key.equals("offscreenPreRaster")) {
                            b11 = BuiltinOptions.LessEqualOptions;
                        }
                        break;
                    case -216514471:
                        if (key.equals("fantasyFontFamily")) {
                            b11 = BuiltinOptions.SelectOptions;
                        }
                        break;
                    case -158057575:
                        if (key.equals("rendererPriorityPolicy")) {
                            b11 = BuiltinOptions.SliceOptions;
                        }
                        break;
                    case -98561827:
                        if (key.equals("sansSerifFontFamily")) {
                            b11 = BuiltinOptions.TransposeConvOptions;
                        }
                        break;
                    case 57717170:
                        if (key.equals("regexToCancelSubFramesLoading")) {
                            b11 = BuiltinOptions.SparseToDenseOptions;
                        }
                        break;
                    case 100868168:
                        if (key.equals("verticalScrollbarTrackColor")) {
                            b11 = BuiltinOptions.TileOptions;
                        }
                        break;
                    case 174479508:
                        if (key.equals("useOnDownloadStart")) {
                            b11 = BuiltinOptions.ExpandDimsOptions;
                        }
                        break;
                    case 229242772:
                        if (key.equals("forceDarkStrategy")) {
                            b11 = BuiltinOptions.EqualOptions;
                        }
                        break;
                    case 257886264:
                        if (key.equals("cursiveFontFamily")) {
                            b11 = BuiltinOptions.NotEqualOptions;
                        }
                        break;
                    case 273267153:
                        if (key.equals("mediaPlaybackRequiresUserGesture")) {
                            b11 = BuiltinOptions.ShapeOptions;
                        }
                        break;
                    case 296040698:
                        if (key.equals("blockNetworkImage")) {
                            b11 = BuiltinOptions.PowOptions;
                        }
                        break;
                    case 298870764:
                        if (key.equals("blockNetworkLoads")) {
                            b11 = BuiltinOptions.ArgMinOptions;
                        }
                        break;
                    case 311430650:
                        if (key.equals(C33812n7.f71057p)) {
                            b11 = BuiltinOptions.FakeQuantOptions;
                        }
                        break;
                    case 387230482:
                        if (key.equals("useOnRenderProcessGone")) {
                            b11 = BuiltinOptions.PackOptions;
                        }
                        break;
                    case 393481210:
                        if (key.equals("useOnLoadResource")) {
                            b11 = BuiltinOptions.LogicalOrOptions;
                        }
                        break;
                    case 397237599:
                        if (key.equals("cacheEnabled")) {
                            b11 = 61;
                        }
                        break;
                    case 408799019:
                        if (key.equals("saveFormData")) {
                            b11 = BuiltinOptions.LogicalAndOptions;
                        }
                        break;
                    case 477312960:
                        if (key.equals("requestedWithHeaderOriginAllowList")) {
                            b11 = 63;
                        }
                        break;
                    case 487904071:
                        if (key.equals("useHybridComposition")) {
                            b11 = 64;
                        }
                        break;
                    case 590869196:
                        if (key.equals("applicationNameForUserAgent")) {
                            b11 = BuiltinOptions.FloorDivOptions;
                        }
                        break;
                    case 760962753:
                        if (key.equals("mixedContentMode")) {
                            b11 = BuiltinOptions.SquareOptions;
                        }
                        break;
                    case 849171798:
                        if (key.equals("scrollBarFadeDuration")) {
                            b11 = BuiltinOptions.ZerosLikeOptions;
                        }
                        break;
                    case 1138246185:
                        if (key.equals("allowFileAccess")) {
                            b11 = BuiltinOptions.FillOptions;
                        }
                        break;
                    case 1156608422:
                        if (key.equals("appCachePath")) {
                            b11 = BuiltinOptions.BidirectionalSequenceLSTMOptions;
                        }
                        break;
                    case 1193086767:
                        if (key.equals("horizontalScrollbarThumbColor")) {
                            b11 = BuiltinOptions.BidirectionalSequenceRNNOptions;
                        }
                        break;
                    case 1301942064:
                        if (key.equals("standardFontFamily")) {
                            b11 = BuiltinOptions.UnidirectionalSequenceLSTMOptions;
                        }
                        break;
                    case 1320461707:
                        if (key.equals("displayZoomControls")) {
                            b11 = BuiltinOptions.FloorModOptions;
                        }
                        break;
                    case 1344414299:
                        if (key.equals("geolocationEnabled")) {
                            b11 = BuiltinOptions.RangeOptions;
                        }
                        break;
                    case 1409728424:
                        if (key.equals("loadWithOverviewMode")) {
                            b11 = BuiltinOptions.ResizeNearestNeighborOptions;
                        }
                        break;
                    case 1474890029:
                        if (key.equals("safeBrowsingEnabled")) {
                            b11 = BuiltinOptions.LeakyReluOptions;
                        }
                        break;
                    case 1496887792:
                        if (key.equals("serifFontFamily")) {
                            b11 = BuiltinOptions.SquaredDifferenceOptions;
                        }
                        break;
                    case 1519451805:
                        if (key.equals("verticalScrollbarThumbColor")) {
                            b11 = BuiltinOptions.MirrorPadOptions;
                        }
                        break;
                    case 1527546113:
                        if (key.equals("forceDark")) {
                            b11 = BuiltinOptions.AbsOptions;
                        }
                        break;
                    case 1583791742:
                        if (key.equals("disableDefaultErrorPage")) {
                            b11 = BuiltinOptions.SplitVOptions;
                        }
                        break;
                    case 1759079762:
                        if (key.equals("contentBlockers")) {
                            b11 = BuiltinOptions.UniqueOptions;
                        }
                        break;
                    case 1774215812:
                        if (key.equals("supportMultipleWindows")) {
                            b11 = BuiltinOptions.ReverseV2Options;
                        }
                        break;
                    case 1793491907:
                        if (key.equals("defaultFixedFontSize")) {
                            b11 = BuiltinOptions.AddNOptions;
                        }
                        break;
                    case 1812525393:
                        if (key.equals("thirdPartyCookiesEnabled")) {
                            b11 = BuiltinOptions.GatherNdOptions;
                        }
                        break;
                    case 1956631083:
                        if (key.equals("minimumLogicalFontSize")) {
                            b11 = BuiltinOptions.CosOptions;
                        }
                        break;
                    case 2011947505:
                        if (key.equals("verticalScrollBarEnabled")) {
                            b11 = BuiltinOptions.WhereOptions;
                        }
                        break;
                    case 2038327673:
                        if (key.equals("clearSessionCache")) {
                            b11 = BuiltinOptions.RankOptions;
                        }
                        break;
                    case 2056553639:
                        if (key.equals("defaultVideoPoster")) {
                            b11 = BuiltinOptions.ReverseSequenceOptions;
                        }
                        break;
                    case 2086547246:
                        if (key.equals("algorithmicDarkeningAllowed")) {
                            b11 = BuiltinOptions.MatrixDiagOptions;
                        }
                        break;
                }
                switch (b11) {
                    case 0:
                        this.disableHorizontalScroll = (Boolean) value;
                        break;
                    case 1:
                        this.scrollBarDefaultDelayBeforeFade = (Integer) value;
                        break;
                    case 2:
                        this.useWideViewPort = (Boolean) value;
                        break;
                    case 3:
                        this.allowFileAccessFromFileURLs = (Boolean) value;
                        break;
                    case 4:
                        this.defaultFontSize = (Integer) value;
                        break;
                    case 5:
                        this.supportZoom = (Boolean) value;
                        break;
                    case 6:
                        this.scrollbarFadingEnabled = (Boolean) value;
                        break;
                    case 7:
                        this.defaultTextEncodingName = (String) value;
                        break;
                    case 8:
                        this.needInitialFocus = (Boolean) value;
                        break;
                    case 9:
                        this.useShouldOverrideUrlLoading = (Boolean) value;
                        break;
                    case 10:
                        this.preferredContentMode = (Integer) value;
                        break;
                    case 11:
                        this.allowContentAccess = (Boolean) value;
                        break;
                    case 12:
                        this.fixedFontFamily = (String) value;
                        break;
                    case 13:
                        this.builtInZoomControls = (Boolean) value;
                        break;
                    case 14:
                        this.javaScriptEnabled = (Boolean) value;
                        break;
                    case 15:
                        this.hardwareAcceleration = (Boolean) value;
                        break;
                    case 16:
                        this.networkAvailable = (Boolean) value;
                        break;
                    case 17:
                        this.useShouldInterceptFetchRequest = (Boolean) value;
                        break;
                    case 18:
                        this.loadsImagesAutomatically = (Boolean) value;
                        break;
                    case 19:
                        this.resourceCustomSchemes = (List) value;
                        break;
                    case 20:
                        this.disabledActionModeMenuItems = (Integer) value;
                        break;
                    case 21:
                        this.incognito = (Boolean) value;
                        break;
                    case 22:
                        this.allowBackgroundAudioPlaying = (Boolean) value;
                        break;
                    case 23:
                        this.webViewAssetLoader = (Map) value;
                        break;
                    case 24:
                        this.overScrollMode = (Integer) value;
                        break;
                    case 25:
                        this.domStorageEnabled = (Boolean) value;
                        break;
                    case 26:
                        this.disableContextMenu = (Boolean) value;
                        break;
                    case 27:
                        this.useShouldInterceptAjaxRequest = (Boolean) value;
                        break;
                    case 28:
                        this.textZoom = (Integer) value;
                        break;
                    case 29:
                        this.interceptOnlyAsyncAjaxRequests = (Boolean) value;
                        break;
                    case 30:
                        this.minimumFontSize = (Integer) value;
                        break;
                    case 31:
                        setLayoutAlgorithm((String) value);
                        break;
                    case 32:
                        this.clearCache = (Boolean) value;
                        break;
                    case 33:
                        this.transparentBackground = (Boolean) value;
                        break;
                    case 34:
                        this.enterpriseAuthenticationAppLinkPolicyEnabled = (Boolean) value;
                        break;
                    case 35:
                        this.allowUniversalAccessFromFileURLs = (Boolean) value;
                        break;
                    case 36:
                        this.databaseEnabled = (Boolean) value;
                        break;
                    case 37:
                        this.useShouldInterceptRequest = (Boolean) value;
                        break;
                    case 38:
                        this.cacheMode = (Integer) value;
                        break;
                    case 39:
                        this.horizontalScrollBarEnabled = (Boolean) value;
                        break;
                    case 40:
                        this.scrollBarStyle = (Integer) value;
                        break;
                    case 41:
                        this.initialScale = (Integer) value;
                        break;
                    case 42:
                        this.verticalScrollbarPosition = (Integer) value;
                        break;
                    case 43:
                        this.disableVerticalScroll = (Boolean) value;
                        break;
                    case 44:
                        this.javaScriptCanOpenWindowsAutomatically = (Boolean) value;
                        break;
                    case 45:
                        this.horizontalScrollbarTrackColor = (String) value;
                        break;
                    case 46:
                        this.offscreenPreRaster = (Boolean) value;
                        break;
                    case 47:
                        this.fantasyFontFamily = (String) value;
                        break;
                    case 48:
                        this.rendererPriorityPolicy = (Map) value;
                        break;
                    case 49:
                        this.sansSerifFontFamily = (String) value;
                        break;
                    case 50:
                        this.regexToCancelSubFramesLoading = (String) value;
                        break;
                    case 51:
                        this.verticalScrollbarTrackColor = (String) value;
                        break;
                    case 52:
                        this.useOnDownloadStart = (Boolean) value;
                        break;
                    case 53:
                        this.forceDarkStrategy = (Integer) value;
                        break;
                    case 54:
                        this.cursiveFontFamily = (String) value;
                        break;
                    case 55:
                        this.mediaPlaybackRequiresUserGesture = (Boolean) value;
                        break;
                    case 56:
                        this.blockNetworkImage = (Boolean) value;
                        break;
                    case 57:
                        this.blockNetworkLoads = (Boolean) value;
                        break;
                    case 58:
                        this.userAgent = (String) value;
                        break;
                    case 59:
                        this.useOnRenderProcessGone = (Boolean) value;
                        break;
                    case 60:
                        this.useOnLoadResource = (Boolean) value;
                        break;
                    case 61:
                        this.cacheEnabled = (Boolean) value;
                        break;
                    case 62:
                        this.saveFormData = (Boolean) value;
                        break;
                    case 63:
                        this.requestedWithHeaderOriginAllowList = new HashSet((List) value);
                        break;
                    case 64:
                        this.useHybridComposition = (Boolean) value;
                        break;
                    case 65:
                        this.applicationNameForUserAgent = (String) value;
                        break;
                    case 66:
                        this.mixedContentMode = (Integer) value;
                        break;
                    case 67:
                        this.scrollBarFadeDuration = (Integer) value;
                        break;
                    case 68:
                        this.allowFileAccess = (Boolean) value;
                        break;
                    case 69:
                        this.appCachePath = (String) value;
                        break;
                    case 70:
                        this.horizontalScrollbarThumbColor = (String) value;
                        break;
                    case 71:
                        this.standardFontFamily = (String) value;
                        break;
                    case 72:
                        this.displayZoomControls = (Boolean) value;
                        break;
                    case 73:
                        this.geolocationEnabled = (Boolean) value;
                        break;
                    case 74:
                        this.loadWithOverviewMode = (Boolean) value;
                        break;
                    case 75:
                        this.safeBrowsingEnabled = (Boolean) value;
                        break;
                    case 76:
                        this.serifFontFamily = (String) value;
                        break;
                    case 77:
                        this.verticalScrollbarThumbColor = (String) value;
                        break;
                    case 78:
                        this.forceDark = (Integer) value;
                        break;
                    case 79:
                        this.disableDefaultErrorPage = (Boolean) value;
                        break;
                    case 80:
                        this.contentBlockers = (List) value;
                        break;
                    case 81:
                        this.supportMultipleWindows = (Boolean) value;
                        break;
                    case 82:
                        this.defaultFixedFontSize = (Integer) value;
                        break;
                    case 83:
                        this.thirdPartyCookiesEnabled = (Boolean) value;
                        break;
                    case 84:
                        this.minimumLogicalFontSize = (Integer) value;
                        break;
                    case 85:
                        this.verticalScrollBarEnabled = (Boolean) value;
                        break;
                    case 86:
                        this.clearSessionCache = (Boolean) value;
                        break;
                    case 87:
                        this.defaultVideoPoster = (byte[]) value;
                        break;
                    case 88:
                        this.algorithmicDarkeningAllowed = (Boolean) value;
                        break;
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> toMap() {
        HashMap map = new HashMap();
        map.put("useShouldOverrideUrlLoading", this.useShouldOverrideUrlLoading);
        map.put("useOnLoadResource", this.useOnLoadResource);
        map.put("useOnDownloadStart", this.useOnDownloadStart);
        map.put("clearCache", this.clearCache);
        map.put(C33812n7.f71057p, this.userAgent);
        map.put("applicationNameForUserAgent", this.applicationNameForUserAgent);
        map.put("javaScriptEnabled", this.javaScriptEnabled);
        map.put("javaScriptCanOpenWindowsAutomatically", this.javaScriptCanOpenWindowsAutomatically);
        map.put("mediaPlaybackRequiresUserGesture", this.mediaPlaybackRequiresUserGesture);
        map.put("minimumFontSize", this.minimumFontSize);
        map.put("verticalScrollBarEnabled", this.verticalScrollBarEnabled);
        map.put("horizontalScrollBarEnabled", this.horizontalScrollBarEnabled);
        map.put("resourceCustomSchemes", this.resourceCustomSchemes);
        map.put("contentBlockers", this.contentBlockers);
        map.put("preferredContentMode", this.preferredContentMode);
        map.put("useShouldInterceptAjaxRequest", this.useShouldInterceptAjaxRequest);
        map.put("interceptOnlyAsyncAjaxRequests", this.interceptOnlyAsyncAjaxRequests);
        map.put("useShouldInterceptFetchRequest", this.useShouldInterceptFetchRequest);
        map.put("incognito", this.incognito);
        map.put("cacheEnabled", this.cacheEnabled);
        map.put("transparentBackground", this.transparentBackground);
        map.put("disableVerticalScroll", this.disableVerticalScroll);
        map.put("disableHorizontalScroll", this.disableHorizontalScroll);
        map.put("disableContextMenu", this.disableContextMenu);
        map.put("textZoom", this.textZoom);
        map.put("clearSessionCache", this.clearSessionCache);
        map.put("builtInZoomControls", this.builtInZoomControls);
        map.put("displayZoomControls", this.displayZoomControls);
        map.put("supportZoom", this.supportZoom);
        map.put("databaseEnabled", this.databaseEnabled);
        map.put("domStorageEnabled", this.domStorageEnabled);
        map.put("useWideViewPort", this.useWideViewPort);
        map.put("safeBrowsingEnabled", this.safeBrowsingEnabled);
        map.put("mixedContentMode", this.mixedContentMode);
        map.put("allowContentAccess", this.allowContentAccess);
        map.put("allowFileAccess", this.allowFileAccess);
        map.put("allowFileAccessFromFileURLs", this.allowFileAccessFromFileURLs);
        map.put("allowUniversalAccessFromFileURLs", this.allowUniversalAccessFromFileURLs);
        map.put("appCachePath", this.appCachePath);
        map.put("blockNetworkImage", this.blockNetworkImage);
        map.put("blockNetworkLoads", this.blockNetworkLoads);
        map.put("cacheMode", this.cacheMode);
        map.put("cursiveFontFamily", this.cursiveFontFamily);
        map.put("defaultFixedFontSize", this.defaultFixedFontSize);
        map.put("defaultFontSize", this.defaultFontSize);
        map.put("defaultTextEncodingName", this.defaultTextEncodingName);
        map.put("disabledActionModeMenuItems", this.disabledActionModeMenuItems);
        map.put("fantasyFontFamily", this.fantasyFontFamily);
        map.put("fixedFontFamily", this.fixedFontFamily);
        map.put("forceDark", this.forceDark);
        map.put("forceDarkStrategy", this.forceDarkStrategy);
        map.put("geolocationEnabled", this.geolocationEnabled);
        map.put("layoutAlgorithm", getLayoutAlgorithm());
        map.put("loadWithOverviewMode", this.loadWithOverviewMode);
        map.put("loadsImagesAutomatically", this.loadsImagesAutomatically);
        map.put("minimumLogicalFontSize", this.minimumLogicalFontSize);
        map.put("initialScale", this.initialScale);
        map.put("needInitialFocus", this.needInitialFocus);
        map.put("offscreenPreRaster", this.offscreenPreRaster);
        map.put("sansSerifFontFamily", this.sansSerifFontFamily);
        map.put("serifFontFamily", this.serifFontFamily);
        map.put("standardFontFamily", this.standardFontFamily);
        map.put("saveFormData", this.saveFormData);
        map.put("thirdPartyCookiesEnabled", this.thirdPartyCookiesEnabled);
        map.put("hardwareAcceleration", this.hardwareAcceleration);
        map.put("supportMultipleWindows", this.supportMultipleWindows);
        map.put("regexToCancelSubFramesLoading", this.regexToCancelSubFramesLoading);
        map.put("overScrollMode", this.overScrollMode);
        map.put("networkAvailable", this.networkAvailable);
        map.put("scrollBarStyle", this.scrollBarStyle);
        map.put("verticalScrollbarPosition", this.verticalScrollbarPosition);
        map.put("scrollBarDefaultDelayBeforeFade", this.scrollBarDefaultDelayBeforeFade);
        map.put("scrollbarFadingEnabled", this.scrollbarFadingEnabled);
        map.put("scrollBarFadeDuration", this.scrollBarFadeDuration);
        map.put("rendererPriorityPolicy", this.rendererPriorityPolicy);
        map.put("useShouldInterceptRequest", this.useShouldInterceptRequest);
        map.put("useOnRenderProcessGone", this.useOnRenderProcessGone);
        map.put("disableDefaultErrorPage", this.disableDefaultErrorPage);
        map.put("useHybridComposition", this.useHybridComposition);
        map.put("verticalScrollbarThumbColor", this.verticalScrollbarThumbColor);
        map.put("verticalScrollbarTrackColor", this.verticalScrollbarTrackColor);
        map.put("horizontalScrollbarThumbColor", this.horizontalScrollbarThumbColor);
        map.put("horizontalScrollbarTrackColor", this.horizontalScrollbarTrackColor);
        map.put("algorithmicDarkeningAllowed", this.algorithmicDarkeningAllowed);
        map.put("enterpriseAuthenticationAppLinkPolicyEnabled", this.enterpriseAuthenticationAppLinkPolicyEnabled);
        map.put("allowBackgroundAudioPlaying", this.allowBackgroundAudioPlaying);
        map.put("defaultVideoPoster", this.defaultVideoPoster);
        map.put("requestedWithHeaderOriginAllowList", this.requestedWithHeaderOriginAllowList != null ? new ArrayList(this.requestedWithHeaderOriginAllowList) : null);
        return map;
    }

    public InAppWebViewSettings() {
        Boolean bool = Boolean.FALSE;
        this.useShouldOverrideUrlLoading = bool;
        this.useOnLoadResource = bool;
        this.useOnDownloadStart = bool;
        this.clearCache = bool;
        this.userAgent = "";
        this.applicationNameForUserAgent = "";
        Boolean bool2 = Boolean.TRUE;
        this.javaScriptEnabled = bool2;
        this.javaScriptCanOpenWindowsAutomatically = bool;
        this.mediaPlaybackRequiresUserGesture = bool2;
        this.minimumFontSize = 8;
        this.verticalScrollBarEnabled = bool2;
        this.horizontalScrollBarEnabled = bool2;
        this.resourceCustomSchemes = new ArrayList();
        this.contentBlockers = new ArrayList();
        this.preferredContentMode = Integer.valueOf(PreferredContentModeOptionType.RECOMMENDED.toValue());
        this.useShouldInterceptAjaxRequest = bool;
        this.interceptOnlyAsyncAjaxRequests = bool2;
        this.useShouldInterceptFetchRequest = bool;
        this.incognito = bool;
        this.cacheEnabled = bool2;
        this.transparentBackground = bool;
        this.disableVerticalScroll = bool;
        this.disableHorizontalScroll = bool;
        this.disableContextMenu = bool;
        this.supportZoom = bool2;
        this.allowFileAccessFromFileURLs = bool;
        this.allowUniversalAccessFromFileURLs = bool;
        this.allowBackgroundAudioPlaying = bool;
        this.textZoom = 100;
        this.clearSessionCache = bool;
        this.builtInZoomControls = bool2;
        this.displayZoomControls = bool;
        this.databaseEnabled = bool;
        this.domStorageEnabled = bool2;
        this.useWideViewPort = bool2;
        this.safeBrowsingEnabled = bool2;
        this.allowContentAccess = bool2;
        this.allowFileAccess = bool2;
        this.blockNetworkImage = bool;
        this.blockNetworkLoads = bool;
        this.cacheMode = -1;
        this.cursiveFontFamily = "cursive";
        this.defaultFixedFontSize = 16;
        this.defaultFontSize = 16;
        this.defaultTextEncodingName = "UTF-8";
        this.fantasyFontFamily = "fantasy";
        this.fixedFontFamily = "monospace";
        this.forceDark = 0;
        this.forceDarkStrategy = 2;
        this.geolocationEnabled = bool2;
        this.loadWithOverviewMode = bool2;
        this.loadsImagesAutomatically = bool2;
        this.minimumLogicalFontSize = 8;
        this.initialScale = 0;
        this.needInitialFocus = bool2;
        this.offscreenPreRaster = bool;
        this.sansSerifFontFamily = C2711C.SANS_SERIF_NAME;
        this.serifFontFamily = C2711C.SANS_SERIF_NAME;
        this.standardFontFamily = C2711C.SANS_SERIF_NAME;
        this.saveFormData = bool2;
        this.thirdPartyCookiesEnabled = bool2;
        this.hardwareAcceleration = bool2;
        this.supportMultipleWindows = bool;
        this.overScrollMode = 1;
        this.networkAvailable = null;
        this.scrollBarStyle = 0;
        this.verticalScrollbarPosition = 0;
        this.scrollBarDefaultDelayBeforeFade = null;
        this.scrollbarFadingEnabled = bool2;
        this.scrollBarFadeDuration = null;
        this.rendererPriorityPolicy = null;
        this.useShouldInterceptRequest = bool;
        this.useOnRenderProcessGone = bool;
        this.disableDefaultErrorPage = bool;
        this.useHybridComposition = bool2;
        this.algorithmicDarkeningAllowed = bool;
        this.enterpriseAuthenticationAppLinkPolicyEnabled = bool2;
    }
}
