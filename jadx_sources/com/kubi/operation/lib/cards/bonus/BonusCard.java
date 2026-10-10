package com.kubi.operation.lib.cards.bonus;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.GravityCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.SimpleStateCard;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.monitor.utils.DeviceLevel;
import com.kubi.operation.lib.R$color;
import com.kubi.operation.lib.R$dimen;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.entity.BonusLottieConfigEntity;
import com.kubi.operation.lib.entity.BonusTaskEntity;
import com.kubi.operation.lib.entity.WelfareTaskInfoEntity;
import com.kubi.operation.lib.utils.C19553c;
import com.kubi.operation.lib.utils.C19570t;
import com.kubi.operation.lib.utils.CountDownHelper;
import com.kubi.operation.lib.utils.CountdownType;
import com.kubi.operation.lib.utils.OperationHomeHelper;
import com.kubi.operation.lib.widget.Bouns3TaskView;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.shimmer.C22911a;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.api.ISearchService;
import com.kubi.search.api.entity.SearchHintEntity;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27034h;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.wallet.api.IWalletService;
import cr.C36522b;
import f00.C37304a;
import g00.InterfaceC37760l;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import k00.C40848l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p213dw.InterfaceC36986b;
import p429lf.C42180b;
import p569qq.C43846g;
import p569qq.C43852m;
import p701vs.C45629f;
import p701vs.C45634k;
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
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: BonusCard.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020\u001bH\u0014J\u0010\u0010$\u001a\u0004\u0018\u00010\u0019*\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010\u0019H\u0007J\b\u0010'\u001a\u00020\u001bH\u0002J\b\u0010(\u001a\u00020\u001bH\u0016J\b\u0010)\u001a\u00020\u001bH\u0016J\b\u0010*\u001a\u00020\u001bH\u0016J\b\u0010+\u001a\u00020\u001bH\u0016J\b\u0010,\u001a\u00020\u001bH\u0016J\b\u0010/\u001a\u00020\u001bH\u0002J\b\u00103\u001a\u00020\u001bH\u0002J\u001c\u00104\u001a\u00020\u001b2\b\b\u0002\u00105\u001a\u0002012\b\b\u0002\u00106\u001a\u000201H\u0002J\b\u00109\u001a\u00020\u000bH\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00107\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u00108¨\u0006:"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/bonus/BonusCard;", "Lcom/kubi/kucoin/home/cards/SimpleStateCard;", "Lcom/kubi/operation/lib/cards/bonus/BonusCardContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/operation/lib/cards/bonus/BonusCardVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/operation/lib/databinding/OperationHomecardBonusBinding;", "getBinding$OperationLib_googleRelease", "()Lcom/kubi/operation/lib/databinding/OperationHomecardBonusBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "countDownHelper", "Lcom/kubi/operation/lib/utils/CountDownHelper;", "getCountDownHelper", "()Lcom/kubi/operation/lib/utils/CountDownHelper;", "countDownHelper$delegate", "Lkotlin/Lazy;", "currentEntity", "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "initView", "", "initSearchBar", "bindToUI", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "bindFlowEvent", "preCheckPassed", "fillViewData", "remoteEntity", "adjustBonusCenterEntrance", "onAgainShow", "onMoveStart", "onMoveStop", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "currentSearchHint", "Lcom/kubi/search/api/entity/SearchHintEntity;", "refreshSearchGuideWord", "lottieGiftBoxEnd", "", "lottieParticleEnd", "initLottieAnim", "execAnimation", "resume", "pause", "currentLottieAnimCount", "Ljava/lang/Integer;", "lottieAnimCount", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBonusCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BonusCard.kt\ncom/kubi/operation/lib/cards/bonus/BonusCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,383:1\n147#2,16:384\n76#3,7:400\n153#3,7:407\n153#3,7:414\n35#4,4:421\n39#4:427\n44#5,2:425\n1#6:428\n34#7:429\n*S KotlinDebug\n*F\n+ 1 BonusCard.kt\ncom/kubi/operation/lib/cards/bonus/BonusCard\n*L\n81#1:384,16\n153#1:400,7\n172#1:407,7\n174#1:414,7\n373#1:421,4\n373#1:427\n373#1:425,2\n257#1:429\n*E\n"})
public final class BonusCard extends SimpleStateCard<BonusCardContract$UIState> {

