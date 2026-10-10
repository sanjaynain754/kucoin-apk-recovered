package com.kubi.margin.trade.position;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.R$layout;
import com.kubi.margin.api.entity.FundsInfo;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.margin.api.entity.MarkPrice;
import com.kubi.margin.entity.WsCrossPosition;
import com.kubi.margin.trade.BaseMarginFragment;
import com.kubi.margin.trade.MarginConfigManager;
import com.kubi.margin.trade.dialog.CrossMarginCloseContract$UiIntent;
import com.kubi.margin.trade.dialog.MarginCrossClosePositionVM;
import com.kubi.margin.trade.dialog.MarginWholePositionFragmentExtKt;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.network.websocket.model.Message;
import com.kubi.network.websocket.observable.C19406c;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import g10.C37787r;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mp.C42579a;
import mr.C42597a;
import o00.C42916f;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36945w;
import p239ep.C37222c;
import p239ep.C37223d;
import p239ep.C37224e;
import p239ep.C37225f;
import p239ep.InterfaceC37221b;
import p402kf.C41014a;
import p569qq.C43841b;
import p768xo.InterfaceC46305f;
import p838zo.C46899c;
import p838zo.InterfaceC46898b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: MarginWholePositionFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u000e\u0010)\u001a\u00020'2\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020'J\b\u0010-\u001a\u00020'H\u0002J\b\u0010.\u001a\u00020'H\u0002J\u0016\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0017J\u0006\u00102\u001a\u00020'J\u0012\u00103\u001a\u00020'2\b\b\u0002\u00104\u001a\u00020\u0017H\u0002J\b\u00105\u001a\u00020'H\u0016J\b\u00106\u001a\u00020'H\u0016J\b\u0010<\u001a\u00020'H\u0002J\u0010\u0010=\u001a\u00020\u00172\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020'H\u0002J\b\u0010F\u001a\u00020GH\u0002J\b\u0010H\u001a\u00020GH\u0002J\u0006\u0010I\u001a\u00020JR\u001b\u0010\u0004\u001a\u00020\u00058@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\t\u001a\u0004\b9\u0010:R\u001d\u0010A\u001a\u0004\u0018\u00010B8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\t\u001a\u0004\bC\u0010D¨\u0006K"}, m90084d2 = {"Lcom/kubi/margin/trade/position/MarginWholePositionFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewModel", "Lcom/kubi/margin/trade/dialog/MarginCrossClosePositionVM;", "getViewModel$MarginLib_googleRelease", "()Lcom/kubi/margin/trade/dialog/MarginCrossClosePositionVM;", "viewModel$delegate", "Lkotlin/Lazy;", "bmarginFragmentMarginPositionBinding", "Lcom/kubi/margin/databinding/BmarginFragmentMarginPositionBinding;", "getBmarginFragmentMarginPositionBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentMarginPositionBinding;", "bmarginFragmentMarginPositionBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "list", "Ljava/util/ArrayList;", "Lcom/kubi/margin/entity/MarginCrossPosition;", "Lkotlin/collections/ArrayList;", "adapter", "Lcom/kubi/margin/trade/position/MarginCrossPositionAdapter;", "onlyShowDebt", "", "markPrice", "Ljava/math/BigDecimal;", "getMarkPrice", "()Ljava/math/BigDecimal;", "setMarkPrice", "(Ljava/math/BigDecimal;)V", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "sendIntent", "intent", "Lcom/kubi/margin/trade/dialog/CrossMarginCloseContract$UiIntent;", "fetchLeverDetail", "initRecyclerView", "removeMarginCrossPositionOfOther", "onPositionGet", "isOpen", "autoRepay", "onBaseQuoteGet", "notifyDataChange", "forceNotify", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "getWsDataHelper", "()Lcom/kubi/sdk/websocket/WsDataHelper;", "wsDataHelper$delegate", "registerWs", "isCloseStatusChange", "oldStatus", "Lcom/kubi/margin/api/entity/ILiquidationStatus;", "observeMarkPrice", "mParentFragment", "Lcom/kubi/margin/trade/BaseMarginFragment;", "getMParentFragment", "()Lcom/kubi/margin/trade/BaseMarginFragment;", "mParentFragment$delegate", "getBaseBalance", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "getQuoteBalance", "currentSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarginWholePositionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginWholePositionFragment.kt\ncom/kubi/margin/trade/position/MarginWholePositionFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 6 Response.kt\ncom/kubi/network/websocket/model/Message\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,386:1\n106#2,15:387\n147#3,16:402\n1869#4,2:418\n808#4,11:420\n1869#4,2:431\n1869#4,2:433\n160#5,4:435\n126#5:445\n126#5:454\n58#6,6:439\n64#6,2:446\n58#6,6:448\n64#6,2:455\n1#7:457\n*S KotlinDebug\n*F\n+ 1 MarginWholePositionFragment.kt\ncom/kubi/margin/trade/position/MarginWholePositionFragment\n*L\n62#1:387,15\n64#1:402,16\n244#1:418,2\n269#1:420,11\n270#1:431,2\n124#1:433,2\n283#1:435,4\n356#1:445\n363#1:454\n356#1:439,6\n356#1:446,2\n363#1:448,6\n363#1:455,2\n*E\n"})
public final class MarginWholePositionFragment extends BaseFragment {

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f34002c0 = {Reflection.property1(new PropertyReference1Impl(MarginWholePositionFragment.class, "bmarginFragmentMarginPositionBinding", "getBmarginFragmentMarginPositionBinding()Lcom/kubi/margin/databinding/BmarginFragmentMarginPositionBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f34003U;

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f34004V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final ArrayList<InterfaceC37221b> f34005W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MarginCrossPositionAdapter f34006X;

    /* JADX INFO: renamed from: Y */
    public boolean f34007Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public BigDecimal f34008Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f34009a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f34010b0;

    /* JADX INFO: renamed from: com.kubi.margin.trade.position.MarginWholePositionFragment$a */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18418a extends TypeToken<List<? extends MarkPrice>> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.position.MarginWholePositionFragment$b */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0003"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release", "com/kubi/network/websocket/model/Message$body$$inlined$fromJson$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJson$1\n*L\n1#1,195:1\n*E\n"})
    public static final class C18419b extends TypeToken<MarkPrice> {
    }

    /* JADX INFO: renamed from: com.kubi.margin.trade.position.MarginWholePositionFragment$c */
    /* JADX INFO: compiled from: GsonUtils.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/utils/GsonUtils$fromJSONOrNull$1", "Lcom/google/gson/reflect/TypeToken;", "Utils_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGsonUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonUtils.kt\ncom/kubi/utils/GsonUtils$fromJSONOrNull$1\n*L\n1#1,300:1\n*E\n"})
    public static final class C18420c extends TypeToken<WsCrossPosition> {
    }

    /* JADX INFO: renamed from: h4 */
    public final void m40578h4(boolean z11, boolean z12) {
        if (!z11) {
            this.f34005W.clear();
            this.f34005W.add(new C37223d(C27025c.m66566d(MarginConfigManager.f33681a.m39879Y0().isAutoRepay())));
            m40575V3(true);
            showContentView();
            return;
        }
        if (!this.f34005W.isEmpty()) {
            InterfaceC37221b interfaceC37221b = this.f34005W.get(0);
            Intrinsics.checkNotNullExpressionValue(interfaceC37221b, "get(...)");
            if (interfaceC37221b instanceof C37223d) {
                this.f34005W.remove(0);
            }
        }
        LeverBalance leverBalanceM39879Y0 = MarginConfigManager.f33681a.m39879Y0();
        C37222c c37222c = new C37222c(m40522I(), m40527O(), leverBalanceM39879Y0);
        C37224e c37224e = new C37224e(this.f34007Y, C46899c.m103306a(leverBalanceM39879Y0));
        if (this.f34005W.isEmpty()) {
            this.f34005W.add(c37224e);
            this.f34005W.add(c37222c);
        } else {
            InterfaceC37221b interfaceC37221b2 = this.f34005W.get(0);
            Intrinsics.checkNotNullExpressionValue(interfaceC37221b2, "get(...)");
            if (interfaceC37221b2 instanceof C37224e) {
                Intrinsics.checkNotNull(this.f34005W.set(0, c37224e));
            } else {
                this.f34005W.add(0, c37224e);
            }
            if (this.f34005W.size() > 1) {
                Intrinsics.checkNotNull(this.f34005W.set(1, c37222c));
            } else {
                this.f34005W.add(1, c37222c);
            }
        }
        m40531W3(this, false, 1, null);
        showContentView();
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m40521H3(MarginWholePositionFragment marginWholePositionFragment, View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof CheckBox) {
            marginWholePositionFragment.f34007Y = ((CheckBox) view).isChecked();
            if (!marginWholePositionFragment.f34005W.isEmpty()) {
                InterfaceC37221b interfaceC37221b = marginWholePositionFragment.f34005W.get(0);
                Intrinsics.checkNotNullExpressionValue(interfaceC37221b, "get(...)");
                InterfaceC37221b interfaceC37221b2 = interfaceC37221b;
                if (interfaceC37221b2 instanceof C37224e) {
                    ((C37224e) interfaceC37221b2).m83274c(marginWholePositionFragment.f34007Y);
                }
            }
            m40531W3(marginWholePositionFragment, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m40525L3(Throwable th2) {
        C43841b.m96555b("margin_position_tab", null, 2, null);
        Intrinsics.checkNotNull(th2);
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    private final C37787r m40528R3() {
        return (C37787r) this.f34009a0.getValue();
    }

    /* JADX INFO: renamed from: S3 */
    private final void m40529S3() {
        RecyclerView recyclerView;
        this.f34005W.add(new C37223d(false));
        C36945w c36945wM40570N3 = m40570N3();
        if (c36945wM40570N3 != null && (recyclerView = c36945wM40570N3.f82022b) != null) {
            recyclerView.setAdapter(this.f34006X);
        }
        m40575V3(true);
        showContentView();
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m40531W3(MarginWholePositionFragment marginWholePositionFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        marginWholePositionFragment.m40575V3(z11);
    }

    /* JADX INFO: renamed from: Y3 */
    public static final boolean m40532Y3(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getSource(), "heartbeat") || Intrinsics.areEqual(it.getTopic(), str);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final boolean m40533Z3(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: a4 */
    public static final MarkPrice m40534a4(Message it) {
        Object objM66914d;
        Object objM66914d2;
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getSource(), "heartbeat")) {
            if (it.getData() == null || TextUtils.isEmpty(it.getData())) {
                objM66914d2 = null;
            } else {
                try {
                    String data = it.getData();
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.String");
                    C27099x c27099x = C27099x.f54458a;
                    objM66914d2 = C27099x.m66914d(data, new C18418a().getType());
                } catch (Throwable unused) {
                    objM66914d2 = null;
                }
            }
            List list = (List) objM66914d2;
            return (list == null || list.isEmpty()) ? new MarkPrice("USDT-BTC", null) : (MarkPrice) list.get(0);
        }
        if (it.getData() == null || TextUtils.isEmpty(it.getData())) {
            objM66914d = null;
        } else {
            try {
                String data2 = it.getData();
                Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.String");
                C27099x c27099x2 = C27099x.f54458a;
                objM66914d = C27099x.m66914d(data2, new C18419b().getType());
            } catch (Throwable unused2) {
                objM66914d = null;
            }
        }
        MarkPrice markPrice = (MarkPrice) objM66914d;
        return markPrice == null ? new MarkPrice("USDT-BTC", null) : markPrice;
    }

    /* JADX INFO: renamed from: b4 */
    public static final MarkPrice m40535b4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (MarkPrice) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m40536c4(MarginWholePositionFragment marginWholePositionFragment, MarkPrice markPrice) {
        Object next;
        if (markPrice == null) {
            return Unit.INSTANCE;
        }
        marginWholePositionFragment.f34008Z = markPrice.getValue();
        Iterator<T> it = marginWholePositionFragment.f34005W.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((InterfaceC37221b) next) instanceof C37222c));
        if (((InterfaceC37221b) next) != null) {
            m40531W3(marginWholePositionFragment, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final boolean m40544k4(Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getTopic(), "/margin/position");
    }

    /* JADX INFO: renamed from: l4 */
    public static final boolean m40546l4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: m4 */
    public static final WsCrossPosition m40548m4(Message it) {
        Object objM66914d;
        Intrinsics.checkNotNullParameter(it, "it");
        String strM66668h = C27041f.m66668h(it.getData());
        try {
            C27099x c27099x = C27099x.f54458a;
            objM66914d = C27099x.m66914d(strM66668h, new C18420c().getType());
        } catch (Throwable unused) {
            objM66914d = null;
        }
        WsCrossPosition wsCrossPosition = (WsCrossPosition) objM66914d;
        if (wsCrossPosition == null) {
            return new WsCrossPosition(it.getSubject(), null, null, null, null, null);
        }
        wsCrossPosition.setSubject(it.getSubject());
        return wsCrossPosition;
    }

    /* JADX INFO: renamed from: n4 */
    public static final WsCrossPosition m40550n4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (WsCrossPosition) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: u4 */
    public static final C37787r m40562u4(MarginWholePositionFragment marginWholePositionFragment) {
        return new C37787r(marginWholePositionFragment);
    }

    /* JADX INFO: renamed from: I3 */
    public final void m40568I3() {
        C42579a c42579a = C42579a.f94275a;
        if (!c42579a.m93347g().c() || !c42579a.m93347g().d0().isHasOpenLever()) {
            C43841b.m96555b("margin_position_tab", null, 2, null);
            return;
        }
        Observable<ArrayList<FundsInfo>> observableM39892s0 = MarginConfigManager.f33681a.m39892s0();
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.position.d2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginWholePositionFragment.m40523J3(this.f34028b, (ArrayList) obj);
            }
        };
        Consumer<? super ArrayList<FundsInfo>> consumer = new Consumer() { // from class: com.kubi.margin.trade.position.e2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginWholePositionFragment.m40524K3(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.position.f2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginWholePositionFragment.m40525L3((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableM39892s0.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.position.g2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginWholePositionFragment.m40526M3(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: N3 */
    public final C36945w m40570N3() {
        return (C36945w) this.f34004V.getValue(this, f34002c0[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: O3 */
    public final BaseMarginFragment m40571O3() {
        return (BaseMarginFragment) this.f34010b0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: P3, reason: from getter */
    public final BigDecimal getF34008Z() {
        return this.f34008Z;
    }

    @NotNull
    /* JADX INFO: renamed from: Q3 */
    public final MarginCrossClosePositionVM m40573Q3() {
        return (MarginCrossClosePositionVM) this.f34003U.getValue();
    }

    /* JADX INFO: renamed from: T3 */
    public final boolean m40574T3(InterfaceC46898b interfaceC46898b) {
        return !Intrinsics.areEqual(interfaceC46898b, C46899c.m103306a(MarginConfigManager.f33681a.m39879Y0()));
    }

    /* JADX INFO: renamed from: V3 */
    public final void m40575V3(boolean z11) {
        boolean z12;
        if (z11) {
            this.f34006X.m40613N(this.f34005W);
            return;
        }
        if (this.f34005W.isEmpty()) {
            this.f34005W.add(new C37223d(C27025c.m66566d(MarginConfigManager.f33681a.m39879Y0().isAutoRepay())));
            z12 = true;
        } else {
            InterfaceC37221b interfaceC37221b = this.f34005W.get(0);
            Intrinsics.checkNotNullExpressionValue(interfaceC37221b, "get(...)");
            z12 = interfaceC37221b instanceof C37224e;
        }
        if (z12) {
            if (!this.f34007Y) {
                this.f34006X.m40613N(this.f34005W);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC37221b interfaceC37221b2 : this.f34005W) {
                boolean z13 = interfaceC37221b2 instanceof C37225f;
                if (!z13) {
                    arrayList.add(interfaceC37221b2);
                }
                if (z13) {
                    if (!(C27039d.m66647g(((C37225f) interfaceC37221b2).getF82546a().getLiability()) == 0.0d)) {
                        arrayList.add(interfaceC37221b2);
                    }
                }
            }
            this.f34006X.m40613N(arrayList);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m40577g4() {
        C37222c c37222c = new C37222c(m40522I(), m40527O(), MarginConfigManager.f33681a.m39879Y0());
        if (!this.f34005W.isEmpty() && this.f34005W.size() > 1) {
            InterfaceC37221b interfaceC37221b = this.f34005W.get(1);
            Intrinsics.checkNotNullExpressionValue(interfaceC37221b, "get(...)");
            if (interfaceC37221b instanceof C37222c) {
                Intrinsics.checkNotNull(this.f34005W.set(1, c37222c));
            } else {
                this.f34005W.add(1, c37222c);
            }
        } else {
            this.f34005W.add(c37222c);
        }
        m40531W3(this, false, 1, null);
        showContentView();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bmargin_fragment_margin_position, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m40529S3();
        C42579a c42579a = C42579a.f94275a;
        if (c42579a.m93347g().c() && c42579a.m93347g().d0().isHasOpenLever()) {
            BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
        } else {
            showContentView();
        }
        MarginWholePositionFragmentExtKt.m40256i(this);
    }

    /* JADX INFO: renamed from: s4 */
    public final void m40579s4() {
        Iterator<InterfaceC37221b> it = this.f34005W.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC37221b next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            if (next instanceof C37225f) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: t4 */
    public final void m40580t4(@NotNull CrossMarginCloseContract$UiIntent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        m40573Q3().sendIntent(intent);
    }

    public MarginWholePositionFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.margin.trade.position.MarginWholePositionFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.margin.trade.position.MarginWholePositionFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f34003U = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MarginCrossClosePositionVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.margin.trade.position.MarginWholePositionFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.margin.trade.position.MarginWholePositionFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.margin.trade.position.MarginWholePositionFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f34004V = C45681e.m100799e(this, new Function1<MarginWholePositionFragment, C36945w>() { // from class: com.kubi.margin.trade.position.MarginWholePositionFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36945w invoke(@NotNull MarginWholePositionFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36945w.m82759a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C36945w, Unit>() { // from class: com.kubi.margin.trade.position.MarginWholePositionFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C36945w it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36945w c36945w) {
                invoke(c36945w);
                return Unit.INSTANCE;
            }
        });
        this.f34005W = new ArrayList<>();
        this.f34006X = new MarginCrossPositionAdapter(this, new Function2() { // from class: com.kubi.margin.trade.position.b2
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MarginWholePositionFragment.m40521H3(this.f34019b, (View) obj, ((Integer) obj2).intValue());
            }
        });
        this.f34009a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.position.m2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginWholePositionFragment.m40562u4(this.f34111b);
            }
        });
        this.f34010b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.position.r2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginWholePositionFragment.m40530U3(this.f34130b);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    private final CurrencyBalance m40522I() {
        CurrencyBalance f33651y;
        BaseMarginFragment baseMarginFragmentM40571O3 = m40571O3();
        if (baseMarginFragmentM40571O3 != null && (f33651y = baseMarginFragmentM40571O3.getF33651Y()) != null) {
            return f33651y;
        }
        return new CurrencyBalance(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m40523J3(MarginWholePositionFragment marginWholePositionFragment, ArrayList arrayList) {
        Double dValueOf;
        String baseCurrencyName;
        Double dValueOf2;
        SymbolInfoEntity symbolInfoEntityM40569N = marginWholePositionFragment.m40569N();
        marginWholePositionFragment.m40579s4();
        Intrinsics.checkNotNull(arrayList);
        Iterator it = arrayList.iterator();
        while (true) {
            String quoteCurrencyName = null;
            if (it.hasNext()) {
                FundsInfo fundsInfo = (FundsInfo) it.next();
                BigDecimal totalBalance = fundsInfo.getTotalBalance();
                if (totalBalance != null) {
                    dValueOf = Double.valueOf(totalBalance.doubleValue());
                } else {
                    dValueOf = null;
                }
                if (C27039d.m66646f(dValueOf) == 0.0d) {
                    BigDecimal liability = fundsInfo.getLiability();
                    if (liability != null) {
                        dValueOf2 = Double.valueOf(liability.doubleValue());
                    } else {
                        dValueOf2 = null;
                    }
                    if (C27039d.m66646f(dValueOf2) == 0.0d) {
                    }
                }
                if (symbolInfoEntityM40569N != null) {
                    baseCurrencyName = symbolInfoEntityM40569N.getBaseCurrencyName();
                } else {
                    baseCurrencyName = null;
                }
                if (!Intrinsics.areEqual(baseCurrencyName, fundsInfo.getCurrencyName())) {
                    if (symbolInfoEntityM40569N != null) {
                        quoteCurrencyName = symbolInfoEntityM40569N.getQuoteCurrencyName();
                    }
                    if (!Intrinsics.areEqual(quoteCurrencyName, fundsInfo.getCurrencyName())) {
                        marginWholePositionFragment.f34005W.add(new C37225f(fundsInfo));
                    }
                }
            } else {
                m40531W3(marginWholePositionFragment, false, 1, null);
                C43841b.m96557d("margin_position_tab", "data_load_finish", null, 4, null);
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: K3 */
    public static final void m40524K3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m40526M3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O */
    private final CurrencyBalance m40527O() {
        CurrencyBalance f33652z;
        BaseMarginFragment baseMarginFragmentM40571O3 = m40571O3();
        if (baseMarginFragmentM40571O3 != null && (f33652z = baseMarginFragmentM40571O3.getF33652Z()) != null) {
            return f33652z;
        }
        return new CurrencyBalance(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    /* JADX INFO: renamed from: U3 */
    public static final BaseMarginFragment m40530U3(MarginWholePositionFragment marginWholePositionFragment) {
        Fragment parentFragment = marginWholePositionFragment.getParentFragment();
        if (parentFragment instanceof BaseMarginFragment) {
            return (BaseMarginFragment) parentFragment;
        }
        return null;
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m40537d4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m40538e4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m40539f4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: i4 */
    private final void m40540i4() throws Exception {
        m40528R3().m85234g(new Action() { // from class: com.kubi.margin.trade.position.h2
            @Override // io.reactivex.functions.Action
            public final void run() {
                MarginWholePositionFragment.m40542j4(this.f34049b);
            }
        });
    }

    /* JADX INFO: renamed from: j4 */
    public static final void m40542j4(final MarginWholePositionFragment marginWholePositionFragment) {
        marginWholePositionFragment.getVisibleDisposable().clear();
        CompositeDisposable visibleDisposable = marginWholePositionFragment.getVisibleDisposable();
        PublishSubject<Message> publishSubjectM85233f = marginWholePositionFragment.m40528R3().m85233f("/margin/position", "");
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.position.i2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarginWholePositionFragment.m40544k4((Message) obj));
            }
        };
        Observable<Message> observableFilter = publishSubjectM85233f.filter(new Predicate() { // from class: com.kubi.margin.trade.position.j2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarginWholePositionFragment.m40546l4(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.position.k2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginWholePositionFragment.m40548m4((Message) obj);
            }
        };
        Observable observableObserveOn = observableFilter.map(new Function() { // from class: com.kubi.margin.trade.position.l2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarginWholePositionFragment.m40550n4(function2, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.trade.position.n2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginWholePositionFragment.m40552o4(this.f34116b, (WsCrossPosition) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.position.o2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginWholePositionFragment.m40554p4(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.margin.trade.position.p2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginWholePositionFragment.m40556q4((Throwable) obj);
            }
        };
        visibleDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.position.q2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginWholePositionFragment.m40558r4(function4, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m40552o4(MarginWholePositionFragment marginWholePositionFragment, WsCrossPosition wsCrossPosition) {
        boolean z11;
        C37222c c37222c;
        C37224e c37224e;
        BaseMarginFragment baseMarginFragmentM40571O3;
        if (Intrinsics.areEqual(wsCrossPosition.getSubject(), "debt.ratio") && C41014a.m89922G(wsCrossPosition.getDebtRatio(), null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
            MarginConfigManager marginConfigManager = MarginConfigManager.f33681a;
            marginConfigManager.m39879Y0().setLiabilityRate(wsCrossPosition.getDebtRatio());
            marginConfigManager.m39879Y0().setMarginCoefficientTotalAsset(wsCrossPosition.getMarginCoefficientTotalAsset());
            marginConfigManager.m39879Y0().setCollateralAssetsAmount(wsCrossPosition.getCollateralAssetsAmount());
            z11 = true;
        } else {
            z11 = false;
        }
        if (Intrinsics.areEqual(wsCrossPosition.getSubject(), "position.status")) {
            MarginConfigManager marginConfigManager2 = MarginConfigManager.f33681a;
            InterfaceC46898b interfaceC46898bM103306a = C46899c.m103306a(marginConfigManager2.m39879Y0());
            String statusBizType = wsCrossPosition.getStatusBizType();
            if (statusBizType != null) {
                marginConfigManager2.m39879Y0().setStatusBizType(statusBizType);
                z11 = true;
            }
            String status = wsCrossPosition.getStatus();
            if (status != null) {
                marginConfigManager2.m39879Y0().setStatus(status);
                z11 = true;
            }
            Object objFirstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) marginWholePositionFragment.f34005W);
            if (objFirstOrNull instanceof C37224e) {
                c37224e = (C37224e) objFirstOrNull;
            } else {
                c37224e = null;
            }
            if (c37224e != null) {
                marginWholePositionFragment.f34005W.set(0, new C37224e(c37224e.getF82544a(), C46899c.m103306a(marginConfigManager2.m39879Y0())));
            }
            if (marginWholePositionFragment.m40574T3(interfaceC46898bM103306a) && (baseMarginFragmentM40571O3 = marginWholePositionFragment.m40571O3()) != null) {
                baseMarginFragmentM40571O3.mo39718K();
            }
        }
        if (z11) {
            Object orNull = CollectionsKt.getOrNull(marginWholePositionFragment.f34005W, 1);
            if (orNull instanceof C37222c) {
                c37222c = (C37222c) orNull;
            } else {
                c37222c = null;
            }
            if (c37222c != null) {
                marginWholePositionFragment.f34005W.set(1, new C37222c(marginWholePositionFragment.m40522I(), marginWholePositionFragment.m40527O(), MarginConfigManager.f33681a.m39879Y0()));
                m40531W3(marginWholePositionFragment, false, 1, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m40554p4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m40556q4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m40558r4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final SymbolInfoEntity m40569N() {
        SymbolInfoEntity symbolInfoEntityMo39722N;
        BaseMarginFragment baseMarginFragmentM40571O3 = m40571O3();
        if (baseMarginFragmentM40571O3 != null && (symbolInfoEntityMo39722N = baseMarginFragmentM40571O3.mo39722N()) != null) {
            return symbolInfoEntityMo39722N;
        }
        return new SymbolInfoEntity();
    }

    /* JADX INFO: renamed from: X3 */
    public final void m40576X3() {
        Request requestM102112y = ((InterfaceC46305f) C42597a.m93390f().create(InterfaceC46305f.class)).m102112y(CollectionsKt.arrayListOf("USDT-BTC"));
        final String strM66551u = DowngradeExKt.m66551u("/indicator/markPrice:%s", new Object[]{"USDT-BTC"}, null, 2, null);
        com.kubi.network.websocket.model.Request.Companion companion = com.kubi.network.websocket.model.Request.INSTANCE;
        C19406c c19406c = new C19406c(companion.subscribe(requestM102112y, strM66551u), companion.unsubscribe(requestM102112y, strM66551u), null, false, null, 28, null);
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.position.s2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarginWholePositionFragment.m40532Y3(strM66551u, (Message) obj));
            }
        };
        Observable<Message> observableFilter = c19406c.filter(new Predicate() { // from class: com.kubi.margin.trade.position.t2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarginWholePositionFragment.m40533Z3(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.position.u2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginWholePositionFragment.m40534a4((Message) obj);
            }
        };
        Observable observableObserveOn = observableFilter.map(new Function() { // from class: com.kubi.margin.trade.position.v2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarginWholePositionFragment.m40535b4(function2, obj);
            }
        }).throttleLatest(5000L, TimeUnit.MILLISECONDS).subscribeOn(C42916f.m94127f()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.trade.position.w2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginWholePositionFragment.m40536c4(this.f34150b, (MarkPrice) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.margin.trade.position.x2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginWholePositionFragment.m40537d4(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.margin.trade.position.y2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginWholePositionFragment.m40538e4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.position.c2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarginWholePositionFragment.m40539f4(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getVisibleDisposable());
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        if (isAdded()) {
            List<Fragment> fragments = getChildFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : fragments) {
                if (obj instanceof DialogFragment) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((DialogFragment) it.next()).dismissAllowingStateLoss();
            }
        }
        m40528R3().m85236i(false);
        C43841b.m96555b("margin_position_tab", null, 2, null);
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() throws Exception {
        m40540i4();
        m40576X3();
        m40568I3();
    }
}
