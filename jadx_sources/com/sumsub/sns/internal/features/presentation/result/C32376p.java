package com.sumsub.sns.internal.features.presentation.result;

import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.result.p */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32376p extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public String f65957a;

    /* JADX INFO: renamed from: b */
    public int f65958b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f65959c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32377q f65960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32376p(C32377q c32377q, Continuation continuation) {
        super(2, continuation);
        this.f65960d = c32377q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32376p c32376p = new C32376p(this.f65960d, continuation);
        c32376p.f65959c = obj;
        return c32376p;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32376p c32376p = new C32376p(this.f65960d, (Continuation) obj2);
        c32376p.f65959c = (InterfaceC41635f) obj;
        return c32376p.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (r10 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        if (r4.emit(r7, r9) == r0) goto L40;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41635f interfaceC41635f;
        String imageName;
        String str;
        C32371k c32371k;
        String str2;
        int i11;
        SNSStepState sNSStepState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f65958b;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                str = this.f65957a;
                interfaceC41635f = (InterfaceC41635f) this.f65959c;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        interfaceC41635f = (InterfaceC41635f) this.f65959c;
        int i13 = AbstractC32378r.f65962a[this.f65960d.m71105e().f65938a.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                imageName = SNSIconHandler.SNSResultIcons.SUCCESS.getImageName();
            } else {
                imageName = SNSIconHandler.SNSResultIcons.FAILURE.getImageName();
            }
        } else {
            imageName = SNSIconHandler.SNSResultIcons.SUBMITTED.getImageName();
        }
        str = imageName;
        C32371k c32371k2 = this.f65960d.m71105e().f65941d;
        if (c32371k2 == null || (str = c32371k2.f65948a) == null) {
            C32377q c32377q = this.f65960d;
            String strM71106a = AbstractC32379s.m71106a(c32377q.m71105e());
            this.f65959c = interfaceC41635f;
            this.f65957a = str;
            this.f65958b = 1;
            obj = c32377q.getString(strM71106a, this);
        } else {
            c32371k = this.f65960d.m71105e().f65941d;
            if (c32371k != null) {
                str2 = c32371k.f65949b;
            } else {
                str2 = null;
            }
            i11 = AbstractC32378r.f65962a[this.f65960d.m71105e().f65938a.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        sNSStepState = SNSStepState.APPROVED;
                    } else {
                        sNSStepState = SNSStepState.PROCESSING;
                    }
                } else {
                    sNSStepState = SNSStepState.REJECTED;
                }
            } else {
                sNSStepState = SNSStepState.PENDING;
            }
            C32374n c32374n = new C32374n(str, str, str2, sNSStepState);
            this.f65959c = null;
            this.f65957a = null;
            this.f65958b = 2;
        }
        return coroutine_suspended;
        String str3 = (String) obj;
        c32371k = this.f65960d.m71105e().f65941d;
        if (c32371k != null) {
            str2 = c32371k.f65949b;
        } else {
            str2 = null;
        }
        i11 = AbstractC32378r.f65962a[this.f65960d.m71105e().f65938a.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    sNSStepState = SNSStepState.APPROVED;
                } else {
                    sNSStepState = SNSStepState.PROCESSING;
                }
            } else {
                sNSStepState = SNSStepState.REJECTED;
            }
        } else {
            sNSStepState = SNSStepState.PENDING;
        }
        C32374n c32374n2 = new C32374n(str, str3, str2, sNSStepState);
        this.f65959c = null;
        this.f65957a = null;
        this.f65958b = 2;
    }
}
