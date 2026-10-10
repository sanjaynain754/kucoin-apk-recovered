package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.assets.view.LabelView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.round.widget.RoundConstraintLayout;

/* JADX INFO: renamed from: ta.o4 */
/* JADX INFO: compiled from: KucoinFragmentDepositSelectChainBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44834o4 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final RoundConstraintLayout f100544a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f100545b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100546c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f100547d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f100548e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final RoundConstraintLayout f100549f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f100550g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LabelView f100551h;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44834o4 m99194a(@NonNull View view) {
        int i11 = R$id.chain_full_name;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.chain_id;
            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView2 != null) {
                i11 = R$id.chain_name;
                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView3 != null) {
                    i11 = R$id.layout_chain_text;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout != null) {
                        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) view;
                        i11 = R$id.select_chain_info;
                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView4 != null) {
                            i11 = R$id.tag_pause;
                            LabelView labelView = (LabelView) ViewBindings.findChildViewById(view, i11);
                            if (labelView != null) {
                                return new C44834o4(roundConstraintLayout, baseTextView, baseTextView2, baseTextView3, constraintLayout, roundConstraintLayout, baseTextView4, labelView);
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
    public RoundConstraintLayout getRoot() {
        return this.f100544a;
    }

    public C44834o4(@NonNull RoundConstraintLayout roundConstraintLayout, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull ConstraintLayout constraintLayout, @NonNull RoundConstraintLayout roundConstraintLayout2, @NonNull BaseTextView baseTextView4, @NonNull LabelView labelView) {
        this.f100544a = roundConstraintLayout;
        this.f100545b = baseTextView;
        this.f100546c = baseTextView2;
        this.f100547d = baseTextView3;
        this.f100548e = constraintLayout;
        this.f100549f = roundConstraintLayout2;
        this.f100550g = baseTextView4;
        this.f100551h = labelView;
    }
}
