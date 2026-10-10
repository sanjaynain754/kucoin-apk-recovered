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

/* JADX INFO: renamed from: vs.o */
/* JADX INFO: compiled from: OperationShimmerWelfareBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45638o implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayoutCompat f102889a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final View f102890b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f102891c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45638o m100766a(@NonNull View view) {
        int i11 = R$id.icon;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            i11 = R$id.viewLine;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                return new C45638o((LinearLayoutCompat) view, viewFindChildViewById, linearLayoutCompat);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C45638o m100767c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.operation_shimmer_welfare, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100766a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.f102889a;
    }

    public C45638o(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull View view, @NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.f102889a = linearLayoutCompat;
        this.f102890b = view;
        this.f102891c = linearLayoutCompat2;
    }
}
