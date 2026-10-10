package com.kubi.notice.lib.api;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.notice.lib.entity.Unread;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MainRedPointManager.kt */
/* JADX INFO: loaded from: classes30.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/notice/lib/entity/Unread;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.notice.lib.api.MainRedPointManager$getRedPointAsync$2$otcUnread$1", m90122f = "MainRedPointManager.kt", m90123i = {}, m90124l = {64}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MainRedPointManager$getRedPointAsync$2$otcUnread$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends Unread>>, Object> {
    final /* synthetic */ boolean $needRequestOTC;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends Unread>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<Unread>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainRedPointManager$getRedPointAsync$2$otcUnread$1(boolean z11, Continuation<? super MainRedPointManager$getRedPointAsync$2$otcUnread$1> continuation) {
        super(2, continuation);
        this.$needRequestOTC = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainRedPointManager$getRedPointAsync$2$otcUnread$1(this.$needRequestOTC, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<Unread>> continuation) {
        return ((MainRedPointManager$getRedPointAsync$2$otcUnread$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            if (this.$needRequestOTC) {
                InterfaceC41634e<List<Unread>> interfaceC41634eM43157b = MainRedPointManager.f36366a.m43150j().m43157b();
                this.label = 1;
                obj = RetrofitFlowExKt.m42826g(interfaceC41634eM43157b, false, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return null;
            }
        }
        return (List) ((C19334f) obj).m42846a();
    }
}
