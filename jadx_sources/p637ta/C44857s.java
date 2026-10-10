package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.round.widget.RoundImageView;

/* JADX INFO: renamed from: ta.s */
/* JADX INFO: compiled from: AssetDialogAutoEarnOpenConfirmBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44857s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100754a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f100755b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f100756c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f100757d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RoundImageView f100758e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f100759f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100760g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100761h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f100762i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44857s m99238a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.alert_dialog_root;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
        if (linearLayoutCompat != null) {
            i11 = R$id.btnOpen;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.iv_close;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.rivTopImage;
                    RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(view, i11);
                    if (roundImageView != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        i11 = R$id.tvProtocol;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tvTitle;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_spacingHeight))) != null) {
                                return new C44857s(constraintLayout, linearLayoutCompat, kcPrimaryButton, imageView, roundImageView, constraintLayout, baseTextView, baseTextView2, viewFindChildViewById);
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
        return this.f100754a;
    }

    public C44857s(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView, @NonNull RoundImageView roundImageView, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull View view) {
        this.f100754a = constraintLayout;
        this.f100755b = linearLayoutCompat;
        this.f100756c = kcPrimaryButton;
        this.f100757d = imageView;
        this.f100758e = roundImageView;
        this.f100759f = constraintLayout2;
        this.f100760g = baseTextView;
        this.f100761h = baseTextView2;
        this.f100762i = view;
    }
}
