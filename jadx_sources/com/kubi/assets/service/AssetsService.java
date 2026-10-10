package com.kubi.assets.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.blankj.utilcode.util.C5267e0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetRemoteConfig;
import com.kubi.assets.AssetRnFragment;
import com.kubi.assets.AssetSyncManager;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.AssetV2Fragment;
import com.kubi.assets.C11351z0;
import com.kubi.assets.IAssetAccountView;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.UIState;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.assets.bill.AccountBillFutureFragment;
import com.kubi.assets.dialog.EditTradeAvgCostBottomSheetHelper;
import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.BlackGroupResponse;
import com.kubi.assets.entity.HoldEarnInfoEntity;
import com.kubi.assets.entity.HomeAssetInfo;
import com.kubi.assets.entity.SmallEntity;
import com.kubi.assets.exception.AssetsException;
import com.kubi.assets.exchange.p075ui.ConvertFragment;
import com.kubi.assets.finance.EarnUrlConfig;
import com.kubi.assets.holdearn.HoldEarnRepo;
import com.kubi.assets.overview.AssetOverviewFragment;
import com.kubi.assets.overview.NewGuideDialogFragment;
import com.kubi.assets.setting.AssetV2SettingFragment;
import com.kubi.assets.view.AccountInfoHeaderView;
import com.kubi.assets.view.AssetViewHelper;
import com.kubi.assets.view.C11273q;
import com.kubi.assets.view.tab.AssetTabSortHelper;
import com.kubi.assets.withdraw.WithdrawSettingFragment;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.CustomOrderEntity;
import com.kubi.data.entity.SubAssetEntity;
import com.kubi.host.HostManager;
import com.kubi.p110rn.api.IReactNativeService;
import com.kubi.p110rn.p111ui.KCBridgeRejecterError;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.C27030d;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.net.URLEncoder;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43846g;
import p830zf.InterfaceC46788b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import sa.C44370a;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.assets.service.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetsService.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0!H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001fH\u0016J\u001a\u0010-\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010%2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020+H\u0016J0\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020+2\u0006\u00103\u001a\u00020\u001f2\b\u00104\u001a\u0004\u0018\u00010\u000b2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000506H\u0016JD\u00107\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u00010\u000b2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0005062\b\u0010;\u001a\u0004\u0018\u00010\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010=\u001a\u00020>H\u0002J\u001a\u0010?\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010%2\u0006\u0010@\u001a\u00020AH\u0016J\b\u0010B\u001a\u00020\u0005H\u0016J\b\u0010C\u001a\u00020DH\u0016J\u0018\u0010E\u001a\u00020D2\b\u0010F\u001a\u0004\u0018\u00010GH\u0096@¢\u0006\u0002\u0010HJ\u001a\u0010I\u001a\u00020\u00052\u0006\u00102\u001a\u00020+2\b\u0010J\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010K\u001a\u00020\u0005H\u0016J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020\u001f0!H\u0016J\u0012\u0010M\u001a\u00020\u00072\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J$\u0010P\u001a\b\u0012\u0004\u0012\u00020\t0Q2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020AH\u0096@¢\u0006\u0002\u0010RJ\b\u0010S\u001a\u00020\u0005H\u0016J\b\u0010T\u001a\u00020\u001fH\u0016J\b\u0010U\u001a\u00020\u000bH\u0016J\u0010\u0010V\u001a\u0004\u0018\u00010WH\u0096@¢\u0006\u0002\u0010XJ\b\u0010Y\u001a\u00020\u001fH\u0016¨\u0006Z"}, m90084d2 = {"Lcom/kubi/assets/service/AssetsService;", "Lcom/kubi/assets/api/IAssetsCenterService;", "<init>", "()V", "jumpToAssetV2SettingPage", "", "botAssetFragment", "Lcom/kubi/sdk/BaseFragment;", "getTotalBalance", "Ljava/math/BigDecimal;", "balanceCurrency", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSpotAvailableBalance", "availableBalance", "getSmallCoinBaseCurrency", "getSmallCoinQuotaLimit", "startCoinDetailDispatcher", FirebaseAnalytics.Param.CURRENCY, "checkWithdrawLimit", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/assets/entity/BlackGroupResponse;", "createAssetFragment", "refreshAssetFragment", "assetFragment", "initAssetData", "getEarnUrl", "getEarnDetailUrl", "getEarnLockupUrl", "getEyeState", "", "hideNumberKey", "Lcom/kubi/utils/storage/StorageId;", "createAccountInfoView", "Lcom/kubi/assets/IAssetAccountView;", "requireContext", "Landroid/content/Context;", "getAssetsPrecision", "", "valuableCurrency", "showDepositGuideDialog", "fm", "Landroidx/fragment/app/FragmentManager;", "force", "goRecordDetail", "context", "accountDetailEntity", "Landroid/os/Parcelable;", "getAvgPriceDialog", "fragmentManager", "modifyEnable", "avgCostPriceTime", "onModify", "Lkotlin/Function0;", "showEditTradeAvgCostBottomSheet", "host", "currentCost", "onSuccess", "trackPageId", "trackBlock", "avgPriceCostContentListener", "Lcom/kubi/resources/dialog/DialogFragmentHelper$InitViewListener;", "jumpToSmallCoinExchangeKcsPage", "type", "Lcom/kubi/data/coin/AccountType;", "refreshAssetsPageTabs", "getCachedAssetInfo", "Lcom/kubi/assets/entity/HomeAssetInfo;", "getAssetInfo", "cacheTime", "", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showPnlDialog", SessionDescription.ATTR_RANGE, "jumpToPnlAnalysis", "assetShowDigitModeStorageId", "getFuturesFundsRecordFragment", "arguments", "Landroid/os/Bundle;", "fetchAccountTotalBalance", "Lkotlinx/coroutines/flow/Flow;", "(Ljava/lang/String;Lcom/kubi/data/coin/AccountType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openWithdrawSetting", "turkeyOpenFeature", "getLineChartRange", "getHoldEarnInfo", "Lcom/kubi/assets/entity/HoldEarnInfoEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isEditAvgCostPriceEnable", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetsService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetsService.kt\ncom/kubi/assets/service/AssetsService\n+ 2 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 7 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,397:1\n44#2,2:398\n135#3,2:400\n135#3,2:402\n49#4:404\n51#4:408\n49#4:409\n51#4:413\n46#5:405\n51#5:407\n46#5:410\n51#5:412\n105#6:406\n105#6:411\n17#7,2:414\n*S KotlinDebug\n*F\n+ 1 AssetsService.kt\ncom/kubi/assets/service/AssetsService\n*L\n177#1:398,2\n194#1:400,2\n210#1:402,2\n362#1:404\n362#1:408\n370#1:409\n370#1:413\n362#1:405\n362#1:407\n370#1:410\n370#1:412\n362#1:406\n370#1:411\n383#1:414,2\n*E\n"})
public final class AssetsService implements IAssetsCenterService {
    /* JADX INFO: renamed from: N */
    public static final Unit m19202N(String str, final boolean z11, final Function0 function0, BaseViewHolder holder, final DialogFragmentHelper helper) {
        String strM66607a;
        Long longOrNull;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        TextView textView = (TextView) holder.getView(R$id.tvContent);
        if (textView != null) {
            C27017c c27017c = C27017c.f54310a;
            int i11 = R$string.unify_cost_price_content_desc;
            if (str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null || (strM66607a = C27030d.m66607a(longOrNull.longValue(), "yyyy-MM-dd")) == null) {
                strM66607a = "";
            }
            textView.setText(c27017c.m66516f(i11, strM66607a));
        }
        View view = holder.getView(R$id.ivClose);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.assets.service.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetsService.m19203O(helper);
            }
        }, 1, null);
        int i12 = R$id.btnModify;
        View view2 = holder.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.assets.service.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetsService.m19204P(z11, function0, helper);
            }
        }, 1, null);
        ((KcSecondaryButton) holder.getView(i12)).setVisibility(z11 ? 0 : 8);
        View view3 = holder.getView(R$id.btnOk);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.assets.service.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetsService.m19205Q(helper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m19204P(boolean z11, Function0 function0, DialogFragmentHelper dialogFragmentHelper) {
        if (z11) {
            function0.invoke();
            dialogFragmentHelper.dismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m19207S(FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        WithdrawSettingFragment.X.open();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static final Unit m19208T(String str, KCBridgeRejecterError kCBridgeRejecterError) {
        return Unit.INSTANCE;
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    @NotNull
    /* JADX INFO: renamed from: A */
    public BaseFragment mo15331A() {
        return AssetRemoteConfig.f18903a.m19574q() ? AssetRnFragment.Companion.newInstance$default(AssetRnFragment.f16321W, null, 1, null) : AssetV2Fragment.f16335Y.newInstance();
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    @NotNull
    /* JADX INFO: renamed from: B */
    public StorageId<Boolean> mo15332B() {
        return C44370a.f98030a.m97869a();
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: C */
    public void mo15333C(@NotNull BaseFragment botAssetFragment) {
        CustomOrderEntity customOrderEntity;
        Context context;
        AssetV2OverviewEntity overviewData;
        AssetV2OverviewEntity overviewData2;
        Intrinsics.checkNotNullParameter(botAssetFragment, "botAssetFragment");
        BaseFragment baseFragment = botAssetFragment;
        while (true) {
            customOrderEntity = null;
            if ((baseFragment != null ? baseFragment.getParentFragment() : null) instanceof AssetV2Fragment) {
                break;
            }
            Fragment parentFragment = baseFragment != null ? baseFragment.getParentFragment() : null;
            baseFragment = parentFragment instanceof BaseFragment ? (BaseFragment) parentFragment : null;
        }
        Fragment parentFragment2 = baseFragment.getParentFragment();
        AssetV2Fragment assetV2Fragment = parentFragment2 instanceof AssetV2Fragment ? (AssetV2Fragment) parentFragment2 : null;
        UIState uIStateM15192u3 = assetV2Fragment != null ? assetV2Fragment.m15192u3() : null;
        SubAssetEntity subAsset = (uIStateM15192u3 == null || (overviewData2 = uIStateM15192u3.getOverviewData()) == null) ? null : overviewData2.getSubAsset();
        if (uIStateM15192u3 != null && (overviewData = uIStateM15192u3.getOverviewData()) != null) {
            customOrderEntity = overviewData.getCustomOrderEntity();
        }
        if (subAsset == null || (context = botAssetFragment.getContext()) == null) {
            return;
        }
        Intent intentM56572k0 = BaseFragmentActivity.m56572k0(context, botAssetFragment.getString(R$string.assets_setting), AssetV2SettingFragment.class.getName(), new C27051h().m66721e("sub_asset_entity", subAsset).m66721e("custom_order_entity", customOrderEntity).m66717a());
        Intrinsics.checkNotNullExpressionValue(intentM56572k0, "buildIntent(...)");
        botAssetFragment.startActivityWithResult(intentM56572k0, new Consumer() { // from class: com.kubi.assets.service.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AssetsService.m19206R((Intent) obj);
            }
        });
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: D */
    public boolean mo15334D() {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46788b.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h != null) {
            return ((InterfaceC46788b) objM56186h).m103115a();
        }
        return true;
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: E */
    public boolean mo15335E() {
        return C24129b.m58030b(SiteVisibleConfigKey.AverageCostPriceEditEnable);
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    @Nullable
    /* JADX INFO: renamed from: a */
    public BigDecimal mo15336a() {
        SmallEntity smallEntityM19164h = AssetsHelper.f18684a.m19164h();
        if (smallEntityM19164h != null) {
            return smallEntityM19164h.getQuotaLimit();
        }
        return null;
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo15337b(@Nullable Long l11, @NotNull Continuation<? super HomeAssetInfo> continuation) {
        return AssetSyncManager.f16327a.m15155d(l11, continuation);
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: c */
    public void mo15338c(@Nullable Context context, @NotNull Parcelable accountDetailEntity) {
        Intrinsics.checkNotNullParameter(accountDetailEntity, "accountDetailEntity");
        AssetsHelper.f18684a.m19168l(context, accountDetailEntity);
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    @Nullable
    /* JADX INFO: renamed from: d */
    public String mo15339d() {
        SmallEntity smallEntityM19164h = AssetsHelper.f18684a.m19164h();
        if (smallEntityM19164h != null) {
            return smallEntityM19164h.getBaseCurrency();
        }
        return null;
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: e */
    public void mo15340e(@NotNull FragmentManager fragmentManager, boolean z11, @Nullable final String str, @NotNull final Function0<Unit> onModify) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(onModify, "onModify");
        final boolean z12 = z11 && mo15335E();
        DialogFragmentHelper.f43568p0.newInstance(R$layout.asset_dialog_avg_cost_intro_bottom_sheet, true).m54237f4(new Function2() { // from class: com.kubi.assets.service.i
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AssetsService.m19202N(str, z12, onModify, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fragmentManager, "showAvgPriceDialogWithModify");
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: f */
    public void mo15341f(@NotNull FragmentManager fm2, boolean z11) {
        Intrinsics.checkNotNullParameter(fm2, "fm");
        if (!C46392a.m102322d(C42153h.f93593a.m92520j(), false) || z11) {
            new NewGuideDialogFragment().show(fm2, "show_new_guide");
        }
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    @NotNull
    /* JADX INFO: renamed from: h */
    public BaseFragment mo15343h(@Nullable Bundle bundle) {
        AccountBillFutureFragment.Companion companion = AccountBillFutureFragment.f16648a0;
        if (bundle == null) {
            bundle = BundleKt.bundleOf();
        }
        return companion.create("CONTRACT", null, bundle);
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: j */
    public void mo15344j(@NotNull BaseFragment assetFragment) {
        Intrinsics.checkNotNullParameter(assetFragment, "assetFragment");
        if (assetFragment instanceof AssetRnFragment) {
            ((AssetRnFragment) assetFragment).m15143B0();
        } else if (assetFragment instanceof AssetV2Fragment) {
            ((AssetV2Fragment) assetFragment).m15189B0();
        }
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: l */
    public void mo15346l() {
        C42899b.m94073c(new Function1() { // from class: com.kubi.assets.service.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetsService.m19207S((FragmentActivity) obj);
            }
        });
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    @NotNull
    /* JADX INFO: renamed from: m */
    public String mo15347m() {
        String lineChartRange = AssetOverviewFragment.f18179i0.getLineChartRange();
        return lineChartRange == null ? "LAST_1_DAY" : lineChartRange;
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: q */
    public void mo15351q() {
        AssetTabSortHelper.f19161a.m20073p();
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: r */
    public void mo15352r(@NotNull BaseFragment host, @NotNull String currency, @Nullable String str, @NotNull Function0<Unit> onSuccess, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        if (mo15335E()) {
            EditTradeAvgCostBottomSheetHelper.f16934a.m16017m(host, currency, str, onSuccess);
        }
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    @Nullable
    /* JADX INFO: renamed from: s */
    public Object mo15353s(@NotNull Continuation<? super HoldEarnInfoEntity> continuation) {
        return HoldEarnRepo.f17741a.m17383d(continuation);
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    @NotNull
    /* JADX INFO: renamed from: t */
    public StorageId<Boolean> mo15354t() {
        return C42153h.f93593a.m92500D();
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: u */
    public void mo15355u() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            AssetsHelper assetsHelper = AssetsHelper.f18684a;
            assetsHelper.m19165i();
            assetsHelper.m19166j();
            assetsHelper.m19163g();
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new AssetsException(thM103847exceptionOrNullimpl, "initAssetData", false, null, 8, null), null, 2, null);
        }
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: v */
    public void mo15356v(@NotNull FragmentManager fragmentManager, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        if (str == null) {
            str = mo15347m();
        }
        int iM6182d = (int) (C5267e0.m6182d() * 0.8f);
        if (!AssetRemoteConfig.f18903a.m19571n()) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kc_asset_pnl_today_title).m54148E4(R$layout.dialog_profit_analysis_content, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.assets.service.g
                @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
                /* JADX INFO: renamed from: b3 */
                public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                    AssetsService.m19209U(baseViewHolder, dialogFragmentHelper);
                }
            }).m54162S4(R$string.i_already_know, null).m54172c5(fragmentManager);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C11351z0.m20187b());
        sb2.append("&view_height=");
        sb2.append(iM6182d);
        sb2.append("&route=");
        sb2.append(URLEncoder.encode("PnlDetailPage?range=" + str, "UTF-8"));
        IReactNativeService.openRnDialog$default(IReactNativeService.INSTANCE.get(), sb2.toString(), null, new Function2() { // from class: com.kubi.assets.service.f
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AssetsService.m19208T((String) obj, (KCBridgeRejecterError) obj2);
            }
        }, 2, null).show(fragmentManager, "pnl_detail_dialog");
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    @NotNull
    /* JADX INFO: renamed from: w */
    public HomeAssetInfo mo15357w() {
        return AssetSyncManager.f16327a.m15157f();
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    @NotNull
    /* JADX INFO: renamed from: x */
    public String mo15358x() {
        return EarnUrlConfig.f17409a.m16754d();
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: y */
    public boolean mo15359y() {
        return C46392a.m102322d(C42153h.f93593a.m92500D(), false);
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    @NotNull
    /* JADX INFO: renamed from: z */
    public IAssetAccountView mo15360z(@NotNull Context requireContext) {
        Intrinsics.checkNotNullParameter(requireContext, "requireContext");
        return new AccountInfoHeaderView(requireContext, null, 2, null);
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m19203O(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m19205Q(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final void m19209U(BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        viewHolder.setText(R$id.tv_two, DowngradeExKt.m66552v(C27017c.f54310a.m66516f(R$string.kc_asset_pnl_desc2, new Object[0]), AssetViewHelper.f19192a.m20179b()));
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    @NotNull
    /* JADX INFO: renamed from: g */
    public Observable<BaseEntity<BlackGroupResponse>> mo15342g() {
        return ((AssetV2Api) C42597a.m93386b().create(AssetV2Api.class)).m17131g();
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: k */
    public void mo15345k() {
        if (C11351z0.m20196k()) {
            Router.f46192a.m56184f(C11351z0.m20186a() + C11351z0.m20188c()).m4048k();
            return;
        }
        Router.f46192a.m56184f(HostManager.a.m() + "/assets/analysis?&needLogin=true&loading=2&appNeedLang=true").m4048k();
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: n */
    public void mo15348n(@Nullable Context context, @NotNull AccountType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (context != null) {
            BaseActivity.INSTANCE.launch(context, ConvertFragment.class, new C27051h().m66724h("title", context.getString(R$string.small_asset_exchange)).m66724h("page", type.name()).m66717a());
        }
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    /* JADX INFO: renamed from: o */
    public int mo15349o(@Nullable String str) {
        return C11273q.m20046b(str);
    }

    @Override // com.kubi.assets.api.IAssetsCenterService
    @Nullable
    /* JADX INFO: renamed from: p */
    public Object mo15350p(@NotNull String str, @NotNull Continuation<? super BigDecimal> continuation) {
        return AssetExKt.m15124l(str, continuation);
    }

    /* JADX INFO: renamed from: R */
    public static final void m19206R(Intent intent) {
    }
}