    /* JADX INFO: renamed from: e0 */
    public static final /* synthetic */ KProperty<Object>[] f36672e0 = {Reflection.property1(new PropertyReference1Impl(BonusCard.class, "binding", "getBinding$OperationLib_googleRelease()Lcom/kubi/operation/lib/databinding/OperationHomecardBonusBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f36673X = C45681e.m100799e(this, new Function1<BonusCard, C45629f>() { // from class: com.kubi.operation.lib.cards.bonus.BonusCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45629f invoke(@NotNull BonusCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45629f.m100743a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45629f, Unit>() { // from class: com.kubi.operation.lib.cards.bonus.BonusCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45629f it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45629f c45629f) {
            invoke(c45629f);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f36674Y = LazyKt.lazy(new Function0() { // from class: com.kubi.operation.lib.cards.bonus.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BonusCard.m43301A3();
        }
    });

    /* JADX INFO: renamed from: Z */
    @Nullable
    public WelfareTaskInfoEntity f36675Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public SearchHintEntity f36676a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f36677b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f36678c0;

    /* JADX INFO: renamed from: d0 */
    @Nullable
    public Integer f36679d0;

    /* JADX INFO: renamed from: com.kubi.operation.lib.cards.bonus.BonusCard$b */
    /* JADX INFO: compiled from: BonusCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/operation/lib/cards/bonus/BonusCard$initLottieAnim$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19444b extends AnimatorListenerAdapter {
        public C19444b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            BonusCard.this.f36677b0 = true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.operation.lib.cards.bonus.BonusCard$c */
    /* JADX INFO: compiled from: BonusCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/operation/lib/cards/bonus/BonusCard$initLottieAnim$2", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19445c extends AnimatorListenerAdapter {
        public C19445c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            BonusCard.this.f36678c0 = true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.operation.lib.cards.bonus.BonusCard$d */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C19446d extends TypeToken<BonusLottieConfigEntity> {
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m43310O3() {
        C12572a.m23695d("com.kubi.home.event.HomeEvent:openQrCodeScan", null, 0L, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.kubi.operation.lib.cards.bonus.BonusCard$a */
    /* JADX INFO: compiled from: BonusCard.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C19443a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceLevel.values().length];
            try {
                iArr[DeviceLevel.BEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceLevel.HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceLevel.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A3 */
    public static final CountDownHelper m43301A3() {
        return new CountDownHelper(CountdownType.Bonus);
    }

    /* JADX INFO: renamed from: C3 */
    public static /* synthetic */ void m43302C3(BonusCard bonusCard, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        bonusCard.m43331B3(z11, z12);
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m43304F3(BonusCard bonusCard, WelfareTaskInfoEntity welfareTaskInfoEntity) throws JSONException {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        LinearLayoutCompat linearLayoutCompat;
        Bouns3TaskView bouns3TaskView;
        LinearLayoutCompat linearLayoutCompat2;
        LinearLayoutCompat linearLayoutCompat3;
        C45634k c45634k;
        LinearLayoutCompat root;
        C45629f c45629fM43333J3;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        KcPrimaryButton kcPrimaryButton;
        KcPrimaryButton kcPrimaryButton2;
        LinearLayoutCompat linearLayoutCompat4;
        BaseTextView baseTextView3;
        LinearLayoutCompat linearLayoutCompat5;
        Bouns3TaskView bouns3TaskView2;
        Bouns3TaskView bouns3TaskView3;
        LinearLayoutCompat linearLayoutCompat6;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        LottieAnimationView lottieAnimationView;
        final WelfareTaskInfoEntity welfareTaskInfoEntityM43311Q3 = bonusCard.m43311Q3(welfareTaskInfoEntity);
        if (welfareTaskInfoEntityM43311Q3 == null) {
            return Unit.INSTANCE;
        }
        C45629f c45629fM43333J4 = bonusCard.m43333J3();
        if (c45629fM43333J4 != null && (lottieAnimationView = c45629fM43333J4.f102824i) != null) {
            C27046k.m66711z(lottieAnimationView, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.bonus.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BonusCard.m43305G3(welfareTaskInfoEntityM43311Q3);
                }
            }, 1, null);
        }
        String strM43671i = C19570t.m43671i(welfareTaskInfoEntityM43311Q3.getTitle());
        Boolean boolValueOf = null;
        if (strM43671i.length() > 0) {
            C45629f c45629fM43333J5 = bonusCard.m43333J3();
            if (c45629fM43333J5 != null && (baseTextView11 = c45629fM43333J5.f102837v) != null) {
                C27046k.m66685H(baseTextView11);
            }
            C45629f c45629fM43333J6 = bonusCard.m43333J3();
            if (c45629fM43333J6 != null && (baseTextView10 = c45629fM43333J6.f102837v) != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                BigDecimal bigDecimalM66671k = C27041f.m66671k(welfareTaskInfoEntityM43311Q3.getAmount());
                String str = String.format(strM43671i, Arrays.copyOf(new Object[]{bigDecimalM66671k != null ? C42180b.m92640e(bigDecimalM66671k, null, 0, false, false, false, 0, null, 127, null) : null}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                baseTextView10.setText(str);
                HighlightTextHelper.f43497a.m54116a(baseTextView10, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(bonusCard.getColorRes(R$color.brandGreen)));
            }
        } else {
            C45629f c45629fM43333J7 = bonusCard.m43333J3();
            if (c45629fM43333J7 != null && (baseTextView = c45629fM43333J7.f102837v) != null) {
                C27046k.m66700o(baseTextView);
            }
        }
        String subtitle = welfareTaskInfoEntityM43311Q3.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        if (subtitle.length() > 0) {
            C45629f c45629fM43333J8 = bonusCard.m43333J3();
            if (c45629fM43333J8 != null && (baseTextView9 = c45629fM43333J8.f102836u) != null) {
                C27046k.m66685H(baseTextView9);
            }
            C45629f c45629fM43333J9 = bonusCard.m43333J3();
            if (c45629fM43333J9 != null && (baseTextView8 = c45629fM43333J9.f102836u) != null) {
                baseTextView8.setText(welfareTaskInfoEntityM43311Q3.getSubtitle());
            }
        } else {
            C45629f c45629fM43333J10 = bonusCard.m43333J3();
            if (c45629fM43333J10 != null && (baseTextView2 = c45629fM43333J10.f102836u) != null) {
                C27046k.m66685H(baseTextView2);
            }
        }
        C45629f c45629fM43333J11 = bonusCard.m43333J3();
        if (c45629fM43333J11 != null && (baseTextView7 = c45629fM43333J11.f102829n) != null) {
            baseTextView7.setText(welfareTaskInfoEntityM43311Q3.getCountDownTipsDay());
        }
        C45629f c45629fM43333J12 = bonusCard.m43333J3();
        if (c45629fM43333J12 != null && (baseTextView6 = c45629fM43333J12.f102831p) != null) {
            baseTextView6.setText(welfareTaskInfoEntityM43311Q3.getCountDownTipsHour());
        }
        C45629f c45629fM43333J13 = bonusCard.m43333J3();
        if (c45629fM43333J13 != null && (baseTextView5 = c45629fM43333J13.f102833r) != null) {
            baseTextView5.setText(welfareTaskInfoEntityM43311Q3.getCountDownTipsMinute());
        }
        C45629f c45629fM43333J14 = bonusCard.m43333J3();
        if (c45629fM43333J14 != null && (baseTextView4 = c45629fM43333J14.f102835t) != null) {
            baseTextView4.setText(welfareTaskInfoEntityM43311Q3.getCountDownTipsSecond());
        }
        long jM66652l = C27039d.m66652l(welfareTaskInfoEntityM43311Q3.getCountDownTime());
        if (jM66652l > 0) {
            C45629f c45629fM43333J15 = bonusCard.m43333J3();
            if (c45629fM43333J15 != null && (linearLayoutCompat6 = c45629fM43333J15.f102821f) != null) {
                C27046k.m66685H(linearLayoutCompat6);
            }
            bonusCard.m43308K3().m43607i(LifecycleOwnerKt.getLifecycleScope(bonusCard), Long.valueOf(C27039d.m66652l(Long.valueOf(jM66652l))));
        } else {
            C45629f c45629fM43333J16 = bonusCard.m43333J3();
            if (c45629fM43333J16 != null && (linearLayoutCompat = c45629fM43333J16.f102821f) != null) {
                C27046k.m66700o(linearLayoutCompat);
            }
        }
        List<BonusTaskEntity> limitTaskList = welfareTaskInfoEntityM43311Q3.getLimitTaskList();
        if (limitTaskList == null) {
            limitTaskList = CollectionsKt.emptyList();
        }
        List<BonusTaskEntity> listTake = CollectionsKt.take(limitTaskList, 3);
        if (listTake.isEmpty() || C19553c.m43655c() <= 0) {
            C45629f c45629fM43333J17 = bonusCard.m43333J3();
            if (c45629fM43333J17 != null && (bouns3TaskView = c45629fM43333J17.f102826k) != null) {
                C27046k.m66700o(bouns3TaskView);
            }
        } else {
            C45629f c45629fM43333J18 = bonusCard.m43333J3();
            if (c45629fM43333J18 != null && (bouns3TaskView3 = c45629fM43333J18.f102826k) != null) {
                C27046k.m66685H(bouns3TaskView3);
            }
        }
        C45629f c45629fM43333J19 = bonusCard.m43333J3();
        if (c45629fM43333J19 != null && (bouns3TaskView2 = c45629fM43333J19.f102826k) != null) {
            bouns3TaskView2.m43701e(listTake);
        }
        String rewardCenterTips = welfareTaskInfoEntityM43311Q3.getRewardCenterTips();
        String str2 = rewardCenterTips != null ? rewardCenterTips : "";
        if (str2.length() > 0) {
            C45629f c45629fM43333J20 = bonusCard.m43333J3();
            if (c45629fM43333J20 != null && (linearLayoutCompat5 = c45629fM43333J20.f102819d) != null) {
                C27046k.m66685H(linearLayoutCompat5);
            }
        } else {
            C45629f c45629fM43333J21 = bonusCard.m43333J3();
            if (c45629fM43333J21 != null && (linearLayoutCompat2 = c45629fM43333J21.f102819d) != null) {
                C27046k.m66700o(linearLayoutCompat2);
            }
        }
        C45629f c45629fM43333J22 = bonusCard.m43333J3();
        if (c45629fM43333J22 != null && (baseTextView3 = c45629fM43333J22.f102827l) != null) {
            baseTextView3.setText(str2);
        }
        C45629f c45629fM43333J23 = bonusCard.m43333J3();
        if (c45629fM43333J23 != null && (linearLayoutCompat4 = c45629fM43333J23.f102819d) != null) {
            C27046k.m66711z(linearLayoutCompat4, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.bonus.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BonusCard.m43306H3(welfareTaskInfoEntityM43311Q3);
                }
            }, 1, null);
        }
        bonusCard.m43337y3();
        C45629f c45629fM43333J24 = bonusCard.m43333J3();
        if (c45629fM43333J24 != null && (kcPrimaryButton2 = c45629fM43333J24.f102817b) != null) {
            kcPrimaryButton2.setText(welfareTaskInfoEntityM43311Q3.getBtnTips());
        }
        C45629f c45629fM43333J25 = bonusCard.m43333J3();
        if (c45629fM43333J25 != null && (kcPrimaryButton = c45629fM43333J25.f102817b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.bonus.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BonusCard.m43307I3(welfareTaskInfoEntityM43311Q3);
                }
            }, 1, null);
        }
        C45629f c45629fM43333J26 = bonusCard.m43333J3();
        if (c45629fM43333J26 != null && (c45634k = c45629fM43333J26.f102823h) != null && (root = c45634k.getRoot()) != null) {
            C27046k.m66700o(root);
            C45629f c45629fM43333J27 = bonusCard.m43333J3();
            if (c45629fM43333J27 != null && (frameLayout2 = c45629fM43333J27.f102822g) != null) {
                boolValueOf = Boolean.valueOf(frameLayout2.indexOfChild(root) != -1);
            }
            if (C27025c.m66566d(boolValueOf) && (c45629fM43333J3 = bonusCard.m43333J3()) != null && (frameLayout = c45629fM43333J3.f102822g) != null) {
                frameLayout.removeView(root);
            }
        }
        C45629f c45629fM43333J28 = bonusCard.m43333J3();
        if (c45629fM43333J28 != null && (linearLayoutCompat3 = c45629fM43333J28.f102820e) != null) {
            C27046k.m66685H(linearLayoutCompat3);
        }
        C12572a.m23695d("com.kubi.home.event.HomeEvent:displaySpotlightBg", Boolean.TRUE, 0L, 4, null);
        OperationHomeHelper.m43674g(OperationHomeHelper.f36890a, "noLoginedWelfare", null, null, 3, null);
        bonusCard.f36675Z = welfareTaskInfoEntityM43311Q3;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public final CountDownHelper m43308K3() {
        return (CountDownHelper) this.f36674Y.getValue();
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m43309N3(BonusCard bonusCard) throws JSONException {
        SearchHintEntity searchHintEntity = bonusCard.f36676a0;
        String value = searchHintEntity != null ? searchHintEntity.getValue() : null;
        String str = value == null ? "" : value;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("contentItem", str);
        jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
        String type = searchHintEntity != null ? searchHintEntity.getType() : null;
        if (type == null) {
            type = "";
        }
        jSONObject.put("messageType", type);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(HomeCardViewHolderProxy.PAGE_ID, FirebaseAnalytics.Event.SEARCH, "1", jSONObject);
        C37304a c37304a = C37304a.f82764a;
        String strM96601m = C43852m.m96601m(HomeCardViewHolderProxy.PAGE_ID, FirebaseAnalytics.Event.SEARCH, "1");
        String type2 = searchHintEntity != null ? searchHintEntity.getType() : null;
        InterfaceC37760l.a.m85175a(c37304a, "HOME", str, type2 == null ? "" : type2, null, strM96601m, null, null, 104, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public final void m43312R3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.cards.bonus.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BonusCard.m43313S3(this.f36684b);
            }
        });
    }

    /* JADX INFO: renamed from: B3 */
    public final void m43331B3(final boolean z11, final boolean z12) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.cards.bonus.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BonusCard.m43303D3(this.f36685b, z11, z12);
            }
        });
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: E3 */
    public final void m43332E3(@Nullable final WelfareTaskInfoEntity welfareTaskInfoEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.cards.bonus.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BonusCard.m43304F3(this.f36688b, welfareTaskInfoEntity);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: J3 */
    public final C45629f m43333J3() {
        return (C45629f) this.f36673X.getValue(this, f36672e0[0]);
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard, com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: K1 */
    public void mo28980K1(@NotNull BaseCardData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.mo28980K1(data);
        C19553c.m43657e();
        sendIntent(new BonusCardContract$UiIntent.LoadData(false, 1, null));
    }

    /* JADX INFO: renamed from: L3 */
    public final void m43334L3() {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        LottieAnimationView lottieAnimationView3;
        LottieAnimationView lottieAnimationView4;
        LottieAnimationView lottieAnimationView5;
        LottieAnimationView lottieAnimationView6;
        LottieAnimationView lottieAnimationView7;
        String str = DayNightThemeManager.f28592a.m33187l() ? "home_bonus_gift_box_day.json" : "home_bonus_gift_box_night.json";
        C45629f c45629fM43333J3 = m43333J3();
        if (c45629fM43333J3 != null && (lottieAnimationView7 = c45629fM43333J3.f102824i) != null) {
            lottieAnimationView7.setAnimation(str);
        }
        int iM43336P3 = m43336P3();
        C45629f c45629fM43333J4 = m43333J3();
        if (c45629fM43333J4 != null && (lottieAnimationView6 = c45629fM43333J4.f102824i) != null) {
            lottieAnimationView6.setRepeatCount(iM43336P3);
        }
        C45629f c45629fM43333J5 = m43333J3();
        if (c45629fM43333J5 != null && (lottieAnimationView5 = c45629fM43333J5.f102825j) != null) {
            lottieAnimationView5.setRepeatCount(iM43336P3);
        }
        if (iM43336P3 != 0) {
            C45629f c45629fM43333J6 = m43333J3();
            if (c45629fM43333J6 != null && (lottieAnimationView4 = c45629fM43333J6.f102824i) != null) {
                lottieAnimationView4.removeAllAnimatorListeners();
            }
            C45629f c45629fM43333J7 = m43333J3();
            if (c45629fM43333J7 != null && (lottieAnimationView3 = c45629fM43333J7.f102824i) != null) {
                lottieAnimationView3.addAnimatorListener(new C19444b());
            }
            C45629f c45629fM43333J8 = m43333J3();
            if (c45629fM43333J8 != null && (lottieAnimationView2 = c45629fM43333J8.f102825j) != null) {
                lottieAnimationView2.removeAllAnimatorListeners();
            }
            C45629f c45629fM43333J9 = m43333J3();
            if (c45629fM43333J9 != null && (lottieAnimationView = c45629fM43333J9.f102825j) != null) {
                lottieAnimationView.addAnimatorListener(new C19445c());
            }
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new BonusCard$initLottieAnim$3(this, null));
        }
    }

    /* JADX INFO: renamed from: M3 */
    public final void m43335M3() {
        C40848l c40848l;
        LinearLayoutCompat linearLayoutCompat;
        C40848l c40848l2;
        ImageView imageView;
        C40848l c40848l3;
        LinearLayoutCompat linearLayoutCompat2;
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        if (!IWalletService.f54542a.get().mo66941a()) {
            C45629f c45629fM43333J3 = m43333J3();
            if (c45629fM43333J3 == null || (c40848l = c45629fM43333J3.f102818c) == null || (linearLayoutCompat = c40848l.f90782c) == null) {
                return;
            }
            C27046k.m66700o(linearLayoutCompat);
            return;
        }
        int iM66658b = C27040e.m66658b(40);
        C45629f c45629fM43333J4 = m43333J3();
        if (c45629fM43333J4 != null && (lottieAnimationView2 = c45629fM43333J4.f102825j) != null) {
            ViewExtKt.m66584o(lottieAnimationView2, 0, iM66658b, 0, 0);
        }
        C45629f c45629fM43333J5 = m43333J3();
        if (c45629fM43333J5 != null && (lottieAnimationView = c45629fM43333J5.f102824i) != null) {
            ViewExtKt.m66584o(lottieAnimationView, 0, iM66658b, 0, 0);
        }
        int iM58272j = EdgeToEdgeCompat.f48106a.m58272j() + C27034h.m66635f(this, R$dimen.ui_title_bar_height) + C27040e.m66658b(8);
        C45629f c45629fM43333J6 = m43333J3();
        if (c45629fM43333J6 != null && (c40848l3 = c45629fM43333J6.f102818c) != null && (linearLayoutCompat2 = c40848l3.f90782c) != null) {
            C27046k.m66685H(linearLayoutCompat2);
            ViewExtKt.m66584o(linearLayoutCompat2, 0, iM58272j, 0, 0);
            C27046k.m66710y(linearLayoutCompat2, 1000L, new Function0() { // from class: com.kubi.operation.lib.cards.bonus.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BonusCard.m43309N3(this.f36683b);
                }
            });
        }
        C45629f c45629fM43333J7 = m43333J3();
        if (c45629fM43333J7 == null || (c40848l2 = c45629fM43333J7.f102818c) == null || (imageView = c40848l2.f90781b) == null) {
            return;
        }
        C27046k.m66710y(imageView, 1000L, new Function0() { // from class: com.kubi.operation.lib.cards.bonus.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BonusCard.m43310O3();
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final int m43336P3() {
        Object objM20457a;
        Integer repeatCountBest;
        Integer repeatCountHigh;
        Integer repeatCountMiddle;
        Integer num = this.f36679d0;
        if (num != null) {
            return num.intValue();
        }
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C19446d().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("android_home_bonus_lottie", type);
        } catch (Throwable th2) {
            KCConfigException kCConfigException = new KCConfigException(th2, "RemoteConfig", false, null, 8, null);
            objM20457a = null;
            C43846g.m96568c(kCConfigException, null, 2, null);
        }
        BonusLottieConfigEntity bonusLottieConfigEntity = (BonusLottieConfigEntity) objM20457a;
        int i11 = C19443a.$EnumSwitchMapping$0[C36522b.f79371a.m81777g().ordinal()];
        int iIntValue = -1;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    iIntValue = 0;
                } else if (bonusLottieConfigEntity != null && (repeatCountMiddle = bonusLottieConfigEntity.getRepeatCountMiddle()) != null) {
                    iIntValue = repeatCountMiddle.intValue();
                }
            } else if (bonusLottieConfigEntity != null && (repeatCountHigh = bonusLottieConfigEntity.getRepeatCountHigh()) != null) {
                iIntValue = repeatCountHigh.intValue();
            }
        } else if (bonusLottieConfigEntity != null && (repeatCountBest = bonusLottieConfigEntity.getRepeatCountBest()) != null) {
            iIntValue = repeatCountBest.intValue();
        }
        this.f36679d0 = Integer.valueOf(iIntValue);
        return iIntValue;
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C19458k) {
            m43332E3(((C19458k) singleEvent).getF36694a());
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.operation_homecard_bonus;
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    @NotNull
    public KClass<BonusCardVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(BonusCardVM.class);
    }

    /* JADX INFO: renamed from: y3 */
    public final void m43337y3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.cards.bonus.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BonusCard.m43330z3(this.f36690b);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m43303D3(BonusCard bonusCard, boolean z11, boolean z12) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        boolean z13;
        C45629f c45629fM43333J3;
        LottieAnimationView lottieAnimationView3;
        C45629f c45629fM43333J4;
        LottieAnimationView lottieAnimationView4;
        LottieAnimationView lottieAnimationView5;
        LottieAnimationView lottieAnimationView6;
        if (bonusCard.getView() != null && !bonusCard.isDetached() && !bonusCard.isRemoving()) {
            if (bonusCard.m43336P3() == 0) {
                return Unit.INSTANCE;
            }
            if (z11) {
                C45629f c45629fM43333J5 = bonusCard.m43333J3();
                boolean z14 = false;
                if (c45629fM43333J5 != null && (lottieAnimationView6 = c45629fM43333J5.f102824i) != null && lottieAnimationView6.isAnimating()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                C45629f c45629fM43333J6 = bonusCard.m43333J3();
                if (c45629fM43333J6 != null && (lottieAnimationView5 = c45629fM43333J6.f102825j) != null && lottieAnimationView5.isAnimating()) {
                    z14 = true;
                }
                if (!bonusCard.f36677b0 && !z13 && (c45629fM43333J4 = bonusCard.m43333J3()) != null && (lottieAnimationView4 = c45629fM43333J4.f102824i) != null) {
                    lottieAnimationView4.resumeAnimation();
                }
                if (!bonusCard.f36678c0 && !z14 && (c45629fM43333J3 = bonusCard.m43333J3()) != null && (lottieAnimationView3 = c45629fM43333J3.f102825j) != null) {
                    lottieAnimationView3.resumeAnimation();
                }
            }
            if (z12) {
                C45629f c45629fM43333J7 = bonusCard.m43333J3();
                if (c45629fM43333J7 != null && (lottieAnimationView2 = c45629fM43333J7.f102824i) != null) {
                    lottieAnimationView2.pauseAnimation();
                }
                C45629f c45629fM43333J8 = bonusCard.m43333J3();
                if (c45629fM43333J8 != null && (lottieAnimationView = c45629fM43333J8.f102825j) != null) {
                    lottieAnimationView.pauseAnimation();
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m43305G3(WelfareTaskInfoEntity welfareTaskInfoEntity) {
        RouteExKt.m56217H(welfareTaskInfoEntity.getRewardCenterUri());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m43306H3(WelfareTaskInfoEntity welfareTaskInfoEntity) throws JSONException {
        RouteExKt.m56217H(welfareTaskInfoEntity.getRewardCenterUri());
        OperationHomeHelper.m43673e(OperationHomeHelper.f36890a, "rewardshub", null, null, null, 7, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m43307I3(WelfareTaskInfoEntity welfareTaskInfoEntity) throws JSONException {
        RouteExKt.m56217H(welfareTaskInfoEntity.getBtnForwardUrl());
        OperationHomeHelper.m43673e(OperationHomeHelper.f36890a, "signupBtn", null, null, null, 7, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    private final WelfareTaskInfoEntity m43311Q3(WelfareTaskInfoEntity welfareTaskInfoEntity) {
        String btnForwardUrl;
        String btnForwardUrl2;
        String btnForwardUrl3;
        String btnForwardUrl4;
        String code;
        if (getView() == null || isDetached() || isRemoving()) {
            return null;
        }
        if (this.f36675Z == null) {
            if (welfareTaskInfoEntity != null) {
                btnForwardUrl3 = welfareTaskInfoEntity.getBtnForwardUrl();
            } else {
                btnForwardUrl3 = null;
            }
            if (btnForwardUrl3 == null || btnForwardUrl3.length() == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[BonusCard]currentEntity=null, btnForwardUrl=");
                if (welfareTaskInfoEntity != null) {
                    btnForwardUrl4 = welfareTaskInfoEntity.getBtnForwardUrl();
                } else {
                    btnForwardUrl4 = null;
                }
                sb2.append(btnForwardUrl4);
                sb2.append(", remove card");
                C19570t.m43669g(sb2.toString());
                BaseCardData f27849u = getF27849U();
                if (f27849u != null && (code = f27849u.getCode()) != null) {
                    C19570t.m43664b(code);
                }
                return null;
            }
        }
        boolean zAreEqual = Intrinsics.areEqual(this.f36675Z, welfareTaskInfoEntity);
        if (this.f36675Z != null) {
            if (!zAreEqual) {
                if (welfareTaskInfoEntity != null) {
                    btnForwardUrl2 = welfareTaskInfoEntity.getBtnForwardUrl();
                } else {
                    btnForwardUrl2 = null;
                }
                if (btnForwardUrl2 != null && btnForwardUrl2.length() != 0) {
                    return welfareTaskInfoEntity;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[BonusCard]sameEntity=");
            sb3.append(zAreEqual);
            sb3.append(", btnForwardUrl=");
            if (welfareTaskInfoEntity != null) {
                btnForwardUrl = welfareTaskInfoEntity.getBtnForwardUrl();
            } else {
                btnForwardUrl = null;
            }
            sb3.append(btnForwardUrl);
            C19570t.m43669g(sb3.toString());
            return null;
        }
        return welfareTaskInfoEntity;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m43313S3(BonusCard bonusCard) {
        C45629f c45629fM43333J3 = bonusCard.m43333J3();
        if (c45629fM43333J3 == null) {
            return Unit.INSTANCE;
        }
        LinearLayoutCompat layoutSearchQrScan = c45629fM43333J3.f102818c.f90782c;
        Intrinsics.checkNotNullExpressionValue(layoutSearchQrScan, "layoutSearchQrScan");
        if (!C27046k.m66704s(layoutSearchQrScan)) {
            return Unit.INSTANCE;
        }
        SearchHintEntity searchHintEntityMo59108a = ISearchService.f48774a.get().mo59108a();
        if (searchHintEntityMo59108a != null) {
            c45629fM43333J3.f102818c.f90783d.setText(searchHintEntityMo59108a.getValue());
        } else {
            searchHintEntityMo59108a = null;
        }
        bonusCard.f36676a0 = searchHintEntityMo59108a;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX INFO: renamed from: z3 */
    public static final Unit m43330z3(BonusCard bonusCard) {
        boolean z11;
        LinearLayoutCompat.LayoutParams layoutParams;
        int iM66658b;
        int iM66658b2;
        C45629f c45629fM43333J3 = bonusCard.m43333J3();
        if (c45629fM43333J3 == null) {
            return Unit.INSTANCE;
        }
        LinearLayoutCompat layoutCountdown = c45629fM43333J3.f102821f;
        Intrinsics.checkNotNullExpressionValue(layoutCountdown, "layoutCountdown");
        int i11 = 1;
        if (!ViewExtKt.m66581l(layoutCountdown)) {
            Bouns3TaskView taskView = c45629fM43333J3.f102826k;
            Intrinsics.checkNotNullExpressionValue(taskView, "taskView");
            if (!ViewExtKt.m66581l(taskView)) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        ViewGroup.LayoutParams layoutParams2 = c45629fM43333J3.f102819d.getLayoutParams();
        if (layoutParams2 instanceof LinearLayoutCompat.LayoutParams) {
            layoutParams = (LinearLayoutCompat.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
        }
        if (!z11) {
            i11 = GravityCompat.START;
        }
        ((LinearLayout.LayoutParams) layoutParams).gravity = i11;
        c45629fM43333J3.f102819d.setLayoutParams(layoutParams);
        if (z11) {
            iM66658b = C27040e.m66658b(20);
        } else {
            iM66658b = C27040e.m66658b(16);
        }
        if (z11) {
            iM66658b2 = C27040e.m66658b(24);
        } else {
            iM66658b2 = C27040e.m66658b(16);
        }
        c45629fM43333J3.f102819d.setPaddingRelative(0, iM66658b, 0, iM66658b2);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: P */
    public void mo28981P() {
        super.mo28981P();
        m43302C3(this, true, false, 2, null);
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: Q */
    public void mo28982Q() {
        super.mo28982Q();
        m43302C3(this, false, true, 1, null);
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void bindFlowEvent() {
        super.bindFlowEvent();
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "OperationEvent:COUNT_DOWN_BONUS".length();
        }
        C12572a.m23692a(this, false, new BonusCard$bindFlowEvent$$inlined$bindFlowEvent$default$1("OperationEvent:COUNT_DOWN_BONUS", null, this));
        if (c12573b.m23696a()) {
            "SearchEvent:UPDATE_HINT_WORD".length();
        }
        C12572a.m23692a(this, false, new BonusCard$bindFlowEvent$$inlined$bindFlowEvent$default$2("SearchEvent:UPDATE_HINT_WORD", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new BonusCard$bindFlowEvent$$inlined$bindFlowEvent$default$3("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void initView() {
        C45634k c45634k;
        C45634k c45634k2;
        LinearLayoutCompat root;
        LinearLayoutCompat linearLayoutCompat;
        super.initView();
        C12572a.m23695d("com.kubi.home.event.HomeEvent:displaySpotlightBg", Boolean.FALSE, 0L, 4, null);
        C45629f c45629fM43333J3 = m43333J3();
        if (c45629fM43333J3 != null && (linearLayoutCompat = c45629fM43333J3.f102820e) != null) {
            C27046k.m66700o(linearLayoutCompat);
        }
        C45629f c45629fM43333J4 = m43333J3();
        if (c45629fM43333J4 != null && (c45634k2 = c45629fM43333J4.f102823h) != null && (root = c45634k2.getRoot()) != null) {
            C27046k.m66685H(root);
        }
        C45629f c45629fM43333J5 = m43333J3();
        if (c45629fM43333J5 != null && (c45634k = c45629fM43333J5.f102823h) != null) {
            View v11 = c45634k.f102861b;
            Intrinsics.checkNotNullExpressionValue(v11, "v1");
            InterfaceC36986b interfaceC36986bM54400e = C22911a.m54400e(v11, Float.valueOf(67.0f));
            if (interfaceC36986bM54400e != null) {
                interfaceC36986bM54400e.mo54393a();
            }
            C22911a.m54397b(CollectionsKt.listOf((Object[]) new View[]{c45634k.f102862c, c45634k.f102863d, c45634k.f102864e, c45634k.f102865f, c45634k.f102866g, c45634k.f102867h, c45634k.f102868i, c45634k.f102869j, c45634k.f102870k, c45634k.f102871l, c45634k.f102872m, c45634k.f102873n}), false, 1, null);
            View v12 = c45634k.f102874o;
            Intrinsics.checkNotNullExpressionValue(v12, "v9");
            InterfaceC36986b interfaceC36986bM54400e2 = C22911a.m54400e(v12, Float.valueOf(24.0f));
            if (interfaceC36986bM54400e2 != null) {
                interfaceC36986bM54400e2.mo54393a();
            }
        }
        m43335M3();
        m43334L3();
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onAgainShow() {
        Boolean boolValueOf;
        LinearLayoutCompat linearLayoutCompat;
        super.onAgainShow();
        C45629f c45629fM43333J3 = m43333J3();
        if (c45629fM43333J3 != null && (linearLayoutCompat = c45629fM43333J3.f102820e) != null) {
            boolValueOf = Boolean.valueOf(ViewExtKt.m66581l(linearLayoutCompat));
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            CountDownHelper.m43603j(m43308K3(), LifecycleOwnerKt.getLifecycleScope(this), null, 2, null);
        }
        sendIntent(new BonusCardContract$UiIntent.LoadData(false, 1, null));
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard, com.kubi.kucoin.home.cards.BaseCardFragment
    public void onHide() {
        super.onHide();
        m43302C3(this, false, true, 1, null);
        m43308K3().m43608l();
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard, com.kubi.kucoin.home.cards.BaseCardFragment
    public void onShow() {
        super.onShow();
        m43302C3(this, true, false, 2, null);
        m43312R3();
    }
}
