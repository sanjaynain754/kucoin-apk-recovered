package com.kubi.assets.margin.isolated.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AccountDetailEntity;
import com.kubi.assets.filter.AssetFilterDialogFragment;
import com.kubi.assets.filter.AssetFilterHelper;
import com.kubi.assets.filter.IFilterDialogCallBack;
import com.kubi.assets.filter.ParcelizePair;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.assets.service.AssetsHelper;
import com.kubi.data.coin.TransferJumper;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.C23637c;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import f00.C37304a;
import g00.InterfaceC37756h;
import gf.C37885i;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p569qq.C43852m;
import p637ta.C44835o5;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: IsolatedMarginAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020#H\u0016J\u0016\u00100\u001a\u00020#2\f\u00101\u001a\b\u0012\u0004\u0012\u00020+02H\u0016J$\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000205042\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000207H\u0014J\u0018\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u0002H\u0014J\b\u0010=\u001a\u00020#H\u0016J\u0010\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u00020#2\u0006\u0010?\u001a\u00020@H\u0002J\b\u0010B\u001a\u000207H\u0014J\b\u0010C\u001a\u000207H\u0014J\b\u0010D\u001a\u00020EH\u0014J\b\u0010F\u001a\u000207H\u0014J\b\u0010G\u001a\u000207H\u0014J\b\u0010H\u001a\u00020#H\u0014J\b\u0010I\u001a\u00020#H\u0014J\u000e\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0019R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R*\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018j\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a`\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R+\u0010)\u001a\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0011\u001a\u0004\b-\u0010.¨\u0006M"}, m90084d2 = {"Lcom/kubi/assets/margin/isolated/detail/IsolatedMarginAccountDetailFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/assets/entity/AccountDetailEntity;", "Lcom/kubi/assets/filter/IFilterDialogCallBack;", "<init>", "()V", "binding", "Lcom/kubi/assets/databinding/LayoutIsolatedMarginAccountDetailBinding;", "getBinding", "()Lcom/kubi/assets/databinding/LayoutIsolatedMarginAccountDetailBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isolatedSymbol", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getIsolatedSymbol", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "isolatedSymbol$delegate", "Lkotlin/Lazy;", "assetV2Api", "Lcom/kubi/assets/AssetV2Api;", "getAssetV2Api", "()Lcom/kubi/assets/AssetV2Api;", "assetV2Api$delegate", "requestParams", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "beforeGet", "Lcom/kubi/utils/TimeUtils$BeforeGet;", "getBeforeGet", "()Lcom/kubi/utils/TimeUtils$BeforeGet;", "setBeforeGet", "(Lcom/kubi/utils/TimeUtils$BeforeGet;)V", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "refreshData", "initParams", "Ljava/util/ArrayList;", "Lcom/kubi/assets/filter/ParcelizePair;", "Lkotlin/collections/ArrayList;", "getInitParams", "()Ljava/util/ArrayList;", "initParams$delegate", "filterCallBack", DbParams.KEY_CHANNEL_RESULT, "", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "", "pageSize", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "lazyLoad", "initViewByPosition", ViewProps.POSITION, "Lcom/kubi/margin/api/entity/MarginPosition;", "initHeaderInfo", "getLayout", "getItemLayout", "needDefaultBackground", "", "getEmptyFooterText", "getEndFooterText", "setHeader", "onReBack", "getStart", "", "value", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nIsolatedMarginAccountDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IsolatedMarginAccountDetailFragment.kt\ncom/kubi/assets/margin/isolated/detail/IsolatedMarginAccountDetailFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,292:1\n147#2,16:293\n774#3:309\n865#3,2:310\n1869#3,2:312\n*S KotlinDebug\n*F\n+ 1 IsolatedMarginAccountDetailFragment.kt\ncom/kubi/assets/margin/isolated/detail/IsolatedMarginAccountDetailFragment\n*L\n62#1:293,16\n131#1:309\n131#1:310,2\n131#1:312,2\n*E\n"})
public final class IsolatedMarginAccountDetailFragment extends BasePagingFragment<AccountDetailEntity> implements IFilterDialogCallBack {

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ KProperty<Object>[] f18061f0 = {Reflection.property1(new PropertyReference1Impl(IsolatedMarginAccountDetailFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/LayoutIsolatedMarginAccountDetailBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f18062Z = C45681e.m100799e(this, new Function1<IsolatedMarginAccountDetailFragment, C44835o5>() { // from class: com.kubi.assets.margin.isolated.detail.IsolatedMarginAccountDetailFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44835o5 invoke(@NotNull IsolatedMarginAccountDetailFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44835o5.m99196a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44835o5, Unit>() { // from class: com.kubi.assets.margin.isolated.detail.IsolatedMarginAccountDetailFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44835o5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44835o5 c44835o5) {
            invoke(c44835o5);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f18063a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.margin.isolated.detail.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IsolatedMarginAccountDetailFragment.m18028p4(this.f18078b);
        }
    });

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f18064b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.margin.isolated.detail.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IsolatedMarginAccountDetailFragment.m18017Y3();
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final HashMap<String, Object> f18065c0 = new HashMap<>();

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public TimeUtils.C27004b f18066d0 = new TimeUtils.C27004b();

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f18067e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.margin.isolated.detail.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IsolatedMarginAccountDetailFragment.m18021h4(this.f18079b);
        }
    });

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    /* JADX INFO: renamed from: b4 */
    private final AssetV2Api m18019b4() {
        Object value = this.f18064b0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AssetV2Api) value;
    }

    /* JADX INFO: renamed from: d4 */
    private final ArrayList<ParcelizePair> m18020d4() {
        return (ArrayList) this.f18067e0.getValue();
    }

    /* JADX INFO: renamed from: h4 */
    public static final ArrayList m18021h4(IsolatedMarginAccountDetailFragment isolatedMarginAccountDetailFragment) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ParcelizePair(FirebaseAnalytics.Param.CURRENCY, ""));
        arrayList.add(new ParcelizePair("direction", ""));
        arrayList.add(new ParcelizePair("time", "ONE_MONTH"));
        arrayList.add(new ParcelizePair("bizType", ""));
        SymbolInfoEntity symbolInfoEntityM18038e4 = isolatedMarginAccountDetailFragment.m18038e4();
        String code = symbolInfoEntityM18038e4 != null ? symbolInfoEntityM18038e4.getCode() : null;
        arrayList.add(new ParcelizePair("tag", code != null ? code : ""));
        return arrayList;
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m18022j4(IsolatedMarginAccountDetailFragment isolatedMarginAccountDetailFragment) {
        C43852m.m96591c("B4isolatedMarginAssetsDetails", "trade", "1", null, 8, null);
        IMarginService iMarginServiceM19183d = AssetsDepend.f18689a.m19183d();
        SymbolInfoEntity symbolInfoEntityM18038e4 = isolatedMarginAccountDetailFragment.m18038e4();
        String code = symbolInfoEntityM18038e4 != null ? symbolInfoEntityM18038e4.getCode() : null;
        if (code == null) {
            code = "";
        }
        IMarginService.m37900d0(iMarginServiceM19183d, code, true, false, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m18025m4(MarginPosition marginPosition) {
        C43852m.m96591c("B4isolatedMarginAssetsDetails", "borrow", "1", null, 8, null);
        C37304a c37304a = C37304a.f82764a;
        String tag = marginPosition.getTag();
        CurrencyBalance quoteAsset = marginPosition.getQuoteAsset();
        InterfaceC37756h.a.m85144b(c37304a, C27041f.m66668h(quoteAsset != null ? quoteAsset.getCurrency() : null), tag, "borrow", "isolated", C43852m.m96601m("B4isolatedMarginAssetsDetails", "borrow", "1"), null, null, 96, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m18026n4(MarginPosition marginPosition) {
        C43852m.m96591c("B4isolatedMarginAssetsDetails", "repay", "1", null, 8, null);
        C37304a c37304a = C37304a.f82764a;
        String tag = marginPosition.getTag();
        CurrencyBalance quoteAsset = marginPosition.getQuoteAsset();
        InterfaceC37756h.a.m85144b(c37304a, C27041f.m66668h(quoteAsset != null ? quoteAsset.getCurrency() : null), tag, "repay", "isolated", C43852m.m96601m("B4isolatedMarginAssetsDetails", "repay", "1"), null, null, 96, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m18027o4(IsolatedMarginAccountDetailFragment isolatedMarginAccountDetailFragment) {
        C43852m.m96591c("B4isolatedMarginAssetsDetails", "transfer", "1", null, 8, null);
        TransferJumper.Companion companion = TransferJumper.f21427a;
        SymbolInfoEntity symbolInfoEntityM18038e4 = isolatedMarginAccountDetailFragment.m18038e4();
        String quoteCurrency = symbolInfoEntityM18038e4 != null ? symbolInfoEntityM18038e4.getQuoteCurrency() : null;
        SymbolInfoEntity symbolInfoEntityM18038e5 = isolatedMarginAccountDetailFragment.m18038e4();
        TransferJumper.Companion.jumpToTransfer$default(companion, quoteCurrency, null, symbolInfoEntityM18038e5 != null ? symbolInfoEntityM18038e5.getSymbol() : null, "TRADE", SharedPositionInfo.MARGIN_MODE_ISOLATED, false, C43852m.m96601m("B4isolatedMarginAssetsDetails", "transfer", "1"), 34, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    public static final SymbolInfoEntity m18028p4(IsolatedMarginAccountDetailFragment isolatedMarginAccountDetailFragment) {
        return C37890n.f85269a.m85601B(C27041f.m66668h(isolatedMarginAccountDetailFragment.requireActivity().getIntent().getStringExtra("code")));
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m18035w4(IsolatedMarginAccountDetailFragment isolatedMarginAccountDetailFragment) {
        DialogFragmentHelper dialogFragmentHelperNewInstance = AssetFilterDialogFragment.f17329u0.newInstance(SharedPositionInfo.MARGIN_MODE_ISOLATED, isolatedMarginAccountDetailFragment.m18020d4());
        FragmentManager childFragmentManager = isolatedMarginAccountDetailFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperNewInstance.show(childFragmentManager, SharedPositionInfo.MARGIN_MODE_ISOLATED);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        this.f18066d0 = new TimeUtils.C27004b();
        super.mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: Z3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull final AccountDetailEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        int i11 = R$id.tv_amount;
        helper.setText(i11, item.getDirectionSymbol() + C37885i.m85563b(new BigDecimal(String.valueOf(item.getAmount())), item.getCode(), 0, 2, null)).setTextColor(i11, item.getDirectionColor(this.mContext)).setText(R$id.tv_type, item.getBizTypeNameString()).setText(R$id.tv_time, C42179a.m92633f(item.getTradeDate(), null, true, true, null, 9, null));
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.detail.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IsolatedMarginAccountDetailFragment.m18018a4(item, this);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: c4 */
    public final C44835o5 m18037c4() {
        return (C44835o5) this.f18062Z.getValue(this, f18061f0[0]);
    }

    /* JADX INFO: renamed from: e4 */
    public final SymbolInfoEntity m18038e4() {
        return (SymbolInfoEntity) this.f18063a0.getValue();
    }

    /* JADX INFO: renamed from: f4 */
    public final long m18039f4(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int iHashCode = value.hashCode();
        if (iHashCode == -1480287667) {
            if (value.equals("ONE_WEEK")) {
                return this.f18066d0.m66434a(7, 6);
            }
            return 0L;
        }
        if (iHashCode == 1314132820) {
            if (value.equals("HALF_MONTH")) {
                return this.f18066d0.m66434a(15, 6);
            }
            return 0L;
        }
        if (iHashCode == 1346794279 && value.equals("ONE_MONTH")) {
            return this.f18066d0.m66434a(30, 6);
        }
        return 0L;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.layout_isolated_margin_account_detail;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        AssetsDepend assetsDepend = AssetsDepend.f18689a;
        IMarginService iMarginServiceM19183d = assetsDepend.m19183d();
        SymbolInfoEntity symbolInfoEntityM18038e4 = m18038e4();
        String code = symbolInfoEntityM18038e4 != null ? symbolInfoEntityM18038e4.getCode() : null;
        if (code == null) {
            code = "";
        }
        MarginPosition marginPositionMo37904C = iMarginServiceM19183d.mo37904C(code);
        if (marginPositionMo37904C != null) {
            m18041i4(marginPositionMo37904C);
        } else {
            showLoading();
        }
        IMarginService iMarginServiceM19183d2 = assetsDepend.m19183d();
        SymbolInfoEntity symbolInfoEntityM18038e5 = m18038e4();
        String code2 = symbolInfoEntityM18038e5 != null ? symbolInfoEntityM18038e5.getCode() : null;
        Observable<MarginPosition> observableMo37951o0 = iMarginServiceM19183d2.mo37951o0(code2 != null ? code2 : "");
        final Function1 function1 = new Function1() { // from class: com.kubi.assets.margin.isolated.detail.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsolatedMarginAccountDetailFragment.m18029q4(this.f18080b, (MarginPosition) obj);
            }
        };
        Consumer<? super MarginPosition> consumer = new Consumer() { // from class: com.kubi.assets.margin.isolated.detail.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                IsolatedMarginAccountDetailFragment.m18030r4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.assets.margin.isolated.detail.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IsolatedMarginAccountDetailFragment.m18031s4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableMo37951o0.subscribe(consumer, new Consumer() { // from class: com.kubi.assets.margin.isolated.detail.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                IsolatedMarginAccountDetailFragment.m18032t4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        ImageView imageView;
        AppBarLayout appBarLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.f46496X.setEnabled(false);
        C23637c c23637c = C23637c.f46218a;
        Intent intent = requireActivity().getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        final String strM56297b = c23637c.m56297b(intent, "title");
        if (strM56297b == null) {
            strM56297b = "";
        }
        C44835o5 c44835o5M18037c4 = m18037c4();
        if (c44835o5M18037c4 != null && (appBarLayout = c44835o5M18037c4.f100553b) != null) {
            appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: com.kubi.assets.margin.isolated.detail.a
                @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
                public final void onOffsetChanged(AppBarLayout appBarLayout2, int i11) {
                    IsolatedMarginAccountDetailFragment.m18033u4(this.f18068a, strM56297b, appBarLayout2, i11);
                }
            });
        }
        C44835o5 c44835o5M18037c5 = m18037c4();
        if (c44835o5M18037c5 != null && (imageView = c44835o5M18037c5.f100556e) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.detail.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IsolatedMarginAccountDetailFragment.m18034v4(this.f18077b);
                }
            }, 1, null);
        }
        AssetFilterHelper.m16577f(AssetFilterHelper.f17335a, SharedPositionInfo.MARGIN_MODE_ISOLATED, null, 2, null);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<AccountDetailEntity>> mo16440r3(int i11, int i12) {
        this.f18065c0.clear();
        this.f18065c0.put("size", Integer.valueOf(i12));
        this.f18065c0.put("page", Integer.valueOf(i11));
        ArrayList<ParcelizePair> arrayListM18020d4 = m18020d4();
        ArrayList<ParcelizePair> arrayList = new ArrayList();
        for (Object obj : arrayListM18020d4) {
            if (!TextUtils.isEmpty(((ParcelizePair) obj).getValue())) {
                arrayList.add(obj);
            }
        }
        for (ParcelizePair parcelizePair : arrayList) {
            this.f18065c0.put(parcelizePair.getKey(), parcelizePair.getValue());
        }
        HashMap<String, Object> map = this.f18065c0;
        map.put("startAt", Long.valueOf(m18039f4(String.valueOf(map.get("time")))));
        this.f18065c0.put("endAt", this.f18066d0.f54265b);
        this.f18065c0.remove("time");
        Observable observableCompose = m18019b4().m17135h0(SharedPositionInfo.MARGIN_MODE_ISOLATED, this.f18065c0).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: t3 */
    public int mo15921t3() {
        return R$string.coin_detail_empty;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: v3 */
    public int mo15923v3() {
        return R$string.coin_no_more_data;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.item_base_account_detail;
    }

    @Override // com.kubi.assets.filter.IFilterDialogCallBack
    /* JADX INFO: renamed from: z */
    public void mo15926z(@NotNull List<ParcelizePair> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        super.mo15926z(result);
        m18020d4().clear();
        m18020d4().addAll(result);
        ArrayList<ParcelizePair> arrayListM18020d4 = m18020d4();
        SymbolInfoEntity symbolInfoEntityM18038e4 = m18038e4();
        String code = symbolInfoEntityM18038e4 != null ? symbolInfoEntityM18038e4.getCode() : null;
        if (code == null) {
            code = "";
        }
        arrayListM18020d4.add(new ParcelizePair("tag", code));
        mo15906F3();
    }

    /* JADX INFO: renamed from: Y3 */
    public static final AssetV2Api m18017Y3() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m18018a4(AccountDetailEntity accountDetailEntity, IsolatedMarginAccountDetailFragment isolatedMarginAccountDetailFragment) {
        AccountDetailEntity coinName = accountDetailEntity.setCoinName(accountDetailEntity.getCurrencyName(), accountDetailEntity.getCode());
        AssetsHelper assetsHelper = AssetsHelper.f18684a;
        Context context = isolatedMarginAccountDetailFragment.getContext();
        Intrinsics.checkNotNull(coinName);
        assetsHelper.m19168l(context, coinName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m18023k4(IsolatedMarginAccountDetailFragment isolatedMarginAccountDetailFragment, ArrayList arrayList) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        if (arrayList.size() >= 1) {
            Intrinsics.checkNotNull(arrayList);
            TradeItemBean tradeItemBean = (TradeItemBean) CollectionsKt.firstOrNull((List) arrayList);
            if (tradeItemBean != null) {
                C44835o5 c44835o5M18037c4 = isolatedMarginAccountDetailFragment.m18037c4();
                if (c44835o5M18037c4 != null && (baseTextView3 = c44835o5M18037c4.f100565n) != null) {
                    baseTextView3.setText(C37885i.m85563b(new BigDecimal(String.valueOf(tradeItemBean.getLastDealPrice())), tradeItemBean.getSymbol(), 0, 2, null));
                }
                C44835o5 c44835o5M18037c5 = isolatedMarginAccountDetailFragment.m18037c4();
                if (c44835o5M18037c5 != null && (baseTextView2 = c44835o5M18037c5.f100564m) != null) {
                    baseTextView2.setText(tradeItemBean.getFormatChangeRate());
                }
                C44835o5 c44835o5M18037c6 = isolatedMarginAccountDetailFragment.m18037c4();
                if (c44835o5M18037c6 != null && (baseTextView = c44835o5M18037c6.f100564m) != null) {
                    Context mContext = isolatedMarginAccountDetailFragment.mContext;
                    Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                    baseTextView.setTextColor(C22890g.m54279d(mContext, C27039d.m66646f(tradeItemBean.getChangeRate()), 0, 2, null));
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final void m18024l4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m18029q4(IsolatedMarginAccountDetailFragment isolatedMarginAccountDetailFragment, MarginPosition marginPosition) {
        Intrinsics.checkNotNull(marginPosition);
        isolatedMarginAccountDetailFragment.m18041i4(marginPosition);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r4 */
    public static final void m18030r4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m18031s4(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public static final void m18032t4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u4 */
    public static final void m18033u4(IsolatedMarginAccountDetailFragment isolatedMarginAccountDetailFragment, String str, AppBarLayout appBarLayout, int i11) {
        LinearLayoutCompat linearLayoutCompat;
        String showSymbol;
        if (isolatedMarginAccountDetailFragment.getView() == null) {
            return;
        }
        C44835o5 c44835o5M18037c4 = isolatedMarginAccountDetailFragment.m18037c4();
        if (c44835o5M18037c4 != null && (linearLayoutCompat = c44835o5M18037c4.f100555d) != null && Math.abs(i11) == linearLayoutCompat.getMeasuredHeight()) {
            NavigationBar navigationBar = isolatedMarginAccountDetailFragment.getNavigationBar();
            SymbolInfoEntity symbolInfoEntityM18038e4 = isolatedMarginAccountDetailFragment.m18038e4();
            if (symbolInfoEntityM18038e4 != null && (showSymbol = symbolInfoEntityM18038e4.getShowSymbol()) != null) {
                str = showSymbol;
            }
            navigationBar.setTitle(str);
            return;
        }
        isolatedMarginAccountDetailFragment.getNavigationBar().setTitle(str);
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m18034v4(final IsolatedMarginAccountDetailFragment isolatedMarginAccountDetailFragment) throws Exception {
        if (isolatedMarginAccountDetailFragment.getContext() != null) {
            AssetFilterHelper.f17335a.m16578e(SharedPositionInfo.MARGIN_MODE_ISOLATED, new Action() { // from class: com.kubi.assets.margin.isolated.detail.b
                @Override // io.reactivex.functions.Action
                public final void run() {
                    IsolatedMarginAccountDetailFragment.m18035w4(this.f18070b);
                }
            });
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: G3 */
    public void mo15907G3() {
        Context context = getContext();
        if (context != null) {
            this.f46495W.addHeaderView(new View(context));
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m18040g4(MarginPosition marginPosition) {
        BaseTextView baseTextView;
        String showSymbol;
        BaseTextView baseTextView2;
        int i11;
        C44835o5 c44835o5M18037c4 = m18037c4();
        if (c44835o5M18037c4 != null && (baseTextView2 = c44835o5M18037c4.f100570s) != null) {
            ViewExtKt.m66577h(baseTextView2);
            Boolean boolIsShowDirection = marginPosition.isShowDirection();
            if (boolIsShowDirection != null) {
                boolean zBooleanValue = boolIsShowDirection.booleanValue();
                ViewExtKt.m66594y(baseTextView2);
                if (zBooleanValue) {
                    i11 = R$string.multi;
                } else {
                    i11 = R$string.empty;
                }
                baseTextView2.setText(i11);
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                baseTextView2.setBackground(C22890g.m54283h(zBooleanValue, contextRequireContext));
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                baseTextView2.setTextColor(C22890g.m54281f(contextRequireContext2, zBooleanValue));
            }
        }
        C44835o5 c44835o5M18037c5 = m18037c4();
        if (c44835o5M18037c5 != null && (baseTextView = c44835o5M18037c5.f100569r) != null) {
            SymbolInfoEntity symbolInfoEntityM18038e4 = m18038e4();
            if (symbolInfoEntityM18038e4 != null) {
                showSymbol = symbolInfoEntityM18038e4.getShowSymbol();
            } else {
                showSymbol = null;
            }
            baseTextView.setText(C27041f.m66669i(showSymbol, "- -"));
        }
        C44835o5 c44835o5M18037c6 = m18037c4();
        if (c44835o5M18037c6 != null) {
            AssetsDepend assetsDepend = AssetsDepend.f18689a;
            IMarginService.m37899R(assetsDepend.m19183d(), c44835o5M18037c6.f100558g, this, C27041f.m66668h(marginPosition.getStatus()), C27039d.m66647g(marginPosition.calculatorLiabilityRate()), C27041f.m66668h(marginPosition.getRiskGrade()), m18038e4(), assetsDepend.m19183d().mo37963u0(true, C27041f.m66668h(marginPosition.getTag())), assetsDepend.m19183d().mo37962u(true, C27041f.m66668h(marginPosition.getTag())), true, null, false, 1536, null);
            c44835o5M18037c6.f100559h.m17993c(this, marginPosition);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final void m18041i4(final MarginPosition marginPosition) {
        Boolean boolValueOf;
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        KcPrimaryButton kcPrimaryButton3;
        KcPrimaryButton kcPrimaryButton4;
        KcPrimaryButton kcPrimaryButton5;
        BaseTextView baseTextView;
        String showSymbol;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        FrameLayout frameLayout;
        m18040g4(marginPosition);
        SymbolInfoEntity symbolInfoEntityM18038e4 = m18038e4();
        String code = null;
        if (symbolInfoEntityM18038e4 != null) {
            boolValueOf = Boolean.valueOf(symbolInfoEntityM18038e4.isIsolatedMarginTradeEnabled());
        } else {
            boolValueOf = null;
        }
        String str = "";
        if (C27025c.m66566d(boolValueOf)) {
            C44835o5 c44835o5M18037c4 = m18037c4();
            if (c44835o5M18037c4 != null && (frameLayout = c44835o5M18037c4.f100561j) != null) {
                ViewExtKt.m66594y(frameLayout);
            }
            C44835o5 c44835o5M18037c5 = m18037c4();
            if (c44835o5M18037c5 != null && (constraintLayout2 = c44835o5M18037c5.f100560i) != null) {
                ViewExtKt.m66594y(constraintLayout2);
            }
            C44835o5 c44835o5M18037c6 = m18037c4();
            if (c44835o5M18037c6 != null && (constraintLayout = c44835o5M18037c6.f100560i) != null) {
                C27046k.m66711z(constraintLayout, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.detail.c
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IsolatedMarginAccountDetailFragment.m18022j4(this.f18071b);
                    }
                }, 1, null);
            }
            C44835o5 c44835o5M18037c7 = m18037c4();
            if (c44835o5M18037c7 != null && (baseTextView = c44835o5M18037c7.f100566o) != null) {
                SymbolInfoEntity symbolInfoEntityM18038e5 = m18038e4();
                if (symbolInfoEntityM18038e5 != null) {
                    showSymbol = symbolInfoEntityM18038e5.getShowSymbol();
                } else {
                    showSymbol = null;
                }
                if (showSymbol == null) {
                    showSymbol = "";
                }
                baseTextView.setText(showSymbol);
            }
            AssetV2Api assetV2ApiM18019b4 = m18019b4();
            SymbolInfoEntity symbolInfoEntityM18038e6 = m18038e4();
            if (symbolInfoEntityM18038e6 != null) {
                code = symbolInfoEntityM18038e6.getCode();
            }
            if (code == null) {
                code = "";
            }
            Observable<R> observableCompose = assetV2ApiM18019b4.m17115a(code, "android/trade_info").compose(C24217a1.m58389m());
            final Function1 function1 = new Function1() { // from class: com.kubi.assets.margin.isolated.detail.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return IsolatedMarginAccountDetailFragment.m18023k4(this.f18072b, (ArrayList) obj);
                }
            };
            Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.assets.margin.isolated.detail.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    IsolatedMarginAccountDetailFragment.m18024l4(function1, obj);
                }
            }, new C24223c1(this));
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
        IMarginService iMarginServiceM19183d = AssetsDepend.f18689a.m19183d();
        String tag = marginPosition.getTag();
        if (tag != null) {
            str = tag;
        }
        if (iMarginServiceM19183d.mo37907F(str)) {
            C44835o5 c44835o5M18037c8 = m18037c4();
            if (c44835o5M18037c8 != null && (kcPrimaryButton5 = c44835o5M18037c8.f100567p) != null) {
                ViewExtKt.m66594y(kcPrimaryButton5);
            }
        } else {
            C44835o5 c44835o5M18037c9 = m18037c4();
            if (c44835o5M18037c9 != null && (kcPrimaryButton = c44835o5M18037c9.f100567p) != null) {
                ViewExtKt.m66577h(kcPrimaryButton);
            }
        }
        C44835o5 c44835o5M18037c10 = m18037c4();
        if (c44835o5M18037c10 != null && (kcPrimaryButton4 = c44835o5M18037c10.f100567p) != null) {
            C27046k.m66711z(kcPrimaryButton4, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.detail.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IsolatedMarginAccountDetailFragment.m18025m4(marginPosition);
                }
            }, 1, null);
        }
        C44835o5 c44835o5M18037c11 = m18037c4();
        if (c44835o5M18037c11 != null && (kcPrimaryButton3 = c44835o5M18037c11.f100563l) != null) {
            C27046k.m66711z(kcPrimaryButton3, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.detail.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IsolatedMarginAccountDetailFragment.m18026n4(marginPosition);
                }
            }, 1, null);
        }
        C44835o5 c44835o5M18037c12 = m18037c4();
        if (c44835o5M18037c12 != null && (kcPrimaryButton2 = c44835o5M18037c12.f100568q) != null) {
            C27046k.m66711z(kcPrimaryButton2, 0L, new Function0() { // from class: com.kubi.assets.margin.isolated.detail.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return IsolatedMarginAccountDetailFragment.m18027o4(this.f18076b);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onReBack() {
        super.onReBack();
        mo15906F3();
    }
}
