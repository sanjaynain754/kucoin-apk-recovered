package com.kubi.notice.lib.service;

import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.notice.lib.api.INoticeApi;
import com.kubi.notice.lib.api.MainRedPointManager;
import com.kubi.notice.lib.entity.WsNoticeEntity;
import com.kubi.sdk.BaseApplication;
import java.util.ArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: WsNoticeManager.kt */
/* JADX INFO: loaded from: classes30.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.notice.lib.service.WsNoticeManager$showMainNotice$1$3$1", m90122f = "WsNoticeManager.kt", m90123i = {}, m90124l = {243}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class WsNoticeManager$showMainNotice$1$3$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ WsNoticeEntity $entity;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WsNoticeManager$showMainNotice$1$3$1(WsNoticeEntity wsNoticeEntity, Continuation<? super WsNoticeManager$showMainNotice$1$3$1> continuation) {
        super(2, continuation);
        this.$entity = wsNoticeEntity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WsNoticeManager$showMainNotice$1$3$1(this.$entity, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((WsNoticeManager$showMainNotice$1$3$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer numBoxInt;
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
            INoticeApi iNoticeApiM43204s = WsNoticeManager.f36378a.m43204s();
            ArrayList arrayList = new ArrayList();
            WsNoticeEntity.DataBean data = this.$entity.getData();
            if (data != null) {
                numBoxInt = Boxing.boxInt(data.getId());
            } else {
                numBoxInt = null;
            }
            arrayList.add(String.valueOf(numBoxInt));
            InterfaceC41634e<Object> interfaceC41634eM43159d = iNoticeApiM43204s.m43159d(arrayList);
            this.label = 1;
            if (RetrofitFlowExKt.m42826g(interfaceC41634eM43159d, false, null, this, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        MainRedPointManager.f36366a.m43151k(BaseApplication.INSTANCE.get(), false);
        return Unit.INSTANCE;
    }
}
