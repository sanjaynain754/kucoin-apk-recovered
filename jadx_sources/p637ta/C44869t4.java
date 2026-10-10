package p637ta;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.round.widget.RoundTextView;

/* JADX INFO: renamed from: ta.t4 */
/* JADX INFO: compiled from: KucoinFragmentSubscriptDialogBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44869t4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100887a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f100888b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f100889c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ImageView f100890d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f100891e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f100892f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final RoundTextView f100893g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f100894h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f100895i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RoundTextView f100896j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f100897k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f100898l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f100899m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f100900n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f100901o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44869t4 m99262a(@NonNull View view) {
        int i11 = R$id.cl_email;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.cl_sms;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout2 != null) {
                i11 = R$id.iv_cancel;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                if (imageView != null) {
                    i11 = R$id.iv_email_select;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView2 != null) {
                        i11 = R$id.iv_sms_select;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView3 != null) {
                            i11 = R$id.tv_cancel;
                            RoundTextView roundTextView = (RoundTextView) ViewBindings.findChildViewById(view, i11);
                            if (roundTextView != null) {
                                i11 = R$id.tv_email_name;
                                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView != null) {
                                    i11 = R$id.tv_email_value;
                                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView2 != null) {
                                        i11 = R$id.tv_settings;
                                        RoundTextView roundTextView2 = (RoundTextView) ViewBindings.findChildViewById(view, i11);
                                        if (roundTextView2 != null) {
                                            i11 = R$id.tv_sms_name;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tv_sms_value;
                                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView4 != null) {
                                                    i11 = R$id.tv_sub_title;
                                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView5 != null) {
                                                        i11 = R$id.tv_title;
                                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView6 != null) {
                                                            i11 = R$id.tv_to_bind;
                                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView7 != null) {
                                                                return new C44869t4((ConstraintLayout) view, constraintLayout, constraintLayout2, imageView, imageView2, imageView3, roundTextView, baseTextView, baseTextView2, roundTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7);
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
        return this.f100887a;
    }

    public C44869t4(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull RoundTextView roundTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull RoundTextView roundTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7) {
        this.f100887a = constraintLayout;
        this.f100888b = constraintLayout2;
        this.f100889c = constraintLayout3;
        this.f100890d = imageView;
        this.f100891e = imageView2;
        this.f100892f = imageView3;
        this.f100893g = roundTextView;
        this.f100894h = baseTextView;
        this.f100895i = baseTextView2;
        this.f100896j = roundTextView2;
        this.f100897k = baseTextView3;
        this.f100898l = baseTextView4;
        this.f100899m = baseTextView5;
        this.f100900n = baseTextView6;
        this.f100901o = baseTextView7;
    }
}
