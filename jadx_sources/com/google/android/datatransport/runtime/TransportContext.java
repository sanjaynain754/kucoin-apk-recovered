package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class TransportContext {

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract TransportContext build();

        public abstract Builder setBackendName(String str);

        public abstract Builder setExtras(@Nullable byte[] bArr);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract Builder setPriority(Priority priority);
    }

    public abstract String getBackendName();

    @Nullable
    public abstract byte[] getExtras();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public abstract Priority getPriority();

    public static Builder builder() {
        return new AutoValue_TransportContext.Builder().setPriority(Priority.DEFAULT);
    }

    public boolean shouldUploadClientHealthMetrics() {
        if (getExtras() != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String strEncodeToString;
        String backendName = getBackendName();
        Priority priority = getPriority();
        if (getExtras() == null) {
            strEncodeToString = "";
        } else {
            strEncodeToString = Base64.encodeToString(getExtras(), 2);
        }
        return String.format("TransportContext(%s, %s, %s)", backendName, priority, strEncodeToString);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public TransportContext withPriority(Priority priority) {
        return builder().setBackendName(getBackendName()).setPriority(priority).setExtras(getExtras()).build();
    }
}
