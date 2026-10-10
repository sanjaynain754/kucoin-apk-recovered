package com.kubi.payment.flutter;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.payment.fast.buy.recurring.RecurringFrequency;
import com.kubi.payment.fast.buy.recurring.RecurringFrequencyDialog;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgePaymentRecurringFrequencyInfo;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgePaymentCallIMpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.flutter.KCFlutterBridgePaymentCallIMpl$selectRecurringFrequency$1", m90122f = "KCFlutterBridgePaymentCallIMpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCFlutterBridgePaymentCallIMpl$selectRecurringFrequency$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<KCFlutterBridgePaymentRecurringFrequencyInfo, ProtocolException, Unit> $callback;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ RecurringFrequency $recurringFrequency;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCFlutterBridgePaymentCallIMpl$selectRecurringFrequency$1(Context context, RecurringFrequency recurringFrequency, Function2<? super KCFlutterBridgePaymentRecurringFrequencyInfo, ? super ProtocolException, Unit> function2, Continuation<? super KCFlutterBridgePaymentCallIMpl$selectRecurringFrequency$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$recurringFrequency = recurringFrequency;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCFlutterBridgePaymentCallIMpl$selectRecurringFrequency$1(this.$ctx, this.$recurringFrequency, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCFlutterBridgePaymentCallIMpl$selectRecurringFrequency$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m48159f(Function2 function2, Context context, RecurringFrequency recurringFrequency) {
        String mode = recurringFrequency.getMode();
        String strM66668h = C27041f.m66668h(recurringFrequency.getTimeOfDay());
        String timeZone = recurringFrequency.getTimeZone();
        function2.invoke(new KCFlutterBridgePaymentRecurringFrequencyInfo(mode, C27041f.m66668h(recurringFrequency.getDayOfMonth()), C27041f.m66668h(recurringFrequency.getDayOfWeek()), strM66668h, timeZone, com.kubi.payment.fast.buy.recurring.l.a.c(context, recurringFrequency)), null);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            RecurringFrequencyDialog.Companion companion = RecurringFrequencyDialog.S0;
            FragmentManager supportFragmentManager = ((FragmentActivity) this.$ctx).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            RecurringFrequency recurringFrequency = this.$recurringFrequency;
            final Function2<KCFlutterBridgePaymentRecurringFrequencyInfo, ProtocolException, Unit> function2 = this.$callback;
            final Context context = this.$ctx;
            companion.showRecurringFrequencyDialog(supportFragmentManager, false, recurringFrequency, new Function1() { // from class: com.kubi.payment.flutter.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KCFlutterBridgePaymentCallIMpl$selectRecurringFrequency$1.m48159f(function2, context, (RecurringFrequency) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
