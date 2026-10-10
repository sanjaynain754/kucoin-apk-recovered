package p280g2;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;
import p523p2.C43354a;
import p628t1.C44613e;
import p628t1.InterfaceC44615g;
import p680v1.InterfaceC45359j;

/* JADX INFO: renamed from: g2.d */
/* JADX INFO: compiled from: GifDrawableEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public class C37791d implements InterfaceC44615g<C37790c> {
    @Override // p628t1.InterfaceC44615g
    @NonNull
    /* JADX INFO: renamed from: b */
    public EncodeStrategy mo4853b(@NonNull C44613e c44613e) {
        return EncodeStrategy.SOURCE;
    }

    @Override // p628t1.InterfaceC44609a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo4852a(@NonNull InterfaceC45359j<C37790c> interfaceC45359j, @NonNull File file, @NonNull C44613e c44613e) throws Throwable {
        try {
            C43354a.m95480e(interfaceC45359j.get().m85254c(), file);
            return true;
        } catch (IOException e11) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e11);
                return false;
            }
            return false;
        }
    }
}
