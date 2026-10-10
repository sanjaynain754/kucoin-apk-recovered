package jumio.liveness;

import com.jumio.liveness.CameraData;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.liveness.a */
/* JADX INFO: loaded from: classes61.dex */
public final class C40784a extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f90601a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f90602b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CameraData f90603c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40784a(CameraData cameraData, Continuation continuation) {
        super(2, continuation);
        this.f90603c = cameraData;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C40784a c40784a = new C40784a(this.f90603c, continuation);
        c40784a.f90602b = obj;
        return c40784a;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C40784a c40784a = new C40784a(this.f90603c, (Continuation) obj2);
        c40784a.f90602b = (InterfaceC41709m0) obj;
        return c40784a.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0030 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002e -> B:14:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f90602b
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.InterfaceC41709m0) r0
            java.lang.Object r1 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r6.f90601a
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 != r3) goto L13
            p852kotlin.ResultKt.throwOnFailure(r7)
            goto L31
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            p852kotlin.ResultKt.throwOnFailure(r7)
        L1e:
            boolean r7 = kotlinx.coroutines.C41713n0.m91132h(r0)
            if (r7 == 0) goto L37
            r6.f90602b = r0
            r6.f90601a = r3
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.m90350b(r4, r6)
            if (r7 != r1) goto L31
            return r1
        L31:
            com.jumio.liveness.CameraData r7 = r6.f90603c
            com.jumio.liveness.CameraData.access$requestData(r7)
            goto L1e
        L37:
            kotlin.Unit r7 = p852kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jumio.liveness.C40784a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
