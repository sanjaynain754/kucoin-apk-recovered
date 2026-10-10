package com.kubi.home.v2.biz.grid.adalpter;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kubi.event.api.C12572a;
import com.kubi.home.R$color;
import com.kubi.home.R$drawable;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.entity.GridNaviData;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.v2.biz.grid.adalpter.GridNaviGroupItemAdapter;
import com.kubi.home.v2.biz.grid.utils.C14965l;
import com.kubi.home.v2.biz.grid.utils.GridNavigationExKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dj.C36723h;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridNaviGroupItemAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0007J\u001c\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0014J\u0014\u0010\u0017\u001a\u00020\r*\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0002H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R7\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/adalpter/GridNaviGroupItemAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/home/entity/GridNaviData;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "isEditMode", "", "onItemChildAdded", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "", "getOnItemChildAdded", "()Lkotlin/jvm/functions/Function1;", "setOnItemChildAdded", "(Lkotlin/jvm/functions/Function1;)V", "setIsEditMode", "refresh", "convert", "helper", "item", "renderData", "naviData", "addNaviData", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"NotifyDataSetChanged"})
@SourceDebugExtension({"SMAP\nGridNaviGroupItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNaviGroupItemAdapter.kt\ncom/kubi/home/v2/biz/grid/adalpter/GridNaviGroupItemAdapter\n+ 2 GridNavigationEx.kt\ncom/kubi/home/v2/biz/grid/utils/GridNavigationExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n120#2,2:102\n122#2:105\n47#2,6:106\n1#3:104\n*S KotlinDebug\n*F\n+ 1 GridNaviGroupItemAdapter.kt\ncom/kubi/home/v2/biz/grid/adalpter/GridNaviGroupItemAdapter\n*L\n87#1:102,2\n87#1:105\n56#1:106,6\n87#1:104\n*E\n"})
public final class GridNaviGroupItemAdapter extends BaseQuickAdapter<GridNaviData, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public boolean f26395i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Function1<? super GridNaviData, Unit> f26396j;

    public GridNaviGroupItemAdapter() {
        super(R$layout.home_item_grid_navigation);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m30620l(GridNaviGroupItemAdapter gridNaviGroupItemAdapter, GridNaviData gridNaviData) {
        Function1<? super GridNaviData, Unit> function1 = gridNaviGroupItemAdapter.f26396j;
        if (function1 != null) {
            function1.invoke(gridNaviData);
        }
        C12572a.m23695d("EVENT_ITEM_ADD", gridNaviData.getEntity(), 0L, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m30623q(GridNaviGroupItemAdapter gridNaviGroupItemAdapter, GridNavigationEntity gridNavigationEntity, BaseViewHolder baseViewHolder) throws JSONException {
        if (gridNaviGroupItemAdapter.f26395i) {
            return Unit.INSTANCE;
        }
        int adapterPosition = baseViewHolder.getAdapterPosition();
        String uri = gridNavigationEntity.getUri();
        if (uri != null) {
            C36723h.m82297a(uri, "B1eightplacepage", "eightPlace", String.valueOf(adapterPosition + 1));
        }
        String id2 = gridNavigationEntity.getId();
        if (id2 != null) {
            GridNavigationExKt.m30671f(id2);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", C27041f.m66668h(gridNavigationEntity.getUri()));
        jSONObject.put("contentID", C27041f.m66668h(gridNavigationEntity.getId()));
        jSONObject.put("contentName", C27041f.m66668h(gridNavigationEntity.getName()));
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b("B1eightplacepage", "eightPlaceEdit", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m30624s(GridNaviGroupItemAdapter gridNaviGroupItemAdapter, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        gridNaviGroupItemAdapter.m30628r(z11, z12);
    }

    /* JADX INFO: renamed from: k */
    public final void m30625k(final GridNaviData gridNaviData) {
        C27100x0.m66923d(new Function0() { // from class: pj.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNaviGroupItemAdapter.m30620l(this.f96035b, gridNaviData);
            }
        });
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable GridNaviData gridNaviData) {
        if (baseViewHolder == null || gridNaviData == null) {
            return;
        }
        m30627n(baseViewHolder, gridNaviData);
    }

    /* JADX INFO: renamed from: n */
    public final void m30627n(final BaseViewHolder baseViewHolder, final GridNaviData gridNaviData) {
        C27100x0.m66923d(new Function0() { // from class: pj.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNaviGroupItemAdapter.m30621o(gridNaviData, baseViewHolder, this);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m30628r(boolean z11, boolean z12) {
        this.f26395i = z11;
        if (z12) {
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m30629t(@Nullable Function1<? super GridNaviData, Unit> function1) {
        this.f26396j = function1;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m30621o(final GridNaviData gridNaviData, final BaseViewHolder baseViewHolder, final GridNaviGroupItemAdapter gridNaviGroupItemAdapter) {
        final GridNavigationEntity entity = gridNaviData.getEntity();
        View view = baseViewHolder.getView(R$id.ivIcon);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27100x0.m66923d(new C14965l((ImageView) view, entity.getIconUrl()));
        baseViewHolder.setText(R$id.tvName, entity.getName());
        View view2 = baseViewHolder.getView(R$id.layoutIconName);
        Intrinsics.checkNotNull(view2);
        ViewExtKt.m66578i(view2, entity.getItemViewHeight());
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.ivMark);
        TextView textView = (TextView) baseViewHolder.getView(R$id.tvMark);
        ImageView imageView2 = (ImageView) baseViewHolder.getView(R$id.ivOperate);
        imageView2.setImageResource(R$drawable.ic2_add_filled_16);
        Intrinsics.checkNotNull(imageView2);
        C27046k.m66701p(imageView2, C27017c.f54310a.m66512a(R$color.c_icon));
        if (gridNaviGroupItemAdapter.f26395i) {
            Intrinsics.checkNotNull(imageView);
            C27046k.m66703r(imageView);
            Intrinsics.checkNotNull(textView);
            C27046k.m66703r(textView);
            if (gridNaviData.isEnable()) {
                view2.setEnabled(true);
                view2.setAlpha(1.0f);
                C27046k.m66684G(imageView2, !gridNaviData.isSelected());
                C27046k.m66711z(imageView2, 0L, new Function0() { // from class: pj.m
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GridNaviGroupItemAdapter.m30622p(this.f96030b, gridNaviData);
                    }
                }, 1, null);
            } else {
                view2.setEnabled(false);
                view2.setAlpha(0.3f);
                C27046k.m66684G(imageView2, false);
            }
        } else {
            view2.setEnabled(true);
            view2.setAlpha(1.0f);
            C27046k.m66700o(imageView2);
            Intrinsics.checkNotNull(imageView);
            Intrinsics.checkNotNull(textView);
            GridNavigationExKt.m30668c(entity, imageView, textView);
        }
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: pj.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNaviGroupItemAdapter.m30623q(this.f96032b, entity, baseViewHolder);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m30622p(GridNaviGroupItemAdapter gridNaviGroupItemAdapter, GridNaviData gridNaviData) {
        gridNaviGroupItemAdapter.m30625k(gridNaviData);
        return Unit.INSTANCE;
    }
}
