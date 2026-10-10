package com.sensorsdata.analytics.android.sdk.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.widget.SwitchCompat;
import com.sensorsdata.analytics.android.sdk.AopConstants;
import com.sensorsdata.analytics.android.sdk.C27650R;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.ScreenAutoTracker;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SensorsDataFragmentTitle;
import com.sensorsdata.analytics.android.sdk.visual.ViewTreeStatusObservable;
import com.sensorsdata.analytics.android.sdk.visual.model.ViewNode;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33978va;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class AopUtil {
    private static LruCache<String, Object> sLruCache;
    private static ArrayList<String> sOSViewPackage = new ArrayList<String>() { // from class: com.sensorsdata.analytics.android.sdk.util.AopUtil.1
        {
            add("android##widget");
            add("android##support##v7##widget");
            add("android##support##design##widget");
            add("android##support##text##emoji##widget");
            add("androidx##appcompat##widget");
            add("androidx##emoji##widget");
            add("androidx##cardview##widget");
            add("com##google##android##material");
        }
    };

    public static ViewNode addViewPathProperties(Activity activity, View view, JSONObject jSONObject) {
        if (view == null || activity == null) {
            return null;
        }
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e11) {
                SALog.printStackTrace(e11);
            }
        }
        if ((SensorsDataAPI.sharedInstance().isHeatMapEnabled() || SensorsDataAPI.sharedInstance().isVisualizedAutoTrackEnabled()) && (SensorsDataAPI.sharedInstance().isHeatMapActivity(activity.getClass()) || SensorsDataAPI.sharedInstance().isVisualizedAutoTrackActivity(activity.getClass()))) {
            String elementSelector = ViewUtil.getElementSelector(view);
            if (!TextUtils.isEmpty(elementSelector)) {
                jSONObject.put(AopConstants.ELEMENT_SELECTOR, elementSelector);
            }
        }
        ViewNode viewNode = ViewTreeStatusObservable.getInstance().getViewNode(view);
        if (viewNode != null) {
            if (!TextUtils.isEmpty(viewNode.getViewPath()) && ((SensorsDataAPI.sharedInstance().isVisualizedAutoTrackEnabled() && SensorsDataAPI.sharedInstance().isVisualizedAutoTrackActivity(activity.getClass())) || (SensorsDataAPI.sharedInstance().isHeatMapEnabled() && SensorsDataAPI.sharedInstance().isHeatMapActivity(activity.getClass())))) {
                jSONObject.put(AopConstants.ELEMENT_PATH, viewNode.getViewPath());
            }
            if (!TextUtils.isEmpty(viewNode.getViewPosition())) {
                jSONObject.put(AopConstants.ELEMENT_POSITION, viewNode.getViewPosition());
            }
            return viewNode;
        }
        return null;
    }

    public static Activity getActivityFromContext(Context context, View view) {
        Activity activity;
        Object tag;
        Activity activity2 = null;
        if (context != null) {
            try {
                if (!(context instanceof Activity)) {
                    if (context instanceof ContextWrapper) {
                        while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                        }
                    }
                    return (activity2 == null || view == null || (tag = view.getTag(C27650R.id.sensors_analytics_tag_view_activity)) == null || !(tag instanceof Activity)) ? activity2 : (Activity) tag;
                }
                activity = (Activity) context;
                activity2 = activity;
                if (activity2 == null) {
                }
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
            }
        }
        return activity2;
    }

    private static String getActivityTitle(Activity activity) {
        PackageManager packageManager;
        if (activity != null) {
            try {
                String string = !TextUtils.isEmpty(activity.getTitle()) ? activity.getTitle().toString() : null;
                String toolbarTitle = SensorsDataUtils.getToolbarTitle(activity);
                if (!TextUtils.isEmpty(toolbarTitle)) {
                    string = toolbarTitle;
                }
                if (TextUtils.isEmpty(string) && (packageManager = activity.getPackageManager()) != null) {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(activity.getComponentName(), 0);
                    if (!TextUtils.isEmpty(activityInfo.loadLabel(packageManager))) {
                        return activityInfo.loadLabel(packageManager).toString();
                    }
                }
                return string;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String getCompoundButtonText(View view) {
        try {
            return (String) (((CompoundButton) view).isChecked() ? view.getClass().getMethod("getTextOn", new Class[0]) : view.getClass().getMethod("getTextOff", new Class[0])).invoke(view, new Object[0]);
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static Object getFragmentFromView(View view) {
        return getFragmentFromView(view, null);
    }

    public static String getViewId(View view) {
        try {
            String str = (String) view.getTag(C27650R.id.sensors_analytics_tag_view_id);
            try {
                return (!TextUtils.isEmpty(str) || view.getId() == -1) ? str : view.getContext().getResources().getResourceEntryName(view.getId());
            } catch (Exception unused) {
                return str;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static boolean injectClickInfo(View view, JSONObject jSONObject, boolean z11) {
        if (view != null && jSONObject != null) {
            try {
                if (!ViewUtil.isTrackEvent(view, z11)) {
                    return false;
                }
                Context context = view.getContext();
                JSONObject jSONObject2 = new JSONObject();
                Activity activityFromContext = getActivityFromContext(context, view);
                String viewId = getViewId(view);
                if (!TextUtils.isEmpty(viewId)) {
                    jSONObject2.put(AopConstants.ELEMENT_ID, viewId);
                }
                ViewNode viewContentAndType = ViewUtil.getViewContentAndType(view);
                String viewContent = viewContentAndType.getViewContent();
                if (!TextUtils.isEmpty(viewContent)) {
                    jSONObject2.put(AopConstants.ELEMENT_CONTENT, viewContent);
                }
                jSONObject2.put(AopConstants.ELEMENT_TYPE, viewContentAndType.getViewType());
                if (activityFromContext != null) {
                    SensorsDataUtils.mergeJSONObject(buildTitleAndScreenName(activityFromContext), jSONObject2);
                }
                Object fragmentFromView = getFragmentFromView(view, activityFromContext);
                if (fragmentFromView != null) {
                    getScreenNameAndTitleFromFragment(jSONObject2, fragmentFromView, activityFromContext);
                }
                JSONObject jSONObject3 = (JSONObject) view.getTag(C27650R.id.sensors_analytics_tag_view_properties);
                if (jSONObject3 != null) {
                    mergeJSONObject(jSONObject3, jSONObject2);
                }
                JSONUtils.mergeDistinctProperty(jSONObject2, jSONObject);
                return true;
            } catch (JSONException e11) {
                SALog.printStackTrace(e11);
            }
        }
        return false;
    }

    public static boolean isViewIgnored(Class cls) {
        if (cls == null) {
            return true;
        }
        try {
            List<Class> ignoredViewTypeList = SensorsDataAPI.sharedInstance().getIgnoredViewTypeList();
            if (ignoredViewTypeList.isEmpty()) {
                return false;
            }
            Iterator<Class> it = ignoredViewTypeList.iterator();
            while (it.hasNext()) {
                if (it.next().isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject buildTitleAndScreenName(Activity activity) {
        JSONObject trackProperties;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AopConstants.SCREEN_NAME, activity.getClass().getCanonicalName());
            String activityTitle = getActivityTitle(activity);
            if (!TextUtils.isEmpty(activityTitle)) {
                jSONObject.put(AopConstants.TITLE, activityTitle);
            }
            if ((activity instanceof ScreenAutoTracker) && (trackProperties = ((ScreenAutoTracker) activity).getTrackProperties()) != null) {
                SensorsDataUtils.mergeJSONObject(trackProperties, jSONObject);
            }
            return jSONObject;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return new JSONObject();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static JSONObject buildTitleNoAutoTrackerProperties(Activity activity) {
        JSONObject trackProperties;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AopConstants.SCREEN_NAME, activity.getClass().getCanonicalName());
            String activityTitle = getActivityTitle(activity);
            if (!TextUtils.isEmpty(activityTitle)) {
                jSONObject.put(AopConstants.TITLE, activityTitle);
            }
            if ((activity instanceof ScreenAutoTracker) && (trackProperties = ((ScreenAutoTracker) activity).getTrackProperties()) != null) {
                if (trackProperties.has(AopConstants.SCREEN_NAME)) {
                    jSONObject.put(AopConstants.SCREEN_NAME, trackProperties.optString(AopConstants.SCREEN_NAME));
                }
                if (trackProperties.has(AopConstants.TITLE)) {
                    jSONObject.put(AopConstants.TITLE, trackProperties.optString(AopConstants.TITLE));
                }
            }
            return jSONObject;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return new JSONObject();
        }
    }

    @SuppressLint({"NewApi"})
    public static Object getFragmentFromView(View view, Activity activity) {
        Window window;
        if (view == null) {
            return null;
        }
        try {
            int i11 = C27650R.id.sensors_analytics_tag_view_fragment_name;
            String strTraverseParentViewTag = (String) view.getTag(i11);
            String str = (String) view.getTag(C27650R.id.sensors_analytics_tag_view_fragment_name2);
            if (!TextUtils.isEmpty(str)) {
                strTraverseParentViewTag = str;
            }
            if (TextUtils.isEmpty(strTraverseParentViewTag)) {
                if (activity == null) {
                    activity = getActivityFromContext(view.getContext(), view);
                }
                if (activity != null && (window = activity.getWindow()) != null && window.isActive() && window.getDecorView().getRootView().getTag(i11) != null) {
                    strTraverseParentViewTag = traverseParentViewTag(view);
                }
            }
            if (TextUtils.isEmpty(strTraverseParentViewTag)) {
                return null;
            }
            if (sLruCache == null) {
                sLruCache = new LruCache<>(10);
            }
            Object obj = sLruCache.get(strTraverseParentViewTag);
            if (obj != null) {
                return obj;
            }
            Object objNewInstance = Class.forName(strTraverseParentViewTag).newInstance();
            sLruCache.put(strTraverseParentViewTag, objNewInstance);
            return objNewInstance;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return null;
        }
    }

    public static void getScreenNameAndTitleFromFragment(JSONObject jSONObject, Object obj, Activity activity) {
        String canonicalName;
        SensorsDataFragmentTitle sensorsDataFragmentTitle;
        JSONObject trackProperties;
        try {
            String activityTitle = null;
            if (!(obj instanceof ScreenAutoTracker) || (trackProperties = ((ScreenAutoTracker) obj).getTrackProperties()) == null) {
                canonicalName = null;
            } else {
                canonicalName = trackProperties.has(AopConstants.SCREEN_NAME) ? trackProperties.optString(AopConstants.SCREEN_NAME) : null;
                activityTitle = trackProperties.has(AopConstants.TITLE) ? trackProperties.optString(AopConstants.TITLE) : null;
                SensorsDataUtils.mergeJSONObject(trackProperties, jSONObject);
            }
            if (TextUtils.isEmpty(activityTitle) && obj.getClass().isAnnotationPresent(SensorsDataFragmentTitle.class) && (sensorsDataFragmentTitle = (SensorsDataFragmentTitle) obj.getClass().getAnnotation(SensorsDataFragmentTitle.class)) != null) {
                activityTitle = sensorsDataFragmentTitle.title();
            }
            boolean zIsEmpty = TextUtils.isEmpty(activityTitle);
            boolean zIsEmpty2 = TextUtils.isEmpty(canonicalName);
            if (zIsEmpty || zIsEmpty2) {
                if (activity == null) {
                    activity = getActivityFromFragment(obj);
                }
                if (activity != null) {
                    if (zIsEmpty) {
                        activityTitle = SensorsDataUtils.getActivityTitle(activity);
                    }
                    if (zIsEmpty2) {
                        canonicalName = String.format(Locale.CHINA, "%s|%s", activity.getClass().getCanonicalName(), obj.getClass().getCanonicalName());
                    }
                }
            }
            if (!TextUtils.isEmpty(activityTitle)) {
                jSONObject.put(AopConstants.TITLE, activityTitle);
            }
            if (TextUtils.isEmpty(canonicalName)) {
                canonicalName = obj.getClass().getCanonicalName();
            }
            jSONObject.put(AopConstants.SCREEN_NAME, canonicalName);
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    public static String getViewText(View view) {
        Class<SwitchCompat> cls;
        CharSequence contentDescription;
        Class<SwitchCompat> cls2 = SwitchCompat.class;
        if (view instanceof EditText) {
            return "";
        }
        try {
            int i11 = SwitchCompat.f1190b;
            cls = cls2;
        } catch (Exception unused) {
            cls = null;
        }
        if (cls == null) {
            try {
                int i12 = SwitchCompat.f1190b;
            } catch (Exception unused2) {
                cls2 = cls;
            }
        } else {
            cls2 = cls;
        }
        try {
            if (view instanceof CheckBox) {
                contentDescription = ((CheckBox) view).getText();
            } else if (cls2 != null && cls2.isInstance(view)) {
                contentDescription = (String) (((CompoundButton) view).isChecked() ? view.getClass().getMethod("getTextOn", new Class[0]) : view.getClass().getMethod("getTextOff", new Class[0])).invoke(view, new Object[0]);
            } else if (view instanceof RadioButton) {
                contentDescription = ((RadioButton) view).getText();
            } else if (view instanceof ToggleButton) {
                ToggleButton toggleButton = (ToggleButton) view;
                contentDescription = toggleButton.isChecked() ? toggleButton.getTextOn() : toggleButton.getTextOff();
            } else if (view instanceof Button) {
                contentDescription = ((Button) view).getText();
            } else if (view instanceof CheckedTextView) {
                contentDescription = ((CheckedTextView) view).getText();
            } else if (view instanceof TextView) {
                contentDescription = ((TextView) view).getText();
            } else if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                contentDescription = TextUtils.isEmpty(imageView.getContentDescription()) ? null : imageView.getContentDescription().toString();
            } else {
                contentDescription = view.getContentDescription();
            }
            if (TextUtils.isEmpty(contentDescription) && (view instanceof TextView)) {
                contentDescription = ((TextView) view).getHint();
            }
            if (!TextUtils.isEmpty(contentDescription)) {
                return contentDescription.toString();
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
        return "";
    }

    public static String traverseView(StringBuilder sb2, ViewGroup viewGroup) {
        if (sb2 == null) {
            try {
                sb2 = new StringBuilder();
            } catch (Exception e11) {
                SALog.printStackTrace(e11);
                return sb2 != null ? sb2.toString() : "";
            }
        }
        if (viewGroup == null) {
            return sb2.toString();
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != null && childAt.getVisibility() == 0) {
                if (childAt instanceof ViewGroup) {
                    traverseView(sb2, (ViewGroup) childAt);
                } else if (!isViewIgnored(childAt)) {
                    String viewText = getViewText(childAt);
                    if (!TextUtils.isEmpty(viewText)) {
                        sb2.append(viewText);
                        sb2.append(C33820nf.f71144W);
                    }
                }
            }
        }
        return sb2.toString();
    }

    public static Activity getActivityFromFragment(Object obj) {
        try {
            Method method = obj.getClass().getMethod("getActivity", new Class[0]);
            if (method != null) {
                return (Activity) method.invoke(obj, new Object[0]);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static Class<?> getClassByName(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static String getViewGroupTypeByReflect(View view) {
        String canonicalName = view.getClass().getCanonicalName();
        Class<?> classByName = getClassByName("androidx.cardview.widget.CardView");
        if (classByName != null && classByName.isInstance(view)) {
            return getViewType(canonicalName, "CardView");
        }
        Class<?> classByName2 = getClassByName("androidx.cardview.widget.CardView");
        if (classByName2 != null && classByName2.isInstance(view)) {
            return getViewType(canonicalName, "CardView");
        }
        Class<?> classByName3 = getClassByName("com.google.android.material.navigation.NavigationView");
        if (classByName3 != null && classByName3.isInstance(view)) {
            return getViewType(canonicalName, "NavigationView");
        }
        Class<?> classByName4 = getClassByName("com.google.android.material.navigation.NavigationView");
        if (classByName4 != null && classByName4.isInstance(view)) {
            return getViewType(canonicalName, "NavigationView");
        }
        return canonicalName;
    }

    public static String getViewType(String str, String str2) {
        if (TextUtils.isEmpty(str) || (!TextUtils.isEmpty(str2) && isOSViewByPackage(str))) {
            return str2;
        }
        return str;
    }

    public static String getViewTypeByReflect(View view) {
        String canonicalName = view.getClass().getCanonicalName();
        Class<?> classByName = getClassByName("android.widget.Switch");
        if (classByName != null && classByName.isInstance(view)) {
            return getViewType(canonicalName, "Switch");
        }
        Class<?> classByName2 = getClassByName("androidx.appcompat.widget.SwitchCompat");
        if (classByName2 != null && classByName2.isInstance(view)) {
            return getViewType(canonicalName, "SwitchCompat");
        }
        Class<?> classByName3 = getClassByName("androidx.appcompat.widget.SwitchCompat");
        if (classByName3 != null && classByName3.isInstance(view)) {
            return getViewType(canonicalName, "SwitchCompat");
        }
        return canonicalName;
    }

    private static boolean isOSViewByPackage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strReplace = str.replace(C33978va.f72339h, "##");
        Iterator<String> it = sOSViewPackage.iterator();
        while (it.hasNext()) {
            if (strReplace.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void mergeJSONObject(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Date) {
                    jSONObject2.put(next, TimeUtils.formatDate((Date) obj));
                } else {
                    jSONObject2.put(next, obj);
                }
            }
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
        }
    }

    private static String traverseParentViewTag(View view) {
        try {
            String str = null;
            for (ViewParent parent = view.getParent(); TextUtils.isEmpty(str) && (parent instanceof View); parent = parent.getParent()) {
                str = (String) ((View) parent).getTag(C27650R.id.sensors_analytics_tag_view_fragment_name);
            }
            return str;
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return "";
        }
    }

    public static boolean isViewIgnored(View view) {
        if (view == null) {
            return true;
        }
        try {
            List<Class> ignoredViewTypeList = SensorsDataAPI.sharedInstance().getIgnoredViewTypeList();
            if (ignoredViewTypeList != null) {
                Iterator<Class> it = ignoredViewTypeList.iterator();
                while (it.hasNext()) {
                    if (it.next().isAssignableFrom(view.getClass())) {
                        return true;
                    }
                }
            }
            return "1".equals(view.getTag(C27650R.id.sensors_analytics_tag_view_ignored));
        } catch (Exception e11) {
            SALog.printStackTrace(e11);
            return true;
        }
    }
}
