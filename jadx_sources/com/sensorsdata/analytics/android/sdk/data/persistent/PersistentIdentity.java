package com.sensorsdata.analytics.android.sdk.data.persistent;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import com.sensorsdata.analytics.android.sdk.AbstractSensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes23.dex */
@SuppressLint({"CommitPrefEdits"})
public abstract class PersistentIdentity<T> {
    private static final String TAG = "SA.PersistentIdentity";
    private T item;
    private final Future<SharedPreferences> loadStoredPreferences;
    private final String persistentKey;
    private final PersistentSerializer serializer;

    public interface PersistentSerializer<T> {
        T create();

        T load(String str);

        String save(T t11);
    }

    public T get() {
        if (this.item == null) {
            synchronized (this.loadStoredPreferences) {
                String string = null;
                try {
                    SharedPreferences sharedPreferences = this.loadStoredPreferences.get();
                    if (sharedPreferences != null) {
                        string = sharedPreferences.getString(this.persistentKey, null);
                    }
                } catch (InterruptedException e11) {
                    SALog.m68588d(TAG, "Cannot read distinct ids from sharedPreferences.", e11);
                } catch (ExecutionException e12) {
                    SALog.m68588d(TAG, "Cannot read distinct ids from sharedPreferences.", e12.getCause());
                }
                if (string == null) {
                    T t11 = (T) this.serializer.create();
                    this.item = t11;
                    commit(t11);
                } else {
                    this.item = (T) this.serializer.load(string);
                }
            }
        }
        return this.item;
    }

    public PersistentIdentity(Future<SharedPreferences> future, String str, PersistentSerializer<T> persistentSerializer) {
        this.loadStoredPreferences = future;
        this.serializer = persistentSerializer;
        this.persistentKey = str;
    }

    public void commit(T t11) {
        SharedPreferences sharedPreferences;
        if (!AbstractSensorsDataAPI.getConfigOptions().isDisableSDK()) {
            this.item = t11;
            synchronized (this.loadStoredPreferences) {
                try {
                    sharedPreferences = this.loadStoredPreferences.get();
                } catch (InterruptedException e11) {
                    SALog.m68588d(TAG, "Cannot read distinct ids from sharedPreferences.", e11);
                    sharedPreferences = null;
                } catch (ExecutionException e12) {
                    SALog.m68588d(TAG, "Cannot read distinct ids from sharedPreferences.", e12.getCause());
                    sharedPreferences = null;
                }
                if (sharedPreferences != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (this.item == null) {
                        this.item = (T) this.serializer.create();
                    }
                    editorEdit.putString(this.persistentKey, this.serializer.save(this.item));
                    editorEdit.apply();
                }
            }
        }
    }
}
