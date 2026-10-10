package com.fasterxml.jackson.core.util;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class DefaultIndenter extends DefaultPrettyPrinter.NopIndenter {
    public static final DefaultIndenter SYSTEM_LINEFEED_INSTANCE;
    public static final String SYS_LF;
    private static final long serialVersionUID = 1;
    private final int charsPerLevel;
    private final String eol;
    private final char[] indents;

    public DefaultIndenter() {
        this("  ", SYS_LF);
    }

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.InterfaceC6321a
    public boolean isInline() {
        return false;
    }

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
        SYS_LF = property;
        SYSTEM_LINEFEED_INSTANCE = new DefaultIndenter("  ", property);
    }

    public DefaultIndenter(String str, String str2) {
        this.charsPerLevel = str.length();
        this.indents = new char[str.length() * 16];
        int length = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            str.getChars(0, str.length(), this.indents, length);
            length += str.length();
        }
        this.eol = str2;
    }

    public String getEol() {
        return this.eol;
    }

    public String getIndent() {
        return new String(this.indents, 0, this.charsPerLevel);
    }

    public DefaultIndenter withLinefeed(String str) {
        return str.equals(this.eol) ? this : new DefaultIndenter(getIndent(), str);
    }

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.InterfaceC6321a
    public void writeIndentation(JsonGenerator jsonGenerator, int i11) throws IOException {
        jsonGenerator.mo10838q0(this.eol);
        if (i11 <= 0) {
            return;
        }
        int length = i11 * this.charsPerLevel;
        while (true) {
            char[] cArr = this.indents;
            if (length <= cArr.length) {
                jsonGenerator.mo10839r0(cArr, 0, length);
                return;
            } else {
                jsonGenerator.mo10839r0(cArr, 0, cArr.length);
                length -= this.indents.length;
            }
        }
    }

    public DefaultIndenter withIndent(String str) {
        if (str.equals(getIndent())) {
            return this;
        }
        return new DefaultIndenter(str, this.eol);
    }
}
