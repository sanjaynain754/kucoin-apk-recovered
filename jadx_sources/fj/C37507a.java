package fj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.home.R$id;

/* JADX INFO: renamed from: fj.a */
/* JADX INFO: compiled from: FragmentCardMessageBoxBinding.java */
/* JADX INFO: loaded from: classes15.dex */
public final class C37507a implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f83203a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f83204b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final RecyclerView f83205c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TextView f83206d;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C37507a m84472a(@NonNull View view) {
        int i11 = R$id.close;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.message_list;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i11);
            if (recyclerView != null) {
                i11 = R$id.message_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i11);
                if (textView != null) {
                    return new C37507a((ConstraintLayout) view, frameLayout, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f83203a;
    }

    public C37507a(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f83203a = constraintLayout;
        this.f83204b = frameLayout;
        this.f83205c = recyclerView;
        this.f83206d = textView;
    }
}
