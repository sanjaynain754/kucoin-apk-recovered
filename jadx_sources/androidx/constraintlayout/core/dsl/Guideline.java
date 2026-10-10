package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: classes23.dex */
public abstract class Guideline extends Helper {
    private int mEnd;
    private float mPercent;
    private int mStart;

    public Guideline(String str) {
        super(str, new Helper.HelperType(""));
        this.mStart = Integer.MIN_VALUE;
        this.mEnd = Integer.MIN_VALUE;
        this.mPercent = Float.NaN;
    }

    public int getEnd() {
        return this.mEnd;
    }

    public float getPercent() {
        return this.mPercent;
    }

    public int getStart() {
        return this.mStart;
    }

    public void setEnd(int i11) {
        this.mEnd = i11;
        this.configMap.put("end", String.valueOf(i11));
    }

    public void setPercent(float f11) {
        this.mPercent = f11;
        this.configMap.put("percent", String.valueOf(f11));
    }

    public void setStart(int i11) {
        this.mStart = i11;
        this.configMap.put("start", String.valueOf(i11));
    }
}
