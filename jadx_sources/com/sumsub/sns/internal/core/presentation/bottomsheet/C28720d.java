package com.sumsub.sns.internal.core.presentation.bottomsheet;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.C7090R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.sumsub.sns.internal.core.analytics.C28367f;
import java.util.LinkedHashMap;
import java.util.Map;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.bottomsheet.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "com/sumsub/sns/internal/core/presentation/bottomsheet/e", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C28720d extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: a */
    public C28721e f58406a;

    /* JADX INFO: renamed from: a */
    public static final void m69537a(C28720d c28720d, DialogInterface dialogInterface) {
        C28721e c28721e = c28720d.f58406a;
        if (c28721e != null) {
            BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialogInterface;
            BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
            behavior.setShouldRemoveExpandedCorners(false);
            c28721e.f58407a.mo69546a(behavior);
            AbstractC28725i.m69540a(bottomSheetDialog);
            FrameLayout frameLayout = (FrameLayout) bottomSheetDialog.findViewById(C7090R.id.design_bottom_sheet);
            if (frameLayout != null) {
                c28721e.f58407a.m69545a(frameLayout);
            }
            AbstractC28725i abstractC28725i = c28721e.f58407a;
            InterfaceC28719c interfaceC28719cMo69550o = abstractC28725i.mo69550o();
            if (interfaceC28719cMo69550o instanceof C28718b) {
                C28367f.m69259a(abstractC28725i.f58549a.getAnalyticsDelegate(), ((C28718b) interfaceC28719cMo69550o).f58405a, abstractC28725i.f58549a.getAnalyticsDelegate().f57841b, (Map) null, 12);
            } else {
                if (!(interfaceC28719cMo69550o instanceof C28717a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C28367f analyticsDelegate = abstractC28725i.f58549a.getAnalyticsDelegate();
                C28367f.m69261b(analyticsDelegate.f57840a, analyticsDelegate.f57841b, analyticsDelegate.f57842c, ((C28717a) interfaceC28719cMo69550o).f58404a);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C28721e c28721e = this.f58406a;
        if (c28721e != null) {
            return c28721e.f58407a.mo69543a(layoutInflater, viewGroup);
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C28721e c28721e = this.f58406a;
        if (c28721e != null) {
            c28721e.f58407a.getClass();
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.sumsub.sns.internal.core.presentation.bottomsheet.j
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C28720d.m69537a(this.f58417a, dialogInterface);
            }
        });
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C28721e c28721e = this.f58406a;
        if (c28721e != null) {
            AbstractC28725i abstractC28725i = c28721e.f58407a;
            InterfaceC28719c interfaceC28719cMo69550o = abstractC28725i.mo69550o();
            if (interfaceC28719cMo69550o instanceof C28718b) {
                C28367f.m69258a(abstractC28725i.f58549a.getAnalyticsDelegate(), ((C28718b) interfaceC28719cMo69550o).f58405a, abstractC28725i.f58549a.getAnalyticsDelegate().f57841b, (LinkedHashMap) null, 12);
            } else {
                if (interfaceC28719cMo69550o instanceof C28717a) {
                    C28367f analyticsDelegate = abstractC28725i.f58549a.getAnalyticsDelegate();
                    C28367f.m69254a(analyticsDelegate.f57840a, analyticsDelegate.f57841b, analyticsDelegate.f57842c, ((C28717a) interfaceC28719cMo69550o).f58404a);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
