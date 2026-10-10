package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import p006a4.AbstractC0110a;
import p032b4.C4487a;
import p221e4.C37072c;
import p221e4.InterfaceC37071b;
import p712w3.C45701a;
import p712w3.C45702b;
import p712w3.C45708h;
import p712w3.C45713m;
import p712w3.InterfaceC45704d;
import p819z3.C46680i;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC45704d
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* JADX INFO: renamed from: d */
    public static Method f9183d;

    /* JADX INFO: renamed from: c */
    public final InterfaceC37071b f9184c = C37072c.m82976i();

    /* JADX INFO: renamed from: h */
    public static MemoryFile m9516h(AbstractC0110a<PooledByteBuffer> abstractC0110a, int i11, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        C4487a c4487a;
        C46680i c46680i = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i11);
        memoryFile.allowPurging(false);
        try {
            C46680i c46680i2 = new C46680i(abstractC0110a.m565l());
            try {
                c4487a = new C4487a(c46680i2, i11);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    C45701a.m100878a(c4487a, outputStream2);
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i11, bArr.length);
                    }
                    AbstractC0110a.m555j(abstractC0110a);
                    C45702b.m100881b(c46680i2);
                    C45702b.m100881b(c4487a);
                    C45702b.m100880a(outputStream2, true);
                    return memoryFile;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = outputStream2;
                    c46680i = c46680i2;
                    AbstractC0110a.m555j(abstractC0110a);
                    C45702b.m100881b(c46680i);
                    C45702b.m100881b(c4487a);
                    C45702b.m100880a(outputStream, true);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
                c4487a = null;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
            c4487a = null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final Bitmap m9517i(AbstractC0110a<PooledByteBuffer> abstractC0110a, int i11, byte[] bArr, BitmapFactory.Options options) throws Throwable {
        MemoryFile memoryFile = null;
        try {
            try {
                MemoryFile memoryFileM9516h = m9516h(abstractC0110a, i11, bArr);
                try {
                    FileDescriptor fileDescriptorM9519k = m9519k(memoryFileM9516h);
                    InterfaceC37071b interfaceC37071b = this.f9184c;
                    if (interfaceC37071b == null) {
                        throw new IllegalStateException("WebpBitmapFactory is null");
                    }
                    Bitmap bitmap = (Bitmap) C45708h.m100897h(interfaceC37071b.m82967b(fileDescriptorM9519k, null, options), "BitmapFactory returned null");
                    if (memoryFileM9516h != null) {
                        memoryFileM9516h.close();
                    }
                    return bitmap;
                } catch (IOException e11) {
                    e = e11;
                    memoryFile = memoryFileM9516h;
                    throw C45713m.m100908a(e);
                } catch (Throwable th2) {
                    th = th2;
                    memoryFile = memoryFileM9516h;
                    if (memoryFile != null) {
                        memoryFile.close();
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized Method m9518j() {
        if (f9183d == null) {
            try {
                f9183d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
            } catch (Exception e11) {
                throw C45713m.m100908a(e11);
            }
        }
        return f9183d;
    }

    @InterfaceC45704d
    public GingerbreadPurgeableDecoder() {
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* JADX INFO: renamed from: c */
    public Bitmap mo9502c(AbstractC0110a<PooledByteBuffer> abstractC0110a, BitmapFactory.Options options) {
        return m9517i(abstractC0110a, abstractC0110a.m565l().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    /* JADX INFO: renamed from: d */
    public Bitmap mo9503d(AbstractC0110a<PooledByteBuffer> abstractC0110a, int i11, BitmapFactory.Options options) {
        byte[] bArr;
        if (DalvikPurgeableDecoder.m9500e(abstractC0110a, i11)) {
            bArr = null;
        } else {
            bArr = DalvikPurgeableDecoder.f9172b;
        }
        return m9517i(abstractC0110a, i11, bArr, options);
    }

    /* JADX INFO: renamed from: k */
    public final FileDescriptor m9519k(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) C45708h.m100896g(m9518j().invoke(memoryFile, new Object[0]));
        } catch (Exception e11) {
            throw C45713m.m100908a(e11);
        }
    }
}
