package com.kubi.mart.sidebar.spot.tablist;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.mart.api.entity.MartChangeSymbolEvent;
import com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabFragment.C18887a;
import com.kubi.utils.C27100x0;
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

/* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1", m90122f = "SpotSidebarTabFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 SpotSidebarTabFragment.kt\ncom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabFragment\n*L\n1#1,187:1\n108#2,3:188\n*E\n"})
public final class C18888xa35715ca extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SpotSidebarTabFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18888xa35715ca(String str, Continuation continuation, SpotSidebarTabFragment spotSidebarTabFragment) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = spotSidebarTabFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C18888xa35715ca c18888xa35715ca = new C18888xa35715ca(this.$key, continuation, this.this$0);
        c18888xa35715ca.L$0 = obj;
        return c18888xa35715ca;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C18888xa35715ca) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof MartChangeSymbolEvent)) {
                    MartChangeSymbolEvent martChangeSymbolEvent = (MartChangeSymbolEvent) c43460a.getData();
                    if (Intrinsics.areEqual(martChangeSymbolEvent.getSidebarType(), this.this$0.getSidebarType())) {
                        this.this$0.f34808W = martChangeSymbolEvent.getSymbolCode();
                    }
                    C27100x0.m66923d(this.this$0.new C18887a());
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
