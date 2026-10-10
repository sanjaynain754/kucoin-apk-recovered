package com.kubi.kyc.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.kubi.kyc.R$string;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kyc.ui.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DialogHelper.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rH\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kyc/ui/DialogHelper;", "", "<init>", "()V", "showAuthorizeCameraDialog", "", "context", "Landroid/content/Context;", "message", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "positiveCallback", "Lkotlin/Function0;", "negativeCallback", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DialogHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DialogHelper f31387a = new DialogHelper();

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m37109c(@NotNull final Context context, @NotNull String message, @NotNull FragmentManager fragmentManager, @Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54151H4(false).m54156M4(message).m54167X4(R$string.permission_apply).m54163T4(context.getString(R$string.go_settings), new DialogInterface.OnClickListener() { // from class: com.kubi.kyc.ui.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                DialogHelper.m37111e(context, function0, dialogInterface, i11);
            }
        }).m54160Q4(context.getString(R$string.cancel), new DialogInterface.OnClickListener() { // from class: com.kubi.kyc.ui.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                DialogHelper.m37112f(function1, dialogInterface, i11);
            }
        }).m54172c5(fragmentManager);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m37110d(Context context, String str, FragmentManager fragmentManager, Function0 function0, Function0 function1, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        m37109c(context, str, fragmentManager, function0, function1);
    }

    /* JADX INFO: renamed from: e */
    public static final void m37111e(Context context, Function0 function0, DialogInterface dialogInterface, int i11) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        Uri uriFromParts = Uri.fromParts(TPDownloadProxyEnum.DLPARAM_PACKAGE, context.getPackageName(), null);
        Intrinsics.checkNotNullExpressionValue(uriFromParts, "fromParts(...)");
        intent.setData(uriFromParts);
        context.startActivity(intent);
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m37112f(Function0 function0, DialogInterface dialogInterface, int i11) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        if (function0 != null) {
            function0.invoke();
        }
    }
}
