package com.kubi.kucoin.quote.market;

import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p607rv.C44183g;
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

/* JADX INFO: renamed from: com.kubi.kucoin.quote.market.KuCoinMarketActivity$initListener$$inlined$bindFlowEvent$default$2 */
/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.quote.market.KuCoinMarketActivity$initListener$$inlined$bindFlowEvent$default$2", m90122f = "KuCoinMarketActivity.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 KuCoinMarketActivity.kt\ncom/kubi/kucoin/quote/market/KuCoinMarketActivity\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n520#2:188\n521#2,2:190\n523#2,4:193\n1869#3:189\n1870#3:192\n*S KotlinDebug\n*F\n+ 1 KuCoinMarketActivity.kt\ncom/kubi/kucoin/quote/market/KuCoinMarketActivity\n*L\n520#1:189\n520#1:192\n*E\n"})
public final class C15548xba400f3f extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ KuCoinMarketActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15548xba400f3f(String str, Continuation continuation, KuCoinMarketActivity kuCoinMarketActivity) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = kuCoinMarketActivity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C15548xba400f3f c15548xba400f3f = new C15548xba400f3f(this.$key, continuation, this.this$0);
        c15548xba400f3f.L$0 = obj;
        return c15548xba400f3f;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((C15548xba400f3f) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
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
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof Boolean)) {
                    boolean zBooleanValue = ((Boolean) c43460a.getData()).booleanValue();
                    for (ImageView imageView : this.this$0.m32819b2()) {
                        if (zBooleanValue) {
                            if (imageView != null) {
                                C27046k.m66700o(imageView);
                            }
                        } else if (imageView != null) {
                            C27046k.m66685H(imageView);
                        }
                    }
                    if (zBooleanValue) {
                        C44183g.f97524a.m97408f();
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
