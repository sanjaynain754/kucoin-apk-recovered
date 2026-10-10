package com.kubi.spot.trade.tradeSwitchAction;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.network.websocket.model.Message;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$string;
import com.kubi.spot.business.BaseTradeFragment;
import com.kubi.spot.business.ITradeParentBehavior;
import com.kubi.spot.business.businessTrack.SpotBusinessTracker;
import com.kubi.spot.business.submit.TradeVerticalSubmitFragment;
import com.kubi.spot.trade.tradeSwitchAction.NormalTradeSwitchAction;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.tradebase.tradetype.TradeTypeSelectedDialog;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import d30.C36606a;
import e30.InterfaceC37055a;
import g10.C37787r;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.PublishSubject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import v30.C45412y;
import w20.C45700a;

/* JADX INFO: compiled from: NormalTradeSwitchAction.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J.\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018H\u0016¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/spot/trade/tradeSwitchAction/NormalTradeSwitchAction;", "Lcom/kubi/spot/trade/tradeSwitchAction/ITradeSwitchAction;", "<init>", "()V", "clickPriceType", "", "tradeVerticalSubmitFragment", "Lcom/kubi/spot/business/submit/TradeVerticalSubmitFragment;", "mParent", "Lcom/kubi/spot/business/ITradeParentBehavior;", "binding", "Lcom/kubi/tradecorebiz/databinding/FragmentTradeVerticalBinding;", "checkPriceInput", "", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", "subscriptionSocket", "fragment", "Lcom/kubi/spot/business/BaseTradeFragment;", "visibleDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "wsDataHelper", "Lcom/kubi/sdk/websocket/WsDataHelper;", "auction", "Lkotlin/Function0;", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNormalTradeSwitchAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NormalTradeSwitchAction.kt\ncom/kubi/spot/trade/tradeSwitchAction/NormalTradeSwitchAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 LogInfo.kt\ncom/kubi/spot/loginfo/LogInfoKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 SpotIssue.kt\ncom/kubi/spot/exeption/SpotIssueKt\n*L\n1#1,121:1\n1563#2:122\n1634#2,3:123\n360#2,7:132\n37#3:126\n36#3,3:127\n8#4,2:130\n1#5:139\n43#6,7:140\n43#6,7:147\n*S KotlinDebug\n*F\n+ 1 NormalTradeSwitchAction.kt\ncom/kubi/spot/trade/tradeSwitchAction/NormalTradeSwitchAction\n*L\n44#1:122\n44#1:123,3\n48#1:132,7\n44#1:126\n44#1:127,3\n61#1:130,2\n97#1:140,7\n117#1:147,7\n*E\n"})
public final class NormalTradeSwitchAction implements InterfaceC37055a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f51249a = new Companion(null);

    /* JADX INFO: compiled from: NormalTradeSwitchAction.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/spot/trade/tradeSwitchAction/NormalTradeSwitchAction$Companion;", "", "<init>", "()V", "NORMAL_TRADE_SWITCH_ACTION_CLASS_NAME", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m63038B(BaseTradeFragment baseTradeFragment, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            return baseTradeFragment.isVisible() && Intrinsics.areEqual("/spotMarket/tradeOrders", it.getTopic()) && !TextUtils.isEmpty(it.getUserId());
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: C */
    public static final boolean m63039C(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m63056r(List list, ITradeParentBehavior iTradeParentBehavior, TradeType type) {
        String strM81920c;
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator it = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (((TradeType) it.next()) == type) {
                break;
            }
            i11++;
        }
        Context context = iTradeParentBehavior.mo60178H().getContext();
        if (context == null || (strM81920c = C36606a.f79410a.m81920c(context, i11)) == null) {
            strM81920c = "";
        }
        iTradeParentBehavior.mo60311p0(strM81920c, i11);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final void m63057s(C45412y c45412y, DialogInterface dialogInterface) {
        c45412y.f102405i.setImageResource(R$drawable.ic2_triangle_bottom_16);
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m63060v(BaseTradeFragment baseTradeFragment, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            return baseTradeFragment.isVisible() && Intrinsics.areEqual("/spotMarket/advancedOrders", it.getTopic()) && !TextUtils.isEmpty(it.getUserId());
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m63061w(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    @Override // e30.InterfaceC37055a
    /* JADX INFO: renamed from: b */
    public void mo60487b(@Nullable TradeVerticalSubmitFragment tradeVerticalSubmitFragment, @NotNull final ITradeParentBehavior mParent, @NotNull final C45412y binding) {
        Intrinsics.checkNotNullParameter(mParent, "mParent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        if (tradeVerticalSubmitFragment == null || !tradeVerticalSubmitFragment.isShowing()) {
            return;
        }
        final List<TradeType> listM81919b = C36606a.f79410a.m81919b();
        TradeTypeSelectedDialog.Companion companion = TradeTypeSelectedDialog.f51647v0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM81919b, 10));
        Iterator<T> it = listM81919b.iterator();
        while (it.hasNext()) {
            arrayList.add(((TradeType) it.next()).getValue());
        }
        BaseDialogFragment baseDialogFragmentM54192r3 = TradeTypeSelectedDialog.Companion.newInstance$default(companion, (String[]) arrayList.toArray(new String[0]), mParent.mo60313v0().getValue(), String.valueOf(mParent.mo60178H().getPageId()), false, 8, (Object) null).m63384w4(new Function1() { // from class: e30.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NormalTradeSwitchAction.m63056r(listM81919b, mParent, (TradeType) obj);
            }
        }).m54192r3(new DialogInterface.OnDismissListener() { // from class: e30.f
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                NormalTradeSwitchAction.m63057s(binding, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = tradeVerticalSubmitFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "TradeTypeSelectedDialog");
        binding.f102405i.setImageResource(R$drawable.ic2_triangle_top_16);
    }

    @Override // e30.InterfaceC37055a
    /* JADX INFO: renamed from: c */
    public void mo60488c(@NotNull final BaseTradeFragment fragment, @NotNull CompositeDisposable visibleDisposable, @NotNull C37787r wsDataHelper, @NotNull final Function0<Unit> auction) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(visibleDisposable, "visibleDisposable");
        Intrinsics.checkNotNullParameter(wsDataHelper, "wsDataHelper");
        Intrinsics.checkNotNullParameter(auction, "auction");
        PublishSubject<Message> publishSubjectM85233f = wsDataHelper.m85233f("/spotMarket/tradeOrders", "");
        final Function1 function1 = new Function1() { // from class: e30.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NormalTradeSwitchAction.m63038B(fragment, (Message) obj));
            }
        };
        Observable<Message> observableFilter = publishSubjectM85233f.filter(new Predicate() { // from class: e30.i
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return NormalTradeSwitchAction.m63039C(function1, obj);
            }
        });
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Observable<Message> observableObserveOn = observableFilter.debounce(2L, timeUnit).observeOn(AndroidSchedulers.mainThread());
        final Function1 function2 = new Function1() { // from class: e30.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NormalTradeSwitchAction.m63040D(auction, (Message) obj);
            }
        };
        Consumer<? super Message> consumer = new Consumer() { // from class: e30.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NormalTradeSwitchAction.m63041E(function2, obj);
            }
        };
        final Function1 function3 = new Function1() { // from class: e30.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NormalTradeSwitchAction.m63058t((Throwable) obj);
            }
        };
        visibleDisposable.add(observableObserveOn.subscribe(consumer, new Consumer() { // from class: e30.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NormalTradeSwitchAction.m63059u(function3, obj);
            }
        }));
        PublishSubject<Message> publishSubjectM85233f2 = wsDataHelper.m85233f("/spotMarket/advancedOrders", "");
        final Function1 function4 = new Function1() { // from class: e30.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(NormalTradeSwitchAction.m63060v(fragment, (Message) obj));
            }
        };
        Observable<Message> observableObserveOn2 = publishSubjectM85233f2.filter(new Predicate() { // from class: e30.o
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return NormalTradeSwitchAction.m63061w(function4, obj);
            }
        }).debounce(2L, timeUnit).observeOn(AndroidSchedulers.mainThread());
        final Function1 function5 = new Function1() { // from class: e30.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NormalTradeSwitchAction.m63062x(auction, (Message) obj);
            }
        };
        Consumer<? super Message> consumer2 = new Consumer() { // from class: e30.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NormalTradeSwitchAction.m63063y(function5, obj);
            }
        };
        final Function1 function6 = new Function1() { // from class: e30.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NormalTradeSwitchAction.m63064z((Throwable) obj);
            }
        };
        visibleDisposable.add(observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: e30.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                NormalTradeSwitchAction.m63037A(function6, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: A */
    public static final void m63037A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m63040D(Function0 function0, Message message) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public static final void m63041E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m63058t(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C45700a.m100877c(th2, "NormalTradeSwitchAction");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final void m63059u(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m63062x(Function0 function0, Message message) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final void m63063y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m63064z(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C45700a.m100877c(th2, "NormalTradeSwitchAction");
        return Unit.INSTANCE;
    }

    @Override // e30.InterfaceC37055a
    /* JADX INFO: renamed from: a */
    public boolean mo60486a(@Nullable BigDecimal bigDecimal) throws JSONException {
        if (C41014a.m89919D(bigDecimal)) {
            C44128b.m97266j("trade|Spot|NormalTradeSwitchAction", "当前订单-校验输入的价格为0");
            ToastCompat.m66441G(C27017c.f54310a.m66513b().getString(R$string.price_not_zero), new Object[0]);
            SpotBusinessTracker.f49771a.trackSpotOrderFail(SpotBusinessTracker.SpotCategory.CHECK_INPUT_PRICE, SpotBusinessTracker.SpotFailReason.INPUT_PRICE_ILLEGAL);
            return false;
        }
        return true;
    }
}
