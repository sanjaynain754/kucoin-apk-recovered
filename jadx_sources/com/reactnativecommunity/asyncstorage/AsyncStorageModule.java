package com.reactnativecommunity.asyncstorage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import fa0.C37407a;
import fa0.C37408b;
import fa0.C37414h;
import fa0.C37417k;
import fa0.ExecutorC37418l;
import java.util.HashSet;
import java.util.concurrent.Executor;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes59.dex */
@ReactModule(name = "RNCAsyncStorage")
public final class AsyncStorageModule extends NativeAsyncStorageModuleSpec {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNCAsyncStorage";
    private final ExecutorC37418l executor;
    private C37417k mReactDatabaseSupplier;
    private boolean mShuttingDown;

    /* JADX INFO: renamed from: com.reactnativecommunity.asyncstorage.AsyncStorageModule$a */
    public class AsyncTaskC27488a extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callback f55845a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReadableArray f55846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsyncTaskC27488a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f55845a = callback;
            this.f55846b = readableArray;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f55845a.invoke(C37408b.m84147a(null), null);
                return;
            }
            String[] strArr = {"key", "value"};
            HashSet<String> hashSet = new HashSet();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (int i11 = 0; i11 < this.f55846b.size(); i11 += 999) {
                int iMin = Math.min(this.f55846b.size() - i11, 999);
                Cursor cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().query("catalystLocalStorage", strArr, C37407a.m84141a(iMin), C37407a.m84142b(this.f55846b, i11, iMin), null, null, null);
                hashSet.clear();
                try {
                    try {
                        if (cursorQuery.getCount() != this.f55846b.size()) {
                            for (int i12 = i11; i12 < i11 + iMin; i12++) {
                                hashSet.add(this.f55846b.getString(i12));
                            }
                        }
                        if (cursorQuery.moveToFirst()) {
                            do {
                                WritableArray writableArrayCreateArray2 = Arguments.createArray();
                                writableArrayCreateArray2.pushString(cursorQuery.getString(0));
                                writableArrayCreateArray2.pushString(cursorQuery.getString(1));
                                writableArrayCreateArray.pushArray(writableArrayCreateArray2);
                                hashSet.remove(cursorQuery.getString(0));
                            } while (cursorQuery.moveToNext());
                        }
                        cursorQuery.close();
                        for (String str : hashSet) {
                            WritableArray writableArrayCreateArray3 = Arguments.createArray();
                            writableArrayCreateArray3.pushString(str);
                            writableArrayCreateArray3.pushNull();
                            writableArrayCreateArray.pushArray(writableArrayCreateArray3);
                        }
                        hashSet.clear();
                    } catch (Exception e11) {
                        C45999a.m101489J(ReactConstants.TAG, e11.getMessage(), e11);
                        this.f55845a.invoke(C37408b.m84148b(null, e11.getMessage()), null);
                        cursorQuery.close();
                        return;
                    }
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            this.f55845a.invoke(null, writableArrayCreateArray);
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.asyncstorage.AsyncStorageModule$b */
    public class AsyncTaskC27489b extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callback f55848a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReadableArray f55849b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsyncTaskC27489b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f55848a = callback;
            this.f55849b = readableArray;
        }

        /* JADX WARN: Code duplicated, block: B:55:0x014e  */
        /* JADX WARN: Code duplicated, block: B:56:0x0158  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapM84148b = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f55848a.invoke(C37408b.m84147a(null));
                return;
            }
            SQLiteStatement sQLiteStatementCompileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().beginTransaction();
                    for (int i11 = 0; i11 < this.f55849b.size(); i11++) {
                        if (this.f55849b.getArray(i11).size() != 2) {
                            WritableMap writableMapM84150d = C37408b.m84150d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                                return;
                            } catch (Exception e11) {
                                e = e11;
                                C45999a.m101489J(ReactConstants.TAG, e.getMessage(), e);
                                if (writableMapM84150d != null) {
                                    return;
                                }
                            }
                        } else if (this.f55849b.getArray(i11).getString(0) == null) {
                            WritableMap writableMapM84149c = C37408b.m84149c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                                return;
                            } catch (Exception e12) {
                                e = e12;
                                C45999a.m101489J(ReactConstants.TAG, e.getMessage(), e);
                                if (writableMapM84149c != null) {
                                    return;
                                }
                            }
                        } else if (this.f55849b.getArray(i11).getString(1) == null) {
                            WritableMap writableMapM84150d2 = C37408b.m84150d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                                return;
                            } catch (Exception e13) {
                                e = e13;
                                C45999a.m101489J(ReactConstants.TAG, e.getMessage(), e);
                                if (writableMapM84150d2 != null) {
                                    return;
                                }
                            }
                        } else {
                            sQLiteStatementCompileStatement.clearBindings();
                            sQLiteStatementCompileStatement.bindString(1, this.f55849b.getArray(i11).getString(0));
                            sQLiteStatementCompileStatement.bindString(2, this.f55849b.getArray(i11).getString(1));
                            sQLiteStatementCompileStatement.execute();
                        }
                        C37408b.m84148b(null, e.getMessage());
                        return;
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                    } catch (Exception e14) {
                        C45999a.m101489J(ReactConstants.TAG, e14.getMessage(), e14);
                        writableMapM84148b = C37408b.m84148b(null, e14.getMessage());
                    }
                } catch (Throwable th2) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                    } catch (Exception e15) {
                        C45999a.m101489J(ReactConstants.TAG, e15.getMessage(), e15);
                        C37408b.m84148b(null, e15.getMessage());
                    }
                    throw th2;
                }
            } catch (Exception e16) {
                C45999a.m101489J(ReactConstants.TAG, e16.getMessage(), e16);
                WritableMap writableMapM84148b2 = C37408b.m84148b(null, e16.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                } catch (Exception e17) {
                    C45999a.m101489J(ReactConstants.TAG, e17.getMessage(), e17);
                    if (writableMapM84148b2 == null) {
                        writableMapM84148b = C37408b.m84148b(null, e17.getMessage());
                    }
                    if (writableMapM84148b != null) {
                        this.f55848a.invoke(writableMapM84148b);
                    } else {
                        this.f55848a.invoke(new Object[0]);
                    }
                }
                writableMapM84148b = writableMapM84148b2;
            }
            if (writableMapM84148b != null) {
                this.f55848a.invoke(writableMapM84148b);
            } else {
                this.f55848a.invoke(new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.asyncstorage.AsyncStorageModule$c */
    public class AsyncTaskC27490c extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callback f55851a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReadableArray f55852b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsyncTaskC27490c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f55851a = callback;
            this.f55852b = readableArray;
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapM84148b = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f55851a.invoke(C37408b.m84147a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().beginTransaction();
                    for (int i11 = 0; i11 < this.f55852b.size(); i11 += 999) {
                        int iMin = Math.min(this.f55852b.size() - i11, 999);
                        AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().delete("catalystLocalStorage", C37407a.m84141a(iMin), C37407a.m84142b(this.f55852b, i11, iMin));
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                    } catch (Exception e11) {
                        C45999a.m101489J(ReactConstants.TAG, e11.getMessage(), e11);
                        writableMapM84148b = C37408b.m84148b(null, e11.getMessage());
                    }
                } catch (Exception e12) {
                    C45999a.m101489J(ReactConstants.TAG, e12.getMessage(), e12);
                    WritableMap writableMapM84148b2 = C37408b.m84148b(null, e12.getMessage());
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                    } catch (Exception e13) {
                        C45999a.m101489J(ReactConstants.TAG, e13.getMessage(), e13);
                        if (writableMapM84148b2 == null) {
                            writableMapM84148b = C37408b.m84148b(null, e13.getMessage());
                        }
                        if (writableMapM84148b != null) {
                            this.f55851a.invoke(writableMapM84148b);
                        } else {
                            this.f55851a.invoke(new Object[0]);
                        }
                    }
                    writableMapM84148b = writableMapM84148b2;
                }
                if (writableMapM84148b != null) {
                    this.f55851a.invoke(writableMapM84148b);
                } else {
                    this.f55851a.invoke(new Object[0]);
                }
            } catch (Throwable th2) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                } catch (Exception e14) {
                    C45999a.m101489J(ReactConstants.TAG, e14.getMessage(), e14);
                    C37408b.m84148b(null, e14.getMessage());
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.asyncstorage.AsyncStorageModule$d */
    public class AsyncTaskC27491d extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callback f55854a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReadableArray f55855b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsyncTaskC27491d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f55854a = callback;
            this.f55855b = readableArray;
        }

        /* JADX WARN: Code duplicated, block: B:64:0x0160  */
        /* JADX WARN: Code duplicated, block: B:65:0x016a  */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMapM84148b = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f55854a.invoke(C37408b.m84147a(null));
                return;
            }
            try {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().beginTransaction();
                    for (int i11 = 0; i11 < this.f55855b.size(); i11++) {
                        if (this.f55855b.getArray(i11).size() != 2) {
                            WritableMap writableMapM84150d = C37408b.m84150d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                                return;
                            } catch (Exception e11) {
                                e = e11;
                                C45999a.m101489J(ReactConstants.TAG, e.getMessage(), e);
                                if (writableMapM84150d != null) {
                                    return;
                                }
                            }
                        } else if (this.f55855b.getArray(i11).getString(0) == null) {
                            WritableMap writableMapM84149c = C37408b.m84149c(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                                return;
                            } catch (Exception e12) {
                                e = e12;
                                C45999a.m101489J(ReactConstants.TAG, e.getMessage(), e);
                                if (writableMapM84149c != null) {
                                    return;
                                }
                            }
                        } else if (this.f55855b.getArray(i11).getString(1) == null) {
                            WritableMap writableMapM84150d2 = C37408b.m84150d(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                                return;
                            } catch (Exception e13) {
                                e = e13;
                                C45999a.m101489J(ReactConstants.TAG, e.getMessage(), e);
                                if (writableMapM84150d2 != null) {
                                    return;
                                }
                            }
                        } else if (!C37407a.m84145e(AsyncStorageModule.this.mReactDatabaseSupplier.m84168i(), this.f55855b.getArray(i11).getString(0), this.f55855b.getArray(i11).getString(1))) {
                            WritableMap writableMapM84147a = C37408b.m84147a(null);
                            try {
                                AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                                return;
                            } catch (Exception e14) {
                                e = e14;
                                C45999a.m101489J(ReactConstants.TAG, e.getMessage(), e);
                                if (writableMapM84147a != null) {
                                    return;
                                }
                            }
                        }
                        C37408b.m84148b(null, e.getMessage());
                        return;
                    }
                    AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().setTransactionSuccessful();
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                    } catch (Exception e15) {
                        C45999a.m101489J(ReactConstants.TAG, e15.getMessage(), e15);
                        writableMapM84148b = C37408b.m84148b(null, e15.getMessage());
                    }
                } catch (Throwable th2) {
                    try {
                        AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                    } catch (Exception e16) {
                        C45999a.m101489J(ReactConstants.TAG, e16.getMessage(), e16);
                        C37408b.m84148b(null, e16.getMessage());
                    }
                    throw th2;
                }
            } catch (Exception e17) {
                C45999a.m101489J(ReactConstants.TAG, e17.getMessage(), e17);
                WritableMap writableMapM84148b2 = C37408b.m84148b(null, e17.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().endTransaction();
                } catch (Exception e18) {
                    C45999a.m101489J(ReactConstants.TAG, e18.getMessage(), e18);
                    if (writableMapM84148b2 == null) {
                        writableMapM84148b = C37408b.m84148b(null, e18.getMessage());
                    }
                    if (writableMapM84148b != null) {
                        this.f55854a.invoke(writableMapM84148b);
                    } else {
                        this.f55854a.invoke(new Object[0]);
                    }
                }
                writableMapM84148b = writableMapM84148b2;
            }
            if (writableMapM84148b != null) {
                this.f55854a.invoke(writableMapM84148b);
            } else {
                this.f55854a.invoke(new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.asyncstorage.AsyncStorageModule$e */
    public class AsyncTaskC27492e extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callback f55857a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsyncTaskC27492e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f55857a = callback;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.mReactDatabaseSupplier.m84167h()) {
                this.f55857a.invoke(C37408b.m84147a(null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.m84164a();
                this.f55857a.invoke(new Object[0]);
            } catch (Exception e11) {
                C45999a.m101489J(ReactConstants.TAG, e11.getMessage(), e11);
                this.f55857a.invoke(C37408b.m84148b(null, e11.getMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: com.reactnativecommunity.asyncstorage.AsyncStorageModule$f */
    public class AsyncTaskC27493f extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callback f55859a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AsyncTaskC27493f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f55859a = callback;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f55859a.invoke(C37408b.m84147a(null), null);
                return;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Cursor cursorQuery = AsyncStorageModule.this.mReactDatabaseSupplier.m84168i().query("catalystLocalStorage", new String[]{"key"}, null, null, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        do {
                            writableArrayCreateArray.pushString(cursorQuery.getString(0));
                        } while (cursorQuery.moveToNext());
                    }
                    cursorQuery.close();
                    this.f55859a.invoke(null, writableArrayCreateArray);
                } catch (Exception e11) {
                    C45999a.m101489J(ReactConstants.TAG, e11.getMessage(), e11);
                    this.f55859a.invoke(C37408b.m84148b(null, e11.getMessage()), null);
                    cursorQuery.close();
                }
            } catch (Throwable th2) {
                cursorQuery.close();
                throw th2;
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mShuttingDown = true;
        this.mReactDatabaseSupplier.m84165b();
    }

    @VisibleForTesting
    public AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) throws Throwable {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        C37414h.m84162g(reactApplicationContext);
        this.executor = new ExecutorC37418l(executor);
        this.mReactDatabaseSupplier = C37417k.m84163j(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.m84167h();
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void clear(Callback callback) {
        new AsyncTaskC27492e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void getAllKeys(Callback callback) {
        new AsyncTaskC27493f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCAsyncStorage";
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(C37408b.m84149c(null), null);
        } else {
            new AsyncTaskC27488a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new AsyncTaskC27491d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new AsyncTaskC27490c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @Override // com.reactnativecommunity.asyncstorage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new AsyncTaskC27489b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }
}
