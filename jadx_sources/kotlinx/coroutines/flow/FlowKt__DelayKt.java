package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.channels.InterfaceC41576o;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.OverloadResolutionByLambdaReturnType;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\b\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\u0005\u001a!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0005\u001a-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0005¨\u0006\u0017"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/e;", "", "timeoutMillis", "b", "(Lkotlinx/coroutines/flow/e;J)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function1;", "c", "(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/e;", "timeoutMillisSelector", "e", "periodMillis", "g", "Lkotlinx/coroutines/m0;", "delayMillis", "Lkotlinx/coroutines/channels/o;", "", "f", "(Lkotlinx/coroutines/m0;J)Lkotlinx/coroutines/channels/o;", "Lkotlin/time/Duration;", "timeout", CmcdData.Factory.STREAMING_FORMAT_HLS, "i", "kotlinx-coroutines-core"}, m90085k = 5, m90086mv = {2, 1, 0}, m90088xi = 48, m90089xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1#2:408\n*E\n"})
public final /* synthetic */ class FlowKt__DelayKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> InterfaceC41634e<T> m90763b(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, final long j11) {
        if (j11 >= 0) {
            return j11 == 0 ? interfaceC41634e : m90766e(interfaceC41634e, new Function1() { // from class: kotlinx.coroutines.flow.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(FlowKt__DelayKt.m90765d(j11, obj));
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    /* JADX INFO: renamed from: e */
    public static final <T> InterfaceC41634e<T> m90766e(InterfaceC41634e<? extends T> interfaceC41634e, Function1<? super T, Long> function1) {
        return FlowCoroutineKt.m90962b(new FlowKt__DelayKt$debounceInternal$1(function1, interfaceC41634e, null));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final InterfaceC41576o<Unit> m90767f(@NotNull InterfaceC41709m0 interfaceC41709m0, long j11) {
        return ProduceKt.m90684d(interfaceC41709m0, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(j11, null), 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final <T> InterfaceC41634e<T> m90768g(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, long j11) {
        if (j11 > 0) {
            return FlowCoroutineKt.m90962b(new FlowKt__DelayKt$sample$2(j11, interfaceC41634e, null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }

    /* JADX INFO: renamed from: i */
    public static final <T> InterfaceC41634e<T> m90770i(InterfaceC41634e<? extends T> interfaceC41634e, long j11) {
        return FlowCoroutineKt.m90962b(new FlowKt__DelayKt$timeoutInternal$1(j11, interfaceC41634e, null));
    }

    @OverloadResolutionByLambdaReturnType
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> InterfaceC41634e<T> m90764c(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, @NotNull Function1<? super T, Long> function1) {
        return m90766e(interfaceC41634e, function1);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final <T> InterfaceC41634e<T> m90769h(@NotNull InterfaceC41634e<? extends T> interfaceC41634e, long j11) {
        return m90770i(interfaceC41634e, j11);
    }

    /* JADX INFO: renamed from: d */
    public static final long m90765d(long j11, Object obj) {
        return j11;
    }
}
