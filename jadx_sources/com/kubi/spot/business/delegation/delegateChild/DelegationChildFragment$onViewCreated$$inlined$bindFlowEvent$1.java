package com.kubi.spot.business.delegation.delegateChild;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import com.kubi.spot.business.BaseTradeFragment;
import com.kubi.spot.dialog.order.model.AmendContext;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.delegation.delegateChild.DelegationChildFragment$onViewCreated$$inlined$bindFlowEvent$1", m90122f = "DelegationChildFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 DelegationChildFragment.kt\ncom/kubi/spot/business/delegation/delegateChild/DelegationChildFragment\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n290#2,2:188\n292#2,9:192\n301#2,3:202\n1878#3,2:190\n1880#3:201\n*S KotlinDebug\n*F\n+ 1 DelegationChildFragment.kt\ncom/kubi/spot/business/delegation/delegateChild/DelegationChildFragment\n*L\n291#1:190,2\n291#1:201\n*E\n"})
public final class DelegationChildFragment$onViewCreated$$inlined$bindFlowEvent$1 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DelegationChildFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegationChildFragment$onViewCreated$$inlined$bindFlowEvent$1(String str, Continuation continuation, DelegationChildFragment delegationChildFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = delegationChildFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DelegationChildFragment$onViewCreated$$inlined$bindFlowEvent$1 delegationChildFragment$onViewCreated$$inlined$bindFlowEvent$1 = new DelegationChildFragment$onViewCreated$$inlined$bindFlowEvent$1(this.$key, continuation, this.this$0);
        delegationChildFragment$onViewCreated$$inlined$bindFlowEvent$1.L$0 = obj;
        return delegationChildFragment$onViewCreated$$inlined$bindFlowEvent$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((DelegationChildFragment$onViewCreated$$inlined$bindFlowEvent$1) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Fragment parentFragment;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof AmendContext)) {
                    AmendContext amendContext = (AmendContext) c43460a.getData();
                    if (!this.this$0.f46495W.getData().isEmpty()) {
                        List data = this.this$0.f46495W.getData();
                        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                        Iterator it = data.iterator();
                        int i11 = 0;
                        while (true) {
                            BaseTradeFragment baseTradeFragment = null;
                            if (it.hasNext()) {
                                Object next = it.next();
                                int i12 = i11 + 1;
                                if (i11 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                DelegationEntity delegationEntity = (DelegationEntity) next;
                                if (Intrinsics.areEqual(delegationEntity.getOrderId(), amendContext.getOldOrder().getOrderId())) {
                                    delegationEntity.setOrderId(amendContext.getNewParams().getOrderId());
                                    delegationEntity.setSize(DowngradeExKt.m66535e(amendContext.getNewParams().getNewSize(), null, 1, null));
                                    delegationEntity.setPrice(DowngradeExKt.m66535e(amendContext.getNewParams().getNewPrice(), null, 1, null));
                                    delegationEntity.setDealSize(BigDecimal.ZERO);
                                    this.this$0.f46495W.notifyItemChanged(i11);
                                    break;
                                }
                                i11 = i12;
                            } else {
                                Fragment parentFragment2 = this.this$0.getParentFragment();
                                if (parentFragment2 != null) {
                                    parentFragment = parentFragment2.getParentFragment();
                                } else {
                                    parentFragment = null;
                                }
                                if (parentFragment instanceof BaseTradeFragment) {
                                    baseTradeFragment = (BaseTradeFragment) parentFragment;
                                }
                                if (baseTradeFragment == null) {
                                    break;
                                }
                                baseTradeFragment.mo60199m2();
                                break;
                            }
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
