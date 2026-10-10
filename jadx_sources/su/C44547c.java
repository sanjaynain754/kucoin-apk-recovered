package su;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.profit.loss.analysis.lib.R$id;
import com.kubi.sdk.widget.shape.view.ShapeTextView;

/* JADX INFO: renamed from: su.c */
/* JADX INFO: compiled from: ItemRangeBinding.java */
/* JADX INFO: loaded from: classes35.dex */
public final class C44547c implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f98766a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f98767b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ShapeTextView f98768c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44547c m98613a(@NonNull View view) {
        int i11 = R$id.end_divider;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.range;
            ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
            if (shapeTextView != null) {
                return new C44547c((LinearLayoutCompat) view, viewFindChildViewById, shapeTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f98766a;
    }

    public C44547c(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull ShapeTextView shapeTextView) {
        this.f98766a = linearLayoutCompat;
        this.f98767b = view;
        this.f98768c = shapeTextView;
    }
}
