package com.kubi.kumex.market.p091v2;

import androidx.appcompat.widget.AppCompatImageView;
import com.kubi.utils.extensions.C27046k;
import dm.C36744c4;
import dm.C36856v2;
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

/* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$bindFlowEvent$$inlined$bindFlowEvent$default$7 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¨\u0006\u0004"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.market.v2.KuMexMarketInfoFragment$bindFlowEvent$$inlined$bindFlowEvent$default$7", m90122f = "KuMexMarketInfoFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$4\n+ 2 KuMexMarketInfoFragment.kt\ncom/kubi/kumex/market/v2/KuMexMarketInfoFragment\n*L\n1#1,187:1\n386#2,9:188\n*E\n"})
public final class C16333x201f11eb extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KuMexMarketInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16333x201f11eb(String str, Continuation continuation, KuMexMarketInfoFragment kuMexMarketInfoFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = kuMexMarketInfoFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C16333x201f11eb c16333x201f11eb = new C16333x201f11eb(this.$key, continuation, this.this$0);
        c16333x201f11eb.L$0 = obj;
        return c16333x201f11eb;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C16333x201f11eb) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C36744c4 c36744c4;
        AppCompatImageView appCompatImageView;
        C36856v2 c36856v2M34875u4;
        C36744c4 c36744c5;
        AppCompatImageView appCompatImageView2;
        C36856v2 c36856v2M34875u5;
        C36744c4 c36744c6;
        AppCompatImageView appCompatImageView3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if ((interfaceC43461b instanceof C43460a) && Intrinsics.areEqual(((C43460a) interfaceC43461b).getKeyEvent(), this.$key)) {
                KuMexMarketInfoFragment kuMexMarketInfoFragment = this.this$0;
                String str = kuMexMarketInfoFragment.f29632V;
                if (str == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("symbol");
                    str = null;
                }
                kuMexMarketInfoFragment.m34871r5(str);
                if (this.this$0.f29643g0 && (c36856v2M34875u5 = this.this$0.m34875u4()) != null && (c36744c6 = c36856v2M34875u5.f81239g) != null && (appCompatImageView3 = c36744c6.f79829k) != null) {
                    C27046k.m66685H(appCompatImageView3);
                }
                if (this.this$0.f29644h0 && (c36856v2M34875u4 = this.this$0.m34875u4()) != null && (c36744c5 = c36856v2M34875u4.f81239g) != null && (appCompatImageView2 = c36744c5.f79820b) != null) {
                    C27046k.m66685H(appCompatImageView2);
                }
                C36856v2 c36856v2M34875u6 = this.this$0.m34875u4();
                if (c36856v2M34875u6 != null && (c36744c4 = c36856v2M34875u6.f81239g) != null && (appCompatImageView = c36744c4.f79823e) != null) {
                    C27046k.m66685H(appCompatImageView);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
