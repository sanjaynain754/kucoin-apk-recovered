package com.sumsub.sns.internal.features.presentation.main;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import com.sumsub.sns.R$id;
import com.sumsub.sns.core.SNSMobileSDK;
import com.sumsub.sns.core.data.listener.SNSUrlHandler;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.data.model.SNSNeedRestartSDKException;
import com.sumsub.sns.core.presentation.base.AbstractActivityC28115f;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.C28121h;
import com.sumsub.sns.core.presentation.base.C28135m;
import com.sumsub.sns.core.presentation.base.C28137n;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.core.widget.SNSProgressView;
import com.sumsub.sns.dynamicfeature.SNSDynamicFeatureInstaller;
import com.sumsub.sns.internal.core.common.AbstractC28393F0;
import com.sumsub.sns.internal.core.common.AbstractC28409N0;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.C28474m0;
import com.sumsub.sns.internal.core.common.C28491s;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.common.C28500v;
import com.sumsub.sns.internal.core.common.InterfaceC28407M0;
import com.sumsub.sns.internal.core.common.InterfaceC28498u0;
import com.sumsub.sns.internal.core.common.InterfaceC28504w0;
import com.sumsub.sns.internal.core.common.NetworkManager$NetworkType;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29149l0;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29143k0;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import com.sumsub.sns.internal.features.presentation.ServerDrivenNavigationConfiguration;
import com.sumsub.sns.internal.features.presentation.consent.C30855f;
import com.sumsub.sns.internal.features.presentation.error.C30926e;
import com.sumsub.sns.internal.features.presentation.error.C30935n;
import com.sumsub.sns.internal.features.presentation.esign.C30973b;
import com.sumsub.sns.internal.features.presentation.esign.C30984h;
import com.sumsub.sns.internal.features.presentation.geo.C31087g;
import com.sumsub.sns.internal.features.presentation.intro.C31151d;
import com.sumsub.sns.internal.features.presentation.intro.C31157j;
import com.sumsub.sns.internal.features.presentation.paymentmethod.selector.C31401h;
import com.sumsub.sns.internal.features.presentation.poa.C31455g;
import com.sumsub.sns.internal.features.presentation.preview.applicantdata.C31484b;
import com.sumsub.sns.internal.features.presentation.preview.applicantdata.C31490h;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.C31542c;
import com.sumsub.sns.internal.features.presentation.preview.ekyc.C31715m;
import com.sumsub.sns.internal.features.presentation.preview.photo.common.C31776f;
import com.sumsub.sns.internal.features.presentation.preview.photo.identity.C31808l;
import com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.C31832F;
import com.sumsub.sns.internal.features.presentation.preview.photo.poa.C31922f;
import com.sumsub.sns.internal.features.presentation.preview.selfie.C31941a;
import com.sumsub.sns.internal.features.presentation.preview.selfie.C31947g;
import com.sumsub.sns.internal.features.presentation.prooface.SNSDefaultLiveness3dFaceFragment;
import com.sumsub.sns.internal.features.presentation.prooface.SNSLiveness3dFaceFragment;
import com.sumsub.sns.internal.features.presentation.questionnaire.SNSQuestionnaireFragment;
import com.sumsub.sns.internal.features.presentation.restrictions.C32348n;
import com.sumsub.sns.internal.features.presentation.status.C32435m;
import com.sumsub.sns.internal.features.presentation.verification.C32709e;
import com.sumsub.sns.internal.features.presentation.verification.C32730p;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32840y;
import com.sumsub.sns.internal.features.presentation.videoident.presentation.SNSVideoIdentFragment;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;", "Lcom/sumsub/sns/core/presentation/base/f;", "Lcom/sumsub/sns/internal/features/presentation/main/f2;", "Lcom/sumsub/sns/internal/features/presentation/main/i2;", "Lcom/sumsub/sns/internal/core/common/u0;", "Lcom/sumsub/sns/internal/core/common/w0;", "<init>", "()V", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSAppActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSAppActivity.kt\ncom/sumsub/sns/internal/features/presentation/main/SNSAppActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n+ 6 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,691:1\n75#2,13:692\n32#3,8:705\n28#3,12:714\n1#4:713\n29#5:726\n27#6,4:727\n*S KotlinDebug\n*F\n+ 1 SNSAppActivity.kt\ncom/sumsub/sns/internal/features/presentation/main/SNSAppActivity\n*L\n90#1:692,13\n382#1:705,8\n653#1:714,12\n673#1:726\n158#1:727,4\n*E\n"})
public final class SNSAppActivity extends AbstractActivityC28115f implements InterfaceC28498u0, InterfaceC28504w0 {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f63146j = 0;

