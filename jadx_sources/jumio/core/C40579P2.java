package jumio.core;

import com.jumio.commons.log.Log;
import com.jumio.core.models.AuthorizationModel;
import com.jumio.core.util.CloseableExtKt;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.crypto.CipherInputStream;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.P2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40579P2 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final AuthorizationModel.SessionKey f90072a;

    /* JADX INFO: renamed from: b */
    public final File f90073b;

    /* JADX INFO: renamed from: c */
    public final C40559L2 f90074c;

    /* JADX INFO: renamed from: d */
    public ObjectInputStream f90075d;

    public C40579P2(AuthorizationModel.SessionKey sessionKey, File file, C40559L2 lock) {
        Intrinsics.checkNotNullParameter(sessionKey, "sessionKey");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.f90072a = sessionKey;
        this.f90073b = file;
        this.f90074c = lock;
    }

    /* JADX INFO: renamed from: a */
    public final Object m89209a() {
        if (this.f90074c.m89201a()) {
            try {
                ObjectInputStream objectInputStream = this.f90075d;
                if (objectInputStream != null) {
                    return objectInputStream.readObject();
                }
                return null;
            } catch (Exception e11) {
                Log.m14485w("PersistenceUtil", "Error getting object to restore", e11);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m89210b() {
        try {
            this.f90075d = new ObjectInputStream(new BufferedInputStream(new CipherInputStream(new FileInputStream(this.f90073b), this.f90072a.getDecryptCipher())));
            return true;
        } catch (Exception e11) {
            Log.m14485w("PersistenceUtil", "Error initializing restore", e11);
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ObjectInputStream objectInputStream = this.f90075d;
        if (objectInputStream != null) {
            CloseableExtKt.closeQuietly(objectInputStream);
        }
        this.f90075d = null;
    }
}
