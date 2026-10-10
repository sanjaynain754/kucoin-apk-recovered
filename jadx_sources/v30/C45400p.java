package v30;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.p */
/* JADX INFO: compiled from: CoreTradeLayoutNftBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45400p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102269a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f102270b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f102271c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f102272d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f102273e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102274f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f102275g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f102276h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f102277i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f102278j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f102279k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f102280l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f102281m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45400p m100337a(@NonNull View view) {
        int i11 = R$id.fl_nft;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.tv_addr;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv_addr_label;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    i11 = R$id.tv_desc;
                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView3 != null) {
                        i11 = R$id.tv_hard;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            i11 = R$id.tv_hard_label;
                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView5 != null) {
                                i11 = R$id.tv_more;
                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView6 != null) {
                                    i11 = R$id.tv_nft;
                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView7 != null) {
                                        i11 = R$id.tv_supply;
                                        BaseTextView baseTextView8 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView8 != null) {
                                            i11 = R$id.tv_supply_label;
                                            BaseTextView baseTextView9 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView9 != null) {
                                                i11 = R$id.tv_time;
                                                BaseTextView baseTextView10 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView10 != null) {
                                                    i11 = R$id.tv_time_label;
                                                    BaseTextView baseTextView11 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView11 != null) {
                                                        return new C45400p((ConstraintLayout) view, frameLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11);
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
        return this.f102269a;
    }

    public C45400p(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11) {
        this.f102269a = constraintLayout;
        this.f102270b = frameLayout;
        this.f102271c = baseTextView;
        this.f102272d = baseTextView2;
        this.f102273e = baseTextView3;
        this.f102274f = baseTextView4;
        this.f102275g = baseTextView5;
        this.f102276h = baseTextView6;
        this.f102277i = baseTextView7;
        this.f102278j = baseTextView8;
        this.f102279k = baseTextView9;
        this.f102280l = baseTextView10;
        this.f102281m = baseTextView11;
    }
}
