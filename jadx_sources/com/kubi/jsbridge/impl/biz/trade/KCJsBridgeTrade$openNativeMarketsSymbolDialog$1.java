package com.kubi.jsbridge.impl.biz.trade;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.blankj.utilcode.util.C5267e0;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.p111ui.KCBridgeRejecterError;
import com.kubi.p110rn.p111ui.OnDialogDismissedListener;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27099x;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: KCJsBridgeTrade.kt */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.jsbridge.impl.biz.trade.KCJsBridgeTrade$openNativeMarketsSymbolDialog$1", m90122f = "KCJsBridgeTrade.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCJsBridgeTrade$openNativeMarketsSymbolDialog$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<String, ProtocolException, Unit> $callback;
    final /* synthetic */ Ref.BooleanRef $handledByActivity;
    final /* synthetic */ Ref.BooleanRef $hasCompleted;
    final /* synthetic */ Map<String, Object> $transferData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: h */
    public static final Unit m31599h(Ref.BooleanRef booleanRef, InterfaceC41709m0 interfaceC41709m0, Map map, final Ref.BooleanRef booleanRef2, final Function2 function2, FragmentActivity fragmentActivity) {
        Object objM103844constructorimpl;
        booleanRef.element = true;
        try {
            Result.Companion companion = Result.INSTANCE;
            int iM6182d = (int) (C5267e0.m6182d() * 0.8f);
            IReactNativeService iReactNativeService = IReactNativeService.INSTANCE.get();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("krn/router?biz=markets&entry=main&component=kucoin_markets_rn&isDebug=false&view_height=");
            sb2.append(iM6182d);
            sb2.append("&route=");
            sb2.append(Uri.encode("NewMarketsPage?params=" + C27099x.m66919i(map, false, 2, null)));
            DialogFragmentHelper dialogFragmentHelperOpenRnDialog = iReactNativeService.openRnDialog(sb2.toString(), new OnDialogDismissedListener() { // from class: com.kubi.jsbridge.impl.biz.trade.h
                @Override // com.kubi.p110rn.p111ui.OnDialogDismissedListener
                public final void onClose(String str) {
                    KCJsBridgeTrade$openNativeMarketsSymbolDialog$1.m31600i(booleanRef2, function2, str);
                }
            }, new Function2() { // from class: com.kubi.jsbridge.impl.biz.trade.i
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KCJsBridgeTrade$openNativeMarketsSymbolDialog$1.m31601j(booleanRef2, function2, (String) obj, (KCBridgeRejecterError) obj2);
                }
            });
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            dialogFragmentHelperOpenRnDialog.show(supportFragmentManager, "openNativeMarketsSymbolDialog");
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            KCJsBridgeTrade.m31568A(booleanRef2, function2, null, new ProtocolException("openNativeMarketsSymbolDialog failed", thM103847exceptionOrNullimpl, null, false, 12, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final void m31600i(Ref.BooleanRef booleanRef, Function2 function2, String str) {
        KCJsBridgeTrade.m31568A(booleanRef, function2, str, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCJsBridgeTrade$openNativeMarketsSymbolDialog$1(Ref.BooleanRef booleanRef, Map<String, ? extends Object> map, Ref.BooleanRef booleanRef2, Function2<? super String, ? super ProtocolException, Unit> function2, Continuation<? super KCJsBridgeTrade$openNativeMarketsSymbolDialog$1> continuation) {
        super(2, continuation);
        this.$handledByActivity = booleanRef;
        this.$transferData = map;
        this.$hasCompleted = booleanRef2;
        this.$callback = function2;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m31601j(Ref.BooleanRef booleanRef, Function2 function2, String str, KCBridgeRejecterError kCBridgeRejecterError) {
        if (kCBridgeRejecterError != null) {
            KCJsBridgeTrade.m31568A(booleanRef, function2, null, new ProtocolException(kCBridgeRejecterError.getMessage(), null, null, false, 14, null));
        }
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KCJsBridgeTrade$openNativeMarketsSymbolDialog$1 kCJsBridgeTrade$openNativeMarketsSymbolDialog$1 = new KCJsBridgeTrade$openNativeMarketsSymbolDialog$1(this.$handledByActivity, this.$transferData, this.$hasCompleted, this.$callback, continuation);
        kCJsBridgeTrade$openNativeMarketsSymbolDialog$1.L$0 = obj;
        return kCJsBridgeTrade$openNativeMarketsSymbolDialog$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCJsBridgeTrade$openNativeMarketsSymbolDialog$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final Ref.BooleanRef booleanRef = this.$handledByActivity;
        final Map<String, Object> map = this.$transferData;
        final Ref.BooleanRef booleanRef2 = this.$hasCompleted;
        final Function2<String, ProtocolException, Unit> function2 = this.$callback;
        C42899b.m94073c(new Function1() { // from class: com.kubi.jsbridge.impl.biz.trade.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return KCJsBridgeTrade$openNativeMarketsSymbolDialog$1.m31599h(booleanRef, interfaceC41709m0, map, booleanRef2, function2, (FragmentActivity) obj2);
            }
        });
        if (!this.$handledByActivity.element) {
            KCJsBridgeTrade.m31568A(this.$hasCompleted, this.$callback, null, new ProtocolException("openNativeMarketsSymbolDialog failed: activity is null", null, null, false, 14, null));
        }
        return Unit.INSTANCE;
    }
}
