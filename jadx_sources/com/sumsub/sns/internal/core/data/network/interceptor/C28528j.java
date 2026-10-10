package com.sumsub.sns.internal.core.data.network.interceptor;

import android.util.Base64;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.listener.TokenExpirationHandler;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.core.common.AbstractC28393F0;
import com.sumsub.sns.internal.core.common.AbstractC28400J;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.domain.C28576g;
import com.sumsub.sns.internal.core.domain.C28598r;
import com.sumsub.sns.internal.core.domain.InterfaceC28584k;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29585o;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33978va;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.text.Charsets;
import p852kotlin.text.StringsKt;
import ug0.C45236a;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.data.network.interceptor.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28528j implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final InterfaceC28584k f58074a;

    /* JADX INFO: renamed from: b */
    public final C28576g f58075b;

    /* JADX INFO: renamed from: c */
    public final AbstractC46162a f58076c = AbstractC28400J.m69286a(C28468k0.f57988f);

    /* JADX INFO: renamed from: d */
    public int f58077d;

    /* JADX INFO: renamed from: a */
    public final boolean m69402a() {
        String strOnTokenExpired = null;
        try {
            TokenExpirationHandler tokenExpirationHandler = C28468k0.f57983a.getTokenExpirationHandler();
            if (tokenExpirationHandler != null) {
                strOnTokenExpired = tokenExpirationHandler.onTokenExpired();
            }
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            String strM71624a = AbstractC33294e.m71624a(this);
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            C33272c.f67814c.mo68956e(strM71624a, message, e11);
            C33272c.f67816e.f67810a.mo68955d("TokenInterceptor", "error updating token: " + e11.getMessage(), null);
        }
        if (strOnTokenExpired == null || strOnTokenExpired.length() < 5) {
            return false;
        }
        this.f58074a.put(strOnTokenExpired);
        return true;
    }

    @Override // okhttp3.Interceptor
    public final synchronized Response intercept(Interceptor.Chain chain) {
        Object objM103844constructorimpl;
        int i11;
        Integer num;
        try {
            Request request = chain.request();
            Request requestM69403b = m69403b(request);
            if (requestM69403b != null) {
                request = requestM69403b;
            }
            Response responseProceed = chain.proceed(request);
            if (responseProceed.code() != 401) {
                this.f58077d = 0;
                return responseProceed;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                ResponseBody responseBodyBody = responseProceed.body();
                String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                AbstractC46162a abstractC46162a = this.f58076c;
                abstractC46162a.getSerializersModule();
                objM103844constructorimpl = Result.m103844constructorimpl((C29585o) abstractC46162a.mo99408a(C29585o.Companion.serializer(), strString));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103851isSuccessimpl(objM103844constructorimpl) && (num = ((C29585o) objM103844constructorimpl).f59607d) != null && num.intValue() == 10402) {
                C33272c.f67816e.f67810a.mo68955d("TokenInterceptor", "Skipping SumsubID 401 error...", null);
                this.f58077d = 0;
                return chain.proceed(request);
            }
            C33272c.f67816e.f67810a.mo68955d("TokenInterceptor", "Token is expired. Attempts(" + this.f58077d + "). Headers are " + responseProceed.headers() + ", try to refresh...", null);
            do {
                Request requestM69404c = m69404c(request);
                if (requestM69404c != null) {
                    request = requestM69404c;
                }
                responseProceed.close();
                responseProceed = chain.proceed(request);
                if (responseProceed.code() != 401) {
                    this.f58077d = 0;
                    break;
                }
                i11 = this.f58077d + 1;
                this.f58077d = i11;
            } while (i11 < 3);
            if (this.f58077d >= 3) {
                this.f58077d = 0;
            }
            return responseProceed;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Request m69403b(Request request) {
        String str = (String) this.f58074a.mo69410a();
        if (str == null || str.length() < 5) {
            C33272c.f67816e.f67810a.mo68955d("TokenInterceptor", "Invalid token, try to refresh", null);
            return null;
        }
        try {
            return m69401a(request);
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            String strM71624a = AbstractC33294e.m71624a(this);
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            C33272c.f67814c.mo68956e(strM71624a, message, e11);
            C33272c.f67816e.f67810a.mo68955d("TokenInterceptor", "error adding header: " + e11.getMessage(), null);
            Map map = AbstractC28393F0.f57880a;
            AbstractC28393F0.m69278a(new SNSException.Unknown(e11));
            return null;
        }
    }

    public C28528j(C28598r c28598r, C28576g c28576g) {
        this.f58074a = c28598r;
        this.f58075b = c28576g;
    }

    /* JADX INFO: renamed from: c */
    public final Request m69404c(Request request) {
        if (!m69402a()) {
            return null;
        }
        try {
            return m69401a(request);
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            String strM71624a = AbstractC33294e.m71624a(this);
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            Logger.DefaultImpls.e$default(c33272c, strM71624a, message, null, 4, null);
            C33272c.f67816e.f67810a.mo68955d("TokenInterceptor", "error adding header: " + e11.getMessage(), null);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Request m69401a(Request request) {
        String str;
        String str2;
        String strScheme;
        String strHost;
        Request.Builder builderRemoveHeader = request.newBuilder().removeHeader("X-Access-Token");
        String str3 = (String) this.f58074a.mo69410a();
        if (!StringsKt.startsWith$default(str3, "_act-jwt-", false, 2, (Object) null) && !StringsKt.startsWith$default(str3, "_act-sbx-jwt-", false, 2, (Object) null)) {
            builderRemoveHeader.addHeader("X-Access-Token", str3);
        } else {
            try {
                List listSplit$default = StringsKt.split$default((CharSequence) StringsKt.removePrefix(StringsKt.removePrefix(str3, (CharSequence) "_act-jwt-"), (CharSequence) "_act-sbx-jwt-"), new String[]{C33978va.f72339h}, false, 0, 6, (Object) null);
                String str4 = (String) listSplit$default.get(0);
                String str5 = (String) listSplit$default.get(1);
                byte[] bArrDecode = Base64.decode(URLDecoder.decode(str4, "utf-8"), 2);
                Charset charset = Charsets.UTF_8;
                String str6 = new String(bArrDecode, charset);
                String str7 = new String(Base64.decode(URLDecoder.decode(str5, "utf-8"), 2), charset);
                Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "JWT: header=" + str6 + " payload=" + str7, null, 4, null);
                AbstractC46162a abstractC46162aM69286a = AbstractC28400J.m69286a(C28468k0.f57988f);
                abstractC46162aM69286a.getSerializersModule();
                C28527i c28527i = (C28527i) abstractC46162aM69286a.mo99408a(C45236a.m99969u(C28527i.Companion.serializer()), str7);
                if (c28527i != null && (str2 = c28527i.f58072a) != null) {
                    this.f58074a.put(str2);
                    builderRemoveHeader.addHeader("X-Access-Token", str2);
                }
                if (c28527i != null && (str = c28527i.f58073b) != null) {
                    C28576g c28576g = this.f58075b;
                    c28576g.getClass();
                    c28576g.f58141a = str;
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Exception unused) {
                builderRemoveHeader.addHeader("X-Access-Token", str3);
            }
        }
        String str8 = this.f58075b.f58141a;
        if (str8 != null) {
            HttpUrl httpUrl = HttpUrl.INSTANCE.parse(str8);
            HttpUrl httpUrlUrl = request.url();
            HttpUrl.Builder builderNewBuilder = httpUrlUrl.newBuilder();
            if (httpUrl == null || (strScheme = httpUrl.scheme()) == null) {
                strScheme = httpUrlUrl.scheme();
            }
            HttpUrl.Builder builderScheme = builderNewBuilder.scheme(strScheme);
            if (httpUrl == null || (strHost = httpUrl.host()) == null) {
                strHost = httpUrlUrl.host();
            }
            HttpUrl httpUrlBuild = builderScheme.host(strHost).build();
            C33272c.f67816e.f67810a.mo68955d("TokenInterceptor", "Substitute url: " + httpUrlUrl + " -> " + httpUrlBuild, null);
            builderRemoveHeader.url(httpUrlBuild);
        }
        return builderRemoveHeader.build();
    }
}
