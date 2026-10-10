package com.sensorsdata.analytics.android.sdk;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.google.android.material.tabs.TabLayout;
import com.sensorsdata.analytics.android.sdk.dialog.SensorsDataDialogUtils;
import com.sensorsdata.analytics.android.sdk.util.AopUtil;
import com.sensorsdata.analytics.android.sdk.util.SAFragmentUtils;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import com.sensorsdata.analytics.android.sdk.util.ThreadUtils;
import com.sensorsdata.analytics.android.sdk.util.ViewUtil;
import com.sensorsdata.analytics.android.sdk.util.WindowHelper;
import com.sensorsdata.analytics.android.sdk.visual.WebViewVisualInterface;
import com.sensorsdata.analytics.android.sdk.visual.model.ViewNode;
import com.sensorsdata.analytics.android.sdk.visual.util.VisualUtil;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes59.dex */
public class SensorsDataAutoTrackHelper {
    private static final String TAG = "SensorsDataAutoTrackHelper";
    private static HashMap<Integer, Long> eventTimestamp = new HashMap<>();

    private static boolean isSupportJellyBean() {
        return true;
    }

    public static void loadUrl(View view, String str) {
        loadUrl2(view, str);
        invokeWebViewLoad(view, "loadUrl", new Object[]{str}, new Class[]{String.class});
    }

    public static void loadUrl2(View view, String str) {
        if (view == null) {
            SALog.m68589i(TAG, "WebView has not initialized.");
        } else {
            setupH5Bridge(view);
        }
    }

    public static void trackMenuItem(MenuItem menuItem) {
        trackMenuItem(null, menuItem);
    }

