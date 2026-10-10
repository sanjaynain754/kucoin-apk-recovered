package com.facebook.hermes.intl;

import androidx.credentials.provider.CredentialEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p359j5.C40275d;

/* JADX INFO: renamed from: com.facebook.hermes.intl.b */
/* JADX INFO: compiled from: LocaleResolver.java */
/* JADX INFO: loaded from: classes34.dex */
public class C5631b {
    /* JADX INFO: renamed from: a */
    public static HashMap<String, Object> m9056a(List<String> list, Object obj, List<String> list2) throws JSRangeErrorException {
        Object obj2;
        Object objM88684o;
        Object objM88687r;
        HashMap<String, Object> map = new HashMap<>();
        C5630a.a aVarM9053f = C40275d.m88677h(C40275d.m88670a(obj, "localeMatcher")).equals("lookup") ? C5630a.m9053f((String[]) list.toArray(new String[list.size()])) : C5630a.m9050c((String[]) list.toArray(new String[list.size()]));
        HashSet<String> hashSet = new HashSet();
        for (String str : list2) {
            Object objM88671b = C40275d.m88671b();
            if (!aVarM9053f.f8784b.isEmpty() && aVarM9053f.f8784b.containsKey(str)) {
                String str2 = aVarM9053f.f8784b.get(str);
                if (str2.isEmpty()) {
                    obj2 = objM88671b;
                    obj2 = objM88671b;
                    objM88687r = str2;
                    objM88687r = C40275d.m88687r(CredentialEntry.TRUE_STRING);
                }
                obj2 = objM88671b;
                obj2 = objM88671b;
                objM88687r = str2;
                hashSet.add(str);
                obj2 = objM88687r;
            }
            obj2 = objM88671b;
            obj2 = objM88671b;
            obj2 = objM88671b;
            Object obj3 = obj2;
            if (C40275d.m88676g(obj).containsKey(str)) {
                Object objM88670a = C40275d.m88670a(obj, str);
                if (C40275d.m88682m(objM88670a) && C40275d.m88677h(objM88670a).isEmpty()) {
                    objM88684o = objM88670a;
                    objM88684o = objM88670a;
                    objM88684o = C40275d.m88684o(true);
                }
                objM88684o = objM88670a;
                objM88684o = objM88670a;
                objM88684o = objM88670a;
                obj3 = obj2;
                if (!C40275d.m88683n(objM88684o) && !objM88684o.equals(obj2)) {
                    obj3 = obj2;
                    hashSet.remove(str);
                    obj3 = objM88684o;
                }
            }
            obj3 = obj2;
            boolean zM88679j = C40275d.m88679j(obj3);
            Object objM9046f = obj3;
            if (!zM88679j) {
                objM9046f = UnicodeExtensionKeys.m9046f(str, obj3);
            }
            if (!C40275d.m88682m(objM9046f) || UnicodeExtensionKeys.m9043c(str, C40275d.m88677h(objM9046f), aVarM9053f.f8783a)) {
                map.put(str, objM9046f);
            } else {
                map.put(str, C40275d.m88671b());
            }
        }
        for (String str3 : hashSet) {
            ArrayList<String> arrayList = new ArrayList<>();
            String strM88677h = C40275d.m88677h(UnicodeExtensionKeys.m9046f(str3, C40275d.m88687r(aVarM9053f.f8784b.get(str3))));
            if (!C40275d.m88682m(strM88677h) || UnicodeExtensionKeys.m9043c(str3, C40275d.m88677h(strM88677h), aVarM9053f.f8783a)) {
                arrayList.add(strM88677h);
                aVarM9053f.f8783a.mo88660c(str3, arrayList);
            }
        }
        map.put("locale", aVarM9053f.f8783a);
        return map;
    }
}
