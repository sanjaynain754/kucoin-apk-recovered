package jumio.camerax;

import androidx.core.util.Consumer;
import com.jumio.commons.log.Log;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.camerax.C */
/* JADX INFO: loaded from: classes61.dex */
public final class C40474C implements Consumer {
    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        Throwable value = (Throwable) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        Log.printStackTrace(value);
    }
}
