package ai.advance.sdk.global.iqa;

import ai.advance.core.PermissionActivity;
import ai.advance.sdk.global.iqa.lib.IQAExtras;
import ai.advance.sdk.global.iqa.lib.IQAPageState;
import ai.advance.sdk.global.iqa.lib.UIExtras;
import ai.advance.sdk.global.iqa.lib.code.ErrorCode;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import java.io.Serializable;
import p387k.C40828c;
import p387k.C40834i;
import p611s.C44203a;
import p611s.C44206b;

/* JADX INFO: renamed from: ai.advance.sdk.global.iqa.d */
/* JADX INFO: loaded from: classes23.dex */
abstract class AbstractActivityC0347d extends PermissionActivity {

    /* JADX INFO: renamed from: i */
    public IQAPageState f973i;

    /* JADX INFO: renamed from: j */
    public AlertDialog f974j;

    /* JADX INFO: renamed from: k */
    public AlertDialog f975k;

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.d$a */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            AbstractActivityC0347d.this.finish();
        }
    }

    /* JADX INFO: renamed from: ai.advance.sdk.global.iqa.d$b */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            AbstractActivityC0347d.this.finish();
        }
    }

    /* JADX INFO: renamed from: O */
    public abstract void mo1266O();

    @Override // android.app.Activity
    public void finish() {
        setResult(-1);
        super.finish();
    }

    @Override // ai.advance.core.PermissionActivity
    /* JADX INFO: renamed from: H */
    public String[] mo813H() {
        return new String[]{"android.permission.CAMERA"};
    }

    @Override // ai.advance.core.PermissionActivity
    /* JADX INFO: renamed from: J */
    public void mo815J() {
        C44203a.m97442o(ErrorCode.CAMERA_PERMISSION_DENIED);
        int i11 = R$string.iqa_no_camera_permission;
        C44203a.m97444q(getString(i11));
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setMessage(getString(i11)).setPositiveButton(getString(R$string.iqa_confirm), new b()).setCancelable(false).create();
        this.f974j = alertDialogCreate;
        alertDialogCreate.show();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: L */
    public void m1318L(Bundle bundle) {
        if (bundle != null) {
            this.f973i = (IQAPageState) bundle.getParcelable("instance_page_state");
        }
        if (this.f973i == null) {
            this.f973i = new IQAPageState();
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("uiExtras");
        if (serializableExtra != null) {
            UIExtras uIExtras = (UIExtras) serializableExtra;
            this.f973i.setUIExtras(uIExtras);
            Integer screenOrientation = uIExtras.getScreenOrientation();
            if (screenOrientation != null) {
                setRequestedOrientation(screenOrientation.intValue());
            }
        }
        CharSequence charSequenceExtra = getIntent().getCharSequenceExtra("spannableTextAboveCamera");
        if (charSequenceExtra != null) {
            IQAPageState iQAPageState = this.f973i;
            if (iQAPageState.uiExtras == null) {
                iQAPageState.setUIExtras(new UIExtras.C0355a().m1393a());
            }
            this.f973i.uiExtras.setSpannableTextAboveCamera(charSequenceExtra);
        }
        CharSequence charSequenceExtra2 = getIntent().getCharSequenceExtra("spannableTipTextOfTakePhoto");
        if (charSequenceExtra2 != null) {
            IQAPageState iQAPageState2 = this.f973i;
            if (iQAPageState2.uiExtras == null) {
                iQAPageState2.setUIExtras(new UIExtras.C0355a().m1393a());
            }
            this.f973i.uiExtras.setSpannableTipTextOfTakePhoto(charSequenceExtra2);
        }
        CharSequence charSequenceExtra3 = getIntent().getCharSequenceExtra("spannablePreviewTipOfTakePhoto");
        if (charSequenceExtra3 != null) {
            IQAPageState iQAPageState3 = this.f973i;
            if (iQAPageState3.uiExtras == null) {
                iQAPageState3.setUIExtras(new UIExtras.C0355a().m1393a());
            }
            this.f973i.uiExtras.setSpannablePreviewTipOfTakePhoto(charSequenceExtra3);
        }
        IQAExtras iQAExtras = (IQAExtras) getIntent().getSerializableExtra("iqaExtras");
        if (iQAExtras == null) {
            throw new NullPointerException("IQAExtras can't be null");
        }
        this.f973i.setIQAExtras(iQAExtras);
        this.f973i.setScreenOrientation(mo1265M());
        this.f973i.setCameraAngle(C40828c.m89331e(C44206b.m97446f(), this));
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    /* JADX INFO: renamed from: N */
    public void m1319N() {
        setRequestedOrientation(14);
    }

    /* JADX INFO: renamed from: P */
    public void m1320P() {
        UIExtras uIExtras;
        IQAPageState iQAPageState = this.f973i;
        if (iQAPageState == null || (uIExtras = iQAPageState.uiExtras) == null || uIExtras.getScreenOrientation() == null) {
            setRequestedOrientation(10);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AlertDialog alertDialog = this.f974j;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f974j.dismiss();
        }
        AlertDialog alertDialog2 = this.f975k;
        if (alertDialog2 != null && alertDialog2.isShowing()) {
            this.f975k.dismiss();
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("instance_page_state", this.f973i);
        super.onSaveInstanceState(bundle);
    }

    @Override // ai.advance.core.PermissionActivity
    /* JADX INFO: renamed from: I */
    public void mo814I() {
        if (C44206b.m97449i()) {
            mo1266O();
            return;
        }
        C44203a.m97442o(ErrorCode.DEVICE_NOT_SUPPORT);
        int i11 = R$string.device_not_support;
        C44203a.m97444q(getString(i11));
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setMessage(getString(i11)).setPositiveButton(getString(R$string.iqa_confirm), new a()).setCancelable(false).create();
        this.f975k = alertDialogCreate;
        alertDialogCreate.show();
    }

    @Override // ai.advance.core.PermissionActivity
    /* JADX INFO: renamed from: K */
    public void mo1255K() {
        if (m1254G()) {
            mo814I();
        } else {
            ActivityCompat.requestPermissions(this, mo813H(), 199);
        }
    }

    /* JADX INFO: renamed from: M */
    public int mo1265M() {
        int requestedOrientation = getRequestedOrientation();
        if (requestedOrientation != 0 && requestedOrientation != 1) {
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            if (defaultDisplay.getWidth() < defaultDisplay.getHeight()) {
                return 1;
            }
            return 0;
        }
        return requestedOrientation;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        getWindow().addFlags(128);
        m1320P();
        super.onCreate(bundle);
        C40834i.m89366a(this);
        m1318L(bundle);
    }

    @Override // ai.advance.core.PermissionActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) throws Throwable {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 199) {
            if (m1254G()) {
                mo814I();
            } else if (strArr.length > 0) {
                mo815J();
            }
        }
    }
}
