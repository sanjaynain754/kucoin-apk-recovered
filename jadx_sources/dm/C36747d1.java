package dm;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.kumex.R$id;
import com.kubi.kumex.view.FocusEditText;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dm.d1 */
/* JADX INFO: compiled from: BkumexDialogSimpleSetTpslBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36747d1 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f79865a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FocusEditText f79866b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f79867c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f79868d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatImageView f79869e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f79870f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f79871g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KcPrimaryButton f79872h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f79873i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final KcSeekBar f79874j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f79875k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f79876l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final FocusEditText f79877m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f79878n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final AlignTopTextView f79879o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f79880p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final BaseTextView f79881q;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36747d1 m82345a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.amount;
        FocusEditText focusEditText = (FocusEditText) ViewBindings.findChildViewById(view, i11);
        if (focusEditText != null) {
            i11 = R$id.amountErrorTips;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.amountInputRow;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.btnAmountMinus;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatImageView != null) {
                        i11 = R$id.btnAmountPlus;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.close;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView3 != null) {
                                i11 = R$id.confirm;
                                KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                                if (kcPrimaryButton != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.dividerAmountRight))) != null) {
                                    i11 = R$id.progressBar;
                                    KcSeekBar kcSeekBar = (KcSeekBar) ViewBindings.findChildViewById(view, i11);
                                    if (kcSeekBar != null) {
                                        i11 = R$id.tpslErrorTips;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.tpslHint;
                                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView3 != null) {
                                                i11 = R$id.tpslPrice;
                                                FocusEditText focusEditText2 = (FocusEditText) ViewBindings.findChildViewById(view, i11);
                                                if (focusEditText2 != null) {
                                                    i11 = R$id.tpslType;
                                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView4 != null) {
                                                        i11 = R$id.tpslWarnTips;
                                                        AlignTopTextView alignTopTextView = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (alignTopTextView != null) {
                                                            i11 = R$id.tvAmountLabel;
                                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView5 != null) {
                                                                i11 = R$id.tvTitle;
                                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (baseTextView6 != null) {
                                                                    return new C36747d1((LinearLayout) view, focusEditText, baseTextView, constraintLayout, appCompatImageView, appCompatImageView2, appCompatImageView3, kcPrimaryButton, viewFindChildViewById, kcSeekBar, baseTextView2, baseTextView3, focusEditText2, baseTextView4, alignTopTextView, baseTextView5, baseTextView6);
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
    public LinearLayout getRoot() {
        return this.f79865a;
    }

    public C36747d1(@NonNull LinearLayout linearLayout, @NonNull FocusEditText focusEditText, @NonNull BaseTextView baseTextView, @NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull View view, @NonNull KcSeekBar kcSeekBar, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull FocusEditText focusEditText2, @NonNull BaseTextView baseTextView4, @NonNull AlignTopTextView alignTopTextView, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f79865a = linearLayout;
        this.f79866b = focusEditText;
        this.f79867c = baseTextView;
        this.f79868d = constraintLayout;
        this.f79869e = appCompatImageView;
        this.f79870f = appCompatImageView2;
        this.f79871g = appCompatImageView3;
        this.f79872h = kcPrimaryButton;
        this.f79873i = view;
        this.f79874j = kcSeekBar;
        this.f79875k = baseTextView2;
        this.f79876l = baseTextView3;
        this.f79877m = focusEditText2;
        this.f79878n = baseTextView4;
        this.f79879o = alignTopTextView;
        this.f79880p = baseTextView5;
        this.f79881q = baseTextView6;
    }
}
