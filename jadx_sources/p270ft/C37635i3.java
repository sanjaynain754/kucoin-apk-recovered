package p270ft;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.payment.fasttrade.widget.FastTradeTextView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.i3 */
/* JADX INFO: compiled from: PaymentViewFastInputBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37635i3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final View f84040a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f84041b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f84042c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f84043d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FastTradeTextView f84044e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84045f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f84046g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37635i3 m84853a(@NonNull View view) {
        int i11 = R$id.ivArrowDown;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.layoutCurrency;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.layoutInput;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.tvAmount;
                    FastTradeTextView fastTradeTextView = (FastTradeTextView) ViewBindings.findChildViewById(view, i11);
                    if (fastTradeTextView != null) {
                        i11 = R$id.tvCurrency;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tvSwitch;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                return new C37635i3(view, appCompatImageView, linearLayoutCompat, constraintLayout, fastTradeTextView, baseTextView, baseTextView2);
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
    public View getRoot() {
        return this.f84040a;
    }

    public C37635i3(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ConstraintLayout constraintLayout, @NonNull FastTradeTextView fastTradeTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f84040a = view;
        this.f84041b = appCompatImageView;
        this.f84042c = linearLayoutCompat;
        this.f84043d = constraintLayout;
        this.f84044e = fastTradeTextView;
        this.f84045f = baseTextView;
        this.f84046g = baseTextView2;
    }
}
