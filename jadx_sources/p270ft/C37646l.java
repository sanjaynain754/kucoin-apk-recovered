package p270ft;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;

/* JADX INFO: renamed from: ft.l */
/* JADX INFO: compiled from: BotcFragmentFastP2pConfirmBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37646l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84178a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Group f84179b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Group f84180c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f84181d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f84182e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84183f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84184g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final DashTextView f84185h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84186i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84187j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f84188k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f84189l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f84190m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f84191n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f84192o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f84193p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f84194q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f84195r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f84196s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final ConstraintLayout f84197t;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37646l m84875a(@NonNull View view) {
        int i11 = R$id.group_fee_info;
        Group group = (Group) ViewBindings.findChildViewById(view, i11);
        if (group != null) {
            i11 = R$id.group_tax_info;
            Group group2 = (Group) ViewBindings.findChildViewById(view, i11);
            if (group2 != null) {
                i11 = R$id.iv_fee_question;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.iv_method_otc_icon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView2 != null) {
                        i11 = R$id.tv_buy_fiat_tip;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_confirm;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tv_dash_p2p_tip;
                                DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                if (dashTextView != null) {
                                    i11 = R$id.tv_fee;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tv_fee_tip;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tv_funds;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tv_method;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    i11 = R$id.tv_method_tip;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        i11 = R$id.tv_price;
                                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView8 != null) {
                                                            i11 = R$id.tv_price_label;
                                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView9 != null) {
                                                                i11 = R$id.tv_tax;
                                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView10 != null) {
                                                                    i11 = R$id.tv_tax_tip;
                                                                    BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView11 != null) {
                                                                        i11 = R$id.tv_total;
                                                                        BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView12 != null) {
                                                                            i11 = R$id.tv_total_tip;
                                                                            BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView13 != null) {
                                                                                i11 = R$id.view_p2p_tip;
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                                                if (constraintLayout != null) {
                                                                                    return new C37646l((ConstraintLayout) view, group, group2, imageView, imageView2, baseTextView, baseTextView2, dashTextView, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, constraintLayout);
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
    public ConstraintLayout getRoot() {
        return this.f84178a;
    }

    public C37646l(@NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull Group group2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull ConstraintLayout constraintLayout2) {
        this.f84178a = constraintLayout;
        this.f84179b = group;
        this.f84180c = group2;
        this.f84181d = imageView;
        this.f84182e = imageView2;
        this.f84183f = baseTextView;
        this.f84184g = baseTextView2;
        this.f84185h = dashTextView;
        this.f84186i = baseTextView3;
        this.f84187j = baseTextView4;
        this.f84188k = baseTextView5;
        this.f84189l = baseTextView6;
        this.f84190m = baseTextView7;
        this.f84191n = baseTextView8;
        this.f84192o = baseTextView9;
        this.f84193p = baseTextView10;
        this.f84194q = baseTextView11;
        this.f84195r = baseTextView12;
        this.f84196s = baseTextView13;
        this.f84197t = constraintLayout2;
    }
}
