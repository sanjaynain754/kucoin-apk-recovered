package com.sensorsdata.analytics.android.sdk.autotrack;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.Spinner;
import com.sensorsdata.analytics.android.sdk.AopConstants;
import com.sensorsdata.analytics.android.sdk.AppStateManager;
import com.sensorsdata.analytics.android.sdk.C27650R;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.ScreenAutoTracker;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.util.AopUtil;
import com.sensorsdata.analytics.android.sdk.util.SADataHelper;
import com.sensorsdata.analytics.android.sdk.util.SAFragmentUtils;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class FragmentViewScreenCallbacks implements SAFragmentLifecycleCallbacks {
    private static void trackFragmentAppViewScreen(Object obj) {
        JSONObject trackProperties;
        try {
            if (!SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_VIEW_SCREEN) && SensorsDataAPI.sharedInstance().isTrackFragmentAppViewScreenEnabled() && !"com.bumptech.glide.manager.SupportRequestManagerFragment".equals(obj.getClass().getCanonicalName()) && SensorsDataAPI.sharedInstance().isFragmentAutoTrackAppViewScreen(obj.getClass())) {
                JSONObject jSONObject = new JSONObject();
                AopUtil.getScreenNameAndTitleFromFragment(jSONObject, obj, null);
                AppStateManager.getInstance().setFragmentScreenName(obj, jSONObject.optString(AopConstants.SCREEN_NAME));
                if ((obj instanceof ScreenAutoTracker) && (trackProperties = ((ScreenAutoTracker) obj).getTrackProperties()) != null) {
                    SensorsDataUtils.mergeJSONObject(trackProperties, jSONObject);
                }
                SensorsDataAPI.sharedInstance().trackViewScreen(SensorsDataUtils.getScreenUrl(obj), SADataHelper.appendLibMethodAutoTrack(jSONObject));
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private static void traverseView(String str, ViewGroup viewGroup) {
        try {
            if (!TextUtils.isEmpty(str) && viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    childAt.setTag(C27650R.id.sensors_analytics_tag_view_fragment_name, str);
                    if ((childAt instanceof ViewGroup) && !(childAt instanceof ListView) && !(childAt instanceof GridView) && !(childAt instanceof Spinner) && !(childAt instanceof RadioGroup)) {
                        traverseView(str, (ViewGroup) childAt);
                    }
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void onHiddenChanged(Object obj, boolean z11) {
        try {
            if (!SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_VIEW_SCREEN) && SensorsDataAPI.sharedInstance().isTrackFragmentAppViewScreenEnabled() && SAFragmentUtils.isFragmentVisible(obj)) {
                trackFragmentAppViewScreen(obj);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void onResume(Object obj) {
        try {
            if (!SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_VIEW_SCREEN) && SensorsDataAPI.sharedInstance().isTrackFragmentAppViewScreenEnabled() && SAFragmentUtils.isFragmentVisible(obj)) {
                trackFragmentAppViewScreen(obj);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void onViewCreated(Object obj, View view, Bundle bundle) {
        Window window;
        try {
            String name = obj.getClass().getName();
            int i11 = C27650R.id.sensors_analytics_tag_view_fragment_name;
            view.setTag(i11, name);
            if (view instanceof ViewGroup) {
                traverseView(name, (ViewGroup) view);
            }
            Activity activityFromContext = AopUtil.getActivityFromContext(view.getContext(), view);
            if (activityFromContext != null && (window = activityFromContext.getWindow()) != null && window.isActive()) {
                window.getDecorView().getRootView().setTag(i11, "");
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void setUserVisibleHint(Object obj, boolean z11) {
        try {
            if (!SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_VIEW_SCREEN) && SensorsDataAPI.sharedInstance().isTrackFragmentAppViewScreenEnabled() && SAFragmentUtils.isFragmentVisible(obj)) {
                trackFragmentAppViewScreen(obj);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void onCreate(Object obj) {
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void onPause(Object obj) {
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void onStart(Object obj) {
    }

    @Override // com.sensorsdata.analytics.android.sdk.autotrack.SAFragmentLifecycleCallbacks
    public void onStop(Object obj) {
    }
}
