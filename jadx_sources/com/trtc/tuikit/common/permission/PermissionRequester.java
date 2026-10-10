package com.trtc.tuikit.common.permission;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.core.content.ContextCompat;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.trtc.tuikit.common.R$string;
import com.trtc.tuikit.common.system.ContextProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import qc0.C43708a;
import qc0.InterfaceC43709b;
import uc0.C45153b;
import uc0.C45154c;

/* JADX INFO: loaded from: classes2.dex */
public class PermissionRequester {

    /* JADX INFO: renamed from: i */
    public static final Object f77460i = new Object();

    /* JADX INFO: renamed from: j */
    public static AtomicBoolean f77461j = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public AbstractC35867d f77462a;

    /* JADX INFO: renamed from: b */
    public String[] f77463b;

    /* JADX INFO: renamed from: c */
    public String f77464c;

    /* JADX INFO: renamed from: d */
    public String f77465d;

    /* JADX INFO: renamed from: e */
    public String f77466e;

    /* JADX INFO: renamed from: f */
    public InterfaceC43709b f77467f;

    /* JADX INFO: renamed from: g */
    public List<String> f77468g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public List<String> f77469h = new ArrayList();

    public static class RequestData implements Parcelable {
        public static final Parcelable.Creator<RequestData> CREATOR = new C35863a();
        private final String mDescription;
        private int mPermissionIconId;
        private final String[] mPermissions;
        private final String mSettingsTip;
        private final String mTitle;

        /* JADX INFO: renamed from: com.trtc.tuikit.common.permission.PermissionRequester$RequestData$a */
        public class C35863a implements Parcelable.Creator<RequestData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public RequestData createFromParcel(Parcel parcel) {
                return new RequestData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public RequestData[] newArray(int i11) {
                return new RequestData[i11];
            }
        }

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

    /* JADX INFO: renamed from: e */
    public static PermissionRequester m79375e(@NonNull @Size(min = 1) String... strArr) {
        return new PermissionRequester(strArr);
    }

