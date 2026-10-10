package com.kubi.spot.business.discover;

import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.utils.C27099x;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import mr.C42597a;
import o20.InterfaceC42951a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: MarketChangeSettingManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.discover.MarketChangeSettingManager$updateSettingAsync$2", m90122f = "MarketChangeSettingManager.kt", m90123i = {}, m90124l = {84}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nMarketChangeSettingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketChangeSettingManager.kt\ncom/kubi/spot/business/discover/MarketChangeSettingManager$updateSettingAsync$2\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,121:1\n35#2,3:122\n23#3,2:125\n*S KotlinDebug\n*F\n+ 1 MarketChangeSettingManager.kt\ncom/kubi/spot/business/discover/MarketChangeSettingManager$updateSettingAsync$2\n*L\n89#1:122,3\n89#1:125,2\n*E\n"})
public final class MarketChangeSettingManager$updateSettingAsync$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    public MarketChangeSettingManager$updateSettingAsync$2(Continuation<? super MarketChangeSettingManager$updateSettingAsync$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketChangeSettingManager$updateSettingAsync$2(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarketChangeSettingManager$updateSettingAsync$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC42951a interfaceC42951a = (InterfaceC42951a) C42597a.m93386b().create(InterfaceC42951a.class);
            this.label = 1;
            obj = interfaceC42951a.m94284a(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        BaseEntity baseEntity = (BaseEntity) obj;
        C44128b.m97259c("Discover::MarketChangeSettingManager", "updateSettingAsync response:" + baseEntity);
        Map map = (Map) baseEntity.getData();
        Intrinsics.checkNotNull(map);
        if (!map.isEmpty()) {
            MarketChangeSettingManager.f50137c = map;
            StorageId storageId = MarketChangeSettingManager.f50136b;
            String strM66919i = C27099x.m66919i(map, false, 2, null);
            if (strM66919i == null) {
                strM66919i = "";
            }
            C46392a.m102333p(storageId, strM66919i);
        }
        return Unit.INSTANCE;
    }
}
