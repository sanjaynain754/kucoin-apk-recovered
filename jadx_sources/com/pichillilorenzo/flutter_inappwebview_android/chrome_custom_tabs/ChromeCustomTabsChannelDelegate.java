package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.media3.common.C2711C;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public class ChromeCustomTabsChannelDelegate extends ChannelDelegateImpl {
    private ChromeCustomTabsActivity chromeCustomTabsActivity;

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        CustomTabsSession customTabsSession;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        Activity activity;
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "isEngagementSignalsApiAvailable":
                ChromeCustomTabsActivity chromeCustomTabsActivity = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity != null && (customTabsSession = chromeCustomTabsActivity.customTabsSession) != null) {
                    try {
                        result.success(Boolean.valueOf(customTabsSession.isEngagementSignalsApiAvailable(new Bundle())));
                    } catch (Throwable unused) {
                        result.success(Boolean.FALSE);
                        return;
                    }
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "launchUrl":
                if (this.chromeCustomTabsActivity != null) {
                    String str2 = (String) methodCall.argument("url");
                    if (str2 == null) {
                        result.success(Boolean.FALSE);
                    } else {
                        this.chromeCustomTabsActivity.launchUrl(str2, (Map) methodCall.argument("headers"), (String) methodCall.argument("referrer"), (List) methodCall.argument("otherLikelyURLs"));
                        result.success(Boolean.TRUE);
                    }
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "updateSecondaryToolbar":
                if (this.chromeCustomTabsActivity != null) {
                    this.chromeCustomTabsActivity.updateSecondaryToolbar(CustomTabsSecondaryToolbar.fromMap((Map) methodCall.argument("secondaryToolbar")));
                    result.success(Boolean.TRUE);
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "updateActionButton":
                if (this.chromeCustomTabsActivity != null) {
                    this.chromeCustomTabsActivity.updateActionButton((byte[]) methodCall.argument(TUIConstants.TUIChat.INPUT_MORE_ICON), (String) methodCall.argument(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION));
                    result.success(Boolean.TRUE);
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "close":
                ChromeCustomTabsActivity chromeCustomTabsActivity2 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity2 != null) {
                    chromeCustomTabsActivity2.onStop();
                    this.chromeCustomTabsActivity.onDestroy();
                    this.chromeCustomTabsActivity.close();
                    ChromeSafariBrowserManager chromeSafariBrowserManager = this.chromeCustomTabsActivity.manager;
                    if (chromeSafariBrowserManager != null && (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) != null && (activity = inAppWebViewFlutterPlugin.activity) != null) {
                        Intent intent = new Intent(activity, activity.getClass());
                        intent.addFlags(67108864);
                        intent.addFlags(C2711C.BUFFER_FLAG_LAST_SAMPLE);
                        activity.startActivity(intent);
                    }
                    this.chromeCustomTabsActivity.dispose();
                    result.success(Boolean.TRUE);
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "validateRelationship":
                ChromeCustomTabsActivity chromeCustomTabsActivity3 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity3 != null && chromeCustomTabsActivity3.customTabsSession != null) {
                    result.success(Boolean.valueOf(this.chromeCustomTabsActivity.customTabsSession.validateRelationship(((Integer) methodCall.argument("relation")).intValue(), Uri.parse((String) methodCall.argument("origin")), null)));
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "requestPostMessageChannel":
                ChromeCustomTabsActivity chromeCustomTabsActivity4 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity4 != null && chromeCustomTabsActivity4.customTabsSession != null) {
                    String str3 = (String) methodCall.argument("sourceOrigin");
                    String str4 = (String) methodCall.argument("targetOrigin");
                    result.success(Boolean.valueOf(this.chromeCustomTabsActivity.customTabsSession.requestPostMessageChannel(Uri.parse(str3), str4 != null ? Uri.parse(str4) : null, new Bundle())));
                    break;
                } else {
                    result.success(Boolean.FALSE);
                    break;
                }
                break;
            case "postMessage":
                ChromeCustomTabsActivity chromeCustomTabsActivity5 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity5 != null && chromeCustomTabsActivity5.customTabsSession != null) {
                    result.success(Integer.valueOf(this.chromeCustomTabsActivity.customTabsSession.postMessage((String) methodCall.argument("message"), new Bundle())));
                    break;
                } else {
                    result.success(-3);
                    break;
                }
                break;
            case "mayLaunchUrl":
                if (this.chromeCustomTabsActivity != null) {
                    result.success(Boolean.valueOf(this.chromeCustomTabsActivity.mayLaunchUrl((String) methodCall.argument("url"), (List) methodCall.argument("otherLikelyURLs"))));
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

    public ChromeCustomTabsChannelDelegate(ChromeCustomTabsActivity chromeCustomTabsActivity, MethodChannel methodChannel) {
        super(methodChannel);
        this.chromeCustomTabsActivity = chromeCustomTabsActivity;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.chromeCustomTabsActivity = null;
    }

    public void onClosed() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onClosed", new HashMap());
    }

    public void onCompletedInitialLoad() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onCompletedInitialLoad", new HashMap());
    }

    public void onGreatestScrollPercentageIncreased(int i11) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("scrollPercentage", Integer.valueOf(i11));
        channel.invokeMethod("onGreatestScrollPercentageIncreased", map);
    }

    public void onItemActionPerform(int i11, String str, String str2) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("id", Integer.valueOf(i11));
        map.put("url", str);
        map.put("title", str2);
        channel.invokeMethod("onItemActionPerform", map);
    }

    public void onMessageChannelReady() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onMessageChannelReady", new HashMap());
    }

    public void onNavigationEvent(int i11) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("navigationEvent", Integer.valueOf(i11));
        channel.invokeMethod("onNavigationEvent", map);
    }

    public void onOpened() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onOpened", new HashMap());
    }

    public void onPostMessage(String str) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("message", str);
        channel.invokeMethod("onPostMessage", map);
    }

    public void onRelationshipValidationResult(int i11, Uri uri, boolean z11) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("relation", Integer.valueOf(i11));
        map.put("requestedOrigin", uri.toString());
        map.put(DbParams.KEY_CHANNEL_RESULT, Boolean.valueOf(z11));
        channel.invokeMethod("onRelationshipValidationResult", map);
    }

    public void onSecondaryItemActionPerform(String str, String str2) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("name", str);
        map.put("url", str2);
        channel.invokeMethod("onSecondaryItemActionPerform", map);
    }

    public void onServiceConnected() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onServiceConnected", new HashMap());
    }

    public void onSessionEnded(boolean z11) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("didUserInteract", Boolean.valueOf(z11));
        channel.invokeMethod("onSessionEnded", map);
    }

    public void onVerticalScrollEvent(boolean z11) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("isDirectionUp", Boolean.valueOf(z11));
        channel.invokeMethod("onVerticalScrollEvent", map);
    }
}
