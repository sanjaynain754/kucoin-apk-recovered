package com.kubi.kucoin.interceptor;

import android.os.ConditionVariable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.provider.CredentialEntry;
import com.kubi.kucoin.exception.AppNetException;
import com.kubi.router.core.Router;
import com.kubi.user.config.UserInfo;
import com.kubi.user.utils.d0;
import com.kubi.utils.C27058k0;
import com.kubi.utils.extensions.C27041f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43846g;
import p764xk.InterfaceC46257e;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: MultiAccountTokenRetryInterceptor.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u0016\u0010\u001b\u001a\u00020\r*\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\f\u0010\u001c\u001a\u00020\u0012*\u00020\u000fH\u0002R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/MultiAccountTokenRetryInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "lockList", "Ljava/util/ArrayList;", "Landroid/os/ConditionVariable;", "Lkotlin/collections/ArrayList;", "underRefresh", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lastRefreshTime", "Ljava/util/concurrent/atomic/AtomicLong;", "freshToken", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "response", "responseString", "", "getRefreshedToken", "expiredToken", "retry", "newToken", "intercept", "logPrint", "", TypedValues.Custom.S_STRING, "newResponse", "encodePath", "Companion", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMultiAccountTokenRetryInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiAccountTokenRetryInterceptor.kt\ncom/kubi/kucoin/interceptor/MultiAccountTokenRetryInterceptor\n+ 2 Router.kt\ncom/kubi/router/core/Router\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 AppNetIssue.kt\ncom/kubi/kucoin/exception/AppNetIssueKt\n*L\n1#1,190:1\n176#2:191\n176#2:196\n1869#3,2:192\n44#4,2:194\n*S KotlinDebug\n*F\n+ 1 MultiAccountTokenRetryInterceptor.kt\ncom/kubi/kucoin/interceptor/MultiAccountTokenRetryInterceptor\n*L\n56#1:191\n108#1:196\n74#1:192,2\n63#1:194,2\n*E\n"})
public final class MultiAccountTokenRetryInterceptor implements Interceptor {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f27939d = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ArrayList<ConditionVariable> f27940a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    @NotNull
    public final AtomicBoolean f27941b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    @NotNull
    public final AtomicLong f27942c = new AtomicLong();

