package aai.liveness.activity;

import a3d20260409.C0106s;
import a3d20260409.C0108u;
import aai.liveness.Detector$DetectionFailedType;
import aai.liveness.Detector$DetectionType;
import aai.liveness.Detector$WarnCode;
import aai.liveness.LivenessView;
import aai.liveness.activity.LivenessActivity;
import aai.liveness.http.entity.ResultEntity;
import ai.advance.core.PermissionActivity;
import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import p216e.InterfaceC36994a;
import p216e.InterfaceC36995b;
import p387k.C40835j;
import p579r.C43890a;

/* JADX INFO: loaded from: classes23.dex */
public class LivenessActivity extends PermissionActivity implements InterfaceC36994a {

    /* JADX INFO: renamed from: i */
    public SparseArray<AnimationDrawable> f661i;

    /* JADX INFO: renamed from: j */
    public LivenessView f662j;

    /* JADX INFO: renamed from: k */
    public ImageView f663k;

    /* JADX INFO: renamed from: l */
    public TextView f664l;

    /* JADX INFO: renamed from: m */
    public TextView f665m;

    /* JADX INFO: renamed from: n */
    public CheckBox f666n;

    /* JADX INFO: renamed from: o */
    public View f667o;

    /* JADX INFO: renamed from: p */
    public ProgressDialog f668p;

    /* JADX INFO: renamed from: q */
    public View f669q;

    /* JADX INFO: renamed from: aai.liveness.activity.LivenessActivity$a */
    public class ViewOnClickListenerC0219a implements View.OnClickListener {
        public ViewOnClickListenerC0219a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LivenessActivity.this.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: aai.liveness.activity.LivenessActivity$b */
    public class C0220b implements CompoundButton.OnCheckedChangeListener {
        public C0220b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            LivenessActivity.this.f662j.setSoundPlayEnable(z11);
            if (z11) {
                LivenessActivity.this.m819Y();
            }
        }
    }

    /* JADX INFO: renamed from: aai.liveness.activity.LivenessActivity$c */
    public class DialogInterfaceOnClickListenerC0221c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f672b;

