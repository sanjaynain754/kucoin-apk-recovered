package com.kubi.mart.sidebar.spot;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.mart.entity.FavoriteMenuEntity;
import com.kubi.mart.entity.FavoriteMenuLevel1Entity;
import com.kubi.mart.entity.FlatSpotMenuEntity;
import com.kubi.mart.entity.FlatSpotMenuLevel1Entity;
import com.kubi.mart.entity.SidebarDataItemEntity;
import com.kubi.mart.entity.SidebarMenuEntity;
import com.kubi.mart.entity.SpotMenuModel;
import com.kubi.mart.sidebar.spot.tablist.data.C18904a;
import com.kubi.mart.sidebar.spot.tablist.data.ITabListGet;
import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.tradingbotkit.api.ITradingBotService;
import com.tencent.bugly.proguard.C33820nf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042bq.InterfaceC4644a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SpotSidebarVM.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0094@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/SpotSidebarVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/mart/sidebar/spot/SpotSidebarContract$UIState;", "<init>", "()V", "initState", "getInitState", "()Lcom/kubi/mart/sidebar/spot/SpotSidebarContract$UIState;", "api", "Lcom/kubi/mart/api/MartApi;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMenus", "sidebarType", "", "symbolCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initBizDiffData", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", FirebaseAnalytics.Event.SEARCH, "keyWord", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotSidebarVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotSidebarVM.kt\ncom/kubi/mart/sidebar/spot/SpotSidebarVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n295#2,2:91\n774#2:94\n865#2,2:95\n2756#2:97\n774#2:99\n865#2,2:100\n1563#2:102\n1634#2,3:103\n1#3:93\n1#3:98\n*S KotlinDebug\n*F\n+ 1 SpotSidebarVM.kt\ncom/kubi/mart/sidebar/spot/SpotSidebarVM\n*L\n51#1:91,2\n60#1:94\n60#1:95,2\n62#1:97\n81#1:99\n81#1:100,2\n87#1:102\n87#1:103,3\n62#1:98\n*E\n"})
public final class SpotSidebarVM extends AbstractC19291m<SpotSidebarContract$UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC4644a f34720X = (InterfaceC4644a) RetrofitFlowExKt.m42820a(InterfaceC4644a.class);

    /* JADX INFO: renamed from: com.kubi.mart.sidebar.spot.SpotSidebarVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: SpotSidebarVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.mart.sidebar.spot.SpotSidebarVM", m90122f = "SpotSidebarVM.kt", m90123i = {0, 1, 2}, m90124l = {29, 31, 35}, m90125m = "dispatchIntent", m90126n = {"intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0"})
    public static final class C188461 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C188461(Continuation<? super C188461> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpotSidebarVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:55:0x013a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0170  */
    /* JADX WARN: Code duplicated, block: B:61:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x019b  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d0 A[LOOP:1: B:76:0x01ca->B:78:0x01d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0195 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: f */
    public final Object m41439f(String str, String str2, Continuation<? super Unit> continuation) {
        SpotSidebarVM$fetchMenus$1 spotSidebarVM$fetchMenus$1;
        String str3;
        String str4;
        InterfaceC41634e<SidebarMenuEntity> interfaceC41634e;
        String str5;
        SidebarMenuEntity sidebarMenuEntity;
        List listEmptyList;
        SpotMenuModel menuModel;
        List arrayList;
        Object objMo41609a;
        SidebarMenuEntity sidebarMenuEntity2;
        List list;
        FavoriteMenuEntity favoriteMenu;
        List<FavoriteMenuLevel1Entity> level1;
        Object next;
        FlatSpotMenuEntity spotMenu;
        List<FlatSpotMenuLevel1Entity> level2;
        Iterator it;
        String str6 = str;
        if (continuation instanceof SpotSidebarVM$fetchMenus$1) {
            spotSidebarVM$fetchMenus$1 = (SpotSidebarVM$fetchMenus$1) continuation;
            int i11 = spotSidebarVM$fetchMenus$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                spotSidebarVM$fetchMenus$1.label = i11 - Integer.MIN_VALUE;
            } else {
                spotSidebarVM$fetchMenus$1 = new SpotSidebarVM$fetchMenus$1(this, continuation);
            }
        } else {
            spotSidebarVM$fetchMenus$1 = new SpotSidebarVM$fetchMenus$1(this, continuation);
        }
        SpotSidebarVM$fetchMenus$1 spotSidebarVM$fetchMenus$2 = spotSidebarVM$fetchMenus$1;
        Object objM42826g = spotSidebarVM$fetchMenus$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = spotSidebarVM$fetchMenus$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            spotSidebarVM$fetchMenus$2.L$0 = str6;
            spotSidebarVM$fetchMenus$2.L$1 = str2;
            spotSidebarVM$fetchMenus$2.label = 1;
            if (m41441o(str6, spotSidebarVM$fetchMenus$2) != coroutine_suspended) {
                str3 = str2;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            String str7 = (String) spotSidebarVM$fetchMenus$2.L$1;
            String str8 = (String) spotSidebarVM$fetchMenus$2.L$0;
            ResultKt.throwOnFailure(objM42826g);
            str3 = str7;
            str6 = str8;
        } else {
            if (i12 == 2) {
                interfaceC41634e = (InterfaceC41634e) spotSidebarVM$fetchMenus$2.L$2;
                str5 = (String) spotSidebarVM$fetchMenus$2.L$1;
                str4 = (String) spotSidebarVM$fetchMenus$2.L$0;
                ResultKt.throwOnFailure(objM42826g);
                sidebarMenuEntity = (SidebarMenuEntity) ((C19334f) objM42826g).m42846a();
                listEmptyList = null;
                if (sidebarMenuEntity != null || (favoriteMenu = sidebarMenuEntity.getFavoriteMenu()) == null || (level1 = favoriteMenu.getLevel1()) == null) {
                    menuModel = null;
                } else {
                    Iterator<T> it2 = level1.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        FavoriteMenuLevel1Entity favoriteMenuLevel1Entity = (FavoriteMenuLevel1Entity) next;
                        if (Intrinsics.areEqual(sidebarMenuEntity.getFavoriteMenu().getEnabled(), Boxing.boxBoolean(true)) && Intrinsics.areEqual(favoriteMenuLevel1Entity.getEnabled(), Boxing.boxBoolean(true))) {
                            break;
                        }
                    }
                    FavoriteMenuLevel1Entity favoriteMenuLevel1Entity2 = (FavoriteMenuLevel1Entity) next;
                    if (favoriteMenuLevel1Entity2 != null) {
                        menuModel = favoriteMenuLevel1Entity2.toMenuModel();
                    } else {
                        menuModel = null;
                    }
                }
                arrayList = new ArrayList();
                if (menuModel != null) {
                    arrayList.add(menuModel);
                    ITabListGet iTabListGetCreate = ITabListGet.f34832a.create(str4, str5, menuModel);
                    spotSidebarVM$fetchMenus$2.L$0 = SpillingKt.nullOutSpilledVariable(str4);
                    spotSidebarVM$fetchMenus$2.L$1 = SpillingKt.nullOutSpilledVariable(str5);
                    spotSidebarVM$fetchMenus$2.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41634e);
                    spotSidebarVM$fetchMenus$2.L$3 = sidebarMenuEntity;
                    spotSidebarVM$fetchMenus$2.L$4 = SpillingKt.nullOutSpilledVariable(menuModel);
                    spotSidebarVM$fetchMenus$2.L$5 = arrayList;
                    spotSidebarVM$fetchMenus$2.L$6 = SpillingKt.nullOutSpilledVariable(menuModel);
                    spotSidebarVM$fetchMenus$2.I$0 = 0;
                    spotSidebarVM$fetchMenus$2.label = 3;
                    objMo41609a = iTabListGetCreate.mo41609a(spotSidebarVM$fetchMenus$2);
                    if (objMo41609a != coroutine_suspended) {
                        sidebarMenuEntity2 = sidebarMenuEntity;
                        objM42826g = objMo41609a;
                        list = arrayList;
                    }
                    return coroutine_suspended;
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                if (sidebarMenuEntity != null && (spotMenu = sidebarMenuEntity.getSpotMenu()) != null && (level2 = spotMenu.getLevel1()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : level2) {
                        FlatSpotMenuLevel1Entity flatSpotMenuLevel1Entity = (FlatSpotMenuLevel1Entity) obj;
                        if (!Intrinsics.areEqual(sidebarMenuEntity.getSpotMenu().getEnabled(), Boxing.boxBoolean(true)) && Intrinsics.areEqual(flatSpotMenuLevel1Entity.getEnabled(), Boxing.boxBoolean(true))) {
                            arrayList2.add(obj);
                        }
                    }
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((FlatSpotMenuLevel1Entity) it.next()).toMenuModel());
                    }
                }
                if (arrayList.isEmpty()) {
                    send(SingleEvent.C19249e.f35628b);
                } else {
                    send(new C18847a(arrayList, !listEmptyList.isEmpty()));
                }
                return Unit.INSTANCE;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) spotSidebarVM$fetchMenus$2.L$5;
            sidebarMenuEntity2 = (SidebarMenuEntity) spotSidebarVM$fetchMenus$2.L$3;
            ResultKt.throwOnFailure(objM42826g);
        }
        listEmptyList = (List) objM42826g;
        arrayList = list;
        sidebarMenuEntity = sidebarMenuEntity2;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (sidebarMenuEntity != null) {
            ArrayList arrayList3 = new ArrayList();
            while (r1.hasNext()) {
                FlatSpotMenuLevel1Entity flatSpotMenuLevel1Entity2 = (FlatSpotMenuLevel1Entity) obj;
                if (!Intrinsics.areEqual(sidebarMenuEntity.getSpotMenu().getEnabled(), Boxing.boxBoolean(true))) {
                }
            }
            it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(((FlatSpotMenuLevel1Entity) it.next()).toMenuModel());
            }
        }
        if (arrayList.isEmpty()) {
            send(new C18847a(arrayList, !listEmptyList.isEmpty()));
        } else {
            send(SingleEvent.C19249e.f35628b);
        }
        return Unit.INSTANCE;
        InterfaceC41634e<SidebarMenuEntity> interfaceC41634eM4588b = (!Intrinsics.areEqual(str6, "spot_kline") || str3.length() <= 0) ? this.f34720X.m4588b() : this.f34720X.m4587a((String) StringsKt.split$default((CharSequence) str3, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null).get(0));
        spotSidebarVM$fetchMenus$2.L$0 = str6;
        spotSidebarVM$fetchMenus$2.L$1 = str3;
        spotSidebarVM$fetchMenus$2.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41634eM4588b);
        spotSidebarVM$fetchMenus$2.label = 2;
        objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM4588b, false, null, spotSidebarVM$fetchMenus$2, 2, null);
        if (objM42826g != coroutine_suspended) {
            str4 = str6;
            interfaceC41634e = interfaceC41634eM4588b;
            str5 = str3;
            sidebarMenuEntity = (SidebarMenuEntity) ((C19334f) objM42826g).m42846a();
            listEmptyList = null;
            if (sidebarMenuEntity != null) {
                menuModel = null;
            } else {
                menuModel = null;
            }
            arrayList = new ArrayList();
            if (menuModel != null) {
                arrayList.add(menuModel);
                ITabListGet iTabListGetCreate2 = ITabListGet.f34832a.create(str4, str5, menuModel);
                spotSidebarVM$fetchMenus$2.L$0 = SpillingKt.nullOutSpilledVariable(str4);
                spotSidebarVM$fetchMenus$2.L$1 = SpillingKt.nullOutSpilledVariable(str5);
                spotSidebarVM$fetchMenus$2.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41634e);
                spotSidebarVM$fetchMenus$2.L$3 = sidebarMenuEntity;
                spotSidebarVM$fetchMenus$2.L$4 = SpillingKt.nullOutSpilledVariable(menuModel);
                spotSidebarVM$fetchMenus$2.L$5 = arrayList;
                spotSidebarVM$fetchMenus$2.L$6 = SpillingKt.nullOutSpilledVariable(menuModel);
                spotSidebarVM$fetchMenus$2.I$0 = 0;
                spotSidebarVM$fetchMenus$2.label = 3;
                objMo41609a = iTabListGetCreate2.mo41609a(spotSidebarVM$fetchMenus$2);
                if (objMo41609a != coroutine_suspended) {
                    sidebarMenuEntity2 = sidebarMenuEntity;
                    objM42826g = objMo41609a;
                    list = arrayList;
                    listEmptyList = (List) objM42826g;
                    arrayList = list;
                    sidebarMenuEntity = sidebarMenuEntity2;
                }
            }
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            if (sidebarMenuEntity != null) {
                ArrayList arrayList4 = new ArrayList();
                while (r1.hasNext()) {
                    FlatSpotMenuLevel1Entity flatSpotMenuLevel1Entity3 = (FlatSpotMenuLevel1Entity) obj;
                    if (!Intrinsics.areEqual(sidebarMenuEntity.getSpotMenu().getEnabled(), Boxing.boxBoolean(true))) {
                    }
                }
                it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((FlatSpotMenuLevel1Entity) it.next()).toMenuModel());
                }
            }
            if (arrayList.isEmpty()) {
                send(new C18847a(arrayList, !listEmptyList.isEmpty()));
            } else {
                send(SingleEvent.C19249e.f35628b);
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (m41439f(r2, r8, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (m41442p(r2, r8, r0) == r1) goto L32;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C188461 c188461;
        if (continuation instanceof C188461) {
            c188461 = (C188461) continuation;
            int i11 = c188461.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c188461.label = i11 - Integer.MIN_VALUE;
            } else {
                c188461 = new C188461(continuation);
            }
        } else {
            c188461 = new C188461(continuation);
        }
        Object obj = c188461.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c188461.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c188461.L$0 = interfaceC19282d;
            c188461.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c188461) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        interfaceC19282d = (InterfaceC19282d) c188461.L$0;
        ResultKt.throwOnFailure(obj);
        if (interfaceC19282d instanceof SpotSidebarContract$UIIntent.FetchMenus) {
            SpotSidebarContract$UIIntent.FetchMenus fetchMenus = (SpotSidebarContract$UIIntent.FetchMenus) interfaceC19282d;
            String sidebarType = fetchMenus.getSidebarType();
            String symbolCode = fetchMenus.getSymbolCode();
            c188461.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c188461.label = 2;
        } else {
            if (!(interfaceC19282d instanceof SpotSidebarContract$UIIntent.SearchInput)) {
                return Unit.INSTANCE;
            }
            SpotSidebarContract$UIIntent.SearchInput searchInput = (SpotSidebarContract$UIIntent.SearchInput) interfaceC19282d;
            String sidebarType2 = searchInput.getSidebarType();
            String keyWord = searchInput.getKeyWord();
            c188461.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c188461.label = 3;
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.mart.sidebar.spot.SpotSidebarContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public SpotSidebarContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.mart.sidebar.spot.SpotSidebarContract$UIState
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m41441o(String str, Continuation<? super Unit> continuation) {
        SpotSidebarVM$initBizDiffData$1 spotSidebarVM$initBizDiffData$1;
        if (continuation instanceof SpotSidebarVM$initBizDiffData$1) {
            spotSidebarVM$initBizDiffData$1 = (SpotSidebarVM$initBizDiffData$1) continuation;
            int i11 = spotSidebarVM$initBizDiffData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                spotSidebarVM$initBizDiffData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                spotSidebarVM$initBizDiffData$1 = new SpotSidebarVM$initBizDiffData$1(this, continuation);
            }
        } else {
            spotSidebarVM$initBizDiffData$1 = new SpotSidebarVM$initBizDiffData$1(this, continuation);
        }
        Object objMo63685j = spotSidebarVM$initBizDiffData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = spotSidebarVM$initBizDiffData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo63685j);
            if (Intrinsics.areEqual(str, "spot_grid")) {
                ITradingBotService iTradingBotService = ITradingBotService.f52126a.get();
                spotSidebarVM$initBizDiffData$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                spotSidebarVM$initBizDiffData$1.label = 1;
                objMo63685j = iTradingBotService.mo63685j(spotSidebarVM$initBizDiffData$1);
                if (objMo63685j == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objMo63685j);
        C18904a.m41616b((HashSet) objMo63685j);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: p */
    public final Object m41442p(String str, String str2, Continuation<? super Unit> continuation) {
        SpotSidebarVM$search$1 spotSidebarVM$search$1;
        List listEmptyList;
        boolean zContains;
        if (continuation instanceof SpotSidebarVM$search$1) {
            spotSidebarVM$search$1 = (SpotSidebarVM$search$1) continuation;
            int i11 = spotSidebarVM$search$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                spotSidebarVM$search$1.label = i11 - Integer.MIN_VALUE;
            } else {
                spotSidebarVM$search$1 = new SpotSidebarVM$search$1(this, continuation);
            }
        } else {
            spotSidebarVM$search$1 = new SpotSidebarVM$search$1(this, continuation);
        }
        SpotSidebarVM$search$1 spotSidebarVM$search$2 = spotSidebarVM$search$1;
        Object objM42826g = spotSidebarVM$search$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = spotSidebarVM$search$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            InterfaceC41634e<List<SidebarDataItemEntity>> interfaceC41634eM4589c = this.f34720X.m4589c(str2);
            spotSidebarVM$search$2.L$0 = str;
            spotSidebarVM$search$2.L$1 = str2;
            spotSidebarVM$search$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM4589c, false, null, spotSidebarVM$search$2, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) spotSidebarVM$search$2.L$1;
            str = (String) spotSidebarVM$search$2.L$0;
            ResultKt.throwOnFailure(objM42826g);
        }
        List list = (List) ((C19334f) objM42826g).m42846a();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                SidebarDataItemEntity sidebarDataItemEntity = (SidebarDataItemEntity) obj;
                if (Intrinsics.areEqual(str, "spot_grid")) {
                    Iterable iterableM41615a = C18904a.m41615a();
                    if (iterableM41615a == null) {
                        iterableM41615a = SetsKt.emptySet();
                    }
                    zContains = CollectionsKt.contains(iterableM41615a, sidebarDataItemEntity.getSymbol());
                } else {
                    zContains = true;
                }
                if (zContains) {
                    arrayList.add(obj);
                }
            }
            listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                listEmptyList.add(((SidebarDataItemEntity) it.next()).toTradeItemBean());
            }
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        send(new C18848b(str2, listEmptyList));
        return Unit.INSTANCE;
    }
}
