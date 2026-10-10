package p270ft;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.z */
/* JADX INFO: compiled from: BotcFragmentFiatWithdrawStatusBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37713z implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84951a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f84952b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f84953c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84954d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84955e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84956f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84957g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84958h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84959i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37713z m85011a(@NonNull View view) {
        int i11 = R$id.ic_service;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_status;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView2 != null) {
                i11 = R$id.tv_action_one;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_action_two;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tv_amount;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.tv_status;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.tv_status_des;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.tv_status_fail_des;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        return new C37713z((ConstraintLayout) view, imageView, imageView2, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6);
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
        return this.f84951a;
    }

    public C37713z(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f84951a = constraintLayout;
        this.f84952b = imageView;
        this.f84953c = imageView2;
        this.f84954d = baseTextView;
        this.f84955e = baseTextView2;
        this.f84956f = baseTextView3;
        this.f84957g = baseTextView4;
        this.f84958h = baseTextView5;
        this.f84959i = baseTextView6;
    }
}
