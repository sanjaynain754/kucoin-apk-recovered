package com.kubi.market.monitor.lib.p100ui.floating.window;

import androidx.lifecycle.ViewModelKt;
import aq.C4373b;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import com.kubi.market.monitor.lib.entity.SocketMarketSnapshotEntity;
import com.kubi.market.monitor.lib.entity.StateTradeItemBean;
import com.kubi.market.monitor.lib.p100ui.floating.FloatingWindowConfigManager;
import com.kubi.mvi.common.MviExKt;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.websocket.model.Message;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.websocket.C24337a;
import com.kubi.sdk.websocket.SocketTask;
import com.kubi.utils.C27099x;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import g10.C37779j;
import g10.C37781l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p694vk.C45590s;
import p805yp.InterfaceC46556a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: FloatingWindowVM.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\u0016\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0094@¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0015H\u0002J\u0010\u0010'\u001a\u00020\u00152\u0006\u0010#\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010#\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u0006H\u0002J\u0016\u0010/\u001a\u00020\u00152\f\u00100\u001a\b\u0012\u0004\u0012\u00020\t01H\u0002J\u000e\u00103\u001a\u00020\u0006H\u0082@¢\u0006\u0002\u00104J\b\u00105\u001a\u00020\u0015H\u0002J\u0010\u00106\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0006H\u0002J\u001a\u00108\u001a\u00020\u00152\u0010\u00109\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u000101H\u0002J\b\u0010:\u001a\u00020\u0015H\u0002J\"\u0010;\u001a\u00020\u00152\u0010\u00109\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u0001012\u0006\u0010<\u001a\u00020\u000fH\u0002J\b\u0010=\u001a\u00020\u0015H\u0002J\b\u0010>\u001a\u00020\u0015H\u0002J \u0010?\u001a\u0004\u0018\u00010\t2\u0006\u0010@\u001a\u00020\u00062\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020\u0015H\u0002J\b\u0010E\u001a\u00020\u0015H\u0002J\b\u0010F\u001a\u00020\u0015H\u0002J\u0010\u0010G\u001a\u00020\u00152\u0006\u0010#\u001a\u00020HH\u0002J\b\u0010I\u001a\u00020\u000fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0010\u00102\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowState;", "<init>", "()V", "tag", "", "cacheListData", "", "Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;", "handlerJob", "Lkotlinx/coroutines/Job;", "handlerJobLock", "", "isDownTimeUpdate", "", "stopUpdatePag", "onBackgroundJob", "mFloatingFrameTrackHelper", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingFrameTrackHelper;", "onCleared", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "api", "Lcom/kubi/market/monitor/lib/api/MarketMonitorApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/market/monitor/lib/api/MarketMonitorApi;", "api$delegate", "Lkotlin/Lazy;", "initState", "getInitState", "()Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowState;", "dispatchIntent", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initFloating", "addOrRemoveSymbol", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$AddOrRemoveDataIntent;", "updateState", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$PageStateIntent;", "updateDownTime", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "getSymbol", "showSymbol", "updateList", "data", "", "mTopicStrs", "getTopicStrs", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bindSocketMessage", "addWsSubscribe", "topicStrs", "socketListHaveNullLog", "socketListData", "updateImSocketCallBackTime", "socketUpdateCacheListData", "isHttp", "removeWsSubscribe", "sortListData", "getStateTradeItemBean", "symbolStr", "list", "getCacheListDataSize", "", "handlerJobActionUpdateList", "handlerJobStart", "handlerJobCancel", "onBackgroundJobStartOrStop", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$AppBackgroundPollingMonitor;", "isFloatingShowIng", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFloatingWindowVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingWindowVM.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM\n+ 2 CommonUtils.kt\ncom/kubi/market/monitor/lib/ui/floating/window/util/CommonUtilsKt\n+ 3 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 6 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,561:1\n84#2,6:562\n84#2,6:568\n84#2,6:574\n84#2,6:580\n84#2,6:586\n84#2,6:594\n84#2,6:604\n84#2,6:610\n209#3,2:592\n62#3,3:616\n66#3,2:625\n65#3,19:627\n91#3,3:646\n94#3,2:655\n96#3,11:661\n1563#4:600\n1634#4,3:601\n1563#4:657\n1634#4,3:658\n1761#4,3:672\n36#5:619\n36#5:649\n137#6,5:620\n137#6,5:650\n*S KotlinDebug\n*F\n+ 1 FloatingWindowVM.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowVM\n*L\n105#1:562,6\n136#1:568,6\n189#1:574,6\n322#1:580,6\n331#1:586,6\n396#1:594,6\n483#1:604,6\n516#1:610,6\n386#1:592,2\n259#1:616,3\n259#1:625,2\n259#1:627,19\n266#1:646,3\n266#1:655,2\n266#1:661,11\n439#1:600\n439#1:601,3\n272#1:657\n272#1:658,3\n304#1:672,3\n259#1:619\n266#1:649\n259#1:620,5\n266#1:650,5\n*E\n"})
public final class FloatingWindowVM extends AbstractC19291m<FloatingWindowState> {

