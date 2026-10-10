package com.tencent.qcloud.tuicore.util;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.tencent.bugly.proguard.C33872q4;
import com.tencent.qcloud.tuicore.C35071R;
import com.tencent.qcloud.tuicore.TUIConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
public final class PermissionRequester {
    private static Context applicationContext;
    private static PermissionRequester instance;
    private String mCurrentRequestPermission;
    private String mDeniedAlert;
    private PermissionDialogCallback mDialogCallback;
    private FullCallback mFullCallback;
    private int mIconId;
    private Set<String> mPermissions = new LinkedHashSet();
    private List<String> mPermissionsDenied;
    private List<String> mPermissionsGranted;
    private List<String> mPermissionsRequest;
    private String mReason;
    private String mReasonTitle;
    private SimpleCallback mSimpleCallback;
    private static final List<String> PERMISSIONS = getPermissions();
    private static boolean isRequesting = false;
    private static final Map<String, PermissionRequestContent> permissionRequestContentMap = new HashMap();

    public interface FullCallback {
        void onDenied(List<String> list);

        void onGranted(List<String> list);
    }

    @RequiresApi(api = 23)
    public static class PermissionActivity extends Activity {
        private View mContentView;

        @Override // android.app.Activity
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        private void hideContentView() {
            View view = this.mContentView;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        private void fillContentView() {
            if (PermissionRequester.instance != null) {
                PermissionRequestContent permissionRequestContent = (PermissionRequestContent) PermissionRequester.permissionRequestContentMap.get(PermissionRequester.instance.mCurrentRequestPermission);
                int i11 = PermissionRequester.instance.mIconId;
                String str = PermissionRequester.instance.mReasonTitle;
                String str2 = PermissionRequester.instance.mReason;
                if (permissionRequestContent != null) {
                    int i12 = permissionRequestContent.iconResId;
                    if (i12 != 0) {
                        i11 = i12;
                    }
                    if (!TextUtils.isEmpty(permissionRequestContent.reasonTitle)) {
                        str = permissionRequestContent.reasonTitle;
                    }
                    if (!TextUtils.isEmpty(permissionRequestContent.reason)) {
                        str2 = permissionRequestContent.reason;
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    setContentView(C35071R.layout.permission_activity_layout);
                    this.mContentView = findViewById(C35071R.id.tuicore_permission_layout);
                    TextView textView = (TextView) findViewById(C35071R.id.permission_reason_title);
                    TextView textView2 = (TextView) findViewById(C35071R.id.permission_reason);
                    ImageView imageView = (ImageView) findViewById(C35071R.id.permission_icon);
                    textView.setText(str);
                    textView2.setText(str2);
                    if (i11 != 0) {
                        imageView.setBackgroundResource(i11);
                    }
                }
            }
        }

        private void requestPermission() {
            if (PermissionRequester.instance != null && PermissionRequester.instance.mPermissionsRequest != null) {
                int size = PermissionRequester.instance.mPermissionsRequest.size();
                if (size <= 0) {
                    PermissionRequester.instance.onRequestPermissionsResult(this);
                } else {
                    fillContentView();
                    requestPermissions((String[]) PermissionRequester.instance.mPermissionsRequest.toArray(new String[size]), 1);
                }
            }
        }

        @Override // android.app.Activity, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.app.Activity
        public void onCreate(@Nullable Bundle bundle) {
            super.onCreate(bundle);
            if (TUIBuild.getVersionInt() >= 21) {
                getWindow().getDecorView().setSystemUiVisibility(1280);
                getWindow().setStatusBarColor(0);
                getWindow().setNavigationBarColor(0);
            }
            ActionBar actionBar = getActionBar();
            if (actionBar != null) {
                actionBar.hide();
            }
            requestPermission();
        }

        @Override // android.app.Activity
        public void onDestroy() {
            super.onDestroy();
            boolean unused = PermissionRequester.isRequesting = false;
        }

        @Override // android.app.Activity
        public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) {
            if (PermissionRequester.instance != null && PermissionRequester.instance.mPermissionsRequest != null) {
                hideContentView();
                PermissionRequester.instance.onRequestPermissionsResult(this);
            }
        }
    }

