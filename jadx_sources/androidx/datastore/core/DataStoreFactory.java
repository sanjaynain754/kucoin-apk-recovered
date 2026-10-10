package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DataStoreFactory.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J[\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Landroidx/datastore/core/DataStoreFactory;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "corruptionHandler", "", "Landroidx/datastore/core/DataMigration;", "migrations", "Lkotlinx/coroutines/m0;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/DataStore;", "create", "(Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/Storage;", "storage", "(Landroidx/datastore/core/Storage;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/m0;)Landroidx/datastore/core/DataStore;", "datastore-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class DataStoreFactory {

    @NotNull
    public static final DataStoreFactory INSTANCE = new DataStoreFactory();

    public static /* synthetic */ DataStore create$default(DataStoreFactory dataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC41709m0 interfaceC41709m0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i11 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i11 & 8) != 0) {
            interfaceC41709m0 = C41713n0.m91125a(Actual_jvmKt.ioDispatcher().plus(C41727q2.m91192b(null, 1, null)));
        }
        return dataStoreFactory.create(storage, replaceFileCorruptionHandler, list, interfaceC41709m0);
    }

    @JvmOverloads
    @NotNull
    public final <T> DataStore<T> create(@NotNull Serializer<T> serializer, @Nullable ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @NotNull List<? extends DataMigration<T>> migrations, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, migrations, null, produceFile, 8, null);
    }

    @JvmOverloads
    @NotNull
    public final <T> DataStore<T> create(@NotNull Serializer<T> serializer, @Nullable ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, produceFile, 12, null);
    }

    private DataStoreFactory() {
    }

    @JvmOverloads
    @NotNull
    public final <T> DataStore<T> create(@NotNull Serializer<T> serializer, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, serializer, null, null, null, produceFile, 14, null);
    }

    public static /* synthetic */ DataStore create$default(DataStoreFactory dataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC41709m0 interfaceC41709m0, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i11 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i11 & 8) != 0) {
            interfaceC41709m0 = C41713n0.m91125a(C41782z0.m91392b().plus(C41727q2.m91192b(null, 1, null)));
        }
        return dataStoreFactory.create(serializer, replaceFileCorruptionHandler, list, interfaceC41709m0, function0);
    }

    @JvmOverloads
    @NotNull
    public final <T> DataStore<T> create(@NotNull Storage<T> storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return create$default(this, storage, null, null, null, 14, null);
    }

    @JvmOverloads
    @NotNull
    public final <T> DataStore<T> create(@NotNull Storage<T> storage, @Nullable ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, null, null, 12, null);
    }

    @JvmOverloads
    @NotNull
    public final <T> DataStore<T> create(@NotNull Storage<T> storage, @Nullable ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, @NotNull List<? extends DataMigration<T>> migrations) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, null, 8, null);
    }

    @JvmOverloads
    @NotNull
    public final <T> DataStore<T> create(@NotNull Serializer<T> serializer, @Nullable ReplaceFileCorruptionHandler<T> corruptionHandler, @NotNull List<? extends DataMigration<T>> migrations, @NotNull InterfaceC41709m0 scope, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create(new FileStorage(serializer, null, produceFile, 2, null), corruptionHandler, migrations, scope);
    }

    @JvmOverloads
    @NotNull
    public final <T> DataStore<T> create(@NotNull Storage<T> storage, @Nullable ReplaceFileCorruptionHandler<T> corruptionHandler, @NotNull List<? extends DataMigration<T>> migrations, @NotNull InterfaceC41709m0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (corruptionHandler == null) {
            corruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, CollectionsKt.listOf(DataMigrationInitializer.INSTANCE.getInitializer(migrations)), corruptionHandler, scope);
    }
}
