package com.jumio.commons.camera;

import com.p059BV.LinearGradient.LinearGradientManager;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\u000b¨\u0006\f"}, m90084d2 = {"Lcom/jumio/commons/camera/ImageMetadata;", "Ljava/io/Serializable;", "flash", "", "<init>", "(Z)V", "getFlash", "()Z", "asJson", "Lorg/json/JSONObject;", "Tilted", "Lcom/jumio/commons/camera/ImageMetadata$Tilted;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class ImageMetadata implements Serializable {

    /* JADX INFO: renamed from: a */
    public final boolean f13545a;

    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/jumio/commons/camera/ImageMetadata$Tilted;", "Lcom/jumio/commons/camera/ImageMetadata;", LinearGradientManager.PROP_ANGLE, "", "flash", "", "<init>", "(IZ)V", "getAngle", "()I", "getFlash", "()Z", "asJson", "Lorg/json/JSONObject;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Tilted extends ImageMetadata {

        /* JADX INFO: renamed from: b */
        public final int f13546b;

        /* JADX INFO: renamed from: c */
        public final boolean f13547c;

        public Tilted(int i11, boolean z11) {
            super(z11, null);
            this.f13546b = i11;
            this.f13547c = z11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tilted)) {
                return false;
            }
            Tilted tilted = (Tilted) other;
            return this.f13546b == tilted.f13546b && this.f13547c == tilted.f13547c;
        }

        public static /* synthetic */ Tilted copy$default(Tilted tilted, int i11, boolean z11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = tilted.f13546b;
            }
            if ((i12 & 2) != 0) {
                z11 = tilted.f13547c;
            }
            return tilted.copy(i11, z11);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getF13546b() {
            return this.f13546b;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getF13547c() {
            return this.f13547c;
        }

        @NotNull
        public final Tilted copy(int angle, boolean flash) {
            return new Tilted(angle, flash);
        }

        public final int getAngle() {
            return this.f13546b;
        }

        @Override // com.jumio.commons.camera.ImageMetadata
        /* JADX INFO: renamed from: getFlash */
        public boolean getF13545a() {
            return this.f13547c;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f13547c) + (Integer.hashCode(this.f13546b) * 31);
        }

        @NotNull
        public String toString() {
            return "Tilted(angle=" + this.f13546b + ", flash=" + this.f13547c + ')';
        }

        @Override // com.jumio.commons.camera.ImageMetadata
        @NotNull
        public JSONObject asJson() throws JSONException {
            JSONObject jSONObjectPut = super.asJson().put(LinearGradientManager.PROP_ANGLE, this.f13546b);
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
            return jSONObjectPut;
        }
    }

    @NotNull
    public JSONObject asJson() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("flash", getF13545a());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    /* JADX INFO: renamed from: getFlash, reason: from getter */
    public boolean getF13545a() {
        return this.f13545a;
    }

    public ImageMetadata(boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this.f13545a = z11;
    }
}
