package com.tencent.qcloud.tuicore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.annotation.Nullable;
import com.tencent.qcloud.tuicore.interfaces.ITUIExtension;
import com.tencent.qcloud.tuicore.interfaces.ITUINotification;
import com.tencent.qcloud.tuicore.interfaces.ITUIObjectFactory;
import com.tencent.qcloud.tuicore.interfaces.ITUIService;
import com.tencent.qcloud.tuicore.interfaces.TUIExtensionInfo;
import com.tencent.qcloud.tuicore.interfaces.TUIServiceCallback;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public class TUICore {
    private static final String TAG = "TUICore";

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f75169a = 0;

    public static Object callService(String str, String str2, Map<String, Object> map) {
        return ServiceManager.getInstance().callService(str, str2, map);
    }

    public static void startActivity(String str, Bundle bundle) {
        startActivity(null, str, bundle, -1);
    }

    public static void startActivityForResult(@Nullable ActivityResultCaller activityResultCaller, String str, Bundle bundle, ActivityResultCallback<ActivityResult> activityResultCallback) {
        TUIRouter.startActivityForResult(activityResultCaller, str, bundle, activityResultCallback);
    }

    public static void unRegisterEvent(String str, String str2, ITUINotification iTUINotification) {
        EventManager.getInstance().unRegisterEvent(str, str2, iTUINotification);
    }

    public static Object callService(String str, String str2, Map<String, Object> map, TUIServiceCallback tUIServiceCallback) {
        return ServiceManager.getInstance().callService(str, str2, map, tUIServiceCallback);
    }

    public static void startActivity(@Nullable Object obj, String str, Bundle bundle) {
        startActivity(obj, str, bundle, -1);
    }

    public static void startActivityForResult(@Nullable ActivityResultCaller activityResultCaller, Class<? extends Activity> cls, Bundle bundle, ActivityResultCallback<ActivityResult> activityResultCallback) {
        TUIRouter.startActivityForResult(activityResultCaller, cls, bundle, activityResultCallback);
    }

    public static void unRegisterEvent(ITUINotification iTUINotification) {
        EventManager.getInstance().unRegisterEvent(iTUINotification);
    }

    public static Object createObject(String str, String str2, Map<String, Object> map) {
        return ObjectManager.getInstance().createObject(str, str2, map);
    }

    @Deprecated
    public static Map<String, Object> getExtensionInfo(String str, Map<String, Object> map) {
        return ExtensionManager.getInstance().getExtensionInfo(str, map);
    }

    public static List<TUIExtensionInfo> getExtensionList(String str, Map<String, Object> map) {
        return ExtensionManager.getInstance().getExtensionList(str, map);
    }

    public static ITUIService getService(String str) {
        return ServiceManager.getInstance().getService(str);
    }

    public static void notifyEvent(String str, String str2, Map<String, Object> map) {
        EventManager.getInstance().notifyEvent(str, str2, map);
    }

    public static void raiseExtension(String str, View view, Map<String, Object> map) {
        ExtensionManager.getInstance().raiseExtension(str, view, map);
    }

    public static void registerEvent(String str, String str2, ITUINotification iTUINotification) {
        EventManager.getInstance().registerEvent(str, str2, iTUINotification);
    }

    public static void registerExtension(String str, ITUIExtension iTUIExtension) {
        ExtensionManager.getInstance().registerExtension(str, iTUIExtension);
    }

    public static void registerObjectFactory(String str, ITUIObjectFactory iTUIObjectFactory) {
        ObjectManager.getInstance().registerObjectFactory(str, iTUIObjectFactory);
    }

    public static void registerService(String str, ITUIService iTUIService) {
        ServiceManager.getInstance().registerService(str, iTUIService);
    }

    @Deprecated
    public static void startActivity(@Nullable Object obj, String str, Bundle bundle, int i11) {
        TUIRouter.startActivity(obj, str, bundle, i11);
    }

    public static void startActivityForResult(@Nullable ActivityResultCaller activityResultCaller, Intent intent, ActivityResultCallback<ActivityResult> activityResultCallback) {
        TUIRouter.startActivityForResult(activityResultCaller, intent, activityResultCallback);
    }

    public static void unRegisterExtension(String str, ITUIExtension iTUIExtension) {
        ExtensionManager.getInstance().unRegisterExtension(str, iTUIExtension);
    }

    public static void unregisterObjectFactory(String str) {
        ObjectManager.getInstance().unregisterObjectFactory(str);
    }

    public static void unregisterService(String str) {
        ServiceManager.getInstance().unregisterService(str);
    }
}
