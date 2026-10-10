package mr;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import okhttp3.CookieJar;
import okhttp3.Dns;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mr.b */
/* JADX INFO: compiled from: RetrofitClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0001\u000fBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u000f\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, m90084d2 = {"Lmr/b;", "", "", "isDebug", "Lokhttp3/Dns;", "dns", "Lokhttp3/CookieJar;", "cookieJar", "Lcom/google/gson/Gson;", "defaultGson", "", "Lokhttp3/Interceptor;", "interceptors", "<init>", "(ZLokhttp3/Dns;Lokhttp3/CookieJar;Lcom/google/gson/Gson;Ljava/util/List;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Z", "e", "()Z", "b", "Lokhttp3/Dns;", "c", "()Lokhttp3/Dns;", "Lokhttp3/CookieJar;", "()Lokhttp3/CookieJar;", "d", "Lcom/google/gson/Gson;", "()Lcom/google/gson/Gson;", "Ljava/util/List;", "()Ljava/util/List;", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C42598b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean isDebug;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Dns dns;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final CookieJar cookieJar;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Gson defaultGson;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final List<Interceptor> interceptors;

    /* JADX INFO: renamed from: mr.b$a */
    /* JADX INFO: compiled from: RetrofitClient.kt */
    @Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR&\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00140!j\b\u0012\u0004\u0012\u00020\u0014`\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#¨\u0006%"}, m90084d2 = {"Lmr/b$a;", "", "<init>", "()V", "", "debug", "d", "(Z)Lmr/b$a;", "Lokhttp3/Dns;", "dns", "f", "(Lokhttp3/Dns;)Lmr/b$a;", "Lokhttp3/CookieJar;", "cookieJar", "c", "(Lokhttp3/CookieJar;)Lmr/b$a;", "Lcom/google/gson/Gson;", "gson", "e", "(Lcom/google/gson/Gson;)Lmr/b$a;", "Lokhttp3/Interceptor;", "interceptor", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lokhttp3/Interceptor;)Lmr/b$a;", "Lmr/b;", "b", "()Lmr/b;", "Z", "isDebug", "Lokhttp3/Dns;", "Lokhttp3/CookieJar;", "Lcom/google/gson/Gson;", "defaultGson", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "interceptors", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean isDebug;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public Dns dns;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public CookieJar cookieJar;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public Gson defaultGson;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public ArrayList<Interceptor> interceptors = new ArrayList<>();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m93402a(@NotNull Interceptor interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.interceptors.add(interceptor);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C42598b m93403b() {
            return new C42598b(this.isDebug, this.dns, this.cookieJar, this.defaultGson, this.interceptors);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m93404c(@NotNull CookieJar cookieJar) {
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            this.cookieJar = cookieJar;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a m93405d(boolean debug) {
            this.isDebug = debug;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final a m93406e(@NotNull Gson gson) {
            Intrinsics.checkNotNullParameter(gson, "gson");
            this.defaultGson = gson;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final a m93407f(@NotNull Dns dns) {
            Intrinsics.checkNotNullParameter(dns, "dns");
            this.dns = dns;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C42598b(boolean z11, @Nullable Dns dns, @Nullable CookieJar cookieJar, @Nullable Gson gson, @NotNull List<? extends Interceptor> interceptors) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        this.isDebug = z11;
        this.dns = dns;
        this.cookieJar = cookieJar;
        this.defaultGson = gson;
        this.interceptors = interceptors;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final CookieJar getCookieJar() {
        return this.cookieJar;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Gson getDefaultGson() {
        return this.defaultGson;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Dns getDns() {
        return this.dns;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<Interceptor> m93400d() {
        return this.interceptors;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsDebug() {
        return this.isDebug;
    }
}
