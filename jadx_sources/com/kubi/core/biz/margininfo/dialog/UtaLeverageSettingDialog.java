package com.kubi.core.biz.margininfo.dialog;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.MetricAffectingSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.biz.margininfo.IMarginInfoApi;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.bubbleseekbar.KcSeekBar;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeImageView;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.math.MathKt;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import v30.C45406s;
import w00.C45681e;

/* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u00011\u0018\u0000 L2\u00020\u0001:\u0001LB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010*\u001a\u00020(H\u0002J\b\u0010+\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020(H\u0002J\b\u0010-\u001a\u00020(H\u0002J\b\u0010.\u001a\u00020(H\u0002J\b\u0010/\u001a\u00020(H\u0002J\b\u00103\u001a\u00020(H\u0002J\b\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020(H\u0002J\b\u00107\u001a\u00020(H\u0002J\b\u00108\u001a\u00020(H\u0003J\b\u00109\u001a\u00020(H\u0002J\b\u0010:\u001a\u00020(H\u0002J\u000e\u0010;\u001a\u00020(H\u0083@¢\u0006\u0002\u0010<J\u0012\u0010=\u001a\u00020(2\b\u0010>\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010?\u001a\u00020(H\u0002J\u0010\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\fH\u0002J\u0010\u0010C\u001a\u00020\f2\u0006\u0010D\u001a\u000205H\u0002J\b\u0010E\u001a\u00020(H\u0002J\u000e\u0010F\u001a\u00020(2\u0006\u0010G\u001a\u00020HJ\b\u0010I\u001a\u00020(H\u0016J\b\u0010J\u001a\u00020KH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0004\n\u0002\u00102¨\u0006M"}, m90084d2 = {"Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "binding", "Lcom/kubi/tradecorebiz/databinding/DialogUtaLeverageSettingBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/DialogUtaLeverageSettingBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "leverageLevels", "", "Ljava/math/BigDecimal;", "currentLeverage", "DEFAULT_CURRENCY", "", "currentCurrency", "baseCurrency", "quoteCurrency", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "debounceJob", "Lkotlinx/coroutines/Job;", "unifyApi", "Lcom/kubi/core/biz/margininfo/IMarginInfoApi;", "getUnifyApi", "()Lcom/kubi/core/biz/margininfo/IMarginInfoApi;", "unifyApi$delegate", "Lkotlin/Lazy;", "coinEntity", "Lcom/kubi/data/entity/CoinInfoEntity;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "updateLeverageLevels", "initView", "initCurrencySelection", "showCurrencySelectDialog", "updateSeekBarVisibility", "initSeekBar", "mISectionTextFormatListener", "com/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$mISectionTextFormatListener$1", "Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$mISectionTextFormatListener$1;", "bindEvents", "indexOfCurrentLeverage", "", "increaseLeverage", "decreaseLeverage", "updateLeverageDisplay", "updateButtonStates", "debounceFetchMaxBorrowAmount", "fetchMaxBorrowAmount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMaxBorrowAmountDisplay", "amount", "updateSeekBarProgress", "getProgressFromLeverage", "", "leverage", "getLeverageFromProgress", "progress", "handleConfirm", TIMPushProvider.f75062n, "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "onDestroyView", "isBottomSheet", "", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUtaLeverageSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtaLeverageSettingDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n*L\n1#1,633:1\n143#2,20:634\n1#3:654\n1#3:663\n360#4,7:655\n360#4,7:665\n2423#4,14:672\n25#5:662\n26#5:664\n*S KotlinDebug\n*F\n+ 1 UtaLeverageSettingDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog\n*L\n66#1:634,20\n500#1:663\n397#1:655,7\n555#1:665,7\n557#1:672,14\n500#1:662\n500#1:664\n*E\n"})
public final class UtaLeverageSettingDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: A0 */
    @Nullable
    public CoinInfoEntity f20466A0;

    /* JADX INFO: renamed from: v0 */
    @Nullable
    public String f20473v0;

    /* JADX INFO: renamed from: w0 */
    @Nullable
    public String f20474w0;

    /* JADX INFO: renamed from: y0 */
    @Nullable
    public InterfaceC41775x1 f20476y0;

    /* JADX INFO: renamed from: D0 */
    public static final /* synthetic */ KProperty<Object>[] f20465D0 = {Reflection.property1(new PropertyReference1Impl(UtaLeverageSettingDialog.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/DialogUtaLeverageSettingBinding;", 0))};

    /* JADX INFO: renamed from: C0 */
    @NotNull
    public static final Companion f20464C0 = new Companion(null);

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final InterfaceC24293a f20468q0 = C45681e.m100799e(this, new Function1<UtaLeverageSettingDialog, C45406s>() { // from class: com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$special$$inlined$viewBindingFragment$default$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45406s invoke(@NotNull UtaLeverageSettingDialog fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45406s.m100349a(fragment.requireView());
        }
    }, new Function1<C45406s, Unit>() { // from class: com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$special$$inlined$viewBindingFragment$default$1
        public final void invoke(@NotNull C45406s it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45406s c45406s) {
            invoke(c45406s);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: r0 */
    @NotNull
    public List<BigDecimal> f20469r0 = CollectionsKt.mutableListOf(new BigDecimal(1), new BigDecimal(3), new BigDecimal(5), new BigDecimal(7), new BigDecimal(10));

    /* JADX INFO: renamed from: s0 */
    @NotNull
    public BigDecimal f20470s0 = new BigDecimal(5);

    /* JADX INFO: renamed from: t0 */
    @NotNull
    public final String f20471t0 = "USDT";

    /* JADX INFO: renamed from: u0 */
    @NotNull
    public String f20472u0 = "USDT";

    /* JADX INFO: renamed from: x0 */
    @NotNull
    public final InterfaceC41709m0 f20475x0 = C41713n0.m91125a(C41782z0.m91393c());

    /* JADX INFO: renamed from: z0 */
    @NotNull
    public final Lazy f20477z0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.margininfo.dialog.k
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UtaLeverageSettingDialog.m21907b5();
        }
    });

    /* JADX INFO: renamed from: B0 */
    @NotNull
    public final C11939c f20467B0 = new C11939c();

    /* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$Companion;", "", "<init>", "()V", "DISABLED_ALPHA", "", "ENABLED_ALPHA", "ARG_LEVERAGE", "", "ARG_CURRENCY", "ARG_BASE_CURRENCY", "ARG_QUOTE_CURRENCY", "newInstance", "Lcom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog;", "leverage", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "baseCurrency", "quoteCurrency", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nUtaLeverageSettingDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtaLeverageSettingDialog.kt\ncom/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,633:1\n1#2:634\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ UtaLeverageSettingDialog newInstance$default(Companion companion, BigDecimal bigDecimal, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bigDecimal = null;
            }
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            return companion.newInstance(bigDecimal, str, str2, str3);
        }

        @NotNull
        public final UtaLeverageSettingDialog newInstance(@Nullable BigDecimal leverage, @NotNull String currency, @Nullable String baseCurrency, @Nullable String quoteCurrency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            UtaLeverageSettingDialog utaLeverageSettingDialog = new UtaLeverageSettingDialog();
            Bundle bundle = new Bundle();
            if (leverage != null) {
                bundle.putSerializable("leverage", leverage);
            }
            bundle.putString(FirebaseAnalytics.Param.CURRENCY, currency);
            if (baseCurrency != null) {
                bundle.putString("baseCurrency", baseCurrency);
            }
            if (quoteCurrency != null) {
                bundle.putString("quoteCurrency", quoteCurrency);
            }
            utaLeverageSettingDialog.setArguments(bundle);
            return utaLeverageSettingDialog;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$a */
    /* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$initSeekBar$1$1", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$IProgressFormatCallback;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11937a implements KcSeekBar.InterfaceC23002a {
        public C11937a() {
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23002a
        /* JADX INFO: renamed from: a */
        public String mo21944a(int i11, float f11, boolean z11) {
            String str;
            String strM92640e;
            int size = UtaLeverageSettingDialog.this.f20469r0.size() - 1;
            if (size <= 0) {
                BigDecimal bigDecimal = (BigDecimal) CollectionsKt.firstOrNull(UtaLeverageSettingDialog.this.f20469r0);
                if (bigDecimal == null || (strM92640e = C42180b.m92640e(bigDecimal, null, 0, false, false, false, 0, null, 125, null)) == null) {
                    str = null;
                } else {
                    str = strM92640e + 'x';
                }
                return str == null ? "" : str;
            }
            float f12 = 100.0f / size;
            int i12 = (int) (f11 / f12);
            int i13 = i12 + 1;
            int iCoerceIn = RangesKt.coerceIn(i12, 0, size);
            int iCoerceIn2 = RangesKt.coerceIn(i13, 0, size);
            BigDecimal bigDecimal2 = (BigDecimal) UtaLeverageSettingDialog.this.f20469r0.get(iCoerceIn);
            float fFloatValue = bigDecimal2.floatValue() + (((f11 - (iCoerceIn * f12)) / f12) * (((BigDecimal) UtaLeverageSettingDialog.this.f20469r0.get(iCoerceIn2)).floatValue() - bigDecimal2.floatValue()));
            StringBuilder sb2 = new StringBuilder();
            BigDecimal scale = new BigDecimal(fFloatValue).setScale(0, 0);
            Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
            sb2.append(C42180b.m92640e(scale, null, 0, false, false, false, 0, null, 125, null));
            sb2.append('x');
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$b */
    /* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$initSeekBar$1$2", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$OnSimpleProgressChangedListener;", "onChanged", "", "progress", "", "progressFloat", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11938b extends KcSeekBar.AbstractC23005d {
        public C11938b() {
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.AbstractC23005d
        /* JADX INFO: renamed from: c */
        public void mo21945c(int i11, float f11) {
            UtaLeverageSettingDialog utaLeverageSettingDialog = UtaLeverageSettingDialog.this;
            utaLeverageSettingDialog.f20470s0 = utaLeverageSettingDialog.m21930O4(i11);
            UtaLeverageSettingDialog.this.m21939d5();
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$c */
    /* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m90084d2 = {"com/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$mISectionTextFormatListener$1", "Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$ISectionTextFormatListener;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "intValue", "", "floatValue", "", "isFloat", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11939c implements KcSeekBar.InterfaceC23003b {
        public C11939c() {
        }

        @Override // com.kubi.resources.widget.bubbleseekbar.KcSeekBar.InterfaceC23003b
        /* JADX INFO: renamed from: a */
        public String mo21946a(int i11, float f11, boolean z11) {
            String str;
            String strM92640e;
            int size = UtaLeverageSettingDialog.this.f20469r0.size() - 1;
            if (size > 0) {
                return C42180b.m92640e((BigDecimal) UtaLeverageSettingDialog.this.f20469r0.get(C11958m.m21948a(f11, size)), null, 0, false, false, false, 0, null, 125, null) + 'x';
            }
            BigDecimal bigDecimal = (BigDecimal) CollectionsKt.firstOrNull(UtaLeverageSettingDialog.this.f20469r0);
            if (bigDecimal == null || (strM92640e = C42180b.m92640e(bigDecimal, null, 0, false, false, false, 0, null, 125, null)) == null) {
                str = null;
            } else {
                str = strM92640e + 'x';
            }
            return str == null ? "" : str;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$d */
    /* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/core/biz/margininfo/dialog/UtaLeverageSettingDialog$updateMaxBorrowAmountDisplay$2", "Landroid/text/style/MetricAffectingSpan;", "updateMeasureState", "", "textPaint", "Landroid/text/TextPaint;", "updateDrawState", "tp", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11940d extends MetricAffectingSpan {
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint tp2) {
            Intrinsics.checkNotNullParameter(tp2, "tp");
            tp2.setColor(C27017c.f54310a.m66512a(R$color.c_text));
            tp2.setFakeBoldText(true);
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
            textPaint.setFakeBoldText(true);
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$onViewCreated$2 */
    /* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$onViewCreated$2", m90122f = "UtaLeverageSettingDialog.kt", m90123i = {}, m90124l = {154}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119422 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$onViewCreated$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$onViewCreated$2$1", m90122f = "UtaLeverageSettingDialog.kt", m90123i = {}, m90124l = {156}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ UtaLeverageSettingDialog this$0;

            /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$onViewCreated$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
            @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m90084d2 = {"<anonymous>", "", "leverageConfig", "", "", "Ljava/math/BigDecimal;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$onViewCreated$2$1$1", m90122f = "UtaLeverageSettingDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
            public static final class C469781 extends SuspendLambda implements Function2<Map<String, ? extends BigDecimal>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ UtaLeverageSettingDialog this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C469781(UtaLeverageSettingDialog utaLeverageSettingDialog, Continuation<? super C469781> continuation) {
                    super(2, continuation);
                    this.this$0 = utaLeverageSettingDialog;
                }

                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C469781 c469781 = new C469781(this.this$0, continuation);
                    c469781.L$0 = obj;
                    return c469781;
                }

                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Map<String, ? extends BigDecimal> map, Continuation<? super Unit> continuation) {
                    return ((C469781) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Map map = (Map) this.L$0;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    UtaLeverageSettingDialog utaLeverageSettingDialog = this.this$0;
                    utaLeverageSettingDialog.f20470s0 = C41014a.m89922G((BigDecimal) map.get(utaLeverageSettingDialog.f20472u0), null, 1, null);
                    this.this$0.m21940e5();
                    this.this$0.m21936X4();
                    this.this$0.m21939d5();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UtaLeverageSettingDialog utaLeverageSettingDialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = utaLeverageSettingDialog;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41634e<Map<String, BigDecimal>> interfaceC41634eMo65005u = IUnifyAccountService.f53155a.get().mo65005u();
                    C469781 c469781 = new C469781(this.this$0, null);
                    this.label = 1;
                    if (C41636g.m90925l(interfaceC41634eMo65005u, c469781, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C119422(Continuation<? super C119422> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UtaLeverageSettingDialog.this.new C119422(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C119422) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                UtaLeverageSettingDialog utaLeverageSettingDialog = UtaLeverageSettingDialog.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(utaLeverageSettingDialog, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(utaLeverageSettingDialog, state, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$onViewCreated$3 */
    /* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$onViewCreated$3", m90122f = "UtaLeverageSettingDialog.kt", m90123i = {}, m90124l = {168}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C119433 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$onViewCreated$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$onViewCreated$3$1", m90122f = "UtaLeverageSettingDialog.kt", m90123i = {}, m90124l = {170}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ UtaLeverageSettingDialog this$0;

            /* JADX INFO: renamed from: com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$onViewCreated$3$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: UtaLeverageSettingDialog.kt */
            @Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "", "", "Ljava/math/BigDecimal;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.dialog.UtaLeverageSettingDialog$onViewCreated$3$1$1", m90122f = "UtaLeverageSettingDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
            public static final class C469791 extends SuspendLambda implements Function2<Map<String, ? extends List<? extends BigDecimal>>, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ UtaLeverageSettingDialog this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C469791(UtaLeverageSettingDialog utaLeverageSettingDialog, Continuation<? super C469791> continuation) {
                    super(2, continuation);
                    this.this$0 = utaLeverageSettingDialog;
                }

                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C469791(this.this$0, continuation);
                }

                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Map<String, ? extends List<? extends BigDecimal>> map, Continuation<? super Unit> continuation) {
                    return ((C469791) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.m21940e5();
                        this.this$0.m21936X4();
                        this.this$0.m21939d5();
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UtaLeverageSettingDialog utaLeverageSettingDialog, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = utaLeverageSettingDialog;
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41634e<Map<String, List<BigDecimal>>> interfaceC41634eMo64990d = IUnifyAccountService.f53155a.get().mo64990d();
                    C469791 c469791 = new C469791(this.this$0, null);
                    this.label = 1;
                    if (C41636g.m90925l(interfaceC41634eMo64990d, c469791, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C119433(Continuation<? super C119433> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UtaLeverageSettingDialog.this.new C119433(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C119433) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                UtaLeverageSettingDialog utaLeverageSettingDialog = UtaLeverageSettingDialog.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(utaLeverageSettingDialog, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(utaLeverageSettingDialog, state, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: k3 */
    public boolean mo15372k3() {
        return true;
    }

    /* JADX INFO: renamed from: R4 */
    private final void m21902R4() {
        C41696j.m91104d(this.f20475x0, null, null, new UtaLeverageSettingDialog$handleConfirm$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: Y4 */
    public static final void m21905Y4(KcSeekBar kcSeekBar, UtaLeverageSettingDialog utaLeverageSettingDialog) {
        kcSeekBar.setProgress(utaLeverageSettingDialog.m21931P4(utaLeverageSettingDialog.f20470s0));
    }

    /* JADX INFO: renamed from: a5 */
    public static final Unit m21906a5(UtaLeverageSettingDialog utaLeverageSettingDialog, Pair pair) {
        BaseTextView baseTextView;
        String currency;
        if (pair != null) {
            String str = (String) pair.component1();
            BigDecimal bigDecimal = (BigDecimal) pair.component2();
            utaLeverageSettingDialog.f20466A0 = C37890n.f85269a.m85613u(str);
            utaLeverageSettingDialog.f20472u0 = str;
            utaLeverageSettingDialog.f20470s0 = bigDecimal;
            C45406s c45406sM21929N4 = utaLeverageSettingDialog.m21929N4();
            if (c45406sM21929N4 != null && (baseTextView = c45406sM21929N4.f102333f) != null) {
                CoinInfoEntity coinInfoEntity = utaLeverageSettingDialog.f20466A0;
                if (coinInfoEntity != null && (currency = coinInfoEntity.getCurrency()) != null) {
                    str = currency;
                }
                baseTextView.setText(str);
            }
            utaLeverageSettingDialog.m21940e5();
            utaLeverageSettingDialog.m21936X4();
            utaLeverageSettingDialog.m21939d5();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public final void m21926K4() {
        InterfaceC41775x1 interfaceC41775x1 = this.f20476y0;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f20476y0 = C41696j.m91104d(this.f20475x0, null, null, new UtaLeverageSettingDialog$debounceFetchMaxBorrowAmount$1(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: M4 */
    public final Object m21928M4(Continuation<? super Unit> continuation) {
        UtaLeverageSettingDialog$fetchMaxBorrowAmount$1 utaLeverageSettingDialog$fetchMaxBorrowAmount$1;
        if (continuation instanceof UtaLeverageSettingDialog$fetchMaxBorrowAmount$1) {
            utaLeverageSettingDialog$fetchMaxBorrowAmount$1 = (UtaLeverageSettingDialog$fetchMaxBorrowAmount$1) continuation;
            int i11 = utaLeverageSettingDialog$fetchMaxBorrowAmount$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                utaLeverageSettingDialog$fetchMaxBorrowAmount$1.label = i11 - Integer.MIN_VALUE;
            } else {
                utaLeverageSettingDialog$fetchMaxBorrowAmount$1 = new UtaLeverageSettingDialog$fetchMaxBorrowAmount$1(this, continuation);
            }
        } else {
            utaLeverageSettingDialog$fetchMaxBorrowAmount$1 = new UtaLeverageSettingDialog$fetchMaxBorrowAmount$1(this, continuation);
        }
        Object objM42823d = utaLeverageSettingDialog$fetchMaxBorrowAmount$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = utaLeverageSettingDialog$fetchMaxBorrowAmount$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            int iIntValue = this.f20470s0.intValue();
            C44128b.m97266j("UtaLeverageSettingDialog", "fetchMaxBorrowAmount: currency=" + this.f20472u0 + ", leverage=" + iIntValue);
            InterfaceC41634e<Map<String, String>> interfaceC41634eM21868a = m21932Q4().m21868a(this.f20472u0, iIntValue);
            UtaLeverageSettingDialog$fetchMaxBorrowAmount$2 utaLeverageSettingDialog$fetchMaxBorrowAmount$2 = new UtaLeverageSettingDialog$fetchMaxBorrowAmount$2(this, null);
            utaLeverageSettingDialog$fetchMaxBorrowAmount$1.I$0 = iIntValue;
            utaLeverageSettingDialog$fetchMaxBorrowAmount$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM21868a, false, utaLeverageSettingDialog$fetchMaxBorrowAmount$2, utaLeverageSettingDialog$fetchMaxBorrowAmount$1);
            if (objM42823d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42823d);
        }
        if (((C19334f) objM42823d).getThrowable() != null) {
            m21941f5(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public final C45406s m21929N4() {
        return (C45406s) this.f20468q0.getValue(this, f20465D0[0]);
    }

    /* JADX INFO: renamed from: O4 */
    public final BigDecimal m21930O4(int i11) {
        if (this.f20469r0.isEmpty()) {
            return new BigDecimal(1);
        }
        if (this.f20469r0.size() == 1) {
            return (BigDecimal) CollectionsKt.first((List) this.f20469r0);
        }
        return this.f20469r0.get(RangesKt.coerceIn(MathKt.roundToInt(i11 / (100.0f / (this.f20469r0.size() - 1))), 0, this.f20469r0.size() - 1));
    }

    /* JADX INFO: renamed from: P4 */
    public final float m21931P4(BigDecimal bigDecimal) {
        if (this.f20469r0.isEmpty() || this.f20469r0.size() == 1) {
            return 0.0f;
        }
        Iterator<BigDecimal> it = this.f20469r0.iterator();
        int iIntValue = 0;
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (it.next().compareTo(bigDecimal) == 0) {
                break;
            }
            i11++;
        }
        Integer numValueOf = Integer.valueOf(i11);
        Integer next = null;
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            Iterator<Integer> it2 = CollectionsKt.getIndices(this.f20469r0).iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    float fAbs = Math.abs(this.f20469r0.get(next.intValue()).floatValue() - bigDecimal.floatValue());
                    do {
                        Integer next2 = it2.next();
                        float fAbs2 = Math.abs(this.f20469r0.get(next2.intValue()).floatValue() - bigDecimal.floatValue());
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            next = next2;
                            fAbs = fAbs2;
                        }
                    } while (it2.hasNext());
                }
            }
            Integer num = next;
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        return RangesKt.coerceAtMost(RangesKt.coerceAtLeast((iIntValue / (this.f20469r0.size() - 1)) * 100.0f, 0.0f), 100.0f);
    }

    /* JADX INFO: renamed from: Q4 */
    public final IMarginInfoApi m21932Q4() {
        Object value = this.f20477z0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IMarginInfoApi) value;
    }

    /* JADX INFO: renamed from: T4 */
    public final int m21934T4() {
        Iterator<BigDecimal> it = this.f20469r0.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().compareTo(this.f20470s0) == 0) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m21937Z4() {
        UnifyLoanCurrencySelectDialog unifyLoanCurrencySelectDialogCreate = UnifyLoanCurrencySelectDialog.f20449w0.create(this.f20472u0, this.f20473v0, this.f20474w0);
        unifyLoanCurrencySelectDialogCreate.m21885w4(new Function1() { // from class: com.kubi.core.biz.margininfo.dialog.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UtaLeverageSettingDialog.m21906a5(this.f20492b, (Pair) obj);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        unifyLoanCurrencySelectDialogCreate.show(childFragmentManager, "UnifyLoanCurrencySelectDialog");
    }

    /* JADX INFO: renamed from: c5 */
    public final void m21938c5() {
        ShapeImageView shapeImageView;
        ShapeImageView shapeImageView2;
        ShapeImageView shapeImageView3;
        ShapeImageView shapeImageView4;
        if (this.f20469r0.size() <= 1) {
            C45406s c45406sM21929N4 = m21929N4();
            if (c45406sM21929N4 != null && (shapeImageView2 = c45406sM21929N4.f102336i) != null) {
                shapeImageView2.setEnabled(false);
                shapeImageView2.setAlpha(0.5f);
            }
            C45406s c45406sM21929N5 = m21929N4();
            if (c45406sM21929N5 == null || (shapeImageView = c45406sM21929N5.f102337j) == null) {
                return;
            }
            shapeImageView.setEnabled(false);
            shapeImageView.setAlpha(0.5f);
            return;
        }
        int iM21934T4 = m21934T4();
        boolean z11 = iM21934T4 <= 0;
        boolean z12 = iM21934T4 >= this.f20469r0.size() - 1;
        C45406s c45406sM21929N6 = m21929N4();
        if (c45406sM21929N6 != null && (shapeImageView4 = c45406sM21929N6.f102336i) != null) {
            shapeImageView4.setEnabled(!z11);
            shapeImageView4.setAlpha(z11 ? 0.5f : 1.0f);
        }
        C45406s c45406sM21929N7 = m21929N4();
        if (c45406sM21929N7 == null || (shapeImageView3 = c45406sM21929N7.f102337j) == null) {
            return;
        }
        shapeImageView3.setEnabled(!z12);
        shapeImageView3.setAlpha(z12 ? 0.5f : 1.0f);
    }

    /* JADX INFO: renamed from: e5 */
    public final void m21940e5() {
        List<BigDecimal> listMo64988b = IUnifyAccountService.f53155a.get().mo64988b(this.f20472u0);
        this.f20469r0.clear();
        this.f20469r0.addAll(listMo64988b);
        m21943h5();
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.dialog_uta_leverage_setting, container, false);
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("leverage");
            BigDecimal bigDecimal = serializable instanceof BigDecimal ? (BigDecimal) serializable : null;
            if (bigDecimal != null) {
                this.f20470s0 = bigDecimal;
            }
            String string = arguments.getString(FirebaseAnalytics.Param.CURRENCY);
            if (string != null) {
                this.f20472u0 = string;
            }
            this.f20473v0 = arguments.getString("baseCurrency");
            this.f20474w0 = arguments.getString("quoteCurrency");
        }
        this.f20466A0 = C37890n.f85269a.m85613u(this.f20472u0);
        m21940e5();
        initView();
        m21925F4();
        IUnifyAccountService.Companion companion = IUnifyAccountService.f53155a;
        companion.get().mo64981E();
        companion.get().mo64998n();
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C119422(null), 3, null);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C119433(null), 3, null);
        m21941f5(null);
    }

    /* JADX INFO: renamed from: G4 */
    public static final Unit m21898G4(UtaLeverageSettingDialog utaLeverageSettingDialog) {
        utaLeverageSettingDialog.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m21899H4(UtaLeverageSettingDialog utaLeverageSettingDialog) {
        utaLeverageSettingDialog.m21927L4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m21900I4(UtaLeverageSettingDialog utaLeverageSettingDialog) {
        utaLeverageSettingDialog.m21933S4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m21901J4(UtaLeverageSettingDialog utaLeverageSettingDialog) {
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        C45406s c45406sM21929N4 = utaLeverageSettingDialog.m21929N4();
        if (c45406sM21929N4 != null && (kcPrimaryButton2 = c45406sM21929N4.f102329b) != null && kcPrimaryButton2.getF44406k()) {
            return Unit.INSTANCE;
        }
        C45406s c45406sM21929N5 = utaLeverageSettingDialog.m21929N4();
        if (c45406sM21929N5 != null && (kcPrimaryButton = c45406sM21929N5.f102329b) != null) {
            kcPrimaryButton.m55043o();
        }
        utaLeverageSettingDialog.m21902R4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V4 */
    public static final Unit m21903V4(UtaLeverageSettingDialog utaLeverageSettingDialog) {
        utaLeverageSettingDialog.m21937Z4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W4 */
    public static final Unit m21904W4(UtaLeverageSettingDialog utaLeverageSettingDialog) {
        utaLeverageSettingDialog.m21937Z4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b5 */
    public static final IMarginInfoApi m21907b5() {
        return (IMarginInfoApi) C42597a.m93388d().create(IMarginInfoApi.class);
    }

    private final void initView() {
        m21939d5();
        m21943h5();
        m21936X4();
        m21935U4();
    }

    /* JADX INFO: renamed from: F4 */
    public final void m21925F4() {
        KcPrimaryButton kcPrimaryButton;
        ShapeImageView shapeImageView;
        ShapeImageView shapeImageView2;
        ImageView imageView;
        C45406s c45406sM21929N4 = m21929N4();
        if (c45406sM21929N4 != null && (imageView = c45406sM21929N4.f102332e) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.core.biz.margininfo.dialog.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaLeverageSettingDialog.m21898G4(this.f20484b);
                }
            }, 1, null);
        }
        C45406s c45406sM21929N5 = m21929N4();
        if (c45406sM21929N5 != null && (shapeImageView2 = c45406sM21929N5.f102336i) != null) {
            C27046k.m66711z(shapeImageView2, 0L, new Function0() { // from class: com.kubi.core.biz.margininfo.dialog.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaLeverageSettingDialog.m21899H4(this.f20485b);
                }
            }, 1, null);
        }
        C45406s c45406sM21929N6 = m21929N4();
        if (c45406sM21929N6 != null && (shapeImageView = c45406sM21929N6.f102337j) != null) {
            C27046k.m66711z(shapeImageView, 0L, new Function0() { // from class: com.kubi.core.biz.margininfo.dialog.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaLeverageSettingDialog.m21900I4(this.f20486b);
                }
            }, 1, null);
        }
        C45406s c45406sM21929N7 = m21929N4();
        if (c45406sM21929N7 != null && (kcPrimaryButton = c45406sM21929N7.f102329b) != null) {
            C27046k.m66710y(kcPrimaryButton, 1000L, new Function0() { // from class: com.kubi.core.biz.margininfo.dialog.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaLeverageSettingDialog.m21901J4(this.f20487b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: L4 */
    public final void m21927L4() {
        int iM21934T4 = m21934T4();
        if (iM21934T4 > 0) {
            this.f20470s0 = this.f20469r0.get(iM21934T4 - 1);
            m21939d5();
            m21942g5();
        }
    }

    /* JADX INFO: renamed from: S4 */
    public final void m21933S4() {
        int iM21934T4 = m21934T4();
        if (iM21934T4 < this.f20469r0.size() - 1) {
            this.f20470s0 = this.f20469r0.get(iM21934T4 + 1);
            m21939d5();
            m21942g5();
        }
    }

    /* JADX INFO: renamed from: U4 */
    public final void m21935U4() {
        String currency;
        C45406s c45406sM21929N4 = m21929N4();
        if (c45406sM21929N4 != null) {
            BaseTextView baseTextView = c45406sM21929N4.f102333f;
            CoinInfoEntity coinInfoEntity = this.f20466A0;
            if (coinInfoEntity == null || (currency = coinInfoEntity.getCurrency()) == null) {
                currency = this.f20472u0;
            }
            baseTextView.setText(currency);
            AppCompatImageView ivCurrencyArrow = c45406sM21929N4.f102330c;
            Intrinsics.checkNotNullExpressionValue(ivCurrencyArrow, "ivCurrencyArrow");
            C27046k.m66711z(ivCurrencyArrow, 0L, new Function0() { // from class: com.kubi.core.biz.margininfo.dialog.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaLeverageSettingDialog.m21903V4(this.f20488b);
                }
            }, 1, null);
            BaseTextView tvCurrency = c45406sM21929N4.f102333f;
            Intrinsics.checkNotNullExpressionValue(tvCurrency, "tvCurrency");
            C27046k.m66711z(tvCurrency, 0L, new Function0() { // from class: com.kubi.core.biz.margininfo.dialog.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UtaLeverageSettingDialog.m21904W4(this.f20489b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: X4 */
    public final void m21936X4() {
        final KcSeekBar kcSeekBar;
        C45406s c45406sM21929N4 = m21929N4();
        if (c45406sM21929N4 != null && (kcSeekBar = c45406sM21929N4.f102331d) != null) {
            kcSeekBar.setSectionTextFormatCallback(this.f20467B0);
            if (this.f20469r0.size() > 1) {
                kcSeekBar.setMin(0.0f);
                kcSeekBar.setMax(100.0f);
                kcSeekBar.setProgress(0.0f);
                kcSeekBar.setSectionCount(this.f20469r0.size() - 1);
                kcSeekBar.requestLayout();
                kcSeekBar.setProgressFormatCallback(new C11937a());
                kcSeekBar.setOnSimpleProgressChangedListener(new C11938b());
                kcSeekBar.setAutoAdjustSectionOnTouchUp(true);
                kcSeekBar.post(new Runnable() { // from class: com.kubi.core.biz.margininfo.dialog.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        UtaLeverageSettingDialog.m21905Y4(kcSeekBar, this);
                    }
                });
            }
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: d5 */
    public final void m21939d5() {
        BaseTextView baseTextView;
        C45406s c45406sM21929N4 = m21929N4();
        if (c45406sM21929N4 != null && (baseTextView = c45406sM21929N4.f102334g) != null) {
            baseTextView.setText(C6447a.m11724a(this.f20470s0).toPlainString() + 'x');
        }
        m21926K4();
        m21938c5();
    }

    /* JADX INFO: renamed from: f5 */
    public final void m21941f5(String str) {
        int precision;
        String strM92640e;
        String currency;
        BaseTextView baseTextView;
        BigDecimal bigDecimalOrNull;
        if (isAdded()) {
            CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(this.f20472u0);
            if (coinInfoEntityM85613u != null) {
                precision = coinInfoEntityM85613u.getPrecision();
            } else {
                precision = 8;
            }
            int i11 = precision;
            if (str != null && (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(str)) != null) {
                strM92640e = C42180b.m92640e(bigDecimalOrNull, null, i11, false, false, false, 0, null, 125, null);
            } else {
                strM92640e = null;
            }
            String strM92647l = C42180b.m92647l(strM92640e);
            int i12 = R$string.unify_max_leverage_allowed;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strM92647l);
            sb2.append(' ');
            CoinInfoEntity coinInfoEntity = this.f20466A0;
            if (coinInfoEntity == null || (currency = coinInfoEntity.getCurrency()) == null) {
                currency = this.f20472u0;
            }
            sb2.append(currency);
            String string = getString(i12, sb2.toString());
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            C45406s c45406sM21929N4 = m21929N4();
            if (c45406sM21929N4 != null && (baseTextView = c45406sM21929N4.f102335h) != null) {
                ViewExtKt.m66594y(baseTextView);
                baseTextView.setText(string);
                baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
                baseTextView.setHighlightColor(0);
                HighlightTextHelper.f43497a.m54116a(baseTextView, HighlightTextHelper.TextTagEnum.SPAN, new C11940d());
            }
        }
    }

    /* JADX INFO: renamed from: g5 */
    public final void m21942g5() {
        KcSeekBar kcSeekBar;
        C45406s c45406sM21929N4 = m21929N4();
        if (c45406sM21929N4 != null && (kcSeekBar = c45406sM21929N4.f102331d) != null) {
            kcSeekBar.setProgress(m21931P4(this.f20470s0));
        }
    }

    /* JADX INFO: renamed from: h5 */
    public final void m21943h5() {
        C45406s c45406sM21929N4 = m21929N4();
        if (c45406sM21929N4 != null) {
            int i11 = 0;
            boolean z11 = true;
            if (this.f20469r0.size() <= 1) {
                z11 = false;
            }
            KcSeekBar kcSeekBar = c45406sM21929N4.f102331d;
            if (!z11) {
                i11 = 8;
            }
            kcSeekBar.setVisibility(i11);
            m21938c5();
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper, com.kubi.resources.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C41713n0.m91129e(this.f20475x0, null, 1, null);
    }
}
