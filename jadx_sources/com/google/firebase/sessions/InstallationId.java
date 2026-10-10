package com.google.firebase.sessions;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import sg0.C44409b;

/* JADX INFO: compiled from: InstallationId.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, m90084d2 = {"Lcom/google/firebase/sessions/InstallationId;", "", "fid", "", "authToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthToken", "()Ljava/lang/String;", "getFid", "Companion", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class InstallationId {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "InstallationId";

    @NotNull
    private final String authToken;

    @NotNull
    private final String fid;

    /* JADX INFO: compiled from: InstallationId.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m90084d2 = {"Lcom/google/firebase/sessions/InstallationId$Companion;", "", "()V", "TAG", "", "create", "Lcom/google/firebase/sessions/InstallationId;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        
            if (r10 == r1) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [com.google.firebase.installations.FirebaseInstallationsApi] */
        /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.installations.FirebaseInstallationsApi, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object create(@NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull Continuation<? super InstallationId> continuation) {
            InstallationId$Companion$create$1 installationId$Companion$create$1;
            ?? r11;
            String str;
            ?? r12;
            if (continuation instanceof InstallationId$Companion$create$1) {
                installationId$Companion$create$1 = (InstallationId$Companion$create$1) continuation;
                int i11 = installationId$Companion$create$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    installationId$Companion$create$1.label = i11 - Integer.MIN_VALUE;
                } else {
                    installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, continuation);
                }
            } else {
                installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, continuation);
            }
            Object objM97939a = installationId$Companion$create$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = installationId$Companion$create$1.label;
            String str2 = "";
            try {
                try {
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(objM97939a);
                        Task<InstallationTokenResult> token = firebaseInstallationsApi.getToken(false);
                        Intrinsics.checkNotNullExpressionValue(token, "firebaseInstallations.getToken(false)");
                        installationId$Companion$create$1.L$0 = firebaseInstallationsApi;
                        installationId$Companion$create$1.label = 1;
                        objM97939a = C44409b.m97939a(token, installationId$Companion$create$1);
                        firebaseInstallationsApi = firebaseInstallationsApi;
                        if (objM97939a == coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i12 == 1) {
                        FirebaseInstallationsApi firebaseInstallationsApi2 = (FirebaseInstallationsApi) installationId$Companion$create$1.L$0;
                        ResultKt.throwOnFailure(objM97939a);
                        firebaseInstallationsApi = firebaseInstallationsApi2;
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str3 = (String) installationId$Companion$create$1.L$0;
                        ResultKt.throwOnFailure(objM97939a);
                        firebaseInstallationsApi = str3;
                    }
                    Intrinsics.checkNotNullExpressionValue(objM97939a, "{\n          firebaseInst…ions.id.await()\n        }");
                    str2 = (String) objM97939a;
                    r12 = firebaseInstallationsApi;
                    return new InstallationId(str2, r12, null);
                    String token2 = ((InstallationTokenResult) objM97939a).getToken();
                    Intrinsics.checkNotNullExpressionValue(token2, "{\n          firebaseInst…).await().token\n        }");
                    r11 = firebaseInstallationsApi;
                    str = token2;
                } catch (Exception e11) {
                    Log.w(InstallationId.TAG, "Error getting authentication token.", e11);
                    r11 = firebaseInstallationsApi;
                    str = "";
                }
                Task<String> id2 = r11.getId();
                Intrinsics.checkNotNullExpressionValue(id2, "firebaseInstallations.id");
                installationId$Companion$create$1.L$0 = str;
                installationId$Companion$create$1.label = 2;
                objM97939a = C44409b.m97939a(id2, installationId$Companion$create$1);
                firebaseInstallationsApi = str;
            } catch (Exception e12) {
                Log.w(InstallationId.TAG, "Error getting Firebase installation id .", e12);
                r12 = firebaseInstallationsApi;
            }
        }
    }

    public /* synthetic */ InstallationId(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    private InstallationId(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }

    @NotNull
    public final String getAuthToken() {
        return this.authToken;
    }

    @NotNull
    public final String getFid() {
        return this.fid;
    }
}
