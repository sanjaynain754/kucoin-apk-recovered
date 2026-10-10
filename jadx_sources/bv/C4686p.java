package bv;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.quotefacade.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: bv.p */
/* JADX INFO: compiled from: FragmentFavoriteEditChildFragmentBinding.java */
/* JADX INFO: loaded from: classes37.dex */
public final class C4686p implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f4475a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final ConstraintLayout f4476b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ConstraintLayout f4477c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f4478d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ImageView f4479e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final ImageView f4480f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayoutCompat f4481g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final RecyclerView f4482h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f4483i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f4484j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C4686p m4684a(@NonNull View view) {
        int i11 = R$id.clAll;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
        if (constraintLayout != null) {
            i11 = R$id.clBottom;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
            if (constraintLayout2 != null) {
                i11 = R$id.clDelete;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout3 != null) {
                    i11 = R$id.ivAll;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i11);
                    if (imageView != null) {
                        i11 = R$id.ivDelete;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i11);
                        if (imageView2 != null) {
                            i11 = R$id.llSort;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
                            if (linearLayoutCompat != null) {
                                i11 = R$id.recyclerView;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
                                if (recyclerView != null) {
                                    i11 = R$id.tvAll;
                                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView != null) {
                                        i11 = R$id.tvDelete;
                                        BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView2 != null) {
                                            return new C4686p((ConstraintLayout) view, constraintLayout, constraintLayout2, constraintLayout3, imageView, imageView2, linearLayoutCompat, recyclerView, baseTextView, baseTextView2);
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
    public ConstraintLayout getRoot() {
        return this.f4475a;
    }

    public C4686p(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f4475a = constraintLayout;
        this.f4476b = constraintLayout2;
        this.f4477c = constraintLayout3;
        this.f4478d = constraintLayout4;
        this.f4479e = imageView;
        this.f4480f = imageView2;
        this.f4481g = linearLayoutCompat;
        this.f4482h = recyclerView;
        this.f4483i = baseTextView;
        this.f4484j = baseTextView2;
    }
}
