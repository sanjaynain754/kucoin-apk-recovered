package p205dn;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kyc.R$id;
import com.kubi.kyc.ui.kycv2.camera.ClipOutPathView;

/* JADX INFO: renamed from: dn.b */
/* JADX INFO: compiled from: BusercenterActivityKycCameraBinding.java */
/* JADX INFO: loaded from: classes21.dex */
public final class C36882b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81424a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f81425b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ClipOutPathView f81426c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f81427d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final PreviewView f81428e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RelativeLayout f81429f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f81430g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatImageView f81431h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36882b m82633a(@NonNull View view) {
        int i11 = R$id.cameraShutter;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.clipView;
            ClipOutPathView clipOutPathView = (ClipOutPathView) ViewBindings.findChildViewById(view, i11);
            if (clipOutPathView != null) {
                i11 = R$id.ivBack;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.previewView;
                    PreviewView previewView = (PreviewView) ViewBindings.findChildViewById(view, i11);
                    if (previewView != null) {
                        i11 = R$id.f31061rl;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                        if (relativeLayout != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.switchLens;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView2 != null) {
                                return new C36882b(constraintLayout, appCompatImageView, clipOutPathView, imageView, previewView, relativeLayout, constraintLayout, appCompatImageView2);
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
        return this.f81424a;
    }

    public C36882b(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull ClipOutPathView clipOutPathView, @NonNull ImageView imageView, @NonNull PreviewView previewView, @NonNull RelativeLayout relativeLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatImageView appCompatImageView2) {
        this.f81424a = constraintLayout;
        this.f81425b = appCompatImageView;
        this.f81426c = clipOutPathView;
        this.f81427d = imageView;
        this.f81428e = previewView;
        this.f81429f = relativeLayout;
        this.f81430g = constraintLayout2;
        this.f81431h = appCompatImageView2;
    }
}
