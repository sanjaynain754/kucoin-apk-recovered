package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.LabelView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.v2 */
/* JADX INFO: compiled from: AssetViewWithdrawNetworkBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44881v2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100993a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f100994b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f100995c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f100996d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100997e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LabelView f100998f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44881v2 m99286a(@NonNull View view) {
        int i11 = R$id.icon_pull_chain;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.ll_pull_chain;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.tvChainName;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tv_pull_chain_title;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tv_suspend;
                        LabelView labelView = (LabelView) ViewBindings.findChildViewById(view, i11);
                        if (labelView != null) {
                            return new C44881v2((ConstraintLayout) view, appCompatImageView, linearLayoutCompat, baseTextView, baseTextView2, labelView);
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
        return this.f100993a;
    }

    public C44881v2(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull LabelView labelView) {
        this.f100993a = constraintLayout;
        this.f100994b = appCompatImageView;
        this.f100995c = linearLayoutCompat;
        this.f100996d = baseTextView;
        this.f100997e = baseTextView2;
        this.f100998f = labelView;
    }
}
