package com.kubi.p110rn.core;

import androidx.exifinterface.media.ExifInterface;
import com.kubi.p110rn.entity.RnSensorReport;
import com.kubi.p110rn.exception.RNException;
import com.kubi.utils.extensions.core.C27029c;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
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
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@¨\u0006\u0005"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lcom/kubi/event/entity/IFlowEvent;", "com/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.rn.core.ReactStateContext$initConfig$$inlined$bindFlowEvent$default$1", m90122f = "ReactStateContext.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFlowEventBusApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt$bindFlowEvent$1\n+ 2 ReactStateContext.kt\ncom/kubi/rn/core/ReactStateContext\n+ 3 RNIssue.kt\ncom/kubi/rn/exception/RNIssueKt\n*L\n1#1,187:1\n74#2,26:188\n101#2:216\n45#3,2:214\n*S KotlinDebug\n*F\n+ 1 ReactStateContext.kt\ncom/kubi/rn/core/ReactStateContext\n*L\n99#1:214,2\n*E\n"})
public final class ReactStateContext$initConfig$$inlined$bindFlowEvent$default$1 extends SuspendLambda implements Function2<InterfaceC43461b, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ ReactInitParam $param$inlined;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ReactStateContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactStateContext$initConfig$$inlined$bindFlowEvent$default$1(String str, Continuation continuation, ReactStateContext reactStateContext, ReactInitParam reactInitParam) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = reactStateContext;
        this.$param$inlined = reactInitParam;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ReactStateContext$initConfig$$inlined$bindFlowEvent$default$1 reactStateContext$initConfig$$inlined$bindFlowEvent$default$1 = new ReactStateContext$initConfig$$inlined$bindFlowEvent$default$1(this.$key, continuation, this.this$0, this.$param$inlined);
        reactStateContext$initConfig$$inlined$bindFlowEvent$default$1.L$0 = obj;
        return reactStateContext$initConfig$$inlined$bindFlowEvent$default$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC43461b interfaceC43461b, @Nullable Continuation<? super Unit> continuation) {
        return ((ReactStateContext$initConfig$$inlined$bindFlowEvent$default$1) create(interfaceC43461b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String string;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC43461b interfaceC43461b = (InterfaceC43461b) this.L$0;
            if (interfaceC43461b instanceof C43460a) {
                C43460a c43460a = (C43460a) interfaceC43461b;
                if (Intrinsics.areEqual(c43460a.getKeyEvent(), this.$key) && (c43460a.getData() instanceof Map)) {
                    Map map = (Map) c43460a.getData();
                    try {
                        C44128b.m97259c(ReactStateContext.TAG, "pageMountData: " + C27029c.m66606i(map));
                        RnSensorReport rnSensorReport = this.this$0.rnSensorReport;
                        Object obj2 = map.get("subPath");
                        if (obj2 == null || (string = obj2.toString()) == null) {
                            string = "";
                        }
                        rnSensorReport.setSubPath(string);
                        RnSensorReport rnSensorReport2 = this.this$0.rnSensorReport;
                        Object obj3 = map.get("pageMount");
                        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Long");
                        rnSensorReport2.setPageMount((int) (((Long) obj3).longValue() - this.this$0.startTime));
                        RnBreadcrumbs.INSTANCE.pageMount(this.this$0.rnSensorReport.getBiz(), this.$param$inlined.getEntry(), this.$param$inlined.getComponent(), this.this$0.version, this.this$0.rnSensorReport.getSubPath(), this.this$0.rnSensorReport.getPageMount());
                        Function0<Unit> onPageMountListener = this.this$0.getOnPageMountListener();
                        if (onPageMountListener != null) {
                            onPageMountListener.invoke();
                        }
                        this.this$0.setOnPageMountListener(null);
                    } catch (Exception e11) {
                        C43846g.m96568c(new RNException(e11, "pageMountData", false, null, 8, null), null, 2, null);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
