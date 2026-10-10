package androidx.camera.core;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_SurfaceOutput_Event extends SurfaceOutput.Event {
    private final int eventCode;
    private final SurfaceOutput surfaceOutput;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceOutput.Event) {
            SurfaceOutput.Event event = (SurfaceOutput.Event) obj;
            if (this.eventCode == event.getEventCode() && this.surfaceOutput.equals(event.getSurfaceOutput())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public int getEventCode() {
        return this.eventCode;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public SurfaceOutput getSurfaceOutput() {
        return this.surfaceOutput;
    }

    public int hashCode() {
        return ((this.eventCode ^ 1000003) * 1000003) ^ this.surfaceOutput.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.eventCode + ", surfaceOutput=" + this.surfaceOutput + "}";
    }

    public AutoValue_SurfaceOutput_Event(int i11, SurfaceOutput surfaceOutput) {
        this.eventCode = i11;
        if (surfaceOutput != null) {
            this.surfaceOutput = surfaceOutput;
            return;
        }
        throw new NullPointerException("Null surfaceOutput");
    }
}
