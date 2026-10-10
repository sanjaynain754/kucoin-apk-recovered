package com.kubi.core.biz.menu;

import af.C0296a;
import android.os.Bundle;
import android.view.View;
import com.kubi.core.spot.entity.SpotInformationEntity;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import gf.C37890n;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import v30.C45392l;
import w00.C45681e;

/* JADX INFO: compiled from: SpotInformationFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0014J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\"\u0010\u001c\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020\u001e0\u001d8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m90084d2 = {"Lcom/kubi/core/biz/menu/SpotInformationFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/core/biz/menu/SpotInformationContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/tradecorebiz/databinding/BspotFragmentTransferInformationBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/BspotFragmentTransferInformationBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "symbolInfo$delegate", "Lkotlin/Lazy;", "getLayout", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", "bindState", "showHidden", TIMPushProvider.f75062n, "", "it", "Lcom/kubi/core/spot/entity/SpotInformationEntity;", "showIceberg", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotInformationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotInformationFragment.kt\ncom/kubi/core/biz/menu/SpotInformationFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,96:1\n147#2,16:97\n*S KotlinDebug\n*F\n+ 1 SpotInformationFragment.kt\ncom/kubi/core/biz/menu/SpotInformationFragment\n*L\n26#1:97,16\n*E\n"})
public final class SpotInformationFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f20495W = {Reflection.property1(new PropertyReference1Impl(SpotInformationFragment.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/BspotFragmentTransferInformationBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f20496U = C45681e.m100799e(this, new Function1<SpotInformationFragment, C45392l>() { // from class: com.kubi.core.biz.menu.SpotInformationFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45392l invoke(@NotNull SpotInformationFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45392l.m100318a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45392l, Unit>() { // from class: com.kubi.core.biz.menu.SpotInformationFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45392l it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45392l c45392l) {
            invoke(c45392l);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f20497V = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.menu.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SpotInformationFragment.m21958v3(this.f20499b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.core.biz.menu.SpotInformationFragment$bindState$2 */
    /* JADX INFO: compiled from: SpotInformationFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/spot/entity/SpotInformationEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.menu.SpotInformationFragment$bindState$2", m90122f = "SpotInformationFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119642 extends SuspendLambda implements Function2<SpotInformationEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(SpotInformationEntity spotInformationEntity, Continuation<? super Unit> continuation) {
            return ((C119642) create(spotInformationEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public C119642(Continuation<? super C119642> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C119642 c119642 = SpotInformationFragment.this.new C119642(continuation);
            c119642.L$0 = obj;
            return c119642;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Boolean hiddenEnableShow;
            Boolean icebergEnableShow;
            String restrictedCountry;
            SpotInformationEntity spotInformationEntity = (SpotInformationEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C45392l c45392lM21959r3 = SpotInformationFragment.this.m21959r3();
            if (c45392lM21959r3 != null) {
                SpotInformationFragment spotInformationFragment = SpotInformationFragment.this;
                c45392lM21959r3.f102186f.setText(spotInformationEntity != null ? spotInformationEntity.getRestrictedCountry() : null);
                boolean z11 = false;
                if (spotInformationEntity != null && (restrictedCountry = spotInformationEntity.getRestrictedCountry()) != null && restrictedCountry.length() > 0) {
                    z11 = true;
                }
                BaseTextView tvLimitCountryContent = c45392lM21959r3.f102186f;
                Intrinsics.checkNotNullExpressionValue(tvLimitCountryContent, "tvLimitCountryContent");
                C0296a.m1042d(tvLimitCountryContent, z11);
                BaseTextView tvLimitCountryTitle = c45392lM21959r3.f102187g;
                Intrinsics.checkNotNullExpressionValue(tvLimitCountryTitle, "tvLimitCountryTitle");
                C0296a.m1042d(tvLimitCountryTitle, z11);
                View viewDivider = c45392lM21959r3.f102198r;
                Intrinsics.checkNotNullExpressionValue(viewDivider, "viewDivider");
                C0296a.m1042d(viewDivider, z11);
                BaseTextView baseTextView = c45392lM21959r3.f102196p;
                SymbolInfoEntity symbolInfoEntityM21957s3 = spotInformationFragment.m21957s3();
                baseTextView.setText(C27041f.m66669i(symbolInfoEntityM21957s3 != null ? symbolInfoEntityM21957s3.getShowSymbol() : null, "--"));
                BaseTextView baseTextView2 = c45392lM21959r3.f102192l;
                BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(spotInformationEntity != null ? spotInformationEntity.getPriceIncrement() : null);
                baseTextView2.setText(C27041f.m66669i(bigDecimalM66536f != null ? C42180b.m92640e(bigDecimalM66536f, null, 30, false, false, false, 0, null, 125, null) : null, "--"));
                BaseTextView baseTextView3 = c45392lM21959r3.f102190j;
                BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(spotInformationEntity != null ? spotInformationEntity.getQuoteIncrement() : null);
                baseTextView3.setText(C27041f.m66669i(bigDecimalM66536f2 != null ? C42180b.m92640e(bigDecimalM66536f2, null, 30, false, false, false, 0, null, 125, null) : null, "--"));
                BaseTextView baseTextView4 = c45392lM21959r3.f102188h;
                StringBuilder sb2 = new StringBuilder();
                BigDecimal bigDecimalM66536f3 = DowngradeExKt.m66536f(spotInformationEntity != null ? spotInformationEntity.getBaseMinSize() : null);
                sb2.append(C27041f.m66669i(bigDecimalM66536f3 != null ? C42180b.m92640e(bigDecimalM66536f3, null, 30, false, false, false, 0, null, 125, null) : null, "--"));
                sb2.append(' ');
                SymbolInfoEntity symbolInfoEntityM21957s4 = spotInformationFragment.m21957s3();
                sb2.append(C27041f.m66668h(symbolInfoEntityM21957s4 != null ? symbolInfoEntityM21957s4.getBaseCurrencyName() : null));
                baseTextView4.setText(sb2.toString());
                C37890n c37890n = C37890n.f85269a;
                SymbolInfoEntity symbolInfoEntityM21957s5 = spotInformationFragment.m21957s3();
                CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(C27041f.m66668h(symbolInfoEntityM21957s5 != null ? symbolInfoEntityM21957s5.getQuoteCurrency() : null));
                BaseTextView baseTextView5 = c45392lM21959r3.f102194n;
                StringBuilder sb3 = new StringBuilder();
                BigDecimal bigDecimalM66536f4 = DowngradeExKt.m66536f(spotInformationEntity != null ? spotInformationEntity.getMinimalFunds() : null);
                sb3.append(C27041f.m66669i(bigDecimalM66536f4 != null ? C42180b.m92640e(bigDecimalM66536f4, null, 30, false, false, false, 0, null, 125, null) : null, "--"));
                sb3.append(' ');
                String currency = coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null;
                SymbolInfoEntity symbolInfoEntityM21957s6 = spotInformationFragment.m21957s3();
                sb3.append(C27041f.m66669i(currency, C27041f.m66668h(symbolInfoEntityM21957s6 != null ? symbolInfoEntityM21957s6.getQuoteCurrency() : null)));
                baseTextView5.setText(sb3.toString());
            }
            if (spotInformationEntity != null && (icebergEnableShow = spotInformationEntity.getIcebergEnableShow()) != null) {
                SpotInformationFragment.this.m21961u3(icebergEnableShow.booleanValue(), spotInformationEntity);
            }
            if (spotInformationEntity != null && (hiddenEnableShow = spotInformationEntity.getHiddenEnableShow()) != null) {
                SpotInformationFragment.this.m21960t3(hiddenEnableShow.booleanValue(), spotInformationEntity);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s3 */
    public final SymbolInfoEntity m21957s3() {
        return (SymbolInfoEntity) this.f20497V.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bspot_fragment_transfer_information;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(SpotInformationVM.class);
    }

    /* JADX INFO: renamed from: r3 */
    public final C45392l m21959r3() {
        return (C45392l) this.f20496U.getValue(this, f20495W[0]);
    }

    /* JADX INFO: renamed from: v3 */
    public static final SymbolInfoEntity m21958v3(SpotInformationFragment spotInformationFragment) {
        Bundle arguments = spotInformationFragment.getArguments();
        if (arguments != null) {
            return (SymbolInfoEntity) arguments.getParcelable("data");
        }
        return null;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.core.biz.menu.SpotInformationFragment.bindState.1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getSpotInformation();
            }
        }, new C119642(null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() {
        String code;
        super.onShow();
        SymbolInfoEntity symbolInfoEntityM21957s3 = m21957s3();
        if (symbolInfoEntityM21957s3 != null) {
            code = symbolInfoEntityM21957s3.getCode();
        } else {
            code = null;
        }
        sendIntent(new SpotInformationContract$UiIntent.FetchSpotInformation(code));
    }

    /* JADX INFO: renamed from: t3 */
    public final void m21960t3(boolean z11, SpotInformationEntity spotInformationEntity) {
        BaseTextView baseTextView;
        String string;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        C45392l c45392lM21959r3 = m21959r3();
        if (c45392lM21959r3 != null && (baseTextView3 = c45392lM21959r3.f102183c) != null) {
            C0296a.m1042d(baseTextView3, z11);
        }
        C45392l c45392lM21959r4 = m21959r3();
        if (c45392lM21959r4 != null && (baseTextView2 = c45392lM21959r4.f102182b) != null) {
            C0296a.m1042d(baseTextView2, z11);
        }
        C45392l c45392lM21959r5 = m21959r3();
        if (c45392lM21959r5 != null && (baseTextView = c45392lM21959r5.f102182b) != null) {
            if (Intrinsics.areEqual(spotInformationEntity.getHiddenEnable(), Boolean.TRUE)) {
                string = getString(R$string.kc_symbol_enable_title);
            } else {
                string = getString(R$string.kc_symbol_disable_title);
            }
            baseTextView.setText(string);
        }
    }

    /* JADX INFO: renamed from: u3 */
    public final void m21961u3(boolean z11, SpotInformationEntity spotInformationEntity) {
        BaseTextView baseTextView;
        String string;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        C45392l c45392lM21959r3 = m21959r3();
        if (c45392lM21959r3 != null && (baseTextView3 = c45392lM21959r3.f102185e) != null) {
            C0296a.m1042d(baseTextView3, z11);
        }
        C45392l c45392lM21959r4 = m21959r3();
        if (c45392lM21959r4 != null && (baseTextView2 = c45392lM21959r4.f102184d) != null) {
            C0296a.m1042d(baseTextView2, z11);
        }
        C45392l c45392lM21959r5 = m21959r3();
        if (c45392lM21959r5 != null && (baseTextView = c45392lM21959r5.f102184d) != null) {
            if (Intrinsics.areEqual(spotInformationEntity.getIcebergEnable(), Boolean.TRUE)) {
                string = getString(R$string.kc_symbol_enable_title);
            } else {
                string = getString(R$string.kc_symbol_disable_title);
            }
            baseTextView.setText(string);
        }
    }
}
