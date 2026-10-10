package jumio.core;

import com.jumio.core.network.ByteArrayDownloadTask;
import com.jumio.core.network.C9307a;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: jumio.core.r */
/* JADX INFO: loaded from: classes61.dex */
public final class C40717r extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Closeable f90368a;

    /* JADX INFO: renamed from: b */
    public InputStream f90369b;

    /* JADX INFO: renamed from: c */
    public ByteArrayDownloadTask f90370c;

    /* JADX INFO: renamed from: d */
    public ByteArrayOutputStream f90371d;

    /* JADX INFO: renamed from: e */
    public byte[] f90372e;

    /* JADX INFO: renamed from: f */
    public Ref.IntRef f90373f;

    /* JADX INFO: renamed from: g */
    public Ref.IntRef f90374g;

    /* JADX INFO: renamed from: h */
    public int f90375h;

    /* JADX INFO: renamed from: i */
    public int f90376i;

    /* JADX INFO: renamed from: j */
    public int f90377j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InputStream f90378k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ByteArrayDownloadTask f90379l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f90380m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40717r(InputStream inputStream, ByteArrayDownloadTask byteArrayDownloadTask, int i11, Continuation continuation) {
        super(2, continuation);
        this.f90378k = inputStream;
        this.f90379l = byteArrayDownloadTask;
        this.f90380m = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40717r(this.f90378k, this.f90379l, this.f90380m, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C40717r) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        ByteArrayDownloadTask byteArrayDownloadTask;
        int i11;
        Closeable closeable;
        byte[] bArr;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        int i12;
        AbstractC41697j0 f14418c;
        C9307a c9307a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f90377j;
        if (i13 != 0) {
            if (i13 == 1) {
                i12 = this.f90376i;
                i11 = this.f90375h;
                intRef2 = this.f90374g;
                intRef = this.f90373f;
                bArr = this.f90372e;
                byteArrayOutputStream = this.f90371d;
                byteArrayDownloadTask = this.f90370c;
                inputStream = this.f90369b;
                closeable = this.f90368a;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(closeable, th);
                        throw th3;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = this.f90378k;
            byteArrayDownloadTask = this.f90379l;
            i11 = this.f90380m;
            try {
                bArr = new byte[1024];
                intRef = new Ref.IntRef();
                intRef2 = new Ref.IntRef();
                i12 = 0;
                closeable = byteArrayOutputStream;
            } catch (Throwable th4) {
                th = th4;
                closeable = byteArrayOutputStream;
                throw th;
            }
        }
        do {
            int i14 = inputStream.read(bArr);
            intRef.element = i14;
            if (i14 > 0) {
                byteArrayOutputStream.write(bArr, 0, i14);
                intRef2.element += intRef.element;
                f14418c = byteArrayDownloadTask.getF14418c();
                c9307a = new C9307a(byteArrayDownloadTask, intRef2, i11, null);
                this.f90368a = closeable;
                this.f90369b = inputStream;
                this.f90370c = byteArrayDownloadTask;
                this.f90371d = byteArrayOutputStream;
                this.f90372e = bArr;
                this.f90373f = intRef;
                this.f90374g = intRef2;
                this.f90375h = i11;
                this.f90376i = i12;
                this.f90377j = 1;
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                CloseableKt.closeFinally(closeable, null);
                return byteArray;
            }
        } while (C41686h.m91049g(f14418c, c9307a, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
