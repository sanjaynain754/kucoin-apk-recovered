package dm;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.s */
/* JADX INFO: compiled from: BkumexDialogFutureBonusDistributionBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36835s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80998a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f80999b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81000c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f81001d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81002e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f81003f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ImageView f81004g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f81005h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f81006i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f81007j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f81008k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f81009l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f81010m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final ImageView f81011n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final AppCompatImageView f81012o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final View f81013p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final LinearLayout f81014q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final BaseTextView f81015r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f81016s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f81017t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f81018u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final ImageView f81019v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f81020w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final ImageView f81021x;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36835s m82534a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.bonusAmount;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.bonusAmountUnit;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.btnActive;
                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton != null) {
                    i11 = R$id.bubble;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.bubbleImg;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            i11 = R$id.close;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                            if (imageView2 != null) {
                                i11 = R$id.condition;
                                BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView4 != null) {
                                    i11 = R$id.day;
                                    BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView5 != null) {
                                        i11 = R$id.dialogDesc;
                                        BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView6 != null) {
                                            i11 = R$id.dialogTitle;
                                            BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView7 != null) {
                                                i11 = R$id.expireTime;
                                                BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView8 != null) {
                                                    i11 = R$id.hour;
                                                    BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView9 != null) {
                                                        i11 = R$id.leftImage;
                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                                        if (imageView3 != null) {
                                                            i11 = R$id.leftLeverage;
                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                                            if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.line))) != null) {
                                                                i11 = R$id.ll_container;
                                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                                                if (linearLayout != null) {
                                                                    i11 = R$id.mini_pro_requirement;
                                                                    BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                    if (baseTextView10 != null) {
                                                                        i11 = R$id.mini_tra_amount;
                                                                        BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (baseTextView11 != null) {
                                                                            i11 = R$id.minute;
                                                                            BaseTextView baseTextView12 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView12 != null) {
                                                                                i11 = R$id.rightDesc;
                                                                                BaseTextView baseTextView13 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView13 != null) {
                                                                                    i11 = R$id.rightImage;
                                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (imageView4 != null) {
                                                                                        i11 = R$id.rightTitle;
                                                                                        BaseTextView baseTextView14 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView14 != null) {
                                                                                            i11 = R$id.top_img;
                                                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                                                                            if (imageView5 != null) {
                                                                                                return new C36835s((ConstraintLayout) view, baseTextView, baseTextView2, kcPrimaryButton, baseTextView3, imageView, imageView2, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, imageView3, appCompatImageView, viewFindChildViewById, linearLayout, baseTextView10, baseTextView11, baseTextView12, baseTextView13, imageView4, baseTextView14, imageView5);
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
        return this.f80998a;
    }

    public C36835s(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull BaseTextView baseTextView3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull ImageView imageView3, @NonNull AppCompatImageView appCompatImageView, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11, @NonNull BaseTextView baseTextView12, @NonNull BaseTextView baseTextView13, @NonNull ImageView imageView4, @NonNull BaseTextView baseTextView14, @NonNull ImageView imageView5) {
        this.f80998a = constraintLayout;
        this.f80999b = baseTextView;
        this.f81000c = baseTextView2;
        this.f81001d = kcPrimaryButton;
        this.f81002e = baseTextView3;
        this.f81003f = imageView;
        this.f81004g = imageView2;
        this.f81005h = baseTextView4;
        this.f81006i = baseTextView5;
        this.f81007j = baseTextView6;
        this.f81008k = baseTextView7;
        this.f81009l = baseTextView8;
        this.f81010m = baseTextView9;
        this.f81011n = imageView3;
        this.f81012o = appCompatImageView;
        this.f81013p = view;
        this.f81014q = linearLayout;
        this.f81015r = baseTextView10;
        this.f81016s = baseTextView11;
        this.f81017t = baseTextView12;
        this.f81018u = baseTextView13;
        this.f81019v = imageView4;
        this.f81020w = baseTextView14;
        this.f81021x = imageView5;
    }
}
