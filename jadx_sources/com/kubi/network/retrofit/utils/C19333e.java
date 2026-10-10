package com.kubi.network.retrofit.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.network.retrofit.exception.ApiException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p511or.C43174a;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.network.retrofit.utils.e */
/* JADX INFO: compiled from: ResponseUtils.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u000520\u0010\r\u001a,\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/network/retrofit/utils/e;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Lokhttp3/ResponseBody;", "value", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "ignore", "Lkotlin/ExtensionFunctionType;", "parser", "b", "(Lokhttp3/ResponseBody;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "", "throwable", "Lorg/json/JSONObject;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Throwable;)Lorg/json/JSONObject;", "network-core-retrofit_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nResponseUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseUtils.kt\ncom/kubi/network/retrofit/utils/ResponseUtils\n+ 2 NetCoreRetrofitIssue.kt\ncom/kubi/network/retrofit/exception/NetCoreRetrofitIssueKt\n*L\n1#1,52:1\n64#2,34:53\n*S KotlinDebug\n*F\n+ 1 ResponseUtils.kt\ncom/kubi/network/retrofit/utils/ResponseUtils\n*L\n25#1:53,34\n*E\n"})
public final class C19333e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19333e f35973a = new C19333e();

    /* JADX INFO: renamed from: a */
    public final JSONObject m42844a(Throwable throwable) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", "-1000");
        jSONObject.put("msg", throwable.getMessage());
        return jSONObject;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final <T> T m42845b(@NotNull ResponseBody value, @NotNull Function2<Object, ? super Boolean, ? extends T> parser) throws JSONException, ApiException {
        JSONObject jSONObjectM42844a;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(parser, "parser");
        try {
            jSONObjectM42844a = new JSONObject(value.string());
        } catch (Exception e11) {
            boolean zStartsWith$default = true;
            if (!(e11 instanceof UnknownHostException) && !(e11 instanceof SocketException) && !(e11 instanceof SocketTimeoutException) && !(e11 instanceof SSLProtocolException) && !(e11 instanceof SSLPeerUnverifiedException) && !(e11 instanceof SSLException) && !(e11 instanceof ConnectionShutdownException)) {
                if (e11 instanceof SecurityException) {
                    String message = e11.getMessage();
                    zStartsWith$default = message != null ? StringsKt.startsWith$default(message, "Package android does not belong to", false, 2, (Object) null) : false;
                } else if (e11 instanceof IOException) {
                }
            }
            if (zStartsWith$default) {
                C44128b.m97263g("Network", e11);
            } else {
                C43174a.m94787c(e11, "Network");
            }
            jSONObjectM42844a = m42844a(e11);
        }
        boolean zOptBoolean = jSONObjectM42844a.optBoolean("success", false);
        String strOptString = jSONObjectM42844a.optString("code", "");
        Object objOpt = jSONObjectM42844a.opt("data");
        if (zOptBoolean || Intrinsics.areEqual(strOptString, "200")) {
            return parser.invoke(objOpt, Boolean.FALSE);
        }
        throw new ApiException(strOptString, jSONObjectM42844a.optString("msg", "unknown"), parser.invoke(objOpt, Boolean.TRUE), objOpt != null ? objOpt.toString() : null);
    }
}
