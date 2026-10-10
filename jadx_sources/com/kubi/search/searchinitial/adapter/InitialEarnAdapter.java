package com.kubi.search.searchinitial.adapter;

import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.sdk.util.C24277v;
import com.kubi.search.R$id;
import com.kubi.search.R$layout;
import com.kubi.search.entity.ExtendEntity;
import com.kubi.search.searchinitial.adapter.InitialEarnAdapter;
import com.kubi.search.utils.SearchExKt;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33954u6;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InitialEarnAdapter.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/search/searchinitial/adapter/InitialEarnAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/search/entity/ExtendEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "exposeList", "", "", "onViewAttachedToWindow", C33954u6.f72238i, "SearchLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class InitialEarnAdapter extends BaseQuickAdapter<ExtendEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<String> f48890i;

    public InitialEarnAdapter() {
        super(R$layout.search_item_initial_earn);
        this.f48890i = new ArrayList();
        setHasStableIds(true);
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull BaseViewHolder helper, @NotNull final ExtendEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int bindingAdapterPosition = helper.getBindingAdapterPosition();
        int iM66658b = bindingAdapterPosition == 0 ? C27040e.m66658b(16) : 0;
        int iM66658b2 = bindingAdapterPosition == getItemCount() + (-1) ? C27040e.m66658b(16) : C27040e.m66658b(12);
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewExtKt.m66585p(itemView, iM66658b, 0, iM66658b2, 0, 10, null);
        CoinAvatarView coinAvatarView = (CoinAvatarView) helper.getView(R$id.coinIcon);
        if (coinAvatarView != null) {
            C24277v.m58542g(coinAvatarView, C27041f.m66668h(item.getIcon()));
        }
        helper.setText(R$id.tvName, C27041f.m66668h(item.getName()));
        helper.setText(R$id.tvRate, item.formatPrtStr());
        View itemView2 = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        C27046k.m66710y(itemView2, 1000L, new Function0() { // from class: t10.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InitialEarnAdapter.m59174i(item);
            }
        });
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull BaseViewHolder holder) throws JSONException {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        ExtendEntity item = getItem(holder.getBindingAdapterPosition());
        if (item == null) {
            return;
        }
        String strM66668h = C27041f.m66668h(item.getName());
        if (this.f48890i.contains(strM66668h)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("contentItem", C27041f.m66668h(item.getName()));
        jSONObject.put("sortPosition", String.valueOf(holder.getBindingAdapterPosition() + 1));
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d("B1SearchOrSearchResultPage", "topEarn", null, jSONObject, 4, null);
        this.f48890i.add(strM66668h);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m59174i(ExtendEntity extendEntity) throws JSONException {
        SearchExKt.m59540v(extendEntity);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("after_click_element_value", C27041f.m66668h(extendEntity.getName()));
        jSONObject.put("after_page_id", "B9earn");
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a("B1SearchOrSearchResultPage", FirebaseAnalytics.Event.SEARCH, "hotEarn", jSONObject);
        return Unit.INSTANCE;
    }
}
