package com.sumsub.sns.internal.core.common;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.A0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28383A0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57868a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bitmap f57869b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f57870c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f57871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28383A0(Bitmap bitmap, String str, Context context, Continuation continuation) {
        super(2, continuation);
        this.f57869b = bitmap;
        this.f57870c = str;
        this.f57871d = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28383A0(this.f57869b, this.f57870c, this.f57871d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28383A0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57868a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Bitmap bitmap = this.f57869b;
            this.f57868a = 1;
            obj = C41686h.m91049g(C41782z0.m91392b(), new C28507x0(bitmap, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        InputStream inputStream = (InputStream) obj;
        if (inputStream == null) {
            return null;
        }
        try {
            File fileCreateTempFile = File.createTempFile(this.f57870c, ".jpg", this.f57871d.getCacheDir());
            if (!AbstractC28405L0.m69293a(inputStream, new FileOutputStream(fileCreateTempFile))) {
                return null;
            }
            return fileCreateTempFile;
        } catch (IOException unused) {
        }
    }
}
