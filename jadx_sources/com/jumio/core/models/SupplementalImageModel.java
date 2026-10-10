package com.jumio.core.models;

import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import com.jumio.core.models.SupplementalImageModel;
import com.jumio.core.util.JsonUtilKt;
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
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/jumio/core/models/SupplementalImageModel;", "Lcom/jumio/core/model/StaticModel;", "imageConfigs", "", "Lcom/jumio/core/models/SupplementalImageConfig;", "<init>", "(Ljava/util/List;)V", "getImageConfigs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("SupplementalImageModel")
public final /* data */ class SupplementalImageModel implements StaticModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final List f14363a;

    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/models/SupplementalImageModel$Companion;", "", "<init>", "()V", "fromJson", "Lcom/jumio/core/models/SupplementalImageModel;", "jsonArray", "Lorg/json/JSONArray;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static final SupplementalImageConfig m14569a(JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return SupplementalImageConfig.INSTANCE.fromJson(it);
        }

        @NotNull
        public final SupplementalImageModel fromJson(@NotNull JSONArray jsonArray) {
            Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
            return new SupplementalImageModel(JsonUtilKt.map(jsonArray, new Function1() { // from class: r9.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupplementalImageModel.Companion.m14569a((JSONObject) obj);
                }
            }));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SupplementalImageModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SupplementalImageModel) && Intrinsics.areEqual(this.f14363a, ((SupplementalImageModel) other).f14363a);
    }

    public SupplementalImageModel(@NotNull List<SupplementalImageConfig> imageConfigs) {
        Intrinsics.checkNotNullParameter(imageConfigs, "imageConfigs");
        this.f14363a = imageConfigs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupplementalImageModel copy$default(SupplementalImageModel supplementalImageModel, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = supplementalImageModel.f14363a;
        }
        return supplementalImageModel.copy(list);
    }

    @NotNull
    public final List<SupplementalImageConfig> component1() {
        return this.f14363a;
    }

    @NotNull
    public final SupplementalImageModel copy(@NotNull List<SupplementalImageConfig> imageConfigs) {
        Intrinsics.checkNotNullParameter(imageConfigs, "imageConfigs");
        return new SupplementalImageModel(imageConfigs);
    }

    @NotNull
    public final List<SupplementalImageConfig> getImageConfigs() {
        return this.f14363a;
    }

    public int hashCode() {
        return this.f14363a.hashCode();
    }

    @NotNull
    public String toString() {
        return "SupplementalImageModel(imageConfigs=" + this.f14363a + ')';
    }

    public /* synthetic */ SupplementalImageModel(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
