package com.kubi.kyc.vendor.jumio.p095ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;
import com.jumio.sdk.JumioSDK;
import com.jumio.sdk.enums.JumioCredentialPart;
import com.jumio.sdk.exceptions.SDKNotConfiguredException;
import com.jumio.sdk.retry.JumioRetryReason;
import com.jumio.sdk.scanpart.JumioScanPart;
import com.jumio.sdk.views.JumioActivityAttacher;
import com.jumio.sdk.views.JumioScanView;
import com.kubi.kyc.R$layout;
import com.kubi.kyc.R$string;
import com.kubi.kyc.vendor.jumio.entity.JumioResp;
import com.kubi.kyc.vendor.jumio.entity.KycStepEntity;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.resources.widget.StepView;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.FragmentResultListener;
import com.kubi.sdk.base.p113ui.BaseUiActivity;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import kn.C41076a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p205dn.C36881a;
import p205dn.C36899s;
import p566qn.C43791a;
import p566qn.C43792b;
import p566qn.C43793c;
import p566qn.C43794d;
import p569qq.C43840a;
import p602rn.C44126j;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45678b;

/* JADX INFO: compiled from: JumioKubiActivity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J6\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u001b2\u001a\b\u0002\u0010!\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010#\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"H\u0002J\b\u0010$\u001a\u00020\u0019H\u0016J-\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'2\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0)2\u0006\u0010*\u001a\u00020+H\u0016¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u0019H\u0014J\b\u0010.\u001a\u00020'H\u0014R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioKubiActivity;", "Lcom/kubi/sdk/base/ui/BaseUiActivity;", "<init>", "()V", "viewBinding", "Lcom/kubi/kyc/databinding/ActivityJumioKubiBinding;", "getViewBinding", "()Lcom/kubi/kyc/databinding/ActivityJumioKubiBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/kyc/vendor/jumio/viewmodel/JumioKubiViewModel;", "getViewModel", "()Lcom/kubi/kyc/vendor/jumio/viewmodel/JumioKubiViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "resp", "Lcom/kubi/kyc/vendor/jumio/entity/JumioResp;", "stepTips", "Ljava/util/ArrayList;", "Lcom/kubi/kyc/vendor/jumio/entity/KycStepEntity;", "Lkotlin/collections/ArrayList;", "nfcSuccess", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initObserve", "startInitialize", "exitFlow", "isSuccess", "data", "msgAndCode", "Lkotlin/Pair;", "", "onBackPressed", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "getLayout", "Companion", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJumioKubiActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioKubiActivity.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioKubiActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,346:1\n49#2,15:347\n19652#3,2:362\n1#4:364\n*S KotlinDebug\n*F\n+ 1 JumioKubiActivity.kt\ncom/kubi/kyc/vendor/jumio/ui/JumioKubiActivity\n*L\n53#1:347,15\n322#1:362,2\n*E\n"})
public final class JumioKubiActivity extends BaseUiActivity {

    /* JADX INFO: renamed from: x */
    @Nullable
    public JumioResp f31600x;

    /* JADX INFO: renamed from: z */
    public boolean f31602z;

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ KProperty<Object>[] f31597B = {Reflection.property1(new PropertyReference1Impl(JumioKubiActivity.class, "viewBinding", "getViewBinding()Lcom/kubi/kyc/databinding/ActivityJumioKubiBinding;", 0))};

    /* JADX INFO: renamed from: A */
    @NotNull
    public static final Companion f31596A = new Companion(null);

    /* JADX INFO: renamed from: v */
    @NotNull
    public final InterfaceC24293a f31598v = C45678b.m100788b(this, new Function1<C36881a, Unit>() { // from class: com.kubi.kyc.vendor.jumio.ui.JumioKubiActivity$special$$inlined$viewBindingActivity$1
        public final void invoke(@NotNull C36881a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36881a c36881a) {
            invoke(c36881a);
            return Unit.INSTANCE;
        }
    }, new Function1<JumioKubiActivity, C36881a>() { // from class: com.kubi.kyc.vendor.jumio.ui.JumioKubiActivity$special$$inlined$viewBindingActivity$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36881a invoke(@NotNull JumioKubiActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            View view = this.this$0.f46504p;
            Intrinsics.checkNotNullExpressionValue(view, "access$getContentView$p$s-52517240(...)");
            return C36881a.m82631a(view);
        }

        {
            super(1);
        }
    });

    /* JADX INFO: renamed from: w */
    @NotNull
    public final Lazy f31599w = LazyKt.lazy(new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JumioKubiActivity.m37293k1();
        }
    });

    /* JADX INFO: renamed from: y */
    @NotNull
    public ArrayList<KycStepEntity> f31601y = new ArrayList<>();

    /* JADX INFO: compiled from: JumioKubiActivity.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kyc/vendor/jumio/ui/JumioKubiActivity$Companion;", "", "<init>", "()V", "EXTRA_TOKEN", "", "EXTRA_DATACENTER", "EXTRA_NEED_NFC", "start", "", "context", "Landroid/content/Context;", InterfaceC33826o0.f71244p, "dataCenter", "needNFC", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, String str, String str2, boolean z11, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            companion.start(context, str, str2, z11);
        }

        @JvmStatic
        public final void start(@NotNull Context context, @NotNull String token, @NotNull String dataCenter, boolean needNFC) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(dataCenter, "dataCenter");
            Intent intent = new Intent(context, (Class<?>) JumioKubiActivity.class);
            intent.putExtra(InterfaceC33826o0.f71244p, token);
            intent.putExtra("datacenter", dataCenter);
            intent.putExtra("needNFC", needNFC);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.vendor.jumio.ui.JumioKubiActivity$b */
    /* JADX INFO: compiled from: JumioKubiActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kyc/vendor/jumio/ui/JumioKubiActivity$initObserve$14$1", "Lcom/kubi/kyc/vendor/jumio/ui/JumioNFCLayoutScan$OnScanListener;", "onScanSuccess", "", "onScanFail", "onScanCancel", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17280b implements JumioNFCLayoutScan.InterfaceC17288a {
        public C17280b() {
        }

        @Override // com.kubi.kyc.vendor.jumio.p095ui.JumioNFCLayoutScan.InterfaceC17288a
        /* JADX INFO: renamed from: a */
        public void mo37314a() throws JSONException {
            JumioKubiActivity.this.f31602z = true;
            JumioKubiActivity.this.m37311N0().m97230V();
        }

        @Override // com.kubi.kyc.vendor.jumio.p095ui.JumioNFCLayoutScan.InterfaceC17288a
        /* JADX INFO: renamed from: b */
        public void mo37315b() throws SDKNotConfiguredException {
            JumioKubiActivity.this.m37311N0().m97237s().setValue(1);
            C41076a.f91293a.m90059a("-200009");
            JumioKubiActivity.this.m37311N0().m97227R();
        }

        @Override // com.kubi.kyc.vendor.jumio.p095ui.JumioNFCLayoutScan.InterfaceC17288a
        /* JADX INFO: renamed from: c */
        public void mo37316c() {
            C41076a.f91293a.m90059a("-200004");
            JumioKubiActivity.m37271L0(JumioKubiActivity.this, false, null, C43792b.f96836a.m96444d(), 2, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kyc.vendor.jumio.ui.JumioKubiActivity$c */
    /* JADX INFO: compiled from: JumioKubiActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/kyc/vendor/jumio/ui/JumioKubiActivity$onCreate$4", "Lcom/kubi/sdk/FragmentResultListener;", "onFragmentResult", "", DbParams.KEY_CHANNEL_RESULT, "Landroid/os/Bundle;", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17281c implements FragmentResultListener {
        public C17281c() {
        }

        @Override // com.kubi.sdk.FragmentResultListener
        /* JADX INFO: renamed from: a */
        public void mo26171a(Bundle result) {
            Function0<Unit> retryFunc;
            Intrinsics.checkNotNullParameter(result, "result");
            if (!result.getBoolean("CALLBACK")) {
                C41076a.f91293a.m90059a("-200005");
                JumioKubiActivity.m37271L0(JumioKubiActivity.this, false, null, C43792b.f96836a.m96445e(), 2, null);
                return;
            }
            JumioResp jumioResp = JumioKubiActivity.this.f31600x;
            if (jumioResp == null || (retryFunc = jumioResp.getRetryFunc()) == null) {
                return;
            }
            retryFunc.invoke();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public static final Unit m37274R0(JumioKubiActivity jumioKubiActivity, JumioCredentialPart jumioCredentialPart) {
        Object objM103844constructorimpl;
        JumioLayoutScanCard jumioLayoutScanCard;
        C36899s viewBinding;
        StepView stepView;
        JumioLayoutScanCard jumioLayoutScanCard2;
        C36899s viewBinding2;
        BaseTextView baseTextView;
        JumioLayoutScanCard jumioLayoutScanCard3;
        C36899s viewBinding3;
        BaseTextView baseTextView2;
        JumioLayoutScanCard jumioLayoutScanCard4;
        C36899s viewBinding4;
        BaseTextView baseTextView3;
        JumioLayoutScanCard jumioLayoutScanCard5;
        C36899s viewBinding5;
        BaseTextView baseTextView4;
        JumioLayoutScanCard jumioLayoutScanCard6;
        JumioLayoutScanCard jumioLayoutScanCard7;
        C36899s viewBinding6;
        BaseTextView baseTextView5;
        JumioLayoutScanCard jumioLayoutScanCard8;
        C36899s viewBinding7;
        BaseTextView baseTextView6;
        JumioLayoutScanCard jumioLayoutScanCard9;
        JumioLayoutScanCard jumioLayoutScanCard10;
        C36899s viewBinding8;
        BaseTextView baseTextView7;
        JumioLayoutScanCard jumioLayoutScanCard11;
        C36899s viewBinding9;
        BaseTextView baseTextView8;
        JumioLayoutScanCard jumioLayoutScanCard12;
        JumioLayoutScanCard jumioLayoutScanCard13;
        C36899s viewBinding10;
        BaseTextView baseTextView9;
        JumioLayoutScanCard jumioLayoutScanCard14;
        C36899s viewBinding11;
        BaseTextView baseTextView10;
        JumioLayoutScanCard jumioLayoutScanCard15;
        JumioLayoutScanCard jumioLayoutScanCard16;
        C36899s viewBinding12;
        BaseTextView baseTextView11;
        JumioLayoutScanCard jumioLayoutScanCard17;
        C36899s viewBinding13;
        BaseTextView baseTextView12;
        JumioLayoutScanCard jumioLayoutScanCard18;
        JumioLayoutScanCard jumioLayoutScanCard19;
        C36899s viewBinding14;
        ImageView imageView;
        JumioLayoutScanCard jumioLayoutScanCard20;
        C36899s viewBinding15;
        ImageView imageView2;
        JumioLayoutScanCard jumioLayoutScanCard21;
        C36899s viewBinding16;
        StepView stepView2;
        try {
            Result.Companion companion = Result.INSTANCE;
            int i11 = jumioCredentialPart == null ? -1 : C17279a.$EnumSwitchMapping$0[jumioCredentialPart.ordinal()];
            Unit unit = null;
            if (i11 == 1) {
                C36881a c36881aM37310M0 = jumioKubiActivity.m37310M0();
                if (c36881aM37310M0 != null && (jumioLayoutScanCard6 = c36881aM37310M0.f81423f) != null) {
                    jumioLayoutScanCard6.m37380w(1);
                }
                C36881a c36881aM37310M1 = jumioKubiActivity.m37310M0();
                if (c36881aM37310M1 != null && (jumioLayoutScanCard5 = c36881aM37310M1.f81423f) != null && (viewBinding5 = jumioLayoutScanCard5.getViewBinding()) != null && (baseTextView4 = viewBinding5.f81550m) != null) {
                    baseTextView4.setText(jumioKubiActivity.f31601y.get(0).getTitle());
                }
                C36881a c36881aM37310M2 = jumioKubiActivity.m37310M0();
                if (c36881aM37310M2 != null && (jumioLayoutScanCard4 = c36881aM37310M2.f81423f) != null && (viewBinding4 = jumioLayoutScanCard4.getViewBinding()) != null && (baseTextView3 = viewBinding4.f81549l) != null) {
                    baseTextView3.setText(jumioKubiActivity.f31601y.get(0).getContent());
                    unit = Unit.INSTANCE;
                }
            } else if (i11 == 2) {
                C36881a c36881aM37310M3 = jumioKubiActivity.m37310M0();
                if (c36881aM37310M3 != null && (jumioLayoutScanCard9 = c36881aM37310M3.f81423f) != null) {
                    jumioLayoutScanCard9.m37380w(2);
                }
                C36881a c36881aM37310M4 = jumioKubiActivity.m37310M0();
                if (c36881aM37310M4 != null && (jumioLayoutScanCard8 = c36881aM37310M4.f81423f) != null && (viewBinding7 = jumioLayoutScanCard8.getViewBinding()) != null && (baseTextView6 = viewBinding7.f81550m) != null) {
                    baseTextView6.setText(jumioKubiActivity.f31601y.get(1).getTitle());
                }
                C36881a c36881aM37310M5 = jumioKubiActivity.m37310M0();
                if (c36881aM37310M5 != null && (jumioLayoutScanCard7 = c36881aM37310M5.f81423f) != null && (viewBinding6 = jumioLayoutScanCard7.getViewBinding()) != null && (baseTextView5 = viewBinding6.f81549l) != null) {
                    baseTextView5.setText(jumioKubiActivity.f31601y.get(1).getContent());
                    unit = Unit.INSTANCE;
                }
            } else if (i11 != 3) {
                if (i11 == 4) {
                    C36881a c36881aM37310M6 = jumioKubiActivity.m37310M0();
                    if (c36881aM37310M6 != null && (jumioLayoutScanCard20 = c36881aM37310M6.f81423f) != null && (viewBinding15 = jumioLayoutScanCard20.getViewBinding()) != null && (imageView2 = viewBinding15.f81540c) != null) {
                        ViewExtKt.m66577h(imageView2);
                    }
                    C36881a c36881aM37310M7 = jumioKubiActivity.m37310M0();
                    if (c36881aM37310M7 != null && (jumioLayoutScanCard19 = c36881aM37310M7.f81423f) != null && (viewBinding14 = jumioLayoutScanCard19.getViewBinding()) != null && (imageView = viewBinding14.f81542e) != null) {
                        ViewExtKt.m66577h(imageView);
                    }
                    if (jumioKubiActivity.f31601y.size() > 2) {
                        C36881a c36881aM37310M8 = jumioKubiActivity.m37310M0();
                        if (c36881aM37310M8 != null && (jumioLayoutScanCard18 = c36881aM37310M8.f81423f) != null) {
                            jumioLayoutScanCard18.m37380w(3);
                        }
                        C36881a c36881aM37310M9 = jumioKubiActivity.m37310M0();
                        if (c36881aM37310M9 != null && (jumioLayoutScanCard17 = c36881aM37310M9.f81423f) != null && (viewBinding13 = jumioLayoutScanCard17.getViewBinding()) != null && (baseTextView12 = viewBinding13.f81550m) != null) {
                            baseTextView12.setText(jumioKubiActivity.f31601y.get(2).getTitle());
                        }
                        C36881a c36881aM37310M10 = jumioKubiActivity.m37310M0();
                        if (c36881aM37310M10 != null && (jumioLayoutScanCard16 = c36881aM37310M10.f81423f) != null && (viewBinding12 = jumioLayoutScanCard16.getViewBinding()) != null && (baseTextView11 = viewBinding12.f81549l) != null) {
                            baseTextView11.setText(jumioKubiActivity.f31601y.get(2).getContent());
                        }
                    } else {
                        C36881a c36881aM37310M11 = jumioKubiActivity.m37310M0();
                        if (c36881aM37310M11 != null && (jumioLayoutScanCard15 = c36881aM37310M11.f81423f) != null) {
                            jumioLayoutScanCard15.m37380w(2);
                        }
                        C36881a c36881aM37310M12 = jumioKubiActivity.m37310M0();
                        if (c36881aM37310M12 != null && (jumioLayoutScanCard14 = c36881aM37310M12.f81423f) != null && (viewBinding11 = jumioLayoutScanCard14.getViewBinding()) != null && (baseTextView10 = viewBinding11.f81550m) != null) {
                            baseTextView10.setText(jumioKubiActivity.f31601y.get(1).getTitle());
                        }
                        C36881a c36881aM37310M13 = jumioKubiActivity.m37310M0();
                        if (c36881aM37310M13 != null && (jumioLayoutScanCard13 = c36881aM37310M13.f81423f) != null && (viewBinding10 = jumioLayoutScanCard13.getViewBinding()) != null && (baseTextView9 = viewBinding10.f81549l) != null) {
                            baseTextView9.setText(jumioKubiActivity.f31601y.get(1).getContent());
                        }
                    }
                } else if (i11 != 5) {
                    C36881a c36881aM37310M14 = jumioKubiActivity.m37310M0();
                    if (c36881aM37310M14 != null && (jumioLayoutScanCard21 = c36881aM37310M14.f81423f) != null && (viewBinding16 = jumioLayoutScanCard21.getViewBinding()) != null && (stepView2 = viewBinding16.f81548k) != null) {
                        ViewExtKt.m66577h(stepView2);
                        unit = Unit.INSTANCE;
                    }
                }
                unit = Unit.INSTANCE;
            } else {
                C36881a c36881aM37310M15 = jumioKubiActivity.m37310M0();
                if (c36881aM37310M15 != null && (jumioLayoutScanCard12 = c36881aM37310M15.f81423f) != null) {
                    jumioLayoutScanCard12.m37380w(1);
                }
                C36881a c36881aM37310M16 = jumioKubiActivity.m37310M0();
                if (c36881aM37310M16 != null && (jumioLayoutScanCard11 = c36881aM37310M16.f81423f) != null && (viewBinding9 = jumioLayoutScanCard11.getViewBinding()) != null && (baseTextView8 = viewBinding9.f81550m) != null) {
                    baseTextView8.setText(jumioKubiActivity.f31601y.get(0).getTitle());
                }
                C36881a c36881aM37310M17 = jumioKubiActivity.m37310M0();
                if (c36881aM37310M17 != null && (jumioLayoutScanCard10 = c36881aM37310M17.f81423f) != null && (viewBinding8 = jumioLayoutScanCard10.getViewBinding()) != null && (baseTextView7 = viewBinding8.f81549l) != null) {
                    baseTextView7.setText(jumioKubiActivity.f31601y.get(0).getContent());
                    unit = Unit.INSTANCE;
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103847exceptionOrNullimpl(objM103844constructorimpl) != null) {
            C36881a c36881aM37310M18 = jumioKubiActivity.m37310M0();
            if (c36881aM37310M18 != null && (jumioLayoutScanCard3 = c36881aM37310M18.f81423f) != null && (viewBinding3 = jumioLayoutScanCard3.getViewBinding()) != null && (baseTextView2 = viewBinding3.f81550m) != null) {
                baseTextView2.setText(jumioKubiActivity.getString(R$string.kyc_camera_tip));
            }
            C36881a c36881aM37310M19 = jumioKubiActivity.m37310M0();
            if (c36881aM37310M19 != null && (jumioLayoutScanCard2 = c36881aM37310M19.f81423f) != null && (viewBinding2 = jumioLayoutScanCard2.getViewBinding()) != null && (baseTextView = viewBinding2.f81549l) != null) {
                baseTextView.setText("");
            }
            C36881a c36881aM37310M20 = jumioKubiActivity.m37310M0();
            if (c36881aM37310M20 != null && (jumioLayoutScanCard = c36881aM37310M20.f81423f) != null && (viewBinding = jumioLayoutScanCard.getViewBinding()) != null && (stepView = viewBinding.f81548k) != null) {
                ViewExtKt.m66577h(stepView);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m37312O0() {
        m37311N0().m97213A().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37285c1(this.f31679b, (Boolean) obj);
            }
        }));
        m37311N0().m97214B().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37286d1(this.f31650b, (Boolean) obj);
            }
        }));
        m37311N0().m97217E().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37287e1(this.f31652b, (JumioResp) obj);
            }
        }));
        m37311N0().m97223K().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37272P0(this.f31654b, (JumioScanPart) obj);
            }
        }));
        m37311N0().m97219G().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37273Q0(this.f31656b, (JumioScanPart) obj);
            }
        }));
        m37311N0().m97218F().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37274R0(this.f31658b, (JumioCredentialPart) obj);
            }
        }));
        m37311N0().m97220H().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37275S0(this.f31660b, (String) obj);
            }
        }));
        m37311N0().m97222J().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37276T0(this.f31662b, (Boolean) obj);
            }
        }));
        m37311N0().m97234p().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37277U0(this.f31665b, (JumioScanPart) obj);
            }
        }));
        m37311N0().m97216D().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37278V0(this.f31670b, (Pair) obj);
            }
        }));
        m37311N0().m97233o().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37279W0(this.f31681b, (JumioScanPart) obj);
            }
        }));
        m37311N0().m97221I().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37280X0(this.f31683b, (Boolean) obj);
            }
        }));
        m37311N0().m97239u().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.t
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37281Y0(this.f31685b, (ArrayList) obj);
            }
        }));
        m37311N0().m97236r().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37282Z0(this.f31687b, (JumioScanPart) obj);
            }
        }));
        m37311N0().m97237s().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37283a1(this.f31644b, (Integer) obj);
            }
        }));
        m37311N0().m97235q().observe(this, new C17336v(new Function1() { // from class: com.kubi.kyc.vendor.jumio.ui.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JumioKubiActivity.m37284b1(this.f31648b, (JumioRetryReason) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: com.kubi.kyc.vendor.jumio.ui.JumioKubiActivity$a */
    /* JADX INFO: compiled from: JumioKubiActivity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C17279a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JumioCredentialPart.values().length];
            try {
                iArr[JumioCredentialPart.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JumioCredentialPart.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JumioCredentialPart.DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JumioCredentialPart.FACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JumioCredentialPart.NFC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m37271L0(JumioKubiActivity jumioKubiActivity, boolean z11, Bundle EMPTY, Pair pair, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            EMPTY = Bundle.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        }
        if ((i11 & 4) != 0) {
            pair = null;
        }
        jumioKubiActivity.m37309K0(z11, EMPTY, pair);
    }

    /* JADX INFO: renamed from: P0 */
    public static final Unit m37272P0(JumioKubiActivity jumioKubiActivity, JumioScanPart jumioScanPart) {
        JumioLayoutScanCard jumioLayoutScanCard;
        JumioLayoutScanCard jumioLayoutScanCard2;
        C36899s viewBinding;
        StepView stepView;
        JumioLayoutScanCard jumioLayoutScanCard3;
        if (jumioScanPart == null) {
            C36881a c36881aM37310M0 = jumioKubiActivity.m37310M0();
            if (c36881aM37310M0 != null && (jumioLayoutScanCard3 = c36881aM37310M0.f81423f) != null) {
                jumioLayoutScanCard3.m37375n();
            }
        } else if (jumioKubiActivity.f31601y.isEmpty()) {
            C36881a c36881aM37310M1 = jumioKubiActivity.m37310M0();
            if (c36881aM37310M1 != null && (jumioLayoutScanCard2 = c36881aM37310M1.f81423f) != null && (viewBinding = jumioLayoutScanCard2.getViewBinding()) != null && (stepView = viewBinding.f81548k) != null) {
                ViewExtKt.m66577h(stepView);
            }
        } else {
            C36881a c36881aM37310M2 = jumioKubiActivity.m37310M0();
            if (c36881aM37310M2 != null && (jumioLayoutScanCard = c36881aM37310M2.f81423f) != null) {
                jumioLayoutScanCard.m37381x(jumioScanPart);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S0 */
    public static final Unit m37275S0(JumioKubiActivity jumioKubiActivity, String str) {
        JumioLayoutScanCard jumioLayoutScanCard;
        C36899s viewBinding;
        BaseTextView baseTextView;
        if (str == null || str.length() == 0) {
            return Unit.INSTANCE;
        }
        C36881a c36881aM37310M0 = jumioKubiActivity.m37310M0();
        if (c36881aM37310M0 != null && (jumioLayoutScanCard = c36881aM37310M0.f81423f) != null && (viewBinding = jumioLayoutScanCard.getViewBinding()) != null && (baseTextView = viewBinding.f81549l) != null) {
            baseTextView.setText(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W0 */
    public static final Unit m37279W0(JumioKubiActivity jumioKubiActivity, JumioScanPart jumioScanPart) {
        if (jumioScanPart != null) {
            new JumioActivityAttacher(jumioKubiActivity).attach(jumioScanPart);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y0 */
    public static final Unit m37281Y0(JumioKubiActivity jumioKubiActivity, ArrayList arrayList) {
        JumioLayoutScanCard jumioLayoutScanCard;
        if (arrayList == null) {
            return Unit.INSTANCE;
        }
        jumioKubiActivity.f31601y.addAll(arrayList);
        C36881a c36881aM37310M0 = jumioKubiActivity.m37310M0();
        if (c36881aM37310M0 != null && (jumioLayoutScanCard = c36881aM37310M0.f81423f) != null) {
            jumioLayoutScanCard.setKycSteps(arrayList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z0 */
    public static final Unit m37282Z0(JumioKubiActivity jumioKubiActivity, JumioScanPart jumioScanPart) throws SDKNotConfiguredException {
        JumioNFCLayoutScan jumioNFCLayoutScan;
        if (jumioScanPart == null) {
            return Unit.INSTANCE;
        }
        C36881a c36881aM37310M0 = jumioKubiActivity.m37310M0();
        if (c36881aM37310M0 != null && (jumioNFCLayoutScan = c36881aM37310M0.f81421d) != null) {
            jumioNFCLayoutScan.m37403l(jumioScanPart, jumioKubiActivity.new C17280b());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b1 */
    public static final Unit m37284b1(JumioKubiActivity jumioKubiActivity, JumioRetryReason jumioRetryReason) {
        C36881a c36881aM37310M0;
        JumioNFCLayoutScan jumioNFCLayoutScan;
        if (jumioRetryReason != null && (c36881aM37310M0 = jumioKubiActivity.m37310M0()) != null && (jumioNFCLayoutScan = c36881aM37310M0.f81421d) != null) {
            jumioNFCLayoutScan.m37404m(jumioRetryReason.getF14743b());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e1 */
    public static final Unit m37287e1(JumioKubiActivity jumioKubiActivity, JumioResp jumioResp) throws JSONException {
        if (jumioResp == null) {
            return Unit.INSTANCE;
        }
        if (jumioResp.getIsSuccess() || !jumioResp.getCanRetry()) {
            C41076a.f91293a.m90059a("-200004");
            jumioKubiActivity.m37309K0(jumioResp.getIsSuccess(), jumioKubiActivity.m37311N0().getF97443h0(), jumioResp.getErrorMsgCode());
            if (jumioResp.getIsSuccess()) {
                C43793c.m96452c("Jumio-Auth-Success, resp=" + jumioResp);
            } else {
                C43794d.m96453a("logical_error", jumioResp.getErrorMsgCode());
                C43793c.m96451b("Jumio-Auth-Failed, resp=" + jumioResp, null, 2, null);
            }
        } else {
            C43793c.m96452c("Jumio-Auth-Failed-Retry, resp=" + jumioResp);
            jumioKubiActivity.f31600x = jumioResp;
            C43794d.m96453a("logical_error", jumioResp.getErrorMsgCode());
            JumioRetryTipDialog jumioRetryTipDialogNewInstance = JumioRetryTipDialog.f31638d0.newInstance();
            FragmentManager supportFragmentManager = jumioKubiActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            jumioRetryTipDialogNewInstance.show(supportFragmentManager, JumioRetryTipDialog.class.getSimpleName());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h1 */
    public static final Unit m37290h1(JumioKubiActivity jumioKubiActivity, String[] strArr) {
        ActivityCompat.requestPermissions(jumioKubiActivity, strArr, 200);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i1 */
    public static final Unit m37291i1(JumioKubiActivity jumioKubiActivity) {
        C41076a.f91293a.m90059a("-200002");
        m37271L0(jumioKubiActivity, false, null, C43792b.f96836a.m96449i(), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k1 */
    public static final C44126j m37293k1() {
        return new C44126j();
    }

    @Nullable
    /* JADX INFO: renamed from: M0 */
    public final C36881a m37310M0() {
        return (C36881a) this.f31598v.getValue(this, f31597B[0]);
    }

    /* JADX INFO: renamed from: N0 */
    public final C44126j m37311N0() {
        return (C44126j) this.f31599w.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity
    /* JADX INFO: renamed from: Z */
    public int mo30326Z() {
        return R$layout.activity_jumio_kubi;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) throws Throwable {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 200) {
            for (String str : permissions) {
                if (grantResults[ArraysKt.indexOf(permissions, str)] != 0) {
                    C41076a.f91293a.m90059a("-200002");
                    m37271L0(this, false, null, C43792b.f96836a.m96449i(), 2, null);
                    return;
                }
            }
            m37313j1();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public static final Unit m37273Q0(JumioKubiActivity jumioKubiActivity, JumioScanPart jumioScanPart) {
        JumioLayoutScanCard jumioLayoutScanCard;
        C36881a c36881aM37310M0 = jumioKubiActivity.m37310M0();
        if (c36881aM37310M0 != null && (jumioLayoutScanCard = c36881aM37310M0.f81423f) != null) {
            jumioLayoutScanCard.m37382z();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T0 */
    public static final Unit m37276T0(JumioKubiActivity jumioKubiActivity, Boolean bool) {
        JumioLayoutScanCard jumioLayoutScanCard;
        JumioScanView jumioScanViewM37379v;
        C36881a c36881aM37310M0 = jumioKubiActivity.m37310M0();
        if (c36881aM37310M0 != null && (jumioLayoutScanCard = c36881aM37310M0.f81423f) != null && (jumioScanViewM37379v = jumioLayoutScanCard.m37379v()) != null) {
            if (bool.booleanValue()) {
                jumioKubiActivity.getLifecycle().addObserver(jumioScanViewM37379v);
            } else {
                jumioKubiActivity.getLifecycle().removeObserver(jumioScanViewM37379v);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U0 */
    public static final Unit m37277U0(JumioKubiActivity jumioKubiActivity, JumioScanPart jumioScanPart) {
        JumioLayoutConfirmScan jumioLayoutConfirmScan;
        JumioLayoutConfirmScan jumioLayoutConfirmScan2;
        C36881a c36881aM37310M0 = jumioKubiActivity.m37310M0();
        if (jumioScanPart == null) {
            if (c36881aM37310M0 != null && (jumioLayoutConfirmScan2 = c36881aM37310M0.f81419b) != null) {
                jumioLayoutConfirmScan2.m37325e();
            }
        } else if (c36881aM37310M0 != null && (jumioLayoutConfirmScan = c36881aM37310M0.f81419b) != null) {
            jumioLayoutConfirmScan.m37327k(jumioScanPart);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V0 */
    public static final Unit m37278V0(JumioKubiActivity jumioKubiActivity, Pair pair) {
        JumioLayoutRejectScan jumioLayoutRejectScan;
        JumioScanPart jumioScanPart;
        C36881a c36881aM37310M0 = jumioKubiActivity.m37310M0();
        if (c36881aM37310M0 != null && (jumioLayoutRejectScan = c36881aM37310M0.f81422e) != null) {
            HashMap<?, ?> map = null;
            if (pair != null) {
                jumioScanPart = (JumioScanPart) pair.getFirst();
            } else {
                jumioScanPart = null;
            }
            if (pair != null) {
                map = (HashMap) pair.getSecond();
            }
            jumioLayoutRejectScan.m37346i(jumioScanPart, map);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X0 */
    public static final Unit m37280X0(JumioKubiActivity jumioKubiActivity, Boolean bool) {
        C36881a c36881aM37310M0;
        JumioLayoutScanCard jumioLayoutScanCard;
        if (bool.booleanValue() && (c36881aM37310M0 = jumioKubiActivity.m37310M0()) != null && (jumioLayoutScanCard = c36881aM37310M0.f81423f) != null) {
            jumioLayoutScanCard.m37372G();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a1 */
    public static final Unit m37283a1(JumioKubiActivity jumioKubiActivity, Integer num) {
        JumioNFCLayoutScan jumioNFCLayoutScan;
        C36881a c36881aM37310M0 = jumioKubiActivity.m37310M0();
        if (c36881aM37310M0 != null && (jumioNFCLayoutScan = c36881aM37310M0.f81421d) != null) {
            Intrinsics.checkNotNull(num);
            jumioNFCLayoutScan.m37405n(num.intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c1 */
    public static final Unit m37285c1(JumioKubiActivity jumioKubiActivity, Boolean bool) {
        JumioLayoutLoading jumioLayoutLoading;
        JumioLayoutLoading jumioLayoutLoading2;
        boolean zBooleanValue = bool.booleanValue();
        C36881a c36881aM37310M0 = jumioKubiActivity.m37310M0();
        if (zBooleanValue) {
            if (c36881aM37310M0 != null && (jumioLayoutLoading2 = c36881aM37310M0.f81420c) != null) {
                jumioLayoutLoading2.m37331d();
            }
        } else if (c36881aM37310M0 != null && (jumioLayoutLoading = c36881aM37310M0.f81420c) != null) {
            jumioLayoutLoading.m37330c();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d1 */
    public static final Unit m37286d1(JumioKubiActivity jumioKubiActivity, Boolean bool) {
        JumioLayoutLoading jumioLayoutLoading;
        C36881a c36881aM37310M0 = jumioKubiActivity.m37310M0();
        if (c36881aM37310M0 != null && (jumioLayoutLoading = c36881aM37310M0.f81420c) != null) {
            Intrinsics.checkNotNull(bool);
            jumioLayoutLoading.m37329b(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f1 */
    public static final Unit m37288f1(JumioKubiActivity jumioKubiActivity) {
        jumioKubiActivity.onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g1 */
    public static final Unit m37289g1(JumioKubiActivity jumioKubiActivity) {
        jumioKubiActivity.onBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m37309K0(boolean z11, Bundle bundle, Pair<String, String> pair) {
        String first;
        String second;
        String second2;
        String first2;
        String second3;
        if (!isFinishing() && !isDestroyed()) {
            String str = "";
            if (z11 && m37311N0().getF97455t0()) {
                if (this.f31602z) {
                    finish();
                    Function4<Boolean, Bundle, String, String, Unit> function4M96438a = C43791a.f96834a.m96438a();
                    if (function4M96438a != null) {
                        Boolean bool = Boolean.TRUE;
                        if (pair == null || (first2 = pair.getFirst()) == null) {
                            first2 = "";
                        }
                        if (pair != null && (second3 = pair.getSecond()) != null) {
                            str = second3;
                        }
                        function4M96438a.invoke(bool, bundle, first2, str);
                        return;
                    }
                    return;
                }
                finish();
                Function4<Boolean, Bundle, String, String, Unit> function4M96438a2 = C43791a.f96834a.m96438a();
                if (function4M96438a2 != null) {
                    Boolean bool2 = Boolean.FALSE;
                    String string = getString(R$string.jumio_nfc_scan_failed_toast);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    if (pair != null && (second2 = pair.getSecond()) != null) {
                        str = second2;
                    }
                    function4M96438a2.invoke(bool2, bundle, string, str);
                    return;
                }
                return;
            }
            finish();
            Function4<Boolean, Bundle, String, String, Unit> function4M96438a3 = C43791a.f96834a.m96438a();
            if (function4M96438a3 != null) {
                Boolean boolValueOf = Boolean.valueOf(z11);
                if (pair == null || (first = pair.getFirst()) == null) {
                    first = "";
                }
                if (pair != null && (second = pair.getSecond()) != null) {
                    str = second;
                }
                function4M96438a3.invoke(boolValueOf, bundle, first, str);
                return;
            }
            return;
        }
        C43840a.m96551e("JumioKubiActivity is finishing or destroyed", null, 2, null);
    }

    /* JADX INFO: renamed from: j1 */
    public final void m37313j1() throws JSONException {
        String stringExtra = getIntent().getStringExtra(InterfaceC33826o0.f71244p);
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra("datacenter");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        m37311N0().m97226N(this, stringExtra, str, getIntent().getBooleanExtra("needNFC", false));
        m56593T(m37311N0().m97240v());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseActivity, com.kubi.sdk.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m37311N0().m97217E().removeObservers(this);
        C41076a.f91293a.m90059a("-200004");
        m37271L0(this, false, null, C43792b.f96836a.m96444d(), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        NavigationBar navigationBar = getNavigationBar();
        Intrinsics.checkNotNullExpressionValue(navigationBar, "getNavigationBar(...)");
        ViewExtKt.m66577h(navigationBar);
        Configuration configuration = getBaseContext().getResources().getConfiguration();
        configuration.setLocale(Locale.getDefault());
        getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
        C36881a c36881aM37310M0 = m37310M0();
        boolean z11 = true;
        if (c36881aM37310M0 != null) {
            JumioLayoutScanCard jumioLayoutScanCard = c36881aM37310M0.f81423f;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            jumioLayoutScanCard.m37377t(supportFragmentManager);
            c36881aM37310M0.f81420c.m37329b(true);
            ImageView imageViewM37328a = c36881aM37310M0.f81420c.m37328a();
            if (imageViewM37328a != null) {
                C27046k.m66711z(imageViewM37328a, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.l
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return JumioKubiActivity.m37288f1(this.f31668b);
                    }
                }, 1, null);
            }
            ImageView imageViewM37374m = c36881aM37310M0.f81423f.m37374m();
            if (imageViewM37374m != null) {
                C27046k.m66711z(imageViewM37374m, 0L, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.n
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return JumioKubiActivity.m37289g1(this.f31672b);
                    }
                }, 1, null);
            }
        }
        m37312O0();
        JumioSDK.Companion companion = JumioSDK.INSTANCE;
        final String[] missingPermissions = companion.getMissingPermissions(this);
        if (!companion.hasAllRequiredPermissions(this)) {
            if (missingPermissions.length != 0) {
                z11 = false;
            }
            if (!z11) {
                JumioPermissionHintDialog.Companion companion2 = JumioPermissionHintDialog.f31633f0;
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                companion2.showDialog(supportFragmentManager2, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.o
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return JumioKubiActivity.m37290h1(this.f31674b, missingPermissions);
                    }
                }, new Function0() { // from class: com.kubi.kyc.vendor.jumio.ui.p
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return JumioKubiActivity.m37291i1(this.f31677b);
                    }
                });
            } else {
                m37313j1();
            }
        } else {
            m37313j1();
        }
        String name = JumioRetryTipDialog.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        BaseActivity.setFragmentResultListener$default(this, name, new C17281c(), false, 4, null);
    }

    @Override // com.kubi.sdk.base.p113ui.BaseUiActivity, com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() throws SDKNotConfiguredException {
        C36881a c36881aM37310M0;
        JumioNFCLayoutScan jumioNFCLayoutScan;
        super.onResume();
        if (m37311N0().m97236r().getValue() != null && (c36881aM37310M0 = m37310M0()) != null && (jumioNFCLayoutScan = c36881aM37310M0.f81421d) != null) {
            jumioNFCLayoutScan.m37400e();
        }
    }
}
