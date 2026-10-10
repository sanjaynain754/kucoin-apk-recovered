package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p023db.SupportSQLiteDatabase;

/* JADX INFO: renamed from: androidx.room.w */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C4031w implements Function {
    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        return Boolean.valueOf(((SupportSQLiteDatabase) obj).yieldIfContendedSafely());
    }
}
