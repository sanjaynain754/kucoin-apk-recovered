package com.kubi.spot.business.delegation.delegateChild;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.kubi.core.biz.menu.more.MoreDialogSectionTab;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.spot.business.BaseTradeFragment;
import com.kubi.spot.helper.DepositTransferDialogHelper;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.extensions.core.ViewExtKt;
import f30.C37330a;
import kotlinx.coroutines.InterfaceC41709m0;
import p830zf.InterfaceC46789b0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import v30.C45375c0;

/* JADX INFO: compiled from: DelegationChildFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.delegation.delegateChild.DelegationChildFragment$showGuideLayout$1", m90122f = "DelegationChildFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nDelegationChildFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationChildFragment.kt\ncom/kubi/spot/business/delegation/delegateChild/DelegationChildFragment$showGuideLayout$1\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,505:1\n17#2,2:506\n*S KotlinDebug\n*F\n+ 1 DelegationChildFragment.kt\ncom/kubi/spot/business/delegation/delegateChild/DelegationChildFragment$showGuideLayout$1\n*L\n362#1:506,2\n*E\n"})
public final class DelegationChildFragment$showGuideLayout$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    final /* synthetic */ CharSequence $quoteBalanceDisplayStr;
    int label;
    final /* synthetic */ DelegationChildFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelegationChildFragment$showGuideLayout$1(DelegationChildFragment delegationChildFragment, CharSequence charSequence, String str, Continuation<? super DelegationChildFragment$showGuideLayout$1> continuation) {
        super(2, continuation);
        this.this$0 = delegationChildFragment;
        this.$quoteBalanceDisplayStr = charSequence;
        this.$currency = str;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m60810g(String str, BaseTradeFragment baseTradeFragment, View view) {
        DepositTransferDialogHelper depositTransferDialogHelper = DepositTransferDialogHelper.f50572a;
        AccountType accountType = AccountType.MAIN;
        AccountType accountType2 = AccountType.TRADE;
        boolean z11 = baseTradeFragment.m60220x5().mo60313v0() == TradeType.LIMIT;
        SymbolInfoEntity symbolInfoEntityMo60189N = baseTradeFragment.mo60189N();
        FragmentManager childFragmentManager = baseTradeFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        depositTransferDialogHelper.m61802d(accountType, accountType2, str, z11, symbolInfoEntityMo60189N, childFragmentManager, (64 & 64) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DelegationChildFragment$showGuideLayout$1(this.this$0, this.$quoteBalanceDisplayStr, this.$currency, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((DelegationChildFragment$showGuideLayout$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m60811h(DelegationChildFragment delegationChildFragment, View view) {
        Fragment parentFragment;
        Fragment parentFragment2 = delegationChildFragment.getParentFragment();
        BaseTradeFragment baseTradeFragment = null;
        if (parentFragment2 != null) {
            parentFragment = parentFragment2.getParentFragment();
        } else {
            parentFragment = null;
        }
        if (parentFragment instanceof BaseTradeFragment) {
            baseTradeFragment = (BaseTradeFragment) parentFragment;
        }
        if (baseTradeFragment != null) {
            baseTradeFragment.m60217v6(MoreDialogSectionTab.b.f20521a);
        }
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Fragment parentFragment;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        boolean zMo103116a;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.this$0.isAdded()) {
                return Unit.INSTANCE;
            }
            Fragment parentFragment2 = this.this$0.getParentFragment();
            final BaseTradeFragment baseTradeFragment = null;
            if (parentFragment2 != null) {
                parentFragment = parentFragment2.getParentFragment();
            } else {
                parentFragment = null;
            }
            if (parentFragment instanceof BaseTradeFragment) {
                baseTradeFragment = (BaseTradeFragment) parentFragment;
            }
            if (baseTradeFragment == null) {
                return Unit.INSTANCE;
            }
            C45375c0 c45375c0M60797f4 = this.this$0.m60797f4();
            if (c45375c0M60797f4 != null && (baseTextView5 = c45375c0M60797f4.f102035c) != null) {
                baseTextView5.setText(this.this$0.getStringRes(R$string.kc_trade_brand_opt_available, this.$quoteBalanceDisplayStr));
            }
            C45375c0 c45375c0M60797f5 = this.this$0.m60797f4();
            if (c45375c0M60797f5 != null && (baseTextView4 = c45375c0M60797f5.f102036d) != null) {
                final String str = this.$currency;
                ViewExtKt.m66575f(baseTextView4, new Function1() { // from class: com.kubi.spot.business.delegation.delegateChild.p
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DelegationChildFragment$showGuideLayout$1.m60810g(str, baseTradeFragment, (View) obj2);
                    }
                });
            }
            C45375c0 c45375c0M60797f6 = this.this$0.m60797f4();
            if (c45375c0M60797f6 != null && (baseTextView3 = c45375c0M60797f6.f102037e) != null) {
                Object objM56186h = Router.f46192a.m56186h(InterfaceC46789b0.class, SiteInfoManager.f47913a.m58109c());
                if (objM56186h != null) {
                    zMo103116a = ((InterfaceC46789b0) objM56186h).mo103116a();
                } else {
                    zMo103116a = false;
                }
                C37330a.m83912d(baseTextView3, zMo103116a);
            }
            C45375c0 c45375c0M60797f7 = this.this$0.m60797f4();
            if (c45375c0M60797f7 != null && (baseTextView2 = c45375c0M60797f7.f102037e) != null) {
                baseTextView2.setText(this.this$0.getString(R$string.kc_trade_brand_opt_spo_tutorial));
            }
            C45375c0 c45375c0M60797f8 = this.this$0.m60797f4();
            if (c45375c0M60797f8 != null && (baseTextView = c45375c0M60797f8.f102037e) != null) {
                final DelegationChildFragment delegationChildFragment = this.this$0;
                ViewExtKt.m66575f(baseTextView, new Function1() { // from class: com.kubi.spot.business.delegation.delegateChild.q
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DelegationChildFragment$showGuideLayout$1.m60811h(delegationChildFragment, (View) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
