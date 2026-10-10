package com.kubi.tradingbotkit.business.editPriceRange.viewModel;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.media3.common.MimeTypes;
import com.kubi.tradingbotkit.business.spot.repostory.RobotSpotRepository;
import com.kubi.tradingbotkit.business.spot.viewmodel.t0;
import com.kubi.tradingbotkit.model.CurrencyBalanceModel;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import g40.InterfaceC37807a;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: EditPriceRangeViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010H\u001a\u00020!2\u0006\u0010I\u001a\u00020JH\u0002J\u0018\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00172\b\u0010N\u001a\u0004\u0018\u00010\u0017J\u000e\u0010O\u001a\u00020L2\u0006\u0010P\u001a\u00020\u0017J\u0016\u0010Q\u001a\u00020L2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020!J\u000e\u0010U\u001a\u00020L2\u0006\u0010R\u001a\u00020SJ\u0016\u0010V\u001a\u00020L2\u0006\u0010R\u001a\u00020W2\u0006\u0010T\u001a\u00020!J\u0016\u0010[\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00172\u0006\u0010N\u001a\u00020\u0017J\u0010\u0010\\\u001a\u00020L2\u0006\u0010]\u001a\u00020EH\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0013R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR)\u0010 \u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010!0!0\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b#\u0010\u001eR!\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0015\u001a\u0004\b'\u0010\u001eR!\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0015\u001a\u0004\b*\u0010\u001eR!\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0015\u001a\u0004\b.\u0010\u001eR!\u00100\u001a\b\u0012\u0004\u0012\u0002010\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0015\u001a\u0004\b2\u0010\u001eR)\u00104\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010!0!0\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0015\u001a\u0004\b5\u0010\u001eR!\u00107\u001a\b\u0012\u0004\u0012\u00020!0\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0015\u001a\u0004\b8\u0010\u0013R'\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170;0\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u0015\u001a\u0004\b<\u0010\u0013R!\u0010>\u001a\b\u0012\u0004\u0012\u00020!0\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u0015\u001a\u0004\b?\u0010\u001eR!\u0010A\u001a\b\u0012\u0004\u0012\u00020!0\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u0015\u001a\u0004\bB\u0010\u001eR!\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u0015\u001a\u0004\bF\u0010\u001eR\u0014\u0010X\u001a\b\u0012\u0004\u0012\u00020Z0YX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/editPriceRange/viewModel/EditPriceRangeViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lcom/kubi/tradingbotkit/business/ICountBalanceViewModel;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "coroutineExceptionHandler", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineExceptionHandler", "()Lkotlin/coroutines/CoroutineContext;", "robotSpotRepository", "Lcom/kubi/tradingbotkit/business/spot/repostory/RobotSpotRepository;", "getRobotSpotRepository", "()Lcom/kubi/tradingbotkit/business/spot/repostory/RobotSpotRepository;", "symbolPrice", "Landroidx/lifecycle/MediatorLiveData;", "Ljava/math/BigDecimal;", "getSymbolPrice", "()Landroidx/lifecycle/MediatorLiveData;", "symbolPrice$delegate", "Lkotlin/Lazy;", "errorMsg", "", "getErrorMsg", "errorMsg$delegate", "aiParameterEntity", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/tradingbotkit/entity/AiParameterEntity;", "getAiParameterEntity", "()Landroidx/lifecycle/MutableLiveData;", "aiParameterEntity$delegate", "aiParamsLoading", "", "kotlin.jvm.PlatformType", "getAiParamsLoading", "aiParamsLoading$delegate", "extendRegionAmountEntity", "Lcom/kubi/tradingbotkit/entity/ExtendRegionAmountEntity;", "getExtendRegionAmountEntity", "extendRegionAmountEntity$delegate", "updateRegionAmountEntity", "getUpdateRegionAmountEntity", "updateRegionAmountEntity$delegate", "modifyStrategyEntity", "", "getModifyStrategyEntity", "modifyStrategyEntity$delegate", "marketInfoEntity", "Lcom/kubi/tradingbotkit/entity/MarketInfoEntity;", "getMarketInfoEntity", "marketInfoEntity$delegate", "marketInfoLoading", "getMarketInfoLoading", "marketInfoLoading$delegate", "loadingView", "getLoadingView", "loadingView$delegate", "errorView", "Lcom/kubi/tradingbotkit/business/spot/viewmodel/State;", "getErrorView", "errorView$delegate", "fillAiParameters", "getFillAiParameters", "fillAiParameters$delegate", "goToNextPage", "getGoToNextPage", "goToNextPage$delegate", "balanceModel", "Lcom/kubi/tradingbotkit/model/CurrencyBalanceModel;", "getBalanceModel", "balanceModel$delegate", "logErrorMsg", "it", "", "getAiParams", "", "symbol", "taskId", "getAccountBalance", "quoteCurrency", "getExtendRegionAmount", ReportDataTable.COLUMN_PARAMS, "Lcom/kubi/tradingbotkit/bean/params/ExtendRegionAmountBean;", "jumpToNextPage", "getExtendRegionExec", "getUpdateRegionAmount", "Lcom/kubi/tradingbotkit/bean/params/UpdateRegionBean;", "loadingViewObserver", "Landroidx/lifecycle/Observer;", "", "getMarketInfo", "currentBalance", "model", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEditPriceRangeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditPriceRangeViewModel.kt\ncom/kubi/tradingbotkit/business/editPriceRange/viewModel/EditPriceRangeViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,227:1\n47#2,4:228\n*S KotlinDebug\n*F\n+ 1 EditPriceRangeViewModel.kt\ncom/kubi/tradingbotkit/business/editPriceRange/viewModel/EditPriceRangeViewModel\n*L\n39#1:228,4\n*E\n"})
public final class EditPriceRangeViewModel extends AndroidViewModel implements InterfaceC37807a {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final CoroutineContext f52377V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final RobotSpotRepository f52378W;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f52379X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f52380Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f52381Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f52382a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f52383b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f52384c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f52385d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f52386e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f52387f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f52388g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final Lazy f52389h0;

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f52390i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final Lazy f52391j0;

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final Lazy f52392k0;

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final Observer<Object> f52393l0;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.editPriceRange.viewModel.EditPriceRangeViewModel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 EditPriceRangeViewModel.kt\ncom/kubi/tradingbotkit/business/editPriceRange/viewModel/EditPriceRangeViewModel\n*L\n1#1,49:1\n40#2,2:50\n*E\n"})
    public static final class C26159a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public C26159a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97264h(exception);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditPriceRangeViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f52377V = new C26159a(CoroutineExceptionHandler.INSTANCE);
        this.f52378W = new RobotSpotRepository();
        this.f52379X = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditPriceRangeViewModel.m64034Y();
            }
        });
        this.f52380Y = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditPriceRangeViewModel.m64024G();
            }
        });
        this.f52381Z = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditPriceRangeViewModel.m64021D();
            }
        });
        this.f52382a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditPriceRangeViewModel.m64022E();
            }
        });
        this.f52383b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditPriceRangeViewModel.m64026I();
            }
        });
        this.f52384c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditPriceRangeViewModel.m64035Z();
            }
        });
        this.f52385d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditPriceRangeViewModel.m64033X();
            }
        });
        this.f52386e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditPriceRangeViewModel.m64031V();
            }
        });
        this.f52387f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditPriceRangeViewModel.m64032W();
            }
        });
        this.f52388g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditPriceRangeViewModel.m64030T();
            }
        });
        this.f52389h0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditPriceRangeViewModel.m64025H();
            }
        });
        this.f52390i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditPriceRangeViewModel.m64027J();
            }
        });
        this.f52391j0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditPriceRangeViewModel.m64028R();
            }
        });
        this.f52392k0 = LazyKt.lazy(new Function0() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditPriceRangeViewModel.m64023F();
            }
        });
        Observer<? super S> observer = new Observer() { // from class: com.kubi.tradingbotkit.business.editPriceRange.viewModel.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                EditPriceRangeViewModel.m64029S(this.f52396b, obj);
            }
        };
        this.f52393l0 = observer;
        m64053O().addSource(m64050L(), observer);
        m64053O().addSource(m64054P(), observer);
    }

    /* JADX INFO: renamed from: D */
    public static final MutableLiveData m64021D() {
        return new MutableLiveData();
    }

    /* JADX INFO: renamed from: E */
    public static final MutableLiveData m64022E() {
        return new MutableLiveData(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: F */
    public static final MutableLiveData m64023F() {
        return new MutableLiveData();
    }

    /* JADX INFO: renamed from: G */
    public static final MediatorLiveData m64024G() {
        return new MediatorLiveData();
    }

    /* JADX INFO: renamed from: H */
    public static final MediatorLiveData m64025H() {
        return new MediatorLiveData();
    }

    /* JADX INFO: renamed from: I */
    public static final MutableLiveData m64026I() {
        return new MutableLiveData();
    }

    /* JADX INFO: renamed from: J */
    public static final MutableLiveData m64027J() {
        return new MutableLiveData();
    }

    /* JADX INFO: renamed from: R */
    public static final MutableLiveData m64028R() {
        return new MutableLiveData();
    }

    /* JADX INFO: renamed from: S */
    public static final void m64029S(EditPriceRangeViewModel editPriceRangeViewModel, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Boolean value = editPriceRangeViewModel.m64054P().getValue();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(value, bool) || Intrinsics.areEqual(editPriceRangeViewModel.m64050L().getValue(), bool)) {
            return;
        }
        t0.d(editPriceRangeViewModel.m64053O(), Boolean.FALSE);
    }

    /* JADX INFO: renamed from: T */
    public static final MediatorLiveData m64030T() {
        return new MediatorLiveData();
    }

    /* JADX INFO: renamed from: V */
    public static final MutableLiveData m64031V() {
        return new MutableLiveData();
    }

    /* JADX INFO: renamed from: W */
    public static final MutableLiveData m64032W() {
        return new MutableLiveData(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: X */
    public static final MutableLiveData m64033X() {
        return new MutableLiveData();
    }

    /* JADX INFO: renamed from: Y */
    public static final MediatorLiveData m64034Y() {
        return new MediatorLiveData();
    }

    /* JADX INFO: renamed from: Z */
    public static final MutableLiveData m64035Z() {
        return new MutableLiveData();
    }

    /* JADX INFO: renamed from: K */
    public final void m64049K(@NotNull String quoteCurrency) {
        Intrinsics.checkNotNullParameter(quoteCurrency, "quoteCurrency");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), this.f52377V, null, new EditPriceRangeViewModel$getAccountBalance$1(quoteCurrency, this, null), 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final MutableLiveData<Boolean> m64050L() {
        return (MutableLiveData) this.f52382a0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final MutableLiveData<CurrencyBalanceModel> m64051M() {
        return (MutableLiveData) this.f52392k0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: N */
    public final MediatorLiveData<String> m64052N() {
        return (MediatorLiveData) this.f52380Y.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: O */
    public final MediatorLiveData<Boolean> m64053O() {
        return (MediatorLiveData) this.f52388g0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: P */
    public final MutableLiveData<Boolean> m64054P() {
        return (MutableLiveData) this.f52387f0.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final RobotSpotRepository getF52378W() {
        return this.f52378W;
    }

    @Override // g40.InterfaceC37807a
    /* JADX INFO: renamed from: a */
    public void mo64057a(@NotNull CurrencyBalanceModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        t0.d(m64051M(), model);
    }

    /* JADX INFO: renamed from: U */
    public final boolean m64056U(Throwable th2) {
        t0.d(m64052N(), th2.getMessage());
        C44128b.m97264h(th2);
        return true;
    }
}
