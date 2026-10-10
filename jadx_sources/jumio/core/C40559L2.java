package jumio.core;

import android.content.Context;
import androidx.credentials.provider.CredentialEntry;
import com.jumio.core.environment.Environment;
import java.io.File;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.FilesKt;

/* JADX INFO: renamed from: jumio.core.L2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40559L2 {

    /* JADX INFO: renamed from: a */
    public final File f90039a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC41634e f90040b;

    public C40559L2(Context context) {
        File file = new File(Environment.INSTANCE.getDataDirectory(context), "tmp_lock");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        this.f90039a = file;
        this.f90040b = C41636g.m90913f(new C40554K2(this, null));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m89201a() {
        File file = this.f90039a;
        return Boolean.parseBoolean(file.exists() ? FilesKt.readText$default(file, null, 1, null) : CredentialEntry.FALSE_STRING);
    }
}
