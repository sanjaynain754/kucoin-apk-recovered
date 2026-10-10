package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.platform.PlatformViewRegistry;

/* JADX INFO: loaded from: classes23.dex */
public class WebViewFlutterPlugin implements FlutterPlugin, ActivityAware {

    @Nullable
    private InstanceManager instanceManager;
    private JavaScriptChannelHostApiImpl javaScriptChannelHostApi;
    private FlutterPlugin.FlutterPluginBinding pluginBinding;
    private WebViewHostApiImpl webViewHostApi;

    private void setUp(final BinaryMessenger binaryMessenger, PlatformViewRegistry platformViewRegistry, Context context, FlutterAssetManager flutterAssetManager) {
        this.instanceManager = InstanceManager.create(new InstanceManager.FinalizationListener() { // from class: io.flutter.plugins.webviewflutter.y4
            @Override // io.flutter.plugins.webviewflutter.InstanceManager.FinalizationListener
            public final void onFinalize(long j11) {
                new GeneratedAndroidWebView.JavaObjectFlutterApi(binaryMessenger).dispose(Long.valueOf(j11), new GeneratedAndroidWebView.JavaObjectFlutterApi.Reply() { // from class: io.flutter.plugins.webviewflutter.x4
                    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaObjectFlutterApi.Reply
                    public final void reply(Object obj) {
                        WebViewFlutterPlugin.m87786b((Void) obj);
                    }
                });
            }
        });
        GeneratedAndroidWebView.InstanceManagerHostApi.setup(binaryMessenger, new GeneratedAndroidWebView.InstanceManagerHostApi() { // from class: io.flutter.plugins.webviewflutter.z4
            @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.InstanceManagerHostApi
            public final void clear() {
                this.f86983a.instanceManager.clear();
            }
        });
        platformViewRegistry.registerViewFactory("plugins.flutter.io/webview", new FlutterViewFactory(this.instanceManager));
        this.webViewHostApi = new WebViewHostApiImpl(this.instanceManager, binaryMessenger, new WebViewHostApiImpl.WebViewProxy(), context);
        this.javaScriptChannelHostApi = new JavaScriptChannelHostApiImpl(this.instanceManager, new JavaScriptChannelHostApiImpl.JavaScriptChannelCreator(), new JavaScriptChannelFlutterApiImpl(binaryMessenger, this.instanceManager), new Handler(context.getMainLooper()));
        GeneratedAndroidWebView.JavaObjectHostApi.setup(binaryMessenger, new JavaObjectHostApiImpl(this.instanceManager));
        GeneratedAndroidWebView.WebViewHostApi.setup(binaryMessenger, this.webViewHostApi);
        GeneratedAndroidWebView.JavaScriptChannelHostApi.setup(binaryMessenger, this.javaScriptChannelHostApi);
        GeneratedAndroidWebView.WebViewClientHostApi.setup(binaryMessenger, new WebViewClientHostApiImpl(this.instanceManager, new WebViewClientHostApiImpl.WebViewClientCreator(), new WebViewClientFlutterApiImpl(binaryMessenger, this.instanceManager)));
        GeneratedAndroidWebView.WebChromeClientHostApi.setup(binaryMessenger, new WebChromeClientHostApiImpl(this.instanceManager, new WebChromeClientHostApiImpl.WebChromeClientCreator(), new WebChromeClientFlutterApiImpl(binaryMessenger, this.instanceManager)));
        GeneratedAndroidWebView.DownloadListenerHostApi.setup(binaryMessenger, new DownloadListenerHostApiImpl(this.instanceManager, new DownloadListenerHostApiImpl.DownloadListenerCreator(), new DownloadListenerFlutterApiImpl(binaryMessenger, this.instanceManager)));
        GeneratedAndroidWebView.WebSettingsHostApi.setup(binaryMessenger, new WebSettingsHostApiImpl(this.instanceManager, new WebSettingsHostApiImpl.WebSettingsCreator()));
        GeneratedAndroidWebView.FlutterAssetManagerHostApi.setup(binaryMessenger, new FlutterAssetManagerHostApiImpl(flutterAssetManager));
        GeneratedAndroidWebView.CookieManagerHostApi.setup(binaryMessenger, new CookieManagerHostApiImpl(binaryMessenger, this.instanceManager));
        GeneratedAndroidWebView.WebStorageHostApi.setup(binaryMessenger, new WebStorageHostApiImpl(this.instanceManager, new WebStorageHostApiImpl.WebStorageCreator()));
        GeneratedAndroidWebView.PermissionRequestHostApi.setup(binaryMessenger, new PermissionRequestHostApiImpl(binaryMessenger, this.instanceManager));
        GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi.setup(binaryMessenger, new GeolocationPermissionsCallbackHostApiImpl(binaryMessenger, this.instanceManager));
        GeneratedAndroidWebView.CustomViewCallbackHostApi.setup(binaryMessenger, new CustomViewCallbackHostApiImpl(binaryMessenger, this.instanceManager));
        GeneratedAndroidWebView.HttpAuthHandlerHostApi.setup(binaryMessenger, new HttpAuthHandlerHostApiImpl(binaryMessenger, this.instanceManager));
    }

    private void updateContext(Context context) {
        this.webViewHostApi.setContext(context);
        this.javaScriptChannelHostApi.setPlatformThreadHandler(new Handler(context.getMainLooper()));
    }

    @Nullable
    public InstanceManager getInstanceManager() {
        return this.instanceManager;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
        setUp(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getPlatformViewRegistry(), flutterPluginBinding.getApplicationContext(), new FlutterAssetManager.PluginBindingFlutterAssetManager(flutterPluginBinding.getApplicationContext().getAssets(), flutterPluginBinding.getFlutterAssets()));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        updateContext(this.pluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        updateContext(this.pluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        InstanceManager instanceManager = this.instanceManager;
        if (instanceManager != null) {
            instanceManager.stopFinalizationListener();
            this.instanceManager = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        updateContext(activityPluginBinding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
        updateContext(activityPluginBinding.getActivity());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m87786b(Void r11) {
    }
}
