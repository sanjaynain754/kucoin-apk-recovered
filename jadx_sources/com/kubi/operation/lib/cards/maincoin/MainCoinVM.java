package com.kubi.operation.lib.cards.maincoin;

import com.google.gson.reflect.TypeToken;
import com.kubi.mvi.common.C19241c;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.operation.lib.api.OperationApi;
import com.kubi.operation.lib.entity.MainCoinDataEntity;
import com.kubi.operation.lib.entity.WsEntity;
import com.kubi.operation.lib.utils.C19570t;
import com.kubi.sdk.websocket.SocketTask;
import com.kubi.sdk.websocket.WebSocketException;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p479nw.Label;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: MainCoinVM.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0094@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/maincoin/MainCoinVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/operation/lib/cards/maincoin/MainCoinCardContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/operation/lib/api/OperationApi;", "initState", "getInitState", "()Lcom/kubi/operation/lib/cards/maincoin/MainCoinCardContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "ignoreCacheTime", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWsData", "dataList", "", "Lcom/kubi/operation/lib/entity/MainCoinDataEntity;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMainCoinVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainCoinVM.kt\ncom/kubi/operation/lib/cards/maincoin/MainCoinVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt\n*L\n1#1,61:1\n2756#2:62\n774#2:64\n865#2,2:65\n1563#2:67\n1634#2,3:68\n1#3:63\n36#4,6:71\n54#4:77\n*S KotlinDebug\n*F\n+ 1 MainCoinVM.kt\ncom/kubi/operation/lib/cards/maincoin/MainCoinVM\n*L\n40#1:62\n52#1:64\n52#1:65,2\n56#1:67\n56#1:68,3\n40#1:63\n57#1:71,6\n57#1:77\n*E\n"})
public final class MainCoinVM extends AbstractC19291m<MainCoinCardContract$UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final OperationApi f36698X = (OperationApi) RetrofitFlowExKt.m42820a(OperationApi.class);

    /* JADX INFO: renamed from: com.kubi.operation.lib.cards.maincoin.MainCoinVM$a */
    /* JADX INFO: compiled from: SocketEx.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSocketEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt$bindSocket$1\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 JsonEx.kt\ncom/kubi/mvi/common/JsonExKt\n+ 4 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 5 MainCoinVM.kt\ncom/kubi/operation/lib/cards/maincoin/MainCoinVM\n+ 6 WebSocketIssue.kt\ncom/kubi/sdk/websocket/WebSocketIssueKt\n*L\n1#1,223:1\n50#2,7:224\n57#2,10:238\n36#3:231\n137#4,5:232\n59#5:237\n46#6,2:248\n*S KotlinDebug\n*F\n+ 1 SocketEx.kt\ncom/kubi/sdk/websocket/SocketExKt$bindSocket$1\n*L\n42#1:224,7\n42#1:238,10\n43#1:231\n43#1:232,5\n50#1:248,2\n*E\n"})
    public static final class C19461a implements Function1<String, Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f36699b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MainCoinVM f36700c;

        /* JADX INFO: renamed from: com.kubi.operation.lib.cards.maincoin.MainCoinVM$a$a */
        /* JADX INFO: compiled from: GsonUtils.kt */
        @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0004"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/mvi/common/JsonExKt$convertToObj$$inlined$fromJSONOrNull$1", "com/kubi/sdk/websocket/SocketExKt$bindSocket$1$invoke$lambda$2$$inlined$convertToObj$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,195:1\n*E\n"})
        public static final class a extends TypeToken<WsEntity> {
        }

        public C19461a(String str, MainCoinVM mainCoinVM) {
            this.f36699b = str;
            this.f36700c = mainCoinVM;
        }

        /* JADX INFO: renamed from: a */
        public final void m43373a(String it) throws Throwable {
            Object objM103844constructorimpl;
            Object objM66914d;
            Intrinsics.checkNotNullParameter(it, "it");
            String str = this.f36699b;
            boolean zM42528a = C19241c.f35620a.m42528a();
            boolean z11 = !zM42528a;
            try {
                Result.Companion companion = Result.INSTANCE;
                try {
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d = C27099x.m66914d(it, new a().getType());
                } catch (Throwable th2) {
                    C43846g.m96569d(th2, "GsonUtils", null, 4, null);
                    objM66914d = null;
                }
                if (objM66914d != null) {
                    this.f36700c.send(new C19469h(((WsEntity) objM66914d).getData()));
                    C44128b.m97259c("socket", "Topic->" + str + " 数据解析成功！");
                } else {
                    C44128b.m97259c("socket", "Topic->" + str + " 数据解析失败！");
                    objM66914d = Unit.INSTANCE;
                }
                objM103844constructorimpl = Result.m103844constructorimpl(objM66914d);
            } catch (Throwable th3) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th3));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                if (zM42528a || (thM103847exceptionOrNullimpl instanceof CancellationException)) {
                    throw thM103847exceptionOrNullimpl;
                }
                C44128b.m97262f("crash_issue", "crash_issue->【Socket 发生错误:needCatch->" + z11 + (char) 12305, thM103847exceptionOrNullimpl);
            }
            Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl2 != null) {
                C43846g.m96568c(new WebSocketException(thM103847exceptionOrNullimpl2, "SocketEx", false, null, 8, null), null, 2, null);
                C44128b.m97262f("socket", "topic->" + thM103847exceptionOrNullimpl2 + "->【MVI bindSocket发生错误】", thM103847exceptionOrNullimpl2);
            }
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) throws Throwable {
            m43373a(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: o */
    public final Object m43369o(boolean z11, Continuation<? super Unit> continuation) {
        MainCoinVM$loadData$1 mainCoinVM$loadData$1;
        Long l11;
        List<MainCoinDataEntity> list;
        if (continuation instanceof MainCoinVM$loadData$1) {
            mainCoinVM$loadData$1 = (MainCoinVM$loadData$1) continuation;
            int i11 = mainCoinVM$loadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mainCoinVM$loadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                mainCoinVM$loadData$1 = new MainCoinVM$loadData$1(this, continuation);
            }
        } else {
            mainCoinVM$loadData$1 = new MainCoinVM$loadData$1(this, continuation);
        }
        MainCoinVM$loadData$1 mainCoinVM$loadData$2 = mainCoinVM$loadData$1;
        Object obj = mainCoinVM$loadData$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = mainCoinVM$loadData$2.label;
        if (i12 != 0) {
            if (i12 == 1) {
                z11 = mainCoinVM$loadData$2.Z$0;
                l11 = (Long) mainCoinVM$loadData$2.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) mainCoinVM$loadData$2.L$1;
                ResultKt.throwOnFailure(obj);
            }
            m43372p(list);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Long lBoxLong = z11 ? null : Boxing.boxLong(30000L);
        InterfaceC41634e<List<MainCoinDataEntity>> interfaceC41634eM43297n = this.f36698X.m43297n(lBoxLong);
        mainCoinVM$loadData$2.L$0 = SpillingKt.nullOutSpilledVariable(lBoxLong);
        mainCoinVM$loadData$2.Z$0 = z11;
        mainCoinVM$loadData$2.label = 1;
        Object objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM43297n, false, null, mainCoinVM$loadData$2, 2, null);
        if (objM42826g != coroutine_suspended) {
            l11 = lBoxLong;
            obj = objM42826g;
        }
        return coroutine_suspended;
        List<MainCoinDataEntity> listEmptyList = (List) ((C19334f) obj).m42846a();
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (z11 && listEmptyList.isEmpty()) {
            return Unit.INSTANCE;
        }
        for (MainCoinDataEntity mainCoinDataEntity : listEmptyList) {
            MainCoinLineHelper mainCoinLineHelper = MainCoinLineHelper.f36716a;
            mainCoinDataEntity.setFormattedTrendList(mainCoinLineHelper.m43382g(mainCoinDataEntity.getTrendList()));
            List<Label> listM43381f = mainCoinLineHelper.m43381f(5, mainCoinDataEntity.getFormattedTrendList());
            if (listM43381f == null) {
                listM43381f = CollectionsKt.emptyList();
            }
            mainCoinDataEntity.setYLabels(listM43381f);
        }
        send(new C19468g(listEmptyList));
        if (!listEmptyList.isEmpty()) {
            mainCoinVM$loadData$2.L$0 = SpillingKt.nullOutSpilledVariable(l11);
            mainCoinVM$loadData$2.L$1 = listEmptyList;
            mainCoinVM$loadData$2.Z$0 = z11;
            mainCoinVM$loadData$2.label = 2;
            if (DelayKt.m90350b(500L, mainCoinVM$loadData$2) != coroutine_suspended) {
                list = listEmptyList;
                m43372p(list);
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final CharSequence m43370q(MainCoinDataEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return C27041f.m66668h(it.getSymbol());
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        if (!(interfaceC19282d instanceof MainCoinCardContract$UiIntent.LoadData)) {
            return Unit.INSTANCE;
        }
        Object objM43369o = m43369o(((MainCoinCardContract$UiIntent.LoadData) interfaceC19282d).getIgnoreCacheTime(), continuation);
        return objM43369o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM43369o : Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.operation.lib.cards.maincoin.MainCoinCardContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public MainCoinCardContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.operation.lib.cards.maincoin.MainCoinCardContract$UIState
        };
    }

    /* JADX INFO: renamed from: p */
    public final void m43372p(List<MainCoinDataEntity> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String symbol = ((MainCoinDataEntity) obj).getSymbol();
            if (!(symbol == null || symbol.length() == 0)) {
                arrayList.add(obj);
            }
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: com.kubi.operation.lib.cards.maincoin.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return MainCoinVM.m43370q((MainCoinDataEntity) obj2);
            }
        }, 30, null);
        C19570t.m43669g("MainCoin:registerWsData->" + strJoinToString$default);
        if (strJoinToString$default.length() == 0) {
            return;
        }
        List listSplit$default = StringsKt.split$default((CharSequence) strJoinToString$default, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList2.add(DowngradeExKt.m66551u("/market/snapshot_app:%s", new Object[]{(String) it.next()}, null, 2, null));
        }
        String strM66551u = DowngradeExKt.m66551u("/market/snapshot_app:%s", new Object[]{strJoinToString$default}, null, 2, null);
        SocketTask.Companion.obtain$default(SocketTask.f48571i, strM66551u, this, null, 4, null).m58923y(arrayList2).m58911j(new C19461a(strM66551u, this));
    }
}
