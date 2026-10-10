package com.kubi.quotefacade.widgets;

import com.kubi.network.restful.C19321b;
import com.kubi.quotefacade.entity.ChanceGemBoxCurrency;
import com.kubi.quotefacade.entity.ChanceGemBoxCurrencyHighLight;
import com.kubi.quotefacade.entity.ChanceGemBoxEntity;
import com.kubi.quotefacade.entity.ChancePlateEntity;
import com.kubi.quotefacade.entity.ChancePlateItem;
import com.kubi.quotefacade.entity.RiseFallEntity;
import com.kubi.quotefacade.entity.WidgetFearGreedEntity;
import com.kubi.quotefacade.helper.QuoteCoroutineScope;
import com.kubi.quotefacade.helper.QuoteKV;
import com.kubi.quotefacade.tradechance.submodule.gembox.ChanceGemBoxHelper;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.core.C27029c;
import er.C37237b;
import gr.C38000b;
import gr.C38006h;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p844zu.InterfaceC46927d;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: QuoteWidgetsRepo.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0002\u0010\u0012J*\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00150\u0019H\u0086@¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0086@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0086@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010 H\u0086@¢\u0006\u0002\u0010\u0012J\u001a\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0086@¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0086@¢\u0006\u0002\u0010\u0012J\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0086@¢\u0006\u0002\u0010\u0012R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b¨\u0006*"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/QuoteWidgetsRepo;", "", "<init>", "()V", "api", "Lcom/kubi/quotefacade/api/QuoteWidgetApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/quotefacade/api/QuoteWidgetApi;", "api$delegate", "Lkotlin/Lazy;", "wsApi", "getWsApi", "wsApi$delegate", "preloadAsync", "Lkotlinx/coroutines/Job;", "cachedGemboxWidgetInfo", "Lcom/kubi/quotefacade/entity/ChanceGemBoxEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGemboxWidgetInfo", "subscribeGemBoxPush", "", "topic", "", "onData", "Lkotlin/Function1;", "Lcom/kubi/quotefacade/entity/ChanceGemBoxCurrency;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cachedRiseFallWidgetInfo", "Lcom/kubi/quotefacade/entity/RiseFallEntity;", "getRiseFallWidgetInfo", "cachedFearGreedWidgetInfo", "Lcom/kubi/quotefacade/entity/WidgetFearGreedEntity;", "getFearGreedWidgetInfo", "cacheTime", "", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cachedHotSectorsWidgetInfo", "", "Lcom/kubi/quotefacade/entity/ChancePlateItem;", "getHotSectorsWidgetInfo", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteWidgetsRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteWidgetsRepo.kt\ncom/kubi/quotefacade/widgets/QuoteWidgetsRepo\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n32#2:167\n23#2,2:172\n32#2:174\n23#2,2:178\n32#2:180\n23#2,2:184\n32#2:186\n23#2,2:190\n196#3,3:168\n196#3,3:175\n196#3,3:181\n196#3,3:187\n1#4:171\n*S KotlinDebug\n*F\n+ 1 QuoteWidgetsRepo.kt\ncom/kubi/quotefacade/widgets/QuoteWidgetsRepo\n*L\n70#1:167\n81#1:172,2\n103#1:174\n114#1:178,2\n125#1:180\n137#1:184,2\n149#1:186\n160#1:190,2\n72#1:168,3\n105#1:175,3\n127#1:181,3\n151#1:187,3\n*E\n"})
public final class QuoteWidgetsRepo {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f42766c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f42767a = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.widgets.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return QuoteWidgetsRepo.m53333c();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f42768b = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.widgets.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return QuoteWidgetsRepo.m53334p();
        }
    });

    /* JADX INFO: compiled from: QuoteWidgetsRepo.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/QuoteWidgetsRepo$Companion;", "", "<init>", "()V", "TAG", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.QuoteWidgetsRepo$a */
    /* JADX INFO: compiled from: QuoteWidgetsRepo.kt */
    /* JADX INFO: loaded from: classes37.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nQuoteWidgetsRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteWidgetsRepo.kt\ncom/kubi/quotefacade/widgets/QuoteWidgetsRepo$subscribeGemBoxPush$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,166:1\n1#2:167\n23#3,2:168\n*S KotlinDebug\n*F\n+ 1 QuoteWidgetsRepo.kt\ncom/kubi/quotefacade/widgets/QuoteWidgetsRepo$subscribeGemBoxPush$3\n*L\n90#1:168,2\n*E\n"})
    public static final class C22593a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1<ChanceGemBoxCurrency, Unit> f42769b;

        /* JADX WARN: Multi-variable type inference failed */
        public C22593a(Function1<? super ChanceGemBoxCurrency, Unit> function1) {
            this.f42769b = function1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(ChanceGemBoxEntity chanceGemBoxEntity, Continuation<? super Unit> continuation) {
            ChanceGemBoxCurrency chanceGemBoxCurrency;
            if (chanceGemBoxEntity != null) {
                StorageId<String> storageIdM52059s = QuoteKV.f42044a.m52059s();
                String strM66606i = C27029c.m66606i(chanceGemBoxEntity);
                Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
                C46392a.m102333p(storageIdM52059s, strM66606i);
                List<ChanceGemBoxCurrency> currencyList = chanceGemBoxEntity.getCurrencyList();
                if (currencyList != null && (chanceGemBoxCurrency = (ChanceGemBoxCurrency) CollectionsKt.firstOrNull((List) currencyList)) != null) {
                    Function1<ChanceGemBoxCurrency, Unit> function1 = this.f42769b;
                    ChanceGemBoxHelper chanceGemBoxHelper = ChanceGemBoxHelper.f42656a;
                    List<ChanceGemBoxCurrencyHighLight> highLights = chanceGemBoxCurrency.getHighLights();
                    if (highLights == null) {
                        highLights = CollectionsKt.emptyList();
                    }
                    chanceGemBoxCurrency.setHighLightsTextItems(chanceGemBoxHelper.m53175g(highLights));
                    function1.invoke(chanceGemBoxCurrency);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: p */
    public static final InterfaceC46927d m53334p() {
        return (InterfaceC46927d) new C19321b.a().m42777b(new C38000b(C37237b.m83282e("network/channel_default"))).m42778c(new C38006h()).m42776a().m42772b(InterfaceC46927d.class);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Object m53335d(@NotNull Continuation<? super WidgetFearGreedEntity> continuation) {
        String strM102326h = C46392a.m102326h(QuoteKV.f42044a.m52058r(), "");
        if (strM102326h.length() <= 0) {
            return null;
        }
        C27099x c27099x = C27099x.f54458a;
        return C41636g.m90914f0(C41636g.m90890N(C41636g.m90887K(new C22594x8ef3387c(strM102326h, null)), C42911a.m94120b()), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m53336e(@NotNull Continuation<? super ChanceGemBoxEntity> continuation) {
        String strM102326h = C46392a.m102326h(QuoteKV.f42044a.m52059s(), "");
        if (strM102326h.length() <= 0) {
            return null;
        }
        C27099x c27099x = C27099x.f54458a;
        return C41636g.m90914f0(C41636g.m90890N(C41636g.m90887K(new C22595x5fdc7491(strM102326h, null)), C42911a.m94120b()), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m53337f(@NotNull Continuation<? super List<ChancePlateItem>> continuation) {
        QuoteWidgetsRepo$cachedHotSectorsWidgetInfo$1 quoteWidgetsRepo$cachedHotSectorsWidgetInfo$1;
        if (continuation instanceof QuoteWidgetsRepo$cachedHotSectorsWidgetInfo$1) {
            quoteWidgetsRepo$cachedHotSectorsWidgetInfo$1 = (QuoteWidgetsRepo$cachedHotSectorsWidgetInfo$1) continuation;
            int i11 = quoteWidgetsRepo$cachedHotSectorsWidgetInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteWidgetsRepo$cachedHotSectorsWidgetInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteWidgetsRepo$cachedHotSectorsWidgetInfo$1 = new QuoteWidgetsRepo$cachedHotSectorsWidgetInfo$1(this, continuation);
            }
        } else {
            quoteWidgetsRepo$cachedHotSectorsWidgetInfo$1 = new QuoteWidgetsRepo$cachedHotSectorsWidgetInfo$1(this, continuation);
        }
        Object objM90914f0 = quoteWidgetsRepo$cachedHotSectorsWidgetInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteWidgetsRepo$cachedHotSectorsWidgetInfo$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM90914f0);
            String strM102326h = C46392a.m102326h(QuoteKV.f42044a.m52060t(), "");
            if (strM102326h.length() > 0) {
                C27099x c27099x = C27099x.f54458a;
                InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C22596x334fcab5(strM102326h, null)), C42911a.m94120b());
                quoteWidgetsRepo$cachedHotSectorsWidgetInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(strM102326h);
                quoteWidgetsRepo$cachedHotSectorsWidgetInfo$1.L$1 = SpillingKt.nullOutSpilledVariable(c27099x);
                quoteWidgetsRepo$cachedHotSectorsWidgetInfo$1.L$2 = SpillingKt.nullOutSpilledVariable(strM102326h);
                quoteWidgetsRepo$cachedHotSectorsWidgetInfo$1.I$0 = 0;
                quoteWidgetsRepo$cachedHotSectorsWidgetInfo$1.label = 1;
                objM90914f0 = C41636g.m90914f0(interfaceC41634eM90890N, quoteWidgetsRepo$cachedHotSectorsWidgetInfo$1);
                if (objM90914f0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objM90914f0);
        ChancePlateEntity chancePlateEntity = (ChancePlateEntity) objM90914f0;
        if (chancePlateEntity != null) {
            return chancePlateEntity.getPlateList();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m53338g(@NotNull Continuation<? super RiseFallEntity> continuation) {
        String strM102326h = C46392a.m102326h(QuoteKV.f42044a.m52061u(), "");
        if (strM102326h.length() <= 0) {
            return null;
        }
        C27099x c27099x = C27099x.f54458a;
        return C41636g.m90914f0(C41636g.m90890N(C41636g.m90887K(new C22597xb3de3619(strM102326h, null)), C42911a.m94120b()), continuation);
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC46927d m53339h() {
        return (InterfaceC46927d) this.f42767a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m53340i(@Nullable Long l11, @NotNull Continuation<? super WidgetFearGreedEntity> continuation) {
        QuoteWidgetsRepo$getFearGreedWidgetInfo$1 quoteWidgetsRepo$getFearGreedWidgetInfo$1;
        if (continuation instanceof QuoteWidgetsRepo$getFearGreedWidgetInfo$1) {
            quoteWidgetsRepo$getFearGreedWidgetInfo$1 = (QuoteWidgetsRepo$getFearGreedWidgetInfo$1) continuation;
            int i11 = quoteWidgetsRepo$getFearGreedWidgetInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteWidgetsRepo$getFearGreedWidgetInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteWidgetsRepo$getFearGreedWidgetInfo$1 = new QuoteWidgetsRepo$getFearGreedWidgetInfo$1(this, continuation);
            }
        } else {
            quoteWidgetsRepo$getFearGreedWidgetInfo$1 = new QuoteWidgetsRepo$getFearGreedWidgetInfo$1(this, continuation);
        }
        Object objM103393d = quoteWidgetsRepo$getFearGreedWidgetInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteWidgetsRepo$getFearGreedWidgetInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM103393d);
                InterfaceC46927d interfaceC46927dM53339h = m53339h();
                quoteWidgetsRepo$getFearGreedWidgetInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(l11);
                quoteWidgetsRepo$getFearGreedWidgetInfo$1.label = 1;
                objM103393d = interfaceC46927dM53339h.m103393d(l11, quoteWidgetsRepo$getFearGreedWidgetInfo$1);
                if (objM103393d == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM103393d);
            }
            WidgetFearGreedEntity widgetFearGreedEntity = (WidgetFearGreedEntity) objM103393d;
            if (widgetFearGreedEntity == null) {
                return null;
            }
            StorageId<String> storageIdM52058r = QuoteKV.f42044a.m52058r();
            String strM66606i = C27029c.m66606i(widgetFearGreedEntity);
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            C46392a.m102333p(storageIdM52058r, strM66606i);
            return widgetFearGreedEntity;
        } catch (Exception e11) {
            C44128b.m97263g("QuoteWidgetsRepo", e11);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: j */
    public final Object m53341j(@NotNull Continuation<? super ChanceGemBoxEntity> continuation) {
        QuoteWidgetsRepo$getGemboxWidgetInfo$1 quoteWidgetsRepo$getGemboxWidgetInfo$1;
        if (continuation instanceof QuoteWidgetsRepo$getGemboxWidgetInfo$1) {
            quoteWidgetsRepo$getGemboxWidgetInfo$1 = (QuoteWidgetsRepo$getGemboxWidgetInfo$1) continuation;
            int i11 = quoteWidgetsRepo$getGemboxWidgetInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteWidgetsRepo$getGemboxWidgetInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteWidgetsRepo$getGemboxWidgetInfo$1 = new QuoteWidgetsRepo$getGemboxWidgetInfo$1(this, continuation);
            }
        } else {
            quoteWidgetsRepo$getGemboxWidgetInfo$1 = new QuoteWidgetsRepo$getGemboxWidgetInfo$1(this, continuation);
        }
        Object objM103394e = quoteWidgetsRepo$getGemboxWidgetInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteWidgetsRepo$getGemboxWidgetInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM103394e);
                InterfaceC46927d interfaceC46927dM53339h = m53339h();
                quoteWidgetsRepo$getGemboxWidgetInfo$1.label = 1;
                objM103394e = interfaceC46927dM53339h.m103394e(quoteWidgetsRepo$getGemboxWidgetInfo$1);
                if (objM103394e == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM103394e);
            }
            StorageId<String> storageIdM52059s = QuoteKV.f42044a.m52059s();
            String strM66606i = C27029c.m66606i((ChanceGemBoxEntity) objM103394e);
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            C46392a.m102333p(storageIdM52059s, strM66606i);
            return (ChanceGemBoxEntity) objM103394e;
        } catch (Exception e11) {
            C44128b.m97263g("QuoteWidgetsRepo", e11);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object m53342k(@NotNull Continuation<? super List<ChancePlateItem>> continuation) {
        QuoteWidgetsRepo$getHotSectorsWidgetInfo$1 quoteWidgetsRepo$getHotSectorsWidgetInfo$1;
        if (continuation instanceof QuoteWidgetsRepo$getHotSectorsWidgetInfo$1) {
            quoteWidgetsRepo$getHotSectorsWidgetInfo$1 = (QuoteWidgetsRepo$getHotSectorsWidgetInfo$1) continuation;
            int i11 = quoteWidgetsRepo$getHotSectorsWidgetInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteWidgetsRepo$getHotSectorsWidgetInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteWidgetsRepo$getHotSectorsWidgetInfo$1 = new QuoteWidgetsRepo$getHotSectorsWidgetInfo$1(this, continuation);
            }
        } else {
            quoteWidgetsRepo$getHotSectorsWidgetInfo$1 = new QuoteWidgetsRepo$getHotSectorsWidgetInfo$1(this, continuation);
        }
        Object objM103391b = quoteWidgetsRepo$getHotSectorsWidgetInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteWidgetsRepo$getHotSectorsWidgetInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM103391b);
                InterfaceC46927d interfaceC46927dM53339h = m53339h();
                quoteWidgetsRepo$getHotSectorsWidgetInfo$1.label = 1;
                objM103391b = interfaceC46927dM53339h.m103391b(quoteWidgetsRepo$getHotSectorsWidgetInfo$1);
                if (objM103391b == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM103391b);
            }
            ChancePlateEntity chancePlateEntity = (ChancePlateEntity) objM103391b;
            if (chancePlateEntity == null) {
                return null;
            }
            StorageId<String> storageIdM52060t = QuoteKV.f42044a.m52060t();
            String strM66606i = C27029c.m66606i(chancePlateEntity);
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            C46392a.m102333p(storageIdM52060t, strM66606i);
            return chancePlateEntity.getPlateList();
        } catch (Exception e11) {
            C44128b.m97263g("QuoteWidgetsRepo", e11);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object m53343l(@NotNull Continuation<? super RiseFallEntity> continuation) {
        QuoteWidgetsRepo$getRiseFallWidgetInfo$1 quoteWidgetsRepo$getRiseFallWidgetInfo$1;
        if (continuation instanceof QuoteWidgetsRepo$getRiseFallWidgetInfo$1) {
            quoteWidgetsRepo$getRiseFallWidgetInfo$1 = (QuoteWidgetsRepo$getRiseFallWidgetInfo$1) continuation;
            int i11 = quoteWidgetsRepo$getRiseFallWidgetInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteWidgetsRepo$getRiseFallWidgetInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteWidgetsRepo$getRiseFallWidgetInfo$1 = new QuoteWidgetsRepo$getRiseFallWidgetInfo$1(this, continuation);
            }
        } else {
            quoteWidgetsRepo$getRiseFallWidgetInfo$1 = new QuoteWidgetsRepo$getRiseFallWidgetInfo$1(this, continuation);
        }
        Object objM103390a = quoteWidgetsRepo$getRiseFallWidgetInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteWidgetsRepo$getRiseFallWidgetInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM103390a);
                InterfaceC46927d interfaceC46927dM53339h = m53339h();
                quoteWidgetsRepo$getRiseFallWidgetInfo$1.label = 1;
                objM103390a = interfaceC46927dM53339h.m103390a(quoteWidgetsRepo$getRiseFallWidgetInfo$1);
                if (objM103390a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM103390a);
            }
            RiseFallEntity riseFallEntity = (RiseFallEntity) objM103390a;
            if (riseFallEntity == null) {
                return null;
            }
            StorageId<String> storageIdM52061u = QuoteKV.f42044a.m52061u();
            String strM66606i = C27029c.m66606i(riseFallEntity);
            Intrinsics.checkNotNullExpressionValue(strM66606i, "toJson(...)");
            C46392a.m102333p(storageIdM52061u, strM66606i);
            return riseFallEntity;
        } catch (Exception e11) {
            C44128b.m97263g("QuoteWidgetsRepo", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC46927d m53344m() {
        return (InterfaceC46927d) this.f42768b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final InterfaceC41775x1 m53345n() {
        return C41696j.m91104d(new QuoteCoroutineScope(C42911a.m94120b(), "preload"), null, null, new QuoteWidgetsRepo$preloadAsync$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC46927d m53333c() {
        return (InterfaceC46927d) C42597a.m93388d().create(InterfaceC46927d.class);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m53346o(@NotNull String str, @NotNull Function1<? super ChanceGemBoxCurrency, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objCollect = C41636g.m90917h(m53344m().m103392c(str), new QuoteWidgetsRepo$subscribeGemBoxPush$2(null)).collect(new C22593a(function1), continuation);
        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objCollect;
        }
        return Unit.INSTANCE;
    }
}
