package com.kubi.assets.dialog.evm;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44746d1;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EvmRepeatChainAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0014RL\u0010\u0006\u001a4\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/dialog/evm/EvmRepeatChainAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/dialog/evm/EvmRepeatChainItem;", "Lio/chad/library/adapter/base/BaseViewHolder;", "<init>", "()V", "onItemDelete", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", ViewProps.POSITION, "item", "", "getOnItemDelete", "()Lkotlin/jvm/functions/Function2;", "setOnItemDelete", "(Lkotlin/jvm/functions/Function2;)V", "convert", "helper", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EvmRepeatChainAdapter extends BaseQuickAdapter<EvmRepeatChainItem, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @Nullable
    public Function2<? super Integer, ? super EvmRepeatChainItem, Unit> f17042i;

    public EvmRepeatChainAdapter() {
        super(R$layout.asset_item_evm_repeat_chain_address, new ArrayList());
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull final BaseViewHolder helper, @NotNull final EvmRepeatChainItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        C44746d1 c44746d1M99004a = C44746d1.m99004a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c44746d1M99004a, "bind(...)");
        c44746d1M99004a.f99732g.setText(String.valueOf(C27017c.f54310a.m66516f(R$string.address, new Object[0])));
        c44746d1M99004a.f99730e.setText(C27041f.m66668h(item.getAddress()));
        c44746d1M99004a.f99731f.setText(String.valueOf(item.m16304d().size()));
        boolean z11 = getData().size() > 1;
        ImageView ivExpand = c44746d1M99004a.f99729d;
        Intrinsics.checkNotNullExpressionValue(ivExpand, "ivExpand");
        AssetExKt.m15138z(ivExpand, z11);
        ImageView ivDelete = c44746d1M99004a.f99728c;
        Intrinsics.checkNotNullExpressionValue(ivDelete, "ivDelete");
        AssetExKt.m15138z(ivDelete, z11);
        c44746d1M99004a.f99729d.setRotation(item.getExpanded() ? 0.0f : 180.0f);
        RecyclerView recyclerView = c44746d1M99004a.f99727b;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            layoutManager = new LinearLayoutManager(c44746d1M99004a.f99727b.getContext(), 1, false);
        }
        recyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = c44746d1M99004a.f99727b.getAdapter();
        EvmRepeatChainChildAdapter evmRepeatChainChildAdapter = adapter instanceof EvmRepeatChainChildAdapter ? (EvmRepeatChainChildAdapter) adapter : null;
        if (evmRepeatChainChildAdapter == null) {
            evmRepeatChainChildAdapter = new EvmRepeatChainChildAdapter();
            c44746d1M99004a.f99727b.setAdapter(evmRepeatChainChildAdapter);
        }
        evmRepeatChainChildAdapter.setNewData(CollectionsKt.toMutableList((Collection) item.m16304d()));
        RecyclerView childRecyclerView = c44746d1M99004a.f99727b;
        Intrinsics.checkNotNullExpressionValue(childRecyclerView, "childRecyclerView");
        AssetExKt.m15138z(childRecyclerView, item.getExpanded());
        LinearLayout withdrawDescTitleLayout = c44746d1M99004a.f99733h;
        Intrinsics.checkNotNullExpressionValue(withdrawDescTitleLayout, "withdrawDescTitleLayout");
        AssetExKt.m15138z(withdrawDescTitleLayout, item.getExpanded());
        c44746d1M99004a.f99728c.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.assets.dialog.evm.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EvmRepeatChainAdapter.m16223i(helper, this, item, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m16225j(@Nullable Function2<? super Integer, ? super EvmRepeatChainItem, Unit> function2) {
        this.f17042i = function2;
    }

    /* JADX INFO: renamed from: i */
    public static final void m16223i(BaseViewHolder baseViewHolder, EvmRepeatChainAdapter evmRepeatChainAdapter, EvmRepeatChainItem evmRepeatChainItem, View view) {
        Function2<? super Integer, ? super EvmRepeatChainItem, Unit> function2;
        int adapterPosition = baseViewHolder.getAdapterPosition();
        if (adapterPosition != -1 && (function2 = evmRepeatChainAdapter.f17042i) != null) {
            function2.invoke(Integer.valueOf(adapterPosition), evmRepeatChainItem);
        }
    }
}
