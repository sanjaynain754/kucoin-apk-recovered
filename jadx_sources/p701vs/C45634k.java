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

/* JADX INFO: renamed from: vs.k */
/* JADX INFO: compiled from: OperationShimmerBonusBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45634k implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f102860a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f102861b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f102862c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f102863d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f102864e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f102865f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final View f102866g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final View f102867h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f102868i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final View f102869j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final View f102870k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final View f102871l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final View f102872m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final View f102873n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final View f102874o;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45634k m100756a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        View viewFindChildViewById6;
        View viewFindChildViewById7;
        View viewFindChildViewById8;
        View viewFindChildViewById9;
        View viewFindChildViewById10;
        View viewFindChildViewById11;
        View viewFindChildViewById12;
        View viewFindChildViewById13;
        int i11 = R$id.f36610v1;
        View viewFindChildViewById14 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById14 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.f36611v2))) == null || (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.f36612v3))) == null || (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.f36613v4))) == null || (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i11 = R$id.f36614v5))) == null || (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i11 = R$id.f36615v6))) == null || (viewFindChildViewById6 = ViewBindings.findChildViewById(view, (i11 = R$id.f36616v7))) == null || (viewFindChildViewById7 = ViewBindings.findChildViewById(view, (i11 = R$id.v81a))) == null || (viewFindChildViewById8 = ViewBindings.findChildViewById(view, (i11 = R$id.v81b))) == null || (viewFindChildViewById9 = ViewBindings.findChildViewById(view, (i11 = R$id.v82a))) == null || (viewFindChildViewById10 = ViewBindings.findChildViewById(view, (i11 = R$id.v82b))) == null || (viewFindChildViewById11 = ViewBindings.findChildViewById(view, (i11 = R$id.v83a))) == null || (viewFindChildViewById12 = ViewBindings.findChildViewById(view, (i11 = R$id.v83b))) == null || (viewFindChildViewById13 = ViewBindings.findChildViewById(view, (i11 = R$id.f36618v9))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C45634k((LinearLayoutCompat) view, viewFindChildViewById14, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6, viewFindChildViewById7, viewFindChildViewById8, viewFindChildViewById9, viewFindChildViewById10, viewFindChildViewById11, viewFindChildViewById12, viewFindChildViewById13);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C45634k m100757c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.operation_shimmer_bonus, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100756a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f102860a;
    }

    public C45634k(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull View view6, @NonNull View view7, @NonNull View view8, @NonNull View view9, @NonNull View view10, @NonNull View view11, @NonNull View view12, @NonNull View view13, @NonNull View view14) {
        this.f102860a = linearLayoutCompat;
        this.f102861b = view;
        this.f102862c = view2;
        this.f102863d = view3;
        this.f102864e = view4;
        this.f102865f = view5;
        this.f102866g = view6;
        this.f102867h = view7;
        this.f102868i = view8;
        this.f102869j = view9;
        this.f102870k = view10;
        this.f102871l = view11;
        this.f102872m = view12;
        this.f102873n = view13;
        this.f102874o = view14;
    }
}
