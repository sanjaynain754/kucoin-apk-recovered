package com.jumio.core.models;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.jumio.core.extraction.docfinder.classifier.DocumentClassifier;
import java.io.Serializable;
import jumio.core.AbstractC40637b0;
import jumio.core.AbstractC40749x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 '2\u00020\u0001:\u0001'B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JG\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m90084d2 = {"Lcom/jumio/core/models/SupplementalImage;", "Ljava/io/Serializable;", DocumentClassifier.KEY_SIDE, "", "flash", "", "tiltRange", "Lcom/jumio/core/models/TiltRange;", "usabilityExpected", "holdStillTime", "", "flashSettings", "Lcom/jumio/core/models/FlashSettings;", "<init>", "(Ljava/lang/String;ZLcom/jumio/core/models/TiltRange;ZJLcom/jumio/core/models/FlashSettings;)V", "getClassifier", "()Ljava/lang/String;", "getFlash", "()Z", "getTiltRange", "()Lcom/jumio/core/models/TiltRange;", "getUsabilityExpected", "getHoldStillTime", "()J", "getFlashSettings", "()Lcom/jumio/core/models/FlashSettings;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SupplementalImage implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final String f14351a;

    /* JADX INFO: renamed from: b */
    public final boolean f14352b;

    /* JADX INFO: renamed from: c */
    public final TiltRange f14353c;

    /* JADX INFO: renamed from: d */
    public final boolean f14354d;

    /* JADX INFO: renamed from: e */
    public final long f14355e;

    /* JADX INFO: renamed from: f */
    public final FlashSettings f14356f;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/SupplementalImage$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/SupplementalImage;", JPushConstants.Analysis.KEY_JSON, "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSupplementalImageModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupplementalImageModel.kt\ncom/jumio/core/models/SupplementalImage$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
    public static final class Companion {
        @NotNull
        public final SupplementalImage fromJson(@NotNull JSONObject json) {
            FlashSettings flashSettingsFromJson;
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = json.optString(DocumentClassifier.KEY_SIDE, "N/A");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            boolean zOptBoolean = json.optBoolean("flash", false);
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("tilted");
            TiltRange tiltRangeFromJson = jSONObjectOptJSONObject != null ? TiltRange.INSTANCE.fromJson(jSONObjectOptJSONObject) : null;
            boolean zOptBoolean2 = json.optBoolean("usabilityExpected", false);
            long jOptLong = json.optLong("holdStillTime", 0L);
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject("flashSettings");
            return new SupplementalImage(strOptString, zOptBoolean, tiltRangeFromJson, zOptBoolean2, jOptLong, (jSONObjectOptJSONObject2 == null || (flashSettingsFromJson = FlashSettings.INSTANCE.fromJson(jSONObjectOptJSONObject2)) == null) ? new FlashSettings(null, null, 0L, 7, null) : flashSettingsFromJson);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupplementalImage)) {
            return false;
        }
        SupplementalImage supplementalImage = (SupplementalImage) other;
        return Intrinsics.areEqual(this.f14351a, supplementalImage.f14351a) && this.f14352b == supplementalImage.f14352b && Intrinsics.areEqual(this.f14353c, supplementalImage.f14353c) && this.f14354d == supplementalImage.f14354d && this.f14355e == supplementalImage.f14355e && Intrinsics.areEqual(this.f14356f, supplementalImage.f14356f);
    }

    public SupplementalImage(@NotNull String classifier, boolean z11, @Nullable TiltRange tiltRange, boolean z12, long j11, @NotNull FlashSettings flashSettings) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(flashSettings, "flashSettings");
        this.f14351a = classifier;
        this.f14352b = z11;
        this.f14353c = tiltRange;
        this.f14354d = z12;
        this.f14355e = j11;
        this.f14356f = flashSettings;
    }

    public static /* synthetic */ SupplementalImage copy$default(SupplementalImage supplementalImage, String str, boolean z11, TiltRange tiltRange, boolean z12, long j11, FlashSettings flashSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = supplementalImage.f14351a;
        }
        if ((i11 & 2) != 0) {
            z11 = supplementalImage.f14352b;
        }
        if ((i11 & 4) != 0) {
            tiltRange = supplementalImage.f14353c;
        }
        if ((i11 & 8) != 0) {
            z12 = supplementalImage.f14354d;
        }
        if ((i11 & 16) != 0) {
            j11 = supplementalImage.f14355e;
        }
        if ((i11 & 32) != 0) {
            flashSettings = supplementalImage.f14356f;
        }
        FlashSettings flashSettings2 = flashSettings;
        long j12 = j11;
        return supplementalImage.copy(str, z11, tiltRange, z12, j12, flashSettings2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF14351a() {
        return this.f14351a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getF14352b() {
        return this.f14352b;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TiltRange getF14353c() {
        return this.f14353c;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getF14354d() {
        return this.f14354d;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getF14355e() {
        return this.f14355e;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final FlashSettings getF14356f() {
        return this.f14356f;
    }

    @NotNull
    public final SupplementalImage copy(@NotNull String classifier, boolean flash, @Nullable TiltRange tiltRange, boolean usabilityExpected, long holdStillTime, @NotNull FlashSettings flashSettings) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(flashSettings, "flashSettings");
        return new SupplementalImage(classifier, flash, tiltRange, usabilityExpected, holdStillTime, flashSettings);
    }

    @NotNull
    public final String getClassifier() {
        return this.f14351a;
    }

    public final boolean getFlash() {
        return this.f14352b;
    }

    @NotNull
    public final FlashSettings getFlashSettings() {
        return this.f14356f;
    }

    public final long getHoldStillTime() {
        return this.f14355e;
    }

    @Nullable
    public final TiltRange getTiltRange() {
        return this.f14353c;
    }

    public final boolean getUsabilityExpected() {
        return this.f14354d;
    }

    public int hashCode() {
        int iM89251a = AbstractC40637b0.m89251a(this.f14352b, this.f14351a.hashCode() * 31, 31);
        TiltRange tiltRange = this.f14353c;
        return this.f14356f.hashCode() + AbstractC40749x1.m89269a(this.f14355e, AbstractC40637b0.m89251a(this.f14354d, (iM89251a + (tiltRange == null ? 0 : tiltRange.hashCode())) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "SupplementalImage(classifier=" + this.f14351a + ", flash=" + this.f14352b + ", tiltRange=" + this.f14353c + ", usabilityExpected=" + this.f14354d + ", holdStillTime=" + this.f14355e + ", flashSettings=" + this.f14356f + ')';
    }
}
