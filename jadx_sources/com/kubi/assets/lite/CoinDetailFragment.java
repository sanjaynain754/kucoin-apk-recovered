package com.kubi.assets.lite;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$id;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.assets.entity.LiteCurrencyDetail;
import com.kubi.assets.filter.ParcelizePair;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37758j;
import gf.C37885i;
import gf.C37890n;
import gf.InterfaceC37888l;
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
import kotlinx.coroutines.InterfaceC41709m0;
import lb.C42153h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p311hf.C38184b;
import p402kf.C41014a;
import p429lf.C42179a;
import p569qq.C43841b;
import p569qq.C43852m;
import p637ta.C44842p5;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: CoinDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0014J\u001a\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\b\u0010 \u001a\u00020\u0014H\u0002J\u001a\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0082@¢\u0006\u0002\u0010%R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/assets/lite/CoinDetailFragment;", "Lcom/kubi/assets/lite/LiteBaseAccountDetailFragment;", "Lcom/kubi/assets/entity/AccountDetailEntity;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/LayoutLiteBaseAccountDetailBinding;", "getBinding", "()Lcom/kubi/assets/databinding/LayoutLiteBaseAccountDetailBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getAccountType", "", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "", "pageSize", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "balance", "Lcom/kubi/assets/entity/LiteCurrencyDetail;", "lazyLoad", "initHeaderInfo", "isShowConvert", "", "coinInfoEntity", "Lcom/kubi/data/entity/CoinInfoEntity;", "(Lcom/kubi/data/entity/CoinInfoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoinDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoinDetailFragment.kt\ncom/kubi/assets/lite/CoinDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,294:1\n147#2,16:295\n774#3:311\n865#3,2:312\n1869#3,2:314\n135#4,2:316\n*S KotlinDebug\n*F\n+ 1 CoinDetailFragment.kt\ncom/kubi/assets/lite/CoinDetailFragment\n*L\n64#1:295,16\n85#1:311\n85#1:312,2\n85#1:314,2\n233#1:316,2\n*E\n"})
public final class CoinDetailFragment extends LiteBaseAccountDetailFragment<AccountDetailEntity> {

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final InterfaceC24293a f17860h0 = C45681e.m100799e(this, new Function1<CoinDetailFragment, C44842p5>() { // from class: com.kubi.assets.lite.CoinDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44842p5 invoke(@NotNull CoinDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44842p5.m99210a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44842p5, Unit>() { // from class: com.kubi.assets.lite.CoinDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44842p5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44842p5 c44842p5) {
            invoke(c44842p5);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: i0 */
    @Nullable
    public LiteCurrencyDetail f17861i0;

    /* JADX INFO: renamed from: k0 */
    public static final /* synthetic */ KProperty<Object>[] f17859k0 = {Reflection.property1(new PropertyReference1Impl(CoinDetailFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/LayoutLiteBaseAccountDetailBinding;", 0))};

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static final Companion f17858j0 = new Companion(null);

    /* JADX INFO: compiled from: CoinDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/assets/lite/CoinDetailFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.assets.lite.CoinDetailFragment$onViewCreated$6 */
    /* JADX INFO: compiled from: CoinDetailFragment.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.lite.CoinDetailFragment$onViewCreated$6", m90122f = "CoinDetailFragment.kt", m90123i = {}, m90124l = {149}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C102676 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C102676(Continuation<? super C102676> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: j */
        public static final Unit m17594j(CoinDetailFragment coinDetailFragment) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            CoinInfoEntity coinInfoEntityM17618U3 = coinDetailFragment.m17618U3();
            String currency = coinInfoEntityM17618U3 != null ? coinInfoEntityM17618U3.getCurrency() : null;
            if (currency == null) {
                currency = "";
            }
            jSONObject.put(FirebaseAnalytics.Param.CURRENCY, currency);
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a("B1LitePortfolioCoinDetail", "convert", "1", jSONObject);
            String code = coinDetailFragment.m17618U3().getCode();
            C38184b c38184b = C38184b.f85884a;
            String strM66669i = C27041f.m66669i(code, c38184b.m86146a());
            if (Intrinsics.areEqual(strM66669i, c38184b.m86146a())) {
                strM66669i = "BTC";
            }
            String strEncode = Uri.encode("kucoin://lite/trade?route=TradeHome&type=CONVERT&from=" + strM66669i + "&to=" + c38184b.m86146a());
            Router router = Router.f46192a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kucoin://lite/home?tab=");
            sb2.append(strEncode);
            router.m56184f(sb2.toString()).m4048k();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: k */
        public static final Unit m17595k(CoinDetailFragment coinDetailFragment) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            CoinInfoEntity coinInfoEntityM17618U3 = coinDetailFragment.m17618U3();
            String currency = coinInfoEntityM17618U3 != null ? coinInfoEntityM17618U3.getCurrency() : null;
            if (currency == null) {
                currency = "";
            }
            jSONObject.put(FirebaseAnalytics.Param.CURRENCY, currency);
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a("B1LitePortfolioCoinDetail", "addFunds", "1", jSONObject);
            C37304a c37304a = C37304a.f82764a;
            CoinInfoEntity coinInfoEntityM17618U4 = coinDetailFragment.m17618U3();
            InterfaceC37749a.a.m85110e(c37304a, C27041f.m66668h(coinInfoEntityM17618U4 != null ? coinInfoEntityM17618U4.getCode() : null), null, null, null, null, null, 62, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: l */
        public static final Unit m17596l(CoinDetailFragment coinDetailFragment) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            CoinInfoEntity coinInfoEntityM17618U3 = coinDetailFragment.m17618U3();
            String currency = coinInfoEntityM17618U3 != null ? coinInfoEntityM17618U3.getCurrency() : null;
            if (currency == null) {
                currency = "";
            }
            jSONObject.put(FirebaseAnalytics.Param.CURRENCY, currency);
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a("B1LitePortfolioCoinDetail", ChannelKycRequest.SCENE_WITHDRAW, "1", jSONObject);
            C37304a c37304a = C37304a.f82764a;
            CoinInfoEntity coinInfoEntityM17618U4 = coinDetailFragment.m17618U3();
            InterfaceC37749a.a.m85118m(c37304a, C27041f.m66668h(coinInfoEntityM17618U4 != null ? coinInfoEntityM17618U4.getCode() : null), null, null, null, null, null, null, 126, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: m */
        public static final Unit m17597m(CoinDetailFragment coinDetailFragment) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            CoinInfoEntity coinInfoEntityM17618U3 = coinDetailFragment.m17618U3();
            String currency = coinInfoEntityM17618U3 != null ? coinInfoEntityM17618U3.getCurrency() : null;
            if (currency == null) {
                currency = "";
            }
            jSONObject.put(FirebaseAnalytics.Param.CURRENCY, currency);
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a("B1LitePortfolioCoinDetail", "addFunds", "1", jSONObject);
            C37304a c37304a = C37304a.f82764a;
            CoinInfoEntity coinInfoEntityM17618U4 = coinDetailFragment.m17618U3();
            InterfaceC37749a.a.m85110e(c37304a, C27041f.m66668h(coinInfoEntityM17618U4 != null ? coinInfoEntityM17618U4.getCode() : null), null, null, null, null, null, 62, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: n */
        public static final Unit m17598n(CoinDetailFragment coinDetailFragment) throws JSONException {
            JSONObject jSONObject = new JSONObject();
            CoinInfoEntity coinInfoEntityM17618U3 = coinDetailFragment.m17618U3();
            String currency = coinInfoEntityM17618U3 != null ? coinInfoEntityM17618U3.getCurrency() : null;
            if (currency == null) {
                currency = "";
            }
            jSONObject.put(FirebaseAnalytics.Param.CURRENCY, currency);
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a("B1LitePortfolioCoinDetail", ChannelKycRequest.SCENE_WITHDRAW, "1", jSONObject);
            C37304a c37304a = C37304a.f82764a;
            CoinInfoEntity coinInfoEntityM17618U4 = coinDetailFragment.m17618U3();
            InterfaceC37749a.a.m85118m(c37304a, C27041f.m66668h(coinInfoEntityM17618U4 != null ? coinInfoEntityM17618U4.getCode() : null), null, null, null, null, null, null, 126, null);
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CoinDetailFragment.this.new C102676(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C102676) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            KcPrimaryButton kcPrimaryButton;
            KcPrimaryButton kcPrimaryButton2;
            KcPrimaryButton kcPrimaryButton3;
            KcPrimaryButton kcPrimaryButton4;
            KcPrimaryButton kcPrimaryButton5;
            KcPrimaryButton kcPrimaryButton6;
            KcPrimaryButton kcPrimaryButton7;
            boolean z11;
            KcPrimaryButton kcPrimaryButton8;
            KcPrimaryButton kcPrimaryButton9;
            KcPrimaryButton kcPrimaryButton10;
            KcPrimaryButton kcPrimaryButton11;
            KcPrimaryButton kcPrimaryButton12;
            KcPrimaryButton kcPrimaryButton13;
            boolean z12;
            KcPrimaryButton kcPrimaryButton14;
            KcPrimaryButton kcPrimaryButton15;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            boolean z13 = true;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                CoinDetailFragment coinDetailFragment = CoinDetailFragment.this;
                CoinInfoEntity coinInfoEntityM17618U3 = coinDetailFragment.m17618U3();
                this.label = 1;
                obj = coinDetailFragment.m17588y4(coinInfoEntityM17618U3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            boolean zM66566d = C27025c.m66566d((Boolean) obj);
            final CoinDetailFragment coinDetailFragment2 = CoinDetailFragment.this;
            if (zM66566d) {
                C44842p5 c44842p5M17585T3 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T3 != null && (kcPrimaryButton15 = c44842p5M17585T3.f100643n) != null) {
                    kcPrimaryButton15.setText(R$string.coin_convert);
                }
                C44842p5 c44842p5M17585T4 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T4 != null && (kcPrimaryButton14 = c44842p5M17585T4.f100643n) != null) {
                    C27046k.m66711z(kcPrimaryButton14, 0L, new Function0() { // from class: com.kubi.assets.lite.l
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CoinDetailFragment.C102676.m17594j(coinDetailFragment2);
                        }
                    }, 1, null);
                }
                C44842p5 c44842p5M17585T5 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T5 != null && (kcPrimaryButton13 = c44842p5M17585T5.f100642m) != null) {
                    CoinInfoEntity coinInfoEntityM17618U4 = coinDetailFragment2.m17618U3();
                    if (coinInfoEntityM17618U4 != null && !coinInfoEntityM17618U4.isEtfCoin()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    AssetExKt.m15138z(kcPrimaryButton13, z12);
                }
                C44842p5 c44842p5M17585T6 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T6 != null && (kcPrimaryButton12 = c44842p5M17585T6.f100642m) != null) {
                    kcPrimaryButton12.setText(R$string.deposit_coin);
                }
                C44842p5 c44842p5M17585T7 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T7 != null && (kcPrimaryButton11 = c44842p5M17585T7.f100642m) != null) {
                    C27046k.m66711z(kcPrimaryButton11, 0L, new Function0() { // from class: com.kubi.assets.lite.m
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CoinDetailFragment.C102676.m17595k(coinDetailFragment2);
                        }
                    }, 1, null);
                }
                C44842p5 c44842p5M17585T8 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T8 != null && (kcPrimaryButton10 = c44842p5M17585T8.f100644o) != null) {
                    CoinInfoEntity coinInfoEntityM17618U5 = coinDetailFragment2.m17618U3();
                    if (coinInfoEntityM17618U5 == null || coinInfoEntityM17618U5.isEtfCoin()) {
                        z13 = false;
                    }
                    AssetExKt.m15138z(kcPrimaryButton10, z13);
                }
                C44842p5 c44842p5M17585T9 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T9 != null && (kcPrimaryButton9 = c44842p5M17585T9.f100644o) != null) {
                    kcPrimaryButton9.setText(R$string.withdraw);
                }
                C44842p5 c44842p5M17585T10 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T10 != null && (kcPrimaryButton8 = c44842p5M17585T10.f100644o) != null) {
                    C27046k.m66711z(kcPrimaryButton8, 0L, new Function0() { // from class: com.kubi.assets.lite.n
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CoinDetailFragment.C102676.m17596l(coinDetailFragment2);
                        }
                    }, 1, null);
                }
            } else {
                C44842p5 c44842p5M17585T11 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T11 != null && (kcPrimaryButton7 = c44842p5M17585T11.f100643n) != null) {
                    CoinInfoEntity coinInfoEntityM17618U6 = coinDetailFragment2.m17618U3();
                    if (coinInfoEntityM17618U6 != null && !coinInfoEntityM17618U6.isEtfCoin()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AssetExKt.m15138z(kcPrimaryButton7, z11);
                }
                C44842p5 c44842p5M17585T12 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T12 != null && (kcPrimaryButton6 = c44842p5M17585T12.f100643n) != null) {
                    kcPrimaryButton6.setText(R$string.deposit_coin);
                }
                C44842p5 c44842p5M17585T13 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T13 != null && (kcPrimaryButton5 = c44842p5M17585T13.f100643n) != null) {
                    C27046k.m66711z(kcPrimaryButton5, 0L, new Function0() { // from class: com.kubi.assets.lite.o
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CoinDetailFragment.C102676.m17597m(coinDetailFragment2);
                        }
                    }, 1, null);
                }
                C44842p5 c44842p5M17585T14 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T14 != null && (kcPrimaryButton4 = c44842p5M17585T14.f100642m) != null) {
                    CoinInfoEntity coinInfoEntityM17618U7 = coinDetailFragment2.m17618U3();
                    if (coinInfoEntityM17618U7 == null || coinInfoEntityM17618U7.isEtfCoin()) {
                        z13 = false;
                    }
                    AssetExKt.m15138z(kcPrimaryButton4, z13);
                }
                C44842p5 c44842p5M17585T15 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T15 != null && (kcPrimaryButton3 = c44842p5M17585T15.f100642m) != null) {
                    kcPrimaryButton3.setText(R$string.withdraw);
                }
                C44842p5 c44842p5M17585T16 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T16 != null && (kcPrimaryButton2 = c44842p5M17585T16.f100642m) != null) {
                    C27046k.m66711z(kcPrimaryButton2, 0L, new Function0() { // from class: com.kubi.assets.lite.p
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CoinDetailFragment.C102676.m17598n(coinDetailFragment2);
                        }
                    }, 1, null);
                }
                C44842p5 c44842p5M17585T17 = coinDetailFragment2.m17585T3();
                if (c44842p5M17585T17 != null && (kcPrimaryButton = c44842p5M17585T17.f100644o) != null) {
                    ViewExtKt.m66577h(kcPrimaryButton);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m17561B4(CoinDetailFragment coinDetailFragment, Throwable th2) {
        new C24223c1(coinDetailFragment);
        C43841b.m96555b("b1overview_asset_detail_load", null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public static final Unit m17563D4(CoinDetailFragment coinDetailFragment) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        CoinInfoEntity coinInfoEntityM17618U3 = coinDetailFragment.m17618U3();
        String currency = coinInfoEntityM17618U3 != null ? coinInfoEntityM17618U3.getCurrency() : null;
        if (currency == null) {
            currency = "";
        }
        jSONObject.put(FirebaseAnalytics.Param.CURRENCY, currency);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1LitePortfolioCoinDetail", ChannelKycRequest.SCENE_WITHDRAW, "1", jSONObject);
        C37304a c37304a = C37304a.f82764a;
        CoinInfoEntity coinInfoEntityM17618U4 = coinDetailFragment.m17618U3();
        InterfaceC37758j.a.m85159h(c37304a, C27041f.m66668h(coinInfoEntityM17618U4 != null ? coinInfoEntityM17618U4.getCode() : null), null, null, null, null, 30, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m17565F4(CoinDetailFragment coinDetailFragment) {
        C37890n c37890n = C37890n.f85269a;
        CoinInfoEntity coinInfoEntityM17618U3 = coinDetailFragment.m17618U3();
        String strM85586i = InterfaceC37888l.m85586i(c37890n, C27041f.m66669i(coinInfoEntityM17618U3 != null ? coinInfoEntityM17618U3.getCurrency() : null, "BTC"), null, 2, null);
        KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "lite/market/coin/details?symbol=" + strM85586i, false, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m17566G4(CoinDetailFragment coinDetailFragment) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        CoinInfoEntity coinInfoEntityM17618U3 = coinDetailFragment.m17618U3();
        String currency = coinInfoEntityM17618U3 != null ? coinInfoEntityM17618U3.getCurrency() : null;
        if (currency == null) {
            currency = "";
        }
        jSONObject.put(FirebaseAnalytics.Param.CURRENCY, currency);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B1LitePortfolioCoinDetail", "addFunds", "1", jSONObject);
        C37304a c37304a = C37304a.f82764a;
        CoinInfoEntity coinInfoEntityM17618U4 = coinDetailFragment.m17618U3();
        InterfaceC37758j.a.m85157f(c37304a, C27041f.m66668h(coinInfoEntityM17618U4 != null ? coinInfoEntityM17618U4.getCode() : null), null, null, null, null, 30, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final void m17582x4() {
        Router.f46192a.m56184f("lite/earn/holds").m4048k();
        C43852m.m96591c("B1mainAccountDetail", SearchCategory$Companion.EARN, "1", null, 8, null);
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m17583z4(CoinDetailFragment coinDetailFragment, LiteCurrencyDetail liteCurrencyDetail) {
        coinDetailFragment.f17861i0 = liteCurrencyDetail;
        coinDetailFragment.m17587v4();
        C43841b.m96557d("b1overview_asset_detail_load", "data_load_finish", null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public final C44842p5 m17585T3() {
        return (C44842p5) this.f17860h0.getValue(this, f17859k0[0]);
    }

    @Override // com.kubi.assets.lite.LiteBaseAccountDetailFragment, com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        KcPrimaryButton kcPrimaryButton3;
        KcPrimaryButton kcPrimaryButton4;
        KcPrimaryButton kcPrimaryButton5;
        KcPrimaryButton kcPrimaryButton6;
        ImageView imageView;
        BaseTextView baseTextView;
        ImageView imageView2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        JSONObject jSONObject = new JSONObject();
        CoinInfoEntity coinInfoEntityM17618U3 = m17618U3();
        String currency = coinInfoEntityM17618U3 != null ? coinInfoEntityM17618U3.getCurrency() : null;
        if (currency == null) {
            currency = "";
        }
        jSONObject.put(FirebaseAnalytics.Param.CURRENCY, currency);
        Unit unit = Unit.INSTANCE;
        C43852m.m96593e("B1LitePortfolioCoinDetail", "page", "1", jSONObject);
        C44842p5 c44842p5M17585T3 = m17585T3();
        if (c44842p5M17585T3 != null && (imageView2 = c44842p5M17585T3.f100635f) != null) {
            C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.assets.lite.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CoinDetailFragment.m17564E4(this.f17882b);
                }
            }, 1, null);
        }
        C44842p5 c44842p5M17585T4 = m17585T3();
        if (c44842p5M17585T4 != null && (baseTextView = c44842p5M17585T4.f100645p) != null) {
            CoinInfoEntity coinInfoEntityM17618U4 = m17618U3();
            baseTextView.setText(C27041f.m66668h(coinInfoEntityM17618U4 != null ? coinInfoEntityM17618U4.getCurrency() : null));
        }
        Context context = this.mContext;
        CoinInfoEntity coinInfoEntityM17618U5 = m17618U3();
        String iconUrl = coinInfoEntityM17618U5 != null ? coinInfoEntityM17618U5.getIconUrl() : null;
        C44842p5 c44842p5M17585T5 = m17585T3();
        C24277v.m58540e(context, iconUrl, c44842p5M17585T5 != null ? c44842p5M17585T5.f100637h : null);
        C44842p5 c44842p5M17585T6 = m17585T3();
        if (c44842p5M17585T6 != null && (imageView = c44842p5M17585T6.f100638i) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.lite.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CoinDetailFragment.m17565F4(this.f17883b);
                }
            }, 1, null);
        }
        CoinInfoEntity coinInfoEntityM17618U6 = m17618U3();
        if (C27025c.m66567e(coinInfoEntityM17618U6 != null ? Boolean.valueOf(coinInfoEntityM17618U6.isDigital()) : null, true)) {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new C102676(null));
        } else {
            C44842p5 c44842p5M17585T7 = m17585T3();
            if (c44842p5M17585T7 != null && (kcPrimaryButton6 = c44842p5M17585T7.f100643n) != null) {
                AssetExKt.m15138z(kcPrimaryButton6, C24129b.m58030b(SiteVisibleConfigKey.FiatDeposit));
            }
            C44842p5 c44842p5M17585T8 = m17585T3();
            if (c44842p5M17585T8 != null && (kcPrimaryButton5 = c44842p5M17585T8.f100643n) != null) {
                kcPrimaryButton5.setText(R$string.fiat_charge);
            }
            C44842p5 c44842p5M17585T9 = m17585T3();
            if (c44842p5M17585T9 != null && (kcPrimaryButton4 = c44842p5M17585T9.f100643n) != null) {
                C27046k.m66711z(kcPrimaryButton4, 0L, new Function0() { // from class: com.kubi.assets.lite.h
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CoinDetailFragment.m17566G4(this.f17884b);
                    }
                }, 1, null);
            }
            C44842p5 c44842p5M17585T10 = m17585T3();
            if (c44842p5M17585T10 != null && (kcPrimaryButton3 = c44842p5M17585T10.f100642m) != null) {
                AssetExKt.m15138z(kcPrimaryButton3, C24129b.m58030b(SiteVisibleConfigKey.FiatDeposit));
            }
            C44842p5 c44842p5M17585T11 = m17585T3();
            if (c44842p5M17585T11 != null && (kcPrimaryButton2 = c44842p5M17585T11.f100642m) != null) {
                C27046k.m66711z(kcPrimaryButton2, 0L, new Function0() { // from class: com.kubi.assets.lite.i
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CoinDetailFragment.m17563D4(this.f17885b);
                    }
                }, 1, null);
            }
            C44842p5 c44842p5M17585T12 = m17585T3();
            if (c44842p5M17585T12 != null && (kcPrimaryButton = c44842p5M17585T12.f100644o) != null) {
                ViewExtKt.m66577h(kcPrimaryButton);
            }
        }
        m17587v4();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: t4, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull final AccountDetailEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tv_amount;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(item.getDirectionSymbol());
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(item.getAmount()));
        CoinInfoEntity coinInfoEntityM17618U3 = m17618U3();
        sb2.append(C37885i.m85563b(bigDecimal, coinInfoEntityM17618U3 != null ? coinInfoEntityM17618U3.getCode() : null, 0, 2, null));
        helper.setText(i11, sb2.toString()).setTextColor(i11, item.getDirectionColor(this.mContext));
        helper.setText(R$id.tv_type, item.getBizTypeNameString());
        helper.setText(R$id.tv_time, C42179a.m92633f(item.getTradeDate(), null, true, true, null, 9, null));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.lite.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoinDetailFragment.m17580u4(item, this);
            }
        }, 1, null);
        ShowHideTextView.m54778d(helper.itemView, getF17870e0());
    }

    /* JADX INFO: renamed from: v4 */
    public final void m17587v4() {
        String strM85563b;
        LiteAccountDetailHeaderView liteAccountDetailHeaderView;
        LiteAccountDetailHeaderView liteAccountDetailHeaderView2;
        C44842p5 c44842p5M17585T3 = m17585T3();
        String strM89950x = null;
        if (c44842p5M17585T3 != null && (liteAccountDetailHeaderView2 = c44842p5M17585T3.f100633d) != null) {
            LiteCurrencyDetail liteCurrencyDetail = this.f17861i0;
            String totalBalance = liteCurrencyDetail != null ? liteCurrencyDetail.getTotalBalance() : null;
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            BigDecimal bigDecimalM66534d = DowngradeExKt.m66534d(totalBalance, ZERO);
            LiteCurrencyDetail liteCurrencyDetail2 = this.f17861i0;
            String strM66669i = C27041f.m66669i(C37885i.m85563b(bigDecimalM66534d, liteCurrencyDetail2 != null ? liteCurrencyDetail2.getCurrency() : null, 0, 2, null), "--");
            LiteCurrencyDetail liteCurrencyDetail3 = this.f17861i0;
            String totalBalance2 = liteCurrencyDetail3 != null ? liteCurrencyDetail3.getTotalBalance() : null;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            BigDecimal bigDecimalM66534d2 = DowngradeExKt.m66534d(totalBalance2, ZERO);
            LiteCurrencyDetail liteCurrencyDetail4 = this.f17861i0;
            liteAccountDetailHeaderView2.m17602d(strM66669i, C27041f.m66669i(C41014a.m89948v(C41014a.m89940n(bigDecimalM66534d2, liteCurrencyDetail4 != null ? liteCurrencyDetail4.getCurrency() : null), null, null, 0, false, true, false, 47, null), "--"));
        }
        m17626f4(C46392a.m102322d(C42153h.f93593a.m92500D(), false));
        C44842p5 c44842p5M17585T4 = m17585T3();
        if (c44842p5M17585T4 != null && (liteAccountDetailHeaderView = c44842p5M17585T4.f100633d) != null) {
            liteAccountDetailHeaderView.m17601b(new Consumer() { // from class: com.kubi.assets.lite.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    CoinDetailFragment.m17581w4(this.f17888b, (Boolean) obj);
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        String string = getString(R$string.useful);
        LiteCurrencyDetail liteCurrencyDetail5 = this.f17861i0;
        String availableBalance = liteCurrencyDetail5 != null ? liteCurrencyDetail5.getAvailableBalance() : null;
        BigDecimal ZERO2 = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        BigDecimal bigDecimalM66534d3 = DowngradeExKt.m66534d(availableBalance, ZERO2);
        LiteCurrencyDetail liteCurrencyDetail6 = this.f17861i0;
        String strM66669i2 = C27041f.m66669i(C37885i.m85563b(bigDecimalM66534d3, liteCurrencyDetail6 != null ? liteCurrencyDetail6.getCurrency() : null, 0, 2, null), "--");
        LiteCurrencyDetail liteCurrencyDetail7 = this.f17861i0;
        String availableBalance2 = liteCurrencyDetail7 != null ? liteCurrencyDetail7.getAvailableBalance() : null;
        Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        BigDecimal bigDecimalM66534d4 = DowngradeExKt.m66534d(availableBalance2, ZERO2);
        LiteCurrencyDetail liteCurrencyDetail8 = this.f17861i0;
        arrayList.add(new LiteBaseAccountDetailFragment.AssetHeaderInfo(string, strM66669i2, C27041f.m66669i(C41014a.m89950x(C41014a.m89940n(bigDecimalM66534d4, liteCurrencyDetail8 != null ? liteCurrencyDetail8.getCurrency() : null), null, null, 0, false, false, false, false, 127, null), "--"), false, null, 24, null));
        String string2 = getString(R$string.lock);
        LiteCurrencyDetail liteCurrencyDetail9 = this.f17861i0;
        String holdBalance = liteCurrencyDetail9 != null ? liteCurrencyDetail9.getHoldBalance() : null;
        Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        BigDecimal bigDecimalM66534d5 = DowngradeExKt.m66534d(holdBalance, ZERO2);
        LiteCurrencyDetail liteCurrencyDetail10 = this.f17861i0;
        String strM66669i3 = C27041f.m66669i(C37885i.m85563b(bigDecimalM66534d5, liteCurrencyDetail10 != null ? liteCurrencyDetail10.getCurrency() : null, 0, 2, null), "--");
        LiteCurrencyDetail liteCurrencyDetail11 = this.f17861i0;
        String holdBalance2 = liteCurrencyDetail11 != null ? liteCurrencyDetail11.getHoldBalance() : null;
        Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        BigDecimal bigDecimalM66534d6 = DowngradeExKt.m66534d(holdBalance2, ZERO2);
        LiteCurrencyDetail liteCurrencyDetail12 = this.f17861i0;
        arrayList.add(new LiteBaseAccountDetailFragment.AssetHeaderInfo(string2, strM66669i3, C27041f.m66669i(C41014a.m89950x(C41014a.m89940n(bigDecimalM66534d6, liteCurrencyDetail12 != null ? liteCurrencyDetail12.getCurrency() : null), null, null, 0, false, false, false, false, 127, null), "--"), false, null, 16, null));
        LiteCurrencyDetail liteCurrencyDetail13 = this.f17861i0;
        String earnHoldingAmount = liteCurrencyDetail13 != null ? liteCurrencyDetail13.getEarnHoldingAmount() : null;
        if (C24129b.m58030b(SiteVisibleConfigKey.Financing) && earnHoldingAmount != null) {
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            if (DowngradeExKt.m66534d(earnHoldingAmount, ZERO2).signum() > 0) {
                String string3 = getString(R$string.kc_coin_detail_earn);
                BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(earnHoldingAmount);
                if (bigDecimalM66536f != null) {
                    LiteCurrencyDetail liteCurrencyDetail14 = this.f17861i0;
                    strM85563b = C37885i.m85563b(bigDecimalM66536f, liteCurrencyDetail14 != null ? liteCurrencyDetail14.getCurrency() : null, 0, 2, null);
                } else {
                    strM85563b = null;
                }
                String strM66669i4 = C27041f.m66669i(strM85563b, "--");
                BigDecimal bigDecimalM66536f2 = DowngradeExKt.m66536f(earnHoldingAmount);
                if (bigDecimalM66536f2 != null) {
                    LiteCurrencyDetail liteCurrencyDetail15 = this.f17861i0;
                    strM89950x = C41014a.m89950x(C41014a.m89940n(bigDecimalM66536f2, liteCurrencyDetail15 != null ? liteCurrencyDetail15.getCurrency() : null), null, null, 0, false, false, false, false, 127, null);
                }
                arrayList.add(new LiteBaseAccountDetailFragment.AssetHeaderInfo(string3, strM66669i4, C27041f.m66669i(strM89950x, "--"), true, new Action() { // from class: com.kubi.assets.lite.b
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        CoinDetailFragment.m17582x4();
                    }
                }));
            }
        }
        m17624c4(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y4 */
    public final Object m17588y4(CoinInfoEntity coinInfoEntity, Continuation<? super Boolean> continuation) {
        CoinDetailFragment$isShowConvert$1 coinDetailFragment$isShowConvert$1;
        Object objM103844constructorimpl;
        if (continuation instanceof CoinDetailFragment$isShowConvert$1) {
            coinDetailFragment$isShowConvert$1 = (CoinDetailFragment$isShowConvert$1) continuation;
            int i11 = coinDetailFragment$isShowConvert$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                coinDetailFragment$isShowConvert$1.label = i11 - Integer.MIN_VALUE;
            } else {
                coinDetailFragment$isShowConvert$1 = new CoinDetailFragment$isShowConvert$1(this, continuation);
            }
        } else {
            coinDetailFragment$isShowConvert$1 = new CoinDetailFragment$isShowConvert$1(this, continuation);
        }
        Object objM17078D0 = coinDetailFragment$isShowConvert$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = coinDetailFragment$isShowConvert$1.label;
        boolean z11 = false;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM17078D0);
                if (!C24129b.m58030b(SiteVisibleConfigKey.Convert)) {
                    return null;
                }
                String code = coinInfoEntity != null ? coinInfoEntity.getCode() : null;
                if (code == null || StringsKt.isBlank(code)) {
                    return null;
                }
                Result.Companion companion = Result.INSTANCE;
                AssetV2Api assetV2ApiM17616R3 = m17616R3();
                coinDetailFragment$isShowConvert$1.L$0 = SpillingKt.nullOutSpilledVariable(coinInfoEntity);
                coinDetailFragment$isShowConvert$1.L$1 = SpillingKt.nullOutSpilledVariable(code);
                coinDetailFragment$isShowConvert$1.L$2 = SpillingKt.nullOutSpilledVariable(this);
                coinDetailFragment$isShowConvert$1.I$0 = 0;
                coinDetailFragment$isShowConvert$1.label = 1;
                objM17078D0 = assetV2ApiM17616R3.m17078D0(code, coinDetailFragment$isShowConvert$1);
                if (objM17078D0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM17078D0);
            }
            BaseEntity baseEntity = (BaseEntity) objM17078D0;
            if (baseEntity.getSuccess() && ((Boolean) baseEntity.getData()).booleanValue()) {
                z11 = true;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Boxing.boxBoolean(z11));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            return null;
        }
        return objM103844constructorimpl;
    }

    public CoinDetailFragment() {
        setPageId("B1mainAccountDetail");
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m17560A4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m17562C4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m17564E4(CoinDetailFragment coinDetailFragment) {
        coinDetailFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m17580u4(AccountDetailEntity accountDetailEntity, CoinDetailFragment coinDetailFragment) {
        String currency;
        CoinInfoEntity coinInfoEntityM17618U3 = coinDetailFragment.m17618U3();
        String code = null;
        if (coinInfoEntityM17618U3 != null) {
            currency = coinInfoEntityM17618U3.getCurrency();
        } else {
            currency = null;
        }
        CoinInfoEntity coinInfoEntityM17618U4 = coinDetailFragment.m17618U3();
        if (coinInfoEntityM17618U4 != null) {
            code = coinInfoEntityM17618U4.getCode();
        }
        AccountDetailEntity coinName = accountDetailEntity.setCoinName(currency, code);
        AssetsHelper assetsHelper = AssetsHelper.f18684a;
        Context context = coinDetailFragment.getContext();
        Intrinsics.checkNotNull(coinName);
        assetsHelper.m19168l(context, coinName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m17581w4(CoinDetailFragment coinDetailFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        coinDetailFragment.m17626f4(bool.booleanValue());
    }

    @Override // com.kubi.assets.lite.LiteBaseAccountDetailFragment
    @NotNull
    /* JADX INFO: renamed from: Q3 */
    public String mo17584Q3() {
        Boolean boolValueOf;
        CoinInfoEntity coinInfoEntityM17618U3 = m17618U3();
        if (coinInfoEntityM17618U3 != null) {
            boolValueOf = Boolean.valueOf(coinInfoEntityM17618U3.isDigital());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66567e(boolValueOf, true)) {
            return "MAIN";
        }
        return "FIAT";
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        super.lazyLoad();
        Observable<R> observableCompose = m17616R3().m17087I0(m17618U3().getCode()).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.lite.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoinDetailFragment.m17583z4(this.f17878b, (LiteCurrencyDetail) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.assets.lite.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CoinDetailFragment.m17560A4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.lite.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CoinDetailFragment.m17561B4(this.f17880b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.lite.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CoinDetailFragment.m17562C4(function2, obj);
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
        m17620W3().clear();
        m17620W3().put("size", Integer.valueOf(i12));
        m17620W3().put("page", Integer.valueOf(i11));
        HashMap<String, Object> mapM17620W3 = m17620W3();
        CoinInfoEntity coinInfoEntityM17618U3 = m17618U3();
        if (coinInfoEntityM17618U3 != null) {
            code = coinInfoEntityM17618U3.getCode();
        } else {
            code = null;
        }
        if (code == null) {
            code = "";
        }
        mapM17620W3.put(FirebaseAnalytics.Param.CURRENCY, code);
        ArrayList<ParcelizePair> arrayListM17619V3 = m17619V3();
        ArrayList<ParcelizePair> arrayList = new ArrayList();
        for (Object obj : arrayListM17619V3) {
            if (!TextUtils.isEmpty(((ParcelizePair) obj).getValue())) {
                arrayList.add(obj);
            }
        }
        for (ParcelizePair parcelizePair : arrayList) {
            m17620W3().put(parcelizePair.getKey(), parcelizePair.getValue());
        }
        m17620W3().put("startAt", Long.valueOf(m17621X3(String.valueOf(m17620W3().get("time")))));
        m17620W3().put("endAt", getF17867b0().f54265b);
        m17620W3().remove("time");
        Observable observableCompose = m17616R3().m17157q0(m17620W3()).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }
}
