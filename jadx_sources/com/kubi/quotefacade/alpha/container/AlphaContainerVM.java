package com.kubi.quotefacade.alpha.container;

import com.kubi.mvi.event.SingleEvent;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.mvi.state.InterfaceC19284f;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.constant.AlphaMenu;
import com.kubi.quotefacade.entity.AlphaLevel;
import com.kubi.quotefacade.entity.AlphaMenuEntity;
import com.kubi.quotefacade.entity.AlphaMenuModel;
import com.kubi.quotefacade.entity.TabMenuEntity;
import com.kubi.quotefacade.helper.QuoteBusinessConfigHelp;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AlphaContainerVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\rH\u0016J\u001e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/container/AlphaContainerVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/alpha/container/AlphaContainerContract$UIState;", "<init>", "()V", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "isSuccessLoaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initState", "getInitState", "()Lcom/kubi/quotefacade/alpha/container/AlphaContainerContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "loadMenuData", "alphaType", "", "isNewCount", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "convertData", "Lcom/kubi/quotefacade/entity/AlphaMenuModel;", "data", "Lcom/kubi/quotefacade/entity/AlphaMenuEntity;", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaContainerVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaContainerVM.kt\ncom/kubi/quotefacade/alpha/container/AlphaContainerVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1869#2,2:87\n*S KotlinDebug\n*F\n+ 1 AlphaContainerVM.kt\ncom/kubi/quotefacade/alpha/container/AlphaContainerVM\n*L\n62#1:87,2\n*E\n"})
public final class AlphaContainerVM extends AbstractC19291m<AlphaContainerContract$UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final QuoteMarketRepository f41174X = new QuoteMarketRepository();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final AtomicBoolean f41175Y = new AtomicBoolean(false);

    /* JADX INFO: renamed from: p */
    public static final Unit m50502p(AlphaContainerVM alphaContainerVM, String str) {
        alphaContainerVM.launchOnIO(new AlphaContainerVM$loadMenuData$2$1(alphaContainerVM, str, null));
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        if (interfaceC19282d instanceof AlphaContainerContract$UiIntent.FetchMenuData) {
            Object objM50505o = m50505o(((AlphaContainerContract$UiIntent.FetchMenuData) interfaceC19282d).getAlphaType(), false, continuation);
            return objM50505o == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM50505o : Unit.INSTANCE;
        }
        if (!(interfaceC19282d instanceof AlphaContainerContract$UiIntent.FetchNewData)) {
            return Unit.INSTANCE;
        }
        Object objM50505o2 = m50505o(((AlphaContainerContract$UiIntent.FetchNewData) interfaceC19282d).getAlphaType(), true, continuation);
        return objM50505o2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM50505o2 : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final AlphaMenuModel m50503e(AlphaMenuEntity alphaMenuEntity, String str) {
        List<AlphaLevel> level1;
        AlphaLevel alphaLevel;
        List<AlphaLevel> level2;
        AlphaLevel alphaLevel2;
        List<AlphaLevel> level3;
        AlphaMenuModel alphaMenuModel = new AlphaMenuModel(null, null, null, null, null, null, false, 127, null);
        if (!Intrinsics.areEqual(str, "alpha_premium")) {
            TabMenuEntity chainAreaMenu = alphaMenuEntity.getChainAreaMenu();
            String category = null;
            alphaMenuModel.setNetworksAll((chainAreaMenu == null || (level2 = chainAreaMenu.getLevel1()) == null || (alphaLevel2 = (AlphaLevel) CollectionsKt.firstOrNull((List) level2)) == null) ? null : alphaLevel2.getNetworks());
            TabMenuEntity chainAreaMenu2 = alphaMenuEntity.getChainAreaMenu();
            if (chainAreaMenu2 != null && (level1 = chainAreaMenu2.getLevel1()) != null && (alphaLevel = (AlphaLevel) CollectionsKt.firstOrNull((List) level1)) != null) {
                category = alphaLevel.getCategory();
            }
            alphaMenuModel.setCategoryChainarea(category);
            return alphaMenuModel;
        }
        TabMenuEntity highlightsMenu = alphaMenuEntity.getHighlightsMenu();
        if (highlightsMenu != null && (level3 = highlightsMenu.getLevel1()) != null) {
            for (AlphaLevel alphaLevel3 : level3) {
                String category2 = alphaLevel3.getCategory();
                if (Intrinsics.areEqual(category2, AlphaMenu.NEW.getType())) {
                    alphaMenuModel.setNetworksNew(alphaLevel3.getNetworks());
                    alphaMenuModel.setNewCount(alphaLevel3.getLast48HourPublishedCount());
                    alphaMenuModel.setCategoryHighlightsNew(alphaLevel3.getCategory());
                } else if (Intrinsics.areEqual(category2, AlphaMenu.ALL.getType())) {
                    alphaMenuModel.setNetworksAll(alphaLevel3.getNetworks());
                    alphaMenuModel.setCategoryHighlightsAll(alphaLevel3.getCategory());
                } else if (Intrinsics.areEqual(category2, "ONDO")) {
                    alphaMenuModel.setShowOndoTab(alphaLevel3.getEnabled());
                }
            }
        }
        return alphaMenuModel;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.kubi.quotefacade.alpha.container.AlphaContainerContract$UIState] */
    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AlphaContainerContract$UIState getInitState() {
        return new InterfaceC19284f() { // from class: com.kubi.quotefacade.alpha.container.AlphaContainerContract$UIState
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m50505o(final String str, boolean z11, Continuation<? super Unit> continuation) {
        AlphaContainerVM$loadMenuData$1 alphaContainerVM$loadMenuData$1;
        if (continuation instanceof AlphaContainerVM$loadMenuData$1) {
            alphaContainerVM$loadMenuData$1 = (AlphaContainerVM$loadMenuData$1) continuation;
            int i11 = alphaContainerVM$loadMenuData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                alphaContainerVM$loadMenuData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                alphaContainerVM$loadMenuData$1 = new AlphaContainerVM$loadMenuData$1(this, continuation);
            }
        } else {
            alphaContainerVM$loadMenuData$1 = new AlphaContainerVM$loadMenuData$1(this, continuation);
        }
        Object objM52997l = alphaContainerVM$loadMenuData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = alphaContainerVM$loadMenuData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM52997l);
            if (!z11) {
                send(SingleEvent.C19253i.f35632b);
            }
            String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
            QuoteMarketRepository quoteMarketRepository = this.f41174X;
            alphaContainerVM$loadMenuData$1.L$0 = str;
            alphaContainerVM$loadMenuData$1.L$1 = SpillingKt.nullOutSpilledVariable(strM51845i);
            alphaContainerVM$loadMenuData$1.Z$0 = z11;
            alphaContainerVM$loadMenuData$1.label = 1;
            objM52997l = quoteMarketRepository.m52997l(strM51845i, alphaContainerVM$loadMenuData$1);
            if (objM52997l == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = alphaContainerVM$loadMenuData$1.Z$0;
            str = (String) alphaContainerVM$loadMenuData$1.L$0;
            ResultKt.throwOnFailure(objM52997l);
        }
        AlphaMenuEntity alphaMenuEntity = (AlphaMenuEntity) objM52997l;
        if (alphaMenuEntity == null) {
            send(new SingleEvent.C19250f(new Function0() { // from class: com.kubi.quotefacade.alpha.container.b1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlphaContainerVM.m50502p(this.f41183b, str);
                }
            }));
        } else {
            if (z11) {
                send(new C21614b(m50503e(alphaMenuEntity, str)));
            } else {
                send(SingleEvent.C19248d.f35627b);
                send(new C21611a(m50503e(alphaMenuEntity, str)));
            }
            this.f41175Y.set(true);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
    }
}
