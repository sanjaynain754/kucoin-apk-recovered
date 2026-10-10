package gq;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.mine.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.VerticalDashedLineView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: gq.l */
/* JADX INFO: compiled from: KucoinFragmentJoinBetaBinding.java */
/* JADX INFO: loaded from: classes29.dex */
public final class C37991l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f85496a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f85497b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f85498c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f85499d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f85500e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final VerticalDashedLineView f85501f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f85502g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatTextView f85503h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KcPrimaryButton f85504i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f85505j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f85506k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37991l m85857a(@NonNull View view) {
        int i11 = R$id.downloadGpButton;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.downloadGpDesc;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.downloadGpStep;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.downloadGpStepDone;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.downloadUpdateLine;
                        VerticalDashedLineView verticalDashedLineView = (VerticalDashedLineView) ViewBindings.findChildViewById(view, i11);
                        if (verticalDashedLineView != null) {
                            i11 = R$id.testLogo;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView != null) {
                                i11 = R$id.testTitle;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatTextView != null) {
                                    i11 = R$id.updateKuCoinButton;
                                    KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                    if (kcPrimaryButton2 != null) {
                                        i11 = R$id.updateKuCoinDesc;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.updateKuCoinStep;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                return new C37991l((LinearLayout) view, kcPrimaryButton, baseTextView, baseTextView2, baseTextView3, verticalDashedLineView, appCompatImageView, appCompatTextView, kcPrimaryButton2, baseTextView4, baseTextView5);
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
    public LinearLayout getRoot() {
        return this.f85496a;
    }

    public C37991l(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull VerticalDashedLineView verticalDashedLineView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f85496a = linearLayout;
        this.f85497b = kcPrimaryButton;
        this.f85498c = baseTextView;
        this.f85499d = baseTextView2;
        this.f85500e = baseTextView3;
        this.f85501f = verticalDashedLineView;
        this.f85502g = appCompatImageView;
        this.f85503h = appCompatTextView;
        this.f85504i = kcPrimaryButton2;
        this.f85505j = baseTextView4;
        this.f85506k = baseTextView5;
    }
}
