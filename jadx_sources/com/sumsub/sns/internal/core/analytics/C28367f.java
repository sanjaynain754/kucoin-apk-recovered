package com.sumsub.sns.internal.core.analytics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28367f {

    /* JADX INFO: renamed from: a */
    public final Screen f57840a;

    /* JADX INFO: renamed from: b */
    public final String f57841b;

    /* JADX INFO: renamed from: c */
    public final Map f57842c;

    public C28367f(Screen screen, String str, Map map) {
        this.f57840a = screen;
        this.f57841b = str;
        this.f57842c = map;
    }

    /* JADX INFO: renamed from: a */
    public static void m69256a(C28367f c28367f, Control control, Map map, Popup popup, int i11) {
        if ((i11 & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i11 & 4) != 0) {
            popup = null;
        }
        m69253a(c28367f.f57840a, c28367f.f57841b, control, map, popup);
    }

    /* JADX INFO: renamed from: b */
    public static void m69261b(Screen screen, String str, Map map, Popup popup) {
        if (screen == Screen.Other) {
            return;
        }
        C28368g c28368gM69265a = new C28368g().m69265a(screen, str, popup);
        c28368gM69265a.f57846b.add(NavigationAction.Opened);
        c28368gM69265a.f57847c = MapsKt.toMap(MapsKt.plus(m69252a(screen, str), map));
        c28368gM69265a.m69267a(false);
    }

    public C28367f(Screen screen, String str) {
        Map mapEmptyMap = MapsKt.emptyMap();
        this.f57840a = screen;
        this.f57841b = str;
        this.f57842c = mapEmptyMap;
    }

    /* JADX INFO: renamed from: a */
    public static LinkedHashMap m69252a(Screen screen, String str) {
        Map mapEmptyMap;
        Map mapPlus = MapsKt.plus(C28366e.f57834c, MapsKt.mapOf(TuplesKt.m90091to(GlobalStatePayload.Screen, screen.getText())));
        if (!Intrinsics.areEqual(str, "TYPE_UNKNOWN")) {
            mapEmptyMap = MapsKt.mapOf(TuplesKt.m90091to(GlobalStatePayload.IdDocSetType, str));
        } else {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Set<Map.Entry> setEntrySet = MapsKt.plus(mapPlus, mapEmptyMap).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Pair pairM90091to = TuplesKt.m90091to(((GlobalStatePayload) entry.getKey()).getText(), entry.getValue());
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public static void m69260a(C28367f c28367f, Map map) {
        Screen screen = c28367f.f57840a;
        String str = c28367f.f57841b;
        if (screen == Screen.Other) {
            return;
        }
        C28368g c28368gM69265a = new C28368g().m69265a(screen, str, null);
        c28368gM69265a.f57846b.add(ControlAction.PermissionsChanged);
        c28368gM69265a.f57847c = MapsKt.toMap(MapsKt.plus(m69252a(screen, str), map));
        c28368gM69265a.m69267a(false);
    }

    /* JADX INFO: renamed from: a */
    public static void m69255a(C28367f c28367f, Block block, Map map) {
        Screen screen = c28367f.f57840a;
        String str = c28367f.f57841b;
        if (screen == Screen.Other) {
            return;
        }
        C28368g c28368gM69265a = new C28368g().m69265a(screen, str, null);
        c28368gM69265a.f57846b.add(block);
        c28368gM69265a.f57846b.add(ControlAction.Seen);
        c28368gM69265a.f57847c = MapsKt.toMap(MapsKt.plus(m69252a(screen, str), map));
        c28368gM69265a.m69267a(false);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m69257a(C28367f c28367f, Screen screen, String str, Control control, Map map, int i11) {
        if ((i11 & 8) != 0) {
            map = MapsKt.emptyMap();
        }
        c28367f.getClass();
        m69253a(screen, str, control, map, (Popup) null);
    }

    /* JADX INFO: renamed from: a */
    public static void m69253a(Screen screen, String str, Control control, Map map, Popup popup) {
        if (screen == Screen.Other) {
            return;
        }
        C28368g c28368gM69265a = new C28368g().m69265a(screen, str, popup);
        c28368gM69265a.f57846b.add(control);
        c28368gM69265a.f57846b.add(ControlAction.Clicked);
        c28368gM69265a.f57847c = MapsKt.toMap(MapsKt.plus(m69252a(screen, str), map));
        c28368gM69265a.m69267a(false);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m69259a(C28367f c28367f, Screen screen, String str, Map map, int i11) {
        if ((i11 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        c28367f.getClass();
        m69261b(screen, str, map, null);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m69258a(C28367f c28367f, Screen screen, String str, LinkedHashMap linkedHashMap, int i11) {
        Map mapEmptyMap = linkedHashMap;
        if ((i11 & 4) != 0) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        c28367f.getClass();
        m69254a(screen, str, mapEmptyMap, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m69254a(Screen screen, String str, Map map, Popup popup) {
        if (screen == Screen.Other) {
            return;
        }
        C28368g c28368gM69265a = new C28368g().m69265a(screen, str, popup);
        c28368gM69265a.f57846b.add(NavigationAction.Closed);
        c28368gM69265a.f57847c = MapsKt.toMap(MapsKt.plus(m69252a(screen, str), map));
        c28368gM69265a.m69267a(false);
    }
}
