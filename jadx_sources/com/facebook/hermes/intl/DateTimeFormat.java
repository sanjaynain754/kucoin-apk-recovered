package com.facebook.hermes.intl;

import androidx.core.text.util.LocalePreferences;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import p359j5.C40272a;
import p359j5.C40274c;
import p359j5.C40275d;
import p359j5.InterfaceC40273b;
import p633t6.InterfaceC44695a;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC44695a
public class DateTimeFormat {

    /* JADX INFO: renamed from: d */
    public boolean f8676d;

    /* JADX INFO: renamed from: e */
    public String f8677e;

    /* JADX INFO: renamed from: f */
    public boolean f8678f;

    /* JADX INFO: renamed from: g */
    public String f8679g;

    /* JADX INFO: renamed from: h */
    public Object f8680h;

    /* JADX INFO: renamed from: i */
    public IPlatformDateTimeFormatter.HourCycle f8681i;

    /* JADX INFO: renamed from: j */
    public IPlatformDateTimeFormatter.FormatMatcher f8682j;

    /* JADX INFO: renamed from: k */
    public IPlatformDateTimeFormatter.WeekDay f8683k;

    /* JADX INFO: renamed from: l */
    public IPlatformDateTimeFormatter.Era f8684l;

    /* JADX INFO: renamed from: m */
    public IPlatformDateTimeFormatter.Year f8685m;

    /* JADX INFO: renamed from: n */
    public IPlatformDateTimeFormatter.Month f8686n;

    /* JADX INFO: renamed from: o */
    public IPlatformDateTimeFormatter.Day f8687o;

    /* JADX INFO: renamed from: p */
    public IPlatformDateTimeFormatter.Hour f8688p;

    /* JADX INFO: renamed from: q */
    public IPlatformDateTimeFormatter.Minute f8689q;

    /* JADX INFO: renamed from: r */
    public IPlatformDateTimeFormatter.Second f8690r;

    /* JADX INFO: renamed from: s */
    public IPlatformDateTimeFormatter.TimeZoneName f8691s;

    /* JADX INFO: renamed from: t */
    public IPlatformDateTimeFormatter.DateStyle f8692t;

    /* JADX INFO: renamed from: u */
    public IPlatformDateTimeFormatter.TimeStyle f8693u;

    /* JADX INFO: renamed from: b */
    public InterfaceC40273b<?> f8674b = null;

    /* JADX INFO: renamed from: c */
    public InterfaceC40273b<?> f8675c = null;

    /* JADX INFO: renamed from: v */
    public Object f8694v = null;

    /* JADX INFO: renamed from: a */
    public IPlatformDateTimeFormatter f8673a = new C5633d();

    @InterfaceC44695a
    public DateTimeFormat(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        m8972c(list, map);
        this.f8673a.mo8992g(this.f8674b, this.f8676d ? "" : this.f8677e, this.f8678f ? "" : this.f8679g, this.f8682j, this.f8683k, this.f8684l, this.f8685m, this.f8686n, this.f8687o, this.f8688p, this.f8689q, this.f8690r, this.f8691s, this.f8681i, this.f8694v, this.f8692t, this.f8693u, this.f8680h);
    }

    @InterfaceC44695a
    public static List<String> supportedLocalesOf(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        String strM88677h = C40275d.m88677h(OptionHelpers.m9038c(map, "localeMatcher", OptionHelpers.OptionType.STRING, C40272a.f89506a, "best fit"));
        String[] strArr = new String[list.size()];
        return strM88677h.equals("best fit") ? Arrays.asList(C5630a.m9051d((String[]) list.toArray(strArr))) : Arrays.asList(C5630a.m9055h((String[]) list.toArray(strArr)));
    }

    /* JADX INFO: renamed from: a */
    public final Object m8970a() throws JSRangeErrorException {
        return this.f8673a.mo8993h(this.f8674b);
    }

