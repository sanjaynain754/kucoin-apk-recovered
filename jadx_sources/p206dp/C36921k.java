package p206dp;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.UpDownColorTextView;

/* JADX INFO: renamed from: dp.k */
/* JADX INFO: compiled from: BmarginFragmentCoinListItemViewBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36921k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81764a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CoinAvatarView f81765b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f81766c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ShowHideTextView f81767d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final UpDownColorTextView f81768e;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36921k m82710a(@NonNull View view) {
        int i11 = R$id.coin_icon;
        CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
        if (coinAvatarView != null) {
            i11 = R$id.tv_currency;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv_money_price;
                ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                if (showHideTextView != null) {
                    i11 = R$id.tv_price;
                    UpDownColorTextView upDownColorTextView = (UpDownColorTextView) ViewBindings.findChildViewById(view, i11);
                    if (upDownColorTextView != null) {
                        return new C36921k((ConstraintLayout) view, coinAvatarView, baseTextView, showHideTextView, upDownColorTextView);
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
        return this.f81764a;
    }

    public C36921k(@NonNull ConstraintLayout constraintLayout, @NonNull CoinAvatarView coinAvatarView, @NonNull BaseTextView baseTextView, @NonNull ShowHideTextView showHideTextView, @NonNull UpDownColorTextView upDownColorTextView) {
        this.f81764a = constraintLayout;
        this.f81765b = coinAvatarView;
        this.f81766c = baseTextView;
        this.f81767d = showHideTextView;
        this.f81768e = upDownColorTextView;
    }
}
