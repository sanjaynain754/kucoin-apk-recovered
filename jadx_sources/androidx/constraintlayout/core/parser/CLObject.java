package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {

    public static class CLObjectIterator implements Iterator<CLKey> {
        int mIndex = 0;
        CLObject mObject;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mIndex < this.mObject.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public CLKey next() {
            CLKey cLKey = (CLKey) this.mObject.mElements.get(this.mIndex);
            this.mIndex++;
            return cLKey;
        }

        public CLObjectIterator(CLObject cLObject) {
            this.mObject = cLObject;
        }
    }

    public String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }

    public static CLObject allocate(char[] cArr) {
        return new CLObject(cArr);
    }

    @Override // java.lang.Iterable
    public Iterator<CLKey> iterator() {
        return new CLObjectIterator(this);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder(getDebugName());
        sb2.append("{\n");
        boolean z11 = true;
        for (CLElement cLElement : this.mElements) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(",\n");
            }
            sb2.append(cLElement.toFormattedJSON(CLElement.sBaseIndent + i11, i12 - 1));
        }
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        addIndent(sb2, i11);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb2 = new StringBuilder(getDebugName() + "{ ");
        boolean z11 = true;
        for (CLElement cLElement : this.mElements) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(cLElement.toJSON());
        }
        sb2.append(" }");
        return sb2.toString();
    }

    public CLObject(char[] cArr) {
        super(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    @NonNull
    /* JADX INFO: renamed from: clone */
    public CLObject mo103473clone() {
        return (CLObject) super.mo103473clone();
    }
}
