package com.jumio.core.models;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.jumio.core.constants.ConstantsKt;
import com.jumio.core.models.SupplementalImageConfig;
import com.jumio.core.util.JsonUtilKt;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m90084d2 = {"Lcom/jumio/core/models/SupplementalImageConfig;", "Ljava/io/Serializable;", "side", "", "category", "Lcom/jumio/core/models/SupplementalImageCategory;", "images", "", "Lcom/jumio/core/models/SupplementalImage;", "manualEnabled", "", "<init>", "(Ljava/lang/String;Lcom/jumio/core/models/SupplementalImageCategory;Ljava/util/List;Z)V", "getSide", "()Ljava/lang/String;", "getCategory", "()Lcom/jumio/core/models/SupplementalImageCategory;", "getImages", "()Ljava/util/List;", "getManualEnabled", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SupplementalImageConfig implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final String f14359a;

    /* JADX INFO: renamed from: b */
    public final SupplementalImageCategory f14360b;

    /* JADX INFO: renamed from: c */
    public final List f14361c;

    /* JADX INFO: renamed from: d */
    public final boolean f14362d;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/SupplementalImageConfig$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/SupplementalImageConfig;", JPushConstants.Analysis.KEY_JSON, "Lorg/json/JSONObject;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static final SupplementalImage m14568a(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SupplementalImage.INSTANCE.fromJson(it);
        }

        @NotNull
        public final SupplementalImageConfig fromJson(@NotNull JSONObject json) {
            List listEmptyList;
            Intrinsics.checkNotNullParameter(json, "json");
            String strOptString = json.optString("side", ConstantsKt.FACE_CAPTURE_MODE_FRONT);
            SupplementalImageCategory supplementalImageCategory = (SupplementalImageCategory) JsonUtilKt.optEnum(json, "category", SupplementalImageCategory.UNSUPPORTED);
            boolean zOptBoolean = json.optBoolean("manualEnabled", false);
            JSONArray jSONArrayOptJSONArray = json.optJSONArray("images");
            if (jSONArrayOptJSONArray == null || (listEmptyList = JsonUtilKt.map(jSONArrayOptJSONArray, new Function1() { // from class: r9.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupplementalImageConfig.Companion.m14568a((JSONObject) obj);
                }
            })) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            Intrinsics.checkNotNull(strOptString);
            return new SupplementalImageConfig(strOptString, supplementalImageCategory, listEmptyList, zOptBoolean);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public SupplementalImageConfig(@NotNull String side, @NotNull SupplementalImageCategory category, @NotNull List<SupplementalImage> images, boolean z11) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(images, "images");
        this.f14359a = side;
        this.f14360b = category;
        this.f14361c = images;
        this.f14362d = z11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupplementalImageConfig)) {
            return false;
        }
        SupplementalImageConfig supplementalImageConfig = (SupplementalImageConfig) other;
        return Intrinsics.areEqual(this.f14359a, supplementalImageConfig.f14359a) && this.f14360b == supplementalImageConfig.f14360b && Intrinsics.areEqual(this.f14361c, supplementalImageConfig.f14361c) && this.f14362d == supplementalImageConfig.f14362d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupplementalImageConfig copy$default(SupplementalImageConfig supplementalImageConfig, String str, SupplementalImageCategory supplementalImageCategory, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = supplementalImageConfig.f14359a;
        }
        if ((i11 & 2) != 0) {
            supplementalImageCategory = supplementalImageConfig.f14360b;
        }
        if ((i11 & 4) != 0) {
            list = supplementalImageConfig.f14361c;
        }
        if ((i11 & 8) != 0) {
            z11 = supplementalImageConfig.f14362d;
        }
        return supplementalImageConfig.copy(str, supplementalImageCategory, list, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF14359a() {
        return this.f14359a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SupplementalImageCategory getF14360b() {
        return this.f14360b;
    }

    @NotNull
    public final List<SupplementalImage> component3() {
        return this.f14361c;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getF14362d() {
        return this.f14362d;
    }

    @NotNull
    public final SupplementalImageConfig copy(@NotNull String side, @NotNull SupplementalImageCategory category, @NotNull List<SupplementalImage> images, boolean manualEnabled) {
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(images, "images");
        return new SupplementalImageConfig(side, category, images, manualEnabled);
    }

    @NotNull
    public final SupplementalImageCategory getCategory() {
        return this.f14360b;
    }

    @NotNull
    public final List<SupplementalImage> getImages() {
        return this.f14361c;
    }

    public final boolean getManualEnabled() {
        return this.f14362d;
    }

    @NotNull
    public final String getSide() {
        return this.f14359a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f14362d) + ((this.f14361c.hashCode() + ((this.f14360b.hashCode() + (this.f14359a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "SupplementalImageConfig(side=" + this.f14359a + ", category=" + this.f14360b + ", images=" + this.f14361c + ", manualEnabled=" + this.f14362d + ')';
    }

    public /* synthetic */ SupplementalImageConfig(String str, SupplementalImageCategory supplementalImageCategory, List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, supplementalImageCategory, list, (i11 & 8) != 0 ? false : z11);
    }
}