    /* JADX INFO: compiled from: MultiAccountTokenRetryInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/MultiAccountTokenRetryInterceptor$Companion;", "", "<init>", "()V", "TAG", "", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m32283c(String str) {
        try {
            return ((InterfaceC46257e) Router.f46192a.m56192n(InterfaceC46257e.class)).m102017b(str);
        } catch (Exception e11) {
            m32284d("getRefreshedToken 失败: " + e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m32284d(String str) {
        C44128b.m97266j("refresh_token", "thread=" + Thread.currentThread() + ",msg=" + str);
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Response responseProceed = chain.proceed(chain.request());
        if (!responseProceed.isSuccessful() || responseProceed.body() == null) {
            return responseProceed;
        }
        ResponseBody responseBodyBody = responseProceed.body();
        Intrinsics.checkNotNull(responseBodyBody);
        String strString = responseBodyBody.string();
        try {
            String strOptString = new JSONObject(strString).optString("code");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            return (C27058k0.f54342a.m66755e() && UserInfo.a.n() && Intrinsics.areEqual(strOptString, "401")) ? m32282b(chain, responseProceed, strString) : m32285e(responseProceed, strString);
        } catch (JSONException unused) {
            return m32285e(responseProceed, strString);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m32281a(Interceptor.Chain chain) {
        try {
            return chain.request().url().encodedPath();
        } catch (Exception unused) {
            return chain.request().url().getUrl();
        }
    }

    /* JADX INFO: renamed from: b */
    public final Response m32282b(Interceptor.Chain chain, Response response, String str) {
        ArrayList<ConditionVariable> arrayList;
        String strM66668h = C27041f.m66668h(UserInfo.c().refreshToken);
        String strHeader = chain.request().header("X-APP-TOKEN");
        if (System.currentTimeMillis() - this.f27942c.get() > 5000 && this.f27941b.compareAndSet(false, true)) {
            String strM32281a = m32281a(chain);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("5秒内首次401,触发续期操作，token=");
            d0 d0Var = d0.a;
            sb2.append(d0Var.b(strM66668h));
            sb2.append("，expiredToken=");
            sb2.append(d0Var.b(strHeader));
            sb2.append("，url=");
            sb2.append(strM32281a);
            m32284d(sb2.toString());
            d0Var.e("401", strM32281a);
            try {
                try {
                    C44128b.m97261e("MultiAccountTokenRetryInterceptor", "[freshToken]");
                    if (((InterfaceC46257e) Router.f46192a.m56192n(InterfaceC46257e.class)).m102018c(strM32281a, strHeader)) {
                        this.f27942c.set(System.currentTimeMillis());
                    }
                    this.f27941b.set(false);
                    arrayList = this.f27940a;
                    synchronized (arrayList) {
                        try {
                            m32284d("续期结束，通知其他线程恢复请求，数量=" + this.f27940a.size() + (char) 20010);
                            Iterator<T> it = this.f27940a.iterator();
                            while (it.hasNext()) {
                                ((ConditionVariable) it.next()).open();
                            }
                            this.f27940a.clear();
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Exception e11) {
                    m32284d("续期失败，请求发生异常，异常信息=" + e11);
                    C43846g.m96568c(new AppNetException(new TokenRetryInterceptorException("续期失败，请求发生异常,url:" + chain.request().url(), e11), "refresh_token", false, null, 8, null), null, 2, null);
                    this.f27941b.set(false);
                    arrayList = this.f27940a;
                    synchronized (arrayList) {
                        try {
                            m32284d("续期结束，通知其他线程恢复请求，数量=" + this.f27940a.size() + (char) 20010);
                            Iterator<T> it2 = this.f27940a.iterator();
                            while (it2.hasNext()) {
                                ((ConditionVariable) it2.next()).open();
                            }
                            this.f27940a.clear();
                            Unit unit2 = Unit.INSTANCE;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                this.f27941b.set(false);
                synchronized (this.f27940a) {
                    try {
                        m32284d("续期结束，通知其他线程恢复请求，数量=" + this.f27940a.size() + (char) 20010);
                        Iterator<T> it3 = this.f27940a.iterator();
                        while (it3.hasNext()) {
                            ((ConditionVariable) it3.next()).open();
                        }
                        this.f27940a.clear();
                        Unit unit3 = Unit.INSTANCE;
                        throw th4;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            }
        }
        if (this.f27941b.get()) {
            m32284d("正在请求中，当前阻塞的请求接口=" + m32281a(chain));
            ConditionVariable conditionVariable = new ConditionVariable();
            synchronized (this.f27940a) {
                this.f27940a.add(conditionVariable);
            }
            conditionVariable.block();
        }
        String strM32283c = m32283c(strHeader);
        String strHeader2 = chain.request().header("X-APP-TOKEN");
        if (strM32283c != null && strM32283c.length() != 0 && !Intrinsics.areEqual(strM32283c, strHeader2)) {
            m32284d("续期成功,重试阻塞接口=" + m32281a(chain) + ", refreshedToken=" + d0.a.b(strM32283c));
            return m32286f(chain, strM32283c);
        }
        m32284d("两次token一致或者续期失败,使用之前结果=" + m32281a(chain));
        return m32285e(response, str);
    }

    /* JADX INFO: renamed from: e */
    public final Response m32285e(Response response, String str) {
        return response.newBuilder().body(ResponseBody.INSTANCE.create((MediaType) null, C27041f.m66668h(str))).build();
    }

    /* JADX INFO: renamed from: f */
    public final Response m32286f(Interceptor.Chain chain, String str) {
        Request request = chain.request();
        if (StringsKt.contains$default((CharSequence) request.url().getUrl(), (CharSequence) "/login-by-token", false, 2, (Object) null)) {
            request = chain.request().newBuilder().addHeader("Content-Type", "application/x-www-form-urlencoded").post(RequestBody.INSTANCE.create(MediaType.INSTANCE.parse("text"), "token=" + str)).build();
        } else if (StringsKt.contains$default((CharSequence) request.url().getUrl(), (CharSequence) "v1/auth/logout", false, 2, (Object) null)) {
            request = chain.request().newBuilder().post(RequestBody.INSTANCE.create(MediaType.INSTANCE.parse("application/x-www-form-urlencoded"), "token=" + str)).build();
        }
        return chain.proceed(request.newBuilder().header("X-APP-TOKEN", str).header("retry", CredentialEntry.TRUE_STRING).build());
    }
}
