package p205dn;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;
import com.kubi.kyc.ui.CameraPreview;
import com.kubi.kyc.ui.CameraTopRectView;

/* JADX INFO: renamed from: dn.c */
/* JADX INFO: compiled from: BusercenterActivityOcrCameraBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36883c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81432a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Button f81433b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f81434c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CameraPreview f81435d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f81436e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f81437f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f81438g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f81439h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RelativeLayout f81440i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ConstraintLayout f81441j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ImageView f81442k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final CameraTopRectView f81443l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f81444m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36883c m82635a(@NonNull View view) {
        int i11 = R$id.btnConfirmUpload;
        Button button = (Button) ViewBindings.findChildViewById(view, i11);
        if (button != null) {
            i11 = R$id.btn_take;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.camera_preview;
                CameraPreview cameraPreview = (CameraPreview) ViewBindings.findChildViewById(view, i11);
                if (cameraPreview != null) {
                    i11 = R$id.flTakePicZone;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.ivBack;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView2 != null) {
                            i11 = R$id.ivSwitch;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView3 != null) {
                                i11 = R$id.llShowPicZone;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout != null) {
                                    i11 = R$id.f31061rl;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                                    if (relativeLayout != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i11 = R$id.thumbnailView;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                        if (imageView4 != null) {
                                            i11 = R$id.topRectView;
                                            CameraTopRectView cameraTopRectView = (CameraTopRectView) ViewBindings.findChildViewById(view, i11);
                                            if (cameraTopRectView != null) {
                                                i11 = R$id.tvRetry;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView != null) {
                                                    return new C36883c(constraintLayout, button, imageView, cameraPreview, frameLayout, imageView2, imageView3, linearLayout, relativeLayout, constraintLayout, imageView4, cameraTopRectView, textView);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f81432a;
    }

    public C36883c(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull CameraPreview cameraPreview, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView4, @NonNull CameraTopRectView cameraTopRectView, @NonNull TextView textView) {
        this.f81432a = constraintLayout;
        this.f81433b = button;
        this.f81434c = imageView;
        this.f81435d = cameraPreview;
        this.f81436e = frameLayout;
        this.f81437f = imageView2;
        this.f81438g = imageView3;
        this.f81439h = linearLayout;
        this.f81440i = relativeLayout;
        this.f81441j = constraintLayout2;
        this.f81442k = imageView4;
        this.f81443l = cameraTopRectView;
        this.f81444m = textView;
    }
}
