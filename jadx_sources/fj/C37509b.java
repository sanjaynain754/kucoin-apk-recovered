package fj;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.home.gembox.MarqueeView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.ShowHideTextView;

/* JADX INFO: renamed from: fj.b */
/* JADX INFO: compiled from: FragmentHomeCardGemboxBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37509b implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83212a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f83213b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f83214c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final CoinAvatarView f83215d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final MarqueeView f83216e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f83217f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ShowHideTextView f83218g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f83219h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37509b m84476a(@NonNull View view) {
        int i11 = R$id.coin_name;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.heat_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.ic_coin;
                CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
                if (coinAvatarView != null) {
                    i11 = R$id.marque_view;
                    MarqueeView marqueeView = (MarqueeView) ViewBindings.findChildViewById(view, i11);
                    if (marqueeView != null) {
                        i11 = R$id.text_gembox;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView != null) {
                            i11 = R$id.tv_change_rate;
                            ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                            if (showHideTextView != null) {
                                i11 = R$id.tv_coin_price;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    return new C37509b((ConstraintLayout) view, baseTextView, recyclerView, coinAvatarView, marqueeView, imageView, showHideTextView, baseTextView2);
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
        return this.f83212a;
    }

    public C37509b(@NonNull ConstraintLayout constraintLayout, @NonNull BaseTextView baseTextView, @NonNull RecyclerView recyclerView, @NonNull CoinAvatarView coinAvatarView, @NonNull MarqueeView marqueeView, @NonNull ImageView imageView, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView2) {
        this.f83212a = constraintLayout;
        this.f83213b = baseTextView;
        this.f83214c = recyclerView;
        this.f83215d = coinAvatarView;
        this.f83216e = marqueeView;
        this.f83217f = imageView;
        this.f83218g = showHideTextView;
        this.f83219h = baseTextView2;
    }
}
