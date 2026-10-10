package com.sumsub.sentry;

import com.sumsub.sns.internal.core.common.AbstractC28400J;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.tencent.bugly.proguard.C33556b3;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.encoding.InterfaceC41787b;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.ranges.RangesKt;
import tg0.C44971x;
import tg0.InterfaceC44951d;
import vg0.AbstractC45532e;
import vg0.C45540m;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45830c;
import xg0.AbstractC46162a;
import xg0.C46174i;
import xg0.InterfaceC46172g;
import xg0.InterfaceC46183r;

/* JADX INFO: renamed from: com.sumsub.sentry.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27964l implements InterfaceC44951d {

    /* JADX INFO: renamed from: a */
    public static final C27964l f57089a = new C27964l();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC45533f f57090b = C45540m.m100542c("ContextsSerializer", AbstractC45532e.i.f102607a);

    /* JADX INFO: renamed from: c */
    public static final AbstractC46162a f57091c = AbstractC28400J.m69286a(C28468k0.f57988f);

    /* JADX WARN: Code duplicated, block: B:45:0x0118  */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x011f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0124  */
    /* JADX WARN: Code duplicated, block: B:51:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0129  */
    /* JADX WARN: Code duplicated, block: B:54:0x012e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0134  */
    /* JADX WARN: Code duplicated, block: B:57:0x0139  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // tg0.InterfaceC44949c
    public final Object deserialize(InterfaceC41787b interfaceC41787b) {
        boolean z11;
        JsonPrimitive jsonPrimitive;
        boolean isString;
        String string;
        JsonPrimitive jsonPrimitive2;
        if (!(interfaceC41787b instanceof InterfaceC46172g)) {
            return new C27968m();
        }
        C27968m c27968m = new C27968m();
        JsonElement jsonElementMo91896b = ((InterfaceC46172g) interfaceC41787b).mo91896b();
        if (jsonElementMo91896b instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElementMo91896b;
            for (String str : jsonObject.keySet()) {
                JsonElement jsonElement = (JsonElement) jsonObject.get(str);
                if (jsonElement != null) {
                    switch (str.hashCode()) {
                        case -1335157162:
                            if (str.equals("device")) {
                                AbstractC46162a abstractC46162a = f57091c;
                                abstractC46162a.getSerializersModule();
                                c27968m.put("device", (C28012x) abstractC46162a.m101763c(C28012x.Companion.serializer(), jsonElement));
                            } else {
                                z11 = jsonElement instanceof JsonPrimitive;
                                if (z11) {
                                    jsonPrimitive = (JsonPrimitive) jsonElement;
                                } else {
                                    jsonPrimitive = null;
                                }
                                if (jsonPrimitive != null) {
                                    isString = jsonPrimitive.getIsString();
                                } else {
                                    isString = false;
                                }
                                if (isString) {
                                    jsonPrimitive2 = z11 ? (JsonPrimitive) jsonElement : null;
                                    if (jsonPrimitive2 != null || (string = C46174i.m101817f(jsonPrimitive2)) == null) {
                                        string = jsonElement.toString();
                                    }
                                } else {
                                    string = jsonElement.toString();
                                }
                                c27968m.put(str, string);
                            }
                            break;
                        case 3556:
                            if (str.equals(C33556b3.f69078o2)) {
                                AbstractC46162a abstractC46162a2 = f57091c;
                                abstractC46162a2.getSerializersModule();
                                c27968m.put(C33556b3.f69078o2, (C27888P) abstractC46162a2.m101763c(C27888P.Companion.serializer(), jsonElement));
                            } else {
                                z11 = jsonElement instanceof JsonPrimitive;
                                if (z11) {
                                    jsonPrimitive = (JsonPrimitive) jsonElement;
                                } else {
                                    jsonPrimitive = null;
                                }
                                if (jsonPrimitive != null) {
                                    isString = jsonPrimitive.getIsString();
                                } else {
                                    isString = false;
                                }
                                if (isString) {
                                    if (z11) {
                                    }
                                    if (jsonPrimitive2 != null) {
                                        string = jsonElement.toString();
                                    } else {
                                        string = jsonElement.toString();
                                    }
                                } else {
                                    string = jsonElement.toString();
                                }
                                c27968m.put(str, string);
                            }
                            break;
                        case 96801:
                            if (str.equals("app")) {
                                AbstractC46162a abstractC46162a3 = f57091c;
                                abstractC46162a3.getSerializersModule();
                                c27968m.put("app", (C27928c) abstractC46162a3.m101763c(C27928c.Companion.serializer(), jsonElement));
                            } else {
                                z11 = jsonElement instanceof JsonPrimitive;
                                if (z11) {
                                    jsonPrimitive = (JsonPrimitive) jsonElement;
                                } else {
                                    jsonPrimitive = null;
                                }
                                if (jsonPrimitive != null) {
                                    isString = jsonPrimitive.getIsString();
                                } else {
                                    isString = false;
                                }
                                if (isString) {
                                    if (z11) {
                                    }
                                    if (jsonPrimitive2 != null) {
                                        string = jsonElement.toString();
                                    } else {
                                        string = jsonElement.toString();
                                    }
                                } else {
                                    string = jsonElement.toString();
                                }
                                c27968m.put(str, string);
                            }
                            break;
                        case 102572:
                            if (str.equals("gpu")) {
                                AbstractC46162a abstractC46162a4 = f57091c;
                                abstractC46162a4.getSerializersModule();
                                c27968m.put("gpu", (C27860B) abstractC46162a4.m101763c(C27860B.Companion.serializer(), jsonElement));
                            } else {
                                z11 = jsonElement instanceof JsonPrimitive;
                                if (z11) {
                                    jsonPrimitive = (JsonPrimitive) jsonElement;
                                } else {
                                    jsonPrimitive = null;
                                }
                                if (jsonPrimitive != null) {
                                    isString = jsonPrimitive.getIsString();
                                } else {
                                    isString = false;
                                }
                                if (isString) {
                                    if (z11) {
                                    }
                                    if (jsonPrimitive2 != null) {
                                        string = jsonElement.toString();
                                    } else {
                                        string = jsonElement.toString();
                                    }
                                } else {
                                    string = jsonElement.toString();
                                }
                                c27968m.put(str, string);
                            }
                            break;
                        case 110620997:
                            if (str.equals("trace")) {
                                AbstractC46162a abstractC46162a5 = f57091c;
                                abstractC46162a5.getSerializersModule();
                                c27968m.m69012a((C27911a1) abstractC46162a5.m101763c(C27911a1.Companion.serializer(), jsonElement));
                            } else {
                                z11 = jsonElement instanceof JsonPrimitive;
                                if (z11) {
                                    jsonPrimitive = (JsonPrimitive) jsonElement;
                                } else {
                                    jsonPrimitive = null;
                                }
                                if (jsonPrimitive != null) {
                                    isString = jsonPrimitive.getIsString();
                                } else {
                                    isString = false;
                                }
                                if (isString) {
                                    if (z11) {
                                    }
                                    if (jsonPrimitive2 != null) {
                                        string = jsonElement.toString();
                                    } else {
                                        string = jsonElement.toString();
                                    }
                                } else {
                                    string = jsonElement.toString();
                                }
                                c27968m.put(str, string);
                            }
                            break;
                        case 150940456:
                            if (str.equals("browser")) {
                                AbstractC46162a abstractC46162a6 = f57091c;
                                abstractC46162a6.getSerializersModule();
                                c27968m.put("browser", (C27952i) abstractC46162a6.m101763c(C27952i.Companion.serializer(), jsonElement));
                            } else {
                                z11 = jsonElement instanceof JsonPrimitive;
                                if (z11) {
                                    jsonPrimitive = (JsonPrimitive) jsonElement;
                                } else {
                                    jsonPrimitive = null;
                                }
                                if (jsonPrimitive != null) {
                                    isString = jsonPrimitive.getIsString();
                                } else {
                                    isString = false;
                                }
                                if (isString) {
                                    if (z11) {
                                    }
                                    if (jsonPrimitive2 != null) {
                                        string = jsonElement.toString();
                                    } else {
                                        string = jsonElement.toString();
                                    }
                                } else {
                                    string = jsonElement.toString();
                                }
                                c27968m.put(str, string);
                            }
                            break;
                        case 1550962648:
                            if (str.equals("runtime")) {
                                AbstractC46162a abstractC46162a7 = f57091c;
                                abstractC46162a7.getSerializersModule();
                                c27968m.put("runtime", (C27867E0) abstractC46162a7.m101763c(C27867E0.Companion.serializer(), jsonElement));
                            } else {
                                z11 = jsonElement instanceof JsonPrimitive;
                                if (z11) {
                                    jsonPrimitive = (JsonPrimitive) jsonElement;
                                } else {
                                    jsonPrimitive = null;
                                }
                                if (jsonPrimitive != null) {
                                    isString = jsonPrimitive.getIsString();
                                } else {
                                    isString = false;
                                }
                                if (isString) {
                                    if (z11) {
                                    }
                                    if (jsonPrimitive2 != null) {
                                        string = jsonElement.toString();
                                    } else {
                                        string = jsonElement.toString();
                                    }
                                } else {
                                    string = jsonElement.toString();
                                }
                                c27968m.put(str, string);
                            }
                            break;
                        default:
                            z11 = jsonElement instanceof JsonPrimitive;
                            if (z11) {
                                jsonPrimitive = (JsonPrimitive) jsonElement;
                            } else {
                                jsonPrimitive = null;
                            }
                            if (jsonPrimitive != null) {
                                isString = jsonPrimitive.getIsString();
                            } else {
                                isString = false;
                            }
                            if (isString) {
                                if (z11) {
                                }
                                if (jsonPrimitive2 != null) {
                                    string = jsonElement.toString();
                                } else {
                                    string = jsonElement.toString();
                                }
                            } else {
                                string = jsonElement.toString();
                            }
                            c27968m.put(str, string);
                            break;
                    }
                }
            }
        }
        return c27968m;
    }

    @Override // tg0.InterfaceC44951d, tg0.InterfaceC44963p, tg0.InterfaceC44949c
    public final InterfaceC45533f getDescriptor() {
        return f57090b;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(InterfaceC45830c interfaceC45830c, Object obj) {
        C27968m c27968m = (C27968m) obj;
        if (interfaceC45830c instanceof InterfaceC46183r) {
            List<Map.Entry> listSortedWith = CollectionsKt.sortedWith(c27968m.entrySet(), new C27960k());
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10)), 16));
            for (Map.Entry entry : listSortedWith) {
                Pair pairM90091to = TuplesKt.m90091to(String.valueOf(entry.getKey()), f57091c.m101764d(C44971x.serializer(entry.getValue().getClass()), entry.getValue()));
                linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
            }
            ((InterfaceC46183r) interfaceC45830c).mo91930b(new JsonObject(MapsKt.toMutableMap(linkedHashMap)));
        }
    }
}
