package com.sensorsdata.analytics.android.sdk.data.persistent;

import android.content.SharedPreferences;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes23.dex */
public class PersistentLoginId extends PersistentIdentity<String> {
    public PersistentLoginId(Future<SharedPreferences> future) {
        super(future, "events_login_id", new PersistentIdentity.PersistentSerializer<String>() { // from class: com.sensorsdata.analytics.android.sdk.data.persistent.PersistentLoginId.1
            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String create() {
                return null;
            }

            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String load(String str) {
                return str;
            }

            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String save(String str) {
                return str;
            }
        });
    }
}
