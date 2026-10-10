package com.sensorsdata.analytics.android.sdk.deeplink;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.ServerUrl;
import com.sensorsdata.analytics.android.sdk.advert.utils.ChannelUtils;
import com.sensorsdata.analytics.android.sdk.advert.utils.OaidHelper;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class DeepLinkManager {
    public static final String IS_ANALYTICS_DEEPLINK = "is_analytics_deeplink";
    private static DeepLinkProcessor mDeepLinkProcessor;

    public enum DeepLinkType {
        CHANNEL,
        SENSORSDATA
    }

    public interface OnDeepLinkParseFinishCallback {
        void onFinish(DeepLinkType deepLinkType, String str, boolean z11, long j11);
    }

    private static DeepLinkProcessor createDeepLink(Intent intent, String str) {
        if (intent == null) {
            return null;
        }
        if (isSensorsDataDeepLink(intent, new ServerUrl(str).getHost())) {
            return new SensorsDataDeepLink(intent, str);
        }
        if (isUtmDeepLink(intent)) {
            return new ChannelDeepLink(intent);
        }
        return null;
    }

    public static boolean parseDeepLink(final Activity activity, final boolean z11, final SensorsDataDeepLinkCallback sensorsDataDeepLinkCallback) {
        try {
            Intent intent = activity.getIntent();
            DeepLinkProcessor deepLinkProcessorCreateDeepLink = createDeepLink(intent, SensorsDataAPI.sharedInstance().getServerUrl());
            mDeepLinkProcessor = deepLinkProcessorCreateDeepLink;
            if (deepLinkProcessorCreateDeepLink == null) {
                return false;
            }
            ChannelUtils.clearUtm(activity.getApplicationContext());
            mDeepLinkProcessor.setDeepLinkParseFinishCallback(new OnDeepLinkParseFinishCallback() { // from class: com.sensorsdata.analytics.android.sdk.deeplink.DeepLinkManager.2
                @Override // com.sensorsdata.analytics.android.sdk.deeplink.DeepLinkManager.OnDeepLinkParseFinishCallback
                public void onFinish(DeepLinkType deepLinkType, String str, boolean z12, long j11) {
                    if (z11) {
                        ChannelUtils.saveDeepLinkInfo(activity.getApplicationContext());
                    }
                    SensorsDataDeepLinkCallback sensorsDataDeepLinkCallback2 = sensorsDataDeepLinkCallback;
                    if (sensorsDataDeepLinkCallback2 == null || deepLinkType != DeepLinkType.SENSORSDATA) {
                        return;
                    }
                    sensorsDataDeepLinkCallback2.onReceive(str, z12, j11);
                }
            });
            mDeepLinkProcessor.parseDeepLink(intent);
            trackDeepLinkLaunchEvent(activity.getApplicationContext(), mDeepLinkProcessor);
            return true;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return false;
        }
    }

    public static void resetDeepLinkProcessor() {
        mDeepLinkProcessor = null;
    }

    private static boolean isDeepLink(Intent intent) {
        return intent != null && "android.intent.action.VIEW".equals(intent.getAction());
    }

    public static void mergeDeepLinkProperty(JSONObject jSONObject) {
        try {
            DeepLinkProcessor deepLinkProcessor = mDeepLinkProcessor;
            if (deepLinkProcessor != null) {
                deepLinkProcessor.mergeDeepLinkProperty(jSONObject);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private static void trackDeepLinkLaunchEvent(final Context context, DeepLinkProcessor deepLinkProcessor) {
        final JSONObject jSONObject = new JSONObject();
        final SensorsDataAPI sensorsDataAPISharedInstance = SensorsDataAPI.sharedInstance();
        final boolean z11 = (deepLinkProcessor instanceof SensorsDataDeepLink) && sensorsDataAPISharedInstance.isDeepLinkInstallSource();
        try {
            jSONObject.put("$deeplink_url", deepLinkProcessor.getDeepLinkUrl());
            jSONObject.put("$time", new Date(System.currentTimeMillis()));
        } catch (JSONException e11) {
            SALog.printStackTrace(e11);
        }
        SensorsDataUtils.mergeJSONObject(ChannelUtils.getLatestUtmProperties(), jSONObject);
        SensorsDataUtils.mergeJSONObject(ChannelUtils.getUtmProperties(), jSONObject);
        sensorsDataAPISharedInstance.transformTaskQueue(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.deeplink.DeepLinkManager.1
            @Override // java.lang.Runnable
            public void run() {
                if (z11) {
                    try {
                        JSONObject jSONObject2 = jSONObject;
                        Context context2 = context;
                        jSONObject2.put("$ios_install_source", ChannelUtils.getDeviceInfo(context2, SensorsDataUtils.getAndroidID(context2), OaidHelper.getOAID(context)));
                    } catch (JSONException e12) {
                        SALog.printStackTrace(e12);
                    }
                }
                sensorsDataAPISharedInstance.trackInternal("$AppDeeplinkLaunch", jSONObject);
            }
        });
    }

    private static boolean isSensorsDataDeepLink(Intent intent, String str) {
        Uri data;
        List<String> pathSegments;
        if (isDeepLink(intent) && !TextUtils.isEmpty(str) && intent.getData() != null && (pathSegments = (data = intent.getData()).getPathSegments()) != null && !pathSegments.isEmpty() && pathSegments.get(0).equals("sd")) {
            String host = data.getHost();
            if (!TextUtils.isEmpty(host) && (host.equals(str) || host.equals(DbParams.DATABASE_NAME))) {
                return true;
            }
        }
        return false;
    }

    @TargetApi(11)
    private static boolean isUtmDeepLink(Intent intent) {
        Set<String> queryParameterNames;
        if (!isDeepLink(intent) || intent.getData() == null || (queryParameterNames = intent.getData().getQueryParameterNames()) == null || queryParameterNames.size() <= 0) {
            return false;
        }
        return ChannelUtils.hasLinkUtmProperties(queryParameterNames);
    }
}
