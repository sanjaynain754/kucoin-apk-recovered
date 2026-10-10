package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class EventInternal {

    @AutoValue.Builder
    public static abstract class Builder {
        public final Builder addMetadata(String str, String str2) {
            getAutoMetadata().put(str, str2);
            return this;
        }

        public abstract EventInternal build();

        public abstract Map<String, String> getAutoMetadata();

        public abstract Builder setAutoMetadata(Map<String, String> map);

        public abstract Builder setCode(Integer num);

        public abstract Builder setEncodedPayload(EncodedPayload encodedPayload);

        public abstract Builder setEventMillis(long j11);

        public abstract Builder setProductId(Integer num);

        public abstract Builder setTransportName(String str);

        public abstract Builder setUptimeMillis(long j11);

        public final Builder addMetadata(String str, long j11) {
            getAutoMetadata().put(str, String.valueOf(j11));
            return this;
        }

        public final Builder addMetadata(String str, int i11) {
            getAutoMetadata().put(str, String.valueOf(i11));
            return this;
        }
    }

    public abstract Map<String, String> getAutoMetadata();

    @Nullable
    public abstract Integer getCode();

    public abstract EncodedPayload getEncodedPayload();

    public abstract long getEventMillis();

    @Nullable
    public abstract Integer getProductId();

    public abstract String getTransportName();

    public abstract long getUptimeMillis();

    public static Builder builder() {
        return new AutoValue_EventInternal.Builder().setAutoMetadata(new HashMap());
    }

    public Builder toBuilder() {
        return new AutoValue_EventInternal.Builder().setTransportName(getTransportName()).setCode(getCode()).setProductId(getProductId()).setEncodedPayload(getEncodedPayload()).setEventMillis(getEventMillis()).setUptimeMillis(getUptimeMillis()).setAutoMetadata(new HashMap(getAutoMetadata()));
    }

    public final String get(String str) {
        String str2 = getAutoMetadata().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int getInteger(String str) {
        String str2 = getAutoMetadata().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long getLong(String str) {
        String str2 = getAutoMetadata().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> getMetadata() {
        return Collections.unmodifiableMap(getAutoMetadata());
    }

    public final String getOrDefault(String str, String str2) {
        String str3 = getAutoMetadata().get(str);
        if (str3 == null) {
            return str2;
        }
        return str3;
    }

    @Deprecated
    public byte[] getPayload() {
        return getEncodedPayload().getBytes();
    }
}
