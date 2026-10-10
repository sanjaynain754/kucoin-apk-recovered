package com.sumsub.sns.core.presentation.form;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.form.model.AbstractC28178b;
import com.sumsub.sns.internal.core.common.AbstractC28392F;
import com.sumsub.sns.internal.core.common.AbstractC28400J;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.android.C28710y;
import com.sumsub.sns.internal.core.presentation.form.FieldId;
import com.sumsub.sns.internal.core.presentation.form.InterfaceC28804k;
import com.sumsub.sns.internal.core.presentation.form.model.AbstractC28841e0;
import com.sumsub.sns.internal.core.presentation.form.model.C28811E;
import com.sumsub.sns.internal.core.presentation.form.model.C28850j;
import com.sumsub.sns.internal.log.C33272c;
import java.util.List;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.form.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28166c implements InterfaceC28164a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C28169f f57415a;

    @Override // com.sumsub.sns.core.presentation.form.InterfaceC28164a
    /* JADX INFO: renamed from: a */
    public final void mo69091a(AbstractC28841e0 abstractC28841e0, List list) {
        C28169f c28169f = this.f57415a;
        if (c28169f.f57432k || (abstractC28841e0 instanceof C28811E)) {
            return;
        }
        Logger.DefaultImpls.v$default(C33272c.f67812a, c28169f.m69113c(), "onValuesChanged: " + abstractC28841e0.m69653j() + " -> " + list, null, 4, null);
        InterfaceC28804k interfaceC28804kM69106a = this.f57415a.m69106a();
        if (interfaceC28804kM69106a != null) {
            interfaceC28804kM69106a.mo69619a(abstractC28841e0, list);
        }
        this.f57415a.m69114d();
    }

    @Override // com.sumsub.sns.core.presentation.form.InterfaceC28164a
    /* JADX INFO: renamed from: b */
    public final void mo69093b(AbstractC28841e0 abstractC28841e0) {
    }

    public C28166c(C28169f c28169f) {
        this.f57415a = c28169f;
    }

    @Override // com.sumsub.sns.core.presentation.form.InterfaceC28164a
    /* JADX INFO: renamed from: b */
    public final void mo69094b(AbstractC28841e0 abstractC28841e0, String str) {
        C33272c c33272c = C33272c.f67812a;
        C28169f c28169f = this.f57415a;
        C28165b c28165b = C28169f.f57420o;
        Logger.DefaultImpls.v$default(c33272c, c28169f.m69113c(), "onLinkClick: " + AbstractC28178b.m69118a(abstractC28841e0) + " -> " + str, null, 4, null);
        InterfaceC28804k interfaceC28804kM69106a = this.f57415a.m69106a();
        if (interfaceC28804kM69106a == null || !interfaceC28804kM69106a.mo69621a(str)) {
            AbstractC28392F.m69277a(this.f57415a, str);
        }
    }

    @Override // com.sumsub.sns.core.presentation.form.InterfaceC28164a
    /* JADX INFO: renamed from: c */
    public final void mo69095c(AbstractC28841e0 abstractC28841e0, String str) {
        C28169f c28169f = this.f57415a;
        if (c28169f.f57432k) {
            return;
        }
        Logger.DefaultImpls.v$default(C33272c.f67812a, c28169f.m69113c(), "onValueChanged: " + abstractC28841e0.m69653j() + " -> " + str, null, 4, null);
        C28169f c28169f2 = this.f57415a;
        c28169f2.f57430i = AbstractC28458h.m69338a(c28169f2.f57430i, AbstractC28178b.m69118a(abstractC28841e0), (String) null);
        if (abstractC28841e0 instanceof C28811E) {
            return;
        }
        InterfaceC28804k interfaceC28804kM69106a = this.f57415a.m69106a();
        if (interfaceC28804kM69106a != null) {
            interfaceC28804kM69106a.mo69623b(abstractC28841e0, str);
        }
        this.f57415a.m69114d();
    }

    @Override // com.sumsub.sns.core.presentation.form.InterfaceC28171h
    /* JADX INFO: renamed from: a */
    public final void mo69097a(AbstractC28841e0 abstractC28841e0, View view) {
        C28169f c28169f = this.f57415a;
        C28165b c28165b = C28169f.f57420o;
        ActivityResultCaller parentFragment = c28169f.getParentFragment();
        InterfaceC28171h interfaceC28171h = parentFragment instanceof InterfaceC28171h ? (InterfaceC28171h) parentFragment : null;
        if (interfaceC28171h != null) {
            interfaceC28171h.mo69097a(abstractC28841e0, view);
            return;
        }
        FieldId fieldIdM69118a = AbstractC28178b.m69118a(abstractC28841e0);
        Logger.DefaultImpls.v$default(C33272c.f67812a, this.f57415a.m69113c(), "onPickFileClick: " + fieldIdM69118a, null, 4, null);
        AbstractC46162a abstractC46162aM69286a = AbstractC28400J.m69286a(C28468k0.f57988f);
        abstractC46162aM69286a.getSerializersModule();
        String strMo99409b = abstractC46162aM69286a.mo99409b(FieldId.Companion.serializer(), fieldIdM69118a);
        C28710y c28710y = this.f57415a.f57426e;
        if (c28710y != null) {
            c28710y.m69536a(strMo99409b);
        }
    }

    @Override // com.sumsub.sns.core.presentation.form.InterfaceC28164a
    /* JADX INFO: renamed from: a */
    public final void mo69090a(AbstractC28841e0 abstractC28841e0, String str) {
        C33272c c33272c = C33272c.f67812a;
        C28169f c28169f = this.f57415a;
        C28165b c28165b = C28169f.f57420o;
        Logger.DefaultImpls.v$default(c33272c, c28169f.m69113c(), "onDeleteFileClick: " + abstractC28841e0 + " -> " + str, null, 4, null);
        InterfaceC28804k interfaceC28804kM69106a = this.f57415a.m69106a();
        if (interfaceC28804kM69106a != null) {
            interfaceC28804kM69106a.mo69618a(abstractC28841e0, str);
        }
    }

    @Override // com.sumsub.sns.core.presentation.form.InterfaceC28164a
    /* JADX INFO: renamed from: a */
    public final void mo69089a(AbstractC28841e0 abstractC28841e0) {
        C33272c c33272c = C33272c.f67812a;
        C28169f c28169f = this.f57415a;
        C28165b c28165b = C28169f.f57420o;
        Logger.DefaultImpls.v$default(c33272c, c28169f.m69113c(), "onFieldClick: " + abstractC28841e0, null, 4, null);
        InterfaceC28804k interfaceC28804kM69106a = this.f57415a.m69106a();
        if (interfaceC28804kM69106a != null) {
            interfaceC28804kM69106a.mo69617a(abstractC28841e0);
        }
    }

    @Override // com.sumsub.sns.core.presentation.form.InterfaceC28164a
    /* JADX INFO: renamed from: a */
    public final void mo69092a(C28850j c28850j) {
        C33272c c33272c = C33272c.f67812a;
        C28169f c28169f = this.f57415a;
        C28165b c28165b = C28169f.f57420o;
        Logger.DefaultImpls.v$default(c33272c, c28169f.m69113c(), "onAction: " + c28850j, null, 4, null);
        InterfaceC28804k interfaceC28804kM69106a = this.f57415a.m69106a();
        if (interfaceC28804kM69106a != null) {
            interfaceC28804kM69106a.mo69620a(c28850j);
        }
    }
}
