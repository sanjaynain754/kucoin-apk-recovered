package androidx.room.migration;

import androidx.sqlite.p023db.SupportSQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Migration.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¨\u0006\t"}, m90084d2 = {"Migration", "Landroidx/room/migration/Migration;", "startVersion", "", "endVersion", "migrate", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "room-ktx_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class MigrationKt {
    @NotNull
    public static final Migration Migration(int i11, int i12, @NotNull Function1<? super SupportSQLiteDatabase, Unit> migrate) {
        Intrinsics.checkNotNullParameter(migrate, "migrate");
        return new MigrationImpl(i11, i12, migrate);
    }
}
