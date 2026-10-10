package com.kubi.resources.dialog;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kubi.C11352b;
import k00.C40840d;

/* JADX INFO: loaded from: classes11.dex */
public class LoadingDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: Z */
    public C40840d f43595Z;

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C40840d c40840dM89376c = C40840d.m89376c(layoutInflater, viewGroup, false);
        this.f43595Z = c40840dM89376c;
        return c40840dM89376c.getRoot();
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f43595Z = null;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (getDialog() == null || getDialog().getWindow() == null) {
            return;
        }
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            String string = getArguments().getString("tips");
            if (!TextUtils.isEmpty(string)) {
                this.f43595Z.f90745c.setText(string);
            }
        }
        C11352b.m20197a(this.f43595Z.f90744b);
    }
}
