package t20;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.n0 */
/* JADX INFO: compiled from: KucoinLayoutNftBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44655n0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99254a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f99255b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f99256c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f99257d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final BaseTextView f99258e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99259f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99260g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99261h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99262i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99263j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99264k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f99265l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f99266m;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44655n0 m98786a(@NonNull View view) {
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
                                                        return new C44655n0((ConstraintLayout) view, frameLayout, baseTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, baseTextView8, baseTextView9, baseTextView10, baseTextView11);
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
        return this.f99254a;
    }

    public C44655n0(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull BaseTextView baseTextView8, @NonNull BaseTextView baseTextView9, @NonNull BaseTextView baseTextView10, @NonNull BaseTextView baseTextView11) {
        this.f99254a = constraintLayout;
        this.f99255b = frameLayout;
        this.f99256c = baseTextView;
        this.f99257d = baseTextView2;
        this.f99258e = baseTextView3;
        this.f99259f = baseTextView4;
        this.f99260g = baseTextView5;
        this.f99261h = baseTextView6;
        this.f99262i = baseTextView7;
        this.f99263j = baseTextView8;
        this.f99264k = baseTextView9;
        this.f99265l = baseTextView10;
        this.f99266m = baseTextView11;
    }
}
