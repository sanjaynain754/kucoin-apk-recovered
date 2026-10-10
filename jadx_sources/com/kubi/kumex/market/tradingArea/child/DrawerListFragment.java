package com.kubi.kumex.market.tradingArea.child;

import android.os.Bundle;
import android.view.View;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.market.model.AvailableTradeAreaEntity;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.market.ContractObject;
import com.kubi.kumex.market.ResetChildSortType;
import com.kubi.kumex.market.tradingArea.BaseTradingAreaFragment;
import com.kubi.kumex.market.tradingArea.ChildSection;
import com.kubi.kumex.trade.FuturesFragment;
import com.kubi.kumex.utils.C17058m0;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.C17066r;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36789k1;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Iterator;
import java.util.List;
import km.C41075d;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: DrawerListFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0014J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\u0018\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u000eH\u0002J\u0010\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020&H\u0016J\u001e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016J\b\u0010,\u001a\u00020\u0014H\u0014J\u0018\u0010-\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u000eH\u0014J \u0010/\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u000e2\u0006\u00100\u001a\u000201H\u0016J \u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00102\b\u00104\u001a\u0004\u0018\u000105J\b\u00106\u001a\u00020\u000eH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/child/DrawerListFragment;", "Lcom/kubi/kumex/market/tradingArea/child/BaseTradingListFragment;", "Lcom/kubi/kumex/market/ResetChildSortType;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexDrawerFragmentListBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexDrawerFragmentListBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "section", "Lcom/kubi/kumex/market/tradingArea/ChildSection;", "layoutRes", "", "getParentPageId", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "setSectionAdapter", "initObserver", "initListener", "onSectionItemClick", "id", ViewProps.POSITION, "setAdapter", "setParentChildSortType", "sortName", "sortType", "onItemClick", "data", "Lcom/kubi/kumex/market/ContractObject;", "toDisplayList", "", "lists", "", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "showContent", "onRecyclerViewScrollStateChanged", "newState", "resetSortType", "force", "", "putArgumentsAndNotifySection", "type", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "getSectionPosition", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDrawerListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawerListFragment.kt\ncom/kubi/kumex/market/tradingArea/child/DrawerListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,251:1\n147#2,16:252\n2756#3:268\n1#4:269\n*S KotlinDebug\n*F\n+ 1 DrawerListFragment.kt\ncom/kubi/kumex/market/tradingArea/child/DrawerListFragment\n*L\n40#1:252,16\n166#1:268\n166#1:269\n*E\n"})
public class DrawerListFragment extends BaseTradingListFragment implements ResetChildSortType {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final InterfaceC24293a f29515b0 = C45681e.m100799e(this, new Function1<DrawerListFragment, C36789k1>() { // from class: com.kubi.kumex.market.tradingArea.child.DrawerListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36789k1 invoke(@NotNull DrawerListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36789k1.m82437a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36789k1, Unit>() { // from class: com.kubi.kumex.market.tradingArea.child.DrawerListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36789k1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36789k1 c36789k1) {
            invoke(c36789k1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public ChildSection f29516c0;

    /* JADX INFO: renamed from: e0 */
    public static final /* synthetic */ KProperty<Object>[] f29514e0 = {Reflection.property1(new PropertyReference1Impl(DrawerListFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDrawerFragmentListBinding;", 0))};

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public static final Companion f29513d0 = new Companion(null);

    /* JADX INFO: compiled from: DrawerListFragment.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kumex/market/tradingArea/child/DrawerListFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/market/tradingArea/child/DrawerListFragment;", "type", "", "tradingAreaName", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/market/model/AvailableTradeAreaEntity;", "sortName", "sortType", "sectionPosition", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ DrawerListFragment newInstance$default(Companion companion, int i11, String str, AvailableTradeAreaEntity availableTradeAreaEntity, String str2, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i11 = 0;
            }
            return companion.newInstance(i11, str, availableTradeAreaEntity, str2, i12, i13);
        }

        @NotNull
        public final DrawerListFragment newInstance(int type, @NotNull String tradingAreaName, @NotNull AvailableTradeAreaEntity entity, @Nullable String sortName, int sortType, int sectionPosition) {
            Intrinsics.checkNotNullParameter(tradingAreaName, "tradingAreaName");
            Intrinsics.checkNotNullParameter(entity, "entity");
            DrawerListFragment drawerListFragment = new DrawerListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("type", type);
            bundle.putString("data", tradingAreaName);
            bundle.putParcelable("data_1", entity);
            bundle.putString("data_2", sortName);
            bundle.putInt("data_3", sortType);
            bundle.putInt("data_4", sectionPosition);
            drawerListFragment.setArguments(bundle);
            return drawerListFragment;
        }
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m34580U4(C36789k1 c36789k1, DrawerListFragment drawerListFragment) {
        ConstraintLayout clSort = c36789k1.f80385b;
        Intrinsics.checkNotNullExpressionValue(clSort, "clSort");
        drawerListFragment.m34594g5("name", C17066r.m36564D(clSort));
        drawerListFragment.m34562l4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V4 */
    public static final Unit m34581V4(C36789k1 c36789k1, DrawerListFragment drawerListFragment) {
        ConstraintLayout clSort = c36789k1.f80385b;
        Intrinsics.checkNotNullExpressionValue(clSort, "clSort");
        drawerListFragment.m34594g5(FirebaseAnalytics.Param.PRICE, C17066r.m36565E(clSort));
        drawerListFragment.m34562l4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m34582W4(C36789k1 c36789k1, DrawerListFragment drawerListFragment) {
        ConstraintLayout clSort = c36789k1.f80385b;
        Intrinsics.checkNotNullExpressionValue(clSort, "clSort");
        drawerListFragment.m34594g5(KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN, C17066r.m36566F(clSort));
        drawerListFragment.m34562l4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X4 */
    public static final void m34583X4(DrawerListFragment drawerListFragment, C36789k1 c36789k1) {
        RecyclerView list = c36789k1.f80387d;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        drawerListFragment.m34568z4(list, -1);
    }

    /* JADX INFO: renamed from: e5 */
    public static final Unit m34586e5(DrawerListFragment drawerListFragment, C36789k1 c36789k1, View view, int i11, ContractObject entity) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(entity, "entity");
        RecyclerView list = c36789k1.f80387d;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        drawerListFragment.m34559h4(list, view, i11, entity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f5 */
    public static final Unit m34587f5(DrawerListFragment drawerListFragment, ContractObject entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        drawerListFragment.mo33761b5(entity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i5 */
    public static final Unit m34588i5(DrawerListFragment drawerListFragment, String id2, int i11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        drawerListFragment.m34592c5(id2, i11);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
    @NotNull
    /* JADX INFO: renamed from: E4 */
    public List<? extends ContractObject> mo33759E4(@NotNull List<QuotesEntity> lists) {
        Intrinsics.checkNotNullParameter(lists, "lists");
        List<? extends ContractObject> listMo33759E4 = super.mo33759E4(lists);
        Iterator<T> it = listMo33759E4.iterator();
        while (it.hasNext()) {
            ((ContractObject) it.next()).m34388i(getF29503V());
        }
        return listMo33759E4;
    }

    @Nullable
    /* JADX INFO: renamed from: S4 */
    public final C36789k1 m34590S4() {
        return (C36789k1) this.f29515b0.getValue(this, f29514e0[0]);
    }

    /* JADX INFO: renamed from: Y4 */
    public void mo34591Y4() {
        Flowable<String> flowableObserveOn = C46527h0.f104291a.m102669B0().observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.market.tradingArea.child.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DrawerListFragment.m34584Z4(this.f29556b, (String) obj);
            }
        };
        Disposable disposableSubscribe = flowableObserveOn.subscribe(new Consumer() { // from class: com.kubi.kumex.market.tradingArea.child.y
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DrawerListFragment.m34585a5(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        m34566p4();
    }

    /* JADX INFO: renamed from: b5 */
    public void mo33761b5(@NotNull ContractObject data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String strM66668h = C27041f.m66668h(data.getF29417b().getSymbol());
        if (strM66668h.length() == 0) {
            C17058m0.m36548c(this, R$string.payment_verify_failure);
            return;
        }
        C46527h0.f104291a.m102670E0(strM66668h);
        String name = DrawerListFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        BaseFragment.setFragmentResult$default(this, name, null, 2, null);
        String strMo34548W3 = mo34548W3();
        if (strMo34548W3.length() > 0) {
            C43852m.m96590b(strMo34548W3, "ContractList", "4", TuplesKt.m90091to("symbol", strM66668h));
        }
    }

    @Override // com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
    /* JADX INFO: renamed from: f4 */
    public int mo34557f4() {
        return R$layout.bkumex_drawer_fragment_list;
    }

    @Override // com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
    /* JADX INFO: renamed from: i4 */
    public void mo34560i4(@NotNull RecyclerView recyclerView, int i11) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.mo34560i4(recyclerView, i11);
        FuturesFragment.f30411o0.performScroll2(i11 != 0);
    }

    @Override // com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m34579T4();
        m34593d5();
        m34595h5();
        mo34591Y4();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    @Override // com.kubi.kumex.market.ResetChildSortType
    /* JADX INFO: renamed from: t */
    public void mo34405t(@NotNull String sortName, int i11, boolean z11) {
        C36789k1 c36789k1M34590S4;
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(sortName, "sortName");
        if ((!z11 && Intrinsics.areEqual(m34550Y3(), sortName) && m34551Z3() == i11) || !isAdded() || isDetached() || (c36789k1M34590S4 = m34590S4()) == null) {
            return;
        }
        C17066r.m36604w(c36789k1M34590S4.f80390g);
        C17066r.m36604w(c36789k1M34590S4.f80391h);
        C17066r.m36604w(c36789k1M34590S4.f80392i);
        int iHashCode = sortName.hashCode();
        if (iHashCode != -839786019) {
            if (iHashCode != 3373707) {
                if (iHashCode == 106934601 && sortName.equals(FirebaseAnalytics.Param.PRICE)) {
                    baseTextView = c36789k1M34590S4.f80391h;
                } else {
                    baseTextView = null;
                }
            } else if (sortName.equals("name")) {
                baseTextView = c36789k1M34590S4.f80390g;
            } else {
                baseTextView = null;
            }
        } else if (sortName.equals(KCTurboSystemSettingsModuleImpl.KV_KEY_UP_DOWN)) {
            baseTextView = c36789k1M34590S4.f80392i;
        } else {
            baseTextView = null;
        }
        if (baseTextView == null) {
            return;
        }
        C17066r.m36605x(baseTextView, i11, Intrinsics.areEqual(sortName, "name"));
    }

    /* JADX INFO: renamed from: T4 */
    private final void m34579T4() {
        final C36789k1 c36789k1M34590S4 = m34590S4();
        if (c36789k1M34590S4 == null) {
            return;
        }
        ConstraintLayout clSort = c36789k1M34590S4.f80385b;
        Intrinsics.checkNotNullExpressionValue(clSort, "clSort");
        C27046k.m66700o(clSort);
        BaseTextView tvName = c36789k1M34590S4.f80390g;
        Intrinsics.checkNotNullExpressionValue(tvName, "tvName");
        C27046k.m66711z(tvName, 0L, new Function0() { // from class: com.kubi.kumex.market.tradingArea.child.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DrawerListFragment.m34580U4(c36789k1M34590S4, this);
            }
        }, 1, null);
        BaseTextView tvPrice = c36789k1M34590S4.f80391h;
        Intrinsics.checkNotNullExpressionValue(tvPrice, "tvPrice");
        C27046k.m66711z(tvPrice, 0L, new Function0() { // from class: com.kubi.kumex.market.tradingArea.child.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DrawerListFragment.m34581V4(c36789k1M34590S4, this);
            }
        }, 1, null);
        BaseTextView tvUpDown = c36789k1M34590S4.f80392i;
        Intrinsics.checkNotNullExpressionValue(tvUpDown, "tvUpDown");
        C27046k.m66711z(tvUpDown, 0L, new Function0() { // from class: com.kubi.kumex.market.tradingArea.child.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DrawerListFragment.m34582W4(c36789k1M34590S4, this);
            }
        }, 1, null);
        m34549X3().m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.kumex.market.tradingArea.child.f0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                DrawerListFragment.m34583X4(this.f29535b, c36789k1M34590S4);
            }
        });
    }

    /* JADX INFO: renamed from: Z4 */
    public static final Unit m34584Z4(DrawerListFragment drawerListFragment, String str) {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        C36789k1 c36789k1M34590S4 = drawerListFragment.m34590S4();
        if (c36789k1M34590S4 != null && (recyclerView = c36789k1M34590S4.f80387d) != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public static final void m34585a5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R4 */
    public final int m34589R4() {
        Integer numValueOf;
        Bundle arguments = getArguments();
        if (arguments != null) {
            numValueOf = Integer.valueOf(arguments.getInt("data_4", -1));
        } else {
            numValueOf = null;
        }
        return C27039d.m66651k(numValueOf, -1);
    }

    @Override // com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
    @NotNull
    /* JADX INFO: renamed from: W3 */
    public String mo34548W3() {
        return C17060n0.m36552b();
    }

    /* JADX INFO: renamed from: c5 */
    public final void m34592c5(String str, int i11) {
        AvailableTradeAreaEntity availableTradeAreaEntityM34546U3;
        m34567y4(str);
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && parentFragment.isAdded() && !parentFragment.isDetached() && (parentFragment instanceof BaseTradingAreaFragment) && (availableTradeAreaEntityM34546U3 = m34546U3()) != null) {
            ((BaseTradingAreaFragment) parentFragment).m34424K3(C27041f.m66668h(availableTradeAreaEntityM34546U3.getId()), i11);
        }
    }

    /* JADX INFO: renamed from: d5 */
    public final void m34593d5() {
        final C36789k1 c36789k1M34590S4 = m34590S4();
        if (c36789k1M34590S4 == null) {
            return;
        }
        RecyclerView list = c36789k1M34590S4.f80387d;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        ViewExKt.m36476b(list);
        c36789k1M34590S4.f80387d.setHasFixedSize(true);
        c36789k1M34590S4.f80387d.setAdapter(new C41075d(new Function1() { // from class: com.kubi.kumex.market.tradingArea.child.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DrawerListFragment.m34587f5(this.f29522b, (ContractObject) obj);
            }
        }, new Function3() { // from class: com.kubi.kumex.market.tradingArea.child.b0
            @Override // p852kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DrawerListFragment.m34586e5(this.f29523b, c36789k1M34590S4, (View) obj, ((Integer) obj2).intValue(), (ContractObject) obj3);
            }
        }));
    }

    /* JADX INFO: renamed from: g5 */
    public final void m34594g5(String str, int i11) {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && parentFragment.isAdded() && !parentFragment.isDetached() && (parentFragment instanceof BaseTradingAreaFragment)) {
            ((BaseTradingAreaFragment) parentFragment).mo34422E3(str, i11);
        }
    }

    /* JADX INFO: renamed from: h5 */
    public final void m34595h5() {
        List<AvailableTradeAreaEntity> listEmptyList;
        AvailableTradeAreaEntity availableTradeAreaEntityM34546U3 = m34546U3();
        int iM34589R4 = m34589R4();
        C36789k1 c36789k1M34590S4 = m34590S4();
        if (c36789k1M34590S4 == null) {
            return;
        }
        ChildSection childSection = new ChildSection();
        RecyclerView section = c36789k1M34590S4.f80388e;
        Intrinsics.checkNotNullExpressionValue(section, "section");
        ChildSection childSectionM34619d = childSection.m34621f(section).m34620e(C27029c.m66603f(this, 10), 0).m34619d(new Function2() { // from class: com.kubi.kumex.market.tradingArea.child.z
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DrawerListFragment.m34588i5(this.f29558b, (String) obj, ((Integer) obj2).intValue());
            }
        });
        if (availableTradeAreaEntityM34546U3 == null || (listEmptyList = availableTradeAreaEntityM34546U3.getChildren()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.f29516c0 = childSectionM34619d.m34617b(listEmptyList, iM34589R4);
    }

    @Override // com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
    @Nullable
    /* JADX INFO: renamed from: o4 */
    public RecyclerView mo34565o4() {
        C36789k1 c36789k1M34590S4 = m34590S4();
        if (c36789k1M34590S4 != null) {
            return c36789k1M34590S4.f80387d;
        }
        return null;
    }

    @Override // com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        String strM34550Y3 = m34550Y3();
        if (strM34550Y3 != null) {
            mo34405t(strM34550Y3, m34551Z3(), true);
        }
    }

    @Override // com.kubi.kumex.market.tradingArea.child.BaseTradingListFragment
    public void showContent() {
        ConstraintLayout constraintLayout;
        super.showContent();
        C36789k1 c36789k1M34590S4 = m34590S4();
        if (c36789k1M34590S4 != null && (constraintLayout = c36789k1M34590S4.f80385b) != null) {
            C27046k.m66685H(constraintLayout);
        }
    }
}
