package jumio.core;

import java.util.ArrayList;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.g1 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40664g1 {
    /* JADX INFO: renamed from: a */
    public static final String[] m89254a(Throwable th2, Function1 function1) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        ArrayList arrayList = new ArrayList();
        String name = th2.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        arrayList.add(name);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            arrayList.add("\tat " + stackTraceElement);
            if (function1 != null) {
                Intrinsics.checkNotNull(stackTraceElement);
                if (((Boolean) function1.invoke(stackTraceElement)).booleanValue()) {
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
