package com.kubi.operation.lib.cards.welfare;

import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.SimpleStateCard;
import com.kubi.operation.lib.R$color;
import com.kubi.operation.lib.R$drawable;
import com.kubi.operation.lib.R$font;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.R$mipmap;
import com.kubi.operation.lib.R$string;
import com.kubi.operation.lib.cards.welfare.utils.WelfareTaskStatus;
import com.kubi.operation.lib.cards.welfare.utils.WelfareTaskType;
import com.kubi.operation.lib.entity.BonusTaskEntity;
import com.kubi.operation.lib.entity.WelfareTaskInfoEntity;
import com.kubi.operation.lib.utils.C19553c;
import com.kubi.operation.lib.utils.C19570t;
import com.kubi.operation.lib.utils.CountDownHelper;
import com.kubi.operation.lib.utils.CountdownType;
import com.kubi.operation.lib.utils.OperationHomeHelper;
import com.kubi.operation.lib.widget.Bouns2TaskView;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22912t;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.shimmer.C22911a;
import com.kubi.resources.widget.AutoTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27096v0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33627eb;
import f00.C37304a;
import g00.InterfaceC37755g;
import g00.InterfaceC37764p;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p208dr.InterfaceC36952a;
import p213dw.InterfaceC36986b;
import p429lf.C42180b;
import p569qq.C43841b;
import p701vs.C45627d;
import p701vs.C45638o;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import us.C45307h;
import us.C45308i;
import w00.C45681e;

