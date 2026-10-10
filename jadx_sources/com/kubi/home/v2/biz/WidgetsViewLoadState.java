package com.kubi.home.v2.biz;

import androidx.lifecycle.LifecycleOwner;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.api.HomeWidgetCode;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: WidgetsViewLoadState.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0013J\u0014\u0010\u0014\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/home/v2/biz/WidgetsViewLoadState;", "", "<init>", "()V", "TAG", "", "listenerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/kubi/home/api/HomeWidgetCode;", "", "register", "", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "widgets", "", "onlyOnce", "onAllLoaded", "Lkotlin/Function0;", "unRegisters", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWidgetsViewLoadState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetsViewLoadState.kt\ncom/kubi/home/v2/biz/WidgetsViewLoadState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,57:1\n1285#2,2:58\n1299#2,4:60\n76#3,7:64\n*S KotlinDebug\n*F\n+ 1 WidgetsViewLoadState.kt\ncom/kubi/home/v2/biz/WidgetsViewLoadState\n*L\n35#1:58,2\n35#1:60,4\n36#1:64,7\n*E\n"})
public final class WidgetsViewLoadState {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final WidgetsViewLoadState f26367a = new WidgetsViewLoadState();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final ConcurrentHashMap<String, Map<HomeWidgetCode, Boolean>> f26368b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m30516e(WidgetsViewLoadState widgetsViewLoadState, LifecycleOwner lifecycleOwner, List list, boolean z11, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        widgetsViewLoadState.m30519d(lifecycleOwner, list, z11, function0);
    }

    /* JADX INFO: renamed from: f */
    public static final CharSequence m30517f(HomeWidgetCode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCode();
    }

    /* JADX INFO: renamed from: h */
    public static final CharSequence m30518h(HomeWidgetCode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCode();
    }

    /* JADX INFO: renamed from: d */
    public final void m30519d(@NotNull LifecycleOwner owner, @NotNull List<? extends HomeWidgetCode> widgets, boolean z11, @NotNull Function0<Unit> onAllLoaded) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        Intrinsics.checkNotNullParameter(onAllLoaded, "onAllLoaded");
        String strJoinToString$default = CollectionsKt.joinToString$default(widgets, null, null, null, 0, null, new Function1() { // from class: com.kubi.home.v2.biz.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WidgetsViewLoadState.m30517f((HomeWidgetCode) obj);
            }
        }, 31, null);
        ConcurrentHashMap<String, Map<HomeWidgetCode, Boolean>> concurrentHashMap = f26368b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(widgets, 10)), 16));
        for (Object obj : widgets) {
            linkedHashMap.put(obj, Boolean.FALSE);
        }
        concurrentHashMap.put(strJoinToString$default, MapsKt.toMutableMap(linkedHashMap));
        if (C12573b.f21598a.m23696a()) {
            "com.kubi.home.event.HomeEvent:widget_view_loaded".length();
        }
        C12572a.m23692a(owner, false, new WidgetsViewLoadState$register$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:widget_view_loaded", null, strJoinToString$default, z11, onAllLoaded));
    }

    /* JADX INFO: renamed from: g */
    public final void m30520g(@NotNull List<? extends HomeWidgetCode> widgets) {
        Intrinsics.checkNotNullParameter(widgets, "widgets");
        f26368b.remove(CollectionsKt.joinToString$default(widgets, null, null, null, 0, null, new Function1() { // from class: com.kubi.home.v2.biz.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WidgetsViewLoadState.m30518h((HomeWidgetCode) obj);
            }
        }, 31, null));
    }
}
