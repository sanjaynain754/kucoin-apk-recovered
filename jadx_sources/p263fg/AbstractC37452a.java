package p263fg;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: fg.a */
/* JADX INFO: compiled from: IHttpCodec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lfg/a;", "Lfg/f;", "<init>", "()V", "", "data", "Lokhttp3/Request;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Object;)Lokhttp3/Request;", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIHttpCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IHttpCodec.kt\ncom/kubi/flutter/network/codec/BaseHttpCodec\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,128:1\n216#2,2:129\n216#2,2:131\n216#2,2:133\n*S KotlinDebug\n*F\n+ 1 IHttpCodec.kt\ncom/kubi/flutter/network/codec/BaseHttpCodec\n*L\n45#1:129,2\n56#1:131,2\n80#1:133,2\n*E\n"})
public abstract class AbstractC37452a implements InterfaceC37457f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.nio.charset.Charset, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r4v1, types: [okhttp3.RequestBody] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [okhttp3.FormBody] */
    /* JADX WARN: Type inference failed for: r4v3, types: [okhttp3.RequestBody] */
    /* JADX WARN: Type inference failed for: r4v4, types: [okhttp3.RequestBody] */
    /* JADX WARN: Type inference failed for: r4v5, types: [okhttp3.RequestBody] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1, types: [okhttp3.Request$Builder] */
    @Override // p263fg.InterfaceC37457f
    @NotNull
    /* JADX INFO: renamed from: a */
    public Request mo84244a(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        HashMap map = (HashMap) data;
        Object obj = map.get("type");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = map.get("path");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        Object obj3 = map.get(ReportDataTable.COLUMN_PARAMS);
        ?? Build = 0;
        Build = 0;
        Build = 0;
        Build = 0;
        Build = 0;
        Build = 0;
        Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
        Object obj4 = map.get("headers");
        Map map3 = obj4 instanceof Map ? (Map) obj4 : null;
        ?? builder = new Request.Builder();
        HttpUrl.Builder builderNewBuilder = HttpUrl.INSTANCE.get(str2).newBuilder();
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    builderNewBuilder.addQueryParameter(str3, (String) value);
                }
            }
        }
        builder.url(builderNewBuilder.build());
        if (map3 != null) {
            for (Map.Entry entry2 : map3.entrySet()) {
                String str4 = (String) entry2.getKey();
                Object value2 = entry2.getValue();
                if (value2 instanceof String) {
                    builder.addHeader(str4, (String) value2);
                }
            }
        }
        int iHashCode = str.hashCode();
        if (iHashCode == 79599 ? str.equals("PUT") : iHashCode == 2461856 ? str.equals("POST") : iHashCode == 75900968 && str.equals("PATCH")) {
            Object obj5 = map.get(TtmlNode.TAG_BODY);
            Map map4 = obj5 instanceof Map ? (Map) obj5 : null;
            Object obj6 = map4 != null ? map4.get("body_type") : null;
            String str5 = obj6 instanceof String ? (String) obj6 : null;
            if (str5 == null) {
                str5 = "application/json";
            }
            Object obj7 = map4 != null ? map4.get("body_data") : null;
            if (obj7 != null) {
                if (obj7 instanceof String) {
                    Build = RequestBody.INSTANCE.create((String) obj7, MediaType.INSTANCE.get(str5));
                } else if (obj7 instanceof byte[]) {
                    Build = RequestBody.Companion.create$default(RequestBody.INSTANCE, (byte[]) obj7, MediaType.INSTANCE.get(str5), 0, 0, 6, (Object) null);
                } else if (Intrinsics.areEqual(str5, "application/json")) {
                    String strM66606i = C27029c.m66606i(obj7);
                    if (strM66606i != null) {
                        Build = RequestBody.INSTANCE.create(strM66606i, MediaType.INSTANCE.get(str5));
                    }
                } else {
                    if (!Intrinsics.areEqual(str5, "application/x-www-form-urlencoded")) {
                        throw new IllegalArgumentException(str5 + " not support body type[" + obj7.getClass().getCanonicalName() + ']');
                    }
                    if (!(obj7 instanceof Map)) {
                        throw new IllegalArgumentException(str5 + " not support body type[" + obj7.getClass().getCanonicalName() + ']');
                    }
                    FormBody.Builder builder2 = new FormBody.Builder(Build, 1, Build);
                    for (Map.Entry entry3 : ((Map) obj7).entrySet()) {
                        builder2.add(String.valueOf(entry3.getKey()), String.valueOf(entry3.getValue()));
                    }
                    Build = builder2.build();
                }
            }
        }
        builder.method(str, Build);
        return builder.build();
    }
}
