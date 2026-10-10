package com.kubi.payment.interceptor.network;

import android.content.DialogInterface;
import com.kubi.otc.R$drawable;
import com.kubi.payment.data.entities.MiddleGroundResource;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import java.util.Map;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.payment.interceptor.network.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PaymentFreezeMiddleGroundDialogManager.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/payment/interceptor/network/PaymentFreezeMiddleGroundDialogManager;", "", "<init>", "()V", "CONTENT", "", "BUTTON_TEXT", "isShowing", "", "showFreezeMiddleGroundDialog", "", "res", "Lcom/kubi/payment/data/entities/MiddleGroundResource;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentFreezeMiddleGroundDialogManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentFreezeMiddleGroundDialogManager.kt\ncom/kubi/payment/interceptor/network/PaymentFreezeMiddleGroundDialogManager\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,45:1\n19#2,2:46\n*S KotlinDebug\n*F\n+ 1 PaymentFreezeMiddleGroundDialogManager.kt\ncom/kubi/payment/interceptor/network/PaymentFreezeMiddleGroundDialogManager\n*L\n20#1:46,2\n*E\n"})
public final class PaymentFreezeMiddleGroundDialogManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PaymentFreezeMiddleGroundDialogManager f39552a = new PaymentFreezeMiddleGroundDialogManager();

    /* JADX INFO: renamed from: b */
    public static boolean f39553b;

    /* JADX INFO: renamed from: g */
    public static final void m48261g(DialogInterface dialogInterface) {
        f39553b = false;
    }

    /* JADX INFO: renamed from: e */
    public static final void m48259e(final MiddleGroundResource middleGroundResource) {
        if (middleGroundResource == null) {
            return;
        }
        Map<String, String> srcTextMap = middleGroundResource.getSrcTextMap();
        String str = srcTextMap != null ? srcTextMap.get("content") : null;
        Map<String, String> srcTextMap2 = middleGroundResource.getSrcTextMap();
        String str2 = srcTextMap2 != null ? srcTextMap2.get("btnTxt") : null;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || f39553b) {
            return;
        }
        f39553b = true;
        C42899b.m94076f(AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54173d5(false).m54156M4(str).m54157N4(true).m54163T4(str2, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.interceptor.network.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                PaymentFreezeMiddleGroundDialogManager.m48260f(middleGroundResource, dialogInterface, i11);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.payment.interceptor.network.c
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                PaymentFreezeMiddleGroundDialogManager.m48261g(dialogInterface);
            }
        }), "payment_dialog_FreezeMiddleGroundErrorReceiver");
    }

    /* JADX INFO: renamed from: d */
    public final void m48262d(@Nullable final MiddleGroundResource middleGroundResource) {
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.payment.interceptor.network.a
            @Override // java.lang.Runnable
            public final void run() {
                PaymentFreezeMiddleGroundDialogManager.m48259e(middleGroundResource);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final void m48260f(MiddleGroundResource middleGroundResource, DialogInterface dialogInterface, int i11) {
        RouteExKt.m56217H(middleGroundResource.getUrl());
        dialogInterface.dismiss();
    }
}
