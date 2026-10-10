package com.sumsub.sns.internal.features.presentation.main;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.log.C30002b;
import com.sumsub.sns.internal.features.data.repository.navigation.C30027v;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.features.data.repository.socket.InterfaceC30035a;
import com.sumsub.sns.internal.features.domain.C30078L;
import com.sumsub.sns.internal.features.domain.C30081O;
import com.sumsub.sns.internal.features.domain.appdata.C30099f;
import com.sumsub.sns.internal.features.domain.fisherman.C30182f;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31283h;
import com.sumsub.sns.internal.features.presentation.main.navigation.C31318n;
import com.sumsub.sns.internal.features.presentation.main.navigation.C31325u;
import java.util.Set;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.b2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31247b2 extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f63249a;

    public C31247b2(SNSAppActivity sNSAppActivity, C28578h c28578h) {
        super(sNSAppActivity, null);
        this.f63249a = c28578h;
    }

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        C28578h c28578h = this.f63249a;
        C30078L c30078l = new C30078L(c28578h.f58163a, (C29903a) c28578h.f58176n.getValue(), (InterfaceC29953a) this.f63249a.f58168f.getValue(), (C30002b) this.f63249a.f58175m.getValue(), this.f63249a.f58156M);
        C30182f c30182f = (C30182f) this.f63249a.f58147D.getValue();
        C30081O c30081o = new C30081O(this.f63249a);
        C30099f c30099f = new C30099f((InterfaceC29953a) this.f63249a.f58168f.getValue(), (InterfaceC29984m) this.f63249a.f58180r.getValue(), (InterfaceC30035a) this.f63249a.f58181s.getValue(), "SNSAppViewModel2");
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) this.f63249a.f58168f.getValue();
        C30034c c30034c = (C30034c) this.f63249a.f58167e.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) this.f63249a.f58180r.getValue();
        InterfaceC30035a interfaceC30035a = (InterfaceC30035a) this.f63249a.f58181s.getValue();
        InterfaceC29921d interfaceC29921d = (InterfaceC29921d) this.f63249a.f58169g.getValue();
        C31288j2 c31288j2 = (C31288j2) this.f63249a.f58171i.getValue();
        C28578h c28578h2 = this.f63249a;
        return new C31243a2(savedStateHandle, c30078l, c30182f, c30081o, c30099f, interfaceC29953a, c30034c, interfaceC29984m, interfaceC30035a, interfaceC29921d, c31288j2, new C31283h(savedStateHandle, (InterfaceC29984m) c28578h2.f58180r.getValue(), (Set) c28578h2.f58162S.getValue()), new C31318n((C30027v) this.f63249a.f58170h.getValue(), new C31325u()));
    }
}
