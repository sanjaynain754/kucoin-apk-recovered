package com.jumio.sdk.credentials;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/jumio/sdk/credentials/JumioCredentialInfo;", "Ljava/io/Serializable;", "category", "Lcom/jumio/sdk/credentials/JumioCredentialCategory;", "id", "", "order", "", "<init>", "(Lcom/jumio/sdk/credentials/JumioCredentialCategory;Ljava/lang/String;I)V", "getCategory", "()Lcom/jumio/sdk/credentials/JumioCredentialCategory;", "getId", "()Ljava/lang/String;", "getOrder", "()I", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioCredentialInfo implements Serializable {

    /* JADX INFO: renamed from: a */
    public final JumioCredentialCategory f14681a;

    /* JADX INFO: renamed from: b */
    public final String f14682b;

    /* JADX INFO: renamed from: c */
    public final int f14683c;

    public JumioCredentialInfo(@NotNull JumioCredentialCategory category, @NotNull String id2, int i11) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f14681a = category;
        this.f14682b = id2;
        this.f14683c = i11;
    }

    @NotNull
    /* JADX INFO: renamed from: getCategory, reason: from getter */
    public final JumioCredentialCategory getF14681a() {
        return this.f14681a;
    }

    @NotNull
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final String getF14682b() {
        return this.f14682b;
    }

    /* JADX INFO: renamed from: getOrder, reason: from getter */
    public final int getF14683c() {
        return this.f14683c;
    }

    public /* synthetic */ JumioCredentialInfo(JumioCredentialCategory jumioCredentialCategory, String str, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(jumioCredentialCategory, str, (i12 & 4) != 0 ? 0 : i11);
    }
}
