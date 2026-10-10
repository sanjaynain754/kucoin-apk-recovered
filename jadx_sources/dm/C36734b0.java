package dm;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: dm.b0 */
/* JADX INFO: compiled from: BkumexDialogFuturesReplaceTrialBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36734b0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f79717a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f79718b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f79719c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f79720d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f79721e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f79722f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f79723g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f79724h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KcSecondaryButton f79725i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final KcPrimaryButton f79726j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f79727k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f79728l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36734b0 m82318a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.amountLabel;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.amountValue;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.expireLabel;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.expireValue;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line1))) != null) {
                        i11 = R$id.statusLabel;
                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView5 != null) {
                            i11 = R$id.statusValue;
                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView6 != null) {
                                i11 = R$id.tv_cancel;
                                KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                                if (kcSecondaryButton != null) {
                                    i11 = R$id.tv_replace;
                                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                    if (kcPrimaryButton != null) {
                                        i11 = R$id.withdrawLabel;
                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView7 != null) {
                                            i11 = R$id.withdrawValue;
                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView8 != null) {
                                                return new C36734b0((LinearLayoutCompat) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, viewFindChildViewById, baseTextView5, baseTextView6, kcSecondaryButton, kcPrimaryButton, baseTextView7, baseTextView8);
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
        return this.f79717a;
    }

    public C36734b0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull View view, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8) {
        this.f79717a = linearLayoutCompat;
        this.f79718b = baseTextView;
        this.f79719c = baseTextView2;
        this.f79720d = baseTextView3;
        this.f79721e = baseTextView4;
        this.f79722f = view;
        this.f79723g = baseTextView5;
        this.f79724h = baseTextView6;
        this.f79725i = kcSecondaryButton;
        this.f79726j = kcPrimaryButton;
        this.f79727k = baseTextView7;
        this.f79728l = baseTextView8;
    }
}
