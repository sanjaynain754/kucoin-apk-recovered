package jumio.core;

import android.os.Build;
import android.os.Bundle;
import com.jumio.core.models.AuthorizationModel;
import java.io.Serializable;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.y0 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40753y0 {
    /* JADX INFO: renamed from: a */
    public static final Serializable m89270a(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 33) {
            Serializable serializable = bundle.getSerializable("Jumio1", AuthorizationModel.class);
            Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type T of com.jumio.core.ControllerKt.getSerializableCompat");
            return serializable;
        }
        Serializable serializable2 = bundle.getSerializable("Jumio1");
        Intrinsics.checkNotNull(serializable2, "null cannot be cast to non-null type T of com.jumio.core.ControllerKt.getSerializableCompat");
        return serializable2;
    }
}
