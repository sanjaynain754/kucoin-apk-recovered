package com.kubi.operation.lib.widgets.userstatus;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.C5272h;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.assets.entity.HomeAssetInfo;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.home.api.HomeConst;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.kucoin.home.p090v2.cards.SimpleStateCardV2;
import com.kubi.operation.lib.R$color;
import com.kubi.operation.lib.R$drawable;
import com.kubi.operation.lib.R$font;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.R$mipmap;
import com.kubi.operation.lib.R$string;
import com.kubi.operation.lib.cards.welfare.WelfareContract$UiIntent;
import com.kubi.operation.lib.cards.welfare.utils.WelfareTaskStatus;
import com.kubi.operation.lib.cards.welfare.utils.WelfareTaskType;
import com.kubi.operation.lib.entity.UserStatusInfoResponseEntity;
import com.kubi.operation.lib.entity.WelfareTaskInfoEntity;
import com.kubi.operation.lib.utils.OperationStoreId;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.resources.C22890g;
import com.kubi.resources.C22912t;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.shimmer.C22911a;
import com.kubi.resources.widget.AutoSizeShowHideTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37749a;
import g00.InterfaceC37754f;
import g00.InterfaceC37755g;
import g00.InterfaceC37764p;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p208dr.InterfaceC36952a;
import p402kf.C41014a;
import p402kf.C41016c;
import p429lf.C42180b;
import p569qq.C43841b;
import p569qq.C43852m;
import p701vs.C45637n;
import p701vs.C45641r;
import p701vs.C45642s;
import p701vs.C45643t;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import rs.AbstractC44173c;
import rs.C44172b;
import w00.C45681e;
import y70.C46392a;

