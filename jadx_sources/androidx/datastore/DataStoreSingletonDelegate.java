package androidx.datastore;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.core.okio.OkioSerializer;
import androidx.datastore.core.okio.OkioStorage;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import okio.FileSystem;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.properties.ReadOnlyProperty;
import p852kotlin.reflect.KProperty;

/* JADX INFO: compiled from: DataStoreDelegate.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002BW\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0013\u001a\u00020\u00032\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR,\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m90084d2 = {"Landroidx/datastore/DataStoreSingletonDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/properties/ReadOnlyProperty;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "", "fileName", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "corruptionHandler", "Lkotlin/Function1;", "", "Landroidx/datastore/core/DataMigration;", "produceMigrations", "Lkotlinx/coroutines/m0;", "scope", "<init>", "(Ljava/lang/String;Landroidx/datastore/core/okio/OkioSerializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/m0;)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Landroid/content/Context;Lkotlin/reflect/KProperty;)Landroidx/datastore/core/DataStore;", "Ljava/lang/String;", "Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/m0;", "", "lock", "Ljava/lang/Object;", "INSTANCE", "Landroidx/datastore/core/DataStore;", "datastore_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class DataStoreSingletonDelegate<T> implements ReadOnlyProperty<Context, DataStore<T>> {

    @GuardedBy("lock")
    @Nullable
    private volatile DataStore<T> INSTANCE;

    @Nullable
    private final ReplaceFileCorruptionHandler<T> corruptionHandler;

    @NotNull
    private final String fileName;

    @NotNull
    private final Object lock;

    @NotNull
    private final Function1<Context, List<DataMigration<T>>> produceMigrations;

    @NotNull
    private final InterfaceC41709m0 scope;

    @NotNull
    private final OkioSerializer<T> serializer;

    @Override // p852kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Context context, KProperty kProperty) {
        return getValue2(context, (KProperty<?>) kProperty);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreSingletonDelegate(@NotNull String fileName, @NotNull OkioSerializer<T> serializer, @Nullable ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @NotNull Function1<? super Context, ? extends List<? extends DataMigration<T>>> produceMigrations, @NotNull InterfaceC41709m0 scope) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.fileName = fileName;
        this.serializer = serializer;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public DataStore<T> getValue2(@NotNull Context thisRef, @NotNull KProperty<?> property) {
        DataStore<T> dataStore;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        DataStore<T> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    final Context applicationContext = thisRef.getApplicationContext();
                    DataStoreFactory dataStoreFactory = DataStoreFactory.INSTANCE;
                    OkioStorage okioStorage = new OkioStorage(FileSystem.SYSTEM, this.serializer, null, new Function0<Path>() { // from class: androidx.datastore.DataStoreSingletonDelegate$getValue$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p852kotlin.jvm.functions.Function0
                        @NotNull
                        public final Path invoke() {
                            Path.Companion companion = Path.INSTANCE;
                            Context applicationContext2 = applicationContext;
                            Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
                            String absolutePath = DataStoreFile.dataStoreFile(applicationContext2, ((DataStoreSingletonDelegate) this).fileName).getAbsolutePath();
                            Intrinsics.checkNotNullExpressionValue(absolutePath, "applicationContext.dataS…le(fileName).absolutePath");
                            return Path.Companion.get$default(companion, absolutePath, false, 1, (Object) null);
                        }
                    }, 4, null);
                    ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler = this.corruptionHandler;
                    Function1<Context, List<DataMigration<T>>> function1 = this.produceMigrations;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.INSTANCE = dataStoreFactory.create(okioStorage, replaceFileCorruptionHandler, function1.invoke(applicationContext), this.scope);
                }
                dataStore = this.INSTANCE;
                Intrinsics.checkNotNull(dataStore);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dataStore;
    }
}
