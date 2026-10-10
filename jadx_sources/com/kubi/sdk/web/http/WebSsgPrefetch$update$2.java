package com.kubi.sdk.web.http;

import android.content.Context;
import com.kubi.sdk.web.config.WebConfig;
import com.kubi.sdk.web.helper.C24308d;
import kotlinx.coroutines.DelayKt;
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
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: WebSsgPrefetch.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m90084d2 = {"Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.kubi.sdk.web.http.WebSsgPrefetch$update$2", m90122f = "WebSsgPrefetch.kt", m90123i = {}, m90124l = {96, 98}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class WebSsgPrefetch$update$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $ua;
    final /* synthetic */ String $url;
    int label;

    /* JADX INFO: renamed from: com.kubi.sdk.web.http.WebSsgPrefetch$update$2$1 */
    /* JADX INFO: compiled from: WebSsgPrefetch.kt */
    @Metadata(m90083d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m90084d2 = {"Lcom/kubi/sdk/web/http/WebSsgPrefetch$a;", "<anonymous>", "()Lcom/kubi/sdk/web/http/WebSsgPrefetch$a;"}, m90085k = 3, m90086mv = {1, 8, 0})
    @DebugMetadata(m90121c = "com.kubi.sdk.web.http.WebSsgPrefetch$update$2$1", m90122f = "WebSsgPrefetch.kt", m90123i = {}, m90124l = {99}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C243141 extends SuspendLambda implements Function1<Continuation<? super WebSsgPrefetch.FetchData>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $ua;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C243141(Context context, String str, String str2, Continuation<? super C243141> continuation) {
            super(1, continuation);
            this.$context = context;
            this.$url = str;
            this.$ua = str2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new C243141(this.$context, this.$url, this.$ua, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super WebSsgPrefetch.FetchData> continuation) {
            return ((C243141) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            Object objM58736l = webSsgPrefetch.m58736l(context, "load", str, str2, this);
            if (objM58736l == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objM58736l;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSsgPrefetch$update$2(String str, Context context, String str2, Continuation<? super WebSsgPrefetch$update$2> continuation) {
        super(2, continuation);
        this.$url = str;
        this.$context = context;
        this.$ua = str2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new WebSsgPrefetch$update$2(this.$url, this.$context, this.$ua, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41709m0 interfaceC41709m0, @Nullable Continuation<? super Unit> continuation) {
        return ((WebSsgPrefetch$update$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r1.m58719i(r9, r3, r8) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.label = 1;
        if (DelayKt.m90350b(3000L, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        WebSsgPrefetch.Key key = new WebSsgPrefetch.Key(C24308d.m58706e(this.$url), WebConfig.f48355a.m58599j());
        RequestCache requestCache = WebSsgPrefetch.requestCache;
        C243141 c243141 = new C243141(this.$context, this.$url, this.$ua, null);
        this.label = 2;
    }
}
