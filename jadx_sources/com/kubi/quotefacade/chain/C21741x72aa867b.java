package com.kubi.quotefacade.chain;

import android.graphics.PorterDuff;
import androidx.exifinterface.media.ExifInterface;
import bv.C4662e;
import com.kubi.quotefacade.R$color;
import com.kubi.quotefacade.constant.ChainSortItemEnum;
import com.kubi.quotefacade.entity.ChainFilterData;
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

/* JADX INFO: renamed from: com.kubi.quotefacade.chain.ChainContainerFragment$initViewPager$lambda$8$$inlined$bindFlowEvent$default$1 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.chain.ChainContainerFragment$initViewPager$lambda$8$$inlined$bindFlowEvent$default$1", m90122f = "ChainContainerFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 ChainContainerFragment.kt\ncom/kubi/quotefacade/chain/ChainContainerFragment\n*L\n1#1,187:1\n116#2,9:188\n*E\n"})
public final class C21741x72aa867b extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ C4662e $this_apply$inlined;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChainContainerFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21741x72aa867b(String str, Continuation continuation, ChainContainerFragment chainContainerFragment, C4662e c4662e) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = chainContainerFragment;
        this.$this_apply$inlined = c4662e;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C21741x72aa867b c21741x72aa867b = new C21741x72aa867b(this.$key, continuation, this.this$0, this.$this_apply$inlined);
        c21741x72aa867b.L$0 = obj;
        return c21741x72aa867b;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C21741x72aa867b) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int colorRes;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof String)) {
                    if (!Intrinsics.areEqual(((ChainFilterData) C27099x.m66913c((String) c43460a.getData(), ChainFilterData.class)).getChainSortType(), ChainSortItemEnum.CHAIN_SORT_TYPE_CHANGE.getConstSortType())) {
                        colorRes = this.this$0.getColorRes(R$color.primary);
                    } else {
                        colorRes = this.this$0.getColorRes(R$color.emphasis);
                    }
                    this.$this_apply$inlined.f4288c.setColorFilter(colorRes, PorterDuff.Mode.SRC_ATOP);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
