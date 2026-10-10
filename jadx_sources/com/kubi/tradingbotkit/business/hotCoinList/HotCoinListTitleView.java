package com.kubi.tradingbotkit.business.hotCoinList;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.tradingbotkit.R$id;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.business.hotCoinList.HotCoinListTitleView;
import com.kubi.tradingbotkit.model.HotCoinListModel;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.util.List;
import l50.C42097w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;
import y40.InterfaceC46384d;

/* JADX INFO: compiled from: HotCoinListTitleView.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001 B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0019R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/hotCoinList/HotCoinListTitleView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitLayoutHotCoinListBinding;", "getViewBinding", "()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitLayoutHotCoinListBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/kubi/tradingbotkit/business/hotCoinList/HotCoinListAdapter;", "getAdapter", "()Lcom/kubi/tradingbotkit/business/hotCoinList/HotCoinListAdapter;", "initView", "", "setNewData", "mutableList", "", "Lcom/kubi/tradingbotkit/model/HotCoinListModel;", "hotCoinListener", "Lcom/kubi/tradingbotkit/business/hotCoinList/IHotCoinClickListener;", "getHotCoinListener", "()Lcom/kubi/tradingbotkit/business/hotCoinList/IHotCoinClickListener;", "setHotCoinListener", "(Lcom/kubi/tradingbotkit/business/hotCoinList/IHotCoinClickListener;)V", "registerCallBack", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Companion", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HotCoinListTitleView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f52397d = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f52398b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final HotCoinListAdapter f52399c;

    /* JADX INFO: compiled from: HotCoinListTitleView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/hotCoinList/HotCoinListTitleView$Companion;", "", "<init>", "()V", "MAX_LENGTH", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Nullable
    public final InterfaceC46384d getHotCoinListener() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotCoinListTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52398b = LazyKt.lazy(new Function0() { // from class: y40.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HotCoinListTitleView.m64065g(this.f104011b);
            }
        });
        final HotCoinListAdapter hotCoinListAdapter = new HotCoinListAdapter();
        hotCoinListAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: y40.b
            @Override // io.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                HotCoinListTitleView.m64063d(hotCoinListAdapter, this, baseQuickAdapter, view, i11);
            }
        });
        this.f52399c = hotCoinListAdapter;
        LayoutInflater.from(context).inflate(R$layout.btrading_bot_kit_layout_hot_coin_list, this);
        m64066e();
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m64064f(HotCoinListTitleView hotCoinListTitleView, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        hotCoinListTitleView.getClass();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final C42097w m64065g(HotCoinListTitleView hotCoinListTitleView) {
        C42097w c42097wM92349a = C42097w.m92349a(hotCoinListTitleView.findViewById(R$id.root_view));
        Intrinsics.checkNotNullExpressionValue(c42097wM92349a, "bind(...)");
        return c42097wM92349a;
    }

    private final C42097w getViewBinding() {
        return (C42097w) this.f52398b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: getAdapter, reason: from getter */
    public final HotCoinListAdapter getF52399c() {
        return this.f52399c;
    }

    public final void setNewData(@NotNull List<HotCoinListModel> mutableList) {
        Intrinsics.checkNotNullParameter(mutableList, "mutableList");
        if (mutableList.size() > 3) {
            mutableList = mutableList.subList(0, 3);
        }
        this.f52399c.setNewData(mutableList);
    }

    /* JADX INFO: renamed from: d */
    public static final void m64063d(HotCoinListAdapter hotCoinListAdapter, HotCoinListTitleView hotCoinListTitleView, BaseQuickAdapter baseQuickAdapter, View view, int i11) {
        if (hotCoinListAdapter.getItem(i11) != null) {
            hotCoinListTitleView.getClass();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m64066e() {
        try {
            if (getContext() != null) {
                RecyclerView recyclerView = getViewBinding().f93299b;
                if (recyclerView != null) {
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                    linearLayoutManager.setOrientation(0);
                    recyclerView.setLayoutManager(linearLayoutManager);
                }
                RecyclerView recyclerView2 = getViewBinding().f93299b;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(this.f52399c);
                }
                AppCompatTextView appCompatTextView = getViewBinding().f93301d;
                if (appCompatTextView != null) {
                    ViewExtKt.m66575f(appCompatTextView, new Function1() { // from class: y40.c
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HotCoinListTitleView.m64064f(this.f104014b, (View) obj);
                        }
                    });
                }
            }
        } catch (Exception e11) {
            C44128b.m97264h(e11);
        }
    }

    public final void setHotCoinListener(@Nullable InterfaceC46384d interfaceC46384d) {
    }
}
