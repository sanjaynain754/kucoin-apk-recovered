package com.kubi.sdk.lib.kunlun.sdk.p115db;

import android.app.Application;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.room.Database;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.kubi.sdk.lib.kunlun.sdk.KunLunSdk;
import com.kubi.sdk.lib.kunlun.sdk.p115db.KunlunEventDBProxy;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p386jz.InterfaceC40824b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KunlunEventDBProxy.kt */
/* JADX INFO: loaded from: classes3.dex */
@Database(entities = {KunlunDBEventData.class}, exportSchema = false, version = 1)
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048 X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/lib/kunlun/sdk/db/KunlunEventDBProxy;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Ljz/b;", "d", "()Ljz/b;", "kunlunEventDao", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Companion", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public abstract class KunlunEventDBProxy extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy<KunlunEventDBProxy> f46931b = LazyKt.lazy(new Function0<KunlunEventDBProxy>() { // from class: com.kubi.sdk.lib.kunlun.sdk.db.KunlunEventDBProxy$Companion$db$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @Nullable
        public final KunlunEventDBProxy invoke() {
            Application applicationM57118d = KunLunSdk.f46915a.m57118d();
            if (applicationM57118d == null) {
                return null;
            }
            KunlunEventDBProxy kunlunEventDBProxy = (KunlunEventDBProxy) Room.databaseBuilder(applicationM57118d, KunlunEventDBProxy.class, "KunlunEvent.db").fallbackToDestructiveMigration().build();
            KunlunEventDBProxy.Companion companion = KunlunEventDBProxy.INSTANCE;
            InvalidationTracker invalidationTracker = kunlunEventDBProxy.getInvalidationTracker();
            Intrinsics.checkNotNullExpressionValue(invalidationTracker, "db.invalidationTracker");
            companion.m57147b(invalidationTracker);
            return kunlunEventDBProxy;
        }
    });

    /* JADX INFO: compiled from: KunlunEventDBProxy.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/lib/kunlun/sdk/db/KunlunEventDBProxy$Companion;", "", "<init>", "()V", "Lcom/kubi/sdk/lib/kunlun/sdk/db/KunlunEventDBProxy;", "getInstance", "()Lcom/kubi/sdk/lib/kunlun/sdk/db/KunlunEventDBProxy;", "Landroidx/room/InvalidationTracker;", "tracker", "", "b", "(Landroidx/room/InvalidationTracker;)V", "db$delegate", "Lkotlin/Lazy;", "d", "db", "kunlun-sdk_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: b */
        public final void m57147b(InvalidationTracker tracker) {
            try {
                Field declaredField = InvalidationTracker.class.getDeclaredField("mRefreshRunnable");
                declaredField.setAccessible(true);
                declaredField.set(tracker, new Runnable() { // from class: jz.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        KunlunEventDBProxy.Companion.m57146c();
                    }
                });
            } catch (Exception unused) {
            }
        }

        /* JADX INFO: renamed from: d */
        public final KunlunEventDBProxy m57148d() {
            return (KunlunEventDBProxy) KunlunEventDBProxy.f46931b.getValue();
        }

        @Nullable
        public final KunlunEventDBProxy getInstance() {
            return m57148d();
        }

        /* JADX INFO: renamed from: c */
        public static final void m57146c() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract InterfaceC40824b mo57144d();
}
