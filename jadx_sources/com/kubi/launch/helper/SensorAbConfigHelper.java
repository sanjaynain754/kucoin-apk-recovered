package com.kubi.launch.helper;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.kubi.sdk.lib.kucoin.bizcontrol.api.BizControlConfigState;
import com.sensorsdata.abtest.OnABTestReceivedData;
import com.sensorsdata.abtest.SensorsABTest;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41769w;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p294gz.C38057a;
import p294gz.C38058b;
import p294gz.InterfaceC38061e;
import p481ny.C42899b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: SensorAbConfigHelper.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u000fJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000fJ\u0006\u0010\u0016\u001a\u00020\u0017J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u000fJ\f\u0010\u0019\u001a\u00020\n*\u00020\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\u0017J\u0006\u0010\u001d\u001a\u00020\u0017J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u001b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010 \u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\u000b¨\u0006\""}, m90084d2 = {"Lcom/kubi/launch/helper/SensorAbConfigHelper;", "", "<init>", "()V", "TAG", "", "AB_VALUE_REGISTER", "AB_VALUE_OLD_STARTUP", "REWARD_SPM_ID", "isStartupRegisterSensorEnabled", "", "()Z", "setStartupRegisterSensorEnabled", "(Z)V", "abDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "getAbDeferred", "()Lkotlinx/coroutines/CompletableDeferred;", "setAbDeferred", "(Lkotlinx/coroutines/CompletableDeferred;)V", "startStartupRegisterSensorFetch", "startABTestFetch", "cancel", "", "startBizControl", "isFinish", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "EVENT_NAME", "abExperimentReport", "abOldReport", "abExceptionReport", "type", "abTestOpen", "getAbTestOpen", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SensorAbConfigHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SensorAbConfigHelper f31790a = new SensorAbConfigHelper();

    /* JADX INFO: renamed from: b */
    public static volatile boolean f31791b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public static InterfaceC41769w<Boolean> f31792c;

    /* JADX INFO: renamed from: com.kubi.launch.helper.SensorAbConfigHelper$a */
    /* JADX INFO: compiled from: SensorAbConfigHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/launch/helper/SensorAbConfigHelper$startBizControl$iStateListener$1", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/IStateListener;", "onStateUpdated", "", "state", "Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17360a implements InterfaceC38061e {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC41769w<Boolean> f31793b;

        public C17360a(InterfaceC41769w<Boolean> interfaceC41769w) {
            this.f31793b = interfaceC41769w;
        }

        @Override // p294gz.InterfaceC38061e
        /* JADX INFO: renamed from: r */
        public void mo14990r(BizControlConfigState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (state != BizControlConfigState.SUCCESS) {
                if (state == BizControlConfigState.FAILED) {
                    C38058b.f85672a.m85939k(this);
                    this.f31793b.mo91370n(Boolean.FALSE);
                    return;
                }
                return;
            }
            C38058b.f85672a.m85939k(this);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("startBizControl: 拉取数据成功, SPMID = ");
            C38057a c38057a = C38057a.f85671a;
            sb2.append(c38057a.m85928a("kcApp.Homepage.GuidanceCard.Pro.1", true));
            C44128b.m97266j("SensorAbConfigHelper", sb2.toString());
            this.f31793b.mo91370n(Boolean.valueOf(c38057a.m85928a("kcApp.Homepage.GuidanceCard.Pro.1", true)));
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m37469j() {
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final InterfaceC41769w<Boolean> m37474o() {
        final InterfaceC41769w<Boolean> interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
        SensorsABTest.shareInstance().fastFetchABTest("app_signup", "0", 3000, new OnABTestReceivedData() { // from class: com.kubi.launch.helper.e
            @Override // com.sensorsdata.abtest.OnABTestReceivedData
            public final void onResult(Object obj) throws JSONException {
                SensorAbConfigHelper.m37460p(interfaceC41769wM91388c, (String) obj);
            }
        });
        return interfaceC41769wM91388c;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final InterfaceC41769w<Boolean> m37475q() {
        InterfaceC41769w<Boolean> interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
        C38058b c38058b = C38058b.f85672a;
        if (!m37470k(c38058b.m85935g())) {
            final C17360a c17360a = new C17360a(interfaceC41769wM91388c);
            interfaceC41769wM91388c.mo90426j(new Function1() { // from class: com.kubi.launch.helper.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SensorAbConfigHelper.m37461r(c17360a, (Throwable) obj);
                }
            });
            c38058b.m85929a(c17360a);
            return interfaceC41769wM91388c;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("startBizControl: 先获取状态，如果成功就不添加监听了, SPMID = ");
        C38057a c38057a = C38057a.f85671a;
        sb2.append(c38057a.m85928a("kcApp.Homepage.GuidanceCard.Pro.1", true));
        C44128b.m97266j("SensorAbConfigHelper", sb2.toString());
        interfaceC41769wM91388c.mo91370n(Boolean.valueOf(c38057a.m85928a("kcApp.Homepage.GuidanceCard.Pro.1", true)));
        return interfaceC41769wM91388c;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final InterfaceC41769w<Boolean> m37476s() {
        final InterfaceC41769w<Boolean> interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
        C42899b.m94074d(new Function1() { // from class: com.kubi.launch.helper.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SensorAbConfigHelper.m37462t(interfaceC41769wM91388c, (FragmentActivity) obj);
            }
        }, new Function0() { // from class: com.kubi.launch.helper.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SensorAbConfigHelper.m37463u(interfaceC41769wM91388c);
            }
        });
        return interfaceC41769wM91388c;
    }

    /* JADX INFO: renamed from: p */
    public static final void m37460p(InterfaceC41769w interfaceC41769w, String str) throws JSONException {
        C44128b.m97259c("SensorAbConfigHelper", "ABTest result: " + str);
        if (!Intrinsics.areEqual(str, "1") && !Intrinsics.areEqual(str, "0")) {
            f31790a.m37464e("invalid_result");
        }
        interfaceC41769w.mo91370n(Boolean.valueOf(Intrinsics.areEqual(str, "1")));
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m37461r(C17360a c17360a, Throwable th2) {
        C38058b.f85672a.m85939k(c17360a);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m37462t(InterfaceC41769w interfaceC41769w, FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(it), C41782z0.m91392b(), null, new SensorAbConfigHelper$startStartupRegisterSensorFetch$1$1(interfaceC41769w, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m37463u(InterfaceC41769w interfaceC41769w) {
        C44128b.m97261e("SensorAbConfigHelper", "startStartupRegisterSensorFetch: top FragmentActivity unavailable");
        interfaceC41769w.mo91370n(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public final void m37464e(@NotNull String type) throws JSONException {
        Intrinsics.checkNotNullParameter(type, "type");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ab_decision", "old_flow");
        jSONObject.put("ab_decision_source", type);
        jSONObject.put("ab_fallback_reason", type);
        C43852m.m96605q("first_install_ab_result", jSONObject);
    }

    /* JADX INFO: renamed from: f */
    public final void m37465f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ab_decision", "experiment_flow");
        jSONObject.put("ab_decision_source", "sdk_result");
        jSONObject.put("ab_fallback_reason", "none");
        jSONObject.put("group", "experiment");
        C43852m.m96605q("first_install_ab_result", jSONObject);
    }

    /* JADX INFO: renamed from: g */
    public final void m37466g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ab_decision", "old_flow");
        jSONObject.put("ab_decision_source", "sdk_result");
        jSONObject.put("ab_fallback_reason", "none");
        jSONObject.put("group", SessionDescription.ATTR_CONTROL);
        C43852m.m96605q("first_install_ab_result", jSONObject);
    }

    /* JADX INFO: renamed from: h */
    public final void m37467h() {
        if (f31792c != null) {
            C44128b.m97266j("SensorAbConfigHelper", "abDeferred cancel");
            InterfaceC41769w<Boolean> interfaceC41769w = f31792c;
            if (interfaceC41769w != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41769w, null, 1, null);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final InterfaceC41769w<Boolean> m37468i() {
        return f31792c;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m37470k(BizControlConfigState bizControlConfigState) {
        return bizControlConfigState == BizControlConfigState.SUCCESS;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m37471l() {
        return f31791b;
    }

    /* JADX INFO: renamed from: m */
    public final void m37472m(@Nullable InterfaceC41769w<Boolean> interfaceC41769w) {
        f31792c = interfaceC41769w;
    }

    /* JADX INFO: renamed from: n */
    public final void m37473n(boolean z11) {
        f31791b = z11;
    }
}
