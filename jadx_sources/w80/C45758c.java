package w80;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.InterfaceC41708m;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: w80.c */
/* JADX INFO: compiled from: KWebUtils.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080@¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"awaitResponse", "Lokhttp3/Response;", "Lokhttp3/Call;", "(Lokhttp3/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LWebWidget_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKWebUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebUtils.kt\ncom/kubi/widget/web/utils/KWebUtilsKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,28:1\n426#2,11:29\n*S KotlinDebug\n*F\n+ 1 KWebUtils.kt\ncom/kubi/widget/web/utils/KWebUtilsKt\n*L\n12#1:29,11\n*E\n"})
public final class C45758c {

    /* JADX INFO: renamed from: w80.c$a */
    /* JADX INFO: compiled from: KWebUtils.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Call f103176b;

        public a(Call call) {
            this.f103176b = call;
        }

        /* JADX INFO: renamed from: a */
        public final void m101025a(Throwable th2) {
            this.f103176b.cancel();
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            m101025a(th2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: w80.c$b */
    /* JADX INFO: compiled from: KWebUtils.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/widget/web/utils/KWebUtilsKt$awaitResponse$2$2", "Lokhttp3/Callback;", "onFailure", "", "call", "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements Callback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41708m<Response> f103177b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC41708m<? super Response> interfaceC41708m) {
            this.f103177b = interfaceC41708m;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e11) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e11, "e");
            InterfaceC41708m<Response> interfaceC41708m = this.f103177b;
            Result.Companion companion = Result.INSTANCE;
            interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(e11)));
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f103177b.resumeWith(Result.m103844constructorimpl(response));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m101024a(@NotNull Call call, @NotNull Continuation<? super Response> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        c41716o.mo91119t(new a(call));
        FirebasePerfOkHttpClient.enqueue(call, new b(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }
}
