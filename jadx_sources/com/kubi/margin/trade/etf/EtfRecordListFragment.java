package com.kubi.margin.trade.etf;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.EtfRecord;
import com.kubi.margin.R$color;
import com.kubi.margin.R$id;
import com.kubi.margin.R$layout;
import com.kubi.margin.R$mipmap;
import com.kubi.margin.R$string;
import com.kubi.margin.trade.MarginConfigManager;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.drop.C23034a;
import com.kubi.resources.widget.drop.FilterType;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.sensorsdata.abtest.entity.AppConstants;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206dp.C36935r;
import p402kf.C41014a;
import p429lf.C42179a;
import p429lf.C42180b;
import p768xo.InterfaceC46301b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: EtfRecordListFragment.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 F2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020 H\u0014J\b\u0010&\u001a\u00020\u0010H\u0016J\u0012\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020 H\u0016J\u001a\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020.2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020$H\u0002J0\u00101\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f02j\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f`32\u0006\u00104\u001a\u000205H\u0002J0\u00106\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u000102j\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u0001`32\u0006\u00104\u001a\u000205H\u0002J\u0018\u00107\u001a\u00020(2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0002H\u0015J\u0012\u0010;\u001a\u00020 2\b\u0010<\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010=\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010>\u001a\u00020(H\u0016J\b\u0010?\u001a\u00020(H\u0016J\b\u0010@\u001a\u00020(H\u0016J&\u0010A\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020C\u0018\u00010B2\u0006\u0010D\u001a\u00020 2\u0006\u0010E\u001a\u00020 H\u0014R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u0011R#\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R*\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001bj\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f`\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$0#j\b\u0012\u0004\u0012\u00020$`%X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006G"}, m90084d2 = {"Lcom/kubi/margin/trade/etf/EtfRecordListFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/data/entity/EtfRecord;", "<init>", "()V", "bmarginFragmentEtfRecordListBinding", "Lcom/kubi/margin/databinding/BmarginFragmentEtfRecordListBinding;", "getBmarginFragmentEtfRecordListBinding", "()Lcom/kubi/margin/databinding/BmarginFragmentEtfRecordListBinding;", "bmarginFragmentEtfRecordListBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "timeType", "", "status", FirebaseAnalytics.Param.CURRENCY, "isSubList", "", "()Z", "isSubList$delegate", "Lkotlin/Lazy;", "api", "Lcom/kubi/margin/api/EtfApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/margin/api/EtfApi;", "api$delegate", "paramMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "beforeGet", "Lcom/kubi/utils/TimeUtils$BeforeGet;", "getLayout", "", "getItemLayout", "fundsList", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/CoinInfoEntity;", "Lkotlin/collections/ArrayList;", "needAutoLoad", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getPageSize", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "initCurrency", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "getNormalTimeTypeMap", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "context", "Landroid/content/Context;", "getStatusTypeMap", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "getFormatterStatusColor", "state", "getFormatterStatus", "refreshData", "showContent", "showEmpty", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "Companion", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEtfRecordListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtfRecordListFragment.kt\ncom/kubi/margin/trade/etf/EtfRecordListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,337:1\n147#2,16:338\n1#3:354\n13537#4,3:355\n774#5:358\n865#5,2:359\n1563#5:361\n1634#5,3:362\n*S KotlinDebug\n*F\n+ 1 EtfRecordListFragment.kt\ncom/kubi/margin/trade/etf/EtfRecordListFragment\n*L\n55#1:338,16\n193#1:355,3\n94#1:358\n94#1:359,2\n145#1:361\n145#1:362,3\n*E\n"})
public final class EtfRecordListFragment extends BasePagingFragment<EtfRecord> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f33893Z = C45681e.m100799e(this, new Function1<EtfRecordListFragment, C36935r>() { // from class: com.kubi.margin.trade.etf.EtfRecordListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36935r invoke(@NotNull EtfRecordListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36935r.m82739a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36935r, Unit>() { // from class: com.kubi.margin.trade.etf.EtfRecordListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36935r it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36935r c36935r) {
            invoke(c36935r);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public String f33894a0 = "ONE_WEEK";

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public String f33895b0 = "ALL";

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public String f33896c0 = "";

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f33897d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.etf.l
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(EtfRecordListFragment.m40328d4(this.f33912b));
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f33898e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.margin.trade.etf.m
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EtfRecordListFragment.m40324Q3();
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final HashMap<String, String> f33899f0 = new HashMap<>();

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public TimeUtils.C27004b f33900g0 = new TimeUtils.C27004b();

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final ArrayList<CoinInfoEntity> f33901h0 = new ArrayList<>();

    /* JADX INFO: renamed from: j0 */
    public static final /* synthetic */ KProperty<Object>[] f33892j0 = {Reflection.property1(new PropertyReference1Impl(EtfRecordListFragment.class, "bmarginFragmentEtfRecordListBinding", "getBmarginFragmentEtfRecordListBinding()Lcom/kubi/margin/databinding/BmarginFragmentEtfRecordListBinding;", 0))};

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f33891i0 = new Companion(null);

    /* JADX INFO: compiled from: EtfRecordListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/margin/trade/etf/EtfRecordListFragment$Companion;", "", "<init>", "()V", "TYPE_BUY", "", "TYPE_SELL", "newInstance", "Lcom/kubi/margin/trade/etf/EtfRecordListFragment;", "type", FirebaseAnalytics.Param.CURRENCY, "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ EtfRecordListFragment newInstance$default(Companion companion, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "0";
            }
            return companion.newInstance(str, str2);
        }

        @NotNull
        public final EtfRecordListFragment newInstance(@NotNull String type, @Nullable String currency) {
            Intrinsics.checkNotNullParameter(type, "type");
            Bundle bundle = new Bundle();
            bundle.putString("type", type);
            bundle.putString("coin", currency);
            EtfRecordListFragment etfRecordListFragment = new EtfRecordListFragment();
            etfRecordListFragment.setArguments(bundle);
            return etfRecordListFragment;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: B3 */
    public boolean mo21464B3() {
        return false;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        MarginConfigManager.m39812e1(MarginConfigManager.f33681a, "ETF", null, 2, null);
        C36935r c36935rM40335W3 = m40335W3();
        if (c36935rM40335W3 != null) {
            c36935rM40335W3.f81931e.setVisibility(0);
            C23034a c23034a = new C23034a();
            c23034a.m55160d(c36935rM40335W3.f81935i, c36935rM40335W3.f81931e);
            ArrayList arrayList = new ArrayList();
            String string = getString(R$string.time);
            FilterType.Companion companion = FilterType.f44543a;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            arrayList.add(new C23034a.a(string, companion.convert2Filter(m40338Z3(contextRequireContext), false)));
            String string2 = getString(R$string.status);
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            arrayList.add(new C23034a.a(string2, companion.convert2Filter(m40339a4(contextRequireContext2), true)));
            c23034a.m55164h(arrayList, new Consumer() { // from class: com.kubi.margin.trade.etf.i
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    EtfRecordListFragment.m40332h4(this.f33909b, (List) obj);
                }
            });
            if (this.f33901h0.isEmpty() && ((str = this.f33896c0) == null || str.length() == 0)) {
                preformBackPressed();
            } else {
                String str2 = this.f33896c0;
                if (str2 == null || str2.length() == 0) {
                    CoinInfoEntity coinInfoEntity = (CoinInfoEntity) CollectionsKt.firstOrNull((List) this.f33901h0);
                    if (coinInfoEntity != null) {
                        m40340b4(coinInfoEntity);
                    }
                } else {
                    CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(this.f33896c0);
                    if (coinInfoEntityM85613u != null) {
                        m40340b4(coinInfoEntityM85613u);
                    }
                }
            }
            ImageView ivLogo = c36935rM40335W3.f81930d;
            Intrinsics.checkNotNullExpressionValue(ivLogo, "ivLogo");
            BaseTextView tvCoinType = c36935rM40335W3.f81933g;
            Intrinsics.checkNotNullExpressionValue(tvCoinType, "tvCoinType");
            C27046k.m66681D(new View[]{ivLogo, tvCoinType}, new Function0() { // from class: com.kubi.margin.trade.etf.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EtfRecordListFragment.m40330f4(this.f33910b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m40325S3(final EtfRecordListFragment etfRecordListFragment, View view) throws Exception {
        MarginConfigManager.f33681a.m39887d1("ETF", new Consumer() { // from class: com.kubi.margin.trade.etf.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EtfRecordListFragment.m40326T3(this.f33915b, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m40326T3(EtfRecordListFragment etfRecordListFragment, String str) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.kc_trade_india_tax_title);
        String string = etfRecordListFragment.getString(R$string.common_tax_tips);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        AlertDialogFragmentHelper alertDialogFragmentHelperM54163T4 = alertDialogFragmentHelperM54167X4.m54156M4(C27041f.m66669i(str, string)).m54163T4(etfRecordListFragment.getString(R$string.i_already_know), null);
        FragmentManager childFragmentManager = etfRecordListFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54163T4.show(childFragmentManager, "tax_tip");
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m40329e4(EtfRecordListFragment etfRecordListFragment, List list) {
        etfRecordListFragment.f33901h0.clear();
        ArrayList<CoinInfoEntity> arrayList = etfRecordListFragment.f33901h0;
        Intrinsics.checkNotNull(list);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((CoinInfoEntity) obj).getCurrencyType(), "MARGIN_FUND")) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m40330f4(final EtfRecordListFragment etfRecordListFragment) {
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        ArrayList<CoinInfoEntity> arrayList = etfRecordListFragment.f33901h0;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (CoinInfoEntity coinInfoEntity : arrayList) {
            String currency = coinInfoEntity.getCurrency();
            Intrinsics.checkNotNullExpressionValue(currency, "getCurrency(...)");
            arrayList2.add(new SelectEntity(null, currency, null, null, coinInfoEntity.getIconUrl(), null, null, null, null, false, Intrinsics.areEqual(etfRecordListFragment.f33896c0, coinInfoEntity.getCode()), null, 3053, null));
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, arrayList2, new BiConsumer() { // from class: com.kubi.margin.trade.etf.p
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                EtfRecordListFragment.m40331g4(this.f33914b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = etfRecordListFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "dialog_lever_borrow_coin");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g4 */
    public static final void m40331g4(EtfRecordListFragment etfRecordListFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        CoinInfoEntity coinInfoEntity = etfRecordListFragment.f33901h0.get(baseViewHolder.getAdapterPosition());
        Intrinsics.checkNotNullExpressionValue(coinInfoEntity, "get(...)");
        etfRecordListFragment.m40340b4(coinInfoEntity);
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m40332h4(EtfRecordListFragment etfRecordListFragment, List iFilters) {
        Intrinsics.checkNotNullParameter(iFilters, "iFilters");
        etfRecordListFragment.f33894a0 = ((FilterType.InterfaceC23033b) iFilters.get(0)).getF44545b();
        etfRecordListFragment.f33895b0 = ((FilterType.InterfaceC23033b) iFilters.get(1)).getF44545b();
        etfRecordListFragment.mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        this.f33900g0 = new TimeUtils.C27004b();
        super.mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: R3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@NotNull BaseViewHolder helper, @NotNull EtfRecord item) {
        String strM92633f;
        String str;
        Context context;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.getView(R$id.tv_trade_type);
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) view;
        textView.setText(item.getBaseCurrencyName());
        C27046k.m66694i(textView, m40341c4() ? R$mipmap.kucoin_icon_in : R$mipmap.kucoin_icon_out, 0, GravityCompat.START, 2, null);
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "getCompoundDrawables(...)");
        int length = compoundDrawables.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            Drawable drawable = compoundDrawables[i11];
            int i13 = i12 + 1;
            if (i12 == 0 && drawable != null) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                drawable.setColorFilter(C22890g.m54281f(contextRequireContext, m40341c4()), PorterDuff.Mode.SRC_ATOP);
            }
            i11++;
            i12 = i13;
        }
        helper.setText(R$id.tv_percent_label, getString(R$string.etf_percent) + '(' + item.getBaseCurrencyName() + ')');
        int i14 = R$id.tv_amount_label;
        StringBuilder sb2 = new StringBuilder();
        int i15 = R$string.etf_buy_amount;
        sb2.append(getString(i15));
        sb2.append('(');
        sb2.append(item.getQuoteCurrencyName());
        sb2.append(')');
        helper.setText(i14, sb2.toString());
        helper.setText(R$id.tv_value_label, getString(R$string.etf_value_done) + '(' + item.getQuoteCurrencyName() + ')');
        int i16 = R$id.tv_fee_label;
        helper.setText(i16, getString(R$string.fee) + '(' + item.getQuoteCurrencyName() + ')');
        DashTextView dashTextView = (DashTextView) helper.getView(i16);
        if (!Intrinsics.areEqual(item.getTaxCurrency(), item.getQuoteCurrencyCode()) || C27039d.m66647g(item.getTaxAmount()) <= 0.0d) {
            dashTextView.setNeedDash(false);
            dashTextView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.margin.trade.etf.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    EtfRecordListFragment.m40327U3(view2);
                }
            });
        } else {
            dashTextView.setNeedDash(true);
            dashTextView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.margin.trade.etf.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) throws Exception {
                    EtfRecordListFragment.m40325S3(this.f33913b, view2);
                }
            });
        }
        int i17 = R$id.tv_confirm_time;
        Long confirmTime = item.getConfirmTime();
        if (confirmTime == null || (strM92633f = C42179a.m92633f(confirmTime.longValue(), null, false, true, null, 11, null)) == null) {
            strM92633f = "--";
        }
        helper.setText(i17, strM92633f);
        helper.setText(R$id.tv_time, C42179a.m92633f(C27039d.m66652l(item.getApplyTime()), null, false, true, null, 11, null));
        int i18 = R$id.tv_value;
        BigDecimal netAssetValue = item.getNetAssetValue();
        Integer numValueOf = null;
        helper.setText(i18, C27041f.m66669i(netAssetValue != null ? C42180b.m92640e(netAssetValue, null, 20, false, false, false, 0, null, 125, null) : null, "--"));
        int i19 = R$id.tv_amount;
        BigDecimal amount = item.getAmount();
        helper.setText(i19, C27041f.m66669i(amount != null ? C42180b.m92640e(amount, null, 20, false, false, false, 0, null, 125, null) : null, "--"));
        int i21 = R$id.tv_status;
        helper.setText(i21, m40336X3(item.getState()));
        StringBuilder sb3 = new StringBuilder();
        if (!m40341c4()) {
            i15 = R$string.etf_sell_amount;
        }
        sb3.append(getString(i15));
        sb3.append('(');
        sb3.append(item.getQuoteCurrencyName());
        sb3.append(')');
        helper.setText(i14, sb3.toString());
        helper.setTextColor(i21, m40337Y3(item.getState()));
        int i22 = R$id.tv_percent;
        StringBuilder sb4 = new StringBuilder();
        if (item.getSize() != null) {
            str = m40341c4() ? "+" : C33820nf.f71144W;
        } else {
            str = null;
        }
        sb4.append(C27041f.m66668h(str));
        BigDecimal size = item.getSize();
        sb4.append(C27041f.m66669i(size != null ? C42180b.m92640e(size, null, 20, false, false, false, 0, null, 125, null) : null, "--"));
        helper.setText(i22, sb4.toString());
        if (item.getFeeAmount() == null && item.getTaxAmount() == null) {
            helper.setText(R$id.tv_fee, "--");
        } else {
            int i23 = R$id.tv_fee;
            BigDecimal bigDecimalM89922G = C41014a.m89922G(item.getFeeAmount(), null, 1, null);
            BigDecimal bigDecimalM89922G2 = C41014a.m89922G(item.getTaxAmount(), null, 1, null);
            if (!Intrinsics.areEqual(item.getTaxCurrency(), item.getQuoteCurrencyCode())) {
                bigDecimalM89922G2 = BigDecimal.ZERO;
            }
            BigDecimal bigDecimalAdd = bigDecimalM89922G.add(bigDecimalM89922G2);
            Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
            helper.setText(i23, C42180b.m92640e(bigDecimalAdd, null, 20, false, false, false, 0, null, 125, null));
        }
        if (item.getSize() != null && (context = getContext()) != null) {
            numValueOf = Integer.valueOf(C22890g.m54281f(context, m40341c4()));
        }
        helper.setTextColor(i22, C27039d.m66651k(numValueOf, getColorRes(R$color.emphasis)));
    }

    /* JADX INFO: renamed from: V3 */
    public final InterfaceC46301b m40334V3() {
        return (InterfaceC46301b) this.f33898e0.getValue();
    }

    /* JADX INFO: renamed from: W3 */
    public final C36935r m40335W3() {
        return (C36935r) this.f33893Z.getValue(this, f33892j0[0]);
    }

    /* JADX INFO: renamed from: X3 */
    public final String m40336X3(String str) {
        int i11;
        if (Intrinsics.areEqual(str, "FAIL")) {
            i11 = m40341c4() ? R$string.etf_buy_fail : R$string.etf_sell_fail;
        } else if (Intrinsics.areEqual(str, "TO_BE_CONFIRMED")) {
            i11 = R$string.etf_wait_confirm;
        } else {
            i11 = m40341c4() ? R$string.etf_buy_ok : R$string.etf_sell_ok;
        }
        String string = getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: Y3 */
    public final int m40337Y3(String str) {
        int i11;
        if (Intrinsics.areEqual(str, AppConstants.AB_TEST_SUCCESS)) {
            i11 = R$color.emphasis;
        } else {
            i11 = Intrinsics.areEqual(str, "FAIL") ? R$color.secondary : R$color.complementary;
        }
        return getColorRes(i11);
    }

    /* JADX INFO: renamed from: Z3 */
    public final LinkedHashMap<String, String> m40338Z3(Context context) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("ONE_WEEK", context.getString(R$string.one_week));
        linkedHashMap.put("ONE_MONTH", context.getString(R$string.one_month));
        linkedHashMap.put("THREE_MONTH", context.getString(R$string.three_month));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: a4 */
    public final LinkedHashMap<String, String> m40339a4(Context context) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(AppConstants.AB_TEST_SUCCESS, context.getString(R$string.success));
        linkedHashMap.put("FAIL", context.getString(R$string.failed));
        linkedHashMap.put("TO_BE_CONFIRMED", context.getString(R$string.etf_wait_confirm));
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: c4 */
    public final boolean m40341c4() {
        return ((Boolean) this.f33897d0.getValue()).booleanValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bmargin_fragment_etf_record_list;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @Nullable
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<EtfRecord>> mo16440r3(int i11, int i12) {
        this.f33899f0.clear();
        this.f33899f0.put("baseCurrencyCode", this.f33896c0);
        this.f33899f0.put("beginTime", TimeUtils.m66421h(this.f33894a0, this.f33900g0));
        this.f33899f0.put("endTime", this.f33900g0.f54265b);
        this.f33899f0.put("state", Intrinsics.areEqual("ALL", this.f33895b0) ? "" : this.f33895b0);
        this.f33899f0.put("page", i11 + "");
        this.f33899f0.put("pageSize", i12 + "");
        return (m40341c4() ? m40334V3().m102057b(this.f33899f0) : m40334V3().m102056a(this.f33899f0)).compose(C24217a1.m58389m());
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.bmargin_item_view_etf_record;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: y3 */
    public int mo17296y3() {
        return 20;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final InterfaceC46301b m40324Q3() {
        return (InterfaceC46301b) C42597a.m93386b().create(InterfaceC46301b.class);
    }

    /* JADX INFO: renamed from: d4 */
    public static final boolean m40328d4(EtfRecordListFragment etfRecordListFragment) {
        String strM56239b0;
        Bundle arguments = etfRecordListFragment.getArguments();
        if (arguments != null) {
            strM56239b0 = RouteExKt.m56239b0(arguments, "type");
        } else {
            strM56239b0 = null;
        }
        return Intrinsics.areEqual(C27041f.m66669i(strM56239b0, "0"), "0");
    }

    /* JADX INFO: renamed from: b4 */
    public final void m40340b4(CoinInfoEntity coinInfoEntity) {
        ImageView imageView;
        BaseTextView baseTextView;
        String code = coinInfoEntity.getCode();
        Intrinsics.checkNotNullExpressionValue(code, "getCode(...)");
        this.f33896c0 = code;
        C36935r c36935rM40335W3 = m40335W3();
        if (c36935rM40335W3 != null) {
            imageView = c36935rM40335W3.f81930d;
        } else {
            imageView = null;
        }
        C24277v.m58542g(imageView, C27041f.m66668h(coinInfoEntity.getIconUrl()));
        C36935r c36935rM40335W4 = m40335W3();
        if (c36935rM40335W4 != null && (baseTextView = c36935rM40335W4.f81933g) != null) {
            baseTextView.setText(coinInfoEntity.getCurrency());
        }
        mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String strM56239b0;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            strM56239b0 = RouteExKt.m56239b0(arguments, "coin");
        } else {
            strM56239b0 = null;
        }
        this.f33896c0 = C27041f.m66668h(strM56239b0);
        C37890n.f85269a.mo85590a(new Consumer() { // from class: com.kubi.margin.trade.etf.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EtfRecordListFragment.m40329e4(this.f33911b, (List) obj);
            }
        });
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        FrameLayout frameLayout;
        super.showContent();
        C36935r c36935rM40335W3 = m40335W3();
        if (c36935rM40335W3 != null && (frameLayout = c36935rM40335W3.f81928b) != null) {
            frameLayout.setVisibility(8);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        FrameLayout frameLayout;
        showContent();
        C36935r c36935rM40335W3 = m40335W3();
        if (c36935rM40335W3 != null && (frameLayout = c36935rM40335W3.f81928b) != null) {
            frameLayout.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m40327U3(View view) {
    }
}
