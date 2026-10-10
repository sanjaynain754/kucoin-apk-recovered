package com.facebook.react.viewmanagers;

import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNCWebViewManagerInterface;
import com.tencent.bugly.proguard.C33812n7;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes45.dex */
public class RNCWebViewManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNCWebViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNCWebViewManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t11, String str, @Nullable ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "goBack":
                ((RNCWebViewManagerInterface) this.mViewManager).goBack(t11);
                break;
            case "stopLoading":
                ((RNCWebViewManagerInterface) this.mViewManager).stopLoading(t11);
                break;
            case "reload":
                ((RNCWebViewManagerInterface) this.mViewManager).reload(t11);
                break;
            case "clearCache":
                ((RNCWebViewManagerInterface) this.mViewManager).clearCache(t11, readableArray.getBoolean(0));
                break;
            case "goForward":
                ((RNCWebViewManagerInterface) this.mViewManager).goForward(t11);
                break;
            case "clearFormData":
                ((RNCWebViewManagerInterface) this.mViewManager).clearFormData(t11);
                break;
            case "loadUrl":
                ((RNCWebViewManagerInterface) this.mViewManager).loadUrl(t11, readableArray.getString(0));
                break;
            case "clearHistory":
                ((RNCWebViewManagerInterface) this.mViewManager).clearHistory(t11);
                break;
            case "requestFocus":
                ((RNCWebViewManagerInterface) this.mViewManager).requestFocus(t11);
                break;
            case "postMessage":
                ((RNCWebViewManagerInterface) this.mViewManager).postMessage(t11, readableArray.getString(0));
                break;
            case "injectJavaScript":
                ((RNCWebViewManagerInterface) this.mViewManager).injectJavaScript(t11, readableArray.getString(0));
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t11, String str, @Nullable Object obj) {
        double dDoubleValue;
        str.getClass();
        String str2 = null;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = false;
        boolean zBooleanValue3 = false;
        boolean zBooleanValue4 = false;
        boolean zBooleanValue5 = false;
        boolean zBooleanValue6 = false;
        boolean zBooleanValue7 = false;
        boolean zBooleanValue8 = false;
        boolean zBooleanValue9 = false;
        boolean zBooleanValue10 = false;
        boolean zBooleanValue11 = false;
        boolean zBooleanValue12 = false;
        boolean zBooleanValue13 = false;
        boolean zBooleanValue14 = false;
        boolean zBooleanValue15 = false;
        boolean zBooleanValue16 = false;
        boolean zBooleanValue17 = false;
        boolean zBooleanValue18 = false;
        boolean zBooleanValue19 = false;
        boolean zBooleanValue20 = false;
        boolean zBooleanValue21 = false;
        boolean zBooleanValue22 = false;
        boolean zBooleanValue23 = false;
        boolean zBooleanValue24 = false;
        boolean zBooleanValue25 = false;
        boolean zBooleanValue26 = false;
        boolean zBooleanValue27 = false;
        boolean zBooleanValue28 = false;
        boolean zBooleanValue29 = false;
        boolean zBooleanValue30 = false;
        boolean zBooleanValue31 = false;
        boolean zBooleanValue32 = false;
        boolean zBooleanValue33 = false;
        boolean zBooleanValue34 = false;
        int iIntValue = 0;
        boolean zBooleanValue35 = false;
        boolean zBooleanValue36 = false;
        int iIntValue2 = 0;
        boolean zBooleanValue37 = false;
        boolean zBooleanValue38 = false;
        boolean zBooleanValue39 = false;
        boolean zBooleanValue40 = false;
        boolean zBooleanValue41 = false;
        boolean zBooleanValue42 = false;
        boolean zBooleanValue43 = false;
        boolean zBooleanValue44 = false;
        boolean zBooleanValue45 = false;
        boolean zBooleanValue46 = false;
        boolean zBooleanValue47 = false;
        boolean zBooleanValue48 = false;
        boolean zBooleanValue49 = false;
        boolean zBooleanValue50 = false;
        byte b11 = -1;
        switch (str.hashCode()) {
            case -2014672109:
                if (str.equals("allowFileAccessFromFileURLs")) {
                    b11 = 0;
                }
                break;
            case -1843391113:
                if (str.equals("sharedCookiesEnabled")) {
                    b11 = 1;
                }
                break;
            case -1821622534:
                if (str.equals("allowsPictureInPictureMediaPlayback")) {
                    b11 = 2;
                }
                break;
            case -1737229888:
                if (str.equals("allowsProtectedMedia")) {
                    b11 = 3;
                }
                break;
            case -1725560121:
                if (str.equals("saveFormDataDisabled")) {
                    b11 = 4;
                }
                break;
            case -1714115364:
                if (str.equals("textInteractionEnabled")) {
                    b11 = 5;
                }
                break;
            case -1646494270:
                if (str.equals("injectedJavaScriptBeforeContentLoaded")) {
                    b11 = 6;
                }
                break;
            case -1642362548:
                if (str.equals("directionalLockEnabled")) {
                    b11 = 7;
                }
                break;
            case -1607633676:
                if (str.equals("javaScriptEnabled")) {
                    b11 = 8;
                }
                break;
            case -1562001507:
                if (str.equals("messagingEnabled")) {
                    b11 = 9;
                }
                break;
            case -1555578679:
                if (str.equals("dataDetectorTypes")) {
                    b11 = 10;
                }
                break;
            case -1547082335:
                if (str.equals("menuItems")) {
                    b11 = 11;
                }
                break;
            case -1423657812:
                if (str.equals("incognito")) {
                    b11 = 12;
                }
                break;
            case -1397361343:
                if (str.equals("allowingReadAccessToURL")) {
                    b11 = 13;
                }
                break;
            case -1321236988:
                if (str.equals("overScrollMode")) {
                    b11 = 14;
                }
                break;
            case -1151046732:
                if (str.equals("scrollEnabled")) {
                    b11 = 15;
                }
                break;
            case -1150480790:
                if (str.equals("keyboardDisplayRequiresUserAction")) {
                    b11 = 16;
                }
                break;
            case -1146673624:
                if (str.equals("domStorageEnabled")) {
                    b11 = 17;
                }
                break;
            case -1138577980:
                if (str.equals("allowsLinkPreview")) {
                    b11 = 18;
                }
                break;
            case -1009029441:
                if (str.equals("useSharedProcessPool")) {
                    b11 = 19;
                }
                break;
            case -1003454816:
                if (str.equals("textZoom")) {
                    b11 = 20;
                }
                break;
            case -922092170:
                if (str.equals("showsVerticalScrollIndicator")) {
                    b11 = 21;
                }
                break;
            case -906998080:
                if (str.equals("forceDarkOn")) {
                    b11 = 22;
                }
                break;
            case -800676066:
                if (str.equals("minimumFontSize")) {
                    b11 = 23;
                }
                break;
            case -735485938:
                if (str.equals("hideKeyboardAccessoryView")) {
                    b11 = 24;
                }
                break;
            case -728016272:
                if (str.equals("allowUniversalAccessFromFileURLs")) {
                    b11 = 25;
                }
                break;
            case -726941883:
                if (str.equals("mediaCapturePermissionGrantType")) {
                    b11 = 26;
                }
                break;
            case -600226341:
                if (str.equals("newSource")) {
                    b11 = 27;
                }
                break;
            case -572048675:
                if (str.equals("hasOnFileDownload")) {
                    b11 = 28;
                }
                break;
            case -553792443:
                if (str.equals("cacheMode")) {
                    b11 = 29;
                }
                break;
            case -502352363:
                if (str.equals("pagingEnabled")) {
                    b11 = 30;
                }
                break;
            case -389349956:
                if (str.equals("contentMode")) {
                    b11 = 31;
                }
                break;
            case -380199621:
                if (str.equals("messagingModuleName")) {
                    b11 = 32;
                }
                break;
            case -305041273:
                if (str.equals("hasOnOpenWindowEvent")) {
                    b11 = BuiltinOptions.ExpOptions;
                }
                break;
            case -227577491:
                if (str.equals("javaScriptCanOpenWindowsAutomatically")) {
                    b11 = BuiltinOptions.TopKV2Options;
                }
                break;
            case -181845559:
                if (str.equals("setDisplayZoomControls")) {
                    b11 = BuiltinOptions.SplitOptions;
                }
                break;
            case -128312874:
                if (str.equals("allowsFullscreenVideo")) {
                    b11 = BuiltinOptions.LogSoftmaxOptions;
                }
                break;
            case -127745027:
                if (str.equals("nestedScrollEnabled")) {
                    b11 = BuiltinOptions.CastOptions;
                }
                break;
            case -104290151:
                if (str.equals("injectedJavaScriptBeforeContentLoadedForMainFrameOnly")) {
                    b11 = BuiltinOptions.DequantizeOptions;
                }
                break;
            case 70220358:
                if (str.equals("hasOnScroll")) {
                    b11 = BuiltinOptions.MaximumMinimumOptions;
                }
                break;
            case 70310635:
                if (str.equals("bounces")) {
                    b11 = BuiltinOptions.ArgMaxOptions;
                }
                break;
            case 97678726:
                if (str.equals("setSupportMultipleWindows")) {
                    b11 = BuiltinOptions.LessOptions;
                }
                break;
            case 138148216:
                if (str.equals("lackPermissionToDownloadMessage")) {
                    b11 = BuiltinOptions.NegOptions;
                }
                break;
            case 215255965:
                if (str.equals("injectedJavaScript")) {
                    b11 = BuiltinOptions.PadV2Options;
                }
                break;
            case 226157789:
                if (str.equals("automaticallyAdjustContentInsets")) {
                    b11 = BuiltinOptions.GreaterOptions;
                }
                break;
            case 311430650:
                if (str.equals(C33812n7.f71057p)) {
                    b11 = BuiltinOptions.GreaterEqualOptions;
                }
                break;
            case 368381276:
                if (str.equals("allowsInlineMediaPlayback")) {
                    b11 = BuiltinOptions.LessEqualOptions;
                }
                break;
            case 397237599:
                if (str.equals("cacheEnabled")) {
                    b11 = BuiltinOptions.SelectOptions;
                }
                break;
            case 441950324:
                if (str.equals("injectedJavaScriptForMainFrameOnly")) {
                    b11 = BuiltinOptions.SliceOptions;
                }
                break;
            case 475851404:
                if (str.equals("webviewDebuggingEnabled")) {
                    b11 = BuiltinOptions.TransposeConvOptions;
                }
                break;
            case 496513340:
                if (str.equals("injectedJavaScriptObject")) {
                    b11 = BuiltinOptions.SparseToDenseOptions;
                }
                break;
            case 590869196:
                if (str.equals("applicationNameForUserAgent")) {
                    b11 = BuiltinOptions.TileOptions;
                }
                break;
            case 760962753:
                if (str.equals("mixedContentMode")) {
                    b11 = BuiltinOptions.ExpandDimsOptions;
                }
                break;
            case 811343908:
                if (str.equals("contentInset")) {
                    b11 = BuiltinOptions.EqualOptions;
                }
                break;
            case 830951634:
                if (str.equals("allowsBackForwardNavigationGestures")) {
                    b11 = BuiltinOptions.NotEqualOptions;
                }
                break;
            case 1076208106:
                if (str.equals("allowsAirPlayForMediaPlayback")) {
                    b11 = BuiltinOptions.ShapeOptions;
                }
                break;
            case 1138246185:
                if (str.equals("allowFileAccess")) {
                    b11 = BuiltinOptions.PowOptions;
                }
                break;
            case 1170796208:
                if (str.equals("limitsNavigationsToAppBoundDomains")) {
                    b11 = BuiltinOptions.ArgMinOptions;
                }
                break;
            case 1177556938:
                if (str.equals("setBuiltInZoomControls")) {
                    b11 = BuiltinOptions.FakeQuantOptions;
                }
                break;
            case 1219945382:
                if (str.equals("pullToRefreshEnabled")) {
                    b11 = BuiltinOptions.PackOptions;
                }
                break;
            case 1244240887:
                if (str.equals("refreshControlLightMode")) {
                    b11 = BuiltinOptions.LogicalOrOptions;
                }
                break;
            case 1309684816:
                if (str.equals("fraudulentWebsiteWarningEnabled")) {
                    b11 = 61;
                }
                break;
            case 1344414299:
                if (str.equals("geolocationEnabled")) {
                    b11 = BuiltinOptions.LogicalAndOptions;
                }
                break;
            case 1359182925:
                if (str.equals("downloadingMessage")) {
                    b11 = 63;
                }
                break;
            case 1512859629:
                if (str.equals("basicAuthCredential")) {
                    b11 = 64;
                }
                break;
            case 1523258769:
                if (str.equals("enableApplePay")) {
                    b11 = BuiltinOptions.FloorDivOptions;
                }
                break;
            case 1774874798:
                if (str.equals("mediaPlaybackRequiresUserAction")) {
                    b11 = BuiltinOptions.SquareOptions;
                }
                break;
            case 1812525393:
                if (str.equals("thirdPartyCookiesEnabled")) {
                    b11 = BuiltinOptions.ZerosLikeOptions;
                }
                break;
            case 1813472596:
                if (str.equals("autoManageStatusBarEnabled")) {
                    b11 = BuiltinOptions.FillOptions;
                }
                break;
            case 1850310268:
                if (str.equals("androidLayerType")) {
                    b11 = BuiltinOptions.BidirectionalSequenceLSTMOptions;
                }
                break;
            case 1868864108:
                if (str.equals("suppressMenuItems")) {
                    b11 = BuiltinOptions.BidirectionalSequenceRNNOptions;
                }
                break;
            case 1915931784:
                if (str.equals("showsHorizontalScrollIndicator")) {
                    b11 = BuiltinOptions.UnidirectionalSequenceLSTMOptions;
                }
                break;
            case 2074641374:
                if (str.equals("scalesPageToFit")) {
                    b11 = BuiltinOptions.FloorModOptions;
                }
                break;
            case 2129019807:
                if (str.equals("decelerationRate")) {
                    b11 = BuiltinOptions.RangeOptions;
                }
                break;
            case 2146755107:
                if (str.equals("contentInsetAdjustmentBehavior")) {
                    b11 = BuiltinOptions.ResizeNearestNeighborOptions;
                }
                break;
        }
        switch (b11) {
            case 0:
                RNCWebViewManagerInterface rNCWebViewManagerInterface = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface.setAllowFileAccessFromFileURLs(t11, zBooleanValue);
                break;
            case 1:
                RNCWebViewManagerInterface rNCWebViewManagerInterface2 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue50 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface2.setSharedCookiesEnabled(t11, zBooleanValue50);
                break;
            case 2:
                RNCWebViewManagerInterface rNCWebViewManagerInterface3 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue49 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface3.setAllowsPictureInPictureMediaPlayback(t11, zBooleanValue49);
                break;
            case 3:
                RNCWebViewManagerInterface rNCWebViewManagerInterface4 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue48 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface4.setAllowsProtectedMedia(t11, zBooleanValue48);
                break;
            case 4:
                RNCWebViewManagerInterface rNCWebViewManagerInterface5 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue47 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface5.setSaveFormDataDisabled(t11, zBooleanValue47);
                break;
            case 5:
                RNCWebViewManagerInterface rNCWebViewManagerInterface6 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue46 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface6.setTextInteractionEnabled(t11, zBooleanValue46);
                break;
            case 6:
                RNCWebViewManagerInterface rNCWebViewManagerInterface7 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNCWebViewManagerInterface7.setInjectedJavaScriptBeforeContentLoaded(t11, str2);
                break;
            case 7:
                RNCWebViewManagerInterface rNCWebViewManagerInterface8 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue45 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface8.setDirectionalLockEnabled(t11, zBooleanValue45);
                break;
            case 8:
                RNCWebViewManagerInterface rNCWebViewManagerInterface9 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue44 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface9.setJavaScriptEnabled(t11, zBooleanValue44);
                break;
            case 9:
                RNCWebViewManagerInterface rNCWebViewManagerInterface10 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue43 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface10.setMessagingEnabled(t11, zBooleanValue43);
                break;
            case 10:
                ((RNCWebViewManagerInterface) this.mViewManager).setDataDetectorTypes(t11, (ReadableArray) obj);
                break;
            case 11:
                ((RNCWebViewManagerInterface) this.mViewManager).setMenuItems(t11, (ReadableArray) obj);
                break;
            case 12:
                RNCWebViewManagerInterface rNCWebViewManagerInterface11 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue42 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface11.setIncognito(t11, zBooleanValue42);
                break;
            case 13:
                RNCWebViewManagerInterface rNCWebViewManagerInterface12 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNCWebViewManagerInterface12.setAllowingReadAccessToURL(t11, str2);
                break;
            case 14:
                RNCWebViewManagerInterface rNCWebViewManagerInterface13 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNCWebViewManagerInterface13.setOverScrollMode(t11, str2);
                break;
            case 15:
                RNCWebViewManagerInterface rNCWebViewManagerInterface14 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue41 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface14.setScrollEnabled(t11, zBooleanValue41);
                break;
            case 16:
                RNCWebViewManagerInterface rNCWebViewManagerInterface15 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue40 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface15.setKeyboardDisplayRequiresUserAction(t11, zBooleanValue40);
                break;
            case 17:
                RNCWebViewManagerInterface rNCWebViewManagerInterface16 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue39 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface16.setDomStorageEnabled(t11, zBooleanValue39);
                break;
            case 18:
                RNCWebViewManagerInterface rNCWebViewManagerInterface17 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue38 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface17.setAllowsLinkPreview(t11, zBooleanValue38);
                break;
            case 19:
                RNCWebViewManagerInterface rNCWebViewManagerInterface18 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue37 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface18.setUseSharedProcessPool(t11, zBooleanValue37);
                break;
            case 20:
                RNCWebViewManagerInterface rNCWebViewManagerInterface19 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue2 = ((Double) obj).intValue();
                }
                rNCWebViewManagerInterface19.setTextZoom(t11, iIntValue2);
                break;
            case 21:
                RNCWebViewManagerInterface rNCWebViewManagerInterface20 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue36 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface20.setShowsVerticalScrollIndicator(t11, zBooleanValue36);
                break;
            case 22:
                RNCWebViewManagerInterface rNCWebViewManagerInterface21 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue35 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface21.setForceDarkOn(t11, zBooleanValue35);
                break;
            case 23:
                RNCWebViewManagerInterface rNCWebViewManagerInterface22 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    iIntValue = ((Double) obj).intValue();
                }
                rNCWebViewManagerInterface22.setMinimumFontSize(t11, iIntValue);
                break;
            case 24:
                RNCWebViewManagerInterface rNCWebViewManagerInterface23 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue34 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface23.setHideKeyboardAccessoryView(t11, zBooleanValue34);
                break;
            case 25:
                RNCWebViewManagerInterface rNCWebViewManagerInterface24 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue33 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface24.setAllowUniversalAccessFromFileURLs(t11, zBooleanValue33);
                break;
            case 26:
                ((RNCWebViewManagerInterface) this.mViewManager).setMediaCapturePermissionGrantType(t11, (String) obj);
                break;
            case 27:
                ((RNCWebViewManagerInterface) this.mViewManager).setNewSource(t11, (ReadableMap) obj);
                break;
            case 28:
                RNCWebViewManagerInterface rNCWebViewManagerInterface25 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue32 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface25.setHasOnFileDownload(t11, zBooleanValue32);
                break;
            case 29:
                ((RNCWebViewManagerInterface) this.mViewManager).setCacheMode(t11, (String) obj);
                break;
            case 30:
                RNCWebViewManagerInterface rNCWebViewManagerInterface26 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue31 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface26.setPagingEnabled(t11, zBooleanValue31);
                break;
            case 31:
                ((RNCWebViewManagerInterface) this.mViewManager).setContentMode(t11, (String) obj);
                break;
            case 32:
                RNCWebViewManagerInterface rNCWebViewManagerInterface27 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNCWebViewManagerInterface27.setMessagingModuleName(t11, str2);
                break;
            case 33:
                RNCWebViewManagerInterface rNCWebViewManagerInterface28 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue30 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface28.setHasOnOpenWindowEvent(t11, zBooleanValue30);
                break;
            case 34:
                RNCWebViewManagerInterface rNCWebViewManagerInterface29 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue29 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface29.setJavaScriptCanOpenWindowsAutomatically(t11, zBooleanValue29);
                break;
            case 35:
                RNCWebViewManagerInterface rNCWebViewManagerInterface30 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue28 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface30.setSetDisplayZoomControls(t11, zBooleanValue28);
                break;
            case 36:
                RNCWebViewManagerInterface rNCWebViewManagerInterface31 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue27 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface31.setAllowsFullscreenVideo(t11, zBooleanValue27);
                break;
            case 37:
                RNCWebViewManagerInterface rNCWebViewManagerInterface32 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue26 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface32.setNestedScrollEnabled(t11, zBooleanValue26);
                break;
            case 38:
                RNCWebViewManagerInterface rNCWebViewManagerInterface33 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue25 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface33.setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(t11, zBooleanValue25);
                break;
            case 39:
                RNCWebViewManagerInterface rNCWebViewManagerInterface34 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue24 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface34.setHasOnScroll(t11, zBooleanValue24);
                break;
            case 40:
                RNCWebViewManagerInterface rNCWebViewManagerInterface35 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue23 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface35.setBounces(t11, zBooleanValue23);
                break;
            case 41:
                RNCWebViewManagerInterface rNCWebViewManagerInterface36 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue22 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface36.setSetSupportMultipleWindows(t11, zBooleanValue22);
                break;
            case 42:
                RNCWebViewManagerInterface rNCWebViewManagerInterface37 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNCWebViewManagerInterface37.setLackPermissionToDownloadMessage(t11, str2);
                break;
            case 43:
                RNCWebViewManagerInterface rNCWebViewManagerInterface38 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNCWebViewManagerInterface38.setInjectedJavaScript(t11, str2);
                break;
            case 44:
                RNCWebViewManagerInterface rNCWebViewManagerInterface39 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue21 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface39.setAutomaticallyAdjustContentInsets(t11, zBooleanValue21);
                break;
            case 45:
                RNCWebViewManagerInterface rNCWebViewManagerInterface40 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNCWebViewManagerInterface40.setUserAgent(t11, str2);
                break;
            case 46:
                RNCWebViewManagerInterface rNCWebViewManagerInterface41 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue20 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface41.setAllowsInlineMediaPlayback(t11, zBooleanValue20);
                break;
            case 47:
                RNCWebViewManagerInterface rNCWebViewManagerInterface42 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue19 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface42.setCacheEnabled(t11, zBooleanValue19);
                break;
            case 48:
                RNCWebViewManagerInterface rNCWebViewManagerInterface43 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue18 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface43.setInjectedJavaScriptForMainFrameOnly(t11, zBooleanValue18);
                break;
            case 49:
                RNCWebViewManagerInterface rNCWebViewManagerInterface44 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue17 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface44.setWebviewDebuggingEnabled(t11, zBooleanValue17);
                break;
            case 50:
                RNCWebViewManagerInterface rNCWebViewManagerInterface45 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNCWebViewManagerInterface45.setInjectedJavaScriptObject(t11, str2);
                break;
            case 51:
                RNCWebViewManagerInterface rNCWebViewManagerInterface46 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNCWebViewManagerInterface46.setApplicationNameForUserAgent(t11, str2);
                break;
            case 52:
                ((RNCWebViewManagerInterface) this.mViewManager).setMixedContentMode(t11, (String) obj);
                break;
            case 53:
                ((RNCWebViewManagerInterface) this.mViewManager).setContentInset(t11, (ReadableMap) obj);
                break;
            case 54:
                RNCWebViewManagerInterface rNCWebViewManagerInterface47 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue16 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface47.setAllowsBackForwardNavigationGestures(t11, zBooleanValue16);
                break;
            case 55:
                RNCWebViewManagerInterface rNCWebViewManagerInterface48 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue15 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface48.setAllowsAirPlayForMediaPlayback(t11, zBooleanValue15);
                break;
            case 56:
                RNCWebViewManagerInterface rNCWebViewManagerInterface49 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue14 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface49.setAllowFileAccess(t11, zBooleanValue14);
                break;
            case 57:
                RNCWebViewManagerInterface rNCWebViewManagerInterface50 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue13 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface50.setLimitsNavigationsToAppBoundDomains(t11, zBooleanValue13);
                break;
            case 58:
                RNCWebViewManagerInterface rNCWebViewManagerInterface51 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue12 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface51.setSetBuiltInZoomControls(t11, zBooleanValue12);
                break;
            case 59:
                RNCWebViewManagerInterface rNCWebViewManagerInterface52 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue11 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface52.setPullToRefreshEnabled(t11, zBooleanValue11);
                break;
            case 60:
                RNCWebViewManagerInterface rNCWebViewManagerInterface53 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue10 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface53.setRefreshControlLightMode(t11, zBooleanValue10);
                break;
            case 61:
                RNCWebViewManagerInterface rNCWebViewManagerInterface54 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue9 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface54.setFraudulentWebsiteWarningEnabled(t11, zBooleanValue9);
                break;
            case 62:
                RNCWebViewManagerInterface rNCWebViewManagerInterface55 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue8 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface55.setGeolocationEnabled(t11, zBooleanValue8);
                break;
            case 63:
                RNCWebViewManagerInterface rNCWebViewManagerInterface56 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNCWebViewManagerInterface56.setDownloadingMessage(t11, str2);
                break;
            case 64:
                ((RNCWebViewManagerInterface) this.mViewManager).setBasicAuthCredential(t11, (ReadableMap) obj);
                break;
            case 65:
                RNCWebViewManagerInterface rNCWebViewManagerInterface57 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue7 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface57.setEnableApplePay(t11, zBooleanValue7);
                break;
            case 66:
                RNCWebViewManagerInterface rNCWebViewManagerInterface58 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue6 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface58.setMediaPlaybackRequiresUserAction(t11, zBooleanValue6);
                break;
            case 67:
                RNCWebViewManagerInterface rNCWebViewManagerInterface59 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue5 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface59.setThirdPartyCookiesEnabled(t11, zBooleanValue5);
                break;
            case 68:
                RNCWebViewManagerInterface rNCWebViewManagerInterface60 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue4 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface60.setAutoManageStatusBarEnabled(t11, zBooleanValue4);
                break;
            case 69:
                ((RNCWebViewManagerInterface) this.mViewManager).setAndroidLayerType(t11, (String) obj);
                break;
            case 70:
                ((RNCWebViewManagerInterface) this.mViewManager).setSuppressMenuItems(t11, (ReadableArray) obj);
                break;
            case 71:
                RNCWebViewManagerInterface rNCWebViewManagerInterface61 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue3 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface61.setShowsHorizontalScrollIndicator(t11, zBooleanValue3);
                break;
            case 72:
                RNCWebViewManagerInterface rNCWebViewManagerInterface62 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                }
                rNCWebViewManagerInterface62.setScalesPageToFit(t11, zBooleanValue2);
                break;
            case 73:
                RNCWebViewManagerInterface rNCWebViewManagerInterface63 = (RNCWebViewManagerInterface) this.mViewManager;
                if (obj == null) {
                    dDoubleValue = 0.0d;
                } else {
                    dDoubleValue = ((Double) obj).doubleValue();
                }
                rNCWebViewManagerInterface63.setDecelerationRate(t11, dDoubleValue);
                break;
            case 74:
                ((RNCWebViewManagerInterface) this.mViewManager).setContentInsetAdjustmentBehavior(t11, (String) obj);
                break;
            default:
                super.setProperty(t11, str, obj);
                break;
        }
    }
}