    public static void trackTabLayoutSelected(Object obj, Object obj2) {
        Class<TabLayout> cls;
        Activity activityFromContext;
        boolean z11;
        Activity activityFromFragment;
        Method method;
        Field declaredField;
        View view;
        View view2;
        Field declaredField2;
        JSONObject jSONObject;
        String viewText;
        Object objInvoke;
        Class<TabLayout> cls2 = TabLayout.class;
        if (obj2 == null) {
            return;
        }
        try {
            if (SensorsDataAPI.sharedInstance().isAutoTrackEnabled() && !SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_CLICK)) {
                ViewNode viewNodeAddViewPathProperties = null;
                try {
                    int i11 = TabLayout.MODE_SCROLLABLE;
                    cls = cls2;
                } catch (Exception unused) {
                    cls = null;
                }
                try {
                    int i12 = TabLayout.MODE_SCROLLABLE;
                } catch (Exception unused2) {
                    cls2 = null;
                }
                if (cls == null && cls2 == null) {
                    return;
                }
                if (cls == null || !AopUtil.isViewIgnored(cls)) {
                    if ((cls2 == null || !AopUtil.isViewIgnored(cls2)) && !isDeBounceTrack(obj2)) {
                        if (obj instanceof Context) {
                            activityFromFragment = AopUtil.getActivityFromContext((Context) obj, null);
                            z11 = false;
                        } else {
                            try {
                                Field[] declaredFields = obj.getClass().getDeclaredFields();
                                int length = declaredFields.length;
                                activityFromContext = null;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length) {
                                        z11 = false;
                                        activityFromFragment = activityFromContext;
                                        break;
                                    }
                                    try {
                                        Field field = declaredFields[i13];
                                        field.setAccessible(true);
                                        Object obj3 = field.get(obj);
                                        if (obj3 instanceof Activity) {
                                            z11 = false;
                                            activityFromFragment = (Activity) obj3;
                                            break;
                                        } else if (SAFragmentUtils.isFragment(obj3)) {
                                            z11 = true;
                                            activityFromFragment = activityFromContext;
                                            obj = obj3;
                                            break;
                                        } else {
                                            if (obj3 instanceof View) {
                                                activityFromContext = AopUtil.getActivityFromContext(((View) obj3).getContext(), null);
                                            }
                                            i13++;
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        SALog.printStackTrace(e);
                                        z11 = false;
                                        activityFromFragment = activityFromContext;
                                        break;
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                activityFromContext = null;
                            }
                        }
                        if (activityFromFragment == null || !SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(activityFromFragment.getClass())) {
                            if (z11 && SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(obj.getClass())) {
                                return;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(AopConstants.ELEMENT_TYPE, "TabLayout");
                            if (z11) {
                                activityFromFragment = AopUtil.getActivityFromFragment(obj);
                                AopUtil.getScreenNameAndTitleFromFragment(jSONObject2, obj, activityFromFragment);
                            } else if (activityFromFragment != null) {
                                SensorsDataUtils.mergeJSONObject(AopUtil.buildTitleAndScreenName(activityFromFragment), jSONObject2);
                            }
                            try {
                                method = TabLayout.Tab.class.getMethod("getText", new Class[0]);
                            } catch (NoSuchMethodException unused3) {
                                method = null;
                            }
                            if (method != null && (objInvoke = method.invoke(obj2, new Object[0])) != null) {
                                jSONObject2.put(AopConstants.ELEMENT_CONTENT, objInvoke);
                            }
                            if (activityFromFragment != null) {
                                try {
                                    try {
                                        try {
                                            declaredField = TabLayout.Tab.class.getDeclaredField("mCustomView");
                                        } catch (NoSuchFieldException unused4) {
                                            declaredField = TabLayout.Tab.class.getDeclaredField("customView");
                                        }
                                    } catch (NoSuchFieldException unused5) {
                                        declaredField = null;
                                    }
                                    if (declaredField != null) {
                                        declaredField.setAccessible(true);
                                        view = (View) declaredField.get(obj2);
                                        if (view != null) {
                                            try {
                                                StringBuilder sb2 = new StringBuilder();
                                                if (view instanceof ViewGroup) {
                                                    viewText = AopUtil.traverseView(sb2, (ViewGroup) view);
                                                    if (!TextUtils.isEmpty(viewText)) {
                                                        viewText = viewText.substring(0, viewText.length() - 1);
                                                    }
                                                } else {
                                                    viewText = AopUtil.getViewText(view);
                                                }
                                                if (!TextUtils.isEmpty(viewText)) {
                                                    jSONObject2.put(AopConstants.ELEMENT_CONTENT, viewText);
                                                }
                                            } catch (Exception e13) {
                                                SALog.printStackTrace(e13);
                                            }
                                        }
                                    } else {
                                        view = null;
                                    }
                                    try {
                                        Field declaredField3 = TabLayout.Tab.class.getDeclaredField(TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW);
                                        declaredField3.setAccessible(true);
                                        try {
                                            view2 = (View) declaredField3.get(obj2);
                                        } catch (IllegalAccessException e14) {
                                            SALog.printStackTrace(e14);
                                            view2 = null;
                                        }
                                    } catch (NoSuchFieldException e15) {
                                        SALog.printStackTrace(e15);
                                    }
                                    if (view2 == null) {
                                        try {
                                            Field declaredField4 = TabLayout.Tab.class.getDeclaredField("mView");
                                            declaredField4.setAccessible(true);
                                            try {
                                                view2 = (View) declaredField4.get(obj2);
                                            } catch (IllegalAccessException e16) {
                                                SALog.printStackTrace(e16);
                                            }
                                        } catch (NoSuchFieldException e17) {
                                            SALog.printStackTrace(e17);
                                        }
                                    }
                                    viewNodeAddViewPathProperties = view2 != null ? AopUtil.addViewPathProperties(activityFromFragment, view2, jSONObject2) : null;
                                    if (view == null || view.getId() == -1) {
                                        try {
                                            declaredField2 = TabLayout.Tab.class.getDeclaredField("mParent");
                                        } catch (NoSuchFieldException unused6) {
                                            declaredField2 = TabLayout.Tab.class.getDeclaredField("parent");
                                        }
                                        declaredField2.setAccessible(true);
                                        view = (View) declaredField2.get(obj2);
                                    }
                                    if (view != null && view.getId() != -1) {
                                        String resourceEntryName = activityFromFragment.getResources().getResourceEntryName(view.getId());
                                        if (!TextUtils.isEmpty(resourceEntryName)) {
                                            jSONObject2.put(AopConstants.ELEMENT_ID, resourceEntryName);
                                        }
                                    }
                                    if (view != null && (jSONObject = (JSONObject) view.getTag(C27650R.id.sensors_analytics_tag_view_properties)) != null) {
                                        AopUtil.mergeJSONObject(jSONObject, jSONObject2);
                                    }
                                } catch (Exception e18) {
                                    SALog.printStackTrace(e18);
                                }
                            }
                            SensorsDataAPI.sharedInstance().trackAutoEvent(AopConstants.APP_CLICK_EVENT_NAME, jSONObject2, viewNodeAddViewPathProperties);
                        }
                    }
                }
            }
        } catch (Exception e19) {
            SALog.printStackTrace(e19);
        }
    }

    public static void trackViewOnClick(View view) {
        if (view == null) {
            return;
        }
        trackViewOnClick(view, view.isPressed());
    }

    public static void addWebViewVisualInterface(View view) {
        if (view != null) {
            int i11 = C27650R.id.sensors_analytics_tag_view_webview_visual;
            if (view.getTag(i11) == null) {
                view.setTag(i11, new Object());
                addJavascriptInterface(view, new WebViewVisualInterface(view), "SensorsData_App_Visual_Bridge");
            }
        }
    }

    private static void invokeWebViewLoad(View view, String str, Object[] objArr, Class[] clsArr) {
        if (view == null) {
            SALog.m68589i(TAG, "WebView has not initialized.");
            return;
        }
        try {
            view.getClass().getMethod(str, clsArr).invoke(view, objArr);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static void loadData2(View view, String str, String str2, String str3) {
        if (view == null) {
            SALog.m68589i(TAG, "WebView has not initialized.");
        } else {
            setupH5Bridge(view);
        }
    }

    public static void loadDataWithBaseURL2(View view, String str, String str2, String str3, String str4, String str5) {
        if (view == null) {
            SALog.m68589i(TAG, "WebView has not initialized.");
        } else {
            setupH5Bridge(view);
        }
    }

    public static void postUrl2(View view, String str, byte[] bArr) {
        if (view == null) {
            SALog.m68589i(TAG, "WebView has not initialized.");
        } else {
            setupH5Bridge(view);
        }
    }

    private static void setupWebView(View view) {
        if (view != null) {
            int i11 = C27650R.id.sensors_analytics_tag_view_webview;
            if (view.getTag(i11) == null) {
                view.setTag(i11, new Object());
                addJavascriptInterface(view, new AppWebViewInterface(SensorsDataAPI.sharedInstance().getContext(), null, false, view), "SensorsData_APP_New_H5_Bridge");
            }
        }
    }

    public static void showChannelDebugActiveDialog(final Activity activity) {
        SensorsDataDialogUtils.showDialog(activity, "成功开启调试模式", "此模式下不需要卸载 App，点击“激活”按钮可反复触发激活", "激活", new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAutoTrackHelper.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                SensorsDataAPI.sharedInstance().trackChannelDebugInstallation();
                SensorsDataAutoTrackHelper.showChannelDebugActiveDialog(activity);
            }
        }, "取消", new DialogInterface.OnClickListener() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAutoTrackHelper.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i11) {
                SensorsDataDialogUtils.startLaunchActivity(activity);
            }
        });
    }

    public static void trackDialog(DialogInterface dialogInterface, int i11) {
        Class<AlertDialog> cls;
        Button button;
        ListView listView;
        Class<AlertDialog> cls2 = AlertDialog.class;
        try {
            if (SensorsDataAPI.sharedInstance().isAutoTrackEnabled() && !SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_CLICK)) {
                ViewNode viewNodeAddViewPathProperties = null;
                Dialog dialog = dialogInterface instanceof Dialog ? (Dialog) dialogInterface : null;
                if (dialog != null && !isDeBounceTrack(dialog)) {
                    Activity activityFromContext = AopUtil.getActivityFromContext(dialog.getContext(), null);
                    if (activityFromContext == null) {
                        activityFromContext = dialog.getOwnerActivity();
                    }
                    if ((activityFromContext == null || !SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(activityFromContext.getClass())) && !AopUtil.isViewIgnored(Dialog.class)) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            Window window = dialog.getWindow();
                            if (window != null && window.isActive()) {
                                String str = (String) dialog.getWindow().getDecorView().getTag(C27650R.id.sensors_analytics_tag_view_id);
                                if (!TextUtils.isEmpty(str)) {
                                    jSONObject.put(AopConstants.ELEMENT_ID, str);
                                }
                            }
                        } catch (Exception e11) {
                            SALog.printStackTrace(e11);
                        }
                        if (activityFromContext != null) {
                            SensorsDataUtils.mergeJSONObject(AopUtil.buildTitleAndScreenName(activityFromContext), jSONObject);
                        }
                        VisualUtil.mergeRnScreenNameAndTitle(jSONObject);
                        jSONObject.put(AopConstants.ELEMENT_TYPE, "Dialog");
                        try {
                            int i12 = AlertDialog.f1174b;
                            cls = cls2;
                        } catch (Exception unused) {
                            cls = null;
                        }
                        try {
                            int i13 = AlertDialog.f1174b;
                        } catch (Exception unused2) {
                            cls2 = null;
                        }
                        if (cls == null && cls2 == null) {
                            return;
                        }
                        if (cls == null) {
                            cls = cls2;
                        }
                        if (dialog instanceof android.app.AlertDialog) {
                            android.app.AlertDialog alertDialog = (android.app.AlertDialog) dialog;
                            Button button2 = alertDialog.getButton(i11);
                            if (button2 != null) {
                                if (!TextUtils.isEmpty(button2.getText())) {
                                    jSONObject.put(AopConstants.ELEMENT_CONTENT, button2.getText());
                                }
                                viewNodeAddViewPathProperties = AopUtil.addViewPathProperties(activityFromContext, button2, jSONObject);
                            } else {
                                ListView listView2 = alertDialog.getListView();
                                if (listView2 != null) {
                                    Object item = listView2.getAdapter().getItem(i11);
                                    if (item != null && (item instanceof String)) {
                                        jSONObject.put(AopConstants.ELEMENT_CONTENT, item);
                                    }
                                    View childAt = listView2.getChildAt(i11);
                                    if (childAt != null) {
                                        viewNodeAddViewPathProperties = AopUtil.addViewPathProperties(activityFromContext, childAt, jSONObject);
                                    }
                                }
                            }
                        } else if (cls.isInstance(dialog)) {
                            try {
                                Method method = dialog.getClass().getMethod("getButton", Integer.TYPE);
                                button = method != null ? (Button) method.invoke(dialog, Integer.valueOf(i11)) : null;
                            } catch (Exception unused3) {
                            }
                            if (button != null) {
                                if (!TextUtils.isEmpty(button.getText())) {
                                    jSONObject.put(AopConstants.ELEMENT_CONTENT, button.getText());
                                }
                                viewNodeAddViewPathProperties = AopUtil.addViewPathProperties(activityFromContext, button, jSONObject);
                            } else {
                                try {
                                    Method method2 = dialog.getClass().getMethod("getListView", new Class[0]);
                                    if (method2 != null && (listView = (ListView) method2.invoke(dialog, new Object[0])) != null) {
                                        Object item2 = listView.getAdapter().getItem(i11);
                                        if (item2 != null && (item2 instanceof String)) {
                                            jSONObject.put(AopConstants.ELEMENT_CONTENT, item2);
                                        }
                                        View childAt2 = listView.getChildAt(i11);
                                        if (childAt2 != null) {
                                            viewNodeAddViewPathProperties = AopUtil.addViewPathProperties(activityFromContext, childAt2, jSONObject);
                                        }
                                    }
                                } catch (Exception unused4) {
                                }
                            }
                        }
                        SensorsDataAPI.sharedInstance().trackAutoEvent(AopConstants.APP_CLICK_EVENT_NAME, jSONObject, viewNodeAddViewPathProperties);
                    }
                }
            }
        } catch (Exception e12) {
            SALog.printStackTrace(e12);
        }
    }

    public static void trackDrawerClosed(View view) {
        if (view == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AopConstants.ELEMENT_CONTENT, "Close");
            SensorsDataAPI.sharedInstance().setViewProperties(view, jSONObject);
            trackViewOnClick(view);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static void trackDrawerOpened(View view) {
        if (view == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AopConstants.ELEMENT_CONTENT, "Open");
            SensorsDataAPI.sharedInstance().setViewProperties(view, jSONObject);
            trackViewOnClick(view);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static void trackExpandableListViewOnChildClick(ExpandableListView expandableListView, View view, int i11, int i12) {
        Context context;
        String viewText;
        JSONObject sensorsChildItemTrackProperties;
        if (expandableListView == null || view == null) {
            return;
        }
        try {
            if (SensorsDataAPI.sharedInstance().isAutoTrackEnabled() && !SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_CLICK) && (context = expandableListView.getContext()) != null) {
                Activity activityFromContext = AopUtil.getActivityFromContext(context, expandableListView);
                if (activityFromContext == null || !SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(activityFromContext.getClass())) {
                    Object fragmentFromView = AopUtil.getFragmentFromView(expandableListView, activityFromContext);
                    if ((fragmentFromView == null || !SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(fragmentFromView.getClass())) && !AopUtil.isViewIgnored(ExpandableListView.class) && !AopUtil.isViewIgnored(expandableListView) && !AopUtil.isViewIgnored(view)) {
                        JSONObject jSONObject = (JSONObject) view.getTag(C27650R.id.sensors_analytics_tag_view_properties);
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
                        if (expandableListAdapter != null && (expandableListAdapter instanceof SensorsExpandableListViewItemTrackProperties) && (sensorsChildItemTrackProperties = ((SensorsExpandableListViewItemTrackProperties) expandableListAdapter).getSensorsChildItemTrackProperties(i11, i12)) != null) {
                            AopUtil.mergeJSONObject(sensorsChildItemTrackProperties, jSONObject);
                        }
                        ViewNode viewNodeAddViewPathProperties = AopUtil.addViewPathProperties(activityFromContext, view, jSONObject);
                        if (activityFromContext != null) {
                            SensorsDataUtils.mergeJSONObject(AopUtil.buildTitleAndScreenName(activityFromContext), jSONObject);
                        }
                        String viewId = AopUtil.getViewId(expandableListView);
                        if (!TextUtils.isEmpty(viewId)) {
                            jSONObject.put(AopConstants.ELEMENT_ID, viewId);
                        }
                        jSONObject.put(AopConstants.ELEMENT_TYPE, "ExpandableListView");
                        if (view instanceof ViewGroup) {
                            viewText = null;
                            try {
                                viewText = AopUtil.traverseView(new StringBuilder(), (ViewGroup) view);
                                if (!TextUtils.isEmpty(viewText)) {
                                    viewText = viewText.substring(0, viewText.length() - 1);
                                }
                            } catch (Exception e11) {
                                SALog.printStackTrace(e11);
                            }
                        } else {
                            viewText = AopUtil.getViewText(view);
                        }
                        if (!TextUtils.isEmpty(viewText)) {
                            jSONObject.put(AopConstants.ELEMENT_CONTENT, viewText);
                        }
                        if (fragmentFromView != null) {
                            AopUtil.getScreenNameAndTitleFromFragment(jSONObject, fragmentFromView, activityFromContext);
                        }
                        JSONObject jSONObject2 = (JSONObject) view.getTag(C27650R.id.sensors_analytics_tag_view_properties);
                        if (jSONObject2 != null) {
                            AopUtil.mergeJSONObject(jSONObject2, jSONObject);
                        }
                        SensorsDataAPI.sharedInstance().trackAutoEvent(AopConstants.APP_CLICK_EVENT_NAME, jSONObject, viewNodeAddViewPathProperties);
                    }
                }
            }
        } catch (Exception e12) {
            SALog.printStackTrace(e12);
        }
    }

    public static void trackExpandableListViewOnGroupClick(ExpandableListView expandableListView, View view, int i11) {
        Context context;
        if (expandableListView == null || view == null) {
            return;
        }
        try {
            if (SensorsDataAPI.sharedInstance().isAutoTrackEnabled() && !SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_CLICK) && (context = expandableListView.getContext()) != null) {
                String strTraverseView = null;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity == null || !SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(activity.getClass())) {
                    Object fragmentFromView = AopUtil.getFragmentFromView(expandableListView, activity);
                    if ((fragmentFromView == null || !SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(fragmentFromView.getClass())) && !AopUtil.isViewIgnored(ExpandableListView.class) && !AopUtil.isViewIgnored(expandableListView)) {
                        JSONObject jSONObject = new JSONObject();
                        ViewNode viewNodeAddViewPathProperties = AopUtil.addViewPathProperties(activity, view, jSONObject);
                        if (activity != null) {
                            SensorsDataUtils.mergeJSONObject(AopUtil.buildTitleAndScreenName(activity), jSONObject);
                        }
                        String viewId = AopUtil.getViewId(expandableListView);
                        if (!TextUtils.isEmpty(viewId)) {
                            jSONObject.put(AopConstants.ELEMENT_ID, viewId);
                        }
                        jSONObject.put(AopConstants.ELEMENT_TYPE, "ExpandableListView");
                        if (view instanceof ViewGroup) {
                            try {
                                strTraverseView = AopUtil.traverseView(new StringBuilder(), (ViewGroup) view);
                                if (!TextUtils.isEmpty(strTraverseView)) {
                                    strTraverseView = strTraverseView.substring(0, strTraverseView.length() - 1);
                                }
                            } catch (Exception e11) {
                                SALog.printStackTrace(e11);
                            }
                        } else {
                            strTraverseView = AopUtil.getViewText(view);
                        }
                        if (!TextUtils.isEmpty(strTraverseView)) {
                            jSONObject.put(AopConstants.ELEMENT_CONTENT, strTraverseView);
                        }
                        if (fragmentFromView != null) {
                            AopUtil.getScreenNameAndTitleFromFragment(jSONObject, fragmentFromView, activity);
                        }
                        JSONObject jSONObject2 = (JSONObject) view.getTag(C27650R.id.sensors_analytics_tag_view_properties);
                        if (jSONObject2 != null) {
                            AopUtil.mergeJSONObject(jSONObject2, jSONObject);
                        }
                        ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
                        if (expandableListAdapter != null && (expandableListAdapter instanceof SensorsExpandableListViewItemTrackProperties)) {
                            try {
                                JSONObject sensorsGroupItemTrackProperties = ((SensorsExpandableListViewItemTrackProperties) expandableListAdapter).getSensorsGroupItemTrackProperties(i11);
                                if (sensorsGroupItemTrackProperties != null) {
                                    AopUtil.mergeJSONObject(sensorsGroupItemTrackProperties, jSONObject);
                                }
                            } catch (JSONException e12) {
                                SALog.printStackTrace(e12);
                            }
                        }
                        SensorsDataAPI.sharedInstance().trackAutoEvent(AopConstants.APP_CLICK_EVENT_NAME, jSONObject, viewNodeAddViewPathProperties);
                    }
                }
            }
        } catch (Exception e13) {
            SALog.printStackTrace(e13);
        }
    }

    public static void trackListView(AdapterView<?> adapterView, View view, int i11) {
        Context context;
        String viewText;
        if (view == null) {
            return;
        }
        try {
            if (SensorsDataAPI.sharedInstance().isAutoTrackEnabled() && !SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_CLICK) && (context = view.getContext()) != null) {
                Activity activityFromContext = AopUtil.getActivityFromContext(context, view);
                if (activityFromContext == null || !SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(activityFromContext.getClass())) {
                    Object fragmentFromView = AopUtil.getFragmentFromView(adapterView, activityFromContext);
                    if ((fragmentFromView == null || !SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(fragmentFromView.getClass())) && !AopUtil.isViewIgnored(adapterView)) {
                        JSONObject jSONObject = new JSONObject();
                        if (adapterView instanceof ListView) {
                            jSONObject.put(AopConstants.ELEMENT_TYPE, "ListView");
                            if (AopUtil.isViewIgnored(ListView.class)) {
                                return;
                            }
                        } else if (adapterView instanceof GridView) {
                            jSONObject.put(AopConstants.ELEMENT_TYPE, "GridView");
                            if (AopUtil.isViewIgnored(GridView.class)) {
                                return;
                            }
                        } else if (adapterView instanceof Spinner) {
                            jSONObject.put(AopConstants.ELEMENT_TYPE, "Spinner");
                            if (AopUtil.isViewIgnored(Spinner.class)) {
                                return;
                            }
                        }
                        String viewId = AopUtil.getViewId(adapterView);
                        if (!TextUtils.isEmpty(viewId)) {
                            jSONObject.put(AopConstants.ELEMENT_ID, viewId);
                        }
                        Object adapter = adapterView.getAdapter();
                        if (adapter instanceof HeaderViewListAdapter) {
                            adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                        }
                        if (adapter instanceof SensorsAdapterViewItemTrackProperties) {
                            try {
                                JSONObject sensorsItemTrackProperties = ((SensorsAdapterViewItemTrackProperties) adapter).getSensorsItemTrackProperties(i11);
                                if (sensorsItemTrackProperties != null) {
                                    AopUtil.mergeJSONObject(sensorsItemTrackProperties, jSONObject);
                                }
                            } catch (JSONException e11) {
                                SALog.printStackTrace(e11);
                            }
                        }
                        ViewNode viewNodeAddViewPathProperties = AopUtil.addViewPathProperties(activityFromContext, view, jSONObject);
                        if (activityFromContext != null) {
                            SensorsDataUtils.mergeJSONObject(AopUtil.buildTitleAndScreenName(activityFromContext), jSONObject);
                        }
                        if (view instanceof ViewGroup) {
                            viewText = null;
                            try {
                                viewText = AopUtil.traverseView(new StringBuilder(), (ViewGroup) view);
                                if (!TextUtils.isEmpty(viewText)) {
                                    viewText = viewText.substring(0, viewText.length() - 1);
                                }
                            } catch (Exception e12) {
                                SALog.printStackTrace(e12);
                            }
                        } else {
                            viewText = AopUtil.getViewText(view);
                        }
                        if (!TextUtils.isEmpty(viewText)) {
                            jSONObject.put(AopConstants.ELEMENT_CONTENT, viewText);
                        }
                        if (fragmentFromView != null) {
                            AopUtil.getScreenNameAndTitleFromFragment(jSONObject, fragmentFromView, activityFromContext);
                        }
                        JSONObject jSONObject2 = (JSONObject) view.getTag(C27650R.id.sensors_analytics_tag_view_properties);
                        if (jSONObject2 != null) {
                            AopUtil.mergeJSONObject(jSONObject2, jSONObject);
                        }
                        SensorsDataAPI.sharedInstance().trackAutoEvent(AopConstants.APP_CLICK_EVENT_NAME, jSONObject, viewNodeAddViewPathProperties);
                    }
                }
            }
        } catch (Exception e13) {
            SALog.printStackTrace(e13);
        }
    }

    public static void trackMenuItem(final Object obj, final MenuItem menuItem) {
        try {
            ThreadUtils.getSinglePool().execute(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAutoTrackHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    String resourceEntryName;
                    try {
                        if (menuItem != null && SensorsDataAPI.sharedInstance().isAutoTrackEnabled() && !SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_CLICK) && !AopUtil.isViewIgnored(MenuItem.class) && !SensorsDataAutoTrackHelper.isDeBounceTrack(menuItem)) {
                            Object obj2 = obj;
                            ViewNode viewNodeAddViewPathProperties = null;
                            Context context = (obj2 == null || !(obj2 instanceof Context)) ? null : (Context) obj2;
                            View clickView = WindowHelper.getClickView(menuItem);
                            if (context == null && clickView != null) {
                                context = clickView.getContext();
                            }
                            Activity activityFromContext = context != null ? AopUtil.getActivityFromContext(context, null) : null;
                            if (activityFromContext == null || !SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(activityFromContext.getClass())) {
                                if (context != null) {
                                    try {
                                        resourceEntryName = context.getResources().getResourceEntryName(menuItem.getItemId());
                                    } catch (Exception e11) {
                                        SALog.printStackTrace(e11);
                                        resourceEntryName = null;
                                    }
                                } else {
                                    resourceEntryName = null;
                                }
                                JSONObject jSONObject = new JSONObject();
                                if (activityFromContext != null) {
                                    SensorsDataUtils.mergeJSONObject(AopUtil.buildTitleAndScreenName(activityFromContext), jSONObject);
                                }
                                if (!TextUtils.isEmpty(resourceEntryName)) {
                                    jSONObject.put(AopConstants.ELEMENT_ID, resourceEntryName);
                                }
                                String string = !TextUtils.isEmpty(menuItem.getTitle()) ? menuItem.getTitle().toString() : null;
                                if (clickView != null) {
                                    if (TextUtils.isEmpty(string)) {
                                        string = ViewUtil.getViewContentAndType(clickView).getViewContent();
                                    }
                                    viewNodeAddViewPathProperties = AopUtil.addViewPathProperties(activityFromContext, clickView, jSONObject);
                                }
                                jSONObject.put(AopConstants.ELEMENT_CONTENT, string);
                                jSONObject.put(AopConstants.ELEMENT_TYPE, "MenuItem");
                                SensorsDataAPI.sharedInstance().trackAutoEvent(AopConstants.APP_CLICK_EVENT_NAME, jSONObject, viewNodeAddViewPathProperties);
                            }
                        }
                    } catch (Exception e12) {
                        SALog.printStackTrace(e12);
                    }
                }
            });
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static void trackRadioGroup(RadioGroup radioGroup, int i11) {
        Context context;
        if (radioGroup == null) {
            return;
        }
        try {
            View viewFindViewById = radioGroup.findViewById(i11);
            if (viewFindViewById != null && viewFindViewById.isPressed() && SensorsDataAPI.sharedInstance().isAutoTrackEnabled() && !SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_CLICK) && (context = radioGroup.getContext()) != null) {
                Activity activityFromContext = AopUtil.getActivityFromContext(context, radioGroup);
                if (activityFromContext == null || !SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(activityFromContext.getClass())) {
                    Object fragmentFromView = AopUtil.getFragmentFromView(radioGroup, activityFromContext);
                    if ((fragmentFromView == null || !SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(fragmentFromView.getClass())) && !AopUtil.isViewIgnored(radioGroup)) {
                        JSONObject jSONObject = new JSONObject();
                        String viewId = AopUtil.getViewId(radioGroup);
                        if (!TextUtils.isEmpty(viewId)) {
                            jSONObject.put(AopConstants.ELEMENT_ID, viewId);
                        }
                        if (activityFromContext != null) {
                            SensorsDataUtils.mergeJSONObject(AopUtil.buildTitleAndScreenName(activityFromContext), jSONObject);
                        }
                        jSONObject.put(AopConstants.ELEMENT_TYPE, AopUtil.getViewType(viewFindViewById.getClass().getCanonicalName(), "RadioButton"));
                        int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                        ViewNode viewNodeAddViewPathProperties = null;
                        if (activityFromContext != null) {
                            try {
                                RadioButton radioButton = (RadioButton) activityFromContext.findViewById(checkedRadioButtonId);
                                if (radioButton != null) {
                                    if (!TextUtils.isEmpty(radioButton.getText())) {
                                        String string = radioButton.getText().toString();
                                        if (!TextUtils.isEmpty(string)) {
                                            jSONObject.put(AopConstants.ELEMENT_CONTENT, string);
                                        }
                                    }
                                    viewNodeAddViewPathProperties = AopUtil.addViewPathProperties(activityFromContext, radioButton, jSONObject);
                                }
                            } catch (Exception e11) {
                                SALog.printStackTrace(e11);
                            }
                        }
                        if (fragmentFromView != null) {
                            AopUtil.getScreenNameAndTitleFromFragment(jSONObject, fragmentFromView, activityFromContext);
                        }
                        JSONObject jSONObject2 = (JSONObject) radioGroup.getTag(C27650R.id.sensors_analytics_tag_view_properties);
                        if (jSONObject2 != null) {
                            AopUtil.mergeJSONObject(jSONObject2, jSONObject);
                        }
                        SensorsDataAPI.sharedInstance().trackAutoEvent(AopConstants.APP_CLICK_EVENT_NAME, jSONObject, viewNodeAddViewPathProperties);
                    }
                }
            }
        } catch (Exception e12) {
            SALog.printStackTrace(e12);
        }
    }

    public static void trackViewOnClick(View view, boolean z11) {
        if (view == null) {
            return;
        }
        try {
            if (SensorsDataAPI.sharedInstance().isAutoTrackEnabled() && !SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_CLICK)) {
                Activity activityFromContext = AopUtil.getActivityFromContext(view.getContext(), view);
                if (activityFromContext == null || !SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(activityFromContext.getClass())) {
                    Object fragmentFromView = AopUtil.getFragmentFromView(view, activityFromContext);
                    if ((fragmentFromView == null || !SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(fragmentFromView.getClass())) && !AopUtil.isViewIgnored(view) && !SensorsDataUtils.isDoubleClick(view)) {
                        JSONObject jSONObject = new JSONObject();
                        if (AopUtil.injectClickInfo(view, jSONObject, z11)) {
                            SensorsDataAPI.sharedInstance().trackAutoEvent(AopConstants.APP_CLICK_EVENT_NAME, jSONObject, AopUtil.addViewPathProperties(activityFromContext, view, jSONObject));
                        }
                    }
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private static void addJavascriptInterface(View view, Object obj, String str) {
        try {
            Class<?> cls = view.getClass();
            try {
                Object objInvoke = cls.getMethod("getSettings", new Class[0]).invoke(view, new Object[0]);
                if (objInvoke != null) {
                    objInvoke.getClass().getMethod("setJavaScriptEnabled", Boolean.TYPE).invoke(objInvoke, Boolean.TRUE);
                }
            } catch (Exception unused) {
            }
            cls.getMethod("addJavascriptInterface", Object.class, String.class).invoke(view, obj, str);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isDeBounceTrack(Object obj) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l11 = eventTimestamp.get(Integer.valueOf(obj.hashCode()));
        if (l11 != null && jElapsedRealtime - l11.longValue() < 500) {
            return true;
        }
        eventTimestamp.put(Integer.valueOf(obj.hashCode()), Long.valueOf(jElapsedRealtime));
        return false;
    }

    public static void loadData(View view, String str, String str2, String str3) {
        loadData2(view, str, str2, str3);
        invokeWebViewLoad(view, "loadData", new Object[]{str, str2, str3}, new Class[]{String.class, String.class, String.class});
    }

    public static void loadDataWithBaseURL(View view, String str, String str2, String str3, String str4, String str5) {
        loadDataWithBaseURL2(view, str, str2, str3, str4, str5);
        invokeWebViewLoad(view, "loadDataWithBaseURL", new Object[]{str, str2, str3, str4, str5}, new Class[]{String.class, String.class, String.class, String.class, String.class});
    }

    public static void loadUrl(View view, String str, Map<String, String> map) {
        loadUrl2(view, str, map);
        invokeWebViewLoad(view, "loadUrl", new Object[]{str, map}, new Class[]{String.class, Map.class});
    }

    public static void loadUrl2(View view, String str, Map<String, String> map) {
        if (view == null) {
            SALog.m68589i(TAG, "WebView has not initialized.");
        } else {
            setupH5Bridge(view);
        }
    }

    public static void postUrl(View view, String str, byte[] bArr) {
        postUrl2(view, str, bArr);
        invokeWebViewLoad(view, "postUrl", new Object[]{str, bArr}, new Class[]{String.class, byte[].class});
    }

    private static void setupH5Bridge(View view) {
        if (!(SensorsDataAPI.sharedInstance() instanceof SensorsDataAPIEmptyImplementation)) {
            if (isSupportJellyBean()) {
                SensorsDataAPI.sharedInstance();
                if (AbstractSensorsDataAPI.getConfigOptions() != null) {
                    SensorsDataAPI.sharedInstance();
                    if (AbstractSensorsDataAPI.getConfigOptions().isAutoTrackWebView) {
                        setupWebView(view);
                    }
                }
            }
            if (isSupportJellyBean()) {
                addWebViewVisualInterface(view);
            }
        }
    }

    public static void track(String str, String str2) {
        JSONObject jSONObject;
        try {
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        jSONObject = new JSONObject(str2);
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                        jSONObject = null;
                    }
                } else {
                    jSONObject = null;
                }
                SensorsDataAPI.sharedInstance().trackInternal(str, jSONObject);
            }
        } catch (Exception e12) {
            SALog.printStackTrace(e12);
        }
    }

    public static void trackRN(Object obj, int i11, int i12, boolean z11) {
        Object objInvoke;
        try {
            if (SensorsDataAPI.sharedInstance().isReactNativeAutoTrackEnabled() && SensorsDataAPI.sharedInstance().isAutoTrackEnabled() && !SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_CLICK)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AopConstants.ELEMENT_TYPE, "RNView");
                ViewNode viewNodeAddViewPathProperties = null;
                if (obj != null) {
                    int i13 = NativeViewHierarchyManager.f9919a;
                    Method method = NativeViewHierarchyManager.class.getMethod("resolveView", Integer.TYPE);
                    if (method != null && (objInvoke = method.invoke(obj, Integer.valueOf(i11))) != null) {
                        View view = (View) objInvoke;
                        Activity activityFromContext = AopUtil.getActivityFromContext(view.getContext(), view);
                        if (activityFromContext != null) {
                            SensorsDataUtils.mergeJSONObject(AopUtil.buildTitleAndScreenName(activityFromContext), jSONObject);
                            viewNodeAddViewPathProperties = AopUtil.addViewPathProperties(activityFromContext, view, jSONObject);
                        }
                        if (!(view instanceof CompoundButton)) {
                            if (view instanceof TextView) {
                                TextView textView = (TextView) view;
                                if (!(view instanceof EditText) && !TextUtils.isEmpty(textView.getText())) {
                                    jSONObject.put(AopConstants.ELEMENT_CONTENT, textView.getText().toString());
                                }
                            } else if (view instanceof ViewGroup) {
                                String strTraverseView = AopUtil.traverseView(new StringBuilder(), (ViewGroup) view);
                                if (!TextUtils.isEmpty(strTraverseView)) {
                                    strTraverseView = strTraverseView.substring(0, strTraverseView.length() - 1);
                                }
                                jSONObject.put(AopConstants.ELEMENT_CONTENT, strTraverseView);
                            }
                        } else {
                            return;
                        }
                    }
                }
                SensorsDataAPI.sharedInstance().trackAutoEvent(AopConstants.APP_CLICK_EVENT_NAME, jSONObject, viewNodeAddViewPathProperties);
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static void trackTabHost(final String str) {
        try {
            ThreadUtils.getSinglePool().execute(new Runnable() { // from class: com.sensorsdata.analytics.android.sdk.SensorsDataAutoTrackHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    ViewNode viewNode;
                    Activity activity;
                    try {
                        if (SensorsDataAPI.sharedInstance().isAutoTrackEnabled() && !SensorsDataAPI.sharedInstance().isAutoTrackEventTypeIgnored(SensorsDataAPI.AutoTrackEventType.APP_CLICK) && !AopUtil.isViewIgnored(TabHost.class)) {
                            JSONObject jSONObject = new JSONObject();
                            View clickView = WindowHelper.getClickView(str);
                            String viewContent = null;
                            ViewNode viewNodeAddViewPathProperties = null;
                            if (clickView != null) {
                                Context context = clickView.getContext();
                                if (context != null) {
                                    if (context instanceof Activity) {
                                        activity = (Activity) context;
                                    } else {
                                        activity = null;
                                    }
                                    if (activity != null) {
                                        if (!SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(activity.getClass())) {
                                            SensorsDataUtils.mergeJSONObject(AopUtil.buildTitleAndScreenName(activity), jSONObject);
                                            Object fragmentFromView = AopUtil.getFragmentFromView(clickView, activity);
                                            if (fragmentFromView != null) {
                                                if (!SensorsDataAPI.sharedInstance().isActivityAutoTrackAppClickIgnored(fragmentFromView.getClass())) {
                                                    AopUtil.getScreenNameAndTitleFromFragment(jSONObject, fragmentFromView, activity);
                                                } else {
                                                    return;
                                                }
                                            }
                                            viewNodeAddViewPathProperties = AopUtil.addViewPathProperties(activity, clickView, jSONObject);
                                        } else {
                                            return;
                                        }
                                    }
                                    ViewNode viewNode2 = viewNodeAddViewPathProperties;
                                    viewContent = ViewUtil.getViewContentAndType(clickView).getViewContent();
                                    viewNode = viewNode2;
                                } else {
                                    return;
                                }
                            } else {
                                viewNode = null;
                            }
                            if (TextUtils.isEmpty(viewContent)) {
                                viewContent = str;
                            }
                            jSONObject.put(AopConstants.ELEMENT_CONTENT, viewContent);
                            jSONObject.put(AopConstants.ELEMENT_TYPE, "TabHost");
                            SensorsDataAPI.sharedInstance().trackAutoEvent(AopConstants.APP_CLICK_EVENT_NAME, jSONObject, viewNode);
                        }
                    } catch (Exception e11) {
                        SALog.printStackTrace(e11);
                    }
                }
            });
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }
}
