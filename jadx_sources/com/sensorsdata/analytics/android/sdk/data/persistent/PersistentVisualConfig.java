package com.sensorsdata.analytics.android.sdk.data.persistent;

import android.content.SharedPreferences;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes59.dex */
public class PersistentVisualConfig extends PersistentIdentity<String> {
    public PersistentVisualConfig(Future<SharedPreferences> future) {
        super(future, PersistentLoader.PersistentName.VISUAL_PROPERTIES, new PersistentIdentity.PersistentSerializer<String>() { // from class: com.sensorsdata.analytics.android.sdk.data.persistent.PersistentVisualConfig.1
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
