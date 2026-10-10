package com.kubi.market.monitor.lib.p100ui.floating.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq.C4373b;
import com.blankj.utilcode.util.C5271g0;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kucoin.feature.widget.ChooseSymbolFragment;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import com.kubi.mvi.state.StatusVM;
import com.kubi.mvi.state.StatusView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback;
import io.chad.library.adapter.base.listener.OnItemDragListener;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import sl.C44512a;
import w00.C45682f;

/* JADX INFO: compiled from: SettingSymbolListView.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u001c\u001a\u00020\u0012H\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190\u00188TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/SettingSymbolListView;", "Lcom/kubi/mvi/state/StatusView;", "Lcom/kubi/market/monitor/lib/ui/floating/setting/UIState;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mAdapter", "Lcom/kubi/market/monitor/lib/ui/floating/setting/CurrencyAdapter;", "binding", "Lcom/kubi/kucoin/market/monitor/lib/databinding/FloatingWindowCurrencySettingLayoutBinding;", "getBinding", "()Lcom/kubi/kucoin/market/monitor/lib/databinding/FloatingWindowCurrencySettingLayoutBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initView", "", "onAttachedToWindow", "enableDragSort", "getLayout", "", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/StatusVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "bindState", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSettingSymbolListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingSymbolListView.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/SettingSymbolListView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n52#2:129\n80#2,7:130\n1#3:137\n*S KotlinDebug\n*F\n+ 1 SettingSymbolListView.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/SettingSymbolListView\n*L\n34#1:129\n34#1:130,7\n*E\n"})
public final class SettingSymbolListView extends StatusView<UIState> {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ KProperty<Object>[] f34303i = {Reflection.property1(new PropertyReference1Impl(SettingSymbolListView.class, "binding", "getBinding()Lcom/kubi/kucoin/market/monitor/lib/databinding/FloatingWindowCurrencySettingLayoutBinding;", 0))};

    /* JADX INFO: renamed from: g */
    @Nullable
    public CurrencyAdapter f34304g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final InterfaceC24293a f34305h;

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.SettingSymbolListView$a */
    /* JADX INFO: compiled from: SettingSymbolListView.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J,\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\f"}, m90084d2 = {"com/kubi/market/monitor/lib/ui/floating/setting/SettingSymbolListView$enableDragSort$1", "Lio/chad/library/adapter/base/listener/OnItemDragListener;", "onItemDragStart", "", "p0", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "p1", "", "onItemDragMoving", "p2", "p3", "onItemDragEnd", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C18651a implements OnItemDragListener {
        public C18651a() {
        }

        @Override // io.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragEnd(RecyclerView.ViewHolder p11, int p12) {
            List<TradeItemBean> listEmptyList;
            SettingSymbolListView settingSymbolListView = SettingSymbolListView.this;
            CurrencyAdapter currencyAdapter = settingSymbolListView.f34304g;
            if (currencyAdapter == null || (listEmptyList = currencyAdapter.getData()) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            settingSymbolListView.m42695w(new SortIntent(listEmptyList));
        }

        @Override // io.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragStart(RecyclerView.ViewHolder p11, int p12) {
            RecyclerView recyclerView;
            C44512a binding = SettingSymbolListView.this.getBinding();
            if (binding == null || (recyclerView = binding.f98583d) == null) {
                return;
            }
            recyclerView.performHapticFeedback(0, 2);
        }

        @Override // io.chad.library.adapter.base.listener.OnItemDragListener
        public void onItemDragMoving(RecyclerView.ViewHolder p11, int p12, RecyclerView.ViewHolder p13, int p14) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.setting.SettingSymbolListView$b */
    /* JADX INFO: compiled from: SettingSymbolListView.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/market/monitor/lib/ui/floating/setting/SettingSymbolListView$enableDragSort$itemDragAndSwipeCallback$1", "Lio/chad/library/adapter/base/callback/ItemDragAndSwipeCallback;", "onSelectedChanged", "", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "actionState", "", "clearView", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSettingSymbolListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingSymbolListView.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/SettingSymbolListView$enableDragSort$itemDragAndSwipeCallback$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,128:1\n172#2,2:129\n*S KotlinDebug\n*F\n+ 1 SettingSymbolListView.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/SettingSymbolListView$enableDragSort$itemDragAndSwipeCallback$1\n*L\n103#1:129,2\n*E\n"})
    public static final class C18652b extends ItemDragAndSwipeCallback {
        @Override // io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            viewHolder.itemView.setBackgroundColor(0);
            View itemView = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            itemView.setPadding(0, 0, 0, 0);
            super.clearView(recyclerView, viewHolder);
        }

        @Override // io.chad.library.adapter.base.callback.ItemDragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
            if (actionState != 0) {
                C5271g0.m6209b(viewHolder != null ? viewHolder.itemView : null);
            }
            super.onSelectedChanged(viewHolder, actionState);
        }

        public C18652b(CurrencyAdapter currencyAdapter) {
            super(currencyAdapter);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public SettingSymbolListView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SettingSymbolListView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: renamed from: G */
    private final void m40899G() {
        CurrencyAdapter currencyAdapter = this.f34304g;
        if (currencyAdapter != null) {
            currencyAdapter.setOnItemDragListener(new C18651a());
        }
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new C18652b(this.f34304g));
        C44512a binding = getBinding();
        if (binding != null) {
            itemTouchHelper.attachToRecyclerView(binding.f98583d);
        }
        CurrencyAdapter currencyAdapter2 = this.f34304g;
        if (currencyAdapter2 != null) {
            currencyAdapter2.enableDragItem(itemTouchHelper, R$id.sort_symbol, true);
        }
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m40900H(SettingSymbolListView settingSymbolListView) {
        C4373b.m3908j("B3suspentionSetting", "addcoin", null, null, 12, null);
        ChooseSymbolFragment.Companion companion = ChooseSymbolFragment.f27783Y;
        Context context = settingSymbolListView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.toChooseSymbolFragment(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C44512a getBinding() {
        return (C44512a) this.f34305h.getValue(this, f34303i[0]);
    }

    @Override // com.kubi.mvi.view.LifecycleView
    public int getLayout() {
        return R$layout.floating_window_currency_setting_layout;
    }

    @Override // com.kubi.mvi.view.MviView
    @NotNull
    public KClass<? extends StatusVM<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(SettingSymbolListVM.class);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SettingSymbolListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34305h = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44512a>() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.SettingSymbolListView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44512a invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44512a.m98484a(C45682f.m100800a(viewGroup));
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public static final void m40901I(SettingSymbolListView settingSymbolListView) {
        ViewGroup viewGroup;
        ViewParent parent = settingSymbolListView.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(settingSymbolListView);
        }
    }

    @Override // com.kubi.mvi.view.LifecycleView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (Exception unused) {
            post(new Runnable() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.n1
                @Override // java.lang.Runnable
                public final void run() {
                    SettingSymbolListView.m40901I(this.f34401b);
                }
            });
        }
    }

    @Override // com.kubi.mvi.state.StatusView, com.kubi.mvi.view.MviView
    /* JADX INFO: renamed from: p */
    public void mo40902p() {
        super.mo40902p();
        m42650z(new SettingSymbolListView$bindState$1(this, null));
        m42649y(new PropertyReference1Impl() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.SettingSymbolListView$bindState$2
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getTradeList();
            }
        }, new SettingSymbolListView$bindState$3(this, null));
    }

    @Override // com.kubi.mvi.view.MviView
    /* JADX INFO: renamed from: v */
    public void mo40903v() {
        TextView textView;
        RecyclerView recyclerView;
        super.mo40903v();
        C44512a binding = getBinding();
        if (binding != null && (recyclerView = binding.f98583d) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            CurrencyAdapter currencyAdapter = new CurrencyAdapter();
            this.f34304g = currencyAdapter;
            recyclerView.setAdapter(currencyAdapter);
        }
        C44512a binding2 = getBinding();
        if (binding2 != null && (textView = binding2.f98581b) != null) {
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.o1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SettingSymbolListView.m40900H(this.f34404b);
                }
            }, 1, null);
        }
        m40899G();
    }
}
