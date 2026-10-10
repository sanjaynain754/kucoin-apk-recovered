package p817z1;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p523p2.C43354a;
import p628t1.C44613e;
import p628t1.InterfaceC44609a;

/* JADX INFO: renamed from: z1.c */
/* JADX INFO: compiled from: ByteBufferEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C46624c implements InterfaceC44609a<ByteBuffer> {
    @Override // p628t1.InterfaceC44609a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo4852a(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull C44613e c44613e) throws Throwable {
        try {
            C43354a.m95480e(byteBuffer, file);
            return true;
        } catch (IOException e11) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e11);
                return false;
            }
            return false;
        }
    }
}
