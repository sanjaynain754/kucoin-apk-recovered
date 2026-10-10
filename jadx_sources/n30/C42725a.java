package n30;

import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.resources.widget.wheel.view.WheelView;
import com.kubi.tradebase.R$id;

/* JADX INFO: renamed from: n30.a */
/* JADX INFO: compiled from: BkumexSelectTimeOfHistoryPopBinding.java */
/* JADX INFO: loaded from: classes48.dex */
public final class C42725a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f94553a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RadioGroup f94554b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final WheelView f94555c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RadioButton f94556d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final WheelView f94557e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RadioButton f94558f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RadioGroup f94559g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RadioButton f94560h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RadioButton f94561i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RadioButton f94562j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f94563k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final KcPrimaryButton f94564l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final KcSecondaryButton f94565m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f94566n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final View f94567o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final ConstraintLayout f94568p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final WheelView f94569q;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42725a m93621a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.customLayout;
        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i11);
        if (radioGroup != null) {
            i11 = R$id.day;
            WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i11);
            if (wheelView != null) {
                i11 = R$id.end;
                RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                if (radioButton != null) {
                    i11 = R$id.month;
                    WheelView wheelView2 = (WheelView) ViewBindings.findChildViewById(view, i11);
                    if (wheelView2 != null) {
                        i11 = R$id.oneMonth;
                        RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                        if (radioButton2 != null) {
                            i11 = R$id.rangeLayout;
                            RadioGroup radioGroup2 = (RadioGroup) ViewBindings.findChildViewById(view, i11);
                            if (radioGroup2 != null) {
                                i11 = R$id.sevenDay;
                                RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                if (radioButton3 != null) {
                                    i11 = R$id.start;
                                    RadioButton radioButton4 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                    if (radioButton4 != null) {
                                        i11 = R$id.threeMonth;
                                        RadioButton radioButton5 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                        if (radioButton5 != null) {
                                            i11 = R$id.time;
                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView != null) {
                                                i11 = R$id.tv_confirm;
                                                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                                if (kcPrimaryButton != null) {
                                                    i11 = R$id.tv_reset;
                                                    KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                                                    if (kcSecondaryButton != null) {
                                                        i11 = R$id.tvScopeDesc;
                                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_shadow))) != null) {
                                                            i11 = R$id.wheelLayout;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                            if (constraintLayout != null) {
                                                                i11 = R$id.year;
                                                                WheelView wheelView3 = (WheelView) ViewBindings.findChildViewById(view, i11);
                                                                if (wheelView3 != null) {
                                                                    return new C42725a((LinearLayoutCompat) view, radioGroup, wheelView, radioButton, wheelView2, radioButton2, radioGroup2, radioButton3, radioButton4, radioButton5, baseTextView, kcPrimaryButton, kcSecondaryButton, baseTextView2, viewFindChildViewById, constraintLayout, wheelView3);
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
    public LinearLayoutCompat getRoot() {
        return this.f94553a;
    }

    public C42725a(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RadioGroup radioGroup, @NonNull WheelView wheelView, @NonNull RadioButton radioButton, @NonNull WheelView wheelView2, @NonNull RadioButton radioButton2, @NonNull RadioGroup radioGroup2, @NonNull RadioButton radioButton3, @NonNull RadioButton radioButton4, @NonNull RadioButton radioButton5, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull BaseTextView baseTextView2, @NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull WheelView wheelView3) {
        this.f94553a = linearLayoutCompat;
        this.f94554b = radioGroup;
        this.f94555c = wheelView;
        this.f94556d = radioButton;
        this.f94557e = wheelView2;
        this.f94558f = radioButton2;
        this.f94559g = radioGroup2;
        this.f94560h = radioButton3;
        this.f94561i = radioButton4;
        this.f94562j = radioButton5;
        this.f94563k = baseTextView;
        this.f94564l = kcPrimaryButton;
        this.f94565m = kcSecondaryButton;
        this.f94566n = baseTextView2;
        this.f94567o = view;
        this.f94568p = constraintLayout;
        this.f94569q = wheelView3;
    }
}