    public interface PermissionDialogCallback {
        void onApproved();

        void onRefused();
    }

    public static class PermissionRequestContent {
        String deniedAlert;
        int iconResId;
        String reason;
        String reasonTitle;

        public void setDeniedAlert(String str) {
            this.deniedAlert = str;
        }

        public void setIconResId(int i11) {
            this.iconResId = i11;
        }

        public void setReason(String str) {
            this.reason = str;
        }

        public void setReasonTitle(String str) {
            this.reasonTitle = str;
        }
    }

    public interface SimpleCallback {
        void onDenied();

        void onGranted();
    }

    public static List<String> getPermissions() {
        return getPermissions(getApplicationContext().getPackageName());
    }

    public static boolean isGranted(String... strArr) {
        for (String str : strArr) {
            if (!isGranted(str)) {
                return false;
            }
        }
        return true;
    }

    public PermissionRequester callback(SimpleCallback simpleCallback) {
        this.mSimpleCallback = simpleCallback;
        return this;
    }

    public static final class PermissionConstants {
        public static final String CALENDAR = "android.permission-group.CALENDAR";
        public static final String CAMERA = "android.permission-group.CAMERA";
        public static final String CONTACTS = "android.permission-group.CONTACTS";
        private static final String[] GROUP_CALENDAR = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
        private static final String[] GROUP_CAMERA = {"android.permission.CAMERA"};
        private static final String[] GROUP_CONTACTS = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.GET_ACCOUNTS"};
        private static final String[] GROUP_LOCATION = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        private static final String[] GROUP_MICROPHONE = {"android.permission.RECORD_AUDIO"};
        private static final String[] GROUP_PHONE = {C33872q4.f71536c, "android.permission.READ_PHONE_NUMBERS", "android.permission.CALL_PHONE", "android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG", "com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission.USE_SIP", "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.ANSWER_PHONE_CALLS"};
        private static final String[] GROUP_PHONE_BELOW_O = {C33872q4.f71536c, "android.permission.READ_PHONE_NUMBERS", "android.permission.CALL_PHONE", "android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG", "com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission.USE_SIP", "android.permission.PROCESS_OUTGOING_CALLS"};
        private static final String[] GROUP_SENSORS = {"android.permission.BODY_SENSORS"};
        private static final String[] GROUP_SMS = {"android.permission.SEND_SMS", "android.permission.RECEIVE_SMS", "android.permission.READ_SMS", "android.permission.RECEIVE_WAP_PUSH", "android.permission.RECEIVE_MMS"};
        private static final String[] GROUP_STORAGE = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        public static final String LOCATION = "android.permission-group.LOCATION";
        public static final String MICROPHONE = "android.permission-group.MICROPHONE";
        public static final String PHONE = "android.permission-group.PHONE";
        public static final String SENSORS = "android.permission-group.SENSORS";
        public static final String SMS = "android.permission-group.SMS";
        public static final String STORAGE = "android.permission-group.STORAGE";

        @Retention(RetentionPolicy.SOURCE)
        public @interface Permission {
        }

        public static String[] getPermissions(String str) {
            str.getClass();
            switch (str) {
                case "android.permission-group.CONTACTS":
                    return GROUP_CONTACTS;
                case "android.permission-group.PHONE":
                    if (TUIBuild.getVersionInt() < 26) {
                        return GROUP_PHONE_BELOW_O;
                    }
                    return GROUP_PHONE;
                case "android.permission-group.CALENDAR":
                    return GROUP_CALENDAR;
                case "android.permission-group.CAMERA":
                    return GROUP_CAMERA;
                case "android.permission-group.SENSORS":
                    return GROUP_SENSORS;
                case "android.permission-group.LOCATION":
                    return GROUP_LOCATION;
                case "android.permission-group.STORAGE":
                    return GROUP_STORAGE;
                case "android.permission-group.MICROPHONE":
                    return GROUP_MICROPHONE;
                case "android.permission-group.SMS":
                    return GROUP_SMS;
                default:
                    return new String[]{str};
            }
        }
    }