        public DialogInterfaceOnClickListenerC0221c(String str) {
            this.f672b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            C0108u.m511k(this.f672b);
            dialogInterface.dismiss();
            LivenessActivity.this.setResult(-1);
            LivenessActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: aai.liveness.activity.LivenessActivity$d */
    public class C0222d implements InterfaceC36995b {
        public C0222d() {
        }

        @Override // p216e.InterfaceC36995b
        /* JADX INFO: renamed from: a */
        public void mo470a(ResultEntity resultEntity) {
            if (!resultEntity.success && "NO_RESPONSE".equals(resultEntity.code)) {
                C0108u.m511k(LivenessActivity.this.getString(R$string.liveness_failed_reason_bad_network));
            }
            LivenessActivity.this.m820Z();
        }

        @Override // p216e.InterfaceC36995b
        /* JADX INFO: renamed from: b */
        public void mo471b() {
            LivenessActivity.this.f667o.setVisibility(0);
            LivenessActivity.this.f665m.setVisibility(4);
            LivenessActivity.this.f662j.setVisibility(4);
            LivenessActivity.this.f666n.setVisibility(4);
            LivenessActivity.this.f663k.setVisibility(4);
            LivenessActivity.this.f664l.setVisibility(4);
            LivenessActivity.this.f669q.setVisibility(0);
        }

        @Override // p216e.InterfaceC36995b
        /* JADX INFO: renamed from: c */
        public void mo472c(ResultEntity resultEntity, String str) {
            LivenessActivity.this.m820Z();
        }
    }

    /* JADX INFO: renamed from: aai.liveness.activity.LivenessActivity$e */
    public class DialogInterfaceOnClickListenerC0223e implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0223e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            LivenessActivity.this.finish();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m820Z() {
        setResult(-1);
        finish();
    }

    /* JADX INFO: renamed from: aai.liveness.activity.LivenessActivity$f */
    public static /* synthetic */ class C0224f {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f676a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f677b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f678c;

        static {
            int[] iArr = new int[Detector$DetectionFailedType.values().length];
            f678c = iArr;
            try {
                iArr[Detector$DetectionFailedType.FACEMISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f678c[Detector$DetectionFailedType.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f678c[Detector$DetectionFailedType.MULTIPLEFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f678c[Detector$DetectionFailedType.MUCHMOTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f678c[Detector$DetectionFailedType.WEAKLIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f678c[Detector$DetectionFailedType.STRONGLIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Detector$WarnCode.values().length];
            f677b = iArr2;
            try {
                iArr2[Detector$WarnCode.FACEMISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f677b[Detector$WarnCode.FACESMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f677b[Detector$WarnCode.FACELARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f677b[Detector$WarnCode.FACENOTCENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f677b[Detector$WarnCode.FACENOTFRONTAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f677b[Detector$WarnCode.FACENOTSTILL.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f677b[Detector$WarnCode.FACECAPTURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f677b[Detector$WarnCode.WARN_EYE_OCCLUSION.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f677b[Detector$WarnCode.WARN_MOUTH_OCCLUSION.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f677b[Detector$WarnCode.WARN_WEAKLIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f677b[Detector$WarnCode.WARN_TOOLIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f677b[Detector$WarnCode.WARN_FACE_BIAS_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f677b[Detector$WarnCode.WARN_FACE_BIAS_UP.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f677b[Detector$WarnCode.WARN_FACE_BIAS_RIGHT.ordinal()] = 14;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f677b[Detector$WarnCode.WARN_FACE_BIAS_LEFT.ordinal()] = 15;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f677b[Detector$WarnCode.PLEASE_BLINK.ordinal()] = 16;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f677b[Detector$WarnCode.FACEINACTION.ordinal()] = 17;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f677b[Detector$WarnCode.WARN_LARGE_YAW.ordinal()] = 18;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f677b[Detector$WarnCode.WARN_MULTIPLEFACES.ordinal()] = 19;
            } catch (NoSuchFieldError unused25) {
            }
            int[] iArr3 = new int[Detector$DetectionType.values().length];
            f676a = iArr3;
            try {
                iArr3[Detector$DetectionType.POS_YAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f676a[Detector$DetectionType.MOUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f676a[Detector$DetectionType.BLINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
        }
    }

    /* JADX INFO: renamed from: X */
    private void m812X() {
        this.f661i = new SparseArray<>();
        this.f662j.setLivenssCallback(this);
    }

    @Override // ai.advance.core.PermissionActivity
    /* JADX INFO: renamed from: H */
    public String[] mo813H() {
        return new String[]{"android.permission.CAMERA"};
    }

    @Override // ai.advance.core.PermissionActivity
    /* JADX INFO: renamed from: J */
    public void mo815J() {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setMessage(getString(R$string.liveness_no_camera_permission)).setPositiveButton(getString(R$string.liveness_perform), new DialogInterfaceOnClickListenerC0223e()).create();
        if (isFinishing() || isDestroyed()) {
            return;
        }
        alertDialogCreate.show();
    }

    /* JADX INFO: renamed from: U */
    public final void m816U(int i11) {
        this.f664l.setText(i11);
    }

    /* JADX INFO: renamed from: V */
    public void m817V() {
        this.f662j = (LivenessView) findViewById(R$id.liveness_view);
        this.f663k = (ImageView) findViewById(R$id.tip_image_view);
        this.f664l = (TextView) findViewById(R$id.tip_text_view);
        this.f665m = (TextView) findViewById(R$id.timer_text_view_camera_activity);
        this.f667o = findViewById(R$id.progress_layout);
        this.f666n = (CheckBox) findViewById(R$id.voice_check_box);
        View viewFindViewById = findViewById(R$id.back_view_camera_activity);
        this.f669q = findViewById(R$id.text_view_loading);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0219a());
        this.f666n.setChecked(this.f662j.m459l());
        this.f666n.setOnCheckedChangeListener(new C0220b());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    /* JADX INFO: renamed from: W */
    public AnimationDrawable m818W(Detector$DetectionType detector$DetectionType) {
        int i11;
        if (detector$DetectionType == null) {
            i11 = -1;
        } else {
            int i12 = C0224f.f676a[detector$DetectionType.ordinal()];
            if (i12 == 1) {
                i11 = R$drawable.anim_frame_turn_head;
            } else if (i12 == 2) {
                i11 = R$drawable.anim_frame_open_mouse;
            } else if (i12 != 3) {
                i11 = -1;
            } else {
                i11 = R$drawable.anim_frame_blink;
            }
        }
        AnimationDrawable animationDrawable = this.f661i.get(i11);
        if (animationDrawable != null) {
            return animationDrawable;
        }
        AnimationDrawable animationDrawable2 = (AnimationDrawable) getResources().getDrawable(i11);
        this.f661i.put(i11, animationDrawable2);
        return animationDrawable2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    /* JADX INFO: renamed from: Y */
    public final void m819Y() {
        int i11;
        if (this.f666n.getVisibility() != 0) {
            this.f666n.setVisibility(0);
        }
        Detector$DetectionType currentDetectionType = this.f662j.getCurrentDetectionType();
        if (currentDetectionType == null) {
            i11 = -1;
        } else {
            int i12 = C0224f.f676a[currentDetectionType.ordinal()];
            if (i12 == 1) {
                i11 = R$raw.action_turn_head;
            } else if (i12 == 2) {
                i11 = R$raw.action_open_mouth;
            } else if (i12 != 3) {
                i11 = -1;
            } else {
                i11 = R$raw.action_blink;
            }
        }
        this.f662j.m464r(i11, true, 1500L);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m822b0() {
        int i11;
        Detector$DetectionType currentDetectionType = this.f662j.getCurrentDetectionType();
        if (currentDetectionType != null) {
            int i12 = C0224f.f676a[currentDetectionType.ordinal()];
            if (i12 == 1) {
                i11 = R$string.liveness_pos_raw;
            } else if (i12 != 2) {
                i11 = i12 != 3 ? 0 : R$string.liveness_blink;
            } else {
                i11 = R$string.liveness_mouse;
            }
            m816U(i11);
            AnimationDrawable animationDrawableM818W = m818W(currentDetectionType);
            this.f663k.setImageDrawable(animationDrawableM818W);
            animationDrawableM818W.start();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m823c0() {
        this.f662j.setVisibility(0);
        this.f664l.setVisibility(0);
        this.f663k.setVisibility(0);
        this.f665m.setText("");
        this.f665m.setBackgroundResource(0);
        this.f665m.setVisibility(0);
        this.f666n.setVisibility(4);
        this.f663k.setImageDrawable(null);
        this.f667o.setVisibility(4);
        this.f669q.setVisibility(4);
    }

    @Override // p045c.InterfaceC4752b
    /* JADX INFO: renamed from: d */
    public void mo418d(boolean z11, String str, String str2) {
        ProgressDialog progressDialog = this.f668p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (z11) {
            m824d0(null);
            return;
        }
        if ("NO_RESPONSE".equals(str)) {
            str2 = getString(R$string.liveness_failed_reason_auth_failed);
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this).setMessage(str2).setPositiveButton(R$string.liveness_perform, new DialogInterfaceOnClickListenerC0221c(str2)).create();
        if (isFinishing() || isDestroyed()) {
            return;
        }
        alertDialogCreate.show();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m824d0(Detector$WarnCode detector$WarnCode) {
        if (!this.f662j.m460m()) {
            m816U(R$string.liveness_hold_phone_vertical);
            return;
        }
        if (detector$WarnCode != null) {
            switch (C0224f.f677b[detector$WarnCode.ordinal()]) {
                case 1:
                    m816U(R$string.liveness_no_people_face);
                    break;
                case 2:
                    m816U(R$string.liveness_tip_move_closer);
                    break;
                case 3:
                    m816U(R$string.liveness_tip_move_furthre);
                    break;
                case 4:
                    m816U(R$string.liveness_move_face_center);
                    break;
                case 5:
                    m816U(R$string.liveness_frontal);
                    break;
                case 6:
                case 7:
                    m816U(R$string.liveness_still);
                    break;
                case 8:
                    m816U(R$string.liveness_open_eyes);
                    break;
                case 9:
                    m816U(R$string.liveness_face_occ);
                    break;
                case 10:
                    m816U(R$string.liveness_weak_light);
                    break;
                case 11:
                    m816U(R$string.liveness_too_light);
                    break;
                case 12:
                case 13:
                case 14:
                case 15:
                    m816U(R$string.liveness_face_move);
                    break;
                case 16:
                    m816U(R$string.liveness_blink);
                    break;
                case 17:
                    m822b0();
                    break;
                case 18:
                    m816U(R$string.liveness_large_yaw);
                    break;
                case 19:
                    m816U(R$string.liveness_multi_faces);
                    break;
            }
        }
    }

    @Override // p216e.InterfaceC36994a
    /* JADX INFO: renamed from: e */
    public void mo465e() {
        this.f662j.m457j(new C0222d());
    }

    @Override // p045c.InterfaceC4752b
    /* JADX INFO: renamed from: j */
    public void mo428j() {
        ProgressDialog progressDialog = this.f668p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (isFinishing() || isDestroyed()) {
            return;
        }
        ProgressDialog progressDialog2 = new ProgressDialog(this);
        this.f668p = progressDialog2;
        progressDialog2.setMessage(getString(R$string.liveness_auth_check));
        this.f668p.setCanceledOnTouchOutside(false);
        this.f668p.show();
    }

    @Override // p216e.InterfaceC36994a
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: k */
    public void mo467k(long j11) {
        this.f665m.setText(((int) (j11 / 1000)) + CmcdData.Factory.STREAMING_FORMAT_SS);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LivenessView livenessView = this.f662j;
        if (livenessView != null) {
            livenessView.m461n();
        }
        SparseArray<AnimationDrawable> sparseArray = this.f661i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        ProgressDialog progressDialog = this.f668p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f662j.m462p();
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (this.f662j.m458k()) {
            m823c0();
            if (m1254G()) {
                this.f662j.m463q();
            }
        }
        super.onResume();
    }

    @Override // p216e.InterfaceC36994a
    /* JADX INFO: renamed from: y */
    public void mo469y(Detector$DetectionFailedType detector$DetectionFailedType, Detector$DetectionType detector$DetectionType) {
        int[] iArr = C0224f.f678c;
        int i11 = iArr[detector$DetectionFailedType.ordinal()];
        if (i11 == 5) {
            m816U(R$string.liveness_weak_light);
            return;
        }
        if (i11 == 6) {
            m816U(R$string.liveness_too_light);
            return;
        }
        int i12 = iArr[detector$DetectionFailedType.ordinal()];
        String string = null;
        if (i12 == 1) {
            int i13 = C0224f.f676a[detector$DetectionType.ordinal()];
            if (i13 == 1) {
                string = getString(R$string.liveness_failed_reason_facemissing_pos_yaw);
            } else if (i13 == 2 || i13 == 3) {
                string = getString(R$string.liveness_failed_reason_facemissing_blink_mouth);
            }
        } else if (i12 == 2) {
            string = getString(R$string.liveness_failed_reason_timeout);
        } else if (i12 == 3) {
            string = getString(R$string.liveness_failed_reason_multipleface);
        } else if (i12 == 4) {
            string = getString(R$string.liveness_failed_reason_muchaction);
        }
        C0108u.m511k(string);
        m820Z();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ WindowInsetsCompat m803L(View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = systemWindowInsetTop;
        view.setLayoutParams(layoutParams);
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m821a0() {
        getWindow().getDecorView().setSystemUiVisibility(1792);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 34) {
            getWindow().setStatusBarColor(0);
        }
        View viewFindViewById = findViewById(R$id.root_view_camera_activity);
        final View viewFindViewById2 = findViewById(R$id.status_bar_view_camera_activity);
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new OnApplyWindowInsetsListener() { // from class: d.a
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return LivenessActivity.m803L(viewFindViewById2, view, windowInsetsCompat);
            }
        });
        int systemUiVisibility = viewFindViewById.getSystemUiVisibility();
        int i12 = systemUiVisibility | 8192;
        if (i11 >= 26) {
            i12 = systemUiVisibility | 8208;
        }
        viewFindViewById.setSystemUiVisibility(i12);
    }

    @Override // p216e.InterfaceC36994a
    /* JADX INFO: renamed from: h */
    public void mo466h(Detector$WarnCode detector$WarnCode) {
        m824d0(detector$WarnCode);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (C43890a.m96661b() == null) {
            finish();
            return;
        }
        setContentView(R$layout.activity_liveness);
        C40835j.m89367a(this, 255);
        m817V();
        m812X();
        m821a0();
        if (C0106s.m492r() && !m1254G()) {
            mo1255K();
        }
    }

    @Override // p216e.InterfaceC36994a
    /* JADX INFO: renamed from: r */
    public void mo468r() {
        m819Y();
        m822b0();
        this.f665m.setBackgroundResource(R$drawable.liveness_shape_right_timer);
    }

    @Override // ai.advance.core.PermissionActivity
    /* JADX INFO: renamed from: I */
    public void mo814I() {
    }
}
