package t20;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.c0 */
/* JADX INFO: compiled from: FragmentMatketChangeKlineEntranceBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44633c0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f99001a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Barrier f99002b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f99003c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final RecyclerView f99004d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f99005e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f99006f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99007g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99008h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final View f99009i;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44633c0 m98744a(@NonNull View view) {
        View viewFindChildViewById;
        int i11 = R$id.barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i11);
        if (barrier != null) {
            i11 = R$id.layout_market_change_empty;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                i11 = R$id.list_market_changes;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                if (recyclerView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = R$id.tv_jump_to_market;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tv_market_change_more;
                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView2 != null) {
                            i11 = R$id.tv_market_change_title;
                            BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i11 = R$id.view_margin))) != null) {
                                return new C44633c0(constraintLayout, barrier, linearLayoutCompat, recyclerView, constraintLayout, baseTextView, baseTextView2, baseTextView3, viewFindChildViewById);
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
        return this.f99001a;
    }

    public C44633c0(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull View view) {
        this.f99001a = constraintLayout;
        this.f99002b = barrier;
        this.f99003c = linearLayoutCompat;
        this.f99004d = recyclerView;
        this.f99005e = constraintLayout2;
        this.f99006f = baseTextView;
        this.f99007g = baseTextView2;
        this.f99008h = baseTextView3;
        this.f99009i = view;
    }
}
