package jumio.liveness;

import com.jumio.commons.log.Log;
import com.jumio.commons.log.LogLevel;
import com.jumio.core.data.ScanMode;
import com.jumio.core.data.scan.DataState;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.liveness.extraction.LivenessDataModel;
import com.jumio.core.extraction.liveness.extraction.LivenessUpdateState;
import com.jumio.liveness.DaClient2;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jumio.liveness.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C40791h extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Object f90617a;

    /* JADX INFO: renamed from: b */
    public Object f90618b;

    /* JADX INFO: renamed from: c */
    public int f90619c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C40797n f90620d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ DaClient2.Event f90621e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40791h(C40797n c40797n, DaClient2.Event event, Continuation continuation) {
        super(2, continuation);
        this.f90620d = c40797n;
        this.f90621e = event;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40791h(this.f90620d, this.f90621e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C40791h(this.f90620d, this.f90621e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f90619c;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C40797n c40797n = this.f90620d;
            c40797n.m89289a(c40797n.m89287a());
            this.f90620d.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getLivenessFinished(), null, null, 4, null));
            Log log = Log.INSTANCE;
            LogLevel logLevel = LogLevel.OFF;
            C40773B c40773b = this.f90620d.f90631e;
            if (c40773b == null) {
                return Unit.INSTANCE;
            }
            LivenessDataModel livenessDataModel = new LivenessDataModel();
            C40797n c40797n2 = this.f90620d;
            DaClient2.Event event = this.f90621e;
            ScanMode scanMode = c40773b.f90573f;
            ScanMode scanMode2 = ScanMode.JUMIO_PREMIUM;
            if (scanMode != scanMode2) {
                scanMode2 = ScanMode.JUMIO_LIVENESS;
            }
            livenessDataModel.setType(scanMode2);
            livenessDataModel.setPassed(null);
            synchronized (c40797n2.f90634h) {
                livenessDataModel.setFrames(AbstractC40799p.m89298a(event, c40773b.f90568a, c40797n2.f90639m));
                livenessDataModel.setBlob(AbstractC40799p.m89296a(event, c40773b.f90568a));
                Unit unit = Unit.INSTANCE;
            }
            livenessDataModel.setState(DataState.SAVED);
            AbstractC41697j0 mainDispatcher = this.f90620d.f90627a.getF14549a();
            C40790g c40790g = new C40790g(this.f90620d, livenessDataModel, null);
            this.f90617a = SpillingKt.nullOutSpilledVariable(c40773b);
            this.f90618b = SpillingKt.nullOutSpilledVariable(livenessDataModel);
            this.f90619c = 1;
            if (C41686h.m91049g(mainDispatcher, c40790g, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
