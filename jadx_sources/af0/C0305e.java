package af0;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;

/* JADX INFO: renamed from: af0.e */
/* JADX INFO: compiled from: ProgressRequestBody.java */
/* JADX INFO: loaded from: classes60.dex */
public class C0305e extends RequestBody {

    /* JADX INFO: renamed from: g */
    public final RequestBody f808g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0301a f809h;

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        return this.f808g.contentLength();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType getContentType() {
        return this.f808g.getContentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        if (this.f809h == null) {
            this.f808g.writeTo(bufferedSink);
            return;
        }
        BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(new C0304d(bufferedSink.outputStream(), this.f809h, contentLength())));
        this.f808g.writeTo(bufferedSinkBuffer);
        bufferedSinkBuffer.flush();
    }

    public C0305e(RequestBody requestBody, InterfaceC0301a interfaceC0301a) {
        this.f808g = requestBody;
        this.f809h = interfaceC0301a;
    }
}
