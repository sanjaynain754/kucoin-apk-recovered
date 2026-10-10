package com.sumsub.sns.internal.features.presentation.restrictions;

import android.text.Spanned;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.model.SNSCompletionResult;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import com.sumsub.sns.internal.core.analytics.C28367f;
import com.sumsub.sns.internal.core.analytics.Control;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.common.C28500v;
import com.sumsub.sns.internal.core.common.InterfaceC28492s0;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.presentation.main.AbstractC31275i2;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import java.util.Arrays;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.TuplesKt;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32333C extends AbstractC28142p0 {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ int f65885V = 0;

    /* JADX INFO: renamed from: a */
    public final InterfaceC30000a f65886a;

    /* JADX INFO: renamed from: b */
    public final C32340f f65887b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC28492s0 f65888c;

    /* JADX INFO: renamed from: d */
    public final C32341g f65889d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC41669n f65890e;

    public C32333C(C29586o0 c29586o0, C28547d c28547d, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, C32340f c32340f, AbstractC31275i2 abstractC31275i2, C32341g c32341g) {
        super(interfaceC29953a, interfaceC29984m, new C28076P(1));
        this.f65886a = c28547d;
        this.f65887b = c32340f;
        this.f65888c = abstractC31275i2;
        this.f65889d = c32341g;
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(c29586o0);
        this.f65890e = interfaceC41669nM91009a;
        AbstractC28421U.m69303a(C41636g.m90939v(new C32360z(interfaceC41669nM91009a, this)), ViewModelKt.getViewModelScope(this), new C32331A(this, null));
    }

    /* JADX INFO: renamed from: a */
    public final CharSequence m71099a(C29124h c29124h, String str, String str2) {
        Spanned spannedM69364a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str3 = String.format(str, Arrays.copyOf(new Object[]{str2}, 1));
        String strM69770a = AbstractC29130i.m69770a(str3, c29124h.f59071d);
        if (strM69770a == null) {
            C33272c c33272c = C33272c.f67812a;
            Logger.DefaultImpls.e$default(C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})), "SNSRestrictionsViewModel", "String resource " + str3 + " for restrictionCode " + str2 + " is not found", null, 4, null);
        }
        return (strM69770a == null || (spannedM69364a = AbstractC28462i0.m69364a(strM69770a, ((C28547d) this.f65886a).f58099a.f58163a)) == null) ? "" : spannedM69364a;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        return new C32357w(this.f65890e, c28075o, this);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final String getDocumentType() {
        return "Status";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final void intent(InterfaceC28077Q interfaceC28077Q) {
        String str;
        String str2;
        if (!(interfaceC28077Q instanceof AbstractC32352r)) {
            super.intent(interfaceC28077Q);
            return;
        }
        AbstractC32352r abstractC32352r = (AbstractC32352r) interfaceC28077Q;
        String str3 = "unknown";
        if (Intrinsics.areEqual(abstractC32352r, C32351q.f65917a)) {
            showProgress(true);
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), C41782z0.m91392b(), null, new C32332B(this, null, this), 2, null);
            C32341g c32341g = this.f65889d;
            C29586o0 c29586o0 = (C29586o0) this.f65890e.getValue();
            if (c29586o0 != null && (str2 = c29586o0.f59609a) != null) {
                str3 = str2;
            }
            Control control = Control.RetryButton;
            c32341g.getClass();
            Screen screen = Screen.RestrictionsScreen;
            C28367f.m69257a(new C28367f(screen, c32341g.f65899a), screen, c32341g.f65899a, control, MapsKt.mapOf(TuplesKt.m90091to("restrictionCode", str3)), 16);
            return;
        }
        if (!Intrinsics.areEqual(abstractC32352r, C32350p.f65916a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC28052C.finish$default(this, new C28500v(SNSCompletionResult.SuccessTermination.INSTANCE), null, null, null, 14, null);
        C32341g c32341g2 = this.f65889d;
        C29586o0 c29586o1 = (C29586o0) this.f65890e.getValue();
        if (c29586o1 != null && (str = c29586o1.f59609a) != null) {
            str3 = str;
        }
        Control control2 = Control.CloseButton;
        c32341g2.getClass();
        Screen screen2 = Screen.RestrictionsScreen;
        C28367f.m69257a(new C28367f(screen2, c32341g2.f65899a), screen2, c32341g2.f65899a, control2, MapsKt.mapOf(TuplesKt.m90091to("restrictionCode", str3)), 16);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        if (!Intrinsics.areEqual(abstractC28503w, C28497u.f58029b)) {
            return super.onFinishCalled(abstractC28503w);
        }
        AbstractC28052C.finish$default(this, new C28500v(SNSCompletionResult.SuccessTermination.INSTANCE), null, null, null, 14, null);
        return false;
    }
}
