package p263fg;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.network.api.model.NetworkMessage;
import com.kubi.network.api.model.NetworkResponse;
import com.kubi.network.api.subscribe.model.PeriodRequest;
import com.kubi.network.api.subscribe.model.SubscribeRequest;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Charsets;

/* JADX INFO: renamed from: fg.j */
/* JADX INFO: compiled from: SocketKCCodec.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lfg/j;", "Lfg/g;", "Lfg/l;", "<init>", "()V", "Lcom/kubi/network/api/model/NetworkMessage;", "obj", "", "", "", "e", "(Lcom/kubi/network/api/model/NetworkMessage;)Ljava/util/Map;", "Lcom/kubi/network/api/model/NetworkResponse;", "f", "(Lcom/kubi/network/api/model/NetworkResponse;)Ljava/util/Map;", "data", "d", "(Ljava/lang/Object;)Lfg/l;", "component_network_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSocketKCCodec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketKCCodec.kt\ncom/kubi/flutter/network/codec/SocketKCCodec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public final class C37461j implements InterfaceC37458g<C37463l> {
    @Override // p263fg.InterfaceC37458g
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C37463l mo84252a(@NotNull Object data) {
        SubscribeRequest subscribeRequest;
        Intrinsics.checkNotNullParameter(data, "data");
        HashMap map = (HashMap) data;
        Object obj = map.get("type");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object obj2 = map.get("path");
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        Object obj3 = map.get(ReportDataTable.COLUMN_PARAMS);
        Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
        Object obj4 = map.get(C37462k.m84264b());
        Map map3 = obj4 instanceof Map ? (Map) obj4 : null;
        if (map3 == null) {
            subscribeRequest = new SubscribeRequest(str, str2, map2, null, 8, null);
        } else {
            Object obj5 = map3.get(C37462k.m84270h());
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) obj5;
            C37456e c37456e = new C37456e();
            Object obj6 = map3.get(C37462k.m84268f());
            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Any");
            Request requestMo84244a = c37456e.mo84244a(obj6);
            Object obj7 = map3.get(C37462k.m84269g());
            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
            Object obj8 = map3.get(C37462k.m84267e());
            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue2 = ((Boolean) obj8).booleanValue();
            Object obj9 = map3.get(C37462k.m84271i());
            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
            Object obj10 = map3.get(C37462k.m84265c());
            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj10).intValue();
            Object obj11 = map3.get(C37462k.m84266d());
            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.Int");
            subscribeRequest = new SubscribeRequest(str, str2, map2, new PeriodRequest(str3, requestMo84244a, zBooleanValue, zBooleanValue2, zBooleanValue3, iIntValue, ((Integer) obj11).intValue()));
        }
        Object obj12 = map.get("rid");
        Intrinsics.checkNotNull(obj12, "null cannot be cast to non-null type kotlin.String");
        Object obj13 = map.get(C37462k.m84263a());
        Intrinsics.checkNotNull(obj13, "null cannot be cast to non-null type kotlin.Boolean");
        return new C37463l((String) obj12, ((Boolean) obj13).booleanValue(), subscribeRequest);
    }

    @Override // p263fg.InterfaceC37458g
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
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
            String strM66606i = C27029c.m66606i(data);
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            linkedHashMap.put("data", strM66606i);
        }
        return linkedHashMap;
    }

    @Override // p263fg.InterfaceC37458g
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map<String, Object> mo84254c(@NotNull NetworkResponse<?> obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(obj.getCode()));
        Object data = obj.getData();
        if (data != null) {
            String strM66606i = C27029c.m66606i(data);
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            byte[] bytes = strM66606i.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            linkedHashMap.put(TtmlNode.TAG_BODY, bytes);
        }
        return linkedHashMap;
    }
}
