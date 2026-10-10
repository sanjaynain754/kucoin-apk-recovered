package com.kubi.spot.business.discover;

import com.kubi.utils.C27099x;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: MarketChangeSettingManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.discover.MarketChangeSettingManager$init$2", m90122f = "MarketChangeSettingManager.kt", m90123i = {0, 0, 0, 0}, m90124l = {125}, m90125m = "invokeSuspend", m90126n = {"mmkvString", "this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "I$0"})
@SourceDebugExtension({"SMAP\nMarketChangeSettingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketChangeSettingManager.kt\ncom/kubi/spot/business/discover/MarketChangeSettingManager$init$2\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,121:1\n32#2:122\n196#3,3:123\n*S KotlinDebug\n*F\n+ 1 MarketChangeSettingManager.kt\ncom/kubi/spot/business/discover/MarketChangeSettingManager$init$2\n*L\n63#1:122\n68#1:123,3\n*E\n"})
public final class MarketChangeSettingManager$init$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    public MarketChangeSettingManager$init$2(Continuation<? super MarketChangeSettingManager$init$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketChangeSettingManager$init$2(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarketChangeSettingManager$init$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            String strM102326h = C46392a.m102326h(MarketChangeSettingManager.f50136b, "");
            if (strM102326h.length() == 0) {
                return Unit.INSTANCE;
            }
            C44128b.m97259c("Discover::MarketChangeSettingManager", "init mmkvString:" + strM102326h);
            C27099x c27099x = C27099x.f54458a;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C24930xd8b47c1b(strM102326h, null)), C42911a.m94120b());
            this.L$0 = SpillingKt.nullOutSpilledVariable(strM102326h);
            this.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
            this.L$2 = SpillingKt.nullOutSpilledVariable(strM102326h);
            this.I$0 = 0;
            this.label = 1;
            obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Map map = (Map) obj;
        if (map != null && !map.isEmpty()) {
            MarketChangeSettingManager.f50137c = map;
        }
        MarketChangeSettingManager.f50138d.set(true);
        return Unit.INSTANCE;
    }
}
