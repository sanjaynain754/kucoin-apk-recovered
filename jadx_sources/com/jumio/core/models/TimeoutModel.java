package com.jumio.core.models;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import jumio.core.AbstractC40653e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001,Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jm\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006-"}, m90084d2 = {"Lcom/jumio/core/models/TimeoutModel;", "Lcom/jumio/core/model/StaticModel;", "upload", "", "uploadHighResolution", "usability", "finalize", "extractdata", "analytics", "reporting", "cdn", "authentication", "reusableIdLookUp", "<init>", "(IIIIIIIIII)V", "getUpload", "()I", "getUploadHighResolution", "getUsability", "getFinalize", "getExtractdata", "getAnalytics", "getReporting", "getCdn", "getAuthentication", "getReusableIdLookUp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("TimeoutModel")
public final /* data */ class TimeoutModel implements StaticModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final int f14370a;

    /* JADX INFO: renamed from: b */
    public final int f14371b;

    /* JADX INFO: renamed from: c */
    public final int f14372c;

    /* JADX INFO: renamed from: d */
    public final int f14373d;

    /* JADX INFO: renamed from: e */
    public final int f14374e;

    /* JADX INFO: renamed from: f */
    public final int f14375f;

    /* JADX INFO: renamed from: g */
    public final int f14376g;

    /* JADX INFO: renamed from: h */
    public final int f14377h;

    /* JADX INFO: renamed from: i */
    public final int f14378i;

    /* JADX INFO: renamed from: j */
    public final int f14379j;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/TimeoutModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/TimeoutModel;", "jsonObject", "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        @NotNull
        public final TimeoutModel fromJson(@NotNull JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            return new TimeoutModel(jsonObject.optInt("upload", AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH), jsonObject.optInt("upload4K", 10000), jsonObject.optInt("usability", 15000), jsonObject.optInt("finalize", 10000), jsonObject.optInt("extractdata", AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH), jsonObject.optInt("analytics", 10000), jsonObject.optInt("reporting", 10000), jsonObject.optInt("cdn", 30000), jsonObject.optInt("authentication", 15000), jsonObject.optInt("lookup", 15000));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public TimeoutModel() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1023, null);
    }

    public static /* synthetic */ TimeoutModel copy$default(TimeoutModel timeoutModel, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, Object obj) {
        if ((i22 & 1) != 0) {
            i11 = timeoutModel.f14370a;
        }
        if ((i22 & 2) != 0) {
            i12 = timeoutModel.f14371b;
        }
        if ((i22 & 4) != 0) {
            i13 = timeoutModel.f14372c;
        }
        if ((i22 & 8) != 0) {
            i14 = timeoutModel.f14373d;
        }
        if ((i22 & 16) != 0) {
            i15 = timeoutModel.f14374e;
        }
        if ((i22 & 32) != 0) {
            i16 = timeoutModel.f14375f;
        }
        if ((i22 & 64) != 0) {
            i17 = timeoutModel.f14376g;
        }
        if ((i22 & 128) != 0) {
            i18 = timeoutModel.f14377h;
        }
        if ((i22 & 256) != 0) {
            i19 = timeoutModel.f14378i;
        }
        if ((i22 & 512) != 0) {
            i21 = timeoutModel.f14379j;
        }
        int i23 = i19;
        int i24 = i21;
        int i25 = i17;
        int i26 = i18;
        int i27 = i15;
        int i28 = i16;
        return timeoutModel.copy(i11, i12, i13, i14, i27, i28, i25, i26, i23, i24);
    }

    @NotNull
    public final TimeoutModel copy(int upload, int uploadHighResolution, int usability, int finalize, int extractdata, int analytics, int reporting, int cdn, int authentication, int reusableIdLookUp) {
        return new TimeoutModel(upload, uploadHighResolution, usability, finalize, extractdata, analytics, reporting, cdn, authentication, reusableIdLookUp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeoutModel)) {
            return false;
        }
        TimeoutModel timeoutModel = (TimeoutModel) other;
        return this.f14370a == timeoutModel.f14370a && this.f14371b == timeoutModel.f14371b && this.f14372c == timeoutModel.f14372c && this.f14373d == timeoutModel.f14373d && this.f14374e == timeoutModel.f14374e && this.f14375f == timeoutModel.f14375f && this.f14376g == timeoutModel.f14376g && this.f14377h == timeoutModel.f14377h && this.f14378i == timeoutModel.f14378i && this.f14379j == timeoutModel.f14379j;
    }

    public TimeoutModel(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
        this.f14370a = i11;
        this.f14371b = i12;
        this.f14372c = i13;
        this.f14373d = i14;
        this.f14374e = i15;
        this.f14375f = i16;
        this.f14376g = i17;
        this.f14377h = i18;
        this.f14378i = i19;
        this.f14379j = i21;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getF14370a() {
        return this.f14370a;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getF14379j() {
        return this.f14379j;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getF14371b() {
        return this.f14371b;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getF14372c() {
        return this.f14372c;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getF14373d() {
        return this.f14373d;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getF14374e() {
        return this.f14374e;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getF14375f() {
        return this.f14375f;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getF14376g() {
        return this.f14376g;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getF14377h() {
        return this.f14377h;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getF14378i() {
        return this.f14378i;
    }

    public final int getAnalytics() {
        return this.f14375f;
    }

    public final int getAuthentication() {
        return this.f14378i;
    }

    public final int getCdn() {
        return this.f14377h;
    }

    public final int getExtractdata() {
        return this.f14374e;
    }

    public final int getFinalize() {
        return this.f14373d;
    }

    public final int getReporting() {
        return this.f14376g;
    }

    public final int getReusableIdLookUp() {
        return this.f14379j;
    }

    public final int getUpload() {
        return this.f14370a;
    }

    public final int getUploadHighResolution() {
        return this.f14371b;
    }

    public final int getUsability() {
        return this.f14372c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f14379j) + AbstractC40653e0.m89252a(this.f14378i, AbstractC40653e0.m89252a(this.f14377h, AbstractC40653e0.m89252a(this.f14376g, AbstractC40653e0.m89252a(this.f14375f, AbstractC40653e0.m89252a(this.f14374e, AbstractC40653e0.m89252a(this.f14373d, AbstractC40653e0.m89252a(this.f14372c, AbstractC40653e0.m89252a(this.f14371b, Integer.hashCode(this.f14370a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @NotNull
    public String toString() {
        return "TimeoutModel(upload=" + this.f14370a + ", uploadHighResolution=" + this.f14371b + ", usability=" + this.f14372c + ", finalize=" + this.f14373d + ", extractdata=" + this.f14374e + ", analytics=" + this.f14375f + ", reporting=" + this.f14376g + ", cdn=" + this.f14377h + ", authentication=" + this.f14378i + ", reusableIdLookUp=" + this.f14379j + ')';
    }

    public /* synthetic */ TimeoutModel(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, DefaultConstructorMarker defaultConstructorMarker) {
        this((i22 & 1) != 0 ? 20000 : i11, (i22 & 2) != 0 ? 10000 : i12, (i22 & 4) != 0 ? 15000 : i13, (i22 & 8) != 0 ? 10000 : i14, (i22 & 16) != 0 ? 20000 : i15, (i22 & 32) != 0 ? 10000 : i16, (i22 & 64) != 0 ? 10000 : i17, (i22 & 128) != 0 ? 30000 : i18, (i22 & 256) != 0 ? 15000 : i19, (i22 & 512) != 0 ? 18000 : i21);
    }
}
