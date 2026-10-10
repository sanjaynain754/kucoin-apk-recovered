package com.tencent.qcloud.tuicore.permission;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
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
import com.tencent.qcloud.tuicore.C35071R;
import com.tencent.qcloud.tuicore.TUICore;
import com.tencent.qcloud.tuicore.util.TUIBuild;
import java.util.HashMap;

/* JADX INFO: loaded from: classes56.dex */
@RequiresApi(api = 23)
public class PermissionActivity extends Activity {
    private static final int PERMISSION_REQUEST_CODE = 100;
    private static final String TAG = "PermissionActivity";
    private ImageView mPermissionIconIv;
    private TextView mRationaleDescriptionTv;
    private TextView mRationaleTitleTv;
    private PermissionRequester.RequestData mRequestData;
    private PermissionRequester.Result mResult = PermissionRequester.Result.Denied;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m77053b(Dialog dialog, DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        if (i11 == 4 && keyEvent.getAction() == 1) {
            dialog.dismiss();
        }
        return true;
    }

    private boolean isAllPermissionsGranted(@NonNull int[] iArr) {
        for (int i11 : iArr) {
            if (i11 != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    private void finishWithResult(PermissionRequester.Result result) {
        Log.i(TAG, "finishWithResult : " + result);
        this.mResult = result;
        finish();
    }

    private void hidePermissionRationale() {
        this.mRationaleTitleTv.setVisibility(4);
        this.mRationaleDescriptionTv.setVisibility(4);
        this.mPermissionIconIv.setVisibility(4);
    }

    private void initView() {
        setContentView(C35071R.layout.permission_activity_layout);
        this.mRationaleTitleTv = (TextView) findViewById(C35071R.id.permission_reason_title);
        this.mRationaleDescriptionTv = (TextView) findViewById(C35071R.id.permission_reason);
        this.mPermissionIconIv = (ImageView) findViewById(C35071R.id.permission_icon);
    }

    private void launchAppDetailsSettings() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + getPackageName()));
        intent.addFlags(268435456);
        if (getPackageManager().queryIntentActivities(intent, 65536).size() <= 0) {
            Log.e(TAG, "launchAppDetailsSettings can not find system settings");
        } else {
            startActivity(intent);
        }
    }

    private void showPermissionRationale() {
        PermissionRequester.RequestData requestData = this.mRequestData;
        if (requestData == null) {
            return;
        }
        this.mRationaleTitleTv.setText(requestData.getTitle());
        this.mRationaleDescriptionTv.setText(this.mRequestData.getDescription());
        this.mPermissionIconIv.setBackgroundResource(this.mRequestData.getPermissionIconId());
        this.mRationaleTitleTv.setVisibility(0);
        this.mRationaleDescriptionTv.setVisibility(0);
        this.mPermissionIconIv.setVisibility(0);
    }

    private void showSettingsTip() {
        if (this.mRequestData == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(this).inflate(C35071R.layout.permission_tip_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(C35071R.id.tips);
        TextView textView2 = (TextView) viewInflate.findViewById(C35071R.id.positive_btn);
        TextView textView3 = (TextView) viewInflate.findViewById(C35071R.id.negative_btn);
        textView.setText(this.mRequestData.getSettingsTip());
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setView(viewInflate).setCancelable(false).create();
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.qcloud.tuicore.permission.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionActivity.m77054c(this.f75170b, alertDialogCreate, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.tencent.qcloud.tuicore.permission.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionActivity.m77052a(this.f75172b, alertDialogCreate, view);
            }
        });
        alertDialogCreate.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.tencent.qcloud.tuicore.permission.c
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
                return PermissionActivity.m77053b(alertDialogCreate, dialogInterface, i11, keyEvent);
            }
        });
        Window window = alertDialogCreate.getWindow();
        window.setBackgroundDrawable(new ColorDrawable());
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        window.setAttributes(attributes);
        alertDialogCreate.show();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m77052a(PermissionActivity permissionActivity, Dialog dialog, View view) {
        permissionActivity.getClass();
        dialog.dismiss();
        permissionActivity.finishWithResult(PermissionRequester.Result.Denied);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m77054c(PermissionActivity permissionActivity, Dialog dialog, View view) {
        permissionActivity.getClass();
        dialog.dismiss();
        permissionActivity.launchAppDetailsSettings();
        permissionActivity.finishWithResult(PermissionRequester.Result.Requesting);
    }

    private PermissionRequester.RequestData getPermissionRequest() {
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        return (PermissionRequester.RequestData) intent.getParcelableExtra(PermissionRequester.PERMISSION_REQUEST_KEY);
    }

    @SuppressLint({"NewApi"})
    private void makeBackGroundTransparent() {
        if (TUIBuild.getVersionInt() >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(1280);
            getWindow().setStatusBarColor(0);
            getWindow().setNavigationBarColor(0);
        }
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        PermissionRequester.RequestData permissionRequest = getPermissionRequest();
        this.mRequestData = permissionRequest;
        if (permissionRequest != null && !permissionRequest.isPermissionsExistEmpty()) {
            Log.i(TAG, "onCreate : " + this.mRequestData.toString());
            if (TUIBuild.getVersionInt() < 23) {
                finishWithResult(PermissionRequester.Result.Granted);
                return;
            }
            makeBackGroundTransparent();
            initView();
            showPermissionRationale();
            requestPermissions(this.mRequestData.getPermissions(), 100);
            return;
        }
        Log.e(TAG, "onCreate mRequestData exist empty permission");
        finishWithResult(PermissionRequester.Result.Denied);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HashMap map = new HashMap(1);
        map.put(PermissionRequester.PERMISSION_RESULT, this.mResult);
        TUICore.notifyEvent(PermissionRequester.PERMISSION_NOTIFY_EVENT_KEY, PermissionRequester.PERMISSION_NOTIFY_EVENT_SUB_KEY, map);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        hidePermissionRationale();
        if (isAllPermissionsGranted(iArr)) {
            finishWithResult(PermissionRequester.Result.Granted);
        } else {
            showSettingsTip();
        }
    }
}
