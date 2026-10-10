package com.kubi.kucoin.interceptor;

import android.os.ConditionVariable;
import android.util.LruCache;
import com.kubi.kucoin.interceptor.RequestLimitInterceptor;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33590cg;
import il.C38669k;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import ir.C40168c;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: RequestLimitInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\n\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/RequestLimitInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "lock", "Ljava/util/HashMap;", "", "Landroid/os/ConditionVariable;", "Lkotlin/collections/HashMap;", C33590cg.f69440j, "com/kubi/kucoin/interceptor/RequestLimitInterceptor$cache$1", "Lcom/kubi/kucoin/interceptor/RequestLimitInterceptor$cache$1;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RequestLimitInterceptor implements Interceptor {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f27943c = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static long f27944d = 500;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final CompositeDisposable f27945e = new CompositeDisposable();

    /* JADX INFO: renamed from: a */
    @NotNull
    public final HashMap<String, ConditionVariable> f27946a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    @NotNull
    public final C15415a f27947b = new C15415a();

    /* JADX INFO: compiled from: RequestLimitInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/RequestLimitInterceptor$Companion;", "", "<init>", "()V", "DEFAULT_EXPIRED_TIME", "", "expiredTime", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "setTempExpiredTime", "", "time", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: c */
        public static final Unit m32291c(Long l11) {
            RequestLimitInterceptor.f27944d = 500L;
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: d */
        public static final void m32292d(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public final void setTempExpiredTime(long time) {
            RequestLimitInterceptor.f27944d = time;
            RequestLimitInterceptor.f27945e.clear();
            Flowable<Long> flowableObserveOn = Flowable.timer(time, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
            final Function1 function1 = new Function1() { // from class: il.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RequestLimitInterceptor.Companion.m32291c((Long) obj);
                }
            };
            Disposable disposableSubscribe = flowableObserveOn.subscribe(new Consumer() { // from class: il.j
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    RequestLimitInterceptor.Companion.m32292d(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, RequestLimitInterceptor.f27945e);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.interceptor.RequestLimitInterceptor$a */
    /* JADX INFO: compiled from: RequestLimitInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/kucoin/interceptor/RequestLimitInterceptor$cache$1", "Landroid/util/LruCache;", "", "Lcom/kubi/kucoin/interceptor/ResponseWrap;", "sizeOf", "", "key", "value", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15415a extends LruCache<String, C38669k> {
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, C38669k c38669k) {
            return 1;
        }

        public C15415a() {
            super(100);
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0147  */
    /* JADX WARN: Code duplicated, block: B:97:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Pair pair;
        ConditionVariable conditionVariable;
        Intrinsics.checkNotNullParameter(chain, "chain");
        String strM88527b = C40168c.f89309a.m88527b(chain.request());
        synchronized (this.f27947b) {
            C38669k c38669k = this.f27947b.get(strM88527b);
            if (c38669k != null) {
                if (System.currentTimeMillis() - c38669k.m87405b() < f27944d) {
                    return c38669k.m87404a();
                }
                this.f27947b.remove(strM88527b);
            }
            Unit unit = Unit.INSTANCE;
            synchronized (this.f27946a) {
                try {
                    if (this.f27946a.containsKey(strM88527b)) {
                        pair = new Pair(Boolean.FALSE, this.f27946a.get(strM88527b));
                    } else {
                        this.f27946a.put(strM88527b, new ConditionVariable());
                        pair = new Pair(Boolean.TRUE, this.f27946a.get(strM88527b));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!((Boolean) pair.getFirst()).booleanValue()) {
                ConditionVariable conditionVariable2 = (ConditionVariable) pair.getSecond();
                if (conditionVariable2 != null) {
                    conditionVariable2.block();
                }
                return intercept(chain);
            }
            try {
                Response responseProceed = chain.proceed(chain.request());
                ResponseBody responseBodyBody = responseProceed.body();
                String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                if (strString != null) {
                    try {
                        String strOptString = new JSONObject(strString).optString("code");
                        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                        if (!Intrinsics.areEqual(strOptString, "200")) {
                            Response responseBuild = responseProceed.newBuilder().body(ResponseBody.INSTANCE.create((MediaType) null, C27041f.m66668h(strString))).build();
                            synchronized (this.f27946a) {
                                this.f27946a.remove(strM88527b);
                            }
                            ConditionVariable conditionVariable3 = (ConditionVariable) pair.getSecond();
                            if (conditionVariable3 != null) {
                                conditionVariable3.open();
                            }
                            return responseBuild;
                        }
                    } catch (JSONException e11) {
                        C44128b.m97267k(e11.getMessage());
                    }
                    synchronized (this.f27946a) {
                        this.f27946a.remove(strM88527b);
                        conditionVariable = (ConditionVariable) pair.getSecond();
                        if (conditionVariable != null) {
                            conditionVariable.open();
                        }
                        throw th;
                    }
                }
                C38669k c38669k2 = new C38669k(responseProceed.newBuilder().body(ResponseBody.INSTANCE.create((MediaType) null, C27041f.m66668h(strString))).build());
                synchronized (this.f27947b) {
                    this.f27947b.put(strM88527b, c38669k2);
                }
                Response responseM87404a = c38669k2.m87404a();
                synchronized (this.f27946a) {
                    this.f27946a.remove(strM88527b);
                }
                ConditionVariable conditionVariable4 = (ConditionVariable) pair.getSecond();
                if (conditionVariable4 != null) {
                    conditionVariable4.open();
                }
                return responseM87404a;
            } catch (Throwable th3) {
                synchronized (this.f27946a) {
                    this.f27946a.remove(strM88527b);
                    conditionVariable = (ConditionVariable) pair.getSecond();
                    if (conditionVariable != null) {
                        conditionVariable.open();
                    }
                    throw th3;
                }
            }
        }
    }
}
