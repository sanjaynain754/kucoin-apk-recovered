package c70;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.KcTextInputLayout;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.R$id;

/* JADX INFO: renamed from: c70.z */
/* JADX INFO: compiled from: BusercenterLayoutExternalAccountCreateConfirmBinding.java */
/* JADX INFO: loaded from: classes53.dex */
public final class C4904z implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final NestedScrollView f5385a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C4868e0 f5386b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C4872g0 f5387c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f5388d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final CheckBox f5389e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final CheckBox f5390f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final KcTextInputLayout f5391g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final ImageView f5392h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f5393i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f5394j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final NestedScrollView f5395k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final LinearLayout f5396l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final TextView f5397m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final TextView f5398n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f5399o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f5400p;

    public C4904z(@NonNull NestedScrollView nestedScrollView, @NonNull C4868e0 c4868e0, @NonNull C4872g0 c4872g0, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull CheckBox checkBox, @NonNull CheckBox checkBox2, @NonNull KcTextInputLayout kcTextInputLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull NestedScrollView nestedScrollView2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f5385a = nestedScrollView;
        this.f5386b = c4868e0;
        this.f5387c = c4872g0;
        this.f5388d = kcPrimaryButton;
        this.f5389e = checkBox;
        this.f5390f = checkBox2;
        this.f5391g = kcTextInputLayout;
        this.f5392h = imageView;
        this.f5393i = linearLayout;
        this.f5394j = linearLayout2;
        this.f5395k = nestedScrollView2;
        this.f5396l = linearLayout3;
        this.f5397m = textView;
        this.f5398n = textView2;
        this.f5399o = baseTextView;
        this.f5400p = baseTextView2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4904z m5087a(@NonNull View view) {
        int i11 = R$id.bindingEmail;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C4868e0 c4868e0M5014a = C4868e0.m5014a(viewFindChildViewById);
            i11 = R$id.bindingPhone;
            View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i11);
            if (viewFindChildViewById2 != null) {
                C4872g0 c4872g0M5022a = C4872g0.m5022a(viewFindChildViewById2);
                i11 = R$id.btnConfirm;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null) {
                    i11 = R$id.cbExtAccountMarketingPolicy;
                    CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, i11);
                    if (checkBox != null) {
                        i11 = R$id.cbExtAccountPrivacyPolicy;
                        CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, i11);
                        if (checkBox2 != null) {
                            i11 = R$id.inputRcode;
                            KcTextInputLayout kcTextInputLayout = (KcTextInputLayout) ViewBindings.findChildViewById(view, i11);
                            if (kcTextInputLayout != null) {
                                i11 = R$id.ivReferArrow;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                if (imageView != null) {
                                    i11 = R$id.layoutProtocol;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                    if (linearLayout != null) {
                                        i11 = R$id.layoutRefer;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayout2 != null) {
                                            NestedScrollView nestedScrollView = (NestedScrollView) view;
                                            i11 = R$id.llExtAccountMarketingPolicy;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                            if (linearLayout3 != null) {
                                                i11 = R$id.tvCreateTips;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                                if (textView != null) {
                                                    i11 = R$id.tvDiscount;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                                    if (textView2 != null) {
                                                        i11 = R$id.tvExtAccountMarketingPolicy;
                                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView != null) {
                                                            i11 = R$id.tvExtAccountPrivacyPolicy;
                                                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView2 != null) {
                                                                return new C4904z(nestedScrollView, c4868e0M5014a, c4872g0M5022a, kcPrimaryButton, checkBox, checkBox2, kcTextInputLayout, imageView, linearLayout, linearLayout2, nestedScrollView, linearLayout3, textView, textView2, baseTextView, baseTextView2);
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
    public NestedScrollView getRoot() {
        return this.f5385a;
    }
}
