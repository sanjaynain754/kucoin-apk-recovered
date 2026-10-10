package com.kubi.mart.sidebar.spot.tablist.data;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.mart.entity.SidebarDataEntity;
import com.kubi.mart.entity.SidebarDataItemEntity;
import com.kubi.mart.entity.SpotMenuModel;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.utils.extensions.C27039d;
import com.tencent.bugly.proguard.C33820nf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SpotSidebarTabDataGetArea.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0002\u0010\fJ,\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;", "Lcom/kubi/mart/sidebar/spot/tablist/data/ITabListGet;", "sidebarType", "", "menuModel", "Lcom/kubi/mart/entity/SpotMenuModel;", "symbolCode", "<init>", "(Ljava/lang/String;Lcom/kubi/mart/entity/SpotMenuModel;Ljava/lang/String;)V", "fetchList", "", "Lcom/kubi/data/entity/TradeItemBean;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchPageList", "", "dataList", "", "Lcom/kubi/mart/entity/SidebarDataItemEntity;", "pageNum", "", "pageSize", "(Ljava/util/List;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotSidebarTabDataGetArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotSidebarTabDataGetArea.kt\ncom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n774#2:58\n865#2,2:59\n1563#2:61\n1634#2,3:62\n1#3:65\n*S KotlinDebug\n*F\n+ 1 SpotSidebarTabDataGetArea.kt\ncom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea\n*L\n26#1:58\n26#1:59,2\n31#1:61\n31#1:62,3\n*E\n"})
public final class SpotSidebarTabDataGetArea implements ITabListGet {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f34834b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final SpotMenuModel f34835c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final String f34836d;

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010a, code lost:
    
        if (m41611c(r12, r6 + 1, r9, r8) == r4) goto L34;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m41611c(List<SidebarDataItemEntity> list, int i11, int i12, Continuation<? super Unit> continuation) {
        SpotSidebarTabDataGetArea$fetchPageList$1 spotSidebarTabDataGetArea$fetchPageList$1;
        List<SidebarDataItemEntity> list2;
        String str;
        int i13 = i11;
        int i14 = i12;
        if (continuation instanceof SpotSidebarTabDataGetArea$fetchPageList$1) {
            spotSidebarTabDataGetArea$fetchPageList$1 = (SpotSidebarTabDataGetArea$fetchPageList$1) continuation;
            int i15 = spotSidebarTabDataGetArea$fetchPageList$1.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                spotSidebarTabDataGetArea$fetchPageList$1.label = i15 - Integer.MIN_VALUE;
            } else {
                spotSidebarTabDataGetArea$fetchPageList$1 = new SpotSidebarTabDataGetArea$fetchPageList$1(this, continuation);
            }
        } else {
            spotSidebarTabDataGetArea$fetchPageList$1 = new SpotSidebarTabDataGetArea$fetchPageList$1(this, continuation);
        }
        SpotSidebarTabDataGetArea$fetchPageList$1 spotSidebarTabDataGetArea$fetchPageList$2 = spotSidebarTabDataGetArea$fetchPageList$1;
        Object obj = spotSidebarTabDataGetArea$fetchPageList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i16 = spotSidebarTabDataGetArea$fetchPageList$2.label;
        if (i16 == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = Intrinsics.areEqual(this.f34835c.getTabType(), "DYNAMIC") ? (String) StringsKt.split$default((CharSequence) this.f34836d, new String[]{C33820nf.f71144W}, false, 0, 6, (Object) null).get(0) : null;
            InterfaceC41634e<SidebarDataEntity> interfaceC41634eM4591e = C37579b.m84712a().m4591e(this.f34835c.getConcept(), str2, i13, i14);
            list2 = list;
            spotSidebarTabDataGetArea$fetchPageList$2.L$0 = list2;
            spotSidebarTabDataGetArea$fetchPageList$2.L$1 = SpillingKt.nullOutSpilledVariable(str2);
            spotSidebarTabDataGetArea$fetchPageList$2.I$0 = i13;
            spotSidebarTabDataGetArea$fetchPageList$2.I$1 = i14;
            spotSidebarTabDataGetArea$fetchPageList$2.label = 1;
            Object objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM4591e, false, null, spotSidebarTabDataGetArea$fetchPageList$2, 2, null);
            if (objM42826g != coroutine_suspended) {
                str = str2;
                obj = objM42826g;
            }
            return coroutine_suspended;
        }
        if (i16 == 1) {
            int i17 = spotSidebarTabDataGetArea$fetchPageList$2.I$1;
            int i18 = spotSidebarTabDataGetArea$fetchPageList$2.I$0;
            str = (String) spotSidebarTabDataGetArea$fetchPageList$2.L$1;
            List<SidebarDataItemEntity> list3 = (List) spotSidebarTabDataGetArea$fetchPageList$2.L$0;
            ResultKt.throwOnFailure(obj);
            i14 = i17;
            i13 = i18;
            list2 = list3;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
        SidebarDataEntity sidebarDataEntity = (SidebarDataEntity) ((C19334f) obj).m42846a();
        if (sidebarDataEntity != null) {
            Collection<? extends SidebarDataItemEntity> items = sidebarDataEntity.getItems();
            if (items != null) {
                Boxing.boxBoolean(list2.addAll(items));
            }
            int iM66650j = C27039d.m66650j(sidebarDataEntity.getCurrentPage());
            if (iM66650j < C27039d.m66650j(sidebarDataEntity.getTotalPage())) {
                int iM66651k = C27039d.m66651k(sidebarDataEntity.getPageSize(), i14);
                spotSidebarTabDataGetArea$fetchPageList$2.L$0 = SpillingKt.nullOutSpilledVariable(list2);
                spotSidebarTabDataGetArea$fetchPageList$2.L$1 = SpillingKt.nullOutSpilledVariable(str);
                spotSidebarTabDataGetArea$fetchPageList$2.L$2 = SpillingKt.nullOutSpilledVariable(sidebarDataEntity);
                spotSidebarTabDataGetArea$fetchPageList$2.I$0 = i13;
                spotSidebarTabDataGetArea$fetchPageList$2.I$1 = i14;
                spotSidebarTabDataGetArea$fetchPageList$2.I$2 = iM66650j;
                spotSidebarTabDataGetArea$fetchPageList$2.label = 2;
            }
        }
        return Unit.INSTANCE;
    }

    public SpotSidebarTabDataGetArea(@NotNull String sidebarType, @NotNull SpotMenuModel menuModel, @NotNull String symbolCode) {
        Intrinsics.checkNotNullParameter(sidebarType, "sidebarType");
        Intrinsics.checkNotNullParameter(menuModel, "menuModel");
        Intrinsics.checkNotNullParameter(symbolCode, "symbolCode");
        this.f34834b = sidebarType;
        this.f34835c = menuModel;
        this.f34836d = symbolCode;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mart.sidebar.spot.tablist.data.ITabListGet
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo41609a(@NotNull Continuation<? super List<? extends TradeItemBean>> continuation) {
        SpotSidebarTabDataGetArea$fetchList$1 spotSidebarTabDataGetArea$fetchList$1;
        List<SidebarDataItemEntity> list;
        boolean zContains;
        if (continuation instanceof SpotSidebarTabDataGetArea$fetchList$1) {
            spotSidebarTabDataGetArea$fetchList$1 = (SpotSidebarTabDataGetArea$fetchList$1) continuation;
            int i11 = spotSidebarTabDataGetArea$fetchList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                spotSidebarTabDataGetArea$fetchList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                spotSidebarTabDataGetArea$fetchList$1 = new SpotSidebarTabDataGetArea$fetchList$1(this, continuation);
            }
        } else {
            spotSidebarTabDataGetArea$fetchList$1 = new SpotSidebarTabDataGetArea$fetchList$1(this, continuation);
        }
        Object obj = spotSidebarTabDataGetArea$fetchList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = spotSidebarTabDataGetArea$fetchList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            List<SidebarDataItemEntity> arrayList = new ArrayList<>();
            int count = this.f34835c.getCount();
            spotSidebarTabDataGetArea$fetchList$1.L$0 = arrayList;
            spotSidebarTabDataGetArea$fetchList$1.label = 1;
            if (m41611c(arrayList, 1, count, spotSidebarTabDataGetArea$fetchList$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) spotSidebarTabDataGetArea$fetchList$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            SidebarDataItemEntity sidebarDataItemEntity = (SidebarDataItemEntity) obj2;
            if (Intrinsics.areEqual(this.f34834b, "spot_grid")) {
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
}
