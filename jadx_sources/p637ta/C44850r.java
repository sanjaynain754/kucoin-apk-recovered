package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KuCheckBox;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.r */
/* JADX INFO: compiled from: AssetDialogAutoEarnOpenBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44850r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100700a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f100701b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KuCheckBox f100702c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f100703d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f100704e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f100705f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100706g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100707h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100708i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44850r m99225a(@NonNull View view) {
        int i11 = R$id.btnOpen;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.cbAgree;
            KuCheckBox kuCheckBox = (KuCheckBox) ViewBindings.findChildViewById(view, i11);
            if (kuCheckBox != null) {
                i11 = R$id.contentContainer;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.ivClose;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.ivTop;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.tvDesc;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tvProtocol;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tvTitle;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        return new C44850r((LinearLayout) view, kcPrimaryButton, kuCheckBox, linearLayout, appCompatImageView, appCompatImageView2, baseTextView, baseTextView2, baseTextView3);
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
    public LinearLayout getRoot() {
        return this.f100700a;
    }

    public C44850r(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KuCheckBox kuCheckBox, @NonNull LinearLayout linearLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3) {
        this.f100700a = linearLayout;
        this.f100701b = kcPrimaryButton;
        this.f100702c = kuCheckBox;
        this.f100703d = linearLayout2;
        this.f100704e = appCompatImageView;
        this.f100705f = appCompatImageView2;
        this.f100706g = baseTextView;
        this.f100707h = baseTextView2;
        this.f100708i = baseTextView3;
    }
}
