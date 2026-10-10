package com.kubi.quotefacade.widgets.calendar;

import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventDataWrapper;
import com.kubi.quotefacade.widgets.calendar.entity.HomeCalendarEventEntity;
import com.kubi.utils.extensions.C27023a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.quotefacade.widgets.calendar.n */
/* JADX INFO: compiled from: HomeCalendarReport.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0000\u001a\b\u0010\u0015\u001a\u00020\u0013H\u0002\u001a\u0018\u0010\u0016\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0000\u001a\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0007H\u0000\u001a4\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0000\u001a4\u0010#\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0000\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0000\u0010\u0002\"\u0004\b\u0003\u0010\u0004\" \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\" \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\"\u0014\u0010\u000e\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"isCalendarFullVisible", "", "()Z", "setCalendarFullVisible", "(Z)V", "needReportMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/kubi/quotefacade/widgets/calendar/ReportEvent;", "getNeedReportMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "exposeIdMap", "", "getExposeIdMap", "exposeIdValue", "getExposeIdValue", "()Ljava/lang/Object;", "TAG", "onCalendarVisibleChange", "", "isVisible", "doExpose", "removeBeforeExposeList", "oldList", "", "Lcom/kubi/quotefacade/widgets/calendar/entity/HomeCalendarEventDataWrapper;", "TYPE_CALENDAR_LARGE_CARD", "TYPE_CALENDAR_SMALL_CARD", "exposeCalendarWidget", "isLargeCard", "id", "exposeEventItem", "title", "eventId", "categoryCode", "reportClickEvent", "QuoteFacadeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeCalendarReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeCalendarReport.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarReportKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n216#2,2:134\n1869#3,2:136\n*S KotlinDebug\n*F\n+ 1 HomeCalendarReport.kt\ncom/kubi/quotefacade/widgets/calendar/HomeCalendarReportKt\n*L\n37#1:134,2\n51#1:136,2\n*E\n"})
public final class C22622n {

    /* JADX INFO: renamed from: a */
    public static boolean f42804a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ConcurrentHashMap<String, ReportEvent> f42805b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final ConcurrentHashMap<String, Object> f42806c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Object f42807d = new Object();

    /* JADX INFO: renamed from: a */
    public static final void m53430a() {
        C44128b.m97259c("HomeCalendarReport", "[doExpose] isVisible:" + f42804a);
        if (f42804a) {
            ConcurrentHashMap<String, ReportEvent> concurrentHashMap = f42805b;
            synchronized (concurrentHashMap) {
                try {
                    for (Map.Entry<String, ReportEvent> entry : concurrentHashMap.entrySet()) {
                        ConcurrentHashMap<String, Object> concurrentHashMap2 = f42806c;
                        if (!concurrentHashMap2.containsKey(entry.getKey())) {
                            ReportEvent value = entry.getValue();
                            C27023a.m66556c(value.getPageId(), value.getBlockId(), value.getLocationId(), value.getParams());
                            concurrentHashMap2.put(entry.getKey(), f42807d);
                            C44128b.m97259c("HomeCalendarReport", "[doExpose] expose id:" + entry.getKey());
                        }
                    }
                    f42805b.clear();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m53431b(boolean z11, @NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        String str = z11 ? "largeModule" : "smallModule";
        ConcurrentHashMap<String, ReportEvent> concurrentHashMap = f42805b;
        synchronized (concurrentHashMap) {
            if (f42806c.containsKey(id2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", str);
            jSONObject.put("norm_version", "1");
            Unit unit = Unit.INSTANCE;
            concurrentHashMap.put(id2, new ReportEvent(null, "calendarCmp", null, jSONObject, 5, null));
            m53430a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m53432c(boolean z11, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (str2 == null) {
            return;
        }
        String str4 = z11 ? "largeModule" : "smallModule";
        ConcurrentHashMap<String, ReportEvent> concurrentHashMap = f42805b;
        synchronized (concurrentHashMap) {
            try {
                if (f42806c.containsKey(str2)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", str4);
                if (str != null) {
                    jSONObject.put("after_click_element_value", str);
                }
                jSONObject.put("calendarEventID", str2);
                if (str3 != null) {
                    jSONObject.put("calendarEventType", str3);
                }
                jSONObject.put("norm_version", "1");
                Unit unit = Unit.INSTANCE;
                concurrentHashMap.put(str2, new ReportEvent(null, "calendarCmpEvents", null, jSONObject, 5, null));
                m53430a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m53433d(boolean z11) {
        C44128b.m97259c("HomeCalendarReport", "[onCalendarVisibleChange] isVisible:" + z11);
        f42804a = z11;
        if (z11) {
            m53430a();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m53434e(@Nullable List<HomeCalendarEventDataWrapper> list) {
        String eventId;
        synchronized (f42805b) {
            if (list != null) {
                try {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        HomeCalendarEventEntity homeCalendarEventEntityM53394a = ((HomeCalendarEventDataWrapper) it.next()).getF42795c();
                        if (homeCalendarEventEntityM53394a != null && (eventId = homeCalendarEventEntityM53394a.getEventId()) != null) {
                            f42805b.remove(eventId);
                            C44128b.m97259c("HomeCalendarReport", "[removeBeforeExposeList] id:" + eventId);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m53435f(boolean z11, @Nullable String str, @Nullable String str2, @Nullable String str3) throws JSONException {
        String str4 = z11 ? "largeModule" : "smallModule";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", str4);
        if (str != null) {
            jSONObject.put("after_click_element_value", str);
        }
        if (str2 != null) {
            jSONObject.put("calendarEventID", str2);
        }
        if (str3 != null) {
            jSONObject.put("calendarEventType", str3);
        }
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "calendarCmp", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m53436g(boolean z11, String str, String str2, String str3, int i11, Object obj) throws JSONException {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        m53435f(z11, str, str2, str3);
    }
}
