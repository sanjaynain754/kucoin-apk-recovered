package com.kubi.margin.kline;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.flutter.proto.kline.ChangeToolBarModeEvent;
import com.kubi.tradebase.view.kline.KLineToolBarView;
import n30.C42727c;
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

/* JADX INFO: renamed from: com.kubi.margin.kline.MarginFlutterKlineLandscapeActivity$bindEvent$$inlined$bindFlowEvent$1 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.kline.MarginFlutterKlineLandscapeActivity$bindEvent$$inlined$bindFlowEvent$1", m90122f = "MarginFlutterKlineLandscapeActivity.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 MarginFlutterKlineLandscapeActivity.kt\ncom/kubi/margin/kline/MarginFlutterKlineLandscapeActivity\n*L\n1#1,187:1\n337#2,4:188\n*E\n"})
public final class C17688x2e70e5d1 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginFlutterKlineLandscapeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17688x2e70e5d1(String str, Continuation continuation, MarginFlutterKlineLandscapeActivity marginFlutterKlineLandscapeActivity) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = marginFlutterKlineLandscapeActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C17688x2e70e5d1 c17688x2e70e5d1 = new C17688x2e70e5d1(this.$key, continuation, this.this$0);
        c17688x2e70e5d1.L$0 = obj;
        return c17688x2e70e5d1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C17688x2e70e5d1) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        KLineToolBarView kLineToolBarView;
        KLineToolBarView kLineToolBarView2;
        KLineToolBarView kLineToolBarView3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof ChangeToolBarModeEvent)) {
                    ChangeToolBarModeEvent changeToolBarModeEvent = (ChangeToolBarModeEvent) c43460a.getData();
                    C42727c c42727cM38601h1 = this.this$0.m38601h1();
                    if (c42727cM38601h1 != null && (kLineToolBarView3 = c42727cM38601h1.f94581i) != null) {
                        kLineToolBarView3.m63437h(changeToolBarModeEvent);
                    }
                    C42727c c42727cM38601h2 = this.this$0.m38601h1();
                    if (c42727cM38601h2 != null && (kLineToolBarView2 = c42727cM38601h2.f94581i) != null) {
                        kLineToolBarView2.setEyeState(changeToolBarModeEvent.getIsHidden());
                    }
                    C42727c c42727cM38601h3 = this.this$0.m38601h1();
                    if (c42727cM38601h3 != null && (kLineToolBarView = c42727cM38601h3.f94581i) != null) {
                        kLineToolBarView.setLockState(changeToolBarModeEvent.getIsLock());
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
