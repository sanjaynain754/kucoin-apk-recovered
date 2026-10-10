package p701vs;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.operation.lib.R$id;

/* JADX INFO: renamed from: vs.n */
/* JADX INFO: compiled from: OperationShimmerUserStatusBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45637n implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f102885a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f102886b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f102887c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f102888d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45637n m100764a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i11 = R$id.f36610v1;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById3 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.f36611v2))) == null || (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.f36612v3))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C45637n((LinearLayoutCompat) view, viewFindChildViewById3, viewFindChildViewById, viewFindChildViewById2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f102885a;
    }

    public C45637n(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f102885a = linearLayoutCompat;
        this.f102886b = view;
        this.f102887c = view2;
        this.f102888d = view3;
    }
}
