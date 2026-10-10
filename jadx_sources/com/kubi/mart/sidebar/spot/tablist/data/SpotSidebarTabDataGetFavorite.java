package com.kubi.mart.sidebar.spot.tablist.data;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.mart.entity.SidebarDataEntity;
import com.kubi.mart.entity.SidebarDataItemEntity;
import com.kubi.mart.entity.SpotMenuModel;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import gf.C37890n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p268fq.C37579b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SpotSidebarTabDataGetFavorite.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0096@¢\u0006\u0002\u0010\u000bJ,\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetFavorite;", "Lcom/kubi/mart/sidebar/spot/tablist/data/ITabListGet;", "sidebarType", "", "menuModel", "Lcom/kubi/mart/entity/SpotMenuModel;", "<init>", "(Ljava/lang/String;Lcom/kubi/mart/entity/SpotMenuModel;)V", "fetchList", "", "Lcom/kubi/data/entity/TradeItemBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPageList", "", "dataList", "", "Lcom/kubi/mart/entity/SidebarDataItemEntity;", "pageNum", "", "pageSize", "(Ljava/util/List;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteListUnlogin", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotSidebarTabDataGetFavorite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotSidebarTabDataGetFavorite.kt\ncom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetFavorite\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n774#2:66\n865#2,2:67\n1563#2:69\n1634#2,3:70\n774#2:74\n865#2,2:75\n1563#2:77\n1634#2,3:78\n1#3:73\n*S KotlinDebug\n*F\n+ 1 SpotSidebarTabDataGetFavorite.kt\ncom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetFavorite\n*L\n29#1:66\n29#1:67,2\n34#1:69\n34#1:70,3\n57#1:74\n57#1:75,2\n63#1:77\n63#1:78,3\n*E\n"})
public final class SpotSidebarTabDataGetFavorite implements ITabListGet {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f34837b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final SpotMenuModel f34838c;

