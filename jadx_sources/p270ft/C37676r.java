package p270ft;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.r */
/* JADX INFO: compiled from: BotcFragmentFiatRechargeAdvcashConfirmBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37676r implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84470a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f84471b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84472c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84473d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84474e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84475f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84476g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f84477h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84478i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84479j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f84480k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f84481l;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37676r m84940a(@NonNull View view) {
        int i11 = R$id.iv_pay_pic;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tv_content_1;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv_content_2;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tv_continue;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.tv_pay_fee;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            i11 = R$id.tv_pay_fee_tip;
                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView5 != null) {
                                i11 = R$id.tv_pay_name;
                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView6 != null) {
                                    i11 = R$id.tv_payment_tip;
                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView7 != null) {
                                        i11 = R$id.tv_point_1;
                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView8 != null) {
                                            i11 = R$id.tv_point_2;
                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView9 != null) {
                                                i11 = R$id.tv_recharge_amount;
                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView10 != null) {
                                                    return new C37676r((ConstraintLayout) view, imageView, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10);
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
        return this.f84470a;
    }

    public C37676r(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10) {
        this.f84470a = constraintLayout;
        this.f84471b = imageView;
        this.f84472c = baseTextView;
        this.f84473d = baseTextView2;
        this.f84474e = baseTextView3;
        this.f84475f = baseTextView4;
        this.f84476g = baseTextView5;
        this.f84477h = baseTextView6;
        this.f84478i = baseTextView7;
        this.f84479j = baseTextView8;
        this.f84480k = baseTextView9;
        this.f84481l = baseTextView10;
    }
}
