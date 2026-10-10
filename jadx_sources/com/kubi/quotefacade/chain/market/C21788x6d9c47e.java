package com.kubi.quotefacade.chain.market;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.quotefacade.chain.market.ChainMarketFragment.C21783b;
import com.kubi.quotefacade.constant.TimeSelectedEnum;
import com.kubi.quotefacade.entity.ChainFilterData;
import com.kubi.quotefacade.helper.ChainParamManager;
import com.kubi.quotefacade.helper.ChainSortHelper;
import com.kubi.utils.C27099x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import pf.C43460a;
import pf.InterfaceC43461b;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.quotefacade.chain.market.ChainMarketFragment$updateFilterData$$inlined$bindFlowEvent$default$1 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.ChainMarketFragment$updateFilterData$$inlined$bindFlowEvent$default$1", m90122f = "ChainMarketFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 ChainMarketFragment.kt\ncom/kubi/quotefacade/chain/market/ChainMarketFragment\n*L\n1#1,187:1\n320#2,22:188\n*E\n"})
public final class C21788x6d9c47e extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChainMarketFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21788x6d9c47e(String str, Continuation continuation, ChainMarketFragment chainMarketFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = chainMarketFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C21788x6d9c47e c21788x6d9c47e = new C21788x6d9c47e(this.$key, continuation, this.this$0);
        c21788x6d9c47e.L$0 = obj;
        return c21788x6d9c47e;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C21788x6d9c47e) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        TimeSelectedEnum timeSelectedEnumFindEnumByConstTag;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof String)) {
                    ChainFilterData chainFilterData = (ChainFilterData) C27099x.m66913c((String) c43460a.getData(), ChainFilterData.class);
                    C44128b.m97266j(this.this$0.getTAG(), "updateFilterData = " + chainFilterData);
                    ChainParamManager.f42002a.m51966e(chainFilterData);
                    String orderByRange = chainFilterData.getOrderByRange();
                    if (orderByRange != null && (timeSelectedEnumFindEnumByConstTag = TimeSelectedEnum.INSTANCE.findEnumByConstTag(orderByRange)) != null) {
                        int resourceId = timeSelectedEnumFindEnumByConstTag.getResourceId();
                        ChainMarketFragment chainMarketFragment = this.this$0;
                        String string = chainMarketFragment.getString(resourceId);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        chainMarketFragment.m50887j4(string);
                    }
                    String chainSortType = chainFilterData.getChainSortType();
                    if (chainSortType != null) {
                        this.this$0.m50885g4(chainSortType);
                        this.this$0.m50864h4(chainSortType);
                        ChainSortHelper chainSortHelper = this.this$0.f41553b0;
                        if (chainSortHelper != null) {
                            chainSortHelper.m52083r(chainSortType, this.this$0.new C21783b());
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
