package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes23.dex */
public class CLParser {
    static boolean sDebug;
    private String mContent;
    private boolean mHasComment = false;
    private int mLineNumber;

    public enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public static CLObject parse(String str) throws CLParsingException {
        return new CLParser(str).parse();
    }

    private CLElement createElement(CLElement cLElement, int i11, TYPE type, boolean z11, char[] cArr) {
        CLElement cLElementAllocate;
        if (sDebug) {
            System.out.println("CREATE " + type + " at " + cArr[i11]);
        }
        switch (type.ordinal()) {
            case 1:
                cLElementAllocate = CLObject.allocate(cArr);
                i11++;
                break;
            case 2:
                cLElementAllocate = CLArray.allocate(cArr);
                i11++;
                break;
            case 3:
                cLElementAllocate = CLNumber.allocate(cArr);
                break;
            case 4:
                cLElementAllocate = CLString.allocate(cArr);
                break;
            case 5:
                cLElementAllocate = CLKey.allocate(cArr);
                break;
            case 6:
                cLElementAllocate = CLToken.allocate(cArr);
                break;
            default:
                cLElementAllocate = null;
                break;
        }
        if (cLElementAllocate == null) {
            return null;
        }
        cLElementAllocate.setLine(this.mLineNumber);
        if (z11) {
            cLElementAllocate.setStart(i11);
        }
        if (cLElement instanceof CLContainer) {
            cLElementAllocate.setContainer((CLContainer) cLElement);
        }
        return cLElementAllocate;
    }

