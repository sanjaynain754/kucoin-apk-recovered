package com.sumsub.sns.internal.features.presentation.intro;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import com.sumsub.sns.R$id;
import com.sumsub.sns.R$layout;
import com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28064I;
import com.sumsub.sns.core.presentation.base.AbstractC28118g;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.core.presentation.intro.C28236b;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28404L;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.common.C28500v;
import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import com.sumsub.sns.internal.core.presentation.screen.base.AbstractC28935s;
import com.sumsub.sns.internal.features.data.model.common.C29697t2;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31283h;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32814J;
import com.sumsub.sns.internal.features.presentation.verification2.host.C32832p;
import java.util.Map;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.intro.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m90084d2 = {"Lcom/sumsub/sns/internal/features/presentation/intro/j;", "Lcom/sumsub/sns/core/presentation/base/I;", "Lcom/sumsub/sns/core/presentation/base/s;", "Lcom/sumsub/sns/internal/features/presentation/intro/n;", "<init>", "()V", "com/sumsub/sns/internal/features/presentation/intro/d", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSIntroScreenFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSIntroScreenFragment.kt\ncom/sumsub/sns/internal/features/presentation/intro/SNSIntroScreenFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,155:1\n106#2,15:156\n*S KotlinDebug\n*F\n+ 1 SNSIntroScreenFragment.kt\ncom/sumsub/sns/internal/features/presentation/intro/SNSIntroScreenFragment\n*L\n28#1:156,15\n*E\n"})
public final class C31157j extends AbstractC28064I<InterfaceC28147s, C31161n> {

    /* JADX INFO: renamed from: a */
    public final C28404L f62995a = new C28404L(R$id.sns_container);

    /* JADX INFO: renamed from: b */
    public final Lazy f62996b;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty[] f62994d = {AbstractC28118g.m69077a(C31157j.class, "content", "getContent()Landroid/view/ViewGroup;", 0)};

    /* JADX INFO: renamed from: c */
    public static final C31151d f62993c = new C31151d();

    /* JADX INFO: renamed from: a */
    public static final void m70594a(C31157j c31157j, View view) {
        C31161n c31161n = (C31161n) c31157j.f62996b.getValue();
        c31161n.f63007g.f63388b.add(C31283h.m70667a(new C29697t2(c31161n.f63001a, c31161n.f63003c, c31161n.f63002b, (String) null, (Map) null, 56)));
        InterfaceC31150c interfaceC31150c = c31161n.f63006f;
        if (interfaceC31150c != null) {
            ((AbstractC28935s) interfaceC31150c).m69704e();
        }
        AbstractC28133l.setResult$default(c31157j, 0, new Bundle(), 1, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    /* JADX INFO: renamed from: getIdDocSetType */
    public final String getF66519e() {
        return ((C31161n) this.f62996b.getValue()).f63001a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Integer getLayoutId() {
        return Integer.valueOf(R$layout.sns_fragment_intro);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final AbstractC28052C getViewModel$idensic_mobile_sdk_aar_defaultRelease() {
        return (C31161n) this.f62996b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final void handleState(InterfaceC28147s interfaceC28147s, Bundle bundle) {
        C28236b c28236b;
        View view;
        Button button;
        Unit unit;
        if (interfaceC28147s instanceof C31159l) {
            C31159l c31159l = (C31159l) interfaceC28147s;
            if (c31159l.f62999b.isEmpty()) {
                return;
            }
            SNSInstructionsViewHandler instructionsViewHandler = C28468k0.f57983a.getInstructionsViewHandler();
            if (instructionsViewHandler != null) {
                Context contextRequireContext = requireContext();
                C28895g c28895g = c31159l.f62998a;
                View viewOnVerificationStep = instructionsViewHandler.onVerificationStep(contextRequireContext, c28895g.f58752a, c28895g.f58754c, c28895g.f58753b, SNSInstructionsViewHandler.Position.FULLSCREEN.getValue(), c31159l.f62998a.f58755d);
                if (viewOnVerificationStep != null) {
                    C28404L c28404l = this.f62995a;
                    KProperty[] kPropertyArr = f62994d;
                    ViewGroup viewGroup = (ViewGroup) c28404l.getValue(this, kPropertyArr[0]);
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                    }
                    ViewGroup viewGroup2 = (ViewGroup) this.f62995a.getValue(this, kPropertyArr[0]);
                    if (viewGroup2 != null) {
                        viewGroup2.addView(viewOnVerificationStep, new ViewGroup.MarginLayoutParams(-1, -2));
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        c28236b = new C28236b(getServiceLocator$idensic_mobile_sdk_aar_defaultRelease().f58179q, getAppListener$idensic_mobile_sdk_aar_defaultRelease(), 0);
                        view = getView();
                        if (view != null) {
                            C28236b.m69184a(c28236b, view, c31159l.f62999b, R$id.sns_container, R$id.sns_primary_button);
                        }
                    }
                } else {
                    c28236b = new C28236b(getServiceLocator$idensic_mobile_sdk_aar_defaultRelease().f58179q, getAppListener$idensic_mobile_sdk_aar_defaultRelease(), 0);
                    view = getView();
                    if (view != null) {
                        C28236b.m69184a(c28236b, view, c31159l.f62999b, R$id.sns_container, R$id.sns_primary_button);
                    }
                }
            } else {
                c28236b = new C28236b(getServiceLocator$idensic_mobile_sdk_aar_defaultRelease().f58179q, getAppListener$idensic_mobile_sdk_aar_defaultRelease(), 0);
                view = getView();
                if (view != null) {
                    C28236b.m69184a(c28236b, view, c31159l.f62999b, R$id.sns_container, R$id.sns_primary_button);
                }
            }
            View view2 = getView();
            if (view2 == null || (button = (Button) view2.findViewById(R$id.sns_primary_button)) == null) {
                return;
            }
            Object obj = c31159l.f62999b.get("actionTitle");
            button.setText(obj instanceof String ? (String) obj : null);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.sumsub.sns.internal.features.presentation.intro.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C31157j.m70594a(this.f62992b, view3);
                }
            });
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        C31161n c31161n = (C31161n) this.f62996b.getValue();
        if (abstractC28503w instanceof C28497u) {
            InterfaceC31150c interfaceC31150c = c31161n.f63006f;
            if (interfaceC31150c != null) {
                C31148a c31148a = C31148a.f62986a;
                ((C32814J) ((AbstractC28935s) interfaceC31150c)).f67154j.m71347a(C32832p.f67179a);
                return false;
            }
            if (c31161n.f63005e) {
                AbstractC28052C.finish$default(c31161n, new C28500v(SNSCompletionResult.SuccessTermination.INSTANCE), null, null, null, 14, null);
                return false;
            }
        } else {
            c31161n.getClass();
        }
        m69084e();
        return true;
    }

    public C31157j() {
        Function0 function0 = new Function0() { // from class: com.sumsub.sns.internal.features.presentation.intro.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C31157j.m70593a(this.f62987b);
            }
        };
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new C31153f(new C31152e(this)));
        this.f62996b = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(C31161n.class), new C31154g(lazy), new C31155h(lazy), function0);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28133l
    public final Map getOpenPayload() {
        return MapsKt.plus(super.getOpenPayload(), ((C31161n) this.f62996b.getValue()).f63008h);
    }

    /* JADX INFO: renamed from: a */
    public static final ViewModelProvider.Factory m70593a(C31157j c31157j) {
        return new C31162o(c31157j, c31157j.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease());
    }
}
