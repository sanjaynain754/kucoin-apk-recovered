package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.util.Map;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function4;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.L0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31581L0 extends SuspendLambda implements Function4 {

    /* JADX INFO: renamed from: a */
    public String f64130a;

    /* JADX INFO: renamed from: b */
    public int f64131b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ AbstractC31640o0 f64132c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Integer f64133d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ String f64134e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C31583M0 f64135f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31581L0(C31583M0 c31583m0, Continuation continuation) {
        super(4, continuation);
        this.f64135f = c31583m0;
    }

    @Override // p852kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C31581L0 c31581l0 = new C31581L0(this.f64135f, (Continuation) obj4);
        c31581l0.f64132c = (AbstractC31640o0) obj;
        c31581l0.f64133d = (Integer) obj2;
        c31581l0.f64134e = (String) obj3;
        return c31581l0.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:32:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    /* JADX WARN: Code duplicated, block: B:37:0x012e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0136  */
    /* JADX WARN: Code duplicated, block: B:41:0x0159  */
    /* JADX WARN: Code duplicated, block: B:43:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0164  */
    /* JADX WARN: Code duplicated, block: B:48:0x0184 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0186  */
    /* JADX WARN: Code duplicated, block: B:51:0x018e  */
    /* JADX WARN: Code duplicated, block: B:53:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:66:0x0221  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer num;
        Object string;
        AbstractC31640o0 abstractC31640o0;
        String str;
        Object strings;
        String str2;
        Integer num2;
        AbstractC31640o0 abstractC31640o1;
        C29983l c29983l;
        C31629j c31629j;
        boolean z11;
        Map mapEmptyMap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64131b;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC31640o0 abstractC31640o2 = this.f64132c;
            num = this.f64133d;
            String str3 = this.f64134e;
            C31583M0 c31583m0 = this.f64135f;
            this.f64132c = abstractC31640o2;
            this.f64133d = num;
            this.f64134e = str3;
            this.f64131b = 1;
            string = c31583m0.getString("sns_eid_nfcScan_hint_searching", this);
            if (string != coroutine_suspended) {
                abstractC31640o0 = abstractC31640o2;
                str = str3;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            str = this.f64134e;
            Integer num3 = this.f64133d;
            AbstractC31640o0 abstractC31640o3 = this.f64132c;
            ResultKt.throwOnFailure(obj);
            abstractC31640o0 = abstractC31640o3;
            num = num3;
            string = obj;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = this.f64130a;
            str = this.f64134e;
            Integer num4 = this.f64133d;
            abstractC31640o1 = this.f64132c;
            ResultKt.throwOnFailure(obj);
            num2 = num4;
            strings = obj;
        }
        c29983l = (C29983l) strings;
        Screen screenM70760a = C31583M0.m70760a(abstractC31640o1);
        z11 = abstractC31640o1 instanceof C31602Z;
        if (z11) {
            mapEmptyMap = MapsKt.mapOf(TuplesKt.m90091to("reason", "eidCanRequired"));
        } else {
            mapEmptyMap = MapsKt.emptyMap();
        }
        c31629j = new C31629j(screenM70760a, mapEmptyMap);
        if (Intrinsics.areEqual(abstractC31640o1, C31624h0.f64219a)) {
            return new C31591Q0(c29983l.m70061a("sns_eid_pinSelection_title"), c29983l.m70061a("sns_eid_pinSelection_subtitle"), c29983l.m70061a("sns_eid_pinSelection_action_pinInfo"), c29983l.m70061a("sns_eid_pinSelection_action_proceedToIdent"), c29983l.m70061a("sns_eid_pinSelection_action_changeTransportPin"), c31629j);
        }
        if (Intrinsics.areEqual(abstractC31640o1, C31607b0.f64202a)) {
            return new C31587O0(c29983l.m70061a("sns_eid_identInfo_title"), c29983l.m70061a("sns_eid_identInfo_subtitle"), c29983l.m70061a("sns_eid_identInfo_action_learnMore"), c29983l.m70061a("sns_eid_identInfo_action_continue"), new C31576J(null), c31629j);
        }
        if (Intrinsics.areEqual(abstractC31640o1, C31619f0.f64213a)) {
            if (str != null) {
                str2 = str;
            }
            return new C31592R0(c29983l.m70061a("sns_eid_nfcScan_title"), c29983l.m70061a("sns_eid_nfcScan_subtitle"), str2, null, c29983l.m70061a("sns_alert_action_cancel"), C31644r.f64250a, c29983l.m70061a("sns_mrtdscan2_animation_chip"), c29983l.m70061a("sns_mrtdscan2_animation_phone"), c31629j);
        }
        if (Intrinsics.areEqual(abstractC31640o1, C31613d0.f64206a)) {
            return new C31594S0(c29983l.m70061a("sns_eid_pinChangeSuccess_title"), c29983l.m70061a("sns_eid_pinChangeSuccess_subtitle"), SNSIconHandler.SNSEidIcons.DONE.getImageName(), c29983l.m70061a("sns_eid_pinChangeSuccess_action_continue"), C31565D.f64095a, c31629j);
        }
        if (Intrinsics.areEqual(abstractC31640o1, C31638n0.f64246a)) {
            if (str != null) {
                str2 = str;
            }
            return new C31592R0(c29983l.m70061a("sns_eid_nfcScan_title"), c29983l.m70061a("sns_eid_nfcScan_subtitle"), str2, num2, c29983l.m70061a("sns_alert_action_cancel"), C31650v.f64254a, c29983l.m70061a("sns_mrtdscan2_animation_chip"), c29983l.m70061a("sns_mrtdscan2_animation_phone"), c31629j);
        }
        if (z11) {
            C31602Z c31602z = (C31602Z) abstractC31640o1;
            AbstractC31595T abstractC31595T = c31602z.f64199a;
            return c31602z.f64200b ? new C31585N0(c29983l.m70061a("sns_eid_error_wrongCan_title"), c29983l.m70061a("sns_eid_error_wrongCan_subtitle"), c29983l.m70061a("sns_eid_error_wrongCan_action"), SNSIconHandler.SNSEidIcons.CAN, abstractC31595T, c31629j) : new C31585N0(c29983l.m70061a("sns_eid_canRequired_title"), c29983l.m70061a("sns_eid_canRequired_subtitle"), c29983l.m70061a("sns_eid_canRequired_action"), SNSIconHandler.SNSEidIcons.CAN, abstractC31595T, c31629j);
        }
        if (Intrinsics.areEqual(abstractC31640o1, C31634l0.f64241a)) {
            if (str != null) {
                str2 = str;
            }
            return new C31592R0(c29983l.m70061a("sns_eid_nfcScan_title"), c29983l.m70061a("sns_eid_nfcScan_subtitle"), str2, null, c29983l.m70061a("sns_alert_action_cancel"), C31646t.f64251a, c29983l.m70061a("sns_mrtdscan2_animation_chip"), c29983l.m70061a("sns_mrtdscan2_animation_phone"), c31629j);
        }
        if (Intrinsics.areEqual(abstractC31640o1, C31630j0.f64238a)) {
            return new C31594S0(c29983l.m70061a("sns_eid_unlockSuccess_title"), c29983l.m70061a("sns_eid_unlockSuccess_subtitle"), SNSIconHandler.SNSEidIcons.DONE.getImageName(), c29983l.m70061a("sns_eid_unlockSuccess_action_continue"), C31593S.f64183a, c31629j);
        }
        throw new NoWhenBranchMatchedException();
        String str4 = (String) string;
        C31583M0 c31583m1 = this.f64135f;
        this.f64132c = abstractC31640o0;
        this.f64133d = num;
        this.f64134e = str;
        this.f64130a = str4;
        this.f64131b = 2;
        strings = c31583m1.getStrings(this);
        if (strings != coroutine_suspended) {
            str2 = str4;
            num2 = num;
            abstractC31640o1 = abstractC31640o0;
            c29983l = (C29983l) strings;
            Screen screenM70760a2 = C31583M0.m70760a(abstractC31640o1);
            z11 = abstractC31640o1 instanceof C31602Z;
            if (z11) {
                mapEmptyMap = MapsKt.mapOf(TuplesKt.m90091to("reason", "eidCanRequired"));
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            c31629j = new C31629j(screenM70760a2, mapEmptyMap);
            if (Intrinsics.areEqual(abstractC31640o1, C31624h0.f64219a)) {
                return new C31591Q0(c29983l.m70061a("sns_eid_pinSelection_title"), c29983l.m70061a("sns_eid_pinSelection_subtitle"), c29983l.m70061a("sns_eid_pinSelection_action_pinInfo"), c29983l.m70061a("sns_eid_pinSelection_action_proceedToIdent"), c29983l.m70061a("sns_eid_pinSelection_action_changeTransportPin"), c31629j);
            }
            if (Intrinsics.areEqual(abstractC31640o1, C31607b0.f64202a)) {
                return new C31587O0(c29983l.m70061a("sns_eid_identInfo_title"), c29983l.m70061a("sns_eid_identInfo_subtitle"), c29983l.m70061a("sns_eid_identInfo_action_learnMore"), c29983l.m70061a("sns_eid_identInfo_action_continue"), new C31576J(null), c31629j);
            }
            if (Intrinsics.areEqual(abstractC31640o1, C31619f0.f64213a)) {
                if (str != null) {
                    str2 = str;
                }
                return new C31592R0(c29983l.m70061a("sns_eid_nfcScan_title"), c29983l.m70061a("sns_eid_nfcScan_subtitle"), str2, null, c29983l.m70061a("sns_alert_action_cancel"), C31644r.f64250a, c29983l.m70061a("sns_mrtdscan2_animation_chip"), c29983l.m70061a("sns_mrtdscan2_animation_phone"), c31629j);
            }
            if (Intrinsics.areEqual(abstractC31640o1, C31613d0.f64206a)) {
                return new C31594S0(c29983l.m70061a("sns_eid_pinChangeSuccess_title"), c29983l.m70061a("sns_eid_pinChangeSuccess_subtitle"), SNSIconHandler.SNSEidIcons.DONE.getImageName(), c29983l.m70061a("sns_eid_pinChangeSuccess_action_continue"), C31565D.f64095a, c31629j);
            }
            if (Intrinsics.areEqual(abstractC31640o1, C31638n0.f64246a)) {
                if (str != null) {
                    str2 = str;
                }
                return new C31592R0(c29983l.m70061a("sns_eid_nfcScan_title"), c29983l.m70061a("sns_eid_nfcScan_subtitle"), str2, num2, c29983l.m70061a("sns_alert_action_cancel"), C31650v.f64254a, c29983l.m70061a("sns_mrtdscan2_animation_chip"), c29983l.m70061a("sns_mrtdscan2_animation_phone"), c31629j);
            }
            if (z11) {
                C31602Z c31602z2 = (C31602Z) abstractC31640o1;
                AbstractC31595T abstractC31595T2 = c31602z2.f64199a;
                if (c31602z2.f64200b) {
                }
            }
            if (Intrinsics.areEqual(abstractC31640o1, C31634l0.f64241a)) {
                if (str != null) {
                    str2 = str;
                }
                return new C31592R0(c29983l.m70061a("sns_eid_nfcScan_title"), c29983l.m70061a("sns_eid_nfcScan_subtitle"), str2, null, c29983l.m70061a("sns_alert_action_cancel"), C31646t.f64251a, c29983l.m70061a("sns_mrtdscan2_animation_chip"), c29983l.m70061a("sns_mrtdscan2_animation_phone"), c31629j);
            }
            if (Intrinsics.areEqual(abstractC31640o1, C31630j0.f64238a)) {
                return new C31594S0(c29983l.m70061a("sns_eid_unlockSuccess_title"), c29983l.m70061a("sns_eid_unlockSuccess_subtitle"), SNSIconHandler.SNSEidIcons.DONE.getImageName(), c29983l.m70061a("sns_eid_unlockSuccess_action_continue"), C31593S.f64183a, c31629j);
            }
            throw new NoWhenBranchMatchedException();
        }
        return coroutine_suspended;
    }
}
