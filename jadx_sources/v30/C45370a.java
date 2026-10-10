package v30;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.a */
/* JADX INFO: compiled from: BkcoinCoreNftWidgetLayoutBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45370a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f101987a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f101988b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f101989c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f101990d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f101991e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f101992f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f101993g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f101994h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f101995i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f101996j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f101997k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f101998l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f101999m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45370a m100271a(@NonNull View view) {
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
                                                        return new C45370a((ConstraintLayout) view, frameLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11);
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
        return this.f101987a;
    }

    public C45370a(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11) {
        this.f101987a = constraintLayout;
        this.f101988b = frameLayout;
        this.f101989c = baseTextView;
        this.f101990d = baseTextView2;
        this.f101991e = baseTextView3;
        this.f101992f = baseTextView4;
        this.f101993g = baseTextView5;
        this.f101994h = baseTextView6;
        this.f101995i = baseTextView7;
        this.f101996j = baseTextView8;
        this.f101997k = baseTextView9;
        this.f101998l = baseTextView10;
        this.f101999m = baseTextView11;
    }
}
