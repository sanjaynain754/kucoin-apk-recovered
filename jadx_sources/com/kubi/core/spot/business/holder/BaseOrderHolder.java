package com.kubi.core.spot.business.holder;

import af.C0296a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.viewbinding.ViewBinding;
import com.blankj.utilcode.util.C5275i0;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.biz.submit.SubmitOrderConfig;
import com.kubi.core.biz.submit.TradeSubmitBizContract$UiIntent;
import com.kubi.core.biz.submit.TradeSubmitVM;
import com.kubi.core.biz.submit.UiState;
import com.kubi.core.spot.entity.MarginSymbolInfo;
import com.kubi.core.spot.helper.ITradeTypeRequestOrder;
import com.kubi.core.view.SpotInputProgressView;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.margin.api.entity.FeeEntity;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.C23184z2;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.TradeInputLayoutEditor;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.tradecorebiz.R$style;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27086s0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.C27029c;
import ee.C37136a;
import f00.C37304a;
import g00.InterfaceC37758j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Predicate;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.Map;
import k30.AvailableTradeAmountValue;
import kotlinx.coroutines.C41696j;
import me.InterfaceC42516c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p402kf.C41016c;
import p429lf.C42180b;
import p661ue.C45193a;
import p827zc.AbstractC46753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import v30.C45371a0;

