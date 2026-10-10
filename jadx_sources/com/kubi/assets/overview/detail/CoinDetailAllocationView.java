package com.kubi.assets.overview.detail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$layout;
import com.kubi.assets.entity.CurrencyDistributionItemResponse;
import com.kubi.assets.view.AssetEmptyView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44784i;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: CoinDetailAllocationView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u001a\u001a\u00020\u00182\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00180\u0017J\u001c\u0010\u001c\u001a\u00020\u00182\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00180\u0017J\u0016\u0010\u001d\u001a\u00020\u00182\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fJ\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0002R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, m90084d2 = {"Lcom/kubi/assets/overview/detail/CoinDetailAllocationView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", FirebaseAnalytics.Param.CURRENCY, "", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "binding", "Lcom/kubi/assets/databinding/AssetCoinDetailAllocationViewBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetCoinDetailAllocationViewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/assets/overview/detail/AllocationAdapter;", "onAdapterGoingClickListener", "Lkotlin/Function1;", "", "onAdapterItemClickListener", "setOnItemClickListener", TUIConstants.TUIChat.CALL_BACK, "setOnGoingClickListener", "setAllocationData", "allocationList", "", "Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;", "setVewVisible", ViewProps.VISIBLE, "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoinDetailAllocationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoinDetailAllocationView.kt\ncom/kubi/assets/overview/detail/CoinDetailAllocationView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n52#2:74\n80#2,7:75\n1068#3:82\n*S KotlinDebug\n*F\n+ 1 CoinDetailAllocationView.kt\ncom/kubi/assets/overview/detail/CoinDetailAllocationView\n*L\n24#1:74\n24#1:75,7\n60#1:82\n*E\n"})
public final class CoinDetailAllocationView extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ KProperty<Object>[] f18321g = {Reflection.property1(new PropertyReference1Impl(CoinDetailAllocationView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetCoinDetailAllocationViewBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f18322b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final InterfaceC24293a f18323c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final AllocationAdapter f18324d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public Function1<? super String, Unit> f18325e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Function1<? super String, Unit> f18326f;

    /* JADX INFO: renamed from: com.kubi.assets.overview.detail.CoinDetailAllocationView$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 CoinDetailAllocationView.kt\ncom/kubi/assets/overview/detail/CoinDetailAllocationView\n*L\n1#1,328:1\n61#2:329\n*E\n"})
    public static final class C10672a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            BigDecimal proportion = ((CurrencyDistributionItemResponse) t12).getProportion();
            if (proportion == null) {
                proportion = BigDecimal.ZERO;
            }
            BigDecimal proportion2 = ((CurrencyDistributionItemResponse) t11).getProportion();
            if (proportion2 == null) {
                proportion2 = BigDecimal.ZERO;
            }
            return ComparisonsKt.compareValues(proportion, proportion2);
        }
    }

    public final void setAllocationData(@Nullable List<CurrencyDistributionItemResponse> allocationList) {
        ImageView imageView;
        if (allocationList == null || allocationList.isEmpty()) {
            setVewVisible(false);
            return;
        }
        this.f18324d.m18525l(this.f18322b);
        setVewVisible(true);
        this.f18324d.m18526m(CollectionsKt.sortedWith(allocationList, new C10672a()));
        C44784i binding = getBinding();
        if (binding == null || (imageView = binding.f100098d) == null) {
            return;
        }
        AssetExKt.m15138z(imageView, allocationList.size() > 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailAllocationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        ImageView imageView;
        RecyclerView recyclerView;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f18323c = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44784i>() { // from class: com.kubi.assets.overview.detail.CoinDetailAllocationView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44784i invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44784i.m99085a(C45682f.m100800a(viewGroup));
            }
        });
        AllocationAdapter allocationAdapter = new AllocationAdapter();
        this.f18324d = allocationAdapter;
        LayoutInflater.from(context).inflate(R$layout.asset_coin_detail_allocation_view, this);
        C44784i binding = getBinding();
        if (binding != null && (recyclerView = binding.f100096b) != null) {
            recyclerView.setAdapter(allocationAdapter);
        }
        C44784i binding2 = getBinding();
        if (binding2 != null && (imageView = binding2.f100098d) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.overview.detail.a0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CoinDetailAllocationView.m18606d(this.f18337b);
                }
            }, 1, null);
        }
        allocationAdapter.m18528o(new Function1() { // from class: com.kubi.assets.overview.detail.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoinDetailAllocationView.m18607e(this.f18340b, (String) obj);
            }
        });
        allocationAdapter.m18527n(new Function1() { // from class: com.kubi.assets.overview.detail.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoinDetailAllocationView.m18608f(this.f18342b, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m18606d(CoinDetailAllocationView coinDetailAllocationView) {
        ImageView imageView;
        coinDetailAllocationView.f18324d.m18529p();
        int i11 = coinDetailAllocationView.f18324d.getData().size() > 3 ? R$drawable.ic2_arrow_up_20 : R$drawable.ic2_arrow_down_20;
        C44784i binding = coinDetailAllocationView.getBinding();
        if (binding != null && (imageView = binding.f100098d) != null) {
            imageView.setImageResource(i11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m18607e(CoinDetailAllocationView coinDetailAllocationView, String str) {
        Function1<? super String, Unit> function1 = coinDetailAllocationView.f18326f;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m18608f(CoinDetailAllocationView coinDetailAllocationView, String str) {
        Function1<? super String, Unit> function1 = coinDetailAllocationView.f18325e;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    private final C44784i getBinding() {
        return (C44784i) this.f18323c.getValue(this, f18321g[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: getCurrency, reason: from getter */
    public final String getF18322b() {
        return this.f18322b;
    }

    public final void setCurrency(@Nullable String str) {
        this.f18322b = str;
    }

    public final void setOnGoingClickListener(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f18325e = callback;
    }

    public final void setOnItemClickListener(@NotNull Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f18326f = callback;
    }

    private final void setVewVisible(boolean visible) {
        ImageView imageView;
        RecyclerView recyclerView;
        AssetEmptyView assetEmptyView;
        C44784i binding = getBinding();
        if (binding != null && (assetEmptyView = binding.f100099e) != null) {
            AssetExKt.m15138z(assetEmptyView, !visible);
        }
        C44784i binding2 = getBinding();
        if (binding2 != null && (recyclerView = binding2.f100096b) != null) {
            AssetExKt.m15138z(recyclerView, visible);
        }
        C44784i binding3 = getBinding();
        if (binding3 != null && (imageView = binding3.f100098d) != null) {
            AssetExKt.m15138z(imageView, visible);
        }
    }
}