    /* JADX INFO: renamed from: b */
    public final Object m8971b(Object obj, String str, String str2) throws JSRangeErrorException {
        if (!C40275d.m88681l(obj)) {
            throw new JSRangeErrorException("Invalid options object !");
        }
        boolean z11 = true;
        if (str.equals("date") || str.equals("any")) {
            String[] strArr = {"weekday", "year", "month", JPushConstants.NotificationTime.KEY_DAYS};
            for (int i11 = 0; i11 < 4; i11++) {
                if (!C40275d.m88683n(C40275d.m88670a(obj, strArr[i11]))) {
                    z11 = false;
                }
            }
        }
        if (str.equals("time") || str.equals("any")) {
            String[] strArr2 = {"hour", "minute", "second"};
            for (int i12 = 0; i12 < 3; i12++) {
                if (!C40275d.m88683n(C40275d.m88670a(obj, strArr2[i12]))) {
                    z11 = false;
                }
            }
        }
        if (!C40275d.m88683n(C40275d.m88670a(obj, "dateStyle")) || !C40275d.m88683n(C40275d.m88670a(obj, "timeStyle"))) {
            z11 = false;
        }
        if (z11 && (str2.equals("date") || str2.equals(TtmlNode.COMBINE_ALL))) {
            String[] strArr3 = {"year", "month", JPushConstants.NotificationTime.KEY_DAYS};
            for (int i13 = 0; i13 < 3; i13++) {
                C40275d.m88672c(obj, strArr3[i13], "numeric");
            }
        }
        if (z11 && (str2.equals("time") || str2.equals(TtmlNode.COMBINE_ALL))) {
            String[] strArr4 = {"hour", "minute", "second"};
            for (int i14 = 0; i14 < 3; i14++) {
                C40275d.m88672c(obj, strArr4[i14], "numeric");
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m8972c(List<String> list, Map<String, Object> map) throws JSRangeErrorException {
        List listAsList = Arrays.asList("ca", "nu", "hc");
        Object objM8971b = m8971b(map, "any", "date");
        Object objM88686q = C40275d.m88686q();
        OptionHelpers.OptionType optionType = OptionHelpers.OptionType.STRING;
        C40275d.m88672c(objM88686q, "localeMatcher", OptionHelpers.m9038c(objM8971b, "localeMatcher", optionType, C40272a.f89506a, "best fit"));
        Object objM9038c = OptionHelpers.m9038c(objM8971b, "calendar", optionType, C40275d.m88673d(), C40275d.m88673d());
        if (!C40275d.m88683n(objM9038c) && !m8973d(C40275d.m88677h(objM9038c))) {
            throw new JSRangeErrorException("Invalid calendar option !");
        }
        C40275d.m88672c(objM88686q, "ca", objM9038c);
        Object objM9038c2 = OptionHelpers.m9038c(objM8971b, "numberingSystem", optionType, C40275d.m88673d(), C40275d.m88673d());
        if (!C40275d.m88683n(objM9038c2) && !m8973d(C40275d.m88677h(objM9038c2))) {
            throw new JSRangeErrorException("Invalid numbering system !");
        }
        C40275d.m88672c(objM88686q, "nu", objM9038c2);
        Object objM9038c3 = OptionHelpers.m9038c(objM8971b, "hour12", OptionHelpers.OptionType.BOOLEAN, C40275d.m88673d(), C40275d.m88673d());
        Object objM9038c4 = OptionHelpers.m9038c(objM8971b, "hourCycle", optionType, new String[]{LocalePreferences.HourCycle.H11, LocalePreferences.HourCycle.H12, LocalePreferences.HourCycle.H23, LocalePreferences.HourCycle.H24}, C40275d.m88673d());
        if (!C40275d.m88683n(objM9038c3)) {
            objM9038c4 = C40275d.m88671b();
        }
        C40275d.m88672c(objM88686q, "hc", objM9038c4);
        HashMap<String, Object> mapM9056a = C5631b.m9056a(list, objM88686q, listAsList);
        InterfaceC40273b<?> interfaceC40273b = (InterfaceC40273b) C40275d.m88676g(mapM9056a).get("locale");
        this.f8674b = interfaceC40273b;
        this.f8675c = interfaceC40273b.mo88663f();
        Object objM88670a = C40275d.m88670a(mapM9056a, "ca");
        if (C40275d.m88679j(objM88670a)) {
            this.f8676d = true;
            this.f8677e = this.f8673a.mo8989d(this.f8674b);
        } else {
            this.f8676d = false;
            this.f8677e = C40275d.m88677h(objM88670a);
        }
        Object objM88670a2 = C40275d.m88670a(mapM9056a, "nu");
        if (C40275d.m88679j(objM88670a2)) {
            this.f8678f = true;
            this.f8679g = this.f8673a.mo8988c(this.f8674b);
        } else {
            this.f8678f = false;
            this.f8679g = C40275d.m88677h(objM88670a2);
        }
        Object objM88670a3 = C40275d.m88670a(mapM9056a, "hc");
        Object objM88670a4 = C40275d.m88670a(objM8971b, RemoteConfigConstants.RequestFieldKey.TIME_ZONE);
        this.f8694v = C40275d.m88683n(objM88670a4) ? m8970a() : m8974e(objM88670a4.toString());
        this.f8682j = (IPlatformDateTimeFormatter.FormatMatcher) OptionHelpers.m9039d(IPlatformDateTimeFormatter.FormatMatcher.class, C40275d.m88677h(OptionHelpers.m9038c(objM8971b, "formatMatcher", optionType, new String[]{"basic", "best fit"}, "best fit")));
        this.f8683k = (IPlatformDateTimeFormatter.WeekDay) OptionHelpers.m9039d(IPlatformDateTimeFormatter.WeekDay.class, OptionHelpers.m9038c(objM8971b, "weekday", optionType, new String[]{"long", "short", "narrow"}, C40275d.m88673d()));
        this.f8684l = (IPlatformDateTimeFormatter.Era) OptionHelpers.m9039d(IPlatformDateTimeFormatter.Era.class, OptionHelpers.m9038c(objM8971b, "era", optionType, new String[]{"long", "short", "narrow"}, C40275d.m88673d()));
        this.f8685m = (IPlatformDateTimeFormatter.Year) OptionHelpers.m9039d(IPlatformDateTimeFormatter.Year.class, OptionHelpers.m9038c(objM8971b, "year", optionType, new String[]{"numeric", "2-digit"}, C40275d.m88673d()));
        this.f8686n = (IPlatformDateTimeFormatter.Month) OptionHelpers.m9039d(IPlatformDateTimeFormatter.Month.class, OptionHelpers.m9038c(objM8971b, "month", optionType, new String[]{"numeric", "2-digit", "long", "short", "narrow"}, C40275d.m88673d()));
        this.f8687o = (IPlatformDateTimeFormatter.Day) OptionHelpers.m9039d(IPlatformDateTimeFormatter.Day.class, OptionHelpers.m9038c(objM8971b, JPushConstants.NotificationTime.KEY_DAYS, optionType, new String[]{"numeric", "2-digit"}, C40275d.m88673d()));
        Object objM9038c5 = OptionHelpers.m9038c(objM8971b, "hour", optionType, new String[]{"numeric", "2-digit"}, C40275d.m88673d());
        this.f8688p = (IPlatformDateTimeFormatter.Hour) OptionHelpers.m9039d(IPlatformDateTimeFormatter.Hour.class, objM9038c5);
        this.f8689q = (IPlatformDateTimeFormatter.Minute) OptionHelpers.m9039d(IPlatformDateTimeFormatter.Minute.class, OptionHelpers.m9038c(objM8971b, "minute", optionType, new String[]{"numeric", "2-digit"}, C40275d.m88673d()));
        this.f8690r = (IPlatformDateTimeFormatter.Second) OptionHelpers.m9039d(IPlatformDateTimeFormatter.Second.class, OptionHelpers.m9038c(objM8971b, "second", optionType, new String[]{"numeric", "2-digit"}, C40275d.m88673d()));
        this.f8691s = (IPlatformDateTimeFormatter.TimeZoneName) OptionHelpers.m9039d(IPlatformDateTimeFormatter.TimeZoneName.class, OptionHelpers.m9038c(objM8971b, "timeZoneName", optionType, new String[]{"long", "longOffset", "longGeneric", "short", "shortOffset", "shortGeneric"}, C40275d.m88673d()));
        this.f8692t = (IPlatformDateTimeFormatter.DateStyle) OptionHelpers.m9039d(IPlatformDateTimeFormatter.DateStyle.class, OptionHelpers.m9038c(objM8971b, "dateStyle", optionType, new String[]{"full", "long", "medium", "short"}, C40275d.m88673d()));
        Object objM9038c6 = OptionHelpers.m9038c(objM8971b, "timeStyle", optionType, new String[]{"full", "long", "medium", "short"}, C40275d.m88673d());
        this.f8693u = (IPlatformDateTimeFormatter.TimeStyle) OptionHelpers.m9039d(IPlatformDateTimeFormatter.TimeStyle.class, objM9038c6);
        if (C40275d.m88683n(objM9038c5) && C40275d.m88683n(objM9038c6)) {
            this.f8681i = IPlatformDateTimeFormatter.HourCycle.UNDEFINED;
        } else {
            IPlatformDateTimeFormatter.HourCycle hourCycleMo8991f = this.f8673a.mo8991f(this.f8674b);
            IPlatformDateTimeFormatter.HourCycle hourCycle = C40275d.m88679j(objM88670a3) ? hourCycleMo8991f : (IPlatformDateTimeFormatter.HourCycle) OptionHelpers.m9039d(IPlatformDateTimeFormatter.HourCycle.class, objM88670a3);
            if (!C40275d.m88683n(objM9038c3)) {
                if (C40275d.m88674e(objM9038c3)) {
                    hourCycle = IPlatformDateTimeFormatter.HourCycle.H11;
                    if (hourCycleMo8991f != hourCycle && hourCycleMo8991f != IPlatformDateTimeFormatter.HourCycle.H23) {
                        hourCycle = IPlatformDateTimeFormatter.HourCycle.H12;
                    }
                } else {
                    hourCycle = (hourCycleMo8991f == IPlatformDateTimeFormatter.HourCycle.H11 || hourCycleMo8991f == IPlatformDateTimeFormatter.HourCycle.H23) ? IPlatformDateTimeFormatter.HourCycle.H23 : IPlatformDateTimeFormatter.HourCycle.H24;
                }
            }
            this.f8681i = hourCycle;
        }
        this.f8680h = objM9038c3;
    }

    /* JADX INFO: renamed from: f */
    public String m8975f(String str) {
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 'A' || cCharAt > 'Z') {
                sb2.append(cCharAt);
            } else {
                sb2.append((char) (cCharAt + ' '));
            }
        }
        return sb2.toString();
    }

    @InterfaceC44695a
    public String format(double d11) throws JSRangeErrorException {
        return this.f8673a.mo8987b(d11);
    }

    @InterfaceC44695a
    public List<Map<String, String>> formatToParts(double d11) throws JSRangeErrorException {
        ArrayList arrayList = new ArrayList();
        AttributedCharacterIterator attributedCharacterIteratorMo8986a = this.f8673a.mo8986a(d11);
        StringBuilder sb2 = new StringBuilder();
        for (char cFirst = attributedCharacterIteratorMo8986a.first(); cFirst != 65535; cFirst = attributedCharacterIteratorMo8986a.next()) {
            sb2.append(cFirst);
            if (attributedCharacterIteratorMo8986a.getIndex() + 1 == attributedCharacterIteratorMo8986a.getRunLimit()) {
                Iterator<AttributedCharacterIterator.Attribute> it = attributedCharacterIteratorMo8986a.getAttributes().keySet().iterator();
                String strMo8990e = it.hasNext() ? this.f8673a.mo8990e(it.next(), sb2.toString()) : "literal";
                String string = sb2.toString();
                sb2.setLength(0);
                HashMap map = new HashMap();
                map.put("type", strMo8990e);
                map.put("value", string);
                arrayList.add(map);
            }
        }
        return arrayList;
    }

    @InterfaceC44695a
    public Map<String, Object> resolvedOptions() throws JSRangeErrorException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("locale", this.f8675c.mo88664g());
        linkedHashMap.put("numberingSystem", this.f8679g);
        linkedHashMap.put("calendar", this.f8677e);
        linkedHashMap.put(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, this.f8694v);
        IPlatformDateTimeFormatter.HourCycle hourCycle = this.f8681i;
        if (hourCycle != IPlatformDateTimeFormatter.HourCycle.UNDEFINED) {
            linkedHashMap.put("hourCycle", hourCycle.toString());
            IPlatformDateTimeFormatter.HourCycle hourCycle2 = this.f8681i;
            if (hourCycle2 == IPlatformDateTimeFormatter.HourCycle.H11 || hourCycle2 == IPlatformDateTimeFormatter.HourCycle.H12) {
                linkedHashMap.put("hour12", Boolean.TRUE);
            } else {
                linkedHashMap.put("hour12", Boolean.FALSE);
            }
        }
        IPlatformDateTimeFormatter.WeekDay weekDay = this.f8683k;
        if (weekDay != IPlatformDateTimeFormatter.WeekDay.UNDEFINED) {
            linkedHashMap.put("weekday", weekDay.toString());
        }
        IPlatformDateTimeFormatter.Era era = this.f8684l;
        if (era != IPlatformDateTimeFormatter.Era.UNDEFINED) {
            linkedHashMap.put("era", era.toString());
        }
        IPlatformDateTimeFormatter.Year year = this.f8685m;
        if (year != IPlatformDateTimeFormatter.Year.UNDEFINED) {
            linkedHashMap.put("year", year.toString());
        }
        IPlatformDateTimeFormatter.Month month = this.f8686n;
        if (month != IPlatformDateTimeFormatter.Month.UNDEFINED) {
            linkedHashMap.put("month", month.toString());
        }
        IPlatformDateTimeFormatter.Day day = this.f8687o;
        if (day != IPlatformDateTimeFormatter.Day.UNDEFINED) {
            linkedHashMap.put(JPushConstants.NotificationTime.KEY_DAYS, day.toString());
        }
        IPlatformDateTimeFormatter.Hour hour = this.f8688p;
        if (hour != IPlatformDateTimeFormatter.Hour.UNDEFINED) {
            linkedHashMap.put("hour", hour.toString());
        }
        IPlatformDateTimeFormatter.Minute minute = this.f8689q;
        if (minute != IPlatformDateTimeFormatter.Minute.UNDEFINED) {
            linkedHashMap.put("minute", minute.toString());
        }
        IPlatformDateTimeFormatter.Second second = this.f8690r;
        if (second != IPlatformDateTimeFormatter.Second.UNDEFINED) {
            linkedHashMap.put("second", second.toString());
        }
        IPlatformDateTimeFormatter.TimeZoneName timeZoneName = this.f8691s;
        if (timeZoneName != IPlatformDateTimeFormatter.TimeZoneName.UNDEFINED) {
            linkedHashMap.put("timeZoneName", timeZoneName.toString());
        }
        IPlatformDateTimeFormatter.DateStyle dateStyle = this.f8692t;
        if (dateStyle != IPlatformDateTimeFormatter.DateStyle.UNDEFINED) {
            linkedHashMap.put("dateStyle", dateStyle.toString());
        }
        IPlatformDateTimeFormatter.TimeStyle timeStyle = this.f8693u;
        if (timeStyle != IPlatformDateTimeFormatter.TimeStyle.UNDEFINED) {
            linkedHashMap.put("timeStyle", timeStyle.toString());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8973d(String str) {
        return C40274c.m88669e(str, 0, str.length() - 1);
    }

    /* JADX INFO: renamed from: e */
    public String m8974e(String str) throws JSRangeErrorException {
        for (String str2 : TimeZone.getAvailableIDs()) {
            if (m8975f(str2).equals(m8975f(str))) {
                return str2;
            }
        }
        throw new JSRangeErrorException("Invalid timezone name!");
    }
}