/* JADX INFO: compiled from: UserStatusWidget.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0014J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u001a\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0013H\u0002J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010$\u001a\u00020\u0015H\u0002J\u0019\u0010%\u001a\u00020\u00152\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020\u0015H\u0002J\u0010\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u001eH\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidget;", "Lcom/kubi/kucoin/home/v2/cards/SimpleStateCardV2;", "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetContract$UIState;", "<init>", "()V", "vmClass", "Lkotlin/reflect/KClass;", "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidgetVM;", "getVmClass", "()Lkotlin/reflect/KClass;", "getLayout", "", "binding", "Lcom/kubi/operation/lib/databinding/OperationWidgetUserStatusBinding;", "getBinding$OperationLib_googleRelease", "()Lcom/kubi/operation/lib/databinding/OperationWidgetUserStatusBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "lastEntity", "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "initView", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "bindFlowEvent", "dispatchSingleEvent", "singleEvent", "Lcom/kubi/mvi/event/ISingleEvent;", "showContent", "showAsset", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/operation/lib/entity/UserStatusInfoResponseEntity;", "fillNewGuideView", "data", "fillGuideView", "fillAssetView", "loadRemoteAssetData", "cacheTime", "", "(Ljava/lang/Long;)V", "refreshAssetDataView", "info", "Lcom/kubi/assets/entity/HomeAssetInfo;", "initAssetView", "refreshAssetShowHide", "showShimmer", TIMPushProvider.f75062n, "Companion", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUserStatusWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserStatusWidget.kt\ncom/kubi/operation/lib/widgets/userstatus/UserStatusWidget\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n147#2,16:459\n67#3:475\n58#3,2:494\n136#3:497\n126#3,2:498\n153#4,7:476\n153#4,7:483\n93#5,4:490\n1#6:496\n*S KotlinDebug\n*F\n+ 1 UserStatusWidget.kt\ncom/kubi/operation/lib/widgets/userstatus/UserStatusWidget\n*L\n86#1:459,16\n92#1:475\n183#1:494,2\n353#1:497\n406#1:498,2\n127#1:476,7\n135#1:483,7\n143#1:490,4\n*E\n"})
public final class UserStatusWidget extends SimpleStateCardV2<UserStatusWidgetContract$UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f37003X = C45681e.m100799e(this, new Function1<UserStatusWidget, C45642s>() { // from class: com.kubi.operation.lib.widgets.userstatus.UserStatusWidget$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45642s invoke(@NotNull UserStatusWidget fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45642s.m100775a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45642s, Unit>() { // from class: com.kubi.operation.lib.widgets.userstatus.UserStatusWidget$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45642s it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45642s c45642s) {
            invoke(c45642s);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    @Nullable
    public WelfareTaskInfoEntity f37004Y;

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ KProperty<Object>[] f37002a0 = {Reflection.property1(new PropertyReference1Impl(UserStatusWidget.class, "binding", "getBinding$OperationLib_googleRelease()Lcom/kubi/operation/lib/databinding/OperationWidgetUserStatusBinding;", 0))};

    /* JADX INFO: renamed from: Z */
    @NotNull
    public static final Companion f37001Z = new Companion(null);

    /* JADX INFO: compiled from: UserStatusWidget.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusWidget$Companion;", "", "<init>", "()V", "TAG", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x0123  */
    /* JADX WARN: Code duplicated, block: B:51:0x0132  */
    /* JADX WARN: Code duplicated, block: B:52:0x017f  */
    /* JADX WARN: Code duplicated, block: B:55:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x025f  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0132, please report this as an issue */
    /* JADX INFO: renamed from: I3 */
    public static final Unit m43840I3(final UserStatusWidget userStatusWidget, final WelfareTaskInfoEntity welfareTaskInfoEntity) throws JSONException {
        C45643t c45643t;
        String str;
        C45642s c45642sM43877O3 = userStatusWidget.m43877O3();
        if (c45642sM43877O3 == null) {
            return Unit.INSTANCE;
        }
        C45642s c45642sM43877O4 = userStatusWidget.m43877O3();
        if (c45642sM43877O4 == null || (c45643t = c45642sM43877O4.f102937c) == null) {
            return Unit.INSTANCE;
        }
        WelfareTaskInfoEntity welfareTaskInfoEntity2 = userStatusWidget.f37004Y;
        if (welfareTaskInfoEntity2 != null && Intrinsics.areEqual(welfareTaskInfoEntity, welfareTaskInfoEntity2)) {
            C44128b.m97259c("UserStatus", "WelfareTaskInfoEntity is same, ignore send.");
            return Unit.INSTANCE;
        }
        ConstraintLayout constraintLayoutM100776b = c45642sM43877O3.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM100776b, "getRoot(...)");
        C27046k.m66685H(constraintLayoutM100776b);
        ConstraintLayout constraintLayoutM100778b = c45642sM43877O3.f102937c.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM100778b, "getRoot(...)");
        C27046k.m66685H(constraintLayoutM100778b);
        ConstraintLayout constraintLayoutM100774b = c45642sM43877O3.f102936b.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM100774b, "getRoot(...)");
        C27046k.m66700o(constraintLayoutM100774b);
        if (welfareTaskInfoEntity.showGuideBtn()) {
            LinearLayoutCompat layoutBtnAction = c45643t.f102945e;
            Intrinsics.checkNotNullExpressionValue(layoutBtnAction, "layoutBtnAction");
            C27046k.m66685H(layoutBtnAction);
        } else {
            LinearLayoutCompat layoutBtnAction2 = c45643t.f102945e;
            Intrinsics.checkNotNullExpressionValue(layoutBtnAction2, "layoutBtnAction");
            C27046k.m66700o(layoutBtnAction2);
        }
        userStatusWidget.f37004Y = welfareTaskInfoEntity;
        String strM66668h = C27041f.m66668h(welfareTaskInfoEntity.getTaskTitle());
        String taskType = welfareTaskInfoEntity.getTaskType();
        if (taskType == null) {
            taskType = "";
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = taskType.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        switch (upperCase) {
            case "DEPOSIT":
                BaseTextView baseTextView = c45643t.f102950j;
                if (strM66668h.length() == 0) {
                    strM66668h = userStatusWidget.getString(R$string.home_welfare_first_deposit);
                    Intrinsics.checkNotNullExpressionValue(strM66668h, "getString(...)");
                }
                baseTextView.setText(strM66668h);
                BaseTextView baseTextView2 = c45643t.f102949i;
                String taskSubTitle = welfareTaskInfoEntity.getTaskSubTitle();
                baseTextView2.setText(taskSubTitle != null ? taskSubTitle : "");
                c45643t.f102944d.setImageResource(R$mipmap.operation_ic_status_deposit);
                BaseTextView tvKycState = c45643t.f102947g;
                Intrinsics.checkNotNullExpressionValue(tvKycState, "tvKycState");
                C27046k.m66700o(tvKycState);
                c45643t.f102943c.setText(userStatusWidget.getString(R$string.home_welfare_deposit_go_crypto));
                LinearLayoutCompat layoutBtnAction3 = c45643t.f102945e;
                Intrinsics.checkNotNullExpressionValue(layoutBtnAction3, "layoutBtnAction");
                C27046k.m66710y(layoutBtnAction3, 1000L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.y
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserStatusWidget.m43843L3();
                    }
                });
                BaseTextView tvLogin = c45643t.f102948h;
                Intrinsics.checkNotNullExpressionValue(tvLogin, "tvLogin");
                C27046k.m66700o(tvLogin);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("norm_version", "1");
                Unit unit = Unit.INSTANCE;
                C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, "rhdeposit", null, jSONObject, 4, null);
                break;
            case "SIGN_UP":
                BaseTextView baseTextView3 = c45643t.f102950j;
                if (strM66668h.length() == 0) {
                    strM66668h = userStatusWidget.getString(R$string.home_welfare_sign_or_login);
                    Intrinsics.checkNotNullExpressionValue(strM66668h, "getString(...)");
                }
                baseTextView3.setText(strM66668h);
                BaseTextView baseTextView4 = c45643t.f102949i;
                String taskSubTitle2 = welfareTaskInfoEntity.getTaskSubTitle();
                baseTextView4.setText(taskSubTitle2 != null ? taskSubTitle2 : "");
                c45643t.f102944d.setImageResource(R$mipmap.operation_ic_status_login);
                BaseTextView tvKycState2 = c45643t.f102947g;
                Intrinsics.checkNotNullExpressionValue(tvKycState2, "tvKycState");
                C27046k.m66700o(tvKycState2);
                c45643t.f102943c.setText(userStatusWidget.getString(R$string.home_welfare_signup_go_signup));
                LinearLayoutCompat layoutBtnAction4 = c45643t.f102945e;
                Intrinsics.checkNotNullExpressionValue(layoutBtnAction4, "layoutBtnAction");
                C27046k.m66710y(layoutBtnAction4, 1000L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.w
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserStatusWidget.m43841J3();
                    }
                });
                BaseTextView tvLogin2 = c45643t.f102948h;
                Intrinsics.checkNotNullExpressionValue(tvLogin2, "tvLogin");
                C27046k.m66685H(tvLogin2);
                break;
            case "OLD_KYC":
            case "KYC":
                boolean zEqualString = WelfareTaskType.OLD_KYC.equalString(welfareTaskInfoEntity.getTaskType());
                BaseTextView baseTextView5 = c45643t.f102950j;
                if (strM66668h.length() == 0) {
                    strM66668h = userStatusWidget.getString(R$string.home_welfare_kyc_auth_title);
                    Intrinsics.checkNotNullExpressionValue(strM66668h, "getString(...)");
                }
                baseTextView5.setText(strM66668h);
                BaseTextView baseTextView6 = c45643t.f102949i;
                String taskSubTitle3 = welfareTaskInfoEntity.getTaskSubTitle();
                if (taskSubTitle3 == null) {
                    taskSubTitle3 = "";
                }
                if (taskSubTitle3.length() == 0) {
                    String string = zEqualString ? userStatusWidget.getString(R$string.home_welfare_kyc_after_content) : "";
                    Intrinsics.checkNotNull(string);
                    taskSubTitle3 = string;
                }
                baseTextView6.setText(taskSubTitle3);
                c45643t.f102944d.setImageResource(R$mipmap.operation_ic_status_kyc);
                String newTaskStatus = welfareTaskInfoEntity.getNewTaskStatus();
                final boolean zEqualString2 = WelfareTaskStatus.AUDIT.equalString(newTaskStatus);
                final boolean zEqualString3 = WelfareTaskStatus.AUDIT_FAIL.equalString(newTaskStatus);
                if (!zEqualString2 || zEqualString3) {
                    BaseTextView tvKycState3 = c45643t.f102947g;
                    Intrinsics.checkNotNullExpressionValue(tvKycState3, "tvKycState");
                    C27046k.m66685H(tvKycState3);
                    if (zEqualString2) {
                        C27014a1.m66504d(c45643t.f102947g, R$drawable.ic2_wait_16, GravityCompat.START);
                        BaseTextView tvKycState4 = c45643t.f102947g;
                        Intrinsics.checkNotNullExpressionValue(tvKycState4, "tvKycState");
                        int i11 = R$color.complementary;
                        C27046k.m66702q(tvKycState4, userStatusWidget.getColorRes(i11));
                        c45643t.f102947g.setTextColor(userStatusWidget.getColorRes(i11));
                        c45643t.f102947g.setText(userStatusWidget.getString(R$string.home_welfare_kyc_verifying_state) + ' ' + userStatusWidget.getString(R$string.home_welfare_kyc_verifying_checkback));
                        c45643t.f102943c.setText(userStatusWidget.getString(R$string.view_more));
                    } else {
                        C27014a1.m66504d(c45643t.f102947g, R$drawable.ic2_fail_16, GravityCompat.START);
                        BaseTextView tvKycState5 = c45643t.f102947g;
                        Intrinsics.checkNotNullExpressionValue(tvKycState5, "tvKycState");
                        int i12 = R$color.brandRed;
                        C27046k.m66702q(tvKycState5, userStatusWidget.getColorRes(i12));
                        c45643t.f102947g.setTextColor(userStatusWidget.getColorRes(i12));
                        BaseTextView baseTextView7 = c45643t.f102947g;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(userStatusWidget.getString(R$string.home_welfare_kyc_failed_state));
                        sb2.append(' ');
                        int i13 = R$string.home_welfare_kyc_failed_reason;
                        sb2.append(userStatusWidget.getString(i13));
                        baseTextView7.setText(sb2.toString());
                        c45643t.f102943c.setText(userStatusWidget.getString(i13));
                    }
                } else {
                    BaseTextView tvKycState6 = c45643t.f102947g;
                    Intrinsics.checkNotNullExpressionValue(tvKycState6, "tvKycState");
                    C27046k.m66700o(tvKycState6);
                    c45643t.f102943c.setText(userStatusWidget.getString(R$string.verify_now));
                }
                LinearLayoutCompat layoutBtnAction5 = c45643t.f102945e;
                Intrinsics.checkNotNullExpressionValue(layoutBtnAction5, "layoutBtnAction");
                C27046k.m66710y(layoutBtnAction5, 1000L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.x
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserStatusWidget.m43842K3(zEqualString3, zEqualString2, welfareTaskInfoEntity, userStatusWidget);
                    }
                });
                BaseTextView tvLogin3 = c45643t.f102948h;
                Intrinsics.checkNotNullExpressionValue(tvLogin3, "tvLogin");
                C27046k.m66700o(tvLogin3);
                if (zEqualString3) {
                    str = "rhverifyagain";
                } else {
                    str = "rhnewkyc";
                }
                String str2 = str;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("norm_version", "1");
                Unit unit2 = Unit.INSTANCE;
                C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, str2, null, jSONObject2, 4, null);
                break;
            default:
                ConstraintLayout constraintLayoutM100778b2 = c45643t.getRoot();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutM100778b2, "getRoot(...)");
                C27046k.m66700o(constraintLayoutM100778b2);
                break;
        }
        BaseTextView tvTips = c45643t.f102949i;
        Intrinsics.checkNotNullExpressionValue(tvTips, "tvTips");
        C22912t.m54415m(tvTips, 0, 0, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m43845Q3(final UserStatusWidget userStatusWidget) {
        C45641r c45641r;
        C45642s c45642sM43877O3 = userStatusWidget.m43877O3();
        if (c45642sM43877O3 == null || (c45641r = c45642sM43877O3.f102936b) == null) {
            return Unit.INSTANCE;
        }
        final IAssetsCenterService iAssetsCenterService = IAssetsCenterService.f16464a.get();
        KcPrimaryButton btnDeposit = c45641r.f102924b;
        Intrinsics.checkNotNullExpressionValue(btnDeposit, "btnDeposit");
        C27046k.m66710y(btnDeposit, 1000L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.f0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusWidget.m43846R3();
            }
        });
        ConstraintLayout layoutAsset = c45641r.f102927e;
        Intrinsics.checkNotNullExpressionValue(layoutAsset, "layoutAsset");
        C27046k.m66711z(layoutAsset, 0L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusWidget.m43847S3();
            }
        }, 1, null);
        BaseTextView tvTitle = c45641r.f102931i;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        BaseTextView tvUnit = c45641r.f102933k;
        Intrinsics.checkNotNullExpressionValue(tvUnit, "tvUnit");
        AppCompatImageView ivShowHide = c45641r.f102926d;
        Intrinsics.checkNotNullExpressionValue(ivShowHide, "ivShowHide");
        C27046k.m66681D(new View[]{tvTitle, tvUnit, ivShowHide}, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusWidget.m43848T3(iAssetsCenterService, userStatusWidget);
            }
        });
        DashTextView pnlTitle = c45641r.f102929g;
        Intrinsics.checkNotNullExpressionValue(pnlTitle, "pnlTitle");
        C27046k.m66711z(pnlTitle, 0L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusWidget.m43849U3(this.f37056b);
            }
        }, 1, null);
        AutoSizeShowHideTextView pnlValue = c45641r.f102930h;
        Intrinsics.checkNotNullExpressionValue(pnlValue, "pnlValue");
        AppCompatImageView ivArrow = c45641r.f102925c;
        Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
        C27046k.m66681D(new View[]{pnlValue, ivArrow}, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusWidget.m43850V3();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m43839G3(UserStatusWidget userStatusWidget) {
        userStatusWidget.m43880Y3(IAssetsCenterService.f16464a.get().mo15357w());
        userStatusWidget.m43879X3(Long.valueOf(HomeConst.f25513a.m28961a()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m43841J3() throws JSONException {
        InterfaceC37764p.a.m85185f(C37304a.f82764a, null, null, null, null, null, null, null, null, C43852m.m96602n(HomeCardViewHolderProxy.PAGE_ID, "rhsignup2", null, 4, null), null, null, 1791, null);
        C43841b.m96557d("event_click_operation_create_account", "click_start_btn", null, 4, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "rhsignup2", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m43842K3(boolean z11, boolean z12, WelfareTaskInfoEntity welfareTaskInfoEntity, UserStatusWidget userStatusWidget) throws JSONException {
        InterfaceC37755g.a.m85142a(C37304a.f82764a, null, null, C43852m.m96602n(HomeCardViewHolderProxy.PAGE_ID, z11 ? "rhverifyagain" : "rhnewkyc", null, 4, null), null, null, 27, null);
        if (!z12 && Intrinsics.areEqual(welfareTaskInfoEntity.isSignUp(), Boolean.FALSE)) {
            String taskId = welfareTaskInfoEntity.getTaskId();
            if (taskId == null) {
                taskId = "";
            }
            userStatusWidget.sendIntent(new WelfareContract$UiIntent.ApplyJoinTask(taskId));
        }
        String str = z11 ? "rhverifyagain" : "rhnewkyc";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, str, null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m43843L3() throws JSONException {
        InterfaceC37749a.a.m85107b(C37304a.f82764a, FastQuoteModel.PAY_RECHARGE, "HOMEPAGE", C43852m.m96602n(HomeCardViewHolderProxy.PAGE_ID, "rhdeposit", null, 4, null), null, null, 24, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "rhdeposit", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m43846R3() throws JSONException {
        InterfaceC37749a.a.m85107b(C37304a.f82764a, FastQuoteModel.PAY_RECHARGE, "HOMEPAGE", C43852m.m96602n(HomeCardViewHolderProxy.PAGE_ID, ChannelKycRequest.SCENE_DEPOSIT, null, 4, null), null, null, 24, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, ChannelKycRequest.SCENE_DEPOSIT, null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m43847S3() throws JSONException {
        InterfaceC37754f.a.m85130b(C37304a.f82764a, "overview", C43852m.m96602n(HomeCardViewHolderProxy.PAGE_ID, "assetAndBlank", null, 4, null), null, null, 12, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "assetAndBlank", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m43849U3(UserStatusWidget userStatusWidget) throws JSONException {
        IAssetsCenterService.Companion companion = IAssetsCenterService.f16464a;
        IAssetsCenterService iAssetsCenterService = companion.get();
        FragmentManager childFragmentManager = userStatusWidget.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        IAssetsCenterService.m15330i(iAssetsCenterService, childFragmentManager, null, 2, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put("type", companion.get().mo15347m());
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a(HomeCardViewHolderProxy.PAGE_ID, "assets", "toPNL", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m43850V3() throws JSONException {
        IAssetsCenterService.f16464a.get().mo15345k();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "viewpnl", null, jSONObject, 4, null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("norm_version", "1");
        C27023a.m66554a(HomeCardViewHolderProxy.PAGE_ID, "assets", "toPNLPage", jSONObject2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m43851W3() throws JSONException {
        IUserService.O(IUserService.a.get(), (Map) null, (IRedirect) null, 3, (Object) null);
        C43841b.m96557d("event_click_operation_login", "click_start_btn", null, 4, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "rhlogin2", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    private final void m43856f4(final boolean z11) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusWidget.m43857g4(this.f37012b, z11);
            }
        });
    }

    /* JADX INFO: renamed from: F3 */
    public final void m43874F3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusWidget.m43839G3(this.f37061b);
            }
        });
    }

    /* JADX INFO: renamed from: H3 */
    public final void m43875H3(final WelfareTaskInfoEntity welfareTaskInfoEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusWidget.m43840I3(this.f37059b, welfareTaskInfoEntity);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final void m43876M3(final WelfareTaskInfoEntity welfareTaskInfoEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusWidget.m43844N3(this.f37057b, welfareTaskInfoEntity);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: O3 */
    public final C45642s m43877O3() {
        return (C45642s) this.f37003X.getValue(this, f37002a0[0]);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m43878P3() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusWidget.m43845Q3(this.f37021b);
            }
        });
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m43880Y3(final HomeAssetInfo homeAssetInfo) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusWidget.m43852Z3(this.f37016b, homeAssetInfo);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public final void m43881a4() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusWidget.m43853b4(this.f37055b);
            }
        });
    }

    /* JADX INFO: renamed from: c4 */
    public final void m43882c4(final boolean z11, final UserStatusInfoResponseEntity userStatusInfoResponseEntity) {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusWidget.m43854d4(this.f37025b, z11, userStatusInfoResponseEntity);
            }
        });
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void dispatchSingleEvent(@NotNull InterfaceC36952a singleEvent) {
        Intrinsics.checkNotNullParameter(singleEvent, "singleEvent");
        super.dispatchSingleEvent(singleEvent);
        if (singleEvent instanceof C19623i0) {
            C19623i0 c19623i0 = (C19623i0) singleEvent;
            m43882c4(c19623i0.getF37042a(), c19623i0.getF37043b());
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public int getLayout() {
        return R$layout.operation_widget_user_status;
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    @NotNull
    public KClass<UserStatusWidgetVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(UserStatusWidgetVM.class);
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m43844N3(UserStatusWidget userStatusWidget, WelfareTaskInfoEntity welfareTaskInfoEntity) {
        C45642s c45642sM43877O3 = userStatusWidget.m43877O3();
        if (c45642sM43877O3 == null) {
            return Unit.INSTANCE;
        }
        WelfareTaskInfoEntity welfareTaskInfoEntity2 = userStatusWidget.f37004Y;
        if (welfareTaskInfoEntity2 != null && Intrinsics.areEqual(welfareTaskInfoEntity, welfareTaskInfoEntity2)) {
            C44128b.m97259c("UserStatus", "WelfareTaskInfoEntity is same, ignore send.");
            return Unit.INSTANCE;
        }
        ConstraintLayout constraintLayoutM100776b = c45642sM43877O3.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM100776b, "getRoot(...)");
        C27046k.m66685H(constraintLayoutM100776b);
        ConstraintLayout constraintLayoutM100774b = c45642sM43877O3.f102936b.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM100774b, "getRoot(...)");
        C27046k.m66700o(constraintLayoutM100774b);
        UserStatusNewGuideView userStatusGuideView = c45642sM43877O3.f102940f;
        Intrinsics.checkNotNullExpressionValue(userStatusGuideView, "userStatusGuideView");
        C27046k.m66685H(userStatusGuideView);
        userStatusWidget.f37004Y = welfareTaskInfoEntity;
        c45642sM43877O3.f102940f.m43827d(welfareTaskInfoEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m43848T3(IAssetsCenterService iAssetsCenterService, UserStatusWidget userStatusWidget) throws JSONException {
        C46392a.m102328k(iAssetsCenterService.mo15354t(), !iAssetsCenterService.mo15359y());
        userStatusWidget.m43881a4();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "assetHide", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m43852Z3(UserStatusWidget userStatusWidget, HomeAssetInfo homeAssetInfo) {
        C45641r c45641r;
        String strM89965c;
        String fiatValue;
        String originalTotalAsset;
        String strM92647l;
        BigDecimal bigDecimalM66671k;
        C45642s c45642sM43877O3 = userStatusWidget.m43877O3();
        if (c45642sM43877O3 != null && (c45641r = c45642sM43877O3.f102936b) != null) {
            Context context = c45641r.getRoot().getContext();
            userStatusWidget.m43881a4();
            boolean zM102322d = C46392a.m102322d(IAssetsCenterService.f16464a.get().mo15332B(), true);
            if (zM102322d) {
                strM89965c = C42180b.m92647l(homeAssetInfo.getBalanceCurrency());
            } else {
                strM89965c = C41016c.m89965c();
            }
            if (zM102322d) {
                fiatValue = homeAssetInfo.getTotalAsset();
            } else {
                fiatValue = homeAssetInfo.getFiatValue();
            }
            if (fiatValue != null) {
                if (fiatValue.length() == 0) {
                    fiatValue = "--";
                }
            } else {
                fiatValue = null;
            }
            c45641r.f102933k.setText('(' + strM89965c + ')');
            AutoSizeShowHideTextView tvTotalAsset = c45641r.f102932j;
            Intrinsics.checkNotNullExpressionValue(tvTotalAsset, "tvTotalAsset");
            C44172b.m97383c(tvTotalAsset, new AbstractC44173c.a(0, false, 3, null), false, 2, null).setText(C42180b.m92647l(fiatValue));
            if (!Intrinsics.areEqual(homeAssetInfo.getPnl(), "") && ((originalTotalAsset = homeAssetInfo.getOriginalTotalAsset()) == null || (bigDecimalM66671k = C27041f.m66671k(originalTotalAsset)) == null || !C41014a.m89919D(bigDecimalM66671k))) {
                LinearLayoutCompat layoutPnl = c45641r.f102928f;
                Intrinsics.checkNotNullExpressionValue(layoutPnl, "layoutPnl");
                C27046k.m66685H(layoutPnl);
                Boolean boolIsUp = homeAssetInfo.isUp();
                AutoSizeShowHideTextView autoSizeShowHideTextView = c45641r.f102930h;
                if (boolIsUp == null) {
                    strM92647l = userStatusWidget.getString(R$string.kc_assets_pnl_updating);
                } else {
                    strM92647l = C42180b.m92647l(homeAssetInfo.getPnl());
                }
                autoSizeShowHideTextView.setText(strM92647l);
                c45641r.f102929g.setText(homeAssetInfo.getPnlTitle());
                if (boolIsUp != null) {
                    Intrinsics.checkNotNull(context);
                    int iM54281f = C22890g.m54281f(context, boolIsUp.booleanValue());
                    c45641r.f102930h.setTextColor(iM54281f);
                    c45641r.f102925c.setBackground(C22890g.m54287l(C5272h.m6230b(iM54281f, 20), 4.0f));
                    AppCompatImageView ivArrow = c45641r.f102925c;
                    Intrinsics.checkNotNullExpressionValue(ivArrow, "ivArrow");
                    C27046k.m66701p(ivArrow, iM54281f);
                } else {
                    c45641r.f102930h.setTextColor(userStatusWidget.getColorRes(R$color.complementary));
                    c45641r.f102925c.setBackground(C22890g.m54287l(userStatusWidget.getColorRes(R$color.c_cover4), 4.0f));
                    AppCompatImageView ivArrow2 = c45641r.f102925c;
                    Intrinsics.checkNotNullExpressionValue(ivArrow2, "ivArrow");
                    C27046k.m66701p(ivArrow2, userStatusWidget.getColorRes(R$color.c_icon));
                }
            } else {
                LinearLayoutCompat layoutPnl2 = c45641r.f102928f;
                Intrinsics.checkNotNullExpressionValue(layoutPnl2, "layoutPnl");
                C27046k.m66703r(layoutPnl2);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m43853b4(UserStatusWidget userStatusWidget) {
        C45641r c45641r;
        int i11;
        C45642s c45642sM43877O3 = userStatusWidget.m43877O3();
        if (c45642sM43877O3 != null && (c45641r = c45642sM43877O3.f102936b) != null) {
            ConstraintLayout constraintLayoutM100774b = c45641r.getRoot();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutM100774b, "getRoot(...)");
            if (!C27046k.m66704s(constraintLayoutM100774b)) {
                return Unit.INSTANCE;
            }
            boolean zMo15359y = IAssetsCenterService.f16464a.get().mo15359y();
            AppCompatImageView appCompatImageView = c45641r.f102926d;
            if (zMo15359y) {
                i11 = R$drawable.ic2_eye_close_16;
            } else {
                i11 = R$drawable.ic2_eye_open_16;
            }
            appCompatImageView.setImageResource(i11);
            ShowHideTextView.m54778d(c45641r.f102932j, zMo15359y);
            ShowHideTextView.m54778d(c45641r.f102930h, zMo15359y);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m43854d4(UserStatusWidget userStatusWidget, boolean z11, UserStatusInfoResponseEntity userStatusInfoResponseEntity) {
        WelfareTaskInfoEntity welfareTaskInfo;
        final C45642s c45642sM43877O3 = userStatusWidget.m43877O3();
        if (c45642sM43877O3 == null) {
            return Unit.INSTANCE;
        }
        ConstraintLayout constraintLayoutM100776b = c45642sM43877O3.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM100776b, "getRoot(...)");
        ViewExtKt.m66578i(constraintLayoutM100776b, -2);
        userStatusWidget.m43856f4(false);
        if (z11 && UserInfo.a.n()) {
            C44128b.m97259c("UserStatus", "fillAssetView");
            ConstraintLayout constraintLayoutM100776b2 = c45642sM43877O3.getRoot();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutM100776b2, "getRoot(...)");
            C27046k.m66685H(constraintLayoutM100776b2);
            FrameLayout includeGuideContainer = c45642sM43877O3.f102938d;
            Intrinsics.checkNotNullExpressionValue(includeGuideContainer, "includeGuideContainer");
            C27046k.m66700o(includeGuideContainer);
            ConstraintLayout constraintLayoutM100774b = c45642sM43877O3.f102936b.getRoot();
            Intrinsics.checkNotNullExpressionValue(constraintLayoutM100774b, "getRoot(...)");
            C27046k.m66685H(constraintLayoutM100774b);
            userStatusWidget.m43874F3();
            c45642sM43877O3.f102936b.f102934l.m43799r(userStatusInfoResponseEntity, userStatusWidget);
        } else {
            if (userStatusInfoResponseEntity != null) {
                welfareTaskInfo = userStatusInfoResponseEntity.getWelfareTaskInfo();
            } else {
                welfareTaskInfo = null;
            }
            if (welfareTaskInfo != null) {
                C44128b.m97259c("UserStatus", "fillGuideView");
                FrameLayout includeGuideContainer2 = c45642sM43877O3.f102938d;
                Intrinsics.checkNotNullExpressionValue(includeGuideContainer2, "includeGuideContainer");
                C27046k.m66685H(includeGuideContainer2);
                if (userStatusInfoResponseEntity.useStepUI()) {
                    ConstraintLayout constraintLayoutM100778b = c45642sM43877O3.f102937c.getRoot();
                    Intrinsics.checkNotNullExpressionValue(constraintLayoutM100778b, "getRoot(...)");
                    C27046k.m66700o(constraintLayoutM100778b);
                    userStatusWidget.m43876M3(welfareTaskInfo);
                } else {
                    UserStatusNewGuideView userStatusGuideView = c45642sM43877O3.f102940f;
                    Intrinsics.checkNotNullExpressionValue(userStatusGuideView, "userStatusGuideView");
                    C27046k.m66700o(userStatusGuideView);
                    userStatusWidget.m43875H3(welfareTaskInfo);
                }
            } else {
                C44128b.m97259c("UserStatus", "showReload");
                ConstraintLayout constraintLayoutM100776b3 = c45642sM43877O3.getRoot();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutM100776b3, "getRoot(...)");
                C27046k.m66700o(constraintLayoutM100776b3);
                FrameLayout includeGuideContainer3 = c45642sM43877O3.f102938d;
                Intrinsics.checkNotNullExpressionValue(includeGuideContainer3, "includeGuideContainer");
                C27046k.m66700o(includeGuideContainer3);
                ConstraintLayout constraintLayoutM100774b2 = c45642sM43877O3.f102936b.getRoot();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutM100774b2, "getRoot(...)");
                C27046k.m66700o(constraintLayoutM100774b2);
            }
        }
        ConstraintLayout constraintLayoutM100776b4 = c45642sM43877O3.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM100776b4, "getRoot(...)");
        C22912t.m54416n(constraintLayoutM100776b4, new Runnable() { // from class: com.kubi.operation.lib.widgets.userstatus.e0
            @Override // java.lang.Runnable
            public final void run() {
                UserStatusWidget.m43855e4(c45642sM43877O3);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m43855e4(C45642s c45642s) {
        int height = c45642s.getRoot().getHeight();
        if (height > 0) {
            C46392a.m102329l(OperationStoreId.f36892a.m43686g(), height);
        }
        C12572a.m23695d("com.kubi.home.event.HomeEvent:widget_view_loaded", HomeWidgetCode.UserStatus, 0L, 4, null);
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m43857g4(UserStatusWidget userStatusWidget, boolean z11) {
        C45642s c45642sM43877O3 = userStatusWidget.m43877O3();
        if (c45642sM43877O3 == null) {
            return Unit.INSTANCE;
        }
        ViewGroup viewGroup = null;
        if (z11) {
            LinearLayoutCompat linearLayoutCompatM100765b = c45642sM43877O3.f102939e.getRoot();
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompatM100765b, "getRoot(...)");
            if (C27046k.m66704s(linearLayoutCompatM100765b)) {
                return Unit.INSTANCE;
            }
            C45637n c45637n = c45642sM43877O3.f102939e;
            LinearLayoutCompat linearLayoutCompatM100765b2 = c45637n.getRoot();
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompatM100765b2, "getRoot(...)");
            C27046k.m66685H(linearLayoutCompatM100765b2);
            C22911a.m54397b(CollectionsKt.listOf((Object[]) new View[]{c45637n.f102886b, c45637n.f102887c, c45637n.f102888d}), false, 1, null);
        } else {
            LinearLayoutCompat linearLayoutCompatM100765b3 = c45642sM43877O3.f102939e.getRoot();
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompatM100765b3, "getRoot(...)");
            ViewParent parent = linearLayoutCompatM100765b3.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup != null) {
                viewGroup.removeView(linearLayoutCompatM100765b3);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public final void m43879X3(Long l11) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new UserStatusWidget$loadRemoteAssetData$1(this, l11, null));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void bindFlowEvent() {
        super.bindFlowEvent();
        C12573b c12573b = C12573b.f21598a;
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:pullRefresh".length();
        }
        C12572a.m23692a(this, false, new UserStatusWidget$bindFlowEvent$$inlined$bindFlowEvent$default$1("com.kubi.home.event.HomeEvent:pullRefresh", null, this));
        if (c12573b.m23696a()) {
            "com.kubi.home.event.HomeEvent:home_user_status_count_down_finish".length();
        }
        C12572a.m23692a(this, false, new UserStatusWidget$bindFlowEvent$$inlined$bindFlowEvent$default$2("com.kubi.home.event.HomeEvent:home_user_status_count_down_finish", null, this));
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2
    public void initView() {
        super.initView();
        C45642s c45642sM43877O3 = m43877O3();
        if (c45642sM43877O3 == null) {
            return;
        }
        ConstraintLayout constraintLayoutM100776b = c45642sM43877O3.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutM100776b, "getRoot(...)");
        ViewExtKt.m66578i(constraintLayoutM100776b, C46392a.m102323e(OperationStoreId.f36892a.m43686g(), C27040e.m66658b(170)));
        m43856f4(true);
        BaseTextView baseTextView = c45642sM43877O3.f102937c.f102948h;
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(baseTextView);
        highlightTextHelper.m54116a(baseTextView, HighlightTextHelper.TextTagEnum.SPAN, C22912t.m54408f(R$font.medium, getColorRes(R$color.c_text)));
        C27046k.m66710y(baseTextView, 1000L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UserStatusWidget.m43851W3();
            }
        });
        m43878P3();
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onHide() {
        UserStatusNewGuideView userStatusNewGuideView;
        super.onHide();
        C45642s c45642sM43877O3 = m43877O3();
        if (c45642sM43877O3 != null && (userStatusNewGuideView = c45642sM43877O3.f102940f) != null) {
            userStatusNewGuideView.m43830k();
        }
    }

    @Override // com.kubi.kucoin.home.p090v2.cards.BaseStateCardV2, com.kubi.kucoin.home.p090v2.cards.BaseCardFragmentV2
    public void onShow() {
        UserStatusNewGuideView userStatusNewGuideView;
        super.onShow();
        sendIntent(UserStatusWidgetContract$UiIntent.LoadData.INSTANCE);
        m43881a4();
        C45642s c45642sM43877O3 = m43877O3();
        if (c45642sM43877O3 != null && (userStatusNewGuideView = c45642sM43877O3.f102940f) != null) {
            userStatusNewGuideView.m43831l();
        }
    }
}
