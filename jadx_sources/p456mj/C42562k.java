package p456mj;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.home.realtime.IRealTimeAdapter;
import com.kubi.home.realtime.IRealTimeData;
import com.kubi.home.realtime.RealTimeViewType;
import com.kubi.home.realtime.ViewLifecycleEvent;
import com.kubi.home.realtime.ViewLifecycleListener;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: mj.k */
/* JADX INFO: compiled from: RealTimeDataManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001JB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0016\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 H\u0002J\u001e\u0010!\u001a\u00020\u001e\"\b\b\u0000\u0010\"*\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\"0\u0007J\u001e\u0010$\u001a\u00020\u001e\"\b\b\u0000\u0010\"*\u00020\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H\"0\u000eJ\u001e\u0010&\u001a\u00020\u001e\"\b\b\u0000\u0010\"*\u00020\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H\"0\u000eJ\u0006\u0010'\u001a\u00020\u001eJ\u0019\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0)H\u0000¢\u0006\u0002\b*J\u001b\u0010+\u001a\u00020\u001e2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0-H\u0000¢\u0006\u0002\b.J\r\u0010/\u001a\u00020\u001eH\u0001¢\u0006\u0002\b0J\u0006\u00101\u001a\u00020\u001eJ\u0018\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\b2\b\b\u0002\u00104\u001a\u00020\u0014J\u0018\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u00020\b2\b\b\u0002\u00104\u001a\u00020\u0014J\u001e\u00107\u001a\u00020\u001e2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\b0)2\b\b\u0002\u00104\u001a\u00020\u0014J\u0018\u00109\u001a\u00020\u00142\u0006\u00103\u001a\u00020\b2\b\b\u0002\u00104\u001a\u00020\u0014J\u0017\u0010:\u001a\u0004\u0018\u00010\u000b2\u0006\u0010;\u001a\u00020\nH\u0000¢\u0006\u0002\b<J\u0013\u0010=\u001a\b\u0012\u0004\u0012\u00020\b0)H\u0000¢\u0006\u0002\b>J\b\u0010?\u001a\u00020\u001eH\u0002J\b\u0010@\u001a\u00020\u001eH\u0002J\u000e\u0010A\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0010J\u000e\u0010B\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0010J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0002J\u0010\u0010D\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\nH\u0002J\u000e\u0010E\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\nJ\u0010\u0010F\u001a\u00020\u001e2\b\u0010G\u001a\u0004\u0018\u00010\nJ\u0010\u0010H\u001a\u00020\u00142\u0006\u0010I\u001a\u00020\u0006H\u0002R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, m90084d2 = {"Lcom/kubi/home/realtime/frame/manager/RealTimeDataManager;", "", "<init>", "()V", "adapters", "", "Lcom/kubi/home/realtime/RealTimeViewType;", "Lcom/kubi/home/realtime/IRealTimeAdapter;", "Lcom/kubi/home/realtime/IRealTimeData;", "viewInstances", "", "Lcom/kubi/home/realtime/frame/manager/RealTimeDataManager$ViewInstance;", "lifecycleListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/kubi/home/realtime/ViewLifecycleListener;", "uiRefreshListeners", "Lcom/kubi/home/realtime/frame/manager/IUIDataRefreshListener;", "availableViewTypes", "", "hasCardInitNotify", "", "removedIdsCache", "", "counter", "Ljava/util/concurrent/atomic/AtomicLong;", "nextAutoIncreaseId", "", "mainHandler", "Landroid/os/Handler;", "runOnMainThread", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function0;", "registerAdapter", ExifInterface.GPS_DIRECTION_TRUE, "adapter", "addLifecycleListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeLifecycleListener", "clearLifecycleListeners", "getLifecycleListeners", "", "getLifecycleListeners$HomeLib_googleRelease", "notifyLifecycleEvent", "event", "Lcom/kubi/home/realtime/ViewLifecycleEvent;", "notifyLifecycleEvent$HomeLib_googleRelease", "notifyCardInit", "notifyCardInit$HomeLib_googleRelease", "reInit", "add", "data", "immediate", "update", "newData", "removeAll", "dataList", "remove", "getViewInstance", "id", "getViewInstance$HomeLib_googleRelease", "getAllData", "getAllData$HomeLib_googleRelease", "removeAllData", "clear", "addUIRefreshListener", "removeUIRefreshListener", "getRemovedIds", "persistRemovedId", "isRemoved", "updateViewType", "defaultData", "isViewTypeAllowed", "viewType", "ViewInstance", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRealTimeDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealTimeDataManager.kt\ncom/kubi/home/realtime/frame/manager/RealTimeDataManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,390:1\n1869#2,2:391\n1869#2,2:393\n1869#2,2:395\n1563#2:397\n1634#2,3:398\n1068#2:401\n1869#2,2:402\n1869#2,2:407\n1869#2,2:409\n1869#2,2:411\n1869#2,2:413\n50#3:404\n40#3,2:405\n*S KotlinDebug\n*F\n+ 1 RealTimeDataManager.kt\ncom/kubi/home/realtime/frame/manager/RealTimeDataManager\n*L\n123#1:391,2\n141#1:393,2\n238#1:395,2\n293#1:397\n293#1:398,3\n293#1:401\n299#1:402,2\n159#1:407,2\n197#1:409,2\n229#1:411,2\n271#1:413,2\n323#1:404\n336#1:405,2\n*E\n"})
public final class C42562k {

    /* JADX INFO: renamed from: g */
    public static volatile boolean f94246g;

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42562k f94240a = new C42562k();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<RealTimeViewType, IRealTimeAdapter<IRealTimeData>> f94241b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Map<String, ViewInstance> f94242c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final CopyOnWriteArrayList<ViewLifecycleListener<IRealTimeData>> f94243d = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final CopyOnWriteArrayList<InterfaceC42553b> f94244e = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: f */
    @NotNull
    public static Set<? extends RealTimeViewType> f94245f = new LinkedHashSet();

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final Set<String> f94247h = new LinkedHashSet();

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final AtomicLong f94248i = new AtomicLong(0);

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Handler f94249j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: mj.k$a, reason: from toString */
    /* JADX INFO: compiled from: RealTimeDataManager.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/home/realtime/frame/manager/RealTimeDataManager$ViewInstance;", "", "id", "", "type", "Lcom/kubi/home/realtime/RealTimeViewType;", "data", "Lcom/kubi/home/realtime/IRealTimeData;", "adapter", "Lcom/kubi/home/realtime/IRealTimeAdapter;", "<init>", "(Ljava/lang/String;Lcom/kubi/home/realtime/RealTimeViewType;Lcom/kubi/home/realtime/IRealTimeData;Lcom/kubi/home/realtime/IRealTimeAdapter;)V", "getId", "()Ljava/lang/String;", "getType", "()Lcom/kubi/home/realtime/RealTimeViewType;", "getData", "()Lcom/kubi/home/realtime/IRealTimeData;", "getAdapter", "()Lcom/kubi/home/realtime/IRealTimeAdapter;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class ViewInstance {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String id;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final RealTimeViewType type;

        /* JADX INFO: renamed from: c, reason: from toString */
        @NotNull
        public final IRealTimeData data;

        /* JADX INFO: renamed from: d, reason: from toString */
        @NotNull
        public final IRealTimeAdapter<IRealTimeData> adapter;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewInstance)) {
                return false;
            }
            ViewInstance viewInstance = (ViewInstance) other;
            return Intrinsics.areEqual(this.id, viewInstance.id) && this.type == viewInstance.type && Intrinsics.areEqual(this.data, viewInstance.data) && Intrinsics.areEqual(this.adapter, viewInstance.adapter);
        }

        public ViewInstance(@NotNull String id2, @NotNull RealTimeViewType type, @NotNull IRealTimeData data, @NotNull IRealTimeAdapter<IRealTimeData> adapter) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            this.id = id2;
            this.type = type;
            this.data = data;
            this.adapter = adapter;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ ViewInstance m93326b(ViewInstance viewInstance, String str, RealTimeViewType realTimeViewType, IRealTimeData iRealTimeData, IRealTimeAdapter iRealTimeAdapter, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = viewInstance.id;
            }
            if ((i11 & 2) != 0) {
                realTimeViewType = viewInstance.type;
            }
            if ((i11 & 4) != 0) {
                iRealTimeData = viewInstance.data;
            }
            if ((i11 & 8) != 0) {
                iRealTimeAdapter = viewInstance.adapter;
            }
            return viewInstance.m93327a(str, realTimeViewType, iRealTimeData, iRealTimeAdapter);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final ViewInstance m93327a(@NotNull String id2, @NotNull RealTimeViewType type, @NotNull IRealTimeData data, @NotNull IRealTimeAdapter<IRealTimeData> adapter) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(adapter, "adapter");
            return new ViewInstance(id2, type, data, adapter);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final IRealTimeAdapter<IRealTimeData> m93328c() {
            return this.adapter;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final IRealTimeData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final RealTimeViewType getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.data.hashCode()) * 31) + this.adapter.hashCode();
        }

        @NotNull
        public String toString() {
            return "ViewInstance(id=" + this.id + ", type=" + this.type + ", data=" + this.data + ", adapter=" + this.adapter + ')';
        }
    }

    /* JADX INFO: renamed from: mj.k$b */
    /* JADX INFO: compiled from: Comparisons.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 RealTimeDataManager.kt\ncom/kubi/home/realtime/frame/manager/RealTimeDataManager\n*L\n1#1,328:1\n293#2:329\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(Long.valueOf(((IRealTimeData) t12).getAutoIncreaseId()), Long.valueOf(((IRealTimeData) t11).getAutoIncreaseId()));
        }
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m93286B() {
        for (ViewInstance viewInstance : f94242c.values()) {
            Iterator<T> it = f94244e.iterator();
            while (it.hasNext()) {
                ((InterfaceC42553b) it.next()).mo30088c(viewInstance.getData(), true);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final Unit m93287E(IRealTimeData iRealTimeData, boolean z11) {
        Iterator<T> it = f94244e.iterator();
        while (it.hasNext()) {
            ((InterfaceC42553b) it.next()).mo30089d(iRealTimeData, z11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ boolean m93289L(C42562k c42562k, IRealTimeData iRealTimeData, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return c42562k.m93310K(iRealTimeData, z11);
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m93290M(IRealTimeData iRealTimeData, boolean z11) {
        Iterator<T> it = f94244e.iterator();
        while (it.hasNext()) {
            ((InterfaceC42553b) it.next()).mo30086a(iRealTimeData, z11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m93299j(IRealTimeData iRealTimeData, boolean z11) {
        for (InterfaceC42553b interfaceC42553b : f94244e) {
            if (f94242c.values().size() == 1) {
                interfaceC42553b.mo30088c(iRealTimeData, true);
            } else {
                interfaceC42553b.mo30088c(iRealTimeData, z11);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m93303A() {
        if (f94242c.values().isEmpty()) {
            return;
        }
        m93309I(new Function0() { // from class: mj.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42562k.m93286B();
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final <T extends IRealTimeData> void m93304C(@NotNull IRealTimeAdapter<T> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        f94241b.put(adapter.getF36789b(), adapter);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m93305D(@NotNull final IRealTimeData data, final boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        String uniqueId = data.getUniqueId();
        Map<String, ViewInstance> map = f94242c;
        ViewInstance viewInstance = map.get(uniqueId);
        if (viewInstance == null) {
            return false;
        }
        if (data.getViewType() != RealTimeViewType.COMMON) {
            m93325z(uniqueId);
        }
        map.remove(uniqueId);
        m93324x(new ViewLifecycleEvent.Removed(viewInstance.getData(), viewInstance.getType()));
        m93309I(new Function0() { // from class: mj.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42562k.m93287E(data, z11);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: F */
    public final void m93306F(@NotNull List<? extends IRealTimeData> dataList, boolean z11) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Iterator<T> it = dataList.iterator();
        while (it.hasNext()) {
            f94240a.m93305D((IRealTimeData) it.next(), z11);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m93307G() {
        Iterator<T> it = f94244e.iterator();
        while (it.hasNext()) {
            ((InterfaceC42553b) it.next()).mo30087b(true);
        }
        f94242c.clear();
    }

    /* JADX INFO: renamed from: H */
    public final void m93308H(@NotNull InterfaceC42553b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f94244e.remove(listener);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m93310K(@NotNull final IRealTimeData newData, final boolean z11) {
        Map<String, ViewInstance> map;
        ViewInstance viewInstance;
        Intrinsics.checkNotNullParameter(newData, "newData");
        if (!m93321t(newData.getViewType()) || m93320s(newData.getUniqueId()) || (viewInstance = (map = f94242c).get(newData.getUniqueId())) == null) {
            return false;
        }
        newData.setAutoIncreaseId(m93322u());
        map.put(newData.getUniqueId(), ViewInstance.m93326b(viewInstance, null, null, newData, null, 11, null));
        m93309I(new Function0() { // from class: mj.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42562k.m93290M(newData, z11);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: N */
    public final void m93311N(@Nullable String str) {
        RealTimeViewType realTimeViewTypeTryParse;
        if (str != null) {
            try {
                if (!StringsKt.isBlank(str)) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("realTimeList");
                    if (jSONArrayOptJSONArray == null) {
                        f94245f = SetsKt.emptySet();
                        return;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i11);
                        Intrinsics.checkNotNull(strOptString);
                        if (!StringsKt.isBlank(strOptString) && (realTimeViewTypeTryParse = RealTimeViewType.INSTANCE.tryParse(strOptString)) != null) {
                            linkedHashSet.add(realTimeViewTypeTryParse);
                        }
                    }
                    f94245f = linkedHashSet;
                    return;
                }
            } catch (Exception unused) {
                f94245f = CollectionsKt.toSet(RealTimeViewType.getEntries());
                return;
            }
        }
        f94245f = CollectionsKt.toSet(RealTimeViewType.getEntries());
    }

    /* JADX INFO: renamed from: i */
    public final void m93312i(@NotNull final IRealTimeData data, final boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (m93321t(data.getViewType())) {
            IRealTimeAdapter<IRealTimeData> iRealTimeAdapter = f94241b.get(data.getViewType());
            if (iRealTimeAdapter == null) {
                throw new IllegalArgumentException("No adapter registered for type: " + data.getViewType());
            }
            if (m93320s(data.getUniqueId())) {
                return;
            }
            Map<String, ViewInstance> map = f94242c;
            if (map.containsKey(data.getUniqueId())) {
                m93289L(this, data, false, 2, null);
                return;
            }
            data.setAutoIncreaseId(m93322u());
            map.put(data.getUniqueId(), new ViewInstance(data.getUniqueId(), data.getViewType(), data, iRealTimeAdapter));
            m93309I(new Function0() { // from class: mj.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C42562k.m93299j(data, z11);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k */
    public final <T extends IRealTimeData> void m93313k(@NotNull final ViewLifecycleListener<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f94243d.add(listener);
        C27100x0.m66923d(new Function0() { // from class: mj.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42562k.m93300l(listener);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m93314m(@NotNull InterfaceC42553b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f94244e.add(listener);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final List<IRealTimeData> m93316o() {
        Collection<ViewInstance> collectionValues = f94242c.values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((ViewInstance) it.next()).getData());
        }
        return CollectionsKt.sortedWith(arrayList, new b());
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final List<ViewLifecycleListener<IRealTimeData>> m93317p() {
        return CollectionsKt.toList(f94243d);
    }

    /* JADX INFO: renamed from: q */
    public final Set<String> m93318q() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        StorageId<Set<String>> storageIdM93331a = C42563l.f94254a.m93331a();
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        linkedHashSet.addAll(C46392a.m102327i(storageIdM93331a.m102384f(strH), SetsKt.emptySet()));
        if (linkedHashSet.size() > 1000) {
            linkedHashSet.removeAll(CollectionsKt.take(linkedHashSet, 500));
        }
        return linkedHashSet;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final ViewInstance m93319r(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return f94242c.get(id2);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m93320s(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return f94247h.contains(id2);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m93321t(RealTimeViewType realTimeViewType) {
        return f94245f.contains(realTimeViewType) || realTimeViewType == RealTimeViewType.COMMON;
    }

    /* JADX INFO: renamed from: u */
    public final long m93322u() {
        return f94248i.incrementAndGet();
    }

    /* JADX INFO: renamed from: x */
    public final void m93324x(@NotNull final ViewLifecycleEvent<IRealTimeData> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator<T> it = f94243d.iterator();
        while (it.hasNext()) {
            final ViewLifecycleListener viewLifecycleListener = (ViewLifecycleListener) it.next();
            C27100x0.m66923d(new Function0() { // from class: mj.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C42562k.m93302y(viewLifecycleListener, event);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m93325z(String str) {
        Set<String> set = f94247h;
        set.add(str);
        StorageId<Set<String>> storageIdM93331a = C42563l.f94254a.m93331a();
        String strH = UserInfo.a.h();
        if (strH == null) {
            strH = "";
        }
        C46392a.m102334q(storageIdM93331a.m102384f(strH), set);
    }

    /* JADX INFO: renamed from: J */
    public static final void m93288J(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m93300l(ViewLifecycleListener viewLifecycleListener) {
        viewLifecycleListener.mo30044f();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m93301w(ViewLifecycleListener viewLifecycleListener) {
        viewLifecycleListener.mo30044f();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m93302y(ViewLifecycleListener viewLifecycleListener, ViewLifecycleEvent viewLifecycleEvent) {
        if (viewLifecycleListener.mo30041c() == viewLifecycleEvent.getViewType()) {
            viewLifecycleListener.mo30042d(viewLifecycleEvent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public final void m93309I(final Function0<Unit> function0) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            f94249j.post(new Runnable() { // from class: mj.j
                @Override // java.lang.Runnable
                public final void run() {
                    C42562k.m93288J(function0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m93315n() {
        m93307G();
        f94244e.clear();
    }

    @MainThread
    /* JADX INFO: renamed from: v */
    public final void m93323v() {
        m93315n();
        Set<String> set = f94247h;
        set.clear();
        set.addAll(m93318q());
        Iterator<T> it = f94243d.iterator();
        while (it.hasNext()) {
            final ViewLifecycleListener viewLifecycleListener = (ViewLifecycleListener) it.next();
            C27100x0.m66923d(new Function0() { // from class: mj.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C42562k.m93301w(viewLifecycleListener);
                }
            });
        }
        f94246g = true;
    }
}
