package bv;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.quotefacade.view.RankShimmer;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;

/* JADX INFO: renamed from: bv.m */
/* JADX INFO: compiled from: FragmentCommonRecommendBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4680m implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f4430a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BaseTextView f4431b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrimaryButton f4432c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final KcPrimaryButton f4433d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f4434e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final Group f4435f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Group f4436g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final Group f4437h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final ImageView f4438i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f4439j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final RecyclerView f4440k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final RankShimmer f4441l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final NestedScrollView f4442m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f4443n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4680m m4672a(@NonNull View view) {
        int i11 = R$id.addOtherRecommend;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            i11 = R$id.addRecommend;
            KcPrimaryButton kcPrimaryButton = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
            if (kcPrimaryButton != null) {
                i11 = R$id.btnAdd;
                KcPrimaryButton kcPrimaryButton2 = (KcPrimaryButton) ViewBindings.findChildViewById(view, i11);
                if (kcPrimaryButton2 != null) {
                    i11 = R$id.fl_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout != null) {
                        i11 = R$id.groupContent;
                        Group group = (Group) ViewBindings.findChildViewById(view, i11);
                        if (group != null) {
                            i11 = R$id.groupEmpty;
                            Group group2 = (Group) ViewBindings.findChildViewById(view, i11);
                            if (group2 != null) {
                                i11 = R$id.groupRecommendText;
                                Group group3 = (Group) ViewBindings.findChildViewById(view, i11);
                                if (group3 != null) {
                                    i11 = R$id.ivEmpty;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                                    if (imageView != null) {
                                        i11 = R$id.recommend_text;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            i11 = R$id.recycler_view;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                            if (recyclerView != null) {
                                                i11 = R$id.rs_loading;
                                                RankShimmer rankShimmer = (RankShimmer) ViewBindings.findChildViewById(view, i11);
                                                if (rankShimmer != null) {
                                                    i11 = R$id.scrollContent;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i11);
                                                    if (nestedScrollView != null) {
                                                        i11 = R$id.tvEmpty;
                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView3 != null) {
                                                            return new C4680m((FrameLayout) view, baseTextView, kcPrimaryButton, kcPrimaryButton2, constraintLayout, group, group2, group3, imageView, baseTextView2, recyclerView, rankShimmer, nestedScrollView, baseTextView3);
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
    public FrameLayout getRoot() {
        return this.f4430a;
    }

    public C4680m(@NonNull FrameLayout frameLayout, @NonNull BaseTextView baseTextView, @NonNull KcPrimaryButton kcPrimaryButton, @NonNull KcPrimaryButton kcPrimaryButton2, @NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull Group group2, @NonNull Group group3, @NonNull ImageView imageView, @NonNull BaseTextView baseTextView2, @NonNull RecyclerView recyclerView, @NonNull RankShimmer rankShimmer, @NonNull NestedScrollView nestedScrollView, @NonNull BaseTextView baseTextView3) {
        this.f4430a = frameLayout;
        this.f4431b = baseTextView;
        this.f4432c = kcPrimaryButton;
        this.f4433d = kcPrimaryButton2;
        this.f4434e = constraintLayout;
        this.f4435f = group;
        this.f4436g = group2;
        this.f4437h = group3;
        this.f4438i = imageView;
        this.f4439j = baseTextView2;
        this.f4440k = recyclerView;
        this.f4441l = rankShimmer;
        this.f4442m = nestedScrollView;
        this.f4443n = baseTextView3;
    }
}
