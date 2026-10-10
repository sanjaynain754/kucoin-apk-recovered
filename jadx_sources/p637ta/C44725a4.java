package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.AlertTipsTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.a4 */
/* JADX INFO: compiled from: FragmentWithdrawUniAddrAddBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44725a4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99568a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f99569b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C44758e5 f99570c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AlertTipsTextView f99571d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44725a4 m98960a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.btn_next;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.inputLayout))) != null) {
            C44758e5 c44758e5M99030a = C44758e5.m99030a(viewFindChildViewById);
            int i12 = R$id.tv_tip;
            AlertTipsTextView alertTipsTextView = (AlertTipsTextView) ViewBindings.findChildViewById(view, i12);
            if (alertTipsTextView != null) {
                return new C44725a4((ConstraintLayout) view, kcPrimaryButton, c44758e5M99030a, alertTipsTextView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f99568a;
    }

    public C44725a4(@NonNull ConstraintLayout constraintLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull C44758e5 c44758e5, @NonNull AlertTipsTextView alertTipsTextView) {
        this.f99568a = constraintLayout;
        this.f99569b = kcPrimaryButton;
        this.f99570c = c44758e5;
        this.f99571d = alertTipsTextView;
    }
}
