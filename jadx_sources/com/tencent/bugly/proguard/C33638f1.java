package com.tencent.bugly.proguard;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.f1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33638f1 {
    /* JADX INFO: renamed from: a */
    public static void m72980a(ArrayList<String> arrayList, String str) {
        int length = str.length();
        while (str.charAt(length - 1) == '>' && (length = length - 1) != 0) {
        }
        arrayList.add(0, m72987g(str.substring(0, length)));
    }

    /* JADX INFO: renamed from: c */
    public static String m72983c(String str) {
        if (str.equals("int")) {
            return "Integer";
        }
        if (str.equals(TypedValues.Custom.S_BOOLEAN)) {
            return "Boolean";
        }
        if (str.equals("byte")) {
            return "Byte";
        }
        if (str.equals("double")) {
            return "Double";
        }
        if (str.equals(TypedValues.Custom.S_FLOAT)) {
            return "Float";
        }
        if (str.equals("long")) {
            return "Long";
        }
        if (str.equals("short")) {
            return "Short";
        }
        return str.equals("char") ? "Character" : str;
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList<String> m72984d(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        int iIndexOf = str.indexOf("<");
        int i11 = 0;
        while (i11 < iIndexOf) {
            m72980a(arrayList, str.substring(i11, iIndexOf));
            i11 = iIndexOf + 1;
            iIndexOf = str.indexOf("<", i11);
            int iIndexOf2 = str.indexOf(",", i11);
            if (iIndexOf == -1) {
                iIndexOf = iIndexOf2;
            }
            if (iIndexOf2 != -1 && iIndexOf2 < iIndexOf) {
                iIndexOf = iIndexOf2;
            }
        }
        m72980a(arrayList, str.substring(i11, str.length()));
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m72985e(String str) {
        return str.equals("int") || str.equals(TypedValues.Custom.S_BOOLEAN) || str.equals("byte") || str.equals("double") || str.equals(TypedValues.Custom.S_FLOAT) || str.equals("long") || str.equals("short") || str.equals("char") || str.equals("Integer") || str.equals("Boolean") || str.equals("Byte") || str.equals("Double") || str.equals("Float") || str.equals("Long") || str.equals("Short") || str.equals("Char");
    }

    /* JADX INFO: renamed from: f */
    public static String m72986f(String str) {
        if (str.equals("java.lang.Integer") || str.equals("int")) {
            return "int32";
        }
        if (str.equals("java.lang.Boolean") || str.equals(TypedValues.Custom.S_BOOLEAN)) {
            return "bool";
        }
        if (str.equals("java.lang.Byte") || str.equals("byte")) {
            return "char";
        }
        String str2 = "double";
        if (!str.equals("java.lang.Double") && !str.equals("double")) {
            boolean zEquals = str.equals("java.lang.Float");
            str2 = TypedValues.Custom.S_FLOAT;
            if (!zEquals && !str.equals(TypedValues.Custom.S_FLOAT)) {
                if (str.equals("java.lang.Long") || str.equals("long")) {
                    return "int64";
                }
                if (str.equals("java.lang.Short") || str.equals("short")) {
                    return "short";
                }
                if (str.equals("java.lang.Character")) {
                    throw new IllegalArgumentException("can not support java.lang.Character");
                }
                if (str.equals("java.lang.String")) {
                    return TypedValues.Custom.S_STRING;
                }
                if (str.equals("java.util.List")) {
                    return "list";
                }
                return str.equals("java.util.Map") ? "map" : str;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: g */
    public static String m72987g(String str) {
        if (str.equals("int32")) {
            return "java.lang.Integer";
        }
        if (str.equals("bool")) {
            return "java.lang.Boolean";
        }
        if (str.equals("char")) {
            return "java.lang.Byte";
        }
        if (str.equals("double")) {
            return "java.lang.Double";
        }
        if (str.equals(TypedValues.Custom.S_FLOAT)) {
            return "java.lang.Float";
        }
        if (str.equals("int64")) {
            return "java.lang.Long";
        }
        if (str.equals("short")) {
            return "java.lang.Short";
        }
        if (str.equals(TypedValues.Custom.S_STRING)) {
            return "java.lang.String";
        }
        if (str.equals("list")) {
            return "java.util.List";
        }
        return str.equals("map") ? "java.util.Map" : str;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX INFO: renamed from: b */
    public static Object m72982b(String str) throws C33818nd {
        boolean z11;
        Iterator<String> it = m72984d(str).iterator();
        Object objM72977a = null;
        Object obj = null;
        while (true) {
            Object obj2 = obj;
            while (it.hasNext()) {
                objM72977a = m72977a(it.next());
                boolean z12 = false;
                if (objM72977a instanceof String) {
                    String str2 = (String) objM72977a;
                    if ("Array".equals(str2)) {
                        if (obj == null) {
                            objM72977a = Array.newInstance((Class<?>) Byte.class, 0);
                        }
                    } else if (!"?".equals(str2)) {
                        if (obj != null) {
                            obj2 = obj;
                        }
                        obj = objM72977a;
                    }
                } else if (objM72977a instanceof List) {
                    if (obj != null && (obj instanceof Byte)) {
                        objM72977a = Array.newInstance((Class<?>) Byte.class, 1);
                        Array.set(objM72977a, 0, obj);
                    } else {
                        if (obj != null) {
                            ((List) objM72977a).add(obj);
                        }
                        obj = null;
                    }
                } else if (objM72977a instanceof Map) {
                    if (obj != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (obj2 != null) {
                        z12 = true;
                    }
                    if (z11 & z12) {
                        ((Map) objM72977a).put(obj, obj2);
                    }
                    obj = null;
                } else {
                    if (obj != null) {
                        obj2 = obj;
                    }
                    obj = objM72977a;
                }
            }
            return objM72977a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m72981a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("char");
        arrayList.add("list<char>");
        arrayList.add("list<list<char>>");
        arrayList.add("map<short,string>");
        arrayList.add("map<double,map<float,list<bool>>>");
        arrayList.add("map<int64,list<Test.UserInfo>>");
        arrayList.add("map<short,Test.FriendInfo>");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList<String> arrayListM72984d = m72984d((String) it.next());
            Iterator<String> it2 = arrayListM72984d.iterator();
            while (it2.hasNext()) {
                System.out.println(it2.next());
            }
            Collections.reverse(arrayListM72984d);
            System.out.println("-------------finished " + m72979a(arrayListM72984d));
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m72979a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.set(i11, m72986f(arrayList.get(i11)));
        }
        Collections.reverse(arrayList);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            String str = arrayList.get(i12);
            if (str.equals("list")) {
                int i13 = i12 - 1;
                arrayList.set(i13, "<" + arrayList.get(i13));
                arrayList.set(0, arrayList.get(0) + ">");
            } else if (str.equals("map")) {
                int i14 = i12 - 1;
                arrayList.set(i14, "<" + arrayList.get(i14) + ",");
                arrayList.set(0, arrayList.get(0) + ">");
            } else if (str.equals("Array")) {
                int i15 = i12 - 1;
                arrayList.set(i15, "<" + arrayList.get(i15));
                arrayList.set(0, arrayList.get(0) + ">");
            }
        }
        Collections.reverse(arrayList);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public static Object m72977a(String str) throws C33818nd {
        if (str.equals("java.lang.Integer")) {
            return 0;
        }
        if (str.equals("java.lang.Boolean")) {
            return Boolean.FALSE;
        }
        if (str.equals("java.lang.Byte")) {
            return (byte) 0;
        }
        if (str.equals("java.lang.Double")) {
            return Double.valueOf(0.0d);
        }
        if (str.equals("java.lang.Float")) {
            return Float.valueOf(0.0f);
        }
        if (str.equals("java.lang.Long")) {
            return 0L;
        }
        if (str.equals("java.lang.Short")) {
            return (short) 0;
        }
        if (!str.equals("java.lang.Character")) {
            if (str.equals("java.lang.String")) {
                return "";
            }
            if (str.equals("java.util.List")) {
                return new ArrayList();
            }
            if (str.equals("java.util.Map")) {
                return new HashMap();
            }
            if (str.equals("Array")) {
                return "Array";
            }
            if (str.equals("?")) {
                return str;
            }
            try {
                return Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e11) {
                e11.printStackTrace();
                throw new C33818nd(e11);
            }
        }
        throw new IllegalArgumentException("can not support java.lang.Character");
    }

    /* JADX INFO: renamed from: a */
    public static String m72978a(String str, String str2) {
        if (str2.equals("int")) {
            return str2 + C33627eb.f69716f + str + "=0 ;\n";
        }
        if (str2.equals(TypedValues.Custom.S_BOOLEAN)) {
            return str2 + C33627eb.f69716f + str + "=false ;\n";
        }
        if (str2.equals("byte")) {
            return str2 + C33627eb.f69716f + str + " ;\n";
        }
        if (str2.equals("double")) {
            return str2 + C33627eb.f69716f + str + "=0 ;\n";
        }
        if (str2.equals(TypedValues.Custom.S_FLOAT)) {
            return str2 + C33627eb.f69716f + str + "=0 ;\n";
        }
        if (str2.equals("long")) {
            return str2 + C33627eb.f69716f + str + "=0 ;\n";
        }
        if (str2.equals("short")) {
            return str2 + C33627eb.f69716f + str + "=0 ;\n";
        }
        if (str2.equals("char")) {
            return str2 + C33627eb.f69716f + str + " ;\n";
        }
        return str2 + C33627eb.f69716f + str + " = null ;\n";
    }
}
