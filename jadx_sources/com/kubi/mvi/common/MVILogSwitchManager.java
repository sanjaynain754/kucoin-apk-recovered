package com.kubi.mvi.common;

import com.google.gson.reflect.TypeToken;
import com.kubi.utils.C27063n;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MVILogSwitchManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0003R'\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/mvi/common/MVILogSwitchManager;", "", "<init>", "()V", "", "name", "", "b", "(Ljava/lang/String;)Z", "", "Lcom/kubi/mvi/common/DebugItem;", "c", "()Ljava/util/List;", "", "e", "Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Lazy;", "d", "()Ljava/util/concurrent/ConcurrentHashMap;", "switchLogMap", "MVI_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMVILogSwitchManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MVILogSwitchManager.kt\ncom/kubi/mvi/common/MVILogSwitchManager\n+ 2 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,59:1\n40#2:60\n36#2:61\n26#2:75\n20#2,8:76\n137#3,5:62\n125#4:67\n152#4,3:68\n125#4:71\n152#4,3:72\n*S KotlinDebug\n*F\n+ 1 MVILogSwitchManager.kt\ncom/kubi/mvi/common/MVILogSwitchManager\n*L\n24#1:60\n24#1:61\n49#1:75\n49#1:76,8\n24#1:62,5\n28#1:67\n28#1:68,3\n47#1:71\n47#1:72,3\n*E\n"})
public final class MVILogSwitchManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final MVILogSwitchManager f35617a = new MVILogSwitchManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy switchLogMap = LazyKt.lazy(new Function0<ConcurrentHashMap<String, Boolean>>() { // from class: com.kubi.mvi.common.MVILogSwitchManager$switchLogMap$2
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final ConcurrentHashMap<String, Boolean> invoke() {
            ConcurrentHashMap<String, Boolean> concurrentHashMap = new ConcurrentHashMap<>();
            for (DebugItem debugItem : MVILogSwitchManager.f35617a.m42502c()) {
                concurrentHashMap.put(debugItem.getName(), Boolean.valueOf(debugItem.getIsOpenLog()));
            }
            return concurrentHashMap;
        }
    });

    /* JADX INFO: renamed from: com.kubi.mvi.common.MVILogSwitchManager$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    /* JADX INFO: loaded from: classes29.dex */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C19237a extends TypeToken<List<DebugItem>> {
    }

    /* JADX INFO: renamed from: c */
    public final List<DebugItem> m42502c() {
        Object objM66914d = null;
        String strM66769g = C27063n.m66769g("mvi_debug_list", null, 1, null);
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM66769g, new C19237a().getType());
        } catch (Throwable th2) {
            C43846g.m96569d(th2, "GsonUtils", null, 4, null);
        }
        List<DebugItem> list = (List) objM66914d;
        return list == null ? new ArrayList() : list;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m42501b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!MviExKt.m42517m()) {
            return false;
        }
        if (m42503d().get(name) == null) {
            m42503d().put(name, Boolean.FALSE);
            m42504e();
        }
        return C27025c.m66566d(m42503d().get(name));
    }

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap<String, Boolean> m42503d() {
        return (ConcurrentHashMap) switchLogMap.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m42504e() {
        ConcurrentHashMap<String, Boolean> concurrentHashMapM42503d = m42503d();
        ArrayList arrayList = new ArrayList(concurrentHashMapM42503d.size());
        for (Map.Entry<String, Boolean> entry : concurrentHashMapM42503d.entrySet()) {
            arrayList.add(new DebugItem(entry.getKey(), entry.getValue().booleanValue()));
        }
        String strM66919i = C27099x.m66919i(arrayList, false, 2, null);
        if (strM66919i == null) {
            strM66919i = "";
        }
        C27063n.m66772j(strM66919i, "mvi_debug_list");
    }
}
