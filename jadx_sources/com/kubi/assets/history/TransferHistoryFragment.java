package com.kubi.assets.history;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import com.blankj.utilcode.util.C5275i0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetV2Api;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.TransferHistoryEntity;
import com.kubi.assets.service.C10921d;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27014a1;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p013ab.C0226a;
import p429lf.C42179a;
import p569qq.C43852m;
import p637ta.C44855r4;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: TransferHistoryFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0010H\u0014J\b\u0010\u001e\u001a\u00020\u0010H\u0014J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\u0018\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0002H\u0014J\u0012\u0010$\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010&\u001a\u00020\u0018H\u0016J\b\u0010'\u001a\u00020\u0018H\u0014J$\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020/0.2\u0006\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0010H\u0014J\b\u00102\u001a\u00020\u0018H\u0016J\b\u00103\u001a\u00020\u0018H\u0016J\u001a\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u0002062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u00107\u001a\u00020\u00182\u0006\u00105\u001a\u000208H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R*\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060)j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, m90084d2 = {"Lcom/kubi/assets/history/TransferHistoryFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/assets/entity/TransferHistoryEntity;", "<init>", "()V", FirebaseAnalytics.Param.CURRENCY, "", "timeType", "assetApi", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getAssetApi", "()Lcom/kubi/assets/AssetV2Api;", "assetApi$delegate", "Lkotlin/Lazy;", "getPageSize", "", "binding", "Lcom/kubi/assets/databinding/KucoinFragmentInOutHisBinding;", "getBinding", "()Lcom/kubi/assets/databinding/KucoinFragmentInOutHisBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "needDefaultBackground", "", "getLayout", "getItemLayout", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "getAccountName", "accountType", "refreshData", "onReBack", "paramMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "beforeGet", "Lcom/kubi/utils/TimeUtils$BeforeGet;", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "showEmpty", "showContent", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "setDrawableAndTint", "Landroid/widget/TextView;", "Companion", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransferHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferHistoryFragment.kt\ncom/kubi/assets/history/TransferHistoryFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n147#2,16:219\n1#3:235\n*S KotlinDebug\n*F\n+ 1 TransferHistoryFragment.kt\ncom/kubi/assets/history/TransferHistoryFragment\n*L\n64#1:219,16\n*E\n"})
public final class TransferHistoryFragment extends BasePagingFragment<TransferHistoryEntity> {

