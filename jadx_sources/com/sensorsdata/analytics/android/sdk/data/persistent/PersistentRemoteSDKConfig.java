package com.sensorsdata.analytics.android.sdk.data.persistent;

import android.content.SharedPreferences;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes23.dex */
public class PersistentRemoteSDKConfig extends PersistentIdentity<String> {
    public PersistentRemoteSDKConfig(Future<SharedPreferences> future) {
        super(future, PersistentLoader.PersistentName.REMOTE_CONFIG, new PersistentIdentity.PersistentSerializer<String>() { // from class: com.sensorsdata.analytics.android.sdk.data.persistent.PersistentRemoteSDKConfig.1
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
