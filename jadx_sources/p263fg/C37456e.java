package p263fg;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.flutter.network.exception.HttpException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Charsets;

/* JADX INFO: renamed from: fg.e */
/* JADX INFO: compiled from: HttpInternalCodec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m90084d2 = {"Lfg/e;", "Lfg/a;", "<init>", "()V", "", "data", "Lokhttp3/Request;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Lokhttp3/Request;", "Lokhttp3/Response;", "obj", "", "", "c", "(Lokhttp3/Response;)Ljava/util/Map;", "response", "Lfg/d;", "d", "(Lokhttp3/Response;)Lfg/d;", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHttpInternalCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpInternalCodec.kt\ncom/kubi/flutter/network/codec/HttpInternalCodec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1863#2,2:78\n*S KotlinDebug\n*F\n+ 1 HttpInternalCodec.kt\ncom/kubi/flutter/network/codec/HttpInternalCodec\n*L\n30#1:78,2\n*E\n"})
public final class C37456e extends AbstractC37452a {
    @Override // p263fg.AbstractC37452a, p263fg.InterfaceC37457f
    @NotNull
    /* JADX INFO: renamed from: a */
    public Request mo84244a(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj = ((HashMap) data).get("type");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        if (Intrinsics.areEqual(str, "GET") || Intrinsics.areEqual(str, "POST")) {
            return super.mo84244a(data);
        }
        throw new HttpException(-1004, str + " not support", null, 4, null);
    }

    @Override // p263fg.InterfaceC37457f
    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map<String, Object> mo84246b(@NotNull Response obj) throws JSONException {
        Intrinsics.checkNotNullParameter(obj, "obj");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Pair<? extends String, ? extends String> pair : obj.headers()) {
            linkedHashMap2.put(pair.getFirst(), pair.getSecond());
        }
        Unit unit = Unit.INSTANCE;
        linkedHashMap.put("headers", linkedHashMap2);
        C37455d c37455dM84251d = m84251d(obj);
        linkedHashMap.put("code", Integer.valueOf(c37455dM84251d.getCode()));
        String data = c37455dM84251d.getData();
        if (data != null) {
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            if (bytes != null) {
                linkedHashMap.put(TtmlNode.TAG_BODY, bytes);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: d */
    public final C37455d m84251d(Response response) throws JSONException, HttpException, NullPointerException {
        String string;
        String strString;
        if (!response.isSuccessful()) {
            int iCode = response.code();
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null || (strString = responseBodyBody.string()) == null) {
                strString = "body is null";
            }
            throw new HttpException(iCode, strString, null, 4, null);
        }
        ResponseBody responseBodyBody2 = response.body();
        Intrinsics.checkNotNull(responseBodyBody2);
        JSONObject jSONObject = new JSONObject(responseBodyBody2.string());
        int iM84245a = C37453b.m84245a(jSONObject);
        if (iM84245a != 200) {
            return new C37455d(iM84245a, jSONObject.toString());
        }
        if (!jSONObject.has(FirebaseAnalytics.Param.ITEMS)) {
            Object objOpt = jSONObject.opt("data");
            if (objOpt != null) {
                string = objOpt.toString();
            } else {
                string = null;
            }
            return new C37455d(iM84245a, string);
        }
        return new C37455d(iM84245a, jSONObject.toString());
    }
}
