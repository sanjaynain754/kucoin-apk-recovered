package com.kubi.home.v2.biz.grid.adalpter;

import android.view.View;
import android.widget.ImageView;
import com.kubi.home.R$id;
import com.kubi.home.R$layout;
import com.kubi.home.entity.GridNavigationEntity;
import com.kubi.home.v2.biz.grid.adalpter.GridNaviShowHomeAdapter;
import com.kubi.home.v2.biz.grid.utils.C14965l;
import com.kubi.home.v2.biz.grid.utils.GridNavigationExKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import dj.C36723h;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GridNaviShowHomeAdapter.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\n"}, m90084d2 = {"Lcom/kubi/home/v2/biz/grid/adalpter/GridNaviShowHomeAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/home/entity/GridNavigationEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGridNaviShowHomeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridNaviShowHomeAdapter.kt\ncom/kubi/home/v2/biz/grid/adalpter/GridNaviShowHomeAdapter\n+ 2 GridNavigationEx.kt\ncom/kubi/home/v2/biz/grid/utils/GridNavigationExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n47#2,6:39\n120#2,2:45\n122#2:48\n1#3:47\n*S KotlinDebug\n*F\n+ 1 GridNaviShowHomeAdapter.kt\ncom/kubi/home/v2/biz/grid/adalpter/GridNaviShowHomeAdapter\n*L\n27#1:39,6\n29#1:45,2\n29#1:48\n29#1:47\n*E\n"})
public final class GridNaviShowHomeAdapter extends BaseQuickAdapter<GridNavigationEntity, BaseViewHolder> {
    public GridNaviShowHomeAdapter() {
        super(R$layout.home_item_grid_navi_small);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable final BaseViewHolder baseViewHolder, @Nullable final GridNavigationEntity gridNavigationEntity) {
        if (baseViewHolder == null || gridNavigationEntity == null) {
            return;
        }
        View view = baseViewHolder.getView(R$id.ivIcon);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27100x0.m66923d(new C14965l((ImageView) view, gridNavigationEntity.getIconUrl()));
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: pj.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GridNaviShowHomeAdapter.m30631i(gridNavigationEntity, baseViewHolder);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m30631i(GridNavigationEntity gridNavigationEntity, BaseViewHolder baseViewHolder) throws JSONException {
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
}
