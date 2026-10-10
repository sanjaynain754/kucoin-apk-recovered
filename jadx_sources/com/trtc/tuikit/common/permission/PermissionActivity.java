package com.trtc.tuikit.common.permission;

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
import com.trtc.tuikit.common.R$id;
import com.trtc.tuikit.common.R$layout;
import dh0.C36686b;
import java.util.HashMap;
import org.aspectj.lang.InterfaceC43175a;
import org.aspectj.runtime.internal.C43179b;
import p514ou.C43330a;
import qc0.C43708a;
import uc0.C45153b;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 23)
public class PermissionActivity extends Activity {

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC43175a.a f77454g;

    /* JADX INFO: renamed from: b */
    public TextView f77455b;

    /* JADX INFO: renamed from: c */
    public TextView f77456c;

    /* JADX INFO: renamed from: d */
    public ImageView f77457d;

    /* JADX INFO: renamed from: e */
    public PermissionRequester.RequestData f77458e;

    /* JADX INFO: renamed from: f */
    public PermissionRequester.Result f77459f = PermissionRequester.Result.Denied;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m79361a(Dialog dialog, DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        if (i11 == 4 && keyEvent.getAction() == 1) {
            dialog.dismiss();
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m79369i(@NonNull int[] iArr) {
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

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m79364d() {
        C36686b c36686b = new C36686b("PermissionActivity.java", PermissionActivity.class);
        f77454g = c36686b.m82128h("method-call", c36686b.m82127g("11", "requestPermissions", "com.trtc.tuikit.common.permission.PermissionActivity", "[Ljava.lang.String;:int", "permissions:requestCode", "", "void"), 73);
    }

    /* JADX INFO: renamed from: e */
    public final void m79365e(PermissionRequester.Result result) {
        Log.i("PermissionActivity", "finishWithResult : " + result);
        this.f77459f = result;
        finish();
    }

    /* JADX INFO: renamed from: g */
    public final void m79367g() {
        this.f77455b.setVisibility(4);
        this.f77456c.setVisibility(4);
        this.f77457d.setVisibility(4);
    }

    /* JADX INFO: renamed from: h */
    public final void m79368h() {
        setContentView(R$layout.common_permission_activity_layout);
        this.f77455b = (TextView) findViewById(R$id.permission_reason_title);
        this.f77456c = (TextView) findViewById(R$id.permission_reason);
        this.f77457d = (ImageView) findViewById(R$id.permission_icon);
    }

    /* JADX INFO: renamed from: j */
    public final void m79370j() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + getPackageName()));
        intent.addFlags(268435456);
        if (getPackageManager().queryIntentActivities(intent, 65536).size() <= 0) {
            Log.e("PermissionActivity", "launchAppDetailsSettings can not find system settings");
        } else {
            startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m79372l() {
        PermissionRequester.RequestData requestData = this.f77458e;
        if (requestData == null) {
            return;
        }
        this.f77455b.setText(requestData.getTitle());
        this.f77456c.setText(this.f77458e.getDescription());
        this.f77457d.setBackgroundResource(this.f77458e.getPermissionIconId());
        this.f77455b.setVisibility(0);
        this.f77456c.setVisibility(0);
        this.f77457d.setVisibility(0);
    }

    /* JADX INFO: renamed from: m */
    public final void m79373m() {
        if (this.f77458e == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(this).inflate(R$layout.common_permission_tip_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tips);
        TextView textView2 = (TextView) viewInflate.findViewById(R$id.positive_btn);
        TextView textView3 = (TextView) viewInflate.findViewById(R$id.negative_btn);
        textView.setText(this.f77458e.getSettingsTip());
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setView(viewInflate).setCancelable(false).create();
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.tuikit.common.permission.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionActivity.m79363c(this.f77471b, alertDialogCreate, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.trtc.tuikit.common.permission.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionActivity.m79362b(this.f77473b, alertDialogCreate, view);
            }
        });
        alertDialogCreate.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.trtc.tuikit.common.permission.c
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
                return PermissionActivity.m79361a(alertDialogCreate, dialogInterface, i11, keyEvent);
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

    static {
        m79364d();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m79362b(PermissionActivity permissionActivity, Dialog dialog, View view) {
        permissionActivity.getClass();
        dialog.dismiss();
        permissionActivity.m79365e(PermissionRequester.Result.Denied);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m79363c(PermissionActivity permissionActivity, Dialog dialog, View view) {
        permissionActivity.getClass();
        dialog.dismiss();
        permissionActivity.m79370j();
        permissionActivity.m79365e(PermissionRequester.Result.Requesting);
    }

    /* JADX INFO: renamed from: f */
    public final PermissionRequester.RequestData m79366f() {
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        return (PermissionRequester.RequestData) intent.getParcelableExtra(com.tencent.qcloud.tuicore.permission.PermissionRequester.PERMISSION_REQUEST_KEY);
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: k */
    public final void m79371k() {
        if (C45153b.m99803c() >= 21) {
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
    public void onCreate(@Nullable Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        PermissionRequester.RequestData requestDataM79366f = m79366f();
        this.f77458e = requestDataM79366f;
        if (requestDataM79366f != null && !requestDataM79366f.isPermissionsExistEmpty()) {
            Log.i("PermissionActivity", "onCreate : " + this.f77458e.toString());
            if (C45153b.m99803c() < 23) {
                m79365e(PermissionRequester.Result.Granted);
                return;
            }
            m79371k();
            m79368h();
            m79372l();
            String[] permissions = this.f77458e.getPermissions();
            C43330a.m95368b().m95371e(C36686b.m82124d(f77454g, this, this, permissions, C43179b.m94790c(100)));
            requestPermissions(permissions, 100);
            return;
        }
        Log.e("PermissionActivity", "onCreate mRequestData exist empty permission");
        m79365e(PermissionRequester.Result.Denied);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HashMap map = new HashMap(1);
        map.put(com.tencent.qcloud.tuicore.permission.PermissionRequester.PERMISSION_RESULT, this.f77459f);
        C43708a.m96263a().m96264b(com.tencent.qcloud.tuicore.permission.PermissionRequester.PERMISSION_NOTIFY_EVENT_KEY, com.tencent.qcloud.tuicore.permission.PermissionRequester.PERMISSION_NOTIFY_EVENT_SUB_KEY, map);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        m79367g();
        if (m79369i(iArr)) {
            m79365e(PermissionRequester.Result.Granted);
        } else {
            m79373m();
        }
    }
}
