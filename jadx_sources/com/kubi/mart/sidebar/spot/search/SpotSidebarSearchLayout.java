package com.kubi.mart.sidebar.spot.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.mart.R$color;
import com.kubi.mart.R$layout;
import com.kubi.mart.sidebar.spot.helper.ListItemLongPressHelper;
import com.kubi.mart.sidebar.spot.search.SpotSidebarSearchLayout;
import com.kubi.mart.sidebar.spot.tablist.SpotSidebarTabListAdapter;
import com.kubi.resources.C22912t;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p182cq.C36520e;
import p268fq.C37579b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45682f;

/* JADX INFO: compiled from: SpotSidebarSearchLayout.kt */
/* JADX INFO: loaded from: classes28.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0015J\u001c\u0010!\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#J\u0018\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0007H\u0014J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u0007H\u0002R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/mart/sidebar/spot/search/SpotSidebarSearchLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/mart/databinding/MartLayoutSpotSidebarSearchBinding;", "getBinding", "()Lcom/kubi/mart/databinding/MartLayoutSpotSidebarSearchBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "listAdapter", "Lcom/kubi/mart/sidebar/spot/tablist/SpotSidebarTabListAdapter;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "sidebarType", "", "etSearch", "Landroid/widget/EditText;", "symbolCode", "currentKeyWord", "lonePressHelper", "Lcom/kubi/mart/sidebar/spot/helper/ListItemLongPressHelper;", "init", "", "changeSymbolCode", "onSearchStart", "keyWord", "onSearchEnd", FirebaseAnalytics.Param.ITEMS, "", "Lcom/kubi/data/entity/TradeItemBean;", "onVisibilityChanged", "changedView", "Landroid/view/View;", "visibility", "resetIndexOfLongPress", ViewProps.POSITION, "MartLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotSidebarSearchLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotSidebarSearchLayout.kt\ncom/kubi/mart/sidebar/spot/search/SpotSidebarSearchLayout\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n52#2:118\n80#2,7:119\n1#3:126\n*S KotlinDebug\n*F\n+ 1 SpotSidebarSearchLayout.kt\ncom/kubi/mart/sidebar/spot/search/SpotSidebarSearchLayout\n*L\n31#1:118\n31#1:119,7\n*E\n"})
public final class SpotSidebarSearchLayout extends FrameLayout {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ KProperty<Object>[] f34795j = {Reflection.property1(new PropertyReference1Impl(SpotSidebarSearchLayout.class, "binding", "getBinding()Lcom/kubi/mart/databinding/MartLayoutSpotSidebarSearchBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f34796b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final SpotSidebarTabListAdapter f34797c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public BaseFragment f34798d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f34799e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public EditText f34800f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public String f34801g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public String f34802h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final ListItemLongPressHelper f34803i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SpotSidebarSearchLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: h */
    public static Unit m41508h(SpotSidebarSearchLayout spotSidebarSearchLayout) {
        spotSidebarSearchLayout.m41520s(-1);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SpotSidebarSearchLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: d */
    public static Unit m41504d(final SpotSidebarSearchLayout spotSidebarSearchLayout, final int i11) {
        C27100x0.m66923d(new Function0() { // from class: eq.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarSearchLayout.m41506f(this.f82565b, i11);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static Unit m41506f(SpotSidebarSearchLayout spotSidebarSearchLayout, int i11) {
        spotSidebarSearchLayout.f34797c.notifyItemChanged(i11);
        return Unit.INSTANCE;
    }

    private final C36520e getBinding() {
        return (C36520e) this.f34796b.getValue(this, f34795j[0]);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m41511l(SpotSidebarSearchLayout spotSidebarSearchLayout, String str) {
        spotSidebarSearchLayout.f34801g = str == null ? "" : str;
        spotSidebarSearchLayout.f34797c.m41583j(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m41512n(SpotSidebarSearchLayout spotSidebarSearchLayout, String str, BaseFragment baseFragment, EditText editText, String str2) {
        spotSidebarSearchLayout.f34799e = str;
        spotSidebarSearchLayout.f34798d = baseFragment;
        spotSidebarSearchLayout.f34800f = editText;
        spotSidebarSearchLayout.f34797c.m41582i(baseFragment, str, str2, null);
        spotSidebarSearchLayout.m41516k(str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m41513p(String str, List list, SpotSidebarSearchLayout spotSidebarSearchLayout) {
        C37579b.m84715d("onSearchEnd. keyWord=" + str + ", list=" + list.size());
        if (!StringsKt.equals(str, spotSidebarSearchLayout.f34802h, true)) {
            return Unit.INSTANCE;
        }
        C36520e binding = spotSidebarSearchLayout.getBinding();
        if (binding == null) {
            return Unit.INSTANCE;
        }
        LottieAnimationView loading = binding.f79369b;
        Intrinsics.checkNotNullExpressionValue(loading, "loading");
        C27046k.m66700o(loading);
        binding.f79369b.cancelAnimation();
        RecyclerView recyclerView = binding.f79370c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        C27046k.m66685H(recyclerView);
        spotSidebarSearchLayout.f34797c.setNewData(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m41515t(SpotSidebarSearchLayout spotSidebarSearchLayout, int i11) {
        if (spotSidebarSearchLayout.f34797c.getF34818m() != -1) {
            SpotSidebarTabListAdapter spotSidebarTabListAdapter = spotSidebarSearchLayout.f34797c;
            spotSidebarTabListAdapter.notifyItemChanged(spotSidebarTabListAdapter.getF34818m());
        }
        spotSidebarSearchLayout.f34797c.m41591t(i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final void m41516k(@Nullable final String str) {
        C27100x0.m66923d(new Function0() { // from class: eq.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarSearchLayout.m41511l(this.f82547b, str);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m41517m(@NotNull final BaseFragment fragment, @NotNull final String sidebarType, @Nullable final String str, @NotNull final EditText etSearch) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(sidebarType, "sidebarType");
        Intrinsics.checkNotNullParameter(etSearch, "etSearch");
        C27100x0.m66923d(new Function0() { // from class: eq.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarSearchLayout.m41512n(this.f82553b, sidebarType, fragment, etSearch, str);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m41518o(@NotNull final String keyWord, @NotNull final List<? extends TradeItemBean> items) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        Intrinsics.checkNotNullParameter(items, "items");
        C27100x0.m66923d(new Function0() { // from class: eq.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarSearchLayout.m41513p(keyWord, items, this);
            }
        });
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        if (visibility != 0) {
            this.f34803i.m41463k(true);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m41519q(@NotNull final String keyWord) {
        Intrinsics.checkNotNullParameter(keyWord, "keyWord");
        C27100x0.m66923d(new Function0() { // from class: eq.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarSearchLayout.m41514r(this.f82561b, keyWord);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final void m41520s(final int i11) {
        C27100x0.m66923d(new Function0() { // from class: eq.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarSearchLayout.m41515t(this.f82563b, i11);
            }
        });
    }

    public /* synthetic */ SpotSidebarSearchLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m41510j(final SpotSidebarSearchLayout spotSidebarSearchLayout, BaseQuickAdapter baseQuickAdapter, View view, final int i11) {
        TradeItemBean tradeItemBean;
        Object item = baseQuickAdapter.getItem(i11);
        RecyclerView recyclerView = null;
        if (item instanceof TradeItemBean) {
            tradeItemBean = (TradeItemBean) item;
        } else {
            tradeItemBean = null;
        }
        if (tradeItemBean == null) {
            return false;
        }
        view.setBackgroundResource(R$color.emphasis4);
        spotSidebarSearchLayout.m41520s(i11);
        ListItemLongPressHelper listItemLongPressHelper = spotSidebarSearchLayout.f34803i;
        C36520e binding = spotSidebarSearchLayout.getBinding();
        if (binding != null) {
            recyclerView = binding.f79370c;
        }
        Intrinsics.checkNotNull(view);
        listItemLongPressHelper.m41465o(recyclerView, tradeItemBean, i11, view, new Function0() { // from class: eq.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarSearchLayout.m41508h(this.f82558b);
            }
        }, new Function0() { // from class: eq.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotSidebarSearchLayout.m41504d(this.f82559b, i11);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m41514r(SpotSidebarSearchLayout spotSidebarSearchLayout, String str) {
        C36520e binding = spotSidebarSearchLayout.getBinding();
        if (binding == null) {
            return Unit.INSTANCE;
        }
        C37579b.m84715d("onSearchStart. keyWord=" + str);
        spotSidebarSearchLayout.f34802h = str;
        RecyclerView recyclerView = binding.f79370c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        C27046k.m66700o(recyclerView);
        LottieAnimationView loading = binding.f79369b;
        Intrinsics.checkNotNullExpressionValue(loading, "loading");
        if (!C27046k.m66704s(loading)) {
            LottieAnimationView loading2 = binding.f79369b;
            Intrinsics.checkNotNullExpressionValue(loading2, "loading");
            C27046k.m66685H(loading2);
            binding.f79369b.playAnimation();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SpotSidebarSearchLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34796b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C36520e>() { // from class: com.kubi.mart.sidebar.spot.search.SpotSidebarSearchLayout$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36520e invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C36520e.m81769a(C45682f.m100800a(viewGroup));
            }
        });
        SpotSidebarTabListAdapter spotSidebarTabListAdapter = new SpotSidebarTabListAdapter();
        this.f34797c = spotSidebarTabListAdapter;
        this.f34801g = "";
        this.f34803i = new ListItemLongPressHelper();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.inflate(R$layout.mart_layout_spot_sidebar_search, (ViewGroup) this, true);
        C36520e binding = getBinding();
        if (binding != null && (recyclerView2 = binding.f79370c) != null) {
            C22912t.m54409g(recyclerView2, false);
        }
        C36520e binding2 = getBinding();
        if (binding2 != null && (recyclerView = binding2.f79370c) != null) {
            int i12 = R$layout.view_empty;
            C36520e binding3 = getBinding();
            View viewInflate = layoutInflaterFrom.inflate(i12, (ViewGroup) (binding3 != null ? binding3.f79370c : null), false);
            viewInflate.setBackgroundResource(R$color.c_bulletLayer);
            spotSidebarTabListAdapter.setEmptyView(viewInflate);
            recyclerView.setAdapter(spotSidebarTabListAdapter);
        }
        spotSidebarTabListAdapter.setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: eq.b
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
            public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i13) {
                return SpotSidebarSearchLayout.m41510j(this.f82549a, baseQuickAdapter, view, i13);
            }
        });
    }
}
