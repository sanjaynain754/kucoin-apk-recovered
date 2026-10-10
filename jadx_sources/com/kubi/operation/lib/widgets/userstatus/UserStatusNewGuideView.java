package com.kubi.operation.lib.widgets.userstatus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.operation.lib.R$color;
import com.kubi.operation.lib.R$font;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.R$layout;
import com.kubi.operation.lib.entity.WelfareTaskInfoEntity;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22912t;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.util.TimeSyncManager;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27059l;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserStatusNewGuideView.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\u0012\u0010\"\u001a\u00020\u00072\b\b\u0001\u0010#\u001a\u00020\u0007H\u0002J\u001c\u0010$\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010'\u001a\u00020\u0007H\u0002J\u0006\u0010(\u001a\u00020\u001cJ\u0006\u0010)\u001a\u00020\u001cR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/userstatus/UserStatusNewGuideView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "stepsView", "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusNewGuideStepView;", "countdownView", "Lcom/kubi/operation/lib/widgets/userstatus/UserStatusNewGuideCountdownView;", "tvTitle", "Lcom/kubi/resources/widget/BaseTextView;", "tvSubTitle", "ivStepIcon", "Landroidx/appcompat/widget/AppCompatImageView;", "tvHint", "tvHintIcon", "tvHintGroup", "Landroid/view/View;", "tvAction", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "ivWelfareHint", "ivWelfareIcon", "bindData", "", "data", "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "bindHintGroup", "bindWelfareUI", "tryInflateView", "getColorRes", "color", "registerAllSpanTag", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/widget/TextView;", "fontResId", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UserStatusNewGuideView extends LinearLayoutCompat {

    /* JADX INFO: renamed from: b */
    @Nullable
    public UserStatusNewGuideStepView f36990b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public UserStatusNewGuideCountdownView f36991c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public BaseTextView f36992d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public BaseTextView f36993e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public AppCompatImageView f36994f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public BaseTextView f36995g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public AppCompatImageView f36996h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public View f36997i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public KcPrimaryButton f36998j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public BaseTextView f36999k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public AppCompatImageView f37000l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserStatusNewGuideView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserStatusNewGuideView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m43826n(UserStatusNewGuideView userStatusNewGuideView, TextView textView, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = R$font.medium;
        }
        userStatusNewGuideView.m43832m(textView, i11);
    }

    /* JADX INFO: renamed from: d */
    public final void m43827d(@NotNull final WelfareTaskInfoEntity data) {
        Intrinsics.checkNotNullParameter(data, "data");
        m43833o();
        UserStatusNewGuideStepView userStatusNewGuideStepView = this.f36990b;
        if (userStatusNewGuideStepView != null) {
            userStatusNewGuideStepView.m43816g(data.getTaskNameList(), data.getTaskNameIndex());
        }
        if (data.getCountdownMills() < TimeSyncManager.f48123a.m58366p()) {
            UserStatusNewGuideCountdownView userStatusNewGuideCountdownView = this.f36991c;
            if (userStatusNewGuideCountdownView != null) {
                C27046k.m66700o(userStatusNewGuideCountdownView);
            }
        } else {
            UserStatusNewGuideCountdownView userStatusNewGuideCountdownView2 = this.f36991c;
            if (userStatusNewGuideCountdownView2 != null) {
                C27046k.m66685H(userStatusNewGuideCountdownView2);
            }
            UserStatusNewGuideCountdownView userStatusNewGuideCountdownView3 = this.f36991c;
            if (userStatusNewGuideCountdownView3 != null) {
                userStatusNewGuideCountdownView3.m43809d(Long.valueOf(data.getCountdownMills()));
            }
        }
        BaseTextView baseTextView = this.f36992d;
        if (baseTextView != null) {
            baseTextView.setText(data.getTaskTitleForHome());
        }
        BaseTextView baseTextView2 = this.f36993e;
        if (baseTextView2 != null) {
            baseTextView2.setText(data.getTaskSubTitle());
        }
        m43828f(data);
        KcPrimaryButton kcPrimaryButton = this.f36998j;
        if (kcPrimaryButton != null) {
            if (data.showGuideBtn()) {
                C27046k.m66685H(kcPrimaryButton);
            } else {
                C27046k.m66700o(kcPrimaryButton);
            }
            kcPrimaryButton.setText(data.getBtnTips());
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UserStatusNewGuideView.m43822e(data);
                }
            }, 1, null);
        }
        AppCompatImageView appCompatImageView = this.f36994f;
        if (appCompatImageView != null) {
            ComponentCallbacks2C5309c.m6557u(this).mo6634v(data.showTaskIcon()).m6594E0(appCompatImageView);
        }
        m43829g(data);
        m43832m(this.f36992d, R$font.bold);
        m43826n(this, this.f36993e, 0, 2, null);
        m43826n(this, this.f36995g, 0, 2, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put("type", data.getTaskType());
        Unit unit = Unit.INSTANCE;
        C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, "progressGuideCard", null, jSONObject, 4, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m43828f(WelfareTaskInfoEntity welfareTaskInfoEntity) {
        BaseTextView baseTextView = this.f36995g;
        if (baseTextView != null) {
            baseTextView.setText(welfareTaskInfoEntity.getTaskDesc());
        }
        AppCompatImageView appCompatImageView = this.f36996h;
        if (appCompatImageView != null) {
            ComponentCallbacks2C5309c.m6557u(this).mo6634v(welfareTaskInfoEntity.showDescIcon()).m6594E0(appCompatImageView);
            String strShowDescIcon = welfareTaskInfoEntity.showDescIcon();
            if (strShowDescIcon == null || strShowDescIcon.length() == 0) {
                C27046k.m66700o(appCompatImageView);
            } else {
                C27046k.m66685H(appCompatImageView);
            }
        }
        String taskDesc = welfareTaskInfoEntity.getTaskDesc();
        if (taskDesc == null || taskDesc.length() == 0) {
            View view = this.f36997i;
            if (view != null) {
                C27046k.m66700o(view);
                return;
            }
            return;
        }
        View view2 = this.f36997i;
        if (view2 != null) {
            C27046k.m66685H(view2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m43829g(final WelfareTaskInfoEntity welfareTaskInfoEntity) {
        BaseTextView baseTextView = this.f36999k;
        if (baseTextView != null) {
            baseTextView.setText(welfareTaskInfoEntity.getWaitDrawPrizeAmountDesc());
        }
        if (welfareTaskInfoEntity.showDrawBtn()) {
            String waitDrawPrizeAmountDesc = welfareTaskInfoEntity.getWaitDrawPrizeAmountDesc();
            if (waitDrawPrizeAmountDesc == null || waitDrawPrizeAmountDesc.length() == 0) {
                BaseTextView baseTextView2 = this.f36999k;
                if (baseTextView2 != null) {
                    C27046k.m66700o(baseTextView2);
                }
            } else {
                BaseTextView baseTextView3 = this.f36999k;
                if (baseTextView3 != null) {
                    C27046k.m66685H(baseTextView3);
                }
            }
            AppCompatImageView appCompatImageView = this.f37000l;
            if (appCompatImageView != null) {
                C27046k.m66685H(appCompatImageView);
            }
        } else {
            BaseTextView baseTextView4 = this.f36999k;
            if (baseTextView4 != null) {
                C27046k.m66700o(baseTextView4);
            }
            AppCompatImageView appCompatImageView2 = this.f37000l;
            if (appCompatImageView2 != null) {
                C27046k.m66700o(appCompatImageView2);
            }
        }
        BaseTextView baseTextView5 = this.f36999k;
        if (baseTextView5 != null) {
            C27046k.m66711z(baseTextView5, 0L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UserStatusNewGuideView.m43823h(welfareTaskInfoEntity);
                }
            }, 1, null);
        }
        AppCompatImageView appCompatImageView3 = this.f37000l;
        if (appCompatImageView3 != null) {
            C27046k.m66711z(appCompatImageView3, 0L, new Function0() { // from class: com.kubi.operation.lib.widgets.userstatus.p
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UserStatusNewGuideView.m43824i(welfareTaskInfoEntity);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m43830k() {
        UserStatusNewGuideCountdownView userStatusNewGuideCountdownView = this.f36991c;
        if (userStatusNewGuideCountdownView != null) {
            userStatusNewGuideCountdownView.m43807a(false);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m43831l() {
        UserStatusNewGuideCountdownView userStatusNewGuideCountdownView = this.f36991c;
        if (userStatusNewGuideCountdownView != null) {
            userStatusNewGuideCountdownView.m43807a(true);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m43832m(TextView textView, int i11) {
        HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
        C27017c c27017c = C27017c.f54310a;
        Pair[] pairArr = {new Pair(textTagEnum, C22912t.m54408f(i11, c27017c.m66512a(R$color.brandGreen))), new Pair(HighlightTextHelper.TextTagEnum.SPAN1, C22912t.m54408f(i11, c27017c.m66512a(R$color.brandRed))), new Pair(HighlightTextHelper.TextTagEnum.SPAN2, C22912t.m54408f(i11, c27017c.m66512a(R$color.complementary)))};
        if (textView != null) {
            HighlightTextHelper.f43497a.m54120f(textView, (Pair[]) Arrays.copyOf(pairArr, 3));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m43833o() {
        if (this.f36990b != null) {
            return;
        }
        View.inflate(getContext(), R$layout.operation_widget_user_status_guide_new, this);
        this.f36990b = (UserStatusNewGuideStepView) findViewById(R$id.new_guide_step);
        this.f36991c = (UserStatusNewGuideCountdownView) findViewById(R$id.new_guide_countdown);
        BaseTextView baseTextView = (BaseTextView) findViewById(R$id.new_guide_title);
        this.f36992d = baseTextView;
        if (baseTextView != null) {
            HighlightTextHelper.f43497a.m54116a(baseTextView, HighlightTextHelper.TextTagEnum.SPAN, C22912t.m54408f(R$font.medium, m43825j(R$color.c_text)));
        }
        this.f36993e = (BaseTextView) findViewById(R$id.new_guide_sub_title);
        this.f36994f = (AppCompatImageView) findViewById(R$id.new_guide_step_icon);
        this.f36997i = findViewById(R$id.new_guide_step_hint_group);
        this.f36995g = (BaseTextView) findViewById(R$id.new_guide_step_hint);
        this.f36996h = (AppCompatImageView) findViewById(R$id.new_guide_step_welfare_hint_icon);
        this.f36998j = (KcPrimaryButton) findViewById(R$id.new_guide_step_action);
        this.f36999k = (BaseTextView) findViewById(R$id.new_guide_step_welfare_hint);
        this.f37000l = (AppCompatImageView) findViewById(R$id.new_guide_step_welfare_icon);
    }

    public /* synthetic */ UserStatusNewGuideView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m43822e(WelfareTaskInfoEntity welfareTaskInfoEntity) throws JSONException {
        RouteExKt.m56217H(welfareTaskInfoEntity.getBtnAction());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put("type", welfareTaskInfoEntity.getTaskType());
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a(HomeCardViewHolderProxy.PAGE_ID, "progressGuideCard", "actionBtn", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m43823h(WelfareTaskInfoEntity welfareTaskInfoEntity) throws JSONException {
        String rewardCenterUri = welfareTaskInfoEntity.getRewardCenterUri();
        if (rewardCenterUri != null) {
            RouteExKt.m56217H(rewardCenterUri);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put("type", welfareTaskInfoEntity.getTaskType());
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a(HomeCardViewHolderProxy.PAGE_ID, "progressGuideCard", "giftIcon", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m43824i(WelfareTaskInfoEntity welfareTaskInfoEntity) throws JSONException {
        String rewardCenterUri = welfareTaskInfoEntity.getRewardCenterUri();
        if (rewardCenterUri != null) {
            RouteExKt.m56217H(rewardCenterUri);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        jSONObject.put("type", welfareTaskInfoEntity.getTaskType());
        Unit unit = Unit.INSTANCE;
        C27023a.m66554a(HomeCardViewHolderProxy.PAGE_ID, "progressGuideCard", "giftIcon", jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    private final int m43825j(@ColorRes int i11) {
        Context context = getContext();
        if (context == null) {
            context = C27059l.f54343a.m66757a();
        }
        return ContextCompat.getColor(context, i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserStatusNewGuideView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
