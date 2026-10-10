package com.kubi.kumex.record;

import am.HistoryProfitParams;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.core.os.BundleKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.MultiBizType;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.share.PositionPnlShare;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.assets.model.ProfitRecordEntity;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.kumex.dialog.BaseTime;
import com.kubi.kumex.dialog.SelectMenuDialog;
import com.kubi.kumex.dialog.SelectObject;
import com.kubi.kumex.dialog.TimeMenuDialog;
import com.kubi.kumex.trade.CommonDecoration;
import com.kubi.kumex.utils.ViewExKt;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.BasePageAdapter;
import com.kubi.sdk.BasePageFragment;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.PageEntity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36749d3;
import hb0.InterfaceC38162f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import jb0.InterfaceC40373g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p595rg.InterfaceC44074b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: ProfitRecordFragment.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010#\u001a\u00020!H\u0016J\n\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0002H\u0016J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'H\u0016J\b\u0010,\u001a\u00020!H\u0002J\u0010\u0010\u0013\u001a\u00020!2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020!2\u0006\u0010-\u001a\u00020.H\u0002J\u0018\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012*\b\u0012\u0004\u0012\u0002010\u0012H\u0002J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016¨\u00066"}, m90084d2 = {"Lcom/kubi/kumex/record/ProfitRecordFragment;", "Lcom/kubi/sdk/BasePageFragment;", "", "<init>", "()V", "bkumexFragmentProfitRecordBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentProfitRecordBinding;", "getBkumexFragmentProfitRecordBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentProfitRecordBinding;", "bkumexFragmentProfitRecordBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "filter", "Lcom/kubi/kumex/record/ProfitFilterArgs;", "getFilter", "()Lcom/kubi/kumex/record/ProfitFilterArgs;", "filter$delegate", "Lkotlin/Lazy;", "lastPageEntity", "Lcom/kubi/sdk/PageEntity;", FirebaseAnalytics.Event.SHARE, "Lcom/kubi/futures/share/PositionPnlShare;", "getShare", "()Lcom/kubi/futures/share/PositionPnlShare;", "share$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "refresh", "getPageList", "Landroidx/recyclerview/widget/RecyclerView;", "getItemKey", "", "it", "fetchPageData", "page", "size", "initListener", "data", "Lcom/kubi/kumex/record/ProfitRecordObject;", "navigationDetailsPage", "toDisplayList", "Lcom/kubi/kumex/data/assets/model/ProfitRecordEntity;", "buildContractData", "", "Lcom/kubi/kumex/dialog/SelectObject;", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nProfitRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfitRecordFragment.kt\ncom/kubi/kumex/record/ProfitRecordFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,343:1\n147#2,16:344\n1563#3:360\n1634#3,3:361\n1056#3:364\n774#3:365\n865#3,2:366\n1563#3:368\n1634#3,3:369\n*S KotlinDebug\n*F\n+ 1 ProfitRecordFragment.kt\ncom/kubi/kumex/record/ProfitRecordFragment\n*L\n60#1:344,16\n234#1:360\n234#1:361,3\n246#1:364\n248#1:365\n248#1:366,2\n254#1:368\n254#1:369,3\n*E\n"})
public final class ProfitRecordFragment extends BasePageFragment<Object> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f29915X;

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f29916Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public PageEntity<Object> f29917Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f29918a0;

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f29914c0 = {Reflection.property1(new PropertyReference1Impl(ProfitRecordFragment.class, "bkumexFragmentProfitRecordBinding", "getBkumexFragmentProfitRecordBinding()Lcom/kubi/kumex/databinding/BkumexFragmentProfitRecordBinding;", 0))};

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f29913b0 = new Companion(null);

    /* JADX INFO: compiled from: ProfitRecordFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/record/ProfitRecordFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kumex/record/ProfitRecordFragment;", "bundle", "Landroid/os/Bundle;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ProfitRecordFragment newInstance(@Nullable Bundle bundle) {
            ProfitRecordFragment profitRecordFragment = new ProfitRecordFragment();
            profitRecordFragment.setArguments(bundle);
            return profitRecordFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.ProfitRecordFragment$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ProfitRecordFragment.kt\ncom/kubi/kumex/record/ProfitRecordFragment\n*L\n1#1,328:1\n247#2:329\n*E\n"})
    public static final class C16535a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((ContractEntity) t11).getSettleCurrency(), ((ContractEntity) t12).getSettleCurrency());
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.record.ProfitRecordFragment$b */
    /* JADX INFO: compiled from: ProfitRecordFragment.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/kumex/record/ProfitRecordFragment$initListener$adapter$1", "Lcom/kubi/sdk/ItemCallBack;", "Lcom/kubi/kumex/record/ProfitRecordObject;", TUIConstants.TUIChat.CALL_BACK, "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "pos", "", "data", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16536b implements ItemCallBack<ProfitRecordObject> {
        public C16536b() {
        }

        @Override // com.kubi.sdk.ItemCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo24515a(View view, int i11, ProfitRecordObject data) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(data, "data");
            if (view.getId() == R$id.share) {
                ProfitRecordFragment.this.m35240Y3(data);
            } else {
                ProfitRecordFragment.this.m35239X3(data);
            }
        }
    }

    public ProfitRecordFragment() {
        super(false);
        this.f29915X = C45681e.m100799e(this, new Function1<ProfitRecordFragment, C36749d3>() { // from class: com.kubi.kumex.record.ProfitRecordFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C36749d3 invoke(@NotNull ProfitRecordFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C36749d3.m82349a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C36749d3, Unit>() { // from class: com.kubi.kumex.record.ProfitRecordFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C36749d3 it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C36749d3 c36749d3) {
                invoke(c36749d3);
                return Unit.INSTANCE;
            }
        });
        this.f29916Y = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.z0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitRecordFragment.m35228K3(this.f30374b);
            }
        });
        this.f29918a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.kumex.record.a1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitRecordFragment.m35241Z3();
            }
        });
    }

    @Override // com.kubi.sdk.BasePageFragment
    /* JADX INFO: renamed from: B0 */
    public void mo25620B0() {
        this.f29917Z = null;
        super.mo25620B0();
    }

    /* JADX INFO: renamed from: K3 */
    public static final ProfitFilterArgs m35228K3(ProfitRecordFragment profitRecordFragment) {
        Bundle arguments = profitRecordFragment.getArguments();
        String strM56239b0 = arguments != null ? RouteExKt.m56239b0(arguments, "symbol") : null;
        Bundle arguments2 = profitRecordFragment.getArguments();
        return new ProfitFilterArgs(strM56239b0, arguments2 != null ? RouteExKt.m56239b0(arguments2, "coin") : null, null, 4, null);
    }

    /* JADX INFO: renamed from: N3 */
    private final PositionPnlShare m35229N3() {
        return (PositionPnlShare) this.f29918a0.getValue();
    }

    /* JADX INFO: renamed from: O3 */
    private final void m35230O3() {
        final C36749d3 c36749d3M35247L3;
        Context context = getContext();
        if (context == null || (c36749d3M35247L3 = m35247L3()) == null) {
            return;
        }
        if (TextUtils.isEmpty(m35248M3().getF30328b())) {
            BaseTextView title = c36749d3M35247L3.f79918f;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C27046k.m66684G(title, false);
            BaseTextView contract = c36749d3M35247L3.f79914b;
            Intrinsics.checkNotNullExpressionValue(contract, "contract");
            C27046k.m66684G(contract, true);
            ViewGroup.LayoutParams layoutParams = c36749d3M35247L3.f79914b.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(21);
            layoutParams2.addRule(20);
            BaseTextView time = c36749d3M35247L3.f79917e;
            Intrinsics.checkNotNullExpressionValue(time, "time");
            C27046k.m66684G(time, true);
        } else {
            BaseTextView title2 = c36749d3M35247L3.f79918f;
            Intrinsics.checkNotNullExpressionValue(title2, "title");
            C27046k.m66684G(title2, true);
            c36749d3M35247L3.f79918f.setText(getString(R$string.settlement_stub, C27041f.m66677q(m35248M3().getF30328b())));
            BaseTextView contract2 = c36749d3M35247L3.f79914b;
            Intrinsics.checkNotNullExpressionValue(contract2, "contract");
            C27046k.m66684G(contract2, true);
            BaseTextView time2 = c36749d3M35247L3.f79917e;
            Intrinsics.checkNotNullExpressionValue(time2, "time");
            C27046k.m66684G(time2, false);
        }
        final SelectMenuDialog selectMenuDialog = new SelectMenuDialog(context, m35246J3(), new Function1() { // from class: com.kubi.kumex.record.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitRecordFragment.m35233R3(this.f30333b, obj);
            }
        });
        selectMenuDialog.m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.kumex.record.t0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ProfitRecordFragment.m35234S3(c36749d3M35247L3, this);
            }
        });
        c36749d3M35247L3.f79914b.setText(ProfitFilterArgs.m35812d(m35248M3(), false, 1, null));
        BaseTextView contract3 = c36749d3M35247L3.f79914b;
        Intrinsics.checkNotNullExpressionValue(contract3, "contract");
        ViewExtKt.m66575f(contract3, new Function1() { // from class: com.kubi.kumex.record.u0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitRecordFragment.m35235T3(c36749d3M35247L3, this, selectMenuDialog, (View) obj);
            }
        });
        final TimeMenuDialog timeMenuDialog = new TimeMenuDialog(context, new Function1() { // from class: com.kubi.kumex.record.v0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitRecordFragment.m35236U3(this.f30362b, (BaseTime) obj);
            }
        });
        timeMenuDialog.m96315Y(new PopupWindow.OnDismissListener() { // from class: com.kubi.kumex.record.w0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ProfitRecordFragment.m35237V3(c36749d3M35247L3, this);
            }
        });
        BaseTextView baseTextView = c36749d3M35247L3.f79917e;
        ProfitFilterArgs profitFilterArgsM35248M3 = m35248M3();
        String string = getString(R$string.time);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        baseTextView.setText(ProfitFilterArgs.m35811b(profitFilterArgsM35248M3, string, false, 2, null));
        BaseTextView time3 = c36749d3M35247L3.f79917e;
        Intrinsics.checkNotNullExpressionValue(time3, "time");
        ViewExtKt.m66575f(time3, new Function1() { // from class: com.kubi.kumex.record.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfitRecordFragment.m35238W3(c36749d3M35247L3, this, timeMenuDialog, (View) obj);
            }
        });
        c36749d3M35247L3.f79916d.setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.kumex.record.y0
            @Override // jb0.InterfaceC40373g
            /* JADX INFO: renamed from: a */
            public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                ProfitRecordFragment.m35231P3(this.f30370b, c36749d3M35247L3, interfaceC38162f);
            }
        });
        c36749d3M35247L3.f79915c.setAdapter(BasePageAdapter.a.m57044c(BasePageAdapter.a.m57044c(new BasePageAdapter.a(), CommonFootObject.class, CommonFootObjectProxy.class, null, null, 12, null), ProfitRecordObject.class, ProfitRecordObjectProxy.class, new C16536b(), null, 8, null).m57045a(new ProfitDiffCallBack()));
        RecyclerView list = c36749d3M35247L3.f79915c;
        Intrinsics.checkNotNullExpressionValue(list, "list");
        ViewExKt.m36476b(list);
        c36749d3M35247L3.f79915c.addItemDecoration(new CommonDecoration(0, 0, (int) C27025c.m66565c(context, 16), (int) C27025c.m66565c(context, 16), 3, null));
        c36749d3M35247L3.f79915c.setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m35231P3(final ProfitRecordFragment profitRecordFragment, final C36749d3 c36749d3, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        profitRecordFragment.mo25620B0();
        BaseFragment.runOnUiThread$default(profitRecordFragment, new Function0() { // from class: com.kubi.kumex.record.b1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProfitRecordFragment.m35232Q3(this.f29946b, c36749d3);
            }
        }, 1000L, null, 4, null);
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m35234S3(C36749d3 c36749d3, ProfitRecordFragment profitRecordFragment) {
        c36749d3.f79914b.setText(ProfitFilterArgs.m35812d(profitRecordFragment.m35248M3(), false, 1, null));
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m35235T3(C36749d3 c36749d3, ProfitRecordFragment profitRecordFragment, SelectMenuDialog selectMenuDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c36749d3.f79914b.setText(profitRecordFragment.m35248M3().m35815c(true));
        selectMenuDialog.mo54253b0(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m35236U3(ProfitRecordFragment profitRecordFragment, BaseTime it) {
        Intrinsics.checkNotNullParameter(it, "it");
        profitRecordFragment.m35248M3().m35821k(it);
        profitRecordFragment.mo25620B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final void m35237V3(C36749d3 c36749d3, ProfitRecordFragment profitRecordFragment) {
        c36749d3.f79917e.setText(ProfitFilterArgs.m35813i(profitRecordFragment.m35248M3(), false, 1, null));
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m35238W3(C36749d3 c36749d3, ProfitRecordFragment profitRecordFragment, TimeMenuDialog timeMenuDialog, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c36749d3.f79917e.setText(profitRecordFragment.m35248M3().m35819h(true));
        timeMenuDialog.m33650b1(it, profitRecordFragment.m35248M3().getF30329c());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public final void m35239X3(ProfitRecordObject profitRecordObject) {
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        companion.launch(contextRequireContext, ProfitDetailFragment.class, BundleKt.bundleOf(TuplesKt.m90091to("data", profitRecordObject.getF29936a())));
    }

    /* JADX INFO: renamed from: Z3 */
    public static final PositionPnlShare m35241Z3() {
        return new PositionPnlShare();
    }

    /* JADX INFO: renamed from: J3 */
    public final List<SelectObject> m35246J3() {
        List listSortedWith = CollectionsKt.sortedWith(RepositoryServiceLocator.f19236a.m20288g().mo25016k(), new C16535a());
        ArrayList<ContractEntity> arrayList = new ArrayList();
        Iterator it = listSortedWith.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (TextUtils.isEmpty(m35248M3().getF30328b()) ? true : Intrinsics.areEqual(((ContractEntity) next).getSettleCurrency(), m35248M3().getF30328b())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (ContractEntity contractEntity : arrayList) {
            arrayList2.add(new SelectObject(FuturesDisplayNameUtils.f22525a.m24440e(contractEntity), Intrinsics.areEqual(m35248M3().getF30327a(), contractEntity.getSymbol()), contractEntity));
        }
        List<SelectObject> mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
        mutableList.add(0, new SelectObject(C27017c.f54310a.m66516f(R$string.all, new Object[0]), m35248M3().getF30327a() == null, null, 4, null));
        return mutableList;
    }

    /* JADX INFO: renamed from: L3 */
    public final C36749d3 m35247L3() {
        return (C36749d3) this.f29915X.getValue(this, f29914c0[0]);
    }

    /* JADX INFO: renamed from: M3 */
    public final ProfitFilterArgs m35248M3() {
        return (ProfitFilterArgs) this.f29916Y.getValue();
    }

    @Override // com.kubi.sdk.BasePageFragment
    @NotNull
    /* JADX INFO: renamed from: o3 */
    public PageEntity<Object> mo24546o3(int i11, int i12) {
        InterfaceC44074b interfaceC44074bM20272m = MultiBizFacadeManager.f19232a.m20272m(MultiBizType.CLASSIC);
        String f30327a = m35248M3().getF30327a();
        String f30328b = m35248M3().getF30328b();
        long f28881a = m35248M3().getF30329c().getF28881a();
        long f28882b = m35248M3().getF30329c().getF28882b();
        PageEntity<Object> pageEntity = this.f29917Z;
        int iM66650j = C27039d.m66650j(pageEntity != null ? Integer.valueOf(pageEntity.getOffset()) : null);
        PageEntity<Object> pageEntity2 = this.f29917Z;
        PageEntity<Object> pageEntityM35242a4 = m35242a4(interfaceC44074bM20272m.mo83052K0(new HistoryProfitParams(f30327a, f30328b, i12, iM66650j, Long.valueOf(f28881a), Long.valueOf(f28882b), pageEntity2 != null ? Integer.valueOf(pageEntity2.getTrialOffset()) : null)));
        this.f29917Z = pageEntityM35242a4;
        return pageEntityM35242a4;
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_profit_record, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m35230O3();
    }

    @Override // com.kubi.sdk.BasePageFragment
    /* JADX INFO: renamed from: r3 */
    public int mo25626r3(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof ProfitRecordObject) {
            return C27039d.m66650j(((ProfitRecordObject) it).getF29936a().getOffset());
        }
        return -1;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m35232Q3(ProfitRecordFragment profitRecordFragment, C36749d3 c36749d3) {
        if (profitRecordFragment.getView() != null) {
            c36749d3.f79916d.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m35233R3(ProfitRecordFragment profitRecordFragment, Object obj) {
        ContractEntity contractEntity;
        ProfitFilterArgs profitFilterArgsM35248M3 = profitRecordFragment.m35248M3();
        String symbol = null;
        if (obj instanceof ContractEntity) {
            contractEntity = (ContractEntity) obj;
        } else {
            contractEntity = null;
        }
        if (contractEntity != null) {
            symbol = contractEntity.getSymbol();
        }
        profitFilterArgsM35248M3.m35820j(symbol);
        profitRecordFragment.mo25620B0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public final void m35240Y3(ProfitRecordObject profitRecordObject) {
        PositionPnlShare.m26542p(m35229N3(), this, profitRecordObject.getF29936a(), null, 4, null);
    }

    /* JADX INFO: renamed from: a4 */
    private final PageEntity<Object> m35242a4(PageEntity<ProfitRecordEntity> pageEntity) {
        List<ProfitRecordEntity> listM66560c = C27024b.m66560c(pageEntity.getItems());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM66560c, 10));
        for (ProfitRecordEntity profitRecordEntity : listM66560c) {
            profitRecordEntity.setMultiBizType(MultiBizType.CLASSIC);
            arrayList.add(new ProfitRecordObject(profitRecordEntity));
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (mutableList != null && !mutableList.isEmpty() && !pageEntity.getHasNext()) {
            mutableList.add(new CommonFootObject(null, 1, null));
        }
        return new PageEntity<>(mutableList, pageEntity.getHasNext(), pageEntity.getContext(), pageEntity.getOffset(), pageEntity.getTrialOffset(), null, 32, null);
    }

    @Override // com.kubi.sdk.BasePageFragment
    @Nullable
    /* JADX INFO: renamed from: s3 */
    public RecyclerView mo24547s3() {
        C36749d3 c36749d3M35247L3 = m35247L3();
        if (c36749d3M35247L3 != null) {
            return c36749d3M35247L3.f79915c;
        }
        return null;
    }
}
