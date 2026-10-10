package p749x5;

import com.facebook.fresco.middleware.HasExtraData;
import java.io.Closeable;
import p006a4.InterfaceC0113d;

/* JADX INFO: renamed from: x5.e */
/* JADX INFO: compiled from: CloseableImage.java */
/* JADX INFO: loaded from: classes34.dex */
public interface InterfaceC46071e extends Closeable, InterfaceC46077k, InterfaceC0113d, HasExtraData {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getHeight();

    InterfaceC46077k getImageInfo();

    InterfaceC46080n getQualityInfo();

    int getSizeInBytes();

    int getWidth();

    boolean isClosed();

    boolean isStateful();
}
