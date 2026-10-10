package p637ta;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.u2 */
/* JADX INFO: compiled from: AssetViewWithdrawFeeBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44874u2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f100931a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Flow f100932b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayout f100933c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f100934d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f100935e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f100936f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100937g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100938h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100939i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f100940j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100941k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f100942l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44874u2 m99272a(@NonNull View view) {
        int i11 = R$id.flow;
        Flow flow = (Flow) ViewBindings.findChildViewById(view, i11);
        if (flow != null) {
            i11 = R$id.llNormalFee;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
            if (linearLayout != null) {
                i11 = R$id.llVipFee;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.tvFee;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_fee_title;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tvFiatCurrency;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tvNormalFee;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tvVipFee;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.tvVipFeeTitle;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.tvVipFeeUnit;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                i11 = R$id.tvVipFiatCurrency;
                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView8 != null) {
                                                    return new C44874u2((LinearLayoutCompat) view, flow, linearLayout, constraintLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8);
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
    public LinearLayoutCompat getRoot() {
        return this.f100931a;
    }

    public C44874u2(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull Flow flow, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8) {
        this.f100931a = linearLayoutCompat;
        this.f100932b = flow;
        this.f100933c = linearLayout;
        this.f100934d = constraintLayout;
        this.f100935e = baseTextView;
        this.f100936f = baseTextView2;
        this.f100937g = baseTextView3;
        this.f100938h = baseTextView4;
        this.f100939i = baseTextView5;
        this.f100940j = baseTextView6;
        this.f100941k = baseTextView7;
        this.f100942l = baseTextView8;
    }
}
