package io.flutter.plugins.webviewflutter;

import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class WebChromeClientFlutterApiImpl extends GeneratedAndroidWebView.WebChromeClientFlutterApi {
    private final BinaryMessenger binaryMessenger;
    private final InstanceManager instanceManager;
    private final WebViewFlutterApiImpl webViewFlutterApi;

    /* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.WebChromeClientFlutterApiImpl$1 */
    /* JADX INFO: loaded from: classes60.dex */
    public static /* synthetic */ class C389651 {
        static final /* synthetic */ int[] $SwitchMap$android$webkit$ConsoleMessage$MessageLevel;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            $SwitchMap$android$webkit$ConsoleMessage$MessageLevel = iArr;
            try {
                iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private long getIdentifierForClient(WebChromeClient webChromeClient) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        if (identifierForStrongReference != null) {
            return identifierForStrongReference.longValue();
        }
        throw new IllegalStateException("Could not find identifier for WebChromeClient.");
    }

    private static GeneratedAndroidWebView.ConsoleMessageLevel toConsoleMessageLevel(ConsoleMessage.MessageLevel messageLevel) {
        int i11 = C389651.$SwitchMap$android$webkit$ConsoleMessage$MessageLevel[messageLevel.ordinal()];
        if (i11 == 1) {
            return GeneratedAndroidWebView.ConsoleMessageLevel.TIP;
        }
        if (i11 == 2) {
            return GeneratedAndroidWebView.ConsoleMessageLevel.LOG;
        }
        if (i11 == 3) {
            return GeneratedAndroidWebView.ConsoleMessageLevel.WARNING;
        }
        if (i11 != 4) {
            return i11 != 5 ? GeneratedAndroidWebView.ConsoleMessageLevel.UNKNOWN : GeneratedAndroidWebView.ConsoleMessageLevel.DEBUG;
        }
        return GeneratedAndroidWebView.ConsoleMessageLevel.ERROR;
    }

    public void onConsoleMessage(@NonNull WebChromeClient webChromeClient, @NonNull ConsoleMessage consoleMessage, @NonNull GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        super.onConsoleMessage(identifierForStrongReference, new GeneratedAndroidWebView.ConsoleMessage.Builder().setLineNumber(Long.valueOf(consoleMessage.lineNumber())).setMessage(consoleMessage.message()).setLevel(toConsoleMessageLevel(consoleMessage.messageLevel())).setSourceId(consoleMessage.sourceId()).build(), reply);
    }

    public void onGeolocationPermissionsHidePrompt(@NonNull WebChromeClient webChromeClient, @NonNull GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        super.onGeolocationPermissionsHidePrompt(identifierForStrongReference, reply);
    }

    public void onGeolocationPermissionsShowPrompt(@NonNull WebChromeClient webChromeClient, @NonNull String str, @NonNull GeolocationPermissions.Callback callback, @NonNull GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        new GeolocationPermissionsCallbackFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(callback, new GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.h3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi.Reply
            public final void reply(Object obj) {
                WebChromeClientFlutterApiImpl.m87739l((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(callback);
        Objects.requireNonNull(identifierForStrongReference2);
        onGeolocationPermissionsShowPrompt(identifierForStrongReference, identifierForStrongReference2, str, reply);
    }

    public void onHideCustomView(@NonNull WebChromeClient webChromeClient, @NonNull GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        super.onHideCustomView(identifierForStrongReference, reply);
    }

    public void onJsAlert(@NonNull WebChromeClient webChromeClient, @NonNull String str, @NonNull String str2, @NonNull GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        super.onJsAlert(identifierForStrongReference, str, str2, reply);
    }

    public void onJsConfirm(@NonNull WebChromeClient webChromeClient, @NonNull String str, @NonNull String str2, @NonNull GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Boolean> reply) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        super.onJsConfirm(identifierForStrongReference, str, str2, reply);
    }

    public void onJsPrompt(@NonNull WebChromeClient webChromeClient, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<String> reply) {
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        super.onJsPrompt(identifierForStrongReference, str, str2, str3, reply);
    }

    @RequiresApi(api = 21)
    public void onPermissionRequest(@NonNull WebChromeClient webChromeClient, @NonNull PermissionRequest permissionRequest, @NonNull GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        new PermissionRequestFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(permissionRequest, permissionRequest.getResources(), new GeneratedAndroidWebView.PermissionRequestFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.f3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestFlutterApi.Reply
            public final void reply(Object obj) {
                WebChromeClientFlutterApiImpl.m87743p((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(permissionRequest);
        Objects.requireNonNull(identifierForStrongReference2);
        super.onPermissionRequest(identifierForStrongReference, identifierForStrongReference2, reply);
    }

    public void onProgressChanged(@NonNull WebChromeClient webChromeClient, @NonNull WebView webView, @NonNull Long l11, @NonNull GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        this.webViewFlutterApi.create(webView, new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.g3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebChromeClientFlutterApiImpl.m87742o((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference);
        super.onProgressChanged(Long.valueOf(getIdentifierForClient(webChromeClient)), identifierForStrongReference, l11, reply);
    }

    public void onShowCustomView(@NonNull WebChromeClient webChromeClient, @NonNull View view, @NonNull WebChromeClient.CustomViewCallback customViewCallback, @NonNull GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<Void> reply) {
        new ViewFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(view, new GeneratedAndroidWebView.ViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.i3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebChromeClientFlutterApiImpl.m87744q((Void) obj);
            }
        });
        new CustomViewCallbackFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(customViewCallback, new GeneratedAndroidWebView.CustomViewCallbackFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.j3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackFlutterApi.Reply
            public final void reply(Object obj) {
                WebChromeClientFlutterApiImpl.m87740m((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(view);
        Objects.requireNonNull(identifierForStrongReference2);
        Long identifierForStrongReference3 = this.instanceManager.getIdentifierForStrongReference(customViewCallback);
        Objects.requireNonNull(identifierForStrongReference3);
        onShowCustomView(identifierForStrongReference, identifierForStrongReference2, identifierForStrongReference3, reply);
    }

    @RequiresApi(api = 21)
    public void onShowFileChooser(@NonNull WebChromeClient webChromeClient, @NonNull WebView webView, @NonNull WebChromeClient.FileChooserParams fileChooserParams, @NonNull GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<List<String>> reply) {
        this.webViewFlutterApi.create(webView, new GeneratedAndroidWebView.WebViewFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.d3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply
            public final void reply(Object obj) {
                WebChromeClientFlutterApiImpl.m87745r((Void) obj);
            }
        });
        new FileChooserParamsFlutterApiImpl(this.binaryMessenger, this.instanceManager).create(fileChooserParams, new GeneratedAndroidWebView.FileChooserParamsFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.e3
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FileChooserParamsFlutterApi.Reply
            public final void reply(Object obj) {
                WebChromeClientFlutterApiImpl.m87741n((Void) obj);
            }
        });
        Long identifierForStrongReference = this.instanceManager.getIdentifierForStrongReference(webChromeClient);
        Objects.requireNonNull(identifierForStrongReference);
        Long identifierForStrongReference2 = this.instanceManager.getIdentifierForStrongReference(webView);
        Objects.requireNonNull(identifierForStrongReference2);
        Long identifierForStrongReference3 = this.instanceManager.getIdentifierForStrongReference(fileChooserParams);
        Objects.requireNonNull(identifierForStrongReference3);
        onShowFileChooser(identifierForStrongReference, identifierForStrongReference2, identifierForStrongReference3, reply);
    }

    public WebChromeClientFlutterApiImpl(@NonNull BinaryMessenger binaryMessenger, @NonNull InstanceManager instanceManager) {
        super(binaryMessenger);
        this.binaryMessenger = binaryMessenger;
        this.instanceManager = instanceManager;
        this.webViewFlutterApi = new WebViewFlutterApiImpl(binaryMessenger, instanceManager);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m87739l(Void r11) {
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m87740m(Void r11) {
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m87741n(Void r11) {
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m87742o(Void r11) {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m87743p(Void r11) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m87744q(Void r11) {
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m87745r(Void r11) {
    }
}
