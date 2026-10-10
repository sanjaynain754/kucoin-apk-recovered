package aai.liveness;

/* JADX INFO: loaded from: classes23.dex */
public enum Detector$DetectionType {
    NONE(0),
    BLINK(1),
    MOUTH(2),
    POS_YAW(3),
    DONE(6),
    AIMLESS(5);

    public int mInterValue;

    Detector$DetectionType(int i11) {
        this.mInterValue = i11;
    }
}
