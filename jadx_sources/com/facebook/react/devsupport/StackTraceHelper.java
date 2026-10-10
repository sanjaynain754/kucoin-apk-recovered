package com.facebook.react.devsupport;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33844oi;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes45.dex */
public class StackTraceHelper {
    public static final String COLUMN_KEY = "column";
    public static final String COMPONENT_STACK_KEY = "componentStack";
    public static final String EXTRA_DATA_KEY = "extraData";
    public static final String FILE_KEY = "file";
    public static final String ID_KEY = "id";
    public static final String IS_FATAL_KEY = "isFatal";
    public static final String LINE_NUMBER_KEY = "lineNumber";
    public static final String MESSAGE_KEY = "message";
    public static final String METHOD_NAME_KEY = "methodName";
    public static final String NAME_KEY = "name";
    public static final String ORIGINAL_MESSAGE_KEY = "originalMessage";
    private static final Pattern STACK_FRAME_PATTERN1 = Pattern.compile("^(?:(.*?)@)?(.*?)\\:([0-9]+)\\:([0-9]+)$");
    private static final Pattern STACK_FRAME_PATTERN2 = Pattern.compile("\\s*(?:at)\\s*(.+?)\\s*[@(](.*):([0-9]+):([0-9]+)[)]$");
    public static final String STACK_KEY = "stack";

