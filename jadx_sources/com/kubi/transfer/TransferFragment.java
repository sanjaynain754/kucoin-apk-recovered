package com.kubi.transfer;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import c60.C4850d;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.data.BeepHelper;
import com.kubi.data.coin.AccountType;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.LeverBalance;
import com.kubi.margin.api.entity.MarginPosition;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.SimpleStateFragment;
import com.kubi.numeric.financial.widget.FinancialInputEditText;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.KcSmallSwitchButton;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.util.C24277v;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.transfer.entity.AccountCoin;
import com.kubi.transfer.entity.AccountInfos;
import com.kubi.transfer.entity.AccountItem;
import com.kubi.transfer.entity.RespMultiAccountBalance;
import com.kubi.transfer.entity.TransferAccountBalance;
import com.kubi.transfer.lib.R$color;
import com.kubi.transfer.lib.R$drawable;
import com.kubi.transfer.lib.R$id;
import com.kubi.transfer.lib.R$layout;
import com.kubi.transfer.lib.R$raw;
import com.kubi.transfer.lib.R$string;
import com.kubi.transfer.multiaccount.TransProDialogFragment;
import com.kubi.transfer.search.coin.SearchCoinFragment;
import com.kubi.transfer.search.symbol.SearchSymbolFragment;
import com.kubi.transfer.view.TransferAccountView;
import com.kubi.transfer.view.TransferAmountView;
import com.kubi.transfer.view.TransferCoinPairView;
import com.kubi.transfer.view.TransferCoinView;
import com.kubi.transfer.view.TransferTipView;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.api.IUserService;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import f00.C37304a;
import g00.InterfaceC37754f;
import g60.C37828d;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p208dr.InterfaceC36952a;
import p402kf.C41014a;
import p569qq.C43852m;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: TransferFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 V2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001VB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0012J\b\u0010\u001b\u001a\u00020\u0016H\u0014J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\f\u0010\u001f\u001a\u00020\u0016*\u00020 H\u0002J\f\u0010!\u001a\u00020\u0016*\u00020 H\u0002J\f\u0010\"\u001a\u00020\u0016*\u00020 H\u0002J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0012H\u0002J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0012H\u0002J\"\u0010&\u001a\u00020\u0016*\u00020 2\u0006\u0010'\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160)H\u0002J\b\u0010*\u001a\u00020\u0016H\u0002J\b\u0010+\u001a\u00020\u0016H\u0016J\b\u0010,\u001a\u00020\u0016H\u0002J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0012H\u0002J\b\u0010/\u001a\u00020\u0016H\u0002J\b\u00100\u001a\u00020\u0016H\u0002J\b\u00101\u001a\u00020\u0016H\u0002J\b\u00102\u001a\u00020\u0016H\u0014J\b\u00103\u001a\u00020\u0016H\u0002J\b\u00104\u001a\u00020\u0016H\u0002J\b\u00105\u001a\u00020\u0016H\u0002J\u0018\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0012H\u0002J\b\u0010:\u001a\u00020\u0016H\u0002J\u0010\u0010;\u001a\u00020\u00162\u0006\u0010<\u001a\u00020=H\u0014J:\u0010>\u001a\u00020\u00162\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00122\u0006\u0010B\u001a\u00020@2\u0006\u0010C\u001a\u00020@2\u0006\u0010D\u001a\u00020@2\b\u0010E\u001a\u0004\u0018\u00010FH\u0002J\"\u0010G\u001a\u00020\u00162\u0006\u0010?\u001a\u00020@2\u0006\u0010C\u001a\u00020@2\b\u0010E\u001a\u0004\u0018\u00010FH\u0002J\u001e\u0010M\u001a\u00020\u00162\u0006\u0010N\u001a\u00020@2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0PH\u0002J\"\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0S2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0S2\u0006\u0010U\u001a\u00020@R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010H\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00020J0I8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006W"}, m90084d2 = {"Lcom/kubi/transfer/TransferFragment;", "Lcom/kubi/mvi/state/SimpleStateFragment;", "Lcom/kubi/transfer/TransferStateContract$UIState;", "<init>", "()V", "binding", "Lcom/kubi/transfer/lib/databinding/BtransferFragmentTransferBinding;", "getBinding", "()Lcom/kubi/transfer/lib/databinding/BtransferFragmentTransferBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "transferHelper", "Lcom/kubi/transfer/TransferHelper;", "getTransferHelper", "()Lcom/kubi/transfer/TransferHelper;", "transferHelper$delegate", "Lkotlin/Lazy;", "isLiability", "", "getLayout", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showLoadingView", ViewProps.VISIBLE, "initView", "handleIsolateSelectItem", "textChange", "selectCoin", "handleSelectAccount", "Lcom/kubi/transfer/view/TransferAccountView;", "handleSelectFromAccount", "handleSelectToAccount", "switchTransferUI", "isChecked", "getBatchTransferData", "checkoutIsolatedAccount", "isFrom", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function0;", "confirm", "lazyLoad", "queryTip", "handleBatchTransfer", "it", "bindEvent", "hideTip", "clearInput", "bindState", "bindState3", "bindState2", "bindState1", "updateAccountInfo", "infos", "Lcom/kubi/transfer/entity/AccountInfos;", "isMultiAccountMode", "handleTip", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showMultiTransResultDialog", "amount", "", "isAllSucc", "succAccounts", "coin", "firstErrorMsg", "toAccountType", "Lcom/kubi/data/coin/AccountType;", "showTransferSuccessDialog", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/mvi/state/SimpleStateVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "showTransferDetailDialog", "inputAmount", "balanceList", "", "Lcom/kubi/transfer/entity/TransferAccountBalance;", "calculateEveryAmountTrans", "", "balanceInfoList", "remainAmount", "Companion", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTransferFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferFragment.kt\ncom/kubi/transfer/TransferFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,998:1\n147#2,16:999\n1#3:1015\n65#4,16:1016\n93#4,3:1032\n19#5,2:1035\n19#5,2:1037\n1563#6:1039\n1634#6,3:1040\n*S KotlinDebug\n*F\n+ 1 TransferFragment.kt\ncom/kubi/transfer/TransferFragment\n*L\n86#1:999,16\n205#1:1016,16\n205#1:1032,3\n868#1:1035,2\n934#1:1037,2\n984#1:1039\n984#1:1040,3\n*E\n"})
public final class TransferFragment extends SimpleStateFragment<UIState> {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f52525U = C45681e.m100799e(this, new Function1<TransferFragment, C4850d>() { // from class: com.kubi.transfer.TransferFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C4850d invoke(@NotNull TransferFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C4850d.m4977a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C4850d, Unit>() { // from class: com.kubi.transfer.TransferFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C4850d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4850d c4850d) {
            invoke(c4850d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f52526V = LazyKt.lazy(new Function0() { // from class: com.kubi.transfer.h0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TransferFragment.m64430n5();
        }
    });

    /* JADX INFO: renamed from: W */
    public boolean f52527W;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f52524Y = {Reflection.property1(new PropertyReference1Impl(TransferFragment.class, "binding", "getBinding()Lcom/kubi/transfer/lib/databinding/BtransferFragmentTransferBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f52523X = new Companion(null);

    /* JADX INFO: compiled from: TransferFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/transfer/TransferFragment$Companion;", "", "<init>", "()V", "PAGE_ID", "", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.transfer.TransferFragment$b */
    /* JADX INFO: compiled from: TextView.kt */
    /* JADX INFO: loaded from: classes51.dex */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 TransferFragment.kt\ncom/kubi/transfer/TransferFragment\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n208#2,32:98\n71#3:130\n77#4:131\n*E\n"})
    public static final class C26262b implements TextWatcher {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ EditText f52529c;

        public C26262b(EditText editText) {
            this.f52529c = editText;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            String string;
            C4850d c4850dM64464r4;
            TransferAmountView transferAmountView;
            KcPrimaryButton kcPrimaryButton;
            if (!TransferFragment.this.isAdded() || TransferFragment.this.getView() == null) {
                return;
            }
            if (s11 != null) {
                try {
                    string = s11.toString();
                } catch (Exception unused) {
                    return;
                }
            } else {
                string = null;
            }
            boolean z11 = (string == null || string.length() == 0) ? false : true;
            C4850d c4850dM64464r5 = TransferFragment.this.m64464r4();
            if (c4850dM64464r5 != null && (kcPrimaryButton = c4850dM64464r5.f4959m) != null) {
                kcPrimaryButton.setEnabled(z11);
            }
            double dM66647g = z11 ? C27039d.m66647g(((FinancialInputEditText) this.f52529c).getBigDecimalValue()) : 0.0d;
            C4850d c4850dM64464r6 = TransferFragment.this.m64464r4();
            if (c4850dM64464r6 != null && (transferAmountView = c4850dM64464r6.f4954h) != null) {
                CoinInfoEntity coinInfo = TransferFragment.m64406Y3(TransferFragment.this).getCoinInfo();
                transferAmountView.setLegalPrice(C41014a.m89948v(C41014a.m89939m(dM66647g, coinInfo != null ? coinInfo.getCode() : null), null, null, 0, false, true, false, 47, null));
            }
            if (!z11 || (c4850dM64464r4 = TransferFragment.this.m64464r4()) == null) {
                return;
            }
            String f52960p = c4850dM64464r4.f4954h.getF52960p();
            double dM66538h = C26268b.m64512a(f52960p) ? DowngradeExKt.m66538h(f52960p, 0.0d, 1, null) : 0.0d;
            if (dM66647g > dM66538h) {
                TransferFragment transferFragment = TransferFragment.this;
                transferFragment.showToast(transferFragment.getString(R$string.balance_insufficient));
                ((FinancialInputEditText) this.f52529c).setBigDecimalValue(C27041f.m66668h(C27039d.m66655o(dM66538h)));
                EditText editText = this.f52529c;
                editText.setSelection(((FinancialInputEditText) editText).getRawInput().length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.transfer.TransferFragment$a */
    /* JADX INFO: compiled from: TransferFragment.kt */
    /* JADX INFO: loaded from: classes51.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C26261a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.ISOLATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountType.MARGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountType.CONTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX INFO: renamed from: A4 */
    public static final Unit m64365A4(boolean z11, AccountType accountType, final TransferFragment transferFragment, TransferAccountView transferAccountView, final boolean z12, final List sortedAccounts, final AccountItem accountItem, boolean z13) {
        Intrinsics.checkNotNullParameter(sortedAccounts, "sortedAccounts");
        if (z13 || z11 != z12) {
            if ((accountItem != null ? accountItem.getAccountType() : null) == AccountType.ISOLATED) {
                transferFragment.m64460m4(transferAccountView, false, new Function0() { // from class: com.kubi.transfer.d0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TransferFragment.m64367B4(this.f52660b, z12, sortedAccounts, accountItem);
                    }
                });
            } else {
                transferFragment.sendIntent(new TransferStateContract$UiIntent.MultiAccountDialogCloseEvent(false, z12, sortedAccounts, accountItem));
            }
        } else {
            if (accountType == (accountItem != null ? accountItem.getAccountType() : null)) {
                TransferLog.f52948a.m64781c("选择前后一样，不做请求");
            } else {
                if ((accountItem != null ? accountItem.getAccountType() : null) == AccountType.ISOLATED) {
                    transferFragment.m64460m4(transferAccountView, false, new Function0() { // from class: com.kubi.transfer.d0
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TransferFragment.m64367B4(this.f52660b, z12, sortedAccounts, accountItem);
                        }
                    });
                } else {
                    transferFragment.sendIntent(new TransferStateContract$UiIntent.MultiAccountDialogCloseEvent(false, z12, sortedAccounts, accountItem));
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m64367B4(TransferFragment transferFragment, boolean z11, List list, AccountItem accountItem) {
        transferFragment.sendIntent(new TransferStateContract$UiIntent.MultiAccountDialogCloseEvent(false, z11, list, accountItem));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m64389N4(Throwable th2) {
        TransferLog.f52948a.m64779a("获取全仓账户信息失败：" + th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static final void m64397S4(TransferFragment transferFragment, Intent intent) {
        C4850d c4850dM64464r4;
        if (intent != null) {
            String name = AccountCoin.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String strM56237a0 = RouteExKt.m56237a0(intent, name);
            if (strM56237a0 == null || (c4850dM64464r4 = transferFragment.m64464r4()) == null || c4850dM64464r4.f4953g == null) {
                return;
            }
            transferFragment.sendIntent(new TransferStateContract$UiIntent.UpdateCoinInfo(strM56237a0, false, 2, null));
        }
    }

    /* JADX INFO: renamed from: V4 */
    public static final CharSequence m64401V4(TransferFragment transferFragment, String accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        AccountType accountTypeOfName = AccountType.INSTANCE.ofName(accountType);
        if (accountTypeOfName == null) {
            accountTypeOfName = AccountType.UNKNOWN;
        }
        String string = transferFragment.getString(accountTypeOfName.getStrRes());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m64403W4(String str, String str2, String str3, final AccountType accountType, BaseViewHolder helper, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        helper.setText(R$id.transSuccAccounts, str);
        helper.setText(R$id.transAmount, str2 + ' ' + str3);
        helper.getView(R$id.btnOk).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.transfer.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferFragment.m64405X4(dialogFragmentHelper, view);
            }
        });
        helper.getView(R$id.btnTrade).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.transfer.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferFragment.m64407Y4(dialogFragmentHelper, accountType, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c5 */
    public static final Unit m64414c5(TransferFragment transferFragment, final List list, BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        CoinInfoEntity coinInfo = ((UIState) transferFragment.getState()).getCoinInfo();
        if (coinInfo != null) {
            C24277v.m58542g((ImageView) helper.getView(R$id.ivCoinIcon), coinInfo.getIconUrl());
            helper.setText(R$id.coinName, C27041f.m66677q(C27041f.m66668h(coinInfo.getCurrency())));
            helper.setText(R$id.coinNameDetail, C27041f.m66668h(coinInfo.getName()));
        }
        RecyclerView recyclerView = (RecyclerView) helper.getView(R$id.recyclerview);
        final int i11 = R$layout.btransfer_dialog_multi_account_item;
        recyclerView.setAdapter(new BaseQuickAdapter<TransferAccountBalance, BaseViewHolder>(list, i11) { // from class: com.kubi.transfer.TransferFragment$showTransferDetailDialog$transferDetailDialog$1$2
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder helper2, TransferAccountBalance item) {
                Intrinsics.checkNotNullParameter(helper2, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                int i12 = R$id.tvAccountName;
                AccountType accountTypeOfName = AccountType.INSTANCE.ofName(item.getAccountType());
                if (accountTypeOfName == null) {
                    accountTypeOfName = AccountType.UNKNOWN;
                }
                helper2.setText(i12, accountTypeOfName.getStrRes());
                helper2.setText(R$id.tvAvailableAmount, item.getAvailableBalance());
                int i13 = R$id.tvTransferAmount;
                View view = helper2.getView(i13);
                Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
                C26268b.m64515d(view, !Intrinsics.areEqual(item.getUsedBalance(), "0"));
                helper2.setText(i13, '-' + item.getUsedBalance());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e5 */
    public static final Unit m64417e5(String str, String str2, String str3, final TransferFragment transferFragment, final AccountType accountType, BaseViewHolder helper, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        helper.setText(R$id.transSuccAccounts, str);
        helper.setText(R$id.transAmount, str2 + ' ' + str3);
        helper.getView(R$id.btnOk).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.transfer.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferFragment.m64419f5(dialogFragmentHelper, view);
            }
        });
        helper.getView(R$id.btnTrade).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.transfer.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TransferFragment.m64421g5(dialogFragmentHelper, transferFragment, accountType, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public static final Unit m64418f4(C4850d c4850d, TransferFragment transferFragment) {
        c4850d.f4954h.m64816x(c4850d.f4955i.getF52967o());
        TransferAmountView transferAmountView = c4850d.f4954h;
        String f52969q = c4850d.f4955i.getF52969q();
        AccountInfos accountInfo = ((UIState) transferFragment.getState()).getAccountInfo();
        BalanceEntity contractBalance = ((UIState) transferFragment.getState()).getContractBalance();
        CoinInfoEntity coinInfo = ((UIState) transferFragment.getState()).getCoinInfo();
        transferAmountView.m64812n(f52969q, accountInfo, contractBalance, coinInfo != null ? coinInfo.getCurrency() : null, ((UIState) transferFragment.getState()).getIsMultiAccountMode(), !C27025c.m66566d(((UIState) transferFragment.getState()).getIsShowCoinPairView()));
        transferFragment.sendIntent(new TransferStateContract$UiIntent.UpdateCoinInfo(c4850d.f4955i.getF52967o(), false));
        transferFragment.m64448P4();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public static final Unit m64420g4(C4850d c4850d, TransferFragment transferFragment) {
        c4850d.f4954h.m64816x(c4850d.f4955i.getF52968p());
        TransferAmountView transferAmountView = c4850d.f4954h;
        String f52970r = c4850d.f4955i.getF52970r();
        AccountInfos accountInfo = ((UIState) transferFragment.getState()).getAccountInfo();
        BalanceEntity contractBalance = ((UIState) transferFragment.getState()).getContractBalance();
        CoinInfoEntity coinInfo = ((UIState) transferFragment.getState()).getCoinInfo();
        transferAmountView.m64812n(f52970r, accountInfo, contractBalance, coinInfo != null ? coinInfo.getCurrency() : null, ((UIState) transferFragment.getState()).getIsMultiAccountMode(), !C27025c.m66566d(((UIState) transferFragment.getState()).getIsShowCoinPairView()));
        transferFragment.sendIntent(new TransferStateContract$UiIntent.UpdateCoinInfo(c4850d.f4955i.getF52968p(), false));
        transferFragment.m64448P4();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065 A[Catch: Exception -> 0x00c2, TryCatch #0 {Exception -> 0x00c2, blocks: (B:25:0x003b, B:27:0x0045, B:29:0x004f, B:31:0x0055, B:33:0x0059, B:35:0x0065, B:37:0x006b, B:39:0x0085, B:41:0x008b, B:43:0x0097, B:46:0x009f), top: B:52:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097 A[Catch: Exception -> 0x00c2, TryCatch #0 {Exception -> 0x00c2, blocks: (B:25:0x003b, B:27:0x0045, B:29:0x004f, B:31:0x0055, B:33:0x0059, B:35:0x0065, B:37:0x006b, B:39:0x0085, B:41:0x008b, B:43:0x0097, B:46:0x009f), top: B:52:0x003b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x009f A[Catch: Exception -> 0x00c2, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c2, blocks: (B:25:0x003b, B:27:0x0045, B:29:0x004f, B:31:0x0055, B:33:0x0059, B:35:0x0065, B:37:0x006b, B:39:0x0085, B:41:0x008b, B:43:0x0097, B:46:0x009f), top: B:52:0x003b }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l5 */
    public static final Unit m64425l5(TransferFragment transferFragment, EditText editText, CharSequence charSequence) {
        double dM66538h;
        C4850d c4850dM64464r4;
        C4850d c4850dM64464r5;
        double dM66538h2;
        TransferAmountView transferAmountView;
        CoinInfoEntity coinInfo;
        String code;
        KcPrimaryButton kcPrimaryButton;
        if (!transferFragment.isAdded() || transferFragment.getView() == null) {
            return Unit.INSTANCE;
        }
        String string = charSequence != null ? charSequence.toString() : null;
        boolean z11 = string == null || string.length() == 0;
        boolean z12 = !z11;
        C4850d c4850dM64464r6 = transferFragment.m64464r4();
        if (c4850dM64464r6 != null && (kcPrimaryButton = c4850dM64464r6.f4959m) != null) {
            kcPrimaryButton.setEnabled(z12);
        }
        if (z11) {
            dM66538h = 0.0d;
            c4850dM64464r4 = transferFragment.m64464r4();
            if (c4850dM64464r4 != null) {
                coinInfo = ((UIState) transferFragment.getState()).getCoinInfo();
                if (coinInfo != null) {
                    code = coinInfo.getCode();
                } else {
                    code = null;
                }
                transferAmountView.setLegalPrice(C41014a.m89948v(C41014a.m89939m(dM66538h, code), null, null, 0, false, true, false, 47, null));
            }
            if (!z11) {
                String f52960p = c4850dM64464r5.f4954h.getF52960p();
                if (C26268b.m64512a(f52960p)) {
                }
                if (dM66538h > dM66538h2) {
                    transferFragment.showToast(transferFragment.getString(R$string.balance_insufficient));
                    String strM66668h = C27041f.m66668h(C27039d.m66655o(dM66538h2));
                    editText.setText(strM66668h);
                    editText.setSelection(C27039d.m66650j(Integer.valueOf(strM66668h.length())));
                }
            }
        } else {
            try {
                if (C26268b.m64512a(charSequence.toString())) {
                    dM66538h = DowngradeExKt.m66538h(charSequence.toString(), 0.0d, 1, null);
                } else {
                    dM66538h = 0.0d;
                }
                c4850dM64464r4 = transferFragment.m64464r4();
                if (c4850dM64464r4 != null && (transferAmountView = c4850dM64464r4.f4954h) != null) {
                    coinInfo = ((UIState) transferFragment.getState()).getCoinInfo();
                    if (coinInfo != null) {
                        code = coinInfo.getCode();
                    } else {
                        code = null;
                    }
                    transferAmountView.setLegalPrice(C41014a.m89948v(C41014a.m89939m(dM66538h, code), null, null, 0, false, true, false, 47, null));
                }
                if (!z11 && (c4850dM64464r5 = transferFragment.m64464r4()) != null) {
                    String f52960p2 = c4850dM64464r5.f4954h.getF52960p();
                    dM66538h2 = C26268b.m64512a(f52960p2) ? DowngradeExKt.m66538h(f52960p2, 0.0d, 1, null) : 0.0d;
                    if (dM66538h > dM66538h2) {
                        transferFragment.showToast(transferFragment.getString(R$string.balance_insufficient));
                        String strM66668h2 = C27041f.m66668h(C27039d.m66655o(dM66538h2));
                        editText.setText(strM66668h2);
                        editText.setSelection(C27039d.m66650j(Integer.valueOf(strM66668h2.length())));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final void m64429n4(boolean z11, TransferAccountView transferAccountView, TransferFragment transferFragment, Function0 function0, Intent intent) {
        String strM56237a0;
        SymbolInfoEntity symbolInfoEntityM85601B;
        TransferCoinPairView transferCoinPairView;
        TransferCoinPairView transferCoinPairView2;
        if (intent == null || (strM56237a0 = RouteExKt.m56237a0(intent, "symbol")) == null || (symbolInfoEntityM85601B = C37890n.f85269a.m85601B(StringsKt.replace$default(strM56237a0, "/", C33820nf.f71144W, false, 4, (Object) null))) == null) {
            return;
        }
        if (z11) {
            transferAccountView.setFromType(AccountType.ISOLATED);
            transferAccountView.setFromSymbolBean(symbolInfoEntityM85601B);
        } else {
            transferAccountView.setToType(AccountType.ISOLATED);
            transferAccountView.setToSymbolBean(symbolInfoEntityM85601B);
        }
        C4850d c4850dM64464r4 = transferFragment.m64464r4();
        if (c4850dM64464r4 != null && (transferCoinPairView2 = c4850dM64464r4.f4955i) != null) {
            transferCoinPairView2.setBaseCoinSelected(false);
        }
        C4850d c4850dM64464r5 = transferFragment.m64464r4();
        if (c4850dM64464r5 != null && (transferCoinPairView = c4850dM64464r5.f4955i) != null) {
            transferCoinPairView.setQuoteCoinSelected(true);
        }
        transferFragment.sendIntent(new TransferStateContract$UiIntent.UpdateSymbolInfo(transferAccountView.getF52952c(), transferAccountView.getF52953d(), transferAccountView.getF52954e(), transferAccountView.getF52955f()));
        function0.invoke();
    }

    /* JADX INFO: renamed from: n5 */
    public static final TransferHelper m64430n5() {
        return new TransferHelper();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX INFO: renamed from: x4 */
    public static final Unit m64442x4(boolean z11, AccountType accountType, final TransferFragment transferFragment, TransferAccountView transferAccountView, final boolean z12, final List sortedAccounts, final AccountItem accountItem, boolean z13) {
        Intrinsics.checkNotNullParameter(sortedAccounts, "sortedAccounts");
        if (z13 || z11 != z12) {
            if ((accountItem != null ? accountItem.getAccountType() : null) == AccountType.ISOLATED) {
                transferFragment.m64460m4(transferAccountView, true, new Function0() { // from class: com.kubi.transfer.c0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TransferFragment.m64444y4(this.f52653b, z12, sortedAccounts, accountItem);
                    }
                });
            } else {
                transferFragment.sendIntent(new TransferStateContract$UiIntent.MultiAccountDialogCloseEvent(true, z12, sortedAccounts, accountItem));
            }
        } else {
            if (accountType == (accountItem != null ? accountItem.getAccountType() : null)) {
                TransferLog.f52948a.m64781c("选择前后一样，不做请求");
            } else {
                if ((accountItem != null ? accountItem.getAccountType() : null) == AccountType.ISOLATED) {
                    transferFragment.m64460m4(transferAccountView, true, new Function0() { // from class: com.kubi.transfer.c0
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TransferFragment.m64444y4(this.f52653b, z12, sortedAccounts, accountItem);
                        }
                    });
                } else {
                    transferFragment.sendIntent(new TransferStateContract$UiIntent.MultiAccountDialogCloseEvent(true, z12, sortedAccounts, accountItem));
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m64444y4(TransferFragment transferFragment, boolean z11, List list, AccountItem accountItem) {
        transferFragment.sendIntent(new TransferStateContract$UiIntent.MultiAccountDialogCloseEvent(true, z11, list, accountItem));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R4 */
    public final void m64449R4() {
        Intent intentPutExtra = new Intent(this.mContext, (Class<?>) BaseActivity.class).putExtra("fragment", SearchCoinFragment.class.getName());
        CoinInfoEntity coinInfo = ((UIState) getState()).getCoinInfo();
        Intent intentPutExtra2 = intentPutExtra.putExtra("code", coinInfo != null ? coinInfo.getCode() : null);
        AccountType fromType = ((UIState) getState()).getAccountInfo().getFromType();
        Intent intentPutExtra3 = intentPutExtra2.putExtra("from", fromType != null ? fromType.name() : null);
        AccountType toType = ((UIState) getState()).getAccountInfo().getToType();
        Intent intentPutExtra4 = intentPutExtra3.putExtra(TypedValues.TransitionType.S_TO, toType != null ? toType.name() : null).putExtra("is_multi_account", C27025c.m66566d(Boolean.valueOf(((UIState) getState()).getIsMultiAccountMode())));
        Intrinsics.checkNotNullExpressionValue(intentPutExtra4, "putExtra(...)");
        startActivityWithResult(intentPutExtra4, new Consumer() { // from class: com.kubi.transfer.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TransferFragment.m64397S4(this.f52858b, (Intent) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U4 */
    public final void m64451U4(final String str, boolean z11, String str2, final String str3, String str4, final AccountType accountType) {
        final String string;
        if (str2.length() == 0) {
            ToastCompat.m66441G(str4, new Object[0]);
            return;
        }
        if (z11) {
            string = getString(R$string.exchanged_ok);
        } else {
            String strJoinToString$default = CollectionsKt.joinToString$default(StringsKt.split$default((CharSequence) str2, new String[]{","}, false, 0, 6, (Object) null), ", ", null, null, 0, null, new Function1() { // from class: com.kubi.transfer.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransferFragment.m64401V4(this.f52679b, (String) obj);
                }
            }, 30, null);
            String string2 = getString(R$string.kc_transfer_pro_success_tip);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            string = String.format(string2, Arrays.copyOf(new Object[]{strJoinToString$default}, 1));
            Intrinsics.checkNotNullExpressionValue(string, "format(...)");
        }
        Intrinsics.checkNotNull(string);
        if (accountType == AccountType.ISOLATED || accountType == AccountType.MARGIN || accountType == AccountType.TRADE || accountType == AccountType.CONTRACT) {
            BaseDialogFragment baseDialogFragmentM54192r3 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.trans_pro_trans_succ_dialog, 8, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.transfer.h
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TransferFragment.m64403W4(string, str, str3, accountType, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
                }
            }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.transfer.i
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    TransferFragment.m64409Z4(this.f52702b, dialogInterface);
                }
            });
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            baseDialogFragmentM54192r3.show(childFragmentManager, "trans_result_dialog");
            BeepHelper.m23642f("beep_transfer", R$raw.transfer);
            C43852m.m96594f("B1transferNew", "tradeGuidePopup", "1", TuplesKt.m90091to("norm_version", "1"));
            return;
        }
        BeepHelper.m23642f("beep_transfer", R$raw.transfer);
        ToastCompat.m66436B(string, new Object[0]);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, new Intent());
        }
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.transfer.j
            @Override // java.lang.Runnable
            public final void run() {
                TransferFragment.m64411a5(this.f52706b);
            }
        });
    }

    /* JADX INFO: renamed from: d5 */
    public final void m64453d5(final String str, final String str2, final AccountType accountType) {
        final String string = getString(R$string.exchanged_ok);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (accountType == AccountType.ISOLATED || accountType == AccountType.MARGIN || accountType == AccountType.TRADE || accountType == AccountType.CONTRACT) {
            BaseDialogFragment baseDialogFragmentM54192r3 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.trans_pro_trans_succ_dialog, 0, 0, 0, false, false, false, false, false, 510, null).m54237f4(new Function2() { // from class: com.kubi.transfer.k
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TransferFragment.m64417e5(string, str, str2, this, accountType, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
                }
            }).m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.transfer.l
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    TransferFragment.m64423h5(this.f52721b, dialogInterface);
                }
            });
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            baseDialogFragmentM54192r3.show(childFragmentManager, "trans_result_dialog");
            C43852m.m96594f("B1transferNew", "tradeGuidePopup", "1", TuplesKt.m90091to("norm_version", "1"));
            return;
        }
        ToastCompat.m66436B(string, new Object[0]);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, new Intent());
        }
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.transfer.m
            @Override // java.lang.Runnable
            public final void run() {
                TransferFragment.m64424i5(this.f52803b);
            }
        });
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        TransferTipView transferTipView;
        TransferTipView transferTipView2;
        TransferTipView transferTipView3;
        TransferTipView transferTipView4;
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C26439x0) {
            m64450T4(((C26439x0) singleEvent).getF52984a());
            return;
        }
        if (singleEvent instanceof TransferResult) {
            BeepHelper.m23642f("beep_transfer", R$raw.transfer);
            TransferResult transferResult = (TransferResult) singleEvent;
            m64453d5(transferResult.getAmount(), transferResult.getCoin(), transferResult.getToAccountType());
            return;
        }
        if (singleEvent instanceof MultiTransferResult) {
            MultiTransferResult multiTransferResult = (MultiTransferResult) singleEvent;
            m64451U4(multiTransferResult.getAmount(), multiTransferResult.getIsAllSucc(), multiTransferResult.getSuccAccounts(), multiTransferResult.getCoin(), multiTransferResult.getFirstErrorMsg(), multiTransferResult.getToAccountType());
            return;
        }
        if (singleEvent instanceof C26436w0) {
            C4850d c4850dM64464r4 = m64464r4();
            if (c4850dM64464r4 != null && (transferTipView4 = c4850dM64464r4.f4957k) != null) {
                transferTipView4.m64840m(null);
            }
            C4850d c4850dM64464r5 = m64464r4();
            if (c4850dM64464r5 == null || (transferTipView3 = c4850dM64464r5.f4957k) == null) {
                return;
            }
            ViewExtKt.m66577h(transferTipView3);
            return;
        }
        if (singleEvent instanceof ShowUnifiedTransferAccountTip) {
            C4850d c4850dM64464r6 = m64464r4();
            if (c4850dM64464r6 != null && (transferTipView2 = c4850dM64464r6.f4957k) != null) {
                AccountType account = ((ShowUnifiedTransferAccountTip) singleEvent).getAccount();
                transferTipView2.m64840m(account != null ? C37828d.m85385a(account, getContext()) : null);
            }
            C4850d c4850dM64464r7 = m64464r4();
            if (c4850dM64464r7 == null || (transferTipView = c4850dM64464r7.f4957k) == null) {
                return;
            }
            ViewExtKt.m66594y(transferTipView);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.btransfer_fragment_transfer;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<? extends AbstractC19290l<UIState>> getVmClass() {
        return Reflection.getOrCreateKotlinClass(TransferVM.class);
    }

    /* JADX INFO: renamed from: i4 */
    public final void m64454i4() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.TransferFragment$bindState1$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getCoinInfo();
            }
        }, new TransferFragment$bindState1$2(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.TransferFragment$bindState1$3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getAccountInfo();
            }
        }, new TransferFragment$bindState1$4(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.TransferFragment$bindState1$5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getBalance();
            }
        }, new TransferFragment$bindState1$6(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.TransferFragment$bindState1$7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getPrecision();
            }
        }, new TransferFragment$bindState1$8(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.TransferFragment$bindState1$9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getIsShowCoinPairView();
            }
        }, new TransferFragment$bindState1$10(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.TransferFragment$bindState1$11
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getIsMultiAccountMode());
            }
        }, new TransferFragment$bindState1$12(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.TransferFragment$bindState1$13
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getShouldShowExchangeButton());
            }
        }, new TransferFragment$bindState1$14(this, null));
    }

    /* JADX INFO: renamed from: j4 */
    public final void m64455j4() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.TransferFragment$bindState2$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getBaseBalance();
            }
        }, new TransferFragment$bindState2$2(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.TransferFragment$bindState2$3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getQuoteBalance();
            }
        }, new TransferFragment$bindState2$4(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.TransferFragment$bindState2$5
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getIsSupportBatchTransfer());
            }
        }, new TransferFragment$bindState2$6(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.TransferFragment$bindState2$7
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getFromSymbolBean();
            }
        }, new TransferFragment$bindState2$8(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.TransferFragment$bindState2$9
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getToSymbolBean();
            }
        }, new TransferFragment$bindState2$10(this, null));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64457k4() {
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.TransferFragment$bindState3$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getIsCoinEnable());
            }
        }, new TransferFragment$bindState3$2(this, null));
        bindState(new PropertyReference1Impl() { // from class: com.kubi.transfer.TransferFragment$bindState3$3
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Boolean.valueOf(((UIState) obj).getIsShowNoCoinTip());
            }
        }, new TransferFragment$bindState3$4(this, null));
    }

    @NotNull
    /* JADX INFO: renamed from: l4 */
    public final List<TransferAccountBalance> m64459l4(@NotNull List<TransferAccountBalance> balanceInfoList, @NotNull String remainAmount) {
        String availableBalance;
        BigDecimal bigDecimalOrNull;
        Intrinsics.checkNotNullParameter(balanceInfoList, "balanceInfoList");
        Intrinsics.checkNotNullParameter(remainAmount, "remainAmount");
        BigDecimal bigDecimalOrNull2 = StringsKt.toBigDecimalOrNull(remainAmount);
        if (bigDecimalOrNull2 == null) {
            return balanceInfoList;
        }
        ArrayList<TransferAccountBalance> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(balanceInfoList, 10));
        Iterator<T> it = balanceInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(TransferAccountBalance.copy$default((TransferAccountBalance) it.next(), null, null, null, null, null, null, null, null, 255, null));
        }
        for (TransferAccountBalance transferAccountBalance : arrayList) {
            transferAccountBalance.setUsedBalance("0");
            if (bigDecimalOrNull2.compareTo(BigDecimal.ZERO) > 0 && (availableBalance = transferAccountBalance.getAvailableBalance()) != null && (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(availableBalance)) != null) {
                BigDecimal bigDecimal = (BigDecimal) ComparisonsKt.minOf(bigDecimalOrNull, bigDecimalOrNull2);
                String string = bigDecimal.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                transferAccountBalance.setUsedBalance(string);
                bigDecimalOrNull2 = bigDecimalOrNull2.subtract(bigDecimal);
                Intrinsics.checkNotNullExpressionValue(bigDecimalOrNull2, "subtract(...)");
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public final void m64460m4(final TransferAccountView transferAccountView, final boolean z11, final Function0<Unit> function0) {
        SymbolInfoEntity fromSymbolBean;
        Intent intentPutExtra = new Intent(this.mContext, (Class<?>) BaseActivity.class).putExtra("fragment", SearchSymbolFragment.class.getName());
        String symbol = null;
        UIState uIState = (UIState) getState();
        if (!z11 ? (fromSymbolBean = uIState.getFromSymbolBean()) != null : (fromSymbolBean = uIState.getToSymbolBean()) != null) {
            symbol = fromSymbolBean.getSymbol();
        }
        Intent intentPutExtra2 = intentPutExtra.putExtra("data", symbol);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "putExtra(...)");
        startActivityWithResult(intentPutExtra2, new Consumer() { // from class: com.kubi.transfer.e0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TransferFragment.m64429n4(z11, transferAccountView, this, function0, (Intent) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public final void m64463q4(boolean z11) {
        if (z11) {
            C12572a.m23695d("update_batch_transfer_coin_info", ((UIState) getState()).getAccountInfo(), 0L, 4, null);
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final C4850d m64464r4() {
        return (C4850d) this.f52525U.getValue(this, f52524Y[0]);
    }

    /* JADX INFO: renamed from: s4 */
    public final TransferHelper m64465s4() {
        return (TransferHelper) this.f52526V.getValue();
    }

    public TransferFragment() {
        setPageId("B1transferNew");
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m64371E4(TransferFragment transferFragment, TransferAccountView transferAccountView) {
        transferFragment.m64469w4(transferAccountView);
        C43852m.m96591c("B1transferNew", "chooseAccount", null, null, 12, null);
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m64373F4(TransferFragment transferFragment, TransferAccountView transferAccountView) {
        transferFragment.m64470z4(transferAccountView);
        C43852m.m96591c("B1transferNew", "chooseAccount", null, null, 12, null);
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m64375G4(TransferFragment transferFragment, TransferAccountView transferAccountView) {
        transferFragment.m64468v4(transferAccountView);
    }

    /* JADX INFO: renamed from: H4 */
    public static final void m64377H4(TransferFragment transferFragment) {
        transferFragment.m64449R4();
        C43852m.m96591c("B1transferNew", "choosecoin", null, null, 12, null);
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m64379I4(TransferFragment transferFragment) {
        transferFragment.m64462p4();
        C43852m.m96591c("B1transferNew", "confirm", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J4 */
    public static final Unit m64381J4(TransferFragment transferFragment) {
        String editTextValue;
        List<TransferAccountBalance> arrayList;
        TransferAmountView transferAmountView;
        String code;
        Map<String, RespMultiAccountBalance> multiAccountBalance = ((UIState) transferFragment.getState()).getMultiAccountBalance();
        List<TransferAccountBalance> balanceList = null;
        if (multiAccountBalance != null) {
            CoinInfoEntity coinInfo = ((UIState) transferFragment.getState()).getCoinInfo();
            if (coinInfo != null) {
                code = coinInfo.getCode();
            } else {
                code = null;
            }
            RespMultiAccountBalance respMultiAccountBalance = multiAccountBalance.get(code);
            if (respMultiAccountBalance != null) {
                balanceList = respMultiAccountBalance.getBalanceList();
            }
        }
        C4850d c4850dM64464r4 = transferFragment.m64464r4();
        if (c4850dM64464r4 == null || (transferAmountView = c4850dM64464r4.f4954h) == null || (editTextValue = transferAmountView.getEditTextValue()) == null) {
            editTextValue = "0";
        }
        if (balanceList == null || (arrayList = CollectionsKt.toMutableList((Collection) balanceList)) == null) {
            arrayList = new ArrayList<>();
        }
        transferFragment.m64452b5(editTextValue, arrayList);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K4 */
    public static final Unit m64383K4(TransferFragment transferFragment) {
        String code;
        TransferHelper transferHelperM64465s4 = transferFragment.m64465s4();
        CoinInfoEntity coinInfo = ((UIState) transferFragment.getState()).getCoinInfo();
        if (coinInfo != null) {
            code = coinInfo.getCode();
        } else {
            code = null;
        }
        transferHelperM64465s4.m64489j(code);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L4 */
    public static final Unit m64385L4(TransferFragment transferFragment, LeverBalance leverBalance) {
        transferFragment.f52527W = leverBalance.isLiability();
        transferFragment.m64446C4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final void m64387M4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O4 */
    public static final void m64391O4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q4 */
    public static final void m64394Q4(TransferFragment transferFragment, MarginPosition marginPosition) {
        TransferTipView transferTipView;
        C4850d c4850dM64464r4 = transferFragment.m64464r4();
        if (c4850dM64464r4 != null && (transferTipView = c4850dM64464r4.f4957k) != null) {
            transferTipView.m64834g(((UIState) transferFragment.getState()).getAccountInfo().getToType(), marginPosition.isLiability());
        }
    }

    /* JADX INFO: renamed from: X4 */
    public static final void m64405X4(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
        C43852m.m96590b("B1transferNew", "tradeGuidePopup", "okButton", TuplesKt.m90091to("norm_version", "1"));
        IAssetsCenterService.f16464a.get().mo15351q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public static final /* synthetic */ UIState m64406Y3(TransferFragment transferFragment) {
        return (UIState) transferFragment.getState();
    }

    /* JADX INFO: renamed from: Y4 */
    public static final void m64407Y4(DialogFragmentHelper dialogFragmentHelper, AccountType accountType, View view) {
        int i11;
        dialogFragmentHelper.dismiss();
        if (accountType == null) {
            i11 = -1;
        } else {
            i11 = C26261a.$EnumSwitchMapping$0[accountType.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    InterfaceC37754f.a.m85141m(C37304a.f82764a, 0L, null, null, null, null, null, null, null, 254, null);
                } else {
                    InterfaceC37754f.a.m85131c(C37304a.f82764a, null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                }
            } else {
                InterfaceC37754f.a.m85141m(C37304a.f82764a, 1L, null, null, null, null, null, null, null, 254, null);
            }
        } else {
            InterfaceC37754f.a.m85141m(C37304a.f82764a, 2L, null, null, null, null, null, null, null, 254, null);
        }
        C43852m.m96590b("B1transferNew", "tradeGuidePopup", "tradeButton", TuplesKt.m90091to("norm_version", "1"));
        IAssetsCenterService.f16464a.get().mo15351q();
    }

    /* JADX INFO: renamed from: Z4 */
    public static final void m64409Z4(TransferFragment transferFragment, DialogInterface dialogInterface) {
        transferFragment.preformBackPressed();
        IAssetsCenterService.f16464a.get().mo15351q();
    }

    /* JADX INFO: renamed from: a5 */
    public static final void m64411a5(TransferFragment transferFragment) {
        transferFragment.preformBackPressed();
        IAssetsCenterService.f16464a.get().mo15351q();
    }

    /* JADX INFO: renamed from: e4 */
    private final void m64416e4() {
        final C4850d c4850dM64464r4 = m64464r4();
        if (c4850dM64464r4 != null) {
            c4850dM64464r4.f4955i.m64821c(new Function0() { // from class: com.kubi.transfer.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferFragment.m64418f4(c4850dM64464r4, this);
                }
            }, new Function0() { // from class: com.kubi.transfer.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferFragment.m64420g4(c4850dM64464r4, this);
                }
            });
            c4850dM64464r4.f4952f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.kubi.transfer.u
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    TransferFragment.m64422h4(this.f52944b, compoundButton, z11);
                }
            });
            c4850dM64464r4.f4954h.m64807f(this);
        }
    }

    /* JADX INFO: renamed from: f5 */
    public static final void m64419f5(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
        C43852m.m96590b("B1transferNew", "tradeGuidePopup", "okButton", TuplesKt.m90091to("norm_version", "1"));
        IAssetsCenterService.f16464a.get().mo15351q();
    }

    /* JADX INFO: renamed from: g5 */
    public static final void m64421g5(DialogFragmentHelper dialogFragmentHelper, TransferFragment transferFragment, AccountType accountType, View view) {
        AccountType accountTypeOfName;
        int i11;
        String strM56284y;
        dialogFragmentHelper.dismiss();
        Bundle arguments = transferFragment.getArguments();
        if (arguments != null && (strM56284y = RouteExKt.m56284y(arguments, TypedValues.TransitionType.S_TO)) != null) {
            accountTypeOfName = AccountType.INSTANCE.ofName(strM56284y);
        } else {
            accountTypeOfName = null;
        }
        if (accountTypeOfName != null) {
            if (accountType == null) {
                i11 = -1;
            } else {
                i11 = C26261a.$EnumSwitchMapping$0[accountType.ordinal()];
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        InterfaceC37754f.a.m85141m(C37304a.f82764a, 0L, null, null, null, null, null, null, null, 254, null);
                    } else {
                        InterfaceC37754f.a.m85131c(C37304a.f82764a, null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
                    }
                } else {
                    InterfaceC37754f.a.m85141m(C37304a.f82764a, 1L, null, null, null, null, null, null, null, 254, null);
                }
            } else {
                InterfaceC37754f.a.m85141m(C37304a.f82764a, 2L, null, null, null, null, null, null, null, 254, null);
            }
        }
        C43852m.m96590b("B1transferNew", "tradeGuidePopup", "tradeButton", TuplesKt.m90091to("norm_version", "1"));
        IAssetsCenterService.f16464a.get().mo15351q();
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m64422h4(TransferFragment transferFragment, CompoundButton compoundButton, boolean z11) {
        transferFragment.m64456j5(z11);
        transferFragment.m64463q4(z11);
        C43852m.m96591c("B1transferNew", "batchTransfer", null, null, 12, null);
    }

    /* JADX INFO: renamed from: h5 */
    public static final void m64423h5(TransferFragment transferFragment, DialogInterface dialogInterface) {
        transferFragment.preformBackPressed();
        IAssetsCenterService.f16464a.get().mo15351q();
    }

    /* JADX INFO: renamed from: i5 */
    public static final void m64424i5(TransferFragment transferFragment) {
        transferFragment.preformBackPressed();
        IAssetsCenterService.f16464a.get().mo15351q();
    }

    /* JADX INFO: renamed from: m5 */
    public static final void m64427m5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public final void m64432o4() {
        TransferAmountView transferAmountView;
        C4850d c4850dM64464r4 = m64464r4();
        if (c4850dM64464r4 != null && (transferAmountView = c4850dM64464r4.f4954h) != null) {
            transferAmountView.m64809h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    public final void m64446C4() {
        TransferTipView transferTipView;
        TransferTipView transferTipView2;
        C4850d c4850dM64464r4 = m64464r4();
        if (c4850dM64464r4 != null && (transferTipView2 = c4850dM64464r4.f4957k) != null) {
            transferTipView2.m64836i(((UIState) getState()).getAccountInfo().getFromType(), ((UIState) getState()).getAccountInfo().getToType(), ((UIState) getState()).getIsMultiAccountMode());
        }
        C4850d c4850dM64464r5 = m64464r4();
        if (c4850dM64464r5 != null && (transferTipView = c4850dM64464r5.f4957k) != null) {
            transferTipView.m64835h(((UIState) getState()).getAccountInfo().getToType(), this.f52527W);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final void m64447D4() {
        TransferTipView transferTipView;
        C4850d c4850dM64464r4 = m64464r4();
        if (c4850dM64464r4 != null && (transferTipView = c4850dM64464r4.f4957k) != null) {
            transferTipView.m64833f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P4 */
    public final void m64448P4() {
        String code;
        if (((UIState) getState()).getIsShowNoCoinTip()) {
            return;
        }
        m64447D4();
        if (((UIState) getState()).getAccountInfo().getToType() == AccountType.ISOLATED && ((UIState) getState()).getToSymbolBean() != null) {
            IMarginService iMarginService = IMarginService.f32724a.get();
            SymbolInfoEntity toSymbolBean = ((UIState) getState()).getToSymbolBean();
            if (toSymbolBean != null) {
                code = toSymbolBean.getCode();
            } else {
                code = null;
            }
            if (code == null) {
                code = "";
            }
            addSubscription(iMarginService.mo37951o0(code).subscribe(new Consumer() { // from class: com.kubi.transfer.g0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TransferFragment.m64394Q4(this.f52680b, (MarginPosition) obj);
                }
            }, new C24223c1(this, false)));
        }
        m64446C4();
    }

    /* JADX INFO: renamed from: T4 */
    public final void m64450T4(boolean z11) {
        ImageView imageView;
        FrameLayout frameLayout;
        Context context = getContext();
        int i11 = R$drawable.kc_loading;
        C4850d c4850dM64464r4 = m64464r4();
        if (c4850dM64464r4 != null) {
            imageView = c4850dM64464r4.f4950d;
        } else {
            imageView = null;
        }
        C24277v.m58539d(context, i11, imageView);
        C4850d c4850dM64464r5 = m64464r4();
        if (c4850dM64464r5 != null && (frameLayout = c4850dM64464r5.f4951e) != null) {
            C26268b.m64515d(frameLayout, z11);
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final void m64452b5(String str, List<TransferAccountBalance> list) {
        m64465s4().m64493u(list);
        final List<TransferAccountBalance> listM64459l4 = m64459l4(list, str);
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.btransfer_dialog_multi_account_detail, true).m54237f4(new Function2() { // from class: com.kubi.transfer.v
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TransferFragment.m64414c5(this.f52946b, listM64459l4, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        if (dialogFragmentHelperM54237f4 != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperM54237f4.show(childFragmentManager, "transfer_detail_dialog");
        }
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void bindState() {
        super.bindState();
        m64454i4();
        m64455j4();
        m64457k4();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    public void initView() {
        TransferAmountView transferAmountView;
        KcPrimaryButton kcPrimaryButton;
        TransferCoinView transferCoinView;
        final TransferAccountView transferAccountView;
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            if (activity != null && activity.isFinishing()) {
                return;
            }
            super.initView();
            m64450T4(true);
            ImageView rightOneIcon = getTitleBar().getRightOneIcon();
            rightOneIcon.setImageResource(R$drawable.ic2_history_20);
            Context context = getContext();
            if (context != null) {
                C27046k.m66701p(rightOneIcon, ContextCompat.getColor(context, R$color.emphasis));
            }
            C27046k.m66711z(rightOneIcon, 0L, new Function0() { // from class: com.kubi.transfer.i0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransferFragment.m64383K4(this.f52703b);
                }
            }, 1, null);
            C4850d c4850dM64464r4 = m64464r4();
            if (c4850dM64464r4 != null && (transferAccountView = c4850dM64464r4.f4953g) != null) {
                transferAccountView.m64792f(new Action() { // from class: com.kubi.transfer.j0
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        TransferFragment.m64371E4(this.f52707b, transferAccountView);
                    }
                }, new Action() { // from class: com.kubi.transfer.k0
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        TransferFragment.m64373F4(this.f52716b, transferAccountView);
                    }
                }, new Action() { // from class: com.kubi.transfer.l0
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        TransferFragment.m64375G4(this.f52722b, transferAccountView);
                    }
                });
            }
            C4850d c4850dM64464r5 = m64464r4();
            if (c4850dM64464r5 != null && (transferCoinView = c4850dM64464r5.f4956j) != null) {
                transferCoinView.m64825b(new Action() { // from class: com.kubi.transfer.d
                    @Override // io.reactivex.functions.Action
                    public final void run() {
                        TransferFragment.m64377H4(this.f52659b);
                    }
                });
            }
            C4850d c4850dM64464r6 = m64464r4();
            if (c4850dM64464r6 != null && (kcPrimaryButton = c4850dM64464r6.f4959m) != null) {
                C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.transfer.e
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TransferFragment.m64379I4(this.f52666b);
                    }
                }, 1, null);
            }
            C4850d c4850dM64464r7 = m64464r4();
            if (c4850dM64464r7 != null && (transferAmountView = c4850dM64464r7.f4954h) != null) {
                transferAmountView.setOnMultiAccountAvailableClick(new Function0() { // from class: com.kubi.transfer.f
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TransferFragment.m64381J4(this.f52674b);
                    }
                });
            }
            m64458k5();
            m64416e4();
            m64467u4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j5 */
    public final void m64456j5(boolean z11) {
        boolean z12;
        C4850d c4850dM64464r4 = m64464r4();
        if (c4850dM64464r4 != null) {
            ConstraintLayout layoutCoin = c4850dM64464r4.f4949c;
            Intrinsics.checkNotNullExpressionValue(layoutCoin, "layoutCoin");
            C26268b.m64515d(layoutCoin, !z11);
            TransferAmountView transferAmountView = c4850dM64464r4.f4954h;
            Intrinsics.checkNotNullExpressionValue(transferAmountView, "transferAmountView");
            if (!z11 && !((UIState) getState()).getIsShowNoCoinTip()) {
                z12 = true;
            } else {
                z12 = false;
            }
            C26268b.m64515d(transferAmountView, z12);
            TransferTipView transferTipView = c4850dM64464r4.f4957k;
            Intrinsics.checkNotNullExpressionValue(transferTipView, "transferTipView");
            C26268b.m64515d(transferTipView, !z11);
            KcPrimaryButton tvConfirm = c4850dM64464r4.f4959m;
            Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
            C26268b.m64515d(tvConfirm, !z11);
            FragmentContainerView batchTransferFragment = c4850dM64464r4.f4948b;
            Intrinsics.checkNotNullExpressionValue(batchTransferFragment, "batchTransferFragment");
            C26268b.m64515d(batchTransferFragment, z11);
            c4850dM64464r4.f4953g.setAccountEnable(!z11);
        }
    }

    /* JADX INFO: renamed from: k5 */
    public final void m64458k5() {
        TransferAmountView transferAmountView;
        final EditText editText;
        C4850d c4850dM64464r4 = m64464r4();
        if (c4850dM64464r4 != null && (transferAmountView = c4850dM64464r4.f4954h) != null && (editText = transferAmountView.getEditText()) != null) {
            if (editText instanceof FinancialInputEditText) {
                editText.addTextChangedListener(new C26262b(editText));
                return;
            }
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(editText);
            final Function1 function1 = new Function1() { // from class: com.kubi.transfer.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransferFragment.m64425l5(this.f52979b, editText, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe = abstractC46099aM784d.subscribe(new Consumer() { // from class: com.kubi.transfer.x
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TransferFragment.m64427m5(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void lazyLoad() {
        super.lazyLoad();
        Observable<R> observableCompose = IMarginService.f32724a.get().mo37935f().compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.transfer.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferFragment.m64385L4(this.f52652b, (LeverBalance) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.transfer.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TransferFragment.m64387M4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.transfer.y
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TransferFragment.m64389N4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(consumer, new Consumer() { // from class: com.kubi.transfer.f0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TransferFragment.m64391O4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getDestroyDisposable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o5 */
    public final void m64461o5(AccountInfos accountInfos, boolean z11) {
        String strName;
        boolean z12;
        m64432o4();
        m64448P4();
        C4850d c4850dM64464r4 = m64464r4();
        if (c4850dM64464r4 != null) {
            TransferAmountView transferAmountView = c4850dM64464r4.f4954h;
            Intrinsics.checkNotNullExpressionValue(transferAmountView, "transferAmountView");
            if (c4850dM64464r4.f4952f.isChecked() && ((UIState) getState()).getIsSupportBatchTransfer()) {
                z12 = false;
            } else {
                z12 = true;
            }
            C26268b.m64515d(transferAmountView, z12);
            c4850dM64464r4.f4953g.m64794m(accountInfos.getFromType(), z11);
            c4850dM64464r4.f4953g.setToAccount(accountInfos.getToType());
        }
        AccountType fromType = accountInfos.getFromType();
        String strName2 = null;
        if (fromType != null) {
            strName = fromType.name();
        } else {
            strName = null;
        }
        AccountType toType = accountInfos.getToType();
        if (toType != null) {
            strName2 = toType.name();
        }
        sendIntent(new TransferStateContract$UiIntent.QueryBatchTransferConfig(strName, strName2));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String strM56284y;
        AccountType accountTypeOfName;
        AccountType accountTypeOfName2;
        SymbolInfoEntity symbolInfoEntityM85601B;
        String strName;
        String strM56284y2;
        String strM56284y3;
        String strM56284y4;
        super.onCreate(savedInstanceState);
        if (!IUserService.a.get().c()) {
            preformBackPressed();
            return;
        }
        Bundle arguments = getArguments();
        String strName2 = null;
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "coin");
        } else {
            strM56284y = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (strM56284y4 = RouteExKt.m56284y(arguments2, "from")) != null) {
            accountTypeOfName = AccountType.INSTANCE.ofName(strM56284y4);
        } else {
            accountTypeOfName = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (strM56284y3 = RouteExKt.m56284y(arguments3, TypedValues.TransitionType.S_TO)) != null) {
            accountTypeOfName2 = AccountType.INSTANCE.ofName(strM56284y3);
        } else {
            accountTypeOfName2 = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (strM56284y2 = RouteExKt.m56284y(arguments4, "to_symbol")) != null) {
            symbolInfoEntityM85601B = C37890n.f85269a.m85601B(strM56284y2);
        } else {
            symbolInfoEntityM85601B = null;
        }
        IUnifyAccountService.Companion companion = IUnifyAccountService.f53155a;
        if (companion.get().mo64979C() && (accountTypeOfName2 == null || accountTypeOfName2 == AccountType.TRADE || accountTypeOfName2 == AccountType.CONTRACT || accountTypeOfName2 == AccountType.UNKNOWN)) {
            accountTypeOfName2 = AccountType.UNIFIED;
        }
        if (accountTypeOfName == null && accountTypeOfName2 == AccountType.MAIN) {
            if (companion.get().mo64979C()) {
                accountTypeOfName = AccountType.UNIFIED;
            } else {
                accountTypeOfName = AccountType.TRADE;
            }
        }
        if (accountTypeOfName != null) {
            strName = accountTypeOfName.name();
        } else {
            strName = null;
        }
        if (accountTypeOfName2 != null) {
            strName2 = accountTypeOfName2.name();
        }
        sendIntent(new TransferStateContract$UiIntent.FetchCoinList(strM56284y, strName, strName2, symbolInfoEntityM85601B));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public final void m64462p4() {
        String strName;
        String strName2;
        String strM66668h;
        String code;
        C4850d c4850dM64464r4 = m64464r4();
        if (c4850dM64464r4 != null && c4850dM64464r4.f4954h.m64808g()) {
            AccountType fromType = ((UIState) getState()).getAccountInfo().getFromType();
            String code2 = null;
            if (fromType != null) {
                strName = fromType.name();
            } else {
                strName = null;
            }
            AccountType toType = ((UIState) getState()).getAccountInfo().getToType();
            if (toType != null) {
                strName2 = toType.name();
            } else {
                strName2 = null;
            }
            String strM66668h2 = "DEFAULT";
            if (!Intrinsics.areEqual(strName, SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
                strM66668h = "DEFAULT";
            } else {
                SymbolInfoEntity fromSymbolBean = ((UIState) getState()).getFromSymbolBean();
                if (fromSymbolBean != null) {
                    code = fromSymbolBean.getCode();
                } else {
                    code = null;
                }
                strM66668h = C27041f.m66668h(code);
            }
            if (Intrinsics.areEqual(strName2, SharedPositionInfo.MARGIN_MODE_ISOLATED)) {
                SymbolInfoEntity toSymbolBean = ((UIState) getState()).getToSymbolBean();
                if (toSymbolBean != null) {
                    code2 = toSymbolBean.getCode();
                }
                strM66668h2 = C27041f.m66668h(code2);
            }
            sendIntent(new TransferStateContract$UiIntent.GoTransfer(c4850dM64464r4.f4954h.getF52961q(), strName, strName2, strM66668h, strM66668h2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t4 */
    public final void m64466t4(boolean z11) {
        C4850d c4850dM64464r4 = m64464r4();
        if (c4850dM64464r4 != null) {
            boolean z12 = false;
            if (!((UIState) getState()).getIsMultiAccountMode()) {
                AccountType fromType = ((UIState) getState()).getAccountInfo().getFromType();
                AccountType accountType = AccountType.ISOLATED;
                if (fromType != accountType && ((UIState) getState()).getAccountInfo().getToType() != accountType) {
                    TextView tvBatchTitle = c4850dM64464r4.f4958l;
                    Intrinsics.checkNotNullExpressionValue(tvBatchTitle, "tvBatchTitle");
                    C26268b.m64515d(tvBatchTitle, z11);
                    KcSmallSwitchButton switchButton = c4850dM64464r4.f4952f;
                    Intrinsics.checkNotNullExpressionValue(switchButton, "switchButton");
                    C26268b.m64515d(switchButton, z11);
                    if (!z11) {
                        c4850dM64464r4.f4952f.setChecked(false);
                    } else {
                        C43852m.m96595g("B1transferNew", "batchTransfer", null, null, 12, null);
                    }
                    if (c4850dM64464r4.f4952f.isChecked() && z11) {
                        z12 = true;
                    }
                    m64456j5(z12);
                    return;
                }
            }
            TextView tvBatchTitle2 = c4850dM64464r4.f4958l;
            Intrinsics.checkNotNullExpressionValue(tvBatchTitle2, "tvBatchTitle");
            C26268b.m64515d(tvBatchTitle2, false);
            KcSmallSwitchButton switchButton2 = c4850dM64464r4.f4952f;
            Intrinsics.checkNotNullExpressionValue(switchButton2, "switchButton");
            C26268b.m64515d(switchButton2, false);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final void m64467u4() {
        AccountType accountTypeOfName;
        String strM56284y;
        TransferCoinPairView transferCoinPairView;
        TransferCoinPairView transferCoinPairView2;
        TransferCoinPairView transferCoinPairView3;
        TransferCoinPairView transferCoinPairView4;
        String strM56284y2;
        String strM56284y3;
        Bundle arguments = getArguments();
        SymbolInfoEntity symbolInfoEntityM85601B = null;
        if (arguments != null && (strM56284y3 = RouteExKt.m56284y(arguments, TypedValues.TransitionType.S_TO)) != null) {
            accountTypeOfName = AccountType.INSTANCE.ofName(strM56284y3);
        } else {
            accountTypeOfName = null;
        }
        if (accountTypeOfName == AccountType.ISOLATED) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                strM56284y = RouteExKt.m56284y(arguments2, "coin");
            } else {
                strM56284y = null;
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null && (strM56284y2 = RouteExKt.m56284y(arguments3, "to_symbol")) != null) {
                symbolInfoEntityM85601B = C37890n.f85269a.m85601B(strM56284y2);
            }
            if (strM56284y != null && !StringsKt.isBlank(strM56284y) && symbolInfoEntityM85601B != null && Intrinsics.areEqual(strM56284y, symbolInfoEntityM85601B.getBaseCurrency())) {
                C4850d c4850dM64464r4 = m64464r4();
                if (c4850dM64464r4 != null && (transferCoinPairView4 = c4850dM64464r4.f4955i) != null) {
                    transferCoinPairView4.setBaseCoinSelected(true);
                }
                C4850d c4850dM64464r5 = m64464r4();
                if (c4850dM64464r5 != null && (transferCoinPairView3 = c4850dM64464r5.f4955i) != null) {
                    transferCoinPairView3.setQuoteCoinSelected(false);
                    return;
                }
                return;
            }
            C4850d c4850dM64464r6 = m64464r4();
            if (c4850dM64464r6 != null && (transferCoinPairView2 = c4850dM64464r6.f4955i) != null) {
                transferCoinPairView2.setBaseCoinSelected(false);
            }
            C4850d c4850dM64464r7 = m64464r4();
            if (c4850dM64464r7 != null && (transferCoinPairView = c4850dM64464r7.f4955i) != null) {
                transferCoinPairView.setQuoteCoinSelected(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public final void m64468v4(TransferAccountView transferAccountView) {
        String code;
        C4850d c4850dM64464r4 = m64464r4();
        if (c4850dM64464r4 != null) {
            String strName = transferAccountView.getF52952c().name();
            String strName2 = transferAccountView.getF52953d().name();
            SymbolInfoEntity f52954e = transferAccountView.getF52954e();
            SymbolInfoEntity f52955f = transferAccountView.getF52955f();
            CoinInfoEntity coinInfo = ((UIState) getState()).getCoinInfo();
            if (coinInfo != null) {
                code = coinInfo.getCode();
            } else {
                code = null;
            }
            sendIntent(new TransferStateContract$UiIntent.CheckCoinInAccount(strName, strName2, f52954e, f52955f, code));
            c4850dM64464r4.f4953g.m64794m(transferAccountView.getF52952c(), ((UIState) getState()).getIsMultiAccountMode());
            c4850dM64464r4.f4953g.setToAccount(transferAccountView.getF52953d());
            if (((UIState) getState()).getIsSupportBatchTransfer() && c4850dM64464r4.f4952f.isChecked()) {
                AccountType.Companion companion = AccountType.INSTANCE;
                C12572a.m23695d("update_batch_transfer_coin_info", new AccountInfos(companion.ofName(transferAccountView.getF52952c().name()), companion.ofName(transferAccountView.getF52953d().name()), Boolean.FALSE), 0L, 4, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w4 */
    public final void m64469w4(final TransferAccountView transferAccountView) {
        String code;
        List<AccountItem> mutableList;
        String symbol;
        final AccountType fromType = ((UIState) getState()).getAccountInfo().getFromType();
        final boolean isMultiAccountMode = ((UIState) getState()).getIsMultiAccountMode();
        TransProDialogFragment.Companion companion = TransProDialogFragment.f52815E0;
        boolean isMultiAccountMode2 = ((UIState) getState()).getIsMultiAccountMode();
        CoinInfoEntity coinInfo = ((UIState) getState()).getCoinInfo();
        String symbol2 = null;
        if (coinInfo != null) {
            code = coinInfo.getCode();
        } else {
            code = null;
        }
        List<AccountItem> fromAccountList = ((UIState) getState()).getFromAccountList();
        if (fromAccountList != null) {
            mutableList = CollectionsKt.toMutableList((Collection) fromAccountList);
        } else {
            mutableList = null;
        }
        AccountType f52952c = transferAccountView.getF52952c();
        AccountType f52953d = transferAccountView.getF52953d();
        SymbolInfoEntity fromSymbolBean = ((UIState) getState()).getFromSymbolBean();
        if (fromSymbolBean != null) {
            symbol = fromSymbolBean.getSymbol();
        } else {
            symbol = null;
        }
        SymbolInfoEntity toSymbolBean = ((UIState) getState()).getToSymbolBean();
        if (toSymbolBean != null) {
            symbol2 = toSymbolBean.getSymbol();
        }
        TransProDialogFragment transProDialogFragmentCreate = companion.create(true, isMultiAccountMode2, code, mutableList, f52952c, f52953d, symbol, symbol2);
        transProDialogFragmentCreate.m64627G4(new Function4() { // from class: com.kubi.transfer.q
            @Override // p852kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return TransferFragment.m64442x4(isMultiAccountMode, fromType, this, transferAccountView, ((Boolean) obj).booleanValue(), (List) obj2, (AccountItem) obj3, ((Boolean) obj4).booleanValue());
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        transProDialogFragmentCreate.show(childFragmentManager, "TransProDialogFragment-from");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final void m64470z4(final TransferAccountView transferAccountView) {
        String code;
        List<AccountItem> mutableList;
        String symbol;
        final AccountType toType = ((UIState) getState()).getAccountInfo().getToType();
        final boolean isMultiAccountMode = ((UIState) getState()).getIsMultiAccountMode();
        TransProDialogFragment.Companion companion = TransProDialogFragment.f52815E0;
        boolean isMultiAccountMode2 = ((UIState) getState()).getIsMultiAccountMode();
        CoinInfoEntity coinInfo = ((UIState) getState()).getCoinInfo();
        String symbol2 = null;
        if (coinInfo != null) {
            code = coinInfo.getCode();
        } else {
            code = null;
        }
        List<AccountItem> toAccountList = ((UIState) getState()).getToAccountList();
        if (toAccountList != null) {
            mutableList = CollectionsKt.toMutableList((Collection) toAccountList);
        } else {
            mutableList = null;
        }
        AccountType f52952c = transferAccountView.getF52952c();
        AccountType f52953d = transferAccountView.getF52953d();
        SymbolInfoEntity fromSymbolBean = ((UIState) getState()).getFromSymbolBean();
        if (fromSymbolBean != null) {
            symbol = fromSymbolBean.getSymbol();
        } else {
            symbol = null;
        }
        SymbolInfoEntity toSymbolBean = ((UIState) getState()).getToSymbolBean();
        if (toSymbolBean != null) {
            symbol2 = toSymbolBean.getSymbol();
        }
        TransProDialogFragment transProDialogFragmentCreate = companion.create(false, isMultiAccountMode2, code, mutableList, f52952c, f52953d, symbol, symbol2);
        transProDialogFragmentCreate.m64627G4(new Function4() { // from class: com.kubi.transfer.z
            @Override // p852kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return TransferFragment.m64365A4(isMultiAccountMode, toType, this, transferAccountView, ((Boolean) obj).booleanValue(), (List) obj2, (AccountItem) obj3, ((Boolean) obj4).booleanValue());
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        transProDialogFragmentCreate.show(childFragmentManager, "TransProDialogFragment-to");
    }
}
