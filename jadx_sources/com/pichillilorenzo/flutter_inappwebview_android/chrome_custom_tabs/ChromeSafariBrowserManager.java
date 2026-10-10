package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes23.dex */
public class ChromeSafariBrowserManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "ChromeBrowserManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_chromesafaribrowser";
    public static final Map<String, ChromeSafariBrowserManager> shared = new HashMap();
    public final Map<String, ChromeCustomTabsActivity> browsers;

    /* JADX INFO: renamed from: id */
    public String f55821id;
    public InAppWebViewFlutterPlugin plugin;

    public void open(Activity activity, String str, String str2, HashMap<String, Object> map, String str3, ArrayList<String> arrayList, HashMap<String, Object> map2, HashMap<String, Object> map3, HashMap<String, Object> map4, List<HashMap<String, Object>> list, MethodChannel.Result result) {
        Class cls;
        Bundle bundle = new Bundle();
        bundle.putString("url", str2);
        bundle.putString("id", str);
        bundle.putString("managerId", this.f55821id);
        bundle.putSerializable("headers", map);
        bundle.putString("referrer", str3);
        bundle.putSerializable("otherLikelyURLs", arrayList);
        bundle.putSerializable("settings", map2);
        bundle.putSerializable("actionButton", map3);
        bundle.putSerializable("secondaryToolbar", map4);
        bundle.putSerializable("menuItemList", (Serializable) list);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) Util.getOrDefault(map2, "isSingleInstance", bool);
        Boolean bool3 = (Boolean) Util.getOrDefault(map2, "isTrustedWebActivity", bool);
        if (!CustomTabActivityHelper.isAvailable(activity)) {
            result.error(LOG_TAG, "ChromeCustomTabs is not available!", null);
            return;
        }
        if (bool2.booleanValue()) {
            cls = !bool3.booleanValue() ? ChromeCustomTabsActivitySingleInstance.class : TrustedWebActivitySingleInstance.class;
        } else {
            cls = !bool3.booleanValue() ? ChromeCustomTabsActivity.class : TrustedWebActivity.class;
        }
        Intent intent = new Intent(activity, (Class<?>) cls);
        intent.putExtras(bundle);
        if (((Boolean) Util.getOrDefault(map2, "noHistory", bool)).booleanValue()) {
            intent.addFlags(1073741824);
        }
        activity.startActivity(intent);
        result.success(Boolean.TRUE);
    }

    public ChromeSafariBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.browsers = new HashMap();
        String string = UUID.randomUUID().toString();
        this.f55821id = string;
        this.plugin = inAppWebViewFlutterPlugin;
        shared.put(string, this);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Activity activity;
        String str = (String) methodCall.argument("id");
        String str2 = methodCall.method;
        str2.getClass();
        switch (str2) {
            case "getMaxToolbarItems":
                result.success(Integer.valueOf(CustomTabsIntent.getMaxToolbarItems()));
                break;
            case "open":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
                if (inAppWebViewFlutterPlugin != null && inAppWebViewFlutterPlugin.activity != null) {
                    open(this.plugin.activity, str, (String) methodCall.argument("url"), (HashMap) methodCall.argument("headers"), (String) methodCall.argument("referrer"), (ArrayList) methodCall.argument("otherLikelyURLs"), (HashMap) methodCall.argument("settings"), (HashMap) methodCall.argument("actionButton"), (HashMap) methodCall.argument("secondaryToolbar"), (List) methodCall.argument("menuItemList"), result);
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "getPackageName":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (inAppWebViewFlutterPlugin2 != null && inAppWebViewFlutterPlugin2.activity != null) {
                    result.success(CustomTabsClient.getPackageName(this.plugin.activity, (ArrayList) methodCall.argument("packages"), ((Boolean) methodCall.argument("ignoreDefault")).booleanValue()));
                    break;
                } else {
                    result.success(null);
                    break;
                }
                break;
            case "isAvailable":
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
                if (inAppWebViewFlutterPlugin3 != null && (activity = inAppWebViewFlutterPlugin3.activity) != null) {
                    result.success(Boolean.valueOf(CustomTabActivityHelper.isAvailable(activity)));
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        for (ChromeCustomTabsActivity chromeCustomTabsActivity : this.browsers.values()) {
            if (chromeCustomTabsActivity != null) {
                chromeCustomTabsActivity.close();
                chromeCustomTabsActivity.dispose();
            }
        }
        this.browsers.clear();
        shared.remove(this.f55821id);
        this.plugin = null;
    }
}
