package p270ft;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.p2p.widget.PaymentMethodTextView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.o3 */
/* JADX INFO: compiled from: PaymentViewPaymentMethodBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37665o3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84367a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f84368b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f84369c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f84370d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84371e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84372f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84373g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final PaymentMethodTextView f84374h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f84375i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f84376j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37665o3 m84915a(@NonNull View view) {
        int i11 = R$id.iv_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.iv_selected;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.ll_end;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.tv_description;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_limited;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tv_name;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null) {
                                i11 = R$id.tv_name_color;
                                PaymentMethodTextView paymentMethodTextView = (PaymentMethodTextView) ViewBindings.findChildViewById(view, i11);
                                if (paymentMethodTextView != null) {
                                    i11 = R$id.tv_price;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        i11 = R$id.tv_tag;
                                        BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView5 != null) {
                                            return new C37665o3((ConstraintLayout) view, imageView, appCompatImageView, linearLayout, baseTextView, baseTextView2, baseTextView3, paymentMethodTextView, baseTextView4, baseTextView5);
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
        return this.f84367a;
    }

    public C37665o3(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull PaymentMethodTextView paymentMethodTextView, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f84367a = constraintLayout;
        this.f84368b = imageView;
        this.f84369c = appCompatImageView;
        this.f84370d = linearLayout;
        this.f84371e = baseTextView;
        this.f84372f = baseTextView2;
        this.f84373g = baseTextView3;
        this.f84374h = paymentMethodTextView;
        this.f84375i = baseTextView4;
        this.f84376j = baseTextView5;
    }
}
