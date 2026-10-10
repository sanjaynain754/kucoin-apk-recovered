package com.kubi.kumex.market.p091v2;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.kumex.constant.KlineScrollOffset;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.core.ViewExtKt;
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
import p852kotlin.ranges.RangesKt;
import pf.C43460a;
import pf.InterfaceC43461b;

/* JADX INFO: renamed from: com.kubi.kumex.market.v2.KuMexMarketInfoFragment$bindAdapter$$inlined$bindFlowEvent$default$1 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kumex.market.v2.KuMexMarketInfoFragment$bindAdapter$$inlined$bindFlowEvent$default$1", m90122f = "KuMexMarketInfoFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 KuMexMarketInfoFragment.kt\ncom/kubi/kumex/market/v2/KuMexMarketInfoFragment\n*L\n1#1,187:1\n833#2,41:188\n*E\n"})
public final class C16325xa6c00942 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ C36856v2 $binding$inlined;
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KuMexMarketInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16325xa6c00942(String str, Continuation continuation, KuMexMarketInfoFragment kuMexMarketInfoFragment, C36856v2 c36856v2) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = kuMexMarketInfoFragment;
        this.$binding$inlined = c36856v2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C16325xa6c00942 c16325xa6c00942 = new C16325xa6c00942(this.$key, continuation, this.this$0, this.$binding$inlined);
        c16325xa6c00942.L$0 = obj;
        return c16325xa6c00942;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C16325xa6c00942) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
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
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof KlineScrollOffset)) {
                    KlineScrollOffset klineScrollOffset = (KlineScrollOffset) c43460a.getData();
                    String symbol = klineScrollOffset.getSymbol();
                    String str = this.this$0.f29632V;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("symbol");
                        str = null;
                    }
                    if (Intrinsics.areEqual(symbol, str)) {
                        float fCoerceAtLeast = RangesKt.coerceAtLeast((float) (klineScrollOffset.getOffset() / ((double) 2)), 0.0f);
                        this.this$0.f29653q0 = fCoerceAtLeast;
                        boolean z11 = false;
                        if (this.$binding$inlined.f81239g.f79827i.getVisibility() == 0) {
                            this.$binding$inlined.f81239g.f79824f.setTranslationY(0.0f);
                            float fCoerceIn = RangesKt.coerceIn(this.this$0.f29654r0 - fCoerceAtLeast, 0.0f, this.this$0.f29654r0);
                            this.$binding$inlined.f81239g.f79832n.setTranslationY(fCoerceIn);
                            BaseTextView tvCoinpairsPrice = this.$binding$inlined.f81239g.f79832n;
                            Intrinsics.checkNotNullExpressionValue(tvCoinpairsPrice, "tvCoinpairsPrice");
                            if (ViewExtKt.m66580k(tvCoinpairsPrice)) {
                                this.$binding$inlined.f81239g.f79832n.setVisibility(0);
                            }
                            if (this.this$0.m34756D4()) {
                                this.this$0.m34758E5();
                            }
                            float f11 = 1.0f - (fCoerceIn / this.this$0.f29654r0);
                            this.$binding$inlined.f81239g.f79832n.setAlpha(f11);
                            this.$binding$inlined.f81239g.f79827i.setAlpha(1.0f - f11);
                        } else if (!this.this$0.m34756D4()) {
                            this.$binding$inlined.f81239g.f79827i.setAlpha(1.0f);
                            this.this$0.m34824m4(fCoerceAtLeast);
                        } else {
                            this.$binding$inlined.f81239g.f79827i.setAlpha(1.0f);
                            this.$binding$inlined.f81239g.f79824f.setTranslationY(-C27040e.m66657a(8.3f));
                            this.$binding$inlined.f81239g.f79832n.setTranslationY(0.0f);
                            BaseTextView tvCoinpairsPrice2 = this.$binding$inlined.f81239g.f79832n;
                            Intrinsics.checkNotNullExpressionValue(tvCoinpairsPrice2, "tvCoinpairsPrice");
                            if (ViewExtKt.m66580k(tvCoinpairsPrice2)) {
                                this.$binding$inlined.f81239g.f79832n.setVisibility(0);
                            }
                            this.$binding$inlined.f81239g.f79832n.setAlpha(1.0f);
                            if (fCoerceAtLeast >= this.this$0.f29654r0) {
                                z11 = true;
                            }
                            if (this.this$0.f29652p0 != z11) {
                                this.this$0.f29652p0 = z11;
                                this.this$0.m34762G5();
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
