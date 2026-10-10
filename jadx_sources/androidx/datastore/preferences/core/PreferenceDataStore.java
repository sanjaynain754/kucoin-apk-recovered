package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import com.facebook.react.uimanager.ViewProps;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreferenceDataStoreFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\r\u001a\u00020\u000221\u0010\f\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStore;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "delegate", "<init>", "(Landroidx/datastore/core/DataStore;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", ViewProps.TRANSFORM, "updateData", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/datastore/core/DataStore;", "Lkotlinx/coroutines/flow/e;", "getData", "()Lkotlinx/coroutines/flow/e;", "data", "datastore-preferences-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class PreferenceDataStore implements DataStore<Preferences> {

    @NotNull
    private final DataStore<Preferences> delegate;

    /* JADX INFO: renamed from: androidx.datastore.preferences.core.PreferenceDataStore$updateData$2 */
    /* JADX INFO: compiled from: PreferenceDataStoreFactory.kt */
    @Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m90084d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "it"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", m90122f = "PreferenceDataStoreFactory.kt", m90123i = {}, m90124l = {94}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C23712 extends SuspendLambda implements Function2<Preferences, Continuation<? super Preferences>, Object> {
        final /* synthetic */ Function2<Preferences, Continuation<? super Preferences>, Object> $transform;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull Preferences preferences, @Nullable Continuation<? super Preferences> continuation) {
            return ((C23712) create(preferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C23712(Function2<? super Preferences, ? super Continuation<? super Preferences>, ? extends Object> function2, Continuation<? super C23712> continuation) {
            super(2, continuation);
            this.$transform = function2;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C23712 c23712 = new C23712(this.$transform, continuation);
            c23712.L$0 = obj;
            return c23712;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Preferences preferences = (Preferences) this.L$0;
                Function2<Preferences, Continuation<? super Preferences>, Object> function2 = this.$transform;
                this.label = 1;
                obj = function2.invoke(preferences, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Preferences preferences2 = (Preferences) obj;
            Intrinsics.checkNotNull(preferences2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((MutablePreferences) preferences2).freeze$datastore_preferences_core_release();
            return preferences2;
        }
    }

    public PreferenceDataStore(@NotNull DataStore<Preferences> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.DataStore
    @NotNull
    public InterfaceC41634e<Preferences> getData() {
        return this.delegate.getData();
    }

    @Override // androidx.datastore.core.DataStore
    @Nullable
    public Object updateData(@NotNull Function2<? super Preferences, ? super Continuation<? super Preferences>, ? extends Object> function2, @NotNull Continuation<? super Preferences> continuation) {
        return this.delegate.updateData(new C23712(function2, null), continuation);
    }
}
