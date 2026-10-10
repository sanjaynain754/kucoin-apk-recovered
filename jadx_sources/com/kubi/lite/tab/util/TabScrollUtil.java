package com.kubi.lite.tab.util;

import android.util.Log;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.lite.tab.bean.TabConfig;
import com.kubi.lite.tab.bean.TabScrollEvent;
import com.kubi.lite.tab.ui.LiteMainActivity;
import com.tencent.bugly.proguard.C33789m5;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import my.C42677p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p291go.C37976a;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: TabScrollUtil.kt */
/* JADX INFO: loaded from: classes24.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013J\u001c\u0010\u001b\u001a\u00020\u00192\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u001dH\u0002J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005J\u000e\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005J\u0006\u0010%\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, m90084d2 = {"Lcom/kubi/lite/tab/util/TabScrollUtil;", "", "<init>", "()V", "TAG", "", "mLastClickUrl", "getMLastClickUrl", "()Ljava/lang/String;", "setMLastClickUrl", "(Ljava/lang/String;)V", "mViewModel", "Lcom/kubi/lite/tab/viewmodel/LiteTabViewModel;", "getMViewModel", "()Lcom/kubi/lite/tab/viewmodel/LiteTabViewModel;", "setMViewModel", "(Lcom/kubi/lite/tab/viewmodel/LiteTabViewModel;)V", "mLiteMainActivity", "Ljava/lang/ref/WeakReference;", "Lcom/kubi/lite/tab/ui/LiteMainActivity;", "stateMap", "", "getStateMap", "()Ljava/util/Map;", "init", "", "liteMainActivity", "handleFlutterEvent", "eventData", "", "processTabSwitch", "tabConfig", "Lcom/kubi/lite/tab/bean/TabConfig;", "isScrollToTop", "", "tabId", "isScrollToBottom", "printMap", "Companion", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTabScrollUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabScrollUtil.kt\ncom/kubi/lite/tab/util/TabScrollUtil\n+ 2 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n76#2,7:144\n360#3,7:151\n*S KotlinDebug\n*F\n+ 1 TabScrollUtil.kt\ncom/kubi/lite/tab/util/TabScrollUtil\n*L\n46#1:144,7\n69#1:151,7\n*E\n"})
public final class TabScrollUtil {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Companion f32166f = new Companion(null);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final TabScrollUtil f32167g = new TabScrollUtil();

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f32169b;

    /* JADX INFO: renamed from: c */
    public C37976a f32170c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public WeakReference<LiteMainActivity> f32171d;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f32168a = "LiteV2-TabScrollUtil";

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Map<String, String> f32172e = new LinkedHashMap();

    /* JADX INFO: compiled from: TabScrollUtil.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/lite/tab/util/TabScrollUtil$Companion;", "", "<init>", "()V", "mInstance", "Lcom/kubi/lite/tab/util/TabScrollUtil;", "getInstance", "STATE_SCROLL_TO_TOP", "", "STATE_SCROLL_TO_BOTTOM", "LITE_FEED_JUMP_TOP", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final TabScrollUtil getInstance() {
            return TabScrollUtil.f32167g;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C37976a m37639c() {
        C37976a c37976a = this.f32170c;
        if (c37976a != null) {
            return c37976a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m37640d(Map<String, ? extends Object> map) {
        Log.i(this.f32168a, "handleFlutterEvent, eventData = " + map);
        if (map.isEmpty()) {
            Log.e(this.f32168a, "handleFlutterEvent: eventData is isEmpty!!!");
            return;
        }
        Object obj = map.get("key_event_name");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("state");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str == null || !Intrinsics.areEqual(str, "updateLiteTabIcon") || str2 == null) {
            return;
        }
        List<TabConfig> value = m37639c().m85825q().getValue();
        if (value == null) {
            value = CollectionsKt.emptyList();
        }
        String str3 = this.f32169b;
        if (str3 == null) {
            str3 = "";
        }
        Iterator<TabConfig> it = value.iterator();
        int iM85822n = 0;
        while (true) {
            if (!it.hasNext()) {
                iM85822n = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getUrl(), str3)) {
                break;
            } else {
                iM85822n++;
            }
        }
        if (iM85822n == -1) {
            iM85822n = m37639c().m85822n();
        }
        Log.i(this.f32168a, "handleFlutterEvent: currentUrl = " + str3 + ", position = " + iM85822n);
        if (iM85822n < 0) {
            C44128b.m97261e(this.f32168a, "handleFlutterEvent: actualPosition < 0 !");
            return;
        }
        if (Intrinsics.areEqual(str2, "scrollToTop")) {
            C44128b.m97266j(this.f32168a, "update tab icon to scrollToTop at position: " + iM85822n);
            TabScrollEvent tabScrollEvent = new TabScrollEvent(iM85822n, value.get(iM85822n), "scrollToTop");
            this.f32172e.put(value.get(iM85822n).getTabId(), "scrollToTop");
            m37644h();
            m37639c().m85828t(tabScrollEvent);
            return;
        }
        if (Intrinsics.areEqual(str2, C33789m5.f70921k)) {
            C44128b.m97266j(this.f32168a, "update tab icon to normal at position: " + iM85822n);
            TabScrollEvent tabScrollEvent2 = new TabScrollEvent(iM85822n, value.get(iM85822n), C33789m5.f70921k);
            this.f32172e.put(value.get(iM85822n).getTabId(), C33789m5.f70921k);
            m37644h();
            m37639c().m85828t(tabScrollEvent2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m37641e(@NotNull LiteMainActivity liteMainActivity) {
        LiteMainActivity liteMainActivity2;
        Intrinsics.checkNotNullParameter(liteMainActivity, "liteMainActivity");
        this.f32172e.clear();
        this.f32171d = new WeakReference<>(liteMainActivity);
        m37646j((C37976a) new ViewModelProvider(liteMainActivity).get(C37976a.class));
        C44128b.m97266j(this.f32168a, "TabClickInfoUtil init ...");
        WeakReference<LiteMainActivity> weakReference = this.f32171d;
        if (weakReference == null || (liteMainActivity2 = weakReference.get()) == null) {
            return;
        }
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.event.FlutterEvent:flutterCommonEvent".length();
        }
        C12572a.m23692a(liteMainActivity2, false, new TabScrollUtil$init$$inlined$bindFlowEvent$default$1("com.kubi.event.FlutterEvent:flutterCommonEvent", null, this));
    }

    /* JADX INFO: renamed from: f */
    public final boolean m37642f(@NotNull String tabId) {
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        boolean z11 = this.f32172e.get(tabId) != null && Intrinsics.areEqual(this.f32172e.get(tabId), C33789m5.f70921k);
        m37644h();
        C44128b.m97266j(this.f32168a, "isScrollToTop: tabId = " + tabId + ", ret = " + z11);
        return z11;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m37643g(@NotNull String tabId) {
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        boolean z11 = this.f32172e.get(tabId) != null && Intrinsics.areEqual(this.f32172e.get(tabId), "scrollToTop");
        m37644h();
        C44128b.m97266j(this.f32168a, "isScrollToTop: tabId = " + tabId + ", ret = " + z11);
        return z11;
    }

    /* JADX INFO: renamed from: h */
    public final void m37644h() {
        for (Map.Entry<String, String> entry : this.f32172e.entrySet()) {
            System.out.println((Object) (entry.getKey() + " -> " + entry.getValue()));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m37645i(@NotNull TabConfig tabConfig) {
        Intrinsics.checkNotNullParameter(tabConfig, "tabConfig");
        C44128b.m97266j(this.f32168a, "mLastClickUrl = " + this.f32169b + ", tabConfig.url = " + tabConfig.getUrl());
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("key_event_name", "square_scroll_to_top"));
        if (Intrinsics.areEqual(tabConfig.getUrl(), this.f32169b) && m37643g(tabConfig.getTabId())) {
            C44128b.m97266j(this.f32168a, "send event, data = " + mapHashMapOf);
            C12572a.m23695d("com.kubi.event.FlutterEvent:flutterCommonEvent", mapHashMapOf, 0L, 4, null);
            C42677p.f94436a.m93493m("lite.feed.square.scroll.top", mapHashMapOf);
        }
        this.f32169b = tabConfig.getUrl();
    }

    /* JADX INFO: renamed from: j */
    public final void m37646j(@NotNull C37976a c37976a) {
        Intrinsics.checkNotNullParameter(c37976a, "<set-?>");
        this.f32170c = c37976a;
    }
}
