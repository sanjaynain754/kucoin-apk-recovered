package c70;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.m */
/* JADX INFO: compiled from: BusercenterFragmentResetPwdBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4883m implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f5196a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f5197b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcTextInputLayout f5198c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final FrameLayout f5199d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcPrimaryButton f5200e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f5201f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcTextInputLayout f5202g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final FrameLayout f5203h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f5204i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f5205j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f5206k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final LinearLayout f5207l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4883m m5045a(@NonNull View view) {
        int i11 = R$id.confirm_pwd_clear;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.confirm_pwd_input;
            KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
            if (kcTextInputLayout != null) {
                i11 = R$id.confirm_pwd_layout;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                if (frameLayout != null) {
                    i11 = R$id.confirm_reset;
                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcPrimaryButton != null) {
                        i11 = R$id.new_pwd_clear;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView2 != null) {
                            i11 = R$id.new_pwd_input;
                            KcTextInputLayout kcTextInputLayout2 = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
                            if (kcTextInputLayout2 != null) {
                                i11 = R$id.new_pwd_layout;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                if (frameLayout2 != null) {
                                    i11 = R$id.new_pwd_rule1;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.new_pwd_rule2;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.new_pwd_rule3;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.pwd_rule_layout;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                if (linearLayout != null) {
                                                    return new C4883m((LinearLayoutCompat) view, imageView, kcTextInputLayout, frameLayout, kcPrimaryButton, imageView2, kcTextInputLayout2, frameLayout2, baseTextView, baseTextView2, baseTextView3, linearLayout);
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
    public LinearLayoutCompat getRoot() {
        return this.f5196a;
    }

    public C4883m(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ImageView imageView, @NonNull KcTextInputLayout kcTextInputLayout, @NonNull FrameLayout frameLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull ImageView imageView2, @NonNull KcTextInputLayout kcTextInputLayout2, @NonNull FrameLayout frameLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull LinearLayout linearLayout) {
        this.f5196a = linearLayoutCompat;
        this.f5197b = imageView;
        this.f5198c = kcTextInputLayout;
        this.f5199d = frameLayout;
        this.f5200e = kcPrimaryButton;
        this.f5201f = imageView2;
        this.f5202g = kcTextInputLayout2;
        this.f5203h = frameLayout2;
        this.f5204i = baseTextView;
        this.f5205j = baseTextView2;
        this.f5206k = baseTextView3;
        this.f5207l = linearLayout;
    }
}
