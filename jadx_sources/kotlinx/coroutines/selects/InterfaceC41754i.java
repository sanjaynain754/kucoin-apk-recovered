package kotlinx.coroutines.selects;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import kotlinx.coroutines.InterfaceC41550b1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: kotlinx.coroutines.selects.i */
/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bw\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lkotlinx/coroutines/selects/i;", "R", "", "clauseObject", DbParams.KEY_CHANNEL_RESULT, "", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/b1;", "disposableHandle", "", "d", "(Lkotlinx/coroutines/b1;)V", "internalResult", "c", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public interface InterfaceC41754i<R> {
    /* JADX INFO: renamed from: c */
    void mo91276c(@Nullable Object internalResult);

    /* JADX INFO: renamed from: d */
    void mo91277d(@NotNull InterfaceC41550b1 disposableHandle);

    /* JADX INFO: renamed from: f */
    boolean mo91278f(@NotNull Object clauseObject, @Nullable Object result);

    @NotNull
    CoroutineContext getContext();
}
