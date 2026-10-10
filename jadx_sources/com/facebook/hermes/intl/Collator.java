package com.facebook.hermes.intl;

import androidx.credentials.provider.CredentialEntry;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p359j5.C40272a;
import p359j5.C40275d;
import p359j5.InterfaceC40273b;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC44695a
public class Collator {

    /* JADX INFO: renamed from: a */
    public IPlatformCollator.Usage f8664a;

    /* JADX INFO: renamed from: b */
    public IPlatformCollator.Sensitivity f8665b;

    /* JADX INFO: renamed from: c */
    public boolean f8666c;

    /* JADX INFO: renamed from: e */
    public boolean f8668e;

    /* JADX INFO: renamed from: f */
    public IPlatformCollator.CaseFirst f8669f;

    /* JADX INFO: renamed from: g */
    public InterfaceC40273b<?> f8670g;

    /* JADX INFO: renamed from: h */
    public InterfaceC40273b<?> f8671h;

    /* JADX INFO: renamed from: d */
    public String f8667d = "default";

    /* JADX INFO: renamed from: i */
    public IPlatformCollator f8672i = new C5632c();

    @InterfaceC44695a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        return C40275d.m88677h(OptionHelpers.m9038c(map, "localeMatcher", OptionHelpers.OptionType.STRING, C40272a.f89506a, "best fit")).equals("best fit") ? Arrays.asList(C5630a.m9051d((String[]) list.toArray(new String[list.size()]))) : Arrays.asList(C5630a.m9055h((String[]) list.toArray(new String[list.size()])));
    }

    /* JADX INFO: renamed from: a */
    public final void m8969a(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        OptionHelpers.OptionType optionType = OptionHelpers.OptionType.STRING;
        this.f8664a = (IPlatformCollator.Usage) OptionHelpers.m9039d(IPlatformCollator.Usage.class, C40275d.m88677h(OptionHelpers.m9038c(map, "usage", optionType, C40272a.f89510e, "sort")));
        Object objM88686q = C40275d.m88686q();
        C40275d.m88672c(objM88686q, "localeMatcher", OptionHelpers.m9038c(map, "localeMatcher", optionType, C40272a.f89506a, "best fit"));
        Object objM9038c = OptionHelpers.m9038c(map, "numeric", OptionHelpers.OptionType.BOOLEAN, C40275d.m88673d(), C40275d.m88673d());
        if (!C40275d.m88683n(objM9038c)) {
            objM9038c = C40275d.m88687r(String.valueOf(C40275d.m88674e(objM9038c)));
        }
        C40275d.m88672c(objM88686q, "kn", objM9038c);
        C40275d.m88672c(objM88686q, "kf", OptionHelpers.m9038c(map, "caseFirst", optionType, C40272a.f89509d, C40275d.m88673d()));
        HashMap<String, Object> mapM9056a = C5631b.m9056a(list, objM88686q, Arrays.asList("co", "kf", "kn"));
        InterfaceC40273b<?> interfaceC40273b = (InterfaceC40273b) C40275d.m88676g(mapM9056a).get("locale");
        this.f8670g = interfaceC40273b;
        this.f8671h = interfaceC40273b.mo88663f();
        Object objM88670a = C40275d.m88670a(mapM9056a, "co");
        if (C40275d.m88679j(objM88670a)) {
            objM88670a = C40275d.m88687r("default");
        }
        this.f8667d = C40275d.m88677h(objM88670a);
        Object objM88670a2 = C40275d.m88670a(mapM9056a, "kn");
        if (C40275d.m88679j(objM88670a2)) {
            this.f8668e = false;
        } else {
            this.f8668e = Boolean.parseBoolean(C40275d.m88677h(objM88670a2));
        }
        Object objM88670a3 = C40275d.m88670a(mapM9056a, "kf");
        if (C40275d.m88679j(objM88670a3)) {
            objM88670a3 = C40275d.m88687r(CredentialEntry.FALSE_STRING);
        }
        this.f8669f = (IPlatformCollator.CaseFirst) OptionHelpers.m9039d(IPlatformCollator.CaseFirst.class, C40275d.m88677h(objM88670a3));
        if (this.f8664a == IPlatformCollator.Usage.SEARCH) {
            ArrayList<String> arrayListMo88662e = this.f8670g.mo88662e("collation");
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<String> it = arrayListMo88662e.iterator();
            while (it.hasNext()) {
                arrayList.add(UnicodeExtensionKeys.m9045e(it.next()));
            }
            arrayList.add(UnicodeExtensionKeys.m9045e(FirebaseAnalytics.Event.SEARCH));
            this.f8670g.mo88660c("co", arrayList);
        }
        Object objM9038c2 = OptionHelpers.m9038c(map, "sensitivity", OptionHelpers.OptionType.STRING, C40272a.f89508c, C40275d.m88673d());
        if (!C40275d.m88683n(objM9038c2)) {
            this.f8665b = (IPlatformCollator.Sensitivity) OptionHelpers.m9039d(IPlatformCollator.Sensitivity.class, C40275d.m88677h(objM9038c2));
        } else if (this.f8664a == IPlatformCollator.Usage.SORT) {
            this.f8665b = IPlatformCollator.Sensitivity.VARIANT;
        } else {
            this.f8665b = IPlatformCollator.Sensitivity.LOCALE;
        }
        this.f8666c = C40275d.m88674e(OptionHelpers.m9038c(map, "ignorePunctuation", OptionHelpers.OptionType.BOOLEAN, C40275d.m88673d(), Boolean.FALSE));
    }

    @InterfaceC44695a
    public double compare(String str, String str2) {
        return this.f8672i.mo8976a(str, str2);
    }

    @InterfaceC44695a
    public Map<String, Object> resolvedOptions() throws JSRangeErrorException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f8671h.mo88664g().replace("-kn-true", "-kn"));
        linkedHashMap.put("usage", this.f8664a.toString());
        IPlatformCollator.Sensitivity sensitivity = this.f8665b;
        if (sensitivity == IPlatformCollator.Sensitivity.LOCALE) {
            linkedHashMap.put("sensitivity", this.f8672i.mo8979d().toString());
        } else {
            linkedHashMap.put("sensitivity", sensitivity.toString());
        }
        linkedHashMap.put("ignorePunctuation", Boolean.valueOf(this.f8666c));
        linkedHashMap.put("collation", this.f8667d);
        linkedHashMap.put("numeric", Boolean.valueOf(this.f8668e));
        linkedHashMap.put("caseFirst", this.f8669f.toString());
        return linkedHashMap;
    }

    @InterfaceC44695a
    public Collator(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        m8969a(list, map);
        this.f8672i.mo8977b(this.f8670g).mo8982g(this.f8668e).mo8981f(this.f8669f).mo8978c(this.f8665b).mo8980e(this.f8666c);
    }
}
