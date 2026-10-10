package com.kubi.home.v2.biz.grid.adalpter;

import android.view.View;
import android.widget.ImageView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.event.api.C12572a;
import com.kubi.home.R$color;
import com.kubi.home.R$drawable;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.entity.GridNaviData;
import com.kubi.home.entity.GridNaviEmpty;
import com.kubi.home.entity.GridNaviMoreItem;
import com.kubi.home.entity.GridNaviReset;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.v2.biz.grid.adalpter.GridNaviEditHomeAdapter;
import com.kubi.home.v2.biz.grid.utils.C14965l;
import com.kubi.home.v2.biz.grid.utils.GridNavigationDialog;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridNaviEditHomeAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\r\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0010J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u001c\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0014J\u0014\u0010\u0017\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/adalpter/GridNaviEditHomeAdapter;", "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/kubi/home/entity/GridNaviMoreItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "onReset", "Lkotlin/Function0;", "", "getOnReset", "()Lkotlin/jvm/functions/Function0;", "setOnReset", "(Lkotlin/jvm/functions/Function0;)V", "refreshDataList", "list", "", "Lcom/kubi/home/entity/GridNavigationEntity;", "onEditChanged", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "getNaviDataList", "convert", "helper", "item", "renderData", "naviData", "Lcom/kubi/home/entity/GridNaviData;", "removeNaviData", ViewProps.POSITION, "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridNaviEditHomeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNaviEditHomeAdapter.kt\ncom/kubi/home/v2/biz/grid/adalpter/GridNaviEditHomeAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 GridNavigationEx.kt\ncom/kubi/home/v2/biz/grid/utils/GridNavigationExKt\n*L\n1#1,109:1\n808#2,11:110\n1563#2:121\n1634#2,3:122\n1563#2:126\n1634#2,3:127\n808#2,11:130\n1563#2:141\n1634#2,3:142\n808#2,11:151\n1563#2:162\n1634#2,3:163\n1#3:125\n47#4,6:145\n*S KotlinDebug\n*F\n+ 1 GridNaviEditHomeAdapter.kt\ncom/kubi/home/v2/biz/grid/adalpter/GridNaviEditHomeAdapter\n*L\n74#1:110,11\n74#1:121\n74#1:122,3\n52#1:126\n52#1:127,3\n67#1:130,11\n67#1:141\n67#1:142,3\n103#1:151,11\n103#1:162\n103#1:163,3\n91#1:145,6\n*E\n"})
public final class GridNaviEditHomeAdapter extends BaseMultiItemQuickAdapter<GridNaviMoreItem, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public Function0<Unit> f26393i;

    public GridNaviEditHomeAdapter() {
        super(new ArrayList());
        addItemType(1, R$layout.home_item_grid_navigation);
        addItemType(2, R$layout.home_item_grid_empty);
        addItemType(3, R$layout.home_item_grid_reset);
    }

    /* JADX INFO: renamed from: A */
    private final void m30582A(final BaseViewHolder baseViewHolder, final GridNaviData gridNaviData) {
        C27100x0.m66923d(new Function0() { // from class: pj.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNaviEditHomeAdapter.m30583B(gridNaviData, baseViewHolder, this);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m30593p() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m30594q(final GridNaviEditHomeAdapter gridNaviEditHomeAdapter) {
        GridNavigationDialog.m30655h(GridNavigationDialog.f26422a, new Function0() { // from class: pj.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNaviEditHomeAdapter.m30595r(this.f96015b);
            }
        }, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m30595r(GridNaviEditHomeAdapter gridNaviEditHomeAdapter) {
        Function0<Unit> function0 = gridNaviEditHomeAdapter.f26393i;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m30597w(List list, GridNaviEditHomeAdapter gridNaviEditHomeAdapter) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            for (int i11 = 0; i11 < 7; i11++) {
                arrayList.add(new GridNaviEmpty());
            }
        } else {
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int itemViewHeight = ((GridNavigationEntity) it.next()).getItemViewHeight();
            while (it.hasNext()) {
                int itemViewHeight2 = ((GridNavigationEntity) it.next()).getItemViewHeight();
                if (itemViewHeight < itemViewHeight2) {
                    itemViewHeight = itemViewHeight2;
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                GridNavigationEntity gridNavigationEntity = (GridNavigationEntity) it2.next();
                gridNavigationEntity.setItemViewHeight(itemViewHeight);
                arrayList2.add(new GridNaviData(gridNavigationEntity, true, true, true));
            }
            arrayList.addAll(arrayList2);
            for (int size = list.size(); size < 7; size++) {
                arrayList.add(new GridNaviEmpty());
            }
        }
        arrayList.add(new GridNaviReset());
        gridNaviEditHomeAdapter.replaceData(arrayList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public final void m30599D(@Nullable Function0<Unit> function0) {
        this.f26393i = function0;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable GridNaviMoreItem gridNaviMoreItem) {
        if (baseViewHolder == null || gridNaviMoreItem == null) {
            return;
        }
        if (gridNaviMoreItem instanceof GridNaviData) {
            m30582A(baseViewHolder, (GridNaviData) gridNaviMoreItem);
            return;
        }
        if (gridNaviMoreItem instanceof GridNaviEmpty) {
            View itemView = baseViewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            C27046k.m66711z(itemView, 0L, new Function0() { // from class: pj.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GridNaviEditHomeAdapter.m30593p();
                }
            }, 1, null);
        } else if (gridNaviMoreItem instanceof GridNaviReset) {
            View itemView2 = baseViewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            C27046k.m66711z(itemView2, 0L, new Function0() { // from class: pj.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GridNaviEditHomeAdapter.m30594q(this.f96007b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m30602t(@NotNull final GridNavigationEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        C27100x0.m66923d(new Function0() { // from class: pj.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNaviEditHomeAdapter.m30596u(this.f96008b, entity);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m30603v(@NotNull final List<? extends GridNavigationEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        C27100x0.m66923d(new Function0() { // from class: pj.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNaviEditHomeAdapter.m30597w(list, this);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m30604x(final GridNavigationEntity gridNavigationEntity, int i11) {
        C27100x0.m66923d(new Function0() { // from class: pj.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNaviEditHomeAdapter.m30598y(this.f96019b, gridNavigationEntity);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m30583B(GridNaviData gridNaviData, final BaseViewHolder baseViewHolder, final GridNaviEditHomeAdapter gridNaviEditHomeAdapter) {
        final GridNavigationEntity entity = gridNaviData.getEntity();
        View view = baseViewHolder.getView(R$id.ivIcon);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27100x0.m66923d(new C14965l((ImageView) view, entity.getIconUrl()));
        baseViewHolder.setText(R$id.tvName, entity.getName());
        View view2 = baseViewHolder.getView(R$id.layoutIconName);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        ViewExtKt.m66578i(view2, entity.getItemViewHeight());
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.ivOperate);
        if (imageView != null) {
            C27046k.m66685H(imageView);
            imageView.setImageResource(R$drawable.ic2_sub_filled_16);
            C27046k.m66701p(imageView, C27017c.f54310a.m66512a(R$color.brandRed60));
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: pj.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GridNaviEditHomeAdapter.m30584C(this.f96016b, entity, baseViewHolder);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m30584C(GridNaviEditHomeAdapter gridNaviEditHomeAdapter, GridNavigationEntity gridNavigationEntity, BaseViewHolder baseViewHolder) {
        gridNaviEditHomeAdapter.m30604x(gridNavigationEntity, baseViewHolder.getAdapterPosition());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m30596u(GridNaviEditHomeAdapter gridNaviEditHomeAdapter, GridNavigationEntity gridNavigationEntity) {
        Collection data = gridNaviEditHomeAdapter.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof GridNaviData) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((GridNaviData) it.next()).getEntity());
        }
        if (arrayList2.size() == 7) {
            return Unit.INSTANCE;
        }
        List<? extends GridNavigationEntity> mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
        mutableList.add(gridNavigationEntity);
        gridNaviEditHomeAdapter.m30603v(mutableList);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m30598y(GridNaviEditHomeAdapter gridNaviEditHomeAdapter, GridNavigationEntity gridNavigationEntity) {
        Collection data = gridNaviEditHomeAdapter.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof GridNaviData) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((GridNaviData) it.next()).getEntity());
        }
        List<? extends GridNavigationEntity> mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
        mutableList.remove(gridNavigationEntity);
        gridNaviEditHomeAdapter.m30603v(mutableList);
        C12572a.m23695d("EVENT_ITEM_REMOVE", gridNavigationEntity, 0L, 4, null);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final List<GridNavigationEntity> m30601s() {
        Collection data = getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (obj instanceof GridNaviData) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((GridNaviData) it.next()).getEntity());
        }
        return arrayList2;
    }
}
