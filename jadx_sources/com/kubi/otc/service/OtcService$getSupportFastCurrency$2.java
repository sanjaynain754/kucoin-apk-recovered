package com.kubi.otc.service;

import com.google.gson.reflect.TypeToken;
import com.kubi.otc.entity.FastLimits;
import com.kubi.otc.entity.FastSymbol;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27024b;
import et.InterfaceC37239a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: OtcService.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.otc.service.OtcService$getSupportFastCurrency$2", m90122f = "OtcService.kt", m90123i = {0, 0}, m90124l = {225}, m90125m = "invokeSuspend", m90126n = {"dataStr", "$i$f$suspendCancellableCoroutine"}, m90127s = {"L$0", "I$0"})
@SourceDebugExtension({"SMAP\nOtcService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcService.kt\ncom/kubi/otc/service/OtcService$getSupportFastCurrency$2\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,220:1\n160#2,4:221\n426#3,11:225\n*S KotlinDebug\n*F\n+ 1 OtcService.kt\ncom/kubi/otc/service/OtcService$getSupportFastCurrency$2\n*L\n69#1:221,4\n73#1:225,11\n*E\n"})
public final class OtcService$getSupportFastCurrency$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends String>>, Object> {
    final /* synthetic */ String $legal;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: com.kubi.otc.service.OtcService$getSupportFastCurrency$2$a */
    /* JADX INFO: compiled from: OtcService.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20275a implements Function1<FastSymbol, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41708m<List<String>> f38135b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f38136c;

        /* JADX WARN: Multi-variable type inference failed */
        public C20275a(InterfaceC41708m<? super List<String>> interfaceC41708m, String str) {
            this.f38135b = interfaceC41708m;
            this.f38136c = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m45449a(FastSymbol fastSymbol) {
            Map<String, FastLimits> map;
            Set<String> setKeySet;
            List list = null;
            C46392a.m102333p(PaymentStorageId.f40364a.m49834l(), C27099x.m66919i(fastSymbol, false, 2, null));
            InterfaceC41708m<List<String>> interfaceC41708m = this.f38135b;
            Map<String, Map<String, FastLimits>> currencyAmounts = fastSymbol.getCurrencyAmounts();
            if (currencyAmounts != null && (map = currencyAmounts.get(this.f38136c)) != null && (setKeySet = map.keySet()) != null) {
                list = CollectionsKt.toList(setKeySet);
            }
            interfaceC41708m.resumeWith(Result.m103844constructorimpl(C27024b.m66560c(list)));
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FastSymbol fastSymbol) {
            m45449a(fastSymbol);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.service.OtcService$getSupportFastCurrency$2$b */
    /* JADX INFO: compiled from: OtcService.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20276b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41708m<List<String>> f38137b;

        /* JADX WARN: Multi-variable type inference failed */
        public C20276b(InterfaceC41708m<? super List<String>> interfaceC41708m) {
            this.f38137b = interfaceC41708m;
        }

        /* JADX INFO: renamed from: a */
        public final void m45450a(Throwable th2) {
            InterfaceC41708m<List<String>> interfaceC41708m = this.f38137b;
            Result.Companion companion = Result.INSTANCE;
            interfaceC41708m.resumeWith(Result.m103844constructorimpl(new ArrayList()));
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m45450a(th2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.service.OtcService$getSupportFastCurrency$2$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C20277c extends TypeToken<FastSymbol> {
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends String>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<String>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtcService$getSupportFastCurrency$2(String str, Continuation<? super OtcService$getSupportFastCurrency$2> continuation) {
        super(2, continuation);
        this.$legal = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OtcService$getSupportFastCurrency$2(this.$legal, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<String>> continuation) {
        return ((OtcService$getSupportFastCurrency$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM66914d;
        Map<String, Map<String, FastLimits>> currencyAmounts;
        Map<String, FastLimits> map;
        Set<String> setKeySet;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String strM102326h = C46392a.m102326h(PaymentStorageId.f40364a.m49834l(), "");
        List list = null;
        if (strM102326h.length() > 0) {
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(strM102326h, new C20277c().getType());
            } catch (Throwable unused) {
                objM66914d = null;
            }
            FastSymbol fastSymbol = (FastSymbol) objM66914d;
            if (fastSymbol != null && (currencyAmounts = fastSymbol.getCurrencyAmounts()) != null && (map = currencyAmounts.get(this.$legal)) != null && (setKeySet = map.keySet()) != null) {
                list = CollectionsKt.toList(setKeySet);
            }
            return C27024b.m66560c(list);
        }
        String str = this.$legal;
        this.L$0 = SpillingKt.nullOutSpilledVariable(strM102326h);
        this.L$1 = str;
        this.I$0 = 0;
        this.label = 1;
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
        c41716o.m91142E();
        InterfaceC37239a.m83286a((InterfaceC37239a) C42597a.m93386b().create(InterfaceC37239a.class), null, null, 3, null).compose(C24217a1.m58389m()).subscribe(new OtcService.C20271b(new C20275a(c41716o, str)), new OtcService.C20271b(new C20276b(c41716o)));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        if (objM91171w == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM91171w;
    }
}
