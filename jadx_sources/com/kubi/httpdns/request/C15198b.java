package com.kubi.httpdns.request;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.reflect.TypeToken;
import com.kubi.httpdns.ServerConfig;
import com.kubi.httpdns.interpret.IpInfo;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p234ek.C37207e;
import p234ek.C37208f;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: com.kubi.httpdns.request.b */
/* JADX INFO: compiled from: DefaultDecoder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/httpdns/request/b;", "Lcom/kubi/httpdns/request/e;", "<init>", "()V", "Lek/e;", "request", "Lcom/kubi/httpdns/ServerConfig;", "config", "Lokhttp3/Request;", "b", "(Lek/e;Lcom/kubi/httpdns/ServerConfig;)Lokhttp3/Request;", "Lokhttp3/Response;", "response", "Lek/f;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lek/e;Lokhttp3/Response;)Lek/f;", "httpdns_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDefaultDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultDecoder.kt\ncom/kubi/httpdns/request/DefaultDecoder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n215#2,2:112\n128#3:114\n766#4:115\n857#4,2:116\n1549#4:118\n1620#4,3:119\n*S KotlinDebug\n*F\n+ 1 DefaultDecoder.kt\ncom/kubi/httpdns/request/DefaultDecoder\n*L\n28#1:112,2\n84#1:114\n85#1:115\n85#1:116,2\n87#1:118\n87#1:119,3\n*E\n"})
public final class C15198b implements InterfaceC15201e {

    /* JADX INFO: renamed from: com.kubi.httpdns.request.b$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes16.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/httpdns/request/b$a", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,199:1\n*E\n"})
    public static final class a extends TypeToken<ResponseEntity> {
    }

    @Override // com.kubi.httpdns.request.InterfaceC15201e
    @NotNull
    /* JADX INFO: renamed from: a */
    public C37208f mo31480a(@NotNull C37207e request, @NotNull Response response) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.isSuccessful()) {
            throw new IOException("request fail, code = " + response.code());
        }
        try {
            ResponseBody responseBodyBody = response.body();
            String strM66668h = C27041f.m66668h(responseBodyBody != null ? responseBodyBody.string() : null);
            C27099x c27099x = C27099x.f54458a;
            ResponseEntity responseEntity = (ResponseEntity) C27099x.m66914d(strM66668h, new a().getType());
            List<AnswerEntity> answer = responseEntity.getAnswer();
            ArrayList<AnswerEntity> arrayList = new ArrayList();
            for (Object obj : answer) {
                if (((AnswerEntity) obj).getType() == 1) {
                    arrayList.add(obj);
                }
            }
            if (responseEntity.getStatus() != 0 || arrayList.isEmpty()) {
                return new C37208f(request.getHost(), CollectionsKt.emptyList());
            }
            String host = request.getHost();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (AnswerEntity answerEntity : arrayList) {
                arrayList2.add(new IpInfo(answerEntity.getType(), answerEntity.getData(), answerEntity.getTTL()));
            }
            return new C37208f(host, arrayList2);
        } catch (Throwable th2) {
            throw new IOException(th2);
        }
    }

    @Override // com.kubi.httpdns.request.InterfaceC15201e
    @NotNull
    /* JADX INFO: renamed from: b */
    public Request mo31481b(@NotNull C37207e request, @NotNull ServerConfig config) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(config, "config");
        Request.Builder builderMethod = new Request.Builder().method(config.getMethod(), null);
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        StringBuffer stringBuffer = new StringBuffer(config.getUrl());
        stringBuffer.append("?name=" + request.getHost());
        Map<String, String> params = config.getParams();
        if (params != null) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                stringBuffer.append(Typography.amp + entry.getKey() + '=' + entry.getValue());
            }
        }
        Unit unit = Unit.INSTANCE;
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuffer(config.url)…             }.toString()");
        Request.Builder builderUrl = builderMethod.url(companion.get(string));
        Headers.Companion companion2 = Headers.INSTANCE;
        Map<String, String> headers = config.getHeaders();
        if (headers == null) {
            headers = MapsKt.emptyMap();
        }
        return builderUrl.headers(companion2.m94724of(headers)).build();
    }
}
