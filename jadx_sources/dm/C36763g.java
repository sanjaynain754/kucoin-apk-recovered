package dm;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: dm.g */
/* JADX INFO: compiled from: BkumexDialogAirdropRuleBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36763g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f80066a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80067b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f80068c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f80069d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f80070e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f80071f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcSecondaryButton f80072g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f80073h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f80074i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f80075j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f80076k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f80077l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f80078m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f80079n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f80080o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f80081p;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36763g m82379a(@NonNull View view) {
        int i11 = R$id.amount;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.currency;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.ivClose;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.ll_contract_name;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout != null) {
                        i11 = R$id.tvActiveTime;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.tvIKnow;
                            KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                            if (kcSecondaryButton != null) {
                                i11 = R$id.tvMaxWithdrawAmount;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tvMinPnlAmount;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.tvMinTradeAmount;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.tvSupContract;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                i11 = R$id.tvSupLever;
                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView8 != null) {
                                                    i11 = R$id.tvSupModel;
                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView9 != null) {
                                                        i11 = R$id.tvSupTime;
                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView10 != null) {
                                                            i11 = R$id.tvUseTime;
                                                            BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView11 != null) {
                                                                i11 = R$id.withdrawRules;
                                                                BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView12 != null) {
                                                                    return new C36763g((LinearLayout) view, baseTextView, baseTextView2, imageView, linearLayout, baseTextView3, kcSecondaryButton, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12);
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
        return this.f80066a;
    }

    public C36763g(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull BaseTextView baseTextView3, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12) {
        this.f80066a = linearLayout;
        this.f80067b = baseTextView;
        this.f80068c = baseTextView2;
        this.f80069d = imageView;
        this.f80070e = linearLayout2;
        this.f80071f = baseTextView3;
        this.f80072g = kcSecondaryButton;
        this.f80073h = baseTextView4;
        this.f80074i = baseTextView5;
        this.f80075j = baseTextView6;
        this.f80076k = baseTextView7;
        this.f80077l = baseTextView8;
        this.f80078m = baseTextView9;
        this.f80079n = baseTextView10;
        this.f80080o = baseTextView11;
        this.f80081p = baseTextView12;
    }
}
