package org.springframework.web.util.pattern;

import java.text.MessageFormat;

/* JADX INFO: loaded from: classes61.dex */
public class PatternParseException extends IllegalArgumentException {
    private final Object[] inserts;
    private final PatternMessage messageType;
    private final char[] pattern;
    private final int position;

    public enum PatternMessage {
        MISSING_CLOSE_CAPTURE("Expected close capture character after variable name '}'"),
        MISSING_OPEN_CAPTURE("Missing preceding open capture character before variable name'{'"),
        ILLEGAL_NESTED_CAPTURE("Not allowed to nest variable captures"),
        CANNOT_HAVE_ADJACENT_CAPTURES("Adjacent captures are not allowed"),
        ILLEGAL_CHARACTER_AT_START_OF_CAPTURE_DESCRIPTOR("Char ''{0}'' not allowed at start of captured variable name"),
        ILLEGAL_CHARACTER_IN_CAPTURE_DESCRIPTOR("Char ''{0}'' is not allowed in a captured variable name"),
        NO_MORE_DATA_EXPECTED_AFTER_CAPTURE_THE_REST("No more pattern data allowed after '{*...}' or '**' pattern element"),
        BADLY_FORMED_CAPTURE_THE_REST("Expected form when capturing the rest of the path is simply '{*...}'"),
        MISSING_REGEX_CONSTRAINT("Missing regex constraint on capture"),
        ILLEGAL_DOUBLE_CAPTURE("Not allowed to capture ''{0}'' twice in the same pattern"),
        REGEX_PATTERN_SYNTAX_EXCEPTION("Exception occurred in regex pattern compilation"),
        CAPTURE_ALL_IS_STANDALONE_CONSTRUCT("'{*...}' can only be preceded by a path separator");

        private final String message;

        public String formatMessage(Object... objArr) {
            return MessageFormat.format(this.message, objArr);
        }

        PatternMessage(String str) {
            this.message = str;
        }
    }

    public PatternParseException(int i11, char[] cArr, PatternMessage patternMessage, Object... objArr) {
        super(patternMessage.formatMessage(objArr));
        this.position = i11;
        this.pattern = cArr;
        this.messageType = patternMessage;
        this.inserts = objArr;
    }

    public Object[] getInserts() {
        return this.inserts;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.messageType.formatMessage(this.inserts);
    }

    public PatternMessage getMessageType() {
        return this.messageType;
    }

    public int getPosition() {
        return this.position;
    }

    public String toDetailedString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.pattern);
        sb2.append('\n');
        for (int i11 = 0; i11 < this.position; i11++) {
            sb2.append(' ');
        }
        sb2.append("^\n");
        sb2.append(getMessage());
        return sb2.toString();
    }

    public PatternParseException(Throwable th2, int i11, char[] cArr, PatternMessage patternMessage, Object... objArr) {
        super(patternMessage.formatMessage(objArr), th2);
        this.position = i11;
        this.pattern = cArr;
        this.messageType = patternMessage;
        this.inserts = objArr;
    }
}
