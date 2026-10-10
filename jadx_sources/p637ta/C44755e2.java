package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;

/* JADX INFO: renamed from: ta.e2 */
/* JADX INFO: compiled from: AssetViewAccountDetailHeaderBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44755e2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99797a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CoinAvatarView f99798b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final AppCompatImageView f99799c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99800d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99801e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99802f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99803g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44755e2 m99024a(@NonNull View view) {
        int i11 = R$id.ivCoinAvatar;
        CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
        if (coinAvatarView != null) {
            i11 = R$id.ivCollateralStatus;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
            if (appCompatImageView != null) {
                i11 = R$id.tvCoinFullName;
                BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView != null) {
                    i11 = R$id.tvCoinName;
                    BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView2 != null) {
                        i11 = R$id.tvTotalCoin;
                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView3 != null) {
                            i11 = R$id.tvTotalValue;
                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView4 != null) {
                                return new C44755e2((ConstraintLayout) view, coinAvatarView, appCompatImageView, baseTextView, baseTextView2, baseTextView3, baseTextView4);
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
        return this.f99797a;
    }

    public C44755e2(@NonNull ConstraintLayout constraintLayout, @NonNull CoinAvatarView coinAvatarView, @NonNull AppCompatImageView appCompatImageView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f99797a = constraintLayout;
        this.f99798b = coinAvatarView;
        this.f99799c = appCompatImageView;
        this.f99800d = baseTextView;
        this.f99801e = baseTextView2;
        this.f99802f = baseTextView3;
        this.f99803g = baseTextView4;
    }
}
