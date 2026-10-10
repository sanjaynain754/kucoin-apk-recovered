package com.kubi.sdk.web.util;

import androidx.media3.exoplayer.upstream.CmcdData;
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

/* JADX INFO: compiled from: OKHttpUtils.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m90084d2 = {"Lokhttp3/Call;", "Lokhttp3/Response;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lokhttp3/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KWebView_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOKHttpUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OKHttpUtils.kt\ncom/kubi/sdk/web/util/OKHttpUtilsKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,31:1\n314#2,11:32\n*S KotlinDebug\n*F\n+ 1 OKHttpUtils.kt\ncom/kubi/sdk/web/util/OKHttpUtilsKt\n*L\n15#1:32,11\n*E\n"})
public final class OKHttpUtilsKt {

    /* JADX INFO: renamed from: com.kubi.sdk.web.util.OKHttpUtilsKt$a */
    /* JADX INFO: compiled from: OKHttpUtils.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m90084d2 = {"com/kubi/sdk/web/util/OKHttpUtilsKt$a", "Lokhttp3/Callback;", "Lokhttp3/Call;", "call", "Ljava/io/IOException;", "e", "", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "Lokhttp3/Response;", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class C24324a implements Callback {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41708m<Response> f48550b;

        /* JADX WARN: Multi-variable type inference failed */
        public C24324a(InterfaceC41708m<? super Response> interfaceC41708m) {
            this.f48550b = interfaceC41708m;
        }

        @Override // okhttp3.Callback
        public void onFailure(@NotNull Call call, @NotNull IOException e11) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e11, "e");
            InterfaceC41708m<Response> interfaceC41708m = this.f48550b;
            Result.Companion companion = Result.INSTANCE;
            interfaceC41708m.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(e11)));
        }

        @Override // okhttp3.Callback
        public void onResponse(@NotNull Call call, @NotNull Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f48550b.resumeWith(Result.m103844constructorimpl(response));
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m58849a(@NotNull final Call call, @NotNull Continuation<? super Response> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        c41716o.mo91119t(new Function1<Throwable, Unit>() { // from class: com.kubi.sdk.web.util.OKHttpUtilsKt$awaitResponse$2$1
            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.INSTANCE;
            }

            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                call.cancel();
            }
        });
        FirebasePerfOkHttpClient.enqueue(call, new C24324a(c41716o));
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w;
    }
}
