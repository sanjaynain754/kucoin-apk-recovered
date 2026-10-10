package v30;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.widget.shape.view.ShapeImageView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.s */
/* JADX INFO: compiled from: DialogUtaLeverageSettingBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45406s implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f102328a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final KcPrimaryButton f102329b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f102330c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcSeekBar f102331d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f102332e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102333f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f102334g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f102335h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ShapeImageView f102336i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final ShapeImageView f102337j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f102338k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45406s m100349a(@NonNull View view) {
        int i11 = R$id.btn_confirm;
        KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
        if (kcPrimaryButton != null) {
            i11 = R$id.iv_currency_arrow;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.seekbar_leverage;
                KcSeekBar kcSeekBar = (KcSeekBar) ViewBindings.findChildViewById(view, i11);
                if (kcSeekBar != null) {
                    i11 = R$id.tv_close;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.tv_currency;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_leverage;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tvMaxBorrowAmount;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.tv_minus;
                                    ShapeImageView shapeImageView = (ShapeImageView) ViewBindings.findChildViewById(view, i11);
                                    if (shapeImageView != null) {
                                        i11 = R$id.tv_plus;
                                        ShapeImageView shapeImageView2 = (ShapeImageView) ViewBindings.findChildViewById(view, i11);
                                        if (shapeImageView2 != null) {
                                            i11 = R$id.tv_title;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                return new C45406s((LinearLayout) view, kcPrimaryButton, appCompatImageView, kcSeekBar, imageView, baseTextView, baseTextView2, baseTextView3, shapeImageView, shapeImageView2, baseTextView4);
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
        return this.f102328a;
    }

    public C45406s(@NonNull LinearLayout linearLayout, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull AppCompatImageView appCompatImageView, @NonNull KcSeekBar kcSeekBar, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull ShapeImageView shapeImageView, @NonNull ShapeImageView shapeImageView2, @NonNull BaseTextView baseTextView4) {
        this.f102328a = linearLayout;
        this.f102329b = kcPrimaryButton;
        this.f102330c = appCompatImageView;
        this.f102331d = kcSeekBar;
        this.f102332e = imageView;
        this.f102333f = baseTextView;
        this.f102334g = baseTextView2;
        this.f102335h = baseTextView3;
        this.f102336i = shapeImageView;
        this.f102337j = shapeImageView2;
        this.f102338k = baseTextView4;
    }
}
