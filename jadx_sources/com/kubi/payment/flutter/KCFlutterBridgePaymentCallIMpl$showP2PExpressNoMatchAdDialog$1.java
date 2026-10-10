package com.kubi.payment.flutter;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$string;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCFlutterBridgePaymentCallIMpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.flutter.KCFlutterBridgePaymentCallIMpl$showP2PExpressNoMatchAdDialog$1", m90122f = "KCFlutterBridgePaymentCallIMpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCFlutterBridgePaymentCallIMpl$showP2PExpressNoMatchAdDialog$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCFlutterBridgePaymentCallIMpl$showP2PExpressNoMatchAdDialog$1(Context context, Continuation<? super KCFlutterBridgePaymentCallIMpl$showP2PExpressNoMatchAdDialog$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgePaymentCallIMpl$showP2PExpressNoMatchAdDialog$1(this.$ctx, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgePaymentCallIMpl$showP2PExpressNoMatchAdDialog$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_info).m54168Y4(this.$ctx.getString(R$string.payment_express_no_ad_title)).m54169Z4(true).m54173d5(false).m54156M4(this.$ctx.getString(R$string.payment_express_no_ad_des)).m54157N4(true).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.flutter.q
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    KCFlutterBridgePaymentCallIMpl$showP2PExpressNoMatchAdDialog$1.m48161f(dialogInterface, i11);
                }
            }).m54172c5(((FragmentActivity) this.$ctx).getSupportFragmentManager());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: renamed from: f */
    public static final void m48161f(DialogInterface dialogInterface, int i11) {
    }
}
