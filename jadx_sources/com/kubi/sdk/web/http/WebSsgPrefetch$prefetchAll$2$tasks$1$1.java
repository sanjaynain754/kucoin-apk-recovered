package com.kubi.sdk.web.http;

import android.content.Context;
import com.kubi.sdk.web.config.WebConfig;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import rg0.InterfaceC44088g;
import ro.C44128b;

/* JADX INFO: compiled from: WebSsgPrefetch.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "Lcom/kubi/sdk/web/http/RequestCache$a;", "Lcom/kubi/sdk/web/http/WebSsgPrefetch$a;", "<anonymous>", "(Lkotlinx/coroutines/m0;)Lcom/kubi/sdk/web/http/RequestCache$a;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.web.http.WebSsgPrefetch$prefetchAll$2$tasks$1$1", m90122f = "WebSsgPrefetch.kt", m90123i = {0, 1}, m90124l = {204, 75}, m90125m = "invokeSuspend", m90126n = {"$this$withPermit$iv", "$this$withPermit$iv"}, m90127s = {"L$0", "L$0"})
@SourceDebugExtension({"SMAP\nWebSsgPrefetch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSsgPrefetch.kt\ncom/kubi/sdk/web/http/WebSsgPrefetch$prefetchAll$2$tasks$1$1\n+ 2 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n*L\n1#1,199:1\n81#2,9:200\n*S KotlinDebug\n*F\n+ 1 WebSsgPrefetch.kt\ncom/kubi/sdk/web/http/WebSsgPrefetch$prefetchAll$2$tasks$1$1\n*L\n72#1:200,9\n*E\n"})
public final class WebSsgPrefetch$prefetchAll$2$tasks$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super RequestCache.C24310a<WebSsgPrefetch.FetchData>>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $url;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSsgPrefetch$prefetchAll$2$tasks$1$1(String str, Context context, Continuation<? super WebSsgPrefetch$prefetchAll$2$tasks$1$1> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$context = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WebSsgPrefetch$prefetchAll$2$tasks$1$1(this.$url, this.$context, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super RequestCache.C24310a<WebSsgPrefetch.FetchData>> continuation) {
        return ((WebSsgPrefetch$prefetchAll$2$tasks$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        InterfaceC44088g interfaceC44088g;
        String str;
        Context context;
        InterfaceC44088g interfaceC44088g2;
        Throwable th2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        interfaceC44088g2 = (InterfaceC44088g) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            RequestCache.C24310a c24310a = (RequestCache.C24310a) obj;
                            interfaceC44088g2.release();
                            return c24310a;
                        } catch (Throwable th3) {
                            th2 = th3;
                            interfaceC44088g2.release();
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) this.L$2;
                str = (String) this.L$1;
                InterfaceC44088g interfaceC44088g3 = (InterfaceC44088g) this.L$0;
                ResultKt.throwOnFailure(obj);
                interfaceC44088g = interfaceC44088g3;
            } else {
                ResultKt.throwOnFailure(obj);
                interfaceC44088g = WebSsgPrefetch.prefetchSemaphore;
                String str2 = this.$url;
                Context context2 = this.$context;
                this.L$0 = interfaceC44088g;
                this.L$1 = str2;
                this.L$2 = context2;
                this.label = 1;
                if (interfaceC44088g.m97146c(this) != coroutine_suspended) {
                    str = str2;
                    context = context2;
                }
                return coroutine_suspended;
            }
            C44128b.m97259c("WebSsgPrefetch", "prefetch " + str);
            WebSsgPrefetch.Key key = new WebSsgPrefetch.Key(str, WebConfig.f48355a.m58599j());
            RequestCache requestCache = WebSsgPrefetch.requestCache;
            WebSsgPrefetch$prefetchAll$2$tasks$1$1$1$1 webSsgPrefetch$prefetchAll$2$tasks$1$1$1$1 = new WebSsgPrefetch$prefetchAll$2$tasks$1$1$1$1(context, str, null);
            this.L$0 = interfaceC44088g;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            Object objM58717g = requestCache.m58717g(key, webSsgPrefetch$prefetchAll$2$tasks$1$1$1$1, this);
            if (objM58717g != coroutine_suspended) {
                interfaceC44088g2 = interfaceC44088g;
                obj = objM58717g;
                RequestCache.C24310a c24310a2 = (RequestCache.C24310a) obj;
                interfaceC44088g2.release();
                return c24310a2;
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            interfaceC44088g2 = interfaceC44088g;
            th2 = th4;
            interfaceC44088g2.release();
            throw th2;
        }
    }
}