    /* JADX INFO: renamed from: f */
    public SNSProgressView f63148f;

    /* JADX INFO: renamed from: e */
    public final ViewModelLazy f63147e = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AbstractC31275i2.class), new C31343s0(this), new Function0() { // from class: com.sumsub.sns.internal.features.presentation.main.o2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SNSAppActivity.m70598a(this.f63489b);
        }
    }, new C31347t0(this));

    /* JADX INFO: renamed from: g */
    public final C28474m0 f63149g = new C28474m0();

    /* JADX INFO: renamed from: h */
    public final C31256e f63150h = new C31256e(getSupportFragmentManager(), new C31351u0(this));

    /* JADX INFO: renamed from: b */
    public static final void m70602b(SNSAppActivity sNSAppActivity, String str, Bundle bundle) {
        AbstractC28133l.Companion.getClass();
        if (!C28121h.m69079a(bundle)) {
            ((AbstractC31275i2) sNSAppActivity.f63147e.getValue()).mo70629c(false);
            return;
        }
        Fragment fragmentFindFragmentById = sNSAppActivity.getSupportFragmentManager().findFragmentById(R$id.sns_container);
        if (((fragmentFindFragmentById instanceof AbstractC28133l ? (AbstractC28133l) fragmentFindFragmentById : null) instanceof C31157j) && !sNSAppActivity.isFinishing() && !sNSAppActivity.isDestroyed() && !sNSAppActivity.getSupportFragmentManager().isStateSaved()) {
            sNSAppActivity.getSupportFragmentManager().popBackStack();
        }
        ((AbstractC31275i2) sNSAppActivity.f63147e.getValue()).mo70629c(true);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractActivityC28115f
    /* JADX INFO: renamed from: a */
    public final void mo69076a(AbstractC29149l0 abstractC29149l0, String str, CharSequence charSequence, String str2) {
        Throwable thMo69765c;
        SNSException network;
        if (C28468k0.f57990h) {
            if (!((abstractC29149l0 != null ? abstractC29149l0.mo69765c() : null) instanceof SNSNeedRestartSDKException)) {
                C33272c.f67816e.f67810a.mo68955d("SNSAppActivity", "Restored without callbacks, ignoring error: " + abstractC29149l0, null);
                return;
            }
        }
        if (abstractC29149l0 != null && (thMo69765c = abstractC29149l0.mo69765c()) != null) {
            Map map = AbstractC28393F0.f57880a;
            if (thMo69765c instanceof SNSException) {
                network = (SNSException) thMo69765c;
            } else {
                network = thMo69765c instanceof IOException ? new SNSException.Network(thMo69765c) : new SNSException.Internal(thMo69765c);
            }
            AbstractC28393F0.m69278a(network);
        }
        C31256e c31256e = this.f63150h;
        c31256e.getClass();
        if (abstractC29149l0 != null) {
            if (abstractC29149l0 instanceof C29143k0) {
                int i11 = C30926e.f62467U;
                String str3 = ((C29143k0) abstractC29149l0).f59123a;
                C30926e c30926e = new C30926e();
                Bundle bundle = new Bundle();
                bundle.putCharSequence("arg_message", str3);
                bundle.putCharSequence("arg_button", charSequence);
                c30926e.setArguments(bundle);
                c30926e.show(c31256e.f63303a, "SNSErrorDialog");
                return;
            }
            C31351u0 c31351u0 = c31256e.f63304b;
            C30935n.f62476f.getClass();
            C30935n c30935n = new C30935n();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("arg_error", abstractC29149l0);
            if (str != null) {
                bundle2.putString("arg_iddocsettype", str);
            }
            if (str2 != null) {
                bundle2.putString("arg_request_key", str2);
            }
            c30935n.setArguments(bundle2);
            c31351u0.invoke(c30935n, "ErrorFragment");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLayoutDirection(C28468k0.f57987e);
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        super.attachBaseContext(contextCreateConfigurationContext);
        if (AbstractC28409N0.m69294a("com.sumsub.sns.dynamicfeature.BuildConfig")) {
            SNSDynamicFeatureInstaller.INSTANCE.installActivity(contextCreateConfigurationContext);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        SNSCompletionResult sNSCompletionResultOnCancelResult;
        C33272c.f67816e.f67810a.mo68955d("SNSAppActivity", "onBackPressed()", null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        int i11 = R$id.sns_container;
        Fragment fragmentFindFragmentById = supportFragmentManager.findFragmentById(i11);
        AbstractC28133l abstractC28133l = fragmentFindFragmentById instanceof AbstractC28133l ? (AbstractC28133l) fragmentFindFragmentById : null;
        if (abstractC28133l == null) {
            AbstractC31275i2 abstractC31275i2 = (AbstractC31275i2) this.f63147e.getValue();
            Fragment fragmentFindFragmentById2 = getSupportFragmentManager().findFragmentById(i11);
            AbstractC28133l abstractC28133l2 = fragmentFindFragmentById2 instanceof AbstractC28133l ? (AbstractC28133l) fragmentFindFragmentById2 : null;
            if (abstractC28133l2 == null || (sNSCompletionResultOnCancelResult = abstractC28133l2.onCancelResult()) == null) {
                sNSCompletionResultOnCancelResult = SNSCompletionResult.SuccessTermination.INSTANCE;
            }
            abstractC31275i2.mo70620a(sNSCompletionResultOnCancelResult, false);
            return;
        }
        if (abstractC28133l.onFinishCalled(C28497u.f58029b)) {
            boolean z11 = true;
            if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
                ((AbstractC31275i2) this.f63147e.getValue()).mo70626a(true, false);
            } else {
                z11 = false;
            }
            ((AbstractC31275i2) this.f63147e.getValue()).mo70632e(false);
            if (z11) {
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractActivityC28115f, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", SNSMobileSDK.INSTANCE.toString(), null);
        this.f63148f = (SNSProgressView) findViewById(R$id.sns_progress);
        getSupportFragmentManager().setFragmentResultListener("geo_request_fallback", this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.main.q2
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                SNSAppActivity.m70601a(this.f63523a, str, bundle2);
            }
        });
        getSupportFragmentManager().setFragmentResultListener("instructions_request_key_internal", this, new FragmentResultListener() { // from class: com.sumsub.sns.internal.features.presentation.main.r2
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(String str, Bundle bundle2) {
                SNSAppActivity.m70602b(this.f63530a, str, bundle2);
            }
        });
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i11, KeyEvent keyEvent) {
        AbstractC28133l abstractC28133l;
        Boolean boolOnKeyDown;
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R$id.sns_container);
        InterfaceC28407M0 interfaceC28407M0 = null;
        if (fragmentFindFragmentById instanceof AbstractC28133l) {
            abstractC28133l = (AbstractC28133l) fragmentFindFragmentById;
        } else {
            abstractC28133l = null;
        }
        if (abstractC28133l instanceof InterfaceC28407M0) {
            interfaceC28407M0 = (InterfaceC28407M0) abstractC28133l;
        }
        if (interfaceC28407M0 != null && (boolOnKeyDown = interfaceC28407M0.onKeyDown(i11, keyEvent)) != null) {
            return boolOnKeyDown.booleanValue();
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractActivityC28115f, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f63149g.m69374a();
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractActivityC28115f, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        m70611b();
    }

    /* JADX INFO: renamed from: b */
    public final void m70611b() {
        this.f63149g.m69375a(getApplicationContext(), new Function1() { // from class: com.sumsub.sns.internal.features.presentation.main.p2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SNSAppActivity.m70599a(this.f63515b, (NetworkManager$NetworkType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m70605a(AbstractC28503w abstractC28503w, Long l11) {
        AbstractC28133l abstractC28133l;
        SNSCompletionResult sNSCompletionResultOnCancelResult;
        if (l11 != null) {
            ((AbstractC31275i2) this.f63147e.getValue()).mo70621a(abstractC28503w, l11.longValue());
            return;
        }
        if (abstractC28503w instanceof C28497u) {
            if (getSupportFragmentManager().getBackStackEntryCount() > 0 && !isFinishing() && !isDestroyed() && !getSupportFragmentManager().isStateSaved()) {
                if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
                    ((AbstractC31275i2) this.f63147e.getValue()).mo70626a(true, false);
                }
                ((AbstractC31275i2) this.f63147e.getValue()).mo70632e(false);
                getSupportFragmentManager().popBackStack();
                return;
            }
            AbstractC31275i2 abstractC31275i2 = (AbstractC31275i2) this.f63147e.getValue();
            Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R$id.sns_container);
            abstractC28133l = fragmentFindFragmentById instanceof AbstractC28133l ? (AbstractC28133l) fragmentFindFragmentById : null;
            if (abstractC28133l == null || (sNSCompletionResultOnCancelResult = abstractC28133l.onCancelResult()) == null) {
                sNSCompletionResultOnCancelResult = SNSCompletionResult.SuccessTermination.INSTANCE;
            }
            abstractC31275i2.mo70620a(sNSCompletionResultOnCancelResult, false);
            return;
        }
        if (abstractC28503w instanceof C28491s) {
            ((AbstractC31275i2) this.f63147e.getValue()).mo70631e();
            if (!isFinishing() && !isDestroyed() && !getSupportFragmentManager().isStateSaved()) {
                getSupportFragmentManager().popBackStack((String) null, 1);
            }
            ((AbstractC31275i2) this.f63147e.getValue()).mo70626a(true, true);
            return;
        }
        if (abstractC28503w instanceof C28494t) {
            if (((C28494t) abstractC28503w).f58028b) {
                if (!isFinishing() && !isDestroyed() && !getSupportFragmentManager().isStateSaved()) {
                    getSupportFragmentManager().popBackStack((String) null, 1);
                }
                AbstractC31275i2 abstractC31275i3 = (AbstractC31275i2) this.f63147e.getValue();
                KProperty[] kPropertyArr = AbstractC31275i2.f63367c;
                abstractC31275i3.mo70630d(false);
                return;
            }
            ((AbstractC31275i2) this.f63147e.getValue()).mo70631e();
            if (!isFinishing() && !isDestroyed() && !getSupportFragmentManager().isStateSaved()) {
                getSupportFragmentManager().popBackStack((String) null, 1);
            }
            ((AbstractC31275i2) this.f63147e.getValue()).mo70626a(false, true);
            return;
        }
        if (abstractC28503w instanceof C28500v) {
            AbstractC31275i2 abstractC31275i4 = (AbstractC31275i2) this.f63147e.getValue();
            SNSCompletionResult sNSCompletionResultOnCancelResult2 = ((C28500v) abstractC28503w).f58031b;
            if (sNSCompletionResultOnCancelResult2 == null) {
                Fragment fragmentFindFragmentById2 = getSupportFragmentManager().findFragmentById(R$id.sns_container);
                abstractC28133l = fragmentFindFragmentById2 instanceof AbstractC28133l ? (AbstractC28133l) fragmentFindFragmentById2 : null;
                if (abstractC28133l == null || (sNSCompletionResultOnCancelResult2 = abstractC28133l.onCancelResult()) == null) {
                    sNSCompletionResultOnCancelResult2 = SNSCompletionResult.SuccessTermination.INSTANCE;
                }
            }
            abstractC31275i4.mo70620a(sNSCompletionResultOnCancelResult2, false);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final void m70608a(C29070X c29070x) {
        ((AbstractC31275i2) this.f63147e.getValue()).mo70622a(c29070x);
        if (!isFinishing() && !isDestroyed() && !getSupportFragmentManager().isStateSaved()) {
            getSupportFragmentManager().popBackStack((String) null, 1);
        }
        AbstractC31275i2 abstractC31275i2 = (AbstractC31275i2) this.f63147e.getValue();
        KProperty[] kPropertyArr = AbstractC31275i2.f63367c;
        abstractC31275i2.mo70630d(false);
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m70599a(SNSAppActivity sNSAppActivity, NetworkManager$NetworkType networkManager$NetworkType) {
        ((AbstractC31275i2) sNSAppActivity.f63147e.getValue()).mo70628b(networkManager$NetworkType.getType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m70598a(SNSAppActivity sNSAppActivity) {
        if (ServerDrivenNavigationConfiguration.INSTANCE.isEnabled$idensic_mobile_sdk_aar_defaultRelease()) {
            return new C31247b2(sNSAppActivity, (C28578h) sNSAppActivity.f57328a.getValue());
        }
        return new C31255d2(sNSAppActivity, (C28578h) sNSAppActivity.f57328a.getValue());
    }

    /* JADX INFO: renamed from: a */
    public final void m70606a(C28895g c28895g, boolean z11, Map map) {
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "showInstructions: " + c28895g, null);
        C31151d c31151d = C31157j.f62993c;
        String str = c28895g.f58752a;
        String str2 = c28895g.f58753b;
        String str3 = c28895g.f58754c;
        String str4 = c28895g.f58755d;
        c31151d.getClass();
        C31157j c31157j = new C31157j();
        Bundle bundle = new Bundle();
        bundle.putString("sns_param_step", str);
        bundle.putString("sns_param_document_type", str3);
        bundle.putString("sns_param_scene", str2);
        bundle.putString("sns_param_country_code", str4);
        bundle.putBoolean("sns_param_cancel_on_back", z11);
        bundle.putSerializable("sns_param_analytics_payload", new HashMap(map));
        c31157j.setArguments(bundle);
        m70600a(this, c31157j.forResult("instructions_request_key_internal"), "SNSIntroScreenFragment", false, 12);
    }

    /* JADX INFO: renamed from: a */
    public final void m70609a(AbstractC31234Y abstractC31234Y) {
        Fragment fragmentNewInstance;
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Navigate to: " + abstractC31234Y, null);
        if (abstractC31234Y instanceof C31231X) {
            m70600a(this, SNSVideoIdentFragment.INSTANCE.create(((C31231X) abstractC31234Y).f63185c), SNSVideoIdentFragment.TAG, false, 12);
            return;
        }
        if (abstractC31234Y instanceof C31187I) {
            int i11 = C31808l.f64629U;
            Document document = ((C31187I) abstractC31234Y).f63050c;
            C31808l c31808l = new C31808l();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGS_DOCUMENT", document);
            c31808l.setArguments(bundle);
            m70600a(this, c31808l, "SNSPreviewIdentityDocumentFragment", false, 12);
            return;
        }
        if (abstractC31234Y instanceof C31205O) {
            C31941a c31941a = C31947g.f64949k;
            Document document2 = ((C31205O) abstractC31234Y).f63105c;
            c31941a.getClass();
            C31947g c31947g = new C31947g();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ARGS_DOCUMENT", document2);
            c31947g.setArguments(bundle2);
            m70600a(this, c31947g, "PreviewSelfieFragment", false, 12);
            return;
        }
        if (abstractC31234Y instanceof C31327o) {
            C31484b c31484b = C31490h.f63882f;
            Document document3 = ((C31327o) abstractC31234Y).f63483c;
            c31484b.getClass();
            C31490h c31490h = new C31490h();
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("ARGS_DOCUMENT", document3);
            c31490h.setArguments(bundle3);
            m70600a(this, c31490h, "SNSApplicantDataDocumentFragment", false, 12);
            return;
        }
        if (abstractC31234Y instanceof C31199M) {
            int i12 = C31776f.f64568U;
            Document document4 = ((C31199M) abstractC31234Y).f63087c;
            C31776f c31776f = new C31776f();
            Bundle bundle4 = new Bundle();
            bundle4.putParcelable("ARGS_DOCUMENT", document4);
            c31776f.setArguments(bundle4);
            m70600a(this, c31776f, "SNSPreviewCommonDocumentFragment", false, 12);
            return;
        }
        if (abstractC31234Y instanceof C31193K) {
            int i13 = C31776f.f64568U;
            Document document5 = ((C31193K) abstractC31234Y).f63064c;
            C31776f c31776f2 = new C31776f();
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable("ARGS_DOCUMENT", document5);
            c31776f2.setArguments(bundle5);
            m70600a(this, c31776f2, "SNSPreviewCommonDocumentFragment", false, 12);
            return;
        }
        if (abstractC31234Y instanceof C31211Q) {
            if (C33048a.f67460W.m71434a()) {
                int i14 = C31922f.f64890U;
                Document document6 = ((C31211Q) abstractC31234Y).f63119c;
                C31922f c31922f = new C31922f();
                Bundle bundle6 = new Bundle();
                bundle6.putParcelable("ARGS_DOCUMENT", document6);
                c31922f.setArguments(bundle6);
                m70600a(this, c31922f, "SNSProofOfAddressFragment", false, 12);
                return;
            }
            int i15 = C31455g.f63759V;
            Document document7 = ((C31211Q) abstractC31234Y).f63119c;
            C31455g c31455g = new C31455g();
            Bundle bundle7 = new Bundle();
            bundle7.putParcelable("ARGS_DOCUMENT", document7);
            c31455g.setArguments(bundle7);
            m70600a(this, c31455g, "SNSPoaFragmentV2", false, 12);
            return;
        }
        if (abstractC31234Y instanceof C31181G) {
            int i16 = C31401h.f63625U;
            Document document8 = ((C31181G) abstractC31234Y).f63042c;
            C31401h c31401h = new C31401h();
            Bundle bundle8 = new Bundle();
            bundle8.putParcelable("ARGS_DOCUMENT", document8);
            c31401h.setArguments(bundle8);
            m70600a(this, c31401h, "SNSPaymentMethodSelectorFragment", false, 12);
            return;
        }
        if (abstractC31234Y instanceof C31169C) {
            int i17 = C31087g.f62856U;
            Document document9 = ((C31169C) abstractC31234Y).f63021c;
            C31087g c31087g = new C31087g();
            Bundle bundle9 = new Bundle();
            bundle9.putParcelable("ARGS_DOCUMENT", document9);
            c31087g.setArguments(bundle9);
            m70600a(this, c31087g, "SNSGeoFragment", false, 12);
            return;
        }
        if (abstractC31234Y instanceof C31350u) {
            if (C33048a.f67476i.m71434a()) {
                int i18 = C32840y.f67186U;
                ValidationIdentifierType validationIdentifierType = ValidationIdentifierType.EMAIL;
                C32840y c32840y = new C32840y();
                Bundle bundle10 = new Bundle();
                bundle10.putParcelable("VerificationType", validationIdentifierType);
                bundle10.putBoolean("VerificationEmbedded", false);
                bundle10.putBoolean("SendPhoneCodeImmediately", false);
                c32840y.setArguments(bundle10);
                m70600a(this, c32840y, "VerificationStepHostFragment", false, 8);
                return;
            }
            C32709e c32709e = C32730p.f66964p;
            ValidationIdentifierType validationIdentifierType2 = ValidationIdentifierType.EMAIL;
            c32709e.getClass();
            C32730p c32730p = new C32730p();
            Bundle bundle11 = new Bundle();
            bundle11.putSerializable("ValidationIdentifier", validationIdentifierType2);
            bundle11.putBoolean("SendPhoneCodeImmediately", false);
            c32730p.setArguments(bundle11);
            m70600a(this, c32730p, "SNSVerificationStepFragment", false, 8);
            return;
        }
        if (abstractC31234Y instanceof C31358w) {
            if (C33048a.f67476i.m71434a()) {
                int i19 = C32840y.f67186U;
                ValidationIdentifierType validationIdentifierType3 = ValidationIdentifierType.PHONE;
                C32840y c32840y2 = new C32840y();
                Bundle bundle12 = new Bundle();
                bundle12.putParcelable("VerificationType", validationIdentifierType3);
                bundle12.putBoolean("VerificationEmbedded", false);
                bundle12.putBoolean("SendPhoneCodeImmediately", false);
                c32840y2.setArguments(bundle12);
                m70600a(this, c32840y2, "VerificationStepHostFragment", false, 8);
                return;
            }
            C32709e c32709e2 = C32730p.f66964p;
            ValidationIdentifierType validationIdentifierType4 = ValidationIdentifierType.PHONE;
            c32709e2.getClass();
            C32730p c32730p2 = new C32730p();
            Bundle bundle13 = new Bundle();
            bundle13.putSerializable("ValidationIdentifier", validationIdentifierType4);
            bundle13.putBoolean("SendPhoneCodeImmediately", false);
            c32730p2.setArguments(bundle13);
            m70600a(this, c32730p2, "SNSVerificationStepFragment", false, 8);
            return;
        }
        if (abstractC31234Y instanceof C31219T) {
            C31219T c31219t = (C31219T) abstractC31234Y;
            m70600a(this, SNSQuestionnaireFragment.f65822d.newInstance(c31219t.f63151c.getType().f59014a, c31219t.f63152d), "SNSQuestionnaireFragment2", false, 8);
            return;
        }
        if (abstractC31234Y instanceof C31335q) {
            if (getSupportFragmentManager().findFragmentByTag("SNSApplicantStatusFragment") != null) {
                if (isFinishing() || isDestroyed() || getSupportFragmentManager().isStateSaved()) {
                    return;
                }
                getSupportFragmentManager().popBackStack((String) null, 1);
                return;
            }
            C32435m.f66108o.getClass();
            m70600a(this, new C32435m(), "SNSApplicantStatusFragment", false, 4);
            return;
        }
        if (abstractC31234Y instanceof C31175E) {
            if (!C33048a.f67457T.m71434a()) {
                fragmentNewInstance = SNSLiveness3dFaceFragment.f65167j.newInstance(((C31175E) abstractC31234Y).f63034c.getType());
            } else {
                fragmentNewInstance = SNSDefaultLiveness3dFaceFragment.f65151p.newInstance(((C31175E) abstractC31234Y).f63034c.getType());
            }
            m70600a(this, fragmentNewInstance, null, false, 14);
            return;
        }
        if (abstractC31234Y instanceof C31163A) {
            C31542c c31542c = C31715m.f64391v;
            Document document10 = ((C31163A) abstractC31234Y).f63011c;
            c31542c.getClass();
            C31715m c31715m = new C31715m();
            Bundle bundle14 = new Bundle();
            bundle14.putParcelable("ARGS_DOCUMENT", document10);
            c31715m.setArguments(bundle14);
            m70600a(this, c31715m, "SNSEkycFragment", false, 12);
            return;
        }
        if (abstractC31234Y instanceof C31366y) {
            C30973b c30973b = C30984h.f62607g;
            Document document11 = ((C31366y) abstractC31234Y).f63563c;
            c30973b.getClass();
            C30984h c30984h = new C30984h();
            Bundle bundle15 = new Bundle();
            bundle15.putParcelable("ARG_DOCUMENT", document11);
            c30984h.setArguments(bundle15);
            m70600a(this, c30984h, "SNSESignFragment", false, 12);
            return;
        }
        if (abstractC31234Y instanceof C31297m) {
            m70600a(this, new C30855f(), "SNSConsentFragment", false, 12);
            return;
        }
        if (Intrinsics.areEqual(abstractC31234Y, C31342s.f63531c)) {
            if (isFinishing() || isDestroyed() || getSupportFragmentManager().isStateSaved()) {
                return;
            }
            getSupportFragmentManager().popBackStack((String) null, 1);
            return;
        }
        if (abstractC31234Y instanceof C31225V) {
            int i21 = C32348n.f65910U;
            C29586o0 c29586o0 = ((C31225V) abstractC31234Y).f63166c;
            C32348n c32348n = new C32348n();
            Bundle bundle16 = new Bundle();
            bundle16.putParcelable("arg_initial_state", c29586o0);
            c32348n.setArguments(bundle16);
            m70600a(this, c32348n, null, false, 14);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m70600a(SNSAppActivity sNSAppActivity, Fragment fragment, String str, boolean z11, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        boolean z12 = (i11 & 4) == 0;
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        sNSAppActivity.m70604a(fragment, str, z12, z11);
    }

    /* JADX INFO: renamed from: a */
    public final void m70604a(Fragment fragment, String str, boolean z11, boolean z12) {
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "ReplaceFragment, tag = " + str, null);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R$id.sns_container, fragment, str);
        if (z12) {
            fragmentTransactionBeginTransaction.addToBackStack(str);
        }
        if (z11) {
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } else {
            fragmentTransactionBeginTransaction.commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70603a(Fragment fragment, String str) {
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "ShowFragment, tag = " + str, null);
        ((AbstractC31275i2) this.f63147e.getValue()).mo70632e(false);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), C41782z0.m91393c().getImmediate(), null, new C31336q0(this, str, fragment, null), 2, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractActivityC28115f
    /* JADX INFO: renamed from: a */
    public final void mo69075a(InterfaceC28145r interfaceC28145r) {
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "event: " + interfaceC28145r, null);
        if (interfaceC28145r instanceof C28135m) {
            C28135m c28135m = (C28135m) interfaceC28145r;
            mo69076a(c28135m.f57362a, c28135m.f57363b, c28135m.f57364c, c28135m.f57365d);
        }
        if (interfaceC28145r instanceof AbstractC31234Y) {
            m70609a((AbstractC31234Y) interfaceC28145r);
            return;
        }
        if (interfaceC28145r instanceof C31289k) {
            C31256e c31256e = this.f63150h;
            c31256e.getClass();
            c31256e.f63303a.popBackStack();
            InterfaceC31285j interfaceC31285j = ((C31289k) interfaceC28145r).f63402a;
            if (interfaceC31285j instanceof C31268h) {
                for (Fragment fragment : c31256e.f63303a.getFragments()) {
                    AbstractC28133l abstractC28133l = fragment instanceof AbstractC28133l ? (AbstractC28133l) fragment : null;
                    if (abstractC28133l != null) {
                        abstractC28133l.onHandleError(((C31268h) interfaceC31285j).f63340a);
                    }
                }
                return;
            }
            if (!(interfaceC31285j instanceof C31272i)) {
                if (interfaceC31285j != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            for (Fragment fragment2 : c31256e.f63303a.getFragments()) {
                AbstractC28133l abstractC28133l2 = fragment2 instanceof AbstractC28133l ? (AbstractC28133l) fragment2 : null;
                if (abstractC28133l2 != null) {
                    abstractC28133l2.onErrorCancelled(((C31272i) interfaceC31285j).f63358a);
                }
            }
            return;
        }
        if (interfaceC28145r instanceof C31264g) {
            ((C28578h) this.f57328a.getValue()).m69470a();
            finish();
            return;
        }
        if (interfaceC28145r instanceof C31237Z) {
            C31237Z c31237z = (C31237Z) interfaceC28145r;
            m70606a(c31237z.f63197a, c31237z.f63198b, c31237z.f63199c);
            return;
        }
        if (interfaceC28145r instanceof C28137n) {
            m70605a(((C28137n) interfaceC28145r).f57368a, (Long) null);
            return;
        }
        if (interfaceC28145r instanceof C31260f) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C31260f c31260f = (C31260f) interfaceC28145r;
            String str = c31260f.f63314c;
            Bundle bundle = new Bundle();
            bundle.putInt(AbstractC28133l.FRAGMENT_RESULT_KEY, c31260f.f63312a ? -1 : 0);
            bundle.putParcelable("payload", c31260f.f63313b);
            Unit unit = Unit.INSTANCE;
            supportFragmentManager.setFragmentResult(str, bundle);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m70607a(AbstractC28978A2 abstractC28978A2) {
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Show NFC reading screen " + abstractC28978A2, null);
        getSupportFragmentManager().popBackStack("SNSMRTDReadFragment", 1);
        C31832F c31832f = new C31832F();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARGS_MRTD_DOCUMENT", abstractC28978A2);
        c31832f.setArguments(bundle);
        m70600a(this, c31832f, "SNSMRTDReadFragment", false, 12);
    }

    /* JADX INFO: renamed from: a */
    public final void m70610a(String str, boolean z11) {
        if (z11) {
            try {
                SNSUrlHandler urlHandler = SNSMobileSDK.INSTANCE.getUrlHandler();
                if (urlHandler != null && urlHandler.onUrl(this, str)) {
                    C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "handled by host application", null);
                    return;
                }
            } catch (Exception e11) {
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Can't open deep link " + str, e11);
                return;
            }
        }
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "handle url using system default behaviour", null);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        startActivity(intent);
    }

    /* JADX INFO: renamed from: a */
    public static final void m70601a(SNSAppActivity sNSAppActivity, String str, Bundle bundle) {
        Document document = (Document) AbstractC28437b.m69320a(bundle, "geo_fallback_document", Document.class, null);
        if (document != null) {
            C31455g c31455g = new C31455g();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ARGS_DOCUMENT", document);
            c31455g.setArguments(bundle2);
            m70600a(sNSAppActivity, c31455g, "SNSPoaFragmentV2", false, 12);
            return;
        }
        ((AbstractC31275i2) sNSAppActivity.f63147e.getValue()).mo70631e();
        if (!sNSAppActivity.isFinishing() && !sNSAppActivity.isDestroyed() && !sNSAppActivity.getSupportFragmentManager().isStateSaved()) {
            sNSAppActivity.getSupportFragmentManager().popBackStack((String) null, 1);
        }
        ((AbstractC31275i2) sNSAppActivity.f63147e.getValue()).mo70626a(true, true);
    }
}
