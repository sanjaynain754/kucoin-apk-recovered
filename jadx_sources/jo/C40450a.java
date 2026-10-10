package jo;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.loan.R$id;
import com.kubi.resources.widget.LeverSeekBar;
import com.kubi.resources.widget.TradeInputEditor;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: jo.a */
/* JADX INFO: compiled from: BloanDialogSetLeverBinding.java */
/* JADX INFO: loaded from: classes26.dex */
public final class C40450a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f89753a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f89754b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f89755c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TradeInputEditor f89756d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatTextView f89757e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatTextView f89758f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LeverSeekBar f89759g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatTextView f89760h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C40450a m89089a(@NonNull View view) {
        int i11 = R$id.close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.confirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.input;
                TradeInputEditor tradeInputEditor = (TradeInputEditor) ViewBindings.findChildViewById(view, i11);
                if (tradeInputEditor != null) {
                    i11 = R$id.multiply;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatTextView != null) {
                        i11 = R$id.prompt_error;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatTextView2 != null) {
                            i11 = R$id.seekBar;
                            LeverSeekBar leverSeekBar = (LeverSeekBar) ViewBindings.findChildViewById(view, i11);
                            if (leverSeekBar != null) {
                                i11 = R$id.title;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatTextView3 != null) {
                                    return new C40450a((ConstraintLayout) view, appCompatImageView, kcPrimaryButton, tradeInputEditor, appCompatTextView, appCompatTextView2, leverSeekBar, appCompatTextView3);
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
        return this.f89753a;
    }

    public C40450a(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull TradeInputEditor tradeInputEditor, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull LeverSeekBar leverSeekBar, @NonNull AppCompatTextView appCompatTextView3) {
        this.f89753a = constraintLayout;
        this.f89754b = appCompatImageView;
        this.f89755c = kcPrimaryButton;
        this.f89756d = tradeInputEditor;
        this.f89757e = appCompatTextView;
        this.f89758f = appCompatTextView2;
        this.f89759g = leverSeekBar;
        this.f89760h = appCompatTextView3;
    }
}
