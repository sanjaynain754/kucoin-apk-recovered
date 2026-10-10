package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Arrays;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.internal.AbstractC41649c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.a */
/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00028\u0000H$¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b2\u0006\u0010\n\u001a\u00020\tH$¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0011\u0010\u0012R8\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b2\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u000b8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0$8F¢\u0006\u0006\u001a\u0004\b!\u0010%¨\u0006'"}, m90084d2 = {"Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/internal/c;", ExifInterface.LATITUDE_SOUTH, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "i", "()Lkotlinx/coroutines/flow/internal/c;", "", "size", "", "j", "(I)[Lkotlinx/coroutines/flow/internal/c;", CmcdData.Factory.STREAMING_FORMAT_HLS, "slot", "", "k", "(Lkotlinx/coroutines/flow/internal/c;)V", "value", "b", "[Lkotlinx/coroutines/flow/internal/c;", "m", "()[Lkotlinx/coroutines/flow/internal/c;", "slots", "c", "I", CmcdData.Factory.STREAM_TYPE_LIVE, "()I", "nCollectors", "d", "nextIndex", "Lkotlinx/coroutines/flow/internal/r;", "e", "Lkotlinx/coroutines/flow/internal/r;", "_subscriptionCount", "Lkotlinx/coroutines/flow/w;", "()Lkotlinx/coroutines/flow/w;", "subscriptionCount", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,130:1\n29#2:131\n29#2:133\n29#2:136\n16#3:132\n16#3:134\n16#3:137\n1#4:135\n13402#5,2:138\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n*L\n27#1:131\n42#1:133\n73#1:136\n27#1:132\n42#1:134\n73#1:137\n92#1:138,2\n*E\n"})
public abstract class AbstractC41647a<S extends AbstractC41649c<?>> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public S[] slots;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int nCollectors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int nextIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public C41664r _subscriptionCount;

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC41678w<Integer> m90971e() {
        C41664r c41664r;
        synchronized (this) {
            c41664r = this._subscriptionCount;
            if (c41664r == null) {
                c41664r = new C41664r(this.nCollectors);
                this._subscriptionCount = c41664r;
            }
        }
        return c41664r;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final S m90972h() {
        S s11;
        C41664r c41664r;
        synchronized (this) {
            try {
                S[] sArr = this.slots;
                if (sArr == null) {
                    sArr = (S[]) mo90857j(2);
                    this.slots = sArr;
                } else if (this.nCollectors >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.slots = (S[]) ((AbstractC41649c[]) objArrCopyOf);
                    sArr = (S[]) ((AbstractC41649c[]) objArrCopyOf);
                }
                int i11 = this.nextIndex;
                do {
                    s11 = sArr[i11];
                    if (s11 == null) {
                        s11 = (S) mo90856i();
                        sArr[i11] = s11;
                    }
                    i11++;
                    if (i11 >= sArr.length) {
                        i11 = 0;
                    }
                    Intrinsics.checkNotNull(s11, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s11.mo90976a(this));
                this.nextIndex = i11;
                this.nCollectors++;
                c41664r = this._subscriptionCount;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c41664r != null) {
            c41664r.m90990Z(1);
        }
        return s11;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public abstract S mo90856i();

    @NotNull
    /* JADX INFO: renamed from: j */
    public abstract S[] mo90857j(int size);

    /* JADX INFO: renamed from: k */
    public final void m90973k(@NotNull S slot) {
        C41664r c41664r;
        int i11;
        Continuation<Unit>[] continuationArrMo90977b;
        synchronized (this) {
            try {
                int i12 = this.nCollectors - 1;
                this.nCollectors = i12;
                c41664r = this._subscriptionCount;
                if (i12 == 0) {
                    this.nextIndex = 0;
                }
                Intrinsics.checkNotNull(slot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                continuationArrMo90977b = slot.mo90977b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation<Unit> continuation : continuationArrMo90977b) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
            }
        }
        if (c41664r != null) {
            c41664r.m90990Z(-1);
        }
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getNCollectors() {
        return this.nCollectors;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final S[] m90975m() {
        return this.slots;
    }
}
