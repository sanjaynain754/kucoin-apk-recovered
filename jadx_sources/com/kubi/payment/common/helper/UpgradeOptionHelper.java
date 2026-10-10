package com.kubi.payment.common.helper;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.otc.R$string;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.common.data.entities.UpgradeOptionRequest;
import com.kubi.payment.common.data.entities.UpgradeOptionResult;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.utils.ToastCompat;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p606rt.InterfaceC44174a;
import p658ub.C45148b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UpgradeOptionHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/common/helper/UpgradeOptionHelper;", "", "<init>", "()V", "loadUpgradeOption", "Lcom/kubi/payment/common/data/entities/UpgradeOptionResult;", "request", "Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;", "(Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAppVersionIsSupport", "", "manage", "Landroidx/fragment/app/FragmentManager;", "(Lcom/kubi/payment/common/data/entities/UpgradeOptionRequest;Landroidx/fragment/app/FragmentManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showTypeTipWebDialog", "", "content", "", "showTypeTipAppDialog", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UpgradeOptionHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final UpgradeOptionHelper f38522a = new UpgradeOptionHelper();

    /* JADX INFO: renamed from: e */
    public static final void m46257e(DialogInterface dialogInterface, int i11) {
        OtcDepend.f38138a.m45465n();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: b */
    public final Object m46258b(@NotNull UpgradeOptionRequest upgradeOptionRequest, @NotNull FragmentManager fragmentManager, @NotNull Continuation<? super Boolean> continuation) {
        UpgradeOptionHelper$checkAppVersionIsSupport$1 upgradeOptionHelper$checkAppVersionIsSupport$1;
        if (continuation instanceof UpgradeOptionHelper$checkAppVersionIsSupport$1) {
            upgradeOptionHelper$checkAppVersionIsSupport$1 = (UpgradeOptionHelper$checkAppVersionIsSupport$1) continuation;
            int i11 = upgradeOptionHelper$checkAppVersionIsSupport$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                upgradeOptionHelper$checkAppVersionIsSupport$1.label = i11 - Integer.MIN_VALUE;
            } else {
                upgradeOptionHelper$checkAppVersionIsSupport$1 = new UpgradeOptionHelper$checkAppVersionIsSupport$1(this, continuation);
            }
        } else {
            upgradeOptionHelper$checkAppVersionIsSupport$1 = new UpgradeOptionHelper$checkAppVersionIsSupport$1(this, continuation);
        }
        Object objM46259c = upgradeOptionHelper$checkAppVersionIsSupport$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = upgradeOptionHelper$checkAppVersionIsSupport$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM46259c);
            upgradeOptionHelper$checkAppVersionIsSupport$1.L$0 = SpillingKt.nullOutSpilledVariable(upgradeOptionRequest);
            upgradeOptionHelper$checkAppVersionIsSupport$1.L$1 = fragmentManager;
            upgradeOptionHelper$checkAppVersionIsSupport$1.label = 1;
            objM46259c = m46259c(upgradeOptionRequest, upgradeOptionHelper$checkAppVersionIsSupport$1);
            if (objM46259c == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fragmentManager = (FragmentManager) upgradeOptionHelper$checkAppVersionIsSupport$1.L$1;
            ResultKt.throwOnFailure(objM46259c);
        }
        UpgradeOptionResult upgradeOptionResult = (UpgradeOptionResult) objM46259c;
        if (C45148b.m99792b(upgradeOptionResult != null ? upgradeOptionResult.getStatus() : null)) {
            return Boxing.boxBoolean(true);
        }
        String strM99794d = C45148b.m99794d(upgradeOptionResult != null ? upgradeOptionResult.getContent() : null);
        String type = upgradeOptionResult != null ? upgradeOptionResult.getType() : null;
        if (Intrinsics.areEqual(type, "1")) {
            m46261f(strM99794d, fragmentManager);
        } else if (Intrinsics.areEqual(type, "2")) {
            m46260d(strM99794d, fragmentManager);
        } else {
            ToastCompat.m66441G(strM99794d, new Object[0]);
        }
        return Boxing.boxBoolean(false);
    }

    /* JADX INFO: renamed from: d */
    public final void m46260d(String str, FragmentManager fragmentManager) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.dialog_title_text_tip).m54156M4(C45148b.m99794d(str)).m54162S4(R$string.dialog_but_appupgrade_upgrade, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.common.helper.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                UpgradeOptionHelper.m46257e(dialogInterface, i11);
            }
        }).m54159P4(R$string.cancel, null).show(fragmentManager, "typeTipAppDialog");
    }

    /* JADX INFO: renamed from: f */
    public final void m46261f(String str, FragmentManager fragmentManager) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.dialog_title_text_tip).m54156M4(C45148b.m99794d(str)).m54162S4(R$string.i_already_know, null).show(fragmentManager, "typeTipWebDialog");
    }

    /* JADX INFO: renamed from: c */
    public final Object m46259c(UpgradeOptionRequest upgradeOptionRequest, Continuation<? super UpgradeOptionResult> continuation) {
        return RetrofitFlowExKt.m42830k(((InterfaceC44174a) C42597a.m93387c().create(InterfaceC44174a.class)).m97391a(upgradeOptionRequest), continuation);
    }
}
