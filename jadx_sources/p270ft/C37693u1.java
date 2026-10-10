package p270ft;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.p2p.widget.P2PViewChatCardEntrance;
import com.kubi.payment.widget.StepsLayout;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: ft.u1 */
/* JADX INFO: compiled from: PaymentFragmentP2pOrderTransferBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37693u1 implements ViewBinding {

    /* JADX INFO: renamed from: A */
    @NonNull
    public final BaseTextView f84701A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public final BaseTextView f84702B;

    /* JADX INFO: renamed from: C */
    @NonNull
    public final View f84703C;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84704a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f84705b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final Group f84706c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f84707d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f84708e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f84709f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f84710g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final StepsLayout f84711h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final KcPrimaryButton f84712i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84713j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f84714k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f84715l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f84716m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f84717n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f84718o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f84719p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f84720q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f84721r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f84722s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f84723t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f84724u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final BaseTextView f84725v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f84726w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final View f84727x;

    /* JADX INFO: renamed from: y */
    @NonNull
    public final P2PViewChatCardEntrance f84728y;

    /* JADX INFO: renamed from: z */
    @NonNull
    public final LinearLayout f84729z;

    public C37693u1(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull Group group, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull LinearLayout linearLayout, @NonNull StepsLayout stepsLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull BaseTextView baseTextView14, @NonNull View view2, @NonNull P2PViewChatCardEntrance p2PViewChatCardEntrance, @NonNull LinearLayout linearLayout2, @NonNull BaseTextView baseTextView15, @NonNull BaseTextView baseTextView16, @NonNull View view3) {
        this.f84704a = constraintLayout;
        this.f84705b = view;
        this.f84706c = group;
        this.f84707d = imageView;
        this.f84708e = appCompatImageView;
        this.f84709f = appCompatImageView2;
        this.f84710g = linearLayout;
        this.f84711h = stepsLayout;
        this.f84712i = kcPrimaryButton;
        this.f84713j = baseTextView;
        this.f84714k = baseTextView2;
        this.f84715l = baseTextView3;
        this.f84716m = baseTextView4;
        this.f84717n = baseTextView5;
        this.f84718o = baseTextView6;
        this.f84719p = baseTextView7;
        this.f84720q = baseTextView8;
        this.f84721r = baseTextView9;
        this.f84722s = baseTextView10;
        this.f84723t = baseTextView11;
        this.f84724u = baseTextView12;
        this.f84725v = baseTextView13;
        this.f84726w = baseTextView14;
        this.f84727x = view2;
        this.f84728y = p2PViewChatCardEntrance;
        this.f84729z = linearLayout2;
        this.f84701A = baseTextView15;
        this.f84702B = baseTextView16;
        this.f84703C = view3;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37693u1 m84977a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.divider;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById3 != null) {
            i11 = R$id.group_p2p_express;
            Group group = (Group) ViewBindings.findChildViewById(view, i11);
            if (group != null) {
                i11 = R$id.iv_back;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.iv_question;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.iv_step_1;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.layout_pay_info;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                            if (linearLayout != null) {
                                i11 = R$id.steps_layout;
                                StepsLayout stepsLayout = (StepsLayout) ViewBindings.findChildViewById(view, i11);
                                if (stepsLayout != null) {
                                    i11 = R$id.tv_confirm_pay_money;
                                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                    if (kcPrimaryButton != null) {
                                        i11 = R$id.tv_kyc_name;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.tv_kyc_name_value;
                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView2 != null) {
                                                i11 = R$id.tv_make_payment_tip;
                                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView3 != null) {
                                                    i11 = R$id.tv_order_cancel;
                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView4 != null) {
                                                        i11 = R$id.tv_pay_amount;
                                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView5 != null) {
                                                            i11 = R$id.tv_pay_info_tip;
                                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView6 != null) {
                                                                i11 = R$id.tv_pay_info_tip_content;
                                                                BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView7 != null) {
                                                                    i11 = R$id.tv_step_1;
                                                                    BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView8 != null) {
                                                                        i11 = R$id.tv_step_1_value;
                                                                        BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView9 != null) {
                                                                            i11 = R$id.tv_step_2;
                                                                            BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView10 != null) {
                                                                                i11 = R$id.tv_step_2_value;
                                                                                BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView11 != null) {
                                                                                    i11 = R$id.tv_step_one_title;
                                                                                    BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (baseTextView12 != null) {
                                                                                        i11 = R$id.tv_sub_title;
                                                                                        BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView13 != null) {
                                                                                            i11 = R$id.tv_title;
                                                                                            BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (baseTextView14 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_bar))) != null) {
                                                                                                i11 = R$id.viewChatCard;
                                                                                                P2PViewChatCardEntrance p2PViewChatCardEntrance = (P2PViewChatCardEntrance) ViewBindings.findChildViewById(view, i11);
                                                                                                if (p2PViewChatCardEntrance != null) {
                                                                                                    i11 = R$id.view_pay_info;
                                                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                                                                    if (linearLayout2 != null) {
                                                                                                        i11 = R$id.view_tip_first;
                                                                                                        BaseTextView baseTextView15 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                        if (baseTextView15 != null) {
                                                                                                            i11 = R$id.view_tip_second;
                                                                                                            BaseTextView baseTextView16 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                                            if (baseTextView16 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.view_vertical_line_first))) != null) {
                                                                                                                return new C37693u1((ConstraintLayout) view, viewFindChildViewById3, group, imageView, appCompatImageView, appCompatImageView2, linearLayout, stepsLayout, kcPrimaryButton, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11, baseTextView12, baseTextView13, baseTextView14, viewFindChildViewById, p2PViewChatCardEntrance, linearLayout2, baseTextView15, baseTextView16, viewFindChildViewById2);
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
        return this.f84704a;
    }
}
