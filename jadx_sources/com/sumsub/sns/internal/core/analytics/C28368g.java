package com.sumsub.sns.internal.core.analytics;

import com.sumsub.sns.core.data.model.SNSTrackEvents;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.C33272c;
import com.tencent.bugly.proguard.C33844oi;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlinx.coroutines.C41696j;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.analytics.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28368g {

    /* JADX INFO: renamed from: d */
    public static final Function0 f57843d = new Function0() { // from class: com.sumsub.sns.internal.core.analytics.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C28368g.m69262b();
        }
    };

    /* JADX INFO: renamed from: e */
    public static final SimpleDateFormat f57844e;

    /* JADX INFO: renamed from: a */
    public final Function0 f57845a = f57843d;

    /* JADX INFO: renamed from: b */
    public final ArrayList f57846b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public Map f57847c;

    /* JADX INFO: renamed from: a */
    public final C28368g m69265a(Screen screen, String str, Popup popup) {
        this.f57846b.add(Domain.Ui);
        this.f57846b.add(screen);
        if (popup != null) {
            this.f57846b.add(popup);
        }
        this.f57846b.add(new C28371j(str));
        return this;
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        f57844e = simpleDateFormat;
    }

    /* JADX INFO: renamed from: b */
    public static final String m69262b() {
        return f57844e.format(new Date());
    }

    /* JADX INFO: renamed from: a */
    public final C28368g m69264a(PrimaryAction primaryAction) {
        this.f57846b.add(Domain.PrimaryAction);
        this.f57846b.add(primaryAction);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final C28368g m69266a(StepAction stepAction, String str) {
        this.f57846b.add(Domain.Step);
        this.f57846b.add(stepAction);
        this.f57846b.add(new C28371j(str));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public final void m69267a(boolean z11) {
        try {
            SNSTrackEvents sNSTrackEventsM69263a = m69263a();
            if (C28366e.f57839h || sNSTrackEventsM69263a.getAlwaysSend()) {
                C41696j.m91104d(C28366e.f57835d, C28366e.f57836e, null, new C28365d(sNSTrackEventsM69263a, z11, null), 2, null);
            }
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a("Analytics", "Failed to build event body", e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public final SNSTrackEvents m69263a() {
        String str;
        String strM69271a;
        String text;
        ArrayList arrayList = this.f57846b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            linkedHashMap.put(Reflection.getOrCreateKotlinClass(((InterfaceC28380s) obj).getClass()), obj);
        }
        Object obj2 = linkedHashMap.get(Reflection.getOrCreateKotlinClass(Domain.class));
        if (!(obj2 instanceof Domain)) {
            obj2 = null;
        }
        Domain domain = (Domain) obj2;
        Object obj3 = linkedHashMap.get(Reflection.getOrCreateKotlinClass(Screen.class));
        if (!(obj3 instanceof Screen)) {
            obj3 = null;
        }
        Screen screen = (Screen) obj3;
        Object obj4 = linkedHashMap.get(Reflection.getOrCreateKotlinClass(Popup.class));
        if (!(obj4 instanceof Popup)) {
            obj4 = null;
        }
        Popup popup = (Popup) obj4;
        Object obj5 = linkedHashMap.get(Reflection.getOrCreateKotlinClass(Control.class));
        if (!(obj5 instanceof Control)) {
            obj5 = null;
        }
        Control control = (Control) obj5;
        Object obj6 = linkedHashMap.get(Reflection.getOrCreateKotlinClass(Block.class));
        if (!(obj6 instanceof Block)) {
            obj6 = null;
        }
        Block block = (Block) obj6;
        Object obj7 = linkedHashMap.get(Reflection.getOrCreateKotlinClass(C28371j.class));
        if (!(obj7 instanceof C28371j)) {
            obj7 = null;
        }
        C28371j c28371j = (C28371j) obj7;
        Object obj8 = linkedHashMap.get(Reflection.getOrCreateKotlinClass(NavigationAction.class));
        if (!(obj8 instanceof NavigationAction)) {
            obj8 = null;
        }
        NavigationAction navigationAction = (NavigationAction) obj8;
        Object obj9 = linkedHashMap.get(Reflection.getOrCreateKotlinClass(ControlAction.class));
        if (!(obj9 instanceof ControlAction)) {
            obj9 = null;
        }
        ControlAction controlAction = (ControlAction) obj9;
        Object obj10 = linkedHashMap.get(Reflection.getOrCreateKotlinClass(PrimaryAction.class));
        if (!(obj10 instanceof PrimaryAction)) {
            obj10 = null;
        }
        PrimaryAction primaryAction = (PrimaryAction) obj10;
        Object obj11 = linkedHashMap.get(Reflection.getOrCreateKotlinClass(PrimaryActionState.class));
        if (!(obj11 instanceof PrimaryActionState)) {
            obj11 = null;
        }
        PrimaryActionState primaryActionState = (PrimaryActionState) obj11;
        Object obj12 = linkedHashMap.get(Reflection.getOrCreateKotlinClass(SdkEvent.class));
        if (!(obj12 instanceof SdkEvent)) {
            obj12 = null;
        }
        SdkEvent sdkEvent = (SdkEvent) obj12;
        Object obj13 = linkedHashMap.get(Reflection.getOrCreateKotlinClass(StepAction.class));
        if (!(obj13 instanceof StepAction)) {
            obj13 = null;
        }
        StepAction stepAction = (StepAction) obj13;
        StringBuilder sb2 = new StringBuilder();
        int i12 = domain == null ? -1 : AbstractC28369h.f57848a[domain.ordinal()];
        if (i12 == -1) {
            str = null;
        } else if (i12 == 1 || i12 == 2) {
            str = "user";
        } else {
            if (i12 != 3 && i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "msdk";
        }
        if (str != null) {
            sb2.append(str);
            sb2.append(C33844oi.f71346o);
        }
        if (navigationAction != null) {
            strM69271a = AbstractC28370i.m69269a(navigationAction, popup);
        } else if (controlAction != null) {
            strM69271a = AbstractC28370i.m69268a(controlAction);
        } else if (primaryAction != null && primaryActionState != null) {
            strM69271a = AbstractC28370i.m69270a(primaryActionState);
        } else if (sdkEvent != null) {
            strM69271a = sdkEvent.getText();
        } else if (stepAction != null) {
            strM69271a = AbstractC28370i.m69271a(stepAction);
        } else {
            strM69271a = "unknown_action";
        }
        sb2.append(strM69271a);
        String string = sb2.toString();
        Pair pairM90091to = TuplesKt.m90091to("source", "msdk");
        Pair pairM90091to2 = TuplesKt.m90091to("screenName", screen != null ? screen.getText() : null);
        if (control == null || (text = control.getText()) == null) {
            text = primaryAction != null ? primaryAction.getText() : null;
        }
        LinkedHashMap linkedHashMapM69336a = AbstractC28458h.m69336a(MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("objectName", text), TuplesKt.m90091to("blockName", block != null ? block.getText() : null), TuplesKt.m90091to("popupName", popup != null ? popup.getText() : null), TuplesKt.m90091to("stepName", c28371j != null ? c28371j.f57850a : null)));
        Map mapEmptyMap = this.f57847c;
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Map mapPlus = MapsKt.plus(linkedHashMapM69336a, mapEmptyMap);
        C33272c.f67816e.f67810a.mo68955d("Analytics", string + " payload: " + mapPlus, null);
        return new SNSTrackEvents(string, (String) this.f57845a.invoke(), mapPlus, this.f57846b.contains(SdkEvent.TrackingDisabled));
    }
}
