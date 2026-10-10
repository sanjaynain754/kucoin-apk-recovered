package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.assets.entity.EarnAccountItem;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.C41658l;
import og0.C43045a0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.x */
/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlinx/coroutines/flow/n;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;", "Lkotlinx/coroutines/flow/w;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/e;", "d", "(Lkotlinx/coroutines/flow/w;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/e;", "Log0/a0;", "Log0/a0;", "NONE", "b", EarnAccountItem.STATUS_DUAL_PENDING, "kotlinx-coroutines-core"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1#2:434\n*E\n"})
public final class C41679x {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43045a0 f91721a = new C43045a0("NONE");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C43045a0 f91722b = new C43045a0(EarnAccountItem.STATUS_DUAL_PENDING);

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> InterfaceC41669n<T> m91009a(T t11) {
        if (t11 == null) {
            t11 = (T) C41658l.f91700a;
        }
        return new StateFlowImpl(t11);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC41634e<T> m91012d(@NotNull InterfaceC41678w<? extends T> interfaceC41678w, @NotNull CoroutineContext coroutineContext, int i11, @NotNull BufferOverflow bufferOverflow) {
        return (((i11 < 0 || i11 >= 2) && i11 != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? C41674s.m91004e(interfaceC41678w, coroutineContext, i11, bufferOverflow) : interfaceC41678w;
    }
}
