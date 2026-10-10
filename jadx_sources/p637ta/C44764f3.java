package p637ta;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.button.KcSecondaryButton;

/* JADX INFO: renamed from: ta.f3 */
/* JADX INFO: compiled from: DepositRiskAccountDialogBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44764f3 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99900a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f99901b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99902c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99903d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final KcPrimaryButton f99904e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final KcSecondaryButton f99905f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f99906g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99907h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99908i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RecyclerView f99909j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99910k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44764f3 m99043a(@NonNull View view) {
        int i11 = R$id.address_content;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.address_sub_title;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.address_title;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.bt_agree;
                    KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                    if (kcPrimaryButton != null) {
                        i11 = R$id.bt_cancel;
                        KcSecondaryButton kcSecondaryButton = (KcSecondaryButton) ViewBindings.findChildViewById(view, i11);
                        if (kcSecondaryButton != null) {
                            i11 = R$id.iv_exit;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView != null) {
                                i11 = R$id.memo_content;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.memo_title;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.risk_recyclerView;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                        if (recyclerView != null) {
                                            i11 = R$id.risk_title;
                                            BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView6 != null) {
                                                return new C44764f3((LinearLayout) view, baseTextView, baseTextView2, baseTextView3, kcPrimaryButton, kcSecondaryButton, imageView, baseTextView4, baseTextView5, recyclerView, baseTextView6);
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
        return this.f99900a;
    }

    public C44764f3(@NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcSecondaryButton kcSecondaryButton, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView6) {
        this.f99900a = linearLayout;
        this.f99901b = baseTextView;
        this.f99902c = baseTextView2;
        this.f99903d = baseTextView3;
        this.f99904e = kcPrimaryButton;
        this.f99905f = kcSecondaryButton;
        this.f99906g = imageView;
        this.f99907h = baseTextView4;
        this.f99908i = baseTextView5;
        this.f99909j = recyclerView;
        this.f99910k = baseTextView6;
    }
}