    private static Context getApplicationContext() {
        if (applicationContext == null) {
            applicationContext = TUIConfig.getAppContext();
        }
        return applicationContext;
    }

    public static List<String> getPermissions(String str) {
        try {
            String[] strArr = getApplicationContext().getPackageManager().getPackageInfo(str, 4096).requestedPermissions;
            return strArr == null ? Collections.EMPTY_LIST : Arrays.asList(strArr);
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            return Collections.EMPTY_LIST;
        }
    }

    private void getPermissionsStatus() {
        for (String str : this.mPermissionsRequest) {
            if (isGranted(str)) {
                this.mPermissionsGranted.add(str);
            } else {
                this.mPermissionsDenied.add(str);
            }
        }
    }

    public static void launchAppDetailsSettings() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + getApplicationContext().getPackageName()));
        if (isIntentAvailable(intent)) {
            getApplicationContext().startActivity(intent.addFlags(268435456));
        }
    }

    public static PermissionRequester permission(String str) {
        return new PermissionRequester(str);
    }

    private void requestCallback() {
        if (this.mSimpleCallback != null) {
            if (this.mPermissionsRequest.size() == 0 || this.mPermissions.size() == this.mPermissionsGranted.size()) {
                this.mSimpleCallback.onGranted();
            } else if (!this.mPermissionsDenied.isEmpty()) {
                this.mSimpleCallback.onDenied();
            }
            this.mSimpleCallback = null;
        }
        if (this.mFullCallback != null) {
            if (this.mPermissionsRequest.size() == 0 || this.mPermissions.size() == this.mPermissionsGranted.size()) {
                this.mFullCallback.onGranted(this.mPermissionsGranted);
            } else if (!this.mPermissionsDenied.isEmpty()) {
                this.mFullCallback.onDenied(this.mPermissionsDenied);
            }
            this.mFullCallback = null;
        }
    }

    public static void setPermissionRequestContent(String str, PermissionRequestContent permissionRequestContent) {
        permissionRequestContentMap.put(str, permissionRequestContent);
    }

    @RequiresApi(api = 23)
    private void startPermissionActivity() {
        this.mPermissionsDenied = new ArrayList();
        Context applicationContext2 = getApplicationContext();
        if (applicationContext2 == null) {
            return;
        }
        Intent intent = new Intent(applicationContext2, (Class<?>) PermissionActivity.class);
        intent.addFlags(268435456);
        applicationContext2.startActivity(intent);
    }

    public PermissionRequester callback(FullCallback fullCallback) {
        this.mFullCallback = fullCallback;
        return this;
    }

    public PermissionRequester deniedAlert(String str) {
        this.mDeniedAlert = str;
        return this;
    }

    public PermissionRequester permissionDialogCallback(PermissionDialogCallback permissionDialogCallback) {
        this.mDialogCallback = permissionDialogCallback;
        return this;
    }

    public PermissionRequester reason(String str) {
        this.mReason = str;
        return this;
    }

    public PermissionRequester reasonIcon(int i11) {
        this.mIconId = i11;
        return this;
    }

    public PermissionRequester reasonTitle(String str) {
        this.mReasonTitle = str;
        return this;
    }

    public void request() {
        if (isRequesting) {
            return;
        }
        isRequesting = true;
        instance = this;
        this.mPermissionsGranted = new ArrayList();
        this.mPermissionsRequest = new ArrayList();
        if (TUIBuild.getVersionInt() < 23) {
            this.mPermissionsGranted.addAll(this.mPermissions);
            isRequesting = false;
            requestCallback();
            this.mDialogCallback = null;
            return;
        }
        for (String str : this.mPermissions) {
            if (isGranted(str)) {
                this.mPermissionsGranted.add(str);
            } else {
                this.mPermissionsRequest.add(str);
            }
        }
        if (!this.mPermissionsRequest.isEmpty()) {
            startPermissionActivity();
            return;
        }
        isRequesting = false;
        requestCallback();
        this.mDialogCallback = null;
    }

    public void showPermissionDialog(final Activity activity, final PermissionDialogCallback permissionDialogCallback) {
        PermissionRequestContent permissionRequestContent = permissionRequestContentMap.get(instance.mCurrentRequestPermission);
        String str = this.mDeniedAlert;
        if (permissionRequestContent != null && !TextUtils.isEmpty(permissionRequestContent.deniedAlert)) {
            str = permissionRequestContent.deniedAlert;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.mReason;
        }
        if (TextUtils.isEmpty(str)) {
            isRequesting = false;
            activity.finish();
            permissionDialogCallback.onRefused();
            return;
        }
        activity.setContentView(C35071R.layout.permission_activity_layout);
        View viewInflate = LayoutInflater.from(activity).inflate(C35071R.layout.permission_tip_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(C35071R.id.tips);
        TextView textView2 = (TextView) viewInflate.findViewById(C35071R.id.positive_btn);
        TextView textView3 = (TextView) viewInflate.findViewById(C35071R.id.negative_btn);
        textView.setText(str);
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(viewInflate).setCancelable(false).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tencent.qcloud.tuicore.util.PermissionRequester.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                boolean unused = PermissionRequester.isRequesting = false;
            }
        }).create();
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.qcloud.tuicore.util.PermissionRequester.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean unused = PermissionRequester.isRequesting = false;
                alertDialogCreate.cancel();
                activity.finish();
                permissionDialogCallback.onApproved();
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.qcloud.tuicore.util.PermissionRequester.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean unused = PermissionRequester.isRequesting = false;
                alertDialogCreate.cancel();
                activity.finish();
                permissionDialogCallback.onRefused();
            }
        });
        alertDialogCreate.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.tencent.qcloud.tuicore.util.PermissionRequester.5
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
                if (i11 == 4 && keyEvent.getAction() == 0) {
                    boolean unused = PermissionRequester.isRequesting = false;
                    alertDialogCreate.cancel();
                    activity.finish();
                    permissionDialogCallback.onRefused();
                }
                return false;
            }
        });
        alertDialogCreate.show();
        Window window = alertDialogCreate.getWindow();
        window.setBackgroundDrawable(new ColorDrawable());
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    private PermissionRequester(String str) {
        this.mCurrentRequestPermission = str;
        for (String str2 : PermissionConstants.getPermissions(str)) {
            if (PERMISSIONS.contains(str2)) {
                this.mPermissions.add(str2);
            }
        }
    }

    private static boolean isGranted(String str) {
        return TUIBuild.getVersionInt() < 23 || ContextCompat.checkSelfPermission(getApplicationContext(), str) == 0;
    }

    private static boolean isIntentAvailable(Intent intent) {
        if (getApplicationContext().getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRequestPermissionsResult(Activity activity) {
        getPermissionsStatus();
        if (!this.mPermissionsDenied.isEmpty()) {
            showPermissionDialog(activity, new PermissionDialogCallback() { // from class: com.tencent.qcloud.tuicore.util.PermissionRequester.1
                @Override // com.tencent.qcloud.tuicore.util.PermissionRequester.PermissionDialogCallback
                public void onApproved() {
                    if (PermissionRequester.this.mDialogCallback != null) {
                        PermissionRequester.this.mDialogCallback.onApproved();
                    }
                    PermissionRequester.this.mDialogCallback = null;
                    PermissionRequester.launchAppDetailsSettings();
                }

                @Override // com.tencent.qcloud.tuicore.util.PermissionRequester.PermissionDialogCallback
                public void onRefused() {
                    if (PermissionRequester.this.mDialogCallback != null) {
                        PermissionRequester.this.mDialogCallback.onRefused();
                    }
                    PermissionRequester.this.mDialogCallback = null;
                }
            });
        } else {
            isRequesting = false;
            this.mDialogCallback = null;
            activity.finish();
        }
        requestCallback();
    }
}
