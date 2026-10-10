package jumio.core;

import java.util.Arrays;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: jumio.core.X2 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40618X2 {
    /* JADX INFO: renamed from: a */
    public static final void m89243a(boolean z11, String messageTemplate, Object... messageArgs) {
        Intrinsics.checkNotNullParameter(messageTemplate, "messageTemplate");
        Intrinsics.checkNotNullParameter(messageArgs, "messageArgs");
        if (z11) {
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArrCopyOf = Arrays.copyOf(messageArgs, messageArgs.length);
        String str = String.format(messageTemplate, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        throw new IllegalArgumentException(str.toString());
    }
}
