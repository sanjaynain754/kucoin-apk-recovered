package com.google.common.p069io;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.jumio.commons.log.LogUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
abstract class LineBuffer {
    private StringBuilder line = new StringBuilder();
    private boolean sawReturn;

    public abstract void handleLine(String str, String str2) throws IOException;

    @CanIgnoreReturnValue
    private boolean finishLine(boolean z11) throws IOException {
        String str;
        if (this.sawReturn) {
            str = z11 ? LogUtils.NEW_LINE : "\r";
        } else {
            str = z11 ? ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE : "";
        }
        handleLine(this.line.toString(), str);
        this.line = new StringBuilder();
        this.sawReturn = false;
        return z11;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    public void add(char[] cArr, int i11, int i12) throws IOException {
        int i13;
        if (!this.sawReturn || i12 <= 0) {
            i13 = i11;
        } else {
            if (finishLine(cArr[i11] == '\n')) {
                i13 = i11 + 1;
            } else {
                i13 = i11;
            }
        }
        int i14 = i11 + i12;
        int i15 = i13;
        while (i13 < i14) {
            char c11 = cArr[i13];
            if (c11 != '\n') {
                if (c11 == '\r') {
                    this.line.append(cArr, i15, i13 - i15);
                    this.sawReturn = true;
                    int i16 = i13 + 1;
                    if (i16 < i14) {
                        if (finishLine(cArr[i16] == '\n')) {
                            i13 = i16;
                        }
                    }
                }
                i13++;
            } else {
                this.line.append(cArr, i15, i13 - i15);
                finishLine(true);
            }
            i15 = i13 + 1;
            i13++;
        }
        this.line.append(cArr, i15, i14 - i15);
    }

    public void finish() throws IOException {
        if (this.sawReturn || this.line.length() > 0) {
            finishLine(false);
        }
    }
}
