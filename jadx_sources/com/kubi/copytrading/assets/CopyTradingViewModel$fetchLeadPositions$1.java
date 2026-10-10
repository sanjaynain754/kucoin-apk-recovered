package com.kubi.copytrading.assets;

import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CopyTradingViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.copytrading.assets.CopyTradingViewModel$fetchLeadPositions$1", m90122f = "CopyTradingViewModel.kt", m90123i = {}, m90124l = {87}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCopyTradingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingViewModel.kt\ncom/kubi/copytrading/assets/CopyTradingViewModel$fetchLeadPositions$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n25#2:96\n26#2:98\n1#3:97\n*S KotlinDebug\n*F\n+ 1 CopyTradingViewModel.kt\ncom/kubi/copytrading/assets/CopyTradingViewModel$fetchLeadPositions$1\n*L\n90#1:96\n90#1:98\n90#1:97\n*E\n"})
public final class CopyTradingViewModel$fetchLeadPositions$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CopyTradingViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.copytrading.assets.CopyTradingViewModel$fetchLeadPositions$1$1 */
    /* JADX INFO: compiled from: CopyTradingViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/copytrading/assets/LeadTradingPositionEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.copytrading.assets.CopyTradingViewModel$fetchLeadPositions$1$1", m90122f = "CopyTradingViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C114461 extends SuspendLambda implements Function2<List<? extends LeadTradingPositionEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CopyTradingViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends LeadTradingPositionEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<LeadTradingPositionEntity>) list, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114461(CopyTradingViewModel copyTradingViewModel, Continuation<? super C114461> continuation) {
            super(2, continuation);
            this.this$0 = copyTradingViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114461 c114461 = new C114461(this.this$0, continuation);
            c114461.L$0 = obj;
            return c114461;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<LeadTradingPositionEntity> list, Continuation<? super Unit> continuation) {
            return ((C114461) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m20647A().setValue(new Pair<>(Boxing.boxBoolean(true), list));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingViewModel$fetchLeadPositions$1(CopyTradingViewModel copyTradingViewModel, Continuation<? super CopyTradingViewModel$fetchLeadPositions$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingViewModel$fetchLeadPositions$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CopyTradingViewModel$fetchLeadPositions$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e interfaceC41634eM20661b = AssetsCopytdApi.m20661b(this.this$0.m20655v(), null, 1, null);
            C114461 c114461 = new C114461(this.this$0, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM20661b, false, c114461, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        CopyTradingViewModel copyTradingViewModel = this.this$0;
        if (((C19334f) obj).getThrowable() != null) {
            copyTradingViewModel.m20647A().setValue(new Pair<>(Boxing.boxBoolean(false), null));
        }
        return Unit.INSTANCE;
    }
}
