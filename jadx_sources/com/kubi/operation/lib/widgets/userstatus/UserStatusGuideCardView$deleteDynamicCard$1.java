package com.kubi.operation.lib.widgets.userstatus;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.operation.lib.api.OperationRepo;
import com.kubi.operation.lib.entity.CommonCardInfo;
import com.kubi.operation.lib.realtimev2.DynamicCardItemEntity;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UserStatusGuideCardView.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.widgets.userstatus.UserStatusGuideCardView$deleteDynamicCard$1", m90122f = "UserStatusGuideCardView.kt", m90123i = {}, m90124l = {186}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UserStatusGuideCardView$deleteDynamicCard$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ CommonCardInfo $data;
    final /* synthetic */ boolean $neverShowAgain;
    int label;
    final /* synthetic */ UserStatusGuideCardView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStatusGuideCardView$deleteDynamicCard$1(UserStatusGuideCardView userStatusGuideCardView, CommonCardInfo commonCardInfo, boolean z11, Continuation<? super UserStatusGuideCardView$deleteDynamicCard$1> continuation) {
        super(2, continuation);
        this.this$0 = userStatusGuideCardView;
        this.$data = commonCardInfo;
        this.$neverShowAgain = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserStatusGuideCardView$deleteDynamicCard$1(this.this$0, this.$data, this.$neverShowAgain, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UserStatusGuideCardView$deleteDynamicCard$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            OperationRepo repo = this.this$0.getRepo();
            List<DynamicCardItemEntity> listListOf = CollectionsKt.listOf(new DynamicCardItemEntity(this.$data.getBizType(), null, null, null, this.$data.getBizId(), null, null, null, null, null, null, null, null, null, null, null, null, 131054, null));
            String str = this.$neverShowAgain ? null : JPushConstants.NotificationTime.KEY_DAYS;
            this.label = 1;
            if (repo.m43267g(listListOf, str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
