package com.sumsub.sns.internal.features.presentation.restrictions;

import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29586o0;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.restrictions.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32356v implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f65925a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28075O f65926b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32333C f65927c;

    public C32356v(InterfaceC41635f interfaceC41635f, C28075O c28075o, C32333C c32333c) {
        this.f65925a = interfaceC41635f;
        this.f65926b = c28075o;
        this.f65927c = c32333c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        C32355u c32355u;
        SNSIconHandler.SNSRestrictionsIcons sNSRestrictionsIcons;
        C32349o c32349o;
        if (continuation instanceof C32355u) {
            c32355u = (C32355u) continuation;
            int i11 = c32355u.f65923b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32355u.f65923b = i11 - Integer.MIN_VALUE;
            } else {
                c32355u = new C32355u(this, continuation);
            }
        } else {
            c32355u = new C32355u(this, continuation);
        }
        Object obj2 = c32355u.f65922a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32355u.f65923b;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj2);
            InterfaceC41635f interfaceC41635f = this.f65925a;
            C29586o0 c29586o0 = (C29586o0) obj;
            C32353s c32353s = null;
            if (c29586o0 != null) {
                C28075O c28075o = this.f65926b;
                C29983l c29983l = c28075o.f57271c;
                if (c29983l == null) {
                    AbstractC28052C.throwError$default(this.f65927c, new IllegalStateException("No strings provided"), "Status", null, 4, null);
                } else {
                    C29124h c29124h = c28075o.f57270b;
                    if (c29124h == null) {
                        AbstractC28052C.throwError$default(this.f65927c, new IllegalStateException("No config provided"), "Status", null, 4, null);
                    } else {
                        C32333C c32333c = this.f65927c;
                        int i13 = C32333C.f65885V;
                        String str = c29586o0.f59609a;
                        if (str == null) {
                            str = "";
                        }
                        CharSequence charSequenceM71099a = c32333c.m71099a(c29124h, "restrictions.%s.title", str);
                        String str2 = c29586o0.f59609a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        CharSequence charSequenceM71099a2 = c32333c.m71099a(c29124h, "restrictions.%s.subtitle", str2);
                        String str3 = c29586o0.f59609a;
                        if (Intrinsics.areEqual(str3, "vpn")) {
                            sNSRestrictionsIcons = SNSIconHandler.SNSRestrictionsIcons.VPN;
                        } else {
                            sNSRestrictionsIcons = Intrinsics.areEqual(str3, "country") ? SNSIconHandler.SNSRestrictionsIcons.DEFAULT : SNSIconHandler.SNSRestrictionsIcons.DEFAULT;
                        }
                        if (Intrinsics.areEqual(c29586o0.f59610b, Boolean.TRUE)) {
                            String strM70061a = c29983l.m70061a("sns_restrictions_action_reload");
                            c32349o = new C32349o(strM70061a != null ? strM70061a : "", C32351q.f65917a);
                        } else {
                            String strM70061a2 = c29983l.m70061a("sns_restrictions_action_close");
                            c32349o = new C32349o(strM70061a2 != null ? strM70061a2 : "", C32350p.f65916a);
                        }
                        c32353s = new C32353s(charSequenceM71099a, charSequenceM71099a2, sNSRestrictionsIcons, c32349o);
                    }
                }
            }
            if (c32353s != null) {
                c32355u.f65923b = 1;
                if (interfaceC41635f.emit(c32353s, c32355u) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj2);
        }
        return Unit.INSTANCE;
    }
}
