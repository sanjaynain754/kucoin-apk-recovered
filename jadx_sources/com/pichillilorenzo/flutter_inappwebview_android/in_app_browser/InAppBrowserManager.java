package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
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
public class InAppBrowserManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "InAppBrowserManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappbrowser";
    public static final Map<String, InAppBrowserManager> shared = new HashMap();

    /* JADX INFO: renamed from: id */
    public String f55826id;
    public InAppWebViewFlutterPlugin plugin;

    public InAppBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        String string = UUID.randomUUID().toString();
        this.f55826id = string;
        this.plugin = inAppWebViewFlutterPlugin;
        shared.put(string, this);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Activity activity;
        String str = methodCall.method;
        str.getClass();
        if (str.equals("openWithSystemBrowser")) {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
            if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null) {
                result.success(Boolean.FALSE);
                return;
            } else {
                openWithSystemBrowser(this.plugin.activity, (String) methodCall.argument("url"), result);
                return;
            }
        }
        if (!str.equals(TtmlNode.TEXT_EMPHASIS_MARK_OPEN)) {
            result.notImplemented();
            return;
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
        if (inAppWebViewFlutterPlugin2 == null || (activity = inAppWebViewFlutterPlugin2.activity) == null) {
            result.success(Boolean.FALSE);
        } else {
            open(activity, (Map) methodCall.arguments());
            result.success(Boolean.TRUE);
        }
    }

    public void open(Activity activity, Map<String, Object> map) {
        String str = (String) map.get("id");
        Map map2 = (Map) map.get("urlRequest");
        String str2 = (String) map.get("assetFilePath");
        String str3 = (String) map.get("data");
        String str4 = (String) map.get("mimeType");
        String str5 = (String) map.get("encoding");
        String str6 = (String) map.get("baseUrl");
        String str7 = (String) map.get("historyUrl");
        Map map3 = (Map) map.get("settings");
        Map map4 = (Map) map.get("contextMenu");
        Integer num = (Integer) map.get("windowId");
        List list = (List) map.get("initialUserScripts");
        Map map5 = (Map) map.get("pullToRefreshSettings");
        List list2 = (List) map.get("menuItems");
        Bundle bundle = new Bundle();
        bundle.putString("fromActivity", activity.getClass().getName());
        bundle.putSerializable("initialUrlRequest", (Serializable) map2);
        bundle.putString("initialFile", str2);
        bundle.putString("initialData", str3);
        bundle.putString("initialMimeType", str4);
        bundle.putString("initialEncoding", str5);
        bundle.putString("initialBaseUrl", str6);
        bundle.putString("initialHistoryUrl", str7);
        bundle.putString("id", str);
        bundle.putString("managerId", this.f55826id);
        bundle.putSerializable("settings", (Serializable) map3);
        bundle.putSerializable("contextMenu", (Serializable) map4);
        bundle.putInt("windowId", num != null ? num.intValue() : -1);
        bundle.putSerializable("initialUserScripts", (Serializable) list);
        bundle.putSerializable("pullToRefreshInitialSettings", (Serializable) map5);
        bundle.putSerializable("menuItems", (Serializable) list2);
        startInAppBrowserActivity(activity, bundle);
    }

    public void openWithSystemBrowser(Activity activity, String str, MethodChannel.Result result) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri uri = Uri.parse(str);
            if ("file".equals(uri.getScheme())) {
                intent.setDataAndType(uri, getMimeType(str));
            } else {
                intent.setData(uri);
            }
            intent.putExtra("com.android.browser.application_id", activity.getPackageName());
            openExternalExcludeCurrentApp(activity, intent);
            result.success(Boolean.TRUE);
        } catch (RuntimeException e11) {
            Log.d(LOG_TAG, str + " cannot be opened: " + e11.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" cannot be opened!");
            result.error(LOG_TAG, sb2.toString(), null);
        }
    }

    public void startInAppBrowserActivity(Activity activity, Bundle bundle) {
        Intent intent = new Intent(activity, (Class<?>) InAppBrowserActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }

    public static String getMimeType(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        shared.remove(this.f55826id);
        this.plugin = null;
    }

    public void openExternalExcludeCurrentApp(Activity activity, Intent intent) {
        String packageName = activity.getPackageName();
        List<ResolveInfo> listQueryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            if (!packageName.equals(resolveInfo.activityInfo.packageName)) {
                Intent intent2 = (Intent) intent.clone();
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                arrayList.add(intent2);
            } else {
                z11 = true;
            }
        }
        if (z11 && arrayList.size() != 0) {
            if (arrayList.size() == 1) {
                activity.startActivity((Intent) arrayList.get(0));
                return;
            } else {
                if (arrayList.size() > 0) {
                    Intent intentCreateChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), null);
                    intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
                    activity.startActivity(intentCreateChooser);
                    return;
                }
                return;
            }
        }
        activity.startActivity(intent);
    }
}
