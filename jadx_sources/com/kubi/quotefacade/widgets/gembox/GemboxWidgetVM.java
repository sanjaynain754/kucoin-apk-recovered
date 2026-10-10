package com.kubi.quotefacade.widgets.gembox;

import com.kubi.home.api.HomeWidgetCode;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.entity.ChanceGemBoxCurrency;
import com.kubi.quotefacade.entity.ChanceGemBoxCurrencyHighLight;
import com.kubi.quotefacade.entity.ChanceGemBoxEntity;
import com.kubi.quotefacade.helper.QuoteCoroutineScope;
import com.kubi.quotefacade.tradechance.submodule.gembox.ChanceGemBoxHelper;
import com.kubi.quotefacade.widgets.QuoteWidgetsRepo;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.extensions.DowngradeExKt;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.C41696j;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p502oj.C43103h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GemboxWidgetVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0094@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/quotefacade/widgets/gembox/GemboxWidgetVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/widgets/gembox/GemboxWidgetContract$UIState;", "<init>", "()V", "repo", "Lcom/kubi/quotefacade/widgets/QuoteWidgetsRepo;", "firstLoad", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasSuccessed", "wsScope", "Lcom/kubi/quotefacade/helper/QuoteCoroutineScope;", "initState", "getInitState", "()Lcom/kubi/quotefacade/widgets/gembox/GemboxWidgetContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "forceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startWsPush", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGemboxWidgetVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GemboxWidgetVM.kt\ncom/kubi/quotefacade/widgets/gembox/GemboxWidgetVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n473#2,4:87\n1#3:91\n*S KotlinDebug\n*F\n+ 1 GemboxWidgetVM.kt\ncom/kubi/quotefacade/widgets/gembox/GemboxWidgetVM\n*L\n33#1:87,4\n*E\n"})
public final class GemboxWidgetVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final QuoteWidgetsRepo f42862X = new QuoteWidgetsRepo();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final AtomicBoolean f42863Y = new AtomicBoolean(true);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final AtomicBoolean f42864Z = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final QuoteCoroutineScope f42865a0 = new QuoteCoroutineScope(C42911a.m94120b(), "gembox-ws");

    /* JADX INFO: renamed from: com.kubi.quotefacade.widgets.gembox.GemboxWidgetVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: GemboxWidgetVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.gembox.GemboxWidgetVM", m90122f = "GemboxWidgetVM.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {33}, m90125m = "dispatchIntent", m90126n = {"intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-GemboxWidgetVM$dispatchIntent$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    public static final class C226591 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C226591(Continuation<? super C226591> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GemboxWidgetVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m53572o(boolean z11, Continuation<? super Unit> continuation) throws JSONException {
        GemboxWidgetVM$loadData$1 gemboxWidgetVM$loadData$1;
        long jM94718b;
        long j11;
        List<ChanceGemBoxCurrency> currencyList;
        final ChanceGemBoxCurrency chanceGemBoxCurrency;
        ChanceGemBoxEntity chanceGemBoxEntity;
        final ChanceGemBoxCurrency chanceGemBoxCurrency2;
        List<ChanceGemBoxCurrency> currencyList2;
        if (continuation instanceof GemboxWidgetVM$loadData$1) {
            gemboxWidgetVM$loadData$1 = (GemboxWidgetVM$loadData$1) continuation;
            int i11 = gemboxWidgetVM$loadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gemboxWidgetVM$loadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                gemboxWidgetVM$loadData$1 = new GemboxWidgetVM$loadData$1(this, continuation);
            }
        } else {
            gemboxWidgetVM$loadData$1 = new GemboxWidgetVM$loadData$1(this, continuation);
        }
        Object objM53336e = gemboxWidgetVM$loadData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gemboxWidgetVM$loadData$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                z11 = gemboxWidgetVM$loadData$1.Z$0;
                ResultKt.throwOnFailure(objM53336e);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = gemboxWidgetVM$loadData$1.J$0;
                ResultKt.throwOnFailure(objM53336e);
            }
            chanceGemBoxEntity = (ChanceGemBoxEntity) objM53336e;
            if (chanceGemBoxEntity != null || (currencyList2 = chanceGemBoxEntity.getCurrencyList()) == null || (chanceGemBoxCurrency2 = (ChanceGemBoxCurrency) CollectionsKt.firstOrNull((List) currencyList2)) == null) {
                chanceGemBoxCurrency2 = null;
            } else {
                ChanceGemBoxHelper chanceGemBoxHelper = ChanceGemBoxHelper.f42656a;
                List<ChanceGemBoxCurrencyHighLight> highLights = chanceGemBoxCurrency2.getHighLights();
                if (highLights == null) {
                    highLights = CollectionsKt.emptyList();
                }
                chanceGemBoxCurrency2.setHighLightsTextItems(chanceGemBoxHelper.m53175g(highLights));
            }
            C43103h c43103h = C43103h.f95308a;
            c43103h.m94720d(HomeWidgetCode.Gembox.getCode(), c43103h.m94718b() - j11);
            if (chanceGemBoxCurrency2 != null) {
                updateState(new Function1() { // from class: com.kubi.quotefacade.widgets.gembox.g
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GemboxWidgetVM.m53574q(chanceGemBoxCurrency2, (UIState) obj);
                    }
                });
                this.f42864Z.set(true);
                m53576r();
            } else if (((UIState) getState()).getData() == null) {
                send(C22664e.f42873a);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM53336e);
        if (!this.f42863Y.compareAndSet(true, false)) {
            if (this.f42864Z.get() || z11) {
                jM94718b = C43103h.f95308a.m94718b();
                QuoteWidgetsRepo quoteWidgetsRepo = this.f42862X;
                gemboxWidgetVM$loadData$1.Z$0 = z11;
                gemboxWidgetVM$loadData$1.J$0 = jM94718b;
                gemboxWidgetVM$loadData$1.label = 2;
                objM53336e = quoteWidgetsRepo.m53341j(gemboxWidgetVM$loadData$1);
                if (objM53336e != coroutine_suspended) {
                    j11 = jM94718b;
                    chanceGemBoxEntity = (ChanceGemBoxEntity) objM53336e;
                    if (chanceGemBoxEntity != null) {
                        chanceGemBoxCurrency2 = null;
                    } else {
                        chanceGemBoxCurrency2 = null;
                    }
                    C43103h c43103h2 = C43103h.f95308a;
                    c43103h2.m94720d(HomeWidgetCode.Gembox.getCode(), c43103h2.m94718b() - j11);
                    if (chanceGemBoxCurrency2 != null) {
                        updateState(new Function1() { // from class: com.kubi.quotefacade.widgets.gembox.g
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return GemboxWidgetVM.m53574q(chanceGemBoxCurrency2, (UIState) obj);
                            }
                        });
                        this.f42864Z.set(true);
                        m53576r();
                    } else if (((UIState) getState()).getData() == null) {
                        send(C22664e.f42873a);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        QuoteWidgetsRepo quoteWidgetsRepo2 = this.f42862X;
        gemboxWidgetVM$loadData$1.Z$0 = z11;
        gemboxWidgetVM$loadData$1.label = 1;
        objM53336e = quoteWidgetsRepo2.m53336e(gemboxWidgetVM$loadData$1);
        return coroutine_suspended;
        ChanceGemBoxEntity chanceGemBoxEntity2 = (ChanceGemBoxEntity) objM53336e;
        if (chanceGemBoxEntity2 != null && (currencyList = chanceGemBoxEntity2.getCurrencyList()) != null && (chanceGemBoxCurrency = (ChanceGemBoxCurrency) CollectionsKt.firstOrNull((List) currencyList)) != null) {
            Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.widgets.gembox.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GemboxWidgetVM.m53573p(chanceGemBoxCurrency, (UIState) obj);
                }
            }));
        }
        if (this.f42864Z.get()) {
        }
        jM94718b = C43103h.f95308a.m94718b();
        QuoteWidgetsRepo quoteWidgetsRepo3 = this.f42862X;
        gemboxWidgetVM$loadData$1.Z$0 = z11;
        gemboxWidgetVM$loadData$1.J$0 = jM94718b;
        gemboxWidgetVM$loadData$1.label = 2;
        objM53336e = quoteWidgetsRepo3.m53341j(gemboxWidgetVM$loadData$1);
        if (objM53336e != coroutine_suspended) {
            j11 = jM94718b;
            chanceGemBoxEntity = (ChanceGemBoxEntity) objM53336e;
            if (chanceGemBoxEntity != null) {
                chanceGemBoxCurrency2 = null;
            } else {
                chanceGemBoxCurrency2 = null;
            }
            C43103h c43103h3 = C43103h.f95308a;
            c43103h3.m94720d(HomeWidgetCode.Gembox.getCode(), c43103h3.m94718b() - j11);
            if (chanceGemBoxCurrency2 != null) {
                updateState(new Function1() { // from class: com.kubi.quotefacade.widgets.gembox.g
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GemboxWidgetVM.m53574q(chanceGemBoxCurrency2, (UIState) obj);
                    }
                });
                this.f42864Z.set(true);
                m53576r();
            } else if (((UIState) getState()).getData() == null) {
                send(C22664e.f42873a);
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: p */
    public static final UIState m53573p(ChanceGemBoxCurrency chanceGemBoxCurrency, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(chanceGemBoxCurrency);
    }

    /* JADX INFO: renamed from: q */
    public static final UIState m53574q(ChanceGemBoxCurrency chanceGemBoxCurrency, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(chanceGemBoxCurrency);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C226591 c226591;
        if (continuation instanceof C226591) {
            c226591 = (C226591) continuation;
            int i11 = c226591.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c226591.label = i11 - Integer.MIN_VALUE;
            } else {
                c226591 = new C226591(continuation);
            }
        } else {
            c226591 = new C226591(continuation);
        }
        Object obj = c226591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c226591.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (interfaceC19282d instanceof GemboxWidgetContract$UiIntent.LoadData) {
                GemboxWidgetContract$UiIntent.LoadData loadData = (GemboxWidgetContract$UiIntent.LoadData) interfaceC19282d;
                boolean forceRefresh = loadData.getForceRefresh();
                c226591.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c226591.L$1 = SpillingKt.nullOutSpilledVariable(this);
                c226591.L$2 = interfaceC19282d;
                c226591.L$3 = SpillingKt.nullOutSpilledVariable(loadData);
                c226591.I$0 = 0;
                c226591.I$1 = 0;
                c226591.label = 1;
                if (m53572o(forceRefresh, c226591) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, 1, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m53576r() {
        String strM66551u = DowngradeExKt.m66551u("/app-home/gem-box:%s", new Object[]{MultiLanguageManager.f46811g.getLocalString()}, null, 2, null);
        this.f42865a0.close();
        C41696j.m91104d(this.f42865a0, null, null, new GemboxWidgetVM$startWsPush$1(this, strM66551u, null), 3, null);
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        super.onHide();
        this.f42865a0.close();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        if (this.f42864Z.get()) {
            m53576r();
        }
    }
}
