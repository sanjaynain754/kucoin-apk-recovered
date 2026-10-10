package com.jumio.core.models;

import cn.jiguang.privates.push.constants.JPushConstants;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/jumio/core/models/TiltRange;", "Ljava/io/Serializable;", "minAngle", "", "maxAngle", "<init>", "(II)V", "getMinAngle", "()I", "getMaxAngle", "isValid", "", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TiltRange implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final int f14366a;

    /* JADX INFO: renamed from: b */
    public final int f14367b;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/TiltRange$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/TiltRange;", JPushConstants.Analysis.KEY_JSON, "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final TiltRange fromJson(@NotNull JSONObject json) {
            Intrinsics.checkNotNullParameter(json, "json");
            return new TiltRange(json.optInt("minAngle", 0), json.optInt("maxAngle", 0));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TiltRange)) {
            return false;
        }
        TiltRange tiltRange = (TiltRange) other;
        return this.f14366a == tiltRange.f14366a && this.f14367b == tiltRange.f14367b;
    }

    public static /* synthetic */ TiltRange copy$default(TiltRange tiltRange, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = tiltRange.f14366a;
        }
        if ((i13 & 2) != 0) {
            i12 = tiltRange.f14367b;
        }
        return tiltRange.copy(i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getF14366a() {
        return this.f14366a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getF14367b() {
        return this.f14367b;
    }

    @NotNull
    public final TiltRange copy(int minAngle, int maxAngle) {
        return new TiltRange(minAngle, maxAngle);
    }

    public final int getMaxAngle() {
        return this.f14367b;
    }

    public final int getMinAngle() {
        return this.f14366a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f14367b) + (Integer.hashCode(this.f14366a) * 31);
    }

    public final boolean isValid() {
        return this.f14366a > 0 && this.f14367b > 0;
    }

    @NotNull
    public String toString() {
        return "TiltRange(minAngle=" + this.f14366a + ", maxAngle=" + this.f14367b + ')';
    }

    public TiltRange(int i11, int i12) {
        this.f14366a = i11;
        this.f14367b = i12;
    }
}
