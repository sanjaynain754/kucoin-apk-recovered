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

/* JADX INFO: renamed from: ta.d0 */
/* JADX INFO: compiled from: AssetDialogHoldEarnOpenSuccBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44745d0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99719a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f99720b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f99721c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final AppCompatImageView f99722d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f99723e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99724f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99725g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44745d0 m99002a(@NonNull View view) {
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
                                return new C44745d0((LinearLayout) view, kcPrimaryButton, linearLayout, appCompatImageView, appCompatImageView2, baseTextView, baseTextView2);
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
        return this.f99719a;
    }

    public C44745d0(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull LinearLayout linearLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f99719a = linearLayout;
        this.f99720b = kcPrimaryButton;
        this.f99721c = linearLayout2;
        this.f99722d = appCompatImageView;
        this.f99723e = appCompatImageView2;
        this.f99724f = baseTextView;
        this.f99725g = baseTextView2;
    }
}
