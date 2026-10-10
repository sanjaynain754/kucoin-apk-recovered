package com.sumsub.sns.internal.features.presentation.verification2.host;

import androidx.lifecycle.SavedStateHandle;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.core.common.C28497u;
import com.sumsub.sns.internal.core.presentation.screen.base.AbstractC28935s;
import com.sumsub.sns.internal.core.presentation.screen.base.C28927k;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28945b;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28947d;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28951h;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28954k;
import com.sumsub.sns.internal.core.presentation.screen.navigation.InterfaceC28952i;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31283h;
import com.sumsub.sns.internal.features.presentation.verification.C32707d;
import com.sumsub.sns.internal.features.presentation.verification2.code.C32745a;
import com.sumsub.sns.internal.features.presentation.verification2.code.C32746b;
import com.sumsub.sns.internal.features.presentation.verification2.code.C32747c;
import com.sumsub.sns.internal.features.presentation.verification2.code.C32748d;
import com.sumsub.sns.internal.features.presentation.verification2.code.InterfaceC32749e;
import com.sumsub.sns.internal.features.presentation.verification2.code.InterfaceC32769y;
import com.sumsub.sns.internal.features.presentation.verification2.email.InterfaceC32786h;
import com.sumsub.sns.internal.features.presentation.verification2.phone.InterfaceC32867l;
import com.sumsub.sns.internal.features.presentation.verification2.status.InterfaceC32889h;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.host.J */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32814J extends AbstractC28935s implements InterfaceC32786h, InterfaceC32867l, InterfaceC32769y, InterfaceC32889h {

    /* JADX INFO: renamed from: V */
    public static final /* synthetic */ int f67147V = 0;

    /* JADX INFO: renamed from: d */
    public final ValidationIdentifierType f67148d;

    /* JADX INFO: renamed from: e */
    public final boolean f67149e;

    /* JADX INFO: renamed from: f */
    public final boolean f67150f;

    /* JADX INFO: renamed from: g */
    public final C32707d f67151g;

    /* JADX INFO: renamed from: h */
    public final C32827k f67152h;

    /* JADX INFO: renamed from: i */
    public boolean f67153i;

    /* JADX INFO: renamed from: j */
    public final C32805A f67154j;

    /* JADX INFO: renamed from: b */
    public final void m71349b(String str) {
        if (!StringsKt.startsWith$default(str, "+", false, 2, (Object) null)) {
            str = "+" + str;
        }
        this.f67154j.m71346a(C32828l.f67176a);
        this.f58833c.m69697b(new C28945b(str, this.f67148d));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C32814J(ValidationIdentifierType validationIdentifierType, boolean z11, boolean z12, C32707d c32707d, C32827k c32827k, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m, SavedStateHandle savedStateHandle, C31283h c31283h) {
        InterfaceC28952i interfaceC28952i;
        int i11 = AbstractC32816L.f67159a[validationIdentifierType.ordinal()];
        if (i11 == 1) {
            interfaceC28952i = C28947d.f58850a;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC28952i = C28951h.f58855a;
        }
        super(interfaceC29953a, interfaceC29984m, savedStateHandle, interfaceC28952i, c31283h);
        this.f67148d = validationIdentifierType;
        this.f67149e = z11;
        this.f67150f = z12;
        this.f67151g = c32707d;
        this.f67152h = c32827k;
        this.f67154j = new C32805A(this);
    }

    /* JADX INFO: renamed from: a */
    public final Unit m71348a(InterfaceC32749e interfaceC32749e) {
        InterfaceC28952i interfaceC28952i;
        if (interfaceC32749e instanceof C32748d) {
            this.f58833c.m69697b(new C28954k(true, this.f67148d));
        } else if (interfaceC32749e instanceof C32747c) {
            this.f67154j.m71346a(C32829m.f67177a);
            this.f58833c.m69694a(new C28954k(false, this.f67148d));
        } else if (interfaceC32749e instanceof C32746b) {
            this.f67154j.m71346a(C32829m.f67177a);
        } else {
            if (!(interfaceC32749e instanceof C32745a)) {
                throw new NoWhenBranchMatchedException();
            }
            C33272c c33272c = C33272c.f67812a;
            C33272c.f67814c.mo68956e(AbstractC33294e.m71624a(this), "Code request failed", ((C32745a) interfaceC32749e).f67004a);
            C28927k c28927k = this.f58833c;
            int i11 = AbstractC32816L.f67159a[this.f67148d.ordinal()];
            if (i11 == 1) {
                interfaceC28952i = C28947d.f58850a;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC28952i = C28951h.f58855a;
            }
            c28927k.m69693a(interfaceC28952i);
        }
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final String getDocumentType() {
        int i11 = AbstractC32816L.f67159a[this.f67148d.ordinal()];
        if (i11 == 1) {
            return "EMAIL_VERIFICATION";
        }
        if (i11 == 2) {
            return "PHONE_VERIFICATION";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.sumsub.sns.internal.core.presentation.screen.base.AbstractC28935s, com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final boolean onFinishCalled(AbstractC28503w abstractC28503w) {
        if (Intrinsics.areEqual(abstractC28503w, C28497u.f58029b) && this.f58833c.m69692a().size() <= 1) {
            this.f67154j.m71347a(C32831o.f67178a);
        }
        return super.onFinishCalled(abstractC28503w);
    }
}
