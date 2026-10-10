package com.kubi.experiment.core;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExperimentConfig.kt */
/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m90084d2 = {"Lcom/kubi/experiment/core/ExperimentConfig;", "Landroid/os/Parcelable;", "values", "", "", "", "version", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "getValues", "()Ljava/util/Map;", "getVersion", "()Ljava/lang/String;", "valueOf", "code", "valueOf$LExperiment_googleRelease", "(Ljava/lang/String;)Ljava/lang/Boolean;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LExperiment_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ExperimentConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExperimentConfig> CREATOR = new C12579a();

    @NotNull
    private final Map<String, Boolean> values;

    @NotNull
    private final String version;

    /* JADX INFO: renamed from: com.kubi.experiment.core.ExperimentConfig$a */
    /* JADX INFO: compiled from: ExperimentConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12579a implements Parcelable.Creator<ExperimentConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExperimentConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i11 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                linkedHashMap.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
            }
            return new ExperimentConfig(linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ExperimentConfig[] newArray(int i11) {
            return new ExperimentConfig[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExperimentConfig copy$default(ExperimentConfig experimentConfig, Map map, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = experimentConfig.values;
        }
        if ((i11 & 2) != 0) {
            str = experimentConfig.version;
        }
        return experimentConfig.copy(map, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperimentConfig)) {
            return false;
        }
        ExperimentConfig experimentConfig = (ExperimentConfig) other;
        return Intrinsics.areEqual(this.values, experimentConfig.values) && Intrinsics.areEqual(this.version, experimentConfig.version);
    }

    public ExperimentConfig(@NotNull Map<String, Boolean> values, @NotNull String version) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(version, "version");
        this.values = values;
        this.version = version;
    }

    @NotNull
    public final Map<String, Boolean> component1() {
        return this.values;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final ExperimentConfig copy(@NotNull Map<String, Boolean> values, @NotNull String version) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(version, "version");
        return new ExperimentConfig(values, version);
    }

    @NotNull
    public final Map<String, Boolean> getValues() {
        return this.values;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.values.hashCode() * 31) + this.version.hashCode();
    }

    @NotNull
    public String toString() {
        return "ExperimentConfig(values=" + this.values + ", version=" + this.version + ')';
    }

    @Nullable
    public final Boolean valueOf$LExperiment_googleRelease(@NotNull String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        return this.values.get(code);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Map<String, Boolean> map = this.values;
        dest.writeInt(map.size());
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeInt(entry.getValue().booleanValue() ? 1 : 0);
        }
        dest.writeString(this.version);
    }
}
