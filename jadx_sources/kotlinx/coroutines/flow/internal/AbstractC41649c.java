package kotlinx.coroutines.flow.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.c */
/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m90084d2 = {"Lkotlinx/coroutines/flow/internal/c;", "F", "", "<init>", "()V", "flow", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Z", "", "Lkotlin/coroutines/Continuation;", "", "b", "(Ljava/lang/Object;)[Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class AbstractC41649c<F> {
    /* JADX INFO: renamed from: a */
    public abstract boolean mo90976a(F flow);

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract Continuation<Unit>[] mo90977b(F flow);
}
