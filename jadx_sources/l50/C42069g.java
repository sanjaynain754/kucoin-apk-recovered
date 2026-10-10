package l50;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.g */
/* JADX INFO: compiled from: BtradingBotKitDialogCloseConfirmBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42069g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ScrollView f92736a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f92737b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f92738c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final Group f92739d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f92740e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f92741f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RadioGroup f92742g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RadioButton f92743h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RadioButton f92744i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RadioButton f92745j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RelativeLayout f92746k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final RelativeLayout f92747l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final RelativeLayout f92748m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f92749n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final AppCompatTextView f92750o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final TextView f92751p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final TextView f92752q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final TextView f92753r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final TextView f92754s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final TextView f92755t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final TextView f92756u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final TextView f92757v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final TextView f92758w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final View f92759x;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42069g m92289a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.bt_close_robot;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
        if (textView != null) {
            i11 = R$id.cl_loading_content;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout != null) {
                i11 = R$id.group_coupons;
                Group group = (Group) ViewBindings.findChildViewById(view, i11);
                if (group != null) {
                    i11 = R$id.iv_close;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.iv_strategy_coupons;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            i11 = R$id.radio_group_return_method;
                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i11);
                            if (radioGroup != null) {
                                i11 = R$id.rb_convert_to_base;
                                RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                if (radioButton != null) {
                                    i11 = R$id.rb_convert_to_quota;
                                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                    if (radioButton2 != null) {
                                        i11 = R$id.rb_return_the_same_way;
                                        RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                        if (radioButton3 != null) {
                                            i11 = R$id.rl_convert_to_base;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                                            if (relativeLayout != null) {
                                                i11 = R$id.rl_convert_to_quota;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                                                if (relativeLayout2 != null) {
                                                    i11 = R$id.rl_return_the_same_way;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i11);
                                                    if (relativeLayout3 != null) {
                                                        i11 = R$id.tv_close_hint;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                        if (textView2 != null) {
                                                            i11 = R$id.tv_close_robot_title;
                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (appCompatTextView != null) {
                                                                i11 = R$id.tv_convert_to_base;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                if (textView3 != null) {
                                                                    i11 = R$id.tv_convert_to_base_hint;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (textView4 != null) {
                                                                        i11 = R$id.tv_convert_to_quota;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (textView5 != null) {
                                                                            i11 = R$id.tv_convert_to_quota_hint;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (textView6 != null) {
                                                                                i11 = R$id.tv_coupons_tip;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (textView7 != null) {
                                                                                    i11 = R$id.tv_refund_reminder;
                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (textView8 != null) {
                                                                                        i11 = R$id.tv_return_the_same_way;
                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (textView9 != null) {
                                                                                            i11 = R$id.tv_return_the_same_way_hint;
                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (textView10 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_divider))) != null) {
                                                                                                return new C42069g((ScrollView) view, textView, constraintLayout, group, appCompatImageView, imageView, radioGroup, radioButton, radioButton2, radioButton3, relativeLayout, relativeLayout2, relativeLayout3, textView2, appCompatTextView, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, viewFindChildViewById);
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
    public ScrollView getRoot() {
        return this.f92736a;
    }

    public C42069g(@NonNull ScrollView scrollView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull AppCompatImageView appCompatImageView, @NonNull ImageView imageView, @NonNull RadioGroup radioGroup, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull RadioButton radioButton3, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView2, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull View view) {
        this.f92736a = scrollView;
        this.f92737b = textView;
        this.f92738c = constraintLayout;
        this.f92739d = group;
        this.f92740e = appCompatImageView;
        this.f92741f = imageView;
        this.f92742g = radioGroup;
        this.f92743h = radioButton;
        this.f92744i = radioButton2;
        this.f92745j = radioButton3;
        this.f92746k = relativeLayout;
        this.f92747l = relativeLayout2;
        this.f92748m = relativeLayout3;
        this.f92749n = textView2;
        this.f92750o = appCompatTextView;
        this.f92751p = textView3;
        this.f92752q = textView4;
        this.f92753r = textView5;
        this.f92754s = textView6;
        this.f92755t = textView7;
        this.f92756u = textView8;
        this.f92757v = textView9;
        this.f92758w = textView10;
        this.f92759x = view;
    }
}
