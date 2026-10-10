package androidx.datastore.preferences.core;

import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.Storage;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.FilesKt;

/* JADX INFO: compiled from: PreferenceDataStoreFactory.jvmAndroid.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0014JU\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, m90084d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStoreFactory;", "", "<init>", "()V", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "Landroidx/datastore/preferences/core/Preferences;", "corruptionHandler", "", "Landroidx/datastore/core/DataMigration;", "migrations", "Lkotlinx/coroutines/m0;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/DataStore;", "create", "(Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function0;)Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/Storage;", "storage", "(Landroidx/datastore/core/Storage;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;Lkotlinx/coroutines/m0;)Landroidx/datastore/core/DataStore;", "Lokio/Path;", "createWithPath", "datastore-preferences-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class PreferenceDataStoreFactory {

    @NotNull
    public static final PreferenceDataStoreFactory INSTANCE = new PreferenceDataStoreFactory();

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC41709m0 interfaceC41709m0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i11 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i11 & 8) != 0) {
            interfaceC41709m0 = C41713n0.m91125a(Actual_jvmAndroidKt.ioDispatcher().plus(C41727q2.m91192b(null, 1, null)));
        }
        return preferenceDataStoreFactory.create((Storage<Preferences>) storage, (ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, interfaceC41709m0);
    }

    @JvmOverloads
    @NotNull
    public final DataStore<Preferences> create(@NotNull Storage<Preferences> storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return create$default(this, storage, (ReplaceFileCorruptionHandler) null, (List) null, (InterfaceC41709m0) null, 14, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore<Preferences> createWithPath(@Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull List<? extends DataMigration<Preferences>> migrations, @NotNull Function0<Path> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, migrations, null, produceFile, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore createWithPath$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC41709m0 interfaceC41709m0, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i11 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i11 & 4) != 0) {
            interfaceC41709m0 = C41713n0.m91125a(Actual_jvmAndroidKt.ioDispatcher().plus(C41727q2.m91192b(null, 1, null)));
        }
        return preferenceDataStoreFactory.createWithPath(replaceFileCorruptionHandler, list, interfaceC41709m0, function0);
    }

    @JvmOverloads
    @NotNull
    public final DataStore<Preferences> create(@NotNull Storage<Preferences> storage, @Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, (List) null, (InterfaceC41709m0) null, 12, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore<Preferences> createWithPath(@Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull Function0<Path> produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return createWithPath$default(this, replaceFileCorruptionHandler, null, null, produceFile, 6, null);
    }

    private PreferenceDataStoreFactory() {
    }

    @JvmOverloads
    @NotNull
    public final DataStore<Preferences> create(@NotNull Storage<Preferences> storage, @Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull List<? extends DataMigration<Preferences>> migrations) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, (InterfaceC41709m0) null, 8, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore<Preferences> createWithPath(@NotNull Function0<Path> produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return createWithPath$default(this, null, null, null, produceFile, 7, null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore<Preferences> create(@Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull List<? extends DataMigration<Preferences>> migrations, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, migrations, (InterfaceC41709m0) null, produceFile, 4, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore<Preferences> createWithPath(@Nullable ReplaceFileCorruptionHandler<Preferences> corruptionHandler, @NotNull List<? extends DataMigration<Preferences>> migrations, @NotNull InterfaceC41709m0 scope, @NotNull final Function0<Path> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create(corruptionHandler, migrations, scope, new Function0<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory.createWithPath.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                return produceFile.invoke().toFile();
            }
        });
    }

    @JvmOverloads
    @NotNull
    public final DataStore<Preferences> create(@Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, replaceFileCorruptionHandler, (List) null, (InterfaceC41709m0) null, produceFile, 6, (Object) null);
    }

    @JvmOverloads
    @NotNull
    public final DataStore<Preferences> create(@NotNull Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return create$default(this, (ReplaceFileCorruptionHandler) null, (List) null, (InterfaceC41709m0) null, produceFile, 7, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataStore create$default(PreferenceDataStoreFactory preferenceDataStoreFactory, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC41709m0 interfaceC41709m0, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i11 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i11 & 4) != 0) {
            interfaceC41709m0 = C41713n0.m91125a(C41782z0.m91392b().plus(C41727q2.m91192b(null, 1, null)));
        }
        return preferenceDataStoreFactory.create((ReplaceFileCorruptionHandler<Preferences>) replaceFileCorruptionHandler, (List<? extends DataMigration<Preferences>>) list, interfaceC41709m0, (Function0<? extends File>) function0);
    }

    @JvmOverloads
    @NotNull
    public final DataStore<Preferences> create(@Nullable ReplaceFileCorruptionHandler<Preferences> corruptionHandler, @NotNull List<? extends DataMigration<Preferences>> migrations, @NotNull InterfaceC41709m0 scope, @NotNull final Function0<? extends File> produceFile) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        return new PreferenceDataStore(create(new FileStorage(PreferencesFileSerializer.INSTANCE, null, new Function0<File>() { // from class: androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final File invoke() {
                File fileInvoke = produceFile.invoke();
                if (Intrinsics.areEqual(FilesKt.getExtension(fileInvoke), "preferences_pb")) {
                    File absoluteFile = fileInvoke.getAbsoluteFile();
                    Intrinsics.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + fileInvoke + " does not match required extension for Preferences file: preferences_pb").toString());
            }
        }, 2, null), corruptionHandler, migrations, scope));
    }

    @JvmOverloads
    @NotNull
    public final DataStore<Preferences> create(@NotNull Storage<Preferences> storage, @Nullable ReplaceFileCorruptionHandler<Preferences> corruptionHandler, @NotNull List<? extends DataMigration<Preferences>> migrations, @NotNull InterfaceC41709m0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new PreferenceDataStore(DataStoreFactory.INSTANCE.create(storage, corruptionHandler, migrations, scope));
    }
}
