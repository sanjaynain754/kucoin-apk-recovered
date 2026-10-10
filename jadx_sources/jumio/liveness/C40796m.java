package jumio.liveness;

import com.jumio.analytics.Analytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.log.Log;
import com.jumio.core.MobileContext;
import com.jumio.core.cdn.CDNDecryptException;
import com.jumio.core.data.ScanMode;
import com.jumio.core.environment.Environment;
import com.jumio.core.extraction.ExtractionUpdateInterface;
import com.jumio.core.extraction.liveness.extraction.LivenessUpdateState;
import com.jumio.liveness.DaClient2;
import com.jumio.liveness.LivenessUX;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.liveness.m */
/* JADX INFO: loaded from: classes61.dex */
public final class C40796m extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40797n f90624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40773B f90625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C40808y f90626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40796m(C40797n c40797n, C40773B c40773b, C40808y c40808y, Continuation continuation) {
        super(2, continuation);
        this.f90624a = c40797n;
        this.f90625b = c40773b;
        this.f90626c = c40808y;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C40796m(this.f90624a, this.f90625b, this.f90626c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C40796m) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            C40797n c40797n = this.f90624a;
            C40773B c40773b = this.f90625b;
            c40797n.m89288a(c40773b.f90568a, c40773b.f90570c);
            MobileContext context = this.f90625b.f90568a;
            Intrinsics.checkNotNullParameter(context, "context");
            Environment.INSTANCE.loadDaClientLib(context, true);
            DaClient2.EventView.INSTANCE.getClass();
            C40797n c40797n2 = this.f90624a;
            Object obj2 = c40797n2.f90634h;
            C40773B c40773b2 = this.f90625b;
            synchronized (obj2) {
                try {
                    DaClient2.Companion companion = DaClient2.INSTANCE;
                    if (c40773b2.f90573f == ScanMode.JUMIO_PREMIUM) {
                        str2 = "premium";
                    } else {
                        str2 = "standard";
                    }
                    DaClient2 daClient2Create = companion.create(new DaClient2.Config(str2, c40773b2.f90572e, c40773b2.f90569b.getConfigOverride()));
                    if (daClient2Create != null) {
                        daClient2Create.setEventHandler(c40797n2.f90636j);
                        daClient2Create.start();
                    } else {
                        daClient2Create = null;
                    }
                    c40797n2.f90628b = daClient2Create;
                    c40797n2.m89289a(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, LivenessUpdateState.INSTANCE.getAttachClient(), TuplesKt.m90091to(c40797n2.f90628b, c40797n2.f90636j), null, 4, null));
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C40797n c40797n3 = this.f90624a;
            Object obj3 = c40797n3.f90635i;
            C40773B c40773b3 = this.f90625b;
            synchronized (obj3) {
                LivenessUX livenessUXCreate = LivenessUX.INSTANCE.create(AbstractC40799p.m89297a(c40773b3));
                livenessUXCreate.setEventHandler(c40797n3.f90637k);
                livenessUXCreate.run(c40797n3);
                c40797n3.f90629c = livenessUXCreate;
            }
        } catch (Exception e11) {
            Log.m14484w("DefaultDaClient", "Failed to start liveness!");
            if (e11 instanceof CDNDecryptException) {
                str = "livenessAssetsDecryptionFailed";
            } else {
                str = "livenessInitFailed";
            }
            Analytics.INSTANCE.add(MobileEvents.misc$default(str, null, 2, null));
            new C40805v(this.f90626c.f90651a).invoke(e11);
        }
        return Unit.INSTANCE;
    }
}
