package com.kubi.utils;

import androidx.annotation.Keep;
import androidx.credentials.provider.CredentialEntry;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BooleanTypeAdapter.kt */
/* JADX INFO: loaded from: classes54.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/utils/BooleanTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "", "<init>", "()V", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Boolean;)V", "read", "in", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Boolean;", "toBoolean", "name", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BooleanTypeAdapter extends TypeAdapter<Boolean> {

    /* JADX INFO: renamed from: com.kubi.utils.BooleanTypeAdapter$a */
    /* JADX INFO: compiled from: BooleanTypeAdapter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C27002a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[JsonToken.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonToken.NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JsonToken.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    @Nullable
    /* JADX INFO: renamed from: read */
    public Boolean read2(@Nullable JsonReader in2) throws IOException {
        JsonToken jsonTokenPeek = in2 != null ? in2.peek() : null;
        int i11 = jsonTokenPeek == null ? -1 : C27002a.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
        if (i11 == 1) {
            return Boolean.valueOf(in2.nextBoolean());
        }
        if (i11 == 2) {
            return null;
        }
        if (i11 == 3) {
            return Boolean.valueOf(in2.nextInt() != 0);
        }
        if (i11 == 4) {
            String strNextString = in2.nextString();
            Intrinsics.checkNotNullExpressionValue(strNextString, "nextString(...)");
            return Boolean.valueOf(toBoolean(strNextString));
        }
        throw new JsonParseException("Expected Boolean or Number but was " + jsonTokenPeek);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(@Nullable JsonWriter out, @Nullable Boolean value) throws IOException {
        if (value == null) {
            if (out != null) {
                out.nullValue();
            }
        } else if (out != null) {
            out.value(value.booleanValue());
        }
    }

    private final boolean toBoolean(String name) {
        if (name.length() > 0) {
            if (StringsKt.equals(name, CredentialEntry.TRUE_STRING, true) || !Intrinsics.areEqual(name, "0")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
