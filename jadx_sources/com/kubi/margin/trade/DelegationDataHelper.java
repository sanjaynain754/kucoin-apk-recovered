package com.kubi.margin.trade;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5288p;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.event.api.C12572a;
import com.kubi.network.websocket.model.Message;
import com.kubi.spot.entity.DelegationEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.PublishSubject;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.margin.trade.a3, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DelegationDataHelper.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000e\u001a\u00020\u000f*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0000¢\u0006\u0002\b\u0010J\u001f\u0010\u0011\u001a\u00020\u000f*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0000¢\u0006\u0002\b\u0012J\u001f\u0010\u0013\u001a\u00020\u000f*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0000¢\u0006\u0002\b\u0014J\u001e\u0010\u0015\u001a\u00020\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0002J\u001a\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001aJ,\u0010\u001f\u001a\u0004\u0018\u00010 *\b\u0012\u0004\u0012\u00020!0\t2\u0006\u0010\"\u001a\u00020\u00052\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R8\u0010\b\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u000b*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R8\u0010\f\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u000b*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R8\u0010\r\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u000b*\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001a`\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/margin/trade/DelegationDataHelper;", "", "<init>", "()V", "ACTION_ORDER_OPEN_OR_END", "", "ACTION_ORDER_DEBOUNCE_REFRESH", "ACTION_ORDER_CHANGED", "totalDebounce2000RefreshSub", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "totalDebounce12000RefreshSub", "totalDebounce200RefreshSub", "isOrderOpen", "", "isOrderOpen$MarginLib_googleRelease", "isOrderChanged", "isOrderChanged$MarginLib_googleRelease", "isOrderStatusClose", "isOrderStatusClose$MarginLib_googleRelease", "buildOrdersByWs", "", "orderMap", "localCreateOrderMap", "Ljava/util/HashMap;", "Lcom/kubi/spot/entity/DelegationEntity;", "Lkotlin/collections/HashMap;", "shotLocalOrder", "orderId", "order", "subOrdersCommonLogic", "Lio/reactivex/disposables/Disposable;", "Lcom/kubi/network/websocket/model/Message;", "topic", "onOrderOpenCallBack", "Lio/reactivex/functions/Consumer;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"CheckResult"})
@SourceDebugExtension({"SMAP\nDelegationDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationDataHelper.kt\ncom/kubi/margin/trade/DelegationDataHelper\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n19#2,2:209\n1#3:211\n*S KotlinDebug\n*F\n+ 1 DelegationDataHelper.kt\ncom/kubi/margin/trade/DelegationDataHelper\n*L\n132#1:209,2\n*E\n"})
public final class DelegationDataHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final DelegationDataHelper f33714a = new DelegationDataHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final PublishSubject<Map<String, Object>> f33715b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final PublishSubject<Map<String, Object>> f33716c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final PublishSubject<Map<String, Object>> f33717d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final HashMap<String, DelegationEntity> f33718e;

    /* JADX INFO: renamed from: com.kubi.margin.trade.a3$a */
    /* JADX INFO: compiled from: DelegationDataHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u00050\u0001¨\u0006\u0006"}, m90084d2 = {"com/kubi/margin/trade/DelegationDataHelper$subOrdersCommonLogic$2$1$1", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends TypeToken<HashMap<String, Object>> {
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m39995x(Map map) {
        C12572a.m23695d("action_order_debounce_refresh", null, 0L, 6, null);
        return Unit.INSTANCE;
    }

    static {
        PublishSubject<Map<String, Object>> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        f33715b = publishSubjectCreate;
        PublishSubject<Map<String, Object>> publishSubjectCreate2 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate2, "create(...)");
        f33716c = publishSubjectCreate2;
        PublishSubject<Map<String, Object>> publishSubjectCreate3 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate3, "create(...)");
        f33717d = publishSubjectCreate3;
        Observable<Map<String, Object>> observableDebounce = publishSubjectCreate.debounce(2L, TimeUnit.SECONDS);
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.d2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationDataHelper.m39995x((Map) obj);
            }
        };
        Consumer<? super Map<String, Object>> consumer = new Consumer() { // from class: com.kubi.margin.trade.t2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegationDataHelper.m39996y(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.u2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationDataHelper.m39952B((Throwable) obj);
            }
        };
        observableDebounce.subscribe(consumer, new Consumer() { // from class: com.kubi.margin.trade.v2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegationDataHelper.m39953C(function2, obj);
            }
        });
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Observable<Map<String, Object>> observableDebounce2 = publishSubjectCreate3.debounce(200L, timeUnit);
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.trade.w2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationDataHelper.m39954D((Map) obj);
            }
        };
        Consumer<? super Map<String, Object>> consumer2 = new Consumer() { // from class: com.kubi.margin.trade.x2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegationDataHelper.m39955E(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.margin.trade.y2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationDataHelper.m39956F((Throwable) obj);
            }
        };
        observableDebounce2.subscribe(consumer2, new Consumer() { // from class: com.kubi.margin.trade.z2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegationDataHelper.m39957G(function4, obj);
            }
        });
        Observable<Map<String, Object>> observableDebounce3 = publishSubjectCreate2.debounce(1200L, timeUnit);
        final Function1 function5 = new Function1() { // from class: com.kubi.margin.trade.e2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationDataHelper.m39958H((Map) obj);
            }
        };
        Consumer<? super Map<String, Object>> consumer3 = new Consumer() { // from class: com.kubi.margin.trade.f2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegationDataHelper.m39959I(function5, obj);
            }
        };
        final Function1 function6 = new Function1() { // from class: com.kubi.margin.trade.o2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationDataHelper.m39997z((Throwable) obj);
            }
        };
        observableDebounce3.subscribe(consumer3, new Consumer() { // from class: com.kubi.margin.trade.s2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegationDataHelper.m39951A(function6, obj);
            }
        });
        f33718e = new HashMap<>();
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m39954D(Map map) {
        C12572a.m23695d("action_order_open_or_end", new Pair(Boolean.valueOf(Intrinsics.areEqual(String.valueOf(map.get("ws_topic")), "/spotMarket/advancedOrders")), map), 0L, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m39958H(Map map) {
        C12572a.m23695d("action_order_open_or_end", new Pair(Boolean.valueOf(Intrinsics.areEqual(String.valueOf(map.get("ws_topic")), "/spotMarket/advancedOrders")), map), 0L, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final void m39960K(DelegationEntity delegationEntity) {
        DelegationDataHelper delegationDataHelper = f33714a;
        String orderId = delegationEntity.getOrderId();
        if (orderId == null) {
            orderId = "";
        }
        delegationDataHelper.m40002O(orderId, delegationEntity);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m39961P(DelegationDataHelper delegationDataHelper, String str, DelegationEntity delegationEntity, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            delegationEntity = null;
        }
        delegationDataHelper.m40002O(str, delegationEntity);
    }

    /* JADX INFO: renamed from: R */
    public static final boolean m39962R(String str, Message it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !TextUtils.isEmpty(it.getUserId()) && Intrinsics.areEqual(str, it.getTopic());
    }

    /* JADX INFO: renamed from: S */
    public static final boolean m39963S(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: T */
    public static final HashMap m39964T(Message it) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            Result.Companion companion = Result.INSTANCE;
            String data = it.getData();
            if (data == null) {
                data = "";
            }
            objM103844constructorimpl = Result.m103844constructorimpl((HashMap) C5288p.m6343e(data, new a().getType()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        HashMap map = (HashMap) objM103844constructorimpl;
        if (map == null) {
            map = new HashMap();
        }
        map.put("ws_topic", it.getTopic());
        return map;
    }

    /* JADX INFO: renamed from: U */
    public static final HashMap m39965U(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (HashMap) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: V */
    public static final boolean m39966V(HashMap it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object obj = it.get("orderId");
        return (obj != null ? obj.toString() : null) != null;
    }

    /* JADX INFO: renamed from: W */
    public static final boolean m39967W(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m39968X(Consumer consumer, HashMap map) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!Intrinsics.areEqual("market", String.valueOf(map.get("orderType")))) {
                DelegationDataHelper delegationDataHelper = f33714a;
                Intrinsics.checkNotNull(map);
                delegationDataHelper.m39998J(map);
                if (delegationDataHelper.m40000M(map)) {
                    f33717d.onNext(map);
                } else if (!delegationDataHelper.m40001N(map)) {
                    f33715b.onNext(map);
                } else if (Intrinsics.areEqual(TUIConstants.TUIContact.LIMIT, String.valueOf(map.get("orderType")))) {
                    f33716c.onNext(map);
                } else {
                    f33717d.onNext(map);
                }
                if (delegationDataHelper.m40000M(map) && consumer != null) {
                    consumer.accept(Boolean.FALSE);
                }
            } else if (consumer != null) {
                consumer.accept(Boolean.TRUE);
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97264h(thM103847exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public final void m39998J(Map<String, ? extends Object> map) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        boolean zAreEqual = Intrinsics.areEqual(String.valueOf(map.get("ws_topic")), "/spotMarket/advancedOrders");
        boolean zAreEqual2 = Intrinsics.areEqual(TUIConstants.TUIContact.LIMIT, String.valueOf(map.get("orderType")));
        if (zAreEqual || !zAreEqual2 || !m40000M(map)) {
            C12572a.m23695d("action_order_changed", new Pair(Boolean.valueOf(zAreEqual), map), 0L, 4, null);
            return;
        }
        final DelegationEntity delegationEntity = new DelegationEntity(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
        Object obj = map.get("filledSize");
        if (obj != null && (string7 = obj.toString()) != null) {
            delegationEntity.setDealSize(new BigDecimal(string7));
        }
        Object obj2 = map.get("orderId");
        if (obj2 != null && (string6 = obj2.toString()) != null) {
            delegationEntity.setOrderId(string6);
        }
        Object obj3 = map.get("orderTime");
        Number number = obj3 instanceof Number ? (Number) obj3 : null;
        if (number != null) {
            delegationEntity.setTime(Long.valueOf(Long.valueOf(number.longValue()).longValue()));
        }
        Object obj4 = map.get("orderType");
        if (obj4 != null && (string5 = obj4.toString()) != null) {
            delegationEntity.setType(string5);
        }
        Object obj5 = map.get(FirebaseAnalytics.Param.PRICE);
        if (obj5 != null && (string4 = obj5.toString()) != null) {
            delegationEntity.setPrice(new BigDecimal(string4));
        }
        Object obj6 = map.get("side");
        if (obj6 != null && (string3 = obj6.toString()) != null) {
            delegationEntity.setSide(string3);
        }
        Object obj7 = map.get("size");
        if (obj7 != null && (string2 = obj7.toString()) != null) {
            delegationEntity.setSize(new BigDecimal(string2));
        }
        Object obj8 = map.get("symbol");
        if (obj8 != null && (string = obj8.toString()) != null) {
            delegationEntity.setSymbol(string);
        }
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.margin.trade.r2
            @Override // java.lang.Runnable
            public final void run() {
                DelegationDataHelper.m39960K(delegationEntity);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final boolean m39999L(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        String strValueOf = String.valueOf(map.get("type"));
        String strValueOf2 = String.valueOf(map.get("status"));
        return StringsKt.equals(strValueOf2, "match", true) || StringsKt.equals(strValueOf2, "update", true) || StringsKt.equals(strValueOf, "match", true) || StringsKt.equals(strValueOf, "update", true);
    }

    /* JADX INFO: renamed from: M */
    public final boolean m40000M(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        boolean zAreEqual = Intrinsics.areEqual(TUIConstants.TUIContact.LIMIT, String.valueOf(map.get("orderType")));
        String strValueOf = String.valueOf(map.get("type"));
        if (zAreEqual) {
            return StringsKt.equals(String.valueOf(map.get("status")), TtmlNode.TEXT_EMPHASIS_MARK_OPEN, true) && StringsKt.equals(strValueOf, TtmlNode.TEXT_EMPHASIS_MARK_OPEN, true);
        }
        return StringsKt.equals(strValueOf, TtmlNode.TEXT_EMPHASIS_MARK_OPEN, true);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m40001N(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (!StringsKt.equals(String.valueOf(map.get("status")), "done", true)) {
            String strValueOf = String.valueOf(map.get("type"));
            if (!StringsKt.equals(strValueOf, TtmlNode.TEXT_EMPHASIS_MARK_FILLED, true) && !StringsKt.equals(strValueOf, "cancel", true) && !StringsKt.equals(strValueOf, "canceled", true) && !StringsKt.equals(strValueOf, "triggered", true) && !StringsKt.equals(strValueOf, "trigger", true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public final void m40002O(@NotNull String orderId, @Nullable DelegationEntity delegationEntity) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        HashMap<String, DelegationEntity> map = f33718e;
        if (!map.containsKey(orderId)) {
            map.put(orderId, delegationEntity);
            return;
        }
        DelegationEntity delegationEntity2 = map.get(orderId);
        if (delegationEntity2 != null) {
            delegationEntity = delegationEntity2;
        }
        if (delegationEntity != null) {
            C12572a.m23695d("action_order_changed", new Pair(Boolean.FALSE, delegationEntity), 0L, 4, null);
            map.remove(orderId);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: Q */
    public final Disposable m40003Q(@NotNull PublishSubject<Message> publishSubject, @NotNull final String topic, @Nullable final Consumer<Boolean> consumer) {
        Intrinsics.checkNotNullParameter(publishSubject, "<this>");
        Intrinsics.checkNotNullParameter(topic, "topic");
        final Function1 function1 = new Function1() { // from class: com.kubi.margin.trade.g2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DelegationDataHelper.m39962R(topic, (Message) obj));
            }
        };
        Observable<Message> observableFilter = publishSubject.filter(new Predicate() { // from class: com.kubi.margin.trade.h2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return DelegationDataHelper.m39963S(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.margin.trade.i2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationDataHelper.m39964T((Message) obj);
            }
        };
        Observable<R> map = observableFilter.map(new Function() { // from class: com.kubi.margin.trade.j2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return DelegationDataHelper.m39965U(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.margin.trade.k2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DelegationDataHelper.m39966V((HashMap) obj));
            }
        };
        Observable observableObserveOn = map.filter(new Predicate() { // from class: com.kubi.margin.trade.l2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return DelegationDataHelper.m39967W(function3, obj);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function4 = new Function1() { // from class: com.kubi.margin.trade.m2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationDataHelper.m39968X(consumer, (HashMap) obj);
            }
        };
        Consumer consumer2 = new Consumer() { // from class: com.kubi.margin.trade.n2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegationDataHelper.m39969Y(function4, obj);
            }
        };
        final Function1 function5 = new Function1() { // from class: com.kubi.margin.trade.p2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DelegationDataHelper.m39970Z((Throwable) obj);
            }
        };
        return observableObserveOn.subscribe(consumer2, new Consumer() { // from class: com.kubi.margin.trade.q2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                DelegationDataHelper.m39972a0(function5, obj);
            }
        });
    }

    /* JADX INFO: renamed from: A */
    public static final void m39951A(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m39952B(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    public static final void m39953C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E */
    public static final void m39955E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m39956F(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final void m39957G(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I */
    public static final void m39959I(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y */
    public static final void m39969Y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m39970Z(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m39972a0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y */
    public static final void m39996y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m39997z(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }
}
