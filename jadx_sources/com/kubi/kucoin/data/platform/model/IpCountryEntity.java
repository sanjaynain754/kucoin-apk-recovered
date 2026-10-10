package com.kubi.kucoin.data.platform.model;

import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IpCountryEntity.kt */
/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/kucoin/data/platform/model/IpCountryEntity;", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "mobileCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCountryCode", "()Ljava/lang/String;", "getMobileCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "LAppCountry_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class IpCountryEntity {

    @Nullable
    private final String countryCode;

    @Nullable
    private final String mobileCode;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IpCountryEntity)) {
            return false;
        }
        IpCountryEntity ipCountryEntity = (IpCountryEntity) other;
        return Intrinsics.areEqual(this.countryCode, ipCountryEntity.countryCode) && Intrinsics.areEqual(this.mobileCode, ipCountryEntity.mobileCode);
    }

    public static /* synthetic */ IpCountryEntity copy$default(IpCountryEntity ipCountryEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = ipCountryEntity.countryCode;
        }
        if ((i11 & 2) != 0) {
            str2 = ipCountryEntity.mobileCode;
        }
        return ipCountryEntity.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMobileCode() {
        return this.mobileCode;
    }

    @NotNull
    public final IpCountryEntity copy(@Nullable String countryCode, @Nullable String mobileCode) {
        return new IpCountryEntity(countryCode, mobileCode);
    }

    @Nullable
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    public final String getMobileCode() {
        return this.mobileCode;
    }

    public int hashCode() {
        String str = this.countryCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mobileCode;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IpCountryEntity(countryCode=" + this.countryCode + ", mobileCode=" + this.mobileCode + ')';
    }

    public IpCountryEntity(@Nullable String str, @Nullable String str2) {
        this.countryCode = str;
        this.mobileCode = str2;
    }
}
