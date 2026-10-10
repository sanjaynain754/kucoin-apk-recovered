package il;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.kucoin.exception.AppNetException;
import com.kubi.router.core.Router;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43846g;
import p764xk.BizErrorInfo;
import p764xk.InterfaceC46255c;
import p777xx.C46337a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: il.d */
/* JADX INFO: compiled from: BusinessErrorInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001f\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0080\bø\u0001\u0000¢\u0006\u0002\b\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/BusinessErrorInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "dispatchResponseBody", "", "request", "Lokhttp3/Request;", TtmlNode.TAG_BODY, "", "withCatchingReportIfFail", "block", "Lkotlin/Function0;", "withCatchingReportIfFail$LAppNet_googleRelease", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBusinessErrorInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BusinessErrorInterceptor.kt\ncom/kubi/kucoin/interceptor/BusinessErrorInterceptor\n+ 2 KuEmitter.kt\ncom/kubi/router/emitter/KuEmitter\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 AppNetIssue.kt\ncom/kubi/kucoin/exception/AppNetIssueKt\n*L\n1#1,86:1\n59#1:87\n59#1,3:91\n63#1,2:96\n60#1,2:98\n63#1,2:102\n16#2:88\n2756#3:89\n1#4:90\n44#5,2:94\n44#5,2:100\n44#5,2:104\n*S KotlinDebug\n*F\n+ 1 BusinessErrorInterceptor.kt\ncom/kubi/kucoin/interceptor/BusinessErrorInterceptor\n*L\n48#1:87\n51#1:91,3\n51#1:96,2\n48#1:98,2\n48#1:102,2\n50#1:88\n50#1:89\n50#1:90\n51#1:94,2\n48#1:100,2\n61#1:104,2\n*E\n"})
public final class C38662d implements Interceptor {
    /* JADX INFO: renamed from: a */
    public final void m87397a(Request request, String str) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = new JSONObject(str);
            C46337a c46337a = C46337a.f103912a;
            for (InterfaceC46255c interfaceC46255c : Router.f46192a.m56190l(InterfaceC46255c.class)) {
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    interfaceC46255c.invoke(new BizErrorInfo(request, jSONObject));
                    objM103844constructorimpl2 = Result.m103844constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl2);
                if (thM103847exceptionOrNullimpl != null && !(thM103847exceptionOrNullimpl instanceof JSONException)) {
                    C43846g.m96568c(new AppNetException(thM103847exceptionOrNullimpl, "BusinessErrorInterceptor", false, null, 8, null), null, 2, null);
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl2 == null || (thM103847exceptionOrNullimpl2 instanceof JSONException)) {
            return;
        }
        C43846g.m96568c(new AppNetException(thM103847exceptionOrNullimpl2, "BusinessErrorInterceptor", false, null, 8, null), null, 2, null);
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        String strString;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Response responseProceed = chain.proceed(chain.request());
        if (!responseProceed.isSuccessful()) {
            return responseProceed;
        }
        Response.Builder builderNewBuilder = responseProceed.newBuilder();
        ResponseBody responseBodyBody = responseProceed.body();
        ResponseBody responseBodyCreate$default = null;
        if (responseBodyBody != null && (strString = responseBodyBody.string()) != null) {
            m87397a(responseProceed.request(), strString);
            responseBodyCreate$default = ResponseBody.Companion.create$default(ResponseBody.INSTANCE, strString, (MediaType) null, 1, (Object) null);
        }
        return builderNewBuilder.body(responseBodyCreate$default).build();
    }
}
