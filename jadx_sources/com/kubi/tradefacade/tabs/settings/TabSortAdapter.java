package com.kubi.tradefacade.tabs.settings;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import b40.TradeTabSortData;
import com.blankj.utilcode.util.C5271g0;
import com.blankj.utilcode.util.C5275i0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.sdk.BaseApplication;
import com.kubi.tradefacade.R$color;
import com.kubi.tradefacade.R$drawable;
import com.kubi.tradefacade.R$id;
import com.kubi.tradefacade.R$layout;
import com.kubi.tradefacade.tabs.data.C26001a;
import com.kubi.tradefacade.tabs.data.TabBiz;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseItemDraggableAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: TabSortAdapter.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0007J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ \u0010\u001b\u001a\u00020\u00002\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fJ \u0010\u001d\u001a\u00020\u00002\u0018\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fJ\u001c\u0010\u001e\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010!\u001a\u00020\"H\u0002J\u001a\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'H\u0002J\u0014\u0010(\u001a\u00020\u0011*\u00020)2\u0006\u0010 \u001a\u00020\u0002H\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/settings/TabSortAdapter;", "Lio/chad/library/adapter/base/BaseItemDraggableAdapter;", "Lcom/kubi/tradefacade/tabs/data/TradeTabSortData;", "Lio/chad/library/adapter/base/BaseViewHolder;", "tabDataList", "", "<init>", "(Ljava/util/List;)V", "getTabDataList", "()Ljava/util/List;", "isDragging", "", "checkTab", "Lcom/kubi/tradefacade/tabs/data/TabBiz;", "onHideChangeListener", "Lkotlin/Function1;", "", "", "onSortChangeListener", "horizontalLayoutHelper", "Lcom/kubi/tradefacade/tabs/settings/PreviewTabHorizontalLayoutHelper;", "withInitData", "tabs", "withBindLayoutView", "withSetupDragAndDrop", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "withHideChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "withSortChangeListener", "convert", "helper", "item", "createDragAndSwipeCallback", "Lio/chad/library/adapter/base/callback/ItemDragAndSwipeCallback;", "wrapperShadowColor", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "actionState", "", "wrapperHiddenEyeColor", "Landroidx/appcompat/widget/AppCompatImageView;", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TabSortAdapter extends BaseItemDraggableAdapter<TradeTabSortData, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<TradeTabSortData> f52010i;

    /* JADX INFO: renamed from: j */
    public boolean f52011j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public TabBiz f52012k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public Function1<? super List<TradeTabSortData>, Unit> f52013l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public Function1<? super List<TradeTabSortData>, Unit> f52014m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public PreviewTabHorizontalLayoutHelper f52015n;

    /* JADX INFO: renamed from: com.kubi.tradefacade.tabs.settings.TabSortAdapter$a */
    /* JADX INFO: compiled from: TabSortAdapter.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/tradefacade/tabs/settings/TabSortAdapter$createDragAndSwipeCallback$1", "Lio/chad/library/adapter/base/callback/ItemDragAndSwipeCallback;", "onSelectedChanged", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "actionState", "", "clearView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26002a extends ItemDragAndSwipeCallback {
        @Override // io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
            if (actionState == 2) {
                C44128b.m97258b("拖动开始");
                TabSortAdapter.this.f52011j = true;
            }
            if (actionState == 0 && TabSortAdapter.this.f52011j) {
                C44128b.m97258b("拖动停止");
                TabSortAdapter.this.f52011j = false;
                PreviewTabHorizontalLayoutHelper previewTabHorizontalLayoutHelper = TabSortAdapter.this.f52015n;
                if (previewTabHorizontalLayoutHelper != null) {
                    previewTabHorizontalLayoutHelper.m63660f(TabSortAdapter.this.m63633s(), TabSortAdapter.this.f52012k);
                }
                TabSortAdapter.this.f52014m.invoke(TabSortAdapter.this.m63633s());
            }
            if (actionState != 0) {
                TabSortAdapter.this.m63616C(viewHolder, actionState);
            }
            super.onSelectedChanged(viewHolder, actionState);
        }

        public C26002a() {
            super(TabSortAdapter.this);
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
    public TabSortAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ TabSortAdapter(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new ArrayList() : list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final void m63616C(RecyclerView.ViewHolder viewHolder, int i11) {
        if (i11 != 0) {
            View view = viewHolder != null ? viewHolder.itemView : null;
            C5271g0.a aVar = new C5271g0.a();
            aVar.m6216g(ContextCompat.getColor(BaseApplication.INSTANCE.get(), R$color.c_cover4));
            aVar.m6218i(C5275i0.m6236a(4.0f));
            C5271g0.m6208a(view, aVar);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m63626q(TradeTabSortData tradeTabSortData, AppCompatImageView appCompatImageView, TabSortAdapter tabSortAdapter, View it) {
        Unit unit;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!tradeTabSortData.getSupportHide()) {
            return Unit.INSTANCE;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            TradeTabSortData tradeTabSortDataM4278b = TradeTabSortData.m4278b(tradeTabSortData, null, false, !tradeTabSortData.getIsHide(), 3, null);
            int iIndexOf = tabSortAdapter.f52010i.indexOf(tradeTabSortData);
            if (iIndexOf != -1) {
                tabSortAdapter.f52010i.set(iIndexOf, tradeTabSortDataM4278b);
                tabSortAdapter.notifyItemChanged(iIndexOf);
            }
            tabSortAdapter.f52013l.invoke(tabSortAdapter.f52010i);
            PreviewTabHorizontalLayoutHelper previewTabHorizontalLayoutHelper = tabSortAdapter.f52015n;
            if (previewTabHorizontalLayoutHelper != null) {
                previewTabHorizontalLayoutHelper.m63660f(tabSortAdapter.f52010i, tabSortAdapter.f52012k);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    private final ItemDragAndSwipeCallback m63627r() {
        return new C26002a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Unit m63628t(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final Unit m63629u(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: A */
    public final TabSortAdapter m63630A(@NotNull Function1<? super List<TradeTabSortData>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f52014m = listener;
        return this;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable final TradeTabSortData tradeTabSortData) {
        if (baseViewHolder == null || tradeTabSortData == null) {
            return;
        }
        baseViewHolder.setText(R$id.tvTabName, C26001a.m63615a(tradeTabSortData.getBiz()));
        final AppCompatImageView appCompatImageView = (AppCompatImageView) baseViewHolder.getView(R$id.ivVisibleEye);
        Intrinsics.checkNotNull(appCompatImageView);
        m63631B(appCompatImageView, tradeTabSortData);
        ViewExtKt.m66575f(appCompatImageView, new Function1() { // from class: com.kubi.tradefacade.tabs.settings.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TabSortAdapter.m63626q(tradeTabSortData, appCompatImageView, this, (View) obj);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final List<TradeTabSortData> m63633s() {
        return this.f52010i;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final TabSortAdapter m63634v(@Nullable PreviewTabHorizontalLayoutHelper previewTabHorizontalLayoutHelper) {
        if (previewTabHorizontalLayoutHelper != null) {
            previewTabHorizontalLayoutHelper.m63660f(this.f52010i, this.f52012k);
        } else {
            previewTabHorizontalLayoutHelper = null;
        }
        this.f52015n = previewTabHorizontalLayoutHelper;
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final TabSortAdapter m63635w(@NotNull Function1<? super List<TradeTabSortData>, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f52013l = listener;
        return this;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    @NotNull
    /* JADX INFO: renamed from: x */
    public final TabSortAdapter m63636x(@NotNull TabBiz checkTab, @NotNull List<TradeTabSortData> tabs) {
        Intrinsics.checkNotNullParameter(checkTab, "checkTab");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f52012k = checkTab;
        this.f52010i.clear();
        this.f52010i.addAll(tabs);
        notifyDataSetChanged();
        return this;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final TabSortAdapter m63637y(@Nullable RecyclerView recyclerView) {
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(m63627r());
        itemTouchHelper.attachToRecyclerView(recyclerView);
        enableDragItem(itemTouchHelper, R$id.vDragRect, true);
        return this;
    }

    /* JADX INFO: renamed from: B */
    public final void m63631B(AppCompatImageView appCompatImageView, TradeTabSortData tradeTabSortData) {
        int i11;
        float f11;
        if (tradeTabSortData.getIsHide() && tradeTabSortData.getSupportHide()) {
            i11 = R$drawable.ic2_eye_close_20;
        } else {
            i11 = R$drawable.ic2_eye_open_20;
        }
        appCompatImageView.setImageDrawable(ContextCompat.getDrawable(appCompatImageView.getContext(), i11));
        C27046k.m66701p(appCompatImageView, ContextCompat.getColor(appCompatImageView.getContext(), R$color.c_text));
        if (!tradeTabSortData.getSupportHide()) {
            f11 = 0.2f;
        } else {
            f11 = 1.0f;
        }
        appCompatImageView.setAlpha(f11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabSortAdapter(@NotNull List<TradeTabSortData> tabDataList) {
        super(R$layout.kucoin_trade_tab_sort_item, tabDataList);
        Intrinsics.checkNotNullParameter(tabDataList, "tabDataList");
        this.f52010i = tabDataList;
        this.f52012k = TabBiz.C26000f.f52008b;
        this.f52013l = new Function1() { // from class: com.kubi.tradefacade.tabs.settings.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TabSortAdapter.m63628t((List) obj);
            }
        };
        this.f52014m = new Function1() { // from class: com.kubi.tradefacade.tabs.settings.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TabSortAdapter.m63629u((List) obj);
            }
        };
    }
}
