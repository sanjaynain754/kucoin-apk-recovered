package com.kubi.payment.p106rn;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.payment.fast.buy.recurring.RecurringFrequency;
import com.kubi.payment.fast.buy.recurring.RecurringFrequencyDialog;
import com.kubi.payment.fast.buy.recurring.l;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.sdk.protocol.jsapi.protocol.KCJSApiPaymentRecurringFrequencyInfo;
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
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCRNBridgePaymentCallImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.rn.KCRNBridgePaymentCallImpl$selectRecurringFrequency$1", m90122f = "KCRNBridgePaymentCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCRNBridgePaymentCallImpl$selectRecurringFrequency$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<KCJSApiPaymentRecurringFrequencyInfo, ProtocolException, Unit> $callback;
    final /* synthetic */ String $dayOfMonth;
    final /* synthetic */ String $dayOfWeek;
    final /* synthetic */ String $frequency;
    final /* synthetic */ String $timeOfDay;
    final /* synthetic */ String $timeZone;
    final /* synthetic */ Activity $topActivity;
    final /* synthetic */ boolean $update;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCRNBridgePaymentCallImpl$selectRecurringFrequency$1(String str, String str2, String str3, String str4, String str5, Activity activity, boolean z11, Function2<? super KCJSApiPaymentRecurringFrequencyInfo, ? super ProtocolException, Unit> function2, Continuation<? super KCRNBridgePaymentCallImpl$selectRecurringFrequency$1> continuation) {
        super(2, continuation);
        this.$frequency = str;
        this.$timeOfDay = str2;
        this.$timeZone = str3;
        this.$dayOfWeek = str4;
        this.$dayOfMonth = str5;
        this.$topActivity = activity;
        this.$update = z11;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCRNBridgePaymentCallImpl$selectRecurringFrequency$1(this.$frequency, this.$timeOfDay, this.$timeZone, this.$dayOfWeek, this.$dayOfMonth, this.$topActivity, this.$update, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCRNBridgePaymentCallImpl$selectRecurringFrequency$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m49497f(Function2 function2, Activity activity, RecurringFrequency recurringFrequency) {
        String mode = recurringFrequency.getMode();
        String strM66668h = C27041f.m66668h(recurringFrequency.getTimeOfDay());
        String timeZone = recurringFrequency.getTimeZone();
        function2.invoke(new KCJSApiPaymentRecurringFrequencyInfo(mode, C27041f.m66668h(recurringFrequency.getDayOfMonth()), C27041f.m66668h(recurringFrequency.getDayOfWeek()), strM66668h, timeZone, l.a.c(activity, recurringFrequency)), null);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            RecurringFrequency recurringFrequency = new RecurringFrequency(this.$frequency, this.$timeOfDay, (String) null, this.$timeZone, (String) null, this.$dayOfWeek, (String) null, this.$dayOfMonth, (String) null, 340, (DefaultConstructorMarker) null);
            RecurringFrequencyDialog.Companion companion = RecurringFrequencyDialog.S0;
            FragmentManager supportFragmentManager = ((FragmentActivity) this.$topActivity).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            boolean z11 = !this.$update;
            final Function2<KCJSApiPaymentRecurringFrequencyInfo, ProtocolException, Unit> function2 = this.$callback;
            final Activity activity = this.$topActivity;
            companion.showRecurringFrequencyDialog(supportFragmentManager, z11, recurringFrequency, new Function1() { // from class: com.kubi.payment.rn.t
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return KCRNBridgePaymentCallImpl$selectRecurringFrequency$1.m49497f(function2, activity, (RecurringFrequency) obj2);
                }
            });
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
