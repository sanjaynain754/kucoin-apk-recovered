package com.kubi.config.kcrc;

import androidx.annotation.Keep;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCRemoteConfigEntity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0003JF\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR!\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/config/kcrc/KCRCDataIncrement;", "", "version", "", "remove", "", "", "update", "", "(Ljava/lang/Long;Ljava/util/List;Ljava/util/Map;)V", "getRemove", "()Ljava/util/List;", "getUpdate", "()Ljava/util/Map;", "getVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/util/List;Ljava/util/Map;)Lcom/kubi/config/kcrc/KCRCDataIncrement;", "equals", "", "other", "hashCode", "", "toString", "Config_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
public final /* data */ class KCRCDataIncrement {

    @Nullable
    private final List<String> remove;

    @Nullable
    private final Map<String, Object> update;

    @Nullable
    private final Long version;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCRCDataIncrement)) {
            return false;
        }
        KCRCDataIncrement kCRCDataIncrement = (KCRCDataIncrement) other;
        return Intrinsics.areEqual(this.version, kCRCDataIncrement.version) && Intrinsics.areEqual(this.remove, kCRCDataIncrement.remove) && Intrinsics.areEqual(this.update, kCRCDataIncrement.update);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCRCDataIncrement copy$default(KCRCDataIncrement kCRCDataIncrement, Long l11, List list, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = kCRCDataIncrement.version;
        }
        if ((i11 & 2) != 0) {
            list = kCRCDataIncrement.remove;
        }
        if ((i11 & 4) != 0) {
            map = kCRCDataIncrement.update;
        }
        return kCRCDataIncrement.copy(l11, list, map);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getVersion() {
        return this.version;
    }

    @Nullable
    public final List<String> component2() {
        return this.remove;
    }

    @Nullable
    public final Map<String, Object> component3() {
        return this.update;
    }

    @NotNull
    public final KCRCDataIncrement copy(@Nullable Long version, @Nullable List<String> remove, @Nullable Map<String, ? extends Object> update) {
        return new KCRCDataIncrement(version, remove, update);
    }

    @Nullable
    public final List<String> getRemove() {
        return this.remove;
    }

    @Nullable
    public final Map<String, Object> getUpdate() {
        return this.update;
    }

    @Nullable
    public final Long getVersion() {
        return this.version;
    }

    public int hashCode() {
        Long l11 = this.version;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        List<String> list = this.remove;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, Object> map = this.update;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCRCDataIncrement(version=" + this.version + ", remove=" + this.remove + ", update=" + this.update + ')';
    }

    public KCRCDataIncrement(@Nullable Long l11, @Nullable List<String> list, @Nullable Map<String, ? extends Object> map) {
        this.version = l11;
        this.remove = list;
        this.update = map;
    }
}
