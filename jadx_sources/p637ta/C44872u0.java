package p637ta;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.assets.R$id;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: ta.u0 */
/* JADX INFO: compiled from: AssetFragmentRollbackBinding.java */
/* JADX INFO: loaded from: classes6.dex */
public final class C44872u0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f100922a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final RecyclerView f100923b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f100924c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final BaseTextView f100925d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44872u0 m99268a(@NonNull View view) {
        int i11 = R$id.recyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
        if (recyclerView != null) {
            i11 = R$id.tv_rollback_sub_title;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.tv_rollback_tip;
                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                if (baseTextView2 != null) {
                    return new C44872u0((ConstraintLayout) view, recyclerView, baseTextView, baseTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f100922a;
    }

    public C44872u0(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2) {
        this.f100922a = constraintLayout;
        this.f100923b = recyclerView;
        this.f100924c = baseTextView;
        this.f100925d = baseTextView2;
    }
}
