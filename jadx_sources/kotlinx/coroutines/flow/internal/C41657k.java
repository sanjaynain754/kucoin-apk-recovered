package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.k */
/* JADX INFO: compiled from: NopCollector.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lkotlinx/coroutines/flow/internal/k;", "Lkotlinx/coroutines/flow/f;", "", "<init>", "()V", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41657k implements InterfaceC41635f<Object> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C41657k f91699b = new C41657k();

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    @Nullable
    public Object emit(@Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
