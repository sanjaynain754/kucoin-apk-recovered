package kotlinx.coroutines;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.a0, reason: from toString */
/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0084\u0001\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012O\b\u0002\u0010\u000f\u001aI\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u000e2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0095\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042O\b\u0002\u0010\u000f\u001aI\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R[\u0010\u000f\u001aI\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b'\u0010+¨\u0006-"}, m90084d2 = {"Lkotlinx/coroutines/a0;", "R", "", DbParams.KEY_CHANNEL_RESULT, "Lkotlinx/coroutines/l;", "cancelHandler", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cause", "value", "Lkotlin/coroutines/CoroutineContext;", "context", "", "onCancellation", "idempotentResume", "cancelCause", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/l;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/o;", "cont", "d", "(Lkotlinx/coroutines/o;Ljava/lang/Throwable;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;Lkotlinx/coroutines/l;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Throwable;)Lkotlinx/coroutines/a0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "b", "Lkotlinx/coroutines/l;", "c", "Lkotlin/jvm/functions/Function3;", "e", "Ljava/lang/Throwable;", "()Z", "cancelled", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CompletedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,701:1\n1#2:702\n*E\n"})
public final /* data */ class CompletedContinuation<R> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @JvmField
    public final R result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @JvmField
    @Nullable
    public final InterfaceC41704l cancelHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @JvmField
    @Nullable
    public final Function3<Throwable, R, CoroutineContext, Unit> onCancellation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @JvmField
    @Nullable
    public final Object idempotentResume;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @JvmField
    @Nullable
    public final Throwable cancelCause;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletedContinuation(R r11, @Nullable InterfaceC41704l interfaceC41704l, @Nullable Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> function3, @Nullable Object obj, @Nullable Throwable th2) {
        this.result = r11;
        this.cancelHandler = interfaceC41704l;
        this.onCancellation = function3;
        this.idempotentResume = obj;
        this.cancelCause = th2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) other;
        return Intrinsics.areEqual(this.result, completedContinuation.result) && Intrinsics.areEqual(this.cancelHandler, completedContinuation.cancelHandler) && Intrinsics.areEqual(this.onCancellation, completedContinuation.onCancellation) && Intrinsics.areEqual(this.idempotentResume, completedContinuation.idempotentResume) && Intrinsics.areEqual(this.cancelCause, completedContinuation.cancelCause);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ CompletedContinuation m90475b(CompletedContinuation completedContinuation, Object obj, InterfaceC41704l interfaceC41704l, Function3 function3, Object obj2, Throwable th2, int i11, Object obj3) {
        if ((i11 & 1) != 0) {
            obj = completedContinuation.result;
        }
        if ((i11 & 2) != 0) {
            interfaceC41704l = completedContinuation.cancelHandler;
        }
        if ((i11 & 4) != 0) {
            function3 = completedContinuation.onCancellation;
        }
        if ((i11 & 8) != 0) {
            obj2 = completedContinuation.idempotentResume;
        }
        if ((i11 & 16) != 0) {
            th2 = completedContinuation.cancelCause;
        }
        Throwable th3 = th2;
        Function3 function4 = function3;
        return completedContinuation.m90476a(obj, interfaceC41704l, function4, obj2, th3);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final CompletedContinuation<R> m90476a(R result, @Nullable InterfaceC41704l cancelHandler, @Nullable Function3<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, @Nullable Object idempotentResume, @Nullable Throwable cancelCause) {
        return new CompletedContinuation<>(result, cancelHandler, onCancellation, idempotentResume, cancelCause);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m90477c() {
        return this.cancelCause != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m90478d(@NotNull C41716o<?> cont, @NotNull Throwable cause) {
        InterfaceC41704l interfaceC41704l = this.cancelHandler;
        if (interfaceC41704l != null) {
            cont.m91163k(interfaceC41704l, cause);
        }
        Function3<Throwable, R, CoroutineContext, Unit> function3 = this.onCancellation;
        if (function3 != null) {
            cont.m91164l(function3, cause, this.result);
        }
    }

    public int hashCode() {
        R r11 = this.result;
        int iHashCode = (r11 == null ? 0 : r11.hashCode()) * 31;
        InterfaceC41704l interfaceC41704l = this.cancelHandler;
        int iHashCode2 = (iHashCode + (interfaceC41704l == null ? 0 : interfaceC41704l.hashCode())) * 31;
        Function3<Throwable, R, CoroutineContext, Unit> function3 = this.onCancellation;
        int iHashCode3 = (iHashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Object obj = this.idempotentResume;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th2 = this.cancelCause;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + ')';
    }

    public /* synthetic */ CompletedContinuation(Object obj, InterfaceC41704l interfaceC41704l, Function3 function3, Object obj2, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? null : interfaceC41704l, (i11 & 4) != 0 ? null : function3, (i11 & 8) != 0 ? null : obj2, (i11 & 16) != 0 ? null : th2);
    }
}
