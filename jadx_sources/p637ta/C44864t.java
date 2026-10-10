package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ta.t */
/* JADX INFO: compiled from: AssetDialogAutoEarnOpenSuccBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44864t implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f100846a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f100847b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f100848c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f100849d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f100850e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100851f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100852g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44864t m99252a(@NonNull View view) {
        int i11 = R$id.btnOpen;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
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
                            i11 = R$id.tvTitle;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                return new C44864t((LinearLayout) view, kcPrimaryButton, linearLayout, appCompatImageView, appCompatImageView2, baseTextView, baseTextView2);
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
        return this.f100846a;
    }

    public C44864t(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull LinearLayout linearLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f100846a = linearLayout;
        this.f100847b = kcPrimaryButton;
        this.f100848c = linearLayout2;
        this.f100849d = appCompatImageView;
        this.f100850e = appCompatImageView2;
        this.f100851f = baseTextView;
        this.f100852g = baseTextView2;
    }
}
