package com.kubi.otc.otc.trade;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.OtcUserManager;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.OtcInfoEntity;
import com.kubi.otc.entity.OtcSymbol;
import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.otc.otc.paytype.C20143e;
import com.kubi.payment.fast.data.entities.Balance;
import com.kubi.payment.flutter.FlutterNavigationHelper;
import com.kubi.payment.p2p.P2PHelper;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.P2PTrackData;
import com.kubi.payment.util.P2PUtils;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27016b0;
import com.kubi.utils.C27018c0;
import com.kubi.utils.C27021e;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27056j0;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.C37242d;
import et.InterfaceC37241c;
import f00.C37304a;
import g00.InterfaceC37755g;
import g00.InterfaceC37758j;
import g00.InterfaceC37766r;
import ht.C38301b1;
import ht.C38346y;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import lt.C42296a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p011a9.C0204d;
import p011a9.C0206f;
import p270ft.C37631i;
import p402kf.C41016c;
import p569qq.C43846g;
import p569qq.C43852m;
import p752x8.AbstractC46099a;
import p824z8.C46730a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: OtcDealFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u0000 F2\u00020\u0001:\u0001FB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020\u0010H\u0014J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0017J\b\u0010&\u001a\u00020\u001cH\u0002J\b\u0010'\u001a\u00020!H\u0002J\b\u0010(\u001a\u00020!H\u0002J\b\u0010)\u001a\u00020!H\u0002J\b\u0010*\u001a\u00020!H\u0016J\b\u0010+\u001a\u00020!H\u0002J\u0010\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\u001cH\u0002J\b\u0010.\u001a\u00020!H\u0002J\b\u0010/\u001a\u00020!H\u0002J\b\u00100\u001a\u00020!H\u0002J\b\u00101\u001a\u00020!H\u0003J\b\u00102\u001a\u00020\u000bH\u0002J\b\u00103\u001a\u00020!H\u0002J\b\u00104\u001a\u00020!H\u0002J\b\u00105\u001a\u00020!H\u0002J\b\u00106\u001a\u00020!H\u0002J\b\u00107\u001a\u00020!H\u0002J\b\u00108\u001a\u00020!H\u0002J\u0010\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020\u001cH\u0002J\u001a\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020\u00132\b\b\u0002\u0010=\u001a\u00020\u001cH\u0002J\b\u0010>\u001a\u00020!H\u0003J\u0012\u0010?\u001a\u00020\u00132\b\u0010@\u001a\u0004\u0018\u00010AH\u0002J\b\u0010B\u001a\u00020!H\u0002J\u001c\u0010C\u001a\u00020!2\b\b\u0002\u0010D\u001a\u00020\u00132\b\b\u0002\u0010E\u001a\u00020\u001cH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, m90084d2 = {"Lcom/kubi/otc/otc/trade/OtcDealFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "otcApi", "Lcom/kubi/otc/api/OtcApi;", "getOtcApi", "()Lcom/kubi/otc/api/OtcApi;", "otcApi$delegate", "Lkotlin/Lazy;", "legalCurrency", "", "item", "Lcom/kubi/otc/entity/OtcInfoEntity;", "userAmount", "currencyPrecision", "", "legalPrecision", "isUseLimit", "", "isFold", "binding", "Lcom/kubi/otc/databinding/BotcFragmentDealBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentDealBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adListPrice", "", "taxInfo", "Lcom/kubi/payment/p2p/data/entities/TaxInfo;", "getLayout", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "confirmText", "trackExpose", "trackPlaceOrder", "handleTaxInfo", "onResume", "refreshTaxInfo", "showTaxInfo", "fiatAmount", "showLimitTip", "showLimitAlertTip", "setAll", "initData", "getLegalMax", "getUserTakerAmount", "initSinglePrice", "requestOrder", "preSell", "requestBuy", "requestSell", "oderOk", "id", "showError", TIMPushProvider.f75062n, "text", "checkValue", "isHandlePriceError", "e", "", "notifyInfo", "trackResult", "isSuccess", "errorMsg", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOtcDealFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcDealFragment.kt\ncom/kubi/otc/otc/trade/OtcDealFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,918:1\n147#2,16:919\n774#3:935\n865#3,2:936\n827#3:938\n855#3,2:939\n1669#3,8:941\n1869#3,2:977\n1208#3,2:979\n1236#3,4:981\n1869#3,2:985\n58#4,23:949\n93#4,3:972\n48#5,2:975\n*S KotlinDebug\n*F\n+ 1 OtcDealFragment.kt\ncom/kubi/otc/otc/trade/OtcDealFragment\n*L\n119#1:919,16\n181#1:935\n181#1:936,2\n182#1:938\n182#1:939,2\n183#1:941,8\n147#1:977,2\n311#1:979,2\n311#1:981,4\n312#1:985,2\n396#1:949,23\n396#1:972,3\n539#1:975,2\n*E\n"})
public final class OtcDealFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: W */
    @Nullable
    public OtcInfoEntity f38046W;

    /* JADX INFO: renamed from: X */
    public double f38047X;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public String f38053d0;

    /* JADX INFO: renamed from: e0 */
    @Nullable
    public TaxInfo f38054e0;

    /* JADX INFO: renamed from: g0 */
    public static final /* synthetic */ KProperty<Object>[] f38043g0 = {Reflection.property1(new PropertyReference1Impl(OtcDealFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentDealBinding;", 0))};

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public static final Companion f38042f0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f38044U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.trade.u
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OtcDealFragment.m45301T5();
        }
    });

    /* JADX INFO: renamed from: V */
    public double f38045V = 1.0d;

    /* JADX INFO: renamed from: Y */
    public int f38048Y = 8;

    /* JADX INFO: renamed from: Z */
    public int f38049Z = 2;

    /* JADX INFO: renamed from: a0 */
    public boolean f38050a0 = true;

    /* JADX INFO: renamed from: b0 */
    public boolean f38051b0 = true;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final InterfaceC24293a f38052c0 = C45681e.m100799e(this, new Function1<OtcDealFragment, C37631i>() { // from class: com.kubi.otc.otc.trade.OtcDealFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37631i invoke(@NotNull OtcDealFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37631i.m84844a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37631i, Unit>() { // from class: com.kubi.otc.otc.trade.OtcDealFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37631i it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37631i c37631i) {
            invoke(c37631i);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: compiled from: OtcDealFragment.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¨\u0006\r"}, m90084d2 = {"Lcom/kubi/otc/otc/trade/OtcDealFragment$Companion;", "", "<init>", "()V", "startFragment", "", "context", "Landroid/content/Context;", "info", "Lcom/kubi/otc/entity/OtcInfoEntity;", "adListPrice", "", "preSpmId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void startFragment$default(Companion companion, Context context, OtcInfoEntity otcInfoEntity, String str, String str2, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                str = null;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
            }
            companion.startFragment(context, otcInfoEntity, str, str2);
        }

        public final void startFragment(@NotNull Context context, @NotNull OtcInfoEntity info, @Nullable String adListPrice, @Nullable String preSpmId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(info, "info");
            BaseFragmentActivity.m56574n0(context, "", OtcDealFragment.class.getName(), new C27051h().m66719c(BaseActivity.TITLE_BAR, false).m66721e("data", info).m66724h("data_1", adListPrice).m66724h("spm", preSpmId).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.trade.OtcDealFragment$c */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 OtcDealFragment.kt\ncom/kubi/otc/otc/trade/OtcDealFragment\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n397#2,2:98\n71#3:100\n77#4:101\n*E\n"})
    public static final class C20192c implements TextWatcher {
        public C20192c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            OtcDealFragment.this.m45412r6(C27041f.m66668h(String.valueOf(s11)));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.trade.OtcDealFragment$d */
    /* JADX INFO: compiled from: OtcDealFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/otc/trade/OtcDealFragment$requestBuy$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "e", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20193d extends C24223c1 {
        public C20193d() {
            super(OtcDealFragment.this, false);
        }

        /* JADX INFO: renamed from: f */
        public static final Unit m45416f(Throwable th2, OtcDealFragment otcDealFragment) throws JSONException {
            IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
            StringBuilder sb2 = new StringBuilder();
            ApiException apiException = (ApiException) th2;
            sb2.append(apiException.code);
            sb2.append(':');
            sb2.append(apiException.getMessage());
            track.mo49801g("CHECK_BUY_ORDER", false, sb2.toString(), new P2PTrackData("buy"));
            otcDealFragment.m45379u6(false, apiException.code + '-' + apiException.getMessage());
            return Unit.INSTANCE;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(final Throwable th2) {
            OtcDealFragment.this.hideDialogLoading();
            super.accept(th2);
            if (!OtcDealFragment.this.m45406i5(th2) && (th2 instanceof ApiException)) {
                final OtcDealFragment otcDealFragment = OtcDealFragment.this;
                C38301b1.m86441N(otcDealFragment, (ApiException) th2, new Function0() { // from class: com.kubi.otc.otc.trade.p1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OtcDealFragment.C20193d.m45416f(th2, otcDealFragment);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.trade.OtcDealFragment$e */
    /* JADX INFO: compiled from: OtcDealFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/otc/trade/OtcDealFragment$requestSell$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "e", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nOtcDealFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtcDealFragment.kt\ncom/kubi/otc/otc/trade/OtcDealFragment$requestSell$3\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,918:1\n48#2,2:919\n*S KotlinDebug\n*F\n+ 1 OtcDealFragment.kt\ncom/kubi/otc/otc/trade/OtcDealFragment$requestSell$3\n*L\n756#1:919,2\n*E\n"})
    public static final class C20194e extends C24223c1 {
        public C20194e() {
            super(OtcDealFragment.this, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public static final Unit m45418f(Throwable th2, OtcDealFragment otcDealFragment) throws JSONException {
            IPaymentTrack.f40346a.getTrack().mo49801g("CHECK_SELL_ORDER", false, ((ApiException) th2).code + ':' + th2.getMessage(), new P2PTrackData("sell"));
            otcDealFragment.m45379u6(false, ((ApiException) th2).code + '-' + th2.getMessage());
            return Unit.INSTANCE;
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(final Throwable e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            OtcDealFragment.this.hideDialogLoading();
            super.accept(e11);
            if (!OtcDealFragment.this.m45406i5(e11) && (e11 instanceof ApiException)) {
                ApiException apiException = (ApiException) e11;
                if (Intrinsics.areEqual(apiException.code, "600000")) {
                    C43846g.m96568c(new OtcMessage("error 600000", "payment_p2p", false, 4, null), null, 2, null);
                } else {
                    final OtcDealFragment otcDealFragment = OtcDealFragment.this;
                    C38301b1.m86441N(otcDealFragment, apiException, new Function0() { // from class: com.kubi.otc.otc.trade.q1
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OtcDealFragment.C20194e.m45418f(e11, otcDealFragment);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: Q4 */
    public static final void m45291Q4(OtcDealFragment otcDealFragment, String str) {
        BaseTextView baseTextView;
        otcDealFragment.f38047X = DowngradeExKt.m66535e(str, null, 1, null).doubleValue();
        C37631i c37631iM45398I4 = otcDealFragment.m45398I4();
        if (c37631iM45398I4 == null || (baseTextView = c37631iM45398I4.f83989B) == null) {
            return;
        }
        int i11 = R$string.available_balance_today;
        String strValueOf = String.valueOf(C27039d.m66646f(Double.valueOf(otcDealFragment.f38047X)));
        OtcInfoEntity otcInfoEntity = otcDealFragment.f38046W;
        baseTextView.setText(otcDealFragment.getString(i11, strValueOf, C27041f.m66668h(otcInfoEntity != null ? otcInfoEntity.getLegal() : null)));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: G4 */
    public final void m45396G4() {
        FilterEmojiEditText filterEmojiEditText;
        BigDecimal singleLimitQuota;
        BigDecimal bigDecimalM11724a;
        FilterEmojiEditText filterEmojiEditText2;
        FilterEmojiEditText filterEmojiEditText3;
        m45356n6(this, false, null, 2, null);
        C37631i c37631iM45398I4 = m45398I4();
        if (TextUtils.isEmpty((c37631iM45398I4 == null || (filterEmojiEditText3 = c37631iM45398I4.f84009g) == null) ? null : filterEmojiEditText3.getText())) {
            return;
        }
        C37631i c37631iM45398I5 = m45398I4();
        double dM66538h = DowngradeExKt.m66538h(String.valueOf((c37631iM45398I5 == null || (filterEmojiEditText2 = c37631iM45398I5.f84009g) == null) ? null : filterEmojiEditText2.getText()), 0.0d, 1, null);
        if (!OtcUserManager.f38144a.m45493u()) {
            OtcInfoEntity otcInfoEntity = this.f38046W;
            if (dM66538h > C27039d.m66647g(otcInfoEntity != null ? otcInfoEntity.getSingleLimitQuota() : null)) {
                int i11 = R$string.max_amount_not_over;
                StringBuilder sb2 = new StringBuilder();
                OtcInfoEntity otcInfoEntity2 = this.f38046W;
                sb2.append(C27041f.m66668h((otcInfoEntity2 == null || (singleLimitQuota = otcInfoEntity2.getSingleLimitQuota()) == null || (bigDecimalM11724a = C6447a.m11724a(singleLimitQuota)) == null) ? null : bigDecimalM11724a.toPlainString()));
                OtcInfoEntity otcInfoEntity3 = this.f38046W;
                sb2.append(otcInfoEntity3 != null ? otcInfoEntity3.getLegal() : null);
                String string = getString(i11, sb2.toString());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                m45409m6(true, string);
            }
        }
        OtcInfoEntity otcInfoEntity4 = this.f38046W;
        if (dM66538h > C27039d.m66647g(otcInfoEntity4 != null ? otcInfoEntity4.getLimitMaxQuote() : null)) {
            int i12 = R$string.max_order_amount;
            StringBuilder sb3 = new StringBuilder();
            OtcInfoEntity otcInfoEntity5 = this.f38046W;
            sb3.append(C38346y.m86537x(C27039d.m66647g(otcInfoEntity5 != null ? otcInfoEntity5.getLimitMaxQuote() : null), this.f38049Z));
            OtcInfoEntity otcInfoEntity6 = this.f38046W;
            sb3.append(C27041f.m66668h(otcInfoEntity6 != null ? otcInfoEntity6.getLegal() : null));
            String string2 = getString(i12, sb3.toString());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            m45409m6(true, string2);
            return;
        }
        OtcInfoEntity otcInfoEntity7 = this.f38046W;
        if (dM66538h <= C27021e.m66526e(C27039d.m66647g(otcInfoEntity7 != null ? otcInfoEntity7.getCurrencyBalanceQuantity() : null), this.f38045V)) {
            C37631i c37631iM45398I6 = m45398I4();
            double dM66538h2 = DowngradeExKt.m66538h(String.valueOf((c37631iM45398I6 == null || (filterEmojiEditText = c37631iM45398I6.f84008f) == null) ? null : filterEmojiEditText.getText()), 0.0d, 1, null);
            OtcInfoEntity otcInfoEntity8 = this.f38046W;
            if (dM66538h2 <= C27039d.m66647g(otcInfoEntity8 != null ? otcInfoEntity8.getCurrencyBalanceQuantity() : null)) {
                OtcInfoEntity otcInfoEntity9 = this.f38046W;
                if (dM66538h >= C27039d.m66647g(otcInfoEntity9 != null ? otcInfoEntity9.getLimitMinQuote() : null)) {
                    if (dM66538h > this.f38047X) {
                        String string3 = getString(this.f38050a0 ? R$string.available_balance_insufficient : R$string.your_balance_insufficient);
                        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                        m45409m6(true, string3);
                        return;
                    }
                    return;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(getString(R$string.min_order_amount_tips));
                OtcInfoEntity otcInfoEntity10 = this.f38046W;
                sb4.append(C38346y.m86537x(C27039d.m66647g(otcInfoEntity10 != null ? otcInfoEntity10.getLimitMinQuote() : null), this.f38049Z));
                OtcInfoEntity otcInfoEntity11 = this.f38046W;
                sb4.append(C27041f.m66668h(otcInfoEntity11 != null ? otcInfoEntity11.getLegal() : null));
                m45409m6(true, sb4.toString());
                return;
            }
        }
        String string4 = getString(R$string.sell_qty_insufficient);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        m45409m6(true, string4);
    }

    /* JADX INFO: renamed from: m6 */
    public final void m45409m6(boolean z11, String str) {
        LinearLayout linearLayout;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        LinearLayout linearLayout2;
        BaseTextView baseTextView3;
        if (!z11) {
            C37631i c37631iM45398I4 = m45398I4();
            if (c37631iM45398I4 != null && (baseTextView = c37631iM45398I4.f84027y) != null) {
                baseTextView.setVisibility(4);
            }
            C37631i c37631iM45398I5 = m45398I4();
            if (c37631iM45398I5 == null || (linearLayout = c37631iM45398I5.f84019q) == null) {
                return;
            }
            linearLayout.setActivated(false);
            return;
        }
        C37631i c37631iM45398I6 = m45398I4();
        if (c37631iM45398I6 != null && (baseTextView3 = c37631iM45398I6.f84027y) != null) {
            baseTextView3.setVisibility(0);
        }
        C37631i c37631iM45398I7 = m45398I4();
        if (c37631iM45398I7 != null && (linearLayout2 = c37631iM45398I7.f84019q) != null) {
            linearLayout2.setActivated(true);
        }
        C37631i c37631iM45398I8 = m45398I4();
        if (c37631iM45398I8 == null || (baseTextView2 = c37631iM45398I8.f84027y) == null) {
            return;
        }
        baseTextView2.setText(str);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        ArrayList arrayList;
        ArrayList arrayList2;
        ConstraintLayout constraintLayout;
        FilterEmojiEditText filterEmojiEditText;
        FilterEmojiEditText filterEmojiEditText2;
        FilterEmojiEditText filterEmojiEditText3;
        FilterEmojiEditText filterEmojiEditText4;
        FilterEmojiEditText filterEmojiEditText5;
        FilterEmojiEditText filterEmojiEditText6;
        BaseTextView baseTextView;
        CheckBox checkBox;
        CheckBox checkBox2;
        CheckBox checkBox3;
        FilterEmojiEditText filterEmojiEditText7;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        LinearLayout linearLayout;
        BaseTextView baseTextView6;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView7;
        String remarks;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        String remarks2;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        BaseTextView baseTextView12;
        BaseTextView baseTextView13;
        BaseTextView baseTextView14;
        String string;
        BaseTextView baseTextView15;
        List<AdPayType> adPayTypes;
        List<AdPayType> adPayTypes2;
        ImageView imageView;
        ImageView imageView2;
        BaseTextView baseTextView16;
        BaseTextView baseTextView17;
        BaseTextView baseTextView18;
        ImageView imageView3;
        View view2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37631i c37631iM45398I4 = m45398I4();
        if (c37631iM45398I4 != null && (view2 = c37631iM45398I4.f84010h) != null) {
            EdgeToEdgeCompat edgeToEdgeCompat = EdgeToEdgeCompat.f48106a;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            edgeToEdgeCompat.m58268f(fragmentActivityRequireActivity, view2);
        }
        C37631i c37631iM45398I5 = m45398I4();
        if (c37631iM45398I5 != null && (imageView3 = c37631iM45398I5.f84013k) != null) {
            C27046k.m66711z(imageView3, 0L, new Function0() { // from class: com.kubi.otc.otc.trade.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtcDealFragment.m45268H5(this.f38058b);
                }
            }, 1, null);
        }
        Bundle arguments = getArguments();
        this.f38046W = arguments != null ? (OtcInfoEntity) RouteExKt.m56274t(arguments, "data") : null;
        m45413s6();
        Bundle arguments2 = getArguments();
        this.f38053d0 = arguments2 != null ? RouteExKt.m56284y(arguments2, "data_1") : null;
        OtcInfoEntity otcInfoEntity = this.f38046W;
        C38346y.m86538y(this, C27041f.m66669i(otcInfoEntity != null ? otcInfoEntity.getLegal() : null, "USD"), new Consumer() { // from class: com.kubi.otc.otc.trade.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcDealFragment.m45298S5(this.f38064b, (ArrayList) obj);
            }
        });
        m45300T4();
        C37631i c37631iM45398I6 = m45398I4();
        if (c37631iM45398I6 != null && (baseTextView18 = c37631iM45398I6.f83996I) != null) {
            OtcInfoEntity otcInfoEntity2 = this.f38046W;
            String strM89967e = C41016c.m89967e(C27041f.m66668h(otcInfoEntity2 != null ? otcInfoEntity2.getLegal() : null));
            Intrinsics.checkNotNullExpressionValue(strM89967e, "getCurrentCurrencySymbol(...)");
            baseTextView18.setText(StringsKt.replace$default(strM89967e, "- -", "", false, 4, (Object) null));
        }
        C37631i c37631iM45398I7 = m45398I4();
        if (c37631iM45398I7 != null && (baseTextView17 = c37631iM45398I7.f83995H) != null) {
            OtcInfoEntity otcInfoEntity3 = this.f38046W;
            baseTextView17.setTextColor(getColorRes(C27025c.m66566d(otcInfoEntity3 != null ? Boolean.valueOf(otcInfoEntity3.isBuy()) : null) ? R$color.primary : R$color.secondary));
        }
        C37631i c37631iM45398I8 = m45398I4();
        if (c37631iM45398I8 != null && (baseTextView16 = c37631iM45398I8.f83996I) != null) {
            OtcInfoEntity otcInfoEntity4 = this.f38046W;
            baseTextView16.setTextColor(getColorRes(C27025c.m66566d(otcInfoEntity4 != null ? Boolean.valueOf(otcInfoEntity4.isBuy()) : null) ? R$color.primary : R$color.secondary));
        }
        C37631i c37631iM45398I9 = m45398I4();
        if (c37631iM45398I9 != null && (imageView2 = c37631iM45398I9.f84014l) != null) {
            OtcInfoEntity otcInfoEntity5 = this.f38046W;
            if (C27025c.m66566d(otcInfoEntity5 != null ? Boolean.valueOf(otcInfoEntity5.isFoxKingMerchants()) : null)) {
                C27046k.m66685H(imageView2);
            } else {
                C27046k.m66700o(imageView2);
            }
        }
        C37631i c37631iM45398I10 = m45398I4();
        if (c37631iM45398I10 != null && (imageView = c37631iM45398I10.f84015m) != null) {
            OtcInfoEntity otcInfoEntity6 = this.f38046W;
            if (C27025c.m66566d(otcInfoEntity6 != null ? Boolean.valueOf(otcInfoEntity6.isGoldMerchants()) : null)) {
                C27046k.m66685H(imageView);
            } else {
                C27046k.m66700o(imageView);
            }
        }
        OtcInfoEntity otcInfoEntity7 = this.f38046W;
        if (otcInfoEntity7 == null || (adPayTypes2 = otcInfoEntity7.getAdPayTypes()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : adPayTypes2) {
                if (Intrinsics.areEqual(((AdPayType) obj).getPayTypeCode(), "OTHER")) {
                    arrayList.add(obj);
                }
            }
        }
        List listM66560c = C27024b.m66560c(arrayList);
        OtcInfoEntity otcInfoEntity8 = this.f38046W;
        if (otcInfoEntity8 == null || (adPayTypes = otcInfoEntity8.getAdPayTypes()) == null) {
            arrayList2 = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : adPayTypes) {
                if (!Intrinsics.areEqual(((AdPayType) obj2).getPayTypeCode(), "OTHER")) {
                    arrayList3.add(obj2);
                }
            }
            HashSet hashSet = new HashSet();
            arrayList2 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (hashSet.add(((AdPayType) obj3).getPayTypeCode())) {
                    arrayList2.add(obj3);
                }
            }
        }
        final List mutableList = CollectionsKt.toMutableList((Collection) C27024b.m66560c(arrayList2));
        mutableList.addAll(listM66560c);
        C37631i c37631iM45398I11 = m45398I4();
        if (c37631iM45398I11 != null && (baseTextView15 = c37631iM45398I11.f83991D) != null) {
            StringBuilder sb2 = new StringBuilder();
            OtcInfoEntity otcInfoEntity9 = this.f38046W;
            sb2.append(getString(C27025c.m66566d(otcInfoEntity9 != null ? Boolean.valueOf(otcInfoEntity9.isBuy()) : null) ? R$string.otc_buy : R$string.otc_sell));
            sb2.append(' ');
            OtcInfoEntity otcInfoEntity10 = this.f38046W;
            sb2.append(otcInfoEntity10 != null ? otcInfoEntity10.getCurrency() : null);
            baseTextView15.setText(sb2.toString());
        }
        C37631i c37631iM45398I12 = m45398I4();
        if (c37631iM45398I12 != null && (baseTextView14 = c37631iM45398I12.f84000M) != null) {
            OtcInfoEntity otcInfoEntity11 = this.f38046W;
            if (C27025c.m66566d(otcInfoEntity11 != null ? Boolean.valueOf(otcInfoEntity11.isBuy()) : null)) {
                int i11 = R$string.want_buy_qty;
                OtcInfoEntity otcInfoEntity12 = this.f38046W;
                string = getString(i11, otcInfoEntity12 != null ? otcInfoEntity12.getCurrency() : null);
            } else {
                int i12 = R$string.want_sell_qty;
                OtcInfoEntity otcInfoEntity13 = this.f38046W;
                string = getString(i12, otcInfoEntity13 != null ? otcInfoEntity13.getCurrency() : null);
            }
            baseTextView14.setText(string);
        }
        C37631i c37631iM45398I13 = m45398I4();
        if (c37631iM45398I13 != null && (baseTextView13 = c37631iM45398I13.f84028z) != null) {
            OtcInfoEntity otcInfoEntity14 = this.f38046W;
            baseTextView13.setText(C27041f.m66668h(otcInfoEntity14 != null ? otcInfoEntity14.getLegal() : null));
        }
        C37631i c37631iM45398I14 = m45398I4();
        if (c37631iM45398I14 != null && (baseTextView12 = c37631iM45398I14.f83989B) != null) {
            int i13 = R$string.available_balance_today;
            OtcInfoEntity otcInfoEntity15 = this.f38046W;
            baseTextView12.setText(getString(i13, "--", C27041f.m66668h(otcInfoEntity15 != null ? otcInfoEntity15.getLegal() : null)));
        }
        if (!OtcUserManager.f38144a.m45493u()) {
            C37631i c37631iM45398I15 = m45398I4();
            C27014a1.m66504d(c37631iM45398I15 != null ? c37631iM45398I15.f83989B : null, R$mipmap.kucoin_icon_question, GravityCompat.END);
            C37631i c37631iM45398I16 = m45398I4();
            if (c37631iM45398I16 != null && (baseTextView11 = c37631iM45398I16.f83989B) != null) {
                C27046k.m66711z(baseTextView11, 0L, new Function0() { // from class: com.kubi.otc.otc.trade.m
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OtcDealFragment.m45366q5(this.f38087b);
                    }
                }, 1, null);
            }
        }
        C37631i c37631iM45398I17 = m45398I4();
        if (c37631iM45398I17 != null && (baseTextView10 = c37631iM45398I17.f83997J) != null) {
            OtcInfoEntity otcInfoEntity16 = this.f38046W;
            baseTextView10.setText(C27041f.m66668h(otcInfoEntity16 != null ? otcInfoEntity16.getCurrency() : null));
        }
        C37631i c37631iM45398I18 = m45398I4();
        if (c37631iM45398I18 != null && (baseTextView9 = c37631iM45398I18.f83992E) != null) {
            OtcInfoEntity otcInfoEntity17 = this.f38046W;
            baseTextView9.setText((otcInfoEntity17 == null || (remarks2 = otcInfoEntity17.getRemarks()) == null) ? null : StringsKt.trim((CharSequence) remarks2).toString());
        }
        C37631i c37631iM45398I19 = m45398I4();
        if (c37631iM45398I19 != null && (baseTextView8 = c37631iM45398I19.f83992E) != null) {
            baseTextView8.setMovementMethod(C27016b0.m66509a());
        }
        C37631i c37631iM45398I20 = m45398I4();
        if (c37631iM45398I20 != null && (baseTextView7 = c37631iM45398I20.f83992E) != null) {
            OtcInfoEntity otcInfoEntity18 = this.f38046W;
            baseTextView7.setVisibility(TextUtils.isEmpty((otcInfoEntity18 == null || (remarks = otcInfoEntity18.getRemarks()) == null) ? null : StringsKt.trim((CharSequence) remarks).toString()) ? 8 : 0);
        }
        OtcInfoEntity otcInfoEntity19 = this.f38046W;
        if (TextUtils.isEmpty(otcInfoEntity19 != null ? otcInfoEntity19.getRemarks() : null)) {
            C37631i c37631iM45398I21 = m45398I4();
            if (c37631iM45398I21 != null && (constraintLayout2 = c37631iM45398I21.f84006d) != null) {
                constraintLayout2.setVisibility(8);
            }
        } else {
            C37631i c37631iM45398I22 = m45398I4();
            if (c37631iM45398I22 != null && (constraintLayout = c37631iM45398I22.f84006d) != null) {
                constraintLayout.setVisibility(0);
            }
        }
        C37631i c37631iM45398I23 = m45398I4();
        if (c37631iM45398I23 != null && (baseTextView6 = c37631iM45398I23.f83992E) != null) {
            baseTextView6.post(new Runnable() { // from class: com.kubi.otc.otc.trade.n
                @Override // java.lang.Runnable
                public final void run() {
                    OtcDealFragment.m45372s5(this.f38090b);
                }
            });
        }
        C37631i c37631iM45398I24 = m45398I4();
        if (c37631iM45398I24 != null && (linearLayout = c37631iM45398I24.f84017o) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.otc.otc.trade.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtcDealFragment.m45375t5(this.f38092b);
                }
            }, 1, null);
        }
        C37631i c37631iM45398I25 = m45398I4();
        if (c37631iM45398I25 != null && (baseTextView5 = c37631iM45398I25.f84004b) != null) {
            baseTextView5.setText(m45397H4());
        }
        C37631i c37631iM45398I26 = m45398I4();
        if (c37631iM45398I26 != null && (baseTextView4 = c37631iM45398I26.f84004b) != null) {
            OtcInfoEntity otcInfoEntity20 = this.f38046W;
            baseTextView4.setBackgroundResource(C27025c.m66566d(otcInfoEntity20 != null ? Boolean.valueOf(otcInfoEntity20.isBuy()) : null) ? R$drawable.selector_btn_primary : R$drawable.selector_btn_secondary);
        }
        C37631i c37631iM45398I27 = m45398I4();
        if (c37631iM45398I27 != null && (baseTextView3 = c37631iM45398I27.f84022t) != null) {
            C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: com.kubi.otc.otc.trade.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtcDealFragment.m45378u5(this.f38095b);
                }
            }, 1, null);
        }
        C37631i c37631iM45398I28 = m45398I4();
        if (c37631iM45398I28 != null && (baseTextView2 = c37631iM45398I28.f84023u) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.otc.otc.trade.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtcDealFragment.m45382v5(this.f38099b);
                }
            }, 1, null);
        }
        C37631i c37631iM45398I29 = m45398I4();
        if (c37631iM45398I29 != null && (filterEmojiEditText7 = c37631iM45398I29.f84008f) != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(filterEmojiEditText7);
            final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.trade.r
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return OtcDealFragment.m45386w5((CharSequence) obj4);
                }
            };
            Observable<R> map = abstractC46099aM784d.map(new Function() { // from class: com.kubi.otc.otc.trade.s
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj4) {
                    return OtcDealFragment.m45389x5(function1, obj4);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.otc.otc.trade.t
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return OtcDealFragment.m45392y5(this.f38106b, (Boolean) obj4);
                }
            };
            Consumer consumer = new Consumer() { // from class: com.kubi.otc.otc.trade.l
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj4) {
                    OtcDealFragment.m45395z5(function2, obj4);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.otc.otc.trade.w
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return OtcDealFragment.m45249A5((Throwable) obj4);
                }
            };
            Disposable disposableSubscribe = map.subscribe(consumer, new Consumer() { // from class: com.kubi.otc.otc.trade.h0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj4) {
                    OtcDealFragment.m45252B5(function3, obj4);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            CompositeDisposable compositeDisposable = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        }
        C37631i c37631iM45398I30 = m45398I4();
        if (c37631iM45398I30 != null && (checkBox3 = c37631iM45398I30.f84005c) != null) {
            AbstractC46099a<Boolean> abstractC46099aM779a = C0204d.m779a(checkBox3);
            final Function1 function4 = new Function1() { // from class: com.kubi.otc.otc.trade.s0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return OtcDealFragment.m45255C5(this.f38105b, (Boolean) obj4);
                }
            };
            Consumer<? super Boolean> consumer2 = new Consumer() { // from class: com.kubi.otc.otc.trade.d1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj4) {
                    OtcDealFragment.m45258D5(function4, obj4);
                }
            };
            final Function1 function5 = new Function1() { // from class: com.kubi.otc.otc.trade.l1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return OtcDealFragment.m45261E5((Throwable) obj4);
                }
            };
            Disposable disposableSubscribe2 = abstractC46099aM779a.subscribe(consumer2, new Consumer() { // from class: com.kubi.otc.otc.trade.m1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj4) {
                    OtcDealFragment.m45264F5(function5, obj4);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
            CompositeDisposable compositeDisposable2 = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable2, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe2, compositeDisposable2);
        }
        String string2 = getString(R$string.currency_trade_protocol);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getString(R$string.placing_order_means_agree));
        sb3.append(MultiLanguageManager.m56979h() ? string2 : ' ' + string2);
        String string3 = sb3.toString();
        SpannableString spannableString = new SpannableString(string3);
        spannableString.setSpan(new C27018c0(R$color.primary, new View.OnClickListener() { // from class: com.kubi.otc.otc.trade.n1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                OtcDealFragment.m45266G5(view3);
            }
        }), StringsKt.indexOf$default((CharSequence) string3, string2, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) string3, string2, 0, false, 6, (Object) null) + string2.length(), 18);
        C37631i c37631iM45398I31 = m45398I4();
        if (c37631iM45398I31 != null && (checkBox2 = c37631iM45398I31.f84005c) != null) {
            checkBox2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C37631i c37631iM45398I32 = m45398I4();
        if (c37631iM45398I32 != null && (checkBox = c37631iM45398I32.f84005c) != null) {
            checkBox.setText(spannableString);
        }
        C37631i c37631iM45398I33 = m45398I4();
        if (c37631iM45398I33 != null && (baseTextView = c37631iM45398I33.f84004b) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.otc.trade.o1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtcDealFragment.m45270I5(this.f38094b);
                }
            }, 1, null);
        }
        m45402V4();
        m45400L4();
        C37631i c37631iM45398I34 = m45398I4();
        if (c37631iM45398I34 != null && (filterEmojiEditText6 = c37631iM45398I34.f84009g) != null) {
            filterEmojiEditText6.setFilters(new InputFilter[]{new C27056j0(this.f38049Z)});
        }
        C37631i c37631iM45398I35 = m45398I4();
        if (c37631iM45398I35 != null && (filterEmojiEditText5 = c37631iM45398I35.f84008f) != null) {
            filterEmojiEditText5.setFilters(new InputFilter[]{new C27056j0(this.f38048Y)});
        }
        C37631i c37631iM45398I36 = m45398I4();
        if (c37631iM45398I36 != null && (filterEmojiEditText4 = c37631iM45398I36.f84008f) != null) {
            OtcInfoEntity otcInfoEntity21 = this.f38046W;
            filterEmojiEditText4.setHint(getString(C27025c.m66566d(otcInfoEntity21 != null ? Boolean.valueOf(otcInfoEntity21.isBuy()) : null) ? R$string.buy_qty : R$string.sell_qty));
        }
        C37631i c37631iM45398I37 = m45398I4();
        if (c37631iM45398I37 != null && (filterEmojiEditText3 = c37631iM45398I37.f84009g) != null) {
            OtcInfoEntity otcInfoEntity22 = this.f38046W;
            filterEmojiEditText3.setHint(getString(C27025c.m66566d(otcInfoEntity22 != null ? Boolean.valueOf(otcInfoEntity22.isBuy()) : null) ? R$string.buy_currency : R$string.sell_currency));
        }
        C20143e.m45238d(this, new BiConsumer() { // from class: com.kubi.otc.otc.trade.b
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj4, Object obj5) {
                OtcDealFragment.m45272J5(mutableList, this, (Boolean) obj4, (List) obj5);
            }
        });
        C37631i c37631iM45398I38 = m45398I4();
        if (c37631iM45398I38 != null && (filterEmojiEditText2 = c37631iM45398I38.f84009g) != null) {
            AbstractC46099a<Boolean> abstractC46099aM102979b = C46730a.m102979b(filterEmojiEditText2);
            final Function1 function6 = new Function1() { // from class: com.kubi.otc.otc.trade.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return OtcDealFragment.m45275K5((Boolean) obj4);
                }
            };
            Consumer<? super Boolean> consumer3 = new Consumer() { // from class: com.kubi.otc.otc.trade.e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj4) {
                    OtcDealFragment.m45277L5(function6, obj4);
                }
            };
            final Function1 function7 = new Function1() { // from class: com.kubi.otc.otc.trade.f
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return OtcDealFragment.m45280M5((Throwable) obj4);
                }
            };
            Disposable disposableSubscribe3 = abstractC46099aM102979b.subscribe(consumer3, new Consumer() { // from class: com.kubi.otc.otc.trade.g
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj4) {
                    OtcDealFragment.m45283N5(function7, obj4);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe3, "subscribe(...)");
            CompositeDisposable compositeDisposable3 = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable3, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe3, compositeDisposable3);
        }
        C37631i c37631iM45398I39 = m45398I4();
        if (c37631iM45398I39 != null && (filterEmojiEditText = c37631iM45398I39.f84008f) != null) {
            AbstractC46099a<Boolean> abstractC46099aM102979b2 = C46730a.m102979b(filterEmojiEditText);
            final Function1 function8 = new Function1() { // from class: com.kubi.otc.otc.trade.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return OtcDealFragment.m45286O5((Boolean) obj4);
                }
            };
            Consumer<? super Boolean> consumer4 = new Consumer() { // from class: com.kubi.otc.otc.trade.i
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj4) {
                    OtcDealFragment.m45289P5(function8, obj4);
                }
            };
            final Function1 function9 = new Function1() { // from class: com.kubi.otc.otc.trade.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    return OtcDealFragment.m45292Q5((Throwable) obj4);
                }
            };
            Disposable disposableSubscribe4 = abstractC46099aM102979b2.subscribe(consumer4, new Consumer() { // from class: com.kubi.otc.otc.trade.k
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj4) {
                    OtcDealFragment.m45295R5(function9, obj4);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe4, "subscribe(...)");
            CompositeDisposable compositeDisposable4 = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable4, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe4, compositeDisposable4);
        }
        m45411q6();
        m45294R4();
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.trade.OtcDealFragment$a */
    /* JADX INFO: compiled from: OtcDealFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/otc/trade/OtcDealFragment$getUserTakerAmount$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20190a extends C24223c1 {
        public C20190a(OtcDealFragment otcDealFragment) {
            super(otcDealFragment);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            if (th2 instanceof ApiException) {
                IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
                StringBuilder sb2 = new StringBuilder();
                ApiException apiException = (ApiException) th2;
                sb2.append(apiException.code);
                sb2.append(':');
                sb2.append(apiException.getMessage());
                track.mo49801g("CHECK_USER_QUOTA", false, sb2.toString(), new P2PTrackData("buy"));
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.trade.OtcDealFragment$b */
    /* JADX INFO: compiled from: OtcDealFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/otc/trade/OtcDealFragment$getUserTakerAmount$5", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20191b extends C24223c1 {
        public C20191b(OtcDealFragment otcDealFragment) {
            super(otcDealFragment);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            if (th2 instanceof ApiException) {
                IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
                StringBuilder sb2 = new StringBuilder();
                ApiException apiException = (ApiException) th2;
                sb2.append(apiException.code);
                sb2.append(':');
                sb2.append(apiException.getMessage());
                track.mo49801g("CHECK_USER_QUOTA", false, sb2.toString(), new P2PTrackData("sell"));
            }
        }
    }

    /* JADX INFO: renamed from: G5 */
    public static final void m45266G5(View view) {
        C37304a c37304a = C37304a.f82764a;
        String strDecode = Uri.decode(C37242d.f82569a.m83352e() + "?lang=" + MultiLanguageManager.f46811g.getLocalString());
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: K4 */
    private final InterfaceC37241c m45274K4() {
        Object value = this.f38044U.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC37241c) value;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Boolean m45279M4(OtcDealFragment otcDealFragment, Balance.Response t11, String t12) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Intrinsics.checkNotNullParameter(t11, "t1");
        Intrinsics.checkNotNullParameter(t12, "t2");
        Double dM66539i = DowngradeExKt.m66539i(t11.getAvailableBalance());
        double dDoubleValue = dM66539i != null ? dM66539i.doubleValue() : 0.0d;
        OtcInfoEntity otcInfoEntity = otcDealFragment.f38046W;
        double dM66526e = C27021e.m66526e(dDoubleValue, C27039d.m66647g(otcInfoEntity != null ? otcInfoEntity.getFloatPrice() : null));
        if (dM66526e >= DowngradeExKt.m66538h(t12, 0.0d, 1, null)) {
            otcDealFragment.f38047X = DowngradeExKt.m66535e(t12, null, 1, null).doubleValue();
            C37631i c37631iM45398I4 = otcDealFragment.m45398I4();
            if (c37631iM45398I4 != null && (baseTextView2 = c37631iM45398I4.f83989B) != null) {
                int i11 = R$string.available_balance_today;
                String strValueOf = String.valueOf(C27039d.m66646f(Double.valueOf(otcDealFragment.f38047X)));
                OtcInfoEntity otcInfoEntity2 = otcDealFragment.f38046W;
                baseTextView2.setText(otcDealFragment.getString(i11, strValueOf, C27041f.m66668h(otcInfoEntity2 != null ? otcInfoEntity2.getLegal() : null)));
            }
        } else {
            otcDealFragment.f38050a0 = false;
            otcDealFragment.f38047X = dM66526e;
            C37631i c37631iM45398I5 = otcDealFragment.m45398I4();
            if (c37631iM45398I5 != null && (baseTextView = c37631iM45398I5.f83989B) != null) {
                int i12 = R$string.available_balance_stub;
                String strValueOf2 = String.valueOf(C27039d.m66646f(Double.valueOf(otcDealFragment.f38047X)));
                OtcInfoEntity otcInfoEntity3 = otcDealFragment.f38046W;
                baseTextView.setText(otcDealFragment.getString(i12, strValueOf2, C27041f.m66668h(otcInfoEntity3 != null ? otcInfoEntity3.getLegal() : null)));
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final Boolean m45282N4(Function2 function2, Object p11, Object p12) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return (Boolean) function2.invoke(p11, p12);
    }

    /* JADX INFO: renamed from: O4 */
    public static final Unit m45285O4(Boolean bool) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R4 */
    private final void m45294R4() {
        FilterEmojiEditText filterEmojiEditText;
        DashTextView dashTextView;
        DashTextView dashTextView2;
        OtcInfoEntity otcInfoEntity = this.f38046W;
        if (C27025c.m66566d(otcInfoEntity != null ? Boolean.valueOf(otcInfoEntity.isBuy()) : null)) {
            return;
        }
        C37631i c37631iM45398I4 = m45398I4();
        if (c37631iM45398I4 != null && (dashTextView2 = c37631iM45398I4.f83999L) != null) {
            dashTextView2.setDashColor(getColorRes(R$color.c_text40));
        }
        C37631i c37631iM45398I5 = m45398I4();
        if (c37631iM45398I5 != null && (dashTextView = c37631iM45398I5.f83999L) != null) {
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.otc.otc.trade.v
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtcDealFragment.m45297S4(this.f38109b);
                }
            }, 1, null);
        }
        C37631i c37631iM45398I6 = m45398I4();
        if (c37631iM45398I6 == null || (filterEmojiEditText = c37631iM45398I6.f84009g) == null) {
            return;
        }
        filterEmojiEditText.addTextChangedListener(new C20192c());
    }

    /* JADX INFO: renamed from: S4 */
    public static final Unit m45297S4(OtcDealFragment otcDealFragment) {
        P2PHelper p2PHelper = P2PHelper.f39683a;
        FragmentManager childFragmentManager = otcDealFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        p2PHelper.m48412d(childFragmentManager, LifecycleOwnerKt.getLifecycleScope(otcDealFragment));
        return Unit.INSTANCE;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: T4 */
    private final void m45300T4() {
        BaseTextView baseTextView;
        BigDecimal floatPrice;
        BaseTextView baseTextView2;
        BigDecimal limitMaxQuote;
        BigDecimal limitMinQuote;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        OtcInfoEntity otcInfoEntity = this.f38046W;
        String plainString = null;
        this.f38045V = C27039d.m66647g(otcInfoEntity != null ? otcInfoEntity.getFloatPrice() : null);
        C37631i c37631iM45398I4 = m45398I4();
        if (c37631iM45398I4 != null && (baseTextView4 = c37631iM45398I4.f83994G) != null) {
            OtcInfoEntity otcInfoEntity2 = this.f38046W;
            baseTextView4.setText(C27041f.m66668h(otcInfoEntity2 != null ? otcInfoEntity2.getNickName() : null));
            C27046k.m66711z(baseTextView4, 0L, new Function0() { // from class: com.kubi.otc.otc.trade.p0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtcDealFragment.m45303U4(this.f38096b);
                }
            }, 1, null);
        }
        C37631i c37631iM45398I5 = m45398I4();
        if (c37631iM45398I5 != null && (baseTextView3 = c37631iM45398I5.f84024v) != null) {
            StringBuilder sb2 = new StringBuilder();
            OtcInfoEntity otcInfoEntity3 = this.f38046W;
            sb2.append(C38346y.m86537x(C27039d.m66647g(otcInfoEntity3 != null ? otcInfoEntity3.getCurrencyBalanceQuantity() : null), this.f38048Y));
            sb2.append(' ');
            OtcInfoEntity otcInfoEntity4 = this.f38046W;
            sb2.append(otcInfoEntity4 != null ? otcInfoEntity4.getCurrency() : null);
            baseTextView3.setText(sb2.toString());
        }
        C37631i c37631iM45398I6 = m45398I4();
        if (c37631iM45398I6 != null && (baseTextView2 = c37631iM45398I6.f83988A) != null) {
            StringBuilder sb3 = new StringBuilder();
            OtcInfoEntity otcInfoEntity5 = this.f38046W;
            sb3.append(C27041f.m66668h((otcInfoEntity5 == null || (limitMinQuote = otcInfoEntity5.getLimitMinQuote()) == null) ? null : limitMinQuote.toPlainString()));
            sb3.append('-');
            OtcInfoEntity otcInfoEntity6 = this.f38046W;
            sb3.append(C27041f.m66668h((otcInfoEntity6 == null || (limitMaxQuote = otcInfoEntity6.getLimitMaxQuote()) == null) ? null : limitMaxQuote.toPlainString()));
            baseTextView2.setText(sb3.toString());
        }
        C37631i c37631iM45398I7 = m45398I4();
        if (c37631iM45398I7 == null || (baseTextView = c37631iM45398I7.f83995H) == null) {
            return;
        }
        OtcInfoEntity otcInfoEntity7 = this.f38046W;
        if (otcInfoEntity7 != null && (floatPrice = otcInfoEntity7.getFloatPrice()) != null) {
            plainString = floatPrice.toPlainString();
        }
        baseTextView.setText(C27041f.m66668h(plainString));
    }

    /* JADX INFO: renamed from: U4 */
    public static final Unit m45303U4(OtcDealFragment otcDealFragment) {
        FlutterNavigationHelper flutterNavigationHelper = FlutterNavigationHelper.f39477a;
        OtcInfoEntity otcInfoEntity = otcDealFragment.f38046W;
        flutterNavigationHelper.m48165d(C27041f.m66668h(otcInfoEntity != null ? otcInfoEntity.getId() : null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W4 */
    public static final boolean m45307W4(FilterEmojiEditText filterEmojiEditText, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return filterEmojiEditText.isFocused();
    }

    /* JADX INFO: renamed from: X4 */
    public static final boolean m45310X4(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: X5 */
    public static final Unit m45311X5() {
        IPaymentTrack.f40346a.getTrack().mo49801g("CHECK_SELL_PASSWORD", false, "-10012:CHECK_SELL_PASSWORD", new P2PTrackData("sell"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c5 */
    public static final boolean m45323c5(FilterEmojiEditText filterEmojiEditText, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return filterEmojiEditText.isFocused();
    }

    /* JADX INFO: renamed from: c6 */
    public static final Unit m45324c6(OtcDealFragment otcDealFragment, String str) throws JSONException {
        IPaymentTrack.m49796h(IPaymentTrack.f40346a.getTrack(), "CHECK_BUY_ORDER", true, null, new P2PTrackData("buy"), 4, null);
        Intrinsics.checkNotNull(str);
        otcDealFragment.m45410p5(str);
        m45383v6(otcDealFragment, false, null, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d5 */
    public static final boolean m45326d5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: j6 */
    public static final Unit m45343j6(OtcDealFragment otcDealFragment, String str) throws JSONException {
        if (str != null) {
            IPaymentTrack.m49796h(IPaymentTrack.f40346a.getTrack(), "CHECK_SELL_ORDER", true, null, new P2PTrackData("sell"), 4, null);
            otcDealFragment.m45410p5(str);
            m45383v6(otcDealFragment, false, null, 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n6 */
    public static /* synthetic */ void m45356n6(OtcDealFragment otcDealFragment, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        otcDealFragment.m45409m6(z11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o6 */
    public final void m45360o6() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_c2c_advertisement_dialog_title).m54153J4(R$string.payment_c2c_deal_restrict_dialog_title).m54162S4(R$string.i_know, null).m54150G4(new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.otc.otc.trade.v0
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                OtcDealFragment.m45363p6(this.f38110b, baseViewHolder, dialogFragmentHelper);
            }
        }).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: p6 */
    public static final void m45363p6(OtcDealFragment otcDealFragment, BaseViewHolder viewHolder, DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        View view = viewHolder.getView(R$id.tv_content);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        highlightTextHelper.m54120f((TextView) view, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(otcDealFragment.getColorRes(R$color.primary))));
    }

    /* JADX INFO: renamed from: q5 */
    public static final Unit m45366q5(OtcDealFragment otcDealFragment) {
        BigDecimal dailyQuotaOfKyc2;
        BigDecimal bigDecimalM11724a;
        AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt);
        int i11 = R$string.make_order_balance_alert_content;
        OtcInfoEntity otcInfoEntity = otcDealFragment.f38046W;
        String dayLimitQuota = otcInfoEntity != null ? otcInfoEntity.getDayLimitQuota() : null;
        OtcInfoEntity otcInfoEntity2 = otcDealFragment.f38046W;
        String legal = otcInfoEntity2 != null ? otcInfoEntity2.getLegal() : null;
        StringBuilder sb2 = new StringBuilder();
        OtcInfoEntity otcInfoEntity3 = otcDealFragment.f38046W;
        sb2.append(C27041f.m66668h((otcInfoEntity3 == null || (dailyQuotaOfKyc2 = otcInfoEntity3.getDailyQuotaOfKyc2()) == null || (bigDecimalM11724a = C6447a.m11724a(dailyQuotaOfKyc2)) == null) ? null : bigDecimalM11724a.toPlainString()));
        OtcInfoEntity otcInfoEntity4 = otcDealFragment.f38046W;
        sb2.append(otcInfoEntity4 != null ? otcInfoEntity4.getLegal() : null);
        alertDialogFragmentHelperM54167X4.m54156M4(otcDealFragment.getString(i11, dayLimitQuota, legal, sb2.toString())).m54159P4(R$string.cancel, null).m54162S4(R$string.kyc_goto_verify, new DialogInterface.OnClickListener() { // from class: com.kubi.otc.otc.trade.r0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                OtcDealFragment.m45369r5(dialogInterface, i12);
            }
        }).m54172c5(otcDealFragment.getChildFragmentManager());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r5 */
    public static final void m45369r5(DialogInterface dialogInterface, int i11) {
        InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, null, null, null, 31, null);
    }

    /* JADX INFO: renamed from: t5 */
    public static final Unit m45375t5(OtcDealFragment otcDealFragment) {
        BaseTextView baseTextView;
        ImageView imageView;
        BaseTextView baseTextView2;
        ImageView imageView2;
        if (otcDealFragment.f38051b0) {
            C37631i c37631iM45398I4 = otcDealFragment.m45398I4();
            if (c37631iM45398I4 != null && (imageView2 = c37631iM45398I4.f84016n) != null) {
                imageView2.setImageResource(R$drawable.ic_arrow_up_16);
            }
            otcDealFragment.f38051b0 = false;
            C37631i c37631iM45398I5 = otcDealFragment.m45398I4();
            if (c37631iM45398I5 != null && (baseTextView2 = c37631iM45398I5.f83992E) != null) {
                baseTextView2.setMaxLines(Integer.MAX_VALUE);
            }
        } else {
            C37631i c37631iM45398I6 = otcDealFragment.m45398I4();
            if (c37631iM45398I6 != null && (imageView = c37631iM45398I6.f84016n) != null) {
                imageView.setImageResource(R$drawable.ic_arrow_down_16);
            }
            otcDealFragment.f38051b0 = true;
            C37631i c37631iM45398I7 = otcDealFragment.m45398I4();
            if (c37631iM45398I7 != null && (baseTextView = c37631iM45398I7.f83992E) != null) {
                baseTextView.setMaxLines(3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u6 */
    public final void m45379u6(boolean z11, String str) throws JSONException {
        C42296a c42296a = C42296a.f93790a;
        OtcInfoEntity otcInfoEntity = this.f38046W;
        String strM66668h = C27041f.m66668h(otcInfoEntity != null ? otcInfoEntity.getCurrency() : null);
        OtcInfoEntity otcInfoEntity2 = this.f38046W;
        String strM66668h2 = C27041f.m66668h(otcInfoEntity2 != null ? otcInfoEntity2.getLegal() : null);
        OtcInfoEntity otcInfoEntity3 = this.f38046W;
        C42296a.m92834b(c42296a, z11, str, strM66668h, strM66668h2, C27025c.m66566d(otcInfoEntity3 != null ? Boolean.valueOf(otcInfoEntity3.isBuy()) : null) ? "pay_fast_buy" : "pay_fast_sell", null, "c2c_deal", null, null, null, null, 1952, null);
    }

    /* JADX INFO: renamed from: v6 */
    public static /* synthetic */ void m45383v6(OtcDealFragment otcDealFragment, boolean z11, String str, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        otcDealFragment.m45379u6(z11, str);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX INFO: renamed from: w5 */
    public static final Boolean m45386w5(CharSequence it) {
        boolean z11;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!TextUtils.isEmpty(it)) {
            z11 = DowngradeExKt.m66538h(it.toString(), 0.0d, 1, null) != 0.0d;
        }
        return Boolean.valueOf(z11);
    }

    /* JADX INFO: renamed from: x5 */
    public static final Boolean m45389x5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Boolean) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: H4 */
    public final String m45397H4() {
        OtcInfoEntity otcInfoEntity = this.f38046W;
        if (C27025c.m66566d(otcInfoEntity != null ? Boolean.valueOf(otcInfoEntity.isBuy()) : null)) {
            OtcInfoEntity otcInfoEntity2 = this.f38046W;
            return Intrinsics.areEqual(C27041f.m66668h(otcInfoEntity2 != null ? otcInfoEntity2.getNewUserTag() : null), "1") ? getStringRes(R$string.payment_p2p_special_buy, new Object[0]) : getStringRes(R$string.order_buy, new Object[0]);
        }
        OtcInfoEntity otcInfoEntity3 = this.f38046W;
        return Intrinsics.areEqual(C27041f.m66668h(otcInfoEntity3 != null ? otcInfoEntity3.getNewUserTag() : null), "1") ? getStringRes(R$string.payment_p2p_special_sell, new Object[0]) : getStringRes(R$string.order_sell, new Object[0]);
    }

    /* JADX INFO: renamed from: I4 */
    public final C37631i m45398I4() {
        return (C37631i) this.f38052c0.getValue(this, f38043g0[0]);
    }

    /* JADX INFO: renamed from: J4 */
    public final double m45399J4() {
        double dMin;
        OtcInfoEntity otcInfoEntity = this.f38046W;
        double dM66647g = C27039d.m66647g(otcInfoEntity != null ? otcInfoEntity.getLegalBalanceQuantity() : null);
        OtcInfoEntity otcInfoEntity2 = this.f38046W;
        if (dM66647g < C27039d.m66647g(otcInfoEntity2 != null ? otcInfoEntity2.getLimitMaxQuote() : null)) {
            OtcInfoEntity otcInfoEntity3 = this.f38046W;
            dMin = C27021e.m66526e(C27039d.m66647g(otcInfoEntity3 != null ? otcInfoEntity3.getCurrencyBalanceQuantity() : null), this.f38045V);
        } else {
            OtcInfoEntity otcInfoEntity4 = this.f38046W;
            double dMin2 = Math.min(C27039d.m66647g(otcInfoEntity4 != null ? otcInfoEntity4.getLimitMaxQuote() : null), this.f38047X);
            OtcInfoEntity otcInfoEntity5 = this.f38046W;
            dMin = Math.min(dMin2, C27039d.m66647g(otcInfoEntity5 != null ? otcInfoEntity5.getLegalBalanceQuantity() : null));
        }
        if (OtcUserManager.f38144a.m45493u()) {
            return dMin;
        }
        OtcInfoEntity otcInfoEntity6 = this.f38046W;
        return Math.min(dMin, C27039d.m66647g(otcInfoEntity6 != null ? otcInfoEntity6.getSingleLimitQuota() : null));
    }

    /* JADX INFO: renamed from: L4 */
    public final void m45400L4() {
        OtcInfoEntity otcInfoEntity = this.f38046W;
        if (C27025c.m66566d(otcInfoEntity != null ? Boolean.valueOf(otcInfoEntity.isBuy()) : null)) {
            InterfaceC37241c interfaceC37241cM45274K4 = m45274K4();
            OtcInfoEntity otcInfoEntity2 = this.f38046W;
            addSubscription(interfaceC37241cM45274K4.m83344w(otcInfoEntity2 != null ? otcInfoEntity2.getLegal() : null).compose(C24217a1.m58389m()).subscribe(new Consumer() { // from class: com.kubi.otc.otc.trade.b0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OtcDealFragment.m45291Q4(this.f38062b, (String) obj);
                }
            }, new C20191b(this)));
            return;
        }
        OtcInfoEntity otcInfoEntity3 = this.f38046W;
        if (C27041f.m66668h(otcInfoEntity3 != null ? otcInfoEntity3.getCurrency() : null).length() == 0) {
            C43846g.m96568c(new OtcMessage("OtcDealFragment：currency is empty", "v1/account/currency-balance", false, 4, null), null, 2, null);
        }
        InterfaceC37241c interfaceC37241cM45274K5 = m45274K4();
        OtcInfoEntity otcInfoEntity4 = this.f38046W;
        ObservableSource observableSourceCompose = interfaceC37241cM45274K5.m83317G(new Balance.Request(C27041f.m66668h(otcInfoEntity4 != null ? otcInfoEntity4.getCurrency() : null), "")).compose(C24217a1.m58389m());
        InterfaceC37241c interfaceC37241cM45274K6 = m45274K4();
        OtcInfoEntity otcInfoEntity5 = this.f38046W;
        ObservableSource observableSourceCompose2 = interfaceC37241cM45274K6.m83344w(otcInfoEntity5 != null ? otcInfoEntity5.getLegal() : null).compose(C24217a1.m58389m());
        final Function2 function2 = new Function2() { // from class: com.kubi.otc.otc.trade.x
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OtcDealFragment.m45279M4(this.f38112b, (Balance.Response) obj, (String) obj2);
            }
        };
        Observable observableZip = Observable.zip(observableSourceCompose, observableSourceCompose2, new BiFunction() { // from class: com.kubi.otc.otc.trade.y
            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return OtcDealFragment.m45282N4(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.trade.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcDealFragment.m45285O4((Boolean) obj);
            }
        };
        addSubscription(observableZip.subscribe(new Consumer() { // from class: com.kubi.otc.otc.trade.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcDealFragment.m45288P4(function1, obj);
            }
        }, new C20190a(this)));
    }

    /* JADX INFO: renamed from: U5 */
    public final void m45401U5() {
        C38301b1.m86435H(this, ValidationBizEnum.OTC_SELL, null, new Consumer() { // from class: com.kubi.otc.otc.trade.t0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcDealFragment.m45305V5(this.f38107b, obj);
            }
        }, new Consumer() { // from class: com.kubi.otc.otc.trade.u0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcDealFragment.m45308W5(this.f38108b, (Throwable) obj);
            }
        }, null, 36, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_deal;
    }

    /* JADX INFO: renamed from: i5 */
    public final boolean m45406i5(Throwable th2) {
        P2PUtils p2PUtils = P2PUtils.f40363a;
        boolean zM49820k = p2PUtils.m49820k(th2);
        if (zM49820k) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            p2PUtils.m49818f(th2, childFragmentManager, new Function0() { // from class: com.kubi.otc.otc.trade.g1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtcDealFragment.m45342j5(this.f38075b);
                }
            });
        }
        return zM49820k;
    }

    /* JADX INFO: renamed from: k5 */
    public final void m45407k5() {
        OtcInfoEntity otcInfoEntity = this.f38046W;
        String id2 = otcInfoEntity != null ? otcInfoEntity.getId() : null;
        if (id2 == null || id2.length() == 0) {
            return;
        }
        InterfaceC37241c interfaceC37241cM45274K4 = m45274K4();
        OtcInfoEntity otcInfoEntity2 = this.f38046W;
        Observable<R> observableCompose = interfaceC37241cM45274K4.m83330h(C27041f.m66668h(otcInfoEntity2 != null ? otcInfoEntity2.getId() : null)).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.trade.h1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcDealFragment.m45349l5(this.f38077b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.otc.trade.i1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcDealFragment.m45352m5(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.otc.trade.j1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcDealFragment.m45355n5(this.f38081b, (OtcInfoEntity) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.otc.otc.trade.k1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcDealFragment.m45359o5(function2, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: l6 */
    public final void m45408l6() {
        FilterEmojiEditText filterEmojiEditText;
        FilterEmojiEditText filterEmojiEditText2;
        Editable text;
        FilterEmojiEditText filterEmojiEditText3;
        FilterEmojiEditText filterEmojiEditText4;
        FilterEmojiEditText filterEmojiEditText5;
        FilterEmojiEditText filterEmojiEditText6;
        Editable text2;
        FilterEmojiEditText filterEmojiEditText7;
        FilterEmojiEditText filterEmojiEditText8;
        OtcInfoEntity otcInfoEntity = this.f38046W;
        Integer numValueOf = null;
        double dM66647g = C27039d.m66647g(otcInfoEntity != null ? otcInfoEntity.getLegalBalanceQuantity() : null);
        OtcInfoEntity otcInfoEntity2 = this.f38046W;
        if (dM66647g < C27039d.m66647g(otcInfoEntity2 != null ? otcInfoEntity2.getLimitMaxQuote() : null)) {
            double d11 = this.f38047X;
            OtcInfoEntity otcInfoEntity3 = this.f38046W;
            if (d11 > C27039d.m66647g(otcInfoEntity3 != null ? otcInfoEntity3.getLegalBalanceQuantity() : null) && OtcUserManager.f38144a.m45493u()) {
                C37631i c37631iM45398I4 = m45398I4();
                if (c37631iM45398I4 != null && (filterEmojiEditText8 = c37631iM45398I4.f84008f) != null) {
                    filterEmojiEditText8.requestFocus();
                }
                C37631i c37631iM45398I5 = m45398I4();
                if (c37631iM45398I5 != null && (filterEmojiEditText7 = c37631iM45398I5.f84008f) != null) {
                    OtcInfoEntity otcInfoEntity4 = this.f38046W;
                    filterEmojiEditText7.setText(C38346y.m86537x(C27039d.m66647g(otcInfoEntity4 != null ? otcInfoEntity4.getCurrencyBalanceQuantity() : null), this.f38048Y));
                }
                C37631i c37631iM45398I6 = m45398I4();
                if (c37631iM45398I6 == null || (filterEmojiEditText5 = c37631iM45398I6.f84008f) == null) {
                    return;
                }
                C37631i c37631iM45398I7 = m45398I4();
                if (c37631iM45398I7 != null && (filterEmojiEditText6 = c37631iM45398I7.f84008f) != null && (text2 = filterEmojiEditText6.getText()) != null) {
                    numValueOf = Integer.valueOf(text2.length());
                }
                filterEmojiEditText5.setSelection(C27039d.m66650j(numValueOf));
                return;
            }
        }
        C37631i c37631iM45398I8 = m45398I4();
        if (c37631iM45398I8 != null && (filterEmojiEditText4 = c37631iM45398I8.f84009g) != null) {
            filterEmojiEditText4.requestFocus();
        }
        C37631i c37631iM45398I9 = m45398I4();
        if (c37631iM45398I9 != null && (filterEmojiEditText3 = c37631iM45398I9.f84009g) != null) {
            filterEmojiEditText3.setText(C38346y.m86537x(Math.min(m45399J4(), this.f38047X), this.f38049Z));
        }
        C37631i c37631iM45398I10 = m45398I4();
        if (c37631iM45398I10 == null || (filterEmojiEditText = c37631iM45398I10.f84009g) == null) {
            return;
        }
        C37631i c37631iM45398I11 = m45398I4();
        if (c37631iM45398I11 != null && (filterEmojiEditText2 = c37631iM45398I11.f84009g) != null && (text = filterEmojiEditText2.getText()) != null) {
            numValueOf = Integer.valueOf(text.length());
        }
        filterEmojiEditText.setSelection(C27039d.m66650j(numValueOf));
    }

    /* JADX INFO: renamed from: s6 */
    public final void m45413s6() {
        OtcInfoEntity otcInfoEntity = this.f38046W;
        Pair pairM90091to = TuplesKt.m90091to("pay_side", C27025c.m66566d(otcInfoEntity != null ? Boolean.valueOf(otcInfoEntity.isBuy()) : null) ? "buy" : "sell");
        OtcInfoEntity otcInfoEntity2 = this.f38046W;
        Pair pairM90091to2 = TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(otcInfoEntity2 != null ? otcInfoEntity2.getLegal() : null));
        OtcInfoEntity otcInfoEntity3 = this.f38046W;
        C43852m.m96594f("B7P2PPlaceOrder", "page", "1", pairM90091to, pairM90091to2, TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(otcInfoEntity3 != null ? otcInfoEntity3.getCurrency() : null)));
    }

    /* JADX INFO: renamed from: t6 */
    public final void m45414t6() {
        OtcInfoEntity otcInfoEntity = this.f38046W;
        Pair pairM90091to = TuplesKt.m90091to("pay_side", C27025c.m66566d(otcInfoEntity != null ? Boolean.valueOf(otcInfoEntity.isBuy()) : null) ? "buy" : "sell");
        OtcInfoEntity otcInfoEntity2 = this.f38046W;
        Pair pairM90091to2 = TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(otcInfoEntity2 != null ? otcInfoEntity2.getLegal() : null));
        OtcInfoEntity otcInfoEntity3 = this.f38046W;
        C43852m.m96590b("B7P2PPlaceOrder", "purchaseButton", "1", pairM90091to, pairM90091to2, TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(otcInfoEntity3 != null ? otcInfoEntity3.getCurrency() : null)), TuplesKt.m90091to("norm_version", "1"));
    }

    public OtcDealFragment() {
        setPageId("B7P2PPlaceOrder");
    }

    /* JADX INFO: renamed from: A5 */
    public static final Unit m45249A5(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B5 */
    public static final void m45252B5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX INFO: renamed from: C5 */
    public static final Unit m45255C5(OtcDealFragment otcDealFragment, Boolean bool) {
        BaseTextView baseTextView;
        boolean z11;
        Editable text;
        Editable text2;
        FilterEmojiEditText filterEmojiEditText;
        FilterEmojiEditText filterEmojiEditText2;
        C37631i c37631iM45398I4 = otcDealFragment.m45398I4();
        if (c37631iM45398I4 != null && (baseTextView = c37631iM45398I4.f84004b) != null) {
            if (bool.booleanValue()) {
                C37631i c37631iM45398I5 = otcDealFragment.m45398I4();
                if (c37631iM45398I5 != null && (filterEmojiEditText2 = c37631iM45398I5.f84008f) != null) {
                    text = filterEmojiEditText2.getText();
                } else {
                    text = null;
                }
                if (!TextUtils.isEmpty(text)) {
                    C37631i c37631iM45398I6 = otcDealFragment.m45398I4();
                    if (c37631iM45398I6 != null && (filterEmojiEditText = c37631iM45398I6.f84008f) != null) {
                        text2 = filterEmojiEditText.getText();
                    } else {
                        text2 = null;
                    }
                    z11 = true;
                    if (DowngradeExKt.m66538h(String.valueOf(text2), 0.0d, 1, null) == 0.0d) {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            baseTextView.setEnabled(z11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D5 */
    public static final void m45258D5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E5 */
    public static final Unit m45261E5(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F5 */
    public static final void m45264F5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H5 */
    public static final Unit m45268H5(OtcDealFragment otcDealFragment) {
        otcDealFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I5 */
    public static final Unit m45270I5(OtcDealFragment otcDealFragment) {
        otcDealFragment.m45330e6();
        otcDealFragment.m45414t6();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J5 */
    public static final void m45272J5(List list, OtcDealFragment otcDealFragment, Boolean bool, List list2) {
        String icon;
        LinearLayout linearLayout;
        Intrinsics.checkNotNull(list2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(C27041f.m66668h(((PayTypeEntity) obj).getTypeCode()), obj);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdPayType adPayType = (AdPayType) it.next();
            ImageView imageView = new ImageView(otcDealFragment.mContext);
            Context mContext = otcDealFragment.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
            PayTypeEntity payTypeEntity = (PayTypeEntity) linkedHashMap.get(adPayType.getPayTypeCode());
            if (payTypeEntity != null) {
                icon = payTypeEntity.getIcon();
            } else {
                icon = null;
            }
            C20143e.m45237c(imageView, mContext, icon);
            Context mContext2 = otcDealFragment.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
            int iM66565c = (int) C27025c.m66565c(mContext2, 30);
            Context mContext3 = otcDealFragment.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext3, "mContext");
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iM66565c, (int) C27025c.m66565c(mContext3, 30));
            C37631i c37631iM45398I4 = otcDealFragment.m45398I4();
            if (c37631iM45398I4 != null && (linearLayout = c37631iM45398I4.f84020r) != null) {
                linearLayout.addView(imageView, layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: K5 */
    public static final Unit m45275K5(Boolean bool) {
        if (bool.booleanValue()) {
            C43852m.m96591c("B7P2PPlaceOrder", "input", "1", null, 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L5 */
    public static final void m45277L5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M5 */
    public static final Unit m45280M5(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N5 */
    public static final void m45283N5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O5 */
    public static final Unit m45286O5(Boolean bool) {
        if (bool.booleanValue()) {
            C43852m.m96591c("B7P2PPlaceOrder", "input", "2", null, 8, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    public static final void m45288P4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P5 */
    public static final void m45289P5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q5 */
    public static final Unit m45292Q5(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R5 */
    public static final void m45295R5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S5 */
    public static final void m45298S5(OtcDealFragment otcDealFragment, ArrayList arrayList) {
        String currency;
        Intrinsics.checkNotNull(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OtcSymbol otcSymbol = (OtcSymbol) it.next();
            String currency2 = otcSymbol.getCurrency();
            OtcInfoEntity otcInfoEntity = otcDealFragment.f38046W;
            if (otcInfoEntity != null) {
                currency = otcInfoEntity.getCurrency();
            } else {
                currency = null;
            }
            if (Intrinsics.areEqual(currency2, currency)) {
                otcDealFragment.f38048Y = otcSymbol.getCurrencyPrecision();
                otcDealFragment.f38049Z = C27039d.m66650j(otcSymbol.getLegalPrecision());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T5 */
    public static final InterfaceC37241c m45301T5() {
        return (InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class);
    }

    /* JADX INFO: renamed from: V5 */
    public static final void m45305V5(OtcDealFragment otcDealFragment, Object obj) {
        otcDealFragment.hideDialogLoading();
        otcDealFragment.m45405g6();
    }

    /* JADX INFO: renamed from: W5 */
    public static final void m45308W5(OtcDealFragment otcDealFragment, Throwable th2) {
        otcDealFragment.hideDialogLoading();
        if (th2 instanceof ApiException) {
            C38301b1.m86441N(otcDealFragment, (ApiException) th2, new Function0() { // from class: com.kubi.otc.otc.trade.a1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OtcDealFragment.m45311X5();
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public static final Unit m45313Y4(OtcDealFragment otcDealFragment, CharSequence charSequence) {
        FilterEmojiEditText filterEmojiEditText;
        FilterEmojiEditText filterEmojiEditText2;
        if (TextUtils.isEmpty(charSequence)) {
            C37631i c37631iM45398I4 = otcDealFragment.m45398I4();
            if (c37631iM45398I4 != null && (filterEmojiEditText2 = c37631iM45398I4.f84008f) != null) {
                filterEmojiEditText2.setText("");
            }
        } else {
            C37631i c37631iM45398I5 = otcDealFragment.m45398I4();
            if (c37631iM45398I5 != null && (filterEmojiEditText = c37631iM45398I5.f84008f) != null) {
                filterEmojiEditText.setText(C38346y.m86537x(C27021e.m66523b(DowngradeExKt.m66535e(charSequence.toString(), null, 1, null).doubleValue(), otcDealFragment.f38045V), otcDealFragment.f38048Y));
            }
        }
        otcDealFragment.m45396G4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z4 */
    public static final void m45315Z4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a5 */
    public static final Unit m45317a5(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a6 */
    public static final Unit m45318a6(OtcDealFragment otcDealFragment, Disposable disposable) {
        otcDealFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b5 */
    public static final void m45320b5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b6 */
    public static final void m45321b6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d6 */
    public static final void m45327d6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e5 */
    public static final Unit m45329e5(OtcDealFragment otcDealFragment, CharSequence charSequence) {
        FilterEmojiEditText filterEmojiEditText;
        FilterEmojiEditText filterEmojiEditText2;
        if (TextUtils.isEmpty(charSequence)) {
            C37631i c37631iM45398I4 = otcDealFragment.m45398I4();
            if (c37631iM45398I4 != null && (filterEmojiEditText2 = c37631iM45398I4.f84009g) != null) {
                filterEmojiEditText2.setText("");
            }
        } else {
            C37631i c37631iM45398I5 = otcDealFragment.m45398I4();
            if (c37631iM45398I5 != null && (filterEmojiEditText = c37631iM45398I5.f84009g) != null) {
                filterEmojiEditText.setText(C38346y.m86537x(C27021e.m66526e(DowngradeExKt.m66538h(charSequence.toString(), 0.0d, 1, null), otcDealFragment.f38045V), otcDealFragment.f38049Z));
            }
        }
        otcDealFragment.m45396G4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e6 */
    private final void m45330e6() {
        Boolean boolValueOf;
        BaseTextView baseTextView;
        C37631i c37631iM45398I4 = m45398I4();
        if (c37631iM45398I4 != null && (baseTextView = c37631iM45398I4.f84027y) != null && baseTextView.getVisibility() == 0) {
            return;
        }
        OtcInfoEntity otcInfoEntity = this.f38046W;
        if (otcInfoEntity != null) {
            boolValueOf = Boolean.valueOf(otcInfoEntity.isBuy());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            m45404Z5();
            return;
        }
        P2PHelper p2PHelper = P2PHelper.f39683a;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        p2PHelper.m48410b(childFragmentManager, LifecycleOwnerKt.getLifecycleScope(this), new Function0() { // from class: com.kubi.otc.otc.trade.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OtcDealFragment.m45333f6(this.f38100b);
            }
        });
    }

    /* JADX INFO: renamed from: f5 */
    public static final void m45332f5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f6 */
    public static final Unit m45333f6(OtcDealFragment otcDealFragment) {
        otcDealFragment.m45401U5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g5 */
    public static final Unit m45335g5(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h5 */
    public static final void m45337h5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h6 */
    public static final Unit m45338h6(OtcDealFragment otcDealFragment, Disposable disposable) {
        otcDealFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i6 */
    public static final void m45340i6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j5 */
    public static final Unit m45342j5(OtcDealFragment otcDealFragment) {
        otcDealFragment.m45407k5();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k6 */
    public static final void m45346k6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l5 */
    public static final Unit m45349l5(OtcDealFragment otcDealFragment, Disposable disposable) {
        otcDealFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m5 */
    public static final void m45352m5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n5 */
    public static final Unit m45355n5(OtcDealFragment otcDealFragment, OtcInfoEntity otcInfoEntity) {
        FilterEmojiEditText filterEmojiEditText;
        otcDealFragment.hideDialogLoading();
        otcDealFragment.f38046W = otcInfoEntity;
        otcDealFragment.m45300T4();
        C37631i c37631iM45398I4 = otcDealFragment.m45398I4();
        if (c37631iM45398I4 != null && (filterEmojiEditText = c37631iM45398I4.f84009g) != null) {
            filterEmojiEditText.setText("");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o5 */
    public static final void m45359o5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s5 */
    public static final void m45372s5(OtcDealFragment otcDealFragment) {
        BaseTextView baseTextView;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        BaseTextView baseTextView2;
        C37631i c37631iM45398I4 = otcDealFragment.m45398I4();
        Integer numValueOf = null;
        if (c37631iM45398I4 != null) {
            baseTextView = c37631iM45398I4.f83992E;
        } else {
            baseTextView = null;
        }
        if (baseTextView != null) {
            C37631i c37631iM45398I5 = otcDealFragment.m45398I4();
            if (c37631iM45398I5 != null) {
                linearLayout = c37631iM45398I5.f84017o;
            } else {
                linearLayout = null;
            }
            if (linearLayout != null) {
                C37631i c37631iM45398I6 = otcDealFragment.m45398I4();
                if (c37631iM45398I6 != null && (baseTextView2 = c37631iM45398I6.f83992E) != null) {
                    numValueOf = Integer.valueOf(baseTextView2.getLineCount());
                }
                if (C27039d.m66650j(numValueOf) <= 3) {
                    C37631i c37631iM45398I7 = otcDealFragment.m45398I4();
                    if (c37631iM45398I7 != null && (linearLayout3 = c37631iM45398I7.f84017o) != null) {
                        C27046k.m66700o(linearLayout3);
                        return;
                    }
                    return;
                }
                C37631i c37631iM45398I8 = otcDealFragment.m45398I4();
                if (c37631iM45398I8 != null && (linearLayout2 = c37631iM45398I8.f84017o) != null) {
                    C27046k.m66685H(linearLayout2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u5 */
    public static final Unit m45378u5(OtcDealFragment otcDealFragment) {
        otcDealFragment.m45408l6();
        C43852m.m96591c("B7P2PPlaceOrder", TtmlNode.COMBINE_ALL, "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v5 */
    public static final Unit m45382v5(OtcDealFragment otcDealFragment) {
        otcDealFragment.m45408l6();
        C43852m.m96591c("B7P2PPlaceOrder", TtmlNode.COMBINE_ALL, "2", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX INFO: renamed from: y5 */
    public static final Unit m45392y5(OtcDealFragment otcDealFragment, Boolean bool) {
        BaseTextView baseTextView;
        boolean z11;
        Boolean boolValueOf;
        CheckBox checkBox;
        C37631i c37631iM45398I4 = otcDealFragment.m45398I4();
        if (c37631iM45398I4 != null && (baseTextView = c37631iM45398I4.f84004b) != null) {
            if (bool.booleanValue()) {
                C37631i c37631iM45398I5 = otcDealFragment.m45398I4();
                if (c37631iM45398I5 != null && (checkBox = c37631iM45398I5.f84005c) != null) {
                    boolValueOf = Boolean.valueOf(checkBox.isChecked());
                } else {
                    boolValueOf = null;
                }
                if (C27025c.m66566d(boolValueOf)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            baseTextView.setEnabled(z11);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z5 */
    public static final void m45395z5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: V4 */
    public final void m45402V4() {
        final FilterEmojiEditText filterEmojiEditText;
        final FilterEmojiEditText filterEmojiEditText2;
        C37631i c37631iM45398I4 = m45398I4();
        if (c37631iM45398I4 != null && (filterEmojiEditText2 = c37631iM45398I4.f84009g) != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(filterEmojiEditText2);
            final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.trade.c0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(OtcDealFragment.m45307W4(filterEmojiEditText2, (CharSequence) obj));
                }
            };
            Observable<CharSequence> observableFilter = abstractC46099aM784d.filter(new Predicate() { // from class: com.kubi.otc.otc.trade.f0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return OtcDealFragment.m45310X4(function1, obj);
                }
            });
            final Function1 function2 = new Function1() { // from class: com.kubi.otc.otc.trade.g0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtcDealFragment.m45313Y4(this.f38074b, (CharSequence) obj);
                }
            };
            Consumer<? super CharSequence> consumer = new Consumer() { // from class: com.kubi.otc.otc.trade.i0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OtcDealFragment.m45315Z4(function2, obj);
                }
            };
            final Function1 function3 = new Function1() { // from class: com.kubi.otc.otc.trade.j0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtcDealFragment.m45317a5((Throwable) obj);
                }
            };
            addSubscription(observableFilter.subscribe(consumer, new Consumer() { // from class: com.kubi.otc.otc.trade.k0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OtcDealFragment.m45320b5(function3, obj);
                }
            }));
        }
        C37631i c37631iM45398I5 = m45398I4();
        if (c37631iM45398I5 != null && (filterEmojiEditText = c37631iM45398I5.f84008f) != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d2 = C0206f.m784d(filterEmojiEditText);
            final Function1 function4 = new Function1() { // from class: com.kubi.otc.otc.trade.l0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(OtcDealFragment.m45323c5(filterEmojiEditText, (CharSequence) obj));
                }
            };
            Observable<CharSequence> observableFilter2 = abstractC46099aM784d2.filter(new Predicate() { // from class: com.kubi.otc.otc.trade.m0
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return OtcDealFragment.m45326d5(function4, obj);
                }
            });
            final Function1 function5 = new Function1() { // from class: com.kubi.otc.otc.trade.n0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtcDealFragment.m45329e5(this.f38091b, (CharSequence) obj);
                }
            };
            Consumer<? super CharSequence> consumer2 = new Consumer() { // from class: com.kubi.otc.otc.trade.o0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OtcDealFragment.m45332f5(function5, obj);
                }
            };
            final Function1 function6 = new Function1() { // from class: com.kubi.otc.otc.trade.d0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OtcDealFragment.m45335g5((Throwable) obj);
                }
            };
            addSubscription(observableFilter2.subscribe(consumer2, new Consumer() { // from class: com.kubi.otc.otc.trade.e0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OtcDealFragment.m45337h5(function6, obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public final void m45403Y5() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new OtcDealFragment$refreshTaxInfo$1(this, null));
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m45404Z5() {
        String id2;
        Editable text;
        Editable text2;
        BigDecimal floatPrice;
        FilterEmojiEditText filterEmojiEditText;
        FilterEmojiEditText filterEmojiEditText2;
        InterfaceC37241c interfaceC37241cM45274K4 = m45274K4();
        OtcInfoEntity otcInfoEntity = this.f38046W;
        String plainString = null;
        if (otcInfoEntity != null) {
            id2 = otcInfoEntity.getId();
        } else {
            id2 = null;
        }
        String strM66668h = C27041f.m66668h(id2);
        C37631i c37631iM45398I4 = m45398I4();
        if (c37631iM45398I4 != null && (filterEmojiEditText2 = c37631iM45398I4.f84008f) != null) {
            text = filterEmojiEditText2.getText();
        } else {
            text = null;
        }
        String strValueOf = String.valueOf(text);
        C37631i c37631iM45398I5 = m45398I4();
        if (c37631iM45398I5 != null && (filterEmojiEditText = c37631iM45398I5.f84009g) != null) {
            text2 = filterEmojiEditText.getText();
        } else {
            text2 = null;
        }
        String strValueOf2 = String.valueOf(text2);
        OtcInfoEntity otcInfoEntity2 = this.f38046W;
        if (otcInfoEntity2 != null && (floatPrice = otcInfoEntity2.getFloatPrice()) != null) {
            plainString = floatPrice.toPlainString();
        }
        Observable<R> observableCompose = interfaceC37241cM45274K4.m83320J(strM66668h, strValueOf, strValueOf2, C27041f.m66668h(plainString), this.f38053d0).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.trade.w0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcDealFragment.m45318a6(this.f38111b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.otc.trade.x0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcDealFragment.m45321b6(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.otc.trade.y0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcDealFragment.m45324c6(this.f38115b, (String) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.otc.otc.trade.z0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcDealFragment.m45327d6(function2, obj);
            }
        }, new C20193d());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: g6 */
    public final void m45405g6() {
        String id2;
        Editable text;
        Editable text2;
        BigDecimal floatPrice;
        FilterEmojiEditText filterEmojiEditText;
        FilterEmojiEditText filterEmojiEditText2;
        InterfaceC37241c interfaceC37241cM45274K4 = m45274K4();
        OtcInfoEntity otcInfoEntity = this.f38046W;
        String plainString = null;
        if (otcInfoEntity != null) {
            id2 = otcInfoEntity.getId();
        } else {
            id2 = null;
        }
        String strM66668h = C27041f.m66668h(id2);
        C37631i c37631iM45398I4 = m45398I4();
        if (c37631iM45398I4 != null && (filterEmojiEditText2 = c37631iM45398I4.f84008f) != null) {
            text = filterEmojiEditText2.getText();
        } else {
            text = null;
        }
        String strValueOf = String.valueOf(text);
        C37631i c37631iM45398I5 = m45398I4();
        if (c37631iM45398I5 != null && (filterEmojiEditText = c37631iM45398I5.f84009g) != null) {
            text2 = filterEmojiEditText.getText();
        } else {
            text2 = null;
        }
        String strValueOf2 = String.valueOf(text2);
        OtcInfoEntity otcInfoEntity2 = this.f38046W;
        if (otcInfoEntity2 != null && (floatPrice = otcInfoEntity2.getFloatPrice()) != null) {
            plainString = floatPrice.toPlainString();
        }
        Observable<R> observableCompose = interfaceC37241cM45274K4.m83336n(strM66668h, strValueOf, strValueOf2, C27041f.m66668h(plainString)).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.trade.b1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcDealFragment.m45338h6(this.f38063b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.otc.trade.c1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcDealFragment.m45340i6(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.otc.trade.e1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtcDealFragment.m45343j6(this.f38070b, (String) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.otc.otc.trade.f1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OtcDealFragment.m45346k6(function2, obj);
            }
        }, new C20194e());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m45403Y5();
    }

    /* JADX INFO: renamed from: p5 */
    public final void m45410p5(String str) {
        Long lValueOf;
        hideDialogLoading();
        showToast(getString(R$string.deal_ok));
        C37304a c37304a = C37304a.f82764a;
        OtcInfoEntity otcInfoEntity = this.f38046W;
        if (otcInfoEntity != null) {
            lValueOf = Long.valueOf(otcInfoEntity.isBuyValue());
        } else {
            lValueOf = null;
        }
        InterfaceC37758j.a.m85164m(c37304a, C27039d.m66652l(lValueOf), str, Boolean.TRUE, C43852m.m96602n(C27041f.m66668h(getF18113U()), "purchaseButton", null, 4, null), null, null, 48, null);
        preformBackPressed();
    }

    /* JADX INFO: renamed from: q6 */
    public final void m45411q6() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new OtcDealFragment$showLimitTip$1(this, null));
    }

    /* JADX INFO: renamed from: r6 */
    public final void m45412r6(String str) {
        String taxRate;
        Boolean hit;
        String legal;
        C37631i c37631iM45398I4 = m45398I4();
        if (c37631iM45398I4 == null) {
            return;
        }
        TaxInfo taxInfo = this.f38054e0;
        String taxRate2 = null;
        if (taxInfo != null) {
            taxRate = taxInfo.getTaxRate();
        } else {
            taxRate = null;
        }
        String strM66668h = C27041f.m66668h(taxRate);
        TaxInfo taxInfo2 = this.f38054e0;
        if (taxInfo2 != null) {
            if (taxInfo2 != null) {
                hit = taxInfo2.getHit();
            } else {
                hit = null;
            }
            if (C27025c.m66567e(hit, false) && strM66668h.length() != 0) {
                String plainString = C6447a.m11724a(C38346y.m86490A(str).multiply(new BigDecimal(strM66668h)).setScale(this.f38049Z, RoundingMode.HALF_UP)).toPlainString();
                DashTextView dashTextView = c37631iM45398I4.f83999L;
                int i11 = R$string.payment_tax_value;
                OtcInfoEntity otcInfoEntity = this.f38046W;
                if (otcInfoEntity != null) {
                    legal = otcInfoEntity.getLegal();
                } else {
                    legal = null;
                }
                String strM66668h2 = C27041f.m66668h(legal);
                TaxInfo taxInfo3 = this.f38054e0;
                if (taxInfo3 != null) {
                    taxRate2 = taxInfo3.getTaxRate();
                }
                dashTextView.setText(getStringRes(i11, plainString, strM66668h2, C27039d.m66642b(DowngradeExKt.m66536f(C27041f.m66668h(taxRate2)))));
                Group groupTax = c37631iM45398I4.f84011i;
                Intrinsics.checkNotNullExpressionValue(groupTax, "groupTax");
                C27046k.m66685H(groupTax);
                return;
            }
        }
        Group groupTax2 = c37631iM45398I4.f84011i;
        Intrinsics.checkNotNullExpressionValue(groupTax2, "groupTax");
        C27046k.m66700o(groupTax2);
    }
}
