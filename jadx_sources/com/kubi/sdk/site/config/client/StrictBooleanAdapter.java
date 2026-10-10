package com.kubi.sdk.site.config.client;

import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RemoteConfigClient.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/site/config/client/StrictBooleanAdapter;", "Lcom/google/gson/TypeAdapter;", "", "<init>", "()V", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Boolean;)V", "read", "in", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Boolean;", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StrictBooleanAdapter extends TypeAdapter<Boolean> {

    /* JADX INFO: renamed from: com.kubi.sdk.site.config.client.StrictBooleanAdapter$a */
    /* JADX INFO: compiled from: RemoteConfigClient.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C24134a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[JsonToken.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    @NotNull
    /* JADX INFO: renamed from: read */
    public Boolean read2(@NotNull JsonReader in2) throws JsonParseException, IOException {
        Intrinsics.checkNotNullParameter(in2, "in");
        JsonToken jsonTokenPeek = in2.peek();
        if ((jsonTokenPeek == null ? -1 : C24134a.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()]) == 1) {
            return Boolean.valueOf(in2.nextBoolean());
        }
        throw new JsonParseException("Expected BOOLEAN but was " + in2.peek());
    }

    @Override // com.google.gson.TypeAdapter
    public void write(@NotNull JsonWriter out, @Nullable Boolean value) throws JsonParseException, IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        out.value(value);
    }
}
