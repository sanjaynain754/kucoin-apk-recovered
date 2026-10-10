package com.kubi.assets.freeze;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.gson.reflect.TypeToken;
import com.kubi.assets.R$string;
import com.kubi.assets.exception.AssetsMessage;
import com.kubi.assets.freeze.entity.TradeAgreementContentEntity;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33844oi;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import mr.C42597a;
import o00.C42917g;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p481ny.C42899b;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: AssetFreezeInterceptor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0006H\u0002R!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/assets/freeze/AssetFreezeInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "pathWhiteList", "", "", "getPathWhiteList", "()Ljava/util/List;", "pathWhiteList$delegate", "Lkotlin/Lazy;", "freezeApi", "Lcom/kubi/assets/freeze/AssetFreezeApi;", "kotlin.jvm.PlatformType", "getFreezeApi", "()Lcom/kubi/assets/freeze/AssetFreezeApi;", "freezeApi$delegate", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "replaceMessage", "newMessage", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetFreezeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetFreezeInterceptor.kt\ncom/kubi/assets/freeze/AssetFreezeInterceptor\n+ 2 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 5 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,154:1\n48#2,2:155\n48#2,2:157\n48#2,2:159\n35#3,4:161\n39#3:167\n44#4,2:165\n19#5,2:168\n*S KotlinDebug\n*F\n+ 1 AssetFreezeInterceptor.kt\ncom/kubi/assets/freeze/AssetFreezeInterceptor\n*L\n88#1:155,2\n138#1:157,2\n141#1:159,2\n48#1:161,4\n48#1:167\n48#1:165,2\n74#1:168,2\n*E\n"})
public final class AssetFreezeInterceptor implements Interceptor {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f17507c = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final List<String> f17508d = CollectionsKt.listOf((Object[]) new String[]{"26021", "26020", "400444"});

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final String f17509e = "v1/asset/deposit/invoice/add";

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f17510a = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.freeze.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetFreezeInterceptor.m16871l();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f17511b = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.freeze.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AssetFreezeInterceptor.m16868g();
        }
    });

    /* JADX INFO: compiled from: AssetFreezeInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/assets/freeze/AssetFreezeInterceptor$Companion;", "", "<init>", "()V", "TAG", "", "CODE", "MESSAGE", "WITHDRAW_FREEZE_CODE", "DEPOSIT_FREEZE_CODE", "RWA_CODE", "FREEZE_CODE_LIST", "", "getFREEZE_CODE_LIST", "()Ljava/util/List;", "FLASH_DEPOSIT_URL", "getFLASH_DEPOSIT_URL", "()Ljava/lang/String;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final String getFLASH_DEPOSIT_URL() {
            return AssetFreezeInterceptor.f17509e;
        }

        @NotNull
        public final List<String> getFREEZE_CODE_LIST() {
            return AssetFreezeInterceptor.f17508d;
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.freeze.AssetFreezeInterceptor$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C10040a extends TypeToken<List<? extends String>> {
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m16869j(final TradeAgreementContentEntity tradeAgreementContentEntity, final FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.assets.freeze.e
            @Override // java.lang.Runnable
            public final void run() {
                AssetFreezeInterceptor.m16870k(tradeAgreementContentEntity, it);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final void m16870k(TradeAgreementContentEntity tradeAgreementContentEntity, FragmentActivity fragmentActivity) {
        RwaAgreementSignDialog rwaAgreementSignDialogCreate = RwaAgreementSignDialog.f17519u0.create(C27041f.m66668h(tradeAgreementContentEntity.getTitle()), C27041f.m66668h(tradeAgreementContentEntity.getContent()), C27041f.m66668h(tradeAgreementContentEntity.getArticleId()), C27041f.m66668h(tradeAgreementContentEntity.getVersion()));
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        rwaAgreementSignDialogCreate.show(supportFragmentManager, "RwaAgreementSignDialog");
    }

    /* JADX INFO: renamed from: l */
    public static final List m16871l() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C10040a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("asset_freeze_middle_ground_handle_path_white_list", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        List list = (List) objM20457a;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ String m16872n(AssetFreezeInterceptor assetFreezeInterceptor, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str2 = "";
        }
        return assetFreezeInterceptor.m16875m(str, str2);
    }

    /* JADX INFO: renamed from: h */
    public final AssetFreezeApi m16873h() {
        return (AssetFreezeApi) this.f17511b.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final List<String> m16874i() {
        return (List) this.f17510a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00c9 A[Catch: JSONException -> 0x00b6, TryCatch #2 {JSONException -> 0x00b6, blocks: (B:6:0x0022, B:17:0x00b9, B:19:0x00c9, B:21:0x00e7, B:23:0x00f0, B:25:0x00f8, B:27:0x0116, B:29:0x0125, B:31:0x0141, B:33:0x0146, B:36:0x014e, B:38:0x0164, B:51:0x01f0, B:53:0x0200, B:54:0x0221, B:12:0x0081, B:14:0x0091, B:9:0x0053, B:40:0x0182, B:42:0x019b, B:47:0x01a7, B:49:0x01cb), top: B:62:0x0022, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x00e7 A[Catch: JSONException -> 0x00b6, TryCatch #2 {JSONException -> 0x00b6, blocks: (B:6:0x0022, B:17:0x00b9, B:19:0x00c9, B:21:0x00e7, B:23:0x00f0, B:25:0x00f8, B:27:0x0116, B:29:0x0125, B:31:0x0141, B:33:0x0146, B:36:0x014e, B:38:0x0164, B:51:0x01f0, B:53:0x0200, B:54:0x0221, B:12:0x0081, B:14:0x0091, B:9:0x0053, B:40:0x0182, B:42:0x019b, B:47:0x01a7, B:49:0x01cb), top: B:62:0x0022, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0125 A[Catch: JSONException -> 0x00b6, TryCatch #2 {JSONException -> 0x00b6, blocks: (B:6:0x0022, B:17:0x00b9, B:19:0x00c9, B:21:0x00e7, B:23:0x00f0, B:25:0x00f8, B:27:0x0116, B:29:0x0125, B:31:0x0141, B:33:0x0146, B:36:0x014e, B:38:0x0164, B:51:0x01f0, B:53:0x0200, B:54:0x0221, B:12:0x0081, B:14:0x0091, B:9:0x0053, B:40:0x0182, B:42:0x019b, B:47:0x01a7, B:49:0x01cb), top: B:62:0x0022, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x013f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0164 A[Catch: JSONException -> 0x00b6, TRY_LEAVE, TryCatch #2 {JSONException -> 0x00b6, blocks: (B:6:0x0022, B:17:0x00b9, B:19:0x00c9, B:21:0x00e7, B:23:0x00f0, B:25:0x00f8, B:27:0x0116, B:29:0x0125, B:31:0x0141, B:33:0x0146, B:36:0x014e, B:38:0x0164, B:51:0x01f0, B:53:0x0200, B:54:0x0221, B:12:0x0081, B:14:0x0091, B:9:0x0053, B:40:0x0182, B:42:0x019b, B:47:0x01a7, B:49:0x01cb), top: B:62:0x0022, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x019b A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:40:0x0182, B:42:0x019b, B:47:0x01a7, B:49:0x01cb), top: B:61:0x0182, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a7 A[Catch: all -> 0x01a2, TryCatch #1 {all -> 0x01a2, blocks: (B:40:0x0182, B:42:0x019b, B:47:0x01a7, B:49:0x01cb), top: B:61:0x0182, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01cb A[Catch: all -> 0x01a2, TRY_LEAVE, TryCatch #1 {all -> 0x01a2, blocks: (B:40:0x0182, B:42:0x019b, B:47:0x01a7, B:49:0x01cb), top: B:61:0x0182, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        String element;
        Object objFirst;
        CharSequence charSequence;
        List<AssetMiddleGroundResource> list;
        AssetMiddleGroundResource assetMiddleGroundResource;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        ResponseBody responseBodyBody = responseProceed.body();
        if (responseBodyBody == null) {
            return responseProceed;
        }
        String strString = responseBodyBody.string();
        try {
            JSONObject jSONObject = new JSONObject(strString);
            String strOptString = jSONObject.optString("code");
            C44128b.m97259c("AssetFreezeInterceptor", request.url() + " -> " + strOptString);
            if (!Intrinsics.areEqual("301139", strOptString)) {
                String strEncodedPath = request.url().encodedPath();
                if (!f17508d.contains(strOptString)) {
                    Response.Builder builderNewBuilder = responseProceed.newBuilder();
                    ResponseBody.Companion companion = ResponseBody.INSTANCE;
                    ResponseBody responseBodyBody2 = responseProceed.body();
                    Intrinsics.checkNotNull(responseBodyBody2);
                    return builderNewBuilder.body(companion.create(strString, responseBodyBody2.get$contentType())).build();
                }
                if (!Intrinsics.areEqual(strOptString, "26020") && !StringsKt.contains$default((CharSequence) strEncodedPath, (CharSequence) f17509e, false, 2, (Object) null)) {
                    Response.Builder builderNewBuilder2 = responseProceed.newBuilder();
                    ResponseBody.Companion companion2 = ResponseBody.INSTANCE;
                    ResponseBody responseBodyBody3 = responseProceed.body();
                    Intrinsics.checkNotNull(responseBodyBody3);
                    return builderNewBuilder2.body(companion2.create(strString, responseBodyBody3.get$contentType())).build();
                }
                element = jSONObject.optString("msg");
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (StringsKt.contains$default((CharSequence) element, (CharSequence) C33844oi.f71346o, false, 2, (Object) null)) {
                    Intrinsics.checkNotNullExpressionValue(element, "element");
                    objFirst = CollectionsKt.first((List<? extends Object>) StringsKt.split$default((CharSequence) element, new String[]{C33844oi.f71346o}, false, 0, 6, (Object) null));
                } else {
                    objFirst = element;
                }
                charSequence = (CharSequence) objFirst;
                if (charSequence != null && charSequence.length() != 0) {
                    if (m16874i().contains(chain.request().url().encodedPath())) {
                        Response.Builder builderNewBuilder3 = responseProceed.newBuilder();
                        ResponseBody.Companion companion3 = ResponseBody.INSTANCE;
                        ResponseBody responseBodyBody4 = responseProceed.body();
                        Intrinsics.checkNotNull(responseBodyBody4);
                        return builderNewBuilder3.body(companion3.create(strString, responseBodyBody4.get$contentType())).build();
                    }
                    Result.Companion companion4 = Result.INSTANCE;
                    list = m16873h().m16911f(C27041f.m66668h((String) objFirst)).get(objFirst);
                    if (list != null) {
                        assetMiddleGroundResource = (AssetMiddleGroundResource) CollectionsKt.firstOrNull((List) list);
                    } else {
                        assetMiddleGroundResource = null;
                    }
                    if (assetMiddleGroundResource != null) {
                        return responseProceed.newBuilder().body(ResponseBody.INSTANCE.create(m16875m(strString, C27017c.f54310a.m66516f(R$string.kc_trade_freeze_content, new Object[0])), responseBodyBody.get$contentType())).build();
                    }
                    FreezeDialogHelper freezeDialogHelper = FreezeDialogHelper.f17531a;
                    Intrinsics.checkNotNull(strOptString);
                    freezeDialogHelper.m16923h(assetMiddleGroundResource, strOptString);
                    return responseProceed.newBuilder().body(ResponseBody.INSTANCE.create(m16872n(this, strString, null, 1, null), responseBodyBody.get$contentType())).build();
                }
                Response.Builder builderNewBuilder4 = responseProceed.newBuilder();
                ResponseBody.Companion companion5 = ResponseBody.INSTANCE;
                ResponseBody responseBodyBody5 = responseProceed.body();
                Intrinsics.checkNotNull(responseBodyBody5);
                return builderNewBuilder4.body(companion5.create(strString, responseBodyBody5.get$contentType())).build();
            }
            try {
                Result.Companion companion6 = Result.INSTANCE;
                final TradeAgreementContentEntity tradeAgreementContentEntityM16910i = AssetFreezeApi.m16910i(m16873h(), null, 1, null);
                C42899b.m94073c(new Function1() { // from class: com.kubi.assets.freeze.d
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetFreezeInterceptor.m16869j(tradeAgreementContentEntityM16910i, (FragmentActivity) obj);
                    }
                });
                return responseProceed.newBuilder().body(ResponseBody.INSTANCE.create(m16872n(this, strString, null, 1, null), responseBodyBody.get$contentType())).build();
            } catch (Throwable th2) {
                Result.Companion companion7 = Result.INSTANCE;
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th2)));
                if (thM103847exceptionOrNullimpl != null) {
                    C43846g.m96568c(new AssetsMessage("AssetFreezeInterceptor", "请求RWA协议出错:" + thM103847exceptionOrNullimpl, false, 4, null), null, 2, null);
                }
                String strEncodedPath2 = request.url().encodedPath();
                if (!f17508d.contains(strOptString)) {
                    Response.Builder builderNewBuilder5 = responseProceed.newBuilder();
                    ResponseBody.Companion companion8 = ResponseBody.INSTANCE;
                    ResponseBody responseBodyBody6 = responseProceed.body();
                    Intrinsics.checkNotNull(responseBodyBody6);
                    return builderNewBuilder5.body(companion8.create(strString, responseBodyBody6.get$contentType())).build();
                }
                if (!Intrinsics.areEqual(strOptString, "26020")) {
                }
                element = jSONObject.optString("msg");
                Intrinsics.checkNotNullExpressionValue(element, "element");
                if (StringsKt.contains$default((CharSequence) element, (CharSequence) C33844oi.f71346o, false, 2, (Object) null)) {
                    Intrinsics.checkNotNullExpressionValue(element, "element");
                    objFirst = CollectionsKt.first((List<? extends Object>) StringsKt.split$default((CharSequence) element, new String[]{C33844oi.f71346o}, false, 0, 6, (Object) null));
                } else {
                    objFirst = element;
                }
                charSequence = (CharSequence) objFirst;
                if (charSequence != null) {
                    if (m16874i().contains(chain.request().url().encodedPath())) {
                        Response.Builder builderNewBuilder6 = responseProceed.newBuilder();
                        ResponseBody.Companion companion9 = ResponseBody.INSTANCE;
                        ResponseBody responseBodyBody7 = responseProceed.body();
                        Intrinsics.checkNotNull(responseBodyBody7);
                        return builderNewBuilder6.body(companion9.create(strString, responseBodyBody7.get$contentType())).build();
                    }
                    try {
                        Result.Companion companion10 = Result.INSTANCE;
                        list = m16873h().m16911f(C27041f.m66668h((String) objFirst)).get(objFirst);
                        if (list != null) {
                            assetMiddleGroundResource = (AssetMiddleGroundResource) CollectionsKt.firstOrNull((List) list);
                        } else {
                            assetMiddleGroundResource = null;
                        }
                        if (assetMiddleGroundResource != null) {
                            return responseProceed.newBuilder().body(ResponseBody.INSTANCE.create(m16875m(strString, C27017c.f54310a.m66516f(R$string.kc_trade_freeze_content, new Object[0])), responseBodyBody.get$contentType())).build();
                        }
                        FreezeDialogHelper freezeDialogHelper2 = FreezeDialogHelper.f17531a;
                        Intrinsics.checkNotNull(strOptString);
                        freezeDialogHelper2.m16923h(assetMiddleGroundResource, strOptString);
                        return responseProceed.newBuilder().body(ResponseBody.INSTANCE.create(m16872n(this, strString, null, 1, null), responseBodyBody.get$contentType())).build();
                    } catch (Throwable th3) {
                        Result.Companion companion11 = Result.INSTANCE;
                        Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(Result.m103844constructorimpl(ResultKt.createFailure(th3)));
                        if (thM103847exceptionOrNullimpl2 != null) {
                            C43846g.m96568c(new AssetsMessage("AssetFreezeInterceptor", "请求弹窗出错:" + thM103847exceptionOrNullimpl2, false, 4, null), null, 2, null);
                        }
                    }
                }
                Response.Builder builderNewBuilder7 = responseProceed.newBuilder();
                ResponseBody.Companion companion12 = ResponseBody.INSTANCE;
                ResponseBody responseBodyBody8 = responseProceed.body();
                Intrinsics.checkNotNull(responseBodyBody8);
                return builderNewBuilder7.body(companion12.create(strString, responseBodyBody8.get$contentType())).build();
            }
        } catch (JSONException e11) {
            C43846g.m96568c(new AssetsMessage("AssetFreezeInterceptor", "拦截出错:" + e11, false, 4, null), null, 2, null);
        }
        C43846g.m96568c(new AssetsMessage("AssetFreezeInterceptor", "拦截出错:" + e11, false, 4, null), null, 2, null);
        Response.Builder builderNewBuilder8 = responseProceed.newBuilder();
        ResponseBody.Companion companion13 = ResponseBody.INSTANCE;
        ResponseBody responseBodyBody9 = responseProceed.body();
        Intrinsics.checkNotNull(responseBodyBody9);
        return builderNewBuilder8.body(companion13.create(strString, responseBodyBody9.get$contentType())).build();
    }

    /* JADX INFO: renamed from: m */
    public final String m16875m(String str, String str2) {
        try {
            Result.Companion companion = Result.INSTANCE;
            String string = new JSONObject(str).put("msg", str2).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
            return str;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final AssetFreezeApi m16868g() {
        return (AssetFreezeApi) C42597a.m93391g().create(AssetFreezeApi.class);
    }
}
