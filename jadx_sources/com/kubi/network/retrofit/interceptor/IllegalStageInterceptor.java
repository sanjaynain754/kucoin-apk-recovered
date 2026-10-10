package com.kubi.network.retrofit.interceptor;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.sdk.constant.monitor.KunlunTechEventEnum;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p511or.C43174a;
import p569qq.C43847h;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: IllegalStageInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor;", "Lokhttp3/Interceptor;", "", "debug", "<init>", "(Z)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "b", "Companion", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIllegalStageInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IllegalStageInterceptor.kt\ncom/kubi/network/retrofit/interceptor/IllegalStageInterceptor\n+ 2 NetCoreRetrofitIssue.kt\ncom/kubi/network/retrofit/exception/NetCoreRetrofitIssueKt\n*L\n1#1,45:1\n64#2,34:46\n*S KotlinDebug\n*F\n+ 1 IllegalStageInterceptor.kt\ncom/kubi/network/retrofit/interceptor/IllegalStageInterceptor\n*L\n28#1:46,34\n*E\n"})
public final class IllegalStageInterceptor implements Interceptor {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    public static volatile boolean f35948c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean debug;

    /* JADX INFO: compiled from: IllegalStageInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/network/retrofit/interceptor/IllegalStageInterceptor$Companion;", "", "()V", "IGNORE_STAGE", "", "sIgnoreStage", "", "getSIgnoreStage", "()Z", "setSIgnoreStage", "(Z)V", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final boolean getSIgnoreStage() {
            return IllegalStageInterceptor.f35948c;
        }

        public final void setSIgnoreStage(boolean z11) {
            IllegalStageInterceptor.f35948c = z11;
        }
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IllegalStageException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        if (Boolean.parseBoolean(request.header("Ignore-Stage"))) {
            return chain.proceed(request.newBuilder().removeHeader("Ignore-Stage").build());
        }
        if (f35948c) {
            return chain.proceed(request);
        }
        if (this.debug) {
            throw new IllegalStageException("禁止闪屏前发起网络请求[url=" + request.url() + ']');
        }
        IllegalStageException illegalStageException = new IllegalStageException("禁止闪屏前发起网络请求[url=" + request.url() + ']');
        boolean z11 = true;
        String message = illegalStageException.getMessage();
        if (message == null || (!StringsKt.startsWith$default(message, "Required SETTINGS preface not received", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Unexpected response code for CONNECT", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "exhausted all routes", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "unexpected end of stream", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "stream was reset: CANCEL", false, 2, (Object) null) && !StringsKt.startsWith$default(message, "Software caused connection abort", false, 2, (Object) null) && !message.equals("closed"))) {
            z11 = false;
        }
        if (z11) {
            C44128b.m97263g("IllegalStageInterceptor", illegalStageException);
        } else {
            C43174a.m94787c(illegalStageException, "IllegalStageInterceptor");
        }
        C43847h.m96575d(KunlunTechEventEnum.CATE_HTTP_ILLEGAL, 0);
        return chain.proceed(request);
    }

    public IllegalStageInterceptor(boolean z11) {
        this.debug = z11;
    }
}
