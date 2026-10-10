package com.kubi.user.thirdaccount.telegram;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.webkit.ProxyConfig;
import com.airbnb.lottie.LottieAnimationView;
import com.google.common.net.HttpHeaders;
import com.google.firebase.messaging.Constants;
import com.kubi.advert.api.IAdvertService;
import com.kubi.advert.api.entity.BackupValue;
import com.kubi.advert.api.entity.PromotionConfig;
import com.kubi.advert.api.entity.Property;
import com.kubi.otc.entity.OtcAd;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.widget.TitleBar;
import com.kubi.user.R$id;
import com.kubi.user.R$layout;
import com.kubi.user.R$string;
import com.kubi.user.exception.UserCenterException;
import com.kubi.user.exception.UserCenterExtAccountMessage;
import com.kubi.user.site.config.AccountConfig;
import com.kubi.user.track.LoginV3TrackDesc;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33556b3;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.trtc.uikit.livekit.p180kc.data.entity.ClickCardReport;
import d70.C36638a;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import kotlinx.coroutines.C41696j;
import l70.C42124h;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p481ny.C42899b;
import p569qq.C43840a;
import p569qq.C43846g;
import p569qq.C43852m;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: TelegramAuthActivity.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 *2\u00020\u0001:\u0004*+,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\f\u0010\u0014\u001a\u00020\u0011*\u00020\u000bH\u0003J\b\u0010\u0015\u001a\u00020\u0011H\u0014J\b\u0010\u0016\u001a\u00020\u0011H\u0014J\b\u0010\u0017\u001a\u00020\u0011H\u0014J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\b\u0010\u001a\u001a\u00020\u0011H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0002\u0010\u001eJP\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2(\b\u0002\u0010\"\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010#j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u0001`$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010&\u001a\u00020\tH\u0002J&\u0010'\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010(\u001a\u00020\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010)\u001a\u00020\u0005H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/kubi/user/thirdaccount/telegram/TelegramAuthActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "domain", "", "botId", "jsUrl", "enableCloseHandler", "", "webView", "Landroid/webkit/WebView;", "loadingView", "Lcom/airbnb/lottie/LottieAnimationView;", ClickCardReport.ReportData.CARD_TYPE_FUTURE, "Ljava/util/concurrent/Future;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initWebView", "onResume", "onPause", "onDestroy", "showLoading", "hideLoading", "startLoad", "timeout", "onBackPressed", "getLoadUrl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authResult", "code", "", "user", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "cancel", "track", "success", "formatHtml", "Companion", "ResultData", "HybridJsInterface", "TgWebViewClient", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTelegramAuthActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TelegramAuthActivity.kt\ncom/kubi/user/thirdaccount/telegram/TelegramAuthActivity\n+ 2 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,658:1\n57#2,8:659\n57#2,8:667\n76#2,2:675\n*S KotlinDebug\n*F\n+ 1 TelegramAuthActivity.kt\ncom/kubi/user/thirdaccount/telegram/TelegramAuthActivity\n*L\n127#1:659,8\n211#1:667,8\n314#1:675,2\n*E\n"})
public final class TelegramAuthActivity extends BaseActivity {

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Companion f53829p = new Companion(null);

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f53830i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public String f53831j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public String f53832k;

    /* JADX INFO: renamed from: l */
    public boolean f53833l = true;

    /* JADX INFO: renamed from: m */
    @Nullable
    public WebView f53834m;

    /* JADX INFO: renamed from: n */
    public LottieAnimationView f53835n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public Future<?> f53836o;

