package kotlinx.coroutines.flow.internal;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.j */
/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m90084d2 = {"Lkotlinx/coroutines/flow/internal/j;", "Lkotlin/coroutines/Continuation;", "", "<init>", "()V", "Lkotlin/Result;", DbParams.KEY_CHANNEL_RESULT, "", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "c", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41656j implements Continuation<Object> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final C41656j f91697b = new C41656j();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final CoroutineContext context = EmptyCoroutineContext.INSTANCE;

    @Override // p852kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return context;
    }

    @Override // p852kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object result) {
    }
}
