package com.sumsub.sns.internal.features.presentation.error;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.error.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/error/e;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C30926e extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: U */
    public static final /* synthetic */ int f62467U = 0;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R$layout.sns_fragment_error_dialog, viewGroup, false);
    }

    /* JADX INFO: renamed from: a */
    public static final void m70520a(C30926e c30926e, View view) {
        c30926e.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence charSequence;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R$id.sns_text);
        CharSequence charSequence2 = null;
        if (textView != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                charSequence = arguments.getCharSequence("arg_message");
            } else {
                charSequence = null;
            }
            textView.setText(charSequence);
        }
        Button button = (Button) view.findViewById(R$id.sns_button);
        if (button != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                charSequence2 = arguments2.getCharSequence("arg_button");
            }
            button.setText(charSequence2);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.error.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C30926e.m70520a(this.f62475b, view2);
                }
            });
        }
    }
}
