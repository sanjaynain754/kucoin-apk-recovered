package kotlinx.coroutines.flow;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.JvmField;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.z */
/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"Lkotlinx/coroutines/flow/z;", "Lkotlinx/coroutines/flow/f;", "", "", "e", "<init>", "(Ljava/lang/Throwable;)V", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41681z implements InterfaceC41635f<Object> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final Throwable e;

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    @Nullable
    public Object emit(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        throw this.e;
    }

    public C41681z(@NotNull Throwable th2) {
        this.e = th2;
    }
}
