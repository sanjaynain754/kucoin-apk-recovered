package mn;

import androidx.fragment.app.FragmentActivity;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.kyc.api.IKycService;
import com.kubi.kyc.ui.kycv2.KycBridgeManager;
import com.kubi.router.core.Router;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKycKycFaceDataResult;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import hn.C38234d;
import io.reactivex.disposables.CompositeDisposable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function6;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mn.a */
/* JADX INFO: compiled from: KycService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JÈ\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0097\u0001\u0010\r\u001a\u0092\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0016\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0017\u0012\u0015\u0012\u0013\u0018\u00010\u000b¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/kyc/service/KycService;", "Lcom/kubi/kyc/api/IKycService;", "<init>", "()V", "launchAdvance", "", "context", "Landroidx/fragment/app/FragmentActivity;", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", InterfaceC33826o0.f71244p, "", "businessType", "callBack", "Lkotlin/Function6;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKycKycFaceDataResult;", "Lkotlin/ParameterName;", "name", DbParams.KEY_CHANNEL_RESULT, "transactionId", "", "isSuccess", AppsFlyerProperties.CHANNEL, "errorCode", "errorMessage", "jumpKycIdInfoPage", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42575a implements IKycService {
    @Override // com.kubi.kyc.api.IKycService
    /* JADX INFO: renamed from: a */
    public void mo36757a(@NotNull FragmentActivity context, @Nullable CompositeDisposable compositeDisposable, @Nullable String str, @Nullable String str2, @NotNull Function6<? super KCFlutterBridgeKycKycFaceDataResult, ? super String, ? super Boolean, ? super String, ? super String, ? super String, Unit> callBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        KycBridgeManager.f31425a.m37175D(context, compositeDisposable, str, str2, callBack);
    }

    @Override // com.kubi.kyc.api.IKycService
    /* JADX INFO: renamed from: b */
    public boolean mo36758b() {
        C38234d c38234d = C38234d.f85931a;
        if (c38234d.m86315i()) {
            return Router.f46192a.m56184f("krn/router?biz=platformKyc&entry=main&component=kyc&needLogin=true&route=kyc%2Fid_info").m4048k();
        }
        if (c38234d.m86314h()) {
            return Router.f46192a.m56184f("krn/router?biz=kyc&entry=main&component=kucoin_kyc_rn&needLogin=true&route=kyc%2Fid_info").m4048k();
        }
        KCFlutterRouteManager.m56839j(KCFlutterRouteManager.f46704a, "kyc/id_info", true, null, 4, null);
        return true;
    }
}
