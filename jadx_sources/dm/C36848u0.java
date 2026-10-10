package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FixAutoSizeTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.u0 */
/* JADX INFO: compiled from: BkumexDialogPositionRealisedPnlDetailsBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36848u0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f81098a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f81099b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FixAutoSizeTextView f81100c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f81101d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FixAutoSizeTextView f81102e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final NestedScrollView f81103f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f81104g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81105h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81106i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81107j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f81108k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f81109l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final FixAutoSizeTextView f81110m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f81111n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final FixAutoSizeTextView f81112o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final KcPrimaryButton f81113p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f81114q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final FixAutoSizeTextView f81115r;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36848u0 m82561a(@NonNull View view) {
        int i11 = R$id.closePnlTv;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.closePnlValueTv;
            FixAutoSizeTextView fixAutoSizeTextView = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
            if (fixAutoSizeTextView != null) {
                i11 = R$id.foundFeeTv;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.foundFeeValueTv;
                    FixAutoSizeTextView fixAutoSizeTextView2 = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                    if (fixAutoSizeTextView2 != null) {
                        i11 = R$id.nestedScrollView;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                        if (nestedScrollView != null) {
                            i11 = R$id.pnlDetailsCl;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout != null) {
                                i11 = R$id.realisedDesc;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.realisedLabel;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        i11 = R$id.realisedTitleTv;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null) {
                                            i11 = R$id.realisedValue;
                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView6 != null) {
                                                i11 = R$id.taxTv;
                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView7 != null) {
                                                    i11 = R$id.taxValueTv;
                                                    FixAutoSizeTextView fixAutoSizeTextView3 = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (fixAutoSizeTextView3 != null) {
                                                        i11 = R$id.tradeFeeTv;
                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView8 != null) {
                                                            i11 = R$id.tradeFeeValueTv;
                                                            FixAutoSizeTextView fixAutoSizeTextView4 = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (fixAutoSizeTextView4 != null) {
                                                                i11 = R$id.tv_ok;
                                                                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                                if (kcPrimaryButton != null) {
                                                                    i11 = R$id.withdrawTv;
                                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView9 != null) {
                                                                        i11 = R$id.withdrawValueTv;
                                                                        FixAutoSizeTextView fixAutoSizeTextView5 = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (fixAutoSizeTextView5 != null) {
                                                                            return new C36848u0((LinearLayout) view, baseTextView, fixAutoSizeTextView, baseTextView2, fixAutoSizeTextView2, nestedScrollView, constraintLayout, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, fixAutoSizeTextView3, baseTextView8, fixAutoSizeTextView4, kcPrimaryButton, baseTextView9, fixAutoSizeTextView5);
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
        return this.f81098a;
    }

    public C36848u0(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull FixAutoSizeTextView fixAutoSizeTextView, @NonNull BaseTextView baseTextView2, @NonNull FixAutoSizeTextView fixAutoSizeTextView2, @NonNull NestedScrollView nestedScrollView, @NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull FixAutoSizeTextView fixAutoSizeTextView3, @NonNull BaseTextView baseTextView8, @NonNull FixAutoSizeTextView fixAutoSizeTextView4, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView9, @NonNull FixAutoSizeTextView fixAutoSizeTextView5) {
        this.f81098a = linearLayout;
        this.f81099b = baseTextView;
        this.f81100c = fixAutoSizeTextView;
        this.f81101d = baseTextView2;
        this.f81102e = fixAutoSizeTextView2;
        this.f81103f = nestedScrollView;
        this.f81104g = constraintLayout;
        this.f81105h = baseTextView3;
        this.f81106i = baseTextView4;
        this.f81107j = baseTextView5;
        this.f81108k = baseTextView6;
        this.f81109l = baseTextView7;
        this.f81110m = fixAutoSizeTextView3;
        this.f81111n = baseTextView8;
        this.f81112o = fixAutoSizeTextView4;
        this.f81113p = kcPrimaryButton;
        this.f81114q = baseTextView9;
        this.f81115r = fixAutoSizeTextView5;
    }
}
