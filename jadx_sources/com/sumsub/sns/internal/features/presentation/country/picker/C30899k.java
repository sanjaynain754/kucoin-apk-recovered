package com.sumsub.sns.internal.features.presentation.country.picker;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.country.picker.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30899k implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC41635f f62422a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CountryPickerDialog f62423b;

    public C30899k(InterfaceC41635f interfaceC41635f, CountryPickerDialog countryPickerDialog) {
        this.f62422a = interfaceC41635f;
        this.f62423b = countryPickerDialog;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[PHI: r6
      0x00ab: PHI (r6v6 kotlinx.coroutines.flow.f) = (r6v5 kotlinx.coroutines.flow.f), (r6v8 kotlinx.coroutines.flow.f) binds: [B:28:0x007d, B:36:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r1 == r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (r6.emit(r1, r2) == r3) goto L40;
     */
    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C30898j c30898j;
        InterfaceC41635f interfaceC41635f;
        int i11;
        InterfaceC41635f interfaceC41635f2;
        C29983l c29983l;
        String strM70061a;
        String strReplace$default;
        if (continuation instanceof C30898j) {
            c30898j = (C30898j) continuation;
            int i12 = c30898j.f62418b;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c30898j.f62418b = i12 - Integer.MIN_VALUE;
            } else {
                c30898j = new C30898j(this, continuation);
            }
        } else {
            c30898j = new C30898j(this, continuation);
        }
        Object objM70480a = c30898j.f62417a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = c30898j.f62418b;
        if (i13 != 0) {
            if (i13 == 1) {
                i11 = c30898j.f62421e;
                interfaceC41635f2 = c30898j.f62419c;
                ResultKt.throwOnFailure(objM70480a);
                c29983l = (C29983l) objM70480a;
                if (c29983l != null) {
                    strM70061a = c29983l.m70061a("sns_countries_action_selectMultiple");
                } else {
                    strM70061a = null;
                }
                if (strM70061a != null) {
                    strReplace$default = StringsKt.replace$default(strM70061a, "{count}", String.valueOf(i11), false, 4, (Object) null);
                } else {
                    strReplace$default = null;
                }
                c30898j.f62419c = null;
                c30898j.f62418b = 3;
            } else if (i13 == 2) {
                interfaceC41635f = c30898j.f62419c;
                ResultKt.throwOnFailure(objM70480a);
                C29983l c29983l2 = (C29983l) objM70480a;
                if (c29983l2 != null) {
                    strReplace$default = c29983l2.m70061a("sns_countries_action_selectNothing");
                    interfaceC41635f2 = interfaceC41635f;
                } else {
                    interfaceC41635f2 = interfaceC41635f;
                    strReplace$default = null;
                }
                c30898j.f62419c = null;
                c30898j.f62418b = 3;
            } else {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM70480a);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objM70480a);
        interfaceC41635f = this.f62422a;
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue > 0) {
            CountryPickerDialog countryPickerDialog = this.f62423b;
            c30898j.f62419c = interfaceC41635f;
            c30898j.f62421e = iIntValue;
            c30898j.f62418b = 1;
            int i14 = CountryPickerDialog.f62384U;
            Object objM70480a2 = countryPickerDialog.m70480a(c30898j);
            if (objM70480a2 != coroutine_suspended) {
                i11 = iIntValue;
                objM70480a = objM70480a2;
                interfaceC41635f2 = interfaceC41635f;
                c29983l = (C29983l) objM70480a;
                if (c29983l != null) {
                    strM70061a = c29983l.m70061a("sns_countries_action_selectMultiple");
                } else {
                    strM70061a = null;
                }
                if (strM70061a != null) {
                    strReplace$default = StringsKt.replace$default(strM70061a, "{count}", String.valueOf(i11), false, 4, (Object) null);
                } else {
                    strReplace$default = null;
                }
                c30898j.f62419c = null;
                c30898j.f62418b = 3;
            }
        } else {
            CountryPickerDialog countryPickerDialog2 = this.f62423b;
            c30898j.f62419c = interfaceC41635f;
            c30898j.f62418b = 2;
            int i15 = CountryPickerDialog.f62384U;
            objM70480a = countryPickerDialog2.m70480a(c30898j);
        }
        return coroutine_suspended;
    }
}
