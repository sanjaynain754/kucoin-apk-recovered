package com.kubi.kucoin.token;

import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27058k0;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p351iy.C40192c;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.Charsets;
import ro.C44128b;

/* JADX INFO: compiled from: Token401Interceptor.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J7\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kucoin/token/Token401Interceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "monitorReplayResult", "", "request", "Lokhttp3/Request;", "refreshResult", "Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;", "resultType", "", TypedValues.TransitionType.S_DURATION, "", "name", "(Lokhttp3/Request;Lcom/kubi/kucoin/token/TokenLifecycleRefreshResult;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "elapsedSince", "start", "readTopLevelBusinessCode", TtmlNode.TAG_BODY, "Lokhttp3/ResponseBody;", "Companion", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nToken401Interceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Token401Interceptor.kt\ncom/kubi/kucoin/token/Token401Interceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n1#2:263\n*E\n"})
public final class Token401Interceptor implements Interceptor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f28423a = new Companion(null);

    /* JADX INFO: compiled from: Token401Interceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kucoin/token/Token401Interceptor$Companion;", "", "<init>", "()V", "BUSINESS_CODE_FIELD", "", "BUSINESS_401", "BUSINESS_SUCCESS", "HTTP_UNAUTHORIZED", "", "X_APP_TOKEN", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m32886c(ResponseBody responseBody) {
        Charset charset;
        String strNextString;
        if (responseBody == null) {
            return null;
        }
        MediaType mediaType = responseBody.get$contentType();
        if (mediaType == null || (charset = mediaType.charset(Charsets.UTF_8)) == null) {
            charset = Charsets.UTF_8;
        }
        try {
            JsonReader jsonReader = new JsonReader(new InputStreamReader(responseBody.getSource().peek().inputStream(), charset));
            try {
                if (jsonReader.peek() != JsonToken.BEGIN_OBJECT) {
                    strNextString = null;
                } else {
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (Intrinsics.areEqual(jsonReader.nextName(), "code")) {
                            JsonToken jsonTokenPeek = jsonReader.peek();
                            int i11 = jsonTokenPeek == null ? -1 : C15657a.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
                            if (i11 != 1 && i11 != 2) {
                                if (i11 == 3) {
                                    jsonReader.nextNull();
                                    break;
                                }
                                jsonReader.skipValue();
                                break;
                            }
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    strNextString = null;
                }
                CloseableKt.closeFinally(jsonReader, null);
                return strNextString;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(jsonReader, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.token.Token401Interceptor$a */
    /* JADX INFO: compiled from: Token401Interceptor.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C15657a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[JsonToken.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JsonToken.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m32885b(Request request, TokenLifecycleRefreshResult tokenLifecycleRefreshResult, String str, Long l11, String str2) throws JSONException {
        TokenMonitor tokenMonitor = TokenMonitor.f28493a;
        String accountType = tokenLifecycleRefreshResult.getAccountType();
        String result = tokenLifecycleRefreshResult.getResult();
        String strEncodedPath = request.url().encodedPath();
        String reason = tokenLifecycleRefreshResult.getReason();
        Boolean refreshTokenExpired = tokenLifecycleRefreshResult.getRefreshTokenExpired();
        if (!tokenLifecycleRefreshResult.getRefreshRequested()) {
            refreshTokenExpired = null;
        }
        TokenMonitor.m33027b(tokenMonitor, "401", accountType, result, strEncodedPath, str2, null, reason, str, l11, null, refreshTokenExpired, 544, null);
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws Exception {
        String strM32928T;
        Long l11;
        Request requestBuild;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        if (TokenLifecycleRequestBypass.f28486a.m33024a(request)) {
            return chain.proceed(request);
        }
        Response responseProceed = chain.proceed(request);
        Request request2 = responseProceed.request();
        if (responseProceed.code() == 401) {
            C44128b.m97261e("TokenLifecycle", "HTTP 401 preserves existing behavior and skips token lifecycle refresh, path=" + request2.url().encodedPath());
        }
        if (!C40192c.f89321a.m88545g() || !UserInfo.a.n() || request2.tag(TokenLifecycleRefreshTag.class) != null || request2.tag(TokenLifecycleReplayTag.class) != null || !responseProceed.isSuccessful() || !Intrinsics.areEqual(m32886c(responseProceed.body()), "401") || !C27058k0.f54342a.m66755e()) {
            return responseProceed;
        }
        String strHeader = request2.header("X-APP-TOKEN");
        if (strHeader != null && (requestBuild = request.newBuilder().header("X-APP-TOKEN", strHeader).build()) != null) {
            request = requestBuild;
        }
        TokenLifecycleMonitorNameTag tokenLifecycleMonitorNameTag = (TokenLifecycleMonitorNameTag) request2.tag(TokenLifecycleMonitorNameTag.class);
        if (tokenLifecycleMonitorNameTag == null || (strM32928T = tokenLifecycleMonitorNameTag.getName()) == null) {
            TokenLifecycleManager tokenLifecycleManager = TokenLifecycleManager.f28424a;
            String strHeader2 = request.header("X-APP-TOKEN");
            if (strHeader2 == null) {
                strHeader2 = "";
            }
            strM32928T = tokenLifecycleManager.m32928T(strHeader2);
        }
        String str = strM32928T;
        C44128b.m97261e("TokenLifecycle", "Business 401 detected; starting fallback recovery, path=" + request2.url().encodedPath());
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        TokenLifecycleManager.Business401RecoveryResult business401RecoveryResultM32936b0 = TokenLifecycleManager.f28424a.m32936b0(request);
        if (business401RecoveryResultM32936b0 == null) {
            TokenMonitor.m33027b(TokenMonitor.f28493a, "401", "currentUser", "noop", request.url().encodedPath(), str, null, null, "replay_dropped", null, null, null, 1888, null);
            C44128b.m97261e("TokenLifecycle", "Business 401 recovery skipped: access token is unavailable, path=" + request2.url().encodedPath());
            return responseProceed;
        }
        Request replayRequest = business401RecoveryResultM32936b0.getReplayRequest();
        if (replayRequest == null) {
            m32885b(request, business401RecoveryResultM32936b0.getRefreshResult(), "replay_dropped", business401RecoveryResultM32936b0.getRefreshResult().getRefreshRequested() ? Long.valueOf(m32884a(jElapsedRealtime)) : null, str);
            C44128b.m97261e("TokenLifecycle", "Business 401 recovery failed; returning original response, path=" + request2.url().encodedPath());
            return responseProceed;
        }
        Long lValueOf = Long.valueOf(m32884a(jElapsedRealtime));
        if (!business401RecoveryResultM32936b0.getRefreshResult().getRefreshRequested()) {
            lValueOf = null;
        }
        responseProceed.close();
        C44128b.m97261e("TokenLifecycle", "Business 401 recovery succeeded; replaying request once, path=" + request2.url().encodedPath());
        try {
            Response responseProceed2 = chain.proceed(replayRequest);
            String strM32886c = responseProceed2.isSuccessful() ? m32886c(responseProceed2.body()) : null;
            boolean z11 = true;
            if (responseProceed2.isSuccessful() && (strM32886c == null || !(!Intrinsics.areEqual(strM32886c, "200")))) {
                z11 = false;
            }
            Long l12 = lValueOf;
            try {
                TokenLifecycleRefreshResult refreshResult = business401RecoveryResultM32936b0.getRefreshResult();
                String str2 = z11 ? "replay_fail" : "replay_ok";
                l11 = l12;
                try {
                    m32885b(request, refreshResult, str2, l11, str);
                    return responseProceed2;
                } catch (Exception e11) {
                    e = e11;
                    m32885b(request, business401RecoveryResultM32936b0.getRefreshResult(), "replay_fail", l11, str);
                    throw e;
                }
            } catch (Exception e12) {
                e = e12;
                l11 = l12;
            }
        } catch (Exception e13) {
            e = e13;
            l11 = lValueOf;
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m32884a(long j11) {
        return RangesKt.coerceAtLeast(SystemClock.elapsedRealtime() - j11, 0L);
    }
}
