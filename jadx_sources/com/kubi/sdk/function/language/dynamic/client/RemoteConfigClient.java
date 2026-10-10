package com.kubi.sdk.function.language.dynamic.client;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kubi.sdk.function.language.dynamic.client.RemoteConfigClient;
import com.kubi.sdk.function.language.issue.LangConfigException;
import com.kubi.sdk.function.language.issue.LangConfigMessage;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import ro.C44128b;

/* JADX INFO: compiled from: RemoteConfigClient.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rJ@\u0010\u0010\u001a\u0004\u0018\u0001H\u0011\"\u0004\b\u0000\u0010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u001e\u0010\u0014\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00110\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015H\u0086@¢\u0006\u0002\u0010\u0017R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/function/language/dynamic/client/RemoteConfigClient;", "", "<init>", "()V", "httpClient", "Lokhttp3/OkHttpClient;", "getHttpClient", "()Lokhttp3/OkHttpClient;", "httpClient$delegate", "Lkotlin/Lazy;", "fetchLangConfig", "Lcom/kubi/sdk/function/language/dynamic/client/FetchResult;", "site", "", "locale", "cachedETag", "retryWhenException", ExifInterface.GPS_DIRECTION_TRUE, "retryCount", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRemoteConfigClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfigClient.kt\ncom/kubi/sdk/function/language/dynamic/client/RemoteConfigClient\n+ 2 LangConfigIssue.kt\ncom/kubi/sdk/function/language/issue/LangConfigIssueKt\n*L\n1#1,126:1\n48#2,2:127\n44#2,2:129\n*S KotlinDebug\n*F\n+ 1 RemoteConfigClient.kt\ncom/kubi/sdk/function/language/dynamic/client/RemoteConfigClient\n*L\n74#1:127,2\n81#1:129,2\n*E\n"})
public final class RemoteConfigClient {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f46826b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f46827a = LazyKt.lazy(new Function0() { // from class: az.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RemoteConfigClient.m57028d();
        }
    });

    /* JADX INFO: compiled from: RemoteConfigClient.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/function/language/dynamic/client/RemoteConfigClient$Companion;", "", "<init>", "()V", "TAG", "", "projectId", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.function.language.dynamic.client.RemoteConfigClient$a */
    /* JADX INFO: compiled from: RemoteConfigClient.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, m90084d2 = {"com/kubi/sdk/function/language/dynamic/client/RemoteConfigClient$fetchLangConfig$type$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "LLanguage_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23821a extends TypeToken<Map<String, ? extends String>> {
    }

    /* JADX INFO: renamed from: d */
    public static final OkHttpClient m57028d() {
        return new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).build();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final FetchResult m57029b(@NotNull String site, @NotNull String locale, @Nullable String str) {
        Intrinsics.checkNotNullParameter(site, "site");
        Intrinsics.checkNotNullParameter(locale, "locale");
        try {
            String str2 = "https://assets.staticimg.com/i18n/" + site + '/' + locale + "/7068662761d66607a99499.65973730.json";
            C44128b.m97266j("LangRemoteConfigClient", "fetchLangConfig start url=" + str2 + ", cachedETag=" + str);
            Request.Builder builderUrl = new Request.Builder().url(str2);
            if (str != null) {
                builderUrl.header(HttpHeaders.IF_NONE_MATCH, str);
            }
            Response responseExecute = FirebasePerfOkHttpClient.execute(m57030c().newCall(builderUrl.build()));
            ResponseBody responseBodyBody = responseExecute.body();
            int iCode = responseExecute.code();
            if (iCode != 200) {
                if (iCode == 304) {
                    C44128b.m97266j("LangRemoteConfigClient", "fetchLangConfig not modified");
                    return new FetchResult.Failure("Not Modified " + responseExecute.code());
                }
                C44128b.m97270n("LangRemoteConfigClient", "fetchLangConfig http failed code=" + responseExecute.code());
                C43846g.m96568c(new LangConfigMessage("fetchLangConfig error = " + responseExecute.code(), "LangRemoteConfigClient", false, 4, null), null, 2, null);
                return new FetchResult.Failure("error msg： " + responseExecute.code());
            }
            if (responseExecute.isSuccessful() && responseBodyBody != null) {
                Type type = new C23821a().getType();
                Reader readerCharStream = responseBodyBody.charStream();
                try {
                    Map map = (Map) new Gson().fromJson(readerCharStream, type);
                    CloseableKt.closeFinally(readerCharStream, null);
                    Intrinsics.checkNotNullExpressionValue(map, "use(...)");
                    String strHeader$default = Response.header$default(responseExecute, HttpHeaders.ETAG, null, 2, null);
                    C44128b.m97266j("LangRemoteConfigClient", "fetchLangConfig success size=" + map.size() + "，etag=" + strHeader$default);
                    return new FetchResult.Success(map, strHeader$default);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(readerCharStream, th2);
                        throw th3;
                    }
                }
            }
            C44128b.m97270n("LangRemoteConfigClient", "fetchLangConfig http request failed: code=" + responseExecute.code() + ", message=" + responseExecute.message());
            return null;
        } catch (Exception e11) {
            C43846g.m96568c(new LangConfigException(e11, "LangRemoteConfigClient", false, null, 8, null), null, 2, null);
            C44128b.m97270n("LangRemoteConfigClient", "fetchLangConfig fail: " + e11.getMessage());
            return new FetchResult.Failure(e11.toString());
        }
    }

    /* JADX INFO: renamed from: c */
    public final OkHttpClient m57030c() {
        return (OkHttpClient) this.f46827a.getValue();
    }
}
