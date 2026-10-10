package com.sensorsdata.analytics.android.sdk.data.persistent;

import android.content.SharedPreferences;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes23.dex */
public class PersistentAppStartTime extends PersistentIdentity<Long> {
    public PersistentAppStartTime(Future<SharedPreferences> future) {
        super(future, "app_start_time", new PersistentIdentity.PersistentSerializer<Long>() { // from class: com.sensorsdata.analytics.android.sdk.data.persistent.PersistentAppStartTime.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public Long create() {
                return 0L;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public Long load(String str) {
                return Long.valueOf(str);
            }

            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String save(Long l11) {
                return l11 == null ? create().toString() : String.valueOf(l11);
            }
        });
    }
}
