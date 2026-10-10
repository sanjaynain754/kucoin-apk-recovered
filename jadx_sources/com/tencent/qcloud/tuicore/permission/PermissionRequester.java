package com.tencent.qcloud.tuicore.permission;

import android.annotation.SuppressLint;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.core.content.ContextCompat;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tencent.imsdk.BaseConstants;
import com.tencent.qcloud.tuicore.C35071R;
import com.tencent.qcloud.tuicore.TUIConfig;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.interfaces.ITUINotification;
import com.tencent.qcloud.tuicore.util.TUIBuild;
import com.tencent.qcloud.tuicore.util.ToastUtil;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes56.dex */
public class PermissionRequester {
    public static final String BG_START_PERMISSION = "PermissionStartActivityFromBackground";
    public static final String FLOAT_PERMISSION = "PermissionOverlayWindows";
    public static final String PERMISSION_NOTIFY_EVENT_KEY = "PERMISSION_NOTIFY_EVENT_KEY";
    public static final String PERMISSION_NOTIFY_EVENT_SUB_KEY = "PERMISSION_NOTIFY_EVENT_SUB_KEY";
    public static final String PERMISSION_REQUEST_KEY = "PERMISSION_REQUEST_KEY";
    public static final String PERMISSION_RESULT = "PERMISSION_RESULT";
    private static final String TAG = "PermissionRequester";
    private String mDescription;
    private List<String> mDirectPermissionList = new ArrayList();
    private List<String> mIndirectPermissionList = new ArrayList();
    private PermissionCallback mPermissionCallback;
    private ITUINotification mPermissionNotification;
    private String[] mPermissions;
    private String mSettingsTip;
    private String mTitle;
    private static final Object sLock = new Object();
    private static AtomicBoolean sIsRequesting = new AtomicBoolean(false);

    public static class RequestData implements Parcelable {
        public static final Parcelable.Creator<RequestData> CREATOR = new Parcelable.Creator<RequestData>() { // from class: com.tencent.qcloud.tuicore.permission.PermissionRequester.RequestData.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public RequestData createFromParcel(Parcel parcel) {
                return new RequestData(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public RequestData[] newArray(int i11) {
                return new RequestData[i11];
            }
        };
        private final String mDescription;
        private int mPermissionIconId;
        private final String[] mPermissions;
        private final String mSettingsTip;
        private final String mTitle;

        public RequestData(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String... strArr) {
            this.mTitle = str;
            this.mDescription = str2;
            this.mSettingsTip = str3;
            this.mPermissions = (String[]) strArr.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getDescription() {
            return this.mDescription;
        }

        public int getPermissionIconId() {
            return this.mPermissionIconId;
        }

        public String[] getPermissions() {
            return (String[]) this.mPermissions.clone();
        }

        public String getSettingsTip() {
            return this.mSettingsTip;
        }

        public String getTitle() {
            return this.mTitle;
        }

        public boolean isPermissionsExistEmpty() {
            String[] strArr = this.mPermissions;
            if (strArr == null || strArr.length <= 0) {
                return true;
            }
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    return true;
                }
            }
            return false;
        }

        public void setPermissionIconId(int i11) {
            this.mPermissionIconId = i11;
        }

        public String toString() {
            return "PermissionRequest{mPermissions=" + Arrays.toString(this.mPermissions) + ", mTitle=" + this.mTitle + ", mDescription='" + this.mDescription + ", mSettingsTip='" + this.mSettingsTip + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeStringArray(this.mPermissions);
            parcel.writeString(this.mTitle);
            parcel.writeString(this.mDescription);
            parcel.writeString(this.mSettingsTip);
            parcel.writeInt(this.mPermissionIconId);
        }

        public RequestData(Parcel parcel) {
            this.mPermissions = parcel.createStringArray();
            this.mTitle = parcel.readString();
            this.mDescription = parcel.readString();
            this.mSettingsTip = parcel.readString();
            this.mPermissionIconId = parcel.readInt();
        }
    }

    public enum Result {
        Granted,
        Denied,
        Requesting
    }