    /* JADX INFO: renamed from: Z */
    @Nullable
    public String f17639Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public String f17640a0 = "ONE_DAY";

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f17641b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.history.y0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransferHistoryFragment.m17301L3();
        }
    });

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC24293a f17642c0 = C45681e.m100799e(this, new Function1<TransferHistoryFragment, C44855r4>() { // from class: com.kubi.assets.history.TransferHistoryFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C44855r4 invoke(@NotNull TransferHistoryFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C44855r4.m99234a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C44855r4, Unit>() { // from class: com.kubi.assets.history.TransferHistoryFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C44855r4 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C44855r4 c44855r4) {
            invoke(c44855r4);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final HashMap<String, String> f17643d0 = new HashMap<>();

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public TimeUtils.C27004b f17644e0 = new TimeUtils.C27004b();

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f17638g0 = {Reflection.property1(new PropertyReference1Impl(TransferHistoryFragment.class, "binding", "getBinding()Lcom/kubi/assets/databinding/KucoinFragmentInOutHisBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f17637f0 = new Companion(null);

    /* JADX INFO: compiled from: TransferHistoryFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/assets/history/TransferHistoryFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/assets/history/TransferHistoryFragment;", FirebaseAnalytics.Param.CURRENCY, "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final TransferHistoryFragment newInstance(@Nullable String currency) {
            Bundle bundle = new Bundle();
            bundle.putString("data", currency);
            TransferHistoryFragment transferHistoryFragment = new TransferHistoryFragment();
            transferHistoryFragment.setArguments(bundle);
            return transferHistoryFragment;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    /* JADX INFO: renamed from: O3 */
    private final AssetV2Api m17302O3() {
        return (AssetV2Api) this.f17641b0.getValue();
    }

    /* JADX INFO: renamed from: Q3 */
    public static final void m17303Q3(C44855r4 c44855r4, TransferHistoryFragment transferHistoryFragment, List iFilters) {
        Intrinsics.checkNotNullParameter(iFilters, "iFilters");
        String f44545b = ((FilterType.InterfaceC23033b) iFilters.get(0)).getF44545b();
        if (Intrinsics.areEqual(f44545b, "ALL") || TextUtils.isEmpty(f44545b)) {
            c44855r4.f100747m.setVisibility(0);
        } else if (!Intrinsics.areEqual(transferHistoryFragment.f17640a0, f44545b)) {
            c44855r4.f100747m.setVisibility(8);
        }
        transferHistoryFragment.f17640a0 = ((FilterType.InterfaceC23033b) iFilters.get(0)).getF44545b();
        c44855r4.f100746l.setText(((FilterType.InterfaceC23033b) iFilters.get(0)).getF44544a());
        transferHistoryFragment.mo15906F3();
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m17305S3(TransferHistoryFragment transferHistoryFragment, C44855r4 c44855r4, Intent intent) {
        if (intent != null) {
            CoinInfoEntity coinInfoEntity = (CoinInfoEntity) intent.getParcelableExtra(CoinInfoEntity.class.getName());
            String code = coinInfoEntity != null ? coinInfoEntity.getCode() : null;
            transferHistoryFragment.f17639Z = code;
            c44855r4.f100744j.setText(C10921d.m19190a(code));
            transferHistoryFragment.mo15906F3();
        }
    }

    /* JADX INFO: renamed from: T3 */
    private final void m17306T3(TextView textView) {
        C27014a1.m66505e(textView, R$drawable.ic_triangle_bottom_12, GravityCompat.END, C5275i0.m6236a(2.0f));
        C27046k.m66702q(textView, getColorRes(R$color.c_icon60));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        this.f17644e0 = new TimeUtils.C27004b();
        super.mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: M3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull TransferHistoryEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setText(R$id.tvFromAccount, m17308N3(item.getPayAccountType())).setText(R$id.tvToAccount, m17308N3(item.getRecAccountType())).setText(R$id.tv_coin_name, C10921d.m19190a(item.getCurrency())).setText(R$id.tv_amount, C37886j.m85578b(DowngradeExKt.m66535e(item.getAmount(), null, 1, null), item.getCurrency(), null, false, false, false, 0, null, 0, 254, null)).setText(R$id.tv_time, C42179a.m92633f(DowngradeExKt.m66546p(item.getCreatedTime(), 0L, 1, null), null, false, true, null, 11, null));
    }

    /* JADX INFO: renamed from: N3 */
    public final int m17308N3(String str) {
        AccountType accountTypeOfName = AccountType.INSTANCE.ofName(str);
        return C27039d.m66651k(accountTypeOfName != null ? Integer.valueOf(accountTypeOfName.getNickNameRes()) : null, R$string.other);
    }

    /* JADX INFO: renamed from: P3 */
    public final C44855r4 m17309P3() {
        return (C44855r4) this.f17642c0.getValue(this, f17638g0[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.kucoin_fragment_in_out_his;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C44855r4 c44855r4M17309P3 = m17309P3();
        if (c44855r4M17309P3 != null) {
            c44855r4M17309P3.f100741g.setVisibility(0);
            c44855r4M17309P3.f100741g.setNew(Boolean.TRUE);
            c44855r4M17309P3.f100746l.setText(getString(R$string.one_day));
            C23034a c23034a = new C23034a();
            c23034a.m55165i(R$color.c_text40);
            c23034a.m55160d(c44855r4M17309P3.f100746l, c44855r4M17309P3.f100741g);
            BaseTextView tvCoinType = c44855r4M17309P3.f100744j;
            Intrinsics.checkNotNullExpressionValue(tvCoinType, "tvCoinType");
            m17306T3(tvCoinType);
            ArrayList arrayList = new ArrayList();
            String string = getString(R$string.time);
            FilterType.Companion companion = FilterType.f44543a;
            Context context = getContext();
            arrayList.add(new C23034a.a(string, companion.convert2Filter(context != null ? FilterTimeHelper.f17645a.m17313d(context) : null, false)));
            c23034a.m55164h(arrayList, new Consumer() { // from class: com.kubi.assets.history.w0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TransferHistoryFragment.m17303Q3(c44855r4M17309P3, this, (List) obj);
                }
            });
            if (!TextUtils.isEmpty(this.f17639Z)) {
                c44855r4M17309P3.f100744j.setText(C10921d.m19190a(this.f17639Z));
            }
            BaseTextView tvCoinType2 = c44855r4M17309P3.f100744j;
            Intrinsics.checkNotNullExpressionValue(tvCoinType2, "tvCoinType");
            C27046k.m66711z(tvCoinType2, 0L, new Function0() { // from class: com.kubi.assets.history.x0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferHistoryFragment.m17304R3(this.f17714b, c44855r4M17309P3);
                }
            }, 1, null);
        }
        this.f46496X.getRecyclerView().setBackgroundResource(R$color.c_overlay);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<TransferHistoryEntity>> mo16440r3(int i11, int i12) {
        this.f17643d0.clear();
        if (!TextUtils.isEmpty(this.f17639Z)) {
            this.f17643d0.put(FirebaseAnalytics.Param.CURRENCY, C27041f.m66668h(this.f17639Z));
        }
        this.f17643d0.put("startAt", FilterTimeHelper.f17645a.m17312c(this.f17640a0, this.f17644e0));
        this.f17643d0.put("endAt", Intrinsics.areEqual("ALL", this.f17640a0) ? "" : this.f17644e0.f54265b);
        this.f17643d0.put("pageNo", i11 + "");
        this.f17643d0.put("pageSize", i12 + "");
        this.f17643d0.put("bizType", "TRANSFER");
        Observable observableCompose = m17302O3().m17129f0(this.f17643d0).compose(C24217a1.m58389m());
        Intrinsics.checkNotNullExpressionValue(observableCompose, "compose(...)");
        return observableCompose;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.bassets_item_transfer_his;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: y3 */
    public int mo17296y3() {
        return 20;
    }

    /* JADX INFO: renamed from: L3 */
    public static final AssetV2Api m17301L3() {
        return (AssetV2Api) C42597a.m93386b().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m17304R3(final TransferHistoryFragment transferHistoryFragment, final C44855r4 c44855r4) {
        Context context = transferHistoryFragment.getContext();
        if (context == null) {
            return Unit.INSTANCE;
        }
        transferHistoryFragment.startActivityWithResult(C0226a.m831a(context, 0), new Consumer() { // from class: com.kubi.assets.history.z0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TransferHistoryFragment.m17305S3(this.f17718b, c44855r4, (Intent) obj);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("data", "");
        } else {
            string = null;
        }
        this.f17639Z = string;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void onReBack() {
        mo15906F3();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        C43852m.m96595g("B1history", "RecordtransferHistory", "1", null, 8, null);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        LinearLayout linearLayout;
        super.showContent();
        C44855r4 c44855r4M17309P3 = m17309P3();
        if (c44855r4M17309P3 != null && (linearLayout = c44855r4M17309P3.f100738d) != null) {
            linearLayout.setVisibility(8);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        LinearLayout linearLayout;
        showContent();
        C44855r4 c44855r4M17309P3 = m17309P3();
        if (c44855r4M17309P3 != null && (linearLayout = c44855r4M17309P3.f100738d) != null) {
            linearLayout.setVisibility(0);
        }
    }
}
