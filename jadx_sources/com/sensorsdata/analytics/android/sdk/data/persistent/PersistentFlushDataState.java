package com.sensorsdata.analytics.android.sdk.data.persistent;

import android.content.SharedPreferences;
import androidx.credentials.provider.CredentialEntry;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes23.dex */
public class PersistentFlushDataState extends PersistentIdentity<Boolean> {
    public PersistentFlushDataState(Future<SharedPreferences> future) {
        super(future, "sub_process_flush_data", new PersistentIdentity.PersistentSerializer<Boolean>() { // from class: com.sensorsdata.analytics.android.sdk.data.persistent.PersistentFlushDataState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public Boolean create() {
                return Boolean.TRUE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public Boolean load(String str) {
                return Boolean.valueOf(CredentialEntry.TRUE_STRING.equals(str));
            }

            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String save(Boolean bool) {
                return bool == null ? create().toString() : String.valueOf(bool);
            }
        });
    }
}
