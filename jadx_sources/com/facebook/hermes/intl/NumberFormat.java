package com.facebook.hermes.intl;

import androidx.core.text.util.LocalePreferences;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p359j5.C40272a;
import p359j5.C40274c;
import p359j5.C40275d;
import p359j5.InterfaceC40273b;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC44695a
public class NumberFormat {

    /* JADX INFO: renamed from: v */
    public static String[] f8742v = {"acre", "bit", "byte", LocalePreferences.TemperatureUnit.CELSIUS, "centimeter", JPushConstants.NotificationTime.KEY_DAYS, "degree", "fahrenheit", "fluid-ounce", "foot", "gallon", "gigabit", "gigabyte", "gram", "hectare", "hour", "inch", "kilobit", "kilobyte", "kilogram", "kilometer", "liter", "megabit", "megabyte", "meter", "mile", "mile-scandinavian", "milliliter", "millimeter", "millisecond", "minute", "month", "ounce", "percent", "petabyte", "pound", "second", "stone", "terabit", "terabyte", "week", "yard", "year"};

    /* JADX INFO: renamed from: a */
    public IPlatformNumberFormatter.Style f8743a;

    /* JADX INFO: renamed from: f */
    public IPlatformNumberFormatter.UnitDisplay f8748f;

    /* JADX INFO: renamed from: m */
    public IPlatformNumberFormatter.RoundingType f8755m;

    /* JADX INFO: renamed from: p */
    public boolean f8758p;

    /* JADX INFO: renamed from: s */
    public IPlatformNumberFormatter.CompactDisplay f8761s;

    /* JADX INFO: renamed from: b */
    public String f8744b = null;

    /* JADX INFO: renamed from: c */
    public IPlatformNumberFormatter.CurrencyDisplay f8745c = IPlatformNumberFormatter.CurrencyDisplay.SYMBOL;

    /* JADX INFO: renamed from: d */
    public IPlatformNumberFormatter.CurrencySign f8746d = IPlatformNumberFormatter.CurrencySign.STANDARD;

    /* JADX INFO: renamed from: e */
    public String f8747e = null;

    /* JADX INFO: renamed from: g */
    public boolean f8749g = true;

    /* JADX INFO: renamed from: h */
    public int f8750h = -1;

    /* JADX INFO: renamed from: i */
    public int f8751i = -1;

    /* JADX INFO: renamed from: j */
    public int f8752j = -1;

    /* JADX INFO: renamed from: k */
    public int f8753k = -1;

    /* JADX INFO: renamed from: l */
    public int f8754l = -1;

    /* JADX INFO: renamed from: n */
    public IPlatformNumberFormatter.SignDisplay f8756n = IPlatformNumberFormatter.SignDisplay.AUTO;

    /* JADX INFO: renamed from: q */
    public String f8759q = null;

    /* JADX INFO: renamed from: r */
    public IPlatformNumberFormatter.Notation f8760r = null;

    /* JADX INFO: renamed from: t */
    public InterfaceC40273b<?> f8762t = null;

    /* JADX INFO: renamed from: u */
    public InterfaceC40273b<?> f8763u = null;

    /* JADX INFO: renamed from: o */
    public IPlatformNumberFormatter f8757o = new C5634e();

    @InterfaceC44695a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        String strM88677h = C40275d.m88677h(OptionHelpers.m9038c(map, "localeMatcher", OptionHelpers.OptionType.STRING, C40272a.f89506a, "best fit"));
        String[] strArr = new String[list.size()];
        return strM88677h.equals("best fit") ? Arrays.asList(C5630a.m9051d((String[]) list.toArray(strArr))) : Arrays.asList(C5630a.m9055h((String[]) list.toArray(strArr)));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9030c(String str) {
        return Arrays.binarySearch(f8742v, str) >= 0;
    }

