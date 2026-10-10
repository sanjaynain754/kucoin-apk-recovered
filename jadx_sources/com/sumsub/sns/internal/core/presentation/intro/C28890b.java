package com.sumsub.sns.internal.core.presentation.intro;

import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.intro.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28890b {

    /* JADX INFO: renamed from: a */
    public final C29983l f58735a;

    /* JADX INFO: renamed from: b */
    public final Map f58736b;

    /* JADX INFO: renamed from: c */
    public final String f58737c;

    /* JADX INFO: renamed from: d */
    public final String f58738d;

    /* JADX INFO: renamed from: e */
    public final Map f58739e;

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v11, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final Map m69669a() {
        String str;
        String str2;
        Map map;
        Object objKeySet;
        ?? r11;
        Pair pairM90091to;
        String str3 = "sns_step_" + this.f58737c + "_" + this.f58738d + "_instructions_definitionKey";
        String strM70061a = this.f58735a.m70061a(str3);
        if (strM70061a == null) {
            str = this.f58737c;
            String str4 = this.f58738d;
            if (StringsKt.startsWith(str, "PAYMENT_METHODS", true) || !StringsKt.equals(str4, IntroScene.PAYMENT_METHOD_BANK_CARD.getSceneName(), true)) {
                str2 = null;
            } else {
                strM70061a = "instructions.paymentMethods.bankCard";
                str2 = strM70061a;
            }
        } else {
            if (StringsKt.isBlank(strM70061a)) {
                strM70061a = null;
            }
            if (strM70061a != null) {
                str2 = strM70061a;
            } else {
                str = this.f58737c;
                String str5 = this.f58738d;
                if (StringsKt.startsWith(str, "PAYMENT_METHODS", true)) {
                }
                str2 = null;
            }
        }
        if (str2 != null && (r11 = this.f58736b) != 0) {
            List listSplit$default = StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = r11;
            Iterator itM69668a = AbstractC28889a.m69668a(listSplit$default, 1, 0);
            while (true) {
                if (!itM69668a.hasNext()) {
                    Object obj = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                    if (!TypeIntrinsics.isMutableMap(obj)) {
                        obj = null;
                    }
                    map = (Map) obj;
                    break;
                }
                Object obj2 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) itM69668a).nextInt()));
                Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                if (map2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : map2.entrySet()) {
                        Object key = entry.getKey();
                        if (!(key instanceof String)) {
                            key = null;
                        }
                        String str6 = (String) key;
                        if (str6 != null) {
                            Object value = entry.getValue();
                            if (value == null) {
                                value = null;
                            }
                            if (value == null) {
                                pairM90091to = null;
                            } else {
                                pairM90091to = TuplesKt.m90091to(str6, value);
                            }
                        } else {
                            pairM90091to = null;
                        }
                        if (pairM90091to != null) {
                            arrayList.add(pairM90091to);
                        }
                    }
                    ?? map3 = MapsKt.toMap(arrayList);
                    if (map3 != 0) {
                        objectRef.element = map3;
                    }
                }
                map = null;
                break;
            }
        }
        map = null;
        break;
        boolean z11 = this.f58736b != null;
        if (map == null || (objKeySet = map.keySet()) == null) {
            objKeySet = "null";
        }
        C33272c.f67816e.f67810a.mo68955d("InstructionsResolver", "getDefinition: lookup=" + str3 + " → definitionKey=" + str2 + " → sdkDictPresent=" + z11 + ", resolved=" + objKeySet, null);
        return map;
    }

    public C28890b(C29983l c29983l, Map map, String str, String str2, String str3, boolean z11) {
        C28894f c28894f;
        String str4;
        String str5;
        String str6;
        this.f58735a = c29983l;
        this.f58736b = map;
        this.f58737c = str;
        this.f58738d = str3;
        Map mapM69669a = m69669a();
        Map linkedHashMap = (mapM69669a == null || (linkedHashMap = MapsKt.toMutableMap(mapM69669a)) == null) ? new LinkedHashMap() : linkedHashMap;
        this.f58739e = linkedHashMap;
        C28895g c28895g = new C28895g(str, str3, str2, null);
        if (z11) {
            c28894f = new C28894f(AbstractC28892d.m69671a(new Object[]{c28895g.f58752a, "title"}, 2, "sns_status_%s_%s", c29983l), AbstractC28892d.m69671a(new Object[]{c28895g.f58752a, "subtitle"}, 2, "sns_status_%s_%s", c29983l), null, null, null, AbstractC28892d.m69671a(new Object[]{c28895g.f58752a, "header_image"}, 2, "sns_status_%s_%s", c29983l), AbstractC28892d.m69671a(new Object[]{c28895g.f58752a, "header_title"}, 2, "sns_status_%s_%s", c29983l), AbstractC28892d.m69671a(new Object[]{c28895g.f58752a, "instructions_text"}, 2, "sns_status_%s_%s", c29983l), AbstractC28892d.m69671a(new Object[]{c28895g.f58752a, "action_continue"}, 2, "sns_status_%s_%s", c29983l));
        } else {
            String strM69672a = AbstractC28893e.m69672a(c29983l, c28895g, Label.action_continue);
            String strM69672a2 = AbstractC28893e.m69672a(c29983l, c28895g, Label.title);
            String strM69672a3 = AbstractC28893e.m69672a(c29983l, c28895g, Label.subtitle);
            String strM69672a4 = AbstractC28893e.m69672a(c29983l, c28895g, Label.header);
            strM69672a4 = (strM69672a4.length() > 0 && AbstractC28893e.m69672a(c29983l, c28895g, Label.doHeader).length() == 0 && AbstractC28893e.m69672a(c29983l, c28895g, Label.dontHeader).length() == 0) ? strM69672a4 : null;
            C28891c c28891c = strM69672a4 != null ? new C28891c(strM69672a4, AbstractC28893e.m69672a(c29983l, c28895g, Label.text), AbstractC28893e.m69672a(c29983l, c28895g, Label.image)) : null;
            String strM69672a5 = AbstractC28893e.m69672a(c29983l, c28895g, Label.doHeader);
            strM69672a5 = strM69672a5.length() <= 0 ? null : strM69672a5;
            C28891c c28891c2 = strM69672a5 != null ? new C28891c(strM69672a5, AbstractC28893e.m69672a(c29983l, c28895g, Label.doText), AbstractC28893e.m69672a(c29983l, c28895g, Label.doImage)) : null;
            String strM69672a6 = AbstractC28893e.m69672a(c29983l, c28895g, Label.dontHeader);
            strM69672a6 = strM69672a6.length() <= 0 ? null : strM69672a6;
            c28894f = new C28894f(strM69672a2, strM69672a3, c28891c, c28891c2, strM69672a6 != null ? new C28891c(strM69672a6, AbstractC28893e.m69672a(c29983l, c28895g, Label.dontText), AbstractC28893e.m69672a(c29983l, c28895g, Label.dontImage)) : null, null, null, null, strM69672a);
        }
        if (linkedHashMap.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            C28891c c28891c3 = c28894f.f58745c;
            if (c28891c3 != null) {
                arrayList.add(MapsKt.mapOf(TuplesKt.m90091to("type", "single"), TuplesKt.m90091to("image", c28891c3.f58742c), TuplesKt.m90091to("header", c28891c3.f58740a), TuplesKt.m90091to("text", c28891c3.f58741b)));
            }
            C28891c c28891c4 = c28894f.f58746d;
            if (c28891c4 != null) {
                arrayList.add(MapsKt.mapOf(TuplesKt.m90091to("type", "do"), TuplesKt.m90091to("image", c28891c4.f58742c), TuplesKt.m90091to("header", c28891c4.f58740a), TuplesKt.m90091to("text", c28891c4.f58741b)));
            }
            C28891c c28891c5 = c28894f.f58747e;
            if (c28891c5 != null) {
                arrayList.add(MapsKt.mapOf(TuplesKt.m90091to("type", "dont"), TuplesKt.m90091to("image", c28891c5.f58742c), TuplesKt.m90091to("header", c28891c5.f58740a), TuplesKt.m90091to("text", c28891c5.f58741b)));
            }
            String str7 = c28894f.f58748f;
            if (str7 != null) {
                arrayList.add(MapsKt.mapOf(TuplesKt.m90091to("type", "image"), TuplesKt.m90091to("image", str7)));
            }
            String str8 = c28894f.f58749g;
            if (str8 != null) {
                arrayList.add(MapsKt.mapOf(TuplesKt.m90091to("type", "header"), TuplesKt.m90091to("header", str8)));
            }
            String str9 = c28894f.f58750h;
            if (str9 != null) {
                arrayList.add(MapsKt.mapOf(TuplesKt.m90091to("type", "text"), TuplesKt.m90091to("text", str9)));
            }
            linkedHashMap.put("contentBlocks", arrayList);
        }
        if ((!linkedHashMap.containsKey("title") || z11) && (str4 = c28894f.f58743a) != null) {
            linkedHashMap.put("title", str4);
        }
        if ((!linkedHashMap.containsKey("subtitle") || z11) && (str5 = c28894f.f58744b) != null) {
            linkedHashMap.put("subtitle", str5);
        }
        if ((!linkedHashMap.containsKey("actionTitle") || z11) && (str6 = c28894f.f58751i) != null) {
            linkedHashMap.put("actionTitle", str6);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m69670b() {
        boolean z11 = C28468k0.f57983a.getInstructionsViewHandler() != null;
        Object obj = this.f58739e.get("title");
        String str = obj instanceof String ? (String) obj : null;
        boolean z12 = str == null || StringsKt.isBlank(str);
        C33272c.f67816e.f67810a.mo68955d("InstructionsResolver", "hasResources: viewHandler=" + z11 + ", title=" + this.f58739e.get("title") + ", definitionKeys=" + this.f58739e.keySet(), null);
        return z11 || !z12;
    }
}