/* JADX INFO: compiled from: BaseOrderHolder.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\n\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B;\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010$\u001a\u00020%H\u0002J\b\u00106\u001a\u00020%H\u0002J\u0010\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020\tH\u0002J\b\u00109\u001a\u00020%H\u0017J\u0010\u0010:\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\b\u0010;\u001a\u00020%H\u0002J\b\u0010<\u001a\u00020%H\u0002J\b\u0010=\u001a\u0004\u0018\u00010>J\b\u0010?\u001a\u0004\u0018\u00010>J\u0006\u0010@\u001a\u00020\tJ\u0006\u0010A\u001a\u00020\tJ\b\u0010B\u001a\u00020%H\u0016J\b\u0010C\u001a\u00020\u0001H\u0016J \u0010D\u001a\u00020%2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\t2\u0006\u0010H\u001a\u00020\tH\u0016J\u000e\u0010I\u001a\u00020%2\u0006\u0010J\u001a\u00020\tJ\u0010\u0010K\u001a\u00020\t2\b\b\u0002\u0010L\u001a\u00020\tJ\b\u0010M\u001a\u00020%H\u0002J\u0010\u0010N\u001a\u00020-2\b\b\u0002\u0010O\u001a\u00020\tJ\u0006\u0010P\u001a\u00020-J\u0010\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020-H\u0004J\u0018\u0010T\u001a\u00020-2\u0006\u0010U\u001a\u00020-2\u0006\u0010V\u001a\u00020'H\u0016J\b\u0010W\u001a\u00020%H\u0016J\u0012\u0010X\u001a\u00020-2\b\b\u0002\u0010Y\u001a\u00020\tH\u0016J\b\u0010Z\u001a\u00020\tH\u0002J\b\u0010[\u001a\u0004\u0018\u00010\\J\b\u0010]\u001a\u00020'H&J\b\u0010^\u001a\u00020%H&J\b\u0010_\u001a\u00020`H&J\u0014\u0010a\u001a\u0004\u0018\u00010`2\b\b\u0002\u0010b\u001a\u00020\tH\u0016J\b\u0010c\u001a\u00020%H\u0016J\n\u0010d\u001a\u0004\u0018\u00010`H\u0016J\n\u0010e\u001a\u0004\u0018\u00010-H&J\n\u0010f\u001a\u0004\u0018\u00010RH&J\b\u0010g\u001a\u00020%H&J\b\u0010h\u001a\u00020%H\u0016J\u0006\u0010i\u001a\u00020%J\b\u0010j\u001a\u00020%H\u0002J\b\u0010k\u001a\u00020%H&J\u0010\u0010l\u001a\u00020%2\u0006\u0010m\u001a\u00020-H&J\b\u0010n\u001a\u00020oH&J\u0014\u0010p\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020R0qH&J\u0010\u0010r\u001a\u00020%2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010s\u001a\u00020%2\u0006\u0010t\u001a\u00020'H\u0016J\b\u0010u\u001a\u00020%H\u0016J\b\u0010v\u001a\u00020%H\u0016J\u0006\u0010w\u001a\u00020\tJ\u0006\u0010x\u001a\u00020\tJ\b\u0010y\u001a\u00020\tH\u0004J\u0006\u0010z\u001a\u00020%R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006{"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/BaseOrderHolder;", "Landroid/widget/LinearLayout;", "Lcom/kubi/core/spot/helper/ITradeTypeRequestOrder;", "Lcom/kubi/core/spot/business/holder/ITradeHolderImpDelegate;", "context", "Landroid/content/Context;", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "isStop", "", "isHorizontal", "diffTradeImp", "Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;", "submitVm", "Lcom/kubi/core/biz/submit/TradeSubmitVM;", "<init>", "(Landroid/content/Context;Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;ZZLcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;Lcom/kubi/core/biz/submit/TradeSubmitVM;)V", "getParentBehavior", "()Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "()Z", "getDiffTradeImp", "()Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;", "getSubmitVm", "()Lcom/kubi/core/biz/submit/TradeSubmitVM;", "binding", "Lcom/kubi/tradecorebiz/databinding/IncludeCoreTradeInputBaseQuoteValueBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/IncludeCoreTradeInputBaseQuoteValueBinding;", "binding$delegate", "Lkotlin/Lazy;", "isAutoInput", "isBuyHolder", "setBuyHolder", "(Z)V", "submitBtn", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "init", "", "count", "", "getCount", "()I", "setCount", "(I)V", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "Ljava/math/BigDecimal;", "getLatestPrice", "()Ljava/math/BigDecimal;", "setLatestPrice", "(Ljava/math/BigDecimal;)V", "balanceFetchHandler", "Landroid/os/Handler;", "balanceFetchRunnable", "Ljava/lang/Runnable;", "initListener", "handleFirstClickAndAdjustNum", "isSub", "notifyHolderAsset", "setIsBuyHolder", "createSubmit", "initProgressPercent", "getQuoteUnitTextView", "Lcom/kubi/resources/widget/DashTextView;", "getBaseUnitTextView", "isRgFullPercent", "needClearRgPercentCheckStatus", "onActionTypeChanged", "getView", "refreshButtonStatus", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "isMaintenance", "reset", "setAmountByPercent", "needToast", "checkAvailableSizeOk", "needHint", "showInsufficientDialog", "getTradeFeeRate", "includeTax", "getTaxRate", "getFormat", "", "amount", "beforeCheckFee", "amountValue", "scale", "onSymbolChanged", "getAvailableBalance", "isReal", "checkIfSymbolAssetSame", "getProgressPercent", "Lcom/kubi/core/view/SpotInputProgressView;", "getLayoutId", "onSubmitClick", "getNumEditText", "Lcom/kubi/resources/widget/TradeInputLayoutProxy;", "getPriceEditText", "isMin", "initViewBinding", "getAmountEditText", "getMaxDealAmount", "getTrackOrderType", "requestOrder", "initView", "bindAvailableTradeAmount", "showAvailableTradeAmountDescription", "onLegalCurrencyChanged", "onClickPriceCallBack", FirebaseAnalytics.Param.PRICE, "getViewBinding", "Landroidx/viewbinding/ViewBinding;", "getParamsForReport", "", "onBboDataGet", "onOrderModeCheck", "mode", "onCouponsDataGet", "isSupportBorrow", "isMarginBaseAllowBorrow", "isMarginQuoteAllowBorrow", "isMarginAccount", "resetPriceInput", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"KCCyclomaticComplexityCheck"})
@SourceDebugExtension({"SMAP\nBaseOrderHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseOrderHolder.kt\ncom/kubi/core/spot/business/holder/BaseOrderHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 SpotIssue.kt\ncom/kubi/core/spot/exeption/SpotIssueKt\n*L\n1#1,755:1\n1#2:756\n65#3,16:757\n93#3,3:773\n65#3,16:776\n93#3,3:792\n44#4,8:795\n*S KotlinDebug\n*F\n+ 1 BaseOrderHolder.kt\ncom/kubi/core/spot/business/holder/BaseOrderHolder\n*L\n121#1:757,16\n121#1:773,3\n125#1:776,16\n125#1:792,3\n564#1:795,8\n*E\n"})
public abstract class BaseOrderHolder extends LinearLayout implements ITradeTypeRequestOrder, ITradeHolderImpDelegate {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ITradeHolderDependDelegate f21029b;

    /* JADX INFO: renamed from: c */
    public final boolean f21030c;

    /* JADX INFO: renamed from: d */
    public final boolean f21031d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final ITradeDiffBizDefine f21032e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final TradeSubmitVM f21033f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Lazy f21034g;

    /* JADX INFO: renamed from: h */
    public boolean f21035h;

    /* JADX INFO: renamed from: i */
    public boolean f21036i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final KcPrimaryButton f21037j;

    /* JADX INFO: renamed from: k */
    public int f21038k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public BigDecimal f21039l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public final Handler f21040m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public final Runnable f21041n;

    /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.BaseOrderHolder$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 BaseOrderHolder.kt\ncom/kubi/core/spot/business/holder/BaseOrderHolder\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n122#2,3:98\n71#3:101\n77#4:102\n*E\n"})
    public static final class C12297a implements TextWatcher {
        public C12297a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            if (TextUtils.isEmpty(String.valueOf(s11))) {
                BaseOrderHolder.this.setCount(0);
            }
            BaseOrderHolder.this.getF21032e().mo23230q(BaseOrderHolder.this);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.BaseOrderHolder$b */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0000"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 BaseOrderHolder.kt\ncom/kubi/core/spot/business/holder/BaseOrderHolder\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n127#2,3:98\n71#3:101\n77#4:102\n*E\n"})
    public static final class C12298b implements TextWatcher {
        public C12298b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            BaseOrderHolder.this.f21040m.removeCallbacks(BaseOrderHolder.this.f21041n);
            BaseOrderHolder.this.f21040m.postDelayed(BaseOrderHolder.this.f21041n, 200L);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.BaseOrderHolder$c */
    /* JADX INFO: compiled from: BaseOrderHolder.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/core/spot/business/holder/BaseOrderHolder$initListener$1", "Lcom/kubi/resources/widget/TradeInputLayoutEditor$OnSubOrAddClickListener;", "click", "", "isSub", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nBaseOrderHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseOrderHolder.kt\ncom/kubi/core/spot/business/holder/BaseOrderHolder$initListener$1\n+ 2 SpotIssue.kt\ncom/kubi/core/spot/exeption/SpotIssueKt\n*L\n1#1,755:1\n44#2,8:756\n*S KotlinDebug\n*F\n+ 1 BaseOrderHolder.kt\ncom/kubi/core/spot/business/holder/BaseOrderHolder$initListener$1\n*L\n117#1:756,8\n*E\n"})
    public static final class C12299c implements TradeInputLayoutEditor.InterfaceC22960b {
        public C12299c() {
        }

        @Override // com.kubi.resources.widget.TradeInputLayoutEditor.InterfaceC22960b
        /* JADX INFO: renamed from: a */
        public void mo22972a(boolean z11) {
            Object objM103844constructorimpl;
            BaseOrderHolder baseOrderHolder = BaseOrderHolder.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                baseOrderHolder.m22957Y(z11);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C45193a.m99856c(thM103847exceptionOrNullimpl, "handleFirstClickAndAdjustNum");
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.BaseOrderHolder$d */
    /* JADX INFO: compiled from: BaseOrderHolder.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/core/spot/business/holder/BaseOrderHolder$initProgressPercent$3", "Lcom/kubi/utils/SimpleObserver;", "", "onNext", "", "o", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12300d extends C27086s0<CharSequence> {
        public C12300d() {
        }

        @Override // com.kubi.utils.C27086s0, io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(CharSequence o11) {
            Intrinsics.checkNotNullParameter(o11, "o");
            SpotInputProgressView progressPercent = BaseOrderHolder.this.getProgressPercent();
            if (progressPercent != null) {
                progressPercent.m23419J();
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    private final void m22906Z() {
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(getLayoutId(), this);
        mo22960o0();
        this.f21032e.mo23226m(getViewBinding());
        m22952N();
        m22958b0();
        mo22885h0();
        m22907a0();
        this.f21032e.mo23227n(this);
    }

    /* JADX INFO: renamed from: A0 */
    public abstract void mo22940A0(@NotNull BigDecimal bigDecimal);

    /* JADX INFO: renamed from: C0 */
    public abstract void mo22942C0();

    /* JADX INFO: renamed from: D0 */
    public abstract void mo22943D0();

    /* JADX INFO: renamed from: F0 */
    public final void m22945F0() {
        EditText editText;
        EditText editText2;
        Editable text;
        EditText editText3;
        CharSequence text2;
        EditText editText4;
        TradeInputLayoutProxy tradeInputLayoutProxyM22904V = m22904V(this, false, 1, null);
        CharSequence charSequence = "";
        if (tradeInputLayoutProxyM22904V != null && (editText3 = tradeInputLayoutProxyM22904V.getEditText()) != null) {
            TradeInputLayoutProxy tradeInputLayoutProxyM22904V2 = m22904V(this, false, 1, null);
            if (tradeInputLayoutProxyM22904V2 == null || (editText4 = tradeInputLayoutProxyM22904V2.getEditText()) == null || (text2 = editText4.getText()) == null) {
                text2 = "";
            }
            editText3.setText(text2);
        }
        TradeInputLayoutProxy amountEditText = getAmountEditText();
        if (amountEditText == null || (editText = amountEditText.getEditText()) == null) {
            return;
        }
        TradeInputLayoutProxy amountEditText2 = getAmountEditText();
        if (amountEditText2 != null && (editText2 = amountEditText2.getEditText()) != null && (text = editText2.getText()) != null) {
            charSequence = text;
        }
        editText.setText(charSequence);
    }

    @Nullable
    /* JADX INFO: renamed from: U */
    public TradeInputLayoutProxy mo22955U(boolean z11) {
        return null;
    }

    /* JADX INFO: renamed from: Y */
    public final void m22957Y(boolean z11) {
        int i11;
        BigDecimal value;
        TradeInputLayoutProxy tradeInputLayoutProxyMo22955U = mo22955U(true);
        if (tradeInputLayoutProxyMo22955U == null || TextUtils.isEmpty(tradeInputLayoutProxyMo22955U.getEditText().getText()) || z11 || (i11 = this.f21038k) != 0) {
            return;
        }
        this.f21038k = i11 + 1;
        BigDecimal bigDecimalMultiply = tradeInputLayoutProxyMo22955U.getValue().multiply(getNumEditText().getValue());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(C37890n.f85269a.m85618z(this.f21029b.mo22365N().getQuoteCurrency())));
        if (bigDecimalMultiply.compareTo(bigDecimal) < 0) {
            BigDecimal value2 = tradeInputLayoutProxyMo22955U.getValue();
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            if (value2.compareTo(bigDecimal2) == 0) {
                value = this.f21039l;
                if (value.compareTo(bigDecimal2) <= 0) {
                    value = null;
                }
            } else {
                value = tradeInputLayoutProxyMo22955U.getValue();
            }
            if (value == null) {
                return;
            }
            BigDecimal scale = (BigDecimal) RangesKt.coerceAtLeast(bigDecimal.divide(value, getNumEditText().getF44119f(), RoundingMode.UP), new BigDecimal(String.valueOf(this.f21029b.mo22365N().getBaseMinSize())));
            String baseIncrement = this.f21029b.mo22365N().getBaseIncrement();
            BigDecimal bigDecimal3 = baseIncrement != null ? new BigDecimal(baseIncrement) : bigDecimal2;
            if (bigDecimal3.compareTo(bigDecimal2) > 0) {
                RoundingMode roundingMode = RoundingMode.DOWN;
                scale = scale.divide(bigDecimal3, 0, roundingMode).multiply(bigDecimal3).setScale(getNumEditText().getF44119f(), roundingMode);
                if (scale.multiply(value).compareTo(bigDecimal) < 0) {
                    scale = scale.add(bigDecimal3).setScale(getNumEditText().getF44119f(), roundingMode);
                }
            }
            TradeInputLayoutProxy numEditText = getNumEditText();
            Intrinsics.checkNotNull(scale);
            numEditText.setValue(scale);
        }
    }

    @Nullable
    public TradeInputLayoutProxy getAmountEditText() {
        return null;
    }

    public abstract int getLayoutId();

    @Nullable
    public abstract BigDecimal getMaxDealAmount();

    @NotNull
    public abstract TradeInputLayoutProxy getNumEditText();

    @NotNull
    public abstract Map<String, String> getParamsForReport();

    @Nullable
    public abstract String getTrackOrderType();

    @NotNull
    public abstract ViewBinding getViewBinding();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseOrderHolder(@NotNull Context context, @NotNull ITradeHolderDependDelegate parentBehavior, boolean z11, boolean z12, @NotNull ITradeDiffBizDefine diffTradeImp, @NotNull TradeSubmitVM submitVm) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(diffTradeImp, "diffTradeImp");
        Intrinsics.checkNotNullParameter(submitVm, "submitVm");
        this.f21029b = parentBehavior;
        this.f21030c = z11;
        this.f21031d = z12;
        this.f21032e = diffTradeImp;
        this.f21033f = submitVm;
        this.f21034g = LazyKt.lazy(new Function0() { // from class: com.kubi.core.spot.business.holder.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseOrderHolder.m22892I(this.f21171b);
            }
        });
        this.f21036i = true;
        KcPrimaryButton kcPrimaryButton = new KcPrimaryButton(new ContextThemeWrapper(context, R$style.styleButton40), null, R.attr.textViewStyle);
        kcPrimaryButton.setAnimationEnabled(false);
        this.f21037j = kcPrimaryButton;
        m22906Z();
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.f21039l = ZERO;
        this.f21040m = new Handler(Looper.getMainLooper());
        this.f21041n = new Runnable() { // from class: com.kubi.core.spot.business.holder.s
            @Override // java.lang.Runnable
            public final void run() {
                BaseOrderHolder.m22891F(this.f21191b);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public static final void m22891F(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.f21033f.m22455B0(new TradeSubmitBizContract$UiIntent.FetchSymbolBalance(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    /* JADX INFO: renamed from: I0 */
    public static final Unit m22893I0(final BaseOrderHolder baseOrderHolder, final String str, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        int i11 = R$id.tvBuyCrypto;
        viewHolder.setGone(i11, C24129b.m58030b(SiteVisibleConfigKey.FastTrade)).setOnClickListener(R$id.tvTransfer, new View.OnClickListener() { // from class: com.kubi.core.spot.business.holder.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseOrderHolder.m22894J0(this.f21166b, str, dialogFragmentHelper, view);
            }
        }).setOnClickListener(R$id.tvDeposit, new View.OnClickListener() { // from class: com.kubi.core.spot.business.holder.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseOrderHolder.m22896K0(this.f21175b, str, dialogFragmentHelper, view);
            }
        }).setOnClickListener(i11, new View.OnClickListener() { // from class: com.kubi.core.spot.business.holder.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseOrderHolder.m22898L0(this.f21181b, str, dialogFragmentHelper, view);
            }
        }).setOnClickListener(R$id.tv_cancel, new View.OnClickListener() { // from class: com.kubi.core.spot.business.holder.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseOrderHolder.m22899M0(this.f21186b, dialogFragmentHelper, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J0 */
    public static final void m22894J0(BaseOrderHolder baseOrderHolder, String str, DialogFragmentHelper dialogFragmentHelper, View view) {
        baseOrderHolder.f21032e.mo23216b().mo23267g();
        baseOrderHolder.f21032e.mo23225l(str);
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ boolean m22895K(BaseOrderHolder baseOrderHolder, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkAvailableSizeOk");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return baseOrderHolder.m22950J(z11);
    }

    /* JADX INFO: renamed from: K0 */
    public static final void m22896K0(BaseOrderHolder baseOrderHolder, String str, DialogFragmentHelper dialogFragmentHelper, View view) {
        baseOrderHolder.f21032e.mo23216b().mo23261a();
        ISpotCommonService.f49644a.get().mo59965i(str);
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: L */
    public static final void m22897L(BaseOrderHolder baseOrderHolder) {
        ToastCompat.m66437C(R$string.order_balance_insufficient_tips);
        baseOrderHolder.m22949H0();
    }

    /* JADX INFO: renamed from: L0 */
    public static final void m22898L0(BaseOrderHolder baseOrderHolder, String str, DialogFragmentHelper dialogFragmentHelper, View view) {
        baseOrderHolder.f21032e.mo23216b().mo23264d();
        InterfaceC37758j.a.m85163l(C37304a.f82764a, null, C41016c.m89965c(), str, null, null, null, null, 121, null);
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: M0 */
    public static final void m22899M0(BaseOrderHolder baseOrderHolder, DialogFragmentHelper dialogFragmentHelper, View view) {
        baseOrderHolder.f21032e.mo23216b().mo23263c();
        dialogFragmentHelper.dismiss();
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m22900O(final BaseOrderHolder baseOrderHolder) throws Exception {
        Object next;
        IHolderTrackDefine iHolderTrackDefineMo23216b = baseOrderHolder.f21032e.mo23216b();
        TradeAccountType tradeAccountTypeM21024o = baseOrderHolder.f21033f.getF20070W();
        ITradeHolderDependDelegate iTradeHolderDependDelegate = baseOrderHolder.f21029b;
        boolean z11 = baseOrderHolder.f21036i;
        String trackOrderType = baseOrderHolder.getTrackOrderType();
        if (trackOrderType == null) {
            trackOrderType = "";
        }
        iHolderTrackDefineMo23216b.mo23269i(tradeAccountTypeM21024o, iTradeHolderDependDelegate, z11, trackOrderType, baseOrderHolder.getParamsForReport());
        Iterator<T> it = baseOrderHolder.f21032e.mo23224k().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((InterfaceC42516c) next).mo93235a(baseOrderHolder.f21029b.mo22359J(), baseOrderHolder.f21029b.mo22363M(), baseOrderHolder.f21029b.mo22357H().getChildFragmentManager()));
        if (next != null) {
            return Unit.INSTANCE;
        }
        baseOrderHolder.getNumEditText().setValue(baseOrderHolder.mo22946G(baseOrderHolder.getNumEditText().getValue(), baseOrderHolder.getNumEditText().getF44119f()));
        C12322c0.m23255e(baseOrderHolder.f21037j, new Action() { // from class: com.kubi.core.spot.business.holder.j
            @Override // io.reactivex.functions.Action
            public final void run() {
                BaseOrderHolder.m22901P(this.f21139b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final void m22901P(final BaseOrderHolder baseOrderHolder) {
        IHolderTrackDefine iHolderTrackDefineMo23216b = baseOrderHolder.f21032e.mo23216b();
        Context context = baseOrderHolder.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ITradeHolderDependDelegate iTradeHolderDependDelegate = baseOrderHolder.f21029b;
        boolean z11 = baseOrderHolder.f21036i;
        String trackOrderType = baseOrderHolder.getTrackOrderType();
        if (trackOrderType == null) {
            trackOrderType = "";
        }
        iHolderTrackDefineMo23216b.mo23268h(context, iTradeHolderDependDelegate, z11, trackOrderType);
        if (baseOrderHolder.f21032e.mo23219f()) {
            IMarginService.f32724a.get().mo37938h0(baseOrderHolder.f21029b.mo22357H(), new Function0() { // from class: com.kubi.core.spot.business.holder.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseOrderHolder.m22902Q(this.f21153b);
                }
            });
        } else {
            baseOrderHolder.mo22943D0();
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ BigDecimal m22903S(BaseOrderHolder baseOrderHolder, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAvailableBalance");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return baseOrderHolder.mo22953R(z11);
    }

    /* JADX INFO: renamed from: V */
    public static /* synthetic */ TradeInputLayoutProxy m22904V(BaseOrderHolder baseOrderHolder, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPriceEditText");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return baseOrderHolder.mo22955U(z11);
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ BigDecimal m22905X(BaseOrderHolder baseOrderHolder, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeFeeRate");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return baseOrderHolder.m22956W(z11);
    }

    /* JADX INFO: renamed from: c0 */
    public static final Unit m22908c0(BaseOrderHolder baseOrderHolder, BigDecimal it) throws Exception {
        Intrinsics.checkNotNullParameter(it, "it");
        if (m22904V(baseOrderHolder, false, 1, null) != null) {
            TradeInputLayoutProxy tradeInputLayoutProxyM22904V = m22904V(baseOrderHolder, false, 1, null);
            Intrinsics.checkNotNull(tradeInputLayoutProxyM22904V);
            if (C41014a.m89919D(tradeInputLayoutProxyM22904V.getValue())) {
                return Unit.INSTANCE;
            }
        }
        baseOrderHolder.setAmountByPercent(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d0 */
    public static final boolean m22909d0(BaseOrderHolder baseOrderHolder, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !baseOrderHolder.f21035h;
    }

    /* JADX INFO: renamed from: e0 */
    public static final boolean m22911e0(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: f0 */
    public static final Unit m22913f0(BaseOrderHolder baseOrderHolder) {
        ITradeDiffBizDefine iTradeDiffBizDefine = baseOrderHolder.f21032e;
        String baseCurrency = baseOrderHolder.f21029b.mo22365N().getBaseCurrency();
        Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
        iTradeDiffBizDefine.mo23235v(baseCurrency, baseOrderHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m22915g0(BaseOrderHolder baseOrderHolder) {
        ITradeDiffBizDefine iTradeDiffBizDefine = baseOrderHolder.f21032e;
        String quoteCurrency = baseOrderHolder.f21029b.mo22365N().getQuoteCurrency();
        Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
        iTradeDiffBizDefine.mo23235v(quoteCurrency, baseOrderHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k0 */
    public static final Unit m22921k0(BaseOrderHolder baseOrderHolder) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseOrderHolder.f21029b.mo22357H()), null, null, new BaseOrderHolder$initView$3$1(baseOrderHolder, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l0 */
    public static final Unit m22923l0(BaseOrderHolder baseOrderHolder) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(baseOrderHolder.f21029b.mo22357H()), null, null, new BaseOrderHolder$initView$4$1(baseOrderHolder, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m0 */
    public static final Unit m22925m0(BaseOrderHolder baseOrderHolder) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(C27017c.f54310a.m66516f(R$string.margin_order_borrow, "")).m54153J4(R$string.unify_margin_acount_borrow_tip).m54162S4(R$string.i_already_know, null).m54172c5(baseOrderHolder.f21029b.mo22357H().getChildFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public static final Unit m22927n0(BaseOrderHolder baseOrderHolder) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(C27017c.f54310a.m66516f(R$string.margin_order_borrow, "")).m54153J4(R$string.unify_margin_acount_borrow_tip).m54162S4(R$string.i_already_know, null).m54172c5(baseOrderHolder.f21029b.mo22357H().getChildFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAmountByPercent$lambda$19(BaseOrderHolder baseOrderHolder) {
        FragmentActivity activity = baseOrderHolder.f21029b.mo22357H().getActivity();
        if (activity != null) {
            KeyboardUtils.m6033e(activity);
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m22941B0() {
        this.f21032e.mo23221h(this.f21036i);
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public BigDecimal mo22946G(@NotNull BigDecimal amountValue, int i11) {
        Intrinsics.checkNotNullParameter(amountValue, "amountValue");
        if (!this.f21036i) {
            return amountValue;
        }
        BigDecimal bigDecimalMo22953R = mo22953R(false);
        if (C41014a.m89919D(bigDecimalMo22953R)) {
            return amountValue;
        }
        BigDecimal bigDecimalM22905X = m22905X(this, false, 1, null);
        BigDecimal bigDecimal = BigDecimal.ONE;
        BigDecimal bigDecimalAdd = bigDecimalM22905X.add(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        BigDecimal bigDecimalMultiply = amountValue.multiply(bigDecimalAdd);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        if (bigDecimalMultiply.compareTo(bigDecimalMo22953R) <= 0 || amountValue.compareTo(bigDecimalMo22953R) > 0) {
            return amountValue;
        }
        BigDecimal bigDecimalDivide = bigDecimalMo22953R.divide(m22905X(this, false, 1, null).add(bigDecimal), i11, RoundingMode.DOWN);
        Intrinsics.checkNotNull(bigDecimalDivide);
        return bigDecimalDivide;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m22947G0() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(getResources().getString(R$string.trade_buy_tip) + '/' + getResources().getString(R$string.trade_sell_tip)).m54153J4(R$string.kc_trade_buysell_content).m54162S4(R$string.i_already_know, null).m54172c5(this.f21029b.mo22357H().getChildFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public final void m22948H() {
        BaseTextView baseTextView;
        DashTextView dashTextView;
        ConstraintLayout constraintLayout;
        boolean zM58030b = C24129b.m58030b(SiteVisibleConfigKey.MaxBuyOrSell);
        C45371a0 binding = getBinding();
        if (binding != null && (constraintLayout = binding.f102001b) != null) {
            constraintLayout.setVisibility(zM58030b ? 0 : 8);
        }
        if (zM58030b) {
            AvailableTradeAmountValue buy = this.f21036i ? ((UiState) this.f21033f.getState()).getAvailableTradeAmount().getBuy() : ((UiState) this.f21033f.getState()).getAvailableTradeAmount().getSell();
            C45371a0 binding2 = getBinding();
            if (binding2 != null && (dashTextView = binding2.f102007h) != null) {
                dashTextView.setText(this.f21036i ? R$string.trade_buy_tip : R$string.trade_sell_tip);
            }
            C45371a0 binding3 = getBinding();
            if (binding3 == null || (baseTextView = binding3.f102008i) == null) {
                return;
            }
            baseTextView.setText(buy.m89509a());
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m22949H0() {
        final String currencyCode = this.f21036i ? this.f21029b.mo22366O().getCurrencyCode() : this.f21029b.mo22358I().getCurrencyCode();
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.trade_core_dialog_balance_is_insufficient, true).m54237f4(new Function2() { // from class: com.kubi.core.spot.business.holder.m
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BaseOrderHolder.m22893I0(this.f21161b, currencyCode, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = this.f21029b.mo22357H().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "balance insufficient");
        this.f21032e.mo23216b().mo23265e();
    }

    /* JADX INFO: renamed from: J */
    public final boolean m22950J(boolean z11) {
        SubmitOrderConfig submitOrderConfigMo96892a;
        AbstractC46753c abstractC46753cMo22375b2 = this.f21029b.mo22375b2();
        if (abstractC46753cMo22375b2 == null || (submitOrderConfigMo96892a = abstractC46753cMo22375b2.getF104580e()) == null || submitOrderConfigMo96892a.mo22537a()) {
            return this.f21032e.mo23238y(this, z11, new Action() { // from class: com.kubi.core.spot.business.holder.l
                @Override // io.reactivex.functions.Action
                public final void run() {
                    BaseOrderHolder.m22897L(this.f21157b);
                }
            });
        }
        return true;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m22951M() {
        if (Intrinsics.areEqual(this.f21029b.mo22366O().getCurrencyCode(), this.f21029b.mo22365N().getQuoteCurrency())) {
            return true;
        }
        this.f21029b.mo22360K();
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final void m22952N() {
        Space space = new Space(getContext());
        if (this.f21031d) {
            space.setMinimumHeight(C27029c.m66601d(space, 12));
        }
        addView(space, this.f21031d ? new LinearLayout.LayoutParams(-1, 0, 1.0f) : new LinearLayout.LayoutParams(-1, 0, 1.0f));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, C5275i0.m6236a(40.0f));
        this.f21037j.setBackgroundResource(R$drawable.selector_btn_primary_24r);
        this.f21037j.setTextSize(C27029c.m66601d(this, 15));
        this.f21037j.setTextColor(C27017c.f54310a.m66512a(R$color.c_textEmphasis));
        TextViewCompat.setAutoSizeTextTypeWithDefaults(this.f21037j, 1);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this.f21037j, C27029c.m66601d(this, 12), C27029c.m66601d(this, 15), 1, 0);
        this.f21037j.setPadding(C27029c.m66601d(this, 9), 0, C27029c.m66601d(this, 9), 0);
        this.f21037j.setMaxLines(1);
        this.f21037j.setEllipsize(TextUtils.TruncateAt.END);
        this.f21037j.setId(R$id.submit_trade);
        addView(this.f21037j, layoutParams);
        C27046k.m66711z(this.f21037j, 0L, new Function0() { // from class: com.kubi.core.spot.business.holder.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseOrderHolder.m22900O(this.f21131b);
            }
        }, 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final String m22954T(@NotNull BigDecimal amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return C42180b.m92640e(amount, null, this.f21029b.mo22365N().getQuoteIncrementPrecision(), false, true, false, 0, null, 117, null) + ' ' + this.f21029b.mo22365N().getQuoteCurrencyName();
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final BigDecimal m22956W(boolean z11) {
        C37136a c37136a = C37136a.f82407a;
        BigDecimal bigDecimalMo37956r = c37136a.m83062a().mo37956r(this.f21029b.mo22365N());
        BigDecimal bigDecimalMo37911J = c37136a.m83062a().mo37911J(this.f21029b.mo22365N());
        if (!z11) {
            return (BigDecimal) ComparisonsKt.maxOf(bigDecimalMo37956r, bigDecimalMo37911J);
        }
        BigDecimal bigDecimalAdd = ((BigDecimal) ComparisonsKt.maxOf(bigDecimalMo37956r, bigDecimalMo37911J)).add(getTaxRate());
        Intrinsics.checkNotNull(bigDecimalAdd);
        return bigDecimalAdd;
    }

    @Override // com.kubi.core.spot.business.holder.ITradeHolderImpDelegate
    /* JADX INFO: renamed from: c */
    public void mo22959c(@NotNull SymbolInfoEntity symbolInfo, boolean z11, boolean z12) {
        GradientDrawable gradientDrawableM54287l;
        String string;
        SubmitOrderConfig submitOrderConfigMo96892a;
        EditText editText;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3;
        ConstraintLayout constraintLayout4;
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        C45371a0 binding = getBinding();
        if (binding != null && (constraintLayout4 = binding.f102002c) != null) {
            constraintLayout4.setVisibility(!this.f21036i ? 0 : 8);
        }
        C45371a0 binding2 = getBinding();
        if (binding2 != null && (constraintLayout3 = binding2.f102004e) != null) {
            constraintLayout3.setVisibility(this.f21036i ? 0 : 8);
        }
        C45371a0 binding3 = getBinding();
        if (binding3 != null && (constraintLayout2 = binding3.f102003d) != null) {
            constraintLayout2.setVisibility(!this.f21036i ? 0 : 8);
        }
        C45371a0 binding4 = getBinding();
        if (binding4 != null && (constraintLayout = binding4.f102005f) != null) {
            constraintLayout.setVisibility(this.f21036i ? 0 : 8);
        }
        this.f21032e.mo23227n(this);
        KcPrimaryButton kcPrimaryButton = this.f21037j;
        C27017c c27017c = C27017c.f54310a;
        kcPrimaryButton.setTextColor(c27017c.m66512a(R$color.c_textEmphasis));
        if (z11) {
            this.f21037j.setBackgroundResource(R$drawable.shape_complementary16_24r);
            this.f21037j.setTextColor(c27017c.m66512a(R$color.complementary));
            this.f21037j.setText(R$string.outage_tip);
            if (this.f21031d) {
                this.f21037j.setVisibility(8);
                return;
            }
            return;
        }
        IUserService.Companion companion = IUserService.a;
        if (!companion.get().c()) {
            if (this.f21031d) {
                this.f21037j.setVisibility(8);
            }
            this.f21037j.setBackgroundResource(R$drawable.selector_btn_primary_24r);
            this.f21037j.setText(R$string.login);
            return;
        }
        this.f21037j.setVisibility(0);
        if (z12) {
            SpotInputProgressView progressPercent = getProgressPercent();
            if (progressPercent != null) {
                progressPercent.m23419J();
            }
            getNumEditText().getEditText().setText("");
            TradeInputLayoutProxy amountEditText = getAmountEditText();
            if (amountEditText != null && (editText = amountEditText.getEditText()) != null) {
                editText.setText("");
            }
        }
        if (this.f21032e.mo23219f()) {
            C37136a c37136a = C37136a.f82407a;
            if (!c37136a.m83064c().d0().isHasOpenLever() && !c37136a.m83063b().mo64979C()) {
                this.f21037j.setBackgroundResource(R$drawable.selector_btn_primary_20r);
                this.f21037j.setText(R$string.open_lever_trade);
                if (this.f21031d) {
                    this.f21037j.setVisibility(8);
                    return;
                }
                return;
            }
        }
        AbstractC46753c abstractC46753cMo22375b2 = this.f21029b.mo22375b2();
        if (abstractC46753cMo22375b2 != null && (submitOrderConfigMo96892a = abstractC46753cMo22375b2.getF104580e()) != null && submitOrderConfigMo96892a.mo22543g() && this.f21029b.mo22365N().isEtfSymbol() && !companion.get().d0().isAgreeEtf()) {
            this.f21037j.setBackgroundResource(R$drawable.selector_btn_primary_24r);
            this.f21037j.setText(R$string.etf_agree_terms);
            if (this.f21031d) {
                this.f21037j.setVisibility(8);
                return;
            }
            return;
        }
        KcPrimaryButton kcPrimaryButton2 = this.f21037j;
        if (this.f21036i) {
            Context context = getContext();
            Intrinsics.checkNotNull(context);
            gradientDrawableM54287l = C22890g.m54287l(C22890g.m54291p(context), 24.0f);
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNull(context2);
            gradientDrawableM54287l = C22890g.m54287l(C22890g.m54289n(context2), 24.0f);
        }
        kcPrimaryButton2.setBackground(gradientDrawableM54287l);
        KcPrimaryButton kcPrimaryButton3 = this.f21037j;
        if (this.f21036i) {
            string = getContext().getString(this.f21032e.mo23219f() ? R$string.buy_more_rich : R$string.buy_in_stub, this.f21029b.mo22365N().getBaseCurrencyName());
        } else {
            string = getContext().getString(this.f21032e.mo23219f() ? R$string.sell_less_rich : R$string.sell_stub, this.f21029b.mo22365N().getBaseCurrencyName());
        }
        kcPrimaryButton3.setText(string);
    }

    @Nullable
    public final C45371a0 getBinding() {
        return (C45371a0) this.f21034g.getValue();
    }

    /* JADX INFO: renamed from: getCount, reason: from getter */
    public final int getF21038k() {
        return this.f21038k;
    }

    @NotNull
    /* JADX INFO: renamed from: getDiffTradeImp, reason: from getter */
    public final ITradeDiffBizDefine getF21032e() {
        return this.f21032e;
    }

    @NotNull
    /* JADX INFO: renamed from: getLatestPrice, reason: from getter */
    public final BigDecimal getF21039l() {
        return this.f21039l;
    }

    @NotNull
    /* JADX INFO: renamed from: getParentBehavior, reason: from getter */
    public final ITradeHolderDependDelegate getF21029b() {
        return this.f21029b;
    }

    @Nullable
    public final SpotInputProgressView getProgressPercent() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl((SpotInputProgressView) findViewById(R$id.progress_percent));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C45193a.m99856c(thM103847exceptionOrNullimpl, "getProgressPercent");
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (SpotInputProgressView) objM103844constructorimpl;
    }

    @NotNull
    /* JADX INFO: renamed from: getSubmitVm, reason: from getter */
    public final TradeSubmitVM getF21033f() {
        return this.f21033f;
    }

    @NotNull
    public final BigDecimal getTaxRate() {
        FeeEntity feeEntityMo37947m0 = C37136a.f82407a.m83062a().mo37947m0(this.f21029b.mo22365N());
        return DowngradeExKt.m66535e(feeEntityMo37947m0 != null ? feeEntityMo37947m0.getBuyTaxRate() : null, null, 1, null);
    }

    /* JADX INFO: renamed from: p0, reason: from getter */
    public final boolean getF21036i() {
        return this.f21036i;
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public final boolean getF21031d() {
        return this.f21031d;
    }

    /* JADX INFO: renamed from: r0 */
    public final boolean m22963r0() {
        return Intrinsics.areEqual(this.f21033f.getF20070W(), TradeAccountType.Margin.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public final boolean m22964s0() {
        MarginSymbolInfo marginSymbolInfo;
        return Intrinsics.areEqual(this.f21033f.getF20070W(), TradeAccountType.Margin.INSTANCE) && (marginSymbolInfo = ((UiState) this.f21033f.getState()).getMarginSymbolInfo()) != null && marginSymbolInfo.isBaseAllowBorrow();
    }

    public final void setBuyHolder(boolean z11) {
        this.f21036i = z11;
    }

    public final void setCount(int i11) {
        this.f21038k = i11;
    }

    public void setIsBuyHolder(boolean isBuyHolder) {
        this.f21036i = isBuyHolder;
        this.f21029b.mo22382i0(isBuyHolder);
        mo22970y0();
        m22941B0();
        m22948H();
    }

    public final void setLatestPrice(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<set-?>");
        this.f21039l = bigDecimal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t0 */
    public final boolean m22965t0() {
        MarginSymbolInfo marginSymbolInfo;
        return Intrinsics.areEqual(this.f21033f.getF20070W(), TradeAccountType.Margin.INSTANCE) && (marginSymbolInfo = ((UiState) this.f21033f.getState()).getMarginSymbolInfo()) != null && marginSymbolInfo.isQuoteAllowBorrow();
    }

    /* JADX INFO: renamed from: v0, reason: from getter */
    public final boolean getF21030c() {
        return this.f21030c;
    }

    /* JADX INFO: renamed from: y0 */
    public void mo22970y0() {
        mo22959c(this.f21029b.mo22365N(), this.f21029b.mo22363M(), true);
    }

    /* JADX INFO: renamed from: z0 */
    public void mo22971z0(@NotNull BigDecimal latestPrice) {
        Intrinsics.checkNotNullParameter(latestPrice, "latestPrice");
        this.f21039l = latestPrice;
    }

    /* JADX INFO: renamed from: I */
    public static final C45371a0 m22892I(BaseOrderHolder baseOrderHolder) {
        return C45371a0.m100273a(baseOrderHolder.getViewBinding().getRoot());
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m22902Q(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.mo22943D0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    private final void m22907a0() {
        EditText editText;
        getNumEditText().setSubOrAddClickListener(new C12299c());
        getNumEditText().getEditText().addTextChangedListener(new C12297a());
        TradeInputLayoutProxy tradeInputLayoutProxyM22904V = m22904V(this, false, 1, null);
        if (tradeInputLayoutProxyM22904V != null && (editText = tradeInputLayoutProxyM22904V.getEditText()) != null) {
            editText.addTextChangedListener(new C12298b());
        }
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m22918i0(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.m22947G0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Unit m22919j0(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.m22947G0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E0 */
    public void mo22944E0() {
        TradeInputLayoutProxy numEditText = getNumEditText();
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        numEditText.setValue(ZERO);
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public BigDecimal mo22953R(boolean z11) {
        if (m22951M()) {
            return this.f21032e.mo23239z(this, this.f21036i, z11);
        }
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Intrinsics.checkNotNull(bigDecimal);
        return bigDecimal;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m22958b0() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        SpotInputProgressView progressPercent = getProgressPercent();
        if (progressPercent != null) {
            progressPercent.setOnPercentChangeListener(new Function1() { // from class: com.kubi.core.spot.business.holder.z
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseOrderHolder.m22908c0(this.f21218b, (BigDecimal) obj);
                }
            });
        }
        Observable<CharSequence> observableM55630j = C23184z2.m55630j(getNumEditText().getEditText());
        final Function1 function1 = new Function1() { // from class: com.kubi.core.spot.business.holder.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BaseOrderHolder.m22909d0(this.f21115b, (CharSequence) obj));
            }
        };
        observableM55630j.filter(new Predicate() { // from class: com.kubi.core.spot.business.holder.f
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BaseOrderHolder.m22911e0(function1, obj);
            }
        }).subscribe(new C12300d());
        C45371a0 binding = getBinding();
        if (binding != null && (baseTextView2 = binding.f102009j) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.core.spot.business.holder.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseOrderHolder.m22913f0(this.f21121b);
                }
            }, 1, null);
        }
        C45371a0 binding2 = getBinding();
        if (binding2 != null && (baseTextView = binding2.f102014o) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.core.spot.business.holder.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseOrderHolder.m22915g0(this.f21126b);
                }
            }, 1, null);
        }
    }

    @Nullable
    public final DashTextView getBaseUnitTextView() {
        C45371a0 binding = getBinding();
        if (binding != null) {
            return binding.f102012m;
        }
        return null;
    }

    @Nullable
    public final DashTextView getQuoteUnitTextView() {
        C45371a0 binding = getBinding();
        if (binding != null) {
            return binding.f102017r;
        }
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public void mo22885h0() {
        DashTextView dashTextView;
        DashTextView dashTextView2;
        DashTextView dashTextView3;
        DashTextView dashTextView4;
        DashTextView dashTextView5;
        DashTextView dashTextView6;
        DashTextView dashTextView7;
        DashTextView dashTextView8;
        BaseTextView baseTextView;
        DashTextView dashTextView9;
        DashTextView dashTextView10;
        C45371a0 binding = getBinding();
        if (binding != null && (dashTextView10 = binding.f102007h) != null) {
            dashTextView10.setNeedDash(true);
        }
        C45371a0 binding2 = getBinding();
        if (binding2 != null && (dashTextView9 = binding2.f102007h) != null) {
            C27046k.m66710y(dashTextView9, 1000L, new Function0() { // from class: com.kubi.core.spot.business.holder.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseOrderHolder.m22918i0(this.f21195b);
                }
            });
        }
        C45371a0 binding3 = getBinding();
        if (binding3 != null && (baseTextView = binding3.f102008i) != null) {
            C27046k.m66710y(baseTextView, 1000L, new Function0() { // from class: com.kubi.core.spot.business.holder.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseOrderHolder.m22919j0(this.f21199b);
                }
            });
        }
        C45371a0 binding4 = getBinding();
        if (binding4 != null && (dashTextView8 = binding4.f102017r) != null) {
            dashTextView8.setNeedDash(m22963r0());
        }
        C45371a0 binding5 = getBinding();
        if (binding5 != null && (dashTextView7 = binding5.f102017r) != null) {
            C27046k.m66710y(dashTextView7, 1000L, new Function0() { // from class: com.kubi.core.spot.business.holder.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseOrderHolder.m22921k0(this.f21203b);
                }
            });
        }
        C45371a0 binding6 = getBinding();
        if (binding6 != null && (dashTextView6 = binding6.f102012m) != null) {
            dashTextView6.setNeedDash(m22963r0());
        }
        C45371a0 binding7 = getBinding();
        if (binding7 != null && (dashTextView5 = binding7.f102012m) != null) {
            C27046k.m66710y(dashTextView5, 1000L, new Function0() { // from class: com.kubi.core.spot.business.holder.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseOrderHolder.m22923l0(this.f21207b);
                }
            });
        }
        C45371a0 binding8 = getBinding();
        if (binding8 != null && (dashTextView4 = binding8.f102011l) != null) {
            dashTextView4.setNeedDash(true);
        }
        C45371a0 binding9 = getBinding();
        if (binding9 != null && (dashTextView3 = binding9.f102011l) != null) {
            C27046k.m66710y(dashTextView3, 1000L, new Function0() { // from class: com.kubi.core.spot.business.holder.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseOrderHolder.m22925m0(this.f21210b);
                }
            });
        }
        C45371a0 binding10 = getBinding();
        if (binding10 != null && (dashTextView2 = binding10.f102016q) != null) {
            dashTextView2.setNeedDash(true);
        }
        C45371a0 binding11 = getBinding();
        if (binding11 != null && (dashTextView = binding11.f102016q) != null) {
            C27046k.m66710y(dashTextView, 1000L, new Function0() { // from class: com.kubi.core.spot.business.holder.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseOrderHolder.m22927n0(this.f21214b);
                }
            });
        }
        m22948H();
    }

    public final void setAmountByPercent(boolean needToast) throws Exception {
        BigDecimal percent;
        RoundingMode roundingMode;
        if (getProgressPercent() != null && m22951M()) {
            boolean z11 = true;
            BigDecimal bigDecimalM22903S = m22903S(this, false, 1, null);
            if (IUserService.a.get().c() && bigDecimalM22903S.compareTo(BigDecimal.ZERO) > 0) {
                SpotInputProgressView progressPercent = getProgressPercent();
                if (progressPercent != null) {
                    percent = progressPercent.getPercent();
                } else {
                    percent = null;
                }
                BigDecimal bigDecimalM89922G = C41014a.m89922G(percent, null, 1, null);
                if (needToast) {
                    C12322c0.m23255e(this.f21037j, new Action() { // from class: com.kubi.core.spot.business.holder.d
                        @Override // io.reactivex.functions.Action
                        public final void run() {
                            BaseOrderHolder.setAmountByPercent$lambda$19(this.f21110b);
                        }
                    });
                }
                this.f21035h = true;
                if (bigDecimalM89922G.compareTo(BigDecimal.ONE) < 0) {
                    z11 = false;
                }
                BigDecimal bigDecimalMultiply = bigDecimalM89922G.multiply(bigDecimalM22903S);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                int precision = getNumEditText().getF44119f();
                if (z11) {
                    roundingMode = RoundingMode.DOWN;
                } else {
                    roundingMode = RoundingMode.UP;
                }
                BigDecimal scale = bigDecimalMultiply.setScale(precision, roundingMode);
                Intrinsics.checkNotNull(scale);
                BigDecimal bigDecimalMo22946G = mo22946G(scale, getNumEditText().getF44119f());
                if (C41014a.m89920E(bigDecimalMo22946G, getNumEditText().getValue())) {
                    getNumEditText().setValue(bigDecimalMo22946G);
                }
                this.f21035h = false;
            }
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m22966u0() {
        BigDecimal percent;
        SpotInputProgressView progressPercent = getProgressPercent();
        if (progressPercent != null) {
            percent = progressPercent.getPercent();
        } else {
            percent = null;
        }
        if (C41014a.m89922G(percent, null, 1, null).compareTo(BigDecimal.ONE) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: w0 */
    public void m22968w0() {
        BaseTextView baseTextView;
        DashTextView dashTextView;
        BaseTextView baseTextView2;
        DashTextView dashTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        if (m22963r0()) {
            boolean zM22964s0 = m22964s0();
            boolean zM22965t0 = m22965t0();
            C45371a0 binding = getBinding();
            if (binding != null && (baseTextView4 = binding.f102013n) != null) {
                C0296a.m1042d(baseTextView4, !zM22964s0);
            }
            C45371a0 binding2 = getBinding();
            if (binding2 != null && (baseTextView3 = binding2.f102018s) != null) {
                C0296a.m1042d(baseTextView3, !zM22965t0);
            }
            C45371a0 binding3 = getBinding();
            if (binding3 != null && (dashTextView2 = binding3.f102016q) != null) {
                C0296a.m1042d(dashTextView2, zM22965t0);
            }
            C45371a0 binding4 = getBinding();
            if (binding4 != null && (baseTextView2 = binding4.f102015p) != null) {
                C0296a.m1042d(baseTextView2, zM22965t0);
            }
            C45371a0 binding5 = getBinding();
            if (binding5 != null && (dashTextView = binding5.f102011l) != null) {
                C0296a.m1042d(dashTextView, zM22964s0);
            }
            C45371a0 binding6 = getBinding();
            if (binding6 != null && (baseTextView = binding6.f102010k) != null) {
                C0296a.m1042d(baseTextView, zM22964s0);
            }
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: x0 */
    public void m22969x0() throws Exception {
        BigDecimal percent;
        BaseTextView baseTextView;
        int i11;
        BaseTextView baseTextView2;
        int i12;
        BaseTextView baseTextView3;
        DashTextView dashTextView;
        BaseTextView baseTextView4;
        DashTextView dashTextView2;
        C45371a0 binding = getBinding();
        if (binding != null && (baseTextView4 = binding.f102014o) != null) {
            ITradeDiffBizDefine iTradeDiffBizDefine = this.f21032e;
            C45371a0 binding2 = getBinding();
            if (binding2 != null) {
                dashTextView2 = binding2.f102017r;
            } else {
                dashTextView2 = null;
            }
            baseTextView4.setText(iTradeDiffBizDefine.mo23231r(this, dashTextView2));
        }
        C45371a0 binding3 = getBinding();
        if (binding3 != null && (baseTextView3 = binding3.f102009j) != null) {
            ITradeDiffBizDefine iTradeDiffBizDefine2 = this.f21032e;
            C45371a0 binding4 = getBinding();
            if (binding4 != null) {
                dashTextView = binding4.f102012m;
            } else {
                dashTextView = null;
            }
            baseTextView3.setText(iTradeDiffBizDefine2.mo23228o(this, dashTextView));
        }
        C45371a0 binding5 = getBinding();
        if (binding5 != null && (baseTextView2 = binding5.f102014o) != null) {
            if (this.f21032e.mo23219f()) {
                i12 = R$drawable.ic2_transfer2_16;
            } else {
                i12 = R$drawable.ic2_trade_add_16;
            }
            int i13 = i12;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C27046k.m66694i(baseTextView2, i13, (int) C27025c.m66564b(context, 2.0f), 0, 4, null);
        }
        C45371a0 binding6 = getBinding();
        if (binding6 != null && (baseTextView = binding6.f102009j) != null) {
            if (this.f21032e.mo23219f()) {
                i11 = R$drawable.ic2_transfer2_16;
            } else {
                i11 = R$drawable.ic2_trade_add_16;
            }
            int i14 = i11;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            C27046k.m66694i(baseTextView, i14, (int) C27025c.m66564b(context2, 2.0f), 0, 4, null);
        }
        this.f21032e.mo23230q(this);
        this.f21032e.mo23234u(this);
        SpotInputProgressView progressPercent = getProgressPercent();
        if (progressPercent != null) {
            percent = progressPercent.getPercent();
        } else {
            percent = null;
        }
        if (C41014a.m89922G(percent, null, 1, null).compareTo(BigDecimal.ZERO) > 0) {
            setAmountByPercent(false);
        }
        m22948H();
    }

    @NotNull
    public LinearLayout getView() {
        return this;
    }

    /* JADX INFO: renamed from: o0 */
    public void mo22960o0() {
    }
}
