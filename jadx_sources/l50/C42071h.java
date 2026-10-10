package l50;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.LeverSeekBar;
import com.kubi.resources.widget.TradeInputEditor;
import com.kubi.tradingbotkit.R$id;

/* JADX INFO: renamed from: l50.h */
/* JADX INFO: compiled from: BtradingBotKitDialogFuturesGridLeverSettingBinding.java */
/* JADX INFO: loaded from: classes51.dex */
public final class C42071h implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f92812a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final AppCompatImageView f92813b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatTextView f92814c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TradeInputEditor f92815d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final AppCompatTextView f92816e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f92817f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LeverSeekBar f92818g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatTextView f92819h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ImageView f92820i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final TextView f92821j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C42071h m92293a(@NonNull View view) {
        int i11 = R$id.close;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
        if (appCompatImageView != null) {
            i11 = R$id.confirm;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
            if (appCompatTextView != null) {
                i11 = R$id.input;
                TradeInputEditor tradeInputEditor = (TradeInputEditor) ViewBindings.findChildViewById(view, i11);
                if (tradeInputEditor != null) {
                    i11 = R$id.iv_leverage_tip;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                    if (appCompatTextView2 != null) {
                        i11 = R$id.iv_risk_level;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            i11 = R$id.seekBar;
                            LeverSeekBar leverSeekBar = (LeverSeekBar) ViewBindings.findChildViewById(view, i11);
                            if (leverSeekBar != null) {
                                i11 = R$id.title;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatTextView3 != null) {
                                    i11 = R$id.tv_leverage_tip;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                                    if (imageView2 != null) {
                                        i11 = R$id.tv_risk_level;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                                        if (textView != null) {
                                            return new C42071h((ConstraintLayout) view, appCompatImageView, appCompatTextView, tradeInputEditor, appCompatTextView2, imageView, leverSeekBar, appCompatTextView3, imageView2, textView);
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
        return this.f92812a;
    }

    public C42071h(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView, @NonNull TradeInputEditor tradeInputEditor, @NonNull AppCompatTextView appCompatTextView2, @NonNull ImageView imageView, @NonNull LeverSeekBar leverSeekBar, @NonNull AppCompatTextView appCompatTextView3, @NonNull ImageView imageView2, @NonNull TextView textView) {
        this.f92812a = constraintLayout;
        this.f92813b = appCompatImageView;
        this.f92814c = appCompatTextView;
        this.f92815d = tradeInputEditor;
        this.f92816e = appCompatTextView2;
        this.f92817f = imageView;
        this.f92818g = leverSeekBar;
        this.f92819h = appCompatTextView3;
        this.f92820i = imageView2;
        this.f92821j = textView;
    }
}
