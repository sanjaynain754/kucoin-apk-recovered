package com.kubi.kyc.pannumber;

import android.content.DialogInterface;
import android.net.Uri;
import com.kubi.host.HostManager;
import com.kubi.kyc.R$drawable;
import com.kubi.kyc.entity.PanDialogConfigEntity;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import f00.C37304a;
import g00.InterfaceC37766r;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kyc.pannumber.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PanDialog.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kyc/pannumber/PanDialog;", "", "<init>", "()V", "hasDialog", "", "showPanDialog", "", "config", "Lcom/kubi/kyc/entity/PanDialogConfigEntity;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPanDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanDialog.kt\ncom/kubi/kyc/pannumber/PanDialog\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,40:1\n19#2,2:41\n*S KotlinDebug\n*F\n+ 1 PanDialog.kt\ncom/kubi/kyc/pannumber/PanDialog\n*L\n18#1:41,2\n*E\n"})
public final class PanDialog {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PanDialog f31239a = new PanDialog();

    /* JADX INFO: renamed from: b */
    public static boolean f31240b;

    /* JADX INFO: renamed from: i */
    public static final void m36842i(DialogInterface dialogInterface) {
        f31240b = false;
    }

    /* JADX INFO: renamed from: f */
    public static final void m36839f(final PanDialogConfigEntity panDialogConfigEntity) {
        if (f31240b) {
            return;
        }
        f31240b = true;
        C42899b.m94076f(AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54161R4(0).m54165V4(R$drawable.icon_pan_dialog_logo).m54168Y4(panDialogConfigEntity.getTitle()).m54156M4(panDialogConfigEntity.getSubTitle()).m54160Q4(panDialogConfigEntity.getCancelButton(), new DialogInterface.OnClickListener() { // from class: com.kubi.kyc.pannumber.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                PanDialog.m36840g(dialogInterface, i11);
            }
        }).m54163T4(panDialogConfigEntity.getReverseButton(), new DialogInterface.OnClickListener() { // from class: com.kubi.kyc.pannumber.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                PanDialog.m36841h(panDialogConfigEntity, dialogInterface, i11);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.kyc.pannumber.e
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PanDialog.m36842i(dialogInterface);
            }
        }), "PanDialog");
    }

    /* JADX INFO: renamed from: h */
    public static final void m36841h(PanDialogConfigEntity panDialogConfigEntity, DialogInterface dialogInterface, int i11) {
        C37304a c37304a = C37304a.f82764a;
        String strDecode = Uri.decode(HostManager.a.m() + panDialogConfigEntity.getLinkUrl());
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m36843e(@NotNull final PanDialogConfigEntity config) {
        Intrinsics.checkNotNullParameter(config, "config");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.kyc.pannumber.b
            @Override // java.lang.Runnable
            public final void run() {
                PanDialog.m36839f(config);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final void m36840g(DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
    }
}
