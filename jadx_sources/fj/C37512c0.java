package fj;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: fj.c0 */
/* JADX INFO: compiled from: HomeWidgetSearchBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class C37512c0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f83227a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final LinearLayoutCompat f83228b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f83229c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37512c0 m84482a(@NonNull View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i11 = R$id.tvSearch;
        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
        if (baseTextView != null) {
            return new C37512c0(linearLayoutCompat, linearLayoutCompat, baseTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f83227a;
    }

    public C37512c0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull BaseTextView baseTextView) {
        this.f83227a = linearLayoutCompat;
        this.f83228b = linearLayoutCompat2;
        this.f83229c = baseTextView;
    }
}
