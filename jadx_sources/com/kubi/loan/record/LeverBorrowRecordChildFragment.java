package com.kubi.loan.record;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.loan.R$color;
import com.kubi.loan.R$drawable;
import com.kubi.loan.R$id;
import com.kubi.loan.R$layout;
import com.kubi.loan.R$string;
import com.kubi.loan.entity.LeverBorrowPayed;
import com.kubi.loan.entity.LeverBorrowPaying;
import com.kubi.loan.repo.platform.IPlatformService;
import com.kubi.loan.trade.BorrowRepayFragment;
import com.kubi.loan.trade.MarginRepaySelectSymbolDialog;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37756h;
import gf.C37890n;
import io.InterfaceC38688a;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import jo.C40456g;
import mr.C42597a;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p406ko.C41086j;
import p429lf.C42180b;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
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
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: LeverBorrowRecordChildFragment.kt */
/* JADX INFO: loaded from: classes26.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001PB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010+\u001a\u00020\rH\u0014J\b\u0010,\u001a\u00020\rH\u0014J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00101\u001a\u00020.2\u0006\u00102\u001a\u0002032\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00104\u001a\u00020.H\u0016J\u001a\u00105\u001a\u00020.2\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0002H\u0014J$\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020;0:2\u0006\u0010<\u001a\u00020\r2\u0006\u0010=\u001a\u00020\rH\u0014J\b\u0010>\u001a\u00020.H\u0016J\b\u0010?\u001a\u00020.H\u0016J\b\u0010@\u001a\u00020.H\u0002J\b\u0010A\u001a\u00020.H\u0002J\b\u0010B\u001a\u00020.H\u0002J\b\u0010C\u001a\u00020.H\u0016J\u0010\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020#H\u0002J\u001c\u0010F\u001a\u00020.2\b\u0010G\u001a\u0004\u0018\u00010\u00122\b\u0010H\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010I\u001a\u00020.2\u0006\u0010J\u001a\u00020#H\u0002J\b\u0010K\u001a\u00020.H\u0002J\u0010\u0010L\u001a\u00020.2\b\u0010G\u001a\u0004\u0018\u00010\u0012J\u0010\u0010M\u001a\u00020.2\b\u0010H\u001a\u0004\u0018\u00010\u0012J\n\u0010N\u001a\u0004\u0018\u00010OH\u0002R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b \u0010\u001dR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b\"\u0010$R\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b(\u0010)¨\u0006Q"}, m90084d2 = {"Lcom/kubi/loan/record/LeverBorrowRecordChildFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Landroid/os/Parcelable;", "<init>", "()V", "mApi", "Lcom/kubi/loan/api/LoanApi;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/kubi/loan/api/LoanApi;", "mApi$delegate", "Lkotlin/Lazy;", "mType", "", "getMType", "()Ljava/lang/Integer;", "mType$delegate", "mCoin", "", "mSymbol", "bloanFragmentLeverRecordBorrowBinding", "Lcom/kubi/loan/databinding/BloanFragmentLeverRecordBorrowBinding;", "getBloanFragmentLeverRecordBorrowBinding", "()Lcom/kubi/loan/databinding/BloanFragmentLeverRecordBorrowBinding;", "bloanFragmentLeverRecordBorrowBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "codeTextView", "Landroid/widget/TextView;", "getCodeTextView", "()Landroid/widget/TextView;", "codeTextView$delegate", "resetBtn", "getResetBtn", "resetBtn$delegate", "isIsolated", "", "()Z", "isIsolated$delegate", "marginRepaySelectSymbolDialog", "Lcom/kubi/loan/trade/MarginRepaySelectSymbolDialog;", "getMarginRepaySelectSymbolDialog", "()Lcom/kubi/loan/trade/MarginRepaySelectSymbolDialog;", "marginRepaySelectSymbolDialog$delegate", "getLayout", "getItemLayout", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "showEmpty", "showContent", "updateHeaderUI", "showCodeTextUI", "showCodeDialog", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "updateCodeArrowUI", "isShow", "changeSymbolOrCoinAndUpdateUI", "coin", "symbol", "updateResetBtn", "enableReset", "traceClickCodeEvent", "onMarginCoinChanged", "onIsolatedSymbolChanged", "getParent", "Lcom/kubi/loan/record/OnSymbolOrCoinChange;", "Companion", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nLeverBorrowRecordChildFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LeverBorrowRecordChildFragment.kt\ncom/kubi/loan/record/LeverBorrowRecordChildFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,398:1\n147#2,16:399\n1#3:415\n1056#4:416\n*S KotlinDebug\n*F\n+ 1 LeverBorrowRecordChildFragment.kt\ncom/kubi/loan/record/LeverBorrowRecordChildFragment\n*L\n75#1:399,16\n145#1:416\n*E\n"})
public final class LeverBorrowRecordChildFragment extends BasePagingFragment<Parcelable> {

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public String f32447b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public String f32448c0;

    /* JADX INFO: renamed from: j0 */
    public static final /* synthetic */ KProperty<Object>[] f32444j0 = {Reflection.property1(new PropertyReference1Impl(LeverBorrowRecordChildFragment.class, "bloanFragmentLeverRecordBorrowBinding", "getBloanFragmentLeverRecordBorrowBinding()Lcom/kubi/loan/databinding/BloanFragmentLeverRecordBorrowBinding;", 0))};

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f32443i0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f32445Z = LazyKt.lazy(new Function0() { // from class: com.kubi.loan.record.r
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LeverBorrowRecordChildFragment.m37765z4();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f32446a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.loan.record.s
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LeverBorrowRecordChildFragment.m37717A4(this.f32474b);
        }
    });

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final InterfaceC24293a f32449d0 = C45681e.m100799e(this, new Function1<LeverBorrowRecordChildFragment, C40456g>() { // from class: com.kubi.loan.record.LeverBorrowRecordChildFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C40456g invoke(@NotNull LeverBorrowRecordChildFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C40456g.m89101a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C40456g, Unit>() { // from class: com.kubi.loan.record.LeverBorrowRecordChildFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C40456g it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C40456g c40456g) {
            invoke(c40456g);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f32450e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.loan.record.t
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LeverBorrowRecordChildFragment.m37754h4(this.f32475b);
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f32451f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.loan.record.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LeverBorrowRecordChildFragment.m37733M4(this.f32476b);
        }
    });

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f32452g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.loan.record.v
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(LeverBorrowRecordChildFragment.m37764y4(this.f32477b));
        }
    });

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final Lazy f32453h0 = LazyKt.lazy(new Function0() { // from class: com.kubi.loan.record.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LeverBorrowRecordChildFragment.m37718B4(this.f32478b);
        }
    });

    /* JADX INFO: compiled from: LeverBorrowRecordChildFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/loan/record/LeverBorrowRecordChildFragment$Companion;", "", "<init>", "()V", "TYPE_B_W_PAYING", "", "TYPE_B_I_PAYING", "TYPE_B_W_PAYED", "TYPE_B_I_PAYED", "newInstance", "Lcom/kubi/loan/record/LeverBorrowRecordChildFragment;", "type", "coin", "", "symbol", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ LeverBorrowRecordChildFragment newInstance$default(Companion companion, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                str = null;
            }
            if ((i12 & 4) != 0) {
                str2 = null;
            }
            return companion.newInstance(i11, str, str2);
        }

        @NotNull
        public final LeverBorrowRecordChildFragment newInstance(int type, @Nullable String coin, @Nullable String symbol) {
            LeverBorrowRecordChildFragment leverBorrowRecordChildFragment = new LeverBorrowRecordChildFragment();
            leverBorrowRecordChildFragment.setArguments(new C27051h().m66720d("type", type).m66724h("coin", coin).m66724h("symbol", symbol).m66717a());
            return leverBorrowRecordChildFragment;
        }
    }

    /* JADX INFO: renamed from: com.kubi.loan.record.LeverBorrowRecordChildFragment$a */
    /* JADX INFO: compiled from: Comparisons.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 LeverBorrowRecordChildFragment.kt\ncom/kubi/loan/record/LeverBorrowRecordChildFragment\n*L\n1#1,328:1\n145#2:329\n*E\n"})
    public static final class C17436a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return ComparisonsKt.compareValues(((LeverBorrowPaying) t11).getMaturityTime(), ((LeverBorrowPaying) t12).getMaturityTime());
        }
    }

    /* JADX INFO: renamed from: C4 */
    public static final void m37719C4(LeverBorrowRecordChildFragment leverBorrowRecordChildFragment, DialogInterface dialogInterface) {
        leverBorrowRecordChildFragment.m37771R4(false);
    }

    /* JADX INFO: renamed from: y4 */
    public static final boolean m37764y4(LeverBorrowRecordChildFragment leverBorrowRecordChildFragment) {
        return !CollectionsKt.contains(CollectionsKt.listOf((Object[]) new Integer[]{0, 2}), leverBorrowRecordChildFragment.m37778t4());
    }

    /* JADX INFO: renamed from: B4 */
    public static final MarginRepaySelectSymbolDialog m37718B4(final LeverBorrowRecordChildFragment leverBorrowRecordChildFragment) {
        MarginRepaySelectSymbolDialog marginRepaySelectSymbolDialog = new MarginRepaySelectSymbolDialog();
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_IS_ISOLATED", leverBorrowRecordChildFragment.m37763x4());
        marginRepaySelectSymbolDialog.setArguments(bundle);
        marginRepaySelectSymbolDialog.m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.loan.record.o
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                LeverBorrowRecordChildFragment.m37719C4(this.f32471b, dialogInterface);
            }
        });
        return marginRepaySelectSymbolDialog;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m37729K4(LeverBorrowRecordChildFragment leverBorrowRecordChildFragment) {
        leverBorrowRecordChildFragment.m37774g4("", "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m37731L4(LeverBorrowRecordChildFragment leverBorrowRecordChildFragment) {
        String symbol;
        SymbolInfoEntity symbolInfoEntityM93914o;
        C43852m.m96591c("B4cryptoPendingRepay", "repayAll", "1", null, 8, null);
        List data = leverBorrowRecordChildFragment.f46495W.getData();
        Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.kubi.loan.entity.LeverBorrowPaying>");
        List listSortedWith = CollectionsKt.sortedWith(data, new C17436a());
        if (listSortedWith.isEmpty()) {
            ToastCompat.m66437C(R$string.no_records);
        } else {
            Integer numM37778t4 = leverBorrowRecordChildFragment.m37778t4();
            String currency = null;
            if (numM37778t4 != null && numM37778t4.intValue() == 1) {
                String str = leverBorrowRecordChildFragment.f32448c0;
                if (str == null || (symbolInfoEntityM93914o = C42828b.m93914o(str)) == null || (symbol = symbolInfoEntityM93914o.getCode()) == null) {
                    symbol = ((LeverBorrowPaying) listSortedWith.get(0)).getSymbol();
                }
                String str2 = symbol;
                if (str2 != null) {
                    C37304a c37304a = C37304a.f82764a;
                    SymbolInfoEntity symbolInfoEntityM93914o2 = C42828b.m93914o(str2);
                    InterfaceC37756h.a.m85144b(c37304a, symbolInfoEntityM93914o2 != null ? symbolInfoEntityM93914o2.getQuoteCurrency() : null, str2, "repay", "isolated", C43852m.m96601m("B4cryptoPendingRepay", "repayAll", "1"), null, null, 96, null);
                }
            } else {
                String str3 = leverBorrowRecordChildFragment.f32447b0;
                String strM93912m = str3 != null ? C42828b.m93912m(str3) : null;
                if (strM93912m == null || strM93912m.length() == 0) {
                    currency = ((LeverBorrowPaying) listSortedWith.get(0)).getCurrency();
                } else {
                    String str4 = leverBorrowRecordChildFragment.f32447b0;
                    if (str4 != null) {
                        currency = C42828b.m93912m(str4);
                    }
                }
                String str5 = currency;
                if (str5 != null) {
                    InterfaceC37756h.a.m85144b(C37304a.f82764a, str5, null, "repay", "cross", C43852m.m96601m("B4cryptoPendingRepay", "repayAll", "1"), null, null, 98, null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O4 */
    public static final void m37736O4(LeverBorrowRecordChildFragment leverBorrowRecordChildFragment, String str, Bundle result) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(result, "result");
        leverBorrowRecordChildFragment.m37774g4(result.getString("coin"), result.getString("symbol"));
    }

    /* JADX INFO: renamed from: f4 */
    public static final void m37753f4(LeverBorrowPaying leverBorrowPaying, LeverBorrowRecordChildFragment leverBorrowRecordChildFragment, View view) {
        C43852m.m96591c("B4cryptoPendingRepay", "repay", "1", null, 8, null);
        C27051h c27051hM66724h = new C27051h().m66721e("item", leverBorrowPaying).m66724h("symbol", leverBorrowPaying != null ? leverBorrowPaying.getSymbol() : null).m66724h("coin", leverBorrowPaying != null ? leverBorrowPaying.getCurrency() : null).m66724h("bizType", "repay");
        Integer numM37778t4 = leverBorrowRecordChildFragment.m37778t4();
        Bundle bundleM66717a = c27051hM66724h.m66724h("positionType", (numM37778t4 != null && numM37778t4.intValue() == 1) ? "isolated" : "cross").m66724h("spm", C43852m.m96601m("B4cryptoPendingRepay", "repay", "1")).m66717a();
        BorrowRepayFragment.Companion companion = BorrowRepayFragment.W;
        Context mContext = leverBorrowRecordChildFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        Intrinsics.checkNotNull(bundleM66717a);
        companion.startFragment(mContext, bundleM66717a);
    }

    /* JADX INFO: renamed from: k4 */
    public static final BasePageEntity m37755k4(BasePageEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: renamed from: l4 */
    public static final BasePageEntity m37756l4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BasePageEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: m4 */
    public static final BasePageEntity m37757m4(BasePageEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: renamed from: n4 */
    public static final BasePageEntity m37758n4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BasePageEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: o4 */
    public static final BasePageEntity m37759o4(BasePageEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: renamed from: p4 */
    public static final BasePageEntity m37760p4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BasePageEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: q4 */
    public static final BasePageEntity m37761q4(BasePageEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }

    /* JADX INFO: renamed from: r4 */
    public static final BasePageEntity m37762r4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BasePageEntity) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: x4 */
    private final boolean m37763x4() {
        return ((Boolean) this.f32452g0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: D4 */
    public final void m37766D4(@Nullable final String str) {
        Flowable<R> flowableCompose = ((IPlatformService) C41086j.f91299a.m90077i(IPlatformService.class)).mo37797c(false).compose(C24217a1.m58386j());
        final Function1 function1 = new Function1() { // from class: com.kubi.loan.record.x
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeverBorrowRecordChildFragment.m37720E4(this.f32479b, str, (List) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.loan.record.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LeverBorrowRecordChildFragment.m37721F4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.loan.record.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeverBorrowRecordChildFragment.m37722G4(this.f32462b, (Throwable) obj);
            }
        };
        Disposable disposableSubscribe = flowableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.loan.record.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LeverBorrowRecordChildFragment.m37724H4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX INFO: renamed from: I4 */
    public final void m37767I4(@Nullable String str) {
        Object next;
        Iterator<T> it = C37890n.f85269a.m85616x().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((SymbolInfoEntity) next).getQuoteCurrency(), str));
        SymbolInfoEntity symbolInfoEntity = (SymbolInfoEntity) next;
        this.f32448c0 = symbolInfoEntity != null ? symbolInfoEntity.getCode() : null;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m37771R4(boolean z11) {
        int i11 = z11 ? R$drawable.ic_triangle_top_12 : R$drawable.ic_triangle_bottom_12;
        TextView textViewM37776j4 = m37776j4();
        if (textViewM37776j4 != null) {
            C27046k.m66694i(textViewM37776j4, i11, C5275i0.m6236a(6.0f), 0, 4, null);
        }
        TextView textViewM37776j5 = m37776j4();
        if (textViewM37776j5 != null) {
            C27046k.m66702q(textViewM37776j5, getColorRes(R$color.c_icon60));
        }
    }

    /* JADX INFO: renamed from: T4 */
    public final void m37773T4(boolean z11) {
        int color = z11 ? ContextCompat.getColor(this.mContext, R$color.brandGreen) : ContextCompat.getColor(this.mContext, R$color.c_text30);
        TextView textViewM37781w4 = m37781w4();
        if (textViewM37781w4 != null) {
            textViewM37781w4.setTextColor(color);
        }
        TextView textViewM37781w5 = m37781w4();
        if (textViewM37781w5 != null) {
            textViewM37781w5.setClickable(z11);
        }
    }

    /* JADX INFO: renamed from: g4 */
    public final void m37774g4(String str, String str2) {
        if (str != null) {
            this.f32447b0 = str;
            OnSymbolOrCoinChange onSymbolOrCoinChangeM37780v4 = m37780v4();
            if (onSymbolOrCoinChangeM37780v4 != null) {
                onSymbolOrCoinChangeM37780v4.mo37789A(this.f32447b0);
            }
        }
        if (str2 != null) {
            this.f32448c0 = str2;
            OnSymbolOrCoinChange onSymbolOrCoinChangeM37780v5 = m37780v4();
            if (onSymbolOrCoinChangeM37780v5 != null) {
                onSymbolOrCoinChangeM37780v5.mo37790F(this.f32448c0);
            }
        }
        m37772S4();
        mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.bloan_fragment_lever_record_borrow;
    }

    /* JADX INFO: renamed from: i4 */
    public final C40456g m37775i4() {
        return (C40456g) this.f32449d0.getValue(this, f32444j0[0]);
    }

    /* JADX INFO: renamed from: j4 */
    public final TextView m37776j4() {
        return (TextView) this.f32450e0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: o3 */
    public void mo16439o3(@NotNull BaseViewHolder helper, @Nullable Parcelable parcelable) {
        String strM66669i;
        BigDecimal rate;
        String currency;
        String currency2;
        String strM66669i2;
        BigDecimal rate2;
        String currency3;
        String currency4;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Integer numM37778t4 = m37778t4();
        String principalInterestIsolate = null;
        if ((numM37778t4 != null && numM37778t4.intValue() == 0) || (numM37778t4 != null && numM37778t4.intValue() == 1)) {
            final LeverBorrowPaying leverBorrowPaying = (LeverBorrowPaying) parcelable;
            int i11 = R$id.tv_code;
            Integer numM37778t5 = m37778t4();
            if (numM37778t5 != null && numM37778t5.intValue() == 0) {
                strM66669i2 = (leverBorrowPaying == null || (currency4 = leverBorrowPaying.getCurrency()) == null) ? null : C42828b.m93913n(currency4);
            } else {
                C37890n c37890n = C37890n.f85269a;
                String symbol = leverBorrowPaying != null ? leverBorrowPaying.getSymbol() : null;
                if (symbol == null) {
                    symbol = "";
                }
                SymbolInfoEntity symbolInfoEntityM85601B = c37890n.m85601B(symbol);
                String showSymbol = symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null;
                String symbol2 = leverBorrowPaying != null ? leverBorrowPaying.getSymbol() : null;
                strM66669i2 = C27041f.m66669i(showSymbol, StringsKt.replace$default(symbol2 == null ? "" : symbol2, C33820nf.f71144W, "/", false, 4, (Object) null));
            }
            helper.setText(i11, strM66669i2).setText(R$id.tv_coin_value, (leverBorrowPaying == null || (currency3 = leverBorrowPaying.getCurrency()) == null) ? null : C42828b.m93913n(currency3)).setText(R$id.tv_daily_value, C42180b.m92649n((leverBorrowPaying == null || (rate2 = leverBorrowPaying.getRate()) == null) ? null : C42180b.m92642g(rate2, null, null, 6, false, false, false, 27, null))).setText(R$id.tv_amount_value, leverBorrowPaying != null ? leverBorrowPaying.getLiabilityBalance() : null).setOnClickListener(R$id.tv_operate, new View.OnClickListener() { // from class: com.kubi.loan.record.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LeverBorrowRecordChildFragment.m37753f4(leverBorrowPaying, this, view);
                }
            });
            return;
        }
        if ((numM37778t4 != null && numM37778t4.intValue() == 2) || (numM37778t4 != null && numM37778t4.intValue() == 3)) {
            LeverBorrowPayed leverBorrowPayed = (LeverBorrowPayed) parcelable;
            BaseViewHolder visible = helper.setText(R$id.tv_amount_label, getString(R$string.cumulative_principal_interest)).setVisible(R$id.tv_operate, false);
            int i12 = R$id.tv_code;
            Integer numM37778t6 = m37778t4();
            if (numM37778t6 != null && numM37778t6.intValue() == 2) {
                strM66669i = (leverBorrowPayed == null || (currency2 = leverBorrowPayed.getCurrency()) == null) ? null : C42828b.m93913n(currency2);
            } else {
                C37890n c37890n2 = C37890n.f85269a;
                String symbol3 = leverBorrowPayed != null ? leverBorrowPayed.getSymbol() : null;
                if (symbol3 == null) {
                    symbol3 = "";
                }
                SymbolInfoEntity symbolInfoEntityM85601B2 = c37890n2.m85601B(symbol3);
                String showSymbol2 = symbolInfoEntityM85601B2 != null ? symbolInfoEntityM85601B2.getShowSymbol() : null;
                String symbol4 = leverBorrowPayed != null ? leverBorrowPayed.getSymbol() : null;
                strM66669i = C27041f.m66669i(showSymbol2, StringsKt.replace$default(symbol4 == null ? "" : symbol4, C33820nf.f71144W, "/", false, 4, (Object) null));
            }
            BaseViewHolder text = visible.setText(i12, strM66669i).setText(R$id.tv_coin_value, (leverBorrowPayed == null || (currency = leverBorrowPayed.getCurrency()) == null) ? null : C42828b.m93913n(currency)).setText(R$id.tv_daily_value, C42180b.m92649n((leverBorrowPayed == null || (rate = leverBorrowPayed.getRate()) == null) ? null : C42180b.m92642g(rate, null, null, 6, false, false, false, 27, null)));
            int i13 = R$id.tv_amount_value;
            Integer numM37778t7 = m37778t4();
            if (numM37778t7 != null && numM37778t7.intValue() == 2) {
                if (leverBorrowPayed != null) {
                    principalInterestIsolate = leverBorrowPayed.getPrincipalInterest();
                }
            } else if (leverBorrowPayed != null) {
                principalInterestIsolate = leverBorrowPayed.getPrincipalInterestIsolate();
            }
            text.setText(i13, principalInterestIsolate);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Integer numM37778t4;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C40456g c40456gM37775i4 = m37775i4();
        if (c40456gM37775i4 != null) {
            KcPrimaryButton kcPrimaryButton = c40456gM37775i4.f89791c;
            Integer numM37778t5 = m37778t4();
            kcPrimaryButton.setVisibility(((numM37778t5 != null && numM37778t5.intValue() == 0) || ((numM37778t4 = m37778t4()) != null && numM37778t4.intValue() == 1)) ? 0 : 8);
            KcPrimaryButton tvRepay = c40456gM37775i4.f89791c;
            Intrinsics.checkNotNullExpressionValue(tvRepay, "tvRepay");
            C27046k.m66711z(tvRepay, 0L, new Function0() { // from class: com.kubi.loan.record.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeverBorrowRecordChildFragment.m37731L4(this.f32460b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: s4 */
    public final InterfaceC38688a m37777s4() {
        return (InterfaceC38688a) this.f32445Z.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        super.showEmpty(R$string.no_records, R$drawable.ic2_common_empty);
    }

    /* JADX INFO: renamed from: t4 */
    public final Integer m37778t4() {
        return (Integer) this.f32446a0.getValue();
    }

    /* JADX INFO: renamed from: u4 */
    public final MarginRepaySelectSymbolDialog m37779u4() {
        return (MarginRepaySelectSymbolDialog) this.f32453h0.getValue();
    }

    /* JADX INFO: renamed from: w4 */
    public final TextView m37781w4() {
        return (TextView) this.f32451f0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.bloan_item_lever_record_borrow;
    }

    /* JADX INFO: renamed from: A4 */
    public static final Integer m37717A4(LeverBorrowRecordChildFragment leverBorrowRecordChildFragment) {
        Bundle arguments = leverBorrowRecordChildFragment.getArguments();
        if (arguments != null) {
            return Integer.valueOf(arguments.getInt("type"));
        }
        return null;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m37720E4(LeverBorrowRecordChildFragment leverBorrowRecordChildFragment, String str, List list) {
        String code;
        Object next;
        String currency;
        String quoteCurrency;
        SymbolInfoEntity symbolInfoEntityM93914o;
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        do {
            code = null;
            if (it.hasNext()) {
                next = it.next();
                currency = ((CoinInfoEntity) next).getCurrency();
                if (str != null && (symbolInfoEntityM93914o = C42828b.m93914o(str)) != null) {
                    quoteCurrency = symbolInfoEntityM93914o.getQuoteCurrency();
                } else {
                    quoteCurrency = null;
                }
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(currency, quoteCurrency));
        CoinInfoEntity coinInfoEntity = (CoinInfoEntity) next;
        if (coinInfoEntity != null) {
            code = coinInfoEntity.getCode();
        }
        leverBorrowRecordChildFragment.f32447b0 = code;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m37721F4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m37722G4(LeverBorrowRecordChildFragment leverBorrowRecordChildFragment, Throwable th2) {
        C44128b.m97261e(leverBorrowRecordChildFragment.getTAG(), "fetchCoinListData fail");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final void m37724H4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m37727J4(LeverBorrowRecordChildFragment leverBorrowRecordChildFragment) {
        leverBorrowRecordChildFragment.m37768N4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final TextView m37733M4(LeverBorrowRecordChildFragment leverBorrowRecordChildFragment) {
        LeverBorrowRecordPayingFragment leverBorrowRecordPayingFragment;
        Fragment parentFragment = leverBorrowRecordChildFragment.getParentFragment();
        if (parentFragment instanceof LeverBorrowRecordPayingFragment) {
            leverBorrowRecordPayingFragment = (LeverBorrowRecordPayingFragment) parentFragment;
        } else {
            leverBorrowRecordPayingFragment = null;
        }
        if (leverBorrowRecordPayingFragment == null) {
            return null;
        }
        return leverBorrowRecordPayingFragment.m37793n3();
    }

    /* JADX INFO: renamed from: h4 */
    public static final TextView m37754h4(LeverBorrowRecordChildFragment leverBorrowRecordChildFragment) {
        LeverBorrowRecordPayingFragment leverBorrowRecordPayingFragment;
        Fragment parentFragment = leverBorrowRecordChildFragment.getParentFragment();
        if (parentFragment instanceof LeverBorrowRecordPayingFragment) {
            leverBorrowRecordPayingFragment = (LeverBorrowRecordPayingFragment) parentFragment;
        } else {
            leverBorrowRecordPayingFragment = null;
        }
        if (leverBorrowRecordPayingFragment == null) {
            return null;
        }
        return leverBorrowRecordPayingFragment.m37792m3();
    }

    /* JADX INFO: renamed from: z4 */
    public static final InterfaceC38688a m37765z4() {
        return (InterfaceC38688a) C42597a.m93386b().create(InterfaceC38688a.class);
    }

    /* JADX INFO: renamed from: N4 */
    public final void m37768N4() {
        m37770Q4();
        getParentFragmentManager().setFragmentResultListener("data", this, new FragmentResultListener() { // from class: com.kubi.loan.record.p
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle) {
                LeverBorrowRecordChildFragment.m37736O4(this.f32472a, str, bundle);
            }
        });
        MarginRepaySelectSymbolDialog marginRepaySelectSymbolDialogM37779u4 = m37779u4();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        marginRepaySelectSymbolDialogM37779u4.show(parentFragmentManager, "MarginSelectSymbolDialog");
        m37771R4(true);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0057 A[PHI: r1
      0x0057: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:33:0x0054, B:45:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: P4 */
    public final void m37769P4() {
        Integer numM37778t4;
        Integer numM37778t5;
        SymbolInfoEntity symbolInfoEntityM93914o;
        Integer numM37778t6 = m37778t4();
        String showSymbol = null;
        String string = "";
        if ((numM37778t6 == null || numM37778t6.intValue() != 0) && ((numM37778t4 = m37778t4()) == null || numM37778t4.intValue() != 2)) {
            Integer numM37778t7 = m37778t4();
            if ((numM37778t7 != null && numM37778t7.intValue() == 1) || ((numM37778t5 = m37778t4()) != null && numM37778t5.intValue() == 3)) {
                String str = this.f32448c0;
                if (str != null && str.length() != 0) {
                    String str2 = this.f32448c0;
                    if (str2 != null && (symbolInfoEntityM93914o = C42828b.m93914o(str2)) != null) {
                        showSymbol = symbolInfoEntityM93914o.getShowSymbol();
                    }
                    if (showSymbol != null) {
                        string = showSymbol;
                    }
                } else {
                    string = getString(R$string.all);
                }
            }
        } else {
            String str3 = this.f32447b0;
            if (str3 != null && str3.length() != 0) {
                String str4 = this.f32447b0;
                if (str4 != null) {
                    showSymbol = C42828b.m93913n(str4);
                }
                if (showSymbol != null) {
                    string = showSymbol;
                }
            } else {
                string = getString(R$string.all);
            }
        }
        Intrinsics.checkNotNull(string);
        TextView textViewM37776j4 = m37776j4();
        if (textViewM37776j4 != null) {
            textViewM37776j4.setText(string);
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m37770Q4() {
        Integer numM37778t4;
        Integer numM37778t5;
        Integer numM37778t6 = m37778t4();
        if ((numM37778t6 == null || numM37778t6.intValue() != 2) && ((numM37778t4 = m37778t4()) == null || numM37778t4.intValue() != 3)) {
            Integer numM37778t7 = m37778t4();
            if ((numM37778t7 == null || numM37778t7.intValue() != 0) && ((numM37778t5 = m37778t4()) == null || numM37778t5.intValue() != 1)) {
                return;
            }
            C43852m.m96591c("B4cryptoPendingRepay", TtmlNode.COMBINE_ALL, "1", null, 8, null);
            return;
        }
        C43852m.m96591c("B4cryptoBorrowHistory", TtmlNode.COMBINE_ALL, "1", null, 8, null);
    }

    /* JADX INFO: renamed from: S4 */
    public final void m37772S4() {
        CharSequence text;
        m37769P4();
        TextView textViewM37776j4 = m37776j4();
        if (textViewM37776j4 != null) {
            text = textViewM37776j4.getText();
        } else {
            text = null;
        }
        m37773T4(!Intrinsics.areEqual(text, getString(R$string.all)));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        String string2;
        Integer numM37778t4;
        OnSymbolOrCoinChange onSymbolOrCoinChangeM37780v4;
        Integer numM37778t5;
        OnSymbolOrCoinChange onSymbolOrCoinChangeM37780v5;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null && (string = arguments.getString("coin")) != null) {
            Integer numM37778t6 = m37778t4();
            if (((numM37778t6 != null && numM37778t6.intValue() == 0) || ((numM37778t5 = m37778t4()) != null && numM37778t5.intValue() == 2)) && (onSymbolOrCoinChangeM37780v5 = m37780v4()) != null) {
                onSymbolOrCoinChangeM37780v5.mo37789A(string);
            }
        } else {
            string = null;
        }
        this.f32447b0 = string;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("symbol")) != null) {
            Integer numM37778t7 = m37778t4();
            if (((numM37778t7 != null && numM37778t7.intValue() == 1) || ((numM37778t4 = m37778t4()) != null && numM37778t4.intValue() == 3)) && (onSymbolOrCoinChangeM37780v4 = m37780v4()) != null) {
                onSymbolOrCoinChangeM37780v4.mo37790F(string2);
            }
            str = string2;
        }
        this.f32448c0 = str;
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        if (m37779u4().isAdded()) {
            m37779u4().dismiss();
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m37772S4();
        mo15906F3();
        TextView textViewM37776j4 = m37776j4();
        if (textViewM37776j4 != null) {
            C27046k.m66710y(textViewM37776j4, 1500L, new Function0() { // from class: com.kubi.loan.record.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeverBorrowRecordChildFragment.m37727J4(this.f32467b);
                }
            });
        }
        TextView textViewM37781w4 = m37781w4();
        if (textViewM37781w4 != null) {
            C27046k.m66710y(textViewM37781w4, 1500L, new Function0() { // from class: com.kubi.loan.record.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LeverBorrowRecordChildFragment.m37729K4(this.f32473b);
                }
            });
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<Parcelable>> mo16440r3(int i11, int i12) {
        SymbolInfoEntity symbolInfoEntityM93914o;
        SymbolInfoEntity symbolInfoEntityM93914o2;
        String strM93912m;
        String str;
        Integer numM37778t4 = m37778t4();
        String code = null;
        if (numM37778t4 != null && numM37778t4.intValue() == 0) {
            String str2 = this.f32447b0;
            if (str2 != null) {
                strM93912m = C42828b.m93912m(str2);
            } else {
                strM93912m = null;
            }
            if (strM93912m != null && strM93912m.length() != 0 && (str = this.f32447b0) != null) {
                code = C42828b.m93912m(str);
            }
            Observable<R> observableCompose = m37777s4().m87472f(code).compose(C24217a1.m58389m());
            final Function1 function1 = new Function1() { // from class: com.kubi.loan.record.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LeverBorrowRecordChildFragment.m37755k4((BasePageEntity) obj);
                }
            };
            Observable<BasePageEntity<Parcelable>> map = observableCompose.map(new Function() { // from class: com.kubi.loan.record.f
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return LeverBorrowRecordChildFragment.m37756l4(function1, obj);
                }
            });
            Intrinsics.checkNotNull(map);
            return map;
        }
        if (numM37778t4 != null && numM37778t4.intValue() == 2) {
            InterfaceC38688a interfaceC38688aM37777s4 = m37777s4();
            String str3 = this.f32447b0;
            if (str3 != null) {
                code = C42828b.m93912m(str3);
            }
            Observable<R> observableCompose2 = interfaceC38688aM37777s4.m87468b(code, i11, i12).compose(C24217a1.m58389m());
            final Function1 function2 = new Function1() { // from class: com.kubi.loan.record.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LeverBorrowRecordChildFragment.m37757m4((BasePageEntity) obj);
                }
            };
            Observable<BasePageEntity<Parcelable>> map2 = observableCompose2.map(new Function() { // from class: com.kubi.loan.record.h
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return LeverBorrowRecordChildFragment.m37758n4(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
            return map2;
        }
        if (numM37778t4 != null && numM37778t4.intValue() == 1) {
            InterfaceC38688a interfaceC38688aM37777s5 = m37777s4();
            String str4 = this.f32448c0;
            if (str4 != null && (symbolInfoEntityM93914o2 = C42828b.m93914o(str4)) != null) {
                code = symbolInfoEntityM93914o2.getCode();
            }
            Observable<R> observableCompose3 = interfaceC38688aM37777s5.m87474i(code).compose(C24217a1.m58389m());
            final Function1 function3 = new Function1() { // from class: com.kubi.loan.record.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LeverBorrowRecordChildFragment.m37759o4((BasePageEntity) obj);
                }
            };
            Observable<BasePageEntity<Parcelable>> map3 = observableCompose3.map(new Function() { // from class: com.kubi.loan.record.j
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return LeverBorrowRecordChildFragment.m37760p4(function3, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
            return map3;
        }
        InterfaceC38688a interfaceC38688aM37777s6 = m37777s4();
        String str5 = this.f32448c0;
        if (str5 != null && (symbolInfoEntityM93914o = C42828b.m93914o(str5)) != null) {
            code = symbolInfoEntityM93914o.getCode();
        }
        Observable<R> observableCompose4 = interfaceC38688aM37777s6.m87469c(code, i11, i12).compose(C24217a1.m58389m());
        final Function1 function4 = new Function1() { // from class: com.kubi.loan.record.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LeverBorrowRecordChildFragment.m37761q4((BasePageEntity) obj);
            }
        };
        Observable<BasePageEntity<Parcelable>> map4 = observableCompose4.map(new Function() { // from class: com.kubi.loan.record.m
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return LeverBorrowRecordChildFragment.m37762r4(function4, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        return map4;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        super.showContent();
        this.f46496X.setBackgroundColor(ContextCompat.getColor(this.mContext, R$color.c_overlay));
    }

    /* JADX INFO: renamed from: v4 */
    public final OnSymbolOrCoinChange m37780v4() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof OnSymbolOrCoinChange) {
            return (OnSymbolOrCoinChange) parentFragment;
        }
        return null;
    }
}
