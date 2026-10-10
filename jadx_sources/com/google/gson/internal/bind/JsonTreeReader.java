package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final class JsonTreeReader extends JsonReader {
    private int[] pathIndices;
    private String[] pathNames;
    private Object[] stack;
    private int stackSize;
    private static final Reader UNREADABLE_READER = new Reader() { // from class: com.google.gson.internal.bind.JsonTreeReader.1
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i11, int i12) throws IOException {
            throw new AssertionError();
        }
    };
    private static final Object SENTINEL_CLOSED = new Object();

    private String getPath(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Typography.dollar);
        int i11 = 0;
        while (true) {
            int i12 = this.stackSize;
            if (i11 >= i12) {
                return sb2.toString();
            }
            Object[] objArr = this.stack;
            Object obj = objArr[i11];
            if (obj instanceof JsonArray) {
                i11++;
                if (i11 < i12 && (objArr[i11] instanceof Iterator)) {
                    int i13 = this.pathIndices[i11];
                    if (z11 && i13 > 0 && (i11 == i12 - 1 || i11 == i12 - 2)) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i11 = i11 + 1) < i12 && (objArr[i11] instanceof Iterator)) {
                sb2.append('.');
                String str = this.pathNames[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
            i11++;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPreviousPath() {
        return getPath(true);
    }

    public JsonTreeReader(JsonElement jsonElement) {
        super(UNREADABLE_READER);
        this.stack = new Object[32];
        this.stackSize = 0;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        push(jsonElement);
    }

    private String locationString() {
        return " at path " + getPath();
    }

    private Object peekStack() {
        return this.stack[this.stackSize - 1];
    }

    private Object popStack() {
        Object[] objArr = this.stack;
        int i11 = this.stackSize - 1;
        this.stackSize = i11;
        Object obj = objArr[i11];
        objArr[i11] = null;
        return obj;
    }

    private void push(Object obj) {
        int i11 = this.stackSize;
        Object[] objArr = this.stack;
        if (i11 == objArr.length) {
            int i12 = i11 * 2;
            this.stack = Arrays.copyOf(objArr, i12);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i12);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i12);
        }
        Object[] objArr2 = this.stack;
        int i13 = this.stackSize;
        this.stackSize = i13 + 1;
        objArr2[i13] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        expect(JsonToken.BEGIN_ARRAY);
        push(((JsonArray) peekStack()).iterator());
        this.pathIndices[this.stackSize - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        expect(JsonToken.BEGIN_OBJECT);
        push(((JsonObject) peekStack()).entrySet().iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.stack = new Object[]{SENTINEL_CLOSED};
        this.stackSize = 1;
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        expect(JsonToken.END_ARRAY);
        popStack();
        popStack();
        int i11 = this.stackSize;
        if (i11 > 0) {
            int[] iArr = this.pathIndices;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        expect(JsonToken.END_OBJECT);
        popStack();
        popStack();
        int i11 = this.stackSize;
        if (i11 > 0) {
            int[] iArr = this.pathIndices;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        expect(JsonToken.BOOLEAN);
        boolean asBoolean = ((JsonPrimitive) popStack()).getAsBoolean();
        int i11 = this.stackSize;
        if (i11 > 0) {
            int[] iArr = this.pathIndices;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return asBoolean;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        String str = (String) entry.getKey();
        this.pathNames[this.stackSize - 1] = str;
        push(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        expect(JsonToken.NULL);
        popStack();
        int i11 = this.stackSize;
        if (i11 > 0) {
            int[] iArr = this.pathIndices;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.stackSize == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objPeekStack = peekStack();
        if (objPeekStack instanceof Iterator) {
            boolean z11 = this.stack[this.stackSize - 2] instanceof JsonObject;
            Iterator it = (Iterator) objPeekStack;
            if (!it.hasNext()) {
                return z11 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z11) {
                return JsonToken.NAME;
            }
            push(it.next());
            return peek();
        }
        if (objPeekStack instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objPeekStack instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (!(objPeekStack instanceof JsonPrimitive)) {
            if (objPeekStack instanceof JsonNull) {
                return JsonToken.NULL;
            }
            if (objPeekStack == SENTINEL_CLOSED) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) objPeekStack;
        if (jsonPrimitive.isString()) {
            return JsonToken.STRING;
        }
        if (jsonPrimitive.isBoolean()) {
            return JsonToken.BOOLEAN;
        }
        if (jsonPrimitive.isNumber()) {
            return JsonToken.NUMBER;
        }
        throw new AssertionError();
    }

    public void promoteNameToValue() throws IOException {
        expect(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) peekStack()).next();
        push(entry.getValue());
        push(new JsonPrimitive((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return JsonTreeReader.class.getSimpleName() + locationString();
    }

    private void expect(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_DOCUMENT) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        double asDouble = ((JsonPrimitive) peekStack()).getAsDouble();
        if (!isLenient() && (Double.isNaN(asDouble) || Double.isInfinite(asDouble))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + asDouble);
        }
        popStack();
        int i11 = this.stackSize;
        if (i11 > 0) {
            int[] iArr = this.pathIndices;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return asDouble;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        int asInt = ((JsonPrimitive) peekStack()).getAsInt();
        popStack();
        int i11 = this.stackSize;
        if (i11 > 0) {
            int[] iArr = this.pathIndices;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return asInt;
    }

    public JsonElement nextJsonElement() throws IOException {
        JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != JsonToken.NAME && jsonTokenPeek != JsonToken.END_ARRAY && jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_DOCUMENT) {
            JsonElement jsonElement = (JsonElement) peekStack();
            skipValue();
            return jsonElement;
        }
        throw new IllegalStateException("Unexpected " + jsonTokenPeek + " when reading a JsonElement.");
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        long asLong = ((JsonPrimitive) peekStack()).getAsLong();
        popStack();
        int i11 = this.stackSize;
        if (i11 > 0) {
            int[] iArr = this.pathIndices;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return asLong;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        String asString = ((JsonPrimitive) popStack()).getAsString();
        int i11 = this.stackSize;
        if (i11 > 0) {
            int[] iArr = this.pathIndices;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
        return asString;
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.pathNames[this.stackSize - 2] = "null";
        } else {
            popStack();
            int i11 = this.stackSize;
            if (i11 > 0) {
                this.pathNames[i11 - 1] = "null";
            }
        }
        int i12 = this.stackSize;
        if (i12 > 0) {
            int[] iArr = this.pathIndices;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        return getPath(false);
    }
}
