package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import com.tencent.bugly.proguard.C33820nf;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class CLElement implements Cloneable {
    protected static int sBaseIndent = 2;
    protected static int sMaxLine = 80;
    protected CLContainer mContainer;
    private final char[] mContent;
    private int mLine;
    protected long mStart = -1;
    protected long mEnd = Long.MAX_VALUE;

    public void addIndent(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(' ');
        }
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CLElement mo103473clone() {
        try {
            return (CLElement) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String content() {
        String str = new String(this.mContent);
        if (str.length() < 1) {
            return "";
        }
        long j11 = this.mEnd;
        if (j11 != Long.MAX_VALUE) {
            long j12 = this.mStart;
            if (j11 >= j12) {
                return str.substring((int) j12, ((int) j11) + 1);
            }
        }
        long j13 = this.mStart;
        return str.substring((int) j13, ((int) j13) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLElement)) {
            return false;
        }
        CLElement cLElement = (CLElement) obj;
        if (this.mStart == cLElement.mStart && this.mEnd == cLElement.mEnd && this.mLine == cLElement.mLine && Arrays.equals(this.mContent, cLElement.mContent)) {
            return Objects.equals(this.mContainer, cLElement.mContainer);
        }
        return false;
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    public String getDebugName() {
        if (!CLParser.sDebug) {
            return "";
        }
        return getStrClass() + " -> ";
    }

    public long getEnd() {
        return this.mEnd;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        return this.mLine;
    }

    public long getStart() {
        return this.mStart;
    }

    public boolean hasContent() {
        char[] cArr = this.mContent;
        return cArr != null && cArr.length >= 1;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.mContent) * 31;
        long j11 = this.mStart;
        int i11 = (iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.mEnd;
        int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        CLContainer cLContainer = this.mContainer;
        return ((i12 + (cLContainer != null ? cLContainer.hashCode() : 0)) * 31) + this.mLine;
    }

    public boolean isDone() {
        return this.mEnd != Long.MAX_VALUE;
    }

    public boolean isStarted() {
        return this.mStart > -1;
    }

    public boolean notStarted() {
        return this.mStart == -1;
    }

    public void setContainer(CLContainer cLContainer) {
        this.mContainer = cLContainer;
    }

    public void setEnd(long j11) {
        if (this.mEnd != Long.MAX_VALUE) {
            return;
        }
        this.mEnd = j11;
        if (CLParser.sDebug) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        CLContainer cLContainer = this.mContainer;
        if (cLContainer != null) {
            cLContainer.add(this);
        }
    }

    public void setLine(int i11) {
        this.mLine = i11;
    }

    public void setStart(long j11) {
        this.mStart = j11;
    }

    public String toFormattedJSON(int i11, int i12) {
        return "";
    }

    public String toJSON() {
        return "";
    }

    public String toString() {
        long j11 = this.mStart;
        long j12 = this.mEnd;
        if (j11 > j12 || j12 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.mStart + C33820nf.f71144W + this.mEnd + ")";
        }
        return getStrClass() + " (" + this.mStart + " : " + this.mEnd + ") <<" + new String(this.mContent).substring((int) this.mStart, ((int) this.mEnd) + 1) + ">>";
    }

    public CLElement(char[] cArr) {
        this.mContent = cArr;
    }

    public String getStrClass() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }
}
