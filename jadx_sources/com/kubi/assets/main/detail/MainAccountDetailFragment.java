package com.kubi.assets.main.detail;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$id;
import com.kubi.assets.R$string;
import com.kubi.assets.detail.AccountDetailHeaderView;
import com.kubi.assets.detail.BaseAccountDetailFragment;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.assets.entity.AssetSingleCurrencyBalance;
import com.kubi.assets.entity.B2CLoanEntity;
import com.kubi.assets.filter.ParcelizePair;
import com.kubi.assets.finance.EarnUrlConfig;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.data.coin.TransferJumper;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.mvi.common.MviExKt;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.redpackage.api.IRedPackageService;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.flutter.C23767n;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.C24128a;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37758j;
import g00.InterfaceC37766r;
import gf.C37885i;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p026ay.C4400a;
import p311hf.C38184b;
import p402kf.C41014a;
import p429lf.C42179a;
import p569qq.C43841b;
import p569qq.C43852m;
import p637ta.C44828n5;
import p830zf.InterfaceC46805j0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: MainAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0014J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0002H\u0014J\u001a\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001bH\u0016J\u0014\u0010%\u001a\u00020\u001b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0002J\b\u0010(\u001a\u00020\u001bH\u0016J\b\u0010)\u001a\u00020\u001bH\u0002J\u001c\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0080@¢\u0006\u0004\b.\u0010/J\u001c\u00100\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0080@¢\u0006\u0004\b1\u0010/R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, m90084d2 = {"Lcom/kubi/assets/main/detail/MainAccountDetailFragment;", "Lcom/kubi/assets/detail/BaseAccountDetailFragment;", "Lcom/kubi/assets/entity/AccountDetailEntity;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", "getBinding", "()Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getAccountType", "", "coinJson", "Lorg/json/JSONObject;", "kotlin.jvm.PlatformType", "getCoinJson", "()Lorg/json/JSONObject;", "coinJson$delegate", "Lkotlin/Lazy;", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "", "pageSize", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "lazyLoad", "initHeaderInfo", "balance", "Lcom/kubi/assets/entity/AssetSingleCurrencyBalance;", "onFilterClick", "initAsnycAssetsHeaderItems", "asyncGetConvertItem", "Lcom/kubi/assets/detail/BaseAccountDetailFragment$AssetHeaderFunction;", "coinInfoEntity", "Lcom/kubi/data/entity/CoinInfoEntity;", "asyncGetConvertItem$AssetsCenterLib_googleRelease", "(Lcom/kubi/data/entity/CoinInfoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asyncGetB2CItem", "asyncGetB2CItem$AssetsCenterLib_googleRelease", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMainAccountDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainAccountDetailFragment.kt\ncom/kubi/assets/main/detail/MainAccountDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,429:1\n147#2,16:430\n47#3,4:446\n774#4:450\n865#4,2:451\n1869#4,2:453\n774#4:457\n865#4,2:458\n17#5,2:455\n*S KotlinDebug\n*F\n+ 1 MainAccountDetailFragment.kt\ncom/kubi/assets/main/detail/MainAccountDetailFragment\n*L\n72#1:430,16\n426#1:446,4\n97#1:450\n97#1:451,2\n97#1:453,2\n386#1:457\n386#1:458,2\n156#1:455,2\n*E\n"})
public final class MainAccountDetailFragment extends BaseAccountDetailFragment<AccountDetailEntity> {

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final InterfaceC24293a f17928h0 = C45681e.m100799e(this, new Function1<MainAccountDetailFragment, C44828n5>() { // from class: com.kubi.assets.main.detail.MainAccountDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44828n5 invoke(@NotNull MainAccountDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44828n5.m99182a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44828n5, Unit>() { // from class: com.kubi.assets.main.detail.MainAccountDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44828n5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44828n5 c44828n5) {
            invoke(c44828n5);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f17929i0;

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final CoroutineExceptionHandler f17930j0;

    /* JADX INFO: renamed from: l0 */
    public static final /* synthetic */ KProperty<Object>[] f17927l0 = {Reflection.property1(new PropertyReference1Impl(MainAccountDetailFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/LayoutBaseAccountDetailBinding;", 0))};

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public static final Companion f17926k0 = new Companion(null);

    /* JADX INFO: compiled from: MainAccountDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/main/detail/MainAccountDetailFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.main.detail.MainAccountDetailFragment$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 MainAccountDetailFragment.kt\ncom/kubi/assets/main/detail/MainAccountDetailFragment\n*L\n1#1,49:1\n427#2,2:50\n*E\n"})
    public static final class C10324a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MainAccountDetailFragment f17931b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10324a(CoroutineExceptionHandler.Companion companion, MainAccountDetailFragment mainAccountDetailFragment) {
            super(companion);
            this.f17931b = mainAccountDetailFragment;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97263g(this.f17931b.getTAG(), exception);
        }
    }

    /* JADX INFO: renamed from: g5 */
    public static final void m17749g5(MainAccountDetailFragment mainAccountDetailFragment, String str) {
        C43852m.m96589a("B1mainAccountDetail", "assets", "5", mainAccountDetailFragment.m17769k5());
        AssetsHelper.f18684a.m19149A(str, C38184b.f85884a.m86146a(), false);
    }

    /* JADX INFO: renamed from: j5 */
    public static final JSONObject m17751j5(MainAccountDetailFragment mainAccountDetailFragment) {
        JSONObject jSONObject = new JSONObject();
        CoinInfoEntity coinInfoEntityM15914h4 = mainAccountDetailFragment.m15914h4();
        String code = coinInfoEntityM15914h4 != null ? coinInfoEntityM15914h4.getCode() : null;
        if (code == null) {
            code = "";
        }
        return jSONObject.put("coin", code);
    }

    /* JADX INFO: renamed from: n5 */
    public static /* synthetic */ void m17752n5(MainAccountDetailFragment mainAccountDetailFragment, AssetSingleCurrencyBalance assetSingleCurrencyBalance, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            assetSingleCurrencyBalance = null;
        }
        mainAccountDetailFragment.m17771m5(assetSingleCurrencyBalance);
    }

    /* JADX INFO: renamed from: q5 */
    public static final Unit m17755q5(MainAccountDetailFragment mainAccountDetailFragment, Throwable th2) {
        new C24223c1(mainAccountDetailFragment);
        C43841b.m96555b("b1overview_asset_detail_load", null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r9 == r1) goto L31;
     */
    @Nullable
    /* JADX INFO: renamed from: d5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m17765d5(@Nullable CoinInfoEntity coinInfoEntity, @NotNull Continuation<? super BaseAccountDetailFragment.AssetHeaderFunction> continuation) {
        MainAccountDetailFragment$asyncGetB2CItem$1 mainAccountDetailFragment$asyncGetB2CItem$1;
        String currency;
        if (continuation instanceof MainAccountDetailFragment$asyncGetB2CItem$1) {
            mainAccountDetailFragment$asyncGetB2CItem$1 = (MainAccountDetailFragment$asyncGetB2CItem$1) continuation;
            int i11 = mainAccountDetailFragment$asyncGetB2CItem$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mainAccountDetailFragment$asyncGetB2CItem$1.label = i11 - Integer.MIN_VALUE;
            } else {
                mainAccountDetailFragment$asyncGetB2CItem$1 = new MainAccountDetailFragment$asyncGetB2CItem$1(this, continuation);
            }
        } else {
            mainAccountDetailFragment$asyncGetB2CItem$1 = new MainAccountDetailFragment$asyncGetB2CItem$1(this, continuation);
        }
        Object objM19162f = mainAccountDetailFragment$asyncGetB2CItem$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = mainAccountDetailFragment$asyncGetB2CItem$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM19162f);
            if (!C24129b.m58030b(SiteVisibleConfigKey.LEND)) {
                return null;
            }
            currency = coinInfoEntity != null ? coinInfoEntity.getCurrency() : null;
            if (currency == null || StringsKt.isBlank(currency)) {
                return null;
            }
            AssetsHelper assetsHelper = AssetsHelper.f18684a;
            mainAccountDetailFragment$asyncGetB2CItem$1.L$0 = coinInfoEntity;
            mainAccountDetailFragment$asyncGetB2CItem$1.L$1 = SpillingKt.nullOutSpilledVariable(currency);
            mainAccountDetailFragment$asyncGetB2CItem$1.label = 1;
            if (AssetsHelper.m19143e(assetsHelper, null, mainAccountDetailFragment$asyncGetB2CItem$1, 1, null) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            String str = (String) mainAccountDetailFragment$asyncGetB2CItem$1.L$1;
            CoinInfoEntity coinInfoEntity2 = (CoinInfoEntity) mainAccountDetailFragment$asyncGetB2CItem$1.L$0;
            ResultKt.throwOnFailure(objM19162f);
            currency = str;
            coinInfoEntity = coinInfoEntity2;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coinInfoEntity = (CoinInfoEntity) mainAccountDetailFragment$asyncGetB2CItem$1.L$0;
            ResultKt.throwOnFailure(objM19162f);
        }
        List list = (List) objM19162f;
        if (list.isEmpty()) {
            return null;
        }
        final ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String currency2 = ((B2CLoanEntity) obj).getCurrency();
            String code = coinInfoEntity.getCode();
            if (code == null) {
                code = "";
            }
            if (Intrinsics.areEqual(currency2, code)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C43852m.m96593e("B1mainAccountDetail", "assets", "2", m17769k5());
        int i13 = R$drawable.ic2_buy_crypto2_20;
        String string = getString(R$string.assets_earns_interest);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new BaseAccountDetailFragment.AssetHeaderFunction(i13, string, new Action() { // from class: com.kubi.assets.main.detail.h
            @Override // io.reactivex.functions.Action
            public final void run() {
                MainAccountDetailFragment.m17748e5(this.f17941b, arrayList);
            }
        });
        AssetsHelper assetsHelper2 = AssetsHelper.f18684a;
        mainAccountDetailFragment$asyncGetB2CItem$1.L$0 = coinInfoEntity;
        mainAccountDetailFragment$asyncGetB2CItem$1.L$1 = SpillingKt.nullOutSpilledVariable(currency);
        mainAccountDetailFragment$asyncGetB2CItem$1.label = 2;
        objM19162f = assetsHelper2.m19162f(mainAccountDetailFragment$asyncGetB2CItem$1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: f5 */
    public final Object m17766f5(@Nullable CoinInfoEntity coinInfoEntity, @NotNull Continuation<? super BaseAccountDetailFragment.AssetHeaderFunction> continuation) {
        MainAccountDetailFragment$asyncGetConvertItem$1 mainAccountDetailFragment$asyncGetConvertItem$1;
        final String str;
        if (continuation instanceof MainAccountDetailFragment$asyncGetConvertItem$1) {
            mainAccountDetailFragment$asyncGetConvertItem$1 = (MainAccountDetailFragment$asyncGetConvertItem$1) continuation;
            int i11 = mainAccountDetailFragment$asyncGetConvertItem$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mainAccountDetailFragment$asyncGetConvertItem$1.label = i11 - Integer.MIN_VALUE;
            } else {
                mainAccountDetailFragment$asyncGetConvertItem$1 = new MainAccountDetailFragment$asyncGetConvertItem$1(this, continuation);
            }
        } else {
            mainAccountDetailFragment$asyncGetConvertItem$1 = new MainAccountDetailFragment$asyncGetConvertItem$1(this, continuation);
        }
        Object obj = mainAccountDetailFragment$asyncGetConvertItem$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = mainAccountDetailFragment$asyncGetConvertItem$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!C24129b.m58030b(SiteVisibleConfigKey.Convert)) {
                return null;
            }
            String code = coinInfoEntity != null ? coinInfoEntity.getCode() : null;
            if (code != null && !StringsKt.isBlank(code)) {
                AssetV2Api assetV2ApiM15912d4 = m15912d4();
                mainAccountDetailFragment$asyncGetConvertItem$1.L$0 = SpillingKt.nullOutSpilledVariable(coinInfoEntity);
                mainAccountDetailFragment$asyncGetConvertItem$1.L$1 = code;
                mainAccountDetailFragment$asyncGetConvertItem$1.label = 1;
                Object objM17078D0 = assetV2ApiM15912d4.m17078D0(code, mainAccountDetailFragment$asyncGetConvertItem$1);
                if (objM17078D0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                String str2 = code;
                obj = objM17078D0;
                str = str2;
            }
            return null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) mainAccountDetailFragment$asyncGetConvertItem$1.L$1;
        ResultKt.throwOnFailure(obj);
        BaseEntity baseEntity = (BaseEntity) obj;
        boolean success = baseEntity.getSuccess();
        Object data = baseEntity.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        if (((Boolean) data).booleanValue() & success) {
            C43852m.m96593e("B1mainAccountDetail", "assets", "5", m17769k5());
            int i13 = R$drawable.ic2_convert_20;
            String string = getString(R$string.coin_convert);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return new BaseAccountDetailFragment.AssetHeaderFunction(i13, string, new Action() { // from class: com.kubi.assets.main.detail.g
                @Override // io.reactivex.functions.Action
                public final void run() {
                    MainAccountDetailFragment.m17749g5(this.f17939b, str);
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: g4 */
    public final C44828n5 m17767g4() {
        return (C44828n5) this.f17928h0.getValue(this, f17927l0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: h5, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull final AccountDetailEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tv_amount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(item.getDirectionSymbol());
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(item.getAmount()));
        CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
        sb2.append(C37885i.m85563b(bigDecimal, coinInfoEntityM15914h4 != null ? coinInfoEntityM15914h4.getCode() : null, 0, 2, null));
        helper.setText(i11, sb2.toString()).setTextColor(i11, item.getDirectionColor(this.mContext));
        helper.setText(R$id.tv_type, item.getBizTypeNameString());
        helper.setText(R$id.tv_time, C42179a.m92633f(item.getTradeDate(), null, true, true, null, 9, null));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.main.detail.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainAccountDetailFragment.m17750i5(this.f17937b, item);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: k5 */
    public final JSONObject m17769k5() {
        return (JSONObject) this.f17929i0.getValue();
    }

    /* JADX INFO: renamed from: m5 */
    public final void m17771m5(AssetSingleCurrencyBalance assetSingleCurrencyBalance) {
        BigDecimal holdBalance;
        BigDecimal holdBalance2;
        BigDecimal availableBalance;
        BigDecimal availableBalance2;
        AccountDetailHeaderView accountDetailHeaderView;
        BigDecimal totalBalance;
        BigDecimal totalBalance2;
        C44828n5 c44828n5M17767g4 = m17767g4();
        String strM89950x = null;
        if (c44828n5M17767g4 != null && (accountDetailHeaderView = c44828n5M17767g4.f100515e) != null) {
            accountDetailHeaderView.m15863c(C27041f.m66669i((assetSingleCurrencyBalance == null || (totalBalance2 = assetSingleCurrencyBalance.getTotalBalance()) == null) ? null : C37885i.m85563b(totalBalance2, assetSingleCurrencyBalance.getCurrency(), 0, 2, null), "- -"), C27041f.m66669i((assetSingleCurrencyBalance == null || (totalBalance = assetSingleCurrencyBalance.getTotalBalance()) == null) ? null : C41014a.m89950x(C41014a.m89940n(totalBalance, assetSingleCurrencyBalance.getCurrency()), null, null, 0, false, false, false, false, 127, null), "- -"));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(getString(R$string.useful), C27041f.m66669i((assetSingleCurrencyBalance == null || (availableBalance2 = assetSingleCurrencyBalance.getAvailableBalance()) == null) ? null : C37885i.m85563b(availableBalance2, assetSingleCurrencyBalance.getCurrency(), 0, 2, null), "- -"), C27041f.m66669i((assetSingleCurrencyBalance == null || (availableBalance = assetSingleCurrencyBalance.getAvailableBalance()) == null) ? null : C41014a.m89950x(C41014a.m89940n(availableBalance, assetSingleCurrencyBalance.getCurrency()), null, null, 0, false, false, false, false, 127, null), "- -"), false, null, null, null, null, 248, null));
        String string = getString(R$string.lock);
        String strM66669i = C27041f.m66669i((assetSingleCurrencyBalance == null || (holdBalance2 = assetSingleCurrencyBalance.getHoldBalance()) == null) ? null : C37885i.m85563b(holdBalance2, assetSingleCurrencyBalance.getCurrency(), 0, 2, null), "- -");
        if (assetSingleCurrencyBalance != null && (holdBalance = assetSingleCurrencyBalance.getHoldBalance()) != null) {
            strM89950x = C41014a.m89950x(C41014a.m89940n(holdBalance, assetSingleCurrencyBalance.getCurrency()), null, null, 0, false, false, false, false, 127, null);
        }
        arrayList.add(new BaseAccountDetailFragment.AssetHeaderInfo(string, strM66669i, C27041f.m66669i(strM89950x, "- -"), true, null, null, null, null, 240, null));
        m15904C4(arrayList);
    }

    @Override // com.kubi.assets.detail.BaseAccountDetailFragment, com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        KcPrimaryButton kcPrimaryButton3;
        KcPrimaryButton kcPrimaryButton4;
        KcPrimaryButton kcPrimaryButton5;
        KcPrimaryButton kcPrimaryButton6;
        KcPrimaryButton kcPrimaryButton7;
        KcPrimaryButton kcPrimaryButton8;
        KcPrimaryButton kcPrimaryButton9;
        KcPrimaryButton kcPrimaryButton10;
        KcPrimaryButton kcPrimaryButton11;
        KcPrimaryButton kcPrimaryButton12;
        KcPrimaryButton kcPrimaryButton13;
        KcPrimaryButton kcPrimaryButton14;
        KcPrimaryButton kcPrimaryButton15;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ArrayList arrayList = new ArrayList();
        CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
        if (!C27025c.m66567e(coinInfoEntityM15914h4 != null ? Boolean.valueOf(coinInfoEntityM15914h4.isDigital()) : null, true) && C24129b.m58030b(SiteVisibleConfigKey.FastTrade)) {
            C43852m.m96593e("B1mainAccountDetail", "assets", "3", m17769k5());
            int i11 = R$drawable.ic2_card_20;
            String string = getString(R$string.trade);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            arrayList.add(new BaseAccountDetailFragment.AssetHeaderFunction(i11, string, new Action() { // from class: com.kubi.assets.main.detail.a
                @Override // io.reactivex.functions.Action
                public final void run() {
                    MainAccountDetailFragment.m17758t5(this.f17932b);
                }
            }));
        }
        CoinInfoEntity coinInfoEntityM15914h5 = m15914h4();
        boolean z11 = false;
        if (C27025c.m66566d(coinInfoEntityM15914h5 != null ? Boolean.valueOf(coinInfoEntityM15914h5.isEarnEnabled()) : null) && C24129b.m58030b(SiteVisibleConfigKey.Financing)) {
            C43852m.m96593e("B1mainAccountDetail", "assets", "4", m17769k5());
            Object objM56186h = Router.f46192a.m56186h(InterfaceC46805j0.class, SiteInfoManager.f47913a.m58109c());
            int i12 = objM56186h != null ? ((InterfaceC46805j0) objM56186h).mo17774a() : false ? R$string.homepage_stake : R$string.account_earn;
            int i13 = R$drawable.ic2_earn_pig_20;
            String string2 = getString(i12);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add(new BaseAccountDetailFragment.AssetHeaderFunction(i13, string2, new Action() { // from class: com.kubi.assets.main.detail.i
                @Override // io.reactivex.functions.Action
                public final void run() {
                    MainAccountDetailFragment.m17759u5(this.f17943b);
                }
            }));
        }
        IRedPackageService iRedPackageService = IRedPackageService.f43051a.get();
        CoinInfoEntity coinInfoEntityM15914h6 = m15914h4();
        String code = coinInfoEntityM15914h6 != null ? coinInfoEntityM15914h6.getCode() : null;
        if (code == null) {
            code = "";
        }
        if (iRedPackageService.mo53744b(code) && C24128a.m58028a()) {
            C43852m.m96593e("B1mainAccountDetail", "assets", "1", m17769k5());
            int i14 = R$drawable.ic2_red_envelop_20;
            String string3 = getString(R$string.red_package);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            arrayList.add(new BaseAccountDetailFragment.AssetHeaderFunction(i14, string3, new Action() { // from class: com.kubi.assets.main.detail.j
                @Override // io.reactivex.functions.Action
                public final void run() {
                    MainAccountDetailFragment.m17757s5(this.f17944b);
                }
            }));
        }
        m15902B4(arrayList);
        CoinInfoEntity coinInfoEntityM15914h7 = m15914h4();
        if (C27025c.m66567e(coinInfoEntityM15914h7 != null ? Boolean.valueOf(coinInfoEntityM15914h7.isDigital()) : null, true)) {
            C44828n5 c44828n5M17767g4 = m17767g4();
            if (c44828n5M17767g4 != null && (kcPrimaryButton7 = c44828n5M17767g4.f100524n) != null) {
                CoinInfoEntity coinInfoEntityM15914h8 = m15914h4();
                AssetExKt.m15138z(kcPrimaryButton7, (coinInfoEntityM15914h8 == null || coinInfoEntityM15914h8.isEtfCoin()) ? false : true);
            }
            C44828n5 c44828n5M17767g5 = m17767g4();
            if (c44828n5M17767g5 != null && (kcPrimaryButton6 = c44828n5M17767g5.f100524n) != null) {
                kcPrimaryButton6.setText(R$string.deposit_coin);
            }
            C44828n5 c44828n5M17767g6 = m17767g4();
            if (c44828n5M17767g6 != null && (kcPrimaryButton5 = c44828n5M17767g6.f100524n) != null) {
                C27046k.m66711z(kcPrimaryButton5, 0L, new Function0() { // from class: com.kubi.assets.main.detail.n
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainAccountDetailFragment.m17763y5(this.f17948b);
                    }
                }, 1, null);
            }
            C44828n5 c44828n5M17767g7 = m17767g4();
            if (c44828n5M17767g7 != null && (kcPrimaryButton4 = c44828n5M17767g7.f100523m) != null) {
                CoinInfoEntity coinInfoEntityM15914h9 = m15914h4();
                if (coinInfoEntityM15914h9 != null && !coinInfoEntityM15914h9.isEtfCoin()) {
                    z11 = true;
                }
                AssetExKt.m15138z(kcPrimaryButton4, z11);
            }
            C44828n5 c44828n5M17767g8 = m17767g4();
            if (c44828n5M17767g8 != null && (kcPrimaryButton3 = c44828n5M17767g8.f100523m) != null) {
                C27046k.m66711z(kcPrimaryButton3, 0L, new Function0() { // from class: com.kubi.assets.main.detail.o
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainAccountDetailFragment.m17764z5(this.f17949b);
                    }
                }, 1, null);
            }
            C44828n5 c44828n5M17767g9 = m17767g4();
            if (c44828n5M17767g9 != null && (kcPrimaryButton2 = c44828n5M17767g9.f100526p) != null) {
                ViewExtKt.m66594y(kcPrimaryButton2);
            }
            C44828n5 c44828n5M17767g10 = m17767g4();
            if (c44828n5M17767g10 != null && (kcPrimaryButton = c44828n5M17767g10.f100526p) != null) {
                C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.assets.main.detail.p
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainAccountDetailFragment.m17729A5(this.f17950b);
                    }
                }, 1, null);
            }
        } else {
            C44828n5 c44828n5M17767g11 = m17767g4();
            if (c44828n5M17767g11 != null && (kcPrimaryButton15 = c44828n5M17767g11.f100524n) != null) {
                AssetExKt.m15138z(kcPrimaryButton15, C24129b.m58030b(SiteVisibleConfigKey.FiatDeposit));
            }
            C44828n5 c44828n5M17767g12 = m17767g4();
            if (c44828n5M17767g12 != null && (kcPrimaryButton14 = c44828n5M17767g12.f100524n) != null) {
                kcPrimaryButton14.setText(R$string.fiat_charge);
            }
            C44828n5 c44828n5M17767g13 = m17767g4();
            if (c44828n5M17767g13 != null && (kcPrimaryButton13 = c44828n5M17767g13.f100524n) != null) {
                C27046k.m66711z(kcPrimaryButton13, 0L, new Function0() { // from class: com.kubi.assets.main.detail.k
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainAccountDetailFragment.m17760v5(this.f17945b);
                    }
                }, 1, null);
            }
            C44828n5 c44828n5M17767g14 = m17767g4();
            if (c44828n5M17767g14 != null && (kcPrimaryButton12 = c44828n5M17767g14.f100523m) != null) {
                AssetExKt.m15138z(kcPrimaryButton12, C24129b.m58030b(SiteVisibleConfigKey.FiatDeposit));
            }
            C44828n5 c44828n5M17767g15 = m17767g4();
            if (c44828n5M17767g15 != null && (kcPrimaryButton11 = c44828n5M17767g15.f100523m) != null) {
                C27046k.m66711z(kcPrimaryButton11, 0L, new Function0() { // from class: com.kubi.assets.main.detail.l
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainAccountDetailFragment.m17761w5(this.f17946b);
                    }
                }, 1, null);
            }
            C44828n5 c44828n5M17767g16 = m17767g4();
            if (c44828n5M17767g16 != null && (kcPrimaryButton10 = c44828n5M17767g16.f100526p) != null) {
                kcPrimaryButton10.setText(R$string.transfer);
            }
            C44828n5 c44828n5M17767g17 = m17767g4();
            if (c44828n5M17767g17 != null && (kcPrimaryButton9 = c44828n5M17767g17.f100526p) != null) {
                ViewExtKt.m66594y(kcPrimaryButton9);
            }
            C44828n5 c44828n5M17767g18 = m17767g4();
            if (c44828n5M17767g18 != null && (kcPrimaryButton8 = c44828n5M17767g18.f100526p) != null) {
                C27046k.m66711z(kcPrimaryButton8, 0L, new Function0() { // from class: com.kubi.assets.main.detail.m
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MainAccountDetailFragment.m17762x5(this.f17947b);
                    }
                }, 1, null);
            }
        }
        m17752n5(this, null, 1, null);
        m15918l4();
        m17770l5();
    }

    @Override // com.kubi.assets.detail.BaseAccountDetailFragment
    /* JADX INFO: renamed from: q4 */
    public void mo15920q4() {
        C43852m.m96589a("B1mainAccountDetail", "accountDetail", "1", m17769k5());
    }

    public MainAccountDetailFragment() {
        setPageId("B1mainAccountDetail");
        this.f17929i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.main.detail.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainAccountDetailFragment.m17751j5(this.f17951b);
            }
        });
        this.f17930j0 = new C10324a(CoroutineExceptionHandler.INSTANCE, this);
    }

    /* JADX INFO: renamed from: A5 */
    public static final Unit m17729A5(MainAccountDetailFragment mainAccountDetailFragment) {
        String code;
        C43852m.m96589a("B1mainAccountDetail", "transfer", "1", mainAccountDetailFragment.m17769k5());
        TransferJumper.Companion companion = TransferJumper.f21427a;
        CoinInfoEntity coinInfoEntityM15914h4 = mainAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        TransferJumper.Companion.jumpToTransfer$default(companion, C27041f.m66668h(code), null, null, "MAIN", "TRADE", true, null, 70, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e5 */
    public static final void m17748e5(MainAccountDetailFragment mainAccountDetailFragment, List list) {
        String state;
        C43852m.m96589a("B1mainAccountDetail", "assets", "2", mainAccountDetailFragment.m17769k5());
        B2CLoanEntity b2CLoanEntity = (B2CLoanEntity) CollectionsKt.firstOrNull(list);
        if (b2CLoanEntity != null) {
            state = b2CLoanEntity.getState();
        } else {
            state = null;
        }
        if (Intrinsics.areEqual(state, "ENABLE")) {
            LifecycleOwnerKt.getLifecycleScope(mainAccountDetailFragment).launchWhenStarted(new MainAccountDetailFragment$asyncGetB2CItem$2$1(list, null));
        } else {
            C23767n.m56878b("b2c/home", false, 1, null);
        }
    }

    /* JADX INFO: renamed from: i5 */
    public static final Unit m17750i5(MainAccountDetailFragment mainAccountDetailFragment, AccountDetailEntity accountDetailEntity) {
        String currency;
        C43852m.m96589a("B1mainAccountDetail", "accountDetail", "2", mainAccountDetailFragment.m17769k5());
        CoinInfoEntity coinInfoEntityM15914h4 = mainAccountDetailFragment.m15914h4();
        String code = null;
        if (coinInfoEntityM15914h4 != null) {
            currency = coinInfoEntityM15914h4.getCurrency();
        } else {
            currency = null;
        }
        CoinInfoEntity coinInfoEntityM15914h5 = mainAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h5 != null) {
            code = coinInfoEntityM15914h5.getCode();
        }
        AccountDetailEntity coinName = accountDetailEntity.setCoinName(currency, code);
        AssetsHelper assetsHelper = AssetsHelper.f18684a;
        Context context = mainAccountDetailFragment.getContext();
        Intrinsics.checkNotNull(coinName);
        assetsHelper.m19168l(context, coinName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o5 */
    public static final Unit m17753o5(MainAccountDetailFragment mainAccountDetailFragment, AssetSingleCurrencyBalance assetSingleCurrencyBalance) {
        mainAccountDetailFragment.m17771m5(assetSingleCurrencyBalance);
        C43841b.m96557d("b1overview_asset_detail_load", "data_load_finish", null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p5 */
    public static final void m17754p5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r5 */
    public static final void m17756r5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s5 */
    public static final void m17757s5(MainAccountDetailFragment mainAccountDetailFragment) {
        C43852m.m96589a("B1mainAccountDetail", "assets", "1", mainAccountDetailFragment.m17769k5());
        MviExKt.m42519o(mainAccountDetailFragment, new MainAccountDetailFragment$onViewCreated$1$3$1(mainAccountDetailFragment, null));
    }

    /* JADX INFO: renamed from: t5 */
    public static final void m17758t5(MainAccountDetailFragment mainAccountDetailFragment) {
        String code;
        C43852m.m96589a("B1mainAccountDetail", "assets", "3", mainAccountDetailFragment.m17769k5());
        C37304a c37304a = C37304a.f82764a;
        CoinInfoEntity coinInfoEntityM15914h4 = mainAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        InterfaceC37758j.a.m85163l(c37304a, 2L, code, null, null, null, null, null, 124, null);
    }

    /* JADX INFO: renamed from: u5 */
    public static final void m17759u5(MainAccountDetailFragment mainAccountDetailFragment) {
        String code;
        C43852m.m96589a("B1mainAccountDetail", "assets", "4", mainAccountDetailFragment.m17769k5());
        C37304a c37304a = C37304a.f82764a;
        Uri uri = Uri.parse(EarnUrlConfig.f17409a.m16754d());
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        String code2 = null;
        C4400a c4400a = new C4400a(uri, null, 2, null);
        CoinInfoEntity coinInfoEntityM15914h4 = mainAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        C4400a c4400aM4038a = c4400a.m4038a(FirebaseAnalytics.Param.CURRENCY, code).m4038a("dark", Boolean.TRUE).m4038a("loading", 2).m4038a("lang", MultiLanguageManager.f46811g.getLocalString());
        CoinInfoEntity coinInfoEntityM15914h5 = mainAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h5 != null) {
            code2 = coinInfoEntityM15914h5.getCode();
        }
        InterfaceC37766r.a.m85190a(c37304a, c4400aM4038a.m4038a("scroll_currency", code2).m4045h(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: v5 */
    public static final Unit m17760v5(MainAccountDetailFragment mainAccountDetailFragment) {
        String code;
        C43852m.m96589a("B1mainAccountDetail", ChannelKycRequest.SCENE_DEPOSIT, "1", mainAccountDetailFragment.m17769k5());
        C37304a c37304a = C37304a.f82764a;
        CoinInfoEntity coinInfoEntityM15914h4 = mainAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        InterfaceC37758j.a.m85157f(c37304a, C27041f.m66668h(code), null, null, null, null, 30, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w5 */
    public static final Unit m17761w5(MainAccountDetailFragment mainAccountDetailFragment) {
        String code;
        C43852m.m96589a("B1mainAccountDetail", ChannelKycRequest.SCENE_WITHDRAW, "1", mainAccountDetailFragment.m17769k5());
        C37304a c37304a = C37304a.f82764a;
        CoinInfoEntity coinInfoEntityM15914h4 = mainAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        InterfaceC37758j.a.m85159h(c37304a, C27041f.m66668h(code), null, null, null, null, 30, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x5 */
    public static final Unit m17762x5(MainAccountDetailFragment mainAccountDetailFragment) {
        String code;
        C43852m.m96589a("B1mainAccountDetail", "transfer", "1", mainAccountDetailFragment.m17769k5());
        TransferJumper.Companion companion = TransferJumper.f21427a;
        CoinInfoEntity coinInfoEntityM15914h4 = mainAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        TransferJumper.Companion.jumpToTransfer$default(companion, code, null, null, "MAIN", "TRADE", true, C43852m.m96602n("B1mainAccountDetail", "transfer", null, 4, null), 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y5 */
    public static final Unit m17763y5(MainAccountDetailFragment mainAccountDetailFragment) {
        String code;
        C43852m.m96589a("B1mainAccountDetail", ChannelKycRequest.SCENE_DEPOSIT, "1", mainAccountDetailFragment.m17769k5());
        C37304a c37304a = C37304a.f82764a;
        CoinInfoEntity coinInfoEntityM15914h4 = mainAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        InterfaceC37749a.a.m85110e(c37304a, C27041f.m66668h(code), null, null, null, null, null, 62, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z5 */
    public static final Unit m17764z5(MainAccountDetailFragment mainAccountDetailFragment) {
        String code;
        C43852m.m96589a("B1mainAccountDetail", ChannelKycRequest.SCENE_WITHDRAW, "1", mainAccountDetailFragment.m17769k5());
        C37304a c37304a = C37304a.f82764a;
        CoinInfoEntity coinInfoEntityM15914h4 = mainAccountDetailFragment.m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        InterfaceC37749a.a.m85118m(c37304a, C27041f.m66668h(code), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.assets.detail.BaseAccountDetailFragment
    @NotNull
    /* JADX INFO: renamed from: c4 */
    public String mo15911c4() {
        Boolean boolValueOf;
        CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            boolValueOf = Boolean.valueOf(coinInfoEntityM15914h4.isDigital());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66567e(boolValueOf, true)) {
            return "MAIN";
        }
        return "FIAT";
    }

    /* JADX INFO: renamed from: l5 */
    public final void m17770l5() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C42911a.m94120b().plus(this.f17930j0), null, new MainAccountDetailFragment$initAsnycAssetsHeaderItems$1(this, null), 2, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        String code;
        super.lazyLoad();
        AssetV2Api assetV2ApiM15912d4 = m15912d4();
        CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        Observable observableCompose = AssetV2Api.m17064i1(assetV2ApiM15912d4, "MAIN", code, null, null, 12, null).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.main.detail.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainAccountDetailFragment.m17753o5(this.f17933b, (AssetSingleCurrencyBalance) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.assets.main.detail.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MainAccountDetailFragment.m17754p5(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.main.detail.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainAccountDetailFragment.m17755q5(this.f17935b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.main.detail.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MainAccountDetailFragment.m17756r5(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<AccountDetailEntity>> mo16440r3(int i11, int i12) {
        String code;
        m15916j4().clear();
        m15916j4().put("size", Integer.valueOf(i12));
        m15916j4().put("page", Integer.valueOf(i11));
        HashMap<String, Object> mapM15916j4 = m15916j4();
        CoinInfoEntity coinInfoEntityM15914h4 = m15914h4();
        if (coinInfoEntityM15914h4 != null) {
            code = coinInfoEntityM15914h4.getCode();
        } else {
            code = null;
        }
        if (code == null) {
            code = "";
        }
        mapM15916j4.put(FirebaseAnalytics.Param.CURRENCY, code);
        ArrayList<ParcelizePair> arrayListM15915i4 = m15915i4();
        ArrayList<ParcelizePair> arrayList = new ArrayList();
        for (Object obj : arrayListM15915i4) {
            if (!TextUtils.isEmpty(((ParcelizePair) obj).getValue())) {
                arrayList.add(obj);
            }
        }
        for (ParcelizePair parcelizePair : arrayList) {
            m15916j4().put(parcelizePair.getKey(), parcelizePair.getValue());
        }
        m15916j4().put("startAt", Long.valueOf(m15917k4(String.valueOf(m15916j4().get("time")))));
        m15916j4().put("endAt", getF16861b0().f54265b);
        m15916j4().remove("time");
        Observable observableCompose = m15912d4().m17157q0(m15916j4()).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }
}