    private CLElement getNextJsonElement(int i11, char c11, CLElement cLElement, char[] cArr) throws CLParsingException {
        if (c11 != '\t' && c11 != '\n' && c11 != '\r' && c11 != ' ') {
            if (c11 == '\"' || c11 == '\'') {
                return cLElement instanceof CLObject ? createElement(cLElement, i11, TYPE.KEY, true, cArr) : createElement(cLElement, i11, TYPE.STRING, true, cArr);
            }
            if (c11 == '[') {
                return createElement(cLElement, i11, TYPE.ARRAY, true, cArr);
            }
            if (c11 != ']') {
                if (c11 == '{') {
                    return createElement(cLElement, i11, TYPE.OBJECT, true, cArr);
                }
                if (c11 != '}') {
                    switch (c11) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return createElement(cLElement, i11, TYPE.NUMBER, true, cArr);
                        case ',':
                        case ':':
                            break;
                        case '/':
                            int i12 = i11 + 1;
                            if (i12 >= cArr.length || cArr[i12] != '/') {
                                return cLElement;
                            }
                            this.mHasComment = true;
                            return cLElement;
                        default:
                            if (!(cLElement instanceof CLContainer) || (cLElement instanceof CLObject)) {
                                return createElement(cLElement, i11, TYPE.KEY, true, cArr);
                            }
                            CLElement cLElementCreateElement = createElement(cLElement, i11, TYPE.TOKEN, true, cArr);
                            CLToken cLToken = (CLToken) cLElementCreateElement;
                            if (cLToken.validate(c11, i11)) {
                                return cLElementCreateElement;
                            }
                            throw new CLParsingException("incorrect token <" + c11 + "> at line " + this.mLineNumber, cLToken);
                    }
                }
            }
            cLElement.setEnd(i11 - 1);
            CLElement container = cLElement.getContainer();
            container.setEnd(i11);
            return container;
        }
        return cLElement;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0050 A[EDGE_INSN: B:108:0x0050->B:24:0x0050 BREAK  A[LOOP:1: B:14:0x0036->B:89:0x014f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x014f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0124  */
    /* JADX WARN: Code duplicated, block: B:81:0x012f  */
    /* JADX WARN: Code duplicated, block: B:84:0x013c  */
    public CLObject parse() throws CLParsingException {
        boolean z11;
        long j11;
        char c11;
        long j12;
        CLToken cLToken;
        long j13;
        char[] charArray = this.mContent.toCharArray();
        int length = charArray.length;
        int i11 = 1;
        this.mLineNumber = 1;
        boolean z12 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                i12 = -1;
                break;
            }
            char c12 = charArray[i12];
            if (c12 == '{') {
                break;
            }
            if (c12 == '\n') {
                this.mLineNumber++;
            }
            i12++;
        }
        if (i12 == -1) {
            throw new CLParsingException("invalid json content", null);
        }
        CLObject cLObjectAllocate = CLObject.allocate(charArray);
        cLObjectAllocate.setLine(this.mLineNumber);
        cLObjectAllocate.setStart(i12);
        int i13 = i12 + 1;
        CLElement container = cLObjectAllocate;
        while (i13 < length) {
            char c13 = charArray[i13];
            if (c13 == '\n') {
                this.mLineNumber += i11;
            }
            if (this.mHasComment) {
                if (c13 == '\n') {
                    this.mHasComment = z12;
                    if (container == null) {
                        break;
                        break;
                    }
                    if (container.isDone()) {
                        container = getNextJsonElement(i13, c13, container, charArray);
                    } else if (container instanceof CLObject) {
                        if (c13 == '}') {
                            container.setEnd(i13 - 1);
                        } else {
                            container = getNextJsonElement(i13, c13, container, charArray);
                        }
                    } else if (container instanceof CLArray) {
                        z11 = container instanceof CLString;
                        if (z11) {
                            j13 = container.mStart;
                            if (charArray[(int) j13] == c13) {
                                container.setStart(j13 + 1);
                                container.setEnd(i13 - 1);
                            }
                        } else {
                            if (container instanceof CLToken) {
                                cLToken = (CLToken) container;
                                if (!cLToken.validate(c13, i13)) {
                                    throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.mLineNumber, cLToken);
                                }
                            }
                            if (container instanceof CLKey) {
                                j11 = container.mStart;
                                c11 = charArray[(int) j11];
                                if (c11 != '\'') {
                                    container.setStart(j11 + 1);
                                    container.setEnd(i13 - 1);
                                } else {
                                    container.setStart(j11 + 1);
                                    container.setEnd(i13 - 1);
                                }
                            } else {
                                j11 = container.mStart;
                                c11 = charArray[(int) j11];
                                if (c11 != '\'') {
                                    container.setStart(j11 + 1);
                                    container.setEnd(i13 - 1);
                                } else {
                                    container.setStart(j11 + 1);
                                    container.setEnd(i13 - 1);
                                }
                            }
                            if (!container.isDone()) {
                                j12 = i13 - 1;
                                container.setEnd(j12);
                                if (c13 != '}') {
                                    container = container.getContainer();
                                    container.setEnd(j12);
                                    if (container instanceof CLKey) {
                                        container = container.getContainer();
                                        container.setEnd(j12);
                                    }
                                } else {
                                    container = container.getContainer();
                                    container.setEnd(j12);
                                    if (container instanceof CLKey) {
                                        container = container.getContainer();
                                        container.setEnd(j12);
                                    }
                                }
                            }
                        }
                        if (!container.isDone()) {
                        }
                    } else if (c13 == ']') {
                        container.setEnd(i13 - 1);
                    } else {
                        container = getNextJsonElement(i13, c13, container, charArray);
                    }
                    i11 = i11;
                    if (!container.isDone()) {
                    }
                } else {
                    i11 = i11;
                }
            } else {
                if (container == null) {
                    break;
                }
                if (container.isDone()) {
                    container = getNextJsonElement(i13, c13, container, charArray);
                } else if (container instanceof CLObject) {
                    if (c13 == '}') {
                        container.setEnd(i13 - 1);
                    } else {
                        container = getNextJsonElement(i13, c13, container, charArray);
                    }
                } else if (container instanceof CLArray) {
                    z11 = container instanceof CLString;
                    if (z11) {
                        j13 = container.mStart;
                        if (charArray[(int) j13] == c13) {
                            container.setStart(j13 + 1);
                            container.setEnd(i13 - 1);
                        }
                    } else {
                        if (container instanceof CLToken) {
                            cLToken = (CLToken) container;
                            if (!cLToken.validate(c13, i13)) {
                                throw new CLParsingException("parsing incorrect token " + cLToken.content() + " at line " + this.mLineNumber, cLToken);
                            }
                        }
                        if ((container instanceof CLKey) || z11) {
                            j11 = container.mStart;
                            c11 = charArray[(int) j11];
                            if ((c11 != '\'' || c11 == '\"') && c11 == c13) {
                                container.setStart(j11 + 1);
                                container.setEnd(i13 - 1);
                            }
                        }
                        if (!container.isDone() && (c13 == '}' || c13 == ']' || c13 == ',' || c13 == ' ' || c13 == '\t' || c13 == '\r' || c13 == '\n' || c13 == ':')) {
                            j12 = i13 - 1;
                            container.setEnd(j12);
                            if (c13 != '}' || c13 == ']') {
                                container = container.getContainer();
                                container.setEnd(j12);
                                if (container instanceof CLKey) {
                                    container = container.getContainer();
                                    container.setEnd(j12);
                                }
                            }
                        }
                    }
                    if (!container.isDone() && (!(container instanceof CLKey) || ((CLKey) container).mElements.size() > 0)) {
                        container = container.getContainer();
                    }
                } else if (c13 == ']') {
                    container.setEnd(i13 - 1);
                } else {
                    container = getNextJsonElement(i13, c13, container, charArray);
                }
                i11 = i11;
                if (!container.isDone()) {
                }
            }
            i13++;
            i11 = i11;
            z12 = false;
        }
        while (container != null && !container.isDone()) {
            if (container instanceof CLString) {
                container.setStart(((int) container.mStart) + 1);
            }
            container.setEnd(length - 1);
            container = container.getContainer();
        }
        if (sDebug) {
            System.out.println("Root: " + cLObjectAllocate.toJSON());
        }
        return cLObjectAllocate;
    }

    public CLParser(String str) {
        this.mContent = str;
    }
}