    private boolean isHarmonyBgStartPermissionAllowed(Context context) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            if (appOpsManager == null) {
                return false;
            }
            Class<?> cls = Class.forName("com.huawei.android.app.AppOpsManagerEx");
            Class cls2 = Integer.TYPE;
            int iIntValue = ((Integer) cls.getDeclaredMethod("checkHwOpNoThrow", AppOpsManager.class, cls2, cls2, String.class).invoke(cls.newInstance(), appOpsManager, 100000, Integer.valueOf(Process.myUid()), context.getPackageName())).intValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isHarmonyBgStartPermissionAllowed, result: ");
            sb2.append(iIntValue == 0);
            Log.i(TAG, sb2.toString());
            return iIntValue == 0;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    private boolean isVivoBgStartPermissionAllowed(Context context) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.vivo.permissionmanager.provider.permission/start_bg_activity"), null, "pkgname = ?", new String[]{context.getPackageName()}, null);
            if (cursorQuery == null) {
                return false;
            }
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return false;
            }
            int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex("currentstate"));
            cursorQuery.close();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isVivoBgStartPermissionAllowed, result: ");
            sb2.append(i11 == 0);
            Log.i(TAG, sb2.toString());
            return i11 == 0;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private boolean isXiaomiBgStartPermissionAllowed(Context context) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            if (appOpsManager == null) {
                return false;
            }
            Class<?> cls = appOpsManager.getClass();
            Class cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            method.setAccessible(true);
            int iIntValue = ((Integer) method.invoke(appOpsManager, Integer.valueOf(BaseConstants.ERR_SVR_GROUP_GROUPID_IN_USED), Integer.valueOf(Process.myUid()), context.getPackageName())).intValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isXiaomiBgStartPermissionAllowed, result: ");
            sb2.append(iIntValue == 0);
            Log.i(TAG, sb2.toString());
            return iIntValue == 0;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    public boolean has() {
        if (this.mIndirectPermissionList.contains(BG_START_PERMISSION)) {
            return hasFloatPermission() && hasBgStartPermission();
        }
        if (this.mIndirectPermissionList.contains(FLOAT_PERMISSION)) {
            return hasFloatPermission();
        }
        Iterator<String> it = this.mDirectPermissionList.iterator();
        while (it.hasNext()) {
            if (!has(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static PermissionRequester newInstance(@NonNull @Size(min = 1) String... strArr) {
        return new PermissionRequester(strArr);
    }

    private void notifyPermissionRequestResult(Result result) {
        TUICore.unRegisterEvent(PERMISSION_NOTIFY_EVENT_KEY, PERMISSION_NOTIFY_EVENT_SUB_KEY, this.mPermissionNotification);
        sIsRequesting.set(false);
        if (this.mPermissionCallback == null) {
            return;
        }
        if (Result.Granted.equals(result)) {
            this.mPermissionCallback.onGranted();
        } else if (Result.Requesting.equals(result)) {
            this.mPermissionCallback.onRequesting();
        } else {
            this.mPermissionCallback.onDenied();
        }
        this.mPermissionCallback = null;
    }

    @SuppressLint({"NewApi"})
    private void requestDirectPermission(String[] strArr) {
        synchronized (sLock) {
            try {
                if (sIsRequesting.get()) {
                    Log.e(TAG, "can not request during requesting");
                    PermissionCallback permissionCallback = this.mPermissionCallback;
                    if (permissionCallback != null) {
                        permissionCallback.onRequesting();
                    }
                    return;
                }
                sIsRequesting.set(true);
                TUICore.registerEvent(PERMISSION_NOTIFY_EVENT_KEY, PERMISSION_NOTIFY_EVENT_SUB_KEY, this.mPermissionNotification);
                if (TUIBuild.getVersionInt() < 23) {
                    Log.i(TAG, "current version is lower than 23");
                    notifyPermissionRequestResult(Result.Granted);
                    return;
                }
                String[] strArrFindUnauthorizedPermissions = findUnauthorizedPermissions(strArr);
                if (strArrFindUnauthorizedPermissions.length <= 0) {
                    notifyPermissionRequestResult(Result.Granted);
                } else {
                    startPermissionActivity(new RequestData(this.mTitle, this.mDescription, this.mSettingsTip, strArrFindUnauthorizedPermissions));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void startCommonSettings(Context context) {
        try {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private void startVivoPermissionSettings(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClassName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity");
            intent.setAction("secure.intent.action.softPermissionDetail");
            intent.putExtra("packagename", context.getPackageName());
            intent.setFlags(268435456);
            context.startActivity(intent);
            ToastUtil.toastShortMessage(context.getResources().getString(C35071R.string.core_float_permission_hint));
        } catch (Exception unused) {
            Log.w(TAG, "startVivoPermissionSettings: open common settings");
            startCommonSettings(context);
        }
    }

    public PermissionRequester callback(@NonNull PermissionCallback permissionCallback) {
        this.mPermissionCallback = permissionCallback;
        return this;
    }

    public PermissionRequester description(@NonNull String str) {
        this.mDescription = str;
        return this;
    }

    @SuppressLint({"NewApi"})
    public void request() {
        Log.i(TAG, "request, directPermissionList: " + this.mDirectPermissionList + " ,indirectPermissionList:  " + this.mIndirectPermissionList);
        List<String> list = this.mDirectPermissionList;
        if (list != null && list.size() > 0) {
            requestDirectPermission((String[]) this.mDirectPermissionList.toArray(new String[0]));
        }
        List<String> list2 = this.mIndirectPermissionList;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        startAppDetailsSettingsByBrand();
    }

    public PermissionRequester settingsTip(@NonNull String str) {
        this.mSettingsTip = str;
        return this;
    }

    public PermissionRequester title(@NonNull String str) {
        this.mTitle = str;
        return this;
    }

    private PermissionRequester(String... strArr) {
        this.mPermissions = strArr;
        for (String str : strArr) {
            if (!FLOAT_PERMISSION.equals(str) && !BG_START_PERMISSION.equals(str)) {
                this.mDirectPermissionList.add(str);
            } else {
                this.mIndirectPermissionList.add(str);
            }
        }
        this.mPermissionNotification = new ITUINotification() { // from class: com.tencent.qcloud.tuicore.permission.d
            @Override // com.tencent.qcloud.tuicore.interfaces.ITUINotification
            public final void onNotifyEvent(String str2, String str3, Map map) {
                PermissionRequester.m77055a(this.f75175b, str2, str3, map);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m77055a(PermissionRequester permissionRequester, String str, String str2, Map map) {
        Object obj;
        permissionRequester.getClass();
        if (map == null || (obj = map.get(PERMISSION_RESULT)) == null) {
            return;
        }
        permissionRequester.notifyPermissionRequestResult((Result) obj);
    }

    private String[] findUnauthorizedPermissions(String[] strArr) {
        Context appContext = TUIConfig.getAppContext();
        if (appContext == null) {
            Log.e(TAG, "findUnauthorizedPermissions appContext is null");
            return strArr;
        }
        LinkedList linkedList = new LinkedList();
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(appContext, str) != 0) {
                linkedList.add(str);
            }
        }
        return (String[]) linkedList.toArray(new String[0]);
    }

    private boolean hasBgStartPermission() {
        if (TUIBuild.isBrandHuawei() && TUIBuild.isHarmonyOS()) {
            return isHarmonyBgStartPermissionAllowed(TUIConfig.getAppContext());
        }
        if (TUIBuild.isBrandVivo()) {
            return isVivoBgStartPermissionAllowed(TUIConfig.getAppContext());
        }
        if (TUIBuild.isBrandXiaoMi() && TUIBuild.isMiuiOptimization()) {
            return isXiaomiBgStartPermissionAllowed(TUIConfig.getAppContext());
        }
        return hasFloatPermission();
    }

    private boolean hasFloatPermission() {
        try {
            return Settings.canDrawOverlays(TUIConfig.getAppContext());
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    private void startAppDetailsSettingsByBrand() {
        if (TUIBuild.isBrandVivo()) {
            startVivoPermissionSettings(TUIConfig.getAppContext());
            return;
        }
        if (TUIBuild.isBrandHuawei()) {
            startHuaweiPermissionSettings(TUIConfig.getAppContext());
        } else if (TUIBuild.isBrandXiaoMi()) {
            startXiaomiPermissionSettings(TUIConfig.getAppContext());
        } else {
            startCommonSettings(TUIConfig.getAppContext());
        }
    }

    private void startHuaweiPermissionSettings(Context context) {
        if (!TUIBuild.isHarmonyOS()) {
            Log.i(TAG, "The device is not Harmony or cannot get system operator");
            startCommonSettings(context);
            return;
        }
        try {
            Intent intent = new Intent();
            intent.putExtra(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, context.getPackageName());
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            intent.setFlags(268435456);
            context.startActivity(intent);
            ToastUtil.toastShortMessage(context.getResources().getString(C35071R.string.core_float_permission_hint_harmony));
        } catch (Exception unused) {
            Log.w(TAG, "startHuaweiPermissionSettings: open common settings");
            startCommonSettings(context);
        }
    }

    @RequiresApi(api = 23)
    private void startPermissionActivity(RequestData requestData) {
        Context appContext = TUIConfig.getAppContext();
        if (appContext == null) {
            return;
        }
        Intent intent = new Intent(appContext, (Class<?>) PermissionActivity.class);
        intent.putExtra(PERMISSION_REQUEST_KEY, requestData);
        intent.addFlags(268435456);
        appContext.startActivity(intent);
    }

    private void startXiaomiPermissionSettings(Context context) {
        if (!TUIBuild.isMiuiOptimization()) {
            Log.i(TAG, "The device do not open miuiOptimization or cannot get miui property");
            startCommonSettings(context);
            return;
        }
        try {
            Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
            intent.putExtra("extra_pkgname", context.getPackageName());
            intent.setFlags(268435456);
            context.startActivity(intent);
            ToastUtil.toastShortMessage(context.getResources().getString(C35071R.string.core_float_permission_hint));
        } catch (Exception unused) {
            Log.w(TAG, "startXiaomiPermissionSettings: open common settings");
            startCommonSettings(context);
        }
    }

    private boolean has(String str) {
        return TUIBuild.getVersionInt() < 23 || ContextCompat.checkSelfPermission(TUIConfig.getAppContext(), str) == 0;
    }
}
