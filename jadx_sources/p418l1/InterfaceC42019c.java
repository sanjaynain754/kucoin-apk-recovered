package p418l1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l1.c */
/* JADX INFO: compiled from: LottieFetchResult.java */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC42019c extends Closeable {
    @Nullable
    /* JADX INFO: renamed from: A */
    String mo92119A();

    @NonNull
    /* JADX INFO: renamed from: B */
    InputStream mo92120B() throws IOException;

    @Nullable
    String error();

    boolean isSuccessful();
}