    public static class StackFrameImpl implements StackFrame {
        private final int mColumn;
        private final String mFile;
        private final String mFileName;
        private final boolean mIsCollapsed;
        private final int mLine;
        private final String mMethod;

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public int getColumn() {
            return this.mColumn;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public String getFile() {
            return this.mFile;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public String getFileName() {
            return this.mFileName;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public int getLine() {
            return this.mLine;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public String getMethod() {
            return this.mMethod;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public boolean isCollapsed() {
            return this.mIsCollapsed;
        }

        @Override // com.facebook.react.devsupport.interfaces.StackFrame
        public JSONObject toJSON() {
            return new JSONObject(MapBuilder.m10226of("file", getFile(), "methodName", getMethod(), "lineNumber", Integer.valueOf(getLine()), "column", Integer.valueOf(getColumn()), "collapse", Boolean.valueOf(isCollapsed())));
        }

        private StackFrameImpl(String str, String str2, int i11, int i12, boolean z11) {
            this.mFile = str;
            this.mMethod = str2;
            this.mLine = i11;
            this.mColumn = i12;
            this.mFileName = str != null ? new File(str).getName() : "";
            this.mIsCollapsed = z11;
        }

        private StackFrameImpl(String str, String str2, int i11, int i12) {
            this(str, str2, i11, i12, false);
        }

        private StackFrameImpl(String str, String str2, String str3, int i11, int i12) {
            this.mFile = str;
            this.mFileName = str2;
            this.mMethod = str3;
            this.mLine = i11;
            this.mColumn = i12;
            this.mIsCollapsed = false;
        }
    }

    public static StackFrame[] convertJsStackTrace(@Nullable ReadableArray readableArray) {
        int size = readableArray != null ? readableArray.size() : 0;
        StackFrame[] stackFrameArr = new StackFrame[size];
        for (int i11 = 0; i11 < size; i11++) {
            ReadableType type = readableArray.getType(i11);
            if (type == ReadableType.Map) {
                ReadableMap map = readableArray.getMap(i11);
                String string = map.getString("methodName");
                String string2 = map.getString("file");
                boolean z11 = map.hasKey("collapse") && !map.isNull("collapse") && map.getBoolean("collapse");
                int i12 = -1;
                int i13 = (!map.hasKey("lineNumber") || map.isNull("lineNumber")) ? -1 : map.getInt("lineNumber");
                if (map.hasKey("column") && !map.isNull("column")) {
                    i12 = map.getInt("column");
                }
                stackFrameArr[i11] = new StackFrameImpl(string2, string, i13, i12, z11);
            } else if (type == ReadableType.String) {
                stackFrameArr[i11] = new StackFrameImpl((String) null, readableArray.getString(i11), -1, -1);
            }
        }
        return stackFrameArr;
    }

    public static String formatFrameSource(StackFrame stackFrame) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(stackFrame.getFileName());
        int line = stackFrame.getLine();
        if (line > 0) {
            sb2.append(C33844oi.f71346o);
            sb2.append(line);
            int column = stackFrame.getColumn();
            if (column > 0) {
                sb2.append(C33844oi.f71346o);
                sb2.append(column);
            }
        }
        return sb2.toString();
    }

    public static String formatStackTrace(String str, StackFrame[] stackFrameArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        for (StackFrame stackFrame : stackFrameArr) {
            sb2.append(stackFrame.getMethod());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            sb2.append("    ");
            sb2.append(formatFrameSource(stackFrame));
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        return sb2.toString();
    }

    public static StackFrame[] convertJavaStackTrace(Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        StackFrame[] stackFrameArr = new StackFrame[stackTrace.length];
        for (int i11 = 0; i11 < stackTrace.length; i11++) {
            stackFrameArr[i11] = new StackFrameImpl(stackTrace[i11].getClassName(), stackTrace[i11].getFileName(), stackTrace[i11].getMethodName(), stackTrace[i11].getLineNumber(), -1);
        }
        return stackFrameArr;
    }

    public static JavaOnlyMap convertParsedError(ReactJsExceptionHandler.ParsedError parsedError) {
        List<ReactJsExceptionHandler.ParsedError.StackFrame> stack = parsedError.getStack();
        ArrayList arrayList = new ArrayList();
        for (ReactJsExceptionHandler.ParsedError.StackFrame stackFrame : stack) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            if (stackFrame.getColumn() != null) {
                javaOnlyMap.putDouble("column", stackFrame.getColumn().intValue());
            }
            if (stackFrame.getLineNumber() != null) {
                javaOnlyMap.putDouble("lineNumber", stackFrame.getLineNumber().intValue());
            }
            javaOnlyMap.putString("file", stackFrame.getFile());
            javaOnlyMap.putString("methodName", stackFrame.getMethodName());
            arrayList.add(javaOnlyMap);
        }
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        javaOnlyMap2.putString("message", parsedError.getMessage());
        if (parsedError.getOriginalMessage() != null) {
            javaOnlyMap2.putString(ORIGINAL_MESSAGE_KEY, parsedError.getOriginalMessage());
        }
        if (parsedError.getName() != null) {
            javaOnlyMap2.putString("name", parsedError.getName());
        }
        if (parsedError.getComponentStack() != null) {
            javaOnlyMap2.putString(COMPONENT_STACK_KEY, parsedError.getComponentStack());
        }
        javaOnlyMap2.putArray(STACK_KEY, JavaOnlyArray.from(arrayList));
        javaOnlyMap2.putInt("id", parsedError.getId());
        javaOnlyMap2.putBoolean(IS_FATAL_KEY, parsedError.isFatal());
        javaOnlyMap2.putMap("extraData", parsedError.getExtraData());
        return javaOnlyMap2;
    }

    public static StackFrame[] convertJsStackTrace(JSONArray jSONArray) {
        int length = jSONArray != null ? jSONArray.length() : 0;
        StackFrame[] stackFrameArr = new StackFrame[length];
        for (int i11 = 0; i11 < length; i11++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                String string = jSONObject.getString("methodName");
                String string2 = jSONObject.getString("file");
                int i12 = -1;
                int i13 = (!jSONObject.has("lineNumber") || jSONObject.isNull("lineNumber")) ? -1 : jSONObject.getInt("lineNumber");
                if (jSONObject.has("column") && !jSONObject.isNull("column")) {
                    i12 = jSONObject.getInt("column");
                }
                stackFrameArr[i11] = new StackFrameImpl(string2, string, i13, i12, jSONObject.has("collapse") && !jSONObject.isNull("collapse") && jSONObject.getBoolean("collapse"));
            } catch (JSONException e11) {
                throw new RuntimeException(e11);
            }
        }
        return stackFrameArr;
    }

    public static StackFrame[] convertJsStackTrace(String str) {
        String[] strArrSplit = str.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        StackFrame[] stackFrameArr = new StackFrame[strArrSplit.length];
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            Matcher matcher = STACK_FRAME_PATTERN1.matcher(strArrSplit[i11]);
            Matcher matcher2 = STACK_FRAME_PATTERN2.matcher(strArrSplit[i11]);
            if (matcher2.find()) {
                matcher = matcher2;
            } else {
                if (!matcher.find()) {
                    stackFrameArr[i11] = new StackFrameImpl((String) null, strArrSplit[i11], -1, -1);
                }
            }
            stackFrameArr[i11] = new StackFrameImpl(matcher.group(2), matcher.group(1) == null ? "(unknown)" : matcher.group(1), Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)));
        }
        return stackFrameArr;
    }
}
