package tn;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.kyc.R$color;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.sumsub.sns.core.SNSMobileSDK;
import com.sumsub.sns.core.data.listener.SNSCompleteHandler;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.data.listener.TokenExpirationHandler;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.data.model.SNSDocumentDefinition;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.core.theme.ColorsScope;
import com.sumsub.sns.core.theme.MetricsScope;
import com.sumsub.sns.core.theme.SNSTheme;
import com.sumsub.sns.core.theme.SNSThemeColor;
import com.sumsub.sns.core.theme.SNSThemeKt;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kn.C41076a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43846g;
import p569qq.C43852m;
import p694vk.C45590s;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: tn.j */
/* JADX INFO: compiled from: SumsubHelper.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u0013JA\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u0013H\u0000¢\u0006\u0002\b\u0016J<\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kyc/vendor/sumsub/SumsubHelper;", "", "<init>", "()V", "KEY_PLATFORM_KYC_TEMPORARILY_DECLINED", "", "isTemporarilyDeclinedInterceptEnabled", "", "()Z", "isTemporarilyDeclinedInterceptEnabled$delegate", "Lkotlin/Lazy;", "launchSumsub", "", "context", "Landroidx/fragment/app/FragmentActivity;", InterfaceC33826o0.f71244p, "idDocType", "country", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "launchSumsubWithResult", "Lcom/kubi/kyc/vendor/sumsub/SumsubLaunchResult;", "launchSumsubWithResult$KycLib_googleRelease", "launchSumsubInternal", "buildDailyTheme", "Lcom/sumsub/sns/core/theme/SNSTheme;", "buildNightTheme", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSumsubHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SumsubHelper.kt\ncom/kubi/kyc/vendor/sumsub/SumsubHelper\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,300:1\n35#2,4:301\n39#2:307\n44#3,2:305\n*S KotlinDebug\n*F\n+ 1 SumsubHelper.kt\ncom/kubi/kyc/vendor/sumsub/SumsubHelper\n*L\n43#1:301,4\n43#1:307\n43#1:305,2\n*E\n"})
public final class C45052j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45052j f101449a = new C45052j();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f101450b = LazyKt.lazy(new Function0() { // from class: tn.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C45052j.m99638t());
        }
    });

    /* JADX INFO: renamed from: tn.j$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: tn.j$b */
    /* JADX INFO: compiled from: SumsubHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kyc/vendor/sumsub/SumsubHelper$launchSumsubInternal$onEventHandler$1", "Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "onEvent", "", "event", "Lcom/sumsub/sns/core/data/listener/SNSEvent;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements SNSEventHandler {
        @Override // com.sumsub.sns.core.data.listener.SNSEventHandler
        public void onEvent(SNSEvent event) throws JSONException {
            Object obj;
            Intrinsics.checkNotNullParameter(event, "event");
            if ((event instanceof SNSEvent.SNSEventStepInitiated) || (event instanceof SNSEvent.SNSEventStepCompleted)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("supplier_name", "sumsub");
                Map<String, Object> payload = event.getPayload();
                String strM66668h = C27041f.m66668h((payload == null || (obj = payload.get("idDocSetType")) == null) ? null : obj.toString());
                if (Intrinsics.areEqual(strM66668h, "IDENTITY")) {
                    jSONObject.put("get_photo_status", event.getEventType() == "StepInitiated" ? "start_get_photo" : "finish_get_photo");
                    Map<String, Object> payload2 = event.getPayload();
                    jSONObject.put("get_photo_result", payload2 != null ? Intrinsics.areEqual(payload2.get("isCancelled"), Boolean.TRUE) : false ? "failed_get_photo" : "success_get_photo");
                    C43852m.m96605q("kyc2_get_id_photo", jSONObject);
                    return;
                }
                if (Intrinsics.areEqual(strM66668h, "SELFIE")) {
                    jSONObject.put("liveness_status", event.getEventType() == "StepInitiated" ? "start" : "finish");
                    Map<String, Object> payload3 = event.getPayload();
                    jSONObject.put("liveness_result", payload3 != null ? Intrinsics.areEqual(payload3.get("isCancelled"), Boolean.TRUE) : false ? "failed" : "success");
                    C43852m.m96605q("kyc2_get_liveness", jSONObject);
                }
            }
        }
    }

    /* JADX INFO: renamed from: tn.j$c */
    /* JADX INFO: compiled from: SumsubHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/kyc/vendor/sumsub/SumsubHelper$launchSumsubInternal$onSDKCompleteHandler$1", "Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "onComplete", "", DbParams.KEY_CHANNEL_RESULT, "Lcom/sumsub/sns/core/data/model/SNSCompletionResult;", "state", "Lcom/sumsub/sns/core/data/model/SNSSDKState;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c implements SNSCompleteHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function1<SumsubLaunchResult, Unit> f101451a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super SumsubLaunchResult, Unit> function1) {
            this.f101451a = function1;
        }

        @Override // com.sumsub.sns.core.data.listener.SNSCompleteHandler
        public void onComplete(SNSCompletionResult result, SNSSDKState state) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(state, "state");
            C44128b.m97265i("Sumsub SDK complete with state: " + state.getName());
            if (C45052j.f101449a.m99643s() && (state instanceof SNSSDKState.TemporarilyDeclined)) {
                C41076a.f91293a.m90059a("-100006");
                C44128b.m97260d("Sumsub SDK temporarily declined with state: " + state.getName());
                return;
            }
            if (!(result instanceof SNSCompletionResult.SuccessTermination)) {
                if (!(result instanceof SNSCompletionResult.AbnormalTermination)) {
                    throw new NoWhenBranchMatchedException();
                }
                C41076a.f91293a.m90059a("-199999");
                Function1<SumsubLaunchResult, Unit> function1 = this.f101451a;
                SNSCompletionResult.AbnormalTermination abnormalTermination = (SNSCompletionResult.AbnormalTermination) result;
                Throwable exception = abnormalTermination.getException();
                function1.invoke(new SumsubLaunchResult(false, "-199999", C27041f.m66668h(exception != null ? exception.getMessage() : null)));
                C44128b.m97263g("Sumsub SDK failed with state: " + state.getName(), abnormalTermination.getException());
                return;
            }
            if (state instanceof SNSSDKState.Failed) {
                C41076a.f91293a.m90059a("-100005");
                this.f101451a.invoke(new SumsubLaunchResult(false, "-100005", null, 4, null));
            } else if ((state instanceof SNSSDKState.Ready) || (state instanceof SNSSDKState.Initial) || (state instanceof SNSSDKState.Incomplete)) {
                C41076a.f91293a.m90059a("-100004");
                this.f101451a.invoke(new SumsubLaunchResult(false, "-100004", null, 4, null));
            } else {
                C41076a.f91293a.m90059a("0");
                this.f101451a.invoke(new SumsubLaunchResult(true, "0", null, 4, null));
            }
            C44128b.m97265i("Sumsub SDK success with state: " + state.getName());
        }
    }

    /* JADX INFO: renamed from: tn.j$d */
    /* JADX INFO: compiled from: SumsubHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kyc/vendor/sumsub/SumsubHelper$launchSumsubInternal$tokenExpirationHandler$1", "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "onTokenExpired", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d implements TokenExpirationHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function1<SumsubLaunchResult, Unit> f101452a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super SumsubLaunchResult, Unit> function1) {
            this.f101452a = function1;
        }

        @Override // com.sumsub.sns.core.data.listener.TokenExpirationHandler
        public String onTokenExpired() {
            C44128b.m97265i("Sumsub token expired");
            C41076a.f91293a.m90059a("-100008");
            this.f101452a.invoke(new SumsubLaunchResult(false, "-100008", null, 4, null));
            return "";
        }
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m99632l(SNSTheme SNSTheme) {
        Intrinsics.checkNotNullParameter(SNSTheme, "$this$SNSTheme");
        SNSThemeKt.colors(SNSTheme, new Function1() { // from class: tn.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45052j.m99633m((ColorsScope) obj);
            }
        });
        SNSThemeKt.metrics(SNSTheme, new Function1() { // from class: tn.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45052j.m99634n((MetricsScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m99633m(ColorsScope colors) {
        Intrinsics.checkNotNullParameter(colors, "$this$colors");
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$color.emphasis;
        colors.setPrimaryButtonBackground(new SNSThemeColor(c27017c.m66512a(i11), 0, 2, null));
        colors.setPrimaryButtonBackgroundHighlighted(new SNSThemeColor(c27017c.m66512a(i11), 0, 2, null));
        colors.setPrimaryButtonBackgroundDisabled(new SNSThemeColor(c27017c.m66512a(i11), 0, 2, null));
        colors.setPrimaryButtonContent(new SNSThemeColor(-1, 0, 2, null));
        colors.setPrimaryButtonContentHighlighted(new SNSThemeColor(-1, 0, 2, null));
        colors.setPrimaryButtonContentDisabled(new SNSThemeColor(-1, 0, 2, null));
        int i12 = R$color.emphasis4;
        colors.setSecondaryButtonBackground(new SNSThemeColor(c27017c.m66512a(i12), 0, 2, null));
        colors.setSecondaryButtonBackgroundHighlighted(new SNSThemeColor(c27017c.m66512a(i12), 0, 2, null));
        colors.setSecondaryButtonBackgroundDisabled(new SNSThemeColor(c27017c.m66512a(i12), 0, 2, null));
        colors.setSecondaryButtonContent(new SNSThemeColor(c27017c.m66512a(i11), 0, 2, null));
        colors.setSecondaryButtonContentHighlighted(new SNSThemeColor(c27017c.m66512a(i11), 0, 2, null));
        colors.setSecondaryButtonContentDisabled(new SNSThemeColor(c27017c.m66512a(i11), 0, 2, null));
        colors.setContentStrong(new SNSThemeColor(c27017c.m66512a(i11), 0, 2, null));
        colors.setContentNeutral(new SNSThemeColor(c27017c.m66512a(R$color.emphasis40), 0, 2, null));
        colors.setContentLink(new SNSThemeColor(c27017c.m66512a(R$color.primary), 0, 2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m99634n(MetricsScope metrics) {
        Intrinsics.checkNotNullParameter(metrics, "$this$metrics");
        metrics.setButtonHeight(Float.valueOf(C27040e.m66657a(64.0f)));
        metrics.setButtonCornerRadius(Float.valueOf(C27040e.m66657a(24.0f)));
        metrics.setButtonBorderWidth(Float.valueOf(C27040e.m66657a(0.0f)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m99635p(SNSTheme SNSTheme) {
        Intrinsics.checkNotNullParameter(SNSTheme, "$this$SNSTheme");
        SNSThemeKt.colors(SNSTheme, new Function1() { // from class: tn.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45052j.m99636q((ColorsScope) obj);
            }
        });
        SNSThemeKt.metrics(SNSTheme, new Function1() { // from class: tn.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45052j.m99637r((MetricsScope) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m99636q(ColorsScope colors) {
        Intrinsics.checkNotNullParameter(colors, "$this$colors");
        C27017c c27017c = C27017c.f54310a;
        int i11 = R$color.primary;
        colors.setPrimaryButtonBackground(new SNSThemeColor(c27017c.m66512a(i11), 0, 2, null));
        colors.setPrimaryButtonBackgroundHighlighted(new SNSThemeColor(c27017c.m66512a(i11), 0, 2, null));
        colors.setPrimaryButtonBackgroundDisabled(new SNSThemeColor(c27017c.m66512a(i11), 0, 2, null));
        int i12 = R$color.emphasis;
        colors.setPrimaryButtonContent(new SNSThemeColor(c27017c.m66512a(i12), 0, 2, null));
        colors.setPrimaryButtonContentHighlighted(new SNSThemeColor(c27017c.m66512a(i12), 0, 2, null));
        colors.setPrimaryButtonContentDisabled(new SNSThemeColor(c27017c.m66512a(i12), 0, 2, null));
        int i13 = R$color.emphasis8;
        colors.setSecondaryButtonBackground(new SNSThemeColor(c27017c.m66512a(i13), 0, 2, null));
        colors.setSecondaryButtonBackgroundHighlighted(new SNSThemeColor(c27017c.m66512a(i13), 0, 2, null));
        colors.setSecondaryButtonBackgroundDisabled(new SNSThemeColor(c27017c.m66512a(i13), 0, 2, null));
        colors.setSecondaryButtonContent(new SNSThemeColor(c27017c.m66512a(i12), 0, 2, null));
        colors.setSecondaryButtonContentHighlighted(new SNSThemeColor(c27017c.m66512a(i12), 0, 2, null));
        colors.setSecondaryButtonContentDisabled(new SNSThemeColor(c27017c.m66512a(i12), 0, 2, null));
        colors.setContentStrong(new SNSThemeColor(c27017c.m66512a(i12), 0, 2, null));
        colors.setContentNeutral(new SNSThemeColor(c27017c.m66512a(R$color.emphasis40), 0, 2, null));
        colors.setContentLink(new SNSThemeColor(c27017c.m66512a(i11), 0, 2, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m99637r(MetricsScope metrics) {
        Intrinsics.checkNotNullParameter(metrics, "$this$metrics");
        metrics.setButtonHeight(Float.valueOf(C27040e.m66657a(64.0f)));
        metrics.setButtonCornerRadius(Float.valueOf(C27040e.m66657a(24.0f)));
        metrics.setButtonBorderWidth(Float.valueOf(C27040e.m66657a(0.0f)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final boolean m99638t() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("platform_kyc_temporarily_declined", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m99639v(Function1 function1, SumsubLaunchResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.areEqual(result.getCode(), "0")) {
            function1.invoke(Boolean.TRUE);
        } else {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m99640y(AtomicBoolean atomicBoolean, Function1 function1, SumsubLaunchResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (atomicBoolean.compareAndSet(false, true)) {
            function1.invoke(result);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final SNSTheme m99641k() {
        return SNSThemeKt.SNSTheme(new Function1() { // from class: tn.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45052j.m99632l((SNSTheme) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final SNSTheme m99642o() {
        return SNSThemeKt.SNSTheme(new Function1() { // from class: tn.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45052j.m99635p((SNSTheme) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final boolean m99643s() {
        return ((Boolean) f101450b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    public final void m99644u(@NotNull FragmentActivity context, @NotNull String token, @NotNull String idDocType, @NotNull String country, @NotNull final Function1<? super Boolean, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(idDocType, "idDocType");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m99645w(context, token, idDocType, country, new Function1() { // from class: tn.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45052j.m99639v(callback, (SumsubLaunchResult) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m99645w(FragmentActivity fragmentActivity, String str, String str2, String str3, Function1<? super SumsubLaunchResult, Unit> function1) {
        d dVar = new d(function1);
        try {
            SNSMobileSDK.Builder builderWithDebug = new SNSMobileSDK.Builder(fragmentActivity).withAccessToken(str, dVar).withAutoCloseOnApprove(0).withAnalyticsEnabled(false).withLocale(MultiLanguageManager.f46811g.getLocale()).withCompleteHandler(new c(function1)).withEventHandler(new b()).withTheme(DayNightThemeManager.f28592a.m33187l() ? m99641k() : m99642o()).withDebug(C45590s.f102687a.m100666Q());
            if (str2.length() > 0 || str3.length() > 0) {
                builderWithDebug.withPreferredDocumentDefinitions(MapsKt.mapOf(TuplesKt.m90091to("IDENTITY", new SNSDocumentDefinition(str2, str3))));
            }
            builderWithDebug.build().launch();
        } catch (Exception e11) {
            C44128b.m97263g("Sumsub SDK launch failed", e11);
            C41076a.f91293a.m90059a("-100003");
            function1.invoke(new SumsubLaunchResult(false, "-100003", C27041f.m66668h(e11.getMessage())));
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m99646x(@NotNull FragmentActivity context, @NotNull String token, @NotNull String idDocType, @NotNull String country, @NotNull final Function1<? super SumsubLaunchResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(idDocType, "idDocType");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        m99645w(context, token, idDocType, country, new Function1() { // from class: tn.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C45052j.m99640y(atomicBoolean, callback, (SumsubLaunchResult) obj);
            }
        });
    }
}
