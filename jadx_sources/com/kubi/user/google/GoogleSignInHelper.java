package com.kubi.user.google;

import android.app.Activity;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManager;
import androidx.credentials.CustomCredential;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.NoCredentialException;
import com.google.android.libraries.identity.googleid.GetGoogleIdOption;
import com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption;
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import com.kubi.mvi.common.MviExKt;
import com.kubi.otc.entity.OtcAd;
import com.kubi.user.exception.UserCenterException;
import com.kubi.user.exception.UserCenterExtAccountMessage;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.tencent.bugly.proguard.C33864ph;
import d70.C36638a;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p481ny.C42899b;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: GoogleSignInHelper.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002%&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J$\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006'"}, m90084d2 = {"Lcom/kubi/user/google/GoogleSignInHelper;", "", "<init>", "()V", "DEBUG_WEB_CLIENT_ID", "", "RELEASE_WEB_CLIENT_ID", "webClientId", "getWebClientId", "()Ljava/lang/String;", "TAG", "CODE_USER_CANCEL", "CODE_EMPTY", "CODE_NOT_AVAILABLE", "CODE_PARSE", "CODE_NO_CREDENTIAL", "CODE_UNKNOWN", "authorize", "Lcom/kubi/user/google/GoogleSignInHelper$Result;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildGoogleIdRequest", "Landroidx/credentials/GetCredentialRequest;", "filterByAuthorizedAccounts", "", "autoSelectEnabled", "buildSignInWithGoogleRequest", "parseGoogleCredential", URLCredentialContract.FeedEntry.TABLE_NAME, "Landroidx/credentials/Credential;", C33864ph.f71456b, "Lcom/kubi/user/google/GoogleSignInHelper$Result$Failure;", "code", "msg", "throwable", "", "ExtInfo", "Result", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGoogleSignInHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleSignInHelper.kt\ncom/kubi/user/google/GoogleSignInHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 UserCenterIssue.kt\ncom/kubi/user/exception/UserCenterIssueKt\n*L\n1#1,166:1\n1#2:167\n57#3,8:168\n76#3,2:176\n*S KotlinDebug\n*F\n+ 1 GoogleSignInHelper.kt\ncom/kubi/user/google/GoogleSignInHelper\n*L\n159#1:168,8\n161#1:176,2\n*E\n"})
public final class GoogleSignInHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final GoogleSignInHelper f53659a = new GoogleSignInHelper();

    /* JADX INFO: renamed from: com.kubi.user.google.GoogleSignInHelper$a, reason: from toString */
    /* JADX INFO: compiled from: GoogleSignInHelper.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/user/google/GoogleSignInHelper$ExtInfo;", "", "idToken", "", "email", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdToken", "()Ljava/lang/String;", "getEmail", "getDisplayName", "toMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nGoogleSignInHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleSignInHelper.kt\ncom/kubi/user/google/GoogleSignInHelper$ExtInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"})
    public static final /* data */ class ExtInfo {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final String idToken;

        /* JADX INFO: renamed from: b, reason: from toString */
        @Nullable
        public final String email;

        /* JADX INFO: renamed from: c, reason: from toString */
        @Nullable
        public final String displayName;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ExtInfo)) {
                return false;
            }
            ExtInfo extInfo = (ExtInfo) other;
            return Intrinsics.areEqual(this.idToken, extInfo.idToken) && Intrinsics.areEqual(this.email, extInfo.email) && Intrinsics.areEqual(this.displayName, extInfo.displayName);
        }

        public ExtInfo(@NotNull String idToken, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(idToken, "idToken");
            this.idToken = idToken;
            this.email = str;
            this.displayName = str2;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final HashMap<String, String> m65483a() {
            HashMap<String, String> mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("idToken", this.idToken));
            String str = this.email;
            if (str != null) {
                if (StringsKt.isBlank(str)) {
                    str = null;
                }
                if (str != null) {
                    mapHashMapOf.put("email", str);
                }
            }
            String str2 = this.displayName;
            if (str2 != null) {
                String str3 = StringsKt.isBlank(str2) ? null : str2;
                if (str3 != null) {
                    mapHashMapOf.put("displayName", str3);
                }
            }
            return mapHashMapOf;
        }

        public int hashCode() {
            int iHashCode = this.idToken.hashCode() * 31;
            String str = this.email;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.displayName;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ExtInfo(idToken=" + this.idToken + ", email=" + this.email + ", displayName=" + this.displayName + ')';
        }
    }

    /* JADX INFO: renamed from: com.kubi.user.google.GoogleSignInHelper$b */
    /* JADX INFO: compiled from: GoogleSignInHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/user/google/GoogleSignInHelper$Result;", "", "<init>", "()V", "Success", "Failure", "Lcom/kubi/user/google/GoogleSignInHelper$Result$Failure;", "Lcom/kubi/user/google/GoogleSignInHelper$Result$Success;", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static abstract class AbstractC26709b {

        /* JADX INFO: renamed from: com.kubi.user.google.GoogleSignInHelper$b$a, reason: from toString */
        /* JADX INFO: compiled from: GoogleSignInHelper.kt */
        @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/user/google/GoogleSignInHelper$Result$Failure;", "Lcom/kubi/user/google/GoogleSignInHelper$Result;", "code", "", "msg", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMsg", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class Failure extends AbstractC26709b {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final String code;

            /* JADX INFO: renamed from: b, reason: from toString */
            @NotNull
            public final String msg;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) other;
                return Intrinsics.areEqual(this.code, failure.code) && Intrinsics.areEqual(this.msg, failure.msg);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(@NotNull String code, @NotNull String msg) {
                super(null);
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(msg, "msg");
                this.code = code;
                this.msg = msg;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getMsg() {
                return this.msg;
            }

            public int hashCode() {
                return (this.code.hashCode() * 31) + this.msg.hashCode();
            }

            @NotNull
            public String toString() {
                return "Failure(code=" + this.code + ", msg=" + this.msg + ')';
            }
        }

        /* JADX INFO: renamed from: com.kubi.user.google.GoogleSignInHelper$b$b, reason: from toString */
        /* JADX INFO: compiled from: GoogleSignInHelper.kt */
        @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/user/google/GoogleSignInHelper$Result$Success;", "Lcom/kubi/user/google/GoogleSignInHelper$Result;", "extInfo", "Lcom/kubi/user/google/GoogleSignInHelper$ExtInfo;", "<init>", "(Lcom/kubi/user/google/GoogleSignInHelper$ExtInfo;)V", "getExtInfo", "()Lcom/kubi/user/google/GoogleSignInHelper$ExtInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final /* data */ class Success extends AbstractC26709b {

            /* JADX INFO: renamed from: a, reason: from toString */
            @NotNull
            public final ExtInfo extInfo;

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.extInfo, ((Success) other).extInfo);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(@NotNull ExtInfo extInfo) {
                super(null);
                Intrinsics.checkNotNullParameter(extInfo, "extInfo");
                this.extInfo = extInfo;
            }

            @NotNull
            /* JADX INFO: renamed from: a, reason: from getter */
            public final ExtInfo getExtInfo() {
                return this.extInfo;
            }

            public int hashCode() {
                return this.extInfo.hashCode();
            }

            @NotNull
            public String toString() {
                return "Success(extInfo=" + this.extInfo + ')';
            }
        }

        public /* synthetic */ AbstractC26709b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC26709b() {
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ AbstractC26709b.Failure m65476e(GoogleSignInHelper googleSignInHelper, String str, String str2, Throwable th2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        return googleSignInHelper.m65480d(str, str2, th2);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ff, code lost:
    
        if (r0 == r4) goto L60;
     */
    @Nullable
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m65477a(@NotNull Activity activity, @NotNull Continuation<? super AbstractC26709b> continuation) {
        GoogleSignInHelper$authorize$1 googleSignInHelper$authorize$1;
        CredentialManager credentialManagerCreate;
        CredentialManager credentialManager;
        NoCredentialException e11;
        NoCredentialException noCredentialException;
        Activity activity2;
        NoCredentialException noCredentialException2;
        CredentialManager credentialManager2;
        GetCredentialResponse getCredentialResponse;
        Activity activity3 = activity;
        if (continuation instanceof GoogleSignInHelper$authorize$1) {
            googleSignInHelper$authorize$1 = (GoogleSignInHelper$authorize$1) continuation;
            int i11 = googleSignInHelper$authorize$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                googleSignInHelper$authorize$1.label = i11 - Integer.MIN_VALUE;
            } else {
                googleSignInHelper$authorize$1 = new GoogleSignInHelper$authorize$1(this, continuation);
            }
        } else {
            googleSignInHelper$authorize$1 = new GoogleSignInHelper$authorize$1(this, continuation);
        }
        Object credential = googleSignInHelper$authorize$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = googleSignInHelper$authorize$1.label;
        try {
            try {
                if (i12 == 0) {
                    ResultKt.throwOnFailure(credential);
                    if (!GoogleSignInAvailability.f53666a.m65489b(activity3)) {
                        return m65476e(this, "not_available", "not_available", null, 4, null);
                    }
                    credentialManagerCreate = CredentialManager.INSTANCE.create(activity3);
                    try {
                        GetCredentialRequest getCredentialRequestM65478b = m65478b(true, true);
                        googleSignInHelper$authorize$1.L$0 = activity3;
                        googleSignInHelper$authorize$1.L$1 = credentialManagerCreate;
                        googleSignInHelper$authorize$1.label = 1;
                        credential = credentialManagerCreate.getCredential(activity3, getCredentialRequestM65478b, googleSignInHelper$authorize$1);
                        if (credential == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (NoCredentialException e12) {
                        e11 = e12;
                        credentialManager = credentialManagerCreate;
                        noCredentialException = e11;
                        GetCredentialRequest getCredentialRequestM65478b2 = m65478b(false, false);
                        googleSignInHelper$authorize$1.L$0 = activity3;
                        googleSignInHelper$authorize$1.L$1 = credentialManager;
                        googleSignInHelper$authorize$1.L$2 = SpillingKt.nullOutSpilledVariable(noCredentialException);
                        googleSignInHelper$authorize$1.label = 2;
                        credential = credentialManager.getCredential(activity3, getCredentialRequestM65478b2, googleSignInHelper$authorize$1);
                        if (credential != coroutine_suspended) {
                            activity2 = activity3;
                            noCredentialException2 = noCredentialException;
                            credentialManager2 = credentialManager;
                            getCredentialResponse = (GetCredentialResponse) credential;
                            return m65482g(getCredentialResponse.getCredential());
                        }
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(credential);
                            getCredentialResponse = (GetCredentialResponse) credential;
                            return m65482g(getCredentialResponse.getCredential());
                        }
                        noCredentialException2 = (NoCredentialException) googleSignInHelper$authorize$1.L$2;
                        credentialManager2 = (CredentialManager) googleSignInHelper$authorize$1.L$1;
                        activity2 = (Activity) googleSignInHelper$authorize$1.L$0;
                        try {
                            ResultKt.throwOnFailure(credential);
                            getCredentialResponse = (GetCredentialResponse) credential;
                        } catch (NoCredentialException e13) {
                            e = e13;
                            GetCredentialRequest getCredentialRequestM65479c = m65479c();
                            googleSignInHelper$authorize$1.L$0 = SpillingKt.nullOutSpilledVariable(activity2);
                            googleSignInHelper$authorize$1.L$1 = SpillingKt.nullOutSpilledVariable(credentialManager2);
                            googleSignInHelper$authorize$1.L$2 = SpillingKt.nullOutSpilledVariable(noCredentialException2);
                            googleSignInHelper$authorize$1.L$3 = SpillingKt.nullOutSpilledVariable(e);
                            googleSignInHelper$authorize$1.label = 3;
                            credential = credentialManager2.getCredential(activity2, getCredentialRequestM65479c, googleSignInHelper$authorize$1);
                        }
                        return m65482g(getCredentialResponse.getCredential());
                    }
                    CredentialManager credentialManager3 = (CredentialManager) googleSignInHelper$authorize$1.L$1;
                    Activity activity4 = (Activity) googleSignInHelper$authorize$1.L$0;
                    try {
                        ResultKt.throwOnFailure(credential);
                        credentialManagerCreate = credentialManager3;
                        activity3 = activity4;
                    } catch (NoCredentialException e14) {
                        e11 = e14;
                        credentialManager = credentialManager3;
                        activity3 = activity4;
                        noCredentialException = e11;
                        try {
                            GetCredentialRequest getCredentialRequestM65478b3 = m65478b(false, false);
                            googleSignInHelper$authorize$1.L$0 = activity3;
                            googleSignInHelper$authorize$1.L$1 = credentialManager;
                            googleSignInHelper$authorize$1.L$2 = SpillingKt.nullOutSpilledVariable(noCredentialException);
                            googleSignInHelper$authorize$1.label = 2;
                            credential = credentialManager.getCredential(activity3, getCredentialRequestM65478b3, googleSignInHelper$authorize$1);
                            if (credential != coroutine_suspended) {
                                activity2 = activity3;
                                noCredentialException2 = noCredentialException;
                                credentialManager2 = credentialManager;
                                getCredentialResponse = (GetCredentialResponse) credential;
                            }
                        } catch (NoCredentialException e15) {
                            e = e15;
                            activity2 = activity3;
                            noCredentialException2 = noCredentialException;
                            credentialManager2 = credentialManager;
                            GetCredentialRequest getCredentialRequestM65479c2 = m65479c();
                            googleSignInHelper$authorize$1.L$0 = SpillingKt.nullOutSpilledVariable(activity2);
                            googleSignInHelper$authorize$1.L$1 = SpillingKt.nullOutSpilledVariable(credentialManager2);
                            googleSignInHelper$authorize$1.L$2 = SpillingKt.nullOutSpilledVariable(noCredentialException2);
                            googleSignInHelper$authorize$1.L$3 = SpillingKt.nullOutSpilledVariable(e);
                            googleSignInHelper$authorize$1.label = 3;
                            credential = credentialManager2.getCredential(activity2, getCredentialRequestM65479c2, googleSignInHelper$authorize$1);
                        }
                        return coroutine_suspended;
                    }
                }
                getCredentialResponse = (GetCredentialResponse) credential;
                return m65482g(getCredentialResponse.getCredential());
            } catch (NoCredentialException e16) {
                return m65480d("no_credential", "no_credential", e16);
            }
        } catch (GetCredentialCancellationException unused) {
            return new AbstractC26709b.Failure(OtcAd.KYC_NOT_PASS, "user_cancel");
        } catch (GetCredentialException e17) {
            String message = e17.getMessage();
            if (message == null) {
                message = "";
            }
            if (StringsKt.contains((CharSequence) message, (CharSequence) "user cancel", true)) {
                return new AbstractC26709b.Failure(OtcAd.KYC_NOT_PASS, "user_cancel");
            }
            String type = e17.getType();
            String str = type.length() != 0 ? type : "google_auth_error";
            if (message.length() == 0) {
                message = e17.getType();
            }
            return m65480d(str, message, e17);
        } catch (GoogleIdTokenParsingException e18) {
            String message2 = e18.getMessage();
            if (message2 == null) {
                message2 = "google_id_token_parse_error";
            }
            return m65480d("google_id_token_parse_error", message2, e18);
        } catch (Exception e19) {
            String message3 = e19.getMessage();
            if (message3 == null) {
                message3 = "unknown";
            }
            return m65480d("google_auth_error", message3, e19);
        }
    }

    /* JADX INFO: renamed from: b */
    public final GetCredentialRequest m65478b(boolean z11, boolean z12) {
        return new GetCredentialRequest.Builder().addCredentialOption(new GetGoogleIdOption.Builder().setServerClientId(m65481f()).setFilterByAuthorizedAccounts(z11).setAutoSelectEnabled(z12).build()).build();
    }

    /* JADX INFO: renamed from: c */
    public final GetCredentialRequest m65479c() {
        return new GetCredentialRequest.Builder().addCredentialOption(new GetSignInWithGoogleOption.Builder(m65481f()).build()).build();
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC26709b.Failure m65480d(String str, String str2, Throwable th2) {
        String str3 = "code=" + str + ", msg=" + str2;
        C43840a.m96548b("[google] authorize failed " + str3, "GoogleSignInHelper");
        C44128b.m97262f("GoogleSignInHelper", "authorize failed " + str3, th2);
        if (th2 == null) {
            C43846g.m96568c(new UserCenterExtAccountMessage(str3, "GoogleSignInHelper", false, 4, null), null, 2, null);
        } else if (!C42899b.m94075e(th2)) {
            if (C36638a.m81972c(th2)) {
                C43846g.m96568c(new UserCenterException(th2, "GoogleSignInHelper", true, null, 8, null), null, 2, null);
            } else {
                C36638a.m81973d(th2, "GoogleSignInHelper");
            }
        }
        return new AbstractC26709b.Failure(str, str2);
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC26709b m65482g(Credential credential) throws GoogleIdTokenParsingException {
        if (!(credential instanceof CustomCredential) || !Intrinsics.areEqual(credential.getType(), GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL)) {
            return m65476e(this, "GOOGLE_CREDENTIAL_EMPTY", "unexpected_credential_type:" + credential.getType(), null, 4, null);
        }
        GoogleIdTokenCredential googleIdTokenCredentialCreateFrom = GoogleIdTokenCredential.INSTANCE.createFrom(credential.getData());
        String zzb = googleIdTokenCredentialCreateFrom.getZzb();
        if (StringsKt.isBlank(zzb)) {
            return m65476e(this, "GOOGLE_CREDENTIAL_EMPTY", "GOOGLE_CREDENTIAL_EMPTY", null, 4, null);
        }
        String zza = googleIdTokenCredentialCreateFrom.getZza();
        if (!StringsKt.contains$default((CharSequence) zza, (CharSequence) "@", false, 2, (Object) null)) {
            zza = null;
        }
        return new AbstractC26709b.Success(new ExtInfo(zzb, zza, googleIdTokenCredentialCreateFrom.getZzc()));
    }

    /* JADX INFO: renamed from: f */
    public final String m65481f() {
        if (MviExKt.m42517m()) {
            return "558910264483-tv7kcn4t5e22o2j3tnmejag4gn37854t.apps.googleusercontent.com";
        }
        return "341850103036-l8c3f4ob0oqe9g512u9cmlf0h5rarn9v.apps.googleusercontent.com";
    }
}
