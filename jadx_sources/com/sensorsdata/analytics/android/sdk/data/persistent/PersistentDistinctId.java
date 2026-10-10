package com.sensorsdata.analytics.android.sdk.data.persistent;

import android.content.Context;
import android.content.SharedPreferences;
import com.sensorsdata.analytics.android.sdk.util.SensorsDataUtils;
import java.util.UUID;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes23.dex */
public class PersistentDistinctId extends PersistentIdentity<String> {
    public PersistentDistinctId(Future<SharedPreferences> future, final Context context) {
        super(future, PersistentLoader.PersistentName.DISTINCT_ID, new PersistentIdentity.PersistentSerializer<String>() { // from class: com.sensorsdata.analytics.android.sdk.data.persistent.PersistentDistinctId.1
            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String load(String str) {
                return str;
            }

            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String create() {
                String androidID = SensorsDataUtils.getAndroidID(context);
                return SensorsDataUtils.isValidAndroidId(androidID) ? androidID : UUID.randomUUID().toString();
            }

            @Override // com.sensorsdata.analytics.android.sdk.data.persistent.PersistentIdentity.PersistentSerializer
            public String save(String str) {
                return str == null ? create() : str;
            }
        });
    }
}
