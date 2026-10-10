package com.kubi.otc.service;

import com.google.gson.reflect.TypeToken;
import com.kubi.otc.entity.FastSymbol;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.sdk.util.C24217a1;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import et.InterfaceC37239a;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41708m;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
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
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.otc.service.OtcService$getLegalAndCoinIcon$2", m90122f = "OtcService.kt", m90123i = {0, 0}, m90124l = {225}, m90125m = "invokeSuspend", m90126n = {"dataStr", "$i$f$suspendCancellableCoroutine"}, m90127s = {"L$0", "I$0"})
@SourceDebugExtension({"SMAP\nOtcService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcService.kt\ncom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2\n+ 2 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,220:1\n160#2,4:221\n426#3,11:225\n*S KotlinDebug\n*F\n+ 1 OtcService.kt\ncom/kubi/otc/service/OtcService$getLegalAndCoinIcon$2\n*L\n95#1:221,4\n101#1:225,11\n*E\n"})
public final class OtcService$getLegalAndCoinIcon$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Pair<? extends String, ? extends String>>, Object> {
    final /* synthetic */ String $coin;
    final /* synthetic */ String $legal;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: renamed from: com.kubi.otc.service.OtcService$getLegalAndCoinIcon$2$a */
    /* JADX INFO: compiled from: OtcService.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20272a implements Function1<FastSymbol, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41708m<Pair<String, String>> f38131b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f38132c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f38133d;

        /* JADX WARN: Multi-variable type inference failed */
        public C20272a(InterfaceC41708m<? super Pair<String, String>> interfaceC41708m, String str, String str2) {
            this.f38131b = interfaceC41708m;
            this.f38132c = str;
            this.f38133d = str2;
        }

        /* JADX INFO: renamed from: a */
        public final void m45447a(FastSymbol fastSymbol) {
            C46392a.m102333p(PaymentStorageId.f40364a.m49834l(), C27099x.m66919i(fastSymbol, false, 2, null));
            InterfaceC41708m<Pair<String, String>> interfaceC41708m = this.f38131b;
            Result.Companion companion = Result.INSTANCE;
            interfaceC41708m.resumeWith(Result.m103844constructorimpl(new Pair(C27041f.m66668h(fastSymbol.legalIcon(this.f38132c)), C27041f.m66668h(fastSymbol.coinIcon(this.f38133d)))));
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FastSymbol fastSymbol) {
            m45447a(fastSymbol);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.service.OtcService$getLegalAndCoinIcon$2$b */
    /* JADX INFO: compiled from: OtcService.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20273b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41708m<Pair<String, String>> f38134b;

        /* JADX WARN: Multi-variable type inference failed */
        public C20273b(InterfaceC41708m<? super Pair<String, String>> interfaceC41708m) {
            this.f38134b = interfaceC41708m;
        }

        /* JADX INFO: renamed from: a */
        public final void m45448a(Throwable th2) {
            InterfaceC41708m<Pair<String, String>> interfaceC41708m = this.f38134b;
            Result.Companion companion = Result.INSTANCE;
            interfaceC41708m.resumeWith(Result.m103844constructorimpl(new Pair("", "")));
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m45448a(th2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.service.OtcService$getLegalAndCoinIcon$2$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C20274c extends TypeToken<FastSymbol> {
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Pair<? extends String, ? extends String>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super Pair<String, String>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtcService$getLegalAndCoinIcon$2(String str, String str2, Continuation<? super OtcService$getLegalAndCoinIcon$2> continuation) {
        super(2, continuation);
        this.$legal = str;
        this.$coin = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OtcService$getLegalAndCoinIcon$2(this.$legal, this.$coin, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Pair<String, String>> continuation) {
        return ((OtcService$getLegalAndCoinIcon$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM66914d;
        String strLegalIcon;
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
        String strCoinIcon = null;
        if (strM102326h.length() > 0) {
            try {
                C27099x c27099x = C27099x.f54458a;
                objM66914d = C27099x.m66914d(strM102326h, new C20274c().getType());
            } catch (Throwable unused) {
                objM66914d = null;
            }
            FastSymbol fastSymbol = (FastSymbol) objM66914d;
            if (fastSymbol != null) {
                strLegalIcon = fastSymbol.legalIcon(this.$legal);
            } else {
                strLegalIcon = null;
            }
            String strM66668h = C27041f.m66668h(strLegalIcon);
            if (fastSymbol != null) {
                strCoinIcon = fastSymbol.coinIcon(this.$coin);
            }
            return new Pair(strM66668h, C27041f.m66668h(strCoinIcon));
        }
        String str = this.$legal;
        String str2 = this.$coin;
        this.L$0 = SpillingKt.nullOutSpilledVariable(strM102326h);
        this.L$1 = str;
        this.L$2 = str2;
        this.I$0 = 0;
        this.label = 1;
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(this), 1);
        c41716o.m91142E();
        InterfaceC37239a.m83286a((InterfaceC37239a) C42597a.m93386b().create(InterfaceC37239a.class), null, null, 3, null).compose(C24217a1.m58389m()).subscribe(new OtcService.C20271b(new C20272a(c41716o, str, str2)), new OtcService.C20271b(new C20273b(c41716o)));
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
