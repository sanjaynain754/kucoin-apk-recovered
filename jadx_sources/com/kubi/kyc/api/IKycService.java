package com.kubi.kyc.api;

import androidx.fragment.app.FragmentActivity;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.router.core.Router;
import com.kubi.sdk.protocol.flutter.protocol.KCFlutterBridgeKycKycFaceDataResult;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import io.reactivex.disposables.CompositeDisposable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function6;

/* JADX INFO: compiled from: IKycService.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\bg\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018JÈ\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0097\u0001\u0010\u000b\u001a\u0092\u0001\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00030\fH&J\b\u0010\u0017\u001a\u00020\u0012H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/kyc/api/IKycService;", "", "launchAdvance", "", "context", "Landroidx/fragment/app/FragmentActivity;", "destroyDisposable", "Lio/reactivex/disposables/CompositeDisposable;", InterfaceC33826o0.f71244p, "", "businessType", "callBack", "Lkotlin/Function6;", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKycKycFaceDataResult;", "Lkotlin/ParameterName;", "name", DbParams.KEY_CHANNEL_RESULT, "transactionId", "", "isSuccess", AppsFlyerProperties.CHANNEL, "errorCode", "errorMessage", "jumpKycIdInfoPage", "Companion", "KycApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IKycService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f31132a = Companion.f31133a;

    /* JADX INFO: compiled from: IKycService.kt */
    /* JADX INFO: loaded from: classes21.dex */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kyc/api/IKycService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/kyc/api/IKycService;", "KycApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f31133a = new Companion();

        @NotNull
        public final IKycService get() {
            return (IKycService) Router.f46192a.m56192n(IKycService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    void mo36757a(@NotNull FragmentActivity fragmentActivity, @Nullable CompositeDisposable compositeDisposable, @Nullable String str, @Nullable String str2, @NotNull Function6<? super KCFlutterBridgeKycKycFaceDataResult, ? super String, ? super Boolean, ? super String, ? super String, ? super String, Unit> function6);

    /* JADX INFO: renamed from: b */
    boolean mo36758b();
}
