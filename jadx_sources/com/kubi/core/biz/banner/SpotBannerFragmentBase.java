package com.kubi.core.biz.banner;

import android.view.View;
import be.InterfaceC4578a;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.core.spot.entity.SpotBannerItemEntity;
import com.kubi.core.utils.C12462a;
import com.kubi.core.view.ComplianceNoticeView;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.MarqueeTextView;
import com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import org.jetbrains.annotations.NotNull;
import p569qq.C43852m;
import p827zc.AbstractC46753c;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import v30.C45374c;
import w00.C45681e;

/* JADX INFO: compiled from: SpotBannerFragmentBase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 +2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u001bH\u0014J\b\u0010\u001d\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\u0018\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u001bH\u0002J\u0018\u0010&\u001a\u00020\u001b2\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(H\u0002J\b\u0010*\u001a\u00020\u001bH\u0002R\u001d\u0010\u0007\u001a\u0004\u0018\u00010\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006,"}, m90084d2 = {"Lcom/kubi/core/biz/banner/SpotBannerFragmentBase;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;", "Lcom/kubi/core/biz/banner/SpotBannerContract$Intent;", "Lcom/kubi/core/biz/banner/SpotBannerContract$SpotBannerUiState;", "Lcom/kubi/core/biz/banner/BannerViewModel;", "<init>", "()V", "binding", "Lcom/kubi/tradecorebiz/databinding/BkcoinCoreSpotBannerLayoutBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/BkcoinCoreSpotBannerLayoutBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "createVM", "manager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", Constants.BIZ, "Lcom/kubi/core/config/TradeBiz;", "getBiz", "()Lcom/kubi/core/config/TradeBiz;", "getLayout", "", "initView", "", "bindState", "onRefresh", "onAgainShow", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "fillBannerItem", "bannerEntity", "Lcom/kubi/core/biz/banner/SpotDisplayBanner;", "itemView", "Landroid/view/View;", "refreshBannerDataAndStatus", "refreshComplianceNoticeView", "it", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;", "refreshBannerAndComplianceVisibility", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotBannerFragmentBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotBannerFragmentBase.kt\ncom/kubi/core/biz/banner/SpotBannerFragmentBase\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,180:1\n143#2,20:181\n*S KotlinDebug\n*F\n+ 1 SpotBannerFragmentBase.kt\ncom/kubi/core/biz/banner/SpotBannerFragmentBase\n*L\n35#1:181,20\n*E\n"})
public final class SpotBannerFragmentBase extends AbsTradeBaseBizFragment<SpotBannerContract$Intent, SpotBannerUiState, BannerViewModel> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final InterfaceC24293a f20146Y = C45681e.m100799e(this, new Function1<SpotBannerFragmentBase, C45374c>() { // from class: com.kubi.core.biz.banner.SpotBannerFragmentBase$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45374c invoke(@NotNull SpotBannerFragmentBase fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45374c.m100278a(fragment.requireView());
        }
    }, new Function1<C45374c, Unit>() { // from class: com.kubi.core.biz.banner.SpotBannerFragmentBase$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C45374c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45374c c45374c) {
            invoke(c45374c);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC4578a f20147Z = InterfaceC4578a.h.f4053a;

    /* JADX INFO: renamed from: b0 */
    public static final /* synthetic */ KProperty<Object>[] f20145b0 = {Reflection.property1(new PropertyReference1Impl(SpotBannerFragmentBase.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/BkcoinCoreSpotBannerLayoutBinding;", 0))};

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public static final Companion f20144a0 = new Companion(null);

    /* JADX INFO: compiled from: SpotBannerFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/core/biz/banner/SpotBannerFragmentBase$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/core/biz/banner/SpotBannerFragmentBase;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final SpotBannerFragmentBase newInstance() {
            return new SpotBannerFragmentBase();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.banner.SpotBannerFragmentBase$bindState$1 */
    /* JADX INFO: compiled from: SpotBannerFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/symbol/SymbolBizUiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.banner.SpotBannerFragmentBase$bindState$1", m90122f = "SpotBannerFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C116861 extends SuspendLambda implements Function2<SymbolBizUiState, Continuation<? super String>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C116861(Continuation<? super C116861> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SymbolBizUiState symbolBizUiState, Continuation<? super String> continuation) {
            return ((C116861) create(symbolBizUiState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116861 c116861 = new C116861(continuation);
            c116861.L$0 = obj;
            return c116861;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SymbolBizUiState symbolBizUiState = (SymbolBizUiState) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return symbolBizUiState.getSymbol();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.banner.SpotBannerFragmentBase$bindState$3 */
    /* JADX INFO: compiled from: SpotBannerFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.banner.SpotBannerFragmentBase$bindState$3", m90122f = "SpotBannerFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C116873 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C116873(Continuation<? super C116873> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116873 c116873 = SpotBannerFragmentBase.this.new C116873(continuation);
            c116873.L$0 = obj;
            return c116873;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C116873) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BannerViewModel bannerViewModelM21011A3 = SpotBannerFragmentBase.this.m21011A3();
            if (bannerViewModelM21011A3 != null) {
                bannerViewModelM21011A3.m21266F(new SpotBannerContract$Intent.SymbolChange(str));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.banner.SpotBannerFragmentBase$bindState$5 */
    /* JADX INFO: compiled from: SpotBannerFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.banner.SpotBannerFragmentBase$bindState$5", m90122f = "SpotBannerFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C116895 extends SuspendLambda implements Function2<List<? extends SpotBannerItemEntity>, Continuation<? super Unit>, Object> {
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends SpotBannerItemEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<SpotBannerItemEntity>) list, continuation);
        }

        public C116895(Continuation<? super C116895> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SpotBannerFragmentBase.this.new C116895(continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<SpotBannerItemEntity> list, Continuation<? super Unit> continuation) {
            return ((C116895) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                SpotBannerFragmentBase.this.m21295W3();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.banner.SpotBannerFragmentBase$bindState$7 */
    /* JADX INFO: compiled from: SpotBannerFragmentBase.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/core/spot/entity/SpotBannerItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.banner.SpotBannerFragmentBase$bindState$7", m90122f = "SpotBannerFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C116917 extends SuspendLambda implements Function2<List<? extends SpotBannerItemEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends SpotBannerItemEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<SpotBannerItemEntity>) list, continuation);
        }

        public C116917(Continuation<? super C116917> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C116917 c116917 = SpotBannerFragmentBase.this.new C116917(continuation);
            c116917.L$0 = obj;
            return c116917;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<SpotBannerItemEntity> list, Continuation<? super Unit> continuation) {
            return ((C116917) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SpotBannerFragmentBase.this.m21296X3(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R3 */
    public static final Unit m21288R3(SpotBannerFragmentBase spotBannerFragmentBase, MarqueeTextView marqueeTextView) {
        try {
            Result.Companion companion = Result.INSTANCE;
            new SpotBannerDataOperator(((SpotBannerUiState) spotBannerFragmentBase.getState()).getBannerNoticeList()).m21300c(marqueeTextView.getCurrentIndex());
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m21290U3(SpotBannerFragmentBase spotBannerFragmentBase, BGABanner bGABanner, View itemView, SpotDisplayBanner spotDisplayBanner, int i11) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        if (spotDisplayBanner != null) {
            spotBannerFragmentBase.m21292Q3(spotDisplayBanner, itemView);
        }
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: P3, reason: merged with bridge method [inline-methods] */
    public BannerViewModel mo21017v3(@NotNull AbstractC46753c manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new BannerViewModel(manager);
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m21292Q3(final SpotDisplayBanner spotDisplayBanner, View view) {
        final MarqueeTextView marqueeTextView = (MarqueeTextView) view.findViewById(R$id.marqueeView);
        marqueeTextView.setContentList(C11711r.m21306b(spotDisplayBanner));
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.core.biz.banner.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotBannerFragmentBase.m21288R3(this.f20158b, marqueeTextView);
            }
        }, 1, null);
        View viewFindViewById = view.findViewById(R$id.iv_close);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        C27046k.m66711z(viewFindViewById, 0L, new Function0() { // from class: com.kubi.core.biz.banner.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotBannerFragmentBase.m21289S3(this.f20160b, spotDisplayBanner);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: T3 */
    public final C45374c m21293T3() {
        return (C45374c) this.f20146Y.getValue(this, f20145b0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bkcoin_core_spot_banner_layout;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<BannerViewModel> getVmClass() {
        return Reflection.getOrCreateKotlinClass(BannerViewModel.class);
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: y3, reason: from getter */
    public InterfaceC4578a getF20711Z() {
        return this.f20147Z;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m21289S3(SpotBannerFragmentBase spotBannerFragmentBase, SpotDisplayBanner spotDisplayBanner) {
        BannerViewModel bannerViewModelM21011A3 = spotBannerFragmentBase.m21011A3();
        if (bannerViewModelM21011A3 != null) {
            bannerViewModelM21011A3.m21266F(new SpotBannerContract$Intent.Close(spotDisplayBanner));
        }
        spotBannerFragmentBase.m21295W3();
        C43852m.m96591c(C12462a.m23402a(), "announceClosure", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public final void m21294V3() {
        boolean z11;
        BGABanner bGABanner;
        BGABanner bGABanner2;
        ComplianceNoticeView complianceNoticeView;
        BGABanner bGABanner3;
        BGABanner bGABanner4;
        BGABanner bGABanner5;
        BGABanner bGABanner6;
        if (!isDetached()) {
            List<SpotDisplayBanner> listM21299b = new SpotBannerDataOperator(((SpotBannerUiState) getState()).getBannerNoticeList()).m21299b();
            List<SpotBannerItemEntity> complianceNoticeList = ((SpotBannerUiState) getState()).getComplianceNoticeList();
            boolean zIsEmpty = listM21299b.isEmpty();
            boolean z12 = true;
            if (complianceNoticeList != null && (!complianceNoticeList.isEmpty())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!zIsEmpty) {
                m21015H3(true);
                C45374c c45374cM21293T3 = m21293T3();
                if (c45374cM21293T3 != null && (bGABanner6 = c45374cM21293T3.f102032d) != null) {
                    if (listM21299b.size() == 1) {
                        z12 = false;
                    }
                    bGABanner6.setAutoPlayAble(z12);
                }
                C45374c c45374cM21293T4 = m21293T3();
                if (c45374cM21293T4 != null && (bGABanner5 = c45374cM21293T4.f102032d) != null) {
                    bGABanner5.setData(R$layout.trade_core_view_banner_item, listM21299b, (List<String>) null);
                }
                C45374c c45374cM21293T5 = m21293T3();
                if (c45374cM21293T5 != null && (bGABanner4 = c45374cM21293T5.f102032d) != null) {
                    bGABanner4.startAutoPlay();
                }
                C45374c c45374cM21293T6 = m21293T3();
                if (c45374cM21293T6 != null && (bGABanner3 = c45374cM21293T6.f102032d) != null) {
                    bGABanner3.setVisibility(0);
                }
                C45374c c45374cM21293T7 = m21293T3();
                if (c45374cM21293T7 != null && (complianceNoticeView = c45374cM21293T7.f102031c) != null) {
                    complianceNoticeView.setVisibility(8);
                    return;
                }
                return;
            }
            if (z11) {
                m21015H3(true);
                C45374c c45374cM21293T8 = m21293T3();
                if (c45374cM21293T8 != null && (bGABanner2 = c45374cM21293T8.f102032d) != null) {
                    bGABanner2.stopAutoPlay();
                }
                C45374c c45374cM21293T9 = m21293T3();
                if (c45374cM21293T9 != null && (bGABanner = c45374cM21293T9.f102032d) != null) {
                    bGABanner.setVisibility(8);
                    return;
                }
                return;
            }
            m21015H3(false);
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final void m21295W3() {
        if (isDetached()) {
            return;
        }
        m21294V3();
    }

    /* JADX INFO: renamed from: X3 */
    public final void m21296X3(List<SpotBannerItemEntity> list) {
        ComplianceNoticeView complianceNoticeView;
        ComplianceNoticeView complianceNoticeView2;
        if (isDetached()) {
            return;
        }
        if (list != null && (!list.isEmpty())) {
            C45374c c45374cM21293T3 = m21293T3();
            if (c45374cM21293T3 != null && (complianceNoticeView2 = c45374cM21293T3.f102031c) != null) {
                complianceNoticeView2.setData(list);
            }
        } else {
            C45374c c45374cM21293T4 = m21293T3();
            if (c45374cM21293T4 != null && (complianceNoticeView = c45374cM21293T4.f102031c) != null) {
                ViewExtKt.m66577h(complianceNoticeView);
            }
        }
        m21294V3();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        m21016u3(C41636g.m90881E(C41636g.m90941x(C41636g.m90892P(m21013D3().m22742v(), new C116861(null)), new Function1() { // from class: com.kubi.core.biz.banner.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotBannerFragmentBase.m21287O3((String) obj);
            }
        })), new C116873(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.banner.SpotBannerFragmentBase.bindState.4
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SpotBannerUiState) obj).getBannerNoticeList();
            }
        }, new C116895(null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.banner.SpotBannerFragmentBase.bindState.6
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((SpotBannerUiState) obj).getComplianceNoticeList();
            }
        }, new C116917(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        BGABanner bGABanner;
        BGABanner bGABanner2;
        C45374c c45374cM21293T3 = m21293T3();
        if (c45374cM21293T3 != null && (bGABanner2 = c45374cM21293T3.f102032d) != null) {
            bGABanner2.setUseHackyViews(false);
        }
        C45374c c45374cM21293T4 = m21293T3();
        if (c45374cM21293T4 != null && (bGABanner = c45374cM21293T4.f102032d) != null) {
            bGABanner.setAdapter(new BGABanner.InterfaceC22979b() { // from class: com.kubi.core.biz.banner.n
                @Override // com.kubi.resources.widget.bingoogolapple.bgabanner.BGABanner.InterfaceC22979b
                /* JADX INFO: renamed from: a */
                public final void mo17775a(BGABanner bGABanner3, View view, Object obj, int i11) {
                    SpotBannerFragmentBase.m21290U3(this.f20157a, bGABanner3, view, (SpotDisplayBanner) obj, i11);
                }
            });
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onAgainShow() {
        BannerViewModel bannerViewModelM21011A3;
        super.onAgainShow();
        String symbol = m21013D3().m22740t().getSymbol();
        if (symbol != null && (bannerViewModelM21011A3 = m21011A3()) != null) {
            bannerViewModelM21011A3.m21266F(new SpotBannerContract$Intent.GetNoticeList(symbol));
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onHide() {
        C45374c c45374cM21293T3;
        BGABanner bGABanner;
        if (getView() != null && (c45374cM21293T3 = m21293T3()) != null && (bGABanner = c45374cM21293T3.f102032d) != null) {
            bGABanner.stopAutoPlay();
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        BannerViewModel bannerViewModelM21011A3;
        String symbol = m21013D3().m22740t().getSymbol();
        if (symbol != null && (bannerViewModelM21011A3 = m21011A3()) != null) {
            bannerViewModelM21011A3.m21266F(new SpotBannerContract$Intent.GetNoticeList(symbol));
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static final String m21287O3(String str) {
        return str;
    }
}
