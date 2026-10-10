package jumio.core;

import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.V3 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40609V3 {
    /* JADX INFO: renamed from: a */
    public static final String[] m89242a(String name, String contentType, int i11) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return (String[]) CollectionsKt.mutableListOf("Content-Disposition: form-data; name=\"" + name + '\"', "Content-Type: " + contentType, "Content-Length: " + i11).toArray(new String[0]);
    }
}