    /* JADX INFO: renamed from: b */
    public PermissionRequester m79376b(@NonNull AbstractC35867d abstractC35867d) {
        this.f77462a = abstractC35867d;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public PermissionRequester m79377c(@NonNull String str) {
        this.f77465d = str;
        return this;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: g */
    public void m79380g() {
        Log.i("PermissionRequester", "request, directPermissionList: " + this.f77468g + " ,indirectPermissionList:  " + this.f77469h);
        List<String> list = this.f77468g;
        if (list != null && list.size() > 0) {
            m79381h((String[]) this.f77468g.toArray(new String[0]));
        }
        List<String> list2 = this.f77469h;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        m79383j();
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: h */
    public final void m79381h(String[] strArr) {
        synchronized (f77460i) {
            try {
                if (f77461j.get()) {
                    Log.e("PermissionRequester", "can not request during requesting");
                    AbstractC35867d abstractC35867d = this.f77462a;
                    if (abstractC35867d != null) {
                        abstractC35867d.mo79395c();
                    }
                    return;
                }
                f77461j.set(true);
                C43708a.m96263a().m96265c(com.tencent.qcloud.tuicore.permission.PermissionRequester.PERMISSION_NOTIFY_EVENT_KEY, com.tencent.qcloud.tuicore.permission.PermissionRequester.PERMISSION_NOTIFY_EVENT_SUB_KEY, this.f77467f);
                if (C45153b.m99803c() < 23) {
                    Log.i("PermissionRequester", "current version is lower than 23");
                    m79379f(Result.Granted);
                    return;
                }
                String[] strArrM79378d = m79378d(strArr);
                if (strArrM79378d.length <= 0) {
                    m79379f(Result.Granted);
                } else {
                    m79386m(new RequestData(this.f77464c, this.f77465d, this.f77466e, strArrM79378d));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public PermissionRequester m79382i(@NonNull String str) {
        this.f77466e = str;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final void m79384k(Context context) {
        try {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m79387n(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClassName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity");
            intent.setAction("secure.intent.action.softPermissionDetail");
            intent.putExtra("packagename", context.getPackageName());
            intent.setFlags(268435456);
            context.startActivity(intent);
            C45154c.m99812d(context.getResources().getString(R$string.common_float_permission_hint));
        } catch (Exception unused) {
            Log.w("PermissionRequester", "startVivoPermissionSettings: open common settings");
            m79384k(context);
        }
    }

    /* JADX INFO: renamed from: p */
    public PermissionRequester m79389p(@NonNull String str) {
        this.f77464c = str;
        return this;
    }

    public PermissionRequester(String... strArr) {
        this.f77463b = strArr;
        for (String str : strArr) {
            if (!com.tencent.qcloud.tuicore.permission.PermissionRequester.FLOAT_PERMISSION.equals(str) && !com.tencent.qcloud.tuicore.permission.PermissionRequester.BG_START_PERMISSION.equals(str)) {
                this.f77468g.add(str);
            } else {
                this.f77469h.add(str);
            }
        }
        this.f77467f = new InterfaceC43709b() { // from class: com.trtc.tuikit.common.permission.e
            @Override // qc0.InterfaceC43709b
            public final void onNotifyEvent(String str2, String str3, Map map) {
                PermissionRequester.m79374a(this.f77476a, str2, str3, map);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m79374a(PermissionRequester permissionRequester, String str, String str2, Map map) {
        Object obj;
        permissionRequester.getClass();
        if (map == null || (obj = map.get(com.tencent.qcloud.tuicore.permission.PermissionRequester.PERMISSION_RESULT)) == null) {
            return;
        }
        permissionRequester.m79379f((Result) obj);
    }

    /* JADX INFO: renamed from: d */
    public final String[] m79378d(String[] strArr) {
        Context contextM79397b = ContextProvider.m79397b();
        if (contextM79397b == null) {
            Log.e("PermissionRequester", "findUnauthorizedPermissions appContext is null");
            return strArr;
        }
        LinkedList linkedList = new LinkedList();
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(contextM79397b, str) != 0) {
                linkedList.add(str);
            }
        }
        return (String[]) linkedList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: f */
    public final void m79379f(Result result) {
        C43708a.m96263a().m96266d(com.tencent.qcloud.tuicore.permission.PermissionRequester.PERMISSION_NOTIFY_EVENT_KEY, com.tencent.qcloud.tuicore.permission.PermissionRequester.PERMISSION_NOTIFY_EVENT_SUB_KEY, this.f77467f);
        f77461j.set(false);
        if (this.f77462a == null) {
            return;
        }
        if (Result.Granted.equals(result)) {
            this.f77462a.mo79394b();
        } else if (Result.Requesting.equals(result)) {
            this.f77462a.mo79395c();
        } else {
            this.f77462a.mo79393a();
        }
        this.f77462a = null;
    }

    /* JADX INFO: renamed from: j */
    public final void m79383j() {
        Context contextM79397b = ContextProvider.m79397b();
        if (C45153b.m99805e()) {
            m79387n(contextM79397b);
            return;
        }
        if (C45153b.m99804d()) {
            m79385l(contextM79397b);
        } else if (C45153b.m99806f()) {
            m79388o(contextM79397b);
        } else {
            m79384k(contextM79397b);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m79385l(Context context) {
        if (!C45153b.m99807g()) {
            Log.i("PermissionRequester", "The device is not Harmony or cannot get system operator");
            m79384k(context);
            return;
        }
        try {
            Intent intent = new Intent();
            intent.putExtra(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, context.getPackageName());
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            intent.setFlags(268435456);
            context.startActivity(intent);
            C45154c.m99812d(context.getResources().getString(R$string.common_float_permission_hint));
        } catch (Exception unused) {
            Log.w("PermissionRequester", "startHuaweiPermissionSettings: open common settings");
            m79384k(context);
        }
    }

    @RequiresApi(api = 23)
    /* JADX INFO: renamed from: m */
    public final void m79386m(RequestData requestData) {
        Context contextM79397b = ContextProvider.m79397b();
        if (contextM79397b == null) {
            return;
        }
        Intent intent = new Intent(contextM79397b, (Class<?>) PermissionActivity.class);
        intent.putExtra(com.tencent.qcloud.tuicore.permission.PermissionRequester.PERMISSION_REQUEST_KEY, requestData);
        intent.addFlags(268435456);
        contextM79397b.startActivity(intent);
    }

    /* JADX INFO: renamed from: o */
    public final void m79388o(Context context) {
        if (!C45153b.m99808h()) {
            Log.i("PermissionRequester", "The device do not open miuiOptimization or cannot get miui property");
            m79384k(context);
            return;
        }
        try {
            Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
            intent.putExtra("extra_pkgname", context.getPackageName());
            intent.setFlags(268435456);
            context.startActivity(intent);
            C45154c.m99812d(context.getResources().getString(R$string.common_float_permission_hint));
        } catch (Exception unused) {
            Log.w("PermissionRequester", "startXiaomiPermissionSettings: open common settings");
            m79384k(context);
        }
    }
}
