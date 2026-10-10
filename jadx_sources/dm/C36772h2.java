package dm;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.futures.view.KycLeadView;
import com.kubi.kumex.R$id;
import com.kubi.resources.widget.RadioGroupPlus;

/* JADX INFO: renamed from: dm.h2 */
/* JADX INFO: compiled from: BkumexFragmentFuturesContainerBinding.java */
/* JADX INFO: loaded from: classes20.dex */
public final class C36772h2 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f80184a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TextView f80185b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final FrameLayout f80186c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RadioButton f80187d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RadioButton f80188e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ConstraintLayout f80189f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final HorizontalScrollView f80190g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final KycLeadView f80191h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final RadioButton f80192i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final RadioGroupPlus f80193j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ConstraintLayout f80194k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final TextView f80195l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final View f80196m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final View f80197n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final ImageView f80198o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final Barrier f80199p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final ConstraintLayout f80200q;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36772h2 m82401a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.botTv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
        if (textView != null) {
            i11 = R$id.contentFl;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
            if (frameLayout != null) {
                i11 = R$id.cpTradingRb;
                RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                if (radioButton != null) {
                    i11 = R$id.futuresRb;
                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                    if (radioButton2 != null) {
                        i11 = R$id.headerContentContainer;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                        if (constraintLayout != null) {
                            i11 = R$id.hsl;
                            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i11);
                            if (horizontalScrollView != null) {
                                i11 = R$id.kycLeadView;
                                KycLeadView kycLeadView = (KycLeadView) ViewBindings.findChildViewById(view, i11);
                                if (kycLeadView != null) {
                                    i11 = R$id.optionsRb;
                                    RadioButton radioButton3 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                    if (radioButton3 != null) {
                                        i11 = R$id.rbGroup;
                                        RadioGroupPlus radioGroupPlus = (RadioGroupPlus) ViewBindings.findChildViewById(view, i11);
                                        if (radioGroupPlus != null) {
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                            i11 = R$id.tradingCompetitionContentTv;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i11);
                                            if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.tradingCompetitionEndAnchor))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.tradingCompetitionFadeView))) != null) {
                                                i11 = R$id.tradingCompetitionIv;
                                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                                if (imageView != null) {
                                                    i11 = R$id.tradingCompetitionStartBarrier;
                                                    Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
                                                    if (barrier != null) {
                                                        i11 = R$id.tradingCompetitionTv;
                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                        if (constraintLayout3 != null) {
                                                            return new C36772h2(constraintLayout2, textView, frameLayout, radioButton, radioButton2, constraintLayout, horizontalScrollView, kycLeadView, radioButton3, radioGroupPlus, constraintLayout2, textView2, viewFindChildViewById, viewFindChildViewById2, imageView, barrier, constraintLayout3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f80184a;
    }

    public C36772h2(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull RadioButton radioButton, @NonNull RadioButton radioButton2, @NonNull ConstraintLayout constraintLayout2, @NonNull HorizontalScrollView horizontalScrollView, @NonNull KycLeadView kycLeadView, @NonNull RadioButton radioButton3, @NonNull RadioGroupPlus radioGroupPlus, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView2, @NonNull View view, @NonNull View view2, @NonNull ImageView imageView, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout4) {
        this.f80184a = constraintLayout;
        this.f80185b = textView;
        this.f80186c = frameLayout;
        this.f80187d = radioButton;
        this.f80188e = radioButton2;
        this.f80189f = constraintLayout2;
        this.f80190g = horizontalScrollView;
        this.f80191h = kycLeadView;
        this.f80192i = radioButton3;
        this.f80193j = radioGroupPlus;
        this.f80194k = constraintLayout3;
        this.f80195l = textView2;
        this.f80196m = view;
        this.f80197n = view2;
        this.f80198o = imageView;
        this.f80199p = barrier;
        this.f80200q = constraintLayout4;
    }
}
