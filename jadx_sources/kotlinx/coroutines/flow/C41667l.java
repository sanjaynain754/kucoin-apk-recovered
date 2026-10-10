package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.l */
/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a[\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001aw\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e2:\u0010\n\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"$\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"*\u0010\u001a\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "e", "(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "areEquivalent", "f", "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;", "K", "Lkotlin/Function1;", "keySelector", "g", "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/e;", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lkotlin/jvm/functions/Function1;", "defaultKeySelector", "b", "Lkotlin/jvm/functions/Function2;", "defaultAreEquivalent", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C41667l {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Function1<Object, Object> f91707a = new Function1() { // from class: kotlinx.coroutines.flow.j
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return C41667l.m90994d(obj);
        }
    };

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Function2<Object, Object, Boolean> f91708b = new Function2() { // from class: kotlinx.coroutines.flow.k
        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(C41667l.m90993c(obj, obj2));
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC41634e<T> m90995e(@NotNull InterfaceC41634e<? extends T> interfaceC41634e) {
        return interfaceC41634e instanceof InterfaceC41678w ? interfaceC41634e : m90998h(interfaceC41634e, f91707a, f91708b);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final <T> InterfaceC41634e<T> m90996f(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function2<? super T, ? super T, Boolean> function2) {
        Function1<Object, Object> function1 = f91707a;
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return m90998h(interfaceC41634e, function1, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final <T, K> InterfaceC41634e<T> m90997g(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function1<? super T, ? extends K> function1) {
        return m90998h(interfaceC41634e, function1, f91708b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final <T> InterfaceC41634e<T> m90998h(InterfaceC41634e<? extends T> interfaceC41634e, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        if (interfaceC41634e instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) interfaceC41634e;
            if (distinctFlowImpl.keySelector == function1 && distinctFlowImpl.areEquivalent == function2) {
                return interfaceC41634e;
            }
        }
        return new DistinctFlowImpl(interfaceC41634e, function1, function2);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m90993c(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    /* JADX INFO: renamed from: d */
    public static final Object m90994d(Object obj) {
        return obj;
    }
}
