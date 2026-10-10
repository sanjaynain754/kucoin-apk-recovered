package com.jumio.core.extraction.barcode.model;

import android.util.Base64;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.Serializable;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m90084d2 = {"Lcom/jumio/core/extraction/barcode/model/Barcode;", "Ljava/io/Serializable;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "", "bytes", "", "<init>", "(Ljava/lang/String;[B)V", "getFormat", "()Ljava/lang/String;", "getBytes", "()[B", "equals", "", "other", "", "hashCode", "", "toJson", "Lorg/json/JSONObject;", "component1", "component2", "copy", "toString", "jumio-barcode_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Barcode implements Serializable {

    @NotNull
    private final byte[] bytes;

    @NotNull
    private final String format;

    public Barcode(@NotNull String format, @NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.format = format;
        this.bytes = bytes;
    }

    public static /* synthetic */ Barcode copy$default(Barcode barcode, String str, byte[] bArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = barcode.format;
        }
        if ((i11 & 2) != 0) {
            bArr = barcode.bytes;
        }
        return barcode.copy(str, bArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getBytes() {
        return this.bytes;
    }

    @NotNull
    public final Barcode copy(@NotNull String format, @NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new Barcode(format, bytes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Barcode.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.jumio.core.extraction.barcode.model.Barcode");
        Barcode barcode = (Barcode) other;
        if (Intrinsics.areEqual(this.format, barcode.format)) {
            return Arrays.equals(this.bytes, barcode.bytes);
        }
        return false;
    }

    @NotNull
    public final byte[] getBytes() {
        return this.bytes;
    }

    @NotNull
    public final String getFormat() {
        return this.format;
    }

    public int hashCode() {
        return Arrays.hashCode(this.bytes) + (this.format.hashCode() * 31);
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, this.format);
        jSONObject.put("data", Base64.encodeToString(this.bytes, 2));
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "Barcode(format=" + this.format + ", bytes=" + Arrays.toString(this.bytes) + ')';
    }
}
