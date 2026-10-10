package com.jumio.sdk.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import com.jumio.core.interfaces.DigitalIdScanPartInterface;
import com.jumio.core.interfaces.ScanViewInterface;
import com.jumio.core.util.DeviceUtilKt;
import com.jumio.sdk.scanpart.JumioScanPart;
import jumio.core.C40660f2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001aB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0012H\u0017J\b\u0010\u0013\u001a\u00020\u0011H\u0017J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/jumio/sdk/views/JumioDigitalIdentityView;", "Landroid/widget/FrameLayout;", "Lcom/jumio/core/interfaces/ScanViewInterface;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "webView", "Landroid/webkit/WebView;", "scanPart", "Lcom/jumio/core/interfaces/DigitalIdScanPartInterface;", "attach", "", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "detach", "saveState", "outState", "Landroid/os/Bundle;", "restoreState", "inState", "externalRequestStarted", "JumioChromeClient", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
public final class JumioDigitalIdentityView extends FrameLayout implements ScanViewInterface {

    /* JADX INFO: renamed from: a */
    public final WebView f14752a;

    /* JADX INFO: renamed from: b */
    public DigitalIdScanPartInterface f14753b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JumioDigitalIdentityView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        WebView webView = new WebView(getContext());
        this.f14752a = webView;
        if (isInEditMode()) {
            return;
        }
        WebView.setWebContentsDebuggingEnabled(DeviceUtilKt.getDeviceUtil().isDebug(getContext()));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setSupportMultipleWindows(true);
        webView.setWebChromeClient(new C40660f2(this));
        addView(webView, new FrameLayout.LayoutParams(-1, -1));
        setFilterTouchesWhenObscured(true);
    }

    @Override // com.jumio.core.interfaces.ScanViewInterface
    @UiThread
    public void detach() {
        this.f14753b = null;
    }

    public static final void access$externalRequestStarted(JumioDigitalIdentityView jumioDigitalIdentityView) {
        DigitalIdScanPartInterface digitalIdScanPartInterface = jumioDigitalIdentityView.f14753b;
        if (digitalIdScanPartInterface != null) {
            digitalIdScanPartInterface.thirdPartyVerificationStarted();
        }
    }

    @Override // com.jumio.core.interfaces.ScanViewInterface
    @UiThread
    public void attach(@NotNull JumioScanPart scanPart) {
        Intrinsics.checkNotNullParameter(scanPart, "scanPart");
        if (!(scanPart.getScanPart$jumio_core_release() instanceof DigitalIdScanPartInterface)) {
            throw new IllegalArgumentException("Wrong scan part provided!");
        }
        DigitalIdScanPartInterface digitalIdScanPartInterface = (DigitalIdScanPartInterface) scanPart.getScanPart$jumio_core_release();
        this.f14753b = digitalIdScanPartInterface;
        if (digitalIdScanPartInterface != null) {
            this.f14752a.loadDataWithBaseURL(digitalIdScanPartInterface.getBaseUrl(), digitalIdScanPartInterface.getHtml(), "text/html", "UTF-8", null);
        }
    }

    public final void restoreState(@NotNull Bundle inState) {
        Intrinsics.checkNotNullParameter(inState, "inState");
        this.f14752a.restoreState(inState);
    }

    public final void saveState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.f14752a.saveState(outState);
    }

    public /* synthetic */ JumioDigitalIdentityView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JumioDigitalIdentityView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        WebView webView = new WebView(getContext());
        this.f14752a = webView;
        if (isInEditMode()) {
            return;
        }
        WebView.setWebContentsDebuggingEnabled(DeviceUtilKt.getDeviceUtil().isDebug(getContext()));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setSupportMultipleWindows(true);
        webView.setWebChromeClient(new C40660f2(this));
        addView(webView, new FrameLayout.LayoutParams(-1, -1));
        setFilterTouchesWhenObscured(true);
    }
}
