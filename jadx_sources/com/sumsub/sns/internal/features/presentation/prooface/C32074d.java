package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.core.presentation.intro.AbstractC28889a;
import com.sumsub.sns.internal.core.presentation.intro.AbstractC28892d;
import com.sumsub.sns.internal.features.data.model.common.AnswerType;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.prooface.C29810M;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32074d {

    /* JADX INFO: renamed from: a */
    public final C29983l f65282a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29984m f65283b;

    /* JADX INFO: renamed from: a */
    public static String m71019a(C29810M c29810m) {
        String str = c29810m != null ? c29810m.f59887d : null;
        AnswerType answerType = AnswerType.Green;
        if (Intrinsics.areEqual(str, answerType.getValue())) {
            return answerType.getValue();
        }
        return (!(c29810m != null ? Intrinsics.areEqual(c29810m.f59888e, Boolean.TRUE) : false) || Intrinsics.areEqual(c29810m.f59887d, answerType.getValue())) ? AnswerType.Red.getValue() : AnswerType.Yellow.getValue();
    }

    public C32074d(C29983l c29983l, InterfaceC29984m interfaceC29984m) {
        this.f65282a = c29983l;
        this.f65283b = interfaceC29984m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71022a(C29810M c29810m, boolean z11, ContinuationImpl continuationImpl) {
        C32069c c32069c;
        SNSLiveness3dFaceViewModel$Icon sNSLiveness3dFaceViewModel$Icon;
        C32081e1 c32081e1;
        SNSLiveness3dFaceViewModel$Icon sNSLiveness3dFaceViewModel$Icon2;
        if (continuationImpl instanceof C32069c) {
            c32069c = (C32069c) continuationImpl;
            int i11 = c32069c.f65253e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32069c.f65253e = i11 - Integer.MIN_VALUE;
            } else {
                c32069c = new C32069c(this, continuationImpl);
            }
        } else {
            c32069c = new C32069c(this, continuationImpl);
        }
        Object objM71021a = c32069c.f65251c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32069c.f65253e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM71021a);
            String str = c29810m != null ? c29810m.f59887d : null;
            AnswerType answerType = AnswerType.Green;
            if (Intrinsics.areEqual(str, answerType.getValue())) {
                sNSLiveness3dFaceViewModel$Icon = SNSLiveness3dFaceViewModel$Icon.APPROVED;
            } else {
                sNSLiveness3dFaceViewModel$Icon = (!(c29810m != null ? Intrinsics.areEqual(c29810m.f59888e, Boxing.boxBoolean(true)) : false) || Intrinsics.areEqual(c29810m.f59887d, answerType.getValue())) ? SNSLiveness3dFaceViewModel$Icon.REJECTED : SNSLiveness3dFaceViewModel$Icon.PENDING;
            }
            c32081e1 = !z11 ? new C32081e1(this.f65282a.m70061a("sns_facescan_action_retry")) : null;
            c32069c.f65249a = c32081e1;
            c32069c.f65250b = sNSLiveness3dFaceViewModel$Icon;
            c32069c.f65253e = 1;
            objM71021a = m71021a(c29810m, c32069c);
            if (objM71021a == coroutine_suspended) {
                return coroutine_suspended;
            }
            sNSLiveness3dFaceViewModel$Icon2 = sNSLiveness3dFaceViewModel$Icon;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sNSLiveness3dFaceViewModel$Icon2 = c32069c.f65250b;
            c32081e1 = c32069c.f65249a;
            ResultKt.throwOnFailure(objM71021a);
        }
        return new C32114l1(sNSLiveness3dFaceViewModel$Icon2, (InterfaceC32110k1) objM71021a, c32081e1);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71021a(C29810M c29810m, ContinuationImpl continuationImpl) {
        C32059a c32059a;
        C32106j1 c32106j1;
        if (continuationImpl instanceof C32059a) {
            c32059a = (C32059a) continuationImpl;
            int i11 = c32059a.f65226d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32059a.f65226d = i11 - Integer.MIN_VALUE;
            } else {
                c32059a = new C32059a(this, continuationImpl);
            }
        } else {
            c32059a = new C32059a(this, continuationImpl);
        }
        Object objM71023a = c32059a.f65224b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32059a.f65226d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM71023a);
            c32106j1 = null;
            String str = c29810m != null ? c29810m.f59890g : null;
            if (str != null) {
                c32059a.f65223a = c29810m;
                c32059a.f65226d = 1;
                objM71023a = m71023a(str, c32059a);
                if (objM71023a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (c32106j1 != null) {
                return c32106j1;
            }
            C29983l c29983l = this.f65282a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return new C32101i1(AbstractC28892d.m69671a(new Object[]{m71019a(c29810m)}, 1, "sns_facescan_result_%s_title", c29983l), AbstractC28892d.m69671a(new Object[]{m71019a(c29810m)}, 1, "sns_facescan_result_%s_text", this.f65282a));
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c29810m = c32059a.f65223a;
        ResultKt.throwOnFailure(objM71023a);
        c32106j1 = (C32106j1) objM71023a;
        if (c32106j1 != null) {
            return c32106j1;
        }
        C29983l c29983l2 = this.f65282a;
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        return new C32101i1(AbstractC28892d.m69671a(new Object[]{m71019a(c29810m)}, 1, "sns_facescan_result_%s_title", c29983l2), AbstractC28892d.m69671a(new Object[]{m71019a(c29810m)}, 1, "sns_facescan_result_%s_text", this.f65282a));
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:147:0x0275  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v21, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v12, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v19, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final Object m71023a(String str, ContinuationImpl continuationImpl) {
        C32064b c32064b;
        ?? r13;
        T t11;
        CharSequence charSequence;
        CharSequence charSequence2;
        Pair pairM90091to;
        Pair pairM90091to2;
        Pair pairM90091to3;
        Pair pairM90091to4;
        if (continuationImpl instanceof C32064b) {
            c32064b = (C32064b) continuationImpl;
            int i11 = c32064b.f65238d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32064b.f65238d = i11 - Integer.MIN_VALUE;
            } else {
                c32064b = new C32064b(this, continuationImpl);
            }
        } else {
            c32064b = new C32064b(this, continuationImpl);
        }
        Object objM70045b = c32064b.f65236b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32064b.f65238d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70045b);
            InterfaceC29984m interfaceC29984m = this.f65283b;
            c32064b.f65235a = str;
            c32064b.f65238d = 1;
            objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c32064b);
            if (objM70045b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c32064b.f65235a;
            ResultKt.throwOnFailure(objM70045b);
        }
        C29124h c29124h = (C29124h) ((AbstractC29971N) objM70045b).m70051c();
        list = null;
        List list = null;
        if (c29124h == null || (r13 = c29124h.f59071d) == 0) {
            return null;
        }
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"liveness", SpellCheckPlugin.SUGGESTIONS_KEY, str});
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = r13;
        Iterator itM69668a = AbstractC28889a.m69668a(listListOf, 1, 0);
        while (true) {
            if (itM69668a.hasNext()) {
                Object obj = ((Map) objectRef.element).get(listListOf.get(((IntIterator) itM69668a).nextInt()));
                Map map = obj instanceof Map ? (Map) obj : null;
                if (map != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        if (!(key instanceof String)) {
                            key = null;
                        }
                        String str2 = (String) key;
                        if (str2 != null) {
                            Object value = entry.getValue();
                            if (value == null) {
                                value = null;
                            }
                            if (value == null) {
                                pairM90091to4 = null;
                            } else {
                                pairM90091to4 = TuplesKt.m90091to(str2, value);
                            }
                        } else {
                            pairM90091to4 = null;
                        }
                        if (pairM90091to4 != null) {
                            arrayList.add(pairM90091to4);
                        }
                    }
                    ?? map2 = MapsKt.toMap(arrayList);
                    if (map2 != 0) {
                        objectRef.element = map2;
                    }
                }
                t11 = 0;
                break;
            }
            Object obj2 = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listListOf));
            if (!(obj2 instanceof Map)) {
                obj2 = null;
            }
            t11 = (Map) obj2;
            break;
        }
        if (t11 == 0) {
            return null;
        }
        List listListOf2 = CollectionsKt.listOf("title");
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = t11;
        Iterator itM69668a2 = AbstractC28889a.m69668a(listListOf2, 1, 0);
        while (true) {
            if (itM69668a2.hasNext()) {
                Object obj3 = ((Map) objectRef2.element).get(listListOf2.get(((IntIterator) itM69668a2).nextInt()));
                Map map3 = obj3 instanceof Map ? (Map) obj3 : null;
                if (map3 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry2 : map3.entrySet()) {
                        Object key2 = entry2.getKey();
                        if (!(key2 instanceof String)) {
                            key2 = null;
                        }
                        String str3 = (String) key2;
                        if (str3 != null) {
                            Object value2 = entry2.getValue();
                            if (value2 == null) {
                                value2 = null;
                            }
                            if (value2 == null) {
                                pairM90091to3 = null;
                            } else {
                                pairM90091to3 = TuplesKt.m90091to(str3, value2);
                            }
                        } else {
                            pairM90091to3 = null;
                        }
                        if (pairM90091to3 != null) {
                            arrayList2.add(pairM90091to3);
                        }
                    }
                    ?? map4 = MapsKt.toMap(arrayList2);
                    if (map4 != 0) {
                        objectRef2.element = map4;
                    }
                }
                charSequence = null;
                break;
            }
            Object obj4 = ((Map) objectRef2.element).get(CollectionsKt.lastOrNull(listListOf2));
            if (!(obj4 instanceof CharSequence)) {
                obj4 = null;
            }
            charSequence = (CharSequence) obj4;
            break;
        }
        List listListOf3 = CollectionsKt.listOf("tipsTitle");
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = t11;
        Iterator itM69668a3 = AbstractC28889a.m69668a(listListOf3, 1, 0);
        while (true) {
            if (itM69668a3.hasNext()) {
                Object obj5 = ((Map) objectRef3.element).get(listListOf3.get(((IntIterator) itM69668a3).nextInt()));
                Map map5 = obj5 instanceof Map ? (Map) obj5 : null;
                if (map5 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry3 : map5.entrySet()) {
                        Object key3 = entry3.getKey();
                        if (!(key3 instanceof String)) {
                            key3 = null;
                        }
                        String str4 = (String) key3;
                        if (str4 != null) {
                            Object value3 = entry3.getValue();
                            if (value3 == null) {
                                value3 = null;
                            }
                            if (value3 == null) {
                                pairM90091to2 = null;
                            } else {
                                pairM90091to2 = TuplesKt.m90091to(str4, value3);
                            }
                        } else {
                            pairM90091to2 = null;
                        }
                        if (pairM90091to2 != null) {
                            arrayList3.add(pairM90091to2);
                        }
                    }
                    ?? map6 = MapsKt.toMap(arrayList3);
                    if (map6 != 0) {
                        objectRef3.element = map6;
                    }
                }
                charSequence2 = null;
                break;
            }
            Object obj6 = ((Map) objectRef3.element).get(CollectionsKt.lastOrNull(listListOf3));
            if (!(obj6 instanceof CharSequence)) {
                obj6 = null;
            }
            charSequence2 = (CharSequence) obj6;
            break;
        }
        List listListOf4 = CollectionsKt.listOf("tips");
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = t11;
        Iterator itM69668a4 = AbstractC28889a.m69668a(listListOf4, 1, 0);
        while (itM69668a4.hasNext()) {
            Object obj7 = ((Map) objectRef4.element).get(listListOf4.get(((IntIterator) itM69668a4).nextInt()));
            Map map7 = obj7 instanceof Map ? (Map) obj7 : null;
            if (map7 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Map.Entry entry4 : map7.entrySet()) {
                    Object key4 = entry4.getKey();
                    if (!(key4 instanceof String)) {
                        key4 = null;
                    }
                    String str5 = (String) key4;
                    if (str5 != null) {
                        Object value4 = entry4.getValue();
                        if (value4 == null) {
                            value4 = null;
                        }
                        if (value4 == null) {
                            pairM90091to = null;
                        } else {
                            pairM90091to = TuplesKt.m90091to(str5, value4);
                        }
                    } else {
                        pairM90091to = null;
                    }
                    if (pairM90091to != null) {
                        arrayList4.add(pairM90091to);
                    }
                }
                ?? map8 = MapsKt.toMap(arrayList4);
                if (map8 != 0) {
                    objectRef4.element = map8;
                }
            }
            return new C32106j1(charSequence, m71020a(charSequence2, list));
        }
        Object obj8 = ((Map) objectRef4.element).get(CollectionsKt.lastOrNull(listListOf4));
        list = (List) (obj8 instanceof List ? obj8 : null);
        return new C32106j1(charSequence, m71020a(charSequence2, list));
    }

    /* JADX INFO: renamed from: a */
    public static String m71020a(CharSequence charSequence, List list) {
        StringBuilder sb2 = new StringBuilder();
        if (charSequence != null) {
            sb2.append("**" + ((Object) charSequence) + "**");
            sb2.append('\n');
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb2.append(" - " + ((Object) ((CharSequence) it.next())));
                sb2.append('\n');
            }
        }
        return sb2.toString();
    }
}
