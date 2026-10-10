package com.sensorsdata.analytics.android.sdk.visual.property;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.sensorsdata.analytics.android.sdk.AopConstants;
import com.sensorsdata.analytics.android.sdk.AppStateManager;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.util.AopUtil;
import com.sensorsdata.analytics.android.sdk.util.AppInfoUtils;
import com.sensorsdata.analytics.android.sdk.util.ViewUtil;
import com.sensorsdata.analytics.android.sdk.visual.ViewTreeStatusObservable;
import com.sensorsdata.analytics.android.sdk.visual.model.ViewNode;
import com.sensorsdata.analytics.android.sdk.visual.model.VisualConfig;
import com.tencent.bugly.proguard.C33820nf;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class VisualPropertiesManager {
    private static final String PROPERTY_TYPE_NUMBER = "NUMBER";
    private static final String TAG = "SA.VP.VisualPropertiesManager";
    private static VisualPropertiesManager sInstance;
    private CollectLogListener mCollectLogListener;
    private VisualPropertiesCache mConfigCache;
    private VisualConfigRequestHelper mRequestHelper;
    private VisualConfig mVisualConfig;

    public interface CollectLogListener {
        void onCheckEventConfigFailure();

        void onCheckVisualConfigFailure(String str);

        void onFindPropertyElementFailure(String str, String str2, String str3);

        void onOtherError(String str);

        void onParsePropertyContentFailure(String str, String str2, String str3, String str4);

        void onStart(String str, String str2, ViewNode viewNode);

        void onSwitchClose();
    }

    public enum VisualEventType {
        APP_CLICK("appclick", AopConstants.APP_CLICK_EVENT_NAME);

        private String trackEventType;
        private String visualEventType;

        public String getVisualEventType() {
            return this.visualEventType;
        }

        public static VisualEventType getVisualEventType(String str) {
            for (VisualEventType visualEventType : values()) {
                if (TextUtils.equals(visualEventType.trackEventType, str)) {
                    return visualEventType;
                }
            }
            return null;
        }

        VisualEventType(String str, String str2) {
            this.visualEventType = str;
            this.trackEventType = str2;
        }
    }

    public void requestVisualConfig(Context context) {
        this.mRequestHelper.requestVisualConfig(context, getVisualConfigVersion(), new VisualConfigRequestHelper.IApiCallback() { // from class: com.sensorsdata.analytics.android.sdk.visual.property.VisualPropertiesManager.1
            @Override // com.sensorsdata.analytics.android.sdk.visual.property.VisualConfigRequestHelper.IApiCallback
            public void onSuccess(String str) {
                VisualPropertiesManager.this.save2Cache(str);
            }
        });
    }

    public void unRegisterCollectLogListener() {
        this.mCollectLogListener = null;
    }

    public static VisualPropertiesManager getInstance() {
        if (sInstance == null) {
            synchronized (VisualPropertiesManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new VisualPropertiesManager();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return sInstance;
    }

    private void mergeVisualProperty(List<VisualConfig.VisualProperty> list, VisualConfig.VisualEvent visualEvent, JSONObject jSONObject, ViewNode viewNode) {
        String viewContent;
        try {
            for (VisualConfig.VisualProperty visualProperty : list) {
                if (TextUtils.isEmpty(visualProperty.name)) {
                    SALog.m68589i(TAG, "config visual property name is empty");
                } else if (TextUtils.isEmpty(visualProperty.elementPath)) {
                    SALog.m68589i(TAG, "config visual property elementPath is empty");
                } else {
                    if (viewNode != null && !TextUtils.isEmpty(viewNode.getViewPosition()) && !TextUtils.isEmpty(visualEvent.elementPosition) && !visualEvent.limitElementPosition && !TextUtils.isEmpty(visualProperty.elementPosition) && TextUtils.equals(visualProperty.elementPath.split(C33820nf.f71144W)[0], visualEvent.elementPath.split(C33820nf.f71144W)[0])) {
                        visualProperty.elementPosition = viewNode.getViewPosition();
                        SALog.m68589i(TAG, "visualProperty elementPosition replace: " + viewNode.getViewPosition());
                    }
                    String strGroup = null;
                    try {
                        ViewNode viewNode2 = ViewTreeStatusObservable.getInstance().getViewNode(viewNode != null ? viewNode.getView() : null, visualProperty.elementPath, visualProperty.elementPosition, visualProperty.screenName);
                        if (viewNode2 != null && TextUtils.equals(visualProperty.elementPath, viewNode2.getViewPath()) && (TextUtils.isEmpty(visualProperty.elementPosition) || TextUtils.equals(visualProperty.elementPosition, viewNode2.getViewPosition()))) {
                            viewContent = viewNode2.getViewContent();
                            try {
                                WeakReference<View> view = viewNode2.getView() != null ? viewNode2.getView() : null;
                                if (view != null && view.get() != null) {
                                    viewContent = ViewUtil.getViewContentAndType(view.get(), true).getViewContent();
                                }
                            } catch (Exception e11) {
                                e = e11;
                                SALog.printStackTrace(e);
                            }
                        } else {
                            viewContent = null;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        viewContent = null;
                    }
                    if (viewContent == null || TextUtils.isEmpty(viewContent)) {
                        CollectLogListener collectLogListener = this.mCollectLogListener;
                        if (collectLogListener != null) {
                            collectLogListener.onFindPropertyElementFailure(visualProperty.name, visualProperty.elementPath, visualProperty.elementPosition);
                        }
                    } else {
                        SALog.m68589i(TAG, String.format("find property target view success, property element_path: %s,element_position: %s,element_content: %s", visualProperty.elementPath, visualProperty.elementPosition, viewContent));
                        if (!TextUtils.isEmpty(visualProperty.regular)) {
                            try {
                                Matcher matcher = Pattern.compile(visualProperty.regular, 40).matcher(viewContent);
                                if (matcher.find()) {
                                    strGroup = matcher.group();
                                    SALog.m68589i(TAG, String.format("propertyValue is: %s", strGroup));
                                } else {
                                    SALog.m68589i(TAG, "matcher not find continue");
                                    CollectLogListener collectLogListener2 = this.mCollectLogListener;
                                    if (collectLogListener2 != null) {
                                        collectLogListener2.onParsePropertyContentFailure(visualProperty.name, visualProperty.type, viewContent, visualProperty.regular);
                                    }
                                }
                            } catch (Exception e13) {
                                CollectLogListener collectLogListener3 = this.mCollectLogListener;
                                if (collectLogListener3 != null) {
                                    collectLogListener3.onParsePropertyContentFailure(visualProperty.name, visualProperty.type, viewContent, visualProperty.regular);
                                }
                                SALog.printStackTrace(e13);
                            }
                        }
                        if (!TextUtils.isEmpty(strGroup)) {
                            if (!TextUtils.equals(PROPERTY_TYPE_NUMBER, visualProperty.type)) {
                                try {
                                    jSONObject.put(visualProperty.name, strGroup);
                                } catch (JSONException e14) {
                                    CollectLogListener collectLogListener4 = this.mCollectLogListener;
                                    if (collectLogListener4 != null) {
                                        collectLogListener4.onOtherError(e14.getMessage());
                                    }
                                }
                            } else if (strGroup != null) {
                                try {
                                    jSONObject.put(visualProperty.name, NumberFormat.getInstance().parse(strGroup));
                                } catch (Exception e15) {
                                    CollectLogListener collectLogListener5 = this.mCollectLogListener;
                                    if (collectLogListener5 != null) {
                                        collectLogListener5.onOtherError(e15.getMessage());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e16) {
            SALog.printStackTrace(e16);
        }
    }

    public List<VisualConfig.VisualPropertiesConfig> getMatchEventConfigList(List<VisualConfig.VisualPropertiesConfig> list, VisualEventType visualEventType, String str, String str2, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        try {
            for (VisualConfig.VisualPropertiesConfig visualPropertiesConfig : list) {
                if (TextUtils.equals(visualPropertiesConfig.eventType, visualEventType.getVisualEventType())) {
                    VisualConfig.VisualEvent visualEvent = visualPropertiesConfig.event;
                    if (TextUtils.equals(visualEvent.screenName, str)) {
                        if (visualEventType == VisualEventType.APP_CLICK) {
                            if (!TextUtils.equals(visualEvent.elementPath, str2)) {
                                SALog.m68589i(TAG, String.format("event element_path is not match: current element_path is %s, config element_path is %s ", str2, visualEvent.elementPath));
                            } else if (visualEvent.limitElementPosition && !TextUtils.equals(visualEvent.elementPosition, str3)) {
                                SALog.m68589i(TAG, String.format("event element_position is not match: current element_position is %s, config element_position is %s ", str3, visualEvent.elementPosition));
                            } else if (visualEvent.limitElementContent && !TextUtils.equals(visualEvent.elementContent, str4)) {
                                SALog.m68589i(TAG, String.format("event element_content is not match: current element_content is %s, config element_content is %s ", str4, visualEvent.elementContent));
                            }
                        }
                        arrayList.add(visualPropertiesConfig);
                    }
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        return arrayList;
    }

    public VisualConfig getVisualConfig() {
        return this.mVisualConfig;
    }

    public String getVisualConfigVersion() {
        VisualConfig visualConfig = this.mVisualConfig;
        if (visualConfig != null) {
            return visualConfig.version;
        }
        return null;
    }

    @TargetApi(12)
    public void mergeVisualProperties(VisualEventType visualEventType, JSONObject jSONObject, ViewNode viewNode) {
        Exception exc;
        String str;
        String viewPosition;
        String viewContent;
        WeakReference<View> view;
        try {
            String strOptString = jSONObject.optString(AopConstants.SCREEN_NAME);
            CollectLogListener collectLogListener = this.mCollectLogListener;
            if (collectLogListener != null) {
                try {
                    collectLogListener.onStart(visualEventType.visualEventType, strOptString, viewNode);
                } catch (Exception e11) {
                    exc = e11;
                }
            }
            SALog.m68589i(TAG, String.format("mergeVisualProperties eventType: %s, screenName:%s ", visualEventType.getVisualEventType(), strOptString));
            if (TextUtils.isEmpty(strOptString)) {
                SALog.m68589i(TAG, "screenName is empty and return");
                return;
            }
            if (SensorsDataAPI.sharedInstance().isVisualizedAutoTrackEnabled()) {
                Activity activityFromContext = (viewNode == null || (view = viewNode.getView()) == null || view.get() == null) ? null : AopUtil.getActivityFromContext(view.get().getContext(), view.get());
                if (activityFromContext == null) {
                    activityFromContext = AppStateManager.getInstance().getForegroundActivity();
                }
                try {
                    if (activityFromContext == null || !SensorsDataAPI.sharedInstance().isVisualizedAutoTrackActivity(activityFromContext.getClass())) {
                        SALog.m68589i(TAG, "activity is null or not in white list and return");
                        CollectLogListener collectLogListener2 = this.mCollectLogListener;
                        if (collectLogListener2 != null) {
                            collectLogListener2.onOtherError("activity is null or not in white list and return");
                            return;
                        }
                        return;
                    }
                    if (this.mVisualConfig == null) {
                        SALog.m68589i(TAG, "visual properties is empty and return");
                        CollectLogListener collectLogListener3 = this.mCollectLogListener;
                        if (collectLogListener3 != null) {
                            collectLogListener3.onCheckVisualConfigFailure("本地缓存无自定义属性配置");
                            return;
                        }
                    } else {
                        if (checkAppIdAndProject()) {
                            List<VisualConfig.VisualPropertiesConfig> list = this.mVisualConfig.events;
                            if (list == null || list.size() == 0) {
                                SALog.m68589i(TAG, "propertiesConfigs is empty");
                                CollectLogListener collectLogListener4 = this.mCollectLogListener;
                                if (collectLogListener4 != null) {
                                    collectLogListener4.onOtherError("propertiesConfigs is empty");
                                    return;
                                }
                                return;
                            }
                            if (viewNode != null) {
                                String viewPath = viewNode.getViewPath();
                                viewPosition = viewNode.getViewPosition();
                                viewContent = viewNode.getViewContent();
                                str = viewPath;
                            } else {
                                str = null;
                                viewPosition = null;
                                viewContent = null;
                            }
                            List<VisualConfig.VisualPropertiesConfig> matchEventConfigList = getMatchEventConfigList(list, visualEventType, strOptString, str, viewPosition, viewContent);
                            if (matchEventConfigList.size() == 0) {
                                SALog.m68589i(TAG, "event config is empty and return");
                                CollectLogListener collectLogListener5 = this.mCollectLogListener;
                                if (collectLogListener5 != null) {
                                    collectLogListener5.onCheckEventConfigFailure();
                                    return;
                                }
                                return;
                            }
                            for (VisualConfig.VisualPropertiesConfig visualPropertiesConfig : matchEventConfigList) {
                                VisualConfig.VisualEvent visualEvent = visualPropertiesConfig.event;
                                List<VisualConfig.VisualProperty> list2 = visualPropertiesConfig.properties;
                                if (list2 != null && list2.size() != 0) {
                                    mergeVisualProperty(list2, visualEvent, jSONObject, viewNode);
                                }
                                SALog.m68589i(TAG, "properties is empty ");
                                return;
                            }
                            return;
                        }
                        CollectLogListener collectLogListener6 = this.mCollectLogListener;
                        if (collectLogListener6 != null) {
                            collectLogListener6.onCheckVisualConfigFailure("本地缓存的 AppId 或 Project 与当前项目不一致");
                            return;
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            } else {
                SALog.m68589i(TAG, "you should call 'enableVisualizedAutoTrack(true)' first");
                CollectLogListener collectLogListener7 = this.mCollectLogListener;
                if (collectLogListener7 != null) {
                    collectLogListener7.onSwitchClose();
                    return;
                }
            }
            return;
        } catch (Exception e13) {
            e = e13;
        }
        exc = e;
        SALog.printStackTrace(exc);
    }

    public void registerCollectLogListener(CollectLogListener collectLogListener) {
        this.mCollectLogListener = collectLogListener;
    }

    public void requestVisualConfig() {
        Context context = SensorsDataAPI.sharedInstance().getContext();
        if (context != null) {
            requestVisualConfig(context);
        }
    }

    public void save2Cache(String str) {
        this.mConfigCache.save2Cache(str);
        this.mVisualConfig = this.mConfigCache.getVisualConfig();
    }

    private VisualPropertiesManager() {
        VisualPropertiesCache visualPropertiesCache = new VisualPropertiesCache();
        this.mConfigCache = visualPropertiesCache;
        this.mVisualConfig = visualPropertiesCache.getVisualConfig();
        this.mRequestHelper = new VisualConfigRequestHelper();
    }

    public boolean checkAppIdAndProject() {
        String serverUrl = SensorsDataAPI.sharedInstance().getServerUrl();
        if (TextUtils.isEmpty(serverUrl)) {
            SALog.m68589i(TAG, "serverUrl is empty and return");
            return false;
        }
        String queryParameter = Uri.parse(serverUrl).getQueryParameter("project");
        String processName = AppInfoUtils.getProcessName(SensorsDataAPI.sharedInstance().getContext());
        if (!TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(processName)) {
            if (!TextUtils.equals(processName, this.mVisualConfig.appId)) {
                SALog.m68589i(TAG, String.format("app_id is not equals: current app_id is %s, config app_id is %s ", processName, this.mVisualConfig.appId));
                return false;
            }
            if (!TextUtils.equals(queryParameter, this.mVisualConfig.project)) {
                SALog.m68589i(TAG, String.format("project is not equals: current project is %s, config project is %s ", queryParameter, this.mVisualConfig.project));
                return false;
            }
            return true;
        }
        SALog.m68589i(TAG, "project or app_id is empty and return");
        return false;
    }
}
