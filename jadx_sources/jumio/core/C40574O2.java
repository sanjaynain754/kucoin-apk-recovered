package jumio.core;

import com.jumio.commons.log.Log;
import com.jumio.core.models.AuthorizationModel;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.crypto.CipherOutputStream;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;
import p852kotlin.p407io.FilesKt;

/* JADX INFO: renamed from: jumio.core.O2 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40574O2 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final AuthorizationModel.SessionKey f90066a;

    /* JADX INFO: renamed from: b */
    public final File f90067b;

    /* JADX INFO: renamed from: c */
    public final C40559L2 f90068c;

    /* JADX INFO: renamed from: d */
    public ObjectOutputStream f90069d;

    /* JADX INFO: renamed from: a */
    public final boolean m89208a() {
        try {
            if (this.f90067b.exists()) {
                this.f90067b.delete();
            }
            this.f90069d = new ObjectOutputStream(new BufferedOutputStream(new CipherOutputStream(new FileOutputStream(this.f90067b), this.f90066a.getEncryptCipher())));
            FilesKt.writeText$default(this.f90068c.f90039a, String.valueOf(false), null, 2, null);
            return true;
        } catch (Exception e11) {
            Log.m14485w("PersistenceUtil", "Error initializing persistence", e11);
            return false;
        }
    }

    public C40574O2(AuthorizationModel.SessionKey sessionKey, File file, C40559L2 lock) {
        Intrinsics.checkNotNullParameter(sessionKey, "sessionKey");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.f90066a = sessionKey;
        this.f90067b = file;
        this.f90068c = lock;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ObjectOutputStream objectOutputStream = this.f90069d;
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.flush();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(objectOutputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(objectOutputStream, th2);
                        throw th3;
                    }
                }
            }
            FilesKt.writeText$default(this.f90068c.f90039a, String.valueOf(true), null, 2, null);
        } catch (Exception e11) {
            Log.m14485w("PersistenceUtil", "Error finishing persistence", e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m89207a(Serializable serializable) {
        try {
            ObjectOutputStream objectOutputStream = this.f90069d;
            if (objectOutputStream != null) {
                objectOutputStream.writeObject(serializable);
            }
        } catch (Exception e11) {
            Log.m14485w("PersistenceUtil", "Error adding data to persist", e11);
        }
    }
}
