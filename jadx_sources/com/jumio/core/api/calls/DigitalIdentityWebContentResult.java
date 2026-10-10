package com.jumio.core.api.calls;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/jumio/core/api/calls/DigitalIdentityWebContentResult;", "", "requestUrl", "", "html", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRequestUrl", "()Ljava/lang/String;", "getHtml", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DigitalIdentityWebContentResult {

    /* JADX INFO: renamed from: a */
    public final String f13715a;

    /* JADX INFO: renamed from: b */
    public final String f13716b;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DigitalIdentityWebContentResult)) {
            return false;
        }
        DigitalIdentityWebContentResult digitalIdentityWebContentResult = (DigitalIdentityWebContentResult) other;
        return Intrinsics.areEqual(this.f13715a, digitalIdentityWebContentResult.f13715a) && Intrinsics.areEqual(this.f13716b, digitalIdentityWebContentResult.f13716b);
    }

    public DigitalIdentityWebContentResult(@NotNull String requestUrl, @NotNull String html) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(html, "html");
        this.f13715a = requestUrl;
        this.f13716b = html;
    }

    public static /* synthetic */ DigitalIdentityWebContentResult copy$default(DigitalIdentityWebContentResult digitalIdentityWebContentResult, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = digitalIdentityWebContentResult.f13715a;
        }
        if ((i11 & 2) != 0) {
            str2 = digitalIdentityWebContentResult.f13716b;
        }
        return digitalIdentityWebContentResult.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getF13715a() {
        return this.f13715a;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getF13716b() {
        return this.f13716b;
    }

    @NotNull
    public final DigitalIdentityWebContentResult copy(@NotNull String requestUrl, @NotNull String html) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(html, "html");
        return new DigitalIdentityWebContentResult(requestUrl, html);
    }

    @NotNull
    public final String getHtml() {
        return this.f13716b;
    }

    @NotNull
    public final String getRequestUrl() {
        return this.f13715a;
    }

    public int hashCode() {
        return this.f13716b.hashCode() + (this.f13715a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DigitalIdentityWebContentResult(requestUrl=" + this.f13715a + ", html=" + this.f13716b + ')';
    }
}
