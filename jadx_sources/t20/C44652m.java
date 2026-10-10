package t20;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.m */
/* JADX INFO: compiled from: BkucoinFragmentMarketTradeCountDownBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44652m implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99199a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f99200b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ImageView f99201c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99202d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f99203e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcPrimaryButton f99204f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99205g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99206h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99207i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99208j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99209k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f99210l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f99211m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f99212n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final TextView f99213o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final TextView f99214p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final TextView f99215q;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44652m m98780a(@NonNull View view) {
        int i11 = R$id.count_down_coin_des;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.count_down_coin_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
            if (imageView != null) {
                i11 = R$id.count_down_coin_name;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.count_down_coin_time_bt_more;
                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcPrimaryButton != null) {
                        i11 = R$id.count_down_coin_time_d;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.count_down_coin_time_d_unit;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                i11 = R$id.count_down_coin_time_h;
                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView5 != null) {
                                    i11 = R$id.count_down_coin_time_h_unit;
                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView6 != null) {
                                        i11 = R$id.count_down_coin_time_m;
                                        BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView7 != null) {
                                            i11 = R$id.count_down_coin_time_m_unit;
                                            BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView8 != null) {
                                                i11 = R$id.count_down_coin_time_s;
                                                BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView9 != null) {
                                                    i11 = R$id.count_down_coin_time_s_unit;
                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView10 != null) {
                                                        i11 = R$id.separator1;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                                        if (textView != null) {
                                                            i11 = R$id.separator2;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                            if (textView2 != null) {
                                                                i11 = R$id.separator3;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                                if (textView3 != null) {
                                                                    return new C44652m(constraintLayout, baseTextView, imageView, baseTextView2, constraintLayout, kcPrimaryButton, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, textView, textView2, textView3);
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
        return this.f99199a;
    }

    public C44652m(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView2, @NonNull ConstraintLayout constraintLayout2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f99199a = constraintLayout;
        this.f99200b = baseTextView;
        this.f99201c = imageView;
        this.f99202d = baseTextView2;
        this.f99203e = constraintLayout2;
        this.f99204f = kcPrimaryButton;
        this.f99205g = baseTextView3;
        this.f99206h = baseTextView4;
        this.f99207i = baseTextView5;
        this.f99208j = baseTextView6;
        this.f99209k = baseTextView7;
        this.f99210l = baseTextView8;
        this.f99211m = baseTextView9;
        this.f99212n = baseTextView10;
        this.f99213o = textView;
        this.f99214p = textView2;
        this.f99215q = textView3;
    }
}
