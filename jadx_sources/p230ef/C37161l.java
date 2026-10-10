package p230ef;

import android.content.ComponentName;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ef.l */
/* JADX INFO: compiled from: GetPublicKeyCredentialOption.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lef/l;", "Lef/h;", "", "requestJson", "", "clientDataHash", "", "Landroid/content/ComponentName;", "allowedProviders", "<init>", "(Ljava/lang/String;[BLjava/util/Set;)V", "Lorg/json/JSONArray;", "b", "()Lorg/json/JSONArray;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "[B", "()[B", "credential_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C37161l extends AbstractC37157h {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String requestJson;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final byte[] clientDataHash;

    public /* synthetic */ C37161l(String str, byte[] bArr, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : bArr, (i11 & 4) != 0 ? SetsKt.emptySet() : set);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final JSONArray m83134b() {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(new JSONObject(this.requestJson).getJSONArray("allowCredentials"));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        return (JSONArray) objM103844constructorimpl;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final byte[] getClientDataHash() {
        return this.clientDataHash;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRequestJson() {
        return this.requestJson;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37161l(@NotNull String requestJson, @Nullable byte[] bArr, @NotNull Set<ComponentName> allowedProviders) {
        super(allowedProviders);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        this.requestJson = requestJson;
        this.clientDataHash = bArr;
    }
}
