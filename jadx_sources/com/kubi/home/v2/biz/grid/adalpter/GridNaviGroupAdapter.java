package com.kubi.home.v2.biz.grid.adalpter;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.entity.GridNaviData;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.v2.biz.grid.adalpter.GridNaviGroupAdapter;
import com.kubi.home.v2.biz.grid.utils.GridNaviGroupItemDecoration;
import com.kubi.resources.C22912t;
import com.kubi.utils.C27100x0;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridNaviGroupAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002 \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\u0004\u0012\u00020\u00060\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nJ\u0018\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012J.\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/adalpter/GridNaviGroupAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lkotlin/Pair;", "", "", "Lcom/kubi/home/entity/GridNaviData;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "isEditMode", "", "setIsEditMode", "", "refresh", "onEditChanged", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/home/entity/GridNavigationEntity;", "homeSelectedSize", "", "convert", "helper", "item", "onGroupChildAdded", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"NotifyDataSetChanged"})
@SourceDebugExtension({"SMAP\nGridNaviGroupAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNaviGroupAdapter.kt\ncom/kubi/home/v2/biz/grid/adalpter/GridNaviGroupAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n1#2:82\n1#2:84\n1#2:86\n1#2:88\n1#2:90\n1#2:92\n2756#3:83\n2756#3:85\n2756#3:87\n2756#3:89\n2756#3:91\n*S KotlinDebug\n*F\n+ 1 GridNaviGroupAdapter.kt\ncom/kubi/home/v2/biz/grid/adalpter/GridNaviGroupAdapter\n*L\n34#1:84\n39#1:86\n40#1:88\n71#1:90\n72#1:92\n34#1:83\n39#1:85\n40#1:87\n71#1:89\n72#1:91\n*E\n"})
public final class GridNaviGroupAdapter extends BaseQuickAdapter<Pair<? extends String, ? extends List<? extends GridNaviData>>, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public boolean f26394i;

    /* JADX INFO: renamed from: m */
    public static final Unit m30609m(int i11, GridNaviGroupAdapter gridNaviGroupAdapter, GridNavigationEntity gridNavigationEntity) {
        if (i11 == 7) {
            Iterator<T> it = gridNaviGroupAdapter.getData().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((Iterable) ((Pair) it.next()).getSecond()).iterator();
                while (it2.hasNext()) {
                    ((GridNaviData) it2.next()).setEnable(false);
                }
            }
            gridNaviGroupAdapter.notifyDataSetChanged();
        } else {
            String id2 = gridNavigationEntity != null ? gridNavigationEntity.getId() : null;
            if (id2 == null) {
                id2 = "";
            }
            if (id2.length() == 0) {
                return Unit.INSTANCE;
            }
            Iterator<T> it3 = gridNaviGroupAdapter.getData().iterator();
            while (it3.hasNext()) {
                for (GridNaviData gridNaviData : (Iterable) ((Pair) it3.next()).getSecond()) {
                    gridNaviData.setEnable(true);
                    if (Intrinsics.areEqual(gridNaviData.getEntity().getId(), id2)) {
                        gridNaviData.setSelected(false);
                    }
                }
            }
            gridNaviGroupAdapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    public GridNaviGroupAdapter() {
        super(R$layout.home_item_group_grid);
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m30608k(GridNaviGroupAdapter gridNaviGroupAdapter, GridNaviData entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        gridNaviGroupAdapter.m30614n(entity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m30611q(GridNaviGroupAdapter gridNaviGroupAdapter, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        gridNaviGroupAdapter.m30615p(z11, z12);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable Pair<String, ? extends List<GridNaviData>> pair) {
        if (baseViewHolder == null || pair == null) {
            return;
        }
        int i11 = R$id.tvTitle;
        baseViewHolder.setGone(i11, baseViewHolder.getAdapterPosition() > 0);
        baseViewHolder.setText(i11, pair.getFirst());
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.listUI);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        GridNaviGroupItemAdapter gridNaviGroupItemAdapter = adapter instanceof GridNaviGroupItemAdapter ? (GridNaviGroupItemAdapter) adapter : null;
        if (gridNaviGroupItemAdapter == null) {
            Intrinsics.checkNotNull(recyclerView);
            C22912t.m54409g(recyclerView, false);
            recyclerView.addItemDecoration(new GridNaviGroupItemDecoration());
            gridNaviGroupItemAdapter = new GridNaviGroupItemAdapter();
            recyclerView.setAdapter(gridNaviGroupItemAdapter);
        }
        GridNaviGroupItemAdapter.m30624s(gridNaviGroupItemAdapter, this.f26394i, false, 2, null);
        gridNaviGroupItemAdapter.replaceData(pair.getSecond());
        gridNaviGroupItemAdapter.m30629t(new Function1() { // from class: pj.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GridNaviGroupAdapter.m30608k(this.f96024b, (GridNaviData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m30613l(@Nullable final GridNavigationEntity gridNavigationEntity, final int i11) {
        C27100x0.m66923d(new Function0() { // from class: pj.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNaviGroupAdapter.m30609m(i11, this, gridNavigationEntity);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public final void m30614n(final GridNaviData gridNaviData) {
        C27100x0.m66923d(new Function0() { // from class: pj.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNaviGroupAdapter.m30610o(this.f96025b, gridNaviData);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m30615p(boolean z11, boolean z12) {
        this.f26394i = z11;
        if (z12) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m30610o(GridNaviGroupAdapter gridNaviGroupAdapter, GridNaviData gridNaviData) {
        Iterator<T> it = gridNaviGroupAdapter.getData().iterator();
        while (it.hasNext()) {
            for (GridNaviData gridNaviData2 : (Iterable) ((Pair) it.next()).getSecond()) {
                if (Intrinsics.areEqual(gridNaviData2.getEntity().getId(), gridNaviData.getEntity().getId())) {
                    gridNaviData2.setSelected(true);
                }
            }
        }
        gridNaviGroupAdapter.notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
