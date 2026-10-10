package com.kubi.kucoin.feature.widget;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.kucoin.feature.widget.appwidget.WidgetIntent;
import com.kubi.kucoin.market.monitor.lib.R$color;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.kucoin.market.monitor.lib.R$layout;
import com.kubi.kucoin.market.monitor.lib.R$string;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.entity.MarketsEntity;
import com.kubi.utils.C27103z;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p265fl.C37565d;
import p839zp.C46902a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import sl.C44520i;
import w00.C45681e;

/* JADX INFO: compiled from: ChooseSymbolFragment.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\u0006\u0010\u001c\u001a\u00020\u0015J\b\u0010\u001d\u001a\u00020\u0015H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\rj\b\u0012\u0004\u0012\u00020\u0011`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/ChooseSymbolFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "marketMonitorFragmentChooseSymbolBinding", "Lcom/kubi/kucoin/market/monitor/lib/databinding/MarketMonitorFragmentChooseSymbolBinding;", "getMarketMonitorFragmentChooseSymbolBinding", "()Lcom/kubi/kucoin/market/monitor/lib/databinding/MarketMonitorFragmentChooseSymbolBinding;", "marketMonitorFragmentChooseSymbolBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/utils/InnerPagerAdapter;", "tabFragments", "Ljava/util/ArrayList;", "Lcom/kubi/kucoin/feature/widget/ChooseSymbolChildFragment;", "Lkotlin/collections/ArrayList;", "mTabs", "", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showEditDialog", "pageNotifyDataSetChanged", "updateCount", "onPause", "Companion", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nChooseSymbolFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChooseSymbolFragment.kt\ncom/kubi/kucoin/feature/widget/ChooseSymbolFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n147#2,16:316\n1869#3,2:332\n*S KotlinDebug\n*F\n+ 1 ChooseSymbolFragment.kt\ncom/kubi/kucoin/feature/widget/ChooseSymbolFragment\n*L\n56#1:316,16\n177#1:332,2\n*E\n"})
public final class ChooseSymbolFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: V */
    @Nullable
    public C27103z f27786V;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f27784Z = {Reflection.property1(new PropertyReference1Impl(ChooseSymbolFragment.class, "marketMonitorFragmentChooseSymbolBinding", "getMarketMonitorFragmentChooseSymbolBinding()Lcom/kubi/kucoin/market/monitor/lib/databinding/MarketMonitorFragmentChooseSymbolBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f27783Y = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f27785U = C45681e.m100799e(this, new Function1<ChooseSymbolFragment, C44520i>() { // from class: com.kubi.kucoin.feature.widget.ChooseSymbolFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44520i invoke(@NotNull ChooseSymbolFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44520i.m98500a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44520i, Unit>() { // from class: com.kubi.kucoin.feature.widget.ChooseSymbolFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44520i it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44520i c44520i) {
            invoke(c44520i);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public ArrayList<ChooseSymbolChildFragment> f27787W = new ArrayList<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public ArrayList<String> f27788X = new ArrayList<>();

    /* JADX INFO: compiled from: ChooseSymbolFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kucoin/feature/widget/ChooseSymbolFragment$Companion;", "", "<init>", "()V", "ACTION_WIDGET_DESK_ADD", "", "toChooseSymbolFragment", "", "context", "Landroid/content/Context;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        public final void toChooseSymbolFragment(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseFragmentActivity.m56573m0(context, context.getString(R$string.symbol_choose), ChooseSymbolFragment.class.getName());
        }
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m32083B3(ChooseSymbolFragment chooseSymbolFragment, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        ((RecyclerView) viewHolder.getView(R$id.recycler_view)).setAdapter(new ChooseSymbolFragment$showEditDialog$1$1(chooseSymbolFragment, dialogFragmentHelper, R$layout.market_monitor_view_item_choose_symbol, CollectionsKt.reversed(C37565d.f83517a.m84603i())));
        viewHolder.getView(R$id.tv_cancel).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.kucoin.feature.widget.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseSymbolFragment.m32084C3(dialogFragmentHelper, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m32085D3(ChooseSymbolFragment chooseSymbolFragment, BaseViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        viewHolder.setText(R$id.tv_cancel, chooseSymbolFragment.getString(R$string.confirm));
        if (C5275i0.m6237b(recyclerView) > C5267e0.m6182d() / 2) {
            recyclerView.getLayoutParams().height = C5267e0.m6182d() / 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m32099y3(ChooseSymbolFragment chooseSymbolFragment, View view) {
        if (C37565d.f83517a.m84606n() != 0) {
            chooseSymbolFragment.m32100A3();
        }
    }

    /* JADX INFO: renamed from: A3 */
    public final void m32100A3() {
        DialogFragmentHelper dialogFragmentHelperM54238g4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.view_bottom_sheet_dialog, 0, 0, 0, false, false, false, false, false, 510, null).m54237f4(new Function2() { // from class: com.kubi.kucoin.feature.widget.l
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ChooseSymbolFragment.m32083B3(this.f27840b, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).m54238g4(new Function1() { // from class: com.kubi.kucoin.feature.widget.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseSymbolFragment.m32085D3(this.f27841b, (BaseViewHolder) obj);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54238g4.show(childFragmentManager, "edit_symbols");
    }

    /* JADX INFO: renamed from: E3 */
    public final void m32101E3() {
        TextView rightText;
        C37565d c37565d = C37565d.f83517a;
        if (c37565d.m84606n() == 0) {
            NavigationBar navigationBar = getNavigationBar();
            if (navigationBar != null) {
                navigationBar.setRightText("");
            }
        } else {
            NavigationBar navigationBar2 = getNavigationBar();
            if (navigationBar2 != null) {
                navigationBar2.setRightText(getString(R$string.edit) + '(' + c37565d.m84606n() + ')');
            }
        }
        NavigationBar navigationBar3 = getNavigationBar();
        if (navigationBar3 == null || (rightText = navigationBar3.getRightText()) == null) {
            return;
        }
        rightText.setTextColor(getColorRes(R$color.primary));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.market_monitor_fragment_choose_symbol;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Observable<ArrayList<MarketsEntity>> observableObserveOn = C46902a.f104768a.m103312b().mo60003p().subscribeOn(Schedulers.m87969io()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.kucoin.feature.widget.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseSymbolFragment.m32095u3(this.f27836b, (ArrayList) obj);
            }
        };
        Consumer<? super ArrayList<MarketsEntity>> consumer = new Consumer() { // from class: com.kubi.kucoin.feature.widget.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChooseSymbolFragment.m32096v3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.kucoin.feature.widget.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseSymbolFragment.m32097w3((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.kucoin.feature.widget.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ChooseSymbolFragment.m32098x3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.setMainTitle(getString(R$string.symbol_choose));
        }
        m32101E3();
        NavigationBar navigationBar2 = getNavigationBar();
        if (navigationBar2 != null) {
            navigationBar2.setRightTextOnclickListener(new View.OnClickListener() { // from class: com.kubi.kucoin.feature.widget.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChooseSymbolFragment.m32099y3(this.f27839b, view2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t3 */
    public final C44520i m32102t3() {
        return (C44520i) this.f27785U.getValue(this, f27784Z[0]);
    }

    /* JADX INFO: renamed from: z3 */
    public final void m32103z3() {
        Iterator<T> it = this.f27787W.iterator();
        while (it.hasNext()) {
            ((ChooseSymbolChildFragment) it.next()).m32076t3();
        }
    }

    /* JADX INFO: renamed from: C3 */
    public static final void m32084C3(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m32095u3(ChooseSymbolFragment chooseSymbolFragment, ArrayList arrayList) {
        Boolean boolValueOf;
        SlidingTabLayout slidingTabLayout;
        RtlViewPager rtlViewPager;
        RtlViewPager rtlViewPager2;
        SlidingTabLayout slidingTabLayout2;
        SlidingTabLayout slidingTabLayout3;
        RtlViewPager rtlViewPager3;
        if (chooseSymbolFragment.getActivity() != null) {
            FragmentActivity activity = chooseSymbolFragment.getActivity();
            RtlViewPager rtlViewPager4 = null;
            if (activity != null) {
                boolValueOf = Boolean.valueOf(activity.isFinishing());
            } else {
                boolValueOf = null;
            }
            if (!C27025c.m66566d(boolValueOf) && !chooseSymbolFragment.isDetached() && chooseSymbolFragment.getContext() != null) {
                if (arrayList != null && !arrayList.isEmpty()) {
                    chooseSymbolFragment.f27787W.clear();
                    chooseSymbolFragment.f27788X.clear();
                    int size = arrayList.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (!TextUtils.isEmpty(((MarketsEntity) arrayList.get(i11)).getDisplayName())) {
                            ArrayList<ChooseSymbolChildFragment> arrayList2 = chooseSymbolFragment.f27787W;
                            ChooseSymbolChildFragment.Companion companion = ChooseSymbolChildFragment.f27778W;
                            Object obj = arrayList.get(i11);
                            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            arrayList2.add(companion.newInstance((MarketsEntity) obj));
                            chooseSymbolFragment.f27788X.add(((MarketsEntity) arrayList.get(i11)).getDisplayName());
                        }
                    }
                    chooseSymbolFragment.f27787W.add(0, ChooseSymbolChildFragment.f27778W.newInstance(new MarketsEntity("favor", "favor", false, null, 12, null)));
                    chooseSymbolFragment.f27788X.add(0, chooseSymbolFragment.getString(R$string.favorites));
                    C27103z c27103z = chooseSymbolFragment.f27786V;
                    if (c27103z == null) {
                        FragmentManager childFragmentManager = chooseSymbolFragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                        chooseSymbolFragment.f27786V = new C27103z(childFragmentManager, chooseSymbolFragment.f27787W, chooseSymbolFragment.f27788X);
                        C44520i c44520iM32102t3 = chooseSymbolFragment.m32102t3();
                        if (c44520iM32102t3 != null && (rtlViewPager3 = c44520iM32102t3.f98669c) != null) {
                            rtlViewPager3.setAdapter(chooseSymbolFragment.f27786V);
                        }
                        C44520i c44520iM32102t4 = chooseSymbolFragment.m32102t3();
                        if (c44520iM32102t4 != null && (slidingTabLayout3 = c44520iM32102t4.f98668b) != null) {
                            C44520i c44520iM32102t5 = chooseSymbolFragment.m32102t3();
                            if (c44520iM32102t5 != null) {
                                rtlViewPager4 = c44520iM32102t5.f98669c;
                            }
                            slidingTabLayout3.setViewPager(rtlViewPager4);
                        }
                        C44520i c44520iM32102t6 = chooseSymbolFragment.m32102t3();
                        if (c44520iM32102t6 != null && (slidingTabLayout2 = c44520iM32102t6.f98668b) != null) {
                            slidingTabLayout2.m55291w();
                        }
                    } else {
                        if (c27103z != null) {
                            c27103z.notifyDataSetChanged();
                        }
                        C44520i c44520iM32102t7 = chooseSymbolFragment.m32102t3();
                        if (c44520iM32102t7 != null && (slidingTabLayout = c44520iM32102t7.f98668b) != null) {
                            slidingTabLayout.m55291w();
                        }
                    }
                    C44520i c44520iM32102t8 = chooseSymbolFragment.m32102t3();
                    if (c44520iM32102t8 != null && (rtlViewPager2 = c44520iM32102t8.f98669c) != null) {
                        rtlViewPager2.setOffscreenPageLimit(chooseSymbolFragment.f27788X.size());
                    }
                    C44520i c44520iM32102t9 = chooseSymbolFragment.m32102t3();
                    if (c44520iM32102t9 != null && (rtlViewPager = c44520iM32102t9.f98669c) != null) {
                        rtlViewPager.setCurrentItem(0);
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final void m32096v3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m32097w3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final void m32098x3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.sendBroadcast(new WidgetIntent("android.appwidget.action.desktop_widget_refresh"));
        }
    }
}
