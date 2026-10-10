package il;

import android.util.LruCache;
import com.kubi.kucoin.exception.AppNetException;
import com.tencent.bugly.proguard.C33590cg;
import ir.C40168c;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: il.h */
/* JADX INFO: compiled from: RequestCacheInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/RequestCacheInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", C33590cg.f69440j, "com/kubi/kucoin/interceptor/RequestCacheInterceptor$cache$1", "Lcom/kubi/kucoin/interceptor/RequestCacheInterceptor$cache$1;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "updateCacheIfNecessary", "url", "", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRequestCacheInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestCacheInterceptor.kt\ncom/kubi/kucoin/interceptor/RequestCacheInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AppNetIssue.kt\ncom/kubi/kucoin/exception/AppNetIssueKt\n*L\n1#1,77:1\n1#2:78\n44#3,2:79\n*S KotlinDebug\n*F\n+ 1 RequestCacheInterceptor.kt\ncom/kubi/kucoin/interceptor/RequestCacheInterceptor\n*L\n72#1:79,2\n*E\n"})
public final class C38666h implements Interceptor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final a f86677a = new a();

    /* JADX INFO: renamed from: il.h$a */
    /* JADX INFO: compiled from: RequestCacheInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/kucoin/interceptor/RequestCacheInterceptor$cache$1", "Landroid/util/LruCache;", "", "Lcom/kubi/kucoin/interceptor/ResponseWrap;", "sizeOf", "", "key", "value", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends LruCache<String, C38669k> {
        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, C38669k c38669k) {
            return 1;
        }

        public a() {
            super(100);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Response m87402a(Interceptor.Chain chain, String str) {
        Object objM103844constructorimpl;
        C38669k c38669k = new C38669k(chain.proceed(chain.request()));
        try {
            ResponseBody responseBodyBody = c38669k.m87404a().body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            if (strString != null && strString.length() != 0) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(new JSONObject(strString));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m103851isSuccessimpl(objM103844constructorimpl) && Intrinsics.areEqual(((JSONObject) objM103844constructorimpl).optString("code"), "200")) {
                    synchronized (this.f86677a) {
                        this.f86677a.put(str, c38669k);
                        Unit unit = Unit.INSTANCE;
                    }
                }
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    String message = thM103847exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "JSONException";
                    }
                    C43840a.m96550d(message, "RequestCacheInterceptor");
                }
            }
        } catch (JSONException e11) {
            C43846g.m96568c(new AppNetException(e11, "RequestCacheInterceptor", false, null, 8, null), null, 2, null);
        }
        return c38669k.m87404a();
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        String strM88527b = C40168c.f89309a.m88527b(chain.request());
        String strHeader = chain.request().header("Cache-Time");
        if (strHeader == null) {
            Response responseProceed = chain.proceed(chain.request());
            synchronized (this.f86677a) {
                try {
                    if (this.f86677a.get(strM88527b) != null) {
                        m87402a(chain, strM88527b);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return responseProceed;
        }
        long j11 = Long.parseLong(strHeader);
        synchronized (this.f86677a) {
            C38669k c38669k = this.f86677a.get(strM88527b);
            if (c38669k != null) {
                if (System.currentTimeMillis() - c38669k.m87405b() < j11) {
                    return c38669k.m87404a();
                }
                this.f86677a.remove(strM88527b);
            }
            Unit unit2 = Unit.INSTANCE;
            return m87402a(chain, strM88527b);
        }
    }
}
