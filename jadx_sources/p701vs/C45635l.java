package p701vs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.R$layout;

/* JADX INFO: renamed from: vs.l */
/* JADX INFO: compiled from: OperationShimmerMaincoinBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45635l implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f102875a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f102876b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f102877c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f102878d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45635l m100759a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.f36610v1;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById3 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.f36611v2))) == null || (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.f36612v3))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C45635l((LinearLayoutCompat) view, viewFindChildViewById3, viewFindChildViewById, viewFindChildViewById2);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C45635l m100760c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.operation_shimmer_maincoin, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100759a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f102875a;
    }

    public C45635l(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f102875a = linearLayoutCompat;
        this.f102876b = view;
        this.f102877c = view2;
        this.f102878d = view3;
    }
}
