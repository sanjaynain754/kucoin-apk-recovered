package com.kubi.kumex.market.tradingArea;

import com.kubi.kumex.utils.Log;
import com.kubi.network.retrofit.utils.C19334f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: DrawerTradingAreaVM.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.market.tradingArea.DrawerTradingAreaVM$executeAsync$2", m90122f = "DrawerTradingAreaVM.kt", m90123i = {0, 0}, m90124l = {80}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", DbParams.KEY_CHANNEL_RESULT}, m90127s = {"L$0", "L$1"})
public final class DrawerTradingAreaVM$executeAsync$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DrawerTradingAreaVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerTradingAreaVM$executeAsync$2(DrawerTradingAreaVM drawerTradingAreaVM, Continuation<? super DrawerTradingAreaVM$executeAsync$2> continuation) {
        super(2, continuation);
        this.this$0 = drawerTradingAreaVM;
    }

    /* JADX INFO: renamed from: g */
    public static final DrawerTradingAreaState m34460g(DrawerTradingAreaState drawerTradingAreaState) {
        return DrawerTradingAreaState.copy$default(drawerTradingAreaState, null, new Object(), 1, null);
    }

    /* JADX INFO: renamed from: h */
    public static final DrawerTradingAreaState m34461h(C19334f c19334f, int i11, DrawerTradingAreaState drawerTradingAreaState) {
        List listEmptyList = (List) c19334f.m42846a();
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return DrawerTradingAreaState.copy$default(drawerTradingAreaState, new Pair(listEmptyList, Integer.valueOf(i11)), null, 2, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DrawerTradingAreaVM$executeAsync$2 drawerTradingAreaVM$executeAsync$2 = new DrawerTradingAreaVM$executeAsync$2(this.this$0, continuation);
        drawerTradingAreaVM$executeAsync$2.L$0 = obj;
        return drawerTradingAreaVM$executeAsync$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((DrawerTradingAreaVM$executeAsync$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean zUpdateState;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            Log.f30813a.m36617c(this.this$0.f29486W, "executeAsync- start");
            InterfaceC41729r0 interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new DrawerTradingAreaVM$executeAsync$2$result$1(this.this$0, null), 3, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
            this.label = 1;
            obj = interfaceC41729r0M91102b.mo91198h(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        final C19334f c19334f = (C19334f) obj;
        final int iM34456s = this.this$0.m34456s();
        Log log = Log.f30813a;
        log.m36617c(this.this$0.f29486W, "executeAsync- start");
        if (c19334f.getThrowable() != null) {
            log.m36617c(this.this$0.f29486W, "executeAsync- occur exception");
            zUpdateState = this.this$0.updateState(new Function1() { // from class: com.kubi.kumex.market.tradingArea.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DrawerTradingAreaVM$executeAsync$2.m34460g((DrawerTradingAreaState) obj2);
                }
            });
        } else {
            log.m36617c(this.this$0.f29486W, "executeAsync- success");
            zUpdateState = this.this$0.updateState(new Function1() { // from class: com.kubi.kumex.market.tradingArea.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return DrawerTradingAreaVM$executeAsync$2.m34461h(c19334f, iM34456s, (DrawerTradingAreaState) obj2);
                }
            });
        }
        return Boxing.boxBoolean(zUpdateState);
    }
}
