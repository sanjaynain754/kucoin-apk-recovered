package com.sumsub.sns.internal.features.domain.esign;

import com.sumsub.sns.core.data.model.SNSGeneralException;
import com.sumsub.sns.internal.core.common.AbstractC28405L0;
import com.sumsub.sns.internal.features.data.repository.applicant.C29950z;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.esign.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30167d extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public File f60620a;

    /* JADX INFO: renamed from: b */
    public int f60621b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ File f60622c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f60623d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC29921d f60624e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f60625f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30167d(File file, String str, InterfaceC29921d interfaceC29921d, int i11, Continuation continuation) {
        super(2, continuation);
        this.f60622c = file;
        this.f60623d = str;
        this.f60624e = interfaceC29921d;
        this.f60625f = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30167d(this.f60622c, this.f60623d, this.f60624e, this.f60625f, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30167d) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws SNSGeneralException, IOException {
        File file;
        Object objM103844constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f60621b;
        if (i11 != 0) {
            if (i11 == 1) {
                file = this.f60620a;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.f60622c.mkdirs();
            File file2 = new File(this.f60622c, this.f60623d);
            InterfaceC29921d interfaceC29921d = this.f60624e;
            int i12 = this.f60625f;
            this.f60620a = file2;
            this.f60621b = 1;
            Object objM70019b = ((C29950z) interfaceC29921d).m70019b(i12, this);
            if (objM70019b == coroutine_suspended) {
                return coroutine_suspended;
            }
            file = file2;
            obj = objM70019b;
        }
        if (AbstractC28405L0.m69293a(new ByteArrayInputStream((byte[]) obj), new FileOutputStream(file))) {
            objM103844constructorimpl = Result.m103844constructorimpl(file);
        } else {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(new SNSGeneralException("Error saving file", null, null, 6, null)));
        }
        return Result.m103843boximpl(objM103844constructorimpl);
    }
}
