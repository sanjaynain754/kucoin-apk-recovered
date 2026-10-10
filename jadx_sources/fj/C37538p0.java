package fj;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.kubi.home.R$id;

/* JADX INFO: renamed from: fj.p0 */
/* JADX INFO: compiled from: KucoinLayoutCardsKuMiningBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37538p0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f83387a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayout f83388b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C37540q0 f83389c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final MaterialCardView f83390d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final RecyclerView f83391e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f83392f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f83393g;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37538p0 m84542a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.ku_mining_card_empty_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
        if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.ku_mining_card_item_header))) != null) {
            C37540q0 c37540q0M84547a = C37540q0.m84547a(viewFindChildViewById);
            MaterialCardView materialCardView = (MaterialCardView) view;
            i11 = R$id.ll_ku_mining_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.ll_ku_mining_list_loading;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout2 != null) {
                    i11 = R$id.ll_ku_mining_title;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                    if (linearLayout3 != null) {
                        return new C37538p0(materialCardView, linearLayout, c37540q0M84547a, materialCardView, recyclerView, linearLayout2, linearLayout3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.f83387a;
    }

    public C37538p0(@NonNull MaterialCardView materialCardView, @NonNull LinearLayout linearLayout, @NonNull C37540q0 c37540q0, @NonNull MaterialCardView materialCardView2, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.f83387a = materialCardView;
        this.f83388b = linearLayout;
        this.f83389c = c37540q0;
        this.f83390d = materialCardView2;
        this.f83391e = recyclerView;
        this.f83392f = linearLayout2;
        this.f83393g = linearLayout3;
    }
}
