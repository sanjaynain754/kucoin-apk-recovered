package com.kubi.margin.market;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.kumex.constant.KlineScrollOffset;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27040e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36901a;
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
import p852kotlin.ranges.RangesKt;
import pf.C43460a;
import pf.InterfaceC43461b;

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.market.MarginMarketActivity$onCreate$$inlined$bindFlowEvent$default$3", m90122f = "MarginMarketActivity.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 MarginMarketActivity.kt\ncom/kubi/margin/market/MarginMarketActivity\n*L\n1#1,187:1\n364#2,21:188\n*E\n"})
public final class MarginMarketActivity$onCreate$$inlined$bindFlowEvent$default$3 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginMarketActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginMarketActivity$onCreate$$inlined$bindFlowEvent$default$3(String str, Continuation continuation, MarginMarketActivity marginMarketActivity) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = marginMarketActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        MarginMarketActivity$onCreate$$inlined$bindFlowEvent$default$3 marginMarketActivity$onCreate$$inlined$bindFlowEvent$default$3 = new MarginMarketActivity$onCreate$$inlined$bindFlowEvent$default$3(this.$key, continuation, this.this$0);
        marginMarketActivity$onCreate$$inlined$bindFlowEvent$default$3.L$0 = obj;
        return marginMarketActivity$onCreate$$inlined$bindFlowEvent$default$3;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((MarginMarketActivity$onCreate$$inlined$bindFlowEvent$default$3) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof KlineScrollOffset)) {
                    KlineScrollOffset klineScrollOffset = (KlineScrollOffset) c43460a.getData();
                    if (Intrinsics.areEqual(klineScrollOffset.getSymbol(), this.this$0.m38718L1().getSymbol())) {
                        float fCoerceAtLeast = RangesKt.coerceAtLeast((float) (klineScrollOffset.getOffset() / ((double) 2)), 0.0f);
                        this.this$0.f33196M = fCoerceAtLeast;
                        if (!this.this$0.m38726Q1()) {
                            this.this$0.m38797v1(fCoerceAtLeast);
                        } else {
                            C36901a c36901aM38810J1 = this.this$0.m38810J1();
                            if (c36901aM38810J1 != null && (baseTextView3 = c36901aM38810J1.f81565l) != null) {
                                baseTextView3.setTranslationY(-C27040e.m66657a(8.3f));
                            }
                            C36901a c36901aM38810J2 = this.this$0.m38810J1();
                            if (c36901aM38810J2 != null && (baseTextView2 = c36901aM38810J2.f81567n) != null) {
                                baseTextView2.setTranslationY(-C27040e.m66657a(8.3f));
                            }
                            C36901a c36901aM38810J3 = this.this$0.m38810J1();
                            boolean z11 = false;
                            if (c36901aM38810J3 != null && (baseTextView = c36901aM38810J3.f81566m) != null) {
                                baseTextView.setTranslationY(0.0f);
                                baseTextView.setVisibility(0);
                                baseTextView.setAlpha(1.0f);
                            }
                            if (fCoerceAtLeast >= this.this$0.f33197N) {
                                z11 = true;
                            }
                            if (this.this$0.f33195L != z11) {
                                this.this$0.f33195L = z11;
                                this.this$0.m38697A2();
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