    /* JADX INFO: compiled from: TelegramAuthActivity.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/user/thirdaccount/telegram/TelegramAuthActivity$Companion;", "", "<init>", "()V", "TAG", "", "path", "jsApiName", "authHost", "CODE_SUCCESS", "", "CODE_CANCEL", "CODE_TIMEOUT", "CODE_FAILED", "CODE_ERROR", "CODE_WEBVIEW_ERROR", "CODE_CONFIG_ERROR", "CODE_WEBVIEW_LOAD_ERROR", "htmlString", "Landroid/webkit/WebResourceResponse;", "html", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final WebResourceResponse htmlString(@NotNull String html) {
            Intrinsics.checkNotNullParameter(html, "html");
            Buffer buffer = new Buffer();
            buffer.writeString(StringsKt.trim((CharSequence) html).toString(), Charsets.UTF_8);
            WebResourceResponse webResourceResponse = new WebResourceResponse("text/html", "UTF-8", buffer.inputStream());
            webResourceResponse.setStatusCodeAndReasonPhrase(200, "ok");
            HashMap map = new HashMap();
            map.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, ProxyConfig.MATCH_ALL_SCHEMES);
            map.put(HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS, "Content-Type");
            webResourceResponse.setResponseHeaders(map);
            return webResourceResponse;
        }
    }

    /* JADX INFO: compiled from: TelegramAuthActivity.kt */
    /* JADX INFO: loaded from: classes53.dex */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/user/thirdaccount/telegram/TelegramAuthActivity$HybridJsInterface;", "", "<init>", "(Lcom/kubi/user/thirdaccount/telegram/TelegramAuthActivity;)V", "prompt", "", "message", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTelegramAuthActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TelegramAuthActivity.kt\ncom/kubi/user/thirdaccount/telegram/TelegramAuthActivity$HybridJsInterface\n+ 2 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,658:1\n57#2,8:659\n*S KotlinDebug\n*F\n+ 1 TelegramAuthActivity.kt\ncom/kubi/user/thirdaccount/telegram/TelegramAuthActivity$HybridJsInterface\n*L\n398#1:659,8\n*E\n"})
    public final class HybridJsInterface {
        public HybridJsInterface() {
        }

        @JavascriptInterface
        public final void prompt(@Nullable String message) {
            if (message == null || message.length() == 0) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(message);
                String strOptString = jSONObject.optString("type");
                JSONObject jSONObject2 = jSONObject.getJSONObject(ReportDataTable.COLUMN_PARAMS);
                String strOptString2 = jSONObject2.optString("name");
                if (Intrinsics.areEqual(strOptString, "func")) {
                    if (Intrinsics.areEqual(strOptString2, "tgAuth")) {
                        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(TelegramAuthActivity.this), null, null, new TelegramAuthActivity$HybridJsInterface$prompt$1(jSONObject2, TelegramAuthActivity.this, null), 3, null);
                    } else if (Intrinsics.areEqual(strOptString2, "exit")) {
                        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(TelegramAuthActivity.this), null, null, new TelegramAuthActivity$HybridJsInterface$prompt$2(TelegramAuthActivity.this, null), 3, null);
                    }
                }
            } catch (Exception e11) {
                C42124h.f93552a.m92421g(LoginV3TrackDesc.THIRD_ACCOUNT_AUTH, false, "-120010", "third account auth error", e11);
                if (C42899b.m94075e(e11)) {
                    return;
                }
                if (C36638a.m81972c(e11)) {
                    C43846g.m96568c(new UserCenterException(e11, "TelegramAuthActivity", true, null, 8, null), null, 2, null);
                } else {
                    C36638a.m81973d(e11, "TelegramAuthActivity");
                }
            }
        }
    }

    /* JADX INFO: compiled from: TelegramAuthActivity.kt */
    /* JADX INFO: loaded from: classes53.dex */
    @Keep
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR1\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/user/thirdaccount/telegram/TelegramAuthActivity$ResultData;", "", "code", "", "data", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "msg", "<init>", "(Ljava/lang/Integer;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData", "()Ljava/util/HashMap;", "getError", "()Ljava/lang/String;", "getMsg", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ResultData {

        @Nullable
        private final Integer code;

        @Nullable
        private final HashMap<String, String> data;

        @Nullable
        private final String error;

        @Nullable
        private final String msg;

        @Nullable
        public final Integer getCode() {
            return this.code;
        }

        @Nullable
        public final HashMap<String, String> getData() {
            return this.data;
        }

        @Nullable
        public final String getError() {
            return this.error;
        }

        @Nullable
        public final String getMsg() {
            return this.msg;
        }

        public ResultData(@Nullable Integer num, @Nullable HashMap<String, String> map, @Nullable String str, @Nullable String str2) {
            this.code = num;
            this.data = map;
            this.error = str;
            this.msg = str2;
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.thirdaccount.telegram.TelegramAuthActivity$a */
    /* JADX INFO: compiled from: TelegramAuthActivity.kt */
    /* JADX INFO: loaded from: classes53.dex */
    @Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\u0019\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/user/thirdaccount/telegram/TelegramAuthActivity$TgWebViewClient;", "Landroid/webkit/WebViewClient;", "<init>", "(Lcom/kubi/user/thirdaccount/telegram/TelegramAuthActivity;)V", "shouldOverrideUrlLoading", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "onPageStarted", "", "url", "", "favicon", "Landroid/graphics/Bitmap;", "onPageCommitVisible", "onPageFinished", "onReceivedError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Landroid/webkit/WebResourceError;", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "onRenderProcessGone", C33556b3.f68963J, "Landroid/webkit/RenderProcessGoneDetail;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTelegramAuthActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TelegramAuthActivity.kt\ncom/kubi/user/thirdaccount/telegram/TelegramAuthActivity$TgWebViewClient\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,658:1\n29#2:659\n57#3,8:660\n76#3,2:668\n76#3,2:670\n57#3,8:672\n*S KotlinDebug\n*F\n+ 1 TelegramAuthActivity.kt\ncom/kubi/user/thirdaccount/telegram/TelegramAuthActivity$TgWebViewClient\n*L\n429#1:659\n442#1:660,8\n458#1:668,2\n479#1:670,2\n508#1:672,8\n*E\n"})
    public final class C26813a extends WebViewClient {
        @Override // android.webkit.WebViewClient
        @Nullable
        public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable WebResourceRequest request) {
            if (view != null && request != null) {
                try {
                    if (!Intrinsics.areEqual(request.getUrl().getHost(), TelegramAuthActivity.this.f53830i) || !Intrinsics.areEqual(request.getUrl().getEncodedPath(), "/inapp_telegram_login")) {
                        return null;
                    }
                    C43840a.m96550d("[page] shouldInterceptRequest useLocalHtml url=" + request.getUrl(), "TelegramAuthActivity");
                    return TelegramAuthActivity.f53829p.htmlString(TelegramAuthActivity.this.m65807e0());
                } catch (Exception e11) {
                    if (!C42899b.m94075e(e11)) {
                        if (C36638a.m81972c(e11)) {
                            C43846g.m96568c(new UserCenterException(e11, "TelegramAuthActivity", true, null, 8, null), null, 2, null);
                        } else {
                            C36638a.m81973d(e11, "TelegramAuthActivity");
                        }
                    }
                }
            }
            return null;
        }

        public C26813a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(@Nullable WebView view, @Nullable String url) {
            if (url == null) {
                return;
            }
            C43840a.m96550d("[page] onPageCommitVisible current=" + url, "TelegramAuthActivity");
            try {
                if (Intrinsics.areEqual(Uri.parse(url).getHost(), "oauth.telegram.org")) {
                    TelegramAuthActivity.this.m65801g0();
                    if (TelegramAuthActivity.this.f53833l) {
                        C44128b.m97266j("handle window close", "TelegramAuthActivity");
                        WebView webView = TelegramAuthActivity.this.f53834m;
                        if (webView != null) {
                            webView.evaluateJavascript("window.close = ()=>{window.KuCoin.prompt(JSON.stringify({type:'func', params:{name: 'exit'}}));}", null);
                        }
                    }
                }
            } catch (Throwable th2) {
                if (C42899b.m94075e(th2)) {
                    return;
                }
                if (C36638a.m81972c(th2)) {
                    C43846g.m96568c(new UserCenterException(th2, "TelegramAuthActivity", true, null, 8, null), null, 2, null);
                } else {
                    C36638a.m81973d(th2, "TelegramAuthActivity");
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceError error) throws JSONException {
            if (view == null || request == null || error == null) {
                return;
            }
            String path = request.getUrl().getPath();
            if (path == null || !StringsKt.endsWith$default(path, "ico", false, 2, (Object) null)) {
                C43840a.m96548b("[page] onReceivedError current=" + request.getUrl() + ", error=" + error, "TelegramAuthActivity");
                C43846g.m96568c(new UserCenterExtAccountMessage("onReceivedError load " + request.getUrl() + " Failed:" + error, "TelegramAuthActivity", false, 4, null), null, 2, null);
                C42124h.m92414h(C42124h.f93552a, LoginV3TrackDesc.THIRD_ACCOUNT_LOAD_PAGE, false, "-12003", "load Failed:" + error, null, 16, null);
                TelegramAuthActivity.m65800d0(TelegramAuthActivity.this, 23, null, "load Failed:" + error, false, 10, null);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceResponse errorResponse) throws JSONException {
            if (view == null || request == null || errorResponse == null) {
                return;
            }
            C43840a.m96548b("[page] onReceivedHttpError current=" + request.getUrl() + ", status=" + errorResponse.getStatusCode() + ", reason=" + errorResponse.getReasonPhrase(), "TelegramAuthActivity");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onReceivedHttpError load ");
            sb2.append(request.getUrl());
            sb2.append(" Failed:");
            sb2.append(errorResponse.getReasonPhrase());
            C43846g.m96568c(new UserCenterExtAccountMessage(sb2.toString(), "TelegramAuthActivity", false, 4, null), null, 2, null);
            C42124h.m92414h(C42124h.f93552a, LoginV3TrackDesc.THIRD_ACCOUNT_LOAD_PAGE, false, "-12004", "onReceivedHttpError " + errorResponse.getReasonPhrase(), null, 16, null);
            TelegramAuthActivity.m65800d0(TelegramAuthActivity.this, 23, null, "load Failed:" + errorResponse.getReasonPhrase(), false, 10, null);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) throws JSONException {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("telegram auth render process gone didCrash=");
            sb2.append(detail != null ? Boolean.valueOf(detail.didCrash()) : null);
            sb2.append(" priority=");
            sb2.append(detail != null ? Integer.valueOf(detail.rendererPriorityAtExit()) : null);
            C43840a.m96548b(sb2.toString(), "TelegramAuthActivity");
            TelegramAuthActivity.this.m65801g0();
            SafeWebView safeWebView = view instanceof SafeWebView ? (SafeWebView) view : null;
            if (safeWebView != null) {
                safeWebView.m65790c();
            }
            if (view != null) {
                C26825l.m65825j(view);
            }
            TelegramAuthActivity.m65800d0(TelegramAuthActivity.this, 23, null, "render process gone", false, 10, null);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable WebResourceRequest request) {
            if (request == null) {
                return false;
            }
            C43840a.m96550d("shouldOverrideUrlLoading: " + request.getUrl(), "TelegramAuthActivity");
            String host = request.getUrl().getHost();
            if (Intrinsics.areEqual(host, TelegramAuthActivity.this.f53830i) || Intrinsics.areEqual(host, "oauth.telegram.org")) {
                return super.shouldOverrideUrlLoading(view, request);
            }
            TelegramAuthActivity.this.startActivity(new Intent("android.intent.action.VIEW", request.getUrl()));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView view, @Nullable String url) {
            super.onPageFinished(view, url);
            C43840a.m96550d("[page] onPageFinished current=" + url, "TelegramAuthActivity");
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(@Nullable WebView view, @Nullable String url, @Nullable Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            C43840a.m96550d("[page] onPageStarted current=" + url, "TelegramAuthActivity");
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m65806c0(int i11, HashMap<String, String> map, String str, boolean z11) throws JSONException {
        if (z11) {
            setResult(0);
            m65805n0(this, 1, false, null, 6, null);
        } else if (map == null || map.isEmpty()) {
            String str2 = str == null ? "unknown" : str;
            Intent intent = new Intent();
            intent.putExtra(Constants.IPC_BUNDLE_KEY_SEND_ERROR, str2);
            intent.putExtra("errorCode", String.valueOf(i11));
            Unit unit = Unit.INSTANCE;
            setResult(1, intent);
            C43846g.m96568c(new UserCenterExtAccountMessage(str2, "TelegramAuthActivity", false, 4, null), null, 2, null);
            m65805n0(this, i11, false, str2, 2, null);
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("user", map);
            Unit unit2 = Unit.INSTANCE;
            setResult(0, intent2);
            m65805n0(this, 0, true, null, 4, null);
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m65800d0(TelegramAuthActivity telegramAuthActivity, int i11, HashMap map, String str, boolean z11, int i12, Object obj) throws JSONException {
        if ((i12 & 2) != 0) {
            map = null;
        }
        if ((i12 & 4) != 0) {
            str = null;
        }
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        telegramAuthActivity.m65806c0(i11, map, str, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public final void m65801g0() {
        LottieAnimationView lottieAnimationView = this.f53835n;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingView");
            lottieAnimationView = null;
        }
        ViewExtKt.m66577h(lottieAnimationView);
        LottieAnimationView lottieAnimationView2 = this.f53835n;
        if (lottieAnimationView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingView");
            lottieAnimationView2 = null;
        }
        lottieAnimationView2.pauseAnimation();
        try {
            Future<?> future = this.f53836o;
            if (future != null) {
                future.cancel(false);
            }
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                if (C36638a.m81972c(e11)) {
                    C43846g.m96568c(new UserCenterException(e11, "TelegramAuthActivity", true, null, 8, null), null, 2, null);
                } else {
                    C36638a.m81973d(e11, "TelegramAuthActivity");
                }
            }
        } finally {
            this.f53836o = null;
        }
    }

    /* JADX INFO: renamed from: j0 */
    private final void m65803j0() {
        LottieAnimationView lottieAnimationView = this.f53835n;
        LottieAnimationView lottieAnimationView2 = null;
        if (lottieAnimationView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingView");
            lottieAnimationView = null;
        }
        C27046k.m66685H(lottieAnimationView);
        LottieAnimationView lottieAnimationView3 = this.f53835n;
        if (lottieAnimationView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingView");
        } else {
            lottieAnimationView2 = lottieAnimationView3;
        }
        lottieAnimationView2.playAnimation();
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m65805n0(TelegramAuthActivity telegramAuthActivity, int i11, boolean z11, String str, int i12, Object obj) throws JSONException {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if ((i12 & 4) != 0) {
            str = null;
        }
        telegramAuthActivity.m65811m0(i11, z11, str);
    }

    /* JADX INFO: renamed from: e0 */
    public final String m65807e0() {
        return StringsKt.trimIndent("\n            <!doctype html>\n            <html>\n            <body>\n            <script src=\"" + this.f53832k + "\" data-bot-id=\"" + this.f53831j + "\" data-domain=\"" + this.f53830i + "\" data-return-path=\"/inapp_telegram_login\"></script>\n            </body>\n            </html>\n        ");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: f0 */
    public final Object m65808f0(Continuation<? super String> continuation) throws JSONException {
        TelegramAuthActivity$getLoadUrl$1 telegramAuthActivity$getLoadUrl$1;
        List<Property> properties;
        if (continuation instanceof TelegramAuthActivity$getLoadUrl$1) {
            telegramAuthActivity$getLoadUrl$1 = (TelegramAuthActivity$getLoadUrl$1) continuation;
            int i11 = telegramAuthActivity$getLoadUrl$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                telegramAuthActivity$getLoadUrl$1.label = i11 - Integer.MIN_VALUE;
            } else {
                telegramAuthActivity$getLoadUrl$1 = new TelegramAuthActivity$getLoadUrl$1(this, continuation);
            }
        } else {
            telegramAuthActivity$getLoadUrl$1 = new TelegramAuthActivity$getLoadUrl$1(this, continuation);
        }
        TelegramAuthActivity$getLoadUrl$1 telegramAuthActivity$getLoadUrl$2 = telegramAuthActivity$getLoadUrl$1;
        Object objM14757j = telegramAuthActivity$getLoadUrl$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = telegramAuthActivity$getLoadUrl$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM14757j);
            IAdvertService iAdvertService = IAdvertService.f15070a.get();
            telegramAuthActivity$getLoadUrl$2.label = 1;
            objM14757j = IAdvertService.m14757j(iAdvertService, "toc", "AppTelegramBotConfig", false, telegramAuthActivity$getLoadUrl$2, 4, null);
            if (objM14757j == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM14757j);
        }
        PromotionConfig promotionConfig = (PromotionConfig) objM14757j;
        Property property = (promotionConfig == null || (properties = promotionConfig.getProperties()) == null) ? null : (Property) CollectionsKt.firstOrNull((List) properties);
        BackupValue backupValues = property != null ? property.getBackupValues() : null;
        if (property == null || backupValues == null) {
            C42124h c42124h = C42124h.f93552a;
            LoginV3TrackDesc loginV3TrackDesc = LoginV3TrackDesc.THIRD_ACCOUNT_FETCH_CONFIG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("third account load config property ");
            sb2.append(property == null);
            sb2.append(",values ");
            sb2.append(backupValues == null);
            C42124h.m92414h(c42124h, loginV3TrackDesc, false, "-12001", sb2.toString(), null, 16, null);
            m65800d0(this, 22, null, "config is null", false, 10, null);
            return null;
        }
        String jumpUrl = property.getJumpUrl();
        String domain = backupValues.getDomain();
        String id2 = backupValues.getId();
        if (domain == null || id2 == null) {
            C42124h c42124h2 = C42124h.f93552a;
            LoginV3TrackDesc loginV3TrackDesc2 = LoginV3TrackDesc.THIRD_ACCOUNT_FETCH_CONFIG;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("third account load config property ");
            sb3.append(domain == null);
            sb3.append(",values ");
            sb3.append(id2 == null);
            C42124h.m92414h(c42124h2, loginV3TrackDesc2, false, "-12002", sb3.toString(), null, 16, null);
            m65800d0(this, 22, null, "config is null", false, 10, null);
            return null;
        }
        this.f53830i = domain;
        this.f53831j = id2;
        this.f53832k = jumpUrl;
        this.f53833l = backupValues.getEnable();
        C43840a.m96550d("[entry] configResolved domain=" + domain + ", jsUrl=" + jumpUrl + ", target=https://" + domain + "/inapp_telegram_login", "TelegramAuthActivity");
        return "https://" + domain + "/inapp_telegram_login";
    }

    /* JADX INFO: renamed from: m0 */
    public final void m65811m0(int i11, boolean z11, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("loginType", AccountConfig.TELEGRAM);
        jSONObject.put("is_success", z11);
        jSONObject.put("code", i11);
        jSONObject.put("error_msg", str);
        C43852m.m96605q("third_party_auth", jSONObject);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws JSONException {
        C42124h.m92414h(C42124h.f93552a, LoginV3TrackDesc.THIRD_ACCOUNT_LOGIN, false, OtcAd.KYC_NOT_PASS, "third account auth cancel", null, 16, null);
        m65800d0(this, 1, null, null, true, 6, null);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[destroy] onDestroy currentUrl=");
        WebView webView = this.f53834m;
        sb2.append(webView != null ? webView.getUrl() : null);
        C43840a.m96550d(sb2.toString(), "TelegramAuthActivity");
        super.onDestroy();
        m65801g0();
        WebView webView2 = this.f53834m;
        if (webView2 != null) {
            C26825l.m65825j(webView2);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m65802i0(TelegramAuthActivity telegramAuthActivity, View view) throws JSONException {
        telegramAuthActivity.onBackPressed();
    }

    /* JADX INFO: renamed from: k0 */
    private final void m65804k0() {
        m65803j0();
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TelegramAuthActivity$startLoad$1(this, null), 3, null);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: h0 */
    public final void m65809h0(WebView webView) {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setUseWideViewPort(false);
        webView.getSettings().setCacheMode(-1);
        webView.setLayerType(2, null);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        webView.getSettings().setMixedContentMode(1);
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowFileAccessFromFileURLs(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setMinimumFontSize(12);
        webView.getSettings().setDefaultTextEncodingName("UTF-8");
        webView.getSettings().setUserAgentString(webView.getSettings().getUserAgentString() + "KuCoin/" + C45590s.f102687a.m100675Z());
        webView.setWebViewClient(new C26813a());
        webView.addJavascriptInterface(new HybridJsInterface(), "KuCoin");
    }

    /* JADX INFO: renamed from: l0 */
    public final void m65810l0() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TelegramAuthActivity$timeout$1(this, null), 3, null);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        String action;
        String dataString;
        super.onCreate(savedInstanceState);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[lifecycle] onCreate action=");
        Intent intent = getIntent();
        if (intent != null) {
            action = intent.getAction();
        } else {
            action = null;
        }
        sb2.append(action);
        sb2.append(", data=");
        Intent intent2 = getIntent();
        if (intent2 != null) {
            dataString = intent2.getDataString();
        } else {
            dataString = null;
        }
        sb2.append(dataString);
        C43840a.m96550d(sb2.toString(), "TelegramAuthActivity");
        setContentView(R$layout.busercenter_activity_tg_auth);
        FrameLayout frameLayout = (FrameLayout) findViewById(R$id.web_container);
        View viewFindViewById = findViewById(R$id.loading_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f53835n = (LottieAnimationView) viewFindViewById;
        try {
            SafeWebView safeWebView = new SafeWebView(this);
            frameLayout.addView(safeWebView, 0, new ViewGroup.LayoutParams(-1, -1));
            m65809h0(safeWebView);
            this.f53834m = safeWebView;
            TitleBar titleBar = (TitleBar) findViewById(R$id.navigation_bar);
            titleBar.setTitle(C27017c.f54310a.m66516f(R$string.kc_thrid_account_tg_auth_title, new Object[0]));
            titleBar.setOnNavigationListener(new View.OnClickListener() { // from class: com.kubi.user.thirdaccount.telegram.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws JSONException {
                    TelegramAuthActivity.m65802i0(this.f53838b, view);
                }
            });
            m65804k0();
        } catch (Exception e11) {
            if (!C42899b.m94075e(e11)) {
                if (!C36638a.m81972c(e11)) {
                    C36638a.m81973d(e11, "TelegramAuthActivity");
                } else {
                    C43846g.m96568c(new UserCenterException(e11, "TelegramAuthActivity", true, null, 8, null), null, 2, null);
                }
            }
            C42124h.f93552a.m92421g(LoginV3TrackDesc.THIRD_ACCOUNT_INIT, false, "-12000", "third account webview init error", e11);
            m65800d0(this, 21, null, "hasn't webview", false, 10, null);
        }
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        String url;
        super.onPause();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[lifecycle] onPause currentUrl=");
        WebView webView = this.f53834m;
        if (webView != null) {
            url = webView.getUrl();
        } else {
            url = null;
        }
        sb2.append(url);
        C43840a.m96550d(sb2.toString(), "TelegramAuthActivity");
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String url;
        super.onResume();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[lifecycle] onResume currentUrl=");
        WebView webView = this.f53834m;
        if (webView != null) {
            url = webView.getUrl();
        } else {
            url = null;
        }
        sb2.append(url);
        C43840a.m96550d(sb2.toString(), "TelegramAuthActivity");
    }
}
