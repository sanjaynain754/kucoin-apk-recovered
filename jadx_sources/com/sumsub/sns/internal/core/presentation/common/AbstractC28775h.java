package com.sumsub.sns.internal.core.presentation.common;

import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.LifecycleOwnerKt;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.widget.SNSAlertDialogBuilder;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import kotlinx.coroutines.C41696j;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.common.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28775h extends AbstractC28787t {

    /* JADX INFO: renamed from: e */
    public AlertDialog f58525e;

    public AbstractC28775h(AbstractC28133l abstractC28133l) {
        super(abstractC28133l, null);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69593a(final AbstractC28775h abstractC28775h, C29983l c29983l) {
        AlertDialog alertDialog = abstractC28775h.f58525e;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog alertDialog2 = null;
        abstractC28775h.f58525e = null;
        AlertDialog alertDialogMo69479a = abstractC28775h.mo69479a(c29983l);
        if (alertDialogMo69479a != null) {
            alertDialogMo69479a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.sumsub.sns.internal.core.presentation.common.d0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    AbstractC28775h.m69594a(this.f58516a, dialogInterface);
                }
            });
            alertDialogMo69479a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sumsub.sns.internal.core.presentation.common.e0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    AbstractC28775h.m69595b(this.f58522b, dialogInterface);
                }
            });
            SNSAlertDialogBuilder.INSTANCE.showWithThemeExtension(alertDialogMo69479a);
            alertDialog2 = alertDialogMo69479a;
        }
        abstractC28775h.f58525e = alertDialog2;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public abstract AlertDialog mo69479a(C29983l c29983l);

    public AbstractC28775h(AbstractC28787t abstractC28787t) {
        super(abstractC28787t.f58549a, abstractC28787t);
    }

    /* JADX INFO: renamed from: b */
    public static final void m69595b(AbstractC28775h abstractC28775h, DialogInterface dialogInterface) {
        abstractC28775h.m69608b("Dismissing dialog.");
        abstractC28775h.mo69596n();
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.AbstractC28787t
    /* JADX INFO: renamed from: m */
    public void mo69522m() {
        AlertDialog alertDialog = this.f58525e;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.f58525e = null;
    }

    /* JADX INFO: renamed from: p */
    public void mo69598p() {
        AlertDialog alertDialog = this.f58525e;
        if (alertDialog == null || !alertDialog.isShowing()) {
            C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this.f58549a.getViewLifecycleOwner()), null, null, new C28786s(this, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.common.c0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC28775h.m69593a(this.f58511b, (C29983l) obj);
                }
            }, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m69594a(AbstractC28775h abstractC28775h, DialogInterface dialogInterface) {
        abstractC28775h.m69608b("Showing dialog.");
        abstractC28775h.mo69597o();
    }

    /* JADX INFO: renamed from: n */
    public void mo69596n() {
    }

    /* JADX INFO: renamed from: o */
    public void mo69597o() {
    }
}