    /* JADX INFO: renamed from: Z */
    @Nullable
    public InterfaceC41775x1 f34447Z;

    /* JADX INFO: renamed from: b0 */
    public volatile boolean f34449b0;

    /* JADX INFO: renamed from: c0 */
    public volatile boolean f34450c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public InterfaceC41775x1 f34451d0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public String f34454g0;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final String f34445X = "FloatingWindowVM";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final List<StateTradeItemBean> f34446Y = new ArrayList();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Object f34448a0 = new Object();

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public FloatingFrameTrackHelper f34452e0 = new FloatingFrameTrackHelper();

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f34453f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.c2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FloatingWindowVM.m41051Q();
        }
    });

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1", "com/kubi/sdk/websocket/SocketExKt$bindSocketData$$inlined$convertToObj$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18737a extends TypeToken<SocketMarketSnapshotEntity> {
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1", "com/kubi/sdk/websocket/SocketExKt$bindSocketRequestData$$inlined$convertToObj$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18739b extends TypeToken<ArrayList<StateTradeItemBean>> {
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$c */
    /* JADX INFO: compiled from: FloatingWindowVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18740c implements Function0<Unit> {
        public C18740c() {
        }

        /* JADX INFO: renamed from: a */
        public final void m41095a() {
            FloatingWindowVM.this.f34449b0 = true;
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m41095a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$d */
    /* JADX INFO: compiled from: FloatingWindowVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18741d implements Function0<Unit> {
        public C18741d() {
        }

        /* JADX INFO: renamed from: a */
        public final void m41096a() {
            FloatingWindowVM.this.f34449b0 = false;
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m41096a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowVM$e */
    /* JADX INFO: compiled from: FloatingWindowVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18742e implements Function1<FloatingWindowState, FloatingWindowState> {

        /* JADX INFO: renamed from: b */
        public static final C18742e f34457b = new C18742e();

        @Override // p852kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FloatingWindowState invoke(FloatingWindowState updateState) {
            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
            return FloatingWindowState.copy$default(updateState, CollectionsKt.emptyList(), 0, 2, null);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m41057i0(List list) {
        String str = list == null ? "盯盘悬浮窗-socket订阅时 list 数据整体为空" : null;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((StateTradeItemBean) it.next()) == null) {
                    str = "盯盘悬浮窗-socket订阅时 list 数据中存在空值 listJson = " + C27099x.m66919i(list, false, 2, null) + ' ';
                    break;
                }
            }
        }
        if (str != null && str.length() > 0) {
            FloatingFrame.Companion companion = FloatingFrame.f34427p;
            companion.breadcrumbsInfo(str);
            companion.watchfloatingLogv(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m41049O(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StringsKt.startsWith$default(it.getTopic(), "/market/watching:", false, 2, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0064, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0163, please report this as an issue */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX INFO: renamed from: P */
    public static final Unit m41050P(FloatingWindowVM floatingWindowVM, Message bindSocketMessage) {
        Object objM66914d;
        ?? arrayList;
        String symbolCode;
        Object objM66914d2;
        Intrinsics.checkNotNullParameter(bindSocketMessage, "$this$bindSocketMessage");
        if (Intrinsics.areEqual(bindSocketMessage.getSource(), "heartbeat")) {
            if (bindSocketMessage.getData() != null) {
                String data = bindSocketMessage.getData();
                if (data != null) {
                    try {
                        C27099x c27099x = C27099x.f54458a;
                        objM66914d2 = C27099x.m66914d(data, new C18739b().getType());
                    } catch (Throwable th2) {
                        C43846g.m96569d(th2, "GsonUtils", null, 4, null);
                        objM66914d2 = null;
                    }
                    if (objM66914d2 != null) {
                        C44128b.m97259c("socket", "bindSocketRequestData Topic->" + bindSocketMessage + " 数据解析成功！");
                        ArrayList arrayList2 = (ArrayList) objM66914d2;
                        floatingWindowVM.m41089j0(arrayList2, true);
                        floatingWindowVM.m41088h0(arrayList2);
                        FloatingActionManager.f34540a.m41349U0("socket -http:true", arrayList2);
                    } else {
                        C44128b.m97259c("socket", "bindSocketRequestData Topic->" + bindSocketMessage + " 数据解析失败！");
                    }
                } else {
                    C44128b.m97259c("socket", "bindSocketRequestData Topic->" + bindSocketMessage + " 数据解析失败！");
                }
            } else {
                C44128b.m97259c("socket", "bindSocketRequestData Topic->" + bindSocketMessage + " Data 数据是空的！");
            }
        }
        if (Intrinsics.areEqual(bindSocketMessage.getSource(), "socket")) {
            if (bindSocketMessage.getData() != null) {
                String data2 = bindSocketMessage.getData();
                if (data2 != null) {
                    try {
                        C27099x c27099x2 = C27099x.f54458a;
                        objM66914d = C27099x.m66914d(data2, new C18737a().getType());
                    } catch (Throwable th3) {
                        C43846g.m96569d(th3, "GsonUtils", null, 4, null);
                        objM66914d = null;
                    }
                    if (objM66914d != null) {
                        C44128b.m97259c("socket", "bindSocketData Topic->" + bindSocketMessage + " 数据解析成功！");
                        WsMarketSnapshotEntity data3 = ((SocketMarketSnapshotEntity) objM66914d).getData();
                        if (data3 != null) {
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            synchronized (floatingWindowVM.f34446Y) {
                                try {
                                    List<StateTradeItemBean> list = floatingWindowVM.f34446Y;
                                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                    for (StateTradeItemBean bean : list) {
                                        String symbol = bean != null ? bean.getSymbol() : null;
                                        if (symbol != null && symbol.length() != 0 && (symbolCode = data3.getSymbolCode()) != null && symbolCode.length() != 0) {
                                            if (Intrinsics.areEqual(bean != null ? bean.getSymbol() : null, data3.getSymbolCode())) {
                                                bean = bean.getBean(data3);
                                            }
                                        }
                                        arrayList.add(bean);
                                    }
                                    objectRef.element = arrayList;
                                    Unit unit = Unit.INSTANCE;
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                            floatingWindowVM.m41089j0((List) arrayList, false);
                            FloatingActionManager.f34540a.m41349U0("socket -http:false", data3);
                        }
                    } else {
                        C44128b.m97259c("socket", "bindSocketData Topic->" + bindSocketMessage + " 数据解析失败！");
                    }
                } else {
                    C44128b.m97259c("socket", "bindSocketData Topic->" + bindSocketMessage + " 数据解析失败！");
                }
            } else {
                C44128b.m97259c("socket", "bindSocketData Topic->" + bindSocketMessage + " Data 数据是空的！");
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static final FloatingWindowState m41052T(int i11, FloatingWindowState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return FloatingWindowState.copy$default(updateState, null, i11, 1, null);
    }

    /* JADX INFO: renamed from: Z */
    public static final CharSequence m41053Z(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: renamed from: p0 */
    public static final FloatingWindowState m41061p0(List list, FloatingWindowState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return FloatingWindowState.copy$default(updateState, list, 0, 2, null);
    }

    /* JADX INFO: renamed from: U */
    public final InterfaceC46556a m41076U() {
        return (InterfaceC46556a) this.f34453f0.getValue();
    }

    /* JADX INFO: renamed from: V */
    public final int m41077V() {
        int size;
        synchronized (this.f34446Y) {
            size = this.f34446Y.size();
            Unit unit = Unit.INSTANCE;
        }
        return size;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public FloatingWindowState getInitState() {
        return new FloatingWindowState(null, 0, 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Y */
    public final Object m41080Y(Continuation<? super String> continuation) {
        FloatingWindowVM$getTopicStrs$1 floatingWindowVM$getTopicStrs$1;
        if (continuation instanceof FloatingWindowVM$getTopicStrs$1) {
            floatingWindowVM$getTopicStrs$1 = (FloatingWindowVM$getTopicStrs$1) continuation;
            int i11 = floatingWindowVM$getTopicStrs$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                floatingWindowVM$getTopicStrs$1.label = i11 - Integer.MIN_VALUE;
            } else {
                floatingWindowVM$getTopicStrs$1 = new FloatingWindowVM$getTopicStrs$1(this, continuation);
            }
        } else {
            floatingWindowVM$getTopicStrs$1 = new FloatingWindowVM$getTopicStrs$1(this, continuation);
        }
        Object objM40735l = floatingWindowVM$getTopicStrs$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = floatingWindowVM$getTopicStrs$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM40735l);
            FloatingWindowConfigManager floatingWindowConfigManager = FloatingWindowConfigManager.f34272a;
            floatingWindowVM$getTopicStrs$1.label = 1;
            objM40735l = floatingWindowConfigManager.m40735l(floatingWindowVM$getTopicStrs$1);
            if (objM40735l == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM40735l);
        }
        ArrayList arrayList = (ArrayList) objM40735l;
        return C27041f.m66668h(arrayList != null ? CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.h2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowVM.m41053Z((String) obj);
            }
        }, 30, null) : null);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m41082b0() {
        String str = this.f34445X;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new C18743xa566d163(C4373b.m3900b(), str, null, this), 2, null);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m41083c0() {
        String str = this.f34445X;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new C18744x710651cf(C4373b.m3900b(), str, null, this), 2, null);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m41084d0() {
        String str = this.f34445X;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new C18745x9e63297a(C4373b.m3900b(), str, null, this), 2, null);
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        if (interfaceC19282d instanceof FloatingWindowContract$FloatingWindowIntent.InitFloating) {
            m41084d0();
        } else if (interfaceC19282d instanceof FloatingWindowContract$FloatingWindowIntent.AddOrRemoveDataIntent) {
            m41072M((FloatingWindowContract$FloatingWindowIntent.AddOrRemoveDataIntent) interfaceC19282d);
        } else if (interfaceC19282d instanceof FloatingWindowContract$FloatingWindowIntent.SortListDataIntent) {
            m41090l0();
        } else if (interfaceC19282d instanceof FloatingWindowContract$FloatingWindowIntent.PageStateIntent) {
            m41094q0((FloatingWindowContract$FloatingWindowIntent.PageStateIntent) interfaceC19282d);
        } else if (interfaceC19282d instanceof FloatingWindowContract$FloatingWindowIntent.UpdateSpanRowIntent) {
            final int pageSize = ((FloatingWindowContract$FloatingWindowIntent.UpdateSpanRowIntent) interfaceC19282d).getPageSize();
            updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.d2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FloatingWindowVM.m41052T(pageSize, (FloatingWindowState) obj);
                }
            });
        } else if (interfaceC19282d instanceof FloatingWindowContract$FloatingWindowIntent.AppBackgroundPollingMonitor) {
            m41086f0((FloatingWindowContract$FloatingWindowIntent.AppBackgroundPollingMonitor) interfaceC19282d);
        } else if (interfaceC19282d instanceof FloatingWindowContract$FloatingWindowIntent.OnDestroyIntent) {
            m41075S();
        } else if (interfaceC19282d instanceof FloatingWindowContract$FloatingWindowIntent.DataUpdateIntervalTimeIntent) {
            m41091m0();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m41085e0() {
        return FloatingActionManager.f34540a.m41341N0();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m41086f0(FloatingWindowContract$FloatingWindowIntent.AppBackgroundPollingMonitor appBackgroundPollingMonitor) {
        InterfaceC41775x1 interfaceC41775x1 = this.f34451d0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f34451d0 = null;
        if (appBackgroundPollingMonitor.getStart()) {
            this.f34451d0 = MviExKt.m42522r(ViewModelKt.getViewModelScope(this), Integer.MAX_VALUE, FloatingActionManager.f34540a.m41364f0() * ((long) 2), null, null, null, new FloatingWindowVM$onBackgroundJobStartOrStop$1(null), 28, null);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m41087g0() {
        String str = this.f34454g0;
        if (str != null) {
            SocketTask socketTaskM85215e = C37781l.f85093a.m85215e(DowngradeExKt.m66551u("/market/watching:%s", new Object[]{str}, null, 2, null), this);
            if (socketTaskM85215e != null) {
                socketTaskM85215e.m58910J();
            }
        }
        this.f34454g0 = null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m41088h0(final List<StateTradeItemBean> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.i2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FloatingWindowVM.m41057i0(list);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public final void m41089j0(List<StateTradeItemBean> list, boolean z11) {
        String str = this.f34445X;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new C18746x6e8570(C4373b.m3900b(), str, null, this, list, z11), 2, null);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m41090l0() {
        String str = this.f34445X;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new C18747x90e6e38a(C4373b.m3900b(), str, null, this), 2, null);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m41091m0() {
        String str = this.f34445X;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new C18748x51a138b8(C4373b.m3900b(), str, null, this), 2, null);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m41092n0() {
        String str = this.f34445X;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new C18749xe8393ede(C4373b.m3900b(), str, null), 2, null);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m41093o0(List<StateTradeItemBean> list) {
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        updateState(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.e2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowVM.m41061p0(arrayList, (FloatingWindowState) obj);
            }
        });
        synchronized (this.f34446Y) {
            this.f34446Y.clear();
            this.f34446Y.addAll(arrayList);
        }
        m41083c0();
    }

    /* JADX INFO: renamed from: Q */
    public static final InterfaceC46556a m41051Q() {
        return (InterfaceC46556a) C42597a.m93390f().create(InterfaceC46556a.class);
    }

    /* JADX INFO: renamed from: M */
    public final void m41072M(FloatingWindowContract$FloatingWindowIntent.AddOrRemoveDataIntent addOrRemoveDataIntent) {
        if (addOrRemoveDataIntent.getSymbolStr().length() == 0) {
            return;
        }
        String str = this.f34445X;
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94120b(), null, new C18738xb50c57be(C4373b.m3900b(), str, null, this, addOrRemoveDataIntent), 2, null);
    }

    /* JADX INFO: renamed from: N */
    public final void m41073N(String str) {
        if (str.length() == 0) {
            return;
        }
        String strM66551u = DowngradeExKt.m66551u("/market/watching:%s", new Object[]{str}, null, 2, null);
        C37779j c37779j = new C37779j();
        c37779j.m85208e(InterfaceC46556a.m102700a(m41076U(), str, "android/" + C45590s.f102687a.m100675Z() + "_widget", null, 4, null));
        c37779j.m85209f(true);
        c37779j.m85207d(new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.f2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FloatingWindowVM.m41049O((Message) obj));
            }
        });
        Unit unit = Unit.INSTANCE;
        C24337a.m58926b(strM66551u, this, c37779j, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.g2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingWindowVM.m41050P(this.f34480b, (Message) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m41074R() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), C42911a.m94121c(), null, new FloatingWindowVM$bindSocketMessage$1(this, null), 2, null);
    }

    /* JADX INFO: renamed from: S */
    public final void m41075S() {
        m41082b0();
    }

    /* JADX INFO: renamed from: X */
    public final StateTradeItemBean m41079X(String str, List<StateTradeItemBean> list) {
        String symbol;
        if (str.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        StateTradeItemBean stateTradeItemBean = null;
        for (StateTradeItemBean stateTradeItemBean2 : list) {
            if (stateTradeItemBean2 != null) {
                symbol = stateTradeItemBean2.getSymbol();
            } else {
                symbol = null;
            }
            if (Intrinsics.areEqual(str, symbol)) {
                stateTradeItemBean = stateTradeItemBean2;
            }
            arrayList.add(Unit.INSTANCE);
        }
        if (stateTradeItemBean != null) {
            list.remove(stateTradeItemBean);
        }
        return stateTradeItemBean;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m41081a0() {
        int iM41077V = m41077V();
        if (!this.f34450c0 && iM41077V > 0) {
            m41093o0(this.f34446Y);
        }
        if (!this.f34450c0 && iM41077V != 0) {
            return;
        }
        m41082b0();
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f34452e0.m41030c();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        this.f34452e0.m41032f();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        this.f34452e0.m41033g();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m41094q0(FloatingWindowContract$FloatingWindowIntent.PageStateIntent pageStateIntent) {
        int type = pageStateIntent.getType();
        if (type != 1 && type != 2) {
            if (type != 3) {
                if (type != 5) {
                    if (type != 6) {
                        return;
                    }
                }
            }
            this.f34450c0 = false;
            m41093o0(this.f34446Y);
            m41083c0();
            return;
        }
        this.f34450c0 = true;
        m41082b0();
    }
}
