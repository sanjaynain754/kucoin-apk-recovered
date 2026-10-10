package mr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.Gson;
import com.kubi.network.retrofit.adapter.MultiCallAdapterFactory;
import com.kubi.network.retrofit.adapter.SyncCallAdapterFactory;
import com.kubi.network.retrofit.exception.NetCoreRetrofitIssueMessage;
import com.kubi.network.retrofit.listener.OkHttpTrackEventListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import nr.C42862a;
import okhttp3.CookieJar;
import okhttp3.Dns;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import pr.C43528a;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: renamed from: mr.a */
/* JADX INFO: compiled from: RetrofitClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0019\u0010\u0012J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d¨\u0006!"}, m90084d2 = {"Lmr/a;", "", "<init>", "()V", "Lmr/b;", "config", "", "j", "(Lmr/b;)V", "", "k", "()Z", "i", "Lokhttp3/OkHttpClient;", "e", "()Lokhttp3/OkHttpClient;", "Lretrofit2/Retrofit;", "b", "()Lretrofit2/Retrofit;", "g", "client", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Lokhttp3/OkHttpClient;)Lretrofit2/Retrofit;", "f", "c", "d", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lmr/b;", "retrofitConfig", "Lretrofit2/Retrofit;", "syncRetrofit", "asyncRetrofit", "multiRetrofit", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRetrofitClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetrofitClient.kt\ncom/kubi/network/retrofit/RetrofitClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 NetCoreRetrofitIssue.kt\ncom/kubi/network/retrofit/exception/NetCoreRetrofitIssueKt\n*L\n1#1,217:1\n1855#2,2:218\n100#3,2:220\n*S KotlinDebug\n*F\n+ 1 RetrofitClient.kt\ncom/kubi/network/retrofit/RetrofitClient\n*L\n61#1:218,2\n158#1:220,2\n*E\n"})
public final class C42597a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42597a f94305a = new C42597a();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static C42598b retrofitConfig;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static Retrofit syncRetrofit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static Retrofit asyncRetrofit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public static Retrofit multiRetrofit;

    @Deprecated(message = "请改用getMultiRetrofit()")
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Retrofit m93386b() {
        Gson gson;
        if (asyncRetrofit == null) {
            Retrofit.Builder builderClient = new Retrofit.Builder().baseUrl("https://appapi-v2.xcoinsystem.com/app/").client(m93389e());
            C42598b c42598b = retrofitConfig;
            if (c42598b == null || (gson = c42598b.getDefaultGson()) == null) {
                gson = new Gson();
            }
            asyncRetrofit = builderClient.addConverterFactory(GsonConverterFactory.create(gson)).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
        }
        Retrofit retrofit = asyncRetrofit;
        Intrinsics.checkNotNull(retrofit);
        return retrofit;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Retrofit m93388d() {
        if (multiRetrofit == null) {
            multiRetrofit = new Retrofit.Builder().baseUrl("https://appapi-v2.xcoinsystem.com/app/").client(m93389e()).addConverterFactory(C42862a.m94007a()).addCallAdapterFactory(MultiCallAdapterFactory.INSTANCE.create()).build();
        }
        Retrofit retrofit = multiRetrofit;
        Intrinsics.checkNotNull(retrofit);
        return retrofit;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final OkHttpClient m93389e() {
        List<Interceptor> listM93400d;
        CookieJar cookieJarM93397a;
        Dns dnsM93399c;
        f94305a.m93396a();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder timeout = builder.connectTimeout(15L, timeUnit).writeTimeout(30L, timeUnit).readTimeout(30L, timeUnit);
        C42598b c42598b = retrofitConfig;
        if (c42598b != null && (dnsM93399c = c42598b.getDns()) != null) {
            timeout.dns(dnsM93399c);
        }
        C42598b c42598b2 = retrofitConfig;
        if (c42598b2 != null && (cookieJarM93397a = c42598b2.getCookieJar()) != null) {
            timeout.cookieJar(cookieJarM93397a);
        }
        C42598b c42598b3 = retrofitConfig;
        if (c42598b3 != null && (listM93400d = c42598b3.m93400d()) != null) {
            Iterator<T> it = listM93400d.iterator();
            while (it.hasNext()) {
                timeout.addInterceptor((Interceptor) it.next());
            }
        }
        timeout.addInterceptor(new C43528a());
        timeout.eventListenerFactory(new OkHttpTrackEventListener.C19328a());
        return timeout.build();
    }

    @Deprecated(message = "请改用getMultiRetrofit()")
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final Retrofit m93391g() {
        if (syncRetrofit == null) {
            syncRetrofit = m93392h(m93389e());
        }
        Retrofit retrofit = syncRetrofit;
        Intrinsics.checkNotNull(retrofit);
        return retrofit;
    }

    @Deprecated(message = "请改用getMultiRetrofit()")
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final Retrofit m93392h(@NotNull OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        Retrofit retrofitBuild = new Retrofit.Builder().baseUrl("https://appapi-v2.xcoinsystem.com/app/").callFactory(client).addConverterFactory(C42862a.m94007a()).addCallAdapterFactory(SyncCallAdapterFactory.INSTANCE.create()).build();
        Intrinsics.checkNotNullExpressionValue(retrofitBuild, "Builder()\n            .b…e())\n            .build()");
        return retrofitBuild;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m93393i() {
        return retrofitConfig != null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final void m93394j(@NotNull C42598b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        retrofitConfig = config;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m93395k() {
        C42598b c42598b = retrofitConfig;
        if (c42598b != null) {
            return c42598b.getIsDebug();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m93396a() {
        if (retrofitConfig != null) {
            return;
        }
        if (m93395k()) {
            throw new IllegalStateException("没有做RetrofitClient初始化...");
        }
        C43846g.m96568c(new NetCoreRetrofitIssueMessage("没有做RetrofitClient初始化...", "Network", false, 4, null), null, 2, null);
    }

    @Deprecated(message = "请改用getMultiRetrofit()", replaceWith = @ReplaceWith(expression = "getMultiRetrofit()", imports = {"com.kubi.network.retrofit.RetrofitClient"}))
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Retrofit m93387c() {
        return m93388d();
    }

    @Deprecated(message = "请改用getMultiRetrofit()", replaceWith = @ReplaceWith(expression = "getMultiRetrofit()", imports = {"com.kubi.network.retrofit.RetrofitClient"}))
    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Retrofit m93390f() {
        return m93388d();
    }
}
