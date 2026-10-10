package com.sensorsdata.analytics.android.sdk.visual.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import com.sensorsdata.analytics.android.sdk.AopConstants;
import com.sensorsdata.analytics.android.sdk.AppStateManager;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.util.AopUtil;
import com.sensorsdata.analytics.android.sdk.util.ReflectUtil;
import com.sensorsdata.analytics.android.sdk.util.ViewUtil;
import com.sensorsdata.analytics.android.sdk.visual.model.SnapInfo;
import com.sensorsdata.analytics.android.sdk.visual.snap.Pathfinder;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class VisualUtil {
    public static int getChildIndex(ViewParent viewParent, View view) {
        try {
            if (!(viewParent instanceof ViewGroup)) {
                return -1;
            }
            ViewGroup viewGroup = (ViewGroup) viewParent;
            String viewId = AopUtil.getViewId(view);
            String canonicalName = view.getClass().getCanonicalName();
            int i11 = 0;
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                if (Pathfinder.hasClassName(childAt, canonicalName)) {
                    String viewId2 = AopUtil.getViewId(childAt);
                    if ((viewId == null || viewId.equals(viewId2)) && childAt == view) {
                        return i11;
                    }
                    i11++;
                }
            }
            return -1;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return -1;
        }
    }

    public static JSONObject getScreenNameAndTitle(View view, SnapInfo snapInfo) {
        if (view == null) {
            return null;
        }
        Activity activityFromContext = AopUtil.getActivityFromContext(view.getContext(), view);
        if (activityFromContext == null) {
            activityFromContext = AppStateManager.getInstance().getForegroundActivity();
        }
        if (activityFromContext == null || activityFromContext.getWindow() == null || !activityFromContext.getWindow().isActive()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        Object fragmentFromView = AopUtil.getFragmentFromView(view, activityFromContext);
        if (fragmentFromView == null) {
            JSONObject jSONObjectBuildTitleAndScreenName = AopUtil.buildTitleAndScreenName(activityFromContext);
            mergeRnScreenNameAndTitle(jSONObjectBuildTitleAndScreenName);
            return jSONObjectBuildTitleAndScreenName;
        }
        AopUtil.getScreenNameAndTitleFromFragment(jSONObject, fragmentFromView, activityFromContext);
        if (snapInfo != null && !snapInfo.hasFragment) {
            snapInfo.hasFragment = true;
        }
        return jSONObject;
    }

    public static int getVisibility(View view) {
        return (!(view instanceof Spinner) && ViewUtil.isViewSelfVisible(view) && view.isShown()) ? 0 : 8;
    }

    @SuppressLint({"NewApi"})
    public static boolean isSupportElementContent(View view) {
        return ((view instanceof SeekBar) || (view instanceof RatingBar) || (view instanceof Switch)) ? false : true;
    }

    public static void mergeRnScreenNameAndTitle(JSONObject jSONObject) {
        try {
            String str = (String) ReflectUtil.callStaticMethod(ReflectUtil.getCurrentClass(new String[]{"com.sensorsdata.analytics.utils.RNViewUtils"}), "getVisualizeProperties", new Object[0]);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject(str);
            String strOptString = jSONObject2.optString(AopConstants.SCREEN_NAME);
            String strOptString2 = jSONObject2.optString(AopConstants.TITLE);
            if (jSONObject.has(AopConstants.SCREEN_NAME)) {
                jSONObject.put(AopConstants.SCREEN_NAME, strOptString);
            }
            if (jSONObject.has(AopConstants.TITLE)) {
                jSONObject.put(AopConstants.TITLE, strOptString2);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static boolean isForbiddenClick(View view) {
        if (ViewUtil.instanceOfWebView(view) || (view instanceof AdapterView)) {
            return true;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (textView.isTextSelectable() && !textView.hasOnClickListeners()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isSupportClick(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AdapterView) || ViewUtil.instanceOfRecyclerView(parent) || (view instanceof RatingBar) || (view instanceof SeekBar)) {
            return true;
        }
        return false;
    }
}
