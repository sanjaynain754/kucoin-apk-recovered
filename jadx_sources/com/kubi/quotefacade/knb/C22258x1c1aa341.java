package com.kubi.quotefacade.knb;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.InterfaceC41775x1;
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
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.quotefacade.knb.KCFlutterBridgePostCallImpl$getFlutterViewDistanceToBottom$$inlined$bindFlowEvent$default$1 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.knb.KCFlutterBridgePostCallImpl$getFlutterViewDistanceToBottom$$inlined$bindFlowEvent$default$1", m90122f = "KCFlutterBridgePostCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 KCFlutterBridgePostCallImpl.kt\ncom/kubi/quotefacade/knb/KCFlutterBridgePostCallImpl\n*L\n1#1,187:1\n267#2,5:188\n*E\n"})
public final class C22258x1c1aa341 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2 $callback$inlined;
    final /* synthetic */ Ref.ObjectRef $job$inlined;
    final /* synthetic */ String $key;
    final /* synthetic */ String $sence$inlined;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KCFlutterBridgePostCallImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22258x1c1aa341(String str, Continuation continuation, KCFlutterBridgePostCallImpl kCFlutterBridgePostCallImpl, String str2, Function2 function2, Ref.ObjectRef objectRef) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = kCFlutterBridgePostCallImpl;
        this.$sence$inlined = str2;
        this.$callback$inlined = function2;
        this.$job$inlined = objectRef;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C22258x1c1aa341 c22258x1c1aa341 = new C22258x1c1aa341(this.$key, continuation, this.this$0, this.$sence$inlined, this.$callback$inlined, this.$job$inlined);
        c22258x1c1aa341.L$0 = obj;
        return c22258x1c1aa341;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C22258x1c1aa341) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
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
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof Integer)) {
                    int iIntValue = ((Number) c43460a.getData()).intValue();
                    C44128b.m97259c(this.this$0.getF42157a(), "tag getFlutterViewDistanceToBottom: distance = " + iIntValue + "  sence = " + this.$sence$inlined);
                    this.$callback$inlined.invoke(Boxing.boxLong((long) iIntValue), null);
                    InterfaceC41775x1 interfaceC41775x1 = (InterfaceC41775x1) this.$job$inlined.element;
                    if (interfaceC41775x1 != null) {
                        InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