    /* JADX INFO: renamed from: f */
    public final String m9033f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 'a' || cCharAt > 'z') {
                sb2.append(cCharAt);
            } else {
                sb2.append((char) (cCharAt - ' '));
            }
        }
        return sb2.toString();
    }

    @InterfaceC44695a
    public String format(double d11) throws JSRangeErrorException {
        return this.f8757o.mo9008b(d11);
    }

    @InterfaceC44695a
    public List<Map<String, String>> formatToParts(double d11) throws JSRangeErrorException {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorMo9007a = this.f8757o.mo9007a(d11);
        StringBuilder sb2 = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorMo9007a.first(); cFirst != 65535; cFirst = attributedCharacterIteratorMo9007a.next()) {
            sb2.append(cFirst);
            if (attributedCharacterIteratorMo9007a.getIndex() + 1 == attributedCharacterIteratorMo9007a.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorMo9007a.getAttributes().keySet().iterator();
                String strMo9018l = it.hasNext() ? this.f8757o.mo9018l(it.next(), d11) : "literal";
                String string = sb2.toString();
                sb2.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strMo9018l);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final void m9034g(Map<String, Object> map, Object obj, Object obj2) throws JSRangeErrorException {
        Object objM9037b = OptionHelpers.m9037b(map, "minimumIntegerDigits", C40275d.m88685p(1.0d), C40275d.m88685p(21.0d), C40275d.m88685p(1.0d));
        Object objM88670a = C40275d.m88670a(map, "minimumFractionDigits");
        Object objM88670a2 = C40275d.m88670a(map, "maximumFractionDigits");
        Object objM88670a3 = C40275d.m88670a(map, "minimumSignificantDigits");
        Object objM88670a4 = C40275d.m88670a(map, "maximumSignificantDigits");
        this.f8750h = (int) Math.floor(C40275d.m88675f(objM9037b));
        if (!C40275d.m88683n(objM88670a3) || !C40275d.m88683n(objM88670a4)) {
            this.f8755m = IPlatformNumberFormatter.RoundingType.SIGNIFICANT_DIGITS;
            Object objM9036a = OptionHelpers.m9036a("minimumSignificantDigits", objM88670a3, C40275d.m88685p(1.0d), C40275d.m88685p(21.0d), C40275d.m88685p(1.0d));
            Object objM9036a2 = OptionHelpers.m9036a("maximumSignificantDigits", objM88670a4, objM9036a, C40275d.m88685p(21.0d), C40275d.m88685p(21.0d));
            this.f8753k = (int) Math.floor(C40275d.m88675f(objM9036a));
            this.f8754l = (int) Math.floor(C40275d.m88675f(objM9036a2));
            return;
        }
        if (C40275d.m88683n(objM88670a) && C40275d.m88683n(objM88670a2)) {
            IPlatformNumberFormatter.Notation notation = this.f8760r;
            if (notation == IPlatformNumberFormatter.Notation.COMPACT) {
                this.f8755m = IPlatformNumberFormatter.RoundingType.COMPACT_ROUNDING;
                return;
            }
            if (notation == IPlatformNumberFormatter.Notation.ENGINEERING) {
                this.f8755m = IPlatformNumberFormatter.RoundingType.FRACTION_DIGITS;
                this.f8752j = 5;
                return;
            } else {
                this.f8755m = IPlatformNumberFormatter.RoundingType.FRACTION_DIGITS;
                this.f8751i = (int) Math.floor(C40275d.m88675f(obj));
                this.f8752j = (int) Math.floor(C40275d.m88675f(obj2));
                return;
            }
        }
        this.f8755m = IPlatformNumberFormatter.RoundingType.FRACTION_DIGITS;
        Object objM9036a3 = OptionHelpers.m9036a("minimumFractionDigits", objM88670a, C40275d.m88685p(0.0d), C40275d.m88685p(20.0d), C40275d.m88673d());
        Object objM9036a4 = OptionHelpers.m9036a("maximumFractionDigits", objM88670a2, C40275d.m88685p(0.0d), C40275d.m88685p(20.0d), C40275d.m88673d());
        if (C40275d.m88683n(objM9036a3)) {
            objM9036a3 = C40275d.m88685p(Math.min(C40275d.m88675f(obj), C40275d.m88675f(objM9036a4)));
        } else if (C40275d.m88683n(objM9036a4)) {
            objM9036a4 = C40275d.m88685p(Math.max(C40275d.m88675f(obj2), C40275d.m88675f(objM9036a3)));
        } else if (C40275d.m88675f(objM9036a3) > C40275d.m88675f(objM9036a4)) {
            throw new JSRangeErrorException("minimumFractionDigits is greater than maximumFractionDigits");
        }
        this.f8751i = (int) Math.floor(C40275d.m88675f(objM9036a3));
        this.f8752j = (int) Math.floor(C40275d.m88675f(objM9036a4));
    }

    /* JADX INFO: renamed from: h */
    public final void m9035h(Map<String, Object> map) throws JSRangeErrorException {
        OptionHelpers.OptionType optionType = OptionHelpers.OptionType.STRING;
        this.f8743a = (IPlatformNumberFormatter.Style) OptionHelpers.m9039d(IPlatformNumberFormatter.Style.class, C40275d.m88677h(OptionHelpers.m9038c(map, TtmlNode.TAG_STYLE, optionType, new String[]{"decimal", "percent", FirebaseAnalytics.Param.CURRENCY, "unit"}, "decimal")));
        Object objM9038c = OptionHelpers.m9038c(map, FirebaseAnalytics.Param.CURRENCY, optionType, C40275d.m88673d(), C40275d.m88673d());
        if (C40275d.m88683n(objM9038c)) {
            if (this.f8743a == IPlatformNumberFormatter.Style.CURRENCY) {
                throw new JSRangeErrorException("Expected currency style !");
            }
        } else if (!m9031d(C40275d.m88677h(objM9038c))) {
            throw new JSRangeErrorException("Malformed currency code !");
        }
        Object objM9038c2 = OptionHelpers.m9038c(map, "currencyDisplay", optionType, new String[]{"symbol", "narrowSymbol", "code", "name"}, "symbol");
        Object objM9038c3 = OptionHelpers.m9038c(map, "currencySign", optionType, new String[]{"accounting", "standard"}, "standard");
        Object objM9038c4 = OptionHelpers.m9038c(map, "unit", optionType, C40275d.m88673d(), C40275d.m88673d());
        if (C40275d.m88683n(objM9038c4)) {
            if (this.f8743a == IPlatformNumberFormatter.Style.UNIT) {
                throw new JSRangeErrorException("Expected unit !");
            }
        } else if (!m9032e(C40275d.m88677h(objM9038c4))) {
            throw new JSRangeErrorException("Malformed unit identifier !");
        }
        Object objM9038c5 = OptionHelpers.m9038c(map, "unitDisplay", optionType, new String[]{"long", "short", "narrow"}, "short");
        IPlatformNumberFormatter.Style style = this.f8743a;
        if (style == IPlatformNumberFormatter.Style.CURRENCY) {
            this.f8744b = m9033f(C40275d.m88677h(objM9038c));
            this.f8745c = (IPlatformNumberFormatter.CurrencyDisplay) OptionHelpers.m9039d(IPlatformNumberFormatter.CurrencyDisplay.class, C40275d.m88677h(objM9038c2));
            this.f8746d = (IPlatformNumberFormatter.CurrencySign) OptionHelpers.m9039d(IPlatformNumberFormatter.CurrencySign.class, C40275d.m88677h(objM9038c3));
        } else if (style == IPlatformNumberFormatter.Style.UNIT) {
            this.f8747e = C40275d.m88677h(objM9038c4);
            this.f8748f = (IPlatformNumberFormatter.UnitDisplay) OptionHelpers.m9039d(IPlatformNumberFormatter.UnitDisplay.class, C40275d.m88677h(objM9038c5));
        }
    }

    @InterfaceC44695a
    public Map<String, Object> resolvedOptions() throws JSRangeErrorException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f8763u.mo88664g());
        linkedHashMap.put("numberingSystem", this.f8759q);
        linkedHashMap.put(TtmlNode.TAG_STYLE, this.f8743a.toString());
        IPlatformNumberFormatter.Style style = this.f8743a;
        if (style == IPlatformNumberFormatter.Style.CURRENCY) {
            linkedHashMap.put(FirebaseAnalytics.Param.CURRENCY, this.f8744b);
            linkedHashMap.put("currencyDisplay", this.f8745c.toString());
            linkedHashMap.put("currencySign", this.f8746d.toString());
        } else if (style == IPlatformNumberFormatter.Style.UNIT) {
            linkedHashMap.put("unit", this.f8747e);
            linkedHashMap.put("unitDisplay", this.f8748f.toString());
        }
        int i11 = this.f8750h;
        if (i11 != -1) {
            linkedHashMap.put("minimumIntegerDigits", Integer.valueOf(i11));
        }
        IPlatformNumberFormatter.RoundingType roundingType = this.f8755m;
        if (roundingType == IPlatformNumberFormatter.RoundingType.SIGNIFICANT_DIGITS) {
            int i12 = this.f8754l;
            if (i12 != -1) {
                linkedHashMap.put("maximumSignificantDigits", Integer.valueOf(i12));
            }
            int i13 = this.f8753k;
            if (i13 != -1) {
                linkedHashMap.put("minimumSignificantDigits", Integer.valueOf(i13));
            }
        } else if (roundingType == IPlatformNumberFormatter.RoundingType.FRACTION_DIGITS) {
            int i14 = this.f8751i;
            if (i14 != -1) {
                linkedHashMap.put("minimumFractionDigits", Integer.valueOf(i14));
            }
            int i15 = this.f8752j;
            if (i15 != -1) {
                linkedHashMap.put("maximumFractionDigits", Integer.valueOf(i15));
            }
        }
        linkedHashMap.put("useGrouping", Boolean.valueOf(this.f8749g));
        linkedHashMap.put("notation", this.f8760r.toString());
        if (this.f8760r == IPlatformNumberFormatter.Notation.COMPACT) {
            linkedHashMap.put("compactDisplay", this.f8761s.toString());
        }
        linkedHashMap.put("signDisplay", this.f8756n.toString());
        return linkedHashMap;
    }

    @InterfaceC44695a
    public NumberFormat(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        String str;
        m9028a(list, map);
        IPlatformNumberFormatter iPlatformNumberFormatter = this.f8757o;
        InterfaceC40273b<?> interfaceC40273b = this.f8762t;
        if (this.f8758p) {
            str = "";
        } else {
            str = this.f8759q;
        }
        iPlatformNumberFormatter.mo9010d(interfaceC40273b, str, this.f8743a, this.f8746d, this.f8760r, this.f8761s).mo9011e(this.f8744b, this.f8745c).mo9013g(this.f8749g).mo9012f(this.f8750h).mo9016j(this.f8755m, this.f8753k, this.f8754l).mo9014h(this.f8755m, this.f8751i, this.f8752j).mo9015i(this.f8756n).mo9017k(this.f8747e, this.f8748f);
    }

    /* JADX INFO: renamed from: a */
    public final void m9028a(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        Object objM88685p;
        Object objM88685p2;
        Object objM88686q = C40275d.m88686q();
        OptionHelpers.OptionType optionType = OptionHelpers.OptionType.STRING;
        C40275d.m88672c(objM88686q, "localeMatcher", OptionHelpers.m9038c(map, "localeMatcher", optionType, C40272a.f89506a, "best fit"));
        Object objM9038c = OptionHelpers.m9038c(map, "numberingSystem", optionType, C40275d.m88673d(), C40275d.m88673d());
        if (!C40275d.m88683n(objM9038c) && !m9029b(C40275d.m88677h(objM9038c))) {
            throw new JSRangeErrorException("Invalid numbering system !");
        }
        C40275d.m88672c(objM88686q, "nu", objM9038c);
        HashMap<String, Object> mapM9056a = C5631b.m9056a(list, objM88686q, Collections.singletonList("nu"));
        InterfaceC40273b<?> interfaceC40273b = (InterfaceC40273b) C40275d.m88676g(mapM9056a).get("locale");
        this.f8762t = interfaceC40273b;
        this.f8763u = interfaceC40273b.mo88663f();
        Object objM88670a = C40275d.m88670a(mapM9056a, "nu");
        if (!C40275d.m88679j(objM88670a)) {
            this.f8758p = false;
            this.f8759q = C40275d.m88677h(objM88670a);
        } else {
            this.f8758p = true;
            this.f8759q = this.f8757o.mo9009c(this.f8762t);
        }
        m9035h(map);
        if (this.f8743a == IPlatformNumberFormatter.Style.CURRENCY) {
            double dM9063n = C5634e.m9063n(this.f8744b);
            objM88685p = C40275d.m88685p(dM9063n);
            objM88685p2 = C40275d.m88685p(dM9063n);
        } else {
            objM88685p = C40275d.m88685p(0.0d);
            if (this.f8743a == IPlatformNumberFormatter.Style.PERCENT) {
                objM88685p2 = C40275d.m88685p(0.0d);
            } else {
                objM88685p2 = C40275d.m88685p(3.0d);
            }
        }
        this.f8760r = (IPlatformNumberFormatter.Notation) OptionHelpers.m9039d(IPlatformNumberFormatter.Notation.class, C40275d.m88677h(OptionHelpers.m9038c(map, "notation", optionType, new String[]{"standard", "scientific", "engineering", "compact"}, "standard")));
        m9034g(map, objM88685p, objM88685p2);
        Object objM9038c2 = OptionHelpers.m9038c(map, "compactDisplay", optionType, new String[]{"short", "long"}, "short");
        if (this.f8760r == IPlatformNumberFormatter.Notation.COMPACT) {
            this.f8761s = (IPlatformNumberFormatter.CompactDisplay) OptionHelpers.m9039d(IPlatformNumberFormatter.CompactDisplay.class, C40275d.m88677h(objM9038c2));
        }
        this.f8749g = C40275d.m88674e(OptionHelpers.m9038c(map, "useGrouping", OptionHelpers.OptionType.BOOLEAN, C40275d.m88673d(), C40275d.m88684o(true)));
        this.f8756n = (IPlatformNumberFormatter.SignDisplay) OptionHelpers.m9039d(IPlatformNumberFormatter.SignDisplay.class, C40275d.m88677h(OptionHelpers.m9038c(map, "signDisplay", optionType, new String[]{"auto", ReactScrollViewHelper.OVER_SCROLL_NEVER, ReactScrollViewHelper.OVER_SCROLL_ALWAYS, "exceptZero"}, "auto")));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9029b(String str) {
        return C40274c.m88669e(str, 0, str.length() - 1);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9031d(String str) {
        return m9033f(str).matches("^[A-Z][A-Z][A-Z]$");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9032e(String str) {
        if (m9030c(str)) {
            return true;
        }
        int iIndexOf = str.indexOf("-per-");
        if (iIndexOf >= 0 && str.indexOf("-per-", iIndexOf + 1) < 0 && m9030c(str.substring(0, iIndexOf)) && m9030c(str.substring(iIndexOf + 5))) {
            return true;
        }
        return false;
    }
}
