package dm;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.flexbox.FlexboxLayout;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTradeRateView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: dm.e */
/* JADX INFO: compiled from: BkumexDialogAirdropPnlBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36751e implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f79922a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f79923b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f79924c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f79925d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f79926e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f79927f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f79928g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f79929h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f79930i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f79931j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f79932k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final FlexboxLayout f79933l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ImageView f79934m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f79935n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f79936o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final KcTradeRateView f79937p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f79938q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f79939r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final KcSecondaryButton f79940s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final KcPrimaryButton f79941t;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36751e m82353a(@NonNull View view) {
        int i11 = R$id.airdropMargin;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.airdropMarginValue;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.airdropPnl;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.airdropPnlRate;
                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView4 != null) {
                        i11 = R$id.airdropPnlRateValue;
                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView5 != null) {
                            i11 = R$id.airdropPnlValue;
                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView6 != null) {
                                i11 = R$id.airdropTime;
                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView7 != null) {
                                    i11 = R$id.airdropTimeValue;
                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView8 != null) {
                                        i11 = R$id.airdropWithDrawAmount;
                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView9 != null) {
                                            i11 = R$id.airdropWithDrawAmountValue;
                                            BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView10 != null) {
                                                i11 = R$id.flow;
                                                FlexboxLayout flexboxLayout = (FlexboxLayout) ViewBindings.findChildViewById(view, i11);
                                                if (flexboxLayout != null) {
                                                    i11 = R$id.ivClose;
                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                                    if (imageView != null) {
                                                        i11 = R$id.leverage;
                                                        BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView11 != null) {
                                                            i11 = R$id.marginMode;
                                                            BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView12 != null) {
                                                                i11 = R$id.side;
                                                                KcTradeRateView kcTradeRateView = (KcTradeRateView) ViewBindings.findChildViewById(view, i11);
                                                                if (kcTradeRateView != null) {
                                                                    i11 = R$id.trialTag;
                                                                    BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView13 != null) {
                                                                        i11 = R$id.tvContract;
                                                                        BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView14 != null) {
                                                                            i11 = R$id.tv_left_btn;
                                                                            KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                                                                            if (kcSecondaryButton != null) {
                                                                                i11 = R$id.tv_right_btn;
                                                                                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                                if (kcPrimaryButton != null) {
                                                                                    return new C36751e((LinearLayout) view, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, flexboxLayout, imageView, baseTextView11, baseTextView12, kcTradeRateView, baseTextView13, baseTextView14, kcSecondaryButton, kcPrimaryButton);
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
        return this.f79922a;
    }

    public C36751e(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull FlexboxLayout flexboxLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull KcTradeRateView kcTradeRateView, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull KcPrimaryButton kcPrimaryButton) {
        this.f79922a = linearLayout;
        this.f79923b = baseTextView;
        this.f79924c = baseTextView2;
        this.f79925d = baseTextView3;
        this.f79926e = baseTextView4;
        this.f79927f = baseTextView5;
        this.f79928g = baseTextView6;
        this.f79929h = baseTextView7;
        this.f79930i = baseTextView8;
        this.f79931j = baseTextView9;
        this.f79932k = baseTextView10;
        this.f79933l = flexboxLayout;
        this.f79934m = imageView;
        this.f79935n = baseTextView11;
        this.f79936o = baseTextView12;
        this.f79937p = kcTradeRateView;
        this.f79938q = baseTextView13;
        this.f79939r = baseTextView14;
        this.f79940s = kcSecondaryButton;
        this.f79941t = kcPrimaryButton;
    }
}
