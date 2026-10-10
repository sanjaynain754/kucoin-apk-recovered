package com.sumsub.sns.internal.core.presentation.form.model;

import androidx.credentials.provider.CredentialEntry;
import com.sumsub.sns.internal.core.presentation.form.FieldId;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28805l;
import com.sumsub.sns.internal.features.data.model.common.remote.AbstractC29286U;
import com.sumsub.sns.internal.features.data.model.common.remote.C29281T;
import com.tencent.bugly.proguard.C33627eb;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Stack;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.form.model.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28842f {

    /* JADX INFO: renamed from: a */
    public static final C28847h0 f58669a = new C28847h0();

    /* JADX INFO: renamed from: a */
    public static C28840e m69654a(ArrayList arrayList, InterfaceC28805l interfaceC28805l) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (obj instanceof C28823Q) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            if (((AbstractC28841e0) obj2).mo69642c().f59466a != null) {
                arrayList3.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size3 = arrayList3.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj3 = arrayList3.get(i13);
            i13++;
            String strMo69643d = ((AbstractC28841e0) obj3).mo69643d();
            Object arrayList4 = linkedHashMap.get(strMo69643d);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(strMo69643d, arrayList4);
            }
            ((List) arrayList4).add(obj3);
        }
        int size4 = arrayList2.size();
        int i14 = 0;
        while (i14 < size4) {
            Object obj4 = arrayList2.get(i14);
            i14++;
            C28823Q c28823q = (C28823Q) obj4;
            List<AbstractC28841e0> list = (List) linkedHashMap.get(c28823q.f58626e);
            if (m69655a(c28823q, arrayList, linkedHashSet2, linkedHashSet, interfaceC28805l)) {
                boolean z11 = true;
                if (list != null && (r8 = list.iterator()) != null) {
                    for (AbstractC28841e0 abstractC28841e0 : list) {
                        if (m69655a(abstractC28841e0, arrayList, linkedHashSet2, linkedHashSet, interfaceC28805l) || abstractC28841e0.mo69643d() == null || abstractC28841e0.mo69642c().f59466a == null) {
                            z11 = false;
                        } else {
                            linkedHashSet.add(new FieldId(abstractC28841e0.mo69643d(), abstractC28841e0.mo69642c().f59466a));
                        }
                    }
                }
                if (z11) {
                    linkedHashSet2.add(c28823q.f58626e);
                }
            } else if (list != null && (r7 = list.iterator()) != null) {
                for (AbstractC28841e0 abstractC28841e1 : list) {
                    if (abstractC28841e1.mo69643d() != null && abstractC28841e1.mo69642c().f59466a != null) {
                        linkedHashSet.add(new FieldId(abstractC28841e1.mo69643d(), abstractC28841e1.mo69642c().f59466a));
                    }
                    String strMo69643d2 = abstractC28841e1.mo69643d();
                    if (strMo69643d2 != null) {
                        linkedHashSet2.add(strMo69643d2);
                    }
                }
            }
        }
        return new C28840e(linkedHashSet2, linkedHashSet);
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0269  */
    /* JADX WARN: Code duplicated, block: B:123:0x026b  */
    /* JADX WARN: Code duplicated, block: B:20:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0190  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX INFO: renamed from: a */
    public static boolean m69655a(AbstractC28841e0 abstractC28841e0, ArrayList arrayList, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, InterfaceC28805l interfaceC28805l) {
        String string;
        boolean z11;
        Object obj;
        String strMo69626b;
        List listMo69625a;
        boolean z12;
        AbstractC28838d c28834b;
        String str = abstractC28841e0.f58668b;
        boolean z13 = true;
        if (str == null || str.length() <= 0) {
            return true;
        }
        String str2 = abstractC28841e0.f58668b;
        ArrayList arrayList2 = new ArrayList();
        List<String> listSplit$default = str2 != null ? StringsKt.split$default((CharSequence) str2, new String[]{Logic.OR.getRawValue(), Logic.AND.getRawValue()}, false, 0, 6, (Object) null) : null;
        int i11 = 0;
        if (listSplit$default != null) {
            for (String str3 : listSplit$default) {
                if (StringsKt.contains$default((CharSequence) str3, (CharSequence) "!=", false, 2, (Object) null)) {
                    List listSplit$default2 = StringsKt.split$default((CharSequence) str3, new String[]{"!="}, false, 0, 6, (Object) null);
                    C29281T c29281tM69837a = AbstractC29286U.m69837a((String) listSplit$default2.get(0));
                    if (c29281tM69837a != null) {
                        c28834b = new C28836c(str3, StringsKt.trim((CharSequence) c29281tM69837a.f59293a).toString(), StringsKt.trim((CharSequence) c29281tM69837a.f59294b).toString(), (String) listSplit$default2.get(1));
                    } else {
                        c28834b = null;
                    }
                } else if (StringsKt.contains$default((CharSequence) str3, (CharSequence) "=", false, 2, (Object) null)) {
                    List listSplit$default3 = StringsKt.split$default((CharSequence) str3, new String[]{"="}, false, 0, 6, (Object) null);
                    C29281T c29281tM69837a2 = AbstractC29286U.m69837a((String) listSplit$default3.get(0));
                    if (c29281tM69837a2 != null) {
                        c28834b = new C28832a(str3, StringsKt.trim((CharSequence) c29281tM69837a2.f59293a).toString(), StringsKt.trim((CharSequence) c29281tM69837a2.f59294b).toString(), (String) listSplit$default3.get(1));
                    } else {
                        c28834b = null;
                    }
                } else {
                    C29281T c29281tM69837a3 = AbstractC29286U.m69837a(str3);
                    if (c29281tM69837a3 != null) {
                        c28834b = new C28834b(str3, StringsKt.trim((CharSequence) c29281tM69837a3.f59293a).toString(), StringsKt.trim((CharSequence) c29281tM69837a3.f59294b).toString());
                    } else {
                        c28834b = null;
                    }
                }
                if (c28834b != null) {
                    arrayList2.add(c28834b);
                }
            }
        }
        List<AbstractC28838d> list = CollectionsKt.toList(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        String strReplace$default = str2;
        for (AbstractC28838d abstractC28838d : list) {
            String strMo69652c = abstractC28838d.mo69652c();
            String strMo69651b = abstractC28838d.mo69651b();
            int size = arrayList.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    z11 = z13;
                    obj = null;
                    break;
                }
                obj = arrayList.get(i12);
                i12++;
                AbstractC28841e0 abstractC28841e1 = (AbstractC28841e0) obj;
                z11 = z13;
                if (Intrinsics.areEqual(abstractC28841e1.mo69643d(), strMo69652c) && Intrinsics.areEqual(abstractC28841e1.mo69642c().f59466a, strMo69651b)) {
                    break;
                }
                z13 = z11;
            }
            AbstractC28841e0 abstractC28841e2 = (AbstractC28841e0) obj;
            if (abstractC28841e2 == null) {
                strMo69626b = null;
            } else {
                String strMo69643d = abstractC28841e2.mo69643d();
                if (strMo69643d == null) {
                    strMo69643d = "";
                }
                String str4 = abstractC28841e2.mo69642c().f59466a;
                if (str4 == null) {
                    str4 = "";
                }
                strMo69626b = interfaceC28805l.mo69626b(strMo69643d, str4);
                if (strMo69626b == null || linkedHashSet2.contains(new FieldId(abstractC28838d.mo69652c(), abstractC28838d.mo69651b())) || linkedHashSet.contains(abstractC28838d.mo69652c())) {
                    strMo69626b = null;
                }
            }
            if (abstractC28841e2 == null) {
                listMo69625a = null;
            } else {
                String strMo69643d2 = abstractC28841e2.mo69643d();
                if (strMo69643d2 == null) {
                    strMo69643d2 = "";
                }
                String str5 = abstractC28841e2.mo69642c().f59466a;
                listMo69625a = interfaceC28805l.mo69625a(strMo69643d2, str5 != null ? str5 : "");
                if (listMo69625a == null) {
                    listMo69625a = null;
                } else {
                    if (listMo69625a.isEmpty()) {
                        listMo69625a = null;
                    }
                    if (listMo69625a == null || linkedHashSet2.contains(new FieldId(abstractC28838d.mo69652c(), abstractC28838d.mo69651b())) || linkedHashSet.contains(abstractC28838d.mo69652c())) {
                        listMo69625a = null;
                    }
                }
            }
            if (abstractC28838d instanceof C28832a) {
                C28832a c28832a = (C28832a) abstractC28838d;
                boolean zAreEqual = Intrinsics.areEqual(strMo69626b, StringsKt.trim((CharSequence) c28832a.f58650d).toString());
                boolean zContains = listMo69625a != null ? listMo69625a.contains(StringsKt.trim((CharSequence) c28832a.f58650d).toString()) : false;
                if (zAreEqual || zContains) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
            } else if (abstractC28838d instanceof C28834b) {
                boolean z14 = (strMo69626b == null || strMo69626b.length() == 0 || Intrinsics.areEqual(strMo69626b, CredentialEntry.FALSE_STRING)) ? false : z11;
                boolean z15 = listMo69625a != null ? !listMo69625a.isEmpty() : false;
                if (z14 || z15) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
            } else if (abstractC28838d instanceof C28836c) {
                boolean z16 = ((listMo69625a == null || listMo69625a.isEmpty()) && !Intrinsics.areEqual(strMo69626b, StringsKt.trim((CharSequence) ((C28836c) abstractC28838d).f58661d).toString())) ? z11 : false;
                boolean z17 = (listMo69625a == null || listMo69625a.contains(StringsKt.trim((CharSequence) ((C28836c) abstractC28838d).f58661d).toString())) ? false : z11;
                if (z16 || z17) {
                    z12 = z11;
                } else {
                    z12 = false;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            strReplace$default = strReplace$default != null ? StringsKt.replace$default(strReplace$default, abstractC28838d.mo69650a(), C33627eb.f69716f + z12 + C33627eb.f69716f, false, 4, (Object) null) : null;
            arrayList3.add(Unit.INSTANCE);
            z13 = z11;
        }
        boolean z18 = z13;
        C28847h0 c28847h0 = f58669a;
        if (strReplace$default == null || (string = StringsKt.trim((CharSequence) strReplace$default).toString()) == null) {
            string = CredentialEntry.TRUE_STRING;
        }
        c28847h0.getClass();
        String string2 = StringsKt.trim((CharSequence) string).toString();
        ArrayList arrayList4 = new ArrayList();
        if (string2 != null && !StringsKt.isBlank(string2)) {
            Stack stack = new Stack();
            for (String str6 : StringsKt.split$default((CharSequence) string2, new String[]{C33627eb.f69716f}, false, 0, 6, (Object) null)) {
                if (c28847h0.f58676a.containsKey(str6)) {
                    while (!stack.isEmpty()) {
                        if ((Intrinsics.areEqual((String) stack.peek(), "&&") ? 2 : z18) < (Intrinsics.areEqual(str6, "&&") ? 2 : z18)) {
                            break;
                        }
                        arrayList4.add(stack.pop());
                    }
                    stack.push(str6);
                } else if (Intrinsics.areEqual(str6, "(")) {
                    stack.push(str6);
                } else if (Intrinsics.areEqual(str6, ")")) {
                    while (!((String) stack.peek()).equals("(")) {
                        arrayList4.add(stack.pop());
                    }
                    stack.pop();
                } else {
                    arrayList4.add(str6);
                }
            }
            while (!stack.isEmpty()) {
                arrayList4.add(stack.pop());
            }
        }
        if (arrayList4.isEmpty()) {
            return false;
        }
        Stack stack2 = new Stack();
        int size2 = arrayList4.size();
        while (i11 < size2) {
            Object obj2 = arrayList4.get(i11);
            i11++;
            String str7 = (String) obj2;
            Function2 function2 = (Function2) c28847h0.f58676a.get(str7);
            if (function2 != null) {
                if (stack2.size() < 2) {
                    return z18;
                }
            }
        }
        return ((Boolean) stack2.pop()).booleanValue();
    }
}
