package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m90084d2 = {"Lkotlinx/coroutines/flow/f;", "Landroidx/datastore/preferences/core/Preferences;", "", "exception", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;Ljava/lang/Throwable;)V"}, m90085k = 3, m90086mv = {1, 8, 0})
@DebugMetadata(m90121c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", m90122f = "SessionDatastore.kt", m90123i = {}, m90124l = {76}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class SessionDatastoreImpl$firebaseSessionDataFlow$1 extends SuspendLambda implements Function3<InterfaceC41635f<? super Preferences>, Throwable, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public SessionDatastoreImpl$firebaseSessionDataFlow$1(Continuation<? super SessionDatastoreImpl$firebaseSessionDataFlow$1> continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull InterfaceC41635f<? super Preferences> interfaceC41635f, @NotNull Throwable th2, @Nullable Continuation<? super Unit> continuation) {
        SessionDatastoreImpl$firebaseSessionDataFlow$1 sessionDatastoreImpl$firebaseSessionDataFlow$1 = new SessionDatastoreImpl$firebaseSessionDataFlow$1(continuation);
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$0 = interfaceC41635f;
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$1 = th2;
        return sessionDatastoreImpl$firebaseSessionDataFlow$1.invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41635f interfaceC41635f = (InterfaceC41635f) this.L$0;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.L$1);
            Preferences preferencesCreateEmpty = PreferencesFactory.createEmpty();
            this.L$0 = null;
            this.label = 1;
            if (interfaceC41635f.emit(preferencesCreateEmpty, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
