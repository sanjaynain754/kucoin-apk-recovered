package com.kubi.widget.web.cookie;

import android.os.Build;
import com.blankj.utilcode.util.C5276j;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.host.HostManager;
import com.kubi.network.retrofit.listener.OkHttpTrackEventListener;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.web.util.C24329b;
import com.kubi.utils.C27099x;
import com.kubi.widget.web.exception.KWebWidgetException;
import com.kubi.widget.web.exception.KWebWidgetMessage;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;
import q80.C43667a;
import rg0.C44087f;
import rg0.InterfaceC44082a;
import ro.C44128b;
import w80.C45758c;

/* JADX INFO: compiled from: GrayCookieHelper.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u0005J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0002J\u000e\u0010\u0015\u001a\u00020\u000bH\u0082@¢\u0006\u0002\u0010\u0016J\u0012\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/widget/web/cookie/GrayCookieHelper;", "", "<init>", "()V", "TAG", "", "isGrayUpdated", "Ljava/util/concurrent/atomic/AtomicBoolean;", "updatedGrayLock", "Lkotlinx/coroutines/sync/Mutex;", "updatedGray", "", "force", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWebGrayValue", "url", "grayRegex", "Lkotlin/text/Regex;", "findWebGrayValue", "cookie", "updateGrayByHttp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getValueEncoded", "value", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGrayCookieHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrayCookieHelper.kt\ncom/kubi/widget/web/cookie/GrayCookieHelper\n+ 2 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,139:1\n46#2,6:140\n46#2,6:146\n54#2,2:152\n54#2,2:157\n46#2,6:159\n196#3,3:154\n*S KotlinDebug\n*F\n+ 1 GrayCookieHelper.kt\ncom/kubi/widget/web/cookie/GrayCookieHelper\n*L\n60#1:140,6\n72#1:146,6\n104#1:152,2\n110#1:157,2\n116#1:159,6\n107#1:154,3\n*E\n"})
public final class GrayCookieHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final GrayCookieHelper f55062a = new GrayCookieHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final AtomicBoolean f55063b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final InterfaceC44082a f55064c = C44087f.m97144b(false, 1, null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Regex f55065d = new Regex("WEBGRAY=([^;]+)");

    /* JADX INFO: renamed from: d */
    public final String m67105d(String str) throws UnsupportedEncodingException {
        if (str == null) {
            return "null";
        }
        String strReplace$default = StringsKt.replace$default(str, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "", false, 4, (Object) null);
        int length = strReplace$default.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = strReplace$default.charAt(i11);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                String strEncode = URLEncoder.encode(strReplace$default, "UTF-8");
                Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
                return strEncode;
            }
        }
        return strReplace$default;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: e */
    public final Object m67106e(Continuation<? super Unit> continuation) {
        GrayCookieHelper$updateGrayByHttp$1 grayCookieHelper$updateGrayByHttp$1;
        OkHttpClient okHttpClientBuild;
        String strM;
        Request requestBuild;
        String str;
        BaseEntity baseEntity;
        if (continuation instanceof GrayCookieHelper$updateGrayByHttp$1) {
            grayCookieHelper$updateGrayByHttp$1 = (GrayCookieHelper$updateGrayByHttp$1) continuation;
            int i11 = grayCookieHelper$updateGrayByHttp$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                grayCookieHelper$updateGrayByHttp$1.label = i11 - Integer.MIN_VALUE;
            } else {
                grayCookieHelper$updateGrayByHttp$1 = new GrayCookieHelper$updateGrayByHttp$1(this, continuation);
            }
        } else {
            grayCookieHelper$updateGrayByHttp$1 = new GrayCookieHelper$updateGrayByHttp$1(this, continuation);
        }
        Object objM101024a = grayCookieHelper$updateGrayByHttp$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = grayCookieHelper$updateGrayByHttp$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM101024a);
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                builder.eventListener(OkHttpTrackEventListener.INSTANCE.acquire());
                builder.cookieJar(C43667a.f96477a);
                okHttpClientBuild = builder.build();
                strM = HostManager.a.m();
                Request.Builder builderUrl = new Request.Builder().url(strM + "/_api/anonymous/coloring/app");
                C45590s c45590s = C45590s.f102687a;
                Request.Builder builderAddHeader = builderUrl.addHeader("X-APP-VERSION", c45590s.m100675Z()).addHeader("X-DEVICE", m67105d(Build.MODEL)).addHeader("X-DEVICE-NO", m67105d(C5276j.m6247f())).addHeader("X-DEVICE-INFO", m67105d(Build.FINGERPRINT)).addHeader("X-APP_ID", c45590s.m100661L()).addHeader("X-SYSTEM", "android");
                String RELEASE = Build.VERSION.RELEASE;
                Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                requestBuild = builderAddHeader.addHeader("X-SYSTEM-VERSION", RELEASE).addHeader("LANG", MultiLanguageManager.f46811g.getLocalString()).build();
                Call callNewCall = okHttpClientBuild.newCall(requestBuild);
                grayCookieHelper$updateGrayByHttp$1.L$0 = SpillingKt.nullOutSpilledVariable(okHttpClientBuild);
                grayCookieHelper$updateGrayByHttp$1.L$1 = SpillingKt.nullOutSpilledVariable(strM);
                grayCookieHelper$updateGrayByHttp$1.L$2 = SpillingKt.nullOutSpilledVariable(requestBuild);
                grayCookieHelper$updateGrayByHttp$1.label = 1;
                objM101024a = C45758c.m101024a(callNewCall, grayCookieHelper$updateGrayByHttp$1);
                if (objM101024a == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                requestBuild = (Request) grayCookieHelper$updateGrayByHttp$1.L$2;
                strM = (String) grayCookieHelper$updateGrayByHttp$1.L$1;
                okHttpClientBuild = (OkHttpClient) grayCookieHelper$updateGrayByHttp$1.L$0;
                ResultKt.throwOnFailure(objM101024a);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) grayCookieHelper$updateGrayByHttp$1.L$4;
                ResultKt.throwOnFailure(objM101024a);
            }
            baseEntity = (BaseEntity) objM101024a;
            if (baseEntity == null && baseEntity.getSuccess()) {
                f55063b.set(true);
                return Unit.INSTANCE;
            }
            C24329b.m58861c(C24329b.f48558a, "coloring", "get sgray error " + str, null, 4, null);
            C43846g.m96568c(new KWebWidgetMessage("get gray error " + baseEntity, "updateGrayByHttp", false, 4, null), null, 2, null);
            return Unit.INSTANCE;
            Response response = (Response) objM101024a;
            if (!response.isSuccessful()) {
                C24329b.m58861c(C24329b.f48558a, "coloring", "updateGrayByHttp code=" + response.code(), null, 4, null);
                return Unit.INSTANCE;
            }
            ResponseBody responseBodyBody = response.body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            if (strString == null) {
                C44128b.m97261e("GrayCookieHelper", "updateGrayByHttp body is emtpy");
                C43846g.m96568c(new KWebWidgetMessage("body is emtpy", "updateGrayByHttp", false, 4, null), null, 2, null);
                return Unit.INSTANCE;
            }
            C27099x c27099x = C27099x.f54458a;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new GrayCookieHelper$updateGrayByHttp$$inlined$fromJsonOrNull$1(strString, null)), C42911a.m94120b());
            grayCookieHelper$updateGrayByHttp$1.L$0 = SpillingKt.nullOutSpilledVariable(okHttpClientBuild);
            grayCookieHelper$updateGrayByHttp$1.L$1 = SpillingKt.nullOutSpilledVariable(strM);
            grayCookieHelper$updateGrayByHttp$1.L$2 = SpillingKt.nullOutSpilledVariable(requestBuild);
            grayCookieHelper$updateGrayByHttp$1.L$3 = SpillingKt.nullOutSpilledVariable(response);
            grayCookieHelper$updateGrayByHttp$1.L$4 = strString;
            grayCookieHelper$updateGrayByHttp$1.L$5 = SpillingKt.nullOutSpilledVariable(c27099x);
            grayCookieHelper$updateGrayByHttp$1.L$6 = SpillingKt.nullOutSpilledVariable(strString);
            grayCookieHelper$updateGrayByHttp$1.I$0 = 0;
            grayCookieHelper$updateGrayByHttp$1.label = 2;
            objM101024a = C41636g.m90914f0(interfaceC41634eM90890N, grayCookieHelper$updateGrayByHttp$1);
            if (objM101024a != coroutine_suspended) {
                str = strString;
                baseEntity = (BaseEntity) objM101024a;
                if (baseEntity == null) {
                }
                C24329b.m58861c(C24329b.f48558a, "coloring", "get sgray error " + str, null, 4, null);
                C43846g.m96568c(new KWebWidgetMessage("get gray error " + baseEntity, "updateGrayByHttp", false, 4, null), null, 2, null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Exception e11) {
            if (C42899b.m94075e(e11)) {
                C24329b.f48558a.m58863b("coloring", "updateGrayByHttp has some ex", e11);
            } else if (C42899b.m94075e(e11)) {
                C44128b.m97264h(e11);
            } else {
                C43846g.m96568c(new KWebWidgetException(e11, "updateGrayByHttp", false, null, 8, null), null, 2, null);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m67107f(boolean z11, @NotNull Continuation<? super Unit> continuation) {
        Object objM91049g = C41686h.m91049g(C42911a.m94120b(), new GrayCookieHelper$updatedGray$2(z11, null), continuation);
        if (objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM91049g;
        }
        return Unit.INSTANCE;
    }
}
