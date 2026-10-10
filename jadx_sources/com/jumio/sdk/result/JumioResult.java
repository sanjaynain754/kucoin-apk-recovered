package com.jumio.sdk.result;

import com.google.firebase.messaging.Constants;
import com.jumio.sdk.credentials.JumioCredentialCategory;
import com.jumio.sdk.credentials.JumioCredentialInfo;
import com.jumio.sdk.error.JumioError;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB[\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\tJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001b\u001a\u00020\tJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001b\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, m90084d2 = {"Lcom/jumio/sdk/result/JumioResult;", "Ljava/io/Serializable;", "workflowExecutionId", "", "accountId", "isSuccess", "", "credentialInfos", "", "Lcom/jumio/sdk/credentials/JumioCredentialInfo;", "resultMap", "", "Lcom/jumio/sdk/result/JumioCredentialResult;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/jumio/sdk/error/JumioError;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/Map;Lcom/jumio/sdk/error/JumioError;)V", "getWorkflowExecutionId", "()Ljava/lang/String;", "getAccountId", "()Z", "getCredentialInfos", "()Ljava/util/List;", "getError", "()Lcom/jumio/sdk/error/JumioError;", "getIDResult", "Lcom/jumio/sdk/result/JumioIDResult;", "credentialInfo", "getFaceResult", "Lcom/jumio/sdk/result/JumioFaceResult;", "getResult", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioResult implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final String f14736a;

    /* JADX INFO: renamed from: b */
    public final String f14737b;

    /* JADX INFO: renamed from: c */
    public final boolean f14738c;

    /* JADX INFO: renamed from: d */
    public final List f14739d;

    /* JADX INFO: renamed from: e */
    public final Map f14740e;

    /* JADX INFO: renamed from: f */
    public final JumioError f14741f;

    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/jumio/sdk/result/JumioResult$Companion;", "", "<init>", "()V", "createErrorResult", "Lcom/jumio/sdk/result/JumioResult;", "workflowExecutionId", "", "accountId", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/jumio/sdk/error/JumioError;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public static /* synthetic */ JumioResult createErrorResult$default(Companion companion, String str, String str2, JumioError jumioError, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            return companion.createErrorResult(str, str2, jumioError);
        }

        @JvmStatic
        @NotNull
        public final JumioResult createErrorResult(@Nullable String workflowExecutionId, @Nullable String accountId, @NotNull JumioError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new JumioResult(workflowExecutionId, accountId, false, null, null, error, 24, null);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public JumioResult(@Nullable String str, @Nullable String str2, boolean z11, @Nullable List<JumioCredentialInfo> list, @Nullable Map<String, ? extends JumioCredentialResult> map, @Nullable JumioError jumioError) {
        this.f14736a = str;
        this.f14737b = str2;
        this.f14738c = z11;
        this.f14739d = list;
        this.f14740e = map;
        this.f14741f = jumioError;
    }

    @JvmStatic
    @NotNull
    public static final JumioResult createErrorResult(@Nullable String str, @Nullable String str2, @NotNull JumioError jumioError) {
        return INSTANCE.createErrorResult(str, str2, jumioError);
    }

    @Nullable
    /* JADX INFO: renamed from: getAccountId, reason: from getter */
    public final String getF14737b() {
        return this.f14737b;
    }

    @Nullable
    public final List<JumioCredentialInfo> getCredentialInfos() {
        return this.f14739d;
    }

    @Nullable
    /* JADX INFO: renamed from: getError, reason: from getter */
    public final JumioError getF14741f() {
        return this.f14741f;
    }

    @Nullable
    public final JumioFaceResult getFaceResult(@NotNull JumioCredentialInfo credentialInfo) {
        Intrinsics.checkNotNullParameter(credentialInfo, "credentialInfo");
        if (credentialInfo.getF14681a() != JumioCredentialCategory.FACE) {
            return null;
        }
        return (JumioFaceResult) getResult(credentialInfo);
    }

    @Nullable
    public final JumioIDResult getIDResult(@NotNull JumioCredentialInfo credentialInfo) {
        Intrinsics.checkNotNullParameter(credentialInfo, "credentialInfo");
        if (credentialInfo.getF14681a() != JumioCredentialCategory.ID) {
            return null;
        }
        return (JumioIDResult) getResult(credentialInfo);
    }

    @Nullable
    public final JumioCredentialResult getResult(@NotNull JumioCredentialInfo credentialInfo) {
        Intrinsics.checkNotNullParameter(credentialInfo, "credentialInfo");
        Map map = this.f14740e;
        if (map != null) {
            return (JumioCredentialResult) map.get(credentialInfo.getF14682b());
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: getWorkflowExecutionId, reason: from getter */
    public final String getF14736a() {
        return this.f14736a;
    }

    /* JADX INFO: renamed from: isSuccess, reason: from getter */
    public final boolean getF14738c() {
        return this.f14738c;
    }

    public /* synthetic */ JumioResult(String str, String str2, boolean z11, List list, Map map, JumioError jumioError, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z11, (i11 & 8) != 0 ? null : list, (i11 & 16) != 0 ? null : map, (i11 & 32) != 0 ? null : jumioError);
    }
}