    public SpotSidebarTabDataGetFavorite(@NotNull String sidebarType, @NotNull SpotMenuModel menuModel) {
        Intrinsics.checkNotNullParameter(sidebarType, "sidebarType");
        Intrinsics.checkNotNullParameter(menuModel, "menuModel");
        this.f34837b = sidebarType;
        this.f34838c = menuModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        if (m41613c(r9, r1 + 1, r3, r4) == r0) goto L29;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m41613c(List<SidebarDataItemEntity> list, int i11, int i12, Continuation<? super Unit> continuation) {
        SpotSidebarTabDataGetFavorite$fetchPageList$1 spotSidebarTabDataGetFavorite$fetchPageList$1;
        if (continuation instanceof SpotSidebarTabDataGetFavorite$fetchPageList$1) {
            spotSidebarTabDataGetFavorite$fetchPageList$1 = (SpotSidebarTabDataGetFavorite$fetchPageList$1) continuation;
            int i13 = spotSidebarTabDataGetFavorite$fetchPageList$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                spotSidebarTabDataGetFavorite$fetchPageList$1.label = i13 - Integer.MIN_VALUE;
            } else {
                spotSidebarTabDataGetFavorite$fetchPageList$1 = new SpotSidebarTabDataGetFavorite$fetchPageList$1(this, continuation);
            }
        } else {
            spotSidebarTabDataGetFavorite$fetchPageList$1 = new SpotSidebarTabDataGetFavorite$fetchPageList$1(this, continuation);
        }
        SpotSidebarTabDataGetFavorite$fetchPageList$1 spotSidebarTabDataGetFavorite$fetchPageList$2 = spotSidebarTabDataGetFavorite$fetchPageList$1;
        Object objM42826g = spotSidebarTabDataGetFavorite$fetchPageList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i14 = spotSidebarTabDataGetFavorite$fetchPageList$2.label;
        if (i14 == 0) {
            ResultKt.throwOnFailure(objM42826g);
            InterfaceC41634e<SidebarDataEntity> interfaceC41634eM4590d = C37579b.m84712a().m4590d(this.f34838c.getConcept(), i11, i12);
            spotSidebarTabDataGetFavorite$fetchPageList$2.L$0 = list;
            spotSidebarTabDataGetFavorite$fetchPageList$2.I$0 = i11;
            spotSidebarTabDataGetFavorite$fetchPageList$2.I$1 = i12;
            spotSidebarTabDataGetFavorite$fetchPageList$2.label = 1;
            objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM4590d, false, null, spotSidebarTabDataGetFavorite$fetchPageList$2, 2, null);
            if (objM42826g != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i14 == 1) {
            i12 = spotSidebarTabDataGetFavorite$fetchPageList$2.I$1;
            i11 = spotSidebarTabDataGetFavorite$fetchPageList$2.I$0;
            list = (List) spotSidebarTabDataGetFavorite$fetchPageList$2.L$0;
            ResultKt.throwOnFailure(objM42826g);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42826g);
        }
        return Unit.INSTANCE;
        SidebarDataEntity sidebarDataEntity = (SidebarDataEntity) ((C19334f) objM42826g).m42846a();
        if (sidebarDataEntity != null) {
            Collection<? extends SidebarDataItemEntity> items = sidebarDataEntity.getItems();
            if (items != null) {
                Boxing.boxBoolean(list.addAll(items));
            }
            int iM66650j = C27039d.m66650j(sidebarDataEntity.getCurrentPage());
            if (iM66650j < C27039d.m66650j(sidebarDataEntity.getTotalPage())) {
                int iM66651k = C27039d.m66651k(sidebarDataEntity.getPageSize(), i12);
                spotSidebarTabDataGetFavorite$fetchPageList$2.L$0 = SpillingKt.nullOutSpilledVariable(list);
                spotSidebarTabDataGetFavorite$fetchPageList$2.L$1 = SpillingKt.nullOutSpilledVariable(sidebarDataEntity);
                spotSidebarTabDataGetFavorite$fetchPageList$2.I$0 = i11;
                spotSidebarTabDataGetFavorite$fetchPageList$2.I$1 = i12;
                spotSidebarTabDataGetFavorite$fetchPageList$2.I$2 = iM66650j;
                spotSidebarTabDataGetFavorite$fetchPageList$2.label = 2;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mart.sidebar.spot.tablist.data.ITabListGet
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo41609a(@NotNull Continuation<? super List<? extends TradeItemBean>> continuation) {
        SpotSidebarTabDataGetFavorite$fetchList$1 spotSidebarTabDataGetFavorite$fetchList$1;
        List<SidebarDataItemEntity> list;
        boolean zContains;
        if (continuation instanceof SpotSidebarTabDataGetFavorite$fetchList$1) {
            spotSidebarTabDataGetFavorite$fetchList$1 = (SpotSidebarTabDataGetFavorite$fetchList$1) continuation;
            int i11 = spotSidebarTabDataGetFavorite$fetchList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                spotSidebarTabDataGetFavorite$fetchList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                spotSidebarTabDataGetFavorite$fetchList$1 = new SpotSidebarTabDataGetFavorite$fetchList$1(this, continuation);
            }
        } else {
            spotSidebarTabDataGetFavorite$fetchList$1 = new SpotSidebarTabDataGetFavorite$fetchList$1(this, continuation);
        }
        Object obj = spotSidebarTabDataGetFavorite$fetchList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = spotSidebarTabDataGetFavorite$fetchList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!UserInfo.a.n()) {
                return m41614d();
            }
            List<SidebarDataItemEntity> arrayList = new ArrayList<>();
            int count = this.f34838c.getCount();
            spotSidebarTabDataGetFavorite$fetchList$1.L$0 = arrayList;
            spotSidebarTabDataGetFavorite$fetchList$1.label = 1;
            if (m41613c(arrayList, 1, count, spotSidebarTabDataGetFavorite$fetchList$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) spotSidebarTabDataGetFavorite$fetchList$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            SidebarDataItemEntity sidebarDataItemEntity = (SidebarDataItemEntity) obj2;
            if (Intrinsics.areEqual(this.f34837b, "spot_grid")) {
                Iterable iterableM41615a = C18904a.m41615a();
                if (iterableM41615a == null) {
                    iterableM41615a = SetsKt.emptySet();
                }
                zContains = CollectionsKt.contains(iterableM41615a, sidebarDataItemEntity.getSymbol());
            } else {
                zContains = true;
            }
            if (zContains) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((SidebarDataItemEntity) it.next()).toTradeItemBean());
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: d */
    public final List<TradeItemBean> m41614d() {
        boolean zContains;
        List listM66558a = C27024b.m66558a(IQuoteFacadeService.f41383a.get().mo50707j());
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listM66558a) {
            String str = (String) obj;
            if (Intrinsics.areEqual(this.f34837b, "spot_grid")) {
                Set setM41615a = C18904a.m41615a();
                if (setM41615a == null) {
                    setM41615a = SetsKt.emptySet();
                }
                zContains = setM41615a.contains(str);
            } else {
                zContains = str.length() > 0;
            }
            if (zContains) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (String str2 : arrayList) {
            TradeItemBean tradeItemBeanM85603D = C37890n.f85269a.m85603D(str2);
            if (tradeItemBeanM85603D == null) {
                tradeItemBeanM85603D = new TradeItemBean(str2);
            }
            arrayList2.add(tradeItemBeanM85603D);
        }
        return arrayList2;
    }
}
