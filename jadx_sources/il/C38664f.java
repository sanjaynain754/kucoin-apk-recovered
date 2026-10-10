package il;

import android.os.Build;
import android.text.TextUtils;
import com.blankj.utilcode.util.C5276j;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.fingerprint.C12598b;
import com.kubi.kucoin.utils.NetUtils;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.site.SiteType;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import defpackage.NetDepend;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p694vk.C45590s;
import p799yj.C46510b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: il.f */
/* JADX INFO: compiled from: KuCoinParamsInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/KuCoinParamsInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "getValueEncoded", "", "value", "LAppNet_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38664f implements Interceptor {
    /* JADX INFO: renamed from: a */
    public final String m87400a(String str) throws UnsupportedEncodingException {
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

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        C45590s c45590s = C45590s.f102687a;
        Request.Builder builderAddHeader = builderNewBuilder.addHeader("X-APP-VERSION", c45590s.m100675Z()).addHeader("X-DEVICE", m87400a(Build.MODEL)).addHeader("X-DEVICE-NO", m87400a(C5276j.m6247f())).addHeader("X-DEVICE-INFO", m87400a(Build.FINGERPRINT)).addHeader("X-APP_ID", c45590s.m100661L()).addHeader("X-APP-bundlename", c45590s.m100661L()).addHeader("X-SYSTEM", "android");
        String country = Locale.getDefault().getCountry();
        if (country == null) {
            country = "";
        }
        Request.Builder builderAddHeader2 = builderAddHeader.addHeader("Locale", country).addHeader("X-IS-CN", String.valueOf(C46510b.m102600d()));
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        Request.Builder builderAddHeader3 = builderAddHeader2.addHeader("X-SYSTEM-VERSION", RELEASE).addHeader("LANG", MultiLanguageManager.f46811g.getLocalString()).addHeader("X-SITE", SiteType.INSTANCE.getCurrentSiteType()).addHeader("X-APP-MODE", AppMode.Companion.getCurrentMode$default(AppMode.INSTANCE, null, 1, null).getModeType());
        if (NetUtils.f28615a.m33205a()) {
            NetDepend netDepend = NetDepend.f3835a;
            builderAddHeader3.addHeader("X-ADS-CLIENT-ID", netDepend.m4057b().getAppInstanceId()).addHeader("X-ADS-CLICK-ID", netDepend.m4057b().mo88941b()).addHeader("X-UTM-SOURCE", m87400a(netDepend.m4057b().mo88943d())).addHeader("X-UTM-MEDIUM", m87400a(netDepend.m4057b().mo88942c())).addHeader("X-UTM-CAMPAIGN", m87400a(netDepend.m4057b().mo88940a()));
        }
        String strHeader = chain.request().header("SELF-UA");
        if (strHeader == null || strHeader.length() == 0) {
            builderAddHeader3.removeHeader("User-Agent").addHeader("User-Agent", "android/" + c45590s.m100675Z());
        }
        builderAddHeader3.removeHeader("SELF-UA");
        if (TextUtils.isEmpty(chain.request().header("noNeedToken"))) {
            String strHeader2 = chain.request().header("X-APP-TOKEN-OVERRIDE");
            if (strHeader2 == null) {
                strHeader2 = C27041f.m66668h(UserInfo.a.l());
            }
            builderAddHeader3.header("X-APP-TOKEN", strHeader2);
        }
        builderAddHeader3.removeHeader("noNeedToken");
        builderAddHeader3.removeHeader("X-APP-TOKEN-OVERRIDE");
        if (TextUtils.isEmpty(chain.request().header("X-SERVICE-PLATFORM")) && StringsKt.contains$default((CharSequence) chain.request().url().getUrl(), (CharSequence) "kumex", false, 2, (Object) null)) {
            builderAddHeader3.addHeader("X-SERVICE-PLATFORM", "KUMEX");
        }
        if (!TextUtils.isEmpty(c45590s.m100677b0())) {
            builderAddHeader3.addHeader("X-VERSION", c45590s.m100677b0());
        }
        Pair<String, String> pairM23781i = C12598b.f21975a.m23781i(chain.request().url().encodedPath());
        if (pairM23781i != null) {
            builderAddHeader3.addHeader(pairM23781i.getFirst(), pairM23781i.getSecond());
        }
        String strHeader3 = chain.request().header("X-SENSORS-ID");
        if (strHeader3 != null && strHeader3.length() != 0) {
            String distinctId = SensorsDataAPI.sharedInstance().getDistinctId();
            Intrinsics.checkNotNullExpressionValue(distinctId, "getDistinctId(...)");
            builderAddHeader3.header("X-SENSORS-ID", distinctId);
        }
        return chain.proceed(builderAddHeader3.build());
    }
}
