package com.sumsub.sns.internal.features.presentation.esign;

import com.sumsub.sns.internal.features.data.model.esign.C29748U;
import com.sumsub.sns.internal.features.data.model.esign.C29752Y;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.domain.esign.C30168e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.e0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30980e0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Object f62600a;

    /* JADX INFO: renamed from: b */
    public int f62601b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f62602c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C30997n0 f62603d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30980e0(int i11, C30997n0 c30997n0, Continuation continuation) {
        super(2, continuation);
        this.f62602c = i11;
        this.f62603d = c30997n0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30980e0(this.f62602c, this.f62603d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30980e0(this.f62602c, this.f62603d, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:60:0x0124  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fa, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(500, r11) == r0) goto L49;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00bd, please report this as an issue */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        C30980e0 c30980e0;
        Object objM70127a;
        Object next;
        String str2;
        Object obj2;
        C30997n0 c30997n0;
        int i11;
        C30997n0 c30997n1;
        int i12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f62601b;
        Object obj3 = null;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    obj2 = this.f62600a;
                    ResultKt.throwOnFailure(obj);
                    c30980e0 = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                objM70127a = ((Result) obj).getValue();
                c30980e0 = this;
            }
            c30997n0 = c30980e0.f62603d;
            i11 = c30980e0.f62602c;
            if (Result.m103851isSuccessimpl(obj2)) {
                if (!Result.m103850isFailureimpl(obj2)) {
                    obj3 = obj2;
                }
                KProperty[] kPropertyArr = C30997n0.f62640t;
                c30997n0.m70547a(i11, (File) obj3);
            }
            c30997n1 = c30980e0.f62603d;
            i12 = c30980e0.f62602c;
            if (Result.m103847exceptionOrNullimpl(obj2) != null) {
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(obj2);
                KProperty[] kPropertyArr2 = C30997n0.f62640t;
                c30997n1.m70548a(i12, thM103847exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C33272c.f67816e.f67810a.mo68955d("SNSESignViewModel", "onDocumentClick: downloading " + this.f62602c, null);
        C29752Y c29752y = this.f62603d.f62653m;
        if (c29752y == null) {
            return Unit.INSTANCE;
        }
        List list = c29752y.f59828d;
        if (list != null) {
            int i14 = this.f62602c;
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    Integer num = ((C29748U) next).f59819b;
                    if (num != null && num.intValue() == i14) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C29748U c29748u = (C29748U) next;
            if (c29748u != null && (str2 = c29748u.f59820c) != null) {
                StringBuilder sb2 = new StringBuilder();
                int length = str2.length();
                for (int i15 = 0; i15 < length; i15++) {
                    char cCharAt = str2.charAt(i15);
                    if (Character.isLetterOrDigit(cCharAt)) {
                        sb2.append(cCharAt);
                    }
                }
                String string = sb2.toString();
                if (string != null) {
                    str = "esign_" + string + ".pdf";
                    if (str == null) {
                        str = "esign_" + System.currentTimeMillis() + ".pdf";
                    }
                } else {
                    str = "esign_" + System.currentTimeMillis() + ".pdf";
                }
            } else {
                str = "esign_" + System.currentTimeMillis() + ".pdf";
            }
        } else {
            str = "esign_" + System.currentTimeMillis() + ".pdf";
        }
        String str3 = str;
        C30997n0 c30997n2 = this.f62603d;
        C30168e c30168e = c30997n2.f62647g;
        File file = c30997n2.f62643c;
        InterfaceC29921d interfaceC29921d = c30997n2.f62642b;
        int i16 = this.f62602c;
        this.f62601b = 1;
        c30980e0 = this;
        objM70127a = c30168e.m70127a(file, interfaceC29921d, i16, str3, c30980e0);
        if (objM70127a != coroutine_suspended) {
        }
        return coroutine_suspended;
        if (C33048a.f67456S.m71434a()) {
            c30980e0.f62600a = objM70127a;
            c30980e0.f62601b = 2;
        }
        obj2 = objM70127a;
        c30997n0 = c30980e0.f62603d;
        i11 = c30980e0.f62602c;
        if (Result.m103851isSuccessimpl(obj2)) {
            if (!Result.m103850isFailureimpl(obj2)) {
                obj3 = obj2;
            }
            KProperty[] kPropertyArr3 = C30997n0.f62640t;
            c30997n0.m70547a(i11, (File) obj3);
        }
        c30997n1 = c30980e0.f62603d;
        i12 = c30980e0.f62602c;
        if (Result.m103847exceptionOrNullimpl(obj2) != null) {
            Throwable thM103847exceptionOrNullimpl2 = Result.m103847exceptionOrNullimpl(obj2);
            KProperty[] kPropertyArr4 = C30997n0.f62640t;
            c30997n1.m70548a(i12, thM103847exceptionOrNullimpl2);
        }
        return Unit.INSTANCE;
    }
}
