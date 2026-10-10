package com.kubi.monitor.firebase;

import android.os.Bundle;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import com.google.firebase.ktx.Firebase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.Intrinsics;
import sg0.C44409b;

/* JADX INFO: compiled from: FirebaseConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/monitor/firebase/FirebaseConfig;", "", "<init>", "()V", "", "uid", "", "c", "(Ljava/lang/String;)V", "", JPushConstants.Message.KEY_FOREGROUND, "b", "(Z)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Monitor-firebase_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class FirebaseConfig {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FirebaseConfig f35540a;

    static {
        FirebaseConfig firebaseConfig = new FirebaseConfig();
        f35540a = firebaseConfig;
        firebaseConfig.m42440b(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m42439a(@NotNull Continuation<? super String> continuation) {
        FirebaseConfig$getAppInstanceId$1 firebaseConfig$getAppInstanceId$1;
        Object objM103844constructorimpl;
        if (continuation instanceof FirebaseConfig$getAppInstanceId$1) {
            firebaseConfig$getAppInstanceId$1 = (FirebaseConfig$getAppInstanceId$1) continuation;
            int i11 = firebaseConfig$getAppInstanceId$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                firebaseConfig$getAppInstanceId$1.label = i11 - Integer.MIN_VALUE;
            } else {
                firebaseConfig$getAppInstanceId$1 = new FirebaseConfig$getAppInstanceId$1(this, continuation);
            }
        } else {
            firebaseConfig$getAppInstanceId$1 = new FirebaseConfig$getAppInstanceId$1(this, continuation);
        }
        Object objM97939a = firebaseConfig$getAppInstanceId$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = firebaseConfig$getAppInstanceId$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM97939a);
                Result.Companion companion = Result.INSTANCE;
                Task<String> appInstanceId = AnalyticsKt.getAnalytics(Firebase.INSTANCE).getAppInstanceId();
                Intrinsics.checkNotNullExpressionValue(appInstanceId, "Firebase.analytics.appInstanceId");
                firebaseConfig$getAppInstanceId$1.label = 1;
                objM97939a = C44409b.m97939a(appInstanceId, firebaseConfig$getAppInstanceId$1);
                if (objM97939a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM97939a);
            }
            objM103844constructorimpl = Result.m103844constructorimpl((String) objM97939a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String str = (String) objM103844constructorimpl;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: b */
    public final void m42440b(boolean isForeground) {
        String str = isForeground ? CredentialEntry.TRUE_STRING : CredentialEntry.FALSE_STRING;
        Bundle bundle = new Bundle();
        bundle.putString("app_is_foreground", str);
        C19219a.f35541a.m42443b(bundle);
    }

    /* JADX INFO: renamed from: c */
    public final void m42441c(@Nullable String uid) {
        try {
            AnalyticsKt.getAnalytics(Firebase.INSTANCE).setUserId(uid);
        } catch (Exception unused) {
        }
    }
}
