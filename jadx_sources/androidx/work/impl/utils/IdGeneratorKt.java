package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.sqlite.p023db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IdGenerator.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002\u001a\u001c\u0010\u000f\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"INITIAL_ID", "", "NEXT_ALARM_MANAGER_ID_KEY", "", "NEXT_JOB_SCHEDULER_ID_KEY", "PREFERENCE_FILE_KEY", "migrateLegacyIdGenerator", "", "context", "Landroid/content/Context;", "sqLiteDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "nextId", "Landroidx/work/impl/WorkDatabase;", "key", "updatePreference", "value", "work-runtime_release"}, m90085k = 2, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class IdGeneratorKt {
    public static final int INITIAL_ID = 0;

    @NotNull
    public static final String NEXT_ALARM_MANAGER_ID_KEY = "next_alarm_manager_id";

    @NotNull
    public static final String NEXT_JOB_SCHEDULER_ID_KEY = "next_job_scheduler_id";

    @NotNull
    public static final String PREFERENCE_FILE_KEY = "androidx.work.util.id";

    public static final void migrateLegacyIdGenerator(@NotNull Context context, @NotNull SupportSQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCE_FILE_KEY, 0);
        if (sharedPreferences.contains(NEXT_JOB_SCHEDULER_ID_KEY) || sharedPreferences.contains(NEXT_JOB_SCHEDULER_ID_KEY)) {
            int i11 = sharedPreferences.getInt(NEXT_JOB_SCHEDULER_ID_KEY, 0);
            int i12 = sharedPreferences.getInt(NEXT_ALARM_MANAGER_ID_KEY, 0);
            sqLiteDatabase.beginTransaction();
            try {
                sqLiteDatabase.execSQL(PreferenceUtils.INSERT_PREFERENCE, new Object[]{NEXT_JOB_SCHEDULER_ID_KEY, Integer.valueOf(i11)});
                sqLiteDatabase.execSQL(PreferenceUtils.INSERT_PREFERENCE, new Object[]{NEXT_ALARM_MANAGER_ID_KEY, Integer.valueOf(i12)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.setTransactionSuccessful();
            } finally {
                sqLiteDatabase.endTransaction();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nextId(WorkDatabase workDatabase, String str) {
        int iLongValue;
        Long longValue = workDatabase.preferenceDao().getLongValue(str);
        int i11 = 0;
        if (longValue != null) {
            iLongValue = (int) longValue.longValue();
        } else {
            iLongValue = 0;
        }
        if (iLongValue != Integer.MAX_VALUE) {
            i11 = iLongValue + 1;
        }
        updatePreference(workDatabase, str, i11);
        return iLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updatePreference(WorkDatabase workDatabase, String str, int i11) {
        workDatabase.preferenceDao().insertPreference(new Preference(str, Long.valueOf(i11)));
    }
}
