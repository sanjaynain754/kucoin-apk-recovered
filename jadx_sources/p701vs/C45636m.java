package p701vs;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.operation.lib.R$id;

/* JADX INFO: renamed from: vs.m */
/* JADX INFO: compiled from: OperationShimmerNewuserBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C45636m implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f102879a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f102880b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final View f102881c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final View f102882d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final View f102883e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final View f102884f;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45636m m100762a(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        int i11 = R$id.f36610v1;
        View viewFindChildViewById5 = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById5 == null || (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.f36611v2))) == null || (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i11 = R$id.f36612v3))) == null || (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i11 = R$id.f36613v4))) == null || (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i11 = R$id.f36614v5))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C45636m((LinearLayoutCompat) view, viewFindChildViewById5, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f102879a;
    }

    public C45636m(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5) {
        this.f102879a = linearLayoutCompat;
        this.f102880b = view;
        this.f102881c = view2;
        this.f102882d = view3;
        this.f102883e = view4;
        this.f102884f = view5;
    }
}
