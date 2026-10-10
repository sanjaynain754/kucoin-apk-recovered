package p206dp;

import android.view.View;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.FixAutoSizeTextView;
import com.kubi.resources.widget.LeverSeekBar;
import com.kubi.resources.widget.TradeInputEditor;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: dp.h */
/* JADX INFO: compiled from: BmarginDialogMarginLeverSettingsBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36915h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ScrollView f81716a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f81717b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f81718c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TradeInputEditor f81719d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f81720e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatTextView f81721f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final FixAutoSizeTextView f81722g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatTextView f81723h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LeverSeekBar f81724i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final AppCompatTextView f81725j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36915h m82699a(@NonNull View view) {
        int i11 = R$id.close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.confirm;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.input;
                TradeInputEditor tradeInputEditor = (TradeInputEditor) ViewBindings.findChildViewById(view, i11);
                if (tradeInputEditor != null) {
                    i11 = R$id.max_title;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.multiply;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatTextView != null) {
                            i11 = R$id.prompt;
                            FixAutoSizeTextView fixAutoSizeTextView = (FixAutoSizeTextView) ViewBindings.findChildViewById(view, i11);
                            if (fixAutoSizeTextView != null) {
                                i11 = R$id.prompt_error;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatTextView2 != null) {
                                    i11 = R$id.seekBar;
                                    LeverSeekBar leverSeekBar = (LeverSeekBar) ViewBindings.findChildViewById(view, i11);
                                    if (leverSeekBar != null) {
                                        i11 = R$id.title;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                        if (appCompatTextView3 != null) {
                                            return new C36915h((ScrollView) view, appCompatImageView, kcPrimaryButton, tradeInputEditor, baseTextView, appCompatTextView, fixAutoSizeTextView, appCompatTextView2, leverSeekBar, appCompatTextView3);
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
    public ScrollView getRoot() {
        return this.f81716a;
    }

    public C36915h(@NonNull ScrollView scrollView, @NonNull AppCompatImageView appCompatImageView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull TradeInputEditor tradeInputEditor, @NonNull BaseTextView baseTextView, @NonNull AppCompatTextView appCompatTextView, @NonNull FixAutoSizeTextView fixAutoSizeTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull LeverSeekBar leverSeekBar, @NonNull AppCompatTextView appCompatTextView3) {
        this.f81716a = scrollView;
        this.f81717b = appCompatImageView;
        this.f81718c = kcPrimaryButton;
        this.f81719d = tradeInputEditor;
        this.f81720e = baseTextView;
        this.f81721f = appCompatTextView;
        this.f81722g = fixAutoSizeTextView;
        this.f81723h = appCompatTextView2;
        this.f81724i = leverSeekBar;
        this.f81725j = appCompatTextView3;
    }
}
