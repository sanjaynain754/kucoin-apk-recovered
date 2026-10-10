package com.sumsub.sns.internal.features.data.model.common.remote;

import androidx.camera.core.CameraInfo;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.sumsub.sns.core.data.model.FlowActionType;
import com.sumsub.sns.core.data.model.FlowType;
import com.sumsub.sns.core.data.model.SNSInvalidParametersException;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29103d2;
import com.sumsub.sns.internal.features.data.model.common.C28979A3;
import com.sumsub.sns.internal.features.data.model.common.C28999F;
import com.sumsub.sns.internal.features.data.model.common.C29118g;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29693s3;
import com.sumsub.sns.internal.features.data.model.common.C29713w3;
import com.sumsub.sns.internal.features.data.model.common.C29718x3;
import com.sumsub.sns.internal.features.data.model.common.C29719y;
import com.sumsub.sns.internal.features.data.model.common.C29728z3;
import com.sumsub.sns.internal.features.data.model.common.SumsubIdType;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.p125ff.core.C33050a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.remote.U0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC29287U0 {
    /* JADX WARN: Code duplicated, block: B:107:0x0198  */
    /* JADX WARN: Code duplicated, block: B:157:0x025e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0303  */
    /* JADX WARN: Code duplicated, block: B:206:0x031e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0335  */
    /* JADX WARN: Code duplicated, block: B:217:0x0348  */
    /* JADX WARN: Code duplicated, block: B:218:0x034d  */
    /* JADX WARN: Code duplicated, block: B:222:0x035e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0366  */
    /* JADX WARN: Code duplicated, block: B:225:0x036f  */
    /* JADX WARN: Code duplicated, block: B:227:0x0374  */
    /* JADX WARN: Code duplicated, block: B:229:0x037a  */
    /* JADX WARN: Code duplicated, block: B:232:0x0393  */
    /* JADX WARN: Code duplicated, block: B:234:0x039f  */
    /* JADX WARN: Code duplicated, block: B:235:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:238:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:240:0x03bd A[LOOP:14: B:239:0x03bb->B:240:0x03bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:242:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:244:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:248:0x0410  */
    /* JADX WARN: Code duplicated, block: B:249:0x041b  */
    /* JADX WARN: Code duplicated, block: B:253:0x0467  */
    /* JADX WARN: Code duplicated, block: B:256:0x0472  */
    /* JADX WARN: Code duplicated, block: B:257:0x0476  */
    /* JADX WARN: Code duplicated, block: B:260:0x047b  */
    /* JADX WARN: Code duplicated, block: B:262:0x048c  */
    /* JADX WARN: Code duplicated, block: B:265:0x0499 A[LOOP:15: B:261:0x048a->B:265:0x0499, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:269:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:270:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:272:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:275:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:278:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:280:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:283:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:284:0x04db  */
    /* JADX WARN: Code duplicated, block: B:286:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:287:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:319:0x0558  */
    /* JADX WARN: Code duplicated, block: B:333:0x0595  */
    /* JADX WARN: Code duplicated, block: B:372:0x0626  */
    /* JADX WARN: Code duplicated, block: B:375:0x062b  */
    /* JADX WARN: Code duplicated, block: B:376:0x0632  */
    /* JADX WARN: Code duplicated, block: B:379:0x0637  */
    /* JADX WARN: Code duplicated, block: B:380:0x063a  */
    /* JADX WARN: Code duplicated, block: B:382:0x063d  */
    /* JADX WARN: Code duplicated, block: B:385:0x0650  */
    /* JADX WARN: Code duplicated, block: B:387:0x065e  */
    /* JADX WARN: Code duplicated, block: B:391:0x0664  */
    /* JADX WARN: Code duplicated, block: B:393:0x066a  */
    /* JADX WARN: Code duplicated, block: B:395:0x066d  */
    /* JADX WARN: Code duplicated, block: B:396:0x066f  */
    /* JADX WARN: Code duplicated, block: B:401:0x067f  */
    /* JADX WARN: Code duplicated, block: B:402:0x0687  */
    /* JADX WARN: Code duplicated, block: B:405:0x068c  */
    /* JADX WARN: Code duplicated, block: B:406:0x068f  */
    /* JADX WARN: Code duplicated, block: B:408:0x0692  */
    /* JADX WARN: Code duplicated, block: B:411:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:413:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:417:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:419:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:421:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:422:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:427:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:430:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:432:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:433:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:435:0x0701  */
    /* JADX WARN: Code duplicated, block: B:438:0x0714  */
    /* JADX WARN: Code duplicated, block: B:440:0x0724  */
    /* JADX WARN: Code duplicated, block: B:444:0x072a  */
    /* JADX WARN: Code duplicated, block: B:446:0x0730  */
    /* JADX WARN: Code duplicated, block: B:448:0x0733  */
    /* JADX WARN: Code duplicated, block: B:449:0x0735  */
    /* JADX WARN: Code duplicated, block: B:451:0x073b  */
    /* JADX WARN: Code duplicated, block: B:455:0x0749  */
    /* JADX WARN: Code duplicated, block: B:458:0x075c  */
    /* JADX WARN: Code duplicated, block: B:464:0x0789  */
    /* JADX WARN: Code duplicated, block: B:466:0x0799  */
    /* JADX WARN: Code duplicated, block: B:470:0x079f  */
    /* JADX WARN: Code duplicated, block: B:472:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:475:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:476:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:478:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:482:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:483:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:485:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:488:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:490:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:494:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:496:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:499:0x0804  */
    /* JADX WARN: Code duplicated, block: B:500:0x0806  */
    /* JADX WARN: Code duplicated, block: B:504:0x0815  */
    /* JADX WARN: Code duplicated, block: B:507:0x0823  */
    /* JADX WARN: Code duplicated, block: B:510:0x0829  */
    /* JADX WARN: Code duplicated, block: B:513:0x0839  */
    /* JADX WARN: Code duplicated, block: B:516:0x0844  */
    /* JADX WARN: Code duplicated, block: B:517:0x0847  */
    /* JADX WARN: Code duplicated, block: B:520:0x084e  */
    /* JADX WARN: Code duplicated, block: B:522:0x0852  */
    /* JADX WARN: Code duplicated, block: B:523:0x085c  */
    /* JADX WARN: Code duplicated, block: B:525:0x0865  */
    /* JADX WARN: Code duplicated, block: B:528:0x086b  */
    /* JADX WARN: Code duplicated, block: B:531:0x087e  */
    /* JADX WARN: Code duplicated, block: B:533:0x0890  */
    /* JADX WARN: Code duplicated, block: B:536:0x0895  */
    /* JADX WARN: Code duplicated, block: B:537:0x089f  */
    /* JADX WARN: Code duplicated, block: B:539:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:540:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:573:0x0926  */
    /* JADX WARN: Code duplicated, block: B:576:0x0946  */
    /* JADX WARN: Code duplicated, block: B:579:0x0955  */
    /* JADX WARN: Code duplicated, block: B:582:0x0968  */
    /* JADX WARN: Code duplicated, block: B:584:0x0976  */
    /* JADX WARN: Code duplicated, block: B:587:0x097b  */
    /* JADX WARN: Code duplicated, block: B:588:0x0981  */
    /* JADX WARN: Code duplicated, block: B:590:0x0989  */
    /* JADX WARN: Code duplicated, block: B:591:0x098c  */
    /* JADX WARN: Code duplicated, block: B:623:0x0a00  */
    /* JADX WARN: Code duplicated, block: B:626:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:629:0x0a1d  */
    /* JADX WARN: Code duplicated, block: B:632:0x0a22  */
    /* JADX WARN: Code duplicated, block: B:635:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:637:0x0a37  */
    /* JADX WARN: Code duplicated, block: B:689:0x03fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:691:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:692:0x049d A[EDGE_INSN: B:692:0x049d->B:267:0x049d BREAK  A[LOOP:15: B:261:0x048a->B:265:0x0499], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:695:0x055b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:716:0x0675 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:718:0x064a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:720:0x06ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:723:0x069f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:727:0x082c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:730:0x073e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:732:0x076a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:0x0756 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:738:0x07b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:740:0x080c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:0x07dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:746:0x0929 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:755:0x0a03 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final C29124h m69839a(C29277S0 c29277s0) {
        Map map;
        Map map2;
        Map map3;
        String str;
        FlowType flowType;
        Map map4;
        C29252N c29252n;
        String str2;
        Map map5;
        Map map6;
        LinkedHashMap linkedHashMap;
        C29252N c29252n2;
        Boolean bool;
        C29261O3 c29261o3;
        C29713w3 c29713w3;
        Map map7;
        Map map8;
        Map map9;
        Object obj;
        Map map10;
        Object obj2;
        Map map11;
        Map map12;
        Map map13;
        String str3;
        String str4;
        C29449r0 c29449r0;
        C29301X c29301x;
        C29586o0 c29586o0;
        C29385i4 c29385i4;
        C28979A3 c28979a3;
        Map map14;
        Map map15;
        String str5;
        String str6;
        C29301X c29301x2;
        C29586o0 c29586o1;
        Map map16;
        Map map17;
        Map map18;
        Map map19;
        C29118g c29118g;
        String str7;
        FlowActionType flowActionType;
        C29118g c29118g2;
        ArrayList arrayList;
        Iterator it;
        Map.Entry entry;
        Object key;
        String str8;
        Object value;
        Map map20;
        Set setKeySet;
        Map map21;
        Iterator it2;
        Map map22;
        Pair pairM90091to;
        ArrayList arrayList2;
        Iterator it3;
        Map.Entry entry2;
        Object key2;
        String str9;
        Object value2;
        Map map23;
        Set setKeySet2;
        String str10;
        C29301X c29301x3;
        C29586o0 c29586o2;
        Iterator it4;
        Map map24;
        Pair pairM90091to2;
        C29369g4 c29369g4;
        C29728z3 c29728z3;
        ArrayList arrayList3;
        Map map25;
        ArrayList arrayList4;
        Iterator it5;
        String str11;
        Object value3;
        Map map26;
        Map map27;
        Iterator it6;
        Pair pairM90091to3;
        ArrayList arrayList5;
        Map map28;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList6;
        Object obj3;
        Map map29;
        Map map30;
        ArrayList arrayList7;
        Object key3;
        String str12;
        Pair pairM90091to4;
        Object value4;
        String str13;
        Object key4;
        String str14;
        Pair pairM90091to5;
        Object value5;
        String str15;
        Object key5;
        String str16;
        Pair pairM90091to6;
        Object value6;
        Object key6;
        String str17;
        Pair pairM90091to7;
        Object value7;
        ArrayList arrayList8;
        Map map31;
        Object key7;
        String str18;
        Pair pairM90091to8;
        Object value8;
        ArrayList arrayList9;
        Iterator it7;
        Map map32;
        Map map33;
        Set setKeySet3;
        Iterator it8;
        Map map34;
        Pair pairM90091to9;
        Map.Entry entry3;
        Object key8;
        String str19;
        Object value9;
        Map map35;
        Set setKeySet4;
        Iterator it9;
        Map map36;
        Pair pairM90091to10;
        String str20;
        SumsubIdType[] sumsubIdTypeArrValues;
        int length;
        int i11;
        SumsubIdType sumsubIdType;
        Boolean bool2;
        boolean zBooleanValue;
        LinkedHashMap linkedHashMap3;
        C33050a c33050a;
        JSONObject jSONObject;
        Map map37;
        Set setEntrySet;
        Iterator it10;
        ArrayList arrayList10;
        String str21;
        JSONObject jSONObjectOptJSONObject;
        Iterator it11;
        C29263P0 c29263p0;
        JSONObject jSONObjectOptJSONObject2;
        Iterator it12;
        Map map38;
        Map map39;
        List list;
        List list2;
        List list3;
        ArrayList arrayList11;
        Iterator it13;
        C29719y c29719y;
        AbstractC29103d2 abstractC29103d2;
        String strMo69715b;
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList12;
        ArrayList arrayList13;
        int length2;
        int i12;
        String str22;
        Map map40;
        Set setKeySet5;
        Iterator it14;
        FlowType flowType2;
        Map map41;
        Pair pairM90091to11;
        Set setKeySet6;
        Iterator it15;
        String str23;
        Map map42;
        Pair pairM90091to12;
        Map map43;
        C29285T3 c29285t3;
        List listListOf;
        Pair pairM90091to13;
        Set setKeySet7;
        Map map44;
        String str24 = c29277s0.f59270b;
        if (str24 == null) {
            str24 = CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
        }
        String str25 = str24;
        FlowType flowTypeM69838a = m69838a(c29277s0.f59272d);
        String str26 = c29277s0.f59273e;
        Map map45 = c29277s0.f59278j;
        if (map45 != null) {
            ArrayList arrayList14 = new ArrayList();
            for (Map.Entry entry4 : map45.entrySet()) {
                Object key9 = entry4.getKey();
                if (!(key9 instanceof String)) {
                    key9 = null;
                }
                String str27 = (String) key9;
                if (str27 == null) {
                    pairM90091to13 = null;
                } else {
                    Object value10 = entry4.getValue();
                    Map map46 = value10 instanceof Map ? (Map) value10 : null;
                    if (map46 == null || (setKeySet7 = map46.keySet()) == null) {
                        pairM90091to13 = null;
                    } else {
                        ArrayList arrayList15 = new ArrayList();
                        for (Object obj4 : setKeySet7) {
                            if (obj4 != null) {
                                arrayList15.add(obj4);
                            }
                        }
                        ArrayList arrayList16 = new ArrayList();
                        int size = arrayList15.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj5 = arrayList15.get(i13);
                            i13++;
                            Object obj6 = map46.get(obj5);
                            if (obj6 == null) {
                                obj6 = null;
                            }
                            Pair pairM90091to14 = obj6 != null ? TuplesKt.m90091to(obj5, obj6) : null;
                            if (pairM90091to14 != null) {
                                arrayList16.add(pairM90091to14);
                            }
                        }
                        if (arrayList16.isEmpty()) {
                            arrayList16 = null;
                        }
                        if (arrayList16 == null || (map44 = MapsKt.toMap(arrayList16)) == null) {
                            pairM90091to13 = null;
                        } else {
                            pairM90091to13 = TuplesKt.m90091to(str27, map44);
                        }
                    }
                }
                if (pairM90091to13 != null) {
                    arrayList14.add(pairM90091to13);
                }
            }
            map = MapsKt.toMap(arrayList14);
        } else {
            map = null;
        }
        Map map47 = c29277s0.f59279k;
        Map map48 = c29277s0.f59269a;
        Map map49 = c29277s0.f59280l;
        Map map50 = c29277s0.f59282n;
        Map map51 = c29277s0.f59281m;
        if (map51 != null) {
            ArrayList arrayList17 = new ArrayList();
            for (Map.Entry entry5 : map51.entrySet()) {
                String str28 = (String) entry5.getKey();
                Object value11 = entry5.getValue();
                Map map52 = value11 instanceof Map ? (Map) value11 : null;
                if (map52 != null) {
                    Object obj7 = map52.get("regex");
                    String str29 = obj7 instanceof String ? (String) obj7 : null;
                    Object obj8 = map52.get("placeholders");
                    List list4 = obj8 instanceof List ? (List) obj8 : null;
                    if (list4 != null) {
                        ArrayList arrayList18 = new ArrayList();
                        for (Object obj9 : list4) {
                            Map map53 = map;
                            if (obj9 instanceof String) {
                                arrayList18.add(obj9);
                            }
                            map = map53;
                        }
                        map43 = map;
                        listListOf = arrayList18;
                    } else {
                        map43 = map;
                        Object obj10 = map52.get(ReactTextInputShadowNode.PROP_PLACEHOLDER);
                        String str30 = obj10 instanceof String ? (String) obj10 : null;
                        listListOf = str30 != null ? CollectionsKt.listOf(str30) : null;
                    }
                    c29285t3 = new C29285T3(str29, listListOf);
                } else {
                    map43 = map;
                    c29285t3 = null;
                }
                Pair pairM90091to15 = c29285t3 != null ? TuplesKt.m90091to(str28, c29285t3) : null;
                if (pairM90091to15 != null) {
                    arrayList17.add(pairM90091to15);
                }
                map = map43;
            }
            map2 = map;
            map3 = MapsKt.toMap(arrayList17);
        } else {
            map2 = map;
            map3 = null;
        }
        Map map54 = c29277s0.f59278j;
        if (map54 != null) {
            ArrayList arrayList19 = new ArrayList();
            Iterator it16 = map54.entrySet().iterator();
            while (it16.hasNext()) {
                Map.Entry entry6 = (Map.Entry) it16.next();
                Object key10 = entry6.getKey();
                if (!(key10 instanceof String)) {
                    key10 = null;
                }
                String str31 = (String) key10;
                if (str31 == null) {
                    it15 = it16;
                    str23 = str25;
                    pairM90091to12 = null;
                } else {
                    Object value12 = entry6.getValue();
                    Map map55 = value12 instanceof Map ? (Map) value12 : null;
                    if (map55 == null || (setKeySet6 = map55.keySet()) == null) {
                        it15 = it16;
                        str23 = str25;
                    } else {
                        ArrayList arrayList20 = new ArrayList();
                        for (Object obj11 : setKeySet6) {
                            if (obj11 != null) {
                                arrayList20.add(obj11);
                            }
                        }
                        ArrayList arrayList21 = new ArrayList();
                        int size2 = arrayList20.size();
                        it15 = it16;
                        int i14 = 0;
                        while (i14 < size2) {
                            String str32 = str25;
                            Object obj12 = arrayList20.get(i14);
                            int i15 = i14 + 1;
                            Object obj13 = map55.get(obj12);
                            Object obj14 = obj13 != null ? obj13 : null;
                            Pair pairM90091to16 = obj14 != null ? TuplesKt.m90091to(obj12, obj14) : null;
                            if (pairM90091to16 != null) {
                                arrayList21.add(pairM90091to16);
                            }
                            str25 = str32;
                            i14 = i15;
                        }
                        str23 = str25;
                        if (arrayList21.isEmpty()) {
                            arrayList21 = null;
                        }
                        if (arrayList21 != null && (map42 = MapsKt.toMap(arrayList21)) != null) {
                            pairM90091to12 = TuplesKt.m90091to(str31, map42);
                        }
                    }
                    pairM90091to12 = null;
                }
                if (pairM90091to12 != null) {
                    arrayList19.add(pairM90091to12);
                }
                it16 = it15;
                str25 = str23;
            }
            str = str25;
            Map map56 = MapsKt.toMap(arrayList19);
            if (map56 != null && (map40 = (Map) map56.get("countryStates")) != null) {
                ArrayList arrayList22 = new ArrayList();
                Iterator it17 = map40.entrySet().iterator();
                while (it17.hasNext()) {
                    Map.Entry entry7 = (Map.Entry) it17.next();
                    Object key11 = entry7.getKey();
                    if (!(key11 instanceof String)) {
                        key11 = null;
                    }
                    String str33 = (String) key11;
                    if (str33 == null) {
                        it14 = it17;
                        flowType2 = flowTypeM69838a;
                        pairM90091to11 = null;
                    } else {
                        Object value13 = entry7.getValue();
                        Map map57 = value13 instanceof Map ? (Map) value13 : null;
                        if (map57 == null || (setKeySet5 = map57.keySet()) == null) {
                            it14 = it17;
                            flowType2 = flowTypeM69838a;
                        } else {
                            ArrayList arrayList23 = new ArrayList();
                            for (Object obj15 : setKeySet5) {
                                if (obj15 instanceof String) {
                                    arrayList23.add(obj15);
                                }
                            }
                            ArrayList arrayList24 = new ArrayList();
                            int size3 = arrayList23.size();
                            int i16 = 0;
                            while (i16 < size3) {
                                Iterator it18 = it17;
                                Object obj16 = arrayList23.get(i16);
                                i16++;
                                FlowType flowType3 = flowTypeM69838a;
                                Object obj17 = map57.get(obj16);
                                Map map58 = map57;
                                if (!(obj17 instanceof String)) {
                                    obj17 = null;
                                }
                                Pair pairM90091to17 = obj17 != null ? TuplesKt.m90091to(obj16, (String) obj17) : null;
                                if (pairM90091to17 != null) {
                                    arrayList24.add(pairM90091to17);
                                }
                                it17 = it18;
                                flowTypeM69838a = flowType3;
                                map57 = map58;
                            }
                            it14 = it17;
                            flowType2 = flowTypeM69838a;
                            if (arrayList24.isEmpty()) {
                                arrayList24 = null;
                            }
                            if (arrayList24 != null && (map41 = MapsKt.toMap(arrayList24)) != null) {
                                pairM90091to11 = TuplesKt.m90091to(str33, map41);
                            }
                        }
                        pairM90091to11 = null;
                    }
                    if (pairM90091to11 != null) {
                        arrayList22.add(pairM90091to11);
                    }
                    it17 = it14;
                    flowTypeM69838a = flowType2;
                }
                flowType = flowTypeM69838a;
                map4 = MapsKt.toMap(arrayList22);
            }
            c29252n = c29277s0.f59283o;
            if (c29252n != null) {
                linkedHashMap3 = new LinkedHashMap();
                c33050a = C33048a.f67492y;
                if (c33050a.m71434a() || (str22 = c33050a.m71435b().f67504b) == null) {
                    jSONObject = null;
                } else {
                    jSONObject = new JSONObject(str22);
                }
                map37 = c29252n.f59243a;
                if (map37 != null && (setEntrySet = map37.entrySet()) != null && (it10 = setEntrySet.iterator()) != null) {
                    while (it10.hasNext()) {
                        Map.Entry entry8 = (Map.Entry) it10.next();
                        arrayList10 = new ArrayList();
                        str21 = (String) entry8.getKey();
                        if (jSONObject != null) {
                            jSONObjectOptJSONObject = jSONObject.optJSONObject(str21);
                        } else {
                            jSONObjectOptJSONObject = null;
                        }
                        it11 = ((Iterable) entry8.getValue()).iterator();
                        while (it11.hasNext()) {
                            c29263p0 = (C29263P0) it11.next();
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(c29263p0.f59253a);
                            } else {
                                jSONObjectOptJSONObject2 = null;
                            }
                            if (jSONObjectOptJSONObject2 != null) {
                                it12 = it11;
                                list3 = c29263p0.f59256d;
                                if (list3 != null) {
                                    arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                                    it13 = list3.iterator();
                                    while (it13.hasNext()) {
                                        c29719y = (C29719y) it13.next();
                                        Iterator it19 = it13;
                                        abstractC29103d2 = c29719y.f59781b;
                                        if (abstractC29103d2 != null) {
                                            strMo69715b = abstractC29103d2.mo69715b();
                                        } else {
                                            strMo69715b = null;
                                        }
                                        jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(strMo69715b);
                                        if (jSONArrayOptJSONArray != null) {
                                            arrayList13 = new ArrayList();
                                            i12 = 0;
                                            for (length2 = jSONArrayOptJSONArray.length(); i12 < length2; length2 = length2) {
                                                arrayList13.add(jSONArrayOptJSONArray.optString(i12));
                                                i12++;
                                            }
                                            arrayList12 = arrayList13;
                                        } else {
                                            arrayList12 = null;
                                        }
                                        if (arrayList12 != null) {
                                            c29719y = new C29719y(c29719y.f59781b, c29719y.f59782c, c29719y.f59783d, null, arrayList12, c29719y.f59786g, c29719y.f59787h, c29719y.f59788i, c29719y.f59789j);
                                        }
                                        arrayList11.add(c29719y);
                                        it13 = it19;
                                        jSONObjectOptJSONObject2 = jSONObjectOptJSONObject2;
                                        map47 = map47;
                                        map48 = map48;
                                    }
                                    map38 = map47;
                                    map39 = map48;
                                    list2 = arrayList11;
                                } else {
                                    jSONObject = jSONObject;
                                    str26 = str26;
                                    map38 = map47;
                                    map39 = map48;
                                    list = null;
                                }
                                arrayList10.add(new C28999F(c29263p0.f59253a, c29263p0.f59254b, c29263p0.f59255c, list, c29263p0.f59257e));
                                it10 = it10;
                                it11 = it12;
                                jSONObject = jSONObject;
                                str26 = str26;
                                map47 = map38;
                                map48 = map39;
                            } else {
                                it12 = it11;
                                map38 = map47;
                                map39 = map48;
                                list2 = c29263p0.f59256d;
                            }
                            list = list2;
                            arrayList10.add(new C28999F(c29263p0.f59253a, c29263p0.f59254b, c29263p0.f59255c, list, c29263p0.f59257e));
                            it10 = it10;
                            it11 = it12;
                            jSONObject = jSONObject;
                            str26 = str26;
                            map47 = map38;
                            map48 = map39;
                        }
                        linkedHashMap3.put(str21, arrayList10);
                    }
                }
                str2 = str26;
                map5 = map47;
                map6 = map48;
                linkedHashMap = linkedHashMap3;
            } else {
                str2 = str26;
                map5 = map47;
                map6 = map48;
                linkedHashMap = null;
            }
            c29252n2 = c29277s0.f59283o;
            if (c29252n2 != null) {
                bool = c29252n2.f59244b;
            } else {
                bool = null;
            }
            c29261o3 = c29277s0.f59286r;
            if (c29261o3 != null) {
                C29718x3 c29718x3 = SumsubIdType.Companion;
                str20 = c29261o3.f59250a;
                c29718x3.getClass();
                sumsubIdTypeArrValues = SumsubIdType.values();
                length = sumsubIdTypeArrValues.length;
                i11 = 0;
                while (true) {
                    if (i11 < length) {
                        sumsubIdType = null;
                        break;
                    }
                    sumsubIdType = sumsubIdTypeArrValues[i11];
                    if (Intrinsics.areEqual(sumsubIdType.getType(), str20)) {
                        break;
                    }
                    i11++;
                }
                bool2 = c29261o3.f59251b;
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    zBooleanValue = true;
                }
                c29713w3 = new C29713w3(sumsubIdType, zBooleanValue);
            } else {
                c29713w3 = null;
            }
            map7 = c29277s0.f59278j;
            if (map7 != null) {
                arrayList9 = new ArrayList();
                it7 = map7.entrySet().iterator();
                while (it7.hasNext()) {
                    entry3 = (Map.Entry) it7.next();
                    key8 = entry3.getKey();
                    if (!(key8 instanceof String)) {
                        key8 = null;
                    }
                    str19 = (String) key8;
                    if (str19 == null) {
                        it9 = it7;
                        pairM90091to10 = null;
                    } else {
                        value9 = entry3.getValue();
                        if (value9 instanceof Map) {
                            map35 = (Map) value9;
                        } else {
                            map35 = null;
                        }
                        if (map35 != null || (setKeySet4 = map35.keySet()) == null) {
                            it9 = it7;
                        } else {
                            ArrayList arrayList25 = new ArrayList();
                            for (Object obj18 : setKeySet4) {
                                if (obj18 != null) {
                                    arrayList25.add(obj18);
                                }
                            }
                            ArrayList arrayList26 = new ArrayList();
                            int size4 = arrayList25.size();
                            int i17 = 0;
                            while (i17 < size4) {
                                Iterator it20 = it7;
                                Object obj19 = arrayList25.get(i17);
                                i17++;
                                Object obj20 = map35.get(obj19);
                                Object obj21 = obj20 != null ? obj20 : null;
                                Pair pairM90091to18 = obj21 != null ? TuplesKt.m90091to(obj19, obj21) : null;
                                if (pairM90091to18 != null) {
                                    arrayList26.add(pairM90091to18);
                                }
                                it7 = it20;
                                map35 = map35;
                            }
                            it9 = it7;
                            if (arrayList26.isEmpty()) {
                                arrayList26 = null;
                            }
                            if (arrayList26 != null && (map36 = MapsKt.toMap(arrayList26)) != null) {
                                pairM90091to10 = TuplesKt.m90091to(str19, map36);
                            }
                        }
                        pairM90091to10 = null;
                    }
                    if (pairM90091to10 != null) {
                        arrayList9.add(pairM90091to10);
                    }
                    it7 = it9;
                }
                map32 = MapsKt.toMap(arrayList9);
                if (map32 != null || (map33 = (Map) map32.get("countryDependingFields")) == null) {
                    map8 = null;
                } else {
                    ArrayList arrayList27 = new ArrayList();
                    Iterator it21 = map33.entrySet().iterator();
                    while (it21.hasNext()) {
                        Map.Entry entry9 = (Map.Entry) it21.next();
                        Object key12 = entry9.getKey();
                        if (!(key12 instanceof String)) {
                            key12 = null;
                        }
                        String str34 = (String) key12;
                        if (str34 == null) {
                            it8 = it21;
                            pairM90091to9 = null;
                        } else {
                            Object value14 = entry9.getValue();
                            Map map59 = value14 instanceof Map ? (Map) value14 : null;
                            if (map59 == null || (setKeySet3 = map59.keySet()) == null) {
                                it8 = it21;
                            } else {
                                ArrayList arrayList28 = new ArrayList();
                                for (Object obj22 : setKeySet3) {
                                    if (obj22 instanceof String) {
                                        arrayList28.add(obj22);
                                    }
                                }
                                ArrayList arrayList29 = new ArrayList();
                                int size5 = arrayList28.size();
                                int i18 = 0;
                                while (i18 < size5) {
                                    Iterator it22 = it21;
                                    Object obj23 = arrayList28.get(i18);
                                    i18++;
                                    ArrayList arrayList30 = arrayList28;
                                    Object obj24 = map59.get(obj23);
                                    Map map60 = map59;
                                    if (!(obj24 instanceof String)) {
                                        obj24 = null;
                                    }
                                    Pair pairM90091to19 = obj24 != null ? TuplesKt.m90091to(obj23, (String) obj24) : null;
                                    if (pairM90091to19 != null) {
                                        arrayList29.add(pairM90091to19);
                                    }
                                    it21 = it22;
                                    arrayList28 = arrayList30;
                                    map59 = map60;
                                }
                                it8 = it21;
                                if (arrayList29.isEmpty()) {
                                    arrayList29 = null;
                                }
                                if (arrayList29 != null && (map34 = MapsKt.toMap(arrayList29)) != null) {
                                    pairM90091to9 = TuplesKt.m90091to(str34, map34);
                                }
                            }
                            pairM90091to9 = null;
                        }
                        if (pairM90091to9 != null) {
                            arrayList27.add(pairM90091to9);
                        }
                        it21 = it8;
                    }
                    map8 = MapsKt.toMap(arrayList27);
                }
            } else {
                map8 = null;
            }
            map9 = c29277s0.f59278j;
            if (map9 != null) {
                obj = map9.get("ekyc");
            } else {
                obj = null;
            }
            if (obj instanceof Map) {
                map10 = (Map) obj;
            } else {
                map10 = null;
            }
            if (map10 != null) {
                arrayList8 = new ArrayList();
                for (Map.Entry entry10 : map10.entrySet()) {
                    key7 = entry10.getKey();
                    if (!(key7 instanceof String)) {
                        key7 = null;
                    }
                    str18 = (String) key7;
                    if (str18 != null) {
                        value8 = entry10.getValue();
                        if (value8 == null) {
                            value8 = null;
                        }
                        if (value8 == null) {
                            pairM90091to8 = null;
                        } else {
                            pairM90091to8 = TuplesKt.m90091to(str18, value8);
                        }
                    } else {
                        pairM90091to8 = null;
                    }
                    if (pairM90091to8 != null) {
                        arrayList8.add(pairM90091to8);
                    }
                }
                map31 = MapsKt.toMap(arrayList8);
                if (map31 != null) {
                    obj2 = map31.get("sources");
                } else {
                    obj2 = null;
                }
            } else {
                obj2 = null;
            }
            if (obj2 instanceof Map) {
                map11 = (Map) obj2;
            } else {
                map11 = null;
            }
            if (map11 != null) {
                arrayList3 = new ArrayList();
                for (Map.Entry entry11 : map11.entrySet()) {
                    key6 = entry11.getKey();
                    if (!(key6 instanceof String)) {
                        key6 = null;
                    }
                    str17 = (String) key6;
                    if (str17 != null) {
                        value7 = entry11.getValue();
                        if (value7 == null) {
                            value7 = null;
                        }
                        if (value7 == null) {
                            pairM90091to7 = null;
                        } else {
                            pairM90091to7 = TuplesKt.m90091to(str17, value7);
                        }
                    } else {
                        pairM90091to7 = null;
                    }
                    if (pairM90091to7 != null) {
                        arrayList3.add(pairM90091to7);
                    }
                }
                map25 = MapsKt.toMap(arrayList3);
                if (map25 != null) {
                    arrayList4 = new ArrayList();
                    it5 = map25.entrySet().iterator();
                    while (it5.hasNext()) {
                        Map.Entry entry12 = (Map.Entry) it5.next();
                        str11 = (String) entry12.getKey();
                        value3 = entry12.getValue();
                        if (value3 instanceof Map) {
                            map26 = (Map) value3;
                        } else {
                            map26 = null;
                        }
                        if (map26 != null) {
                            arrayList5 = new ArrayList();
                            for (Map.Entry entry13 : map26.entrySet()) {
                                key5 = entry13.getKey();
                                Map map61 = map8;
                                if (!(key5 instanceof String)) {
                                    key5 = null;
                                }
                                str16 = (String) key5;
                                if (str16 != null) {
                                    value6 = entry13.getValue();
                                    if (value6 == null) {
                                        value6 = null;
                                    }
                                    if (value6 == null) {
                                        pairM90091to6 = null;
                                    } else {
                                        pairM90091to6 = TuplesKt.m90091to(str16, value6);
                                    }
                                } else {
                                    pairM90091to6 = null;
                                }
                                if (pairM90091to6 != null) {
                                    arrayList5.add(pairM90091to6);
                                }
                                map8 = map61;
                            }
                            map27 = map8;
                            map28 = MapsKt.toMap(arrayList5);
                            if (map28 != null) {
                                linkedHashMap2 = new LinkedHashMap();
                                for (Map.Entry entry14 : map28.entrySet()) {
                                    if (entry14.getValue() instanceof String) {
                                        linkedHashMap2.put(entry14.getKey(), entry14.getValue());
                                    }
                                }
                                arrayList6 = new ArrayList();
                                for (Map.Entry entry15 : linkedHashMap2.entrySet()) {
                                    key4 = entry15.getKey();
                                    Iterator it23 = it5;
                                    if (!(key4 instanceof String)) {
                                        key4 = null;
                                    }
                                    str14 = (String) key4;
                                    if (str14 == null) {
                                        pairM90091to5 = null;
                                    } else {
                                        value5 = entry15.getValue();
                                        if (!(value5 instanceof String)) {
                                            value5 = null;
                                        }
                                        str15 = (String) value5;
                                        if (str15 == null) {
                                            pairM90091to5 = null;
                                        } else {
                                            pairM90091to5 = TuplesKt.m90091to(str14, str15);
                                        }
                                    }
                                    if (pairM90091to5 != null) {
                                        arrayList6.add(pairM90091to5);
                                    }
                                    it5 = it23;
                                }
                                it6 = it5;
                                Map map62 = MapsKt.toMap(arrayList6);
                                obj3 = map28.get("fields");
                                if (obj3 instanceof Map) {
                                    map29 = (Map) obj3;
                                } else {
                                    map29 = null;
                                }
                                if (map29 != null) {
                                    arrayList7 = new ArrayList();
                                    for (Map.Entry entry16 : map29.entrySet()) {
                                        key3 = entry16.getKey();
                                        if (!(key3 instanceof String)) {
                                            key3 = null;
                                        }
                                        str12 = (String) key3;
                                        if (str12 == null) {
                                            pairM90091to4 = null;
                                        } else {
                                            value4 = entry16.getValue();
                                            if (!(value4 instanceof String)) {
                                                value4 = null;
                                            }
                                            str13 = (String) value4;
                                            if (str13 == null) {
                                                pairM90091to4 = null;
                                            } else {
                                                pairM90091to4 = TuplesKt.m90091to(str12, str13);
                                            }
                                        }
                                        if (pairM90091to4 != null) {
                                            arrayList7.add(pairM90091to4);
                                        }
                                    }
                                    map30 = MapsKt.toMap(arrayList7);
                                } else {
                                    map30 = null;
                                }
                                pairM90091to3 = TuplesKt.m90091to(str11, new C29693s3(map62, map30));
                            }
                            if (pairM90091to3 != null) {
                                arrayList4.add(pairM90091to3);
                            }
                            map8 = map27;
                            it5 = it6;
                        } else {
                            map27 = map8;
                        }
                        it6 = it5;
                        pairM90091to3 = null;
                        if (pairM90091to3 != null) {
                            arrayList4.add(pairM90091to3);
                        }
                        map8 = map27;
                        it5 = it6;
                    }
                    map12 = map8;
                    map13 = MapsKt.toMap(arrayList4);
                } else {
                    map12 = map8;
                    map13 = null;
                }
            } else {
                map12 = map8;
                map13 = null;
            }
            str3 = c29277s0.f59284p;
            str4 = c29277s0.f59285q;
            c29449r0 = c29277s0.f59287s;
            if (c29449r0 != null) {
                c29301x = c29449r0.f59440a;
            } else {
                c29301x = null;
            }
            c29586o0 = c29277s0.f59288t;
            c29385i4 = c29277s0.f59289u;
            if (c29385i4 != null) {
                c29369g4 = c29385i4.f59396a;
                if (c29369g4 != null) {
                    c29728z3 = new C29728z3(c29369g4.f59381a, c29369g4.f59382b);
                } else {
                    c29728z3 = null;
                }
                c28979a3 = new C28979A3(c29728z3);
            } else {
                c28979a3 = null;
            }
            map14 = c29277s0.f59290v;
            if (map14 != null) {
                arrayList2 = new ArrayList();
                it3 = map14.entrySet().iterator();
                while (it3.hasNext()) {
                    entry2 = (Map.Entry) it3.next();
                    Map map63 = map13;
                    key2 = entry2.getKey();
                    String str35 = str3;
                    if (!(key2 instanceof String)) {
                        key2 = null;
                    }
                    str9 = (String) key2;
                    if (str9 == null) {
                        str10 = str4;
                        c29301x3 = c29301x;
                        c29586o2 = c29586o0;
                        it4 = it3;
                        pairM90091to2 = null;
                    } else {
                        value2 = entry2.getValue();
                        if (value2 instanceof Map) {
                            map23 = (Map) value2;
                        } else {
                            map23 = null;
                        }
                        if (map23 != null || (setKeySet2 = map23.keySet()) == null) {
                            str10 = str4;
                            c29301x3 = c29301x;
                            c29586o2 = c29586o0;
                            it4 = it3;
                        } else {
                            str10 = str4;
                            ArrayList arrayList31 = new ArrayList();
                            for (Object obj25 : setKeySet2) {
                                C29301X c29301x4 = c29301x;
                                if (obj25 != null) {
                                    arrayList31.add(obj25);
                                }
                                c29301x = c29301x4;
                            }
                            c29301x3 = c29301x;
                            ArrayList arrayList32 = new ArrayList();
                            int size6 = arrayList31.size();
                            c29586o2 = c29586o0;
                            int i19 = 0;
                            while (i19 < size6) {
                                Iterator it24 = it3;
                                Object obj26 = arrayList31.get(i19);
                                i19++;
                                Object obj27 = map23.get(obj26);
                                Object obj28 = obj27 != null ? obj27 : null;
                                Pair pairM90091to20 = obj28 != null ? TuplesKt.m90091to(obj26, obj28) : null;
                                if (pairM90091to20 != null) {
                                    arrayList32.add(pairM90091to20);
                                }
                                it3 = it24;
                                map23 = map23;
                            }
                            it4 = it3;
                            if (arrayList32.isEmpty()) {
                                arrayList32 = null;
                            }
                            if (arrayList32 != null && (map24 = MapsKt.toMap(arrayList32)) != null) {
                                pairM90091to2 = TuplesKt.m90091to(str9, map24);
                            }
                        }
                        pairM90091to2 = null;
                    }
                    if (pairM90091to2 != null) {
                        arrayList2.add(pairM90091to2);
                    }
                    map13 = map63;
                    str3 = str35;
                    str4 = str10;
                    c29301x = c29301x3;
                    c29586o0 = c29586o2;
                    it3 = it4;
                }
                map15 = map13;
                str5 = str3;
                str6 = str4;
                c29301x2 = c29301x;
                c29586o1 = c29586o0;
                map16 = MapsKt.toMap(arrayList2);
            } else {
                map15 = map13;
                str5 = str3;
                str6 = str4;
                c29301x2 = c29301x;
                c29586o1 = c29586o0;
                map16 = null;
            }
            map17 = c29277s0.f59291w;
            if (map17 != null) {
                arrayList = new ArrayList();
                it = map17.entrySet().iterator();
                while (it.hasNext()) {
                    entry = (Map.Entry) it.next();
                    key = entry.getKey();
                    if (!(key instanceof String)) {
                        key = null;
                    }
                    str8 = (String) key;
                    if (str8 == null) {
                        map21 = map16;
                        it2 = it;
                        pairM90091to = null;
                    } else {
                        value = entry.getValue();
                        if (value instanceof Map) {
                            map20 = (Map) value;
                        } else {
                            map20 = null;
                        }
                        if (map20 != null || (setKeySet = map20.keySet()) == null) {
                            map21 = map16;
                            it2 = it;
                        } else {
                            ArrayList arrayList33 = new ArrayList();
                            for (Object obj29 : setKeySet) {
                                if (obj29 != null) {
                                    arrayList33.add(obj29);
                                }
                            }
                            ArrayList arrayList34 = new ArrayList();
                            int size7 = arrayList33.size();
                            map21 = map16;
                            int i21 = 0;
                            while (i21 < size7) {
                                Iterator it25 = it;
                                Object obj30 = arrayList33.get(i21);
                                int i22 = i21 + 1;
                                Object obj31 = map20.get(obj30);
                                Object obj32 = obj31 != null ? obj31 : null;
                                Pair pairM90091to21 = obj32 != null ? TuplesKt.m90091to(obj30, obj32) : null;
                                if (pairM90091to21 != null) {
                                    arrayList34.add(pairM90091to21);
                                }
                                it = it25;
                                i21 = i22;
                            }
                            it2 = it;
                            if (arrayList34.isEmpty()) {
                                arrayList34 = null;
                            }
                            if (arrayList34 != null && (map22 = MapsKt.toMap(arrayList34)) != null) {
                                pairM90091to = TuplesKt.m90091to(str8, map22);
                            }
                        }
                        pairM90091to = null;
                    }
                    if (pairM90091to != null) {
                        arrayList.add(pairM90091to);
                    }
                    map16 = map21;
                    it = it2;
                }
                map18 = map16;
                map19 = MapsKt.toMap(arrayList);
            } else {
                map18 = map16;
                map19 = null;
            }
            String str36 = c29277s0.f59292x;
            str7 = c29277s0.f59274f;
            if (str7 == null) {
                str7 = "";
            }
            flowActionType = c29277s0.f59275g;
            if (flowActionType == null) {
                flowActionType = FlowActionType.INSTANCE.get("");
            }
            c29118g = new C29118g(str7, flowActionType);
            if (c29277s0.f59274f != null) {
                c29118g2 = c29118g;
            } else {
                c29118g2 = null;
            }
            return new C29124h(str, flowType, str2, map2, map5, map6, map49, map50, map3, map4, linkedHashMap, bool, c29713w3, map12, map15, str5, str6, c29586o1, c29301x2, c28979a3, map18, map19, str36, c29118g2);
        }
        str = str25;
        flowType = flowTypeM69838a;
        map4 = null;
        c29252n = c29277s0.f59283o;
        if (c29252n != null) {
            linkedHashMap3 = new LinkedHashMap();
            c33050a = C33048a.f67492y;
            if (c33050a.m71434a()) {
                jSONObject = null;
            } else {
                jSONObject = null;
            }
            map37 = c29252n.f59243a;
            if (map37 != null) {
                while (it10.hasNext()) {
                    Map.Entry entry17 = (Map.Entry) it10.next();
                    arrayList10 = new ArrayList();
                    str21 = (String) entry17.getKey();
                    if (jSONObject != null) {
                        jSONObjectOptJSONObject = jSONObject.optJSONObject(str21);
                    } else {
                        jSONObjectOptJSONObject = null;
                    }
                    it11 = ((Iterable) entry17.getValue()).iterator();
                    while (it11.hasNext()) {
                        c29263p0 = (C29263P0) it11.next();
                        if (jSONObjectOptJSONObject != null) {
                            jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(c29263p0.f59253a);
                        } else {
                            jSONObjectOptJSONObject2 = null;
                        }
                        if (jSONObjectOptJSONObject2 != null) {
                            it12 = it11;
                            list3 = c29263p0.f59256d;
                            if (list3 != null) {
                                arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                                it13 = list3.iterator();
                                while (it13.hasNext()) {
                                    c29719y = (C29719y) it13.next();
                                    Iterator it110 = it13;
                                    abstractC29103d2 = c29719y.f59781b;
                                    if (abstractC29103d2 != null) {
                                        strMo69715b = abstractC29103d2.mo69715b();
                                    } else {
                                        strMo69715b = null;
                                    }
                                    jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray(strMo69715b);
                                    if (jSONArrayOptJSONArray != null) {
                                        arrayList13 = new ArrayList();
                                        i12 = 0;
                                        while (i12 < length2) {
                                            arrayList13.add(jSONArrayOptJSONArray.optString(i12));
                                            i12++;
                                        }
                                        arrayList12 = arrayList13;
                                    } else {
                                        arrayList12 = null;
                                    }
                                    if (arrayList12 != null) {
                                        c29719y = new C29719y(c29719y.f59781b, c29719y.f59782c, c29719y.f59783d, null, arrayList12, c29719y.f59786g, c29719y.f59787h, c29719y.f59788i, c29719y.f59789j);
                                    }
                                    arrayList11.add(c29719y);
                                    it13 = it110;
                                    jSONObjectOptJSONObject2 = jSONObjectOptJSONObject2;
                                    map47 = map47;
                                    map48 = map48;
                                }
                                map38 = map47;
                                map39 = map48;
                                list2 = arrayList11;
                            } else {
                                jSONObject = jSONObject;
                                str26 = str26;
                                map38 = map47;
                                map39 = map48;
                                list = null;
                            }
                            arrayList10.add(new C28999F(c29263p0.f59253a, c29263p0.f59254b, c29263p0.f59255c, list, c29263p0.f59257e));
                            it10 = it10;
                            it11 = it12;
                            jSONObject = jSONObject;
                            str26 = str26;
                            map47 = map38;
                            map48 = map39;
                        } else {
                            it12 = it11;
                            map38 = map47;
                            map39 = map48;
                            list2 = c29263p0.f59256d;
                        }
                        list = list2;
                        arrayList10.add(new C28999F(c29263p0.f59253a, c29263p0.f59254b, c29263p0.f59255c, list, c29263p0.f59257e));
                        it10 = it10;
                        it11 = it12;
                        jSONObject = jSONObject;
                        str26 = str26;
                        map47 = map38;
                        map48 = map39;
                    }
                    linkedHashMap3.put(str21, arrayList10);
                }
            }
            str2 = str26;
            map5 = map47;
            map6 = map48;
            linkedHashMap = linkedHashMap3;
        } else {
            str2 = str26;
            map5 = map47;
            map6 = map48;
            linkedHashMap = null;
        }
        c29252n2 = c29277s0.f59283o;
        if (c29252n2 != null) {
            bool = c29252n2.f59244b;
        } else {
            bool = null;
        }
        c29261o3 = c29277s0.f59286r;
        if (c29261o3 != null) {
            C29718x3 c29718x4 = SumsubIdType.Companion;
            str20 = c29261o3.f59250a;
            c29718x4.getClass();
            sumsubIdTypeArrValues = SumsubIdType.values();
            length = sumsubIdTypeArrValues.length;
            i11 = 0;
            while (true) {
                if (i11 < length) {
                    sumsubIdType = null;
                    break;
                }
                sumsubIdType = sumsubIdTypeArrValues[i11];
                if (Intrinsics.areEqual(sumsubIdType.getType(), str20)) {
                    break;
                    break;
                }
                i11++;
            }
            bool2 = c29261o3.f59251b;
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                zBooleanValue = true;
            }
            c29713w3 = new C29713w3(sumsubIdType, zBooleanValue);
        } else {
            c29713w3 = null;
        }
        map7 = c29277s0.f59278j;
        if (map7 != null) {
            arrayList9 = new ArrayList();
            it7 = map7.entrySet().iterator();
            while (it7.hasNext()) {
                entry3 = (Map.Entry) it7.next();
                key8 = entry3.getKey();
                if (!(key8 instanceof String)) {
                    key8 = null;
                }
                str19 = (String) key8;
                if (str19 == null) {
                    it9 = it7;
                    pairM90091to10 = null;
                } else {
                    value9 = entry3.getValue();
                    if (value9 instanceof Map) {
                        map35 = (Map) value9;
                    } else {
                        map35 = null;
                    }
                    if (map35 != null) {
                        it9 = it7;
                        pairM90091to10 = null;
                    } else {
                        it9 = it7;
                        pairM90091to10 = null;
                    }
                }
                if (pairM90091to10 != null) {
                    arrayList9.add(pairM90091to10);
                }
                it7 = it9;
            }
            map32 = MapsKt.toMap(arrayList9);
            if (map32 != null) {
                map8 = null;
            } else {
                map8 = null;
            }
        } else {
            map8 = null;
        }
        map9 = c29277s0.f59278j;
        if (map9 != null) {
            obj = map9.get("ekyc");
        } else {
            obj = null;
        }
        if (obj instanceof Map) {
            map10 = (Map) obj;
        } else {
            map10 = null;
        }
        if (map10 != null) {
            arrayList8 = new ArrayList();
            while (r2.hasNext()) {
                key7 = entry10.getKey();
                if (!(key7 instanceof String)) {
                    key7 = null;
                }
                str18 = (String) key7;
                if (str18 != null) {
                    value8 = entry10.getValue();
                    if (value8 == null) {
                        value8 = null;
                    }
                    if (value8 == null) {
                        pairM90091to8 = null;
                    } else {
                        pairM90091to8 = TuplesKt.m90091to(str18, value8);
                    }
                } else {
                    pairM90091to8 = null;
                }
                if (pairM90091to8 != null) {
                    arrayList8.add(pairM90091to8);
                }
            }
            map31 = MapsKt.toMap(arrayList8);
            if (map31 != null) {
                obj2 = map31.get("sources");
            } else {
                obj2 = null;
            }
        } else {
            obj2 = null;
        }
        if (obj2 instanceof Map) {
            map11 = (Map) obj2;
        } else {
            map11 = null;
        }
        if (map11 != null) {
            arrayList3 = new ArrayList();
            while (r2.hasNext()) {
                key6 = entry11.getKey();
                if (!(key6 instanceof String)) {
                    key6 = null;
                }
                str17 = (String) key6;
                if (str17 != null) {
                    value7 = entry11.getValue();
                    if (value7 == null) {
                        value7 = null;
                    }
                    if (value7 == null) {
                        pairM90091to7 = null;
                    } else {
                        pairM90091to7 = TuplesKt.m90091to(str17, value7);
                    }
                } else {
                    pairM90091to7 = null;
                }
                if (pairM90091to7 != null) {
                    arrayList3.add(pairM90091to7);
                }
            }
            map25 = MapsKt.toMap(arrayList3);
            if (map25 != null) {
                arrayList4 = new ArrayList();
                it5 = map25.entrySet().iterator();
                while (it5.hasNext()) {
                    Map.Entry entry18 = (Map.Entry) it5.next();
                    str11 = (String) entry18.getKey();
                    value3 = entry18.getValue();
                    if (value3 instanceof Map) {
                        map26 = (Map) value3;
                    } else {
                        map26 = null;
                    }
                    if (map26 != null) {
                        arrayList5 = new ArrayList();
                        while (r4.hasNext()) {
                            key5 = entry13.getKey();
                            Map map64 = map8;
                            if (!(key5 instanceof String)) {
                                key5 = null;
                            }
                            str16 = (String) key5;
                            if (str16 != null) {
                                value6 = entry13.getValue();
                                if (value6 == null) {
                                    value6 = null;
                                }
                                if (value6 == null) {
                                    pairM90091to6 = null;
                                } else {
                                    pairM90091to6 = TuplesKt.m90091to(str16, value6);
                                }
                            } else {
                                pairM90091to6 = null;
                            }
                            if (pairM90091to6 != null) {
                                arrayList5.add(pairM90091to6);
                            }
                            map8 = map64;
                        }
                        map27 = map8;
                        map28 = MapsKt.toMap(arrayList5);
                        if (map28 != null) {
                            linkedHashMap2 = new LinkedHashMap();
                            while (r6.hasNext()) {
                                if (entry14.getValue() instanceof String) {
                                    linkedHashMap2.put(entry14.getKey(), entry14.getValue());
                                }
                            }
                            arrayList6 = new ArrayList();
                            while (r4.hasNext()) {
                                key4 = entry15.getKey();
                                Iterator it26 = it5;
                                if (!(key4 instanceof String)) {
                                    key4 = null;
                                }
                                str14 = (String) key4;
                                if (str14 == null) {
                                    pairM90091to5 = null;
                                } else {
                                    value5 = entry15.getValue();
                                    if (!(value5 instanceof String)) {
                                        value5 = null;
                                    }
                                    str15 = (String) value5;
                                    if (str15 == null) {
                                        pairM90091to5 = null;
                                    } else {
                                        pairM90091to5 = TuplesKt.m90091to(str14, str15);
                                    }
                                }
                                if (pairM90091to5 != null) {
                                    arrayList6.add(pairM90091to5);
                                }
                                it5 = it26;
                            }
                            it6 = it5;
                            Map map65 = MapsKt.toMap(arrayList6);
                            obj3 = map28.get("fields");
                            if (obj3 instanceof Map) {
                                map29 = (Map) obj3;
                            } else {
                                map29 = null;
                            }
                            if (map29 != null) {
                                arrayList7 = new ArrayList();
                                while (r1.hasNext()) {
                                    key3 = entry16.getKey();
                                    if (!(key3 instanceof String)) {
                                        key3 = null;
                                    }
                                    str12 = (String) key3;
                                    if (str12 == null) {
                                        pairM90091to4 = null;
                                    } else {
                                        value4 = entry16.getValue();
                                        if (!(value4 instanceof String)) {
                                            value4 = null;
                                        }
                                        str13 = (String) value4;
                                        if (str13 == null) {
                                            pairM90091to4 = null;
                                        } else {
                                            pairM90091to4 = TuplesKt.m90091to(str12, str13);
                                        }
                                    }
                                    if (pairM90091to4 != null) {
                                        arrayList7.add(pairM90091to4);
                                    }
                                }
                                map30 = MapsKt.toMap(arrayList7);
                            } else {
                                map30 = null;
                            }
                            pairM90091to3 = TuplesKt.m90091to(str11, new C29693s3(map65, map30));
                        }
                        if (pairM90091to3 != null) {
                            arrayList4.add(pairM90091to3);
                        }
                        map8 = map27;
                        it5 = it6;
                    } else {
                        map27 = map8;
                    }
                    it6 = it5;
                    pairM90091to3 = null;
                    if (pairM90091to3 != null) {
                        arrayList4.add(pairM90091to3);
                    }
                    map8 = map27;
                    it5 = it6;
                }
                map12 = map8;
                map13 = MapsKt.toMap(arrayList4);
            } else {
                map12 = map8;
                map13 = null;
            }
        } else {
            map12 = map8;
            map13 = null;
        }
        str3 = c29277s0.f59284p;
        str4 = c29277s0.f59285q;
        c29449r0 = c29277s0.f59287s;
        if (c29449r0 != null) {
            c29301x = c29449r0.f59440a;
        } else {
            c29301x = null;
        }
        c29586o0 = c29277s0.f59288t;
        c29385i4 = c29277s0.f59289u;
        if (c29385i4 != null) {
            c29369g4 = c29385i4.f59396a;
            if (c29369g4 != null) {
                c29728z3 = new C29728z3(c29369g4.f59381a, c29369g4.f59382b);
            } else {
                c29728z3 = null;
            }
            c28979a3 = new C28979A3(c29728z3);
        } else {
            c28979a3 = null;
        }
        map14 = c29277s0.f59290v;
        if (map14 != null) {
            arrayList2 = new ArrayList();
            it3 = map14.entrySet().iterator();
            while (it3.hasNext()) {
                entry2 = (Map.Entry) it3.next();
                Map map66 = map13;
                key2 = entry2.getKey();
                String str37 = str3;
                if (!(key2 instanceof String)) {
                    key2 = null;
                }
                str9 = (String) key2;
                if (str9 == null) {
                    str10 = str4;
                    c29301x3 = c29301x;
                    c29586o2 = c29586o0;
                    it4 = it3;
                    pairM90091to2 = null;
                } else {
                    value2 = entry2.getValue();
                    if (value2 instanceof Map) {
                        map23 = (Map) value2;
                    } else {
                        map23 = null;
                    }
                    if (map23 != null) {
                        str10 = str4;
                        c29301x3 = c29301x;
                        c29586o2 = c29586o0;
                        it4 = it3;
                        pairM90091to2 = null;
                    } else {
                        str10 = str4;
                        c29301x3 = c29301x;
                        c29586o2 = c29586o0;
                        it4 = it3;
                        pairM90091to2 = null;
                    }
                }
                if (pairM90091to2 != null) {
                    arrayList2.add(pairM90091to2);
                }
                map13 = map66;
                str3 = str37;
                str4 = str10;
                c29301x = c29301x3;
                c29586o0 = c29586o2;
                it3 = it4;
            }
            map15 = map13;
            str5 = str3;
            str6 = str4;
            c29301x2 = c29301x;
            c29586o1 = c29586o0;
            map16 = MapsKt.toMap(arrayList2);
        } else {
            map15 = map13;
            str5 = str3;
            str6 = str4;
            c29301x2 = c29301x;
            c29586o1 = c29586o0;
            map16 = null;
        }
        map17 = c29277s0.f59291w;
        if (map17 != null) {
            arrayList = new ArrayList();
            it = map17.entrySet().iterator();
            while (it.hasNext()) {
                entry = (Map.Entry) it.next();
                key = entry.getKey();
                if (!(key instanceof String)) {
                    key = null;
                }
                str8 = (String) key;
                if (str8 == null) {
                    map21 = map16;
                    it2 = it;
                    pairM90091to = null;
                } else {
                    value = entry.getValue();
                    if (value instanceof Map) {
                        map20 = (Map) value;
                    } else {
                        map20 = null;
                    }
                    if (map20 != null) {
                        map21 = map16;
                        it2 = it;
                        pairM90091to = null;
                    } else {
                        map21 = map16;
                        it2 = it;
                        pairM90091to = null;
                    }
                }
                if (pairM90091to != null) {
                    arrayList.add(pairM90091to);
                }
                map16 = map21;
                it = it2;
            }
            map18 = map16;
            map19 = MapsKt.toMap(arrayList);
        } else {
            map18 = map16;
            map19 = null;
        }
        String str38 = c29277s0.f59292x;
        str7 = c29277s0.f59274f;
        if (str7 == null) {
            str7 = "";
        }
        flowActionType = c29277s0.f59275g;
        if (flowActionType == null) {
            flowActionType = FlowActionType.INSTANCE.get("");
        }
        c29118g = new C29118g(str7, flowActionType);
        if (c29277s0.f59274f != null) {
            c29118g2 = c29118g;
        } else {
            c29118g2 = null;
        }
        return new C29124h(str, flowType, str2, map2, map5, map6, map49, map50, map3, map4, linkedHashMap, bool, c29713w3, map12, map15, str5, str6, c29586o1, c29301x2, c28979a3, map18, map19, str38, c29118g2);
    }

    /* JADX INFO: renamed from: a */
    public static final FlowType m69838a(FlowType flowType) throws SNSInvalidParametersException {
        int i11 = flowType == null ? -1 : AbstractC29282T0.f59295a[flowType.ordinal()];
        if (i11 == -1) {
            return FlowType.Standalone;
        }
        if (i11 != 1) {
            return flowType;
        }
        throw new SNSInvalidParametersException(CollectionsKt.listOf("Unsupported flow type: " + flowType.getValue()));
    }
}
