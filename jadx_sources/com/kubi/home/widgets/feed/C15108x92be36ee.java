package com.kubi.home.widgets.feed;

import com.kubi.event.api.C12572a;
import com.kubi.sdk.site.info.SiteInfoManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.home.widgets.feed.HomeFeedActionLayout$bindFlowEvent$lambda$6$$inlined$bindFlowEvent$default$4 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¨\u0006\u0004"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.widgets.feed.HomeFeedActionLayout$bindFlowEvent$lambda$6$$inlined$bindFlowEvent$default$4", m90122f = "HomeFeedActionLayout.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4\n+ 2 HomeFeedActionLayout.kt\ncom/kubi/home/widgets/feed/HomeFeedActionLayout\n*L\n1#1,187:1\n98#2,11:188\n*E\n"})
public final class C15108x92be36ee extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HomeFeedActionLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15108x92be36ee(String str, Continuation continuation, HomeFeedActionLayout homeFeedActionLayout) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = homeFeedActionLayout;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C15108x92be36ee c15108x92be36ee = new C15108x92be36ee(this.$key, continuation, this.this$0);
        c15108x92be36ee.L$0 = obj;
        return c15108x92be36ee;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C15108x92be36ee) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if ((interfaceC43461b instanceof C43460a) && Intrinsics.areEqual(((C43460a) interfaceC43461b).getKeyEvent(), this.$key)) {
                C44128b.m97259c("HomeFeedActionLayout", "收到 FEED_FLUTTER_DISTANCE_HOME_FEED_REQUEST 事件");
                try {
                    int homeViewDistanceToBottomWindow = this.this$0.getHomeViewDistanceToBottomWindow();
                    SiteInfoManager.f47913a.m58113g("HomeFeedActionLayout", "homeView distance = " + homeViewDistanceToBottomWindow);
                    C12572a.m23695d("feed_flutter_distance_result", Boxing.boxInt(homeViewDistanceToBottomWindow), 0L, 4, null);
                } catch (Exception e11) {
                    C44128b.m97259c("HomeFeedActionLayout", "计算距离失败: " + e11.getMessage());
                    C12572a.m23695d("feed_flutter_distance_result", Boxing.boxInt(64), 0L, 4, null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
