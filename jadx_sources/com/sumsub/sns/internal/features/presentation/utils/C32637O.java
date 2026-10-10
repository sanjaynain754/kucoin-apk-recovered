package com.sumsub.sns.internal.features.presentation.utils;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.internal.core.presentation.common.AbstractC28775h;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.utils.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32637O extends AbstractC28775h {

    /* JADX INFO: renamed from: f */
    public final Function1 f66631f;

    /* JADX INFO: renamed from: g */
    public final String f66632g;

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28775h
    /* JADX INFO: renamed from: a */
    public final AlertDialog mo69479a(C29983l c29983l) {
        return new SNSAlertDialogBuilder(this.f58549a.requireActivity()).setMessage((CharSequence) c29983l.m70061a("sns_prompt_doubleSide_text")).setPositiveButton((CharSequence) c29983l.m70061a("sns_prompt_doubleSide_action_yes"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.utils.b0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C32637O.m71257a(this.f66639b, dialogInterface, i11);
            }
        }).setNegativeButton((CharSequence) c29983l.m70061a("sns_prompt_doubleSide_action_no"), new DialogInterface.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.utils.c0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C32637O.m71258b(this.f66641b, dialogInterface, i11);
            }
        }).setCancelable(false).create();
    }

    /* JADX INFO: renamed from: b */
    public static final void m71258b(C32637O c32637o, DialogInterface dialogInterface, int i11) {
        c32637o.f66631f.invoke(Boolean.FALSE);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: h */
    public final String mo69480h() {
        return this.f66632g;
    }

    public C32637O(AbstractC28064I abstractC28064I, Function1 function1) {
        super(abstractC28064I);
        this.f66632g = "SecondSideDialog";
        this.f66631f = function1;
    }

    /* JADX INFO: renamed from: a */
    public static final void m71257a(C32637O c32637o, DialogInterface dialogInterface, int i11) {
        c32637o.f66631f.invoke(Boolean.TRUE);
    }
}
