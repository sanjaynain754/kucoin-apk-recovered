package com.kubi.assets.sort;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5271g0;
import com.blankj.utilcode.util.C5275i0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetsLog;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseItemDraggableAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback;
import java.util.ArrayList;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AccountTabSortAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0007J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ \u0010\u001d\u001a\u00020\u00002\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011J \u0010\u001f\u001a\u00020\u00002\u0018\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011J\u001c\u0010 \u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010#\u001a\u00020$H\u0002J\u001a\u0010%\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)H\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lcom/kubi/assets/sort/AccountTabSortAdapter;", "Lio/chad/library/adapter/base/BaseItemDraggableAdapter;", "Lcom/kubi/assets/sort/AccountTabSortData;", "Lio/chad/library/adapter/base/BaseViewHolder;", "tabDataList", "", "<init>", "(Ljava/util/List;)V", "getTabDataList", "()Ljava/util/List;", "isDragging", "", "checkTab", "Lcom/kubi/assets/sort/AccountBiz;", FirebaseAnalytics.Param.CURRENCY, "", "onHideChangeListener", "Lkotlin/Function1;", "", "", "onSortChangeListener", "horizontalLayoutHelper", "Lcom/kubi/assets/sort/AccountPreviewTabLayoutHelper;", "withInitData", "tabs", "withBindLayoutView", "withSetupDragAndDrop", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "withHideChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "withSortChangeListener", "convert", "helper", "item", "createDragAndSwipeCallback", "Lio/chad/library/adapter/base/callback/ItemDragAndSwipeCallback;", "wrapperShadowColor", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "actionState", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AccountTabSortAdapter extends BaseItemDraggableAdapter<AccountTabSortData, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<AccountTabSortData> f18749i;

    /* JADX INFO: renamed from: j */
    public boolean f18750j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public AccountBiz f18751k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final String f18752l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public Function1<? super List<AccountTabSortData>, Unit> f18753m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public Function1<? super List<AccountTabSortData>, Unit> f18754n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public AccountPreviewTabLayoutHelper f18755o;

    /* JADX INFO: renamed from: com.kubi.assets.sort.AccountTabSortAdapter$a */
    /* JADX INFO: compiled from: AccountTabSortAdapter.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/assets/sort/AccountTabSortAdapter$createDragAndSwipeCallback$1", "Lio/chad/library/adapter/base/callback/ItemDragAndSwipeCallback;", "onSelectedChanged", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "actionState", "", "clearView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C10970a extends ItemDragAndSwipeCallback {
        @Override // io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
            if (actionState == 2) {
                AssetsLog.Common.m15236i("拖动开始");
                AccountTabSortAdapter.this.f18750j = true;
            }
            if (actionState == 0 && AccountTabSortAdapter.this.f18750j) {
                AssetsLog.Common.m15236i("拖动停止");
                AccountTabSortAdapter.this.f18750j = false;
                AccountPreviewTabLayoutHelper accountPreviewTabLayoutHelper = AccountTabSortAdapter.this.f18755o;
                if (accountPreviewTabLayoutHelper != null) {
                    accountPreviewTabLayoutHelper.m19348f(AccountTabSortAdapter.this.m19283q(), AccountTabSortAdapter.this.f18751k);
                }
                AccountTabSortAdapter.this.f18754n.invoke(AccountTabSortAdapter.this.m19283q());
            }
            if (actionState != 0) {
                AccountTabSortAdapter.this.m19288x(viewHolder, actionState);
            }
            super.onSelectedChanged(viewHolder, actionState);
        }

        public C10970a() {
            super(AccountTabSortAdapter.this);
        }

        @Override // io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            viewHolder.itemView.setBackgroundColor(0);
            viewHolder.itemView.setPadding(0, 0, 0, 0);
            super.clearView(recyclerView, viewHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountTabSortAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AccountTabSortAdapter(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ArrayList() : list);
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m19279r(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m19280s(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable AccountTabSortData accountTabSortData) {
        if (baseViewHolder == null || accountTabSortData == null) {
            return;
        }
        baseViewHolder.setText(R$id.tvAccountName, C10995j.m19356a(accountTabSortData.getBiz()));
        baseViewHolder.setText(R$id.tvAssetValue, C42828b.m93906g(C41014a.m89950x(C41014a.m89939m(C27039d.m66647g(accountTabSortData.getAssetValue()), this.f18752l), null, null, 0, false, false, false, true, 63, null), "≈", false, false, 6, null));
        baseViewHolder.itemView.setAlpha(accountTabSortData.getIsHide() ? 0.4f : 1.0f);
        AppCompatImageView appCompatImageView = (AppCompatImageView) baseViewHolder.getView(R$id.ivVisibleEye);
        if (accountTabSortData.getIsHide()) {
            appCompatImageView.setVisibility(0);
            appCompatImageView.setImageDrawable(ContextCompat.getDrawable(appCompatImageView.getContext(), R$drawable.ic2_eye_close_20));
            Intrinsics.checkNotNull(appCompatImageView);
            C27046k.m66701p(appCompatImageView, ContextCompat.getColor(appCompatImageView.getContext(), R$color.c_text40));
        } else {
            appCompatImageView.setVisibility(8);
        }
        appCompatImageView.setClickable(false);
        int i11 = R$id.ivDragIcon;
        ((AppCompatImageView) baseViewHolder.getView(i11)).setVisibility(accountTabSortData.getIsHide() ? 8 : 0);
        baseViewHolder.getView(i11).setVisibility(accountTabSortData.getIsHide() ? 8 : 0);
    }

    /* JADX INFO: renamed from: p */
    public final ItemDragAndSwipeCallback m19282p() {
        return new C10970a();
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final List<AccountTabSortData> m19283q() {
        return this.f18749i;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final AccountTabSortAdapter m19284t(@Nullable AccountPreviewTabLayoutHelper accountPreviewTabLayoutHelper) {
        if (accountPreviewTabLayoutHelper != null) {
            accountPreviewTabLayoutHelper.m19348f(this.f18749i, this.f18751k);
        } else {
            accountPreviewTabLayoutHelper = null;
        }
        this.f18755o = accountPreviewTabLayoutHelper;
        return this;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    @NotNull
    /* JADX INFO: renamed from: u */
    public final AccountTabSortAdapter m19285u(@NotNull AccountBiz checkTab, @NotNull List<AccountTabSortData> tabs) {
        Intrinsics.checkNotNullParameter(checkTab, "checkTab");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f18751k = checkTab;
        this.f18749i.clear();
        this.f18749i.addAll(tabs);
        notifyDataSetChanged();
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final AccountTabSortAdapter m19286v(@Nullable RecyclerView recyclerView) {
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(m19282p());
        itemTouchHelper.attachToRecyclerView(recyclerView);
        enableDragItem(itemTouchHelper, R$id.ivDragIcon, false);
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final AccountTabSortAdapter m19287w(@NotNull Function1<? super List<AccountTabSortData>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f18754n = listener;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final void m19288x(RecyclerView.ViewHolder viewHolder, int i11) {
        if (i11 != 0) {
            View view = viewHolder != null ? viewHolder.itemView : null;
            C5271g0.a aVar = new C5271g0.a();
            aVar.m6216g(ContextCompat.getColor(BaseApplication.INSTANCE.get(), R$color.c_cover4));
            aVar.m6218i(C5275i0.m6236a(4.0f));
            C5271g0.m6208a(view, aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountTabSortAdapter(@NotNull List<AccountTabSortData> tabDataList) {
        super(R$layout.asset_sort_item, tabDataList);
        Intrinsics.checkNotNullParameter(tabDataList, "tabDataList");
        this.f18749i = tabDataList;
        this.f18751k = AccountBiz.C10963e.f18735b;
        this.f18752l = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
        this.f18753m = new Function1() { // from class: com.kubi.assets.sort.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountTabSortAdapter.m19279r((List) obj);
            }
        };
        this.f18754n = new Function1() { // from class: com.kubi.assets.sort.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountTabSortAdapter.m19280s((List) obj);
            }
        };
    }
}
