package com.kubi.user.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.kyc.KycKey;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.safe.api.entity.CountTimeEntity;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.p113ui.InterfaceC23686g;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.user.R$string;
import com.kubi.user.api.i;
import com.kubi.user.api.p;
import com.kubi.user.config.UserInfo;
import com.kubi.user.helper.q;
import com.kubi.user.service.b;
import com.kubi.user.utils.r;
import com.kubi.user.view.KycCountDownTextView;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.concurrent.TimeUnit;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: KycCountDownTextView.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u000b\u0018\u0000 I2\u00020\u0001:\u0003GHIB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010.\u001a\u00020\u0018H\u0002J.\u00105\u001a\u0002062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u00107\u001a\u0004\u0018\u00010\"J\u001a\u00108\u001a\u0002062\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d00J\u0006\u0010:\u001a\u00020\u001dJ\b\u0010;\u001a\u000206H\u0002J\b\u0010<\u001a\u000206H\u0003J\u001a\u0010=\u001a\u0002062\b\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010@\u001a\u00020\u001dH\u0002J\b\u0010A\u001a\u00020\u001dH\u0002J\u0010\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u001dH\u0002J\n\u0010D\u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u0010E\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001dH\u0002J\b\u0010F\u001a\u000206H\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006J"}, m90084d2 = {"Lcom/kubi/user/view/KycCountDownTextView;", "Lcom/kubi/resources/widget/BaseTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "loginApi", "Lcom/kubi/user/api/LoginApi;", "kotlin.jvm.PlatformType", "getLoginApi", "()Lcom/kubi/user/api/LoginApi;", "loginApi$delegate", "Lkotlin/Lazy;", "beforeCheck", "Lcom/kubi/user/view/KycCountDownTextView$IBeforeCheck;", "getBeforeCheck", "()Lcom/kubi/user/view/KycCountDownTextView$IBeforeCheck;", "setBeforeCheck", "(Lcom/kubi/user/view/KycCountDownTextView$IBeforeCheck;)V", "isUnderCountDown", "", "()Z", "setUnderCountDown", "(Z)V", AppsFlyerProperties.CHANNEL, "", "receiver", "validationBiz", "Lcom/kubi/data/constance/ValidationBizEnum;", "mIView", "Lcom/kubi/sdk/base/ui/IView;", "loginToken", "getLoginToken", "()Ljava/lang/String;", "setLoginToken", "(Ljava/lang/String;)V", "otherView", "getOtherView", "()Lcom/kubi/user/view/KycCountDownTextView;", "setOtherView", "(Lcom/kubi/user/view/KycCountDownTextView;)V", "currentBizTypeEnable", "isVoice", "extraMap", "Landroid/util/ArrayMap;", "getExtraMap", "()Landroid/util/ArrayMap;", "setExtraMap", "(Landroid/util/ArrayMap;)V", "setInnerParams", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setWithdrawParams", "map", "getLatestBizType", "initView", "handleRequest", "uploadTrack", "throwable", "", "code", "defaultString", "getCountdownString", "second", "currentPhone", KycKey.idNumber, "onDetachedFromWindow", "IBeforeCheck", "CountDownParamsEntity", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KycCountDownTextView extends BaseTextView {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Companion f53914m = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public Disposable f53915b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Lazy f53916c;

    /* JADX INFO: renamed from: d */
    public boolean f53917d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f53918e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public String f53919f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public ValidationBizEnum f53920g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public InterfaceC23686g f53921h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public String f53922i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public KycCountDownTextView f53923j;

    /* JADX INFO: renamed from: k */
    public boolean f53924k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public ArrayMap<String, String> f53925l;

    /* JADX INFO: compiled from: KycCountDownTextView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/user/view/KycCountDownTextView$Companion;", "", "<init>", "()V", "LOGIN_REQUEST", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: KycCountDownTextView.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\t¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/user/view/KycCountDownTextView$CountDownParamsEntity;", "", "<init>", "()V", AppsFlyerProperties.CHANNEL, "", "getChannel", "()Ljava/lang/String;", "setChannel", "(Ljava/lang/String;)V", "receiver", "getReceiver", "setReceiver", "validationBiz", "getValidationBiz", "setValidationBiz", "loginToken", "getLoginToken", "setLoginToken", "ext", "getExt", "setExt", "residenceCountry", "getResidenceCountry", "setResidenceCountry", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class CountDownParamsEntity {

        @Nullable
        private String channel;

        @Nullable
        private String ext;

        @Nullable
        private String loginToken;

        @Nullable
        private String receiver;

        @Nullable
        private String residenceCountry;

        @Nullable
        private String validationBiz;

        @Nullable
        public final String getChannel() {
            return this.channel;
        }

        @Nullable
        public final String getExt() {
            return this.ext;
        }

        @Nullable
        public final String getLoginToken() {
            return this.loginToken;
        }

        @Nullable
        public final String getReceiver() {
            return this.receiver;
        }

        @Nullable
        public final String getResidenceCountry() {
            return this.residenceCountry;
        }

        @Nullable
        public final String getValidationBiz() {
            return this.validationBiz;
        }

        public final void setChannel(@Nullable String str) {
            this.channel = str;
        }

        public final void setExt(@Nullable String str) {
            this.ext = str;
        }

        public final void setLoginToken(@Nullable String str) {
            this.loginToken = str;
        }

        public final void setReceiver(@Nullable String str) {
            this.receiver = str;
        }

        public final void setResidenceCountry(@Nullable String str) {
            this.residenceCountry = str;
        }

        public final void setValidationBiz(@Nullable String str) {
            this.validationBiz = str;
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.view.KycCountDownTextView$a */
    /* JADX INFO: compiled from: KycCountDownTextView.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/user/view/KycCountDownTextView$IBeforeCheck;", "", "checkOk", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC26846a {
    }

    /* JADX INFO: renamed from: com.kubi.user.view.KycCountDownTextView$b */
    /* JADX INFO: compiled from: KycCountDownTextView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/user/view/KycCountDownTextView$handleRequest$2$4", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "throwable", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26847b extends C24223c1 {
        public C26847b(InterfaceC23686g interfaceC23686g) {
            super(interfaceC23686g);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) {
            super.accept(th2);
            KycCountDownTextView.this.m65951R(th2, C27041f.m66668h(p.b(th2)));
        }
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m65936B(KycCountDownTextView kycCountDownTextView, Disposable disposable) {
        kycCountDownTextView.f53924k = true;
        KycCountDownTextView kycCountDownTextView2 = kycCountDownTextView.f53923j;
        if (kycCountDownTextView2 != null) {
            kycCountDownTextView2.f53924k = false;
        }
        kycCountDownTextView.setEnabled(false);
        kycCountDownTextView.f53917d = true;
        KycCountDownTextView kycCountDownTextView3 = kycCountDownTextView.f53923j;
        if (kycCountDownTextView3 != null) {
            kycCountDownTextView3.setEnabled(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H */
    public static final void m65942H(KycCountDownTextView kycCountDownTextView) {
        kycCountDownTextView.setEnabled(true);
        kycCountDownTextView.f53917d = false;
        KycCountDownTextView kycCountDownTextView2 = kycCountDownTextView.f53923j;
        if (kycCountDownTextView2 != null) {
            kycCountDownTextView2.setEnabled(true);
        }
        kycCountDownTextView.setText(kycCountDownTextView.m65971u());
    }

    @Nullable
    public final InterfaceC26846a getBeforeCheck() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycCountDownTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f53916c = LazyKt.lazy(new Function0() { // from class: m70.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KycCountDownTextView.m65950P();
            }
        });
        this.f53924k = true;
        initView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final boolean m65935A(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m65938D(KycCountDownTextView kycCountDownTextView, CountTimeEntity countTimeEntity, long j11) {
        kycCountDownTextView.setText(kycCountDownTextView.m65972v((((long) countTimeEntity.getRetryAfterSeconds()) - j11) + ""));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m65940F(KycCountDownTextView kycCountDownTextView, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        kycCountDownTextView.setEnabled(true);
        kycCountDownTextView.f53917d = false;
        KycCountDownTextView kycCountDownTextView2 = kycCountDownTextView.f53923j;
        if (kycCountDownTextView2 != null) {
            kycCountDownTextView2.setEnabled(true);
        }
        kycCountDownTextView.setText(kycCountDownTextView.m65971u());
        C44128b.m97264h(throwable);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final Unit m65943I(BaseEntity countTimeEntityBaseEntity) {
        Intrinsics.checkNotNullParameter(countTimeEntityBaseEntity, "countTimeEntityBaseEntity");
        if (!Intrinsics.areEqual("401", countTimeEntityBaseEntity.getCode())) {
            ToastCompat.m66441G(countTimeEntityBaseEntity.getMsg(), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final Unit m65945K(KycCountDownTextView kycCountDownTextView, Disposable disposable) {
        InterfaceC23686g interfaceC23686g = kycCountDownTextView.f53921h;
        if (interfaceC23686g != null) {
            interfaceC23686g.showDialogLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m65947M(final KycCountDownTextView kycCountDownTextView) {
        if (kycCountDownTextView.f53921h != null) {
            if (!C27025c.m66567e(null, true)) {
                ToastCompat.m66441G(kycCountDownTextView.getResources().getString(R$string.please_input_account), new Object[0]);
            } else if (kycCountDownTextView.m65949O()) {
                Context context = kycCountDownTextView.getContext();
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (fragmentActivity != null) {
                    String string = fragmentActivity.getString(R$string.voice_code);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    String string2 = TextUtils.isEmpty(kycCountDownTextView.m65970t()) ? fragmentActivity.getString(R$string.send_code_to_way) : fragmentActivity.getResources().getString(R$string.send_code_to_way1, kycCountDownTextView.m65970t());
                    Intrinsics.checkNotNull(string2);
                    String string3 = kycCountDownTextView.getContext().getString(R$string.cancel);
                    String string4 = kycCountDownTextView.getContext().getString(R$string.send);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    Function0 function0 = new Function0() { // from class: m70.u
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return KycCountDownTextView.m65948N(this.f94094b);
                        }
                    };
                    FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    r.d(string, string2, string3, (Function0) null, string4, function0, supportFragmentManager);
                }
            } else {
                kycCountDownTextView.m65973w();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    private final boolean m65949O() {
        return StringsKt.contains$default((CharSequence) C27041f.m66668h(this.f53918e), (CharSequence) "VOICE", false, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final void m65951R(Throwable th2, String str) {
        Pair pair = new Pair("code", str);
        Pair pair2 = new Pair("error_message", C27041f.m66668h(th2 != null ? th2.getMessage() : null));
        ValidationBizEnum validationBizEnum = this.f53920g;
        C43852m.m96604p("validationCode", "B1ValidationCode", pair, pair2, new Pair("businessType", C27041f.m66668h(validationBizEnum != null ? validationBizEnum.name() : null)));
    }

    private final i getLoginApi() {
        return (i) this.f53916c.getValue();
    }

    private final void initView() {
        C27046k.m66711z(this, 0L, new Function0() { // from class: m70.t
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KycCountDownTextView.m65947M(this.f94093b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: t */
    private final String m65970t() {
        return StringsKt.startsWith$default(C27041f.m66668h(this.f53918e), "MY_", false, 2, (Object) null) ? UserInfo.c().phone : m65946L(C27041f.m66668h(this.f53919f));
    }

    @SuppressLint({"CheckResult"})
    /* JADX INFO: renamed from: w */
    private final void m65973w() {
        CountDownParamsEntity countDownParamsEntity = new CountDownParamsEntity();
        countDownParamsEntity.setChannel(this.f53918e);
        countDownParamsEntity.setReceiver(this.f53919f);
        if (!TextUtils.isEmpty(this.f53922i)) {
            countDownParamsEntity.setLoginToken(this.f53922i);
        }
        countDownParamsEntity.setValidationBiz(ValidationBizEnum.getTypeString(this.f53920g));
        countDownParamsEntity.setResidenceCountry(q.a.b());
        if (TextUtils.isEmpty(this.f53919f) && TextUtils.isEmpty(this.f53922i) && !StringsKt.contains$default((CharSequence) C27041f.m66668h(this.f53918e), (CharSequence) "MY_", false, 2, (Object) null)) {
            ToastCompat.m66441G(getResources().getString(R$string.please_input_account), new Object[0]);
            return;
        }
        ArrayMap<String, String> arrayMap = this.f53925l;
        if (arrayMap != null) {
            countDownParamsEntity.setExt('\'' + C27029c.m66606i(arrayMap) + '\'');
        }
        ValidationBizEnum validationBizEnum = this.f53920g;
        if (validationBizEnum != null) {
            Observable observableM56308n = ISafeService.m56308n(b.c(), validationBizEnum.name(), getLoginApi().o(countDownParamsEntity), null, null, 12, null);
            final Function1 function1 = new Function1() { // from class: m70.v
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KycCountDownTextView.m65943I((BaseEntity) obj);
                }
            };
            Observable observableCompose = observableM56308n.doOnNext(new Consumer() { // from class: m70.w
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KycCountDownTextView.m65944J(function1, obj);
                }
            }).compose(C24217a1.m58389m());
            final Function1 function2 = new Function1() { // from class: m70.x
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return KycCountDownTextView.m65945K(this.f94096b, (Disposable) obj);
                }
            };
            observableCompose.doOnSubscribe(new Consumer() { // from class: m70.y
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KycCountDownTextView.m65974x(function2, obj);
                }
            }).subscribe(new Consumer() { // from class: m70.z
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    KycCountDownTextView.m65975y(this.f94098b, (CountTimeEntity) obj);
                }
            }, new C26847b(this.f53921h));
        }
    }

    /* JADX INFO: renamed from: y */
    public static final void m65975y(final KycCountDownTextView kycCountDownTextView, final CountTimeEntity o11) {
        Intrinsics.checkNotNullParameter(o11, "o");
        InterfaceC23686g interfaceC23686g = kycCountDownTextView.f53921h;
        if (interfaceC23686g != null) {
            interfaceC23686g.hideDialogLoading();
        }
        kycCountDownTextView.m65951R(null, "200");
        Disposable disposable = kycCountDownTextView.f53915b;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable<Long> observableObserveOn = Observable.interval(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: m70.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(KycCountDownTextView.m65976z(o11, ((Long) obj).longValue()));
            }
        };
        Observable<Long> observableTakeWhile = observableObserveOn.takeWhile(new Predicate() { // from class: m70.b0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return KycCountDownTextView.m65935A(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: m70.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KycCountDownTextView.m65936B(this.f94085b, (Disposable) obj);
            }
        };
        Observable<Long> observableDoOnSubscribe = observableTakeWhile.doOnSubscribe(new Consumer() { // from class: m70.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KycCountDownTextView.m65937C(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: m70.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KycCountDownTextView.m65938D(this.f94087b, o11, ((Long) obj).longValue());
            }
        };
        Consumer<? super Long> consumer = new Consumer() { // from class: m70.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KycCountDownTextView.m65939E(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: m70.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KycCountDownTextView.m65940F(this.f94090b, (Throwable) obj);
            }
        };
        kycCountDownTextView.f53915b = observableDoOnSubscribe.subscribe(consumer, new Consumer() { // from class: m70.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                KycCountDownTextView.m65941G(function4, obj);
            }
        }, new Action() { // from class: m70.s
            @Override // io.reactivex.functions.Action
            public final void run() {
                KycCountDownTextView.m65942H(this.f94092b);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final void m65977Q(@Nullable String str, @Nullable String str2, @Nullable ValidationBizEnum validationBizEnum, @Nullable InterfaceC23686g interfaceC23686g) {
        this.f53918e = str;
        this.f53919f = str2;
        this.f53920g = validationBizEnum;
        this.f53921h = interfaceC23686g;
        Disposable disposable = this.f53915b;
        if (disposable != null) {
            disposable.dispose();
            this.f53915b = null;
            setEnabled(true);
            this.f53917d = false;
            KycCountDownTextView kycCountDownTextView = this.f53923j;
            if (kycCountDownTextView != null) {
                kycCountDownTextView.setEnabled(true);
            }
            setText(m65971u());
        }
    }

    @Nullable
    public final ArrayMap<String, String> getExtraMap() {
        return this.f53925l;
    }

    @NotNull
    public final String getLatestBizType() {
        if (this.f53924k) {
            String str = this.f53918e;
            return C27025c.m66566d(str != null ? Boolean.valueOf(StringsKt.startsWith$default(str, "MY_", false, 2, (Object) null)) : null) ? "MY_SMS" : "SMS";
        }
        String str2 = this.f53918e;
        return C27025c.m66566d(str2 != null ? Boolean.valueOf(StringsKt.startsWith$default(str2, "MY_", false, 2, (Object) null)) : null) ? "MY_VOICE" : "VOICE";
    }

    @Nullable
    /* JADX INFO: renamed from: getLoginToken, reason: from getter */
    public final String getF53922i() {
        return this.f53922i;
    }

    @Nullable
    /* JADX INFO: renamed from: getOtherView, reason: from getter */
    public final KycCountDownTextView getF53923j() {
        return this.f53923j;
    }

    public final void setExtraMap(@Nullable ArrayMap<String, String> arrayMap) {
        this.f53925l = arrayMap;
    }

    public final void setLoginToken(@Nullable String str) {
        this.f53922i = str;
    }

    public final void setOtherView(@Nullable KycCountDownTextView kycCountDownTextView) {
        this.f53923j = kycCountDownTextView;
    }

    public final void setUnderCountDown(boolean z11) {
        this.f53917d = z11;
    }

    public final void setWithdrawParams(@NotNull ArrayMap<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f53925l = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m65937C(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m65939E(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m65941G(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final void m65944J(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: L */
    private final String m65946L(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.length() >= 4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("****");
            String strSubstring = str.substring(str.length() - 4, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            return sb2.toString();
        }
        return "****" + str;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m65948N(KycCountDownTextView kycCountDownTextView) {
        kycCountDownTextView.m65973w();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final i m65950P() {
        return (i) C42597a.m93386b().create(i.class);
    }

    /* JADX INFO: renamed from: u */
    private final String m65971u() {
        if (m65949O()) {
            String string = getResources().getString(R$string.voice_code);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = getResources().getString(R$string.send);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    /* JADX INFO: renamed from: v */
    private final String m65972v(String str) {
        if (m65949O()) {
            return getResources().getString(R$string.voice_code) + '(' + str + "S)";
        }
        String string = getResources().getString(R$string.count_down, str);
        Intrinsics.checkNotNull(string);
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m65974x(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final boolean m65976z(CountTimeEntity countTimeEntity, long j11) {
        if (j11 < countTimeEntity.getRetryAfterSeconds()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Disposable disposable = this.f53915b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final void setBeforeCheck(@Nullable InterfaceC26846a interfaceC26846a) {
    }
}
