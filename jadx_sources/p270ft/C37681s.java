package p270ft;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.otc.R$id;
import com.kubi.otc.view.FiatEditTextView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ft.s */
/* JADX INFO: compiled from: BotcFragmentFiatRechargeAdvcashInputBinding.java */
/* JADX INFO: loaded from: classes33.dex */
public final class C37681s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f84605a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ImageView f84606b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f84607c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f84608d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f84609e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f84610f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FiatEditTextView f84611g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37681s m84951a(@NonNull View view) {
        int i11 = R$id.iv_pay_pic;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
        if (imageView != null) {
            i11 = R$id.tv_deposit;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv_limit_tip;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tv_pay_method_tip;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.tv_pay_name;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            i11 = R$id.view_input_amount;
                            FiatEditTextView fiatEditTextView = (FiatEditTextView) ViewBindings.findChildViewById(view, i11);
                            if (fiatEditTextView != null) {
                                return new C37681s((ConstraintLayout) view, imageView, baseTextView, baseTextView2, baseTextView3, baseTextView4, fiatEditTextView);
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
        return this.f84605a;
    }

    public C37681s(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull FiatEditTextView fiatEditTextView) {
        this.f84605a = constraintLayout;
        this.f84606b = imageView;
        this.f84607c = baseTextView;
        this.f84608d = baseTextView2;
        this.f84609e = baseTextView3;
        this.f84610f = baseTextView4;
        this.f84611g = fiatEditTextView;
    }
}
