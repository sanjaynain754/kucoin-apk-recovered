package com.kubi.sdk.web.http;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: WebSsgPrefetch.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m90084d2 = {"Lcom/kubi/sdk/web/http/WebSsgPrefetch$a;", "<anonymous>", "()Lcom/kubi/sdk/web/http/WebSsgPrefetch$a;"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.web.http.WebSsgPrefetch$requestWithCache$2", m90122f = "WebSsgPrefetch.kt", m90123i = {}, m90124l = {109}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class WebSsgPrefetch$requestWithCache$2 extends SuspendLambda implements Function1<Continuation<? super WebSsgPrefetch.FetchData>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $ua;
    final /* synthetic */ String $url;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSsgPrefetch$requestWithCache$2(Context context, String str, String str2, Continuation<? super WebSsgPrefetch$requestWithCache$2> continuation) {
        super(1, continuation);
        this.$context = context;
        this.$url = str;
        this.$ua = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new WebSsgPrefetch$requestWithCache$2(this.$context, this.$url, this.$ua, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super WebSsgPrefetch.FetchData> continuation) {
        return ((WebSsgPrefetch$requestWithCache$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        WebSsgPrefetch webSsgPrefetch = WebSsgPrefetch.f48451a;
        Context context = this.$context;
        String str = this.$url;
        String str2 = this.$ua;
        this.label = 1;
        Object objM58736l = webSsgPrefetch.m58736l(context, "update", str, str2, this);
        if (objM58736l == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM58736l;
    }
}
