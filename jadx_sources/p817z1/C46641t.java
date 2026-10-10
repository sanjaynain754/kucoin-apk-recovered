package p817z1;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p628t1.C44613e;
import p628t1.InterfaceC44609a;
import p710w1.InterfaceC45684b;

/* JADX INFO: renamed from: z1.t */
/* JADX INFO: compiled from: StreamEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C46641t implements InterfaceC44609a<InputStream> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC45684b f104458a;

    @Override // p628t1.InterfaceC44609a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo4852a(@NonNull InputStream inputStream, @NonNull File file, @NonNull C44613e c44613e) throws Throwable {
        byte[] bArr = (byte[]) this.f104458a.mo100806d(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i11 = inputStream.read(bArr);
                        if (i11 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i11);
                    } catch (IOException e11) {
                        e = e11;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        this.f104458a.put(bArr);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        this.f104458a.put(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                this.f104458a.put(bArr);
                return true;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e12) {
            e = e12;
        }
    }

    public C46641t(InterfaceC45684b interfaceC45684b) {
        this.f104458a = interfaceC45684b;
    }
}
