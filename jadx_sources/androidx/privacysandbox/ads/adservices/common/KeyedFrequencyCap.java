package androidx.privacysandbox.ads.adservices.common;

import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import java.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KeyedFrequencyCap.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, m90084d2 = {"Landroidx/privacysandbox/ads/adservices/common/KeyedFrequencyCap;", "", "adCounterKey", "", BridgeParamKeyKt.MAX_COUNT, JPushConstants.Geofence.KEY_INTERVAL, "Ljava/time/Duration;", "(IILjava/time/Duration;)V", "getAdCounterKey", "()I", "getInterval", "()Ljava/time/Duration;", "getMaxCount", "convertToAdServices", "Landroid/adservices/common/KeyedFrequencyCap;", "convertToAdServices$ads_adservices_release", "equals", "", "other", "hashCode", "toString", "", "ads-adservices_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@ExperimentalFeatures.Ext8OptIn
public final class KeyedFrequencyCap {
    private final int adCounterKey;

    @NotNull
    private final Duration interval;
    private final int maxCount;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyedFrequencyCap)) {
            return false;
        }
        KeyedFrequencyCap keyedFrequencyCap = (KeyedFrequencyCap) other;
        return this.adCounterKey == keyedFrequencyCap.adCounterKey && this.maxCount == keyedFrequencyCap.maxCount && Intrinsics.areEqual(this.interval, keyedFrequencyCap.interval);
    }

    public KeyedFrequencyCap(int i11, int i12, @NotNull Duration interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        this.adCounterKey = i11;
        this.maxCount = i12;
        this.interval = interval;
    }

    public final int getAdCounterKey() {
        return this.adCounterKey;
    }

    @NotNull
    public final Duration getInterval() {
        return this.interval;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.adCounterKey) * 31) + Integer.hashCode(this.maxCount)) * 31) + this.interval.hashCode();
    }

    @NotNull
    public String toString() {
        return "KeyedFrequencyCap: adCounterKey=" + this.adCounterKey + ", maxCount=" + this.maxCount + ", interval=" + this.interval;
    }

    @RequiresExtension.Container({@RequiresExtension(extension = 1000000, version = 8), @RequiresExtension(extension = 31, version = 9)})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final android.adservices.common.KeyedFrequencyCap convertToAdServices$ads_adservices_release() {
        C3821m.m3670a();
        android.adservices.common.KeyedFrequencyCap keyedFrequencyCapBuild = C3820l.m3669a(this.adCounterKey, this.maxCount, this.interval).build();
        Intrinsics.checkNotNullExpressionValue(keyedFrequencyCapBuild, "Builder(adCounterKey, ma…val)\n            .build()");
        return keyedFrequencyCapBuild;
    }
}
