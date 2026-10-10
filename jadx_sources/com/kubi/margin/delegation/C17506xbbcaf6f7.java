package com.kubi.margin.delegation;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.resources.widget.CustomViewPager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36922k0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
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

/* JADX INFO: renamed from: com.kubi.margin.delegation.MarginTradeOpenOrdersFragment$onViewCreated$lambda$8$$inlined$bindFlowEvent$default$2 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.delegation.MarginTradeOpenOrdersFragment$onViewCreated$lambda$8$$inlined$bindFlowEvent$default$2", m90122f = "MarginTradeOpenOrdersFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 MarginTradeOpenOrdersFragment.kt\ncom/kubi/margin/delegation/MarginTradeOpenOrdersFragment\n*L\n1#1,187:1\n122#2,6:188\n*E\n"})
public final class C17506xbbcaf6f7 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ C36922k0 $bmarginFragmentTradeOpenOrdersBinding$inlined;
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginTradeOpenOrdersFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17506xbbcaf6f7(String str, Continuation continuation, MarginTradeOpenOrdersFragment marginTradeOpenOrdersFragment, C36922k0 c36922k0) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = marginTradeOpenOrdersFragment;
        this.$bmarginFragmentTradeOpenOrdersBinding$inlined = c36922k0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C17506xbbcaf6f7 c17506xbbcaf6f7 = new C17506xbbcaf6f7(this.$key, continuation, this.this$0, this.$bmarginFragmentTradeOpenOrdersBinding$inlined);
        c17506xbbcaf6f7.L$0 = obj;
        return c17506xbbcaf6f7;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C17506xbbcaf6f7) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CustomViewPager customViewPager;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof Pair)) {
                    boolean zBooleanValue = ((Boolean) ((Pair) c43460a.getData()).getFirst()).booleanValue();
                    if (this.this$0.isShowing()) {
                        C36922k0 c36922k0 = this.$bmarginFragmentTradeOpenOrdersBinding$inlined;
                        boolean z11 = false;
                        if (c36922k0 != null && (customViewPager = c36922k0.f81775g) != null && customViewPager.getCurrentItem() == 1) {
                            z11 = true;
                        }
                        if (zBooleanValue == z11) {
                            this.this$0.m38114y3();
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
