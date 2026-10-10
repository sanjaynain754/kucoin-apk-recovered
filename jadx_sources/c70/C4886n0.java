package c70;

import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.n0 */
/* JADX INFO: compiled from: BusercenterViewDeleteAccountBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4886n0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f5221a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f5222b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CheckBox f5223c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f5224d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f5225e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f5226f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f5227g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f5228h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f5229i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f5230j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f5231k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f5232l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4886n0 m5051a(@NonNull View view) {
        int i11 = R$id.btn_apply;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.check_read_agree;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
            if (checkBox != null) {
                i11 = R$id.llDeleteAccountAfter1;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.llDeleteAccountAfter2;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout2 != null) {
                        i11 = R$id.llDeleteAccountAfter3;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout3 != null) {
                            i11 = R$id.llDeleteAccountAfter4;
                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout4 != null) {
                                i11 = R$id.llDeleteAccountAfter5;
                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout5 != null) {
                                    i11 = R$id.ll_delete_account_tip;
                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout6 != null) {
                                        i11 = R$id.tv_delete_account_privacy;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.tv_delete_account_warning;
                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView2 != null) {
                                                i11 = R$id.tv_nickname;
                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView3 != null) {
                                                    return new C4886n0((ConstraintLayout) view, kcPrimaryButton, checkBox, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, baseTextView, baseTextView2, baseTextView3);
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
        return this.f5221a;
    }

    public C4886n0(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull CheckBox checkBox, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f5221a = constraintLayout;
        this.f5222b = kcPrimaryButton;
        this.f5223c = checkBox;
        this.f5224d = linearLayout;
        this.f5225e = linearLayout2;
        this.f5226f = linearLayout3;
        this.f5227g = linearLayout4;
        this.f5228h = linearLayout5;
        this.f5229i = linearLayout6;
        this.f5230j = baseTextView;
        this.f5231k = baseTextView2;
        this.f5232l = baseTextView3;
    }
}
