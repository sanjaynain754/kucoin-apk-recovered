package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import k00.C40848l;

/* JADX INFO: renamed from: fj.g */
/* JADX INFO: compiled from: HomeCardSearchBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37519g implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83296a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C40848l f83297b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37519g m84498a(@NonNull View view) {
        int i11 = R$id.includeSearch;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        return new C37519g((ConstraintLayout) view, C40848l.m89395a(viewFindChildViewById));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83296a;
    }

    public C37519g(@NonNull ConstraintLayout constraintLayout, @NonNull C40848l c40848l) {
        this.f83296a = constraintLayout;
        this.f83297b = c40848l;
    }
}
