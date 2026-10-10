package com.kubi.p110rn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.p110rn.C23207R;
import com.kubi.p110rn.p111ui.RnContainerLayout;
import k00.C40849m;

/* JADX INFO: loaded from: classes39.dex */
public final class DialogRnBottomSheetBinding implements ViewBinding {

    @NonNull
    public final C40849m bottomSheet;

    @NonNull
    public final RnContainerLayout rnContainer;

    @NonNull
    private final LinearLayoutCompat rootView;

    @NonNull
    public final LinearLayoutCompat roundedContainer;

    @NonNull
    public static DialogRnBottomSheetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogRnBottomSheetBinding bind(@NonNull View view) {
        int i11 = C23207R.id.bottom_sheet;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i11);
        if (viewFindChildViewById != null) {
            C40849m c40849mM89397a = C40849m.m89397a(viewFindChildViewById);
            int i12 = C23207R.id.rnContainer;
            RnContainerLayout rnContainerLayout = (RnContainerLayout) ViewBindings.findChildViewById(view, i12);
            if (rnContainerLayout != null) {
                i12 = C23207R.id.roundedContainer;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i12);
                if (linearLayoutCompat != null) {
                    return new DialogRnBottomSheetBinding((LinearLayoutCompat) view, c40849mM89397a, rnContainerLayout, linearLayoutCompat);
                }
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static DialogRnBottomSheetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(C23207R.layout.dialog_rn_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }

    private DialogRnBottomSheetBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull C40849m c40849m, @NonNull RnContainerLayout rnContainerLayout, @NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.rootView = linearLayoutCompat;
        this.bottomSheet = c40849m;
        this.rnContainer = rnContainerLayout;
        this.roundedContainer = linearLayoutCompat2;
    }
}
