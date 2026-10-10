package com.sumsub.sns.internal.features.data.utils;

import com.sumsub.sns.internal.features.domain.C30303o0;
import com.tencent.bugly.proguard.C33627eb;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.utils.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30062b extends RequestBody {

    /* JADX INFO: renamed from: a */
    public final File f60401a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC30061a f60402b;

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f60401a.length();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType get$contentType() {
        return MediaType.INSTANCE.parse(((String) null) + "/*");
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        InterfaceC30061a interfaceC30061a;
        long length = this.f60401a.length();
        byte[] bArr = new byte[C33627eb.f69713c];
        FileInputStream fileInputStream = new FileInputStream(this.f60401a);
        long j11 = 0;
        int i11 = 0;
        while (true) {
            try {
                int i12 = fileInputStream.read(bArr);
                if (i12 == -1) {
                    fileInputStream.close();
                    return;
                }
                long j12 = ((long) 100) * j11;
                int i13 = (int) (j12 / length);
                if (i13 > i11 + 1) {
                    InterfaceC30061a interfaceC30061a2 = this.f60402b;
                    if (interfaceC30061a2 != null) {
                        ((C30303o0) interfaceC30061a2).m70175a((int) (j12 / length));
                    }
                    i11 = i13;
                }
                j11 += (long) i12;
                if (j11 == length && (interfaceC30061a = this.f60402b) != null) {
                    ((C30303o0) interfaceC30061a).m70176b();
                }
                bufferedSink.write(bArr, 0, i12);
            } catch (Throwable th2) {
                fileInputStream.close();
                throw th2;
            }
        }
    }

    public C30062b(File file, InterfaceC30061a interfaceC30061a) {
        this.f60401a = file;
        this.f60402b = interfaceC30061a;
    }
}
