package com.kubi.otc.otc.paytype.add;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.kubi.otc.entity.PrecheckBean;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.PaymentServiceLocator;
import com.kubi.router.model.IRedirect;
import com.kubi.safe.api.service.ISafeService;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import et.InterfaceC37241c;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function7;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PayTypeAddViewModel.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u0019J:\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00172\"\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u001ej\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017`\u001fJJ\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00172\"\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u001ej\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017`\u001fR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f¨\u0006%"}, m90084d2 = {"Lcom/kubi/otc/otc/paytype/add/PayTypeAddViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "otcApi", "Lcom/kubi/otc/api/OtcApi;", "kotlin.jvm.PlatformType", "_isLoading", "Landroidx/lifecycle/MutableLiveData;", "", "isLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "_preCheckResult", "Lcom/kubi/otc/entity/PrecheckBean$Response;", "preCheckResult", "getPreCheckResult", "_submitResult", "submitResult", "getSubmitResult", "preCheck", "", "payTypeId", "", "mapParams", "", "submitInfo", "isEditPayType", "path", ReportDataTable.COLUMN_PARAMS, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "submitInfoV2", "context", "Landroid/content/Context;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPayTypeAddViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayTypeAddViewModel.kt\ncom/kubi/otc/otc/paytype/add/PayTypeAddViewModel\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,178:1\n44#2,2:179\n*S KotlinDebug\n*F\n+ 1 PayTypeAddViewModel.kt\ncom/kubi/otc/otc/paytype/add/PayTypeAddViewModel\n*L\n171#1:179,2\n*E\n"})
public final class PayTypeAddViewModel extends ViewModel {

    /* JADX INFO: renamed from: V */
    public final InterfaceC37241c f37915V = (InterfaceC37241c) PaymentServiceLocator.f38204a.m45620h().create(InterfaceC37241c.class);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final MutableLiveData<Boolean> f37916W = new MutableLiveData<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final MutableLiveData<PrecheckBean.Response> f37917X = new MutableLiveData<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final MutableLiveData<Boolean> f37918Y = new MutableLiveData<>();

    /* JADX INFO: renamed from: u */
    public static final Unit m45225u(PayTypeAddViewModel payTypeAddViewModel, boolean z11, String str, HashMap map, int i11, String str2, String str3, Boolean bool, Boolean bool2, String str4, Map map2) {
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        if (i11 == 0 && str3 != null && str3.length() != 0) {
            C41696j.m91104d(ViewModelKt.getViewModelScope(payTypeAddViewModel), null, null, new PayTypeAddViewModel$submitInfoV2$2$1(payTypeAddViewModel, str, map, z11, str3, null), 3, null);
        } else if (i11 == 78858) {
            payTypeAddViewModel.m45230r(z11, str, map);
        } else {
            C43846g.m96568c(new OtcException(new Exception("safe validation fallback: " + str4 + ", serverErrorCode" + map2), "payment_p2p_add_or_modify", false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final LiveData<PrecheckBean.Response> m45226n() {
        return this.f37917X;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final LiveData<Boolean> m45227o() {
        return this.f37918Y;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final LiveData<Boolean> m45228p() {
        return this.f37916W;
    }

    /* JADX INFO: renamed from: q */
    public final void m45229q(@NotNull String payTypeId, @NotNull Map<String, String> mapParams) {
        Intrinsics.checkNotNullParameter(payTypeId, "payTypeId");
        Intrinsics.checkNotNullParameter(mapParams, "mapParams");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new PayTypeAddViewModel$preCheck$1(this, payTypeId, mapParams, null), 3, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m45230r(final boolean z11, @NotNull final String path, @NotNull final HashMap<String, String> params) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(params, "params");
        OtcDepend otcDepend = OtcDepend.f38138a;
        HashMap map = new HashMap();
        map.put("validation", "OTC_BIND_PAY");
        otcDepend.m45456e(map, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.otc.otc.paytype.add.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PayTypeAddViewModel.m45224s(this.f37957b, path, params, z11);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public final void m45231t(@NotNull Context context, @NotNull LifecycleOwner viewLifecycleOwner, final boolean z11, @NotNull final String path, @NotNull final HashMap<String, String> params) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(params, "params");
        ISafeService iSafeService = ISafeService.f46324a.get();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("operationType", z11 ? "modify" : "add");
        Unit unit = Unit.INSTANCE;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        ISafeService.m56306a(iSafeService, context, viewLifecycleOwner, "RV_P2P_CHANNEL_EDIT", string, 0, true, new Function7() { // from class: com.kubi.otc.otc.paytype.add.a0
            @Override // p852kotlin.jvm.functions.Function7
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return PayTypeAddViewModel.m45225u(this.f37920b, z11, path, params, ((Integer) obj).intValue(), (String) obj2, (String) obj3, (Boolean) obj4, (Boolean) obj5, (String) obj6, (Map) obj7);
            }
        }, 16, null);
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m45224s(PayTypeAddViewModel payTypeAddViewModel, String str, HashMap map, boolean z11) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(payTypeAddViewModel), null, null, new PayTypeAddViewModel$submitInfo$2$1(payTypeAddViewModel, str, map, z11, null), 3, null);
        return Unit.INSTANCE;
    }
}
