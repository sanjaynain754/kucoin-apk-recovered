package com.kubi.home.v2.biz;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.home.api.HomeWidgetCode;
import java.util.Iterator;
import java.util.Map;
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
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pf.C43460a;
import pf.InterfaceC43461b;
import ro.C44128b;

/* JADX INFO: compiled from: FlowEventBusApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.biz.WidgetsViewLoadState$register$$inlined$bindFlowEvent$default$1", m90122f = "WidgetsViewLoadState.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 WidgetsViewLoadState.kt\ncom/kubi/home/v2/biz/WidgetsViewLoadState\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,187:1\n37#2,5:188\n42#2,6:195\n1869#3,2:193\n*S KotlinDebug\n*F\n+ 1 WidgetsViewLoadState.kt\ncom/kubi/home/v2/biz/WidgetsViewLoadState\n*L\n41#1:193,2\n*E\n"})
public final class WidgetsViewLoadState$register$$inlined$bindFlowEvent$default$1 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ Function0 $onAllLoaded$inlined;
    final /* synthetic */ boolean $onlyOnce$inlined;
    final /* synthetic */ String $uniqueKey$inlined;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetsViewLoadState$register$$inlined$bindFlowEvent$default$1(String str, Continuation continuation, String str2, boolean z11, Function0 function0) {
        super(2, continuation);
        this.$key = str;
        this.$uniqueKey$inlined = str2;
        this.$onlyOnce$inlined = z11;
        this.$onAllLoaded$inlined = function0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        WidgetsViewLoadState$register$$inlined$bindFlowEvent$default$1 widgetsViewLoadState$register$$inlined$bindFlowEvent$default$1 = new WidgetsViewLoadState$register$$inlined$bindFlowEvent$default$1(this.$key, continuation, this.$uniqueKey$inlined, this.$onlyOnce$inlined, this.$onAllLoaded$inlined);
        widgetsViewLoadState$register$$inlined$bindFlowEvent$default$1.L$0 = obj;
        return widgetsViewLoadState$register$$inlined$bindFlowEvent$default$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((WidgetsViewLoadState$register$$inlined$bindFlowEvent$default$1) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
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
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof HomeWidgetCode)) {
                    HomeWidgetCode homeWidgetCode = (HomeWidgetCode) c43460a.getData();
                    C44128b.m97268l("WidgetsViewLoadState", "widgetLoaded:" + homeWidgetCode.name());
                    Map map = (Map) WidgetsViewLoadState.f26368b.get(this.$uniqueKey$inlined);
                    if (map != null) {
                        boolean z11 = true;
                        if (map.containsKey(homeWidgetCode)) {
                            map.put(homeWidgetCode, Boxing.boxBoolean(true));
                        }
                        Iterator it = map.values().iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                z11 = false;
                            }
                        }
                        if (z11) {
                            if (this.$onlyOnce$inlined) {
                                WidgetsViewLoadState.f26368b.remove(this.$uniqueKey$inlined);
                            }
                            this.$onAllLoaded$inlined.invoke();
                            C44128b.m97268l("WidgetsViewLoadState", "onAllLoaded-notify:" + this.$uniqueKey$inlined);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
