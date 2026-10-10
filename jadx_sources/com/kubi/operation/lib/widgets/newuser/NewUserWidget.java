package com.kubi.operation.lib.widgets.newuser;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.advert.api.IAdvertService;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.p090v2.cards.SimpleStateCardV2;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.R$string;
import com.kubi.operation.lib.entity.WelfareTaskInfoEntity;
import com.kubi.operation.lib.entity.WidgetNewUserEntity;
import com.kubi.operation.lib.utils.C19570t;
import com.kubi.operation.lib.utils.CountDownHelper;
import com.kubi.operation.lib.utils.CountdownType;
import com.kubi.operation.lib.widgets.newuser.helper.NewUserWidgetVideoHelper;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.shimmer.C22911a;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.util.StartupTrace;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37754f;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p213dw.InterfaceC36986b;
import p429lf.C42180b;
import p502oj.C43101f;
import p701vs.C45636m;
import p701vs.C45640q;
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

/* JADX INFO: compiled from: NewUserWidget.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010$\u001a\u00020\rH\u0014J\b\u0010%\u001a\u00020\rH\u0016J\b\u0010&\u001a\u00020\rH\u0014J\b\u0010'\u001a\u00020\rH\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u001f*\u0004\u0018\u00010\u001fH\u0002J\u0012\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u0012\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u0016\u0010/\u001a\u00020\r2\f\u00100\u001a\b\u0012\u0004\u0012\u00020.01H\u0002J\b\u00102\u001a\u00020\rH\u0016J\b\u00103\u001a\u00020\rH\u0016J\b\u00104\u001a\u00020\rH\u0016J\b\u00105\u001a\u00020\rH\u0016J\b\u00106\u001a\u00020\rH\u0016J\u0010\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020#H\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/newuser/NewUserWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "binding", "Lcom/kubi/operation/lib/databinding/OperationWidgetNewuserBinding;", "getBinding$OperationLib_googleRelease", "()Lcom/kubi/operation/lib/databinding/OperationWidgetNewuserBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "countDownHelper", "Lcom/kubi/operation/lib/utils/CountDownHelper;", "getCountDownHelper", "()Lcom/kubi/operation/lib/utils/CountDownHelper;", "countDownHelper$delegate", "Lkotlin/Lazy;", "currentEntity", "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "videoHelper", "Lcom/kubi/operation/lib/widgets/newuser/helper/NewUserWidgetVideoHelper;", "isListMoving", "", "initView", "onAgainShow", "bindFlowEvent", "bindUIState", "preCheckPassed", "fillViewData", "newUserEntity", "Lcom/kubi/operation/lib/entity/WidgetNewUserEntity;", "configBtnSignupLoginClick", "jumpUrl", "", "refreshCountDown", "times", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onMoveStart", "onMoveStop", "onDestroyView", "displayShimmer", TIMPushProvider.f75062n, "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewUserWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewUserWidget.kt\ncom/kubi/operation/lib/widgets/newuser/NewUserWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n*L\n1#1,269:1\n147#2,16:270\n76#3,7:286\n153#3,7:293\n*S KotlinDebug\n*F\n+ 1 NewUserWidget.kt\ncom/kubi/operation/lib/widgets/newuser/NewUserWidget\n*L\n64#1:270,16\n94#1:286,7\n96#1:293,7\n*E\n"})
public final class NewUserWidget extends SimpleStateCardV2<UIState> {

    /* JADX INFO: renamed from: c0 */
    public static final /* synthetic */ KProperty<Object>[] f36909c0 = {Reflection.property1(new PropertyReference1Impl(NewUserWidget.class, "binding", "getBinding$OperationLib_googleRelease()Lcom/kubi/operation/lib/databinding/OperationWidgetNewuserBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @Nullable
    public WelfareTaskInfoEntity f36912Z;

    /* JADX INFO: renamed from: b0 */
    public boolean f36914b0;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f36910X = C45681e.m100799e(this, new Function1<NewUserWidget, C45640q>() { // from class: com.kubi.operation.lib.widgets.newuser.NewUserWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45640q invoke(@NotNull NewUserWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45640q.m100771a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45640q, Unit>() { // from class: com.kubi.operation.lib.widgets.newuser.NewUserWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45640q it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45640q c45640q) {
            invoke(c45640q);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f36911Y = LazyKt.lazy(new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewUserWidget.m43733x3();
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final NewUserWidgetVideoHelper f36913a0 = new NewUserWidgetVideoHelper();

    /* JADX INFO: renamed from: B3 */
    public static final Unit m43718B3(NewUserWidget newUserWidget, WidgetNewUserEntity widgetNewUserEntity) {
        C45640q c45640qM43737D3 = newUserWidget.m43737D3();
        if (c45640qM43737D3 == null) {
            C43101f.f95302a.m94714h();
            return Unit.INSTANCE;
        }
        C43101f c43101f = C43101f.f95302a;
        c43101f.m94709b("home_page_new_user_widget_show_data");
        final WelfareTaskInfoEntity welfareTaskInfoEntityM43739F3 = newUserWidget.m43739F3(widgetNewUserEntity != null ? widgetNewUserEntity.getEntity() : null);
        boolean z11 = false;
        newUserWidget.m43734y3(false);
        LinearLayoutCompat layoutData = c45640qM43737D3.f102905e;
        Intrinsics.checkNotNullExpressionValue(layoutData, "layoutData");
        C27046k.m66685H(layoutData);
        newUserWidget.m43741u3("user/register");
        if (welfareTaskInfoEntityM43739F3 == null) {
            c43101f.m94714h();
            return Unit.INSTANCE;
        }
        String videoUrl = widgetNewUserEntity != null ? widgetNewUserEntity.getVideoUrl() : null;
        if (videoUrl == null) {
            videoUrl = "";
        }
        NewUserWidgetVideoHelper newUserWidgetVideoHelper = newUserWidget.f36913a0;
        ViewStub videoStub = c45640qM43737D3.f102922v;
        Intrinsics.checkNotNullExpressionValue(videoStub, "videoStub");
        newUserWidgetVideoHelper.m43773q(newUserWidget, videoStub, videoUrl);
        String strM43671i = C19570t.m43671i(welfareTaskInfoEntityM43739F3.getRewardValue());
        boolean z12 = strM43671i.length() > 0;
        BigDecimal bigDecimalM66671k = C27041f.m66671k(welfareTaskInfoEntityM43739F3.getAmount());
        String strM92640e = bigDecimalM66671k != null ? C42180b.m92640e(bigDecimalM66671k, null, 0, false, false, false, 0, null, 127, null) : null;
        BaseTextView tvReward = c45640qM43737D3.f102915o;
        Intrinsics.checkNotNullExpressionValue(tvReward, "tvReward");
        C27046k.m66684G(tvReward, z12);
        BaseTextView baseTextView = c45640qM43737D3.f102915o;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(strM43671i, Arrays.copyOf(new Object[]{strM92640e}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        baseTextView.setText(str);
        String rewardText = welfareTaskInfoEntityM43739F3.getRewardText();
        if (rewardText == null) {
            rewardText = "";
        }
        BaseTextView tvTitle = c45640qM43737D3.f102921u;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        C27046k.m66684G(tvTitle, rewardText.length() > 0 && z12);
        c45640qM43737D3.f102921u.setText(rewardText);
        String subtitle = welfareTaskInfoEntityM43739F3.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        BaseTextView tvSubTitle = c45640qM43737D3.f102920t;
        Intrinsics.checkNotNullExpressionValue(tvSubTitle, "tvSubTitle");
        C27046k.m66684G(tvSubTitle, subtitle.length() > 0 && z12);
        c45640qM43737D3.f102920t.setText(subtitle);
        c45640qM43737D3.f102910j.setText(welfareTaskInfoEntityM43739F3.getCountDownTipsDay());
        c45640qM43737D3.f102912l.setText(welfareTaskInfoEntityM43739F3.getCountDownTipsHour());
        c45640qM43737D3.f102914n.setText(welfareTaskInfoEntityM43739F3.getCountDownTipsMinute());
        c45640qM43737D3.f102917q.setText(welfareTaskInfoEntityM43739F3.getCountDownTipsSecond());
        long jM66652l = C27039d.m66652l(welfareTaskInfoEntityM43739F3.getCountDownTime());
        LinearLayoutCompat layoutCountdown = c45640qM43737D3.f102904d;
        Intrinsics.checkNotNullExpressionValue(layoutCountdown, "layoutCountdown");
        C27046k.m66684G(layoutCountdown, jM66652l > 0 && z12);
        if (jM66652l > 0 && z12) {
            newUserWidget.m43738E3().m43607i(LifecycleOwnerKt.getLifecycleScope(newUserWidget), Long.valueOf(C27039d.m66652l(Long.valueOf(jM66652l))));
        }
        String rewardCenterTips = welfareTaskInfoEntityM43739F3.getRewardCenterTips();
        if (rewardCenterTips == null) {
            rewardCenterTips = "";
        }
        BaseTextView tvBonusCenter = c45640qM43737D3.f102908h;
        Intrinsics.checkNotNullExpressionValue(tvBonusCenter, "tvBonusCenter");
        if (rewardCenterTips.length() > 0 && z12) {
            z11 = true;
        }
        C27046k.m66684G(tvBonusCenter, z11);
        c45640qM43737D3.f102908h.setText(rewardCenterTips);
        BaseTextView tvBonusCenter2 = c45640qM43737D3.f102908h;
        Intrinsics.checkNotNullExpressionValue(tvBonusCenter2, "tvBonusCenter");
        C27046k.m66711z(tvBonusCenter2, 0L, new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewUserWidget.m43719C3(welfareTaskInfoEntityM43739F3);
            }
        }, 1, null);
        BaseTextView tvSlogan1 = c45640qM43737D3.f102918r;
        Intrinsics.checkNotNullExpressionValue(tvSlogan1, "tvSlogan1");
        C27046k.m66684G(tvSlogan1, !z12);
        BaseTextView tvSlogan2 = c45640qM43737D3.f102919s;
        Intrinsics.checkNotNullExpressionValue(tvSlogan2, "tvSlogan2");
        C27046k.m66684G(tvSlogan2, true ^ z12);
        KcPrimaryButton kcPrimaryButton = c45640qM43737D3.f102902b;
        String btnTips = welfareTaskInfoEntityM43739F3.getBtnTips();
        String string = btnTips != null ? btnTips : "";
        if (string.length() == 0) {
            string = newUserWidget.getString(R$string.home_welfare_sign_or_login);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        kcPrimaryButton.setText(string);
        newUserWidget.m43741u3(welfareTaskInfoEntityM43739F3.getBtnForwardUrl());
        newUserWidget.f36912Z = welfareTaskInfoEntityM43739F3;
        StartupTrace startupTrace = StartupTrace.f48194a;
        startupTrace.m58450j("$event_duration");
        c43101f.m94712f();
        startupTrace.m58457q();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m43731v3(String str) throws JSONException {
        if (UserInfo.a.m()) {
            IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewUserWidget.m43732w3();
                }
            }, 1, (Object) null);
        } else {
            RouteExKt.m56217H(str);
        }
        IAdvertService.m14758l(IAdvertService.f15070a.get(), "HomePage_Click_Signup", null, 2, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "signupBtn", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m43732w3() {
        InterfaceC37754f.a.m85132d(C37304a.f82764a, null, null, null, null, null, null, 63, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final CountDownHelper m43733x3() {
        return new CountDownHelper(CountdownType.Bonus);
    }

    /* JADX INFO: renamed from: y3 */
    private final void m43734y3(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewUserWidget.m43735z3(this.f36917b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: A3 */
    public final void m43736A3(final WidgetNewUserEntity widgetNewUserEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewUserWidget.m43718B3(this.f36921b, widgetNewUserEntity);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: D3 */
    public final C45640q m43737D3() {
        return (C45640q) this.f36910X.getValue(this, f36909c0[0]);
    }

    /* JADX INFO: renamed from: E3 */
    public final CountDownHelper m43738E3() {
        return (CountDownHelper) this.f36911Y.getValue();
    }

    /* JADX INFO: renamed from: G3 */
    public final void m43740G3(final List<String> list) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NewUserWidget.m43720H3(this.f36919b, list);
            }
        });
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        C43101f.f95302a.m94709b("home_page_new_user_widget_on_create_view");
        return R$layout.operation_widget_newuser;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<NewUserWidgetVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(NewUserWidgetVM.class);
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C43101f.f95302a.m94709b("home_page_new_user_widget_on_view_created");
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m43719C3(WelfareTaskInfoEntity welfareTaskInfoEntity) throws JSONException {
        RouteExKt.m56217H(welfareTaskInfoEntity.getRewardCenterUri());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "rewardshub", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m43720H3(NewUserWidget newUserWidget, List list) {
        C45640q c45640qM43737D3 = newUserWidget.m43737D3();
        if (c45640qM43737D3 == null) {
            return Unit.INSTANCE;
        }
        if (newUserWidget.f36914b0) {
            return Unit.INSTANCE;
        }
        LinearLayoutCompat layoutCountdown = c45640qM43737D3.f102904d;
        Intrinsics.checkNotNullExpressionValue(layoutCountdown, "layoutCountdown");
        if (!C27046k.m66704s(layoutCountdown)) {
            return Unit.INSTANCE;
        }
        if (newUserWidget.m43738E3().m43606h()) {
            LinearLayoutCompat layoutCountdown2 = c45640qM43737D3.f102904d;
            Intrinsics.checkNotNullExpressionValue(layoutCountdown2, "layoutCountdown");
            C27046k.m66700o(layoutCountdown2);
        } else {
            c45640qM43737D3.f102909i.setText((CharSequence) list.get(0));
            c45640qM43737D3.f102911k.setText((CharSequence) list.get(1));
            c45640qM43737D3.f102913m.setText((CharSequence) list.get(2));
            c45640qM43737D3.f102916p.setText((CharSequence) list.get(3));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m43735z3(NewUserWidget newUserWidget, boolean z11) {
        C45640q c45640qM43737D3 = newUserWidget.m43737D3();
        if (c45640qM43737D3 == null) {
            return Unit.INSTANCE;
        }
        ViewGroup viewGroup = null;
        if (z11) {
            C45636m c45636m = c45640qM43737D3.f102903c;
            LinearLayoutCompat linearLayoutCompatM100763b = c45636m.getRoot();
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompatM100763b, "getRoot(...)");
            C27046k.m66685H(linearLayoutCompatM100763b);
            View v11 = c45636m.f102880b;
            Intrinsics.checkNotNullExpressionValue(v11, "v1");
            InterfaceC36986b interfaceC36986bM54400e = C22911a.m54400e(v11, Float.valueOf(100.0f));
            if (interfaceC36986bM54400e != null) {
                interfaceC36986bM54400e.mo54393a();
            }
            C22911a.m54397b(CollectionsKt.listOf((Object[]) new View[]{c45636m.f102881c, c45636m.f102882d, c45636m.f102883e}), false, 1, null);
            View v12 = c45636m.f102884f;
            Intrinsics.checkNotNullExpressionValue(v12, "v5");
            InterfaceC36986b interfaceC36986bM54400e2 = C22911a.m54400e(v12, Float.valueOf(24.0f));
            if (interfaceC36986bM54400e2 != null) {
                interfaceC36986bM54400e2.mo54393a();
            }
        } else {
            LinearLayoutCompat linearLayoutCompatM100763b2 = c45640qM43737D3.f102903c.getRoot();
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompatM100763b2, "getRoot(...)");
            ViewParent parent = linearLayoutCompatM100763b2.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup != null) {
                viewGroup.removeView(linearLayoutCompatM100763b2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public final WelfareTaskInfoEntity m43739F3(WelfareTaskInfoEntity welfareTaskInfoEntity) {
        String btnForwardUrl;
        String btnForwardUrl2;
        if (getView() == null || isDetached() || isRemoving()) {
            return null;
        }
        if (this.f36912Z == null) {
            if (welfareTaskInfoEntity != null) {
                btnForwardUrl2 = welfareTaskInfoEntity.getBtnForwardUrl();
            } else {
                btnForwardUrl2 = null;
            }
            if (btnForwardUrl2 == null || btnForwardUrl2.length() == 0) {
                return null;
            }
        }
        boolean zAreEqual = Intrinsics.areEqual(this.f36912Z, welfareTaskInfoEntity);
        if (this.f36912Z != null) {
            if (!zAreEqual) {
                if (welfareTaskInfoEntity != null) {
                    btnForwardUrl = welfareTaskInfoEntity.getBtnForwardUrl();
                } else {
                    btnForwardUrl = null;
                }
                if (btnForwardUrl != null && btnForwardUrl.length() != 0) {
                    return welfareTaskInfoEntity;
                }
            }
            return null;
        }
        return welfareTaskInfoEntity;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: P */
    public void mo31093P() {
        super.mo31093P();
        this.f36913a0.m43778z();
        this.f36914b0 = false;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.ICardV2
    /* JADX INFO: renamed from: Q */
    public void mo31094Q() {
        super.mo31094Q();
        this.f36913a0.m43777x();
        this.f36914b0 = true;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "OperationEvent:COUNT_DOWN_BONUS".length();
        }
        C12572a.m23692a(this, false, new NewUserWidget$bindFlowEvent$$inlined$bindFlowEvent$default$1("OperationEvent:COUNT_DOWN_BONUS", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new NewUserWidget$bindFlowEvent$$inlined$bindFlowEvent$default$2("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    /* JADX INFO: renamed from: i3 */
    public void mo20971i3() {
        super.mo20971i3();
        bindState(new PropertyReference1Impl() { // from class: com.kubi.operation.lib.widgets.newuser.NewUserWidget$bindUIState$1
            @Override // p852kotlin.jvm.internal.PropertyReference1Impl, p852kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((UIState) obj).getData();
            }
        }, new NewUserWidget$bindUIState$2(this, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        LinearLayoutCompat linearLayoutCompat;
        super.initView();
        C45640q c45640qM43737D3 = m43737D3();
        if (c45640qM43737D3 != null && (linearLayoutCompat = c45640qM43737D3.f102905e) != null) {
            C27046k.m66700o(linearLayoutCompat);
        }
        m43734y3(true);
        if (C43101f.f95302a.m94711e()) {
            sendIntent(new NewUserWidgetContract$UiIntent.LoadData(false, 1, null));
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onAgainShow() {
        Boolean boolValueOf;
        LinearLayoutCompat linearLayoutCompat;
        super.onAgainShow();
        C45640q c45640qM43737D3 = m43737D3();
        if (c45640qM43737D3 != null && (linearLayoutCompat = c45640qM43737D3.f102904d) != null) {
            boolValueOf = Boolean.valueOf(ViewExtKt.m66581l(linearLayoutCompat));
        } else {
            boolValueOf = null;
        }
        if (C27025c.m66566d(boolValueOf)) {
            CountDownHelper.m43603j(m43738E3(), LifecycleOwnerKt.getLifecycleScope(this), null, 2, null);
        }
        if (C43101f.f95302a.m94711e()) {
            sendIntent(new NewUserWidgetContract$UiIntent.LoadData(false, 1, null));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f36913a0.m43776v();
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onHide() {
        super.onHide();
        this.f36913a0.m43777x();
        m43738E3().m43608l();
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        super.onShow();
        if (!C43101f.f95302a.m94711e()) {
            sendIntent(new NewUserWidgetContract$UiIntent.LoadData(false, 1, null));
        }
        this.f36913a0.m43778z();
        this.f36914b0 = false;
    }

    /* JADX INFO: renamed from: u3 */
    public final void m43741u3(final String str) {
        KcPrimaryButton kcPrimaryButton;
        C45640q c45640qM43737D3 = m43737D3();
        if (c45640qM43737D3 != null && (kcPrimaryButton = c45640qM43737D3.f102902b) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.operation.lib.widgets.newuser.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewUserWidget.m43731v3(str);
                }
            }, 1, null);
        }
    }
}
