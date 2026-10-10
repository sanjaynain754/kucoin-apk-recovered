package com.jumio.ale.swig;

/* JADX INFO: loaded from: classes56.dex */
public class ALESettings {

    /* JADX INFO: renamed from: a */
    public transient long f13400a;
    protected transient boolean swigCMemOwn;

    public ALESettings(long j11, boolean z11) {
        this.swigCMemOwn = z11;
        this.f13400a = j11;
    }

    public synchronized void delete() {
        try {
            long j11 = this.f13400a;
            if (j11 != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    aleEngineJNI.delete_ALESettings(j11);
                }
                this.f13400a = 0L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        aleEngineJNI.ALESettings_change_ownership(this, this.f13400a, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        aleEngineJNI.ALESettings_change_ownership(this, this.f13400a, true);
    }

    public static long getCPtr(ALESettings aLESettings) {
        if (aLESettings == null) {
            return 0L;
        }
        return aLESettings.f13400a;
    }

    public String getDirectory() {
        return aleEngineJNI.ALESettings_getDirectory(this.f13400a, this);
    }

    public String getKeyID() {
        return aleEngineJNI.ALESettings_getKeyID(this.f13400a, this);
    }

    public String getPublicKey() {
        return aleEngineJNI.ALESettings_getPublicKey(this.f13400a, this);
    }

    public void setDirectory(String str) {
        aleEngineJNI.ALESettings_setDirectory(this.f13400a, this, str);
    }

    public void setKeyID(String str) {
        aleEngineJNI.ALESettings_setKeyID(this.f13400a, this, str);
    }

    public void setPublicKey(String str) {
        aleEngineJNI.ALESettings_setPublicKey(this.f13400a, this, str);
    }

    public void finalize() {
        delete();
    }

    public ALESettings() {
        this(aleEngineJNI.new_ALESettings(), true);
        aleEngineJNI.ALESettings_director_connect(this, this.f13400a, true, true);
    }
}
