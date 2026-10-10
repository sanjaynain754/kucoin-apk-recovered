package p263fg;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.api.model.NetworkRequest;
import com.kubi.network.api.model.NetworkResponse;
import com.kubi.utils.C27099x;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.text.Charsets;

/* JADX INFO: renamed from: fg.h */
/* JADX INFO: compiled from: SocketIOCodec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lfg/h;", "Lfg/g;", "Lfg/i;", "<init>", "()V", "Lcom/kubi/network/api/model/NetworkMessage;", "obj", "", "", "", "f", "(Lcom/kubi/network/api/model/NetworkMessage;)Ljava/util/Map;", "Lcom/kubi/network/api/model/NetworkResponse;", "g", "(Lcom/kubi/network/api/model/NetworkResponse;)Ljava/util/Map;", "data", "d", "(Ljava/lang/Object;)Lfg/i;", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSocketIOCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketIOCodec.kt\ncom/kubi/flutter/network/codec/SocketIOCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,67:1\n1#2:68\n35#3,3:69\n32#4,2:72\n*S KotlinDebug\n*F\n+ 1 SocketIOCodec.kt\ncom/kubi/flutter/network/codec/SocketIOCodec\n*L\n23#1:69,3\n54#1:72,2\n*E\n"})
public final class C37459h implements InterfaceC37458g<C37460i> {
    @Override // p263fg.InterfaceC37458g
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C37460i mo84252a(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "data");
        HashMap map = (HashMap) data;
        Object obj = map.get("type");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("path");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get(ReportDataTable.COLUMN_PARAMS);
        Map map2 = TypeIntrinsics.isMutableMap(obj3) ? (Map) obj3 : null;
        if (str != null && str2 != null && map2 != null) {
            map2.put(str, str2);
        }
        Object obj4 = map.get("rid");
        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.String");
        return new C37460i((String) obj4, new NetworkRequest(0, str2, map2, 1, null));
    }

    /* JADX INFO: renamed from: e */
    public final Object m84256e(Object data) throws JSONException {
        if (data instanceof JSONArray) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = (JSONArray) data;
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                Object obj = jSONArray.get(i11);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                arrayList.add(m84256e(obj));
            }
            return arrayList;
        }
        if (!(data instanceof JSONObject)) {
            return data;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = (JSONObject) data;
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.checkNotNull(next);
            Object obj2 = jSONObject.get(next);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            linkedHashMap.put(next, m84256e(obj2));
        }
        return linkedHashMap;
    }

    @Override // p263fg.InterfaceC37458g
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map<String, Object> mo84253b(@NotNull NetworkMessage<?> obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String id2 = obj.getId();
        if (id2 == null) {
            id2 = "";
        }
        linkedHashMap.put("id", id2);
        Object data = obj.getData();
        if (data != null) {
            linkedHashMap.put("data", m84256e(data));
        }
        return linkedHashMap;
    }

    @Override // p263fg.InterfaceC37458g
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map<String, Object> mo84254c(@NotNull NetworkResponse<?> obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(obj.getCode()));
        Object data = obj.getData();
        if (data != null) {
            String strM66919i = C27099x.m66919i(data, false, 2, null);
            if (strM66919i == null) {
                strM66919i = "";
            }
            byte[] bytes = strM66919i.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            linkedHashMap.put(TtmlNode.TAG_BODY, bytes);
        }
        return linkedHashMap;
    }
}
