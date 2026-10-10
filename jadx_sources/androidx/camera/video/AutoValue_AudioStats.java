package androidx.camera.video;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_AudioStats extends AudioStats {
    private final double audioAmplitudeInternal;
    private final long audioBytesRecorded;
    private final int audioState;
    private final Throwable errorCause;

    public boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioStats) {
            AudioStats audioStats = (AudioStats) obj;
            if (this.audioState == audioStats.getAudioState() && Double.doubleToLongBits(this.audioAmplitudeInternal) == Double.doubleToLongBits(audioStats.getAudioAmplitudeInternal()) && this.audioBytesRecorded == audioStats.getAudioBytesRecorded() && ((th2 = this.errorCause) != null ? th2.equals(audioStats.getErrorCause()) : audioStats.getErrorCause() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.AudioStats
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public double getAudioAmplitudeInternal() {
        return this.audioAmplitudeInternal;
    }

    @Override // androidx.camera.video.AudioStats
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public long getAudioBytesRecorded() {
        return this.audioBytesRecorded;
    }

    @Override // androidx.camera.video.AudioStats
    public int getAudioState() {
        return this.audioState;
    }

    @Override // androidx.camera.video.AudioStats
    public Throwable getErrorCause() {
        return this.errorCause;
    }

    public int hashCode() {
        int iDoubleToLongBits = (((this.audioState ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.audioAmplitudeInternal) >>> 32) ^ Double.doubleToLongBits(this.audioAmplitudeInternal)))) * 1000003;
        long j11 = this.audioBytesRecorded;
        int i11 = (iDoubleToLongBits ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        Throwable th2 = this.errorCause;
        return i11 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "AudioStats{audioState=" + this.audioState + ", audioAmplitudeInternal=" + this.audioAmplitudeInternal + ", audioBytesRecorded=" + this.audioBytesRecorded + ", errorCause=" + this.errorCause + "}";
    }

    public AutoValue_AudioStats(int i11, double d11, long j11, Throwable th2) {
        this.audioState = i11;
        this.audioAmplitudeInternal = d11;
        this.audioBytesRecorded = j11;
        this.errorCause = th2;
    }
}
