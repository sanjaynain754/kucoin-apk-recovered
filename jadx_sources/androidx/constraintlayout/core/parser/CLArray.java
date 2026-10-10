package androidx.constraintlayout.core.parser;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* JADX INFO: loaded from: classes23.dex */
public class CLArray extends CLContainer {
    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        String json = toJSON();
        if (i12 > 0 || json.length() + i11 >= CLElement.sMaxLine) {
            sb2.append("[\n");
            boolean z11 = true;
            for (CLElement cLElement : this.mElements) {
                if (z11) {
                    z11 = false;
                } else {
                    sb2.append(",\n");
                }
                addIndent(sb2, CLElement.sBaseIndent + i11);
                sb2.append(cLElement.toFormattedJSON(CLElement.sBaseIndent + i11, i12 - 1));
            }
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            addIndent(sb2, i11);
            sb2.append("]");
        } else {
            sb2.append(json);
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb2 = new StringBuilder(getDebugName() + "[");
        boolean z11 = true;
        for (int i11 = 0; i11 < this.mElements.size(); i11++) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(this.mElements.get(i11).toJSON());
        }
        return ((Object) sb2) + "]";
    }

    public CLArray(char[] cArr) {
        super(cArr);
    }
}
