package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.r */
/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m90084d2 = {"Lkotlinx/coroutines/flow/internal/r;", "Lkotlinx/coroutines/flow/w;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "initialValue", "<init>", "(I)V", "delta", "", "Z", "(I)Z", "Y", "()Ljava/lang/Integer;", "value", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,130:1\n29#2:131\n29#2:133\n16#3:132\n16#3:134\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow\n*L\n124#1:131\n126#1:133\n124#1:132\n126#1:134\n*E\n"})
public final class C41664r extends SharedFlowImpl<Integer> implements InterfaceC41678w<Integer> {
    @Override // kotlinx.coroutines.flow.InterfaceC41678w
    @NotNull
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(m90840L().intValue());
        }
        return numValueOf;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m90990Z(int delta) {
        boolean zMo90855d;
        synchronized (this) {
            zMo90855d = mo90855d(Integer.valueOf(m90840L().intValue() + delta));
        }
        return zMo90855d;
    }

    public C41664r(int i11) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        mo90855d(Integer.valueOf(i11));
    }
}
