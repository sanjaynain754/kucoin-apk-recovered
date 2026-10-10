package jumio.liveness;

import android.content.Context;
import com.jumio.commons.log.Log;
import com.jumio.core.camera.CameraDataSettingsModel;
import com.jumio.core.environment.Environment;
import com.jumio.liveness.DaClient2;
import com.jumio.liveness.StandaloneCameraData;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.L */
/* JADX INFO: loaded from: classes61.dex */
public final class C40783L extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ StandaloneCameraData f90598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f90599b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CameraDataSettingsModel f90600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40783L(StandaloneCameraData standaloneCameraData, Context context, CameraDataSettingsModel cameraDataSettingsModel, Continuation continuation) {
        super(2, continuation);
        this.f90598a = standaloneCameraData;
        this.f90599b = context;
        this.f90600c = cameraDataSettingsModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40783L(this.f90598a, this.f90599b, this.f90600c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C40783L) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        DaClient2 daClient2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object f14602c = this.f90598a.getF14602c();
        Context context = this.f90599b;
        CameraDataSettingsModel cameraDataSettingsModel = this.f90600c;
        StandaloneCameraData standaloneCameraData = this.f90598a;
        synchronized (f14602c) {
            try {
                try {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Environment.INSTANCE.loadDaClientLib(context, true);
                    DaClient2.EventView.INSTANCE.getClass();
                    DaClient2 daClient2Create = DaClient2.INSTANCE.create(new DaClient2.Config("id_liveness", null, AbstractC40785b.m89282a(cameraDataSettingsModel), 2, null));
                    if (daClient2Create != null) {
                        daClient2Create.setEventHandler(standaloneCameraData);
                        daClient2 = daClient2Create;
                    } else {
                        daClient2 = null;
                    }
                    standaloneCameraData.setDaClient(daClient2);
                } catch (Exception e11) {
                    Log.printStackTrace(e11);
                }
                unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return unit;
    }
}