/* JADX INFO: compiled from: WelfareCard.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\"\u001a\u00020#H\u0014J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020)H\u0014J\b\u0010*\u001a\u00020#H\u0014J\b\u0010+\u001a\u00020#H\u0016J\b\u0010,\u001a\u00020#H\u0016J\u0010\u0010-\u001a\u0004\u0018\u00010\u0019*\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010.\u001a\u00020#2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0007J\f\u00100\u001a\u00020#*\u00020\u0019H\u0002J\f\u00101\u001a\u00020#*\u00020\u0019H\u0002J\f\u00102\u001a\u00020#*\u00020\u0019H\u0002J\b\u00103\u001a\u00020#H\u0002J\f\u00104\u001a\u00020#*\u00020\u0019H\u0002J\f\u00105\u001a\u00020#*\u00020\u0019H\u0002J\f\u00106\u001a\u00020#*\u00020\u0019H\u0002J\f\u00107\u001a\u00020#*\u00020\u0019H\u0002J\f\u00108\u001a\u00020#*\u00020\u0019H\u0002J\f\u00109\u001a\u00020#*\u00020\u0019H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, m90084d2 = {"Lcom/kubi/operation/lib/cards/welfare/WelfareCard;", "Lcom/kubi/kucoin/home/cards/SimpleStateCard;", "Lcom/kubi/operation/lib/cards/welfare/WelfareContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/operation/lib/cards/welfare/WelfareCardVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/operation/lib/databinding/OperationFragmentHomecardWelfareBinding;", "getBinding", "()Lcom/kubi/operation/lib/databinding/OperationFragmentHomecardWelfareBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "countDownHelper", "Lcom/kubi/operation/lib/utils/CountDownHelper;", "getCountDownHelper", "()Lcom/kubi/operation/lib/utils/CountDownHelper;", "countDownHelper$delegate", "Lkotlin/Lazy;", "currentEntity", "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "shimmerRoot", "Landroid/view/View;", "getShimmerRoot$OperationLib_googleRelease", "()Landroid/view/View;", "setShimmerRoot$OperationLib_googleRelease", "(Landroid/view/View;)V", "countDownTextStr", "", "initView", "", "bindToUI", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "bindFlowEvent", "onAgainShow", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "preCheckPassed", "fillViewData", "remoteEntity", "fillTitle", "fillContent", "fillActionButton", "actionViewSignup", "actionViewKyc", "trackKycClick", "fillImage", "fillRewardsUnRecieve", "fillCountDownAndTasks", "trackExpose", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWelfareCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelfareCard.kt\ncom/kubi/operation/lib/cards/welfare/WelfareCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,474:1\n147#2,16:475\n76#3,7:491\n153#3,7:498\n*S KotlinDebug\n*F\n+ 1 WelfareCard.kt\ncom/kubi/operation/lib/cards/welfare/WelfareCard\n*L\n78#1:475,16\n136#1:491,7\n151#1:498,7\n*E\n"})
public final class WelfareCard extends SimpleStateCard<WelfareContract$UIState> {

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f36731c0 = {Reflection.property1(new PropertyReference1Impl(WelfareCard.class, "binding", "getBinding()Lcom/kubi/operation/lib/databinding/OperationFragmentHomecardWelfareBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f36732X = C45681e.m100799e(this, new Function1<WelfareCard, C45627d>() { // from class: com.kubi.operation.lib.cards.welfare.WelfareCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45627d invoke(@NotNull WelfareCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45627d.m100739a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45627d, Unit>() { // from class: com.kubi.operation.lib.cards.welfare.WelfareCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45627d it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45627d c45627d) {
            invoke(c45627d);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f36733Y = LazyKt.lazy(new Function0() { // from class: com.kubi.operation.lib.cards.welfare.h
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WelfareCard.m43411K3();
        }
    });

    /* JADX INFO: renamed from: Z */
    @Nullable
    public WelfareTaskInfoEntity f36734Z;

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public View f36735a0;

    /* JADX INFO: renamed from: b0 */
    @Nullable
    public String f36736b0;

    /* JADX INFO: renamed from: com.kubi.operation.lib.cards.welfare.WelfareCard$a */
    /* JADX INFO: compiled from: WelfareCard.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19482a implements Function0<Unit> {
        public C19482a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m43453a() {
            if (ViewExtKt.m66581l(WelfareCard.this.getContentView())) {
                WelfareCard.this.sendIntent(WelfareContract$UiIntent.LoadData.INSTANCE);
            }
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m43453a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m43406E3(WelfareTaskInfoEntity welfareTaskInfoEntity) {
        InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, null, null, null, 31, null);
        C45308i.m100179d(WelfareTaskStatus.AUDIT_FAIL.equalString(welfareTaskInfoEntity.getNewTaskStatus()) ? "rhcheckreason" : "rhverifying", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m43407F3(boolean z11, WelfareTaskInfoEntity welfareTaskInfoEntity, WelfareCard welfareCard) {
        String taskId;
        InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, null, null, null, 31, null);
        if (!z11 && Intrinsics.areEqual(welfareTaskInfoEntity.isSignUp(), Boolean.FALSE) && (taskId = welfareTaskInfoEntity.getTaskId()) != null && taskId.length() != 0) {
            welfareCard.sendIntent(new WelfareContract$UiIntent.ApplyJoinTask(welfareTaskInfoEntity.getTaskId()));
        }
        welfareCard.m43452e4(welfareTaskInfoEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m43409I3() {
        InterfaceC37764p.a.m85185f(C37304a.f82764a, null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        C45308i.m100179d("rhsignup2", null, null, 6, null);
        C43841b.m96557d("event_click_operation_create_account", "click_start_btn", null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m43410J3() {
        IUserService.O(IUserService.a.get(), (Map) null, (IRedirect) null, 3, (Object) null);
        C45308i.m100179d("rhlogin2", null, null, 6, null);
        C43841b.m96557d("event_click_operation_login", "click_start_btn", null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public static final CountDownHelper m43411K3() {
        return new CountDownHelper(CountdownType.Welfare);
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m43413N3() {
        Router.f46192a.m56184f("trade").m4048k();
        C45308i.m100179d("rhfirsttrade", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public final CountDownHelper m43419a4() {
        return (CountDownHelper) this.f36733Y.getValue();
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m43422f4(WelfareTaskInfoEntity welfareTaskInfoEntity) {
        String str;
        if (WelfareTaskStatus.AUDIT_FAIL.equalString(welfareTaskInfoEntity.getNewTaskStatus())) {
            str = "rhverifyagain";
        } else if (C27025c.m66566d(welfareTaskInfoEntity.isNewcomer())) {
            str = "rhnewkyc";
        } else {
            String taskSubTitle = welfareTaskInfoEntity.getTaskSubTitle();
            str = (taskSubTitle == null || taskSubTitle.length() == 0) ? "rhotheroldkyc" : "rholdkyc";
        }
        C45308i.m100179d(str, null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public final void m43441C3(final WelfareTaskInfoEntity welfareTaskInfoEntity) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.cards.welfare.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelfareCard.m43405D3(this.f36741b, welfareTaskInfoEntity);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final void m43442G3() {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.cards.welfare.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelfareCard.m43408H3(this.f36755b);
            }
        });
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard, com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: K1 */
    public void mo28980K1(@NotNull BaseCardData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.mo28980K1(data);
        if (!(data instanceof WelfareCardData) || !Intrinsics.areEqual(((WelfareCardData) data).getData(), Boolean.TRUE)) {
            ViewExtKt.m66577h(getContentView());
            return;
        }
        ViewExtKt.m66594y(getContentView());
        C19553c.m43657e();
        sendIntent(WelfareContract$UiIntent.LoadData.INSTANCE);
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m43445Q3(final WelfareTaskInfoEntity welfareTaskInfoEntity) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.cards.welfare.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelfareCard.m43415R3(welfareTaskInfoEntity, this);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public final void m43447U3(final WelfareTaskInfoEntity welfareTaskInfoEntity) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.cards.welfare.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelfareCard.m43417V3(welfareTaskInfoEntity, this);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public final C45627d m43450Z3() {
        return (C45627d) this.f36732X.getValue(this, f36731c0[0]);
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C19501r) {
            m43449Y3(((C19501r) singleEvent).getF36758a());
        } else if (singleEvent instanceof C19502s) {
            BaseCardData f27849u = getF27849U();
            C19570t.m43664b(f27849u != null ? f27849u.getCode() : null);
        }
    }

    /* JADX INFO: renamed from: e4 */
    public final void m43452e4(final WelfareTaskInfoEntity welfareTaskInfoEntity) {
        C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.cards.welfare.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelfareCard.m43422f4(welfareTaskInfoEntity);
            }
        });
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.operation_fragment_homecard_welfare;
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    @NotNull
    public KClass<WelfareCardVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(WelfareCardVM.class);
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m43405D3(final WelfareCard welfareCard, final WelfareTaskInfoEntity welfareTaskInfoEntity) {
        LinearLayoutCompat linearLayoutCompat;
        BaseTextView baseTextView;
        ImageView imageView;
        ImageView imageView2;
        int i11;
        int i12;
        BaseTextView baseTextView2;
        AutoTextView autoTextView;
        LinearLayoutCompat linearLayoutCompat2;
        BaseTextView baseTextView3;
        ImageView imageView3;
        ImageView imageView4;
        LinearLayoutCompat linearLayoutCompat3;
        LinearLayoutCompat linearLayoutCompat4;
        LinearLayoutCompat linearLayoutCompat5;
        AutoTextView autoTextView2;
        LinearLayoutCompat linearLayoutCompat6;
        LinearLayoutCompat linearLayoutCompat7;
        BaseTextView baseTextView4;
        C45627d c45627dM43450Z3 = welfareCard.m43450Z3();
        if (c45627dM43450Z3 != null && (baseTextView4 = c45627dM43450Z3.f102802p) != null) {
            ViewExtKt.m66577h(baseTextView4);
        }
        WelfareTaskStatus welfareTaskStatus = WelfareTaskStatus.AUDIT;
        if (!welfareTaskStatus.equalString(welfareTaskInfoEntity.getNewTaskStatus()) && !WelfareTaskStatus.AUDIT_FAIL.equalString(welfareTaskInfoEntity.getNewTaskStatus())) {
            C45627d c45627dM43450Z4 = welfareCard.m43450Z3();
            if (c45627dM43450Z4 != null && (linearLayoutCompat7 = c45627dM43450Z4.f102794h) != null) {
                ViewExtKt.m66577h(linearLayoutCompat7);
            }
            C45627d c45627dM43450Z5 = welfareCard.m43450Z3();
            if (c45627dM43450Z5 != null && (linearLayoutCompat6 = c45627dM43450Z5.f102790d) != null) {
                ViewExtKt.m66594y(linearLayoutCompat6);
            }
            C45627d c45627dM43450Z6 = welfareCard.m43450Z3();
            if (c45627dM43450Z6 != null && (autoTextView2 = c45627dM43450Z6.f102797k) != null) {
                autoTextView2.setText(R$string.home_welfare_kyc_go_auth);
            }
        } else {
            boolean zEqualString = WelfareTaskStatus.AUDIT_FAIL.equalString(welfareTaskInfoEntity.getNewTaskStatus());
            C45627d c45627dM43450Z7 = welfareCard.m43450Z3();
            if (c45627dM43450Z7 != null && (linearLayoutCompat3 = c45627dM43450Z7.f102794h) != null) {
                ViewExtKt.m66594y(linearLayoutCompat3);
            }
            if (zEqualString) {
                C45627d c45627dM43450Z8 = welfareCard.m43450Z3();
                if (c45627dM43450Z8 != null && (imageView4 = c45627dM43450Z8.f102789c) != null) {
                    imageView4.setImageResource(R$drawable.ic2_fail_16);
                }
                C45627d c45627dM43450Z9 = welfareCard.m43450Z3();
                if (c45627dM43450Z9 != null && (imageView3 = c45627dM43450Z9.f102789c) != null) {
                    C27046k.m66701p(imageView3, welfareCard.getColorRes(R$color.brandRed));
                }
                C45627d c45627dM43450Z10 = welfareCard.m43450Z3();
                if (c45627dM43450Z10 != null && (baseTextView3 = c45627dM43450Z10.f102801o) != null) {
                    baseTextView3.setTextColor(welfareCard.getColorRes(R$color.brandRed));
                }
                C45627d c45627dM43450Z11 = welfareCard.m43450Z3();
                if (c45627dM43450Z11 != null && (linearLayoutCompat2 = c45627dM43450Z11.f102790d) != null) {
                    ViewExtKt.m66594y(linearLayoutCompat2);
                }
                C45627d c45627dM43450Z12 = welfareCard.m43450Z3();
                if (c45627dM43450Z12 != null && (autoTextView = c45627dM43450Z12.f102797k) != null) {
                    autoTextView.setText(R$string.home_welfare_kyc_retry);
                }
            } else {
                C45627d c45627dM43450Z13 = welfareCard.m43450Z3();
                if (c45627dM43450Z13 != null && (imageView2 = c45627dM43450Z13.f102789c) != null) {
                    imageView2.setImageResource(R$drawable.ic2_wait_16);
                }
                C45627d c45627dM43450Z14 = welfareCard.m43450Z3();
                if (c45627dM43450Z14 != null && (imageView = c45627dM43450Z14.f102789c) != null) {
                    C27046k.m66701p(imageView, welfareCard.getColorRes(R$color.complementary));
                }
                C45627d c45627dM43450Z15 = welfareCard.m43450Z3();
                if (c45627dM43450Z15 != null && (baseTextView = c45627dM43450Z15.f102801o) != null) {
                    baseTextView.setTextColor(welfareCard.getColorRes(R$color.complementary));
                }
                C45627d c45627dM43450Z16 = welfareCard.m43450Z3();
                if (c45627dM43450Z16 != null && (linearLayoutCompat = c45627dM43450Z16.f102790d) != null) {
                    ViewExtKt.m66577h(linearLayoutCompat);
                }
            }
            if (zEqualString) {
                i11 = R$string.home_welfare_kyc_failed_state;
            } else {
                i11 = R$string.home_welfare_kyc_verifying_state;
            }
            String string = welfareCard.getString(i11);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            if (zEqualString) {
                i12 = R$string.home_welfare_kyc_failed_reason;
            } else {
                i12 = R$string.home_welfare_kyc_verifying_checkback;
            }
            String string2 = welfareCard.getString(i12);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            C45627d c45627dM43450Z17 = welfareCard.m43450Z3();
            if (c45627dM43450Z17 != null && (baseTextView2 = c45627dM43450Z17.f102801o) != null) {
                C27096v0 c27096v0 = new C27096v0();
                c27096v0.append(string);
                c27096v0.append(C33627eb.f69716f);
                c27096v0.m66908h(string2);
                baseTextView2.setText(c27096v0);
            }
        }
        C45627d c45627dM43450Z18 = welfareCard.m43450Z3();
        if (c45627dM43450Z18 != null && (linearLayoutCompat5 = c45627dM43450Z18.f102794h) != null) {
            C27046k.m66711z(linearLayoutCompat5, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.welfare.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WelfareCard.m43406E3(welfareTaskInfoEntity);
                }
            }, 1, null);
        }
        final boolean zEqualString2 = welfareTaskStatus.equalString(welfareTaskInfoEntity.getNewTaskStatus());
        C45627d c45627dM43450Z19 = welfareCard.m43450Z3();
        if (c45627dM43450Z19 != null && (linearLayoutCompat4 = c45627dM43450Z19.f102790d) != null) {
            C27046k.m66711z(linearLayoutCompat4, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.welfare.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WelfareCard.m43407F3(zEqualString2, welfareTaskInfoEntity, welfareCard);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m43408H3(WelfareCard welfareCard) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        LinearLayoutCompat linearLayoutCompat;
        AutoTextView autoTextView;
        LinearLayoutCompat linearLayoutCompat2;
        C45627d c45627dM43450Z3 = welfareCard.m43450Z3();
        if (c45627dM43450Z3 != null && (linearLayoutCompat2 = c45627dM43450Z3.f102790d) != null) {
            ViewExtKt.m66594y(linearLayoutCompat2);
        }
        C45627d c45627dM43450Z4 = welfareCard.m43450Z3();
        if (c45627dM43450Z4 != null && (autoTextView = c45627dM43450Z4.f102797k) != null) {
            autoTextView.setText(R$string.home_welfare_signup_go_signup);
        }
        C45627d c45627dM43450Z5 = welfareCard.m43450Z3();
        if (c45627dM43450Z5 != null && (linearLayoutCompat = c45627dM43450Z5.f102790d) != null) {
            C27046k.m66711z(linearLayoutCompat, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.welfare.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WelfareCard.m43409I3();
                }
            }, 1, null);
        }
        C45627d c45627dM43450Z6 = welfareCard.m43450Z3();
        if (c45627dM43450Z6 != null && (baseTextView3 = c45627dM43450Z6.f102802p) != null) {
            ViewExtKt.m66594y(baseTextView3);
        }
        C45627d c45627dM43450Z7 = welfareCard.m43450Z3();
        if (c45627dM43450Z7 != null && (baseTextView2 = c45627dM43450Z7.f102802p) != null) {
            HighlightTextHelper.f43497a.m54116a(baseTextView2, HighlightTextHelper.TextTagEnum.SPAN, C22912t.m54408f(R$font.medium, welfareCard.getColorRes(R$color.c_text)));
        }
        C45627d c45627dM43450Z8 = welfareCard.m43450Z3();
        if (c45627dM43450Z8 != null && (baseTextView = c45627dM43450Z8.f102802p) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.welfare.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WelfareCard.m43410J3();
                }
            }, 1, null);
        }
        C45308i.m100181f("rhloginpageview2", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m43412M3(WelfareCard welfareCard) {
        FragmentManager childFragmentManager = welfareCard.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        C45307h.m100168g(childFragmentManager);
        C45308i.m100179d("rhdeposit", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m43414O3(WelfareCard welfareCard, WelfareTaskInfoEntity welfareTaskInfoEntity) {
        FragmentManager childFragmentManager = welfareCard.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        C45307h.m100172k(childFragmentManager, C45308i.m100177b(welfareTaskInfoEntity.getProSpotTargetAmount(), 0), C45308i.m100177b(welfareTaskInfoEntity.getProSpotCompleteAmount(), 0), C45308i.m100177b(welfareTaskInfoEntity.getProContractTargetAmount(), 0), C45308i.m100177b(welfareTaskInfoEntity.getProContractCompleteAmount(), 0));
        C45308i.m100179d("rhprotrade", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX INFO: renamed from: R3 */
    public static final Unit m43415R3(final WelfareTaskInfoEntity welfareTaskInfoEntity, WelfareCard welfareCard) throws JSONException {
        View view;
        LinearLayoutCompat linearLayoutCompat;
        Bouns2TaskView bouns2TaskView;
        Bouns2TaskView bouns2TaskView2;
        Bouns2TaskView bouns2TaskView3;
        LinearLayoutCompat linearLayoutCompat2;
        LinearLayoutCompat linearLayoutCompat3;
        String taskType;
        View view2;
        List<BonusTaskEntity> limitTaskList = welfareTaskInfoEntity.getLimitTaskList();
        if (limitTaskList == null) {
            limitTaskList = CollectionsKt.emptyList();
        }
        List<BonusTaskEntity> listTake = CollectionsKt.take(limitTaskList, 2);
        WelfareTaskType welfareTaskType = WelfareTaskType.SIGN_UP;
        if (welfareTaskType.equalString(welfareTaskInfoEntity.getTaskType()) && !listTake.isEmpty()) {
            C45627d c45627dM43450Z3 = welfareCard.m43450Z3();
            if (c45627dM43450Z3 != null && (view2 = c45627dM43450Z3.f102804r) != null) {
                C27046k.m66685H(view2);
            }
        } else {
            C45627d c45627dM43450Z4 = welfareCard.m43450Z3();
            if (c45627dM43450Z4 != null && (view = c45627dM43450Z4.f102804r) != null) {
                C27046k.m66700o(view);
            }
        }
        welfareCard.f36736b0 = C19570t.m43671i(welfareTaskInfoEntity.getCountDownTips());
        if (C27039d.m66652l(welfareTaskInfoEntity.getCountDownTime()) > 0) {
            WelfareTaskInfoEntity welfareTaskInfoEntity2 = welfareCard.f36734Z;
            if (welfareTaskInfoEntity2 != null) {
                if (welfareTaskInfoEntity2 != null) {
                    taskType = welfareTaskInfoEntity2.getTaskType();
                } else {
                    taskType = null;
                }
                if (welfareTaskType.equalString(taskType) || !welfareTaskType.equalString(welfareTaskInfoEntity.getTaskType())) {
                    if (UserInfo.a.n()) {
                        C19553c.m43660h(-1L);
                    }
                } else {
                    C19553c.m43660h(-1L);
                }
            } else if (UserInfo.a.n()) {
                C19553c.m43660h(-1L);
            }
            C45627d c45627dM43450Z5 = welfareCard.m43450Z3();
            if (c45627dM43450Z5 != null && (linearLayoutCompat3 = c45627dM43450Z5.f102791e) != null) {
                C27046k.m66685H(linearLayoutCompat3);
            }
            welfareCard.m43419a4().m43607i(LifecycleOwnerKt.getLifecycleScope(welfareCard), Long.valueOf(C27039d.m66652l(welfareTaskInfoEntity.getCountDownTime())));
        } else {
            C45627d c45627dM43450Z6 = welfareCard.m43450Z3();
            if (c45627dM43450Z6 != null && (linearLayoutCompat = c45627dM43450Z6.f102791e) != null) {
                C27046k.m66700o(linearLayoutCompat);
            }
        }
        C45627d c45627dM43450Z7 = welfareCard.m43450Z3();
        if (c45627dM43450Z7 != null && (linearLayoutCompat2 = c45627dM43450Z7.f102791e) != null) {
            C27046k.m66711z(linearLayoutCompat2, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.welfare.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WelfareCard.m43416S3(welfareTaskInfoEntity);
                }
            }, 1, null);
        }
        if (!listTake.isEmpty()) {
            C45627d c45627dM43450Z8 = welfareCard.m43450Z3();
            if (c45627dM43450Z8 != null && (bouns2TaskView3 = c45627dM43450Z8.f102796j) != null) {
                C27046k.m66685H(bouns2TaskView3);
            }
        } else {
            C45627d c45627dM43450Z9 = welfareCard.m43450Z3();
            if (c45627dM43450Z9 != null && (bouns2TaskView = c45627dM43450Z9.f102796j) != null) {
                C27046k.m66700o(bouns2TaskView);
            }
        }
        C45627d c45627dM43450Z10 = welfareCard.m43450Z3();
        if (c45627dM43450Z10 != null && (bouns2TaskView2 = c45627dM43450Z10.f102796j) != null) {
            bouns2TaskView2.m43692c(listTake);
        }
        OperationHomeHelper.m43674g(OperationHomeHelper.f36890a, "oldWelfare", null, 1, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m43416S3(WelfareTaskInfoEntity welfareTaskInfoEntity) {
        RouteExKt.m56217H(welfareTaskInfoEntity.getRewardCenterUri());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: V3 */
    public static final Unit m43417V3(final WelfareTaskInfoEntity welfareTaskInfoEntity, WelfareCard welfareCard) {
        String strM92640e;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        LinearLayoutCompat linearLayoutCompat3;
        BaseTextView baseTextView;
        LinearLayoutCompat linearLayoutCompat4;
        String waitDrawTaskType = welfareTaskInfoEntity.getWaitDrawTaskType();
        String string = "";
        if (waitDrawTaskType == null) {
            waitDrawTaskType = "";
        }
        BigDecimal waitDrawPrizeAmount = welfareTaskInfoEntity.getWaitDrawPrizeAmount();
        if (waitDrawPrizeAmount == null || (strM92640e = C42180b.m92640e(waitDrawPrizeAmount, null, 0, false, false, false, 0, null, 127, null)) == null) {
            strM92640e = "--";
        }
        if (strM92640e.length() > 0 && waitDrawTaskType.length() > 0) {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = waitDrawTaskType.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            switch (upperCase.hashCode()) {
                case -2022530434:
                    if (upperCase.equals("DEPOSIT")) {
                        string = welfareCard.getString(R$string.home_welfare_gift_deposit, strM92640e);
                    }
                    break;
                case -1488690083:
                    if (upperCase.equals("SIGN_UP")) {
                        string = welfareCard.getString(R$string.home_welfare_gift_signup, strM92640e);
                    }
                    break;
                case 74901:
                    if (upperCase.equals("KYC")) {
                        string = welfareCard.getString(R$string.home_welfare_gift_kyc, strM92640e);
                    }
                    break;
                case 80083268:
                    if (upperCase.equals("TRADE")) {
                        string = welfareCard.getString(R$string.home_welfare_gift_trade, strM92640e);
                    }
                    break;
            }
            Intrinsics.checkNotNull(string);
            if (string.length() > 0) {
                C45627d c45627dM43450Z3 = welfareCard.m43450Z3();
                if (c45627dM43450Z3 != null && (linearLayoutCompat4 = c45627dM43450Z3.f102793g) != null) {
                    ViewExtKt.m66594y(linearLayoutCompat4);
                }
                C45308i.m100181f("rhcliampageview", null, null, 6, null);
            } else {
                C45627d c45627dM43450Z4 = welfareCard.m43450Z3();
                if (c45627dM43450Z4 != null && (linearLayoutCompat3 = c45627dM43450Z4.f102793g) != null) {
                    ViewExtKt.m66577h(linearLayoutCompat3);
                }
            }
            C45627d c45627dM43450Z5 = welfareCard.m43450Z3();
            if (c45627dM43450Z5 != null && (baseTextView = c45627dM43450Z5.f102800n) != null) {
                baseTextView.setText(string);
                HighlightTextHelper.f43497a.m54116a(baseTextView, HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(welfareCard.getColorRes(R$color.brandGreen)));
            }
        } else {
            C45627d c45627dM43450Z6 = welfareCard.m43450Z3();
            if (c45627dM43450Z6 != null && (linearLayoutCompat = c45627dM43450Z6.f102793g) != null) {
                ViewExtKt.m66577h(linearLayoutCompat);
            }
        }
        C45627d c45627dM43450Z7 = welfareCard.m43450Z3();
        if (c45627dM43450Z7 != null && (linearLayoutCompat2 = c45627dM43450Z7.f102793g) != null) {
            C27046k.m66711z(linearLayoutCompat2, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.welfare.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WelfareCard.m43418W3(welfareTaskInfoEntity);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m43418W3(WelfareTaskInfoEntity welfareTaskInfoEntity) {
        RouteExKt.m56217H(welfareTaskInfoEntity.getRewardCenterUri());
        C45308i.m100179d("rhcliam", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m43420b4(FrameLayout frameLayout, WelfareCard welfareCard) {
        C45638o c45638oM100767c = C45638o.m100767c(LayoutInflater.from(frameLayout.getContext()), frameLayout, true);
        LinearLayoutCompat root = c45638oM100767c.getRoot();
        welfareCard.f36735a0 = root;
        if (root != null) {
            ViewExtKt.m66584o(root, 0, 0, 0, 0);
        }
        LinearLayoutCompat viewLine = c45638oM100767c.f102891c;
        Intrinsics.checkNotNullExpressionValue(viewLine, "viewLine");
        InterfaceC36986b interfaceC36986bM54399d = C22911a.m54399d(viewLine, null, 1, null);
        if (interfaceC36986bM54399d != null) {
            interfaceC36986bM54399d.mo54393a();
        }
        View icon = c45638oM100767c.f102890b;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        InterfaceC36986b interfaceC36986bM54400e = C22911a.m54400e(icon, Float.valueOf(40.0f));
        if (interfaceC36986bM54400e != null) {
            interfaceC36986bM54400e.mo54393a();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    private final WelfareTaskInfoEntity m43421c4(WelfareTaskInfoEntity welfareTaskInfoEntity) {
        String taskType;
        String taskType2;
        String taskType3;
        String taskType4;
        String code;
        if (getView() == null || isDetached() || isRemoving()) {
            return null;
        }
        if (this.f36734Z == null) {
            if (welfareTaskInfoEntity != null) {
                taskType3 = welfareTaskInfoEntity.getTaskType();
            } else {
                taskType3 = null;
            }
            if (taskType3 == null || taskType3.length() == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[WelfareCard]currentEntity=null, taskType=");
                if (welfareTaskInfoEntity != null) {
                    taskType4 = welfareTaskInfoEntity.getTaskType();
                } else {
                    taskType4 = null;
                }
                sb2.append(taskType4);
                sb2.append(", remove card");
                C19570t.m43669g(sb2.toString());
                BaseCardData f27849u = getF27849U();
                if (f27849u != null && (code = f27849u.getCode()) != null) {
                    C19570t.m43664b(code);
                }
                return null;
            }
        }
        boolean zAreEqual = Intrinsics.areEqual(this.f36734Z, welfareTaskInfoEntity);
        if (this.f36734Z != null) {
            if (!zAreEqual) {
                if (welfareTaskInfoEntity != null) {
                    taskType2 = welfareTaskInfoEntity.getTaskType();
                } else {
                    taskType2 = null;
                }
                if (taskType2 != null && taskType2.length() != 0) {
                    return welfareTaskInfoEntity;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[WelfareCard]sameEntity=");
            sb3.append(zAreEqual);
            sb3.append(", taskType=");
            if (welfareTaskInfoEntity != null) {
                taskType = welfareTaskInfoEntity.getTaskType();
            } else {
                taskType = null;
            }
            sb3.append(taskType);
            C19570t.m43669g(sb3.toString());
            return null;
        }
        return welfareTaskInfoEntity;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:78:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c8, code lost:
    
        if (r0.equals("KYC") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d1, code lost:
    
        if (r0.equals("OLD_KYC") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d4, code lost:
    
        m43441C3(r8);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: L3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m43443L3(final WelfareTaskInfoEntity welfareTaskInfoEntity) {
        C45627d c45627dM43450Z3;
        C45627d c45627dM43450Z4;
        LinearLayoutCompat linearLayoutCompat;
        BaseTextView baseTextView;
        LinearLayoutCompat linearLayoutCompat2;
        LinearLayoutCompat linearLayoutCompat3;
        AutoTextView autoTextView;
        BaseTextView baseTextView2;
        LinearLayoutCompat linearLayoutCompat4;
        LinearLayoutCompat linearLayoutCompat5;
        AutoTextView autoTextView2;
        BaseTextView baseTextView3;
        LinearLayoutCompat linearLayoutCompat6;
        LinearLayoutCompat linearLayoutCompat7;
        AutoTextView autoTextView3;
        BaseTextView baseTextView4;
        LinearLayoutCompat linearLayoutCompat8;
        C45627d c45627dM43450Z5 = m43450Z3();
        if (c45627dM43450Z5 != null && (linearLayoutCompat8 = c45627dM43450Z5.f102794h) != null) {
            ViewExtKt.m66577h(linearLayoutCompat8);
        }
        String taskType = welfareTaskInfoEntity.getTaskType();
        if (taskType == null) {
            taskType = "";
        }
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = taskType.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -2022530434:
                if (upperCase.equals("DEPOSIT")) {
                    C45627d c45627dM43450Z6 = m43450Z3();
                    if (c45627dM43450Z6 != null && (baseTextView2 = c45627dM43450Z6.f102802p) != null) {
                        ViewExtKt.m66577h(baseTextView2);
                    }
                    C45627d c45627dM43450Z7 = m43450Z3();
                    if (c45627dM43450Z7 != null && (autoTextView = c45627dM43450Z7.f102797k) != null) {
                        autoTextView.setText(R$string.home_welfare_deposit_go_crypto);
                    }
                    C45627d c45627dM43450Z8 = m43450Z3();
                    if (c45627dM43450Z8 != null && (linearLayoutCompat3 = c45627dM43450Z8.f102790d) != null) {
                        ViewExtKt.m66594y(linearLayoutCompat3);
                    }
                    C45627d c45627dM43450Z9 = m43450Z3();
                    if (c45627dM43450Z9 != null && (linearLayoutCompat2 = c45627dM43450Z9.f102790d) != null) {
                        C27046k.m66711z(linearLayoutCompat2, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.welfare.i
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WelfareCard.m43412M3(this.f36748b);
                            }
                        }, 1, null);
                        break;
                    }
                }
                c45627dM43450Z3 = m43450Z3();
                if (c45627dM43450Z3 != null && (baseTextView = c45627dM43450Z3.f102802p) != null) {
                    ViewExtKt.m66577h(baseTextView);
                }
                c45627dM43450Z4 = m43450Z3();
                if (c45627dM43450Z4 == null && (linearLayoutCompat = c45627dM43450Z4.f102790d) != null) {
                    C27046k.m66703r(linearLayoutCompat);
                    break;
                }
                break;
            case -1488690083:
                if (upperCase.equals("SIGN_UP")) {
                    m43442G3();
                }
                c45627dM43450Z3 = m43450Z3();
                if (c45627dM43450Z3 != null) {
                    ViewExtKt.m66577h(baseTextView);
                }
                c45627dM43450Z4 = m43450Z3();
                if (c45627dM43450Z4 == null) {
                }
                break;
            case -660133283:
                break;
            case 74901:
                break;
            case 79501:
                if (upperCase.equals("PRO")) {
                    C45627d c45627dM43450Z10 = m43450Z3();
                    if (c45627dM43450Z10 != null && (baseTextView3 = c45627dM43450Z10.f102802p) != null) {
                        ViewExtKt.m66577h(baseTextView3);
                    }
                    C45627d c45627dM43450Z11 = m43450Z3();
                    if (c45627dM43450Z11 != null && (autoTextView2 = c45627dM43450Z11.f102797k) != null) {
                        autoTextView2.setText(R$string.home_welfare_trade_go_trade);
                    }
                    C45627d c45627dM43450Z12 = m43450Z3();
                    if (c45627dM43450Z12 != null && (linearLayoutCompat5 = c45627dM43450Z12.f102790d) != null) {
                        ViewExtKt.m66594y(linearLayoutCompat5);
                    }
                    C45627d c45627dM43450Z13 = m43450Z3();
                    if (c45627dM43450Z13 != null && (linearLayoutCompat4 = c45627dM43450Z13.f102790d) != null) {
                        C27046k.m66711z(linearLayoutCompat4, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.welfare.k
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WelfareCard.m43414O3(this.f36749b, welfareTaskInfoEntity);
                            }
                        }, 1, null);
                        break;
                    }
                }
                c45627dM43450Z3 = m43450Z3();
                if (c45627dM43450Z3 != null) {
                    ViewExtKt.m66577h(baseTextView);
                }
                c45627dM43450Z4 = m43450Z3();
                if (c45627dM43450Z4 == null) {
                }
                break;
            case 80083268:
                if (upperCase.equals("TRADE")) {
                    C45627d c45627dM43450Z14 = m43450Z3();
                    if (c45627dM43450Z14 != null && (baseTextView4 = c45627dM43450Z14.f102802p) != null) {
                        ViewExtKt.m66577h(baseTextView4);
                    }
                    C45627d c45627dM43450Z15 = m43450Z3();
                    if (c45627dM43450Z15 != null && (autoTextView3 = c45627dM43450Z15.f102797k) != null) {
                        autoTextView3.setText(R$string.home_welfare_trade_go_trade);
                    }
                    C45627d c45627dM43450Z16 = m43450Z3();
                    if (c45627dM43450Z16 != null && (linearLayoutCompat7 = c45627dM43450Z16.f102790d) != null) {
                        ViewExtKt.m66594y(linearLayoutCompat7);
                    }
                    C45627d c45627dM43450Z17 = m43450Z3();
                    if (c45627dM43450Z17 != null && (linearLayoutCompat6 = c45627dM43450Z17.f102790d) != null) {
                        C27046k.m66711z(linearLayoutCompat6, 0L, new Function0() { // from class: com.kubi.operation.lib.cards.welfare.j
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WelfareCard.m43413N3();
                            }
                        }, 1, null);
                        break;
                    }
                }
                c45627dM43450Z3 = m43450Z3();
                if (c45627dM43450Z3 != null) {
                    ViewExtKt.m66577h(baseTextView);
                }
                c45627dM43450Z4 = m43450Z3();
                if (c45627dM43450Z4 == null) {
                }
                break;
            default:
                c45627dM43450Z3 = m43450Z3();
                if (c45627dM43450Z3 != null) {
                    ViewExtKt.m66577h(baseTextView);
                }
                c45627dM43450Z4 = m43450Z3();
                if (c45627dM43450Z4 == null) {
                }
                break;
        }
    }

    /* JADX INFO: renamed from: P3 */
    public final void m43444P3(WelfareTaskInfoEntity welfareTaskInfoEntity) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        String taskSubTitle = welfareTaskInfoEntity.getTaskSubTitle();
        String string = "";
        if (taskSubTitle == null) {
            taskSubTitle = "";
        }
        if (taskSubTitle.length() == 0) {
            if (WelfareTaskType.OLD_KYC.equalString(welfareTaskInfoEntity.getTaskType())) {
                string = getString(R$string.home_welfare_kyc_after_content);
            }
            Intrinsics.checkNotNull(string);
            taskSubTitle = string;
        }
        if (taskSubTitle.length() > 0) {
            C45627d c45627dM43450Z3 = m43450Z3();
            if (c45627dM43450Z3 != null && (baseTextView4 = c45627dM43450Z3.f102798l) != null) {
                C27046k.m66685H(baseTextView4);
            }
            C45627d c45627dM43450Z4 = m43450Z3();
            if (c45627dM43450Z4 != null && (baseTextView3 = c45627dM43450Z4.f102798l) != null) {
                baseTextView3.setText(taskSubTitle);
            }
            C45627d c45627dM43450Z5 = m43450Z3();
            if (c45627dM43450Z5 != null && (baseTextView2 = c45627dM43450Z5.f102798l) != null) {
                HighlightTextHelper.f43497a.m54116a(baseTextView2, HighlightTextHelper.TextTagEnum.SPAN, C22912t.m54408f(R$font.medium, getColorRes(R$color.brandGreen)));
                return;
            }
            return;
        }
        C45627d c45627dM43450Z6 = m43450Z3();
        if (c45627dM43450Z6 != null && (baseTextView = c45627dM43450Z6.f102798l) != null) {
            C27046k.m66700o(baseTextView);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:56:0x00aa  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r3.equals("KYC") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        if (r3.equals("OLD_KYC") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
    
        r3 = m43450Z3();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
    
        if (r3 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        r3 = r3.f102788b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        if (r3 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
    
        r3.setImageResource(com.kubi.operation.lib.R$mipmap.op_welfare_kyc);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: T3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m43446T3(WelfareTaskInfoEntity welfareTaskInfoEntity) {
        C45627d c45627dM43450Z3;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        C45627d c45627dM43450Z4 = m43450Z3();
        if (c45627dM43450Z4 != null && (imageView6 = c45627dM43450Z4.f102788b) != null) {
            ViewExtKt.m66594y(imageView6);
        }
        String taskType = welfareTaskInfoEntity.getTaskType();
        if (taskType == null) {
            taskType = "";
        }
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = taskType.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -2022530434:
                if (upperCase.equals("DEPOSIT")) {
                    C45627d c45627dM43450Z5 = m43450Z3();
                    if (c45627dM43450Z5 != null && (imageView2 = c45627dM43450Z5.f102788b) != null) {
                        imageView2.setImageResource(R$mipmap.op_welfare_deposit);
                        break;
                    }
                }
                c45627dM43450Z3 = m43450Z3();
                if (c45627dM43450Z3 == null && (imageView = c45627dM43450Z3.f102788b) != null) {
                    C27046k.m66703r(imageView);
                    break;
                }
                break;
            case -1488690083:
                if (upperCase.equals("SIGN_UP")) {
                    C45627d c45627dM43450Z6 = m43450Z3();
                    if (c45627dM43450Z6 != null && (imageView3 = c45627dM43450Z6.f102788b) != null) {
                        imageView3.setImageResource(R$mipmap.op_welfare_signup);
                        break;
                    }
                }
                c45627dM43450Z3 = m43450Z3();
                if (c45627dM43450Z3 == null) {
                }
                break;
            case -660133283:
                break;
            case 74901:
                break;
            case 79501:
                if (upperCase.equals("PRO")) {
                    C45627d c45627dM43450Z7 = m43450Z3();
                    if (c45627dM43450Z7 != null && (imageView4 = c45627dM43450Z7.f102788b) != null) {
                        imageView4.setImageResource(R$mipmap.op_welfare_trade);
                        break;
                    }
                }
                c45627dM43450Z3 = m43450Z3();
                if (c45627dM43450Z3 == null) {
                }
                break;
            case 80083268:
                if (upperCase.equals("TRADE")) {
                    C45627d c45627dM43450Z8 = m43450Z3();
                    if (c45627dM43450Z8 != null && (imageView5 = c45627dM43450Z8.f102788b) != null) {
                        imageView5.setImageResource(R$mipmap.op_welfare_trade);
                        break;
                    }
                }
                c45627dM43450Z3 = m43450Z3();
                if (c45627dM43450Z3 == null) {
                }
                break;
            default:
                c45627dM43450Z3 = m43450Z3();
                if (c45627dM43450Z3 == null) {
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: X3 */
    public final void m43448X3(WelfareTaskInfoEntity welfareTaskInfoEntity) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        String taskTitle = welfareTaskInfoEntity.getTaskTitle();
        String string = "";
        if (taskTitle == null) {
            taskTitle = "";
        }
        if (taskTitle.length() > 0) {
            C45627d c45627dM43450Z3 = m43450Z3();
            if (c45627dM43450Z3 != null && (baseTextView2 = c45627dM43450Z3.f102803q) != null) {
                baseTextView2.setText(taskTitle);
                return;
            }
            return;
        }
        C45627d c45627dM43450Z4 = m43450Z3();
        if (c45627dM43450Z4 != null && (baseTextView = c45627dM43450Z4.f102803q) != null) {
            String taskType = welfareTaskInfoEntity.getTaskType();
            if (taskType == null) {
                taskType = "";
            }
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = taskType.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            switch (upperCase.hashCode()) {
                case -2022530434:
                    if (upperCase.equals("DEPOSIT")) {
                        string = getString(R$string.home_welfare_first_deposit);
                    }
                    break;
                case -1488690083:
                    if (upperCase.equals("SIGN_UP")) {
                        string = getString(R$string.home_welfare_sign_or_login);
                    }
                    break;
                case -660133283:
                    if (upperCase.equals("OLD_KYC")) {
                        string = getString(R$string.home_welfare_kyc_auth_title);
                    }
                    break;
                case 74901:
                    if (upperCase.equals("KYC")) {
                        string = getString(R$string.home_welfare_kyc_auth_title);
                    }
                    break;
                case 79501:
                    if (upperCase.equals("PRO")) {
                        string = getString(R$string.home_welfare_more_trade);
                    }
                    break;
                case 80083268:
                    if (upperCase.equals("TRADE")) {
                        string = getString(R$string.home_welfare_first_trade);
                    }
                    break;
            }
            baseTextView.setText(string);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: Y3 */
    public final void m43449Y3(@Nullable WelfareTaskInfoEntity welfareTaskInfoEntity) {
        LinearLayoutCompat linearLayoutCompat;
        FrameLayout frameLayout;
        WelfareTaskInfoEntity welfareTaskInfoEntityM43421c4 = m43421c4(welfareTaskInfoEntity);
        if (welfareTaskInfoEntityM43421c4 == null) {
            return;
        }
        View view = this.f36735a0;
        if (view != null) {
            ViewExtKt.m66577h(view);
            C45627d c45627dM43450Z3 = m43450Z3();
            if (c45627dM43450Z3 != null && (frameLayout = c45627dM43450Z3.f102795i) != null) {
                frameLayout.removeView(view);
            }
        }
        C45627d c45627dM43450Z4 = m43450Z3();
        if (c45627dM43450Z4 != null && (linearLayoutCompat = c45627dM43450Z4.f102792f) != null) {
            ViewExtKt.m66594y(linearLayoutCompat);
        }
        m43448X3(welfareTaskInfoEntityM43421c4);
        m43444P3(welfareTaskInfoEntityM43421c4);
        m43443L3(welfareTaskInfoEntityM43421c4);
        m43446T3(welfareTaskInfoEntityM43421c4);
        m43447U3(welfareTaskInfoEntityM43421c4);
        m43445Q3(welfareTaskInfoEntityM43421c4);
        m43451d4(welfareTaskInfoEntityM43421c4);
        this.f36734Z = welfareTaskInfoEntityM43421c4;
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void bindFlowEvent() {
        super.bindFlowEvent();
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        int i11 = R$font.semi;
        int i12 = R$color.c_text;
        Pair[] pairArr = {new Pair(textTagEnum, C22912t.m54408f(i11, getColorRes(i12))), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, C22912t.m54408f(i11, getColorRes(i12))), new Pair(HighlightTextHelper.TextTagEnum.SPAN2, C22912t.m54408f(i11, getColorRes(i12))), new Pair(HighlightTextHelper.TextTagEnum.SPAN3, C22912t.m54408f(i11, getColorRes(i12)))};
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "OperationEvent:COUNT_DOWN_WELFARE".length();
        }
        C12572a.m23692a(this, false, new WelfareCard$bindFlowEvent$$inlined$bindFlowEvent$default$1("OperationEvent:COUNT_DOWN_WELFARE", null, this, pairArr));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new WelfareCard$bindFlowEvent$$inlined$bindFlowEvent$default$2("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d4 */
    public final void m43451d4(WelfareTaskInfoEntity welfareTaskInfoEntity) {
        String str;
        String taskType = welfareTaskInfoEntity.getTaskType();
        if (taskType == null) {
            taskType = "";
        }
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String upperCase = taskType.toUpperCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -2022530434:
                if (upperCase.equals("DEPOSIT")) {
                    C45308i.m100181f("rhdepositpageview", null, null, 6, null);
                    break;
                }
                break;
            case -1488690083:
                if (upperCase.equals("SIGN_UP")) {
                    C45308i.m100181f("rhloginpageview", null, null, 6, null);
                    break;
                }
                break;
            case -660133283:
                if (upperCase.equals("OLD_KYC")) {
                    String taskSubTitle = welfareTaskInfoEntity.getTaskSubTitle();
                    if (taskSubTitle != null && taskSubTitle.length() != 0) {
                        str = "rholdkycpageview";
                    } else {
                        str = "rhotheroldkycpageview";
                    }
                    C45308i.m100181f(str, null, null, 6, null);
                    break;
                }
                break;
            case 74901:
                if (upperCase.equals("KYC")) {
                    C45308i.m100181f("rhnewkycpageview", null, null, 6, null);
                    break;
                }
                break;
            case 79501:
                if (upperCase.equals("PRO")) {
                    C45308i.m100181f("rhprotradepageview", null, null, 6, null);
                    break;
                }
                break;
            case 80083268:
                if (upperCase.equals("TRADE")) {
                    C45308i.m100181f("rhfirsttradepageview", null, null, 6, null);
                    break;
                }
                break;
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard
    public void initView() {
        final FrameLayout frameLayout;
        super.initView();
        C45627d c45627dM43450Z3 = m43450Z3();
        if (c45627dM43450Z3 != null && (frameLayout = c45627dM43450Z3.f102795i) != null) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.operation.lib.cards.welfare.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WelfareCard.m43420b4(frameLayout, this);
                }
            });
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public void onAgainShow() {
        Boolean boolValueOf;
        LinearLayoutCompat linearLayoutCompat;
        super.onAgainShow();
        if (ViewExtKt.m66581l(getContentView())) {
            sendIntent(WelfareContract$UiIntent.LoadData.INSTANCE);
            C45627d c45627dM43450Z3 = m43450Z3();
            if (c45627dM43450Z3 != null && (linearLayoutCompat = c45627dM43450Z3.f102791e) != null) {
                boolValueOf = Boolean.valueOf(C27046k.m66704s(linearLayoutCompat));
            } else {
                boolValueOf = null;
            }
            if (C27025c.m66566d(boolValueOf)) {
                CountDownHelper.m43603j(m43419a4(), LifecycleOwnerKt.getLifecycleScope(this), null, 2, null);
            }
        }
    }

    @Override // com.kubi.kucoin.home.cards.BaseStateCard, com.kubi.kucoin.home.cards.BaseCardFragment
    public void onHide() {
        super.onHide();
        m43419a4().m43608l();
    }
}
