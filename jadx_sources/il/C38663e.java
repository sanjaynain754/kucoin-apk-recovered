package il;

import android.content.Context;
import androidx.collection.SimpleArrayMap;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.app.net.R$string;
import com.kubi.sdk.BaseApplication;
import com.tencent.bugly.proguard.C33556b3;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: il.e */
/* JADX INFO: compiled from: BusinessMsgInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\u0014\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/BusinessMsgInterceptor;", "Lokhttp3/Interceptor;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "notPromptCodeList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "modifyPromptCodeMap", "Landroidx/collection/SimpleArrayMap;", "", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "warpResponse", "response", "modifyBody", TtmlNode.TAG_BODY, "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBusinessMsgInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BusinessMsgInterceptor.kt\ncom/kubi/kucoin/interceptor/BusinessMsgInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
public final class C38663e implements Interceptor {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f86674a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public ArrayList<String> f86675b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public SimpleArrayMap<String, Integer> f86676c;

    public C38663e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f86674a = context;
        this.f86675b = CollectionsKt.arrayListOf("401", "429", "-10000", "6", "50003", "900000", "500004");
        SimpleArrayMap<String, Integer> simpleArrayMap = new SimpleArrayMap<>(0, 1, null);
        int i11 = R$string.network_error;
        simpleArrayMap.put(C33556b3.f69010X, Integer.valueOf(i11));
        simpleArrayMap.put(C33556b3.f69024b0, Integer.valueOf(i11));
        simpleArrayMap.put("402", Integer.valueOf(i11));
        simpleArrayMap.put("404", Integer.valueOf(i11));
        simpleArrayMap.put("406", Integer.valueOf(i11));
        simpleArrayMap.put("413", Integer.valueOf(i11));
        simpleArrayMap.put("415", Integer.valueOf(i11));
        simpleArrayMap.put("423", Integer.valueOf(i11));
        simpleArrayMap.put("500", Integer.valueOf(i11));
        simpleArrayMap.put("503", Integer.valueOf(i11));
        simpleArrayMap.put("5004", Integer.valueOf(i11));
        int i12 = R$string.login_login_again_tips;
        simpleArrayMap.put("280010", Integer.valueOf(i12));
        simpleArrayMap.put("280001", Integer.valueOf(i12));
        simpleArrayMap.put("280003", Integer.valueOf(i12));
        this.f86676c = simpleArrayMap;
    }

    /* JADX INFO: renamed from: b */
    public final Response m87399b(Response response) {
        Object objM103844constructorimpl;
        Object objM103844constructorimpl2;
        String string = null;
        try {
            Result.Companion companion = Result.INSTANCE;
            ResponseBody responseBodyBody = response.body();
            objM103844constructorimpl = Result.m103844constructorimpl(responseBodyBody != null ? responseBodyBody.string() : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String str = (String) objM103844constructorimpl;
        if (str == null) {
            return response;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("code");
            if (this.f86675b.contains(strOptString)) {
                jSONObject.put("msg", "");
            } else {
                SimpleArrayMap<String, Integer> simpleArrayMap = this.f86676c;
                Intrinsics.checkNotNull(strOptString);
                if (simpleArrayMap.containsKey(strOptString)) {
                    Integer num = this.f86676c.get(strOptString);
                    if (num != null) {
                        string = this.f86674a.getResources().getString(num.intValue());
                    }
                    jSONObject.put("msg", String.valueOf(string));
                } else {
                    Unit unit = Unit.INSTANCE;
                }
            }
            String string2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            objM103844constructorimpl2 = Result.m103844constructorimpl(m87398a(response, string2));
        } catch (Throwable th3) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl2 = Result.m103844constructorimpl(ResultKt.createFailure(th3));
        }
        Response responseM87398a = m87398a(response, str);
        if (Result.m103850isFailureimpl(objM103844constructorimpl2)) {
            objM103844constructorimpl2 = responseM87398a;
        }
        return (Response) objM103844constructorimpl2;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Response responseProceed = chain.proceed(chain.request());
        return !responseProceed.isSuccessful() ? responseProceed : m87399b(responseProceed);
    }

    /* JADX INFO: renamed from: a */
    public final Response m87398a(Response response, String str) {
        return response.newBuilder().body(ResponseBody.Companion.create$default(ResponseBody.INSTANCE, str, (MediaType) null, 1, (Object) null)).build();
    }

    public /* synthetic */ C38663e(Context context, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? BaseApplication.INSTANCE.get() : context);
    }
}
