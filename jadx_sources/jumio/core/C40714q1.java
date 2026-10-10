package jumio.core;

import com.jumio.core.constants.ConstantsKt;
import java.io.File;
import java.io.FilenameFilter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: jumio.core.q1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40714q1 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File dir, String name) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.startsWith$default(name, ConstantsKt.TEMP_FILE_PREFIX, false, 2, (Object) null);
    }

    public C40714q1() {
        Intrinsics.checkNotNullParameter(ConstantsKt.TEMP_FILE_PREFIX, "filterClause");
    }
}
