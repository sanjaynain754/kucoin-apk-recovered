package kotlinx.coroutines.flow.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\"D\u0010\t\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, m90084d2 = {"Lkotlin/Function3;", "Lkotlinx/coroutines/flow/f;", "", "Lkotlin/coroutines/Continuation;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/jvm/functions/Function3;", "getEmitFun$annotations", "()V", "emitFun", "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SafeCollectorKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Function3<InterfaceC41635f<Object>, Object, Continuation<? super Unit>, Object> f91686a;

    static {
        SafeCollectorKt$emitFun$1 safeCollectorKt$emitFun$1 = SafeCollectorKt$emitFun$1.INSTANCE;
        Intrinsics.checkNotNull(safeCollectorKt$emitFun$1, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f91686a = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(safeCollectorKt$emitFun$1, 3);
    }
}
