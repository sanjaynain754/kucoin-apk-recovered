package jumio.p381df;

import android.graphics.Bitmap;
import com.jumio.core.camera.CameraConnectionData;
import com.jumio.core.data.document.CornerPoints;
import com.jumio.core.extraction.docfinder.extraction.DocFinderClient;
import com.jumio.core.processor.ProcessorState;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: jumio.df.c */
/* JADX INFO: loaded from: classes61.dex */
public final class C40764c extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Bitmap f90521a;

    /* JADX INFO: renamed from: b */
    public ProcessorState.TakePicture f90522b;

    /* JADX INFO: renamed from: c */
    public Object f90523c;

    /* JADX INFO: renamed from: d */
    public String f90524d;

    /* JADX INFO: renamed from: e */
    public CameraConnectionData f90525e;

    /* JADX INFO: renamed from: f */
    public CornerPoints f90526f;

    /* JADX INFO: renamed from: g */
    public boolean f90527g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f90528h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ DocFinderClient f90529i;

    /* JADX INFO: renamed from: j */
    public int f90530j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40764c(DocFinderClient docFinderClient, Continuation continuation) {
        super(continuation);
        this.f90529i = docFinderClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f90528h = obj;
        this.f90530j |= Integer.MIN_VALUE;
        return DocFinderClient.access$handleTakeImageState(this.f90529i, null, null, null, null, false, null, false, this);
    }
}
