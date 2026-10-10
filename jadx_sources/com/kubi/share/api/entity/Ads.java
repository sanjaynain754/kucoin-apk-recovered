package com.kubi.share.api.entity;

import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ShareReferralEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u00126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u00010\u0003j\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u0001`\u0007¢\u0006\u0004\b\b\u0010\tJ9\u0010\r\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u00010\u0003j\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u0001`\u0007HÆ\u0003JC\u0010\u000e\u001a\u00020\u000028\b\u0002\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u00010\u0003j\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u0001`\u0007HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001RJ\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u00010\u0003j\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\t¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/share/api/entity/Ads;", "", "data", "Ljava/util/HashMap;", "", "", "Lcom/kubi/share/api/entity/AdEntity;", "Lkotlin/collections/HashMap;", "<init>", "(Ljava/util/HashMap;)V", "getData", "()Ljava/util/HashMap;", "setData", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ShareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Ads {

    @Nullable
    private HashMap<String, List<AdEntity>> data;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Ads) && Intrinsics.areEqual(this.data, ((Ads) other).data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Ads copy$default(Ads ads, HashMap map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = ads.data;
        }
        return ads.copy(map);
    }

    @Nullable
    public final HashMap<String, List<AdEntity>> component1() {
        return this.data;
    }

    @NotNull
    public final Ads copy(@Nullable HashMap<String, List<AdEntity>> data) {
        return new Ads(data);
    }

    @Nullable
    public final HashMap<String, List<AdEntity>> getData() {
        return this.data;
    }

    public int hashCode() {
        HashMap<String, List<AdEntity>> map = this.data;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final void setData(@Nullable HashMap<String, List<AdEntity>> map) {
        this.data = map;
    }

    @NotNull
    public String toString() {
        return "Ads(data=" + this.data + ')';
    }

    public Ads(@Nullable HashMap<String, List<AdEntity>> map) {
        this.data = map;
    }
}
