package com.kubi.payment.channel.withdraw.common.confirm;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.payment.channel.data.entities.PreviewWithdrawOrder;
import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.WithdrawTrackData;
import com.kubi.router.model.IRedirect;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import lt.C42296a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function7;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CommonWithDrawConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J \u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010 \u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u000eJ\"\u0010!\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000eH\u0002J&\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010%\u001a\u00020\u00172\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m90084d2 = {"Lcom/kubi/payment/channel/withdraw/common/confirm/CommonWithDrawConfirmVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/channel/data/source/IChannelRepository;", "repository", "<init>", "(Lcom/kubi/payment/channel/data/source/IChannelRepository;)V", "_previewOrder", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Response;", "previewOrder", "Landroidx/lifecycle/LiveData;", "getPreviewOrder", "()Landroidx/lifecycle/LiveData;", "_orderId", "", "orderId", "getOrderId", "securityWidgetOpen", "", "getSecurityWidgetOpen", "()Z", "securityWidgetOpen$delegate", "Lkotlin/Lazy;", "", "extraParams", "Lcom/kubi/payment/channel/withdraw/common/confirm/WithdrawConfirmExtraParams;", "commonWithDraw", "context", "Landroid/content/Context;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "paymentMethodName", ChannelKycRequest.SCENE_WITHDRAW, "withdrawV2", "realWithdraw", "url", "validationToken", "trackPlaceOrder", "isSuccessful", "reason", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCommonWithDrawConfirmVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonWithDrawConfirmVM.kt\ncom/kubi/payment/channel/withdraw/common/confirm/CommonWithDrawConfirmVM\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,212:1\n35#2,4:213\n39#2:219\n44#3,2:217\n44#4,2:220\n*S KotlinDebug\n*F\n+ 1 CommonWithDrawConfirmVM.kt\ncom/kubi/payment/channel/withdraw/common/confirm/CommonWithDrawConfirmVM\n*L\n52#1:213,4\n52#1:219\n52#1:217,2\n147#1:220,2\n*E\n"})
public class CommonWithDrawConfirmVM extends BasePaymentVM<IChannelRepository> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IChannelRepository f38380Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<PreviewWithdrawOrder.Response> f38381a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<String> f38382b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f38383c0;

    /* JADX INFO: renamed from: com.kubi.payment.channel.withdraw.common.confirm.CommonWithDrawConfirmVM$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C20391a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m46006O(CommonWithDrawConfirmVM commonWithDrawConfirmVM, String str) {
        m46003J(commonWithDrawConfirmVM, "payment_mobile_gateway/v3/payment/api/create_payout_transaction", str, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonWithDrawConfirmVM(@NotNull IChannelRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38380Z = repository;
        this.f38381a0 = new MutableLiveData<>();
        this.f38382b0 = new MutableLiveData<>();
        this.f38383c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.payment.channel.withdraw.common.confirm.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(CommonWithDrawConfirmVM.m46004K());
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m46003J(CommonWithDrawConfirmVM commonWithDrawConfirmVM, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: realWithdraw");
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        commonWithDrawConfirmVM.m46020I(str, str2, str3);
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m46004K() {
        Object objM20457a;
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C20391a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("payment_android_ee_withdraw", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        return C27025c.m66567e((Boolean) objM20457a, true);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m46005M(CommonWithDrawConfirmVM commonWithDrawConfirmVM, boolean z11, String str, int i11, Object obj) throws JSONException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackPlaceOrder");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        commonWithDrawConfirmVM.m46021L(z11, str);
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m46007Q(CommonWithDrawConfirmVM commonWithDrawConfirmVM, String str, int i11, String str2, String str3, Boolean bool, Boolean bool2, String str4, Map map) {
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        if (i11 == 0 && str3 != null && str3.length() != 0) {
            commonWithDrawConfirmVM.m46020I("payment_mobile_gateway/v4/payment/api/create_payout_transaction", str, str3);
        } else if (i11 == 78858) {
            commonWithDrawConfirmVM.m46022N(str);
        } else {
            C43846g.m96568c(new OtcException(new Exception("safe validation fallback: " + str4 + ", serverErrorCode" + map), "payment_ee_withdraw", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public final void m46015D(@NotNull Context context, @NotNull LifecycleOwner viewLifecycleOwner, @Nullable String str) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        if (m46018G()) {
            m46023P(context, viewLifecycleOwner, str);
        } else {
            m46022N(str);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final LiveData<String> m46016E() {
        return this.f38382b0;
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final LiveData<PreviewWithdrawOrder.Response> m46017F() {
        return this.f38381a0;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m46018G() {
        return ((Boolean) this.f38383c0.getValue()).booleanValue();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: I */
    public final void m46020I(@NotNull String url, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(url, "url");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new CommonWithDrawConfirmVM$realWithdraw$1(this, str, url, str2, null), 3, null);
    }

    /* JADX INFO: renamed from: L */
    public final void m46021L(boolean z11, String str) throws JSONException {
        PreviewWithdrawOrder.Response value = this.f38381a0.getValue();
        if (value == null) {
            return;
        }
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        WithdrawTrackData withdrawTrackData = new WithdrawTrackData(C27041f.m66668h(value.getChannelId()));
        withdrawTrackData.setFiatCurrency(C27041f.m66668h(value.getFiatCurrency()));
        Unit unit = Unit.INSTANCE;
        track.mo49800d("CHECK_ORDER", z11, str, withdrawTrackData);
        C42296a.m92834b(C42296a.f93790a, z11, str, null, C27041f.m66668h(value.getFiatCurrency()), "pay_fiat_withdraw", null, null, null, C27041f.m66668h(value.getChannelId()), null, null, 1764, null);
    }

    /* JADX INFO: renamed from: N */
    public final void m46022N(@Nullable final String str) {
        PreviewWithdrawOrder.Response value = this.f38381a0.getValue();
        if (value == null) {
            return;
        }
        OtcDepend otcDepend = OtcDepend.f38138a;
        HashMap map = new HashMap();
        map.put("validation", "FIAT_WITHDRAW");
        map.put(FirebaseAnalytics.Param.CURRENCY, C27041f.m66668h(value.getFiatCurrency()));
        map.put("amount", C27041f.m66668h(value.getAmount()));
        otcDepend.m45456e(map, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.payment.channel.withdraw.common.confirm.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CommonWithDrawConfirmVM.m46006O(this.f38389b, str);
            }
        }));
    }

    /* JADX INFO: renamed from: P */
    public final void m46023P(Context context, LifecycleOwner lifecycleOwner, final String str) throws JSONException {
        ISafeService iSafeService = ISafeService.f46324a.get();
        JSONObject jSONObject = new JSONObject();
        PreviewWithdrawOrder.Response value = this.f38381a0.getValue();
        jSONObject.put(FirebaseAnalytics.Param.CURRENCY, C27041f.m66668h(value != null ? value.getFiatCurrency() : null));
        PreviewWithdrawOrder.Response value2 = this.f38381a0.getValue();
        jSONObject.put("amount", C27041f.m66668h(value2 != null ? value2.getAmount() : null));
        Unit unit = Unit.INSTANCE;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        ISafeService.m56306a(iSafeService, context, lifecycleOwner, "RV_FIAT_WITHDRAW", string, 0, true, new Function7() { // from class: com.kubi.payment.channel.withdraw.common.confirm.b
            @Override // p852kotlin.jvm.functions.Function7
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return CommonWithDrawConfirmVM.m46007Q(this.f38387b, str, ((Integer) obj).intValue(), (String) obj2, (String) obj3, (Boolean) obj4, (Boolean) obj5, (String) obj6, (Map) obj7);
            }
        }, 16, null);
    }

    /* JADX INFO: renamed from: H */
    public final void m46019H(@Nullable WithdrawConfirmExtraParams withdrawConfirmExtraParams) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new CommonWithDrawConfirmVM$previewOrder$1(this, withdrawConfirmExtraParams, null), 3, null);
    }
}
