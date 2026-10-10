package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.datastore.core.DataMigration;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001,Bu\b\u0017\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012$\b\u0002\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u0012(\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f¢\u0006\u0002\u0010\u0011Bw\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012$\b\u0002\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u0012(\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f¢\u0006\u0002\u0010\u0015B\u0087\u0001\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012$\b\u0002\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u0012(\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0017J\u000e\u0010!\u001a\u00020\"H\u0096@¢\u0006\u0002\u0010#J\u0018\u0010$\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0002J\u0018\u0010(\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0016\u0010\u000e\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020\f2\u0006\u0010)\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010*R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR,\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010 ¨\u0006-"}, m90084d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/datastore/core/DataMigration;", "produceSharedPreferences", "Lkotlin/Function0;", "Landroid/content/SharedPreferences;", "keysToMigrate", "", "", "shouldRunMigration", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "migrate", "Lkotlin/Function3;", "Landroidx/datastore/migrations/SharedPreferencesView;", "(Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "context", "Landroid/content/Context;", "sharedPreferencesName", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "name", "(Lkotlin/jvm/functions/Function0;Ljava/util/Set;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroid/content/Context;Ljava/lang/String;)V", "keySet", "", "Lkotlin/jvm/functions/Function3;", "sharedPrefs", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "sharedPrefs$delegate", "Lkotlin/Lazy;", "Lkotlin/jvm/functions/Function2;", "cleanUp", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSharedPreferences", "getSharedPrefsBackup", "Ljava/io/File;", "prefsFile", "getSharedPrefsFile", "currentData", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldMigrate", "Api24Impl", "datastore_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSharedPreferencesMigration.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/migrations/SharedPreferencesMigration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n1747#2,3:324\n1855#2,2:327\n*S KotlinDebug\n*F\n+ 1 SharedPreferencesMigration.android.kt\nandroidx/datastore/migrations/SharedPreferencesMigration\n*L\n158#1:324,3\n178#1:327,2\n*E\n"})
public final class SharedPreferencesMigration<T> implements DataMigration<T> {

    @Nullable
    private final Context context;

    @Nullable
    private final Set<String> keySet;

    @NotNull
    private final Function3<SharedPreferencesView, T, Continuation<? super T>, Object> migrate;

    @Nullable
    private final String name;

    /* JADX INFO: renamed from: sharedPrefs$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sharedPrefs;

    @NotNull
    private final Function2<T, Continuation<? super Boolean>, Object> shouldRunMigration;

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1 */
    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.migrations.SharedPreferencesMigration$1", m90122f = "SharedPreferencesMigration.android.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23601 extends SuspendLambda implements Function2<T, Continuation<? super Boolean>, Object> {
        int label;

        public C23601(Continuation<? super C23601> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C23601(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(T t11, @Nullable Continuation<? super Boolean> continuation) {
            return ((C23601) create(t11, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2 */
    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.migrations.SharedPreferencesMigration$2", m90122f = "SharedPreferencesMigration.android.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23612 extends SuspendLambda implements Function2<T, Continuation<? super Boolean>, Object> {
        int label;

        public C23612(Continuation<? super C23612> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C23612(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(T t11, @Nullable Continuation<? super Boolean> continuation) {
            return ((C23612) create(t11, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3 */
    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.migrations.SharedPreferencesMigration$3", m90122f = "SharedPreferencesMigration.android.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23623 extends SuspendLambda implements Function2<T, Continuation<? super Boolean>, Object> {
        int label;

        public C23623(Continuation<? super C23623> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C23623(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(T t11, @Nullable Continuation<? super Boolean> continuation) {
            return ((C23623) create(t11, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @RequiresApi(24)
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m90084d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration$Api24Impl;", "", "()V", "deleteSharedPreferences", "", "context", "Landroid/content/Context;", "name", "", "datastore_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Api24Impl {

        @NotNull
        public static final Api24Impl INSTANCE = new Api24Impl();

        @JvmStatic
        @DoNotInline
        public static final boolean deleteSharedPreferences(@NotNull Context context, @NotNull String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            return context.deleteSharedPreferences(name);
        }

        private Api24Impl() {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1 */
    /* JADX INFO: compiled from: SharedPreferencesMigration.android.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.migrations.SharedPreferencesMigration", m90122f = "SharedPreferencesMigration.android.kt", m90123i = {0}, m90124l = {151}, m90125m = "shouldMigrate", m90126n = {"this"}, m90127s = {"L$0"})
    public static final class C23641 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedPreferencesMigration<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23641(SharedPreferencesMigration<T> sharedPreferencesMigration, Continuation<? super C23641> continuation) {
            super(continuation);
            this.this$0 = sharedPreferencesMigration;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.shouldMigrate(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Set<String> keysToMigrate, @NotNull Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, keysToMigrate, null, migrate, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Context context, @NotNull String sharedPreferencesName, @NotNull Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(context, sharedPreferencesName, null, null, migrate, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    private final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs.getValue();
    }

    private final File getSharedPrefsBackup(File prefsFile) {
        return new File(prefsFile.getPath() + ".bak");
    }

    private final File getSharedPrefsFile(Context context, String name) {
        return new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), name + ".xml");
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object migrate(T t11, @NotNull Continuation<? super T> continuation) {
        return this.migrate.invoke(new SharedPreferencesView(getSharedPrefs(), this.keySet), t11, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object shouldMigrate(T t11, @NotNull Continuation<? super Boolean> continuation) {
        C23641 c23641;
        SharedPreferencesMigration<T> sharedPreferencesMigration;
        if (continuation instanceof C23641) {
            c23641 = (C23641) continuation;
            int i11 = c23641.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c23641.label = i11 - Integer.MIN_VALUE;
            } else {
                c23641 = new C23641(this, continuation);
            }
        } else {
            c23641 = new C23641(this, continuation);
        }
        Object objInvoke = c23641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c23641.label;
        boolean z11 = true;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            Function2<T, Continuation<? super Boolean>, Object> function2 = this.shouldRunMigration;
            c23641.L$0 = this;
            c23641.label = 1;
            objInvoke = function2.invoke(t11, c23641);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            sharedPreferencesMigration = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sharedPreferencesMigration = (SharedPreferencesMigration) c23641.L$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boxing.boxBoolean(false);
        }
        Set<String> set = sharedPreferencesMigration.keySet;
        if (set == null) {
            Map<String, ?> all = sharedPreferencesMigration.getSharedPrefs().getAll();
            Intrinsics.checkNotNullExpressionValue(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z11 = false;
            }
        } else {
            SharedPreferences sharedPrefs = sharedPreferencesMigration.getSharedPrefs();
            if (set == null || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (sharedPrefs.contains((String) it.next())) {
                    }
                }
                z11 = false;
            } else {
                z11 = false;
            }
        }
        return Boxing.boxBoolean(z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate, @NotNull Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, (Function2) null, migrate, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    private final void deleteSharedPreferences(Context context, String name) {
        Api24Impl.deleteSharedPreferences(context, name);
    }

    @Override // androidx.datastore.core.DataMigration
    @Nullable
    public Object cleanUp(@NotNull Continuation<? super Unit> continuation) throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = getSharedPrefs().edit();
        Set<String> set = this.keySet;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (editorEdit.commit()) {
            if (getSharedPrefs().getAll().isEmpty() && (context = this.context) != null && (str = this.name) != null) {
                deleteSharedPreferences(context, str);
            }
            Set<String> set2 = this.keySet;
            if (set2 != null) {
                set2.clear();
            }
            return Unit.INSTANCE;
        }
        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences, @NotNull Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, (Set) null, (Function2) null, migrate, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SharedPreferencesMigration(Function0<? extends SharedPreferences> function0, Set<String> set, Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> function3, Context context, String str) {
        this.shouldRunMigration = function2;
        this.migrate = function3;
        this.context = context;
        this.name = str;
        this.sharedPrefs = LazyKt.lazy(function0);
        this.keySet = set == SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() ? null : CollectionsKt.toMutableSet(set);
    }

    public /* synthetic */ SharedPreferencesMigration(Function0 function0, Set set, Function2 function2, Function3 function3, Context context, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((Function0<? extends SharedPreferences>) function0, (Set<String>) set, (i11 & 4) != 0 ? new C23601(null) : function2, function3, context, str);
    }

    public /* synthetic */ SharedPreferencesMigration(Function0 function0, Set set, Function2 function2, Function3 function3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((Function0<? extends SharedPreferences>) function0, (Set<String>) ((i11 & 2) != 0 ? SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set), (i11 & 4) != 0 ? new C23612(null) : function2, function3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SharedPreferencesMigration(@NotNull Function0<? extends SharedPreferences> produceSharedPreferences, @NotNull Set<String> keysToMigrate, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> shouldRunMigration, @NotNull Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(produceSharedPreferences, keysToMigrate, shouldRunMigration, migrate, (Context) null, (String) null);
        Intrinsics.checkNotNullParameter(produceSharedPreferences, "produceSharedPreferences");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }

    public /* synthetic */ SharedPreferencesMigration(Context context, String str, Set set, Function2 function2, Function3 function3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? SharedPreferencesMigration_androidKt.getMIGRATE_ALL_KEYS() : set, (i11 & 8) != 0 ? new C23623(null) : function2, function3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SharedPreferencesMigration(@NotNull final Context context, @NotNull final String sharedPreferencesName, @NotNull Set<String> keysToMigrate, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> shouldRunMigration, @NotNull Function3<? super SharedPreferencesView, ? super T, ? super Continuation<? super T>, ? extends Object> migrate) {
        this(new Function0<SharedPreferences>() { // from class: androidx.datastore.migrations.SharedPreferencesMigration.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final SharedPreferences invoke() {
                SharedPreferences sharedPreferences = context.getSharedPreferences(sharedPreferencesName, 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }
}
