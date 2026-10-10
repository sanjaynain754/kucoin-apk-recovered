package com.kubi.home.v2.biz.grid;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.p021ts.PsExtractor;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.home.entity.GridNaviData;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.v2.biz.grid.adalpter.GridNaviGroupAdapter;
import com.kubi.home.v2.biz.grid.utils.GridItemHeightHelper;
import com.kubi.resources.widget.ScrollTabIndicatorView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import fj.C37523i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridNavigationFragment.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.biz.grid.GridNavigationFragment$fillViewData$1", m90122f = "GridNavigationFragment.kt", m90123i = {0, 0, 0, 1, 1, 1, 1}, m90124l = {PsExtractor.PRIVATE_STREAM_1, 196}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "binding", "homeList", "$this$launch", "binding", "homeList", "isHomeFull"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
@SourceDebugExtension({"SMAP\nGridNavigationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNavigationFragment.kt\ncom/kubi/home/v2/biz/grid/GridNavigationFragment$fillViewData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 CollectionsEx.kt\ncom/kubi/utils/extensions/CollectionsExKt\n*L\n1#1,274:1\n1563#2:275\n1634#2,3:276\n1563#2:282\n1634#2,2:283\n1636#2:286\n126#3:279\n153#3,2:280\n155#3:287\n99#4:285\n*S KotlinDebug\n*F\n+ 1 GridNavigationFragment.kt\ncom/kubi/home/v2/biz/grid/GridNavigationFragment$fillViewData$1\n*L\n196#1:275\n196#1:276,3\n198#1:282\n198#1:283,2\n198#1:286\n197#1:279\n197#1:280,2\n197#1:287\n199#1:285\n*E\n"})
public final class GridNavigationFragment$fillViewData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C14937a $event;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GridNavigationFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridNavigationFragment$fillViewData$1(GridNavigationFragment gridNavigationFragment, C14937a c14937a, Continuation<? super GridNavigationFragment$fillViewData$1> continuation) {
        super(2, continuation);
        this.this$0 = gridNavigationFragment;
        this.$event = c14937a;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GridNavigationFragment$fillViewData$1 gridNavigationFragment$fillViewData$1 = new GridNavigationFragment$fillViewData$1(this.this$0, this.$event, continuation);
        gridNavigationFragment$fillViewData$1.L$0 = obj;
        return gridNavigationFragment$fillViewData$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((GridNavigationFragment$fillViewData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x017d  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cb A[SYNTHETIC] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C37523i c37523iM30559H3;
        List<? extends GridNavigationEntity> list;
        List<? extends GridNavigationEntity> list2;
        int i11;
        ArrayList arrayList;
        FragmentActivity activity;
        ArrayList arrayList2;
        Iterator<T> it;
        Object next;
        boolean z11;
        boolean z12;
        GridNavigationFragment$fillViewData$1 gridNavigationFragment$fillViewData$1 = this;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) gridNavigationFragment$fillViewData$1.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gridNavigationFragment$fillViewData$1.label;
        int i13 = 10;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c37523iM30559H3 = gridNavigationFragment$fillViewData$1.this$0.m30559H3();
            if (c37523iM30559H3 == null) {
                return Unit.INSTANCE;
            }
            if (UserInfo.a.n()) {
                LinearLayoutCompat userWidgetLayout = c37523iM30559H3.f83331i;
                Intrinsics.checkNotNullExpressionValue(userWidgetLayout, "userWidgetLayout");
                C27046k.m66685H(userWidgetLayout);
                RecyclerView listHomeShow = c37523iM30559H3.f83327e;
                Intrinsics.checkNotNullExpressionValue(listHomeShow, "listHomeShow");
                C27046k.m66685H(listHomeShow);
            } else {
                LinearLayoutCompat userWidgetLayout2 = c37523iM30559H3.f83331i;
                Intrinsics.checkNotNullExpressionValue(userWidgetLayout2, "userWidgetLayout");
                ViewExtKt.m66577h(userWidgetLayout2);
                RecyclerView listHomeShow2 = c37523iM30559H3.f83327e;
                Intrinsics.checkNotNullExpressionValue(listHomeShow2, "listHomeShow");
                ViewExtKt.m66577h(listHomeShow2);
            }
            RecyclerView listHomeEdit = c37523iM30559H3.f83326d;
            Intrinsics.checkNotNullExpressionValue(listHomeEdit, "listHomeEdit");
            C27046k.m66700o(listHomeEdit);
            KcPrimaryButton btnEdit = c37523iM30559H3.f83325c;
            Intrinsics.checkNotNullExpressionValue(btnEdit, "btnEdit");
            C27046k.m66685H(btnEdit);
            KcPrimaryButton btnDone = c37523iM30559H3.f83324b;
            Intrinsics.checkNotNullExpressionValue(btnDone, "btnDone");
            C27046k.m66700o(btnDone);
            gridNavigationFragment$fillViewData$1.this$0.f26382W.replaceData(gridNavigationFragment$fillViewData$1.$event.m30581c());
            List<? extends GridNavigationEntity> listM66558a = C27024b.m66558a(gridNavigationFragment$fillViewData$1.$event.m30581c());
            GridItemHeightHelper gridItemHeightHelper = GridItemHeightHelper.f26415a;
            gridNavigationFragment$fillViewData$1.L$0 = interfaceC41709m0;
            gridNavigationFragment$fillViewData$1.L$1 = c37523iM30559H3;
            gridNavigationFragment$fillViewData$1.L$2 = listM66558a;
            gridNavigationFragment$fillViewData$1.label = 1;
            if (GridItemHeightHelper.m30636e(gridItemHeightHelper, listM66558a, 4, 0, gridNavigationFragment$fillViewData$1, 4, null) != coroutine_suspended) {
                list = listM66558a;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            list = (List) gridNavigationFragment$fillViewData$1.L$2;
            C37523i c37523i = (C37523i) gridNavigationFragment$fillViewData$1.L$1;
            ResultKt.throwOnFailure(obj);
            c37523iM30559H3 = c37523i;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = gridNavigationFragment$fillViewData$1.I$0;
            list2 = (List) gridNavigationFragment$fillViewData$1.L$2;
            ResultKt.throwOnFailure(obj);
            gridNavigationFragment$fillViewData$1 = gridNavigationFragment$fillViewData$1;
        }
        LinkedHashMap<String, List<GridNavigationEntity>> linkedHashMapM30579a = gridNavigationFragment$fillViewData$1.$event.m30579a();
        arrayList = new ArrayList(linkedHashMapM30579a.size());
        for (Map.Entry<String, List<GridNavigationEntity>> entry : linkedHashMapM30579a.entrySet()) {
            String key = entry.getKey();
            List<GridNavigationEntity> value = entry.getValue();
            arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, i13));
            for (GridNavigationEntity gridNavigationEntity : value) {
                it = list2.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((GridNavigationEntity) next).getId(), gridNavigationEntity.getId()));
                if (next != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (i11 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                arrayList2.add(new GridNaviData(gridNavigationEntity, z12, false, z11));
            }
            arrayList.add(TuplesKt.m90091to(key, arrayList2));
            i13 = 10;
        }
        GridNaviGroupAdapter.m30611q(gridNavigationFragment$fillViewData$1.this$0.f26384Y, false, false, 2, null);
        gridNavigationFragment$fillViewData$1.this$0.f26384Y.replaceData(arrayList);
        gridNavigationFragment$fillViewData$1.this$0.showContentView();
        if (gridNavigationFragment$fillViewData$1.$event.getF26392c() && (activity = gridNavigationFragment$fillViewData$1.this$0.getActivity()) != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
        gridNavigationFragment$fillViewData$1.this$0.f26383X.m30603v(list);
        ScrollTabIndicatorView scrollTabIndicatorView = c37523iM30559H3.f83329g;
        Set<String> setKeySet = gridNavigationFragment$fillViewData$1.$event.m30579a().keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        List<String> list3 = CollectionsKt.toList(setKeySet);
        final GridNavigationFragment gridNavigationFragment = gridNavigationFragment$fillViewData$1.this$0;
        scrollTabIndicatorView.m54769g(list3, new Function1() { // from class: com.kubi.home.v2.biz.grid.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return GridNavigationFragment$fillViewData$1.m30565f(gridNavigationFragment, (String) obj2);
            }
        });
        int i14 = list.size() == 7 ? 1 : 0;
        Collection<List<GridNavigationEntity>> collectionValues = gridNavigationFragment$fillViewData$1.$event.m30579a().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList4 = arrayList3;
            InterfaceC41709m0 interfaceC41709m1 = interfaceC41709m0;
            arrayList4.add(C41696j.m91102b(interfaceC41709m1, null, null, new GridNavigationFragment$fillViewData$1$2$1((List) it2.next(), null), 3, null));
            interfaceC41709m0 = interfaceC41709m1;
            i14 = i14;
            arrayList3 = arrayList4;
        }
        InterfaceC41709m0 interfaceC41709m2 = interfaceC41709m0;
        int i15 = i14;
        gridNavigationFragment$fillViewData$1.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
        gridNavigationFragment$fillViewData$1.L$1 = SpillingKt.nullOutSpilledVariable(c37523iM30559H3);
        gridNavigationFragment$fillViewData$1.L$2 = list;
        gridNavigationFragment$fillViewData$1.I$0 = i15;
        gridNavigationFragment$fillViewData$1.label = 2;
        if (AwaitKt.m90345a(arrayList3, gridNavigationFragment$fillViewData$1) != coroutine_suspended) {
            list2 = list;
            i11 = i15;
            LinkedHashMap<String, List<GridNavigationEntity>> linkedHashMapM30579a2 = gridNavigationFragment$fillViewData$1.$event.m30579a();
            arrayList = new ArrayList(linkedHashMapM30579a2.size());
            while (r2.hasNext()) {
                String key2 = entry.getKey();
                List<GridNavigationEntity> value2 = entry.getValue();
                arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(value2, i13));
                while (r4.hasNext()) {
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((GridNavigationEntity) next).getId(), gridNavigationEntity.getId()));
                    if (next != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (i11 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    arrayList2.add(new GridNaviData(gridNavigationEntity, z12, false, z11));
                }
                arrayList.add(TuplesKt.m90091to(key2, arrayList2));
                i13 = 10;
            }
            GridNaviGroupAdapter.m30611q(gridNavigationFragment$fillViewData$1.this$0.f26384Y, false, false, 2, null);
            gridNavigationFragment$fillViewData$1.this$0.f26384Y.replaceData(arrayList);
            gridNavigationFragment$fillViewData$1.this$0.showContentView();
            if (gridNavigationFragment$fillViewData$1.$event.getF26392c()) {
                activity.finish();
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m30565f(GridNavigationFragment gridNavigationFragment, String str) {
        gridNavigationFragment.m30561R3(str);
        return Unit.INSTANCE;
    }
}
