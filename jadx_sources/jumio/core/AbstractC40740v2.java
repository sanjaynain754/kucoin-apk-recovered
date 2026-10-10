package jumio.core;

import com.jumio.core.extraction.docfinder.DocFinderPlugin;
import com.jumio.liveness.LivenessPlugin;
import java.util.HashMap;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;

/* JADX INFO: renamed from: jumio.core.v2 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40740v2 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f90454a = MapsKt.hashMapOf(TuplesKt.m90091to(EnumC40613W2.DOCFINDER, new String[]{DocFinderPlugin.CORNER_DETECTION_MODEL, DocFinderPlugin.CLASSIFIER_MODEL}), TuplesKt.m90091to(EnumC40613W2.JUMIO_LIVENESS, new String[]{LivenessPlugin.LIVENESS_ASSETS}));
}
