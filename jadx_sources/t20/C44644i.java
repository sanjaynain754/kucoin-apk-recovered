package t20;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.i */
/* JADX INFO: compiled from: BkucoinFragmentMarketPairsBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44644i implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99109a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f99110b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f99111c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f99112d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99113e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99114f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99115g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99116h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99117i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99118j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99119k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f99120l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f99121m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f99122n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f99123o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f99124p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f99125q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f99126r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f99127s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f99128t;

    public C44644i(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull BaseTextView baseTextView15, @NonNull BaseTextView baseTextView16) {
        this.f99109a = linearLayout;
        this.f99110b = constraintLayout;
        this.f99111c = constraintLayout2;
        this.f99112d = constraintLayout3;
        this.f99113e = baseTextView;
        this.f99114f = baseTextView2;
        this.f99115g = baseTextView3;
        this.f99116h = baseTextView4;
        this.f99117i = baseTextView5;
        this.f99118j = baseTextView6;
        this.f99119k = baseTextView7;
        this.f99120l = baseTextView8;
        this.f99121m = baseTextView9;
        this.f99122n = baseTextView10;
        this.f99123o = baseTextView11;
        this.f99124p = baseTextView12;
        this.f99125q = baseTextView13;
        this.f99126r = baseTextView14;
        this.f99127s = baseTextView15;
        this.f99128t = baseTextView16;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44644i m98764a(@NonNull View view) {
        int i11 = R$id.cl_future;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.cl_margin;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout2 != null) {
                i11 = R$id.cl_spot;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout3 != null) {
                    i11 = R$id.tv_future;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_future_chg;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tv_future_lever;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tv_future_price;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.tv_future_symbol;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.tv_margin;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.tv_margin_chg;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                i11 = R$id.tv_margin_lever;
                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView8 != null) {
                                                    i11 = R$id.tv_margin_price;
                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView9 != null) {
                                                        i11 = R$id.tv_margin_symbol;
                                                        BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView10 != null) {
                                                            i11 = R$id.tv_spot;
                                                            BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView11 != null) {
                                                                i11 = R$id.tv_spot_chg;
                                                                BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView12 != null) {
                                                                    i11 = R$id.tv_spot_lever;
                                                                    BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView13 != null) {
                                                                        i11 = R$id.tv_spot_margin;
                                                                        BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView14 != null) {
                                                                            i11 = R$id.tv_spot_price;
                                                                            BaseTextView baseTextView15 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView15 != null) {
                                                                                i11 = R$id.tv_spot_symbol;
                                                                                BaseTextView baseTextView16 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView16 != null) {
                                                                                    return new C44644i((LinearLayout) view, constraintLayout, constraintLayout2, constraintLayout3, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14, baseTextView15, baseTextView16);
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
        return this.f99109a;
    }
}
