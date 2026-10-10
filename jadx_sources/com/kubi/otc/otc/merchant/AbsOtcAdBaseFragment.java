package com.kubi.otc.otc.merchant;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.jumio.core.constants.ConstantsKt;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.otc.R$color;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.OtcAd;
import com.kubi.otc.entity.OtcPrice;
import com.kubi.otc.entity.OtcSymbol;
import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.otc.otc.paytype.C20143e;
import com.kubi.otc.otc.paytype.PayTypeWaySelectFragment;
import com.kubi.otc.view.EditTextWithTitleView;
import com.kubi.otc.view.WheelOneViewDialog;
import com.kubi.otc.view.WheelTwoViewDialog;
import com.kubi.payment.fast.data.entities.Balance;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import com.kubi.payment.util.C21457l;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.dialog.BottomSheetDialogHelper;
import com.kubi.sdk.widget.dialog.SelectEntity;
import com.kubi.utils.C27056j0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.qcloud.tuicore.TUIConstants;
import cy.InterfaceC36555b;
import et.InterfaceC37241c;
import f00.C37304a;
import g00.InterfaceC37749a;
import gf.C37885i;
import ht.C38346y;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.DisposableKt;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import mr.C42597a;
import mt.SelectWheelEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p011a9.C0206f;
import p270ft.C37601c;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43846g;
import p752x8.AbstractC46099a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: AbsOtcAdBaseFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u008f\u00012\u00020\u0001:\u0002\u008f\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010b\u001a\u00020cH\u0014J\u001a\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010iH\u0016J\b\u0010j\u001a\u00020eH\u0016J\b\u0010k\u001a\u00020eH\u0002J\b\u0010l\u001a\u00020eH\u0002J\b\u0010m\u001a\u00020eH\u0002J\b\u0010n\u001a\u00020eH\u0002J\b\u0010o\u001a\u00020eH&J\u0006\u0010p\u001a\u00020eJ\b\u0010q\u001a\u00020eH\u0016J\f\u0010r\u001a\u00020e*\u00020XH\u0002J\b\u0010s\u001a\u00020eH\u0016J\b\u0010t\u001a\u00020eH\u0002J\b\u0010u\u001a\u00020eH\u0002J\b\u0010v\u001a\u00020eH\u0002J\u0010\u0010w\u001a\u00020e2\b\b\u0002\u0010x\u001a\u000205J\u0006\u0010y\u001a\u00020eJ\b\u0010z\u001a\u00020eH\u0016J\b\u0010{\u001a\u00020eH\u0002J\b\u0010|\u001a\u00020eH\u0002J\b\u0010}\u001a\u00020eH\u0002J\b\u0010~\u001a\u000205H\u0004J\b\u0010\u007f\u001a\u000205H\u0016J)\u0010\u0080\u0001\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u0001j\u0010\u0012\u0004\u0012\u00020\f\u0012\u0005\u0012\u00030\u0082\u0001`\u0083\u0001H\u0016J,\u0010\u0084\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0086\u0001\u001a\u00020\f2\u0007\u0010\u0087\u0001\u001a\u00020\f2\u0007\u0010\u0088\u0001\u001a\u00020c2\u0007\u0010\u0089\u0001\u001a\u00020cJ\u0015\u0010\u008a\u0001\u001a\u00020e2\f\b\u0002\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u0001J\u0012\u0010\u008d\u0001\u001a\u00020e2\u0007\u0010\u008e\u0001\u001a\u00020\fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R+\u0010\n\u001a\u0012\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u000e\u0010\u000fR.\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001c\u00101\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\u001a\u00104\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00106\"\u0004\b:\u00108R'\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\t\u001a\u0004\b<\u0010\u001bR,\u0010>\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\t\u0012\u00070\f¢\u0006\u0002\b?0\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\t\u001a\u0004\b@\u0010\u001bR'\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\t\u001a\u0004\bC\u0010\u001bR!\u0010E\u001a\b\u0012\u0004\u0012\u00020G0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\t\u001a\u0004\bH\u0010IR!\u0010K\u001a\b\u0012\u0004\u0012\u00020G0F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010\t\u001a\u0004\bL\u0010IR,\u0010N\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\t\u0012\u00070\f¢\u0006\u0002\b?0\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010\t\u001a\u0004\bO\u0010\u001bR,\u0010Q\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\t\u0012\u00070\f¢\u0006\u0002\b?0\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010\t\u001a\u0004\bR\u0010\u001bR'\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010\t\u001a\u0004\bU\u0010\u001bR\u001d\u0010W\u001a\u0004\u0018\u00010X8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\bY\u0010ZR\u001b\u0010]\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010\t\u001a\u0004\b^\u00106R\u0010\u0010`\u001a\u0004\u0018\u00010aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0090\u0001"}, m90084d2 = {"Lcom/kubi/otc/otc/merchant/AbsOtcAdBaseFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "otcApi", "Lcom/kubi/otc/api/OtcApi;", "getOtcApi", "()Lcom/kubi/otc/api/OtcApi;", "otcApi$delegate", "Lkotlin/Lazy;", "legalList", "Ljava/util/ArrayList;", "", "kotlin.jvm.PlatformType", "getLegalList", "()Ljava/util/ArrayList;", "legalList$delegate", "symbolList", "Lcom/kubi/otc/entity/OtcSymbol;", "Lkotlin/collections/ArrayList;", "getSymbolList", "setSymbolList", "(Ljava/util/ArrayList;)V", "configIcons", "", "Lcom/kubi/otc/entity/PayTypeEntity;", "getConfigIcons", "()Ljava/util/Map;", "setConfigIcons", "(Ljava/util/Map;)V", "otcAd", "Lcom/kubi/otc/entity/OtcAd;", "getOtcAd", "()Lcom/kubi/otc/entity/OtcAd;", "setOtcAd", "(Lcom/kubi/otc/entity/OtcAd;)V", "symbol", "getSymbol", "()Lcom/kubi/otc/entity/OtcSymbol;", "setSymbol", "(Lcom/kubi/otc/entity/OtcSymbol;)V", "symbolPrice", "getSymbolPrice", "()Ljava/lang/String;", "setSymbolPrice", "(Ljava/lang/String;)V", "availableV2", "getAvailableV2", "setAvailableV2", "available", "getAvailable", "setAvailable", "isSellCheck", "", "()Z", "setSellCheck", "(Z)V", "isFloatPriceEnable", "setFloatPriceEnable", "tradeTimeMap", "getTradeTimeMap", "tradeTimeMap$delegate", "onLineTimeMap", "Lkotlin/jvm/internal/EnhancedNullability;", "getOnLineTimeMap", "onLineTimeMap$delegate", "timeZoneMap", "getTimeZoneMap", "timeZoneMap$delegate", "timeHourList", "", "Lcom/kubi/otc/view/SelectWheelEntity;", "getTimeHourList", "()Ljava/util/List;", "timeHourList$delegate", "timeMinList", "getTimeMinList", "timeMinList$delegate", "userStatusMap", "getUserStatusMap", "userStatusMap$delegate", "tradeNumFirstMap", "getTradeNumFirstMap", "tradeNumFirstMap$delegate", "tradeNumSecondMap", "getTradeNumSecondMap", "tradeNumSecondMap$delegate", "binding", "Lcom/kubi/otc/databinding/BotcFragmentAdBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentAdBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "useMultiAccountWidget", "getUseMultiAccountWidget", "useMultiAccountWidget$delegate", "taxInfo", "Lcom/kubi/payment/p2p/data/entities/TaxInfo;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initBaseView", "initData", "initPrecision", "setCurrencyPrecision", "setLegalPrecision", "initView", "onChangePayType", "onChangeSide", "refreshBalance", "onResume", "handleTaxInfo", "onChangeLegal", "onChangeCurrency", "initPrice", "isSwitchType", "setInputPrice", "checkInputValid", "checkMinValid", "checkMaxValid", "checkActionValid", "checkPaymentMethod", "checkValid", "getParams", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getRelativeSpan", "Landroid/text/SpannableString;", ConstantsKt.FACE_CAPTURE_MODE_FRONT, "behind", "frontColor", "behindColor", "getReferencePrice", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Action;", "showAlertTip", "content", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbsOtcAdBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsOtcAdBaseFragment.kt\ncom/kubi/otc/otc/merchant/AbsOtcAdBaseFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 6 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 7 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,957:1\n147#2,16:958\n126#3:974\n153#3,3:975\n126#3:978\n153#3,3:979\n126#3:1030\n153#3,3:1031\n126#3:1034\n153#3,3:1035\n126#3:1038\n153#3,3:1039\n126#3:1042\n153#3,3:1043\n1563#4:982\n1634#4,3:983\n1563#4:988\n1634#4,3:989\n1563#4:992\n1634#4,3:993\n1563#4:996\n1634#4,3:997\n1563#4:1000\n1634#4,3:1001\n1285#4,2:1004\n1299#4,4:1006\n1563#4:1018\n1634#4,3:1019\n1563#4:1022\n1634#4,3:1023\n1563#4:1026\n1634#4,3:1027\n1208#4,2:1046\n1236#4,4:1048\n48#5,2:986\n35#6,4:1010\n39#6:1016\n44#7,2:1014\n1#8:1017\n*S KotlinDebug\n*F\n+ 1 AbsOtcAdBaseFragment.kt\ncom/kubi/otc/otc/merchant/AbsOtcAdBaseFragment\n*L\n175#1:958,16\n456#1:974\n456#1:975,3\n457#1:978\n457#1:979,3\n375#1:1030\n375#1:1031,3\n386#1:1034\n386#1:1035,3\n403#1:1038\n403#1:1039,3\n449#1:1042\n449#1:1043,3\n594#1:982\n594#1:983,3\n125#1:988\n125#1:989,3\n134#1:992\n134#1:993,3\n145#1:996\n145#1:997,3\n170#1:1000\n170#1:1001,3\n170#1:1004,2\n170#1:1006,4\n296#1:1018\n296#1:1019,3\n313#1:1022\n313#1:1023,3\n337#1:1026\n337#1:1027,3\n536#1:1046,2\n536#1:1048,4\n699#1:986,2\n183#1:1010,4\n183#1:1016\n183#1:1014,2\n*E\n"})
public abstract class AbsOtcAdBaseFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: W */
    @Nullable
    public ArrayList<OtcSymbol> f37660W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public Map<String, PayTypeEntity> f37661X;

    /* JADX INFO: renamed from: Y */
    @Nullable
    public OtcAd f37662Y;

    /* JADX INFO: renamed from: Z */
    @Nullable
    public OtcSymbol f37663Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public String f37664a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public String f37665b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public String f37666c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f37667d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f37668e0;

    /* JADX INFO: renamed from: p0 */
    @Nullable
    public TaxInfo f37679p0;

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ KProperty<Object>[] f37657r0 = {Reflection.property1(new PropertyReference1Impl(AbsOtcAdBaseFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentAdBinding;", 0))};

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public static final Companion f37656q0 = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37658U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsOtcAdBaseFragment.m44795t6();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37659V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.f0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsOtcAdBaseFragment.m44767l6(this.f37726b);
        }
    });

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f37669f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.g0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsOtcAdBaseFragment.m44706L6();
        }
    });

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f37670g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.i0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsOtcAdBaseFragment.m44791s6(this.f37739b);
        }
    });

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final Lazy f37671h0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.j0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsOtcAdBaseFragment.m44697I6();
        }
    });

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public final Lazy f37672i0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.k0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsOtcAdBaseFragment.m44691G6(this.f37751b);
        }
    });

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public final Lazy f37673j0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.l0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsOtcAdBaseFragment.m44694H6(this.f37757b);
        }
    });

    /* JADX INFO: renamed from: k0 */
    @NotNull
    public final Lazy f37674k0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.m0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsOtcAdBaseFragment.m44712N6(this.f37764b);
        }
    });

    /* JADX INFO: renamed from: l0 */
    @NotNull
    public final Lazy f37675l0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.n0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsOtcAdBaseFragment.m44700J6(this.f37768b);
        }
    });

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final Lazy f37676m0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.o0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsOtcAdBaseFragment.m44703K6(this.f37775b);
        }
    });

    /* JADX INFO: renamed from: n0 */
    @NotNull
    public final InterfaceC24293a f37677n0 = C45681e.m100799e(this, new Function1<AbsOtcAdBaseFragment, C37601c>() { // from class: com.kubi.otc.otc.merchant.AbsOtcAdBaseFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37601c invoke(@NotNull AbsOtcAdBaseFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37601c.m84785a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37601c, Unit>() { // from class: com.kubi.otc.otc.merchant.AbsOtcAdBaseFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37601c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37601c c37601c) {
            invoke(c37601c);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public final Lazy f37678o0 = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.otc.merchant.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(AbsOtcAdBaseFragment.m44709M6());
        }
    });

    /* JADX INFO: compiled from: AbsOtcAdBaseFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/otc/otc/merchant/AbsOtcAdBaseFragment$Companion;", "", "<init>", "()V", "INPUT_MAX_VALUE", "", "INPUT_FLOAT_VALUE", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.otc.merchant.AbsOtcAdBaseFragment$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C19957a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: L5 */
    public static final void m44705L5(AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        absOtcAdBaseFragment.m44850j6(true);
    }

    /* JADX INFO: renamed from: T4 */
    public static final Unit m44725T4(AbsOtcAdBaseFragment absOtcAdBaseFragment, Action action, OtcPrice otcPrice) throws Exception {
        String strPrice;
        BaseTextView baseTextView;
        if (otcPrice != null) {
            OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
            strPrice = otcPrice.price(otcAd != null ? otcAd.getSide() : null);
        } else {
            strPrice = null;
        }
        absOtcAdBaseFragment.f37664a0 = C27041f.m66668h(strPrice);
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83673R) != null) {
            String strM66668h = C27041f.m66668h(absOtcAdBaseFragment.f37664a0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            OtcAd otcAd2 = absOtcAdBaseFragment.f37662Y;
            sb2.append(C27041f.m66668h(otcAd2 != null ? otcAd2.getLegal() : null));
            baseTextView.setText(absOtcAdBaseFragment.m44836V4(strM66668h, sb2.toString(), R$color.emphasis, R$color.emphasis60));
        }
        if (action != null) {
            action.run();
        }
        return Unit.INSTANCE;
    }

    public abstract void initView();

    /* JADX INFO: renamed from: A5 */
    public static final Unit m44673A5(AbsOtcAdBaseFragment absOtcAdBaseFragment, Integer num) {
        BaseTextView baseTextView;
        SpannableString spannableString = new SpannableString(num + "/1024");
        spannableString.setSpan(new ForegroundColorSpan(absOtcAdBaseFragment.getColorRes(R$color.emphasis)), 0, num.toString().length(), 33);
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83660E) != null) {
            baseTextView.setText(spannableString);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B6 */
    public static final void m44677B6(AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        C37601c c37601cM44829L4;
        EditTextWithTitleView editTextWithTitleView;
        EditTextWithTitleView editTextWithTitleView2;
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        String priceType = otcAd != null ? otcAd.getPriceType() : null;
        if (Intrinsics.areEqual(priceType, "REGULAR")) {
            C37601c c37601cM44829L5 = absOtcAdBaseFragment.m44829L4();
            if (c37601cM44829L5 == null || (editTextWithTitleView2 = c37601cM44829L5.f83696h) == null) {
                return;
            }
            editTextWithTitleView2.setContent(absOtcAdBaseFragment.f37664a0);
            return;
        }
        if (!Intrinsics.areEqual(priceType, "FLOAT") || (c37601cM44829L4 = absOtcAdBaseFragment.m44829L4()) == null || (editTextWithTitleView = c37601cM44829L4.f83702k) == null) {
            return;
        }
        editTextWithTitleView.setContent("100.00");
    }

    /* JADX INFO: renamed from: C5 */
    public static final Unit m44680C5(AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setSide("BUY");
        }
        absOtcAdBaseFragment.mo44854r6();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D5 */
    public static final Unit m44683D5(AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setSide("SELL");
        }
        absOtcAdBaseFragment.mo44854r6();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E5 */
    public static final Unit m44686E5(final AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        ArrayList arrayList;
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        ArrayList<OtcSymbol> arrayList2 = absOtcAdBaseFragment.f37660W;
        if (arrayList2 != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            for (OtcSymbol otcSymbol : arrayList2) {
                arrayList.add(new SelectEntity(null, C27041f.m66668h(otcSymbol.getCurrency()), C27041f.m66668h(otcSymbol.getCurrency()), null, null, null, null, null, null, false, false, null, 4089, null));
            }
        } else {
            arrayList = null;
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, C27024b.m66560c(arrayList), new BiConsumer() { // from class: com.kubi.otc.otc.merchant.v0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbsOtcAdBaseFragment.m44688F5(this.f37810b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = absOtcAdBaseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, FirebaseAnalytics.Param.CURRENCY);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G5 */
    public static final Unit m44690G5(final AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        ArrayList arrayList;
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        ArrayList<String> arrayListM44830M4 = absOtcAdBaseFragment.m44830M4();
        if (arrayListM44830M4 != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM44830M4, 10));
            for (String str : arrayListM44830M4) {
                Intrinsics.checkNotNull(str);
                arrayList.add(new SelectEntity(null, str, str, null, null, null, null, null, null, false, false, null, 4089, null));
            }
        } else {
            arrayList = null;
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, C27024b.m66560c(arrayList), new BiConsumer() { // from class: com.kubi.otc.otc.merchant.c1
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) throws Exception {
                AbsOtcAdBaseFragment.m44693H5(this.f37715b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = absOtcAdBaseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "legal");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G6 */
    public static final List m44691G6(AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        IntRange intRange = new IntRange(0, 23);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            String str = decimalFormat.format(Integer.valueOf(((IntIterator) it).nextInt()));
            arrayList.add(new SelectWheelEntity(str, str + absOtcAdBaseFragment.getString(R$string.pay_otc_publish_online_time_set_up_unit_h)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H6 */
    public static final List m44694H6(AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        DecimalFormat decimalFormat = new DecimalFormat("00");
        IntRange intRange = new IntRange(0, 59);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            String str = decimalFormat.format(Integer.valueOf(((IntIterator) it).nextInt()));
            arrayList.add(new SelectWheelEntity(str, str + absOtcAdBaseFragment.getString(R$string.pay_otc_publish_online_time_set_up_unit_m)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: I5 */
    public static final void m44696I5(AbsOtcAdBaseFragment absOtcAdBaseFragment, ArrayList arrayList) {
        ArrayList<String> supportPriceTypes;
        absOtcAdBaseFragment.f37660W = arrayList;
        String str = null;
        OtcSymbol otcSymbol = arrayList != null ? (OtcSymbol) arrayList.get(0) : null;
        absOtcAdBaseFragment.f37663Z = otcSymbol;
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setCurrency(otcSymbol != null ? otcSymbol.getCurrency() : null);
        }
        OtcAd otcAd2 = absOtcAdBaseFragment.f37662Y;
        if (otcAd2 != null) {
            OtcSymbol otcSymbol2 = absOtcAdBaseFragment.f37663Z;
            if (otcSymbol2 != null && (supportPriceTypes = otcSymbol2.getSupportPriceTypes()) != null) {
                str = supportPriceTypes.get(0);
            }
            otcAd2.setPriceType(str);
        }
        absOtcAdBaseFragment.m44819C6();
        absOtcAdBaseFragment.m44851m6();
        absOtcAdBaseFragment.m44818A6();
    }

    /* JADX INFO: renamed from: I6 */
    public static final Map m44697I6() {
        StringBuilder sb2;
        String str;
        IntRange intRange = new IntRange(-11, 12);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            if (iNextInt >= 0) {
                sb2 = new StringBuilder();
                str = "UTC+";
            } else {
                sb2 = new StringBuilder();
                str = "UTC";
            }
            sb2.append(str);
            sb2.append(iNextInt);
            String string = sb2.toString();
            arrayList.add(new Pair(string, string));
        }
        return MapsKt.toMap(arrayList);
    }

    /* JADX INFO: renamed from: J5 */
    public static final Unit m44699J5(final AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        ArrayList<String> supportPriceTypes;
        BottomSheetDialogHelper bottomSheetDialogHelper = BottomSheetDialogHelper.f48599a;
        OtcSymbol otcSymbol = absOtcAdBaseFragment.f37663Z;
        ArrayList arrayList = null;
        if (otcSymbol != null && (supportPriceTypes = otcSymbol.getSupportPriceTypes()) != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(supportPriceTypes, 10));
            for (String str : supportPriceTypes) {
                OtcSymbol otcSymbol2 = absOtcAdBaseFragment.f37663Z;
                arrayList2.add(new SelectEntity(null, C27041f.m66668h(otcSymbol2 != null ? otcSymbol2.priceTypeStr(C27041f.m66668h(str)) : null), C27041f.m66668h(str), null, null, null, null, null, null, false, false, null, 4089, null));
            }
            arrayList = arrayList2;
        }
        DialogFragmentHelper dialogFragmentHelperM58944B = BottomSheetDialogHelper.m58944B(bottomSheetDialogHelper, C27024b.m66560c(arrayList), new BiConsumer() { // from class: com.kubi.otc.otc.merchant.b1
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbsOtcAdBaseFragment.m44702K5(this.f37709b, (BaseViewHolder) obj, (BottomSheetDialogHelper.InterfaceC24339a) obj2);
            }
        }, false, null, null, false, 60, null);
        FragmentManager childFragmentManager = absOtcAdBaseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM58944B.show(childFragmentManager, "priceType");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J6 */
    public static final Map m44700J6(AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        return MapsKt.mapOf(new Pair("none", absOtcAdBaseFragment.getString(R$string.pay_otc_publish_counterparty_id_unlimit)), new Pair(OtcAd.TRADE_NUM_GT, absOtcAdBaseFragment.getString(R$string.payment_p2p_limt_gt)), new Pair(OtcAd.TRADE_NUM_LT, absOtcAdBaseFragment.getString(R$string.payment_p2p_limt_lt)));
    }

    /* JADX INFO: renamed from: K5 */
    public static final void m44702K5(final AbsOtcAdBaseFragment absOtcAdBaseFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setPriceType(interfaceC24339a.getValue());
        }
        absOtcAdBaseFragment.m44835R4(new Action() { // from class: com.kubi.otc.otc.merchant.h1
            @Override // io.reactivex.functions.Action
            public final void run() {
                AbsOtcAdBaseFragment.m44705L5(this.f37735b);
            }
        });
    }

    /* JADX INFO: renamed from: K6 */
    public static final Map m44703K6(AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        IntRange intRange = new IntRange(0, 30);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((IntIterator) it).nextInt()));
        }
        List list = CollectionsKt.toList(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, absOtcAdBaseFragment.getStringRes(R$string.payment_p2p_limt_count, (String) obj));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: L6 */
    public static final Map m44706L6() {
        return MapsKt.mapOf(new Pair("15", "15min"), new Pair("30", "30min"), new Pair(OtcAd.TRADE_TIME_FORTYFIVE, "45min"), new Pair(OtcAd.TRADE_TIME_SIXTY, "60min"));
    }

    /* JADX INFO: renamed from: M6 */
    public static final boolean m44709M6() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C19957a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_use_fund_component_key", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: N5 */
    public static final Unit m44711N5(final AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        Intent intentPutExtra = new Intent(absOtcAdBaseFragment.mContext, (Class<?>) BaseFragmentActivity.class).putExtra("title", absOtcAdBaseFragment.getString(R$string.receive_method_stub));
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        Intent intentPutExtra2 = intentPutExtra.putExtra("payTypes", otcAd != null ? otcAd.getAdPayTypes() : null).putExtra("fragment", PayTypeWaySelectFragment.class.getName());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "putExtra(...)");
        absOtcAdBaseFragment.startActivityWithResult(intentPutExtra2, new Consumer() { // from class: com.kubi.otc.otc.merchant.u0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbsOtcAdBaseFragment.m44714O5(this.f37806b, (Intent) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N6 */
    public static final Map m44712N6(AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        return MapsKt.mapOf(new Pair("1", absOtcAdBaseFragment.getString(R$string.otc_ad_identity_all)), new Pair("2", absOtcAdBaseFragment.getString(R$string.otc_ad_identity_not_business)));
    }

    /* JADX INFO: renamed from: O5 */
    public static final void m44714O5(AbsOtcAdBaseFragment absOtcAdBaseFragment, Intent intent) {
        if (intent != null) {
            OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
            if (otcAd != null) {
                otcAd.setAdPayTypes(intent.getParcelableArrayListExtra("payTypes"));
            }
            absOtcAdBaseFragment.m44853q6();
        }
        absOtcAdBaseFragment.m44822F4();
    }

    /* JADX INFO: renamed from: P5 */
    public static final Unit m44716P5(final AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        WheelOneViewDialog.Companion companion = WheelOneViewDialog.f38188u0;
        String string = absOtcAdBaseFragment.getString(R$string.pay_otc_publish_trading_time_limit);
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        String tradeTimeLimit = otcAd != null ? otcAd.getTradeTimeLimit() : null;
        Map<String, String> mapM44844d5 = absOtcAdBaseFragment.m44844d5();
        ArrayList arrayList = new ArrayList(mapM44844d5.size());
        for (Map.Entry<String, String> entry : mapM44844d5.entrySet()) {
            arrayList.add(new SelectWheelEntity(entry.getKey(), entry.getValue()));
        }
        WheelOneViewDialog wheelOneViewDialogNewInstance = companion.newInstance(string, tradeTimeLimit, arrayList, new Function1() { // from class: com.kubi.otc.otc.merchant.z0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsOtcAdBaseFragment.m44718Q5(this.f37829b, (SelectWheelEntity) obj);
            }
        });
        FragmentManager childFragmentManager = absOtcAdBaseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        wheelOneViewDialogNewInstance.show(childFragmentManager, "tradeTimeDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q5 */
    public static final Unit m44718Q5(AbsOtcAdBaseFragment absOtcAdBaseFragment, SelectWheelEntity it) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(it, "it");
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setTradeTimeLimit(it.getKey());
        }
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83687c0) != null) {
            baseTextView.setText(it.getValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R5 */
    public static final Unit m44720R5(final AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        WheelOneViewDialog.Companion companion = WheelOneViewDialog.f38188u0;
        String string = absOtcAdBaseFragment.getString(R$string.pay_otc_publish_online_time);
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        String onlineType = otcAd != null ? otcAd.getOnlineType() : null;
        Map<String, String> mapM44831N4 = absOtcAdBaseFragment.m44831N4();
        ArrayList arrayList = new ArrayList(mapM44831N4.size());
        for (Map.Entry<String, String> entry : mapM44831N4.entrySet()) {
            arrayList.add(new SelectWheelEntity(entry.getKey(), entry.getValue()));
        }
        WheelOneViewDialog wheelOneViewDialogNewInstance = companion.newInstance(string, onlineType, arrayList, new Function1() { // from class: com.kubi.otc.otc.merchant.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsOtcAdBaseFragment.m44723S5(this.f37783b, (SelectWheelEntity) obj);
            }
        });
        FragmentManager childFragmentManager = absOtcAdBaseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        wheelOneViewDialogNewInstance.show(childFragmentManager, "tradeTimeDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S4 */
    public static /* synthetic */ void m44722S4(AbsOtcAdBaseFragment absOtcAdBaseFragment, Action action, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReferencePrice");
        }
        if ((i11 & 1) != 0) {
            action = null;
        }
        absOtcAdBaseFragment.m44835R4(action);
    }

    /* JADX INFO: renamed from: S5 */
    public static final Unit m44723S5(AbsOtcAdBaseFragment absOtcAdBaseFragment, SelectWheelEntity it) {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(it, "it");
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setOnlineType(it.getKey());
        }
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83668M) != null) {
            baseTextView.setText(it.getValue());
        }
        OtcAd otcAd2 = absOtcAdBaseFragment.f37662Y;
        if (C27025c.m66566d(otcAd2 != null ? Boolean.valueOf(otcAd2.isFixTimeType()) : null)) {
            C37601c c37601cM44829L5 = absOtcAdBaseFragment.m44829L4();
            if (c37601cM44829L5 != null && (constraintLayout2 = c37601cM44829L5.f83715q0) != null) {
                C27046k.m66685H(constraintLayout2);
            }
        } else {
            C37601c c37601cM44829L6 = absOtcAdBaseFragment.m44829L4();
            if (c37601cM44829L6 != null && (constraintLayout = c37601cM44829L6.f83715q0) != null) {
                C27046k.m66700o(constraintLayout);
            }
        }
        absOtcAdBaseFragment.m44822F4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T5 */
    public static final Unit m44726T5(final AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        WheelOneViewDialog.Companion companion = WheelOneViewDialog.f38188u0;
        String string = absOtcAdBaseFragment.getString(R$string.pay_otc_publish_online_time_set_zone_title);
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        String onlineTimeZone = otcAd != null ? otcAd.getOnlineTimeZone() : null;
        Map<String, String> mapM44841a5 = absOtcAdBaseFragment.m44841a5();
        ArrayList arrayList = new ArrayList(mapM44841a5.size());
        for (Map.Entry<String, String> entry : mapM44841a5.entrySet()) {
            arrayList.add(new SelectWheelEntity(entry.getKey(), entry.getValue()));
        }
        WheelOneViewDialog wheelOneViewDialogNewInstance = companion.newInstance(string, onlineTimeZone, arrayList, new Function1() { // from class: com.kubi.otc.otc.merchant.a1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsOtcAdBaseFragment.m44729U5(this.f37703b, (SelectWheelEntity) obj);
            }
        });
        FragmentManager childFragmentManager = absOtcAdBaseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        wheelOneViewDialogNewInstance.show(childFragmentManager, "timeZoneDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U5 */
    public static final Unit m44729U5(AbsOtcAdBaseFragment absOtcAdBaseFragment, SelectWheelEntity it) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(it, "it");
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setOnlineTimeZone(it.getKey());
        }
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83677V) != null) {
            baseTextView.setText(it.getValue());
        }
        String key = it.getKey();
        if (key != null) {
            C46392a.m102333p(PaymentStorageId.f40364a.m49838p(), key);
        }
        absOtcAdBaseFragment.m44822F4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V5 */
    public static final Unit m44731V5(final AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        WheelTwoViewDialog wheelTwoViewDialogNewInstance = WheelTwoViewDialog.f38193A0.newInstance(absOtcAdBaseFragment.getString(R$string.pay_otc_publish_online_time_set_up_title), "", "", absOtcAdBaseFragment.m44839Y4(), absOtcAdBaseFragment.m44840Z4(), Boolean.TRUE, new Function2() { // from class: com.kubi.otc.otc.merchant.t0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbsOtcAdBaseFragment.m44733W5(this.f37800b, (SelectWheelEntity) obj, (SelectWheelEntity) obj2);
            }
        });
        FragmentManager childFragmentManager = absOtcAdBaseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        wheelTwoViewDialogNewInstance.show(childFragmentManager, "timeStartDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W5 */
    public static final Unit m44733W5(AbsOtcAdBaseFragment absOtcAdBaseFragment, SelectWheelEntity first, SelectWheelEntity second) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        String str = first.getKey() + ':' + second.getKey();
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setOnlineStartDate(str);
        }
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83704l) != null) {
            baseTextView.setText(str);
        }
        absOtcAdBaseFragment.m44822F4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X5 */
    public static final Unit m44735X5(final AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        WheelTwoViewDialog wheelTwoViewDialogNewInstance = WheelTwoViewDialog.f38193A0.newInstance(absOtcAdBaseFragment.getString(R$string.pay_otc_publish_online_time_set_down_title), "", "", absOtcAdBaseFragment.m44839Y4(), absOtcAdBaseFragment.m44840Z4(), Boolean.TRUE, new Function2() { // from class: com.kubi.otc.otc.merchant.y0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbsOtcAdBaseFragment.m44737Y5(this.f37824b, (SelectWheelEntity) obj, (SelectWheelEntity) obj2);
            }
        });
        FragmentManager childFragmentManager = absOtcAdBaseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        wheelTwoViewDialogNewInstance.show(childFragmentManager, "timeEndDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y5 */
    public static final Unit m44737Y5(AbsOtcAdBaseFragment absOtcAdBaseFragment, SelectWheelEntity first, SelectWheelEntity second) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        String str = first.getKey() + ':' + second.getKey();
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setOnlineEndDate(str);
        }
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83694g) != null) {
            baseTextView.setText(str);
        }
        absOtcAdBaseFragment.m44822F4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z5 */
    public static final Unit m44739Z5(final AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        WheelOneViewDialog.Companion companion = WheelOneViewDialog.f38188u0;
        String string = absOtcAdBaseFragment.getString(R$string.pay_otc_publish_counterparty_id);
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        String adTarget = otcAd != null ? otcAd.getAdTarget() : null;
        Map<String, String> mapM44846f5 = absOtcAdBaseFragment.m44846f5();
        ArrayList arrayList = new ArrayList(mapM44846f5.size());
        for (Map.Entry<String, String> entry : mapM44846f5.entrySet()) {
            arrayList.add(new SelectWheelEntity(entry.getKey(), entry.getValue()));
        }
        WheelOneViewDialog wheelOneViewDialogNewInstance = companion.newInstance(string, adTarget, arrayList, new Function1() { // from class: com.kubi.otc.otc.merchant.r0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsOtcAdBaseFragment.m44741a6(this.f37786b, (SelectWheelEntity) obj);
            }
        });
        FragmentManager childFragmentManager = absOtcAdBaseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        wheelOneViewDialogNewInstance.show(childFragmentManager, "userStatusDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a6 */
    public static final Unit m44741a6(AbsOtcAdBaseFragment absOtcAdBaseFragment, SelectWheelEntity it) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(it, "it");
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setAdTarget(it.getKey());
        }
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83699i0) != null) {
            baseTextView.setText(it.getValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b6 */
    public static final Unit m44743b6(final AbsOtcAdBaseFragment absOtcAdBaseFragment, List list, final List list2) {
        WheelTwoViewDialog.Companion companion = WheelTwoViewDialog.f38193A0;
        String string = absOtcAdBaseFragment.getString(R$string.pay_otc_publish_counterparty_trade_cnt);
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        String legalTradeTimesLimitType = otcAd != null ? otcAd.getLegalTradeTimesLimitType() : null;
        OtcAd otcAd2 = absOtcAdBaseFragment.f37662Y;
        final WheelTwoViewDialog wheelTwoViewDialogNewInstance$default = WheelTwoViewDialog.Companion.newInstance$default(companion, string, legalTradeTimesLimitType, otcAd2 != null ? otcAd2.getLegalTradeTimesLimit() : null, list, list2, null, new Function2() { // from class: com.kubi.otc.otc.merchant.w0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AbsOtcAdBaseFragment.m44745c6(this.f37814b, (SelectWheelEntity) obj, (SelectWheelEntity) obj2);
            }
        }, 32, null);
        wheelTwoViewDialogNewInstance$default.m45612o4(new Function1() { // from class: com.kubi.otc.otc.merchant.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsOtcAdBaseFragment.m44747d6(wheelTwoViewDialogNewInstance$default, list2, (SelectWheelEntity) obj);
            }
        });
        FragmentManager childFragmentManager = absOtcAdBaseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        wheelTwoViewDialogNewInstance$default.show(childFragmentManager, "numSelectDialog");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0092, please report this as an issue */
    /* JADX INFO: renamed from: c6 */
    public static final Unit m44745c6(AbsOtcAdBaseFragment absOtcAdBaseFragment, SelectWheelEntity first, SelectWheelEntity second) {
        BaseTextView baseTextView;
        String stringRes;
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setLegalTradeTimesLimitType(first.getKey());
        }
        OtcAd otcAd2 = absOtcAdBaseFragment.f37662Y;
        if (otcAd2 != null) {
            otcAd2.setLegalTradeTimesLimit(second.getKey());
        }
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83705l0) != null) {
            OtcAd otcAd3 = absOtcAdBaseFragment.f37662Y;
            String legalTradeTimesLimitType = otcAd3 != null ? otcAd3.getLegalTradeTimesLimitType() : null;
            if (legalTradeTimesLimitType == null) {
                stringRes = C27041f.m66668h(first.getValue()) + ' ' + C27041f.m66668h(second.getValue());
            } else {
                int iHashCode = legalTradeTimesLimitType.hashCode();
                if (iHashCode != 3309) {
                    if (iHashCode != 3464) {
                        if (iHashCode == 3387192 && legalTradeTimesLimitType.equals("none")) {
                            stringRes = C27041f.m66668h(first.getValue());
                        } else {
                            stringRes = C27041f.m66668h(first.getValue()) + ' ' + C27041f.m66668h(second.getValue());
                        }
                    } else if (legalTradeTimesLimitType.equals(OtcAd.TRADE_NUM_LT)) {
                        stringRes = absOtcAdBaseFragment.getStringRes(R$string.payment_p2p_ls_number, C27041f.m66668h(second.getKey()));
                    } else {
                        stringRes = C27041f.m66668h(first.getValue()) + ' ' + C27041f.m66668h(second.getValue());
                    }
                } else if (legalTradeTimesLimitType.equals(OtcAd.TRADE_NUM_GT)) {
                    stringRes = absOtcAdBaseFragment.getStringRes(R$string.payment_p2p_gt_number, C27041f.m66668h(second.getKey()));
                } else {
                    stringRes = C27041f.m66668h(first.getValue()) + ' ' + C27041f.m66668h(second.getValue());
                }
            }
            baseTextView.setText(stringRes);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d6 */
    public static final Unit m44747d6(WheelTwoViewDialog wheelTwoViewDialog, List list, SelectWheelEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(it.getKey(), "none")) {
            list = CollectionsKt.listOf(new SelectWheelEntity(null, C33820nf.f71144W, 1, null));
        }
        wheelTwoViewDialog.m45611n4(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e6 */
    public static final Unit m44749e6(AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        String string = absOtcAdBaseFragment.getString(R$string.pay_otc_publish_trading_time_limit_tip);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        absOtcAdBaseFragment.m44823F6(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f6 */
    public static final Unit m44751f6(AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        String string = absOtcAdBaseFragment.getString(R$string.pay_otc_publish_online_time_tip);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        absOtcAdBaseFragment.m44823F6(string);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i5 */
    public static final Unit m44757i5(AbsOtcAdBaseFragment absOtcAdBaseFragment, CharSequence charSequence) {
        BaseTextView baseTextView;
        BigDecimal premium;
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setPremium(C38346y.m86490A(charSequence.toString()));
        }
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83707m0) != null) {
            OtcAd otcAd2 = absOtcAdBaseFragment.f37662Y;
            String strM66668h = C27041f.m66668h((otcAd2 == null || (premium = otcAd2.getPremium()) == null) ? null : premium.toPlainString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            OtcAd otcAd3 = absOtcAdBaseFragment.f37662Y;
            sb2.append(C27041f.m66668h(otcAd3 != null ? otcAd3.getLegal() : null));
            String string = sb2.toString();
            int i11 = R$color.primary;
            baseTextView.setText(absOtcAdBaseFragment.m44836V4(strM66668h, string, i11, i11));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k5 */
    public static final Unit m44762k5(AbsOtcAdBaseFragment absOtcAdBaseFragment, CharSequence charSequence) {
        EditTextWithTitleView editTextWithTitleView;
        EditTextWithTitleView editTextWithTitleView2;
        BaseTextView baseTextView;
        BigDecimal bigDecimalM86490A = C38346y.m86490A(charSequence.toString());
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setPremium(bigDecimalM86490A.subtract(new BigDecimal("100.00")));
        }
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83707m0) != null) {
            BigDecimal bigDecimalMultiply = bigDecimalM86490A.divide(new BigDecimal("100.00")).multiply(C38346y.m86490A(absOtcAdBaseFragment.f37664a0));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            String strM89946t = C41014a.m89946t(bigDecimalMultiply, null, 0, false, false, false, false, false, null, 0, FrameMetricsAggregator.EVERY_DURATION, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            OtcAd otcAd2 = absOtcAdBaseFragment.f37662Y;
            sb2.append(C27041f.m66668h(otcAd2 != null ? otcAd2.getLegal() : null));
            String string = sb2.toString();
            int i11 = R$color.primary;
            baseTextView.setText(absOtcAdBaseFragment.m44836V4(strM89946t, string, i11, i11));
        }
        double d11 = 100;
        OtcSymbol otcSymbol = absOtcAdBaseFragment.f37663Z;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d11 - C27039d.m66647g(otcSymbol != null ? otcSymbol.getFloatPercent() : null)));
        OtcSymbol otcSymbol2 = absOtcAdBaseFragment.f37663Z;
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(d11 + C27039d.m66647g(otcSymbol2 != null ? otcSymbol2.getFloatPercent() : null)));
        if (C27039d.m66645e(bigDecimalM86490A, bigDecimal, bigDecimal2)) {
            absOtcAdBaseFragment.f37668e0 = true;
            C37601c c37601cM44829L5 = absOtcAdBaseFragment.m44829L4();
            if (c37601cM44829L5 != null && (editTextWithTitleView2 = c37601cM44829L5.f83702k) != null) {
                editTextWithTitleView2.m45497a();
            }
        } else {
            absOtcAdBaseFragment.f37668e0 = false;
            C37601c c37601cM44829L6 = absOtcAdBaseFragment.m44829L4();
            if (c37601cM44829L6 != null && (editTextWithTitleView = c37601cM44829L6.f83702k) != null) {
                editTextWithTitleView.m45499c(absOtcAdBaseFragment.getString(R$string.float_rate_tip, C41014a.m89946t(bigDecimal, null, 0, false, true, false, false, false, null, 0, 503, null) + " - " + C41014a.m89946t(bigDecimal2, null, 0, false, true, false, false, false, null, 0, 503, null)));
            }
        }
        absOtcAdBaseFragment.m44822F4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k6 */
    public static /* synthetic */ void m44763k6(AbsOtcAdBaseFragment absOtcAdBaseFragment, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initPrice");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        absOtcAdBaseFragment.m44850j6(z11);
    }

    /* JADX INFO: renamed from: m5 */
    public static final Unit m44770m5(AbsOtcAdBaseFragment absOtcAdBaseFragment, EditTextWithTitleView editTextWithTitleView, CharSequence charSequence) {
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setLimitPrice(editTextWithTitleView.getNumber());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s6 */
    public static final Map m44791s6(AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        return MapsKt.mapOf(new Pair("0", absOtcAdBaseFragment.getString(R$string.pay_otc_publish_online_time_all_day)), new Pair("1", absOtcAdBaseFragment.getString(R$string.pay_otc_publish_online_time_set)));
    }

    /* JADX INFO: renamed from: v6 */
    public static final Unit m44802v6(final AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        C37304a c37304a = C37304a.f82764a;
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        String strM66668h = C27041f.m66668h(otcAd != null ? otcAd.getCurrency() : null);
        OtcAd otcAd2 = absOtcAdBaseFragment.f37662Y;
        InterfaceC37749a.a.m85115j(c37304a, "fast_sell", strM66668h, C27041f.m66668h(otcAd2 != null ? otcAd2.getLegal() : null), C27041f.m66668h(absOtcAdBaseFragment.f37666c0), null, null, null, new InterfaceC36555b() { // from class: com.kubi.otc.otc.merchant.p1
            @Override // cy.InterfaceC36555b
            /* JADX INFO: renamed from: a */
            public final void mo4404a(int i11, Intent intent) {
                AbsOtcAdBaseFragment.m44806w6(this.f37780a, i11, intent);
            }
        }, 112, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x6 */
    public static final Unit m44810x6(final AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        C37304a c37304a = C37304a.f82764a;
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        String strM66668h = C27041f.m66668h(otcAd != null ? otcAd.getCurrency() : null);
        OtcAd otcAd2 = absOtcAdBaseFragment.f37662Y;
        InterfaceC37749a.a.m85116k(c37304a, "fast_sell", strM66668h, C27041f.m66668h(otcAd2 != null ? otcAd2.getLegal() : null), "MAIN", C27041f.m66668h(absOtcAdBaseFragment.f37666c0), null, null, null, new InterfaceC36555b() { // from class: com.kubi.otc.otc.merchant.n1
            @Override // cy.InterfaceC36555b
            /* JADX INFO: renamed from: a */
            public final void mo4404a(int i11, Intent intent) {
                AbsOtcAdBaseFragment.m44814y6(this.f37769a, i11, intent);
            }
        }, 224, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y5 */
    public static final Integer m44813y5(AbsOtcAdBaseFragment absOtcAdBaseFragment, CharSequence it) {
        String remarks;
        Intrinsics.checkNotNullParameter(it, "it");
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        if (otcAd != null) {
            otcAd.setRemarks(StringsKt.trim((CharSequence) it.toString()).toString());
        }
        OtcAd otcAd2 = absOtcAdBaseFragment.f37662Y;
        return Integer.valueOf(C27039d.m66650j((otcAd2 == null || (remarks = otcAd2.getRemarks()) == null) ? null : Integer.valueOf(remarks.length())));
    }

    /* JADX INFO: renamed from: z5 */
    public static final Integer m44817z5(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (Integer) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: A6 */
    public final void m44818A6() {
        m44835R4(new Action() { // from class: com.kubi.otc.otc.merchant.i1
            @Override // io.reactivex.functions.Action
            public final void run() {
                AbsOtcAdBaseFragment.m44677B6(this.f37740b);
            }
        });
    }

    /* JADX INFO: renamed from: C6 */
    public final void m44819C6() {
        EditTextWithTitleView editTextWithTitleView;
        EditText editText;
        EditTextWithTitleView editTextWithTitleView2;
        EditText editText2;
        EditTextWithTitleView editTextWithTitleView3;
        EditText editText3;
        EditTextWithTitleView editTextWithTitleView4;
        EditText editText4;
        OtcSymbol otcSymbol = this.f37663Z;
        int iM66651k = C27039d.m66651k(otcSymbol != null ? otcSymbol.getLegalPrecision() : null, 2);
        C37601c c37601cM44829L4 = m44829L4();
        if (c37601cM44829L4 != null && (editTextWithTitleView4 = c37601cM44829L4.f83696h) != null && (editText4 = editTextWithTitleView4.getEditText()) != null) {
            editText4.setFilters(new C27056j0[]{new C27056j0(iM66651k)});
        }
        C37601c c37601cM44829L5 = m44829L4();
        if (c37601cM44829L5 != null && (editTextWithTitleView3 = c37601cM44829L5.f83700j) != null && (editText3 = editTextWithTitleView3.getEditText()) != null) {
            editText3.setFilters(new C27056j0[]{new C27056j0(iM66651k)});
            Editable text = editText3.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            if (text.length() > 0) {
                editText3.setText(editText3.getText());
            }
        }
        C37601c c37601cM44829L6 = m44829L4();
        if (c37601cM44829L6 != null && (editTextWithTitleView2 = c37601cM44829L6.f83698i) != null && (editText2 = editTextWithTitleView2.getEditText()) != null) {
            editText2.setFilters(new C27056j0[]{new C27056j0(iM66651k)});
            Editable text2 = editText2.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
            if (text2.length() > 0) {
                editText2.setText(editText2.getText());
            }
        }
        C37601c c37601cM44829L7 = m44829L4();
        if (c37601cM44829L7 == null || (editTextWithTitleView = c37601cM44829L7.f83692f) == null || (editText = editTextWithTitleView.getEditText()) == null) {
            return;
        }
        editText.setFilters(new C27056j0[]{new C27056j0(iM66651k)});
        Editable text3 = editText.getText();
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        if (text3.length() > 0) {
            editText.setText(editText.getText());
        }
    }

    /* JADX INFO: renamed from: D6 */
    public final void m44820D6(@Nullable OtcAd otcAd) {
        this.f37662Y = otcAd;
    }

    /* JADX INFO: renamed from: E6 */
    public final void m44821E6(@Nullable OtcSymbol otcSymbol) {
        this.f37663Z = otcSymbol;
    }

    /* JADX INFO: renamed from: F6 */
    public final void m44823F6(String str) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.note).m54156M4(str).m54162S4(R$string.i_already_know, null).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: J4 */
    public final boolean m44827J4() {
        OtcAd otcAd = this.f37662Y;
        List<String> payTypeIds = otcAd != null ? otcAd.getPayTypeIds() : null;
        boolean z11 = payTypeIds == null || payTypeIds.isEmpty();
        boolean z12 = !z11;
        if (z11) {
            ToastCompat.m66437C(R$string.payment_ad_select_paytype);
        }
        return z12;
    }

    @Nullable
    /* JADX INFO: renamed from: L4 */
    public final C37601c m44829L4() {
        return (C37601c) this.f37677n0.getValue(this, f37657r0[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: M4 */
    public final ArrayList<String> m44830M4() {
        return (ArrayList) this.f37659V.getValue();
    }

    /* JADX INFO: renamed from: N4 */
    public final Map<String, String> m44831N4() {
        return (Map) this.f37670g0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: O4, reason: from getter */
    public final OtcAd getF37662Y() {
        return this.f37662Y;
    }

    @NotNull
    /* JADX INFO: renamed from: P4 */
    public final InterfaceC37241c m44833P4() {
        Object value = this.f37658U.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (InterfaceC37241c) value;
    }

    @NotNull
    /* JADX INFO: renamed from: Q4 */
    public HashMap<String, Object> mo44834Q4() {
        EditTextWithTitleView editTextWithTitleView;
        HashMap<String, Object> map = new HashMap<>();
        OtcAd otcAd = this.f37662Y;
        map.put("id", C27041f.m66668h(otcAd != null ? otcAd.getId() : null));
        OtcAd otcAd2 = this.f37662Y;
        map.put("priceType", C27041f.m66668h(otcAd2 != null ? otcAd2.getPriceType() : null));
        OtcAd otcAd3 = this.f37662Y;
        map.put("premium", C41014a.m89922G(otcAd3 != null ? otcAd3.getPremium() : null, null, 1, null));
        OtcAd otcAd4 = this.f37662Y;
        map.put("limitMinQuote", C41014a.m89922G(otcAd4 != null ? otcAd4.getLimitMinQuote() : null, null, 1, null));
        OtcAd otcAd5 = this.f37662Y;
        map.put("limitMaxQuote", C41014a.m89922G(otcAd5 != null ? otcAd5.getLimitMaxQuote() : null, null, 1, null));
        OtcAd otcAd6 = this.f37662Y;
        map.put("payTypeIds", C27041f.m66668h(otcAd6 != null ? otcAd6.getPayTypeParam() : null));
        OtcAd otcAd7 = this.f37662Y;
        map.put("remarks", C27041f.m66668h(otcAd7 != null ? otcAd7.getRemarks() : null));
        OtcAd otcAd8 = this.f37662Y;
        map.put("adTarget", C27041f.m66668h(otcAd8 != null ? otcAd8.getAdTarget() : null));
        OtcAd otcAd9 = this.f37662Y;
        map.put("tradeTimeLimit", C27041f.m66668h(otcAd9 != null ? otcAd9.getTradeTimeLimit() : null));
        OtcAd otcAd10 = this.f37662Y;
        map.put("onlineType", C27041f.m66668h(otcAd10 != null ? otcAd10.getOnlineType() : null));
        OtcAd otcAd11 = this.f37662Y;
        if (C27025c.m66566d(otcAd11 != null ? Boolean.valueOf(otcAd11.isFixTimeType()) : null)) {
            OtcAd otcAd12 = this.f37662Y;
            map.put("onlineTimeZone", C27041f.m66668h(otcAd12 != null ? otcAd12.getOnlineTimeZone() : null));
            OtcAd otcAd13 = this.f37662Y;
            map.put("onlineStartDate", C27041f.m66668h(otcAd13 != null ? otcAd13.getOnlineStartDate() : null));
            OtcAd otcAd14 = this.f37662Y;
            map.put("onlineEndDate", C27041f.m66668h(otcAd14 != null ? otcAd14.getOnlineEndDate() : null));
        }
        OtcAd otcAd15 = this.f37662Y;
        map.put("legalTradeTimesLimitType", C27041f.m66668h(otcAd15 != null ? otcAd15.getLegalTradeTimesLimitType() : null));
        OtcAd otcAd16 = this.f37662Y;
        map.put("legalTradeTimesLimit", C27041f.m66668h(otcAd16 != null ? otcAd16.getLegalTradeTimesLimit() : null));
        OtcAd otcAd17 = this.f37662Y;
        if (C27025c.m66566d(otcAd17 != null ? Boolean.valueOf(otcAd17.isFloatType()) : null)) {
            C37601c c37601cM44829L4 = m44829L4();
            if (!C27025c.m66566d((c37601cM44829L4 == null || (editTextWithTitleView = c37601cM44829L4.f83692f) == null) ? null : Boolean.valueOf(editTextWithTitleView.m45498b()))) {
                OtcAd otcAd18 = this.f37662Y;
                map.put("limitPrice", C41014a.m89922G(otcAd18 != null ? otcAd18.getLimitPrice() : null, null, 1, null));
            }
        }
        return map;
    }

    @NotNull
    /* JADX INFO: renamed from: V4 */
    public final SpannableString m44836V4(@NotNull String front, @NotNull String behind, int i11, int i12) {
        Intrinsics.checkNotNullParameter(front, "front");
        Intrinsics.checkNotNullParameter(behind, "behind");
        SpannableString spannableString = new SpannableString(front + behind);
        spannableString.setSpan(new ForegroundColorSpan(getColorRes(i11)), 0, front.length(), 17);
        spannableString.setSpan(new ForegroundColorSpan(getColorRes(i12)), front.length(), spannableString.length(), 17);
        spannableString.setSpan(new RelativeSizeSpan(0.66f), front.length(), spannableString.length(), 17);
        return spannableString;
    }

    @Nullable
    /* JADX INFO: renamed from: W4, reason: from getter */
    public final OtcSymbol getF37663Z() {
        return this.f37663Z;
    }

    @Nullable
    /* JADX INFO: renamed from: X4 */
    public final ArrayList<OtcSymbol> m44838X4() {
        return this.f37660W;
    }

    /* JADX INFO: renamed from: Y4 */
    public final List<SelectWheelEntity> m44839Y4() {
        return (List) this.f37672i0.getValue();
    }

    /* JADX INFO: renamed from: Z4 */
    public final List<SelectWheelEntity> m44840Z4() {
        return (List) this.f37673j0.getValue();
    }

    /* JADX INFO: renamed from: a5 */
    public final Map<String, String> m44841a5() {
        return (Map) this.f37671h0.getValue();
    }

    /* JADX INFO: renamed from: b5 */
    public final Map<String, String> m44842b5() {
        return (Map) this.f37675l0.getValue();
    }

    /* JADX INFO: renamed from: c5 */
    public final Map<String, String> m44843c5() {
        return (Map) this.f37676m0.getValue();
    }

    /* JADX INFO: renamed from: d5 */
    public final Map<String, String> m44844d5() {
        return (Map) this.f37669f0.getValue();
    }

    /* JADX INFO: renamed from: e5 */
    public final boolean m44845e5() {
        return ((Boolean) this.f37678o0.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f5 */
    public final Map<String, String> m44846f5() {
        return (Map) this.f37674k0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_ad;
    }

    /* JADX INFO: renamed from: j6 */
    public final void m44850j6(boolean z11) {
        String strValueOf;
        BigDecimal premium;
        String strM66668h;
        BigDecimal floatPrice;
        BaseTextView baseTextView;
        EditTextWithTitleView editTextWithTitleView;
        BaseTextView baseTextView2;
        ConstraintLayout constraintLayout;
        EditTextWithTitleView editTextWithTitleView2;
        String strM66668h2;
        BigDecimal premium2;
        BaseTextView baseTextView3;
        EditTextWithTitleView editTextWithTitleView3;
        BaseTextView baseTextView4;
        ConstraintLayout constraintLayout2;
        EditTextWithTitleView editTextWithTitleView4;
        OtcAd otcAd = this.f37662Y;
        String priceType = otcAd != null ? otcAd.getPriceType() : null;
        if (Intrinsics.areEqual(priceType, "REGULAR")) {
            C37601c c37601cM44829L4 = m44829L4();
            if (c37601cM44829L4 != null && (editTextWithTitleView4 = c37601cM44829L4.f83696h) != null) {
                C27046k.m66685H(editTextWithTitleView4);
            }
            C37601c c37601cM44829L5 = m44829L4();
            if (c37601cM44829L5 != null && (constraintLayout2 = c37601cM44829L5.f83716r) != null) {
                C27046k.m66700o(constraintLayout2);
            }
            C37601c c37601cM44829L6 = m44829L4();
            if (c37601cM44829L6 != null && (baseTextView4 = c37601cM44829L6.f83672Q) != null) {
                baseTextView4.setText(R$string.price_fixed);
            }
            if (z11) {
                strM66668h2 = C27041f.m66668h(this.f37664a0);
            } else {
                OtcAd otcAd2 = this.f37662Y;
                strM66668h2 = C27041f.m66668h((otcAd2 == null || (premium2 = otcAd2.getPremium()) == null) ? null : premium2.toPlainString());
            }
            C37601c c37601cM44829L7 = m44829L4();
            if (c37601cM44829L7 != null && (editTextWithTitleView3 = c37601cM44829L7.f83696h) != null) {
                editTextWithTitleView3.setContent(strM66668h2);
            }
            C37601c c37601cM44829L8 = m44829L4();
            if (c37601cM44829L8 != null && (baseTextView3 = c37601cM44829L8.f83707m0) != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(' ');
                OtcAd otcAd3 = this.f37662Y;
                sb2.append(C27041f.m66668h(otcAd3 != null ? otcAd3.getLegal() : null));
                String string = sb2.toString();
                int i11 = R$color.primary;
                baseTextView3.setText(m44836V4(strM66668h2, string, i11, i11));
            }
        } else if (Intrinsics.areEqual(priceType, "FLOAT")) {
            C37601c c37601cM44829L9 = m44829L4();
            if (c37601cM44829L9 != null && (editTextWithTitleView2 = c37601cM44829L9.f83696h) != null) {
                C27046k.m66700o(editTextWithTitleView2);
            }
            C37601c c37601cM44829L10 = m44829L4();
            if (c37601cM44829L10 != null && (constraintLayout = c37601cM44829L10.f83716r) != null) {
                C27046k.m66685H(constraintLayout);
            }
            C37601c c37601cM44829L11 = m44829L4();
            if (c37601cM44829L11 != null && (baseTextView2 = c37601cM44829L11.f83672Q) != null) {
                baseTextView2.setText(R$string.price_float);
            }
            if (z11) {
                strValueOf = "100.00";
            } else {
                double d11 = 100;
                OtcAd otcAd4 = this.f37662Y;
                strValueOf = String.valueOf(d11 + C27039d.m66646f((otcAd4 == null || (premium = otcAd4.getPremium()) == null) ? null : Double.valueOf(premium.doubleValue())));
            }
            if (z11) {
                strM66668h = C27041f.m66668h(this.f37664a0);
            } else {
                OtcAd otcAd5 = this.f37662Y;
                strM66668h = C27041f.m66668h((otcAd5 == null || (floatPrice = otcAd5.getFloatPrice()) == null) ? null : floatPrice.toPlainString());
            }
            C37601c c37601cM44829L12 = m44829L4();
            if (c37601cM44829L12 != null && (editTextWithTitleView = c37601cM44829L12.f83702k) != null) {
                editTextWithTitleView.setContent(strValueOf);
            }
            C37601c c37601cM44829L13 = m44829L4();
            if (c37601cM44829L13 != null && (baseTextView = c37601cM44829L13.f83707m0) != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(' ');
                OtcAd otcAd6 = this.f37662Y;
                sb3.append(C27041f.m66668h(otcAd6 != null ? otcAd6.getLegal() : null));
                String string2 = sb3.toString();
                int i12 = R$color.primary;
                baseTextView.setText(m44836V4(strM66668h, string2, i12, i12));
            }
        }
        m44822F4();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m44848h5();
    }

    /* JADX INFO: renamed from: q6 */
    public final void m44853q6() {
        BaseTextView baseTextView;
        String stringRes;
        ArrayList<AdPayType> adPayTypes;
        ArrayList arrayList;
        ArrayList<AdPayType> adPayTypes2;
        OtcAd otcAd = this.f37662Y;
        Integer numValueOf = null;
        if (otcAd != null) {
            if (otcAd == null || (adPayTypes2 = otcAd.getAdPayTypes()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(adPayTypes2, 10));
                Iterator<T> it = adPayTypes2.iterator();
                while (it.hasNext()) {
                    arrayList.add(C27041f.m66668h(((AdPayType) it.next()).getId()));
                }
            }
            otcAd.setPayTypeIds(arrayList);
        }
        C37601c c37601cM44829L4 = m44829L4();
        if (c37601cM44829L4 == null || (baseTextView = c37601cM44829L4.f83720t) == null) {
            return;
        }
        OtcAd otcAd2 = this.f37662Y;
        ArrayList<AdPayType> adPayTypes3 = otcAd2 != null ? otcAd2.getAdPayTypes() : null;
        if (adPayTypes3 == null || adPayTypes3.isEmpty()) {
            stringRes = getStringRes(R$string.payment_p2p_select_pay_type, new Object[0]);
        } else {
            int i11 = R$string.payment_p2p_select_pay_numbers;
            OtcAd otcAd3 = this.f37662Y;
            if (otcAd3 != null && (adPayTypes = otcAd3.getAdPayTypes()) != null) {
                numValueOf = Integer.valueOf(adPayTypes.size());
            }
            stringRes = getStringRes(i11, String.valueOf(numValueOf));
        }
        baseTextView.setText(stringRes);
    }

    /* JADX INFO: renamed from: r6 */
    public void mo44854r6() {
        BaseTextView baseTextView;
        EditTextWithTitleView editTextWithTitleView;
        BaseTextView baseTextView2;
        AppCompatImageView appCompatImageView;
        Group group;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        EditTextWithTitleView editTextWithTitleView2;
        BaseTextView baseTextView8;
        Group group2;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        OtcAd otcAd = this.f37662Y;
        if (C27025c.m66566d(otcAd != null ? Boolean.valueOf(otcAd.isBuy()) : null)) {
            C37601c c37601cM44829L4 = m44829L4();
            if (c37601cM44829L4 != null && (baseTextView11 = c37601cM44829L4.f83659D) != null) {
                baseTextView11.setSelected(true);
            }
            C37601c c37601cM44829L5 = m44829L4();
            if (c37601cM44829L5 != null && (baseTextView10 = c37601cM44829L5.f83678W) != null) {
                baseTextView10.setSelected(false);
            }
            C37601c c37601cM44829L6 = m44829L4();
            if (c37601cM44829L6 != null && (baseTextView9 = c37601cM44829L6.f83732z) != null) {
                C27046k.m66700o(baseTextView9);
            }
            C37601c c37601cM44829L7 = m44829L4();
            if (c37601cM44829L7 != null && (group2 = c37601cM44829L7.f83684b) != null) {
                C27046k.m66700o(group2);
            }
            C37601c c37601cM44829L8 = m44829L4();
            if (c37601cM44829L8 != null && (baseTextView8 = c37601cM44829L8.f83671P) != null) {
                baseTextView8.setText(getString(R$string.price_setting_buy));
            }
            C37601c c37601cM44829L9 = m44829L4();
            if (c37601cM44829L9 != null && (editTextWithTitleView2 = c37601cM44829L9.f83692f) != null) {
                editTextWithTitleView2.setTitle(getString(R$string.accept_highest_price));
            }
            C37601c c37601cM44829L10 = m44829L4();
            if (c37601cM44829L10 != null && (baseTextView7 = c37601cM44829L10.f83670O) != null) {
                baseTextView7.setText(getString(R$string.payment_method));
            }
            C37601c c37601cM44829L11 = m44829L4();
            if (c37601cM44829L11 != null && (baseTextView6 = c37601cM44829L11.f83680Y) != null) {
                C27046k.m66700o(baseTextView6);
            }
        } else {
            C37601c c37601cM44829L12 = m44829L4();
            if (c37601cM44829L12 != null && (baseTextView5 = c37601cM44829L12.f83659D) != null) {
                baseTextView5.setSelected(false);
            }
            C37601c c37601cM44829L13 = m44829L4();
            if (c37601cM44829L13 != null && (baseTextView4 = c37601cM44829L13.f83678W) != null) {
                baseTextView4.setSelected(true);
            }
            C37601c c37601cM44829L14 = m44829L4();
            if (c37601cM44829L14 != null && (baseTextView3 = c37601cM44829L14.f83732z) != null) {
                C27046k.m66685H(baseTextView3);
            }
            C37601c c37601cM44829L15 = m44829L4();
            if (c37601cM44829L15 != null && (group = c37601cM44829L15.f83684b) != null) {
                C27046k.m66685H(group);
            }
            C37601c c37601cM44829L16 = m44829L4();
            if (c37601cM44829L16 != null && (appCompatImageView = c37601cM44829L16.f83706m) != null) {
                appCompatImageView.setVisibility(C21457l.m49860h(m44845e5()));
            }
            C37601c c37601cM44829L17 = m44829L4();
            if (c37601cM44829L17 != null && (baseTextView2 = c37601cM44829L17.f83671P) != null) {
                baseTextView2.setText(getString(R$string.price_setting_sell));
            }
            C37601c c37601cM44829L18 = m44829L4();
            if (c37601cM44829L18 != null && (editTextWithTitleView = c37601cM44829L18.f83692f) != null) {
                editTextWithTitleView.setTitle(getString(R$string.accept_lowest_price));
            }
            C37601c c37601cM44829L19 = m44829L4();
            if (c37601cM44829L19 != null && (baseTextView = c37601cM44829L19.f83670O) != null) {
                baseTextView.setText(getString(R$string.receive_method_stub));
            }
            m44847g5();
        }
        mo44824G4();
    }

    /* JADX INFO: renamed from: z6 */
    public final void m44856z6() {
        FilterEmojiEditText filterEmojiEditText;
        OtcSymbol otcSymbol = this.f37663Z;
        Boolean boolValueOf = null;
        int iM66651k = C27039d.m66651k(otcSymbol != null ? Integer.valueOf(otcSymbol.getCurrencyPrecision()) : null, 8);
        C37601c c37601cM44829L4 = m44829L4();
        if (c37601cM44829L4 == null || (filterEmojiEditText = c37601cM44829L4.f83688d) == null) {
            return;
        }
        filterEmojiEditText.setFilters(new C27056j0[]{new C27056j0(iM66651k)});
        Editable text = filterEmojiEditText.getText();
        if (text != null) {
            boolValueOf = Boolean.valueOf(text.length() > 0);
        }
        if (C27025c.m66566d(boolValueOf)) {
            filterEmojiEditText.setText(filterEmojiEditText.getText());
        }
    }

    public AbsOtcAdBaseFragment() {
        setPageId("B7P2PPostAdvertisements");
    }

    /* JADX INFO: renamed from: B5 */
    public static final void m44676B5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F5 */
    public static final void m44688F5(AbsOtcAdBaseFragment absOtcAdBaseFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) {
        String currency;
        OtcSymbol otcSymbol;
        ArrayList<String> supportPriceTypes;
        OtcSymbol otcSymbolPrevious;
        String value = interfaceC24339a.getValue();
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        String str = null;
        if (otcAd != null) {
            currency = otcAd.getCurrency();
        } else {
            currency = null;
        }
        if (Intrinsics.areEqual(value, currency)) {
            return;
        }
        OtcAd otcAd2 = absOtcAdBaseFragment.f37662Y;
        if (otcAd2 != null) {
            otcAd2.setCurrency(interfaceC24339a.getValue());
        }
        ArrayList<OtcSymbol> arrayList = absOtcAdBaseFragment.f37660W;
        if (arrayList != null) {
            ListIterator<OtcSymbol> listIterator = arrayList.listIterator(arrayList.size());
            do {
                if (listIterator.hasPrevious()) {
                    otcSymbolPrevious = listIterator.previous();
                } else {
                    otcSymbolPrevious = null;
                    break;
                }
            } while (!Intrinsics.areEqual(otcSymbolPrevious.getCurrency(), interfaceC24339a.getValue()));
            otcSymbol = otcSymbolPrevious;
        } else {
            otcSymbol = null;
        }
        absOtcAdBaseFragment.f37663Z = otcSymbol;
        OtcAd otcAd3 = absOtcAdBaseFragment.f37662Y;
        if (otcAd3 != null) {
            if (otcSymbol != null && (supportPriceTypes = otcSymbol.getSupportPriceTypes()) != null) {
                str = supportPriceTypes.get(0);
            }
            otcAd3.setPriceType(str);
        }
        absOtcAdBaseFragment.m44856z6();
        absOtcAdBaseFragment.m44851m6();
        absOtcAdBaseFragment.m44818A6();
    }

    /* JADX INFO: renamed from: H5 */
    public static final void m44693H5(final AbsOtcAdBaseFragment absOtcAdBaseFragment, BaseViewHolder baseViewHolder, BottomSheetDialogHelper.InterfaceC24339a interfaceC24339a) throws Exception {
        String legal;
        String value = interfaceC24339a.getValue();
        OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
        String legal2 = null;
        if (otcAd != null) {
            legal = otcAd.getLegal();
        } else {
            legal = null;
        }
        if (Intrinsics.areEqual(value, legal)) {
            return;
        }
        OtcAd otcAd2 = absOtcAdBaseFragment.f37662Y;
        if (otcAd2 != null) {
            otcAd2.setLegal(interfaceC24339a.getValue());
        }
        absOtcAdBaseFragment.m44852p6();
        OtcAd otcAd3 = absOtcAdBaseFragment.f37662Y;
        if (otcAd3 != null) {
            legal2 = otcAd3.getLegal();
        }
        C38346y.m86538y(absOtcAdBaseFragment, C27041f.m66668h(legal2), new Consumer() { // from class: com.kubi.otc.otc.merchant.e1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbsOtcAdBaseFragment.m44696I5(this.f37723b, (ArrayList) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M5 */
    public static final Unit m44708M5(AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        FilterEmojiEditText filterEmojiEditText;
        FilterEmojiEditText filterEmojiEditText2;
        Editable text;
        FilterEmojiEditText filterEmojiEditText3;
        String strM85569h;
        String currency;
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        Integer numValueOf = null;
        if (c37601cM44829L4 != null && (filterEmojiEditText3 = c37601cM44829L4.f83688d) != null) {
            String str = absOtcAdBaseFragment.f37665b0;
            if (str != null) {
                OtcAd otcAd = absOtcAdBaseFragment.f37662Y;
                if (otcAd != null) {
                    currency = otcAd.getCurrency();
                } else {
                    currency = null;
                }
                strM85569h = C37885i.m85569h(str, currency, (126 & 2) != 0 ? RoundingMode.DOWN : null, (126 & 4) != 0 ? false : false, (126 & 8) != 0 ? false : false, (126 & 16) == 0 ? false : false, (126 & 32) != 0, (126 & 64) != 0 ? "0.00" : null);
            } else {
                strM85569h = null;
            }
            filterEmojiEditText3.setText(C27041f.m66668h(strM85569h));
        }
        C37601c c37601cM44829L5 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L5 != null && (filterEmojiEditText = c37601cM44829L5.f83688d) != null) {
            C37601c c37601cM44829L6 = absOtcAdBaseFragment.m44829L4();
            if (c37601cM44829L6 != null && (filterEmojiEditText2 = c37601cM44829L6.f83688d) != null && (text = filterEmojiEditText2.getText()) != null) {
                numValueOf = Integer.valueOf(text.length());
            }
            filterEmojiEditText.setSelection(C27039d.m66650j(numValueOf));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U4 */
    public static final void m44728U4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g6 */
    private final void m44753g6() {
        ArrayList<OtcSymbol> parcelableArrayList;
        Boolean boolValueOf;
        ConstraintLayout constraintLayout;
        BaseTextView baseTextView;
        String legalTradeTimesLimitType;
        String legalTradeTimesLimitType2;
        String string;
        BaseTextView baseTextView2;
        String adTarget;
        BaseTextView baseTextView3;
        String onlineEndDate;
        BaseTextView baseTextView4;
        String onlineStartDate;
        BaseTextView baseTextView5;
        String onlineTimeZone;
        ConstraintLayout constraintLayout2;
        BaseTextView baseTextView6;
        String onlineType;
        BaseTextView baseTextView7;
        String tradeTimeLimit;
        Bundle arguments = getArguments();
        String legalTradeTimesLimit = null;
        if (arguments != null) {
            parcelableArrayList = arguments.getParcelableArrayList("symbols");
        } else {
            parcelableArrayList = null;
        }
        this.f37660W = parcelableArrayList;
        initView();
        m44849i6();
        m44763k6(this, false, 1, null);
        mo44854r6();
        m44852p6();
        m44851m6();
        C37601c c37601cM44829L4 = m44829L4();
        if (c37601cM44829L4 != null && (baseTextView7 = c37601cM44829L4.f83687c0) != null) {
            Map<String, String> mapM44844d5 = m44844d5();
            OtcAd otcAd = this.f37662Y;
            if (otcAd != null) {
                tradeTimeLimit = otcAd.getTradeTimeLimit();
            } else {
                tradeTimeLimit = null;
            }
            baseTextView7.setText(C27041f.m66668h(mapM44844d5.get(C27041f.m66668h(tradeTimeLimit))));
        }
        C37601c c37601cM44829L5 = m44829L4();
        if (c37601cM44829L5 != null && (baseTextView6 = c37601cM44829L5.f83668M) != null) {
            Map<String, String> mapM44831N4 = m44831N4();
            OtcAd otcAd2 = this.f37662Y;
            if (otcAd2 != null) {
                onlineType = otcAd2.getOnlineType();
            } else {
                onlineType = null;
            }
            baseTextView6.setText(C27041f.m66668h(mapM44831N4.get(C27041f.m66668h(onlineType))));
        }
        OtcAd otcAd3 = this.f37662Y;
        if (otcAd3 != null) {
            boolValueOf = Boolean.valueOf(otcAd3.isFixTimeType());
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            C37601c c37601cM44829L6 = m44829L4();
            if (c37601cM44829L6 != null && (constraintLayout2 = c37601cM44829L6.f83715q0) != null) {
                C27046k.m66685H(constraintLayout2);
            }
        } else {
            C37601c c37601cM44829L7 = m44829L4();
            if (c37601cM44829L7 != null && (constraintLayout = c37601cM44829L7.f83715q0) != null) {
                C27046k.m66700o(constraintLayout);
            }
        }
        C37601c c37601cM44829L8 = m44829L4();
        if (c37601cM44829L8 != null && (baseTextView5 = c37601cM44829L8.f83677V) != null) {
            Map<String, String> mapM44841a5 = m44841a5();
            OtcAd otcAd4 = this.f37662Y;
            if (otcAd4 != null) {
                onlineTimeZone = otcAd4.getOnlineTimeZone();
            } else {
                onlineTimeZone = null;
            }
            baseTextView5.setText(C27041f.m66668h(mapM44841a5.get(C27041f.m66668h(onlineTimeZone))));
        }
        C37601c c37601cM44829L9 = m44829L4();
        if (c37601cM44829L9 != null && (baseTextView4 = c37601cM44829L9.f83704l) != null) {
            OtcAd otcAd5 = this.f37662Y;
            if (otcAd5 != null) {
                onlineStartDate = otcAd5.getOnlineStartDate();
            } else {
                onlineStartDate = null;
            }
            baseTextView4.setText(C27041f.m66668h(onlineStartDate));
        }
        C37601c c37601cM44829L10 = m44829L4();
        if (c37601cM44829L10 != null && (baseTextView3 = c37601cM44829L10.f83694g) != null) {
            OtcAd otcAd6 = this.f37662Y;
            if (otcAd6 != null) {
                onlineEndDate = otcAd6.getOnlineEndDate();
            } else {
                onlineEndDate = null;
            }
            baseTextView3.setText(C27041f.m66668h(onlineEndDate));
        }
        C37601c c37601cM44829L11 = m44829L4();
        if (c37601cM44829L11 != null && (baseTextView2 = c37601cM44829L11.f83699i0) != null) {
            Map<String, String> mapM44846f5 = m44846f5();
            OtcAd otcAd7 = this.f37662Y;
            if (otcAd7 != null) {
                adTarget = otcAd7.getAdTarget();
            } else {
                adTarget = null;
            }
            baseTextView2.setText(C27041f.m66668h(mapM44846f5.get(C27041f.m66668h(adTarget))));
        }
        C37601c c37601cM44829L12 = m44829L4();
        if (c37601cM44829L12 != null && (baseTextView = c37601cM44829L12.f83705l0) != null) {
            OtcAd otcAd8 = this.f37662Y;
            if (otcAd8 != null) {
                legalTradeTimesLimitType = otcAd8.getLegalTradeTimesLimitType();
            } else {
                legalTradeTimesLimitType = null;
            }
            if (Intrinsics.areEqual(legalTradeTimesLimitType, "none")) {
                Map<String, String> mapM44842b5 = m44842b5();
                OtcAd otcAd9 = this.f37662Y;
                if (otcAd9 != null) {
                    legalTradeTimesLimit = otcAd9.getLegalTradeTimesLimitType();
                }
                string = C27041f.m66668h(mapM44842b5.get(legalTradeTimesLimit));
            } else {
                StringBuilder sb2 = new StringBuilder();
                Map<String, String> mapM44842b6 = m44842b5();
                OtcAd otcAd10 = this.f37662Y;
                if (otcAd10 != null) {
                    legalTradeTimesLimitType2 = otcAd10.getLegalTradeTimesLimitType();
                } else {
                    legalTradeTimesLimitType2 = null;
                }
                sb2.append(C27041f.m66668h(mapM44842b6.get(legalTradeTimesLimitType2)));
                sb2.append(' ');
                Map<String, String> mapM44843c5 = m44843c5();
                OtcAd otcAd11 = this.f37662Y;
                if (otcAd11 != null) {
                    legalTradeTimesLimit = otcAd11.getLegalTradeTimesLimit();
                }
                sb2.append(C27041f.m66668h(mapM44843c5.get(legalTradeTimesLimit)));
                string = sb2.toString();
            }
            baseTextView.setText(string);
        }
        C20143e.m45238d(this, new BiConsumer() { // from class: com.kubi.otc.otc.merchant.p0
            @Override // io.reactivex.functions.BiConsumer
            public final void accept(Object obj, Object obj2) {
                AbsOtcAdBaseFragment.m44755h6(this.f37779b, (Boolean) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: h6 */
    public static final void m44755h6(AbsOtcAdBaseFragment absOtcAdBaseFragment, Boolean bool, List list) {
        Intrinsics.checkNotNull(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(C27041f.m66668h(((PayTypeEntity) obj).getTypeCode()), obj);
        }
        absOtcAdBaseFragment.f37661X = linkedHashMap;
    }

    /* JADX INFO: renamed from: j5 */
    public static final void m44759j5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l5 */
    public static final void m44766l5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: l6 */
    public static final ArrayList m44767l6(AbsOtcAdBaseFragment absOtcAdBaseFragment) {
        Bundle arguments = absOtcAdBaseFragment.getArguments();
        if (arguments != null) {
            return arguments.getStringArrayList("legals");
        }
        return null;
    }

    /* JADX INFO: renamed from: n5 */
    public static final void m44773n5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: n6 */
    public static final void m44774n6(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o5 */
    public static final Unit m44777o5(AbsOtcAdBaseFragment absOtcAdBaseFragment, CharSequence charSequence) {
        absOtcAdBaseFragment.mo44824G4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o6 */
    public static final Unit m44778o6(AbsOtcAdBaseFragment absOtcAdBaseFragment, Balance.Response response) {
        absOtcAdBaseFragment.f37666c0 = response.getAvailableBalance();
        absOtcAdBaseFragment.f37665b0 = response.getAvailableBalanceV2();
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L4 != null) {
            absOtcAdBaseFragment.m44855u6(c37601cM44829L4);
        }
        absOtcAdBaseFragment.f37667d0 = true;
        absOtcAdBaseFragment.mo44824G4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p5 */
    public static final void m44781p5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q5 */
    public static final Unit m44784q5(AbsOtcAdBaseFragment absOtcAdBaseFragment, CharSequence charSequence) {
        BaseTextView baseTextView;
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83667L) != null) {
            baseTextView.setText("");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r5 */
    public static final void m44787r5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: s5 */
    public static final Unit m44790s5(AbsOtcAdBaseFragment absOtcAdBaseFragment, CharSequence charSequence) {
        absOtcAdBaseFragment.m44826I4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t5 */
    public static final void m44794t5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t6 */
    public static final InterfaceC37241c m44795t6() {
        return (InterfaceC37241c) C42597a.m93386b().create(InterfaceC37241c.class);
    }

    /* JADX INFO: renamed from: u5 */
    public static final Unit m44798u5(AbsOtcAdBaseFragment absOtcAdBaseFragment, CharSequence charSequence) {
        BaseTextView baseTextView;
        C37601c c37601cM44829L4 = absOtcAdBaseFragment.m44829L4();
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83667L) != null) {
            baseTextView.setText("");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v5 */
    public static final void m44801v5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: w5 */
    public static final Unit m44805w5(AbsOtcAdBaseFragment absOtcAdBaseFragment, CharSequence charSequence) {
        absOtcAdBaseFragment.m44825H4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w6 */
    public static final void m44806w6(AbsOtcAdBaseFragment absOtcAdBaseFragment, int i11, Intent intent) {
        absOtcAdBaseFragment.m44851m6();
    }

    /* JADX INFO: renamed from: x5 */
    public static final void m44809x5(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: y6 */
    public static final void m44814y6(AbsOtcAdBaseFragment absOtcAdBaseFragment, int i11, Intent intent) {
        absOtcAdBaseFragment.m44851m6();
    }

    /* JADX INFO: renamed from: F4 */
    public final void m44822F4() {
        Button button;
        C37601c c37601cM44829L4 = m44829L4();
        if (c37601cM44829L4 != null && (button = c37601cM44829L4.f83686c) != null) {
            button.setEnabled(mo44828K4());
        }
    }

    /* JADX INFO: renamed from: G4 */
    public void mo44824G4() {
        Boolean boolValueOf;
        Editable text;
        Boolean boolValueOf2;
        FilterEmojiEditText filterEmojiEditText;
        FilterEmojiEditText filterEmojiEditText2;
        Editable text2;
        FilterEmojiEditText filterEmojiEditText3;
        FilterEmojiEditText filterEmojiEditText4;
        FilterEmojiEditText filterEmojiEditText5;
        Editable text3;
        FilterEmojiEditText filterEmojiEditText6;
        FilterEmojiEditText filterEmojiEditText7;
        FilterEmojiEditText filterEmojiEditText8;
        Editable text4;
        boolean z11;
        C37601c c37601cM44829L4 = m44829L4();
        Integer numValueOf = null;
        if (c37601cM44829L4 != null && (filterEmojiEditText8 = c37601cM44829L4.f83688d) != null && (text4 = filterEmojiEditText8.getText()) != null) {
            if (text4.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolValueOf = Boolean.valueOf(z11);
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            C37601c c37601cM44829L5 = m44829L4();
            if (c37601cM44829L5 != null && (filterEmojiEditText7 = c37601cM44829L5.f83688d) != null) {
                text = filterEmojiEditText7.getText();
            } else {
                text = null;
            }
            BigDecimal bigDecimalM86490A = C38346y.m86490A(String.valueOf(text));
            OtcAd otcAd = this.f37662Y;
            if (otcAd != null) {
                boolValueOf2 = Boolean.valueOf(otcAd.isBuy());
            } else {
                boolValueOf2 = null;
            }
            if (C27025c.m66566d(boolValueOf2)) {
                if (bigDecimalM86490A.compareTo(new BigDecimal("1000000000000")) > 0) {
                    C37601c c37601cM44829L6 = m44829L4();
                    if (c37601cM44829L6 != null && (filterEmojiEditText6 = c37601cM44829L6.f83688d) != null) {
                        filterEmojiEditText6.setText("1000000000000");
                    }
                    C37601c c37601cM44829L7 = m44829L4();
                    if (c37601cM44829L7 != null && (filterEmojiEditText4 = c37601cM44829L7.f83688d) != null) {
                        C37601c c37601cM44829L8 = m44829L4();
                        if (c37601cM44829L8 != null && (filterEmojiEditText5 = c37601cM44829L8.f83688d) != null && (text3 = filterEmojiEditText5.getText()) != null) {
                            numValueOf = Integer.valueOf(text3.length());
                        }
                        filterEmojiEditText4.setSelection(C27039d.m66650j(numValueOf));
                    }
                }
            } else if (this.f37667d0 && bigDecimalM86490A.compareTo(C38346y.m86490A(this.f37665b0)) > 0) {
                C37601c c37601cM44829L9 = m44829L4();
                if (c37601cM44829L9 != null && (filterEmojiEditText3 = c37601cM44829L9.f83688d) != null) {
                    filterEmojiEditText3.setText(C27041f.m66668h(this.f37665b0));
                }
                C37601c c37601cM44829L10 = m44829L4();
                if (c37601cM44829L10 != null && (filterEmojiEditText = c37601cM44829L10.f83688d) != null) {
                    C37601c c37601cM44829L11 = m44829L4();
                    if (c37601cM44829L11 != null && (filterEmojiEditText2 = c37601cM44829L11.f83688d) != null && (text2 = filterEmojiEditText2.getText()) != null) {
                        numValueOf = Integer.valueOf(text2.length());
                    }
                    filterEmojiEditText.setSelection(C27039d.m66650j(numValueOf));
                }
            }
        }
        m44822F4();
    }

    /* JADX INFO: renamed from: H4 */
    public final void m44825H4() {
        BigDecimal number;
        BigDecimal number2;
        Boolean boolValueOf;
        EditTextWithTitleView editTextWithTitleView;
        EditTextWithTitleView editTextWithTitleView2;
        C37601c c37601cM44829L4;
        EditTextWithTitleView editTextWithTitleView3;
        Boolean boolValueOf2;
        BaseTextView baseTextView;
        EditTextWithTitleView editTextWithTitleView4;
        EditTextWithTitleView editTextWithTitleView5;
        EditTextWithTitleView editTextWithTitleView6;
        EditTextWithTitleView editTextWithTitleView7;
        C37601c c37601cM44829L5 = m44829L4();
        if (c37601cM44829L5 == null || (editTextWithTitleView7 = c37601cM44829L5.f83700j) == null || (number = editTextWithTitleView7.getNumber()) == null) {
            number = BigDecimal.ZERO;
        }
        C37601c c37601cM44829L6 = m44829L4();
        if (c37601cM44829L6 == null || (editTextWithTitleView6 = c37601cM44829L6.f83698i) == null || (number2 = editTextWithTitleView6.getNumber()) == null) {
            number2 = BigDecimal.ZERO;
        }
        C37601c c37601cM44829L7 = m44829L4();
        BigDecimal number3 = null;
        if (c37601cM44829L7 != null && (editTextWithTitleView5 = c37601cM44829L7.f83700j) != null) {
            boolValueOf = Boolean.valueOf(editTextWithTitleView5.m45498b());
        } else {
            boolValueOf = null;
        }
        if (!C27025c.m66566d(boolValueOf)) {
            C37601c c37601cM44829L8 = m44829L4();
            if (c37601cM44829L8 != null && (editTextWithTitleView4 = c37601cM44829L8.f83698i) != null) {
                boolValueOf2 = Boolean.valueOf(editTextWithTitleView4.m45498b());
            } else {
                boolValueOf2 = null;
            }
            if (!C27025c.m66566d(boolValueOf2) && number2.compareTo(number) < 0) {
                C37601c c37601cM44829L9 = m44829L4();
                if (c37601cM44829L9 != null && (baseTextView = c37601cM44829L9.f83667L) != null) {
                    baseTextView.setText(getString(R$string.limit_max_quota));
                    return;
                }
                return;
            }
        }
        if (number2.compareTo(new BigDecimal("1000000000000")) > 0 && (c37601cM44829L4 = m44829L4()) != null && (editTextWithTitleView3 = c37601cM44829L4.f83698i) != null) {
            editTextWithTitleView3.setContent("1000000000000");
            editTextWithTitleView3.getEditText().setSelection(editTextWithTitleView3.getContent().length());
        }
        C37601c c37601cM44829L10 = m44829L4();
        if (c37601cM44829L10 != null && (editTextWithTitleView2 = c37601cM44829L10.f83698i) != null) {
            editTextWithTitleView2.m45497a();
        }
        m44822F4();
        OtcAd otcAd = this.f37662Y;
        if (otcAd != null) {
            C37601c c37601cM44829L11 = m44829L4();
            if (c37601cM44829L11 != null && (editTextWithTitleView = c37601cM44829L11.f83698i) != null) {
                number3 = editTextWithTitleView.getNumber();
            }
            otcAd.setLimitMaxQuote(number3);
        }
    }

    /* JADX INFO: renamed from: I4 */
    public final void m44826I4() {
        BigDecimal number;
        BigDecimal number2;
        Boolean boolValueOf;
        EditTextWithTitleView editTextWithTitleView;
        EditTextWithTitleView editTextWithTitleView2;
        EditTextWithTitleView editTextWithTitleView3;
        EditTextWithTitleView editTextWithTitleView4;
        Boolean boolValueOf2;
        BaseTextView baseTextView;
        EditTextWithTitleView editTextWithTitleView5;
        EditTextWithTitleView editTextWithTitleView6;
        EditTextWithTitleView editTextWithTitleView7;
        EditTextWithTitleView editTextWithTitleView8;
        C37601c c37601cM44829L4 = m44829L4();
        if (c37601cM44829L4 == null || (editTextWithTitleView8 = c37601cM44829L4.f83700j) == null || (number = editTextWithTitleView8.getNumber()) == null) {
            number = BigDecimal.ZERO;
        }
        C37601c c37601cM44829L5 = m44829L4();
        if (c37601cM44829L5 == null || (editTextWithTitleView7 = c37601cM44829L5.f83698i) == null || (number2 = editTextWithTitleView7.getNumber()) == null) {
            number2 = BigDecimal.ZERO;
        }
        C37601c c37601cM44829L6 = m44829L4();
        BigDecimal number3 = null;
        if (c37601cM44829L6 != null && (editTextWithTitleView6 = c37601cM44829L6.f83700j) != null) {
            boolValueOf = Boolean.valueOf(editTextWithTitleView6.m45498b());
        } else {
            boolValueOf = null;
        }
        if (!C27025c.m66566d(boolValueOf)) {
            C37601c c37601cM44829L7 = m44829L4();
            if (c37601cM44829L7 != null && (editTextWithTitleView5 = c37601cM44829L7.f83698i) != null) {
                boolValueOf2 = Boolean.valueOf(editTextWithTitleView5.m45498b());
            } else {
                boolValueOf2 = null;
            }
            if (!C27025c.m66566d(boolValueOf2) && number.compareTo(number2) > 0) {
                C37601c c37601cM44829L8 = m44829L4();
                if (c37601cM44829L8 != null && (baseTextView = c37601cM44829L8.f83667L) != null) {
                    baseTextView.setText(getString(R$string.limit_min_quota));
                    return;
                }
                return;
            }
        }
        if (number.compareTo(new BigDecimal("1000000000000")) > 0) {
            C37601c c37601cM44829L9 = m44829L4();
            if (c37601cM44829L9 != null && (editTextWithTitleView4 = c37601cM44829L9.f83700j) != null) {
                editTextWithTitleView4.setContent("1000000000000");
            }
            C37601c c37601cM44829L10 = m44829L4();
            if (c37601cM44829L10 != null && (editTextWithTitleView3 = c37601cM44829L10.f83700j) != null) {
                editTextWithTitleView3.getEditText().setSelection(editTextWithTitleView3.getContent().length());
            }
        }
        C37601c c37601cM44829L11 = m44829L4();
        if (c37601cM44829L11 != null && (editTextWithTitleView2 = c37601cM44829L11.f83700j) != null) {
            editTextWithTitleView2.m45497a();
        }
        m44822F4();
        OtcAd otcAd = this.f37662Y;
        if (otcAd != null) {
            C37601c c37601cM44829L12 = m44829L4();
            if (c37601cM44829L12 != null && (editTextWithTitleView = c37601cM44829L12.f83700j) != null) {
                number3 = editTextWithTitleView.getNumber();
            }
            otcAd.setLimitMinQuote(number3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX INFO: renamed from: K4 */
    public boolean mo44828K4() {
        BigDecimal number;
        String priceType;
        boolean z11;
        String onlineType;
        boolean z12;
        BigDecimal number2;
        BigDecimal number3;
        String currency;
        String legal;
        String priceType2;
        Boolean boolValueOf;
        EditTextWithTitleView editTextWithTitleView;
        EditTextWithTitleView editTextWithTitleView2;
        EditTextWithTitleView editTextWithTitleView3;
        EditTextWithTitleView editTextWithTitleView4;
        String onlineTimeZone;
        String onlineStartDate;
        String onlineEndDate;
        EditTextWithTitleView editTextWithTitleView5;
        C37601c c37601cM44829L4 = m44829L4();
        if (c37601cM44829L4 == null || (editTextWithTitleView5 = c37601cM44829L4.f83696h) == null || (number = editTextWithTitleView5.getNumber()) == null) {
            number = BigDecimal.ZERO;
        }
        OtcAd otcAd = this.f37662Y;
        Boolean boolValueOf2 = null;
        if (otcAd != null) {
            priceType = otcAd.getPriceType();
        } else {
            priceType = null;
        }
        if (Intrinsics.areEqual(priceType, "REGULAR")) {
            if (number.compareTo(new BigDecimal(BigInteger.ZERO)) > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else if (!Intrinsics.areEqual(priceType, "FLOAT")) {
            z11 = false;
        } else {
            z11 = this.f37668e0;
        }
        OtcAd otcAd2 = this.f37662Y;
        if (otcAd2 != null) {
            onlineType = otcAd2.getOnlineType();
        } else {
            onlineType = null;
        }
        if (Intrinsics.areEqual(onlineType, "1")) {
            OtcAd otcAd3 = this.f37662Y;
            if (otcAd3 != null) {
                onlineTimeZone = otcAd3.getOnlineTimeZone();
            } else {
                onlineTimeZone = null;
            }
            if (onlineTimeZone != null && onlineTimeZone.length() != 0) {
                OtcAd otcAd4 = this.f37662Y;
                if (otcAd4 != null) {
                    onlineStartDate = otcAd4.getOnlineStartDate();
                } else {
                    onlineStartDate = null;
                }
                if (onlineStartDate != null && onlineStartDate.length() != 0) {
                    OtcAd otcAd5 = this.f37662Y;
                    if (otcAd5 != null) {
                        onlineEndDate = otcAd5.getOnlineEndDate();
                    } else {
                        onlineEndDate = null;
                    }
                    if (onlineEndDate != null && onlineEndDate.length() != 0) {
                        z12 = true;
                    }
                }
            }
            z12 = false;
        } else {
            z12 = true;
        }
        C37601c c37601cM44829L5 = m44829L4();
        if (c37601cM44829L5 == null || (editTextWithTitleView4 = c37601cM44829L5.f83700j) == null || (number2 = editTextWithTitleView4.getNumber()) == null) {
            number2 = BigDecimal.ZERO;
        }
        C37601c c37601cM44829L6 = m44829L4();
        if (c37601cM44829L6 == null || (editTextWithTitleView3 = c37601cM44829L6.f83698i) == null || (number3 = editTextWithTitleView3.getNumber()) == null) {
            number3 = BigDecimal.ZERO;
        }
        if (z11 && z12) {
            OtcAd otcAd6 = this.f37662Y;
            if (otcAd6 != null) {
                currency = otcAd6.getCurrency();
            } else {
                currency = null;
            }
            if (currency != null && currency.length() != 0) {
                OtcAd otcAd7 = this.f37662Y;
                if (otcAd7 != null) {
                    legal = otcAd7.getLegal();
                } else {
                    legal = null;
                }
                if (legal != null && legal.length() != 0) {
                    OtcAd otcAd8 = this.f37662Y;
                    if (otcAd8 != null) {
                        priceType2 = otcAd8.getPriceType();
                    } else {
                        priceType2 = null;
                    }
                    if (priceType2 != null && priceType2.length() != 0) {
                        C37601c c37601cM44829L7 = m44829L4();
                        if (c37601cM44829L7 != null && (editTextWithTitleView2 = c37601cM44829L7.f83700j) != null) {
                            boolValueOf = Boolean.valueOf(editTextWithTitleView2.m45498b());
                        } else {
                            boolValueOf = null;
                        }
                        if (!C27025c.m66566d(boolValueOf)) {
                            C37601c c37601cM44829L8 = m44829L4();
                            if (c37601cM44829L8 != null && (editTextWithTitleView = c37601cM44829L8.f83698i) != null) {
                                boolValueOf2 = Boolean.valueOf(editTextWithTitleView.m45498b());
                            }
                            if (!C27025c.m66566d(boolValueOf2) && number3.compareTo(number2) >= 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m44835R4(@Nullable final Action action) {
        String currency;
        String legal;
        InterfaceC37241c interfaceC37241cM44833P4 = m44833P4();
        OtcAd otcAd = this.f37662Y;
        String priceType = null;
        if (otcAd != null) {
            currency = otcAd.getCurrency();
        } else {
            currency = null;
        }
        String strM66668h = C27041f.m66668h(currency);
        OtcAd otcAd2 = this.f37662Y;
        if (otcAd2 != null) {
            legal = otcAd2.getLegal();
        } else {
            legal = null;
        }
        String strM66668h2 = C27041f.m66668h(legal);
        OtcAd otcAd3 = this.f37662Y;
        if (otcAd3 != null) {
            priceType = otcAd3.getPriceType();
        }
        Observable<R> observableCompose = interfaceC37241cM44833P4.m83342u(strM66668h, strM66668h2, C27041f.m66668h(priceType)).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.merchant.l1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsOtcAdBaseFragment.m44725T4(this.f37758b, action, (OtcPrice) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.m1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbsOtcAdBaseFragment.m44728U4(function1, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: g5 */
    public final void m44847g5() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new AbsOtcAdBaseFragment$handleTaxInfo$1(this, null));
    }

    /* JADX INFO: renamed from: h5 */
    public void m44848h5() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        RelativeLayout relativeLayout;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        BaseTextView baseTextView12;
        BaseTextView baseTextView13;
        AppCompatEditText appCompatEditText;
        EditTextWithTitleView editTextWithTitleView;
        EditTextWithTitleView editTextWithTitleView2;
        FilterEmojiEditText filterEmojiEditText;
        final EditTextWithTitleView editTextWithTitleView3;
        EditTextWithTitleView editTextWithTitleView4;
        EditTextWithTitleView editTextWithTitleView5;
        C37601c c37601cM44829L4 = m44829L4();
        if (c37601cM44829L4 != null && (editTextWithTitleView5 = c37601cM44829L4.f83696h) != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d = C0206f.m784d(editTextWithTitleView5.getEditText());
            final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.merchant.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbsOtcAdBaseFragment.m44757i5(this.f37701b, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe = abstractC46099aM784d.subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.c
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbsOtcAdBaseFragment.m44759j5(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
            CompositeDisposable compositeDisposable = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        }
        C37601c c37601cM44829L5 = m44829L4();
        if (c37601cM44829L5 != null && (editTextWithTitleView4 = c37601cM44829L5.f83702k) != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d2 = C0206f.m784d(editTextWithTitleView4.getEditText());
            final Function1 function2 = new Function1() { // from class: com.kubi.otc.otc.merchant.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbsOtcAdBaseFragment.m44762k5(this.f37774b, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe2 = abstractC46099aM784d2.subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.v
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbsOtcAdBaseFragment.m44766l5(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
            CompositeDisposable compositeDisposable2 = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable2, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe2, compositeDisposable2);
        }
        C37601c c37601cM44829L6 = m44829L4();
        if (c37601cM44829L6 != null && (editTextWithTitleView3 = c37601cM44829L6.f83692f) != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d3 = C0206f.m784d(editTextWithTitleView3.getEditText());
            final Function1 function3 = new Function1() { // from class: com.kubi.otc.otc.merchant.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbsOtcAdBaseFragment.m44770m5(this.f37817b, editTextWithTitleView3, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe3 = abstractC46099aM784d3.subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.y
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbsOtcAdBaseFragment.m44773n5(function3, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe3, "subscribe(...)");
            CompositeDisposable compositeDisposable3 = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable3, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe3, compositeDisposable3);
        }
        C37601c c37601cM44829L7 = m44829L4();
        if (c37601cM44829L7 != null && (filterEmojiEditText = c37601cM44829L7.f83688d) != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d4 = C0206f.m784d(filterEmojiEditText);
            final Function1 function4 = new Function1() { // from class: com.kubi.otc.otc.merchant.z
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbsOtcAdBaseFragment.m44777o5(this.f37828b, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe4 = abstractC46099aM784d4.subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.a0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbsOtcAdBaseFragment.m44781p5(function4, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe4, "subscribe(...)");
            CompositeDisposable compositeDisposable4 = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable4, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe4, compositeDisposable4);
        }
        C37601c c37601cM44829L8 = m44829L4();
        if (c37601cM44829L8 != null && (editTextWithTitleView2 = c37601cM44829L8.f83700j) != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d5 = C0206f.m784d(editTextWithTitleView2.getEditText());
            final Function1 function5 = new Function1() { // from class: com.kubi.otc.otc.merchant.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbsOtcAdBaseFragment.m44784q5(this.f37708b, (CharSequence) obj);
                }
            };
            Observable<CharSequence> observableDoOnNext = abstractC46099aM784d5.doOnNext(new Consumer() { // from class: com.kubi.otc.otc.merchant.c0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbsOtcAdBaseFragment.m44787r5(function5, obj);
                }
            });
            final Function1 function6 = new Function1() { // from class: com.kubi.otc.otc.merchant.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbsOtcAdBaseFragment.m44790s5(this.f37756b, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe5 = observableDoOnNext.subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.w
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbsOtcAdBaseFragment.m44794t5(function6, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe5, "subscribe(...)");
            CompositeDisposable compositeDisposable5 = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable5, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe5, compositeDisposable5);
        }
        C37601c c37601cM44829L9 = m44829L4();
        if (c37601cM44829L9 != null && (editTextWithTitleView = c37601cM44829L9.f83698i) != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d6 = C0206f.m784d(editTextWithTitleView.getEditText());
            final Function1 function7 = new Function1() { // from class: com.kubi.otc.otc.merchant.h0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbsOtcAdBaseFragment.m44798u5(this.f37734b, (CharSequence) obj);
                }
            };
            Observable<CharSequence> observableDoOnNext2 = abstractC46099aM784d6.doOnNext(new Consumer() { // from class: com.kubi.otc.otc.merchant.s0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbsOtcAdBaseFragment.m44801v5(function7, obj);
                }
            });
            final Function1 function8 = new Function1() { // from class: com.kubi.otc.otc.merchant.d1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbsOtcAdBaseFragment.m44805w5(this.f37719b, (CharSequence) obj);
                }
            };
            Disposable disposableSubscribe6 = observableDoOnNext2.subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.o1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbsOtcAdBaseFragment.m44809x5(function8, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe6, "subscribe(...)");
            CompositeDisposable compositeDisposable6 = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable6, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe6, compositeDisposable6);
        }
        C37601c c37601cM44829L10 = m44829L4();
        if (c37601cM44829L10 != null && (appCompatEditText = c37601cM44829L10.f83690e) != null) {
            AbstractC46099a<CharSequence> abstractC46099aM784d7 = C0206f.m784d(appCompatEditText);
            final Function1 function9 = new Function1() { // from class: com.kubi.otc.otc.merchant.q1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbsOtcAdBaseFragment.m44813y5(this.f37784b, (CharSequence) obj);
                }
            };
            Observable<R> map = abstractC46099aM784d7.map(new Function() { // from class: com.kubi.otc.otc.merchant.r1
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return AbsOtcAdBaseFragment.m44817z5(function9, obj);
                }
            });
            final Function1 function10 = new Function1() { // from class: com.kubi.otc.otc.merchant.s1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbsOtcAdBaseFragment.m44673A5(this.f37793b, (Integer) obj);
                }
            };
            Disposable disposableSubscribe7 = map.subscribe((Consumer<? super R>) new Consumer() { // from class: com.kubi.otc.otc.merchant.b
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AbsOtcAdBaseFragment.m44676B5(function10, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(disposableSubscribe7, "subscribe(...)");
            CompositeDisposable compositeDisposable7 = getCompositeDisposable();
            Intrinsics.checkNotNullExpressionValue(compositeDisposable7, "getCompositeDisposable(...)");
            DisposableKt.addTo(disposableSubscribe7, compositeDisposable7);
        }
        C37601c c37601cM44829L11 = m44829L4();
        if (c37601cM44829L11 != null && (baseTextView13 = c37601cM44829L11.f83659D) != null) {
            C27046k.m66711z(baseTextView13, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44680C5(this.f37718b);
                }
            }, 1, null);
        }
        C37601c c37601cM44829L12 = m44829L4();
        if (c37601cM44829L12 != null && (baseTextView12 = c37601cM44829L12.f83678W) != null) {
            C27046k.m66711z(baseTextView12, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44683D5(this.f37722b);
                }
            }, 1, null);
        }
        C37601c c37601cM44829L13 = m44829L4();
        if (c37601cM44829L13 != null && (linearLayout2 = c37601cM44829L13.f83714q) != null) {
            C27046k.m66711z(linearLayout2, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44686E5(this.f37725b);
                }
            }, 1, null);
        }
        C37601c c37601cM44829L14 = m44829L4();
        if (c37601cM44829L14 != null && (linearLayout = c37601cM44829L14.f83718s) != null) {
            C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44690G5(this.f37729b);
                }
            }, 1, null);
        }
        C37601c c37601cM44829L15 = m44829L4();
        if (c37601cM44829L15 != null && (baseTextView11 = c37601cM44829L15.f83672Q) != null) {
            C27046k.m66711z(baseTextView11, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44699J5(this.f37733b);
                }
            }, 1, null);
        }
        C37601c c37601cM44829L16 = m44829L4();
        if (c37601cM44829L16 != null && (baseTextView10 = c37601cM44829L16.f83732z) != null) {
            C27046k.m66711z(baseTextView10, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44708M5(this.f37738b);
                }
            }, 1, null);
        }
        C37601c c37601cM44829L17 = m44829L4();
        if (c37601cM44829L17 != null && (relativeLayout = c37601cM44829L17.f83722u) != null) {
            C27046k.m66711z(relativeLayout, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44711N5(this.f37744b);
                }
            }, 1, null);
        }
        C37601c c37601cM44829L18 = m44829L4();
        if (c37601cM44829L18 != null && (baseTextView9 = c37601cM44829L18.f83687c0) != null) {
            C27046k.m66711z(baseTextView9, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44716P5(this.f37750b);
                }
            }, 1, null);
        }
        C37601c c37601cM44829L19 = m44829L4();
        if (c37601cM44829L19 != null && (baseTextView8 = c37601cM44829L19.f83668M) != null) {
            C27046k.m66711z(baseTextView8, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44720R5(this.f37763b);
                }
            }, 1, null);
        }
        C37601c c37601cM44829L20 = m44829L4();
        if (c37601cM44829L20 != null && (baseTextView7 = c37601cM44829L20.f83677V) != null) {
            C27046k.m66711z(baseTextView7, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44726T5(this.f37767b);
                }
            }, 1, null);
        }
        C37601c c37601cM44829L21 = m44829L4();
        if (c37601cM44829L21 != null && (baseTextView6 = c37601cM44829L21.f83704l) != null) {
            C27046k.m66711z(baseTextView6, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44731V5(this.f37778b);
                }
            }, 1, null);
        }
        C37601c c37601cM44829L22 = m44829L4();
        if (c37601cM44829L22 != null && (baseTextView5 = c37601cM44829L22.f83694g) != null) {
            C27046k.m66711z(baseTextView5, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44735X5(this.f37782b);
                }
            }, 1, null);
        }
        C37601c c37601cM44829L23 = m44829L4();
        if (c37601cM44829L23 != null && (baseTextView4 = c37601cM44829L23.f83699i0) != null) {
            C27046k.m66711z(baseTextView4, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44739Z5(this.f37785b);
                }
            }, 1, null);
        }
        Map<String, String> mapM44842b5 = m44842b5();
        final ArrayList arrayList = new ArrayList(mapM44842b5.size());
        for (Map.Entry<String, String> entry : mapM44842b5.entrySet()) {
            arrayList.add(new SelectWheelEntity(entry.getKey(), entry.getValue()));
        }
        Map<String, String> mapM44843c5 = m44843c5();
        final ArrayList arrayList2 = new ArrayList(mapM44843c5.size());
        for (Map.Entry<String, String> entry2 : mapM44843c5.entrySet()) {
            arrayList2.add(new SelectWheelEntity(entry2.getKey(), entry2.getValue()));
        }
        C37601c c37601cM44829L24 = m44829L4();
        if (c37601cM44829L24 != null && (baseTextView3 = c37601cM44829L24.f83705l0) != null) {
            C27046k.m66711z(baseTextView3, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44743b6(this.f37789b, arrayList, arrayList2);
                }
            }, 1, null);
        }
        C37601c c37601cM44829L25 = m44829L4();
        if (c37601cM44829L25 != null && (baseTextView2 = c37601cM44829L25.f83689d0) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44749e6(this.f37799b);
                }
            }, 1, null);
        }
        C37601c c37601cM44829L26 = m44829L4();
        if (c37601cM44829L26 != null && (baseTextView = c37601cM44829L26.f83669N) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44751f6(this.f37805b);
                }
            }, 1, null);
        }
        m44753g6();
    }

    /* JADX INFO: renamed from: i6 */
    public final void m44849i6() {
        EditTextWithTitleView editTextWithTitleView;
        EditText editText;
        C37601c c37601cM44829L4 = m44829L4();
        if (c37601cM44829L4 != null && (editTextWithTitleView = c37601cM44829L4.f83702k) != null && (editText = editTextWithTitleView.getEditText()) != null) {
            editText.setFilters(new C27056j0[]{new C27056j0(2)});
        }
        m44856z6();
        m44819C6();
    }

    /* JADX INFO: renamed from: m6 */
    public final void m44851m6() {
        String currency;
        String str;
        OtcAd otcAd;
        String currency2;
        BaseTextView baseTextView;
        String currency3;
        BaseTextView baseTextView2;
        String currency4;
        C37601c c37601cM44829L4 = m44829L4();
        String currency5 = null;
        if (c37601cM44829L4 != null && (baseTextView2 = c37601cM44829L4.f83661F) != null) {
            OtcAd otcAd2 = this.f37662Y;
            if (otcAd2 != null) {
                currency4 = otcAd2.getCurrency();
            } else {
                currency4 = null;
            }
            baseTextView2.setText(currency4);
        }
        C37601c c37601cM44829L5 = m44829L4();
        if (c37601cM44829L5 != null && (baseTextView = c37601cM44829L5.f83728x) != null) {
            OtcAd otcAd3 = this.f37662Y;
            if (otcAd3 != null) {
                currency3 = otcAd3.getCurrency();
            } else {
                currency3 = null;
            }
            baseTextView.setText(currency3);
        }
        OtcAd otcAd4 = this.f37662Y;
        if (otcAd4 != null) {
            currency = otcAd4.getCurrency();
        } else {
            currency = null;
        }
        if (currency == null || ((otcAd = this.f37662Y) != null && (currency2 = otcAd.getCurrency()) != null && currency2.length() == 0)) {
            C43846g.m96568c(new OtcMessage("AbsOtcAdBaseFragment：otcAd is null or currency is empty", "v1/account/currency-balance", false, 4, null), null, 2, null);
        }
        InterfaceC37241c interfaceC37241cM44833P4 = m44833P4();
        OtcAd otcAd5 = this.f37662Y;
        if (otcAd5 != null) {
            currency5 = otcAd5.getCurrency();
        }
        if (m44845e5()) {
            str = "fast_sell";
        } else {
            str = "";
        }
        Observable<R> observableCompose = interfaceC37241cM44833P4.m83317G(new Balance.Request(currency5, str)).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.otc.merchant.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsOtcAdBaseFragment.m44778o6(this.f37727b, (Balance.Response) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.otc.otc.merchant.g1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbsOtcAdBaseFragment.m44774n6(function1, obj);
            }
        }, new C24223c1(this));
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m44847g5();
    }

    /* JADX INFO: renamed from: p6 */
    public final void m44852p6() {
        EditTextWithTitleView editTextWithTitleView;
        EditTextWithTitleView editTextWithTitleView2;
        String legal;
        EditTextWithTitleView editTextWithTitleView3;
        String legal2;
        EditTextWithTitleView editTextWithTitleView4;
        String legal3;
        BaseTextView baseTextView;
        String legal4;
        C37601c c37601cM44829L4 = m44829L4();
        String legal5 = null;
        if (c37601cM44829L4 != null && (baseTextView = c37601cM44829L4.f83664I) != null) {
            OtcAd otcAd = this.f37662Y;
            if (otcAd != null) {
                legal4 = otcAd.getLegal();
            } else {
                legal4 = null;
            }
            baseTextView.setText(legal4);
        }
        C37601c c37601cM44829L5 = m44829L4();
        if (c37601cM44829L5 != null && (editTextWithTitleView4 = c37601cM44829L5.f83696h) != null) {
            OtcAd otcAd2 = this.f37662Y;
            if (otcAd2 != null) {
                legal3 = otcAd2.getLegal();
            } else {
                legal3 = null;
            }
            editTextWithTitleView4.setUnit(legal3);
        }
        C37601c c37601cM44829L6 = m44829L4();
        if (c37601cM44829L6 != null && (editTextWithTitleView3 = c37601cM44829L6.f83692f) != null) {
            OtcAd otcAd3 = this.f37662Y;
            if (otcAd3 != null) {
                legal2 = otcAd3.getLegal();
            } else {
                legal2 = null;
            }
            editTextWithTitleView3.setUnit(legal2);
        }
        C37601c c37601cM44829L7 = m44829L4();
        if (c37601cM44829L7 != null && (editTextWithTitleView2 = c37601cM44829L7.f83700j) != null) {
            OtcAd otcAd4 = this.f37662Y;
            if (otcAd4 != null) {
                legal = otcAd4.getLegal();
            } else {
                legal = null;
            }
            editTextWithTitleView2.setUnit(legal);
        }
        C37601c c37601cM44829L8 = m44829L4();
        if (c37601cM44829L8 != null && (editTextWithTitleView = c37601cM44829L8.f83698i) != null) {
            OtcAd otcAd5 = this.f37662Y;
            if (otcAd5 != null) {
                legal5 = otcAd5.getLegal();
            }
            editTextWithTitleView.setUnit(legal5);
        }
    }

    /* JADX INFO: renamed from: u6 */
    public final void m44855u6(C37601c c37601c) {
        String strM85569h;
        String currency;
        String strM92640e;
        String currency2 = null;
        if (m44845e5()) {
            c37601c.f83658C.setNeedDash(true);
            DashTextView tvBalanceTitle = c37601c.f83658C;
            Intrinsics.checkNotNullExpressionValue(tvBalanceTitle, "tvBalanceTitle");
            C27046k.m66711z(tvBalanceTitle, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.j1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbsOtcAdBaseFragment.m44802v6(this.f37745b);
                }
            }, 1, null);
            BaseTextView baseTextView = c37601c.f83657B;
            int i11 = R$string.payment_price;
            BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(this.f37665b0);
            if (bigDecimalM66536f != null) {
                strM92640e = C42180b.m92640e(bigDecimalM66536f, null, 0, false, false, false, 0, null, 127, null);
            } else {
                strM92640e = null;
            }
            String strM92647l = C42180b.m92647l(strM92640e);
            OtcAd otcAd = this.f37662Y;
            if (otcAd != null) {
                currency2 = otcAd.getCurrency();
            }
            baseTextView.setText(getString(i11, strM92647l, currency2));
        } else {
            c37601c.f83658C.setTag(null);
            BaseTextView baseTextView2 = c37601c.f83657B;
            int i12 = R$string.payment_price;
            String str = this.f37666c0;
            if (str != null) {
                OtcAd otcAd2 = this.f37662Y;
                if (otcAd2 != null) {
                    currency = otcAd2.getCurrency();
                } else {
                    currency = null;
                }
                strM85569h = C37885i.m85569h(str, currency, (126 & 2) != 0 ? RoundingMode.DOWN : null, (126 & 4) != 0 ? false : false, (126 & 8) != 0 ? false : false, (126 & 16) == 0 ? false : false, (126 & 32) != 0, (126 & 64) != 0 ? "0.00" : null);
            } else {
                strM85569h = null;
            }
            String strM66668h = C27041f.m66668h(strM85569h);
            OtcAd otcAd3 = this.f37662Y;
            if (otcAd3 != null) {
                currency2 = otcAd3.getCurrency();
            }
            baseTextView2.setText(getString(i12, strM66668h, currency2));
        }
        AppCompatImageView ivAddFund = c37601c.f83706m;
        Intrinsics.checkNotNullExpressionValue(ivAddFund, "ivAddFund");
        C27046k.m66711z(ivAddFund, 0L, new Function0() { // from class: com.kubi.otc.otc.merchant.k1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsOtcAdBaseFragment.m44810x6(this.f37752b);
            }
        }, 1, null);
    }
}
