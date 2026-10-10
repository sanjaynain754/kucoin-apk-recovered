package jumio.core;

import com.jumio.ale.swig.ALECore;
import com.jumio.ale.swig.ALERequest;
import com.jumio.ale.swig.ALESettings;

/* JADX INFO: renamed from: jumio.core.R3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40589R3 extends ALECore {

    /* JADX INFO: renamed from: b */
    public final Object f90111b;

    /* JADX INFO: renamed from: c */
    public boolean f90112c;

    @Override // com.jumio.ale.swig.ALECore
    public final synchronized void delete() {
        synchronized (this.f90111b) {
            this.f90112c = false;
            super.delete();
        }
    }

    @Override // com.jumio.ale.swig.ALECore
    public final ALERequest createRequest() {
        ALERequest aLERequestCreateRequest;
        synchronized (this.f90111b) {
            try {
                if (!this.f90112c) {
                    throw new Exception("AleCore instance not valid");
                }
                aLERequestCreateRequest = super.createRequest();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aLERequestCreateRequest;
    }

    @Override // com.jumio.ale.swig.ALECore
    public final void destroyRequest(ALERequest aLERequest) {
        synchronized (this.f90111b) {
            if (this.f90112c) {
                super.destroyRequest(aLERequest);
            } else {
                try {
                    aLERequest.delete();
                } catch (Exception unused) {
                }
            }
        }
    }

    public C40589R3(ALESettings aLESettings) {
        super(aLESettings);
        this.f90111b = new Object();
        this.f90112c = true;
    }
}
