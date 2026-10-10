package com.sensorsdata.analytics.android.sdk.data.persistent;

import android.content.SharedPreferences;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes23.dex */
public class PersistentAppEndData extends PersistentIdentity<String> {
    public PersistentAppEndData(Future<SharedPreferences> future) {
        super(future, "app_end_data", new PersistentIdentity.PersistentSerializer<String>() { // from class: com.sensorsdata.analytics.android.sdk.data.persistent.PersistentAppEndData.1
            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String load(String str) {
                return str;
            }

            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String create() {
                return "";
            }

            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String save(String str) {
                return str == null ? create() : str;
            }
        });
    }
}
