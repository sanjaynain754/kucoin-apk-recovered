package com.kubi.operation.lib.widgets.userstatus;

import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.assets.entity.HomeAssetInfo;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UserStatusWidget.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.widgets.userstatus.UserStatusWidget$loadRemoteAssetData$1", m90122f = "UserStatusWidget.kt", m90123i = {}, m90124l = {344}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UserStatusWidget$loadRemoteAssetData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $cacheTime;
    Object L$0;
    int label;
    final /* synthetic */ UserStatusWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStatusWidget$loadRemoteAssetData$1(UserStatusWidget userStatusWidget, Long l11, Continuation<? super UserStatusWidget$loadRemoteAssetData$1> continuation) {
        super(2, continuation);
        this.this$0 = userStatusWidget;
        this.$cacheTime = l11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserStatusWidget$loadRemoteAssetData$1(this.this$0, this.$cacheTime, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UserStatusWidget$loadRemoteAssetData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserStatusWidget userStatusWidget;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                userStatusWidget = (UserStatusWidget) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            UserStatusWidget userStatusWidget2 = this.this$0;
            IAssetsCenterService iAssetsCenterService = IAssetsCenterService.f16464a.get();
            Long l11 = this.$cacheTime;
            this.L$0 = userStatusWidget2;
            this.label = 1;
            Object objMo15337b = iAssetsCenterService.mo15337b(l11, this);
            if (objMo15337b == coroutine_suspended) {
                return coroutine_suspended;
            }
            userStatusWidget = userStatusWidget2;
            obj = objMo15337b;
        }
        userStatusWidget.m43880Y3((HomeAssetInfo) obj);
        return Unit.INSTANCE;
    }
}
