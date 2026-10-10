package com.sumsub.sns.internal.core.data.network;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29585o;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import java.io.IOException;
import okhttp3.ResponseBody;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.text.StringsKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.data.network.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28517c implements Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Callback f58050a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28518d f58051b;

    public C28517c(Callback callback, C28518d c28518d) {
        this.f58050a = callback;
        this.f58051b = c28518d;
    }

    @Override // retrofit2.Callback
    public final void onFailure(Call call, Throwable th2) {
        C33272c c33272c = C33272c.f67812a;
        Logger.DefaultImpls.v$default(C33272c.m71618b(CollectionsKt.listOf(LoggerType.LOG_CAT)), "ApiResponseCall", "failure on " + call.request().url(), null, 4, null);
        this.f58050a.onFailure(this.f58051b, th2 instanceof IOException ? new SNSException.Network(th2) : new SNSException.Unknown(th2));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8  */
    @Override // retrofit2.Callback
    public final void onResponse(Call call, Response response) {
        Object objConvert;
        Throwable unknown;
        String strMo69300a;
        Object objBody = response.body();
        ResponseBody responseBodyErrorBody = response.errorBody();
        if (response.isSuccessful()) {
            this.f58050a.onResponse(this.f58051b, Response.success(objBody, response.headers()));
            return;
        }
        String string = null;
        if (responseBodyErrorBody != null && responseBodyErrorBody.getContentLength() != 0) {
            try {
                objConvert = this.f58051b.f58053b.convert(responseBodyErrorBody);
            } catch (Exception unused) {
                objConvert = null;
            }
        } else {
            objConvert = null;
        }
        String str = " url=" + call.request().url();
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "resources/serviceLogger/", false, 2, (Object) null)) {
            C33272c c33272c = C33272c.f67812a;
            Logger.DefaultImpls.v$default(C33272c.m71618b(CollectionsKt.listOf((Object[]) new LoggerType[]{LoggerType.SDK_CLIENT, LoggerType.KIBANA})), "ApiResponseCall", "failure on " + str, null, 4, null);
        }
        if (objConvert instanceof C29585o) {
            C29585o c29585o = (C29585o) objConvert;
            String str2 = c29585o.f59608e;
            if (str2 != null) {
                String strMo69300a2 = this.f58051b.f58054c.mo69300a(str2);
                if (strMo69300a2 != null) {
                    string = strMo69300a2.toString();
                }
                if (string == null) {
                    strMo69300a = this.f58051b.f58054c.mo69300a(String.valueOf(c29585o.f59607d));
                    if (strMo69300a != null) {
                        string = strMo69300a.toString();
                    } else {
                        string = c29585o.f59604a;
                    }
                }
            } else {
                strMo69300a = this.f58051b.f58054c.mo69300a(String.valueOf(c29585o.f59607d));
                if (strMo69300a != null) {
                    string = strMo69300a.toString();
                } else {
                    string = c29585o.f59604a;
                }
            }
            unknown = new SNSException.Api(string, c29585o.f59605b, c29585o.f59606c, c29585o.f59607d, c29585o.f59608e);
        } else {
            unknown = new SNSException.Unknown(new Exception("Unknown API error"));
        }
        this.f58050a.onFailure(this.f58051b, unknown);
    }
}
