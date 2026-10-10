package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.properties.ReadOnlyProperty;

/* JADX INFO: compiled from: PreferenceDataStoreDelegate.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ae\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u00070\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"", "name", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "Landroidx/datastore/preferences/core/Preferences;", "corruptionHandler", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Landroidx/datastore/core/DataMigration;", "produceMigrations", "Lkotlinx/coroutines/m0;", "scope", "Lkotlin/properties/ReadOnlyProperty;", "Landroidx/datastore/core/DataStore;", "preferencesDataStore", "(Ljava/lang/String;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/m0;)Lkotlin/properties/ReadOnlyProperty;", "datastore-preferences_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@JvmName(name = "PreferenceDataStoreDelegateKt")
public final class PreferenceDataStoreDelegateKt {
    @NotNull
    public static final ReadOnlyProperty<Context, DataStore<Preferences>> preferencesDataStore(@NotNull String name, @Nullable ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, @NotNull Function1<? super Context, ? extends List<? extends DataMigration<Preferences>>> produceMigrations, @NotNull InterfaceC41709m0 scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new PreferenceDataStoreSingletonDelegate(name, replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static /* synthetic */ ReadOnlyProperty preferencesDataStore$default(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, InterfaceC41709m0 interfaceC41709m0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i11 & 4) != 0) {
            function1 = new Function1<Context, List<? extends DataMigration<Preferences>>>() { // from class: androidx.datastore.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore.1
                @Override // p852kotlin.jvm.functions.Function1
                @NotNull
                public final List<DataMigration<Preferences>> invoke(@NotNull Context it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return CollectionsKt.emptyList();
                }
            };
        }
        if ((i11 & 8) != 0) {
            interfaceC41709m0 = C41713n0.m91125a(C41782z0.m91392b().plus(C41727q2.m91192b(null, 1, null)));
        }
        return preferencesDataStore(str, replaceFileCorruptionHandler, function1, interfaceC41709m0);
    }
}
