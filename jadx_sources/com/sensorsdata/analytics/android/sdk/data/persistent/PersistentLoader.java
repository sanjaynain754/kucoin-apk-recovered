package com.sensorsdata.analytics.android.sdk.data.persistent;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes23.dex */
public class PersistentLoader {
    private static Context context;
    private static volatile PersistentLoader instance;
    private static Future<SharedPreferences> storedPreferences;

    /* JADX INFO: loaded from: classes59.dex */
    public interface PersistentName {
        public static final String APP_END_DATA = "app_end_data";
        public static final String APP_PAUSED_TIME = "app_end_time";
        public static final String APP_START_TIME = "app_start_time";
        public static final String DISTINCT_ID = "events_distinct_id";
        public static final String FIRST_DAY = "first_day";
        public static final String FIRST_INSTALL = "first_track_installation";
        public static final String FIRST_INSTALL_CALLBACK = "first_track_installation_with_callback";
        public static final String FIRST_START = "first_start";
        public static final String LOGIN_ID = "events_login_id";
        public static final String REMOTE_CONFIG = "sensorsdata_sdk_configuration";
        public static final String SUB_PROCESS_FLUSH_DATA = "sub_process_flush_data";
        public static final String SUPER_PROPERTIES = "super_properties";
        public static final String VISUAL_PROPERTIES = "visual_properties";
    }

    public static PersistentLoader initLoader(Context context2) {
        if (instance == null) {
            instance = new PersistentLoader(context2);
        }
        return instance;
    }

    public static PersistentIdentity loadPersistent(String str) {
        if (instance == null) {
            throw new RuntimeException("you should call 'PersistentLoader.initLoader(Context)' first");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "events_login_id":
                return new PersistentLoginId(storedPreferences);
            case "super_properties":
                return new PersistentSuperProperties(storedPreferences);
            case "first_track_installation_with_callback":
                return new PersistentFirstTrackInstallationWithCallback(storedPreferences);
            case "first_start":
                return new PersistentFirstStart(storedPreferences);
            case "visual_properties":
                return new PersistentVisualConfig(storedPreferences);
            case "first_day":
                return new PersistentFirstDay(storedPreferences);
            case "events_distinct_id":
                return new PersistentDistinctId(storedPreferences, context);
            case "app_start_time":
                return new PersistentAppStartTime(storedPreferences);
            case "sensorsdata_sdk_configuration":
                return new PersistentRemoteSDKConfig(storedPreferences);
            case "first_track_installation":
                return new PersistentFirstTrackInstallation(storedPreferences);
            case "app_end_data":
                return new PersistentAppEndData(storedPreferences);
            case "app_end_time":
                return new PersistentAppPaused(storedPreferences);
            case "sub_process_flush_data":
                return new PersistentFlushDataState(storedPreferences);
            default:
                return null;
        }
    }

    private PersistentLoader(Context context2) {
        context = context2.getApplicationContext();
        storedPreferences = new SharedPreferencesLoader().loadPreferences(context2, "com.sensorsdata.analytics.android.sdk.SensorsDataAPI");
    }
}
