package com.jumio.ale.swig;

/* JADX INFO: loaded from: classes56.dex */
public class ALERequest {

    /* JADX INFO: renamed from: a */
    public transient long f13399a;
    protected transient boolean swigCMemOwn;

    public synchronized void delete() {
        if (this.f13399a != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                throw new UnsupportedOperationException("C++ destructor does not have public access");
            }
            this.f13399a = 0L;
        }
    }

    public int finishRequest(byte[] bArr, int i11) throws Exception {
        return aleEngineJNI.ALERequest_finishRequest__SWIG_0(this.f13399a, this, bArr, i11);
    }

    public int initRequest(ALEHeader aLEHeader, int i11, byte[] bArr, int i12) throws Exception {
        return aleEngineJNI.ALERequest_initRequest__SWIG_0(this.f13399a, this, ALEHeader.getCPtr(aLEHeader), aLEHeader, i11, bArr, i12);
    }

    public int request(ALEHeader aLEHeader, byte[] bArr, byte[] bArr2, int i11) throws Exception {
        return aleEngineJNI.ALERequest_request__SWIG_0(this.f13399a, this, ALEHeader.getCPtr(aLEHeader), aLEHeader, bArr, bArr2, i11);
    }

    public int response(byte[] bArr, byte[] bArr2, int i11) throws Exception {
        return aleEngineJNI.ALERequest_response__SWIG_0(this.f13399a, this, bArr, bArr2, i11);
    }

    public int updateRequest(byte[] bArr, byte[] bArr2, int i11) throws Exception {
        return aleEngineJNI.ALERequest_updateRequest__SWIG_0(this.f13399a, this, bArr, bArr2, i11);
    }

    public int updateResponse(byte[] bArr, byte[] bArr2, int i11) throws Exception {
        return aleEngineJNI.ALERequest_updateResponse__SWIG_0(this.f13399a, this, bArr, bArr2, i11);
    }

    public static long getCPtr(ALERequest aLERequest) {
        if (aLERequest == null) {
            return 0L;
        }
        return aLERequest.f13399a;
    }

    public int calculateRequestFinish() {
        return aleEngineJNI.ALERequest_calculateRequestFinish(this.f13399a, this);
    }

    public int calculateRequestInit(ALEHeader aLEHeader, int i11) {
        return aleEngineJNI.ALERequest_calculateRequestInit(this.f13399a, this, ALEHeader.getCPtr(aLEHeader), aLEHeader, i11);
    }

    public int calculateRequestSize(ALEHeader aLEHeader, int i11) {
        return aleEngineJNI.ALERequest_calculateRequestSize(this.f13399a, this, ALEHeader.getCPtr(aLEHeader), aLEHeader, i11);
    }

    public int calculateRequestUpdate(int i11) {
        return aleEngineJNI.ALERequest_calculateRequestUpdate(this.f13399a, this, i11);
    }

    public int calculateResponseSize(byte[] bArr) throws Exception {
        return aleEngineJNI.ALERequest_calculateResponseSize(this.f13399a, this, bArr);
    }

    public int finishRequest(byte[] bArr) throws Exception {
        return aleEngineJNI.ALERequest_finishRequest__SWIG_1(this.f13399a, this, bArr);
    }

    public boolean finishResponse() throws Exception {
        return aleEngineJNI.ALERequest_finishResponse(this.f13399a, this);
    }

    public int getErrorCode() {
        return aleEngineJNI.ALERequest_getErrorCode(this.f13399a, this);
    }

    public int initRequest(ALEHeader aLEHeader, int i11, byte[] bArr) throws Exception {
        return aleEngineJNI.ALERequest_initRequest__SWIG_1(this.f13399a, this, ALEHeader.getCPtr(aLEHeader), aLEHeader, i11, bArr);
    }

    public void initResponse() {
        aleEngineJNI.ALERequest_initResponse(this.f13399a, this);
    }

    public boolean isKeyUpdate() {
        return aleEngineJNI.ALERequest_isKeyUpdate(this.f13399a, this);
    }

    public boolean isVerified() {
        return aleEngineJNI.ALERequest_isVerified(this.f13399a, this);
    }

    public int request(ALEHeader aLEHeader, byte[] bArr, byte[] bArr2) throws Exception {
        return aleEngineJNI.ALERequest_request__SWIG_1(this.f13399a, this, ALEHeader.getCPtr(aLEHeader), aLEHeader, bArr, bArr2);
    }

    public int response(byte[] bArr, byte[] bArr2) throws Exception {
        return aleEngineJNI.ALERequest_response__SWIG_1(this.f13399a, this, bArr, bArr2);
    }

    public int updateRequest(byte[] bArr, byte[] bArr2) throws Exception {
        return aleEngineJNI.ALERequest_updateRequest__SWIG_1(this.f13399a, this, bArr, bArr2);
    }

    public int updateResponse(byte[] bArr, byte[] bArr2) throws Exception {
        return aleEngineJNI.ALERequest_updateResponse__SWIG_1(this.f13399a, this, bArr, bArr2);
    }

    public ALERequest(long j11, boolean z11) {
        this.swigCMemOwn = z11;
        this.f13399a = j11;
    }
}
