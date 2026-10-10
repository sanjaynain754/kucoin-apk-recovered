package com.jumio.core.models;

import cn.jiguang.privates.push.constants.JPushConstants;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m90084d2 = {"Lcom/jumio/core/models/FlashSettings;", "Ljava/io/Serializable;", "flashDetection", "Lcom/jumio/core/models/FlashDetection;", "flashAdaption", "Lcom/jumio/core/models/FlashAdaption;", "minimumCaptureTime", "", "<init>", "(Lcom/jumio/core/models/FlashDetection;Lcom/jumio/core/models/FlashAdaption;J)V", "getFlashDetection", "()Lcom/jumio/core/models/FlashDetection;", "getFlashAdaption", "()Lcom/jumio/core/models/FlashAdaption;", "getMinimumCaptureTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FlashSettings implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final FlashDetection f14251a;

    /* JADX INFO: renamed from: b */
    public final FlashAdaption f14252b;

    /* JADX INFO: renamed from: c */
    public final long f14253c;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/FlashSettings$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/FlashSettings;", JPushConstants.Analysis.KEY_JSON, "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSupplementalImageModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupplementalImageModel.kt\ncom/jumio/core/models/FlashSettings$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
    public static final class Companion {
        @NotNull
        public final FlashSettings fromJson(@NotNull JSONObject json) {
            FlashDetection flashDetection;
            FlashAdaption flashAdaption;
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("detection");
            if (jSONObjectOptJSONObject == null || (flashDetection = FlashDetection.INSTANCE.fromJson(jSONObjectOptJSONObject)) == null) {
                flashDetection = new FlashDetection(0.0d, 0L, 3, null);
            }
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("adaption");
            if (jSONObjectOptJSONObject2 == null || (flashAdaption = FlashAdaption.INSTANCE.fromJson(jSONObjectOptJSONObject2)) == null) {
                flashAdaption = new FlashAdaption(0.0d, 0L, 0L, 7, null);
            }
            return new FlashSettings(flashDetection, flashAdaption, (long) (json.optDouble("minimumCaptureTime", 0.4d) * ((double) 1000)));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public FlashSettings() {
        this(null, null, 0L, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlashSettings)) {
            return false;
        }
        FlashSettings flashSettings = (FlashSettings) other;
        return Intrinsics.areEqual(this.f14251a, flashSettings.f14251a) && Intrinsics.areEqual(this.f14252b, flashSettings.f14252b) && this.f14253c == flashSettings.f14253c;
    }

    public FlashSettings(@NotNull FlashDetection flashDetection, @NotNull FlashAdaption flashAdaption, long j11) {
        Intrinsics.checkNotNullParameter(flashDetection, "flashDetection");
        Intrinsics.checkNotNullParameter(flashAdaption, "flashAdaption");
        this.f14251a = flashDetection;
        this.f14252b = flashAdaption;
        this.f14253c = j11;
    }

    public static /* synthetic */ FlashSettings copy$default(FlashSettings flashSettings, FlashDetection flashDetection, FlashAdaption flashAdaption, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            flashDetection = flashSettings.f14251a;
        }
        if ((i11 & 2) != 0) {
            flashAdaption = flashSettings.f14252b;
        }
        if ((i11 & 4) != 0) {
            j11 = flashSettings.f14253c;
        }
        return flashSettings.copy(flashDetection, flashAdaption, j11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FlashDetection getF14251a() {
        return this.f14251a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FlashAdaption getF14252b() {
        return this.f14252b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getF14253c() {
        return this.f14253c;
    }

    @NotNull
    public final FlashSettings copy(@NotNull FlashDetection flashDetection, @NotNull FlashAdaption flashAdaption, long minimumCaptureTime) {
        Intrinsics.checkNotNullParameter(flashDetection, "flashDetection");
        Intrinsics.checkNotNullParameter(flashAdaption, "flashAdaption");
        return new FlashSettings(flashDetection, flashAdaption, minimumCaptureTime);
    }

    @NotNull
    public final FlashAdaption getFlashAdaption() {
        return this.f14252b;
    }

    @NotNull
    public final FlashDetection getFlashDetection() {
        return this.f14251a;
    }

    public final long getMinimumCaptureTime() {
        return this.f14253c;
    }

    public int hashCode() {
        return Long.hashCode(this.f14253c) + ((this.f14252b.hashCode() + (this.f14251a.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FlashSettings(flashDetection=" + this.f14251a + ", flashAdaption=" + this.f14252b + ", minimumCaptureTime=" + this.f14253c + ')';
    }

    public FlashSettings(FlashDetection flashDetection, FlashAdaption flashAdaption, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new FlashDetection(0.0d, 0L, 3, null) : flashDetection, (i11 & 2) != 0 ? new FlashAdaption(0.0d, 0L, 0L, 7, null) : flashAdaption, (i11 & 4) != 0 ? (long) (((double) 1000) * 0.4d) : j11);
    }
}
