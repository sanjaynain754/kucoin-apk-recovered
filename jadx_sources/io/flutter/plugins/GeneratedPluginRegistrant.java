package io.flutter.plugins;

import a90.C0211a;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import b90.C4522a;
import com.example.video_compress.VideoCompressPlugin;
import com.kubi.flutter.network.NetworkPlugin;
import com.kubi.flutter.plugin.cloud_storage_plugin.C12630a;
import com.kubi.flutter.security.SecurityPlugin;
import com.kubi.kc_hardware_service.hardware_service_index.HardwareServiceIndexPlugin;
import com.kubi.monitor.flutter.FlutterMonitorPlugin;
import com.kubi.sdk.component_credential.ComponentCredentialPlugin;
import com.lib.flutter_blue_plus.FlutterBluePlusPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.tencent.mmkv.MMKVPlugin;
import dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin;
import dev.fluttercommunity.plus.share.SharePlusPlugin;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import io.flutter.plugins.webviewflutter.WebViewFlutterPlugin;
import ng.C42830a;
import p341ig.C38531a;
import se0.C44400e;
import yb0.C46434d0;

/* JADX INFO: loaded from: classes23.dex */
@Keep
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(@NonNull FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add(new C12630a());
        } catch (Exception e11) {
            Log.m87478e(TAG, "Error registering plugin cloud_storage_plugin, com.kubi.flutter.plugin.cloud_storage_plugin.CloudStoragePlugin", e11);
        }
        try {
            flutterEngine.getPlugins().add(new ComponentCredentialPlugin());
        } catch (Exception e12) {
            Log.m87478e(TAG, "Error registering plugin component_credential, com.kubi.sdk.component_credential.ComponentCredentialPlugin", e12);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterMonitorPlugin());
        } catch (Exception e13) {
            Log.m87478e(TAG, "Error registering plugin component_monitor, com.kubi.monitor.flutter.FlutterMonitorPlugin", e13);
        }
        try {
            flutterEngine.getPlugins().add(new NetworkPlugin());
        } catch (Exception e14) {
            Log.m87478e(TAG, "Error registering plugin component_network, com.kubi.flutter.network.NetworkPlugin", e14);
        }
        try {
            flutterEngine.getPlugins().add(new SecurityPlugin());
        } catch (Exception e15) {
            Log.m87478e(TAG, "Error registering plugin component_security, com.kubi.flutter.security.SecurityPlugin", e15);
        }
        try {
            flutterEngine.getPlugins().add(new C44400e());
        } catch (Exception e16) {
            Log.m87478e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e16);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterBluePlusPlugin());
        } catch (Exception e17) {
            Log.m87478e(TAG, "Error registering plugin flutter_blue_plus, com.lib.flutter_blue_plus.FlutterBluePlusPlugin", e17);
        }
        try {
            flutterEngine.getPlugins().add(new InAppWebViewFlutterPlugin());
        } catch (Exception e18) {
            Log.m87478e(TAG, "Error registering plugin flutter_inappwebview_android, com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin", e18);
        }
        try {
            flutterEngine.getPlugins().add(new HardwareServiceIndexPlugin());
        } catch (Exception e19) {
            Log.m87478e(TAG, "Error registering plugin hardware_service_index, com.kubi.kc_hardware_service.hardware_service_index.HardwareServiceIndexPlugin", e19);
        }
        try {
            flutterEngine.getPlugins().add(new C38531a());
        } catch (Exception e21) {
            Log.m87478e(TAG, "Error registering plugin kc_screenshot_callback, com.kubi.flutter.screenshot_callback.ScreenshotCallbackPlugin", e21);
        }
        try {
            flutterEngine.getPlugins().add(new C42830a());
        } catch (Exception e22) {
            Log.m87478e(TAG, "Error registering plugin kc_system_boot_time, com.kubi.flutter.system_boot_time.SystemBootTimePlugin", e22);
        }
        try {
            flutterEngine.getPlugins().add(new C0211a());
        } catch (Exception e23) {
            Log.m87478e(TAG, "Error registering plugin kc_wallet_basic_bridge, com.kucoin.kc_wallet_basic_bridge.KcWalletBasicBridgePlugin", e23);
        }
        try {
            flutterEngine.getPlugins().add(new C4522a());
        } catch (Exception e24) {
            Log.m87478e(TAG, "Error registering plugin kc_wallet_core, com.kucoin.kc_wallet_core.kc_wallet_core.KcWalletCorePlugin", e24);
        }
        try {
            flutterEngine.getPlugins().add(new MMKVPlugin());
        } catch (Exception e25) {
            Log.m87478e(TAG, "Error registering plugin mmkv_android, com.tencent.mmkv.MMKVPlugin", e25);
        }
        try {
            flutterEngine.getPlugins().add(new PackageInfoPlugin());
        } catch (Exception e26) {
            Log.m87478e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e26);
        }
        try {
            flutterEngine.getPlugins().add(new PathProviderPlugin());
        } catch (Exception e27) {
            Log.m87478e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e27);
        }
        try {
            flutterEngine.getPlugins().add(new SharePlusPlugin());
        } catch (Exception e28) {
            Log.m87478e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e28);
        }
        try {
            flutterEngine.getPlugins().add(new SharedPreferencesPlugin());
        } catch (Exception e29) {
            Log.m87478e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e29);
        }
        try {
            flutterEngine.getPlugins().add(new C46434d0());
        } catch (Exception e31) {
            Log.m87478e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e31);
        }
        try {
            flutterEngine.getPlugins().add(new UrlLauncherPlugin());
        } catch (Exception e32) {
            Log.m87478e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e32);
        }
        try {
            flutterEngine.getPlugins().add(new VideoCompressPlugin());
        } catch (Exception e33) {
            Log.m87478e(TAG, "Error registering plugin video_compress, com.example.video_compress.VideoCompressPlugin", e33);
        }
        try {
            flutterEngine.getPlugins().add(new VideoPlayerPlugin());
        } catch (Exception e34) {
            Log.m87478e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e34);
        }
        try {
            flutterEngine.getPlugins().add(new WebViewFlutterPlugin());
        } catch (Exception e35) {
            Log.m87478e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e35);
        }
    }
}
