package com.kubi.margin.delegation;

import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import com.kubi.margin.exception.MarginException;
import com.kubi.margin.trade.DelegationDataHelper;
import com.kubi.spot.entity.DelegationEntity;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
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

/* JADX INFO: renamed from: com.kubi.margin.delegation.MarginDelegationChildFragment$bindOrderUpdate$$inlined$bindFlowEvent$default$1 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.delegation.MarginDelegationChildFragment$bindOrderUpdate$$inlined$bindFlowEvent$default$1", m90122f = "MarginDelegationChildFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 MarginDelegationChildFragment.kt\ncom/kubi/margin/delegation/MarginDelegationChildFragment\n+ 3 MarginIssue.kt\ncom/kubi/margin/exception/MarginIssueKt\n*L\n1#1,187:1\n429#2,47:188\n476#2,2:237\n44#3,2:235\n*S KotlinDebug\n*F\n+ 1 MarginDelegationChildFragment.kt\ncom/kubi/margin/delegation/MarginDelegationChildFragment\n*L\n475#1:235,2\n*E\n"})
public final class C17500xe2b1c894 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginDelegationChildFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17500xe2b1c894(String str, Continuation continuation, MarginDelegationChildFragment marginDelegationChildFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = marginDelegationChildFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C17500xe2b1c894 c17500xe2b1c894 = new C17500xe2b1c894(this.$key, continuation, this.this$0);
        c17500xe2b1c894.L$0 = obj;
        return c17500xe2b1c894;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C17500xe2b1c894) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objM103844constructorimpl;
        Map<String, ? extends Object> map;
        String string;
        BigDecimal bigDecimal;
        String string2;
        MarginTradeOpenOrdersFragment marginTradeOpenOrdersFragment;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof Pair)) {
                    Pair pair = (Pair) c43460a.getData();
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
                        boolean zAreEqual = Intrinsics.areEqual(this.this$0.getType(), InterfaceC33730j9.f70350a);
                        if (this.this$0.isShowing() && zBooleanValue == zAreEqual) {
                            if (pair.getSecond() instanceof DelegationEntity) {
                                Object second = pair.getSecond();
                                Intrinsics.checkNotNull(second, "null cannot be cast to non-null type com.kubi.spot.entity.DelegationEntity");
                                DelegationEntity delegationEntity = (DelegationEntity) second;
                                MarginDelegationChildFragment marginDelegationChildFragment = this.this$0;
                                List data = marginDelegationChildFragment.f46495W.getData();
                                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                                Pair pairM38070l4 = marginDelegationChildFragment.m38070l4(data, new MarginDelegationChildFragment.C17499b(delegationEntity));
                                if (pairM38070l4 == null) {
                                    this.this$0.f46495W.addData(0, delegationEntity);
                                    this.this$0.f46495W.notifyItemInserted(0);
                                } else {
                                    ((DelegationEntity) pairM38070l4.getSecond()).setDealSize(delegationEntity.getDealSize());
                                    this.this$0.f46495W.notifyItemChanged(((Number) pairM38070l4.getFirst()).intValue());
                                }
                            } else {
                                Object second2 = pair.getSecond();
                                if (second2 instanceof Map) {
                                    map = (Map) second2;
                                } else {
                                    map = null;
                                }
                                if (map != null) {
                                    Object obj2 = map.get("orderId");
                                    if (obj2 != null) {
                                        string = obj2.toString();
                                    } else {
                                        string = null;
                                    }
                                    MarginDelegationChildFragment marginDelegationChildFragment2 = this.this$0;
                                    List data2 = marginDelegationChildFragment2.f46495W.getData();
                                    Intrinsics.checkNotNullExpressionValue(data2, "getData(...)");
                                    Pair pairM38070l5 = marginDelegationChildFragment2.m38070l4(data2, new MarginDelegationChildFragment.C17498a(string));
                                    if (pairM38070l5 != null) {
                                        DelegationDataHelper delegationDataHelper = DelegationDataHelper.f33714a;
                                        if (delegationDataHelper.m40001N(map)) {
                                            this.this$0.f46495W.getData().remove(pairM38070l5.getSecond());
                                            this.this$0.f46495W.notifyItemRemoved(((Number) pairM38070l5.getFirst()).intValue());
                                        } else if (delegationDataHelper.m39999L(map)) {
                                            DelegationEntity delegationEntity2 = (DelegationEntity) pairM38070l5.getSecond();
                                            Object obj3 = map.get("filledSize");
                                            if (obj3 != null && (string2 = obj3.toString()) != null) {
                                                bigDecimal = new BigDecimal(string2);
                                            } else {
                                                bigDecimal = null;
                                            }
                                            delegationEntity2.setDealSize(bigDecimal);
                                            this.this$0.f46495W.notifyItemChanged(((Number) pairM38070l5.getFirst()).intValue());
                                        }
                                    }
                                }
                            }
                            if (this.this$0.f46495W.getData().isEmpty()) {
                                this.this$0.showEmpty();
                            } else {
                                this.this$0.showContent();
                            }
                            Fragment parentFragment = this.this$0.getParentFragment();
                            if (parentFragment instanceof MarginTradeOpenOrdersFragment) {
                                marginTradeOpenOrdersFragment = (MarginTradeOpenOrdersFragment) parentFragment;
                            } else {
                                marginTradeOpenOrdersFragment = null;
                            }
                            if (marginTradeOpenOrdersFragment != null) {
                                List<DelegationEntity> data3 = this.this$0.f46495W.getData();
                                Intrinsics.checkNotNullExpressionValue(data3, "getData(...)");
                                marginTradeOpenOrdersFragment.m38106D3(data3, Intrinsics.areEqual(this.this$0.getType(), "active"));
                            }
                        }
                        objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                    }
                    Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl != null) {
                        C43846g.m96568c(new MarginException(thM103847exceptionOrNullimpl, "ACTION_ORDER_CHANGED", false, null, 8, null), null, 2, null);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
