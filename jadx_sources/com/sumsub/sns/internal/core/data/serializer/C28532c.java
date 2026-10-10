package com.sumsub.sns.internal.core.data.serializer;

import com.sumsub.sns.internal.core.common.AbstractC28458h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.json.C41910a;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function1;
import tg0.InterfaceC44951d;
import vg0.AbstractC45532e;
import vg0.C45540m;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;
import xg0.C46163a0;
import xg0.C46164b;
import xg0.C46173h;
import xg0.C46174i;
import xg0.InterfaceC46172g;
import xg0.InterfaceC46183r;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.data.serializer.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28532c implements InterfaceC44951d {

    /* JADX INFO: renamed from: a */
    public static final C28532c f58084a = new C28532c();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC45533f f58085b = C45540m.m100542c("JsonAsAnySerializer", AbstractC45532e.i.f102607a);

    /* JADX INFO: renamed from: a */
    public static void m69409a(C46164b c46164b, Collection collection) {
        for (Object obj : CollectionsKt.filterNotNull(collection)) {
            if (obj instanceof String) {
                C46173h.m101805c(c46164b, (String) obj);
            } else if (obj instanceof Number) {
                C46173h.m101804b(c46164b, (Number) obj);
            } else if (obj instanceof Boolean) {
                C46173h.m101803a(c46164b, (Boolean) obj);
            } else if (obj instanceof Collection) {
                C46164b c46164b2 = new C46164b();
                m69409a(c46164b2, (Collection) obj);
                c46164b.m101770a(c46164b2.m101771b());
            } else if (obj instanceof Map) {
                C46163a0 c46163a0 = new C46163a0();
                m69408a(c46163a0, (Map) obj);
                c46164b.m101770a(c46163a0.m101768a());
            }
        }
    }

    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        if (!(interfaceC41787b instanceof InterfaceC46172g)) {
            throw new IllegalStateException("JsonAsAnySerializer decoder is not JsonDecoder");
        }
        JsonElement jsonElementMo91896b = ((InterfaceC46172g) interfaceC41787b).mo91896b();
        Serializable serializableM69405a = m69405a(jsonElementMo91896b);
        return serializableM69405a == null ? jsonElementMo91896b.toString() : serializableM69405a;
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return f58085b;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        InterfaceC46183r interfaceC46183r = interfaceC45830c instanceof InterfaceC46183r ? (InterfaceC46183r) interfaceC45830c : null;
        if (interfaceC46183r == null) {
            return;
        }
        if (obj instanceof String) {
            interfaceC46183r.encodeString((String) obj);
            return;
        }
        if (obj instanceof Integer) {
            interfaceC46183r.encodeInt(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            interfaceC46183r.encodeLong(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            interfaceC46183r.encodeFloat(((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            interfaceC46183r.encodeDouble(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Short) {
            interfaceC46183r.encodeShort(((Number) obj).shortValue());
            return;
        }
        if (obj instanceof Boolean) {
            interfaceC46183r.encodeBoolean(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Collection) {
            C46164b c46164b = new C46164b();
            m69409a(c46164b, (Collection) obj);
            interfaceC46183r.mo91930b(c46164b.m101771b());
        } else {
            if (!(obj instanceof Map)) {
                interfaceC46183r.encodeString(obj.toString());
                return;
            }
            C46163a0 c46163a0 = new C46163a0();
            m69408a(c46163a0, (Map) obj);
            interfaceC46183r.mo91930b(c46163a0.m101768a());
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69407a(Object obj, C46164b c46164b) {
        m69409a(c46164b, (Collection) obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m69406a(Object obj, C46163a0 c46163a0) {
        m69408a(c46163a0, (Map) obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static Serializable m69405a(JsonElement jsonElement) {
        Serializable content;
        if (jsonElement instanceof C41910a) {
            return null;
        }
        if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            if (jsonPrimitive.getIsString()) {
                content = jsonPrimitive.getContent();
            } else {
                Serializable serializableM101822k = C46174i.m101822k(jsonPrimitive);
                content = (serializableM101822k == null && (serializableM101822k = C46174i.m101826o(jsonPrimitive)) == null && (serializableM101822k = C46174i.m101819h(jsonPrimitive)) == null && (serializableM101822k = C46174i.m101816e(jsonPrimitive)) == null) ? jsonPrimitive.getContent() : serializableM101822k;
            }
            if (!(content instanceof Double)) {
                return content;
            }
            Number number = (Number) content;
            return (number.doubleValue() > 3.4028234663852886E38d || number.doubleValue() < 1.401298464324817E-45d) ? content : Float.valueOf((float) number.doubleValue());
        }
        if (jsonElement instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElement;
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(jsonObject.size()));
            Iterator<T> it = jsonObject.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), m69405a((JsonElement) entry.getValue()));
            }
            return AbstractC28458h.m69336a((Map) linkedHashMap);
        }
        if (!(jsonElement instanceof JsonArray)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<JsonElement> it2 = ((JsonArray) jsonElement).iterator();
        while (it2.hasNext()) {
            Serializable serializableM69405a = m69405a(it2.next());
            if (serializableM69405a != null) {
                arrayList.add(serializableM69405a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static void m69408a(C46163a0 c46163a0, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            final Object value = entry.getValue();
            if (key instanceof String) {
                if (value instanceof String) {
                    C46173h.m101809g(c46163a0, (String) key, (String) value);
                } else if (value instanceof Number) {
                    C46173h.m101808f(c46163a0, (String) key, (Number) value);
                } else if (value instanceof Boolean) {
                    C46173h.m101807e(c46163a0, (String) key, (Boolean) value);
                } else if (value instanceof Collection) {
                    C46173h.m101810h(c46163a0, (String) key, new Function1() { // from class: com.sumsub.sns.internal.core.data.serializer.d
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C28532c.m69407a(value, (C46164b) obj);
                        }
                    });
                } else if (value instanceof Map) {
                    C46173h.m101811i(c46163a0, (String) key, new Function1() { // from class: com.sumsub.sns.internal.core.data.serializer.e
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C28532c.m69406a(value, (C46163a0) obj);
                        }
                    });
                }
            }
        }
    }
}
